import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Z")
	public static boolean aBoolean233;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[I")
	public static int[] anIntArray300 = new int[128];

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
	public static int[] anIntArray301 = new int[4096];

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
	public static int anInt3603 = 0;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
	public static int anInt3609 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIBIILclient!gk;IZIIIILclient!wi;)Lclient!gk;")
	public static Class13_Sub1 method2920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class186 arg12) {
		@Pc(26) long local26 = ((long) arg4 << 48) + ((long) arg11 << 32) + (long) ((arg6 << 24) + arg10 + (arg3 << 16));
		@Pc(32) Class13_Sub1 local32 = (Class13_Sub1) Static98.aClass172_19.method4347(local26);
		@Pc(113) int local113;
		@Pc(115) int local115;
		@Pc(126) int local126;
		@Pc(130) int local130;
		@Pc(166) int local166;
		if (local32 == null) {
			@Pc(39) byte local39;
			if (arg10 == 1) {
				local39 = 9;
			} else if (arg10 == 2) {
				local39 = 12;
			} else if (arg10 == 3) {
				local39 = 15;
			} else if (arg10 == 4) {
				local39 = 18;
			} else {
				local39 = 21;
			}
			@Pc(83) int[] local83 = new int[] { 64, 96, 128 };
			@Pc(103) Class13_Sub7 local103 = new Class13_Sub7(local39 * 3 + 1, -local39 + local39 * 2 * 3, 0);
			@Pc(107) int[][] local107 = new int[3][local39];
			local113 = local103.method4286(0, 0);
			for (local115 = 0; local115 < 3; local115++) {
				local126 = local83[local115];
				local130 = local83[local115];
				for (@Pc(132) int local132 = 0; local132 < local39; local132++) {
					@Pc(145) int local145 = (local132 << 11) / local39;
					@Pc(155) int local155 = Class174.anIntArray443[local145] * local130 + arg9 >> 16;
					local166 = arg2 + local126 * Class174.anIntArray444[local145] >> 16;
					local107[local115][local132] = local103.method4286(local166, local155);
				}
			}
			for (local115 = 0; local115 < 3; local115++) {
				local126 = (local115 * 256 + 128) / 3;
				local130 = 256 - local126;
				@Pc(244) short local244 = (short) ((local130 * (arg11 & 0xFC00) + local126 * (arg4 & 0xFC00) & 0xFC0000) + ((arg11 & 0x380) * local130 + local126 * (arg4 & 0x380) & 0x38000) + (local130 * (arg11 & 0x7F) + (arg4 & 0x7F) * local126 & 0x7F00) >> 8);
				@Pc(255) byte local255 = (byte) (arg3 * local130 + arg6 * local126 >> 8);
				for (local166 = 0; local166 < local39; local166++) {
					if (local115 == 0) {
						local103.method4281(local113, local107[0][(local166 + 1) % local39], local107[0][local166], local244, local255);
					} else {
						local103.method4281(local107[local115 - 1][local166], local107[local115 - 1][(local166 + 1) % local39], local107[local115][(local166 + 1) % local39], local244, local255);
						local103.method4281(local107[local115 - 1][local166], local107[local115][(local166 + 1) % local39], local107[local115][local166], local244, local255);
					}
				}
			}
			local32 = local103.method4270(64, 768, -50, -10, -50);
			Static98.aClass172_19.method4345(local32, local26);
		}
		@Pc(371) int local371 = arg10 * 64 - 1;
		@Pc(374) int local374 = -local371;
		@Pc(377) int local377 = -local371;
		@Pc(380) int local380 = arg5.method2741();
		@Pc(382) int local382 = local371;
		local113 = local371;
		if (arg7) {
			if (arg0 > 640 && arg0 < 1408) {
				local113 = local371 + 128;
			}
			if (arg0 > 1664 || arg0 < 384) {
				local374 -= 128;
			}
			if (arg0 > 128 && arg0 < 896) {
				local377 -= 128;
			}
			if (arg0 > 1152 && arg0 < 1920) {
				local382 = local371 + 128;
			}
		}
		if (local377 > local380) {
			local380 = local377;
		}
		local115 = arg5.method2737();
		local126 = arg5.method2755();
		if (local115 > local382) {
			local115 = local382;
		}
		@Pc(442) Class4_Sub2_Sub23 local442 = null;
		if (local126 < local374) {
			local126 = local374;
		}
		local130 = arg5.method2742();
		if (arg12 != null) {
			@Pc(463) int local463 = arg12.anIntArray469[arg8];
			local442 = Static295.method4588(local463 >> 16);
			arg8 = local463 & 0xFFFF;
		}
		if (local130 > local113) {
			local130 = local113;
		}
		if (local442 == null) {
			local32 = local32.method2729(true, true, true);
			local32.method2744((local115 - local380) / 2, 128, (local130 - local126) / 2);
			local32.method2740((local115 + local380) / 2, 0, (local130 + local126) / 2);
		} else {
			local32 = local32.method2729(!local442.method4713(arg8), !local442.method4705(arg8), true);
			local32.method2744((local115 - local380) / 2, 128, (local130 - local126) / 2);
			local32.method2740((local115 + local380) / 2, 0, (local130 + local126) / 2);
			local32.method2738(local442, arg8);
		}
		if (arg0 != 0) {
			local32.method2735(arg0);
		}
		if (Static251.aBoolean330) {
			@Pc(582) Class13_Sub1_Sub2 local582 = (Class13_Sub1_Sub2) local32;
			if (Static58.method2504(local126 + arg9, arg2 + local380, Static222.anInt4467) != arg1 || Static58.method2504(local130 + arg9, arg2 - -local115, Static222.anInt4467) != arg1) {
				for (local166 = 0; local166 < local582.anInt3451; local166++) {
					local582.anIntArray286[local166] += Static58.method2504(arg9 + local582.anIntArray290[local166], local582.anIntArray289[local166] + arg2, Static222.anInt4467) - arg1;
				}
				local582.aClass157_1.aBoolean334 = false;
				local582.aClass110_3.aBoolean220 = false;
			}
		} else {
			@Pc(653) Class13_Sub1_Sub1 local653 = (Class13_Sub1_Sub1) local32;
			if (arg1 != Static58.method2504(arg9 + local126, local380 + arg2, Static222.anInt4467) || arg1 != Static58.method2504(local130 + arg9, local115 + arg2, Static222.anInt4467)) {
				for (local166 = 0; local166 < local653.anInt422; local166++) {
					local653.anIntArray22[local166] += Static58.method2504(local653.anIntArray20[local166] + arg9, local653.anIntArray15[local166] - -arg2, Static222.anInt4467) - arg1;
				}
				local653.aBoolean29 = false;
			}
		}
		return local32;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static297.anInt5194 = -1;
			Static288.anInt5635 = -1;
			return;
		}
		@Pc(40) int local40 = Static58.method2504(arg0, arg2, Static222.anInt4467) - arg1;
		@Pc(44) int local44 = Class174.anIntArray443[Static254.anInt4974];
		@Pc(48) int local48 = local40 - Static153.anInt3111;
		@Pc(52) int local52 = Class174.anIntArray444[Static254.anInt4974];
		@Pc(62) int local62 = arg2 - Static71.anInt1457;
		@Pc(66) int local66 = Class174.anIntArray444[Static56.anInt1258];
		@Pc(70) int local70 = Class174.anIntArray443[Static56.anInt1258];
		@Pc(74) int local74 = arg0 - Static248.anInt4865;
		@Pc(85) int local85 = local66 * local74 + local62 * local70 >> 16;
		@Pc(95) int local95 = local70 * local74 - local66 * local62 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local44 * local48 - local52 * local95 >> 16;
		@Pc(117) int local117 = local44 * local95 + local52 * local48 >> 16;
		if (local117 < 50) {
			Static297.anInt5194 = -1;
			Static288.anInt5635 = -1;
		} else if (Static251.aBoolean330) {
			@Pc(154) int local154 = arg6 * 512 >> 8;
			@Pc(160) int local160 = arg4 * 512 >> 8;
			Static288.anInt5635 = arg3 + local97 * local154 / local117;
			Static297.anInt5194 = local160 * local107 / local117 + arg5;
		} else {
			Static297.anInt5194 = (local107 << 9) / local117 + arg5;
			Static288.anInt5635 = arg3 + (local97 << 9) / local117;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
	public static int method2922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub33 local12 = (Class4_Sub33) Static49.aClass163_15.method4188((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < local12.anIntArray464.length; local27++) {
				if (arg1 == local12.anIntArray463[local27]) {
					local25 += local12.anIntArray464[local27];
				}
			}
			return local25;
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	public static void method2923() {
		@Pc(13) int local13 = Static242.anInt4776;
		@Pc(15) int local15 = Static139.anInt2754;
		@Pc(17) int local17 = Static16.anInt356;
		@Pc(23) int local23 = Static43.anInt870 - 3;
		if (Static139.aClass4_Sub2_Sub4_7 == null || Static40.aClass4_Sub2_Sub4_1 == null) {
			if (Static60.aClass22_26.method656(Static118.anInt2448) && Static60.aClass22_26.method656(Static254.anInt4973)) {
				Static139.aClass4_Sub2_Sub4_7 = Static160.method2586(Static60.aClass22_26, Static118.anInt2448);
				Static40.aClass4_Sub2_Sub4_1 = Static160.method2586(Static60.aClass22_26, Static254.anInt4973);
				if (Static251.aBoolean330) {
					if (Static139.aClass4_Sub2_Sub4_7 instanceof Class4_Sub2_Sub4_Sub2_Sub1) {
						Static139.aClass4_Sub2_Sub4_7 = new Class4_Sub2_Sub4_Sub1_Sub1((Class4_Sub2_Sub4_Sub2) Static139.aClass4_Sub2_Sub4_7);
					} else {
						Static139.aClass4_Sub2_Sub4_7 = new Class4_Sub2_Sub4_Sub1((Class4_Sub2_Sub4_Sub2) Static139.aClass4_Sub2_Sub4_7);
					}
					if (Static40.aClass4_Sub2_Sub4_1 instanceof Class4_Sub2_Sub4_Sub2_Sub1) {
						Static40.aClass4_Sub2_Sub4_1 = new Class4_Sub2_Sub4_Sub1_Sub1((Class4_Sub2_Sub4_Sub2) Static40.aClass4_Sub2_Sub4_1);
					} else {
						Static40.aClass4_Sub2_Sub4_1 = new Class4_Sub2_Sub4_Sub1((Class4_Sub2_Sub4_Sub2) Static40.aClass4_Sub2_Sub4_1);
					}
				}
			} else if (Static251.aBoolean330) {
				Static87.method1456(local13, local15, local17, 20, Static265.anInt5217, 256 - Static33.anInt657);
			} else {
				Static258.method4026(local13, local15, local17, 20, Static265.anInt5217, 256 - Static33.anInt657);
			}
		}
		@Pc(128) int local128;
		@Pc(130) int local130;
		if (Static139.aClass4_Sub2_Sub4_7 != null && Static40.aClass4_Sub2_Sub4_1 != null) {
			local128 = (local17 - Static40.aClass4_Sub2_Sub4_1.anInt5193 * 2) / Static139.aClass4_Sub2_Sub4_7.anInt5193;
			for (local130 = 0; local130 < local128; local130++) {
				Static139.aClass4_Sub2_Sub4_7.method4142(Static40.aClass4_Sub2_Sub4_1.anInt5193 + local13 + local130 * Static139.aClass4_Sub2_Sub4_7.anInt5193, local15);
			}
			Static40.aClass4_Sub2_Sub4_1.method4142(local13, local15);
			Static40.aClass4_Sub2_Sub4_1.method4139(local17 + local13 - Static40.aClass4_Sub2_Sub4_1.anInt5193, local15);
		}
		Static86.aClass4_Sub2_Sub9_3.method4105(Static187.aString131, local13 + 3, local15 + 14, Static303.anInt5783, -1);
		if (Static251.aBoolean330) {
			Static87.method1456(local13, local15 + 20, local17, local23 - 20, Static265.anInt5217, 256 - Static33.anInt657);
		} else {
			Static258.method4026(local13, local15 + 20, local17, local23 - 20, Static265.anInt5217, 256 - Static33.anInt657);
		}
		local128 = Static79.anInt1661;
		local130 = anInt3603;
		@Pc(212) int local212;
		@Pc(233) int local233;
		for (local212 = 0; local212 < Static286.anInt5602; local212++) {
			local233 = (Static286.anInt5602 - local212 - 1) * 15 + local15 + 13 + 20;
			if (local128 > local13 && local13 + local17 > local128 && local233 - 13 < local130 && local130 < local233 + 3) {
				if (Static251.aBoolean330) {
					Static87.method1456(local13, local233 - 12, local17, 15, Static159.anInt3257, 256 - Static148.anInt2905);
				} else {
					Static258.method4026(local13, local233 - 12, local17, 15, Static159.anInt3257, 256 - Static148.anInt2905);
				}
			}
		}
		if ((Static217.aClass4_Sub2_Sub4_8 == null || Static76.aClass4_Sub2_Sub4_3 == null || Static125.aClass4_Sub2_Sub4_6 == null) && Static60.aClass22_26.method656(Static48.anInt1073) && Static60.aClass22_26.method656(Static216.anInt4186) && Static60.aClass22_26.method656(Static245.anInt4850)) {
			Static217.aClass4_Sub2_Sub4_8 = Static160.method2586(Static60.aClass22_26, Static48.anInt1073);
			Static76.aClass4_Sub2_Sub4_3 = Static160.method2586(Static60.aClass22_26, Static216.anInt4186);
			Static125.aClass4_Sub2_Sub4_6 = Static160.method2586(Static60.aClass22_26, Static245.anInt4850);
			if (Static251.aBoolean330) {
				if (Static217.aClass4_Sub2_Sub4_8 instanceof Class4_Sub2_Sub4_Sub2_Sub1) {
					Static217.aClass4_Sub2_Sub4_8 = new Class4_Sub2_Sub4_Sub1_Sub1((Class4_Sub2_Sub4_Sub2) Static217.aClass4_Sub2_Sub4_8);
				} else {
					Static217.aClass4_Sub2_Sub4_8 = new Class4_Sub2_Sub4_Sub1((Class4_Sub2_Sub4_Sub2) Static217.aClass4_Sub2_Sub4_8);
				}
				if (Static76.aClass4_Sub2_Sub4_3 instanceof Class4_Sub2_Sub4_Sub2_Sub1) {
					Static76.aClass4_Sub2_Sub4_3 = new Class4_Sub2_Sub4_Sub1_Sub1((Class4_Sub2_Sub4_Sub2) Static76.aClass4_Sub2_Sub4_3);
				} else {
					Static76.aClass4_Sub2_Sub4_3 = new Class4_Sub2_Sub4_Sub1((Class4_Sub2_Sub4_Sub2) Static76.aClass4_Sub2_Sub4_3);
				}
				if (Static125.aClass4_Sub2_Sub4_6 instanceof Class4_Sub2_Sub4_Sub2_Sub1) {
					Static125.aClass4_Sub2_Sub4_6 = new Class4_Sub2_Sub4_Sub1_Sub1((Class4_Sub2_Sub4_Sub2) Static125.aClass4_Sub2_Sub4_6);
				} else {
					Static125.aClass4_Sub2_Sub4_6 = new Class4_Sub2_Sub4_Sub1((Class4_Sub2_Sub4_Sub2) Static125.aClass4_Sub2_Sub4_6);
				}
			}
		}
		@Pc(442) int local442;
		if (Static217.aClass4_Sub2_Sub4_8 != null && Static76.aClass4_Sub2_Sub4_3 != null && Static125.aClass4_Sub2_Sub4_6 != null) {
			local212 = (local17 - Static125.aClass4_Sub2_Sub4_6.anInt5193 * 2) / Static217.aClass4_Sub2_Sub4_8.anInt5193;
			for (local233 = 0; local233 < local212; local233++) {
				Static217.aClass4_Sub2_Sub4_8.method4142(local233 * Static217.aClass4_Sub2_Sub4_8.anInt5193 + local13 + Static125.aClass4_Sub2_Sub4_6.anInt5193, -Static217.aClass4_Sub2_Sub4_8.anInt5191 + local15 - -local23);
			}
			local233 = (local23 - Static125.aClass4_Sub2_Sub4_6.anInt5191 - 20) / Static76.aClass4_Sub2_Sub4_3.anInt5191;
			for (local442 = 0; local442 < local233; local442++) {
				Static76.aClass4_Sub2_Sub4_3.method4142(local13, Static76.aClass4_Sub2_Sub4_3.anInt5191 * local442 + local15 + 20);
				Static76.aClass4_Sub2_Sub4_3.method4139(local17 + local13 - Static76.aClass4_Sub2_Sub4_3.anInt5193, local442 * Static76.aClass4_Sub2_Sub4_3.anInt5191 + 20 + local15);
			}
			Static125.aClass4_Sub2_Sub4_6.method4142(local13, local15 + local23 - Static125.aClass4_Sub2_Sub4_6.anInt5191);
			Static125.aClass4_Sub2_Sub4_6.method4139(local17 + local13 - Static125.aClass4_Sub2_Sub4_6.anInt5193, local23 + local15 + -Static125.aClass4_Sub2_Sub4_6.anInt5191);
		}
		for (local212 = 0; local212 < Static286.anInt5602; local212++) {
			local233 = (Static286.anInt5602 - local212 - 1) * 15 + local15 + 20 + 13;
			local442 = Static303.anInt5783;
			if (local128 > local13 && local13 + local17 > local128 && local130 > local233 - 13 && local130 < local233 + 3) {
				local442 = Static158.anInt3243;
			}
			Static86.aClass4_Sub2_Sub9_3.method4105(Static149.method2347(local212), local13 + 3, local233, local442, 0);
		}
		Static210.method3316(Static242.anInt4776, Static16.anInt356, Static43.anInt870, Static139.anInt2754);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIILclient!uk;IZJ)Z")
	public static boolean method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class13 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static154.anIntArrayArrayArray5 == Static127.anIntArrayArrayArray3;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static246.anInt4853 || local17 >= Static64.anInt1393) {
					return false;
				}
				@Pc(42) Class4_Sub21 local42 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][local10][local17];
				if (local42 != null && local42.anInt2694 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class99 local58 = new Class99();
		local58.aLong117 = arg11;
		local58.anInt3231 = arg0;
		local58.anInt3224 = arg5;
		local58.anInt3219 = arg6;
		local58.anInt3227 = arg7;
		local58.aClass13_4 = arg8;
		local58.anInt3229 = arg9;
		local58.anInt3225 = arg1;
		local58.anInt3222 = arg2;
		local58.anInt3223 = arg1 + arg3 - 1;
		local58.anInt3221 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static261.aClass4_Sub21ArrayArrayArray4[local141][local17][local108] == null) {
						Static261.aClass4_Sub21ArrayArrayArray4[local141][local17][local108] = new Class4_Sub21(local141, local17, local108);
					}
				}
				@Pc(174) Class4_Sub21 local174 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][local17][local108];
				local174.aClass99Array19[local174.anInt2694] = local58;
				local174.anIntArray227[local174.anInt2694] = local115;
				local174.anInt2695 |= local115;
				local174.anInt2694++;
				if (local6 && Static149.anIntArrayArray17[local17][local108] != 0) {
					local8 = Static149.anIntArrayArray17[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static149.anIntArrayArray17[local17][local108] == 0) {
						Static149.anIntArrayArray17[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static181.aClass99Array36[Static69.anInt1421++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!pi;Z)V")
	public static void method2926(@OriginalArg(0) Class4_Sub24 arg0) {
		label84: while (true) {
			if (arg0.aByteArray47.length > arg0.anInt3822) {
				@Pc(16) int local16 = 0;
				@Pc(18) boolean local18 = false;
				@Pc(20) int local20 = 0;
				if (arg0.method3110() == 1) {
					local16 = arg0.method3110();
					local18 = true;
					local20 = arg0.method3110();
				}
				@Pc(39) int local39 = arg0.method3110();
				@Pc(43) int local43 = arg0.method3110();
				@Pc(50) int local50 = local39 * 64 - Static175.anInt3552;
				@Pc(61) int local61 = Static158.anInt3242 + Static133.anInt2663 - local43 * 64 - 1;
				@Pc(145) byte local145;
				@Pc(91) int local91;
				if (local50 >= 0 && local61 - 63 >= 0 && Static207.anInt2141 > local50 + 63 && local61 < Static158.anInt3242) {
					local91 = local50 >> 6;
					@Pc(95) int local95 = local61 >> 6;
					@Pc(97) int local97 = 0;
					while (true) {
						if (local97 >= 64) {
							continue label84;
						}
						for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
							if (!local18 || local97 >= local16 * 8 && local97 < local16 * 8 + 8 && local102 >= local20 * 8 && local20 * 8 + 8 > local102) {
								local145 = arg0.method3069();
								if (local145 != 0) {
									if (Static245.aByteArrayArrayArray14[local91][local95] == null) {
										Static245.aByteArrayArrayArray14[local91][local95] = new byte[4096];
									}
									Static245.aByteArrayArrayArray14[local91][local95][local97 + (63 - local102 << 6)] = local145;
									@Pc(183) byte local183 = arg0.method3069();
									if (Static211.aByteArrayArrayArray12[local91][local95] == null) {
										Static211.aByteArrayArrayArray12[local91][local95] = new byte[4096];
									}
									Static211.aByteArrayArrayArray12[local91][local95][local97 + (63 - local102 << 6)] = local183;
								}
							}
						}
						local97++;
					}
				}
				local91 = 0;
				while (true) {
					if ((local18 ? 64 : 4096) <= local91) {
						continue label84;
					}
					local145 = arg0.method3069();
					if (local145 != 0) {
						arg0.anInt3822++;
					}
					local91++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!lg;I)V")
	public static void method2927(@OriginalArg(0) Class97 arg0) {
		if (Static80.anInt1674 == arg0.anInt3179) {
			Static48.aBooleanArray14[arg0.anInt3126] = true;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public static void method2928(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 12);
		local8.method2875();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII[[II)I")
	public static int method2929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4) {
		@Pc(27) int local27 = arg3[arg4][arg1] * (128 - arg2) + arg3[arg4 + 1][arg1] * arg2 >> 7;
		@Pc(55) int local55 = arg3[arg4][arg1 + 1] * (128 - arg2) + arg3[arg4 + 1][arg1 + 1] * arg2 >> 7;
		return (128 - arg0) * local27 + arg0 * local55 >> 7;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
	public static void method2930() {
		if (Static218.anInt4197 > 1) {
			Static218.anInt4197--;
			Static30.anInt636 = Static131.anInt1441;
		}
		if (Static268.anInt5350 > 0) {
			Static268.anInt5350--;
		}
		if (Static243.aBoolean300) {
			Static243.aBoolean300 = false;
			Static63.method1164();
			return;
		}
		@Pc(49) int local49;
		for (local49 = 0; local49 < 100 && Static92.method1527(); local49++) {
		}
		if (Static204.anInt4047 != 30) {
			return;
		}
		Static293.method4565(Static175.aClass4_Sub24_Sub1_1);
		@Pc(74) Object local74 = Static88.aClass30_1.anObject1;
		@Pc(97) int local97;
		@Pc(102) int local102;
		@Pc(124) int local124;
		@Pc(131) int local131;
		@Pc(209) int local209;
		@Pc(203) int local203;
		synchronized (Static88.aClass30_1.anObject1) {
			if (!Static156.aBoolean208) {
				Static88.aClass30_1.anInt1047 = 0;
			} else if (Static79.anInt1662 != 0 || Static88.aClass30_1.anInt1047 >= 40) {
				Static175.aClass4_Sub24_Sub1_1.method3123(31);
				Static175.aClass4_Sub24_Sub1_1.method3116(0);
				local97 = 0;
				@Pc(100) int local100 = Static175.aClass4_Sub24_Sub1_1.anInt3822;
				for (local102 = 0; local102 < Static88.aClass30_1.anInt1047 && Static175.aClass4_Sub24_Sub1_1.anInt3822 - local100 < 240; local102++) {
					local97++;
					local124 = Static88.aClass30_1.anIntArray113[local102];
					@Pc(126) boolean local126 = false;
					local131 = Static88.aClass30_1.anIntArray112[local102];
					if (local131 < 0) {
						local131 = 0;
					} else if (local131 > 65534) {
						local131 = 65534;
					}
					if (local124 < 0) {
						local124 = 0;
					} else if (local124 > 65534) {
						local124 = 65534;
					}
					if (Static88.aClass30_1.anIntArray113[local102] == -1 && Static88.aClass30_1.anIntArray112[local102] == -1) {
						local126 = true;
						local124 = -1;
						local131 = -1;
					}
					if (Static86.anInt1739 != local131 || local124 != Static29.anInt620) {
						local203 = local124 - Static29.anInt620;
						Static29.anInt620 = local124;
						local209 = local131 - Static86.anInt1739;
						Static86.anInt1739 = local131;
						if (Static97.anInt4590 < 8 && local209 >= -32 && local209 <= 31 && local203 >= -32 && local203 <= 31) {
							local203 += 32;
							local209 += 32;
							Static175.aClass4_Sub24_Sub1_1.method3105((local209 << 6) + (Static97.anInt4590 << 12) + local203);
							Static97.anInt4590 = 0;
						} else if (Static97.anInt4590 < 32 && local209 >= -128 && local209 <= 127 && local203 >= -128 && local203 <= 127) {
							Static175.aClass4_Sub24_Sub1_1.method3116(Static97.anInt4590 + 128);
							local203 += 128;
							local209 += 128;
							Static175.aClass4_Sub24_Sub1_1.method3105(local203 + (local209 << 8));
							Static97.anInt4590 = 0;
						} else if (Static97.anInt4590 < 32) {
							Static175.aClass4_Sub24_Sub1_1.method3116(Static97.anInt4590 + 192);
							if (local126) {
								Static175.aClass4_Sub24_Sub1_1.method3066(Integer.MIN_VALUE);
							} else {
								Static175.aClass4_Sub24_Sub1_1.method3066(local131 | local124 << 16);
							}
							Static97.anInt4590 = 0;
						} else {
							Static175.aClass4_Sub24_Sub1_1.method3105(Static97.anInt4590 + 57344);
							if (local126) {
								Static175.aClass4_Sub24_Sub1_1.method3066(Integer.MIN_VALUE);
							} else {
								Static175.aClass4_Sub24_Sub1_1.method3066(local124 << 16 | local131);
							}
							Static97.anInt4590 = 0;
						}
					} else if (Static97.anInt4590 < 2047) {
						Static97.anInt4590++;
					}
				}
				Static175.aClass4_Sub24_Sub1_1.method3090(Static175.aClass4_Sub24_Sub1_1.anInt3822 - local100);
				if (local97 >= Static88.aClass30_1.anInt1047) {
					Static88.aClass30_1.anInt1047 = 0;
				} else {
					Static88.aClass30_1.anInt1047 -= local97;
					for (local102 = 0; local102 < Static88.aClass30_1.anInt1047; local102++) {
						Static88.aClass30_1.anIntArray112[local102] = Static88.aClass30_1.anIntArray112[local97 + local102];
						Static88.aClass30_1.anIntArray113[local102] = Static88.aClass30_1.anIntArray113[local97 + local102];
					}
				}
			}
		}
		if (Static79.anInt1662 != 0) {
			@Pc(434) long local434 = (Static103.aLong75 - Static150.aLong111) / 50L;
			if (local434 > 32767L) {
				local434 = 32767L;
			}
			local97 = Static8.anInt159;
			Static150.aLong111 = Static103.aLong75;
			local131 = (int) local434;
			local102 = Static72.anInt1466;
			@Pc(451) byte local451 = 0;
			if (local102 < 0) {
				local102 = 0;
			} else if (local102 > 65535) {
				local102 = 65535;
			}
			if (local97 < 0) {
				local97 = 0;
			} else if (local97 > 65535) {
				local97 = 65535;
			}
			if (Static79.anInt1662 == 2) {
				local451 = 1;
			}
			Static175.aClass4_Sub24_Sub1_1.method3123(185);
			Static175.aClass4_Sub24_Sub1_1.method3062(local102 | local97 << 16);
			Static175.aClass4_Sub24_Sub1_1.method3112(local131 | local451 << 15);
		}
		if (Static22.anInt478 > 0) {
			Static22.anInt478--;
		}
		if (Static82.aBoolean100 && Static22.anInt478 <= 0) {
			Static22.anInt478 = 20;
			Static82.aBoolean100 = false;
			Static175.aClass4_Sub24_Sub1_1.method3123(125);
			Static175.aClass4_Sub24_Sub1_1.method3112((int) Static276.aFloat156);
			Static175.aClass4_Sub24_Sub1_1.method3064((int) Static126.aFloat73);
		}
		if (Static132.aBoolean169 && !Static305.aBoolean408) {
			Static305.aBoolean408 = true;
			Static175.aClass4_Sub24_Sub1_1.method3123(251);
			Static175.aClass4_Sub24_Sub1_1.method3116(1);
		}
		if (!Static132.aBoolean169 && Static305.aBoolean408) {
			Static305.aBoolean408 = false;
			Static175.aClass4_Sub24_Sub1_1.method3123(251);
			Static175.aClass4_Sub24_Sub1_1.method3116(0);
		}
		if (!Static136.aBoolean173) {
			Static175.aClass4_Sub24_Sub1_1.method3123(166);
			Static175.aClass4_Sub24_Sub1_1.method3062(Static238.method3146());
			Static136.aBoolean173 = true;
		}
		if (Static28.aBoolean46) {
			Static28.aBoolean46 = false;
		} else {
			Static111.aFloat68 /= 2.0F;
		}
		if (Static165.aBoolean213) {
			Static165.aBoolean213 = false;
		} else {
			Static12.aFloat9 /= 2.0F;
		}
		Static179.method2932();
		if (Static204.anInt4047 != 30) {
			return;
		}
		Static55.method1058();
		Static60.method1144();
		Static39.method726();
		Static137.anInt2703++;
		if (Static137.anInt2703 > 750) {
			Static63.method1164();
			return;
		}
		Static107.method1826();
		Static143.method2289();
		Static217.method3395();
		if (Static134.aClass97_12 != null) {
			Static112.method1887();
		}
		for (local49 = Static216.method3387(true); local49 != -1; local49 = Static216.method3387(false)) {
			Static1.method2(local49);
			Static52.anIntArray121[Static125.anInt2512++ & 0x1F] = local49;
		}
		@Pc(1124) int local1124;
		for (@Pc(701) Class4_Sub2_Sub15 local701 = Static223.method3501(); local701 != null; local701 = Static223.method3501()) {
			local97 = local701.method2877();
			local102 = local701.method2882();
			if (local97 == 1) {
				Static93.anIntArray268[local102] = local701.anInt3536;
				Static103.anIntArray169[Static106.anInt2115++ & 0x1F] = local102;
			} else if (local97 == 2) {
				Static89.aStringArray9[local102] = local701.aString123;
				Static133.anIntArray226[Static205.anInt4050++ & 0x1F] = local102;
			} else {
				@Pc(771) Class97 local771;
				if (local97 == 3) {
					local771 = Static148.method2340(local102);
					if (!local701.aString123.equals(local771.aString110)) {
						local771.aString110 = local701.aString123;
						method2927(local771);
					}
				} else if (local97 == 4) {
					local771 = Static148.method2340(local102);
					local131 = local701.anInt3536;
					local1124 = local701.anInt3539;
					local209 = local701.anInt3526;
					if (local771.anInt3125 != local131 || local771.anInt3121 != local1124 || local771.anInt3124 != local209) {
						local771.anInt3125 = local131;
						local771.anInt3124 = local209;
						local771.anInt3121 = local1124;
						method2927(local771);
					}
				} else if (local97 == 5) {
					local771 = Static148.method2340(local102);
					if (local771.anInt3122 != local701.anInt3536 || local701.anInt3536 == -1) {
						local771.anInt3194 = 0;
						local771.anInt3120 = 1;
						local771.anInt3122 = local701.anInt3536;
						local771.anInt3188 = 0;
						method2927(local771);
					}
				} else if (local97 == 6) {
					local124 = local701.anInt3536;
					local131 = local124 >> 10 & 0x1F;
					local1124 = local124 >> 5 & 0x1F;
					local209 = local124 & 0x1F;
					local203 = (local209 << 3) + (local131 << 19) + (local1124 << 11);
					@Pc(1146) Class97 local1146 = Static148.method2340(local102);
					if (local1146.anInt3187 != local203) {
						local1146.anInt3187 = local203;
						method2927(local1146);
					}
				} else if (local97 == 7) {
					local771 = Static148.method2340(local102);
					@Pc(1093) boolean local1093 = local701.anInt3536 == 1;
					if (local1093 != local771.aBoolean196) {
						local771.aBoolean196 = local1093;
						method2927(local771);
					}
				} else if (local97 == 8) {
					local771 = Static148.method2340(local102);
					if (local771.anInt3114 != local701.anInt3536 || local771.anInt3143 != local701.anInt3539 || local771.anInt3184 != local701.anInt3526) {
						local771.anInt3114 = local701.anInt3536;
						local771.anInt3143 = local701.anInt3539;
						local771.anInt3184 = local701.anInt3526;
						if (local771.anInt3163 != -1) {
							if (local771.anInt3148 > 0) {
								local771.anInt3184 = local771.anInt3184 * 32 / local771.anInt3148;
							} else if (local771.anInt3147 > 0) {
								local771.anInt3184 = local771.anInt3184 * 32 / local771.anInt3147;
							}
						}
						method2927(local771);
					}
				} else if (local97 == 9) {
					local771 = Static148.method2340(local102);
					if (local771.anInt3163 != local701.anInt3536 || local701.anInt3539 != local771.anInt3202) {
						local771.anInt3163 = local701.anInt3536;
						local771.anInt3202 = local701.anInt3539;
						method2927(local771);
					}
				} else if (local97 == 10) {
					local771 = Static148.method2340(local102);
					if (local701.anInt3536 != local771.anInt3158 || local771.anInt3183 != local701.anInt3539 || local771.anInt3138 != local701.anInt3526) {
						local771.anInt3183 = local701.anInt3539;
						local771.anInt3138 = local701.anInt3526;
						local771.anInt3158 = local701.anInt3536;
						method2927(local771);
					}
				} else if (local97 == 11) {
					local771 = Static148.method2340(local102);
					local771.aByte9 = 0;
					local771.anInt3152 = local771.anInt3116 = local701.anInt3539;
					local771.aByte10 = 0;
					local771.anInt3160 = local771.anInt3117 = local701.anInt3536;
					method2927(local771);
				} else if (local97 == 12) {
					local771 = Static148.method2340(local102);
					local131 = local701.anInt3536;
					if (local771 != null && local771.anInt3177 == 0) {
						if (local771.anInt3180 - local771.anInt3190 < local131) {
							local131 = local771.anInt3180 - local771.anInt3190;
						}
						if (local131 < 0) {
							local131 = 0;
						}
						if (local131 != local771.anInt3199) {
							local771.anInt3199 = local131;
							method2927(local771);
						}
					}
				} else if (local97 == 13) {
					local771 = Static148.method2340(local102);
					local771.anInt3197 = local701.anInt3536;
				}
			}
		}
		if (Static65.anInt5704 != 0) {
			Static229.anInt4595 += 20;
			if (Static229.anInt4595 >= 400) {
				Static65.anInt5704 = 0;
			}
		}
		Static309.anInt1336++;
		if (Static291.aClass97_22 != null) {
			Static307.anInt5856++;
			if (Static307.anInt5856 >= 15) {
				method2927(Static291.aClass97_22);
				Static291.aClass97_22 = null;
			}
		}
		@Pc(1342) Class97 local1342;
		if (Static97.aClass97_20 != null) {
			method2927(Static97.aClass97_20);
			if (Static194.anInt3905 + 5 < Static79.anInt1661 || Static194.anInt3905 - 5 > Static79.anInt1661 || anInt3603 > Static195.anInt3933 + 5 || anInt3603 < Static195.anInt3933 - 5) {
				Static157.aBoolean25 = true;
			}
			Static76.anInt1553++;
			if (Static186.anInt3687 == 0) {
				if (Static157.aBoolean25 && Static76.anInt1553 >= 5) {
					if (Static52.aClass97_8 == Static97.aClass97_20 && Static299.anInt5730 != Static28.anInt606) {
						local1342 = Static97.aClass97_20;
						@Pc(1344) byte local1344 = 0;
						if (Static150.anInt2944 == 1 && local1342.anInt3123 == 206) {
							local1344 = 1;
						}
						if (local1342.anIntArray249[Static299.anInt5730] <= 0) {
							local1344 = 0;
						}
						if (Static41.method791(local1342).method2572()) {
							local131 = Static299.anInt5730;
							local124 = Static28.anInt606;
							local1342.anIntArray249[local131] = local1342.anIntArray249[local124];
							local1342.anIntArray256[local131] = local1342.anIntArray256[local124];
							local1342.anIntArray249[local124] = -1;
							local1342.anIntArray256[local124] = 0;
						} else if (local1344 == 1) {
							local131 = Static299.anInt5730;
							local124 = Static28.anInt606;
							while (local131 != local124) {
								if (local124 > local131) {
									local1342.method2516(local124 - 1, local124);
									local124--;
								} else if (local124 < local131) {
									local1342.method2516(local124 + 1, local124);
									local124++;
								}
							}
						} else {
							local1342.method2516(Static299.anInt5730, Static28.anInt606);
						}
						Static175.aClass4_Sub24_Sub1_1.method3123(81);
						Static175.aClass4_Sub24_Sub1_1.method3064(Static28.anInt606);
						Static175.aClass4_Sub24_Sub1_1.method3064(Static299.anInt5730);
						Static175.aClass4_Sub24_Sub1_1.method3082(local1344);
						Static175.aClass4_Sub24_Sub1_1.method3066(Static97.aClass97_20.anInt3162);
					}
				} else if ((Static115.anInt2331 == 1 || Static169.method2683(Static286.anInt5602 - 1)) && Static286.anInt5602 > 2) {
					Static253.method3904();
				} else if (Static286.anInt5602 > 0) {
					Static265.method4184();
				}
				Static307.anInt5856 = 10;
				Static79.anInt1662 = 0;
				Static97.aClass97_20 = null;
			}
		}
		Static96.aClass97_10 = null;
		Static298.anInt5328 = 0;
		Static274.aBoolean366 = false;
		local1342 = Static218.aClass97_19;
		@Pc(1523) Class97 local1523 = Static95.aClass97_9;
		Static214.aBoolean380 = false;
		Static218.aClass97_19 = null;
		Static95.aClass97_9 = null;
		while (Static247.method3793() && Static298.anInt5328 < 128) {
			Static93.anIntArray267[Static298.anInt5328] = Static89.anInt1799;
			anIntArray300[Static298.anInt5328] = Static254.aChar4;
			Static298.anInt5328++;
		}
		Static134.aClass97_12 = null;
		if (Static56.anInt1264 != -1) {
			Static286.method4476(0, 0, 0, Static292.anInt5674, 0, Static189.anInt5672, Static56.anInt1264);
		}
		Static131.anInt1441++;
		while (true) {
			@Pc(1590) Class97 local1590;
			@Pc(1578) Class97 local1578;
			@Pc(1572) Class4_Sub23 local1572;
			do {
				local1572 = (Class4_Sub23) Static25.aClass17_3.method617();
				if (local1572 == null) {
					while (true) {
						do {
							local1572 = (Class4_Sub23) Static92.aClass17_13.method617();
							if (local1572 == null) {
								while (true) {
									do {
										local1572 = (Class4_Sub23) Static56.aClass17_6.method617();
										if (local1572 == null) {
											if (Static134.aClass97_12 == null) {
												Static152.anInt3020 = 0;
											}
											if (Static186.aClass97_17 != null) {
												Static159.method2565();
											}
											if (Static191.anInt3873 > 0 && Static113.aBooleanArray18[82] && Static113.aBooleanArray18[81] && Static131.anInt1447 != 0) {
												local124 = Static222.anInt4467 - Static131.anInt1447;
												if (local124 < 0) {
													local124 = 0;
												} else if (local124 > 3) {
													local124 = 3;
												}
												Static260.method4691(local124, Static269.anInt5357 + Static72.aClass13_Sub5_Sub1_1.anIntArray411[0], Static105.anInt2105 + Static72.aClass13_Sub5_Sub1_1.anIntArray418[0]);
											}
											if (Static191.anInt3873 > 0 && Static113.aBooleanArray18[82] && Static113.aBooleanArray18[81]) {
												if (Static113.anInt2263 != -1) {
													Static260.method4691(Static222.anInt4467, Static269.anInt5357 + Static113.anInt2263, Static105.anInt2105 - -Static108.anInt2153);
												}
												Static48.anInt1076 = 0;
												Static46.anInt1042 = 0;
											} else if (Static46.anInt1042 == 2) {
												if (Static113.anInt2263 != -1) {
													Static175.aClass4_Sub24_Sub1_1.method3123(118);
													Static175.aClass4_Sub24_Sub1_1.method3070(Static109.anInt2178);
													Static175.aClass4_Sub24_Sub1_1.method3080(Static144.anInt2858);
													Static175.aClass4_Sub24_Sub1_1.method3080(Static269.anInt5357 + Static113.anInt2263);
													Static175.aClass4_Sub24_Sub1_1.method3080(Static108.anInt2153 + Static105.anInt2105);
													Static135.anInt2679 = Static8.anInt159;
													Static137.anInt2702 = Static72.anInt1466;
													Static65.anInt5704 = 1;
													Static229.anInt4595 = 0;
												}
												Static46.anInt1042 = 0;
											} else if (Static48.anInt1076 == 2) {
												if (Static113.anInt2263 != -1) {
													Static175.aClass4_Sub24_Sub1_1.method3123(10);
													Static175.aClass4_Sub24_Sub1_1.method3064(Static108.anInt2153 + Static105.anInt2105);
													Static175.aClass4_Sub24_Sub1_1.method3080(Static113.anInt2263 + Static269.anInt5357);
													Static229.anInt4595 = 0;
													Static65.anInt5704 = 1;
													Static135.anInt2679 = Static8.anInt159;
													Static137.anInt2702 = Static72.anInt1466;
												}
												Static48.anInt1076 = 0;
											} else if (Static113.anInt2263 != -1 && Static46.anInt1042 == 0 && Static48.anInt1076 == 0) {
												Static13.method237((Static108.anInt2153 << 1) + 1 - Static72.aClass13_Sub5_Sub1_1.method4219() >> 1, (Static113.anInt2263 << 1) + 1 - Static72.aClass13_Sub5_Sub1_1.method4219() >> 1, 0);
												Static229.anInt4595 = 0;
												Static65.anInt5704 = 1;
												Static135.anInt2679 = Static8.anInt159;
												Static137.anInt2702 = Static72.anInt1466;
											}
											Static113.anInt2263 = -1;
											Static266.method4198();
											if (local1342 != Static218.aClass97_19) {
												if (local1342 != null) {
													method2927(local1342);
												}
												if (Static218.aClass97_19 != null) {
													method2927(Static218.aClass97_19);
												}
											}
											if (local1523 != Static95.aClass97_9 && Static222.anInt4461 == Static101.anInt2013) {
												if (local1523 != null) {
													method2927(local1523);
												}
												if (Static95.aClass97_9 != null) {
													method2927(Static95.aClass97_9);
												}
											}
											if (Static95.aClass97_9 == null) {
												if (Static222.anInt4461 > 0) {
													Static222.anInt4461--;
												}
											} else if (Static101.anInt2013 > Static222.anInt4461) {
												Static222.anInt4461++;
												if (Static101.anInt2013 == Static222.anInt4461) {
													method2927(Static95.aClass97_9);
												}
											}
											for (local124 = 0; local124 < 5; local124++) {
												@Pc(2033) int local2033 = Static70.anIntArray136[local124]++;
											}
											local124 = Static48.method942();
											local131 = Static84.method1412();
											if (local124 > 15000 && local131 > 15000) {
												Static268.anInt5350 = 250;
												Static5.method88(14500);
												Static175.aClass4_Sub24_Sub1_1.method3123(57);
											}
											if (Static226.aClass119_7 != null && Static226.aClass119_7.anInt3695 == 1) {
												if (Static226.aClass119_7.anObject4 != null) {
													Static181.method4698(Static81.aBoolean99, Static243.aString160);
												}
												Static243.aString160 = null;
												Static81.aBoolean99 = false;
												Static226.aClass119_7 = null;
											}
											Static225.anInt4534++;
											Static135.anInt2675++;
											if (Static135.anInt2675 > 500) {
												Static135.anInt2675 = 0;
												local1124 = (int) (Math.random() * 8.0D);
												if ((local1124 & 0x4) == 4) {
													Static259.anInt5087 += Static207.anInt2140;
												}
												if ((local1124 & 0x1) == 1) {
													Static280.anInt5488 += Static278.anInt5388;
												}
												if ((local1124 & 0x2) == 2) {
													Static127.anInt2549 += Static33.anInt662;
												}
											}
											if (Static127.anInt2549 < -55) {
												Static33.anInt662 = 2;
											}
											if (Static127.anInt2549 > 55) {
												Static33.anInt662 = -2;
											}
											if (Static225.anInt4534 > 500) {
												local1124 = (int) (Math.random() * 8.0D);
												if ((local1124 & 0x2) == 2) {
													Static161.anInt3301 += Static38.anInt738;
												}
												Static225.anInt4534 = 0;
												if ((local1124 & 0x1) == 1) {
													Static234.anInt4655 += Static232.anInt4646;
												}
											}
											if (Static161.anInt3301 < -20) {
												Static38.anInt738 = 1;
											}
											if (Static234.anInt4655 < -60) {
												Static232.anInt4646 = 2;
											}
											if (Static259.anInt5087 < -40) {
												Static207.anInt2140 = 1;
											}
											if (Static161.anInt3301 > 10) {
												Static38.anInt738 = -1;
											}
											if (Static259.anInt5087 > 40) {
												Static207.anInt2140 = -1;
											}
											Static126.anInt2531++;
											if (Static234.anInt4655 > 60) {
												Static232.anInt4646 = -2;
											}
											if (Static280.anInt5488 < -50) {
												Static278.anInt5388 = 2;
											}
											if (Static280.anInt5488 > 50) {
												Static278.anInt5388 = -2;
											}
											if (Static126.anInt2531 > 50) {
												Static175.aClass4_Sub24_Sub1_1.method3123(188);
											}
											if (Static5.aBoolean8) {
												Static264.method4177();
												Static5.aBoolean8 = false;
											}
											try {
												if (Static261.aClass91_3 != null && Static175.aClass4_Sub24_Sub1_1.anInt3822 > 0) {
													Static261.aClass91_3.method2303(Static175.aClass4_Sub24_Sub1_1.anInt3822, Static175.aClass4_Sub24_Sub1_1.aByteArray47);
													Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
													Static126.anInt2531 = 0;
												}
											} catch (@Pc(2290) IOException local2290) {
												Static63.method1164();
											}
											return;
										}
										local1578 = local1572.aClass97_15;
										if (local1578.anInt3146 < 0) {
											break;
										}
										local1590 = Static148.method2340(local1578.anInt3165);
									} while (local1590 == null || local1590.aClass97Array1 == null || local1590.aClass97Array1.length <= local1578.anInt3146 || local1578 != local1590.aClass97Array1[local1578.anInt3146]);
									Static145.method4497(local1572);
								}
							}
							local1578 = local1572.aClass97_15;
							if (local1578.anInt3146 < 0) {
								break;
							}
							local1590 = Static148.method2340(local1578.anInt3165);
						} while (local1590 == null || local1590.aClass97Array1 == null || local1578.anInt3146 >= local1590.aClass97Array1.length || local1590.aClass97Array1[local1578.anInt3146] != local1578);
						Static145.method4497(local1572);
					}
				}
				local1578 = local1572.aClass97_15;
				if (local1578.anInt3146 < 0) {
					break;
				}
				local1590 = Static148.method2340(local1578.anInt3165);
			} while (local1590 == null || local1590.aClass97Array1 == null || local1578.anInt3146 >= local1590.aClass97Array1.length || local1590.aClass97Array1[local1578.anInt3146] != local1578);
			Static145.method4497(local1572);
		}
	}
}
