import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Lclient!sia;")
	public static Class310 aClass310_1;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "[Lclient!gg;")
	public static Class9_Sub4[] aClass9_Sub4Array4;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject11;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
	public static int anInt5410 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIII[BI)Z")
	public static boolean method4433(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(18) int local18;
		if (local9 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local9;
		}
		@Pc(31) int local31 = -((arg4 + 7) / 8);
		@Pc(40) int local40 = -((arg2 + 8 - 1) / 8);
		for (@Pc(42) int local42 = local31; local42 < 0; local42++) {
			for (@Pc(46) int local46 = local40; local46 < 0; local46++) {
				if (arg3[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local18;
			if (arg3[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg1;
		}
		return false;
	}
}
