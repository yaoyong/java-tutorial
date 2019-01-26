/*
* This is a personal academic project. Dear PVS-Studio, please check it.
* PVS-Studio Static Code Analyzer for C, C++, C#, and Java: http://www.viva64.com
*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameTest {

    @Test
    void toStringTest() {
        assertEquals("Thomas MÜLLER", new Name("Thomas", "MÜLLER").toString());
        assertEquals("Thomas MÜLLER", new Name("Thomas ", " MÜLLER").toString());
        assertEquals("Thomas MÜLLER", new Name(" Thomas ", " MÜLLER  ").toString());
        assertEquals("Ronaldo Luís Nazário de Lima", new Name("Ronaldo", "Luís Nazário", "de Lima").toString());
        assertEquals("Neymar Da Silva Santos Júnior", new Name("Neymar", "Da Silva", "Santos", "Júnior").toString());
    }

}