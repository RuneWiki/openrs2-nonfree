import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fn", name = "J", descriptor = "I")
	public static int anInt2384;

	@OriginalMember(owner = "client!fn", name = "D", descriptor = "Lclient!cw;")
	public static final Class68 aClass68_2 = new Class68(1);

	@OriginalMember(owner = "client!fn", name = "cb", descriptor = "Lclient!vg;")
	public static Class349 aClass349_37 = null;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIZI)V")
	public static void method2044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 - arg2;
		@Pc(14) int local14 = arg4 - arg1;
		if (local14 == 0) {
			if (local9 != 0) {
				Static101.method1526(arg1, arg3, arg0, arg2);
			}
		} else if (local9 == 0) {
			Static22.method326(arg4, arg1, arg2, arg0);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(66) boolean local66 = local14 < local9;
			@Pc(70) int local70;
			@Pc(74) int local74;
			if (local66) {
				local70 = arg1;
				arg1 = arg2;
				local74 = arg4;
				arg4 = arg3;
				arg2 = local70;
				arg3 = local74;
			}
			if (arg1 > arg4) {
				local70 = arg1;
				local74 = arg2;
				arg1 = arg4;
				arg4 = local70;
				arg2 = arg3;
				arg3 = local74;
			}
			local70 = arg2;
			local74 = arg4 - arg1;
			@Pc(110) int local110 = arg3 - arg2;
			@Pc(115) int local115 = -(local74 >> 1);
			if (local110 < 0) {
				local110 = -local110;
			}
			@Pc(131) int local131 = arg3 > arg2 ? 1 : -1;
			@Pc(135) int local135;
			if (local66) {
				for (local135 = arg1; local135 <= arg4; local135++) {
					local115 += local110;
					Static238.anIntArrayArray36[local135][local70] = arg0;
					if (local115 > 0) {
						local115 -= local74;
						local70 += local131;
					}
				}
			} else {
				for (local135 = arg1; local135 <= arg4; local135++) {
					local115 += local110;
					Static238.anIntArrayArray36[local70][local135] = arg0;
					if (local115 > 0) {
						local115 -= local74;
						local70 += local131;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method2056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
