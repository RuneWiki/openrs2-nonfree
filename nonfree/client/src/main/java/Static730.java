import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static730 {

	@OriginalMember(owner = "client!gma", name = "a", descriptor = "(I)V")
	public static void method9537(@OriginalArg(0) int arg0) {
		Static66.anInt1583 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static128.anInt2531; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static448.anInt6835; local6++) {
				if (Static448.aClass364ArrayArrayArray2[arg0][local3][local6] == null) {
					Static448.aClass364ArrayArrayArray2[arg0][local3][local6] = new Class364(arg0);
				}
			}
		}
	}
}
