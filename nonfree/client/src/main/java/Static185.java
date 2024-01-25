import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIBII)V")
	public static void method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 - arg3;
		@Pc(14) int local14 = arg1 - arg0;
		if (local14 == 0) {
			if (local9 != 0) {
				Static190.method2747(arg3, arg4, arg0, arg2);
			}
		} else if (local9 == 0) {
			Static382.method5262(arg0, arg2, arg1, arg3);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(67) boolean local67 = local9 > local14;
			@Pc(71) int local71;
			@Pc(75) int local75;
			if (local67) {
				local71 = arg0;
				arg0 = arg3;
				local75 = arg1;
				arg1 = arg4;
				arg3 = local71;
				arg4 = local75;
			}
			if (arg0 > arg1) {
				local71 = arg0;
				arg0 = arg1;
				local75 = arg3;
				arg3 = arg4;
				arg1 = local71;
				arg4 = local75;
			}
			local71 = arg3;
			local75 = arg1 - arg0;
			@Pc(112) int local112 = arg4 - arg3;
			@Pc(117) int local117 = -(local75 >> 1);
			if (local112 < 0) {
				local112 = -local112;
			}
			@Pc(132) int local132 = arg4 <= arg3 ? -1 : 1;
			@Pc(136) int local136;
			if (local67) {
				for (local136 = arg0; local136 <= arg1; local136++) {
					local117 += local112;
					Static46.anIntArrayArray24[local136][local71] = arg2;
					if (local117 > 0) {
						local117 -= local75;
						local71 += local132;
					}
				}
			} else {
				for (local136 = arg0; local136 <= arg1; local136++) {
					local117 += local112;
					Static46.anIntArrayArray24[local71][local136] = arg2;
					if (local117 > 0) {
						local71 += local132;
						local117 -= local75;
					}
				}
			}
		}
	}
}
