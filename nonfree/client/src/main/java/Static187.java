import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gba", name = "y", descriptor = "I")
	public static int anInt3432 = 0;

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V")
	public static void method3023(@OriginalArg(0) int arg0) {
		Static111.anInt10340 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static410.anInt6962; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static315.anInt5894; local6++) {
				if (Static332.aClass247ArrayArrayArray1[arg0][local3][local6] == null) {
					Static332.aClass247ArrayArrayArray1[arg0][local3][local6] = new Class247(arg0);
				}
			}
		}
	}
}
