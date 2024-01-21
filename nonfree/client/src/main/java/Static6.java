import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "u", descriptor = "Lclient!bg;")
	public static Class11 aClass11_8;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Lclient!vg;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "Lclient!pa;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_80 = Static32.method683("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!rc;")
	public static Class74 aClass74_5 = new Class74(5);

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[8];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Lclient!lf;")
	public static Class49 method103(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static48.method882(arg0) : Static42.aClass49_519;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
	public static void method104() {
		aClass64_1 = null;
		aClass11_8 = null;
		aClass74_5 = null;
		aClass49_80 = null;
		aClass85_1 = null;
		aBooleanArray1 = null;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(BI)V")
	public static void method105(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static130.anIntArray347[arg0];
		@Pc(14) int local14 = Static30.aShortArray1[arg0];
		@Pc(18) int local18 = Static177.anIntArray362[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		@Pc(27) int local27 = (int) Static66.aLongArray10[arg0];
		@Pc(31) long local31 = Static66.aLongArray10[arg0];
		@Pc(56) boolean local56;
		if (local14 == 2) {
			local56 = Static51.method905(0, 0, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			if (!local56) {
				Static51.method905(1, 1, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			}
			Static175.anInt3819 = 2;
			Static129.anInt2804 = Static61.anInt1320;
			Static55.anInt1205 = Static114.anInt2394;
			Static82.anInt1768 = 0;
			Static176.aClass2_Sub13_Sub1_14.method2976(77);
			Static176.aClass2_Sub13_Sub1_14.method2921(local18 + Static38.anInt944);
			Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			Static176.aClass2_Sub13_Sub1_14.method2921(Static49.anInt1133 + local10);
		}
		@Pc(123) Class2_Sub2_Sub3_Sub7_Sub2 local123;
		if (local14 == 1) {
			local123 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local27];
			if (local123 != null) {
				Static51.method905(1, 1, local123.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local123.anIntArray318[0], 0, 0);
				Static82.anInt1768 = 0;
				Static129.anInt2804 = Static61.anInt1320;
				Static55.anInt1205 = Static114.anInt2394;
				Static175.anInt3819 = 2;
				Static176.aClass2_Sub13_Sub1_14.method2976(86);
				Static176.aClass2_Sub13_Sub1_14.method2964(Static66.anInt1393);
				Static176.aClass2_Sub13_Sub1_14.method2952(Static87.anInt2931);
				Static176.aClass2_Sub13_Sub1_14.method2964(local27);
				Static176.aClass2_Sub13_Sub1_14.method2921(Static43.anInt1036);
			}
		}
		@Pc(192) Class2_Sub2_Sub3_Sub7_Sub1 local192;
		if (local14 == 9) {
			local192 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local27];
			if (local192 != null) {
				Static51.method905(1, 1, local192.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local192.anIntArray318[0], 0, 0);
				Static129.anInt2804 = Static61.anInt1320;
				Static55.anInt1205 = Static114.anInt2394;
				Static175.anInt3819 = 2;
				Static82.anInt1768 = 0;
				Static176.aClass2_Sub13_Sub1_14.method2976(97);
				Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			}
		}
		if (local14 == 42) {
			Static176.aClass2_Sub13_Sub1_14.method2976(173);
			Static176.aClass2_Sub13_Sub1_14.method2938(local10);
			Static176.aClass2_Sub13_Sub1_14.method2952(local18);
			Static176.aClass2_Sub13_Sub1_14.method2964(local27);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 45) {
			Static176.aClass2_Sub13_Sub1_14.method2976(168);
			Static176.aClass2_Sub13_Sub1_14.method2938(local10);
			Static176.aClass2_Sub13_Sub1_14.method2967(local27);
			Static176.aClass2_Sub13_Sub1_14.method2952(local18);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 39) {
			Static176.aClass2_Sub13_Sub1_14.method2976(204);
			Static176.aClass2_Sub13_Sub1_14.method2952(local18);
			Static176.aClass2_Sub13_Sub1_14.method2964(local27);
			Static176.aClass2_Sub13_Sub1_14.method2921(local10);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 3) {
			Static176.aClass2_Sub13_Sub1_14.method2976(226);
			Static176.aClass2_Sub13_Sub1_14.method2921(local10);
			Static176.aClass2_Sub13_Sub1_14.method2918(local18);
			Static176.aClass2_Sub13_Sub1_14.method2964(local27);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 40) {
			Static53.method926(local18, local31, local10);
			Static176.aClass2_Sub13_Sub1_14.method2976(162);
			Static176.aClass2_Sub13_Sub1_14.method2967(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static176.aClass2_Sub13_Sub1_14.method2964(Static49.anInt1133 + local10);
			Static176.aClass2_Sub13_Sub1_14.method2938(Static38.anInt944 + local18);
		}
		if (local14 == 33) {
			local123 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local27];
			if (local123 != null) {
				Static51.method905(1, 1, local123.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local123.anIntArray318[0], 0, 0);
				Static82.anInt1768 = 0;
				Static129.anInt2804 = Static61.anInt1320;
				Static55.anInt1205 = Static114.anInt2394;
				Static175.anInt3819 = 2;
				Static176.aClass2_Sub13_Sub1_14.method2976(222);
				Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			}
		}
		if (local14 == 29) {
			Static176.aClass2_Sub13_Sub1_14.method2976(251);
			Static176.aClass2_Sub13_Sub1_14.method2967(local10);
			Static176.aClass2_Sub13_Sub1_14.method2918(local18);
			Static176.aClass2_Sub13_Sub1_14.method2964(local27);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 47) {
			local56 = Static51.method905(0, 0, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			if (!local56) {
				Static51.method905(1, 1, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			}
			Static175.anInt3819 = 2;
			Static82.anInt1768 = 0;
			Static129.anInt2804 = Static61.anInt1320;
			Static55.anInt1205 = Static114.anInt2394;
			Static176.aClass2_Sub13_Sub1_14.method2976(139);
			Static176.aClass2_Sub13_Sub1_14.method2964(local18 + Static38.anInt944);
			Static176.aClass2_Sub13_Sub1_14.method2921(local10 + Static49.anInt1133);
			Static176.aClass2_Sub13_Sub1_14.method2964(local27);
		}
		if (local14 == 8) {
			local56 = Static51.method905(0, 0, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			if (!local56) {
				Static51.method905(1, 1, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			}
			Static175.anInt3819 = 2;
			Static129.anInt2804 = Static61.anInt1320;
			Static82.anInt1768 = 0;
			Static55.anInt1205 = Static114.anInt2394;
			Static176.aClass2_Sub13_Sub1_14.method2976(207);
			Static176.aClass2_Sub13_Sub1_14.method2938(local27);
			Static176.aClass2_Sub13_Sub1_14.method2918(Static87.anInt2931);
			Static176.aClass2_Sub13_Sub1_14.method2967(local18 + Static38.anInt944);
			Static176.aClass2_Sub13_Sub1_14.method2938(Static66.anInt1393);
			Static176.aClass2_Sub13_Sub1_14.method2967(Static43.anInt1036);
			Static176.aClass2_Sub13_Sub1_14.method2938(local10 + Static49.anInt1133);
		}
		if (local14 == 31 && Static53.method926(local18, local31, local10)) {
			Static176.aClass2_Sub13_Sub1_14.method2976(216);
			Static176.aClass2_Sub13_Sub1_14.method2968(Static87.anInt2931);
			Static176.aClass2_Sub13_Sub1_14.method2938(Static66.anInt1393);
			Static176.aClass2_Sub13_Sub1_14.method2921(Static43.anInt1036);
			Static176.aClass2_Sub13_Sub1_14.method2938(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static176.aClass2_Sub13_Sub1_14.method2967(local18 + Static38.anInt944);
			Static176.aClass2_Sub13_Sub1_14.method2967(local10 + Static49.anInt1133);
		}
		if (local14 == 13) {
			local56 = Static51.method905(0, 0, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			if (!local56) {
				Static51.method905(1, 1, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			}
			Static55.anInt1205 = Static114.anInt2394;
			Static82.anInt1768 = 0;
			Static129.anInt2804 = Static61.anInt1320;
			Static175.anInt3819 = 2;
			Static176.aClass2_Sub13_Sub1_14.method2976(110);
			Static176.aClass2_Sub13_Sub1_14.method2967(Static49.anInt1133 + local10);
			Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			Static176.aClass2_Sub13_Sub1_14.method2967(Static38.anInt944 + local18);
		}
		if (local14 == 24) {
			Static176.aClass2_Sub13_Sub1_14.method2976(155);
			Static176.aClass2_Sub13_Sub1_14.method2938(local10);
			Static176.aClass2_Sub13_Sub1_14.method2920(local18);
			Static176.aClass2_Sub13_Sub1_14.method2964(local27);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		@Pc(852) Class85 local852;
		if (local14 == 1005) {
			local852 = Static140.method2337(local18);
			if (local852 == null || local852.anIntArray357[local10] < 100000) {
				Static176.aClass2_Sub13_Sub1_14.method2976(123);
				Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			} else {
				Static88.method1475(Static154.aClass49_1489, Static33.method692(new Class49[] { Static48.method882(local852.anIntArray357[local10]), Static1.aClass49_5, Static113.method1913(local27).aClass49_834 }), 0);
			}
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 46) {
			Static176.aClass2_Sub13_Sub1_14.method2976(241);
			Static176.aClass2_Sub13_Sub1_14.method2967(local27);
			Static176.aClass2_Sub13_Sub1_14.method2921(local10);
			Static176.aClass2_Sub13_Sub1_14.method2967(Static7.anInt138);
			Static176.aClass2_Sub13_Sub1_14.method2968(Static148.anInt3151);
			Static176.aClass2_Sub13_Sub1_14.method2952(local18);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 37) {
			local192 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local27];
			if (local192 != null) {
				Static51.method905(1, 1, local192.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local192.anIntArray318[0], 0, 0);
				Static129.anInt2804 = Static61.anInt1320;
				Static55.anInt1205 = Static114.anInt2394;
				Static175.anInt3819 = 2;
				Static82.anInt1768 = 0;
				Static176.aClass2_Sub13_Sub1_14.method2976(19);
				Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			}
		}
		if (local14 == 50 && Static53.method926(local18, local31, local10)) {
			Static176.aClass2_Sub13_Sub1_14.method2976(134);
			Static176.aClass2_Sub13_Sub1_14.method2938(Static7.anInt138);
			Static176.aClass2_Sub13_Sub1_14.method2938(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static176.aClass2_Sub13_Sub1_14.method2920(Static148.anInt3151);
			Static176.aClass2_Sub13_Sub1_14.method2964(Static49.anInt1133 + local10);
			Static176.aClass2_Sub13_Sub1_14.method2938(Static38.anInt944 + local18);
		}
		@Pc(1105) int local1105;
		if (local14 == 21) {
			Static176.aClass2_Sub13_Sub1_14.method2976(186);
			Static176.aClass2_Sub13_Sub1_14.method2952(local18);
			local852 = Static140.method2337(local18);
			if (local852.anIntArrayArray35 != null && local852.anIntArrayArray35[0][0] == 5) {
				local1105 = local852.anIntArrayArray35[0][1];
				Static165.anIntArray317[local1105] = 1 - Static165.anIntArray317[local1105];
				Static164.method2769(local1105);
			}
		}
		if (local14 == 17) {
			Static57.method963();
			local852 = Static140.method2337(local18);
			Static124.anInt2746 = 1;
			Static43.anInt1036 = local10;
			Static87.anInt2931 = local18;
			Static66.anInt1393 = local27;
			Static102.method1756(local852);
			Static180.aClass49_1728 = Static33.method692(new Class49[] { Static73.aClass49_797, Static113.method1913(local27).aClass49_834, Static103.aClass49_1031 });
			if (Static180.aClass49_1728 == null) {
				Static180.aClass49_1728 = Static31.aClass49_428;
			}
			return;
		}
		if (local14 == 51) {
			local192 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local27];
			if (local192 != null) {
				Static51.method905(1, 1, local192.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local192.anIntArray318[0], 0, 0);
				Static129.anInt2804 = Static61.anInt1320;
				Static82.anInt1768 = 0;
				Static55.anInt1205 = Static114.anInt2394;
				Static175.anInt3819 = 2;
				Static176.aClass2_Sub13_Sub1_14.method2976(176);
				Static176.aClass2_Sub13_Sub1_14.method2938(local27);
				Static176.aClass2_Sub13_Sub1_14.method2968(Static148.anInt3151);
				Static176.aClass2_Sub13_Sub1_14.method2938(Static7.anInt138);
			}
		}
		if (local14 == 1003) {
			Static175.anInt3819 = 2;
			Static129.anInt2804 = Static61.anInt1320;
			Static82.anInt1768 = 0;
			Static55.anInt1205 = Static114.anInt2394;
			Static176.aClass2_Sub13_Sub1_14.method2976(123);
			Static176.aClass2_Sub13_Sub1_14.method2921(local27);
		}
		if (local14 == 57) {
			local123 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local27];
			if (local123 != null) {
				Static51.method905(1, 1, local123.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local123.anIntArray318[0], 0, 0);
				Static82.anInt1768 = 0;
				Static55.anInt1205 = Static114.anInt2394;
				Static175.anInt3819 = 2;
				Static129.anInt2804 = Static61.anInt1320;
				Static176.aClass2_Sub13_Sub1_14.method2976(59);
				Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			}
		}
		if (local14 == 1007) {
			Static53.method926(local18, local31, local10);
			Static176.aClass2_Sub13_Sub1_14.method2976(160);
			Static176.aClass2_Sub13_Sub1_14.method2921((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static176.aClass2_Sub13_Sub1_14.method2967(local18 + Static38.anInt944);
			Static176.aClass2_Sub13_Sub1_14.method2938(local10 + Static49.anInt1133);
		}
		if (local14 == 36 && Static141.aClass85_12 == null) {
			Static13.method200(local18, local10);
			Static141.aClass85_12 = Static114.method1938(local18, local10);
			Static102.method1756(Static141.aClass85_12);
		}
		if (local14 == 12) {
			local123 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local27];
			if (local123 != null) {
				Static51.method905(1, 1, local123.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local123.anIntArray318[0], 0, 0);
				Static82.anInt1768 = 0;
				Static175.anInt3819 = 2;
				Static55.anInt1205 = Static114.anInt2394;
				Static129.anInt2804 = Static61.anInt1320;
				Static176.aClass2_Sub13_Sub1_14.method2976(116);
				Static176.aClass2_Sub13_Sub1_14.method2920(Static148.anInt3151);
				Static176.aClass2_Sub13_Sub1_14.method2964(local27);
				Static176.aClass2_Sub13_Sub1_14.method2921(Static7.anInt138);
			}
		}
		if (local14 == 18) {
			local123 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local27];
			if (local123 != null) {
				Static51.method905(1, 1, local123.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local123.anIntArray318[0], 0, 0);
				Static82.anInt1768 = 0;
				Static129.anInt2804 = Static61.anInt1320;
				Static55.anInt1205 = Static114.anInt2394;
				Static175.anInt3819 = 2;
				Static176.aClass2_Sub13_Sub1_14.method2976(8);
				Static176.aClass2_Sub13_Sub1_14.method2964(local27);
			}
		}
		if (local14 == 11) {
			local123 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local27];
			if (local123 != null) {
				Static51.method905(1, 1, local123.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local123.anIntArray318[0], 0, 0);
				Static175.anInt3819 = 2;
				Static82.anInt1768 = 0;
				Static55.anInt1205 = Static114.anInt2394;
				Static129.anInt2804 = Static61.anInt1320;
				Static176.aClass2_Sub13_Sub1_14.method2976(246);
				Static176.aClass2_Sub13_Sub1_14.method2938(local27);
			}
		}
		if (local14 == 6) {
			local192 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local27];
			if (local192 != null) {
				Static51.method905(1, 1, local192.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local192.anIntArray318[0], 0, 0);
				Static175.anInt3819 = 2;
				Static129.anInt2804 = Static61.anInt1320;
				Static55.anInt1205 = Static114.anInt2394;
				Static82.anInt1768 = 0;
				Static176.aClass2_Sub13_Sub1_14.method2976(235);
				Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			}
		}
		if (local14 == 48) {
			local123 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local27];
			if (local123 != null) {
				Static51.method905(1, 1, local123.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local123.anIntArray318[0], 0, 0);
				Static175.anInt3819 = 2;
				Static129.anInt2804 = Static61.anInt1320;
				Static82.anInt1768 = 0;
				Static55.anInt1205 = Static114.anInt2394;
				Static176.aClass2_Sub13_Sub1_14.method2976(121);
				Static176.aClass2_Sub13_Sub1_14.method2967(local27);
			}
		}
		if (local14 == 35) {
			local192 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local27];
			if (local192 != null) {
				Static51.method905(1, 1, local192.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local192.anIntArray318[0], 0, 0);
				Static82.anInt1768 = 0;
				Static175.anInt3819 = 2;
				Static129.anInt2804 = Static61.anInt1320;
				Static55.anInt1205 = Static114.anInt2394;
				Static176.aClass2_Sub13_Sub1_14.method2976(55);
				Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			}
		}
		if (local14 == 22) {
			local123 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local27];
			if (local123 != null) {
				Static51.method905(1, 1, local123.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local123.anIntArray318[0], 0, 0);
				Static129.anInt2804 = Static61.anInt1320;
				Static55.anInt1205 = Static114.anInt2394;
				Static82.anInt1768 = 0;
				Static175.anInt3819 = 2;
				Static176.aClass2_Sub13_Sub1_14.method2976(2);
				Static176.aClass2_Sub13_Sub1_14.method2967(local27);
			}
		}
		if (local14 == 1004) {
			Static82.anInt1768 = 0;
			Static55.anInt1205 = Static114.anInt2394;
			Static129.anInt2804 = Static61.anInt1320;
			Static175.anInt3819 = 2;
			local192 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local27];
			if (local192 != null) {
				@Pc(1804) Class2_Sub2_Sub15 local1804 = local192.aClass2_Sub2_Sub15_1;
				if (local1804.anIntArray288 != null) {
					local1804 = local1804.method2469();
				}
				if (local1804 != null) {
					Static176.aClass2_Sub13_Sub1_14.method2976(87);
					Static176.aClass2_Sub13_Sub1_14.method2938(local1804.anInt3219);
				}
			}
		}
		if (local14 == 41) {
			Static176.aClass2_Sub13_Sub1_14.method2976(169);
			Static176.aClass2_Sub13_Sub1_14.method2968(local18);
			Static176.aClass2_Sub13_Sub1_14.method2938(local10);
			Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 20) {
			Static176.aClass2_Sub13_Sub1_14.method2976(67);
			Static176.aClass2_Sub13_Sub1_14.method2967(local10);
			Static176.aClass2_Sub13_Sub1_14.method2938(local27);
			Static176.aClass2_Sub13_Sub1_14.method2918(local18);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 14 || local14 == 1002) {
			Static146.method2399(local10, Static161.aClass49Array19[arg0], local18, local27);
		}
		if (local14 == 15) {
			Static176.aClass2_Sub13_Sub1_14.method2976(100);
			Static176.aClass2_Sub13_Sub1_14.method2968(local18);
			Static176.aClass2_Sub13_Sub1_14.method2967(local27);
			Static176.aClass2_Sub13_Sub1_14.method2921(local10);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 34) {
			local852 = Static140.method2337(local18);
			@Pc(1954) boolean local1954 = true;
			if (local852.anInt3876 > 0) {
				local1954 = Static100.method1733(local852);
			}
			if (local1954) {
				Static176.aClass2_Sub13_Sub1_14.method2976(186);
				Static176.aClass2_Sub13_Sub1_14.method2952(local18);
			}
		}
		if (local14 == 4) {
			Static176.aClass2_Sub13_Sub1_14.method2976(61);
			Static176.aClass2_Sub13_Sub1_14.method2968(local18);
			Static176.aClass2_Sub13_Sub1_14.method2952(Static87.anInt2931);
			Static176.aClass2_Sub13_Sub1_14.method2938(Static66.anInt1393);
			Static176.aClass2_Sub13_Sub1_14.method2938(local10);
			Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			Static176.aClass2_Sub13_Sub1_14.method2967(Static43.anInt1036);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 49) {
			local56 = Static51.method905(0, 0, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			if (!local56) {
				Static51.method905(1, 1, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			}
			Static129.anInt2804 = Static61.anInt1320;
			Static55.anInt1205 = Static114.anInt2394;
			Static82.anInt1768 = 0;
			Static175.anInt3819 = 2;
			Static176.aClass2_Sub13_Sub1_14.method2976(9);
			Static176.aClass2_Sub13_Sub1_14.method2921(Static38.anInt944 + local18);
			Static176.aClass2_Sub13_Sub1_14.method2921(local27);
			Static176.aClass2_Sub13_Sub1_14.method2964(local10 + Static49.anInt1133);
		}
		if (local14 == 23) {
			Static53.method926(local18, local31, local10);
			Static176.aClass2_Sub13_Sub1_14.method2976(174);
			Static176.aClass2_Sub13_Sub1_14.method2938((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static176.aClass2_Sub13_Sub1_14.method2938(local18 + Static38.anInt944);
			Static176.aClass2_Sub13_Sub1_14.method2921(Static49.anInt1133 + local10);
		}
		if (local14 == 10) {
			Static176.aClass2_Sub13_Sub1_14.method2976(186);
			Static176.aClass2_Sub13_Sub1_14.method2952(local18);
			local852 = Static140.method2337(local18);
			if (local852.anIntArrayArray35 != null && local852.anIntArrayArray35[0][0] == 5) {
				local1105 = local852.anIntArrayArray35[0][1];
				if (Static165.anIntArray317[local1105] != local852.anIntArray349[0]) {
					Static165.anIntArray317[local1105] = local852.anIntArray349[0];
					Static164.method2769(local1105);
				}
			}
		}
		if (local14 == 32) {
			local192 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local27];
			if (local192 != null) {
				Static51.method905(1, 1, local192.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local192.anIntArray318[0], 0, 0);
				Static129.anInt2804 = Static61.anInt1320;
				Static175.anInt3819 = 2;
				Static82.anInt1768 = 0;
				Static55.anInt1205 = Static114.anInt2394;
				Static176.aClass2_Sub13_Sub1_14.method2976(30);
				Static176.aClass2_Sub13_Sub1_14.method2938(local27);
			}
		}
		if (local14 == 28) {
			local852 = Static114.method1938(local18, local10);
			if (local852 != null) {
				Static57.method963();
				Static86.method2727(local18, Static28.method506(Static111.method1895(local852)), local10);
				Static124.anInt2746 = 0;
				Static103.aClass49_1026 = Static7.method108(local852);
				if (Static103.aClass49_1026 == null) {
					Static103.aClass49_1026 = Static117.aClass49_1124;
				}
				if (local852.aBoolean171) {
					Static150.aClass49_1450 = Static33.method692(new Class49[] { local852.aClass49_1709, Static103.aClass49_1031 });
					return;
				}
				Static150.aClass49_1450 = Static33.method692(new Class49[] { Static36.aClass49_479, local852.aClass49_1715, Static103.aClass49_1031 });
			}
			return;
		}
		if (local14 == 5) {
			local123 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local27];
			if (local123 != null) {
				Static51.method905(1, 1, local123.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local123.anIntArray318[0], 0, 0);
				Static129.anInt2804 = Static61.anInt1320;
				Static175.anInt3819 = 2;
				Static82.anInt1768 = 0;
				Static55.anInt1205 = Static114.anInt2394;
				Static176.aClass2_Sub13_Sub1_14.method2976(25);
				Static176.aClass2_Sub13_Sub1_14.method2964(local27);
			}
		}
		if (local14 == 38) {
			local123 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local27];
			if (local123 != null) {
				Static51.method905(1, 1, local123.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local123.anIntArray318[0], 0, 0);
				Static55.anInt1205 = Static114.anInt2394;
				Static129.anInt2804 = Static61.anInt1320;
				Static175.anInt3819 = 2;
				Static82.anInt1768 = 0;
				Static176.aClass2_Sub13_Sub1_14.method2976(12);
				Static176.aClass2_Sub13_Sub1_14.method2938(local27);
			}
		}
		if (local14 == 30) {
			local56 = Static51.method905(0, 0, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			if (!local56) {
				Static51.method905(1, 1, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			}
			Static129.anInt2804 = Static61.anInt1320;
			Static175.anInt3819 = 2;
			Static55.anInt1205 = Static114.anInt2394;
			Static82.anInt1768 = 0;
			Static176.aClass2_Sub13_Sub1_14.method2976(148);
			Static176.aClass2_Sub13_Sub1_14.method2967(local27);
			Static176.aClass2_Sub13_Sub1_14.method2938(Static49.anInt1133 + local10);
			Static176.aClass2_Sub13_Sub1_14.method2964(Static38.anInt944 + local18);
		}
		if (local14 == 25) {
			Static117.method1970(Static66.anInt1396, local10, local18);
		}
		if (local14 == 19) {
			Static53.method926(local18, local31, local10);
			Static176.aClass2_Sub13_Sub1_14.method2976(107);
			Static176.aClass2_Sub13_Sub1_14.method2921(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static176.aClass2_Sub13_Sub1_14.method2964(local18 + Static38.anInt944);
			Static176.aClass2_Sub13_Sub1_14.method2964(Static49.anInt1133 + local10);
		}
		if (local14 == 26) {
			local192 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local27];
			if (local192 != null) {
				Static51.method905(1, 1, local192.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local192.anIntArray318[0], 0, 0);
				Static129.anInt2804 = Static61.anInt1320;
				Static82.anInt1768 = 0;
				Static175.anInt3819 = 2;
				Static55.anInt1205 = Static114.anInt2394;
				Static176.aClass2_Sub13_Sub1_14.method2976(151);
				Static176.aClass2_Sub13_Sub1_14.method2964(Static66.anInt1393);
				Static176.aClass2_Sub13_Sub1_14.method2964(local27);
				Static176.aClass2_Sub13_Sub1_14.method2964(Static43.anInt1036);
				Static176.aClass2_Sub13_Sub1_14.method2952(Static87.anInt2931);
			}
		}
		if (local14 == 16) {
			Static129.method2182();
		}
		if (local14 == 7) {
			Static176.aClass2_Sub13_Sub1_14.method2976(125);
			Static176.aClass2_Sub13_Sub1_14.method2938(local27);
			Static176.aClass2_Sub13_Sub1_14.method2921(local10);
			Static176.aClass2_Sub13_Sub1_14.method2968(local18);
			Static162.anInt3604 = 0;
			Static94.aClass85_7 = Static140.method2337(local18);
			Static71.anInt1467 = local10;
		}
		if (local14 == 58) {
			Static53.method926(local18, local31, local10);
			Static176.aClass2_Sub13_Sub1_14.method2976(191);
			Static176.aClass2_Sub13_Sub1_14.method2964(local18 + Static38.anInt944);
			Static176.aClass2_Sub13_Sub1_14.method2938((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static176.aClass2_Sub13_Sub1_14.method2938(local10 + Static49.anInt1133);
		}
		if (local14 == 44) {
			Static176.aClass2_Sub13_Sub1_14.method2976(224);
			Static176.aClass2_Sub13_Sub1_14.method2967(Static7.anInt138);
			Static176.aClass2_Sub13_Sub1_14.method2920(Static148.anInt3151);
			Static176.aClass2_Sub13_Sub1_14.method2921(local10);
			Static176.aClass2_Sub13_Sub1_14.method2920(local18);
		}
		if (local14 == 43) {
			local56 = Static51.method905(0, 0, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			if (!local56) {
				Static51.method905(1, 1, local10, 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local18, 0, 0);
			}
			Static129.anInt2804 = Static61.anInt1320;
			Static55.anInt1205 = Static114.anInt2394;
			Static175.anInt3819 = 2;
			Static82.anInt1768 = 0;
			Static176.aClass2_Sub13_Sub1_14.method2976(88);
			Static176.aClass2_Sub13_Sub1_14.method2918(Static148.anInt3151);
			Static176.aClass2_Sub13_Sub1_14.method2938(local27);
			Static176.aClass2_Sub13_Sub1_14.method2938(local18 + Static38.anInt944);
			Static176.aClass2_Sub13_Sub1_14.method2938(local10 + Static49.anInt1133);
			Static176.aClass2_Sub13_Sub1_14.method2967(Static7.anInt138);
		}
		if (local14 == 1006) {
			Static55.anInt1205 = Static114.anInt2394;
			Static129.anInt2804 = Static61.anInt1320;
			Static175.anInt3819 = 2;
			Static82.anInt1768 = 0;
			Static176.aClass2_Sub13_Sub1_14.method2976(193);
			Static176.aClass2_Sub13_Sub1_14.method2964(local27);
		}
		if (Static124.anInt2746 != 0) {
			Static124.anInt2746 = 0;
			Static102.method1756(Static140.method2337(Static87.anInt2931));
		}
		if (Static108.aBoolean93) {
			Static57.method963();
		}
		if (Static94.aClass85_7 != null && Static162.anInt3604 == 0) {
			Static102.method1756(Static94.aClass85_7);
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(BI)Lclient!hh;")
	public static Class2_Sub2_Sub8 method106(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub8 local10 = (Class2_Sub2_Sub8) Static131.aClass74_92.method2345((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static48.aClass11_45.method2049(arg0, 3);
		local10 = new Class2_Sub2_Sub8();
		if (local28 != null) {
			local10.method1181(new Class2_Sub13(local28));
		}
		Static131.aClass74_92.method2341((long) arg0, local10);
		return local10;
	}
}
