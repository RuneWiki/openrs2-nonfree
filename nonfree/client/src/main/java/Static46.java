import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!mb;")
	public static Class42 aClass42_34;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_13;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Lclient!kb;")
	public static Class9 aClass9_26;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!v;")
	private static Class62 aClass62_573 = Static45.method753("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!v;")
	public static Class62 aClass62_572 = aClass62_573;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!pb;")
	public static Class53 aClass53_2 = new Class53();

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public static int anInt1364 = 127;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_574 = Static45.method753("k");

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Lclient!mc;")
	public static Class43 aClass43_6 = new Class43(4096);

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!v;")
	public static Class62 aClass62_575 = Static45.method753("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Lclient!jb;")
	public static Class34 aClass34_18 = new Class34(50);

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!v;")
	public static Class62 aClass62_576 = Static45.method753("mapback");

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	public static int anInt1370 = 0;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_577 = Static45.method753("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[I")
	public static int[] anIntArray107 = new int[] { 0, 6, 0, 4, 0, 0, 0, 10, 0, 0, 0, 0, 3, 0, 6, 0, 0, 0, 0, 2, 0, 14, 0, 0, 0, -2, 0, -1, 0, 0, 0, 0, 0, 0, 6, 0, 5, 0, 6, 0, 0, 0, 3, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, -1, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 1, 1, 0, 6, 0, 0, 1, 0, 4, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 4, 0, 0, 0, 0, 2, 5, 0, 4, -1, 0, 6, 0, 0, 0, 6, 0, 0, 0, 0, 2, 0, 8, 0, -1, 6, 4, 2, -2, 0, 7, 0, 0, 4, 2, 0, 0, 2, 0, 0, -2, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2, 15, -2, 0, 0, 0, 0, -2, 0, -2, 0, 0, 0, 0, 0, 1, -2, 0, 0, 0, -2, 0, 3, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 5, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, -2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 6, 0, 0, 0, 7, 0, 0, 0, 8, 6, 0, 0, 0, 0, -2, 0 };

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "[I")
	public static int[] anIntArray108 = new int[500];

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "Lclient!v;")
	public static Class62 aClass62_578 = Static45.method753("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
	public static void method760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg3; local7 <= arg0 + arg3; local7++) {
			for (@Pc(11) int local11 = arg2; local11 <= arg2 + arg1; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static20.aByteArrayArrayArray4[0][local11][local7] = 127;
					if (arg2 == local11 && local11 > 0) {
						Static79.anIntArrayArrayArray4[0][local11][local7] = Static79.anIntArrayArrayArray4[0][local11 - 1][local7];
					}
					if (arg2 + arg1 == local11 && local11 < 103) {
						Static79.anIntArrayArrayArray4[0][local11][local7] = Static79.anIntArrayArrayArray4[0][local11 + 1][local7];
					}
					if (arg3 == local7 && local7 > 0) {
						Static79.anIntArrayArrayArray4[0][local11][local7] = Static79.anIntArrayArrayArray4[0][local11][local7 - 1];
					}
					if (local7 == arg3 + arg0 && local7 < 103) {
						Static79.anIntArrayArrayArray4[0][local11][local7] = Static79.anIntArrayArrayArray4[0][local11][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!mb;Ljava/awt/Component;B)V")
	public static void method761(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Component arg1) {
		if (Static106.aBoolean167) {
			return;
		}
		Static105.aClass3_Sub1_Sub1_Sub1_21 = Static98.method1652(Static49.aClass62_581, arg0, Static75.aClass62_891);
		Static35.aClass3_Sub1_Sub1_Sub1_10 = Static98.method1652(Static31.aClass62_418, arg0, Static75.aClass62_891);
		aClass3_Sub1_Sub1_Sub1_13 = Static98.method1652(aClass62_576, arg0, Static75.aClass62_891);
		Static2.aClass3_Sub1_Sub1_Sub1_1 = Static98.method1652(Static25.aClass62_326, arg0, Static75.aClass62_891);
		Static89.aClass3_Sub1_Sub1_Sub1_19 = Static98.method1652(Static93.aClass62_1126, arg0, Static75.aClass62_891);
		Static83.aClass3_Sub1_Sub1_Sub1_8 = Static98.method1652(Static14.aClass62_217, arg0, Static75.aClass62_891);
		Static29.aClass9_15 = Static63.method1509(arg1, 96, 479);
		Static35.aClass3_Sub1_Sub1_Sub1_10.method145(0, 0);
		Static44.aClass9_24 = Static63.method1509(arg1, 156, 172);
		Static97.method1734();
		aClass3_Sub1_Sub1_Sub1_13.method145(0, 0);
		Static48.aClass9_27 = Static63.method1509(arg1, 261, 190);
		Static105.aClass3_Sub1_Sub1_Sub1_21.method145(0, 0);
		Static29.aClass9_16 = Static63.method1509(arg1, 334, 512);
		Static97.method1734();
		Static29.aClass9_14 = Static63.method1509(arg1, 50, 496);
		Static64.aClass9_31 = Static63.method1509(arg1, 37, 269);
		Static74.aClass9_36 = Static63.method1509(arg1, 45, 249);
		@Pc(110) Class3_Sub1_Sub1_Sub4 local110 = Static54.method1800(Static75.aClass62_891, arg0, Static38.aClass62_488);
		Static108.aClass9_53 = Static63.method1509(arg1, local110.anInt2685, local110.anInt2686);
		local110.method1752(0, 0);
		@Pc(128) Class3_Sub1_Sub1_Sub4 local128 = Static54.method1800(Static75.aClass62_891, arg0, Static29.aClass62_398);
		Static42.aClass9_23 = Static63.method1509(arg1, local128.anInt2685, local128.anInt2686);
		local128.method1752(0, 0);
		@Pc(148) Class3_Sub1_Sub1_Sub4 local148 = Static54.method1800(Static75.aClass62_891, arg0, Static89.aClass62_1085);
		Static7.aClass9_5 = Static63.method1509(arg1, local148.anInt2685, local148.anInt2686);
		local148.method1752(0, 0);
		@Pc(166) Class3_Sub1_Sub1_Sub4 local166 = Static54.method1800(Static75.aClass62_891, arg0, Static28.aClass62_384);
		Static79.aClass9_40 = Static63.method1509(arg1, local166.anInt2685, local166.anInt2686);
		local166.method1752(0, 0);
		@Pc(184) Class3_Sub1_Sub1_Sub4 local184 = Static54.method1800(Static75.aClass62_891, arg0, Static83.aClass62_211);
		Static81.aClass9_42 = Static63.method1509(arg1, local184.anInt2685, local184.anInt2686);
		local184.method1752(0, 0);
		@Pc(202) Class3_Sub1_Sub1_Sub4 local202 = Static54.method1800(Static75.aClass62_891, arg0, Static92.aClass62_1102);
		Static86.aClass9_46 = Static63.method1509(arg1, local202.anInt2685, local202.anInt2686);
		local202.method1752(0, 0);
		@Pc(222) Class3_Sub1_Sub1_Sub4 local222 = Static54.method1800(Static75.aClass62_891, arg0, Static36.aClass62_477);
		Static92.aClass9_48 = Static63.method1509(arg1, local222.anInt2685, local222.anInt2686);
		local222.method1752(0, 0);
		@Pc(240) Class3_Sub1_Sub1_Sub4 local240 = Static54.method1800(Static75.aClass62_891, arg0, Static49.aClass62_580);
		Static69.aClass9_34 = Static63.method1509(arg1, local240.anInt2685, local240.anInt2686);
		local240.method1752(0, 0);
		@Pc(260) Class3_Sub1_Sub1_Sub4 local260 = Static54.method1800(Static75.aClass62_891, arg0, Static18.aClass62_287);
		Static37.aClass9_20 = Static63.method1509(arg1, local260.anInt2685, local260.anInt2686);
		local260.method1752(0, 0);
		Static6.aClass3_Sub1_Sub1_Sub1_3 = Static98.method1652(Static68.aClass62_817, arg0, Static75.aClass62_891);
		Static54.aClass3_Sub1_Sub1_Sub1_20 = Static98.method1652(Static93.aClass62_1124, arg0, Static75.aClass62_891);
		Static13.aClass3_Sub1_Sub1_Sub1_6 = Static98.method1652(Static26.aClass62_337, arg0, Static75.aClass62_891);
		Static48.aClass3_Sub1_Sub1_Sub1_14 = Static6.aClass3_Sub1_Sub1_Sub1_3.method146();
		Static48.aClass3_Sub1_Sub1_Sub1_14.method141();
		Static105.aClass3_Sub1_Sub1_Sub1_22 = Static54.aClass3_Sub1_Sub1_Sub1_20.method146();
		Static105.aClass3_Sub1_Sub1_Sub1_22.method141();
		Static9.aClass3_Sub1_Sub1_Sub1_18 = Static6.aClass3_Sub1_Sub1_Sub1_3.method146();
		Static9.aClass3_Sub1_Sub1_Sub1_18.method142();
		Static38.aClass3_Sub1_Sub1_Sub1_11 = Static54.aClass3_Sub1_Sub1_Sub1_20.method146();
		Static38.aClass3_Sub1_Sub1_Sub1_11.method142();
		Static22.aClass3_Sub1_Sub1_Sub1_9 = Static13.aClass3_Sub1_Sub1_Sub1_6.method146();
		Static22.aClass3_Sub1_Sub1_Sub1_9.method142();
		Static7.aClass3_Sub1_Sub1_Sub1_4 = Static6.aClass3_Sub1_Sub1_Sub1_3.method146();
		Static7.aClass3_Sub1_Sub1_Sub1_4.method141();
		Static7.aClass3_Sub1_Sub1_Sub1_4.method142();
		Static58.aClass3_Sub1_Sub1_Sub1_16 = Static54.aClass3_Sub1_Sub1_Sub1_20.method146();
		Static58.aClass3_Sub1_Sub1_Sub1_16.method141();
		Static58.aClass3_Sub1_Sub1_Sub1_16.method142();
		Static62.aClass3_Sub1_Sub1_Sub1Array2 = Static61.method1031(Static80.aClass62_953, Static75.aClass62_891, arg0);
		Static92.anIntArray270 = new int[33];
		Static9.anIntArray198 = new int[151];
		Static100.anIntArray272 = new int[33];
		Static98.anIntArray282 = new int[151];
		@Pc(359) int local359;
		@Pc(357) int local357;
		@Pc(361) int local361;
		for (@Pc(353) int local353 = 0; local353 < 33; local353++) {
			local357 = 0;
			local359 = 999;
			for (local361 = 0; local361 < 34; local361++) {
				if (aClass3_Sub1_Sub1_Sub1_13.aByteArray3[local361 + aClass3_Sub1_Sub1_Sub1_13.anInt152 * local353] == 0) {
					if (local359 == 999) {
						local359 = local361;
					}
				} else if (local359 != 999) {
					local357 = local361;
					break;
				}
			}
			Static92.anIntArray270[local353] = local359;
			Static100.anIntArray272[local353] = local357 - local359;
		}
		for (local359 = 5; local359 < 156; local359++) {
			local361 = 0;
			local357 = 999;
			for (@Pc(417) int local417 = 25; local417 < 172; local417++) {
				if (aClass3_Sub1_Sub1_Sub1_13.aByteArray3[local359 * aClass3_Sub1_Sub1_Sub1_13.anInt152 + local417] == 0 && (local417 > 34 || local359 > 34)) {
					if (local357 == 999) {
						local357 = local417;
					}
				} else if (local357 != 999) {
					local361 = local417;
					break;
				}
			}
			Static9.anIntArray198[local359 - 5] = local357 - 25;
			Static98.anIntArray282[local359 - 5] = local361 - local357;
		}
		Static106.aBoolean167 = true;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	public static void method763() {
		aClass9_26 = null;
		aClass34_18 = null;
		aClass62_572 = null;
		aClass62_577 = null;
		aClass43_6 = null;
		aClass62_576 = null;
		aClass62_574 = null;
		aClass62_578 = null;
		anIntArray107 = null;
		anIntArray108 = null;
		aClass62_573 = null;
		aClass62_575 = null;
		aClass42_34 = null;
		aClass53_2 = null;
		aClass3_Sub1_Sub1_Sub1_13 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
	public static boolean method766() {
		@Pc(5) Class29 local5 = Static12.aClass29_1;
		synchronized (Static12.aClass29_1) {
			if (Static27.anInt824 == Static44.anInt1226) {
				return false;
			} else {
				Static38.anInt1138 = Static44.anIntArray96[Static27.anInt824];
				Static94.anInt2493 = Static68.anIntArray200[Static27.anInt824];
				Static27.anInt824 = Static27.anInt824 + 1 & 0x7F;
				return true;
			}
		}
	}
}
