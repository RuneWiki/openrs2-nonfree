import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!ag;")
	public static Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] aClass2_Sub3_Sub2_Sub3Array7;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public static int anInt3275;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Lclient!dd;")
	public static Class17 aClass17_22 = new Class17(64);

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!ai;")
	public static Class6 aClass6_949 = Static38.method685("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!ai;")
	private static Class6 aClass6_950 = Static38.method685("Hidden");

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Lclient!ai;")
	private static Class6 aClass6_952 = Static38.method685("level)2");

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_951 = aClass6_952;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!ai;")
	public static Class6 aClass6_953 = aClass6_950;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	public static int anInt3276 = 0;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "[I")
	public static int[] anIntArray293 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method2158() {
		aClass2_Sub4_1 = null;
		aClass6_953 = null;
		anIntArray293 = null;
		aClass6_951 = null;
		aClass6_950 = null;
		aClass6_949 = null;
		aClass2_Sub3_Sub2_Sub3Array7 = null;
		aClass6_952 = null;
		aClass17_22 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!c;Lclient!c;B)V")
	public static void method2159(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1) {
		Static145.aClass10_115 = arg0;
		Static59.aClass10_57 = arg1;
		Static159.anInt3748 = Static59.aClass10_57.method1588(3);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBLclient!ai;)V")
	public static void method2160(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(7) boolean local7 = false;
		@Pc(17) Class6 local17 = arg1.method121().method106();
		for (@Pc(19) int local19 = 0; local19 < Static167.anInt3925; local19++) {
			@Pc(27) Class2_Sub3_Sub5_Sub1_Sub1 local27 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[Static156.anIntArray358[local19]];
			if (local27 != null && local27.aClass6_244 != null && local27.aClass6_244.method137(local17)) {
				local7 = true;
				Static74.method1151(local27.anIntArray221[0], 0, 1, local27.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				if (arg0 == 1) {
					Static66.aClass2_Sub13_Sub1_2.method1455(212);
					Static66.aClass2_Sub13_Sub1_2.method1428(Static156.anIntArray358[local19]);
				} else if (arg0 == 4) {
					Static66.aClass2_Sub13_Sub1_2.method1455(143);
					Static66.aClass2_Sub13_Sub1_2.method1447(Static156.anIntArray358[local19]);
				} else if (arg0 == 6) {
					Static66.aClass2_Sub13_Sub1_2.method1455(162);
					Static66.aClass2_Sub13_Sub1_2.method1428(Static156.anIntArray358[local19]);
				} else if (arg0 == 7) {
					Static66.aClass2_Sub13_Sub1_2.method1455(98);
					Static66.aClass2_Sub13_Sub1_2.method1447(Static156.anIntArray358[local19]);
				}
				break;
			}
		}
		if (!local7) {
			Static6.method932(0, Static58.method956(new Class6[] { Static70.aClass6_519, local17 }), Static9.aClass6_71);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
	public static void method2161() {
		Static151.method2327(Static88.aClass87_6);
		anInt3275++;
		if (Static105.aBoolean103 && Static11.aBoolean9) {
			@Pc(26) int local26 = Static69.anInt1736;
			local26 -= Static96.anInt2395;
			if (local26 < Static172.anInt4040) {
				local26 = Static172.anInt4040;
			}
			if (Static88.aClass87_6.anInt4092 + local26 > Static172.anInt4040 + Static10.aClass87_3.anInt4092) {
				local26 = Static10.aClass87_3.anInt4092 + Static172.anInt4040 - Static88.aClass87_6.anInt4092;
			}
			@Pc(58) int local58 = Static77.anInt1906;
			local58 -= Static97.anInt2406;
			if (Static42.anInt1279 > local58) {
				local58 = Static42.anInt1279;
			}
			@Pc(76) int local76 = local26 - Static95.anInt2355;
			@Pc(79) int local79 = Static88.aClass87_6.anInt4109;
			if (Static88.aClass87_6.anInt4133 + local58 > Static42.anInt1279 - -Static10.aClass87_3.anInt4133) {
				local58 = Static42.anInt1279 + Static10.aClass87_3.anInt4133 - Static88.aClass87_6.anInt4133;
			}
			@Pc(107) int local107 = local58 - Static30.anInt763;
			if (anInt3275 > Static88.aClass87_6.anInt4117 && (local79 < local76 || -local79 > local76 || local107 > local79 || local107 < -local79)) {
				Static163.aBoolean152 = true;
			}
			@Pc(147) int local147 = Static10.aClass87_3.anInt4124 + local58 - Static42.anInt1279;
			@Pc(163) int local163 = local26 + Static10.aClass87_3.anInt4083 - Static172.anInt4040;
			@Pc(172) Class2_Sub2 local172;
			if (Static88.aClass87_6.anObjectArray11 != null && Static163.aBoolean152) {
				local172 = new Class2_Sub2();
				local172.anObjectArray1 = Static88.aClass87_6.anObjectArray11;
				local172.aClass87_1 = Static88.aClass87_6;
				local172.anInt85 = local163;
				local172.anInt83 = local147;
				Static92.method1505(local172);
			}
			if (Static51.anInt1408 == 0) {
				if (Static163.aBoolean152) {
					if (Static88.aClass87_6.anObjectArray25 != null) {
						local172 = new Class2_Sub2();
						local172.aClass87_2 = Static182.aClass87_14;
						local172.anInt83 = local147;
						local172.anInt85 = local163;
						local172.aClass87_1 = Static88.aClass87_6;
						local172.anObjectArray1 = Static88.aClass87_6.anObjectArray25;
						Static92.method1505(local172);
					}
					if (Static182.aClass87_14 != null && Static36.method636(Static88.aClass87_6) != null) {
						Static66.aClass2_Sub13_Sub1_2.method1455(81);
						Static66.aClass2_Sub13_Sub1_2.method1428(Static182.aClass87_14.anInt4105);
						Static66.aClass2_Sub13_Sub1_2.method1403(Static88.aClass87_6.anInt4105);
						Static66.aClass2_Sub13_Sub1_2.method1437(Static182.aClass87_14.anInt4085);
						Static66.aClass2_Sub13_Sub1_2.method1421(Static88.aClass87_6.anInt4085);
					}
				} else if ((Static21.anInt523 == 1 || Static160.method429(Static46.anInt1322 - 1)) && Static46.anInt1322 > 2) {
					Static126.method1962();
				} else if (Static46.anInt1322 > 0) {
					Static25.method466(Static46.anInt1322 - 1);
				}
				Static88.aClass87_6 = null;
			}
		} else if (anInt3275 > 1) {
			Static88.aClass87_6 = null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)V")
	public static void method2162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 2048 - arg2 & 0x7FF;
		@Pc(12) int local12 = 2048 - arg4 & 0x7FF;
		@Pc(18) int local18 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = arg1;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(47) int local47;
		if (local5 != 0) {
			local32 = Class2_Sub3_Sub2_Sub2.anIntArray208[local5];
			local36 = Class2_Sub3_Sub2_Sub2.anIntArray207[local5];
			local47 = local36 * 0 - arg1 * local32 >> 16;
			local26 = local32 * 0 + arg1 * local36 >> 16;
			local24 = local47;
		}
		if (local12 != 0) {
			local32 = Class2_Sub3_Sub2_Sub2.anIntArray208[local12];
			local36 = Class2_Sub3_Sub2_Sub2.anIntArray207[local12];
			local47 = local36 * 0 + local26 * local32 >> 16;
			local26 = local36 * local26 - local32 * 0 >> 16;
			local18 = local47;
		}
		Static182.anInt4201 = arg4;
		Static107.anInt2560 = arg2;
		Static106.anInt4184 = arg3 - local18;
		Static12.anInt313 = arg0 - local24;
		Static28.anInt722 = arg5 - local26;
	}
}
