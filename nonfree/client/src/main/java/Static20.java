import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 3)
	public static void method560() {
		for (@Pc(8) int local8 = 0; local8 < Static309.aClass21ArrayArray3.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static309.aClass21ArrayArray3[local8].length; local12++) {
				Static309.aClass21ArrayArray3[local8][local12] = Static112.aClass21_1;
			}
		}
	}
}
