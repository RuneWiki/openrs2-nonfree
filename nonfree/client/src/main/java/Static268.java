import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!pl", name = "L", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_148 = new Class208(50, 12);

	@OriginalMember(owner = "client!pl", name = "K", descriptor = "Lclient!ab;")
	public static Class3 aClass3_13 = null;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIII)V")
	public static void method4562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(52) int local52 = local17 - (local29 - 1) * local25;
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = ((arg2 << 1) - 3) * local25;
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg2 - 1);
		Static307.method5019(Static152.anIntArrayArray30[arg1], arg0 + arg4, arg3, arg4 - arg0);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local52 += local82;
					local39 += local68;
					local82 += local60;
					local7++;
					local68 += local60;
				}
			}
			if (local52 < 0) {
				local52 += local82;
				local39 += local68;
				local68 += local60;
				local7++;
				local82 += local60;
			}
			local52 += -local76;
			local39 += -local88;
			local76 -= local56;
			local88 -= local56;
			local9--;
			@Pc(175) int local175 = arg1 - local9;
			@Pc(179) int local179 = local9 + arg1;
			@Pc(184) int local184 = arg4 + local7;
			@Pc(189) int local189 = arg4 - local7;
			Static307.method5019(Static152.anIntArrayArray30[local175], local184, arg3, local189);
			Static307.method5019(Static152.anIntArrayArray30[local179], local184, arg3, local189);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
	public static int method4563(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0.charAt(local12) == arg1) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIILclient!oj;IBII)V")
	public static void method4565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class48 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface8 local11 = (Interface8) Static94.method1598(arg7, arg1, arg0);
		@Pc(20) Class47 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			local20 = Static230.aClass96_4.method2303(local11.method6034());
			local26 = local11.method6031() & 0x3;
			local30 = local11.method6027();
			if (local20.anInt1244 == -1) {
				local37 = arg3;
				if (local20.anInt1274 > 0) {
					local37 = arg5;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg4.method2514(arg2, arg6, local37, 4);
					} else if (local26 == 1) {
						arg4.method2493(local37, arg6, arg2, 4);
					} else if (local26 == 2) {
						arg4.method2514(arg2, arg6 + 3, local37, 4);
					} else if (local26 == 3) {
						arg4.method2493(local37, arg6, arg2 + 3, 4);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg4.method2509(1, 1, arg2, local37, arg6);
					} else if (local26 == 1) {
						arg4.method2509(1, 1, arg2, local37, arg6 + 3);
					} else if (local26 == 2) {
						arg4.method2509(1, 1, arg2 + 3, local37, arg6 + 3);
					} else if (local26 == 3) {
						arg4.method2509(1, 1, arg2 + 3, local37, arg6);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg4.method2493(local37, arg6, arg2, 4);
					} else if (local26 == 1) {
						arg4.method2514(arg2, arg6 + 3, local37, 4);
					} else if (local26 == 2) {
						arg4.method2493(local37, arg6, arg2 + 3, 4);
					} else if (local26 == 3) {
						arg4.method2514(arg2, arg6, local37, 4);
					}
				}
			} else {
				Static131.method2292(arg2, local26, arg6, local20, arg4);
			}
		}
		local11 = (Interface8) Static278.method4615(arg7, arg1, arg0, td.class);
		if (local11 != null) {
			local20 = Static230.aClass96_4.method2303(local11.method6034());
			local26 = local11.method6031() & 0x3;
			local30 = local11.method6027();
			if (local20.anInt1244 != -1) {
				Static131.method2292(arg2, local26, arg6, local20, arg4);
			} else if (local30 == 9) {
				local37 = -1118482;
				if (local20.anInt1274 > 0) {
					local37 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg4.method2536(arg6, arg6 + 3, arg2, local37, arg2 + 3);
				} else {
					arg4.method2536(arg6, arg6 + 3, arg2 - -3, local37, arg2);
				}
			}
		}
		local11 = (Interface8) Static266.method4518(arg7, arg1, arg0);
		if (local11 == null) {
			return;
		}
		local20 = Static230.aClass96_4.method2303(local11.method6034());
		local26 = local11.method6031() & 0x3;
		if (local20.anInt1244 != -1) {
			Static131.method2292(arg2, local26, arg6, local20, arg4);
			return;
		}
	}
}
