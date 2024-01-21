import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!e", name = "D", descriptor = "Lclient!eh;")
	public static Class28 aClass28_46;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_330 = Static181.method2795(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!e", name = "y", descriptor = "I")
	public static final int anInt996 = 50;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_331 = Static181.method2795("<img=0>");

	@OriginalMember(owner = "client!e", name = "U", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_333 = Static181.method2795(" seconds)3");

	@OriginalMember(owner = "client!e", name = "A", descriptor = "Lclient!qe;")
	public static Class83 aClass83_332 = aClass83_333;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "Lclient!td;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!e", name = "N", descriptor = "I")
	public static int anInt1002 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
	public static void method784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static213.anInt4243++;
		Static49.method970(true);
		Static193.method2903(true);
		Static49.method970(false);
		Static193.method2903(false);
		Static85.method1506();
		Static27.method1108();
		@Pc(37) int local37;
		@Pc(35) int local35;
		if (!Static97.aBoolean106) {
			local35 = Static171.anInt3530 + Static210.anInt4184 & 0x7FF;
			local37 = Static153.anInt3302;
			if (local37 < Static110.anInt2550 / 256) {
				local37 = Static110.anInt2550 / 256;
			}
			if (Static216.aBooleanArray30[4] && Static11.anIntArray21[4] + 128 > local37) {
				local37 = Static11.anIntArray21[4] + 128;
			}
			Static212.method3225(Static208.anInt4121, local37, Static177.method2711(Static54.aClass24_Sub4_Sub1_1.anInt3316, Static43.anInt1126, Static54.aClass24_Sub4_Sub1_1.anInt3349) - 50, arg1, local35, local37 * 3 + 600, Static204.anInt4028);
		}
		if (Static97.aBoolean106) {
			local37 = Static103.method1811();
		} else {
			local37 = Static30.method646();
		}
		local35 = Static21.anInt567;
		@Pc(110) int local110 = Static174.anInt3596;
		@Pc(112) int local112 = Static199.anInt3952;
		@Pc(114) int local114 = Static18.anInt2017;
		@Pc(116) int local116 = Static54.anInt1360;
		@Pc(160) int local160;
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (Static216.aBooleanArray30[local118]) {
				local160 = (int) ((double) -Static127.anIntArray280[local118] + Math.random() * (double) (Static127.anIntArray280[local118] * 2 + 1) + Math.sin((double) Static62.anIntArray124[local118] * ((double) Static82.anIntArray175[local118] / 100.0D)) * (double) Static11.anIntArray21[local118]);
				if (local118 == 0) {
					Static21.anInt567 += local160;
				}
				if (local118 == 1) {
					Static199.anInt3952 += local160;
				}
				if (local118 == 4) {
					Static18.anInt2017 += local160;
					if (Static18.anInt2017 < 128) {
						Static18.anInt2017 = 128;
					}
					if (Static18.anInt2017 > 383) {
						Static18.anInt2017 = 383;
					}
				}
				if (local118 == 2) {
					Static174.anInt3596 += local160;
				}
				if (local118 == 3) {
					Static54.anInt1360 = local160 + Static54.anInt1360 & 0x7FF;
				}
			}
		}
		Static126.method2119(arg3, arg2, arg3 + arg0, arg1 + arg2);
		Static24.method464();
		local160 = Static4.anInt95;
		@Pc(236) int local236 = Static121.anInt2740;
		if (local160 >= arg3 && local160 < arg0 + arg3 && arg2 <= local236 && arg2 + arg1 > local236) {
			@Pc(272) int local272 = Static17.anInt498;
			@Pc(274) int local274 = Static120.anInt2732;
			Static59.anInt1451 = (Static4.anInt95 - arg3) * (local274 - local272) / arg0 + local272;
			aBoolean54 = true;
			@Pc(292) int local292 = Static96.anInt2067;
			Static44.anInt1173 = 0;
			@Pc(296) int local296 = Static106.anInt2443;
			Static6.anInt175 = (Static121.anInt2740 - arg2) * (local296 - local292) / arg1 + local292;
		} else {
			Static44.anInt1173 = 0;
			aBoolean54 = false;
		}
		Static192.method2892();
		Static126.method2138(arg3, arg2, arg0, arg1, 0);
		Static62.method1182(Static21.anInt567, Static199.anInt3952, Static174.anInt3596, Static18.anInt2017, Static54.anInt1360, local37);
		Static192.method2892();
		Static133.method2203();
		Static116.method2047(arg0, arg3, arg2, arg1);
		Static96.method1644(arg2, arg3, arg1, arg0);
		((Class39) Static24.anInterface3_1).method1298(Static57.anInt1427);
		Static102.method1756(arg3, arg1, arg2, arg0);
		Static174.anInt3596 = local110;
		Static54.anInt1360 = local116;
		Static18.anInt2017 = local114;
		Static21.anInt567 = local35;
		Static199.anInt3952 = local112;
		if (Static38.aBoolean53 && Static108.method1875() == 0) {
			Static38.aBoolean53 = false;
		}
		if (Static38.aBoolean53) {
			Static126.method2138(arg3, arg2, arg0, arg1, 0);
			Static142.method2281(false, Static29.aClass83_217);
		}
		if (!Static38.aBoolean53 && !Static159.aBoolean152 && arg3 <= local160 && local160 < arg0 + arg3 && arg2 <= local236 && local236 < arg1 + arg2) {
			Static35.method723(arg2, local160, local236, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)Lclient!qe;")
	public static Class83 method785(@OriginalArg(1) int arg0) {
		return Static37.method756(arg0, true);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lclient!je;")
	public static Class2_Sub1 method786(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub1_Sub5();
		} else if (arg0 == 1) {
			return new Class2_Sub1_Sub36();
		} else if (arg0 == 2) {
			return new Class2_Sub1_Sub8();
		} else if (arg0 == 3) {
			return new Class2_Sub1_Sub17();
		} else if (arg0 == 4) {
			return new Class2_Sub1_Sub14();
		} else if (arg0 == 5) {
			return new Class2_Sub1_Sub6();
		} else if (arg0 == 6) {
			return new Class2_Sub1_Sub1();
		} else if (arg0 == 7) {
			return new Class2_Sub1_Sub15();
		} else if (arg0 == 8) {
			return new Class2_Sub1_Sub27();
		} else if (arg0 == 9) {
			return new Class2_Sub1_Sub38();
		} else if (arg0 == 10) {
			return new Class2_Sub1_Sub33();
		} else if (arg0 == 11) {
			return new Class2_Sub1_Sub35();
		} else if (arg0 == 12) {
			return new Class2_Sub1_Sub11();
		} else if (arg0 == 13) {
			return new Class2_Sub1_Sub23();
		} else if (arg0 == 14) {
			return new Class2_Sub1_Sub29();
		} else if (arg0 == 15) {
			return new Class2_Sub1_Sub21();
		} else if (arg0 == 16) {
			return new Class2_Sub1_Sub19();
		} else if (arg0 == 17) {
			return new Class2_Sub1_Sub10();
		} else if (arg0 == 18) {
			return new Class2_Sub1_Sub9_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub1_Sub12();
		} else if (arg0 == 20) {
			return new Class2_Sub1_Sub16();
		} else if (arg0 == 21) {
			return new Class2_Sub1_Sub34();
		} else if (arg0 == 22) {
			return new Class2_Sub1_Sub20();
		} else if (arg0 == 23) {
			return new Class2_Sub1_Sub24();
		} else if (arg0 == 24) {
			return new Class2_Sub1_Sub2();
		} else if (arg0 == 25) {
			return new Class2_Sub1_Sub39();
		} else if (arg0 == 26) {
			return new Class2_Sub1_Sub37();
		} else if (arg0 == 27) {
			return new Class2_Sub1_Sub30();
		} else if (arg0 == 28) {
			return new Class2_Sub1_Sub13();
		} else if (arg0 == 29) {
			return new Class2_Sub1_Sub25();
		} else if (arg0 == 30) {
			return new Class2_Sub1_Sub32();
		} else if (arg0 == 31) {
			return new Class2_Sub1_Sub3();
		} else if (arg0 == 32) {
			return new Class2_Sub1_Sub18();
		} else if (arg0 == 33) {
			return new Class2_Sub1_Sub26();
		} else if (arg0 == 34) {
			return new Class2_Sub1_Sub4();
		} else if (arg0 == 35) {
			return new Class2_Sub1_Sub28();
		} else if (arg0 == 36) {
			return new Class2_Sub1_Sub31();
		} else if (arg0 == 37) {
			return new Class2_Sub1_Sub22();
		} else if (arg0 == 38) {
			return new Class2_Sub1_Sub7();
		} else if (arg0 == 39) {
			return new Class2_Sub1_Sub9();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(JB)V")
	public static void method788(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static69.aClass2_Sub3_Sub1_2.method284(74);
			Static69.aClass2_Sub3_Sub1_2.method249(arg0);
		}
	}
}
