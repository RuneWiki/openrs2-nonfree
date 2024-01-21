import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!re", name = "K", descriptor = "I")
	public static int anInt3600;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	public static int anInt3589 = -1;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1239 = Static161.method2971("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	public static int anInt3590 = 0;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "Z")
	public static boolean aBoolean278 = false;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!re", name = "F", descriptor = "I")
	public static int anInt3596 = 0;

	@OriginalMember(owner = "client!re", name = "I", descriptor = "I")
	public static int anInt3599 = 0;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIII)I")
	public static int method2590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!gi;)V")
	public static void method2591(@OriginalArg(1) Class1_Sub2_Sub2_Sub2 arg0) {
		if (arg0.anInt2577 == 0) {
			return;
		}
		@Pc(33) int local33;
		@Pc(40) int local40;
		if (arg0.anInt2575 != -1 && arg0.anInt2575 < 32768) {
			@Pc(25) Class1_Sub2_Sub2_Sub2_Sub1 local25 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[arg0.anInt2575];
			if (local25 != null) {
				local33 = arg0.anInt2596 - local25.anInt2596;
				local40 = arg0.anInt2606 - local25.anInt2606;
				if (local33 != 0 || local40 != 0) {
					arg0.anInt2555 = (int) (Math.atan2((double) local33, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(71) int local71;
		if (arg0.anInt2575 >= 32768) {
			local71 = arg0.anInt2575 - 32768;
			if (local71 == Static26.anInt947) {
				local71 = 2047;
			}
			@Pc(84) Class1_Sub2_Sub2_Sub2_Sub2 local84 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local71];
			if (local84 != null) {
				local40 = arg0.anInt2596 - local84.anInt2596;
				@Pc(99) int local99 = arg0.anInt2606 - local84.anInt2606;
				if (local40 != 0 || local99 != 0) {
					arg0.anInt2555 = (int) (Math.atan2((double) local40, (double) local99) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2591 != 0 || arg0.anInt2565 != 0) && (arg0.anInt2586 == 0 || arg0.anInt2559 > 0)) {
			local71 = arg0.anInt2596 - (arg0.anInt2591 - Static153.anInt3629 - Static153.anInt3629) * 64;
			local33 = arg0.anInt2606 - (arg0.anInt2565 - Static60.anInt1864 - Static60.anInt1864) * 64;
			if (local71 != 0 || local33 != 0) {
				arg0.anInt2555 = (int) (Math.atan2((double) local71, (double) local33) * 325.949D) & 0x7FF;
			}
			arg0.anInt2591 = 0;
			arg0.anInt2565 = 0;
		}
		local71 = arg0.anInt2555 - arg0.anInt2560 & 0x7FF;
		if (local71 == 0) {
			arg0.anInt2554 = 0;
			return;
		}
		arg0.anInt2554++;
		@Pc(234) boolean local234;
		if (local71 <= 1024) {
			arg0.anInt2560 += arg0.anInt2577;
			local234 = true;
			if (local71 < arg0.anInt2577 || local71 > 2048 - arg0.anInt2577) {
				arg0.anInt2560 = arg0.anInt2555;
				local234 = false;
			}
			if (arg0.anInt2584 == arg0.anInt2593 && (arg0.anInt2554 > 25 || local234)) {
				if (arg0.anInt2574 == -1) {
					arg0.anInt2593 = arg0.anInt2550;
				} else {
					arg0.anInt2593 = arg0.anInt2574;
				}
			}
		} else {
			arg0.anInt2560 -= arg0.anInt2577;
			local234 = true;
			if (local71 < arg0.anInt2577 || local71 > 2048 - arg0.anInt2577) {
				arg0.anInt2560 = arg0.anInt2555;
				local234 = false;
			}
			if (arg0.anInt2584 == arg0.anInt2593 && (arg0.anInt2554 > 25 || local234)) {
				if (arg0.anInt2561 == -1) {
					arg0.anInt2593 = arg0.anInt2550;
				} else {
					arg0.anInt2593 = arg0.anInt2561;
				}
			}
		}
		arg0.anInt2560 &= 0x7FF;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	public static void method2592() {
		Static179.anInt4046 = -1;
		Static102.anInt2843 = -1;
		Static23.anInt1010 = 0;
		Static50.anInt1636 = 2;
		Static48.anInt1535 = 1;
		Static115.aClass4_74 = null;
		Static171.aBoolean308 = false;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
	public static void method2595() {
		aCRC32_2 = null;
		aClass13_1239 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(JB)V")
	public static void method2596(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static21.anInt784 >= 100 && Static14.anInt485 != 1 || Static21.anInt784 >= 200) {
			Static169.method2887(Static16.aClass13_253, Static170.aClass13_1314, 0);
			return;
		}
		@Pc(35) Class13 local35 = Static43.method1141(arg0).method903();
		for (@Pc(37) int local37 = 0; local37 < Static21.anInt784; local37++) {
			if (Static149.aLongArray8[local37] == arg0) {
				Static169.method2887(Static16.aClass13_253, Static57.method1349(new Class13[] { local35, Static85.aClass13_808 }), 0);
				return;
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static124.anInt3220; local72++) {
			if (arg0 == Static5.aLongArray1[local72]) {
				Static169.method2887(Static16.aClass13_253, Static57.method1349(new Class13[] { Static14.aClass13_212, local35, Static38.aClass13_425 }), 0);
				return;
			}
		}
		if (local35.method889(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass13_847)) {
			Static169.method2887(Static16.aClass13_253, Static178.aClass13_1382, 0);
			return;
		}
		Static34.aClass13Array7[Static21.anInt784] = local35;
		Static149.aLongArray8[Static21.anInt784] = arg0;
		Static162.anIntArray427[Static21.anInt784] = 0;
		Static60.aClass13Array16[Static21.anInt784] = Static16.aClass13_253;
		Static39.anIntArray133[Static21.anInt784] = 0;
		Static21.anInt784++;
		Static88.anInt2490 = Static10.anInt388;
		Static1.aClass1_Sub8_Sub1_1.method1654(38);
		Static1.aClass1_Sub8_Sub1_1.method1625(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ae;ZLclient!ae;)V")
	public static void method2597(@OriginalArg(0) Class1_Sub2_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) Class1_Sub2_Sub1_Sub1_Sub1 arg1) {
		if (Static95.aBoolean208) {
			Static61.method1410(arg0, arg1);
			return;
		}
		if (Static2.anInt97 == 0 || Static2.anInt97 == 5) {
			arg0.method258(Static32.aClass13_1426, 382, 225, 16777215, -1);
			Static128.method554(230, 233, 304, 34, 9179409);
			Static128.method554(231, 234, 302, 32, 0);
			Static128.method565(232, 235, Static157.anInt3722 * 3, 30, 9179409);
			Static128.method565(Static157.anInt3722 * 3 + 232, 235, 300 - Static157.anInt3722 * 3, 30, 0);
			arg0.method258(Static122.aClass13_1060, 382, 256, 16777215, -1);
		}
		@Pc(108) short local108;
		@Pc(116) int local116;
		if (Static2.anInt97 == 20) {
			Static183.aClass1_Sub2_Sub1_Sub4_4.method570(382 - Static183.aClass1_Sub2_Sub1_Sub4_4.anInt514 / 2, 271 - Static183.aClass1_Sub2_Sub1_Sub4_4.anInt512 / 2);
			local108 = 211;
			arg0.method258(Static122.aClass13_1062, 382, 211, 16776960, 0);
			local116 = local108 + 15;
			arg0.method258(Static122.aClass13_1061, 382, 226, 16776960, 0);
			@Pc(124) int local124 = local116 + 15;
			arg0.method258(Static122.aClass13_1067, 382, 241, 16776960, 0);
			@Pc(132) int local132 = local124 + 15;
			@Pc(133) int local133 = local132 + 10;
			arg0.method254(Static57.method1349(new Class13[] { Static88.aClass13_827, Static177.method241(Static122.aClass13_1057) }), 272, 266, 16777215, 0);
			@Pc(153) int local153 = local133 + 15;
			arg0.method254(Static57.method1349(new Class13[] { Static52.aClass13_585, Static122.aClass13_1065.method913() }), 274, 281, 16777215, 0);
			@Pc(174) int local174 = local153 + 15;
		}
		if (Static2.anInt97 == 10) {
			Static183.aClass1_Sub2_Sub1_Sub4_4.method570(202, 171);
			if (Static60.anInt1884 == 0) {
				local108 = 251;
				arg0.method258(Static48.aClass13_538, 382, 251, 16776960, 0);
				local116 = local108 + 30;
				Static80.aClass1_Sub2_Sub1_Sub4_3.method570(229, 271);
				arg0.method245(Static25.aClass13_307, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static80.aClass1_Sub2_Sub1_Sub4_3.method570(389, 271);
				arg0.method245(Static170.aClass13_1319, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static60.anInt1884 == 2) {
				local108 = 211;
				arg0.method258(Static122.aClass13_1062, 382, 211, 16776960, 0);
				local116 = local108 + 15;
				arg0.method258(Static122.aClass13_1061, 382, 226, 16776960, 0);
				local116 += 15;
				arg0.method258(Static122.aClass13_1067, 382, 241, 16776960, 0);
				@Pc(231) boolean local231;
				if (Static129.anInt3271 == 0 && Static78.anInt2168 % 40 < 20 && Static42.aBoolean96) {
					local231 = true;
				} else {
					local231 = false;
				}
				local116 += 15;
				local116 += 10;
				arg0.method254(Static57.method1349(new Class13[] { Static88.aClass13_827, Static177.method241(Static122.aClass13_1057), local231 ? Static85.aClass13_804 : Static122.aClass13_1063 }), 272, 266, 16777215, 0);
				if (Static129.anInt3271 == 1 && Static78.anInt2168 % 40 < 20 && Static42.aBoolean96) {
					local231 = true;
				} else {
					local231 = false;
				}
				local116 += 15;
				arg0.method254(Static57.method1349(new Class13[] { Static52.aClass13_585, Static122.aClass13_1065.method913(), local231 ? Static85.aClass13_804 : Static122.aClass13_1063 }), 274, 281, 16777215, 0);
				Static80.aClass1_Sub2_Sub1_Sub4_3.method570(229, 301);
				local116 += 15;
				arg0.method258(Static166.aClass13_1352, 302, 326, 16777215, 0);
				Static80.aClass1_Sub2_Sub1_Sub4_3.method570(389, 301);
				arg0.method258(Static133.aClass13_1125, 462, 326, 16777215, 0);
			} else if (Static60.anInt1884 == 3) {
				local108 = 236;
				arg0.method258(Static30.aClass13_361, 382, 211, 16776960, 0);
				arg0.method258(Static33.aClass13_390, 382, 236, 16777215, 0);
				local116 = local108 + 15;
				arg0.method258(Static178.aClass13_1388, 382, 251, 16777215, 0);
				local116 += 15;
				arg0.method258(Static29.aClass13_344, 382, 266, 16777215, 0);
				local116 += 15;
				arg0.method258(Static67.aClass13_671, 382, 281, 16777215, 0);
				local116 += 15;
				Static80.aClass1_Sub2_Sub1_Sub4_3.method570(309, 301);
				arg0.method258(Static133.aClass13_1125, 382, 326, 16777215, 0);
			}
		}
		if (Static58.anInt1836 != 1) {
			if (Static43.anInt1434 > 0) {
				Static141.method2528(Static43.anInt1434);
				Static43.anInt1434 = 0;
			}
			Static116.method2221();
		}
		Static182.aClass1_Sub2_Sub1_Sub4Array6[Static43.aBoolean100 ? 1 : 0].method570(725, 463);
		if (Static2.anInt97 <= 5 || Static159.anInt3758 == 2 || Static94.anInt2756 != 0) {
			return;
		}
		if (Static30.aClass1_Sub2_Sub1_Sub4_1 == null) {
			Static30.aClass1_Sub2_Sub1_Sub4_1 = Static138.method2473(Static98.anInt3737, Static69.aClass4_Sub1_25);
		}
		if (Static30.aClass1_Sub2_Sub1_Sub4_1 == null) {
			return;
		}
		Static30.aClass1_Sub2_Sub1_Sub4_1.method570(5, 463);
		arg0.method258(Static57.method1349(new Class13[] { Static130.aClass13_1103, Static112.aClass13_1016, Static3.method75(Static89.anInt2510) }), 55, 478, 16777215, 0);
		if (Static45.aClass3_1 == null) {
			arg1.method258(Static186.aClass13_1430, 55, 492, 16777215, 0);
		} else {
			arg1.method258(Static37.aClass13_421, 55, 492, 16777215, 0);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ag;Lclient!dd;Lclient!dd;Lclient!ag;I)Lclient!ae;")
	public static Class1_Sub2_Sub1_Sub1_Sub1 method2598(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) Class4 arg3) {
		@Pc(4) int local4 = arg3.method2241(arg2);
		@Pc(15) int local15 = arg3.method2255(local4, arg1);
		return Static28.method845(arg3, local15, local4, arg0);
	}
}
