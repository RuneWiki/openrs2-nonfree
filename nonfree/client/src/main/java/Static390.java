import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "Lclient!sp;")
	public static Class221 aClass221_2;

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "Lclient!oa;")
	public static Class105 aClass105_7;

	@OriginalMember(owner = "client!tr", name = "z", descriptor = "Lclient!rg;")
	public static Class204 aClass204_2;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZIIIII)V")
	public static void method5263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg1;
		@Pc(13) int local13 = arg4 - arg3;
		if (local13 == 0) {
			if (local9 != 0) {
				Static284.method3971(arg1, arg2, arg3, arg0);
			}
		} else if (local9 == 0) {
			Static31.method579(arg3, arg0, arg1, arg4);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local13 < 0) {
				local13 = -local13;
			}
			@Pc(69) boolean local69 = local9 > local13;
			@Pc(73) int local73;
			@Pc(75) int local75;
			if (local69) {
				local73 = arg3;
				local75 = arg4;
				arg3 = arg1;
				arg1 = local73;
				arg4 = arg2;
				arg2 = local75;
			}
			if (arg4 < arg3) {
				local73 = arg3;
				arg3 = arg4;
				local75 = arg1;
				arg4 = local73;
				arg1 = arg2;
				arg2 = local75;
			}
			local73 = arg1;
			local75 = arg4 - arg3;
			@Pc(120) int local120 = arg2 - arg1;
			@Pc(125) int local125 = -(local75 >> 1);
			@Pc(132) int local132 = arg1 < arg2 ? 1 : -1;
			if (local120 < 0) {
				local120 = -local120;
			}
			@Pc(141) int local141;
			if (local69) {
				for (local141 = arg3; local141 <= arg4; local141++) {
					local125 += local120;
					Static162.anIntArrayArray58[local141][local73] = arg0;
					if (local125 > 0) {
						local73 += local132;
						local125 -= local75;
					}
				}
			} else {
				for (local141 = arg3; local141 <= arg4; local141++) {
					Static162.anIntArrayArray58[local73][local141] = arg0;
					local125 += local120;
					if (local125 > 0) {
						local125 -= local75;
						local73 += local132;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)Z")
	public static boolean method5265(@OriginalArg(1) int arg0) {
		if (arg0 == 59 || arg0 == 49 || arg0 == 57 || arg0 == 5 || arg0 == 19) {
			return true;
		} else {
			return arg0 == 18 || arg0 == 1004;
		}
	}
}
