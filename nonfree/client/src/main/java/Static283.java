import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!lfa", name = "A", descriptor = "Lclient!cd;")
	public static Class44 aClass44_4;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIIIII)V")
	public static void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg3;
		@Pc(14) int local14 = arg1 - arg4;
		if (local14 == 0) {
			if (local10 != 0) {
				Static461.method6478(arg0, arg3, arg2, arg4);
			}
		} else if (local10 == 0) {
			Static262.method3724(arg2, arg1, arg3, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(64) boolean local64 = local10 > local14;
			@Pc(68) int local68;
			@Pc(72) int local72;
			if (local64) {
				local68 = arg4;
				arg4 = arg3;
				local72 = arg1;
				arg3 = local68;
				arg1 = arg0;
				arg0 = local72;
			}
			if (arg4 > arg1) {
				local68 = arg4;
				arg4 = arg1;
				local72 = arg3;
				arg1 = local68;
				arg3 = arg0;
				arg0 = local72;
			}
			local68 = arg3;
			local72 = arg1 - arg4;
			@Pc(113) int local113 = arg0 - arg3;
			@Pc(118) int local118 = -(local72 >> 1);
			if (local113 < 0) {
				local113 = -local113;
			}
			@Pc(133) int local133 = arg0 <= arg3 ? -1 : 1;
			@Pc(137) int local137;
			if (local64) {
				for (local137 = arg4; local137 <= arg1; local137++) {
					Static503.anIntArrayArray12[local137][local68] = arg2;
					local118 += local113;
					if (local118 > 0) {
						local118 -= local72;
						local68 += local133;
					}
				}
			} else {
				for (local137 = arg4; local137 <= arg1; local137++) {
					local118 += local113;
					Static503.anIntArrayArray12[local68][local137] = arg2;
					if (local118 > 0) {
						local118 -= local72;
						local68 += local133;
					}
				}
			}
		}
	}
}
