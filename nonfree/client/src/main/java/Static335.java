import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(Z)V", line = 5)
	public static void method5647() {
		Class154.aClass4_83.method81();
		Class2_Sub3_Sub15.aClass4_58.method81();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIBII)Z", line = 41)
	public static boolean method5651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg3; local7++) {
			for (@Pc(11) int local11 = arg1; local11 <= arg2; local11++) {
				if (Static296.anIntArrayArray51[local7][local11] == arg0 && Static278.anIntArrayArray50[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
