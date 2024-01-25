import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!rfa", name = "V", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIZ)Z")
	public static boolean method6733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static187.aClass17_2.method6237(arg1, arg2, arg0, Static324.anIntArray307);
		@Pc(18) int local18 = Static324.anIntArray307[2];
		if (local18 < 50) {
			return false;
		} else {
			Static324.anIntArray307[1] = Static324.anIntArray307[1] * Static333.anInt5522 / local18 + Static294.anInt10775;
			Static324.anIntArray307[2] = local18;
			Static324.anIntArray307[0] = Static28.anInt695 + Static27.anInt683 * Static324.anIntArray307[0] / local18;
			return true;
		}
	}
}
