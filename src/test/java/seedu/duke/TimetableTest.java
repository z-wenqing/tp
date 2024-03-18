package seedu.duke;
import seedu.duke.UserList;
import seedu.duke.ui.UI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TimetableTest {
    @Test
    public void testAddUserTask() {
        Timetable timetable = new Timetable();
        Task task = new Task("Study","2024-03-18", "09:00", "11:00");
        int dayOfWeek = 1; // assume Tuesday

        timetable.addUserTask(dayOfWeek, task);

        assertEquals(1, timetable.daysOfWeek[dayOfWeek - 1].size());
        assertEquals(task, timetable.daysOfWeek[dayOfWeek - 1].get(0));
    }
    @Test
    public void testDeleteUserTask() {
        Timetable timetable = new Timetable();
        Task task1 = new Task("Study", "2024-03-18", "09:00", "11:00");
        Task task2 = new Task("Exercise", "2024-03-18", "15:00", "16:30");
        int dayOfWeek = 1; // assume Tuesday

        // Add tasks to the timetable
        timetable.addUserTask(dayOfWeek, task1);
        timetable.addUserTask(dayOfWeek, task2);

        // Delete the first task
        timetable.deleteUserTask(dayOfWeek, 0);

        // Check if the task is deleted
        assertEquals(1, timetable.daysOfWeek[dayOfWeek - 1].size());
        assertEquals(task2, timetable.daysOfWeek[dayOfWeek - 1].get(0));

    }
}