import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIII)V")
	public static void method945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = arg1 - arg4;
		@Pc(22) int local22 = arg0 - arg3;
		if (local22 == 0) {
			if (local17 != 0) {
				Static447.method6781(arg1, arg2, arg3, arg4);
			}
		} else if (local17 == 0) {
			Static23.method5783(arg4, arg0, arg3, arg2);
		} else {
			if (local17 < 0) {
				local17 = -local17;
			}
			if (local22 < 0) {
				local22 = -local22;
			}
			@Pc(69) boolean local69 = local22 < local17;
			@Pc(73) int local73;
			@Pc(75) int local75;
			if (local69) {
				local73 = arg3;
				local75 = arg0;
				arg3 = arg4;
				arg4 = local73;
				arg0 = arg1;
				arg1 = local75;
			}
			if (arg3 > arg0) {
				local73 = arg3;
				arg3 = arg0;
				local75 = arg4;
				arg0 = local73;
				arg4 = arg1;
				arg1 = local75;
			}
			local73 = arg4;
			local75 = arg0 - arg3;
			@Pc(110) int local110 = arg1 - arg4;
			@Pc(115) int local115 = -(local75 >> 1);
			if (local110 < 0) {
				local110 = -local110;
			}
			@Pc(130) int local130 = arg4 < arg1 ? 1 : -1;
			@Pc(134) int local134;
			if (local69) {
				for (local134 = arg3; local134 <= arg0; local134++) {
					local115 += local110;
					Static68.anIntArrayArray24[local134][local73] = arg2;
					if (local115 > 0) {
						local73 += local130;
						local115 -= local75;
					}
				}
			} else {
				for (local134 = arg3; local134 <= arg0; local134++) {
					Static68.anIntArrayArray24[local73][local134] = arg2;
					local115 += local110;
					if (local115 > 0) {
						local73 += local130;
						local115 -= local75;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
	public static boolean method946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static504.method7747(arg1, arg0) & Static384.method5928(arg0, arg1);
	}
}
