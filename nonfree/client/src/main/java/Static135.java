import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] aClass1_Sub2_Sub8_Sub3Array16;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] aClass1_Sub2_Sub8_Sub3Array17;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	public static int anInt2989 = 0;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
	public static final int[] anIntArray244 = new int[256];

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "[J")
	public static final long[] aLongArray25 = new long[100];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIZ)V")
	public static void method2292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static39.anInt1032++;
		Static121.method2047(true);
		Static9.method229(true);
		Static121.method2047(false);
		Static9.method229(false);
		Static146.method2431();
		Static156.method2653();
		@Pc(29) int local29;
		@Pc(61) int local61;
		if (!Static78.aBoolean92) {
			local29 = Static57.anInt1425;
			if (local29 < Static100.anInt2253 / 256) {
				local29 = Static100.anInt2253 / 256;
			}
			if (Static27.aBooleanArray6[4] && local29 < Static35.anIntArray361[4] + 128) {
				local29 = Static35.anIntArray361[4] + 128;
			}
			local61 = Static66.anInt1655 + Static28.anInt732 & 0x7FF;
			Static63.method1282(local29, arg1, Static159.anInt3548, local29 * 3 + 600, Static89.anInt2083, Static37.method699(Static87.aClass5_Sub2_Sub1_1.anInt2448, Static170.anInt3799, Static87.aClass5_Sub2_Sub1_1.anInt2501) - 50, local61);
		}
		if (Static78.aBoolean92) {
			local29 = Static193.method3307();
		} else {
			local29 = Static174.method2998();
		}
		local61 = Static146.anInt3111;
		@Pc(97) int local97 = Static92.anInt2140;
		@Pc(99) int local99 = Static32.anInt875;
		@Pc(101) int local101 = Static175.anInt3914;
		@Pc(103) int local103 = Static35.anInt4158;
		@Pc(147) int local147;
		for (@Pc(105) int local105 = 0; local105 < 5; local105++) {
			if (Static27.aBooleanArray6[local105]) {
				local147 = (int) ((double) -Static130.anIntArray238[local105] + Math.random() * (double) (Static130.anIntArray238[local105] * 2 + 1) + Math.sin((double) Static87.anIntArray178[local105] / 100.0D * (double) Static40.anIntArray92[local105]) * (double) Static35.anIntArray361[local105]);
				if (local105 == 0) {
					Static146.anInt3111 += local147;
				}
				if (local105 == 2) {
					Static92.anInt2140 += local147;
				}
				if (local105 == 1) {
					Static32.anInt875 += local147;
				}
				if (local105 == 3) {
					Static35.anInt4158 = Static35.anInt4158 + local147 & 0x7FF;
				}
				if (local105 == 4) {
					Static175.anInt3914 += local147;
					if (Static175.anInt3914 < 128) {
						Static175.anInt3914 = 128;
					}
					if (Static175.anInt3914 > 383) {
						Static175.anInt3914 = 383;
					}
				}
			}
		}
		Static90.method3501(arg3, arg0, arg3 + arg2, arg1 + arg0);
		Static182.method3156();
		@Pc(220) int local220 = Static7.anInt174;
		local147 = Static24.anInt661;
		if (local147 >= arg3 && local147 < arg3 + arg2 && local220 >= arg0 && arg0 + arg1 > local220) {
			Static54.aBoolean178 = true;
			@Pc(254) int local254 = Static55.anInt1374;
			Static168.anInt3728 = 0;
			@Pc(258) int local258 = Static105.anInt2371;
			@Pc(260) int local260 = Static140.anInt3139;
			Static64.anInt1643 = (Static24.anInt661 - arg3) * (local260 - local254) / arg2 + local254;
			@Pc(275) int local275 = Static172.anInt3846;
			Static99.anInt2232 = (local275 - local258) * (Static7.anInt174 - arg0) / arg1 + local258;
		} else {
			Static54.aBoolean178 = false;
			Static168.anInt3728 = 0;
		}
		Static67.method1334();
		Static90.method3482(arg3, arg0, arg2, arg1, 0);
		Static102.method1757(Static146.anInt3111, Static32.anInt875, Static92.anInt2140, Static175.anInt3914, Static35.anInt4158, local29);
		Static67.method1334();
		Static69.method1340();
		Static80.method1485(arg3, arg0, arg2, arg1);
		Static38.method725(arg2, arg1, arg3, arg0);
		((Class36) Static182.anInterface2_2).method1330(Static92.anInt2138);
		Static39.method727(arg1, arg3, arg2, arg0);
		Static92.anInt2140 = local97;
		Static146.anInt3111 = local61;
		Static35.anInt4158 = local103;
		Static175.anInt3914 = local101;
		Static32.anInt875 = local99;
		if (Static156.aBoolean160 && Static170.method2923() == 0) {
			Static156.aBoolean160 = false;
		}
		if (Static156.aBoolean160) {
			Static90.method3482(arg3, arg0, arg2, arg1, 0);
			Static132.method2262(false, Static150.aClass24_988);
		}
		if (!Static156.aBoolean160 && !Static53.aBoolean73 && arg3 <= local147 && arg2 + arg3 > local147 && arg0 <= local220 && arg0 + arg1 > local220) {
			Static178.method3043(arg0, local220, arg2, arg3, arg1, local147);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	public static void method2294(@OriginalArg(0) int arg0) {
		@Pc(5) Class73 local5 = Static107.aClass73_1;
		synchronized (Static107.aClass73_1) {
			Static27.anInt724 = arg0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)I")
	public static int method2295(@OriginalArg(1) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lclient!tb;")
	public static Class1_Sub2_Sub21 method2296(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub21 local10 = (Class1_Sub2_Sub21) Static94.aClass86_34.method2816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static60.aClass69_32.method2208(Static42.method796(arg0), Static134.method2286(arg0));
		local10 = new Class1_Sub2_Sub21();
		local10.anInt3946 = arg0;
		if (local24 != null) {
			local10.method3045(new Class1_Sub7(local24));
		}
		local10.method3041();
		Static94.aClass86_34.method2821(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!ld;IBIII)V")
	public static void method2297(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		Static146.method2416(arg1.anInt2501, arg2, arg0, arg3, arg1.anInt2448);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method2298() {
		if (Static29.aDouble1 > Static178.aDouble11) {
			Static178.aDouble11 += Static178.aDouble11 / 30.0D;
			if (Static29.aDouble1 < Static178.aDouble11) {
				Static178.aDouble11 = Static29.aDouble1;
			}
			Static137.method2410();
		} else if (Static29.aDouble1 < Static178.aDouble11) {
			Static178.aDouble11 -= Static178.aDouble11 / 30.0D;
			if (Static178.aDouble11 < Static29.aDouble1) {
				Static178.aDouble11 = Static29.aDouble1;
			}
			Static137.method2410();
		}
		if (Static70.anInt3208 == -1 || Static49.anInt1247 == -1) {
			return;
		}
		@Pc(58) int local58 = Static70.anInt3208 - Static2.anInt111;
		if (local58 < 2 || local58 > 2) {
			local58 >>= 0x4;
		}
		Static2.anInt111 += local58;
		@Pc(77) int local77 = Static49.anInt1247 - Static3.anInt118;
		if (local77 < 2 || local77 > 2) {
			local77 >>= 0x4;
		}
		Static3.anInt118 += local77;
		if (local58 == 0 && local77 == 0) {
			Static70.anInt3208 = -1;
			Static49.anInt1247 = -1;
		}
		Static137.method2410();
	}
}
