import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] aClass2_Sub3_Sub2_Sub3Array10;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
	public static int anInt3833;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public static int anInt3838;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!lb;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt3830 = 0;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1138 = Static38.method685("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1139 = Static38.method685("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1140 = Static38.method685("<)4col>");

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1141 = Static38.method685(" )2>");

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
	public static int anInt3840 = 0;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1142 = Static38.method685(":clan:");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public static void method2605() {
		Static96.anInt2394 = 0;
		Static28.anInt732 = 0;
		Static42.method832();
		Static32.method595();
		Static49.method887();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static96.anInt2394; local22++) {
			local28 = Static36.anIntArray57[local22];
			if (Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local28].anInt2662 != Static107.anInt2559) {
				Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local28].aClass2_Sub3_Sub17_1 = null;
				Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local28] = null;
			}
		}
		if (Static64.aClass2_Sub13_Sub1_1.anInt2154 != Static139.anInt3252) {
			throw new RuntimeException("gnp1 pos:" + Static64.aClass2_Sub13_Sub1_1.anInt2154 + " psize:" + Static139.anInt3252);
		}
		for (local28 = 0; local28 < Static81.anInt1985; local28++) {
			if (Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[Static149.anIntArray312[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static81.anInt1985);
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lclient!eh;")
	public static Class2_Sub3_Sub6 method2609(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub3_Sub6 local6 = (Class2_Sub3_Sub6) Static82.aClass17_11.method505((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static109.aClass10_120.method1605(arg0, 6);
		local6 = new Class2_Sub3_Sub6();
		local6.anInt1216 = arg0;
		if (local20 != null) {
			local6.method751(new Class2_Sub13(local20));
		}
		local6.method745();
		if (local6.aBoolean44) {
			local6.anInt1192 = 0;
			local6.aBoolean48 = false;
		}
		Static82.aClass17_11.method508((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
	public static void method2610() {
		aClass6_1138 = null;
		aClass6_1141 = null;
		aClass6_1139 = null;
		aClass2_Sub3_Sub2_Sub3Array10 = null;
		aClass6_1140 = null;
		aClass50_1 = null;
		aClass6_1142 = null;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method2611() {
		Static142.aLong192 = 0L;
		Static153.anInt3527 = 0;
		Static144.aBoolean138 = true;
		Static84.aBoolean80 = true;
		Static36.aClass52_1.anInt2292 = 0;
		Static50.method888();
		Static31.anInt772 = 0;
		Static145.anInt3425 = -1;
		Static132.anInt3074 = 0;
		Static141.anInt3312 = -1;
		Static160.aBoolean24 = false;
		Static89.anInt2261 = -1;
		Static86.anInt2213 = -1;
		Static64.anInt1578 = 0;
		Static66.aClass2_Sub13_Sub1_2.anInt2154 = 0;
		Static46.anInt1322 = 0;
		Static31.anInt773 = 0;
		Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
		Static43.method842(0);
		for (@Pc(2262) int local2262 = 0; local2262 < 100; local2262++) {
			Static24.aClass6Array3[local2262] = null;
		}
		Static137.anInt3191 = (int) (Math.random() * 80.0D) - 40;
		Static107.anInt2564 = 0;
		Static36.anInt1028 = (int) (Math.random() * 30.0D) - 20;
		Static26.aBoolean28 = false;
		Static46.anInt1324 = (int) (Math.random() * 120.0D) - 60;
		Static152.anInt3513 = 0;
		Static92.anInt2288 = (int) (Math.random() * 100.0D) - 50;
		Static154.anInt3559 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static81.anInt1985 = 0;
		Static152.anInt3507 = 0;
		Static60.anInt1425 = (int) (Math.random() * 110.0D) - 55;
		Static113.anInt2752 = 0;
		Static11.anInt284 = -1;
		Static122.anInt2841 = 0;
		Static167.anInt3925 = 0;
		Static122.anInt2842 = 0;
		for (@Pc(2344) int local2344 = 0; local2344 < 2048; local2344++) {
			Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local2344] = null;
			Static46.aClass2_Sub13Array1[local2344] = null;
		}
		for (@Pc(2360) int local2360 = 0; local2360 < 32768; local2360++) {
			Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local2360] = null;
		}
		Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[2047] = new Class2_Sub3_Sub5_Sub1_Sub1();
		Static112.aClass84_7.method2695();
		Static154.aClass84_13.method2695();
		@Pc(2392) int local2392;
		@Pc(2396) int local2396;
		for (@Pc(2388) int local2388 = 0; local2388 < 4; local2388++) {
			for (local2392 = 0; local2392 < 104; local2392++) {
				for (local2396 = 0; local2396 < 104; local2396++) {
					Static27.aClass84ArrayArrayArray1[local2388][local2392][local2396] = null;
				}
			}
		}
		Static110.aClass84_6 = new Class84();
		Static111.anInt2637 = 0;
		Static116.anInt2786 = 0;
		for (local2392 = 0; local2392 < Static5.anInt88; local2392++) {
			@Pc(2438) Class2_Sub3_Sub3 local2438 = Static39.method705(local2392);
			if (local2438 != null && local2438.anInt431 == 0) {
				Static27.anIntArray31[local2392] = 0;
				Static11.anIntArray9[local2392] = 0;
			}
		}
		for (local2396 = 0; local2396 < Static137.anIntArray290.length; local2396++) {
			Static137.anIntArray290[local2396] = -1;
		}
		if (Static21.anInt520 != -1) {
			Static70.method1105(Static21.anInt520);
		}
		for (@Pc(2479) Class2_Sub16 local2479 = (Class2_Sub16) Static148.aClass16_10.method478(); local2479 != null; local2479 = (Class2_Sub16) Static148.aClass16_10.method481()) {
			Static21.method381(local2479, true);
		}
		Static21.anInt520 = -1;
		Static148.aClass16_10 = new Class16(8);
		Static160.aBoolean24 = false;
		Static124.aClass87_9 = null;
		Static46.anInt1322 = 0;
		Static144.aClass55_2.method1703(-1, null, new int[5], false);
		for (@Pc(2515) int local2515 = 0; local2515 < 8; local2515++) {
			Static48.aClass6Array8[local2515] = null;
			Static127.aBooleanArray11[local2515] = false;
		}
		Static38.method683();
		Static118.aBoolean115 = true;
		for (@Pc(2537) int local2537 = 0; local2537 < 100; local2537++) {
			Static86.aBooleanArray5[local2537] = true;
		}
		Static171.anInt4014 = 0;
		Static65.aClass2_Sub5Array1 = null;
		Static55.aClass6_409 = null;
		for (@Pc(2557) int local2557 = 0; local2557 < 6; local2557++) {
			Static41.aClass54Array1[local2557] = new Class54();
		}
	}
}
