import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "Lclient!ok;")
	public static Class178 aClass178_54;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
	public static int anInt3471 = 0;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
	public static int anInt3481 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIBIII)V")
	public static void method2829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg4;
		@Pc(15) int local15 = arg3 - arg2;
		if (local15 == 0) {
			if (local10 != 0) {
				Static359.method4607(arg0, arg1, arg4, arg2);
			}
		} else if (local10 == 0) {
			Static262.method5692(arg4, arg2, arg3, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(62) boolean local62 = local15 < local10;
			@Pc(66) int local66;
			@Pc(70) int local70;
			if (local62) {
				local66 = arg2;
				arg2 = arg4;
				local70 = arg3;
				arg3 = arg1;
				arg4 = local66;
				arg1 = local70;
			}
			if (arg3 < arg2) {
				local66 = arg2;
				arg2 = arg3;
				local70 = arg4;
				arg4 = arg1;
				arg3 = local66;
				arg1 = local70;
			}
			local66 = arg4;
			local70 = arg3 - arg2;
			@Pc(107) int local107 = arg1 - arg4;
			@Pc(112) int local112 = -(local70 >> 1);
			if (local107 < 0) {
				local107 = -local107;
			}
			@Pc(131) int local131 = arg1 <= arg4 ? -1 : 1;
			@Pc(135) int local135;
			if (local62) {
				for (local135 = arg2; local135 <= arg3; local135++) {
					local112 += local107;
					Static353.anIntArrayArray48[local135][local66] = arg0;
					if (local112 > 0) {
						local112 -= local70;
						local66 += local131;
					}
				}
			} else {
				for (local135 = arg2; local135 <= arg3; local135++) {
					Static353.anIntArrayArray48[local66][local135] = arg0;
					local112 += local107;
					if (local112 > 0) {
						local112 -= local70;
						local66 += local131;
					}
				}
			}
		}
	}
}
