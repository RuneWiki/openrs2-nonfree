import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!ca;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
	public static int anInt3681 = -1;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Z")
	public static boolean aBoolean291 = false;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIBI)V")
	public static void method3158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(15) int local15 = arg3 - arg4;
		if (local15 == 0) {
			if (local10 != 0) {
				Static126.method2626(arg4, arg0, arg1, arg2);
			}
		} else if (local10 == 0) {
			Static300.method5132(arg0, arg4, arg3, arg1);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(65) boolean local65 = local15 < local10;
			@Pc(69) int local69;
			@Pc(73) int local73;
			if (local65) {
				local69 = arg4;
				arg4 = arg1;
				local73 = arg3;
				arg3 = arg2;
				arg1 = local69;
				arg2 = local73;
			}
			if (arg3 < arg4) {
				local69 = arg4;
				local73 = arg1;
				arg4 = arg3;
				arg3 = local69;
				arg1 = arg2;
				arg2 = local73;
			}
			local69 = arg1;
			local73 = arg3 - arg4;
			@Pc(113) int local113 = arg2 - arg1;
			@Pc(118) int local118 = -(local73 >> 1);
			@Pc(129) int local129 = arg1 < arg2 ? 1 : -1;
			if (local113 < 0) {
				local113 = -local113;
			}
			@Pc(138) int local138;
			if (local65) {
				for (local138 = arg4; local138 <= arg3; local138++) {
					local118 += local113;
					Static173.anIntArrayArray15[local138][local69] = arg0;
					if (local118 > 0) {
						local69 += local129;
						local118 -= local73;
					}
				}
			} else {
				for (local138 = arg4; local138 <= arg3; local138++) {
					local118 += local113;
					Static173.anIntArrayArray15[local69][local138] = arg0;
					if (local118 > 0) {
						local69 += local129;
						local118 -= local73;
					}
				}
			}
		}
	}
}
