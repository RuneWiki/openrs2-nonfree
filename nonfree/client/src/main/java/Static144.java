import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!ke;")
	public static Class52 aClass52_33;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	public static int anInt2951;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
	public static int anInt2952;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!ij;")
	public static Class26_Sub2_Sub1 aClass26_Sub2_Sub1_1;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1356 = Static193.method3027("::clientdrop");

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!gj;")
	public static Class40 aClass40_9 = new Class40(8);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V")
	public static void method2085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static139.anInt4130++;
		Static153.method2263(true);
		Static167.method2485(true);
		Static153.method2263(false);
		Static167.method2485(false);
		Static193.method3026();
		Static57.method902();
		@Pc(37) int local37;
		@Pc(56) int local56;
		if (!Static192.aBoolean174) {
			local37 = Static97.anInt2019;
			if (Static36.anInt790 / 256 > local37) {
				local37 = Static36.anInt790 / 256;
			}
			local56 = Static179.anInt1329 + Static124.anInt3872 & 0x7FF;
			if (Static147.aBooleanArray13[4] && local37 < Static209.anIntArray379[4] + 128) {
				local37 = Static209.anIntArray379[4] + 128;
			}
			Static71.method1030(Static119.anInt2412, arg1, Static47.anInt972, local37 * 3 + 600, Static107.method2399(aClass26_Sub2_Sub1_1.anInt2611, aClass26_Sub2_Sub1_1.anInt2593, Static137.anInt2795) + -50, local56, local37);
		}
		if (Static192.aBoolean174) {
			local37 = Static10.method250();
		} else {
			local37 = Static132.method1843();
		}
		local56 = Static130.anInt2546;
		@Pc(109) int local109 = Static118.anInt2400;
		@Pc(111) int local111 = Static54.anInt1158;
		@Pc(113) int local113 = Static183.anInt2962;
		@Pc(115) int local115 = Static122.anInt2464;
		@Pc(159) int local159;
		for (@Pc(117) int local117 = 0; local117 < 5; local117++) {
			if (Static147.aBooleanArray13[local117]) {
				local159 = (int) ((double) -Static175.anIntArray294[local117] + (double) (Static175.anIntArray294[local117] * 2 + 1) * Math.random() + Math.sin((double) Static122.anIntArray147[local117] * ((double) Static76.anIntArray80[local117] / 100.0D)) * (double) Static209.anIntArray379[local117]);
				if (local117 == 1) {
					Static118.anInt2400 += local159;
				}
				if (local117 == 4) {
					Static122.anInt2464 += local159;
					if (Static122.anInt2464 < 128) {
						Static122.anInt2464 = 128;
					}
					if (Static122.anInt2464 > 383) {
						Static122.anInt2464 = 383;
					}
				}
				if (local117 == 2) {
					Static54.anInt1158 += local159;
				}
				if (local117 == 0) {
					Static130.anInt2546 += local159;
				}
				if (local117 == 3) {
					Static183.anInt2962 = Static183.anInt2962 + local159 & 0x7FF;
				}
			}
		}
		Static104.method3092(arg3, arg2, arg0 + arg3, arg2 + arg1);
		Static177.method2768();
		local159 = Static8.anInt187;
		@Pc(234) int local234 = Static167.anInt3403;
		if (arg3 <= local159 && local159 < arg0 + arg3 && local234 >= arg2 && local234 < arg1 + arg2) {
			Static58.aBoolean78 = true;
			@Pc(268) int local268 = Static163.anInt3325;
			Static126.anInt2490 = 0;
			@Pc(272) int local272 = Static192.anInt3907;
			@Pc(274) int local274 = Static8.anInt190;
			@Pc(276) int local276 = Static205.anInt4176;
			Static25.anInt541 = (local276 - local268) * (Static8.anInt187 - arg3) / arg0 + local268;
			Static207.anInt4208 = (Static167.anInt3403 - arg2) * (local274 - local272) / arg1 + local272;
		} else {
			Static58.aBoolean78 = false;
			Static126.anInt2490 = 0;
		}
		Static48.method3330();
		Static104.method3079(arg3, arg2, arg0, arg1, 0);
		Static60.method2387(Static130.anInt2546, Static118.anInt2400, Static54.anInt1158, Static122.anInt2464, Static183.anInt2962, local37);
		Static48.method3330();
		Static9.method225();
		Static10.method246(arg1, arg0, arg3, arg2);
		Static121.method1748(arg0, arg3, arg1, arg2);
		((Class19) Static177.anInterface1_7).method569(Static211.anInt4246);
		Static110.method1584(arg3, arg0, arg2, arg1);
		Static54.anInt1158 = local111;
		Static183.anInt2962 = local113;
		Static122.anInt2464 = local115;
		Static130.anInt2546 = local56;
		Static118.anInt2400 = local109;
		if (Static130.aBoolean128 && Static131.method1842() == 0) {
			Static130.aBoolean128 = false;
		}
		if (Static130.aBoolean128) {
			Static104.method3079(arg3, arg2, arg0, arg1, 0);
			Static60.method2392(false, Static92.aClass70_953);
		}
		if (!Static130.aBoolean128 && !Static134.aBoolean131 && local159 >= arg3 && local159 < arg0 + arg3 && local234 >= arg2 && arg1 + arg2 > local234) {
			Static27.method485(arg0, arg3, local159, local234, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!b;I)Z")
	public static boolean method2087(@OriginalArg(0) Class6 arg0) {
		if (arg0.anIntArray20 == null) {
			return false;
		}
		for (@Pc(15) int local15 = 0; local15 < arg0.anIntArray20.length; local15++) {
			@Pc(21) int local21 = Static183.method2099(local15, arg0);
			@Pc(26) int local26 = arg0.anIntArray18[local15];
			if (arg0.anIntArray20[local15] == 2) {
				if (local21 >= local26) {
					return false;
				}
			} else if (arg0.anIntArray20[local15] == 3) {
				if (local21 <= local26) {
					return false;
				}
			} else if (arg0.anIntArray20[local15] == 4) {
				if (local26 == local21) {
					return false;
				}
			} else if (local26 != local21) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)Z")
	public static boolean method2088(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(31) Class3_Sub3_Sub9 local31 = Static161.method2421(arg0);
		return local31.method771(arg1);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZIII)Lclient!oc;")
	public static Class70 method2089(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(24) int local24 = 1;
		for (@Pc(28) int local28 = arg1 / 10; local28 != 0; local28 /= 10) {
			local24++;
		}
		@Pc(38) int local38 = local24;
		if (arg1 < 0 || arg0) {
			local38 = local24 + 1;
		}
		@Pc(51) byte[] local51 = new byte[local38];
		if (arg1 < 0) {
			local51[0] = 45;
		} else if (arg0) {
			local51[0] = 43;
		}
		for (@Pc(69) int local69 = 0; local69 < local24; local69++) {
			@Pc(74) int local74 = arg1 % 10;
			arg1 /= 10;
			if (local74 < 0) {
				local74 = -local74;
			}
			if (local74 > 9) {
				local74 += 39;
			}
			local51[local38 - local69 - 1] = (byte) (local74 + 48);
		}
		@Pc(111) Class70 local111 = new Class70();
		local111.anInt2899 = local38;
		local111.aByteArray30 = local51;
		return local111;
	}
}
