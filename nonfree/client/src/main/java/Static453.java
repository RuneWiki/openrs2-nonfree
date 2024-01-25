import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "F")
	public static float aFloat182;

	@OriginalMember(owner = "client!qg", name = "D", descriptor = "[Lclient!rr;")
	public static Class15_Sub1[] aClass15_Sub1Array5;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
	public static int anInt8320 = 0;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
	public static int anInt8322 = -1;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BIIIIII)Z")
	public static boolean method6873(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static307.aBoolean442 || !Static350.aBoolean469) {
			return false;
		} else if (Static359.anInt6889 < 100) {
			return false;
		} else {
			@Pc(38) int local38;
			@Pc(42) int local42;
			if (arg5 != arg0 || arg2 != arg3) {
				for (local38 = arg0; local38 <= arg5; local38++) {
					for (local42 = arg3; local42 <= arg2; local42++) {
						if (-Static609.anInt9847 == Static275.anIntArrayArrayArray9[arg1][local38][local42]) {
							return false;
						}
					}
				}
				local42 = (arg0 << Static172.anInt4156) + 1;
				@Pc(122) int local122 = (arg3 << Static172.anInt4156) + 2;
				if (Static591.method8163(arg4, Static572.anInt9827 * (arg5 + 1 - arg0), local122, local42, Static34.aClass86Array5[arg1].method8086(arg3, arg0), Static572.anInt9827 * (arg2 + 1 - arg3))) {
					Static36.anInt1451++;
					return true;
				} else {
					return false;
				}
			} else if (Static109.method2472(arg0, arg3, arg1)) {
				local38 = arg0 << Static172.anInt4156;
				local42 = arg3 << Static172.anInt4156;
				if (Static591.method8163(arg4, Static572.anInt9827, local42, local38, Static34.aClass86Array5[arg1].method8086(arg3, arg0), Static572.anInt9827)) {
					Static36.anInt1451++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!gh;ILjava/lang/String;ZZ)V")
	public static void method6874(@OriginalArg(0) Class118 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg2) {
			Static337.method5440(arg1, 3, arg0);
			return;
		}
		@Pc(26) String local26;
		if (Static175.aString46.startsWith("win") && arg0.aBoolean302) {
			local26 = null;
			if (Static152.anApplet1 != null) {
				local26 = Static152.anApplet1.getParameter("haveie6");
			}
			if (local26 == null || !local26.equals("1")) {
				@Pc(44) Class301 local44 = Static337.method5440(arg1, 0, arg0);
				Static213.aString60 = arg1;
				Static269.aClass118_2 = arg0;
				Static493.aClass301_6 = local44;
				return;
			}
		}
		if (Static175.aString46.startsWith("mac")) {
			local26 = null;
			if (Static152.anApplet1 != null) {
				local26 = Static152.anApplet1.getParameter("havefirefox");
			}
			if (local26 != null && local26.equals("1") && arg3) {
				Static337.method5440(arg1, 1, arg0);
				return;
			}
		}
		Static337.method5440(arg1, 2, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lclient!qt;")
	public static Class8_Sub2 method6876(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class8_Sub2_Sub6();
		} else if (arg0 == 1) {
			return new Class8_Sub2_Sub28();
		} else if (arg0 == 2) {
			return new Class8_Sub2_Sub13();
		} else if (arg0 == 3) {
			return new Class8_Sub2_Sub37();
		} else if (arg0 == 4) {
			return new Class8_Sub2_Sub31();
		} else if (arg0 == 5) {
			return new Class8_Sub2_Sub15();
		} else if (arg0 == 6) {
			return new Class8_Sub2_Sub19();
		} else if (arg0 == 7) {
			return new Class8_Sub2_Sub35();
		} else if (arg0 == 8) {
			return new Class8_Sub2_Sub25();
		} else if (arg0 == 9) {
			return new Class8_Sub2_Sub22();
		} else if (arg0 == 10) {
			return new Class8_Sub2_Sub1();
		} else if (arg0 == 11) {
			return new Class8_Sub2_Sub30();
		} else if (arg0 == 12) {
			return new Class8_Sub2_Sub7();
		} else if (arg0 == 13) {
			return new Class8_Sub2_Sub39();
		} else if (arg0 == 14) {
			return new Class8_Sub2_Sub27();
		} else if (arg0 == 15) {
			return new Class8_Sub2_Sub33();
		} else if (arg0 == 16) {
			return new Class8_Sub2_Sub18();
		} else if (arg0 == 17) {
			return new Class8_Sub2_Sub2();
		} else if (arg0 == 18) {
			return new Class8_Sub2_Sub24_Sub1();
		} else if (arg0 == 19) {
			return new Class8_Sub2_Sub38();
		} else if (arg0 == 20) {
			return new Class8_Sub2_Sub32();
		} else if (arg0 == 21) {
			return new Class8_Sub2_Sub34();
		} else if (arg0 == 22) {
			return new Class8_Sub2_Sub14();
		} else if (arg0 == 23) {
			return new Class8_Sub2_Sub3();
		} else if (arg0 == 24) {
			return new Class8_Sub2_Sub8();
		} else if (arg0 == 25) {
			return new Class8_Sub2_Sub16();
		} else if (arg0 == 26) {
			return new Class8_Sub2_Sub9();
		} else if (arg0 == 27) {
			return new Class8_Sub2_Sub5();
		} else if (arg0 == 28) {
			return new Class8_Sub2_Sub10();
		} else if (arg0 == 29) {
			return new Class8_Sub2_Sub11();
		} else if (arg0 == 30) {
			return new Class8_Sub2_Sub12();
		} else if (arg0 == 31) {
			return new Class8_Sub2_Sub23();
		} else if (arg0 == 32) {
			return new Class8_Sub2_Sub29();
		} else if (arg0 == 33) {
			return new Class8_Sub2_Sub17();
		} else if (arg0 == 34) {
			return new Class8_Sub2_Sub20();
		} else if (arg0 == 35) {
			return new Class8_Sub2_Sub36();
		} else if (arg0 == 36) {
			return new Class8_Sub2_Sub26();
		} else if (arg0 == 37) {
			return new Class8_Sub2_Sub21();
		} else if (arg0 == 38) {
			return new Class8_Sub2_Sub4();
		} else if (arg0 == 39) {
			return new Class8_Sub2_Sub24();
		} else {
			return null;
		}
	}
}
