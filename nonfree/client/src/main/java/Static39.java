import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "[Lclient!ec;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "[I")
	public static int[] anIntArray174;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!r;")
	private static Class61 aClass61_314 = Static129.method2060("World");

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_312 = aClass61_314;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!r;")
	private static Class61 aClass61_313 = Static129.method2060("Please use a different world)3");

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_315 = aClass61_313;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!r;")
	public static Class61 aClass61_316 = aClass61_313;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_317 = Static129.method2060("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!r;")
	public static Class61 aClass61_318 = aClass61_314;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "[I")
	public static int[] anIntArray173 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Lclient!r;")
	public static Class61 aClass61_319 = Static129.method2060("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Lclient!r;")
	public static Class61 method730(@OriginalArg(0) int arg0) {
		return Static118.method1890(arg0, false);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ff;Lclient!r;Lclient!r;IIZ)V")
	public static void method731(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class61 arg1, @OriginalArg(3) Class61 arg2) {
		@Pc(8) int local8 = arg0.method1044(arg2);
		@Pc(14) int local14 = arg0.method1039(arg1, local8);
		Static62.method1069(arg0, 255, local14, local8);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method732() {
		aClass61_319 = null;
		aClass18Array1 = null;
		anIntArray173 = null;
		aClass61_314 = null;
		aClass61_312 = null;
		aClass61_316 = null;
		anIntArray174 = null;
		aClass61_317 = null;
		aClass61_318 = null;
		aClass61_313 = null;
		aClass61_315 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
	public static Object method733(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static63.aBoolean59) {
			try {
				@Pc(25) Class4 local25 = (Class4) Class.forName("Class4_Sub1").getDeclaredConstructor().newInstance();
				local25.method1682(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static63.aBoolean59 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
	public static void method734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static46.method1989(arg3, arg1, arg0 + arg3, arg2 + arg1);
		Static51.method935();
		Static134.anInt3404++;
		Static10.method186(true);
		Static23.method495(true);
		Static10.method186(false);
		Static23.method495(false);
		Static103.method1748();
		Static50.method889();
		@Pc(47) int local47;
		@Pc(45) int local45;
		if (!Static22.aBoolean22) {
			local45 = Static85.anInt2314 + Static91.anInt2422 & 0x7FF;
			local47 = Static57.anInt1420;
			if (local47 < Static60.anInt1459 / 256) {
				local47 = Static60.anInt1459 / 256;
			}
			if (Static96.aBooleanArray12[4] && Static76.anIntArray268[4] + 128 > local47) {
				local47 = Static76.anIntArray268[4] + 128;
			}
			Static48.method878(local47, local45, Static100.anInt2586, local47 * 3 + 600, Static42.method757(Static93.anInt2428, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912, Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875) + -50, Static133.anInt3398);
		}
		if (Static22.aBoolean22) {
			local47 = Static13.method275();
		} else {
			local47 = Static64.method1762();
		}
		@Pc(110) int local110 = Static40.anInt1074;
		@Pc(112) int local112 = Static1.anInt15;
		@Pc(114) int local114 = Static78.anInt1986;
		local45 = Static22.anInt683;
		@Pc(118) int local118 = Static78.anInt1985;
		@Pc(162) int local162;
		for (@Pc(120) int local120 = 0; local120 < 5; local120++) {
			if (Static96.aBooleanArray12[local120]) {
				local162 = (int) ((double) -Static41.anIntArray291[local120] + (double) (Static41.anIntArray291[local120] * 2 + 1) * Math.random() + Math.sin((double) Static67.anIntArray248[local120] / 100.0D * (double) Static32.anIntArray152[local120]) * (double) Static76.anIntArray268[local120]);
				if (local120 == 2) {
					Static40.anInt1074 += local162;
				}
				if (local120 == 1) {
					Static78.anInt1986 += local162;
				}
				if (local120 == 0) {
					Static22.anInt683 += local162;
				}
				if (local120 == 3) {
					Static1.anInt15 = Static1.anInt15 + local162 & 0x7FF;
				}
				if (local120 == 4) {
					Static78.anInt1985 += local162;
					if (Static78.anInt1985 < 128) {
						Static78.anInt1985 = 128;
					}
					if (Static78.anInt1985 > 383) {
						Static78.anInt1985 = 383;
					}
				}
			}
		}
		local162 = Static30.anInt917;
		@Pc(222) int local222 = Static40.anInt1073;
		if (local162 >= arg3 && arg0 + arg3 > local162 && arg1 <= local222 && local222 < arg1 + arg2) {
			Static131.anInt3327 = 0;
			Static131.anInt3328 = Static30.anInt917 - arg3;
			Static131.anInt3330 = Static40.anInt1073 - arg1;
			Static131.aBoolean121 = true;
		} else {
			Static131.aBoolean121 = false;
			Static131.anInt3327 = 0;
		}
		Static48.method879();
		Static46.method2001(arg3, arg1, arg0, arg2, 0);
		Static48.method879();
		Static61.aClass81_1.method2092(Static22.anInt683, Static78.anInt1986, Static40.anInt1074, Static78.anInt1985, Static1.anInt15, local47);
		Static48.method879();
		Static61.aClass81_1.method2116();
		Static56.method1004(arg1, arg3, arg0, arg2);
		Static54.method991(arg3, arg1);
		((Class46) Static51.anInterface1_1).method1161(Static8.anInt198);
		Static74.method1194(arg3, arg0, arg2, arg1);
		Static78.anInt1985 = local118;
		Static40.anInt1074 = local110;
		Static78.anInt1986 = local114;
		Static1.anInt15 = local112;
		Static22.anInt683 = local45;
		if (Static40.aBoolean33 && Static49.method884() == 0) {
			Static40.aBoolean33 = false;
		}
		if (Static40.aBoolean33) {
			Static46.method2001(arg3, arg1, arg0, arg2, 0);
			Static32.method651(Static17.aClass61_165, false);
		}
		if (!Static40.aBoolean33 && !Static117.aBoolean105 && arg3 <= local162 && local162 < arg3 + arg0 && arg1 <= local222 && arg1 + arg2 > local222) {
			Static109.method1811(local162, arg1, arg3, local222);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BZI)Lclient!r;")
	public static Class61 method735(@OriginalArg(2) int arg0) {
		return Static118.method1890(arg0, true);
	}
}
