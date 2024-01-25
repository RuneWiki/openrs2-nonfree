import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	public static int anInt1841 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public static void method1557(@OriginalArg(0) int arg0) {
		Static79.anInt1470 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static37.anInt666; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static408.anInt6716; local6++) {
				if (Static359.aClass169ArrayArrayArray5[arg0][local3][local6] == null) {
					Static359.aClass169ArrayArrayArray5[arg0][local3][local6] = new Class169(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
	public static int method1560() {
		if (Static90.aFrame1 == null) {
			return Static196.aBoolean739 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
