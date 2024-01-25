import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "[F")
	public static final float[] aFloatArray38 = new float[4];

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIIIB)V")
	public static void method4646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg2 - arg4;
		@Pc(13) int local13 = arg1 - arg3;
		if (local13 == 0) {
			if (local9 != 0) {
				Static373.method5588(arg2, arg3, arg4, arg0);
			}
		} else if (local9 == 0) {
			Static235.method4044(arg3, arg1, arg4, arg0);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local13 < 0) {
				local13 = -local13;
			}
			@Pc(60) boolean local60 = local9 > local13;
			@Pc(64) int local64;
			@Pc(66) int local66;
			if (local60) {
				local64 = arg3;
				local66 = arg1;
				arg3 = arg4;
				arg4 = local64;
				arg1 = arg2;
				arg2 = local66;
			}
			if (arg3 > arg1) {
				local64 = arg3;
				arg3 = arg1;
				local66 = arg4;
				arg1 = local64;
				arg4 = arg2;
				arg2 = local66;
			}
			local64 = arg4;
			local66 = arg1 - arg3;
			@Pc(110) int local110 = arg2 - arg4;
			@Pc(115) int local115 = -(local66 >> 1);
			@Pc(122) int local122 = arg4 < arg2 ? 1 : -1;
			if (local110 < 0) {
				local110 = -local110;
			}
			@Pc(134) int local134;
			if (local60) {
				for (local134 = arg3; local134 <= arg1; local134++) {
					Static383.anIntArrayArray62[local134][local64] = arg0;
					local115 += local110;
					if (local115 > 0) {
						local64 += local122;
						local115 -= local66;
					}
				}
			} else {
				for (local134 = arg3; local134 <= arg1; local134++) {
					local115 += local110;
					Static383.anIntArrayArray62[local64][local134] = arg0;
					if (local115 > 0) {
						local64 += local122;
						local115 -= local66;
					}
				}
			}
		}
	}
}
