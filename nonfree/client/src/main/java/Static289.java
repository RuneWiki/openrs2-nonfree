import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "[[[Lclient!dg;")
	public static Class49[][][] aClass49ArrayArrayArray5;

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!ij;")
	public static final Class7_Sub15 aClass7_Sub15_3 = new Class7_Sub15(0, 0);

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
	public static int anInt2339 = 3;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString162 = "level: ";

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!ap;)V")
	public static void method1922(@OriginalArg(1) Class7_Sub3 arg0) {
		@Pc(7) int local7 = arg0.method2732();
		Static346.aClass136Array1 = new Class136[local7];
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			Static346.aClass136Array1[local17] = new Class136();
			Static346.aClass136Array1[local17].anInt3867 = arg0.method2732();
			Static346.aClass136Array1[local17].aString250 = arg0.method2770();
		}
		Static58.anInt1482 = arg0.method2732();
		Static65.anInt1637 = arg0.method2732();
		Static101.anInt2448 = arg0.method2732();
		Static238.aClass187_Sub1Array1 = new Class187_Sub1[Static65.anInt1637 + 1 - Static58.anInt1482];
		for (@Pc(66) int local66 = 0; local66 < Static101.anInt2448; local66++) {
			@Pc(71) int local71 = arg0.method2732();
			@Pc(79) Class187_Sub1 local79 = Static238.aClass187_Sub1Array1[local71] = new Class187_Sub1();
			local79.anInt5948 = arg0.method2772();
			local79.anInt5938 = arg0.method2767();
			local79.anInt5950 = Static58.anInt1482 + local71;
			local79.aString383 = arg0.method2770();
			local79.aString382 = arg0.method2770();
		}
		Static69.anInt1711 = arg0.method2767();
		Static316.aBoolean441 = true;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!qo;I)I")
	public static int method1940(@OriginalArg(0) Class22_Sub2_Sub1_Sub2 arg0) {
		@Pc(6) Class174 local6 = arg0.aClass174_1;
		if (local6.anIntArray670 != null) {
			local6 = local6.method4438();
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local6.anInt5185;
		@Pc(32) Class79 local32 = arg0.method4417();
		if (arg0.aBoolean378) {
			local28 = local6.anInt5201;
		} else if (arg0.anInt5100 == local32.anInt2385 || local32.anInt2351 == arg0.anInt5100 || local32.anInt2376 == arg0.anInt5100 || arg0.anInt5100 == local32.anInt2357) {
			local28 = local6.anInt5189;
		} else if (local32.anInt2374 == arg0.anInt5100 || local32.anInt2356 == arg0.anInt5100 || arg0.anInt5100 == local32.anInt2372 || local32.anInt2390 == arg0.anInt5100) {
			local28 = local6.anInt5217;
		}
		return local28;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIILclient!pe;IIII)V")
	public static void method1943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class89 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(17) Interface1 local17 = (Interface1) Static48.method4691(arg0, arg6, arg7);
		@Pc(25) Class122 local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(51) int local51;
		if (local17 != null) {
			local25 = Static245.method4227(local17.method5362());
			local31 = local17.method5360() & 0x3;
			local35 = local17.method5361();
			if (local25.anInt3536 == -1) {
				local51 = arg1;
				if (local25.anInt3560 > 0) {
					local51 = arg4;
				}
				if (local35 == 0 || local35 == 2) {
					if (local31 == 0) {
						arg3.method5415(local51, arg2, 4, arg5);
					} else if (local31 == 1) {
						arg3.method5448(arg2, 4, arg5, local51);
					} else if (local31 == 2) {
						arg3.method5415(local51, arg2 + 3, 4, arg5);
					} else if (local31 == 3) {
						arg3.method5448(arg2, 4, arg5 + 3, local51);
					}
				}
				if (local35 == 3) {
					if (local31 == 0) {
						arg3.method5477(arg5, arg2, 1, 1, local51);
					} else if (local31 == 1) {
						arg3.method5477(arg5, arg2 + 3, 1, 1, local51);
					} else if (local31 == 2) {
						arg3.method5477(arg5 + 3, arg2 + 3, 1, 1, local51);
					} else if (local31 == 3) {
						arg3.method5477(arg5 + 3, arg2, 1, 1, local51);
					}
				}
				if (local35 == 2) {
					if (local31 == 0) {
						arg3.method5448(arg2, 4, arg5, local51);
					} else if (local31 == 1) {
						arg3.method5415(local51, arg2 + 3, 4, arg5);
					} else if (local31 == 2) {
						arg3.method5448(arg2, 4, arg5 + 3, local51);
					} else if (local31 == 3) {
						arg3.method5415(local51, arg2, 4, arg5);
					}
				}
			} else {
				Static301.method4880(arg2, local31, arg5, arg3, local25);
			}
		}
		local17 = (Interface1) Static252.method5177(arg0, arg6, arg7, gd.class);
		if (local17 != null) {
			local25 = Static245.method4227(local17.method5362());
			local31 = local17.method5360() & 0x3;
			local35 = local17.method5361();
			if (local25.anInt3536 != -1) {
				Static301.method4880(arg2, local31, arg5, arg3, local25);
			} else if (local35 == 9) {
				local51 = -1118482;
				if (local25.anInt3560 > 0) {
					local51 = -1179648;
				}
				if (local31 == 0 || local31 == 2) {
					arg3.method5398(arg2, arg5, arg2 + 3, local51, arg5 + 3);
				} else {
					arg3.method5398(arg2, arg5 + 3, arg2 + 3, local51, arg5);
				}
			}
		}
		local17 = (Interface1) Static44.method981(arg0, arg6, arg7);
		if (local17 == null) {
			return;
		}
		local25 = Static245.method4227(local17.method5362());
		local31 = local17.method5360() & 0x3;
		if (local25.anInt3536 != -1) {
			Static301.method4880(arg2, local31, arg5, arg3, local25);
			return;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)Lclient!nd;")
	public static Class141 method1954(@OriginalArg(0) int arg0) {
		@Pc(10) Class141 local10 = (Class141) Static222.aClass103_43.method2682((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static191.aClass180_50.method4560(arg0, 31);
		local10 = new Class141();
		if (local25 != null) {
			local10.method3769(arg0, new Class7_Sub3(local25));
		}
		Static222.aClass103_43.method2687(local10, (long) arg0);
		return local10;
	}
}
