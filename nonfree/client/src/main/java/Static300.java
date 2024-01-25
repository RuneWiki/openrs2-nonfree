import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
	public static int anInt6053;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Lclient!dc;")
	public static final Class68 aClass68_11 = new Class68(1, 2, 2, 0);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(FFBF)I")
	public static int method4773(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local26 > local17 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local26 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg1; local7++) {
			for (@Pc(11) int local11 = arg3; local11 <= arg4; local11++) {
				if (arg0 == Static528.anIntArrayArray57[local7][local11] && Static118.anIntArrayArray12[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
