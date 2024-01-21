import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	public static int anInt1517 = 0;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "Lclient!je;")
	public static Class40 aClass40_750 = Static69.method1231("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!je;")
	public static Class40 aClass40_751 = Static69.method1231("gleiten:");

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "Lclient!je;")
	private static Class40 aClass40_752 = Static69.method1231("Free world");

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "Lclient!je;")
	public static Class40 aClass40_753 = aClass40_752;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Lclient!je;")
	public static Class40 aClass40_754 = Static69.method1231("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	public static int anInt1520 = 0;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
	public static int anInt1521 = 0;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
	public static int anInt1525 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)Z")
	private static boolean method1026(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IJ)V")
	private static void method1027(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static114.anInt2621 >= 100 && Static81.anInt2090 != 1 || Static114.anInt2621 >= 200) {
			Static72.method1228(Static123.aClass40_1554, Static43.aClass40_568, 0);
			return;
		}
		@Pc(43) Class40 local43 = Static74.method665(arg0).method965();
		for (@Pc(45) int local45 = 0; local45 < Static114.anInt2621; local45++) {
			if (Static88.aLongArray7[local45] == arg0) {
				Static72.method1228(Static40.method722(new Class40[] { local43, Static7.aClass40_175 }), Static43.aClass40_568, 0);
				return;
			}
		}
		for (@Pc(78) int local78 = 0; local78 < Static75.anInt1945; local78++) {
			if (Static10.aLongArray8[local78] == arg0) {
				Static72.method1228(Static40.method722(new Class40[] { Static18.aClass40_320, local43, Static55.aClass40_724 }), Static43.aClass40_568, 0);
				return;
			}
		}
		if (local43.method960(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass40_892)) {
			Static72.method1228(Static43.aClass40_567, Static43.aClass40_568, 0);
			return;
		}
		Static85.aClass40Array17[Static114.anInt2621] = local43;
		Static88.aLongArray7[Static114.anInt2621] = arg0;
		Static39.anIntArray104[Static114.anInt2621] = 0;
		Static3.anIntArray7[Static114.anInt2621] = 0;
		Static21.anInt643 = Static70.anInt1886;
		Static114.anInt2621++;
		Static57.aClass2_Sub9_Sub1_2.method673(66);
		Static57.aClass2_Sub9_Sub1_2.method647(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!ef;)V")
	public static void method1028(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(4) Object[] local4 = arg0.anObjectArray1;
		@Pc(14) int local14 = (Integer) local4[0];
		@Pc(18) Class2_Sub1_Sub9 local18 = Static125.method2079(local14);
		if (local18 == null) {
			return;
		}
		Static17.anInt435 = 0;
		@Pc(25) int local25 = 0;
		@Pc(28) int[] local28 = local18.anIntArray235;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = 0;
		@Pc(42) byte local42 = -1;
		@Pc(45) int[] local45 = local18.anIntArray234;
		@Pc(59) int local59;
		@Pc(72) int local72;
		try {
			@Pc(47) int local47 = 0;
			Static118.anIntArray326 = new int[local18.anInt2148];
			@Pc(53) int local53 = 0;
			Static80.aClass40Array10 = new Class40[local18.anInt2151];
			for (local59 = 1; local59 < local4.length; local59++) {
				if (local4[local59] instanceof Integer) {
					local72 = (Integer) local4[local59];
					if (local72 == -2147483647) {
						local72 = arg0.anInt722;
					}
					if (local72 == -2147483646) {
						local72 = arg0.anInt725;
					}
					if (local72 == -2147483645) {
						local72 = arg0.aClass2_Sub13_4 == null ? -1 : arg0.aClass2_Sub13_4.anInt1560;
					}
					if (local72 == -2147483644) {
						local72 = arg0.anInt714;
					}
					if (local72 == -2147483643) {
						local72 = arg0.aClass2_Sub13_4 == null ? -1 : arg0.aClass2_Sub13_4.anInt1578;
					}
					if (local72 == -2147483642) {
						local72 = arg0.aClass2_Sub13_2 == null ? -1 : arg0.aClass2_Sub13_2.anInt1560;
					}
					if (local72 == -2147483641) {
						local72 = arg0.aClass2_Sub13_2 == null ? -1 : arg0.aClass2_Sub13_2.anInt1578;
					}
					if (local72 == -2147483640) {
						local72 = arg0.anInt717;
					}
					if (local72 == -2147483639) {
						local72 = arg0.anInt718;
					}
					Static118.anIntArray326[local47++] = local72;
				} else if (local4[local59] instanceof Class40) {
					@Pc(179) Class40 local179 = (Class40) local4[local59];
					if (local179.method960(Static84.aClass40_1165)) {
						local179 = arg0.aClass40_418;
					}
					Static80.aClass40Array10[local53++] = local179;
				}
			}
			local72 = 0;
			label1966: while (true) {
				local72++;
				if (local72 > 200000) {
					throw new RuntimeException("slow");
				}
				local30++;
				@Pc(217) int local217 = local28[local30];
				@Pc(775) int local775;
				@Pc(637) int local637;
				@Pc(661) int local661;
				@Pc(781) int local781;
				@Pc(595) Class40 local595;
				if (local217 < 100) {
					if (local217 == 0) {
						Static126.anIntArray344[local25++] = local45[local30];
						continue;
					}
					@Pc(238) int local238;
					if (local217 == 1) {
						local238 = local45[local30];
						Static126.anIntArray344[local25++] = Static35.anIntArray96[local238];
						continue;
					}
					if (local217 == 2) {
						local238 = local45[local30];
						local25--;
						Static35.anIntArray96[local238] = Static126.anIntArray344[local25];
						continue;
					}
					if (local217 == 3) {
						Static68.aClass40Array9[local32++] = local18.aClass40Array12[local30];
						continue;
					}
					if (local217 == 6) {
						local30 += local45[local30];
						continue;
					}
					if (local217 == 7) {
						local25 -= 2;
						if (Static126.anIntArray344[local25 + 1] != Static126.anIntArray344[local25]) {
							local30 += local45[local30];
						}
						continue;
					}
					if (local217 == 8) {
						local25 -= 2;
						if (Static126.anIntArray344[local25 + 1] == Static126.anIntArray344[local25]) {
							local30 += local45[local30];
						}
						continue;
					}
					if (local217 == 9) {
						local25 -= 2;
						if (Static126.anIntArray344[local25] < Static126.anIntArray344[local25 + 1]) {
							local30 += local45[local30];
						}
						continue;
					}
					if (local217 == 10) {
						local25 -= 2;
						if (Static126.anIntArray344[local25] > Static126.anIntArray344[local25 + 1]) {
							local30 += local45[local30];
						}
						continue;
					}
					if (local217 == 21) {
						if (Static17.anInt435 == 0) {
							return;
						}
						@Pc(414) Class72 local414 = Static120.aClass72Array1[--Static17.anInt435];
						Static80.aClass40Array10 = local414.aClass40Array19;
						Static118.anIntArray326 = local414.anIntArray296;
						local18 = local414.aClass2_Sub1_Sub9_1;
						local28 = local18.anIntArray235;
						local45 = local18.anIntArray234;
						local30 = local414.anInt2617;
						continue;
					}
					if (local217 == 25) {
						local238 = local45[local30];
						Static126.anIntArray344[local25++] = Static49.method881(local238);
						continue;
					}
					if (local217 == 27) {
						local238 = local45[local30];
						local25--;
						Static100.method1794(Static126.anIntArray344[local25], local238);
						continue;
					}
					if (local217 == 31) {
						local25 -= 2;
						if (Static126.anIntArray344[local25] <= Static126.anIntArray344[local25 + 1]) {
							local30 += local45[local30];
						}
						continue;
					}
					if (local217 == 32) {
						local25 -= 2;
						if (Static126.anIntArray344[local25 + 1] <= Static126.anIntArray344[local25]) {
							local30 += local45[local30];
						}
						continue;
					}
					if (local217 == 33) {
						Static126.anIntArray344[local25++] = Static118.anIntArray326[local45[local30]];
						continue;
					}
					@Pc(539) int local539;
					if (local217 == 34) {
						local539 = local45[local30];
						local25--;
						Static118.anIntArray326[local539] = Static126.anIntArray344[local25];
						continue;
					}
					if (local217 == 35) {
						Static68.aClass40Array9[local32++] = Static80.aClass40Array10[local45[local30]];
						continue;
					}
					if (local217 == 36) {
						local539 = local45[local30];
						local32--;
						Static80.aClass40Array10[local539] = Static68.aClass40Array9[local32];
						continue;
					}
					if (local217 == 37) {
						local238 = local45[local30];
						local32 -= local238;
						local595 = Static86.method2166(Static68.aClass40Array9, local238, local32);
						Static68.aClass40Array9[local32++] = local595;
						continue;
					}
					if (local217 == 38) {
						local25--;
						continue;
					}
					if (local217 == 39) {
						local32--;
						continue;
					}
					if (local217 == 40) {
						local238 = local45[local30];
						@Pc(627) Class2_Sub1_Sub9 local627 = Static125.method2079(local238);
						@Pc(631) int[] local631 = new int[local627.anInt2148];
						@Pc(635) Class40[] local635 = new Class40[local627.anInt2151];
						for (local637 = 0; local637 < local627.anInt2161; local637++) {
							local631[local637] = Static126.anIntArray344[local25 + local637 - local627.anInt2161];
						}
						for (local661 = 0; local661 < local627.anInt2157; local661++) {
							local635[local661] = Static68.aClass40Array9[local661 + local32 - local627.anInt2157];
						}
						local32 -= local627.anInt2157;
						local25 -= local627.anInt2161;
						@Pc(697) Class72 local697 = new Class72();
						local697.anInt2617 = local30;
						local697.aClass2_Sub1_Sub9_1 = local18;
						local18 = local627;
						local697.aClass40Array19 = Static80.aClass40Array10;
						local30 = -1;
						local697.anIntArray296 = Static118.anIntArray326;
						Static120.aClass72Array1[Static17.anInt435++] = local697;
						Static118.anIntArray326 = local631;
						local45 = local627.anIntArray234;
						Static80.aClass40Array10 = local635;
						local28 = local627.anIntArray235;
						continue;
					}
					if (local217 == 42) {
						Static126.anIntArray344[local25++] = Static85.anIntArray249[local45[local30]];
						continue;
					}
					if (local217 == 43) {
						local539 = local45[local30];
						local25--;
						Static85.anIntArray249[local539] = Static126.anIntArray344[local25];
						continue;
					}
					if (local217 == 44) {
						local238 = local45[local30] >> 16;
						local25--;
						local775 = Static126.anIntArray344[local25];
						local781 = local45[local30] & 0xFFFF;
						if (local775 >= 0 && local775 <= 5000) {
							Static118.anIntArray327[local238] = local775;
							@Pc(801) byte local801 = -1;
							if (local781 == 105) {
								local801 = 0;
							}
							local637 = 0;
							while (true) {
								if (local637 >= local775) {
									continue label1966;
								}
								Static110.anIntArrayArray20[local238][local637] = local801;
								local637++;
							}
						}
						throw new RuntimeException();
					}
					if (local217 == 45) {
						local25--;
						local781 = Static126.anIntArray344[local25];
						local238 = local45[local30];
						if (local781 >= 0 && local781 < Static118.anIntArray327[local238]) {
							Static126.anIntArray344[local25++] = Static110.anIntArrayArray20[local238][local781];
							continue;
						}
						throw new RuntimeException();
					}
					if (local217 == 46) {
						local25 -= 2;
						local238 = local45[local30];
						local781 = Static126.anIntArray344[local25];
						if (local781 >= 0 && Static118.anIntArray327[local238] > local781) {
							Static110.anIntArrayArray20[local238][local781] = Static126.anIntArray344[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local217 == 47) {
						@Pc(908) Class40 local908 = Static65.aClass40Array8[local45[local30]];
						if (local908 == null) {
							local908 = Static56.aClass40_732;
						}
						Static68.aClass40Array9[local32++] = local908;
						continue;
					}
					if (local217 == 48) {
						local539 = local45[local30];
						local32--;
						Static65.aClass40Array8[local539] = Static68.aClass40Array9[local32];
						continue;
					}
				}
				@Pc(940) boolean local940;
				if (local45[local30] == 1) {
					local940 = true;
				} else {
					local940 = false;
				}
				@Pc(1000) Class2_Sub13 local1000;
				@Pc(1027) int local1027;
				@Pc(1266) int local1266;
				@Pc(5893) Class2_Sub13 local5893;
				@Pc(5920) Class2_Sub13 local5920;
				if (local217 < 1000) {
					if (local217 == 100) {
						local25 -= 3;
						local781 = Static126.anIntArray344[local25];
						local775 = Static126.anIntArray344[local25 + 1];
						local1027 = Static126.anIntArray344[local25 + 2];
						if (local775 == 0) {
							throw new RuntimeException();
						}
						local5893 = Static55.method972(local781);
						if (local5893.aClass2_Sub13Array2 == null) {
							local5893.aClass2_Sub13Array2 = new Class2_Sub13[local1027 + 1];
						}
						if (local1027 >= local5893.aClass2_Sub13Array2.length) {
							@Pc(6897) Class2_Sub13[] local6897 = new Class2_Sub13[local1027 + 1];
							for (local1266 = 0; local1266 < local5893.aClass2_Sub13Array2.length; local1266++) {
								local6897[local1266] = local5893.aClass2_Sub13Array2[local1266];
							}
							local5893.aClass2_Sub13Array2 = local6897;
						}
						if (local1027 > 0 && local5893.aClass2_Sub13Array2[local1027 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1027 - 1));
						}
						@Pc(6943) Class2_Sub13 local6943 = new Class2_Sub13();
						local6943.anInt1578 = local1027;
						local6943.anInt1543 = local6943.anInt1560 = local5893.anInt1560;
						local6943.anInt1583 = local775;
						local6943.aBoolean112 = true;
						local5893.aClass2_Sub13Array2[local1027] = local6943;
						if (local940) {
							Static77.aClass2_Sub13_12 = local6943;
						} else {
							Static29.aClass2_Sub13_3 = local6943;
						}
						Static17.method316(local5893);
						continue;
					}
					if (local217 == 101) {
						local1000 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
						@Pc(6993) Class2_Sub13 local6993 = Static55.method972(local1000.anInt1560);
						local6993.aClass2_Sub13Array2[local1000.anInt1578] = null;
						Static17.method316(local6993);
						continue;
					}
					if (local217 == 102) {
						local25--;
						local1000 = Static55.method972(Static126.anIntArray344[local25]);
						local1000.aClass2_Sub13Array2 = null;
						Static17.method316(local1000);
						continue;
					}
					if (local217 == 200) {
						local25 -= 2;
						local775 = Static126.anIntArray344[local25 + 1];
						local781 = Static126.anIntArray344[local25];
						local5920 = Static87.method894(local775, local781);
						if (local5920 != null && local775 != -1) {
							Static126.anIntArray344[local25++] = 1;
							if (local940) {
								Static77.aClass2_Sub13_12 = local5920;
							} else {
								Static29.aClass2_Sub13_3 = local5920;
							}
							continue;
						}
						Static126.anIntArray344[local25++] = 0;
						continue;
					}
				} else if (local217 >= 1000 && local217 < 1100 || local217 >= 2000 && local217 < 2100) {
					if (local217 >= 2000) {
						local217 -= 1000;
						local25--;
						local1000 = Static55.method972(Static126.anIntArray344[local25]);
					} else {
						local1000 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
					}
					if (local217 == 1000) {
						local25 -= 2;
						local1000.anInt1591 = Static126.anIntArray344[local25];
						local1000.anInt1545 = Static126.anIntArray344[local25 + 1];
						Static17.method316(local1000);
						continue;
					}
					if (local217 == 1001) {
						local25 -= 2;
						local1000.anInt1599 = Static126.anIntArray344[local25];
						local1000.anInt1568 = Static126.anIntArray344[local25 + 1];
						Static17.method316(local1000);
						continue;
					}
					if (local217 == 1003) {
						local25--;
						@Pc(6834) boolean local6834 = Static126.anIntArray344[local25] == 1;
						if (local6834 != local1000.aBoolean118) {
							local1000.aBoolean118 = local6834;
							Static17.method316(local1000);
						}
						continue;
					}
				} else {
					@Pc(1165) Class40 local1165;
					if (local217 >= 1100 && local217 < 1200 || local217 >= 2100 && local217 < 2200) {
						if (local217 < 2000) {
							local1000 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
						} else {
							local25--;
							local1000 = Static55.method972(Static126.anIntArray344[local25]);
							local217 -= 1000;
						}
						if (local217 == 1100) {
							local25 -= 2;
							local1000.anInt1606 = Static126.anIntArray344[local25];
							if (local1000.anInt1606 > local1000.anInt1534 - local1000.anInt1599) {
								local1000.anInt1606 = local1000.anInt1534 - local1000.anInt1599;
							}
							if (local1000.anInt1606 < 0) {
								local1000.anInt1606 = 0;
							}
							local1000.anInt1598 = Static126.anIntArray344[local25 + 1];
							if (local1000.anInt1598 > local1000.anInt1535 - local1000.anInt1568) {
								local1000.anInt1598 = local1000.anInt1535 - local1000.anInt1568;
							}
							if (local1000.anInt1598 < 0) {
								local1000.anInt1598 = 0;
							}
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1101) {
							local25--;
							local1000.anInt1549 = Static126.anIntArray344[local25];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1102) {
							local25--;
							local1000.aBoolean111 = Static126.anIntArray344[local25] == 1;
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1103) {
							local25--;
							local1000.anInt1558 = Static126.anIntArray344[local25];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1104) {
							local25--;
							local1000.anInt1590 = Static126.anIntArray344[local25];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1105) {
							local25--;
							local1000.anInt1607 = Static126.anIntArray344[local25];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1106) {
							local25--;
							local1000.anInt1544 = Static126.anIntArray344[local25];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1107) {
							local25--;
							local1000.aBoolean116 = Static126.anIntArray344[local25] == 1;
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1108) {
							local1000.anInt1559 = 1;
							local25--;
							local1000.anInt1562 = Static126.anIntArray344[local25];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1109) {
							local25 -= 6;
							local1000.anInt1593 = Static126.anIntArray344[local25];
							local1000.anInt1577 = Static126.anIntArray344[local25 + 1];
							local1000.anInt1580 = Static126.anIntArray344[local25 + 2];
							local1000.anInt1557 = Static126.anIntArray344[local25 + 3];
							local1000.anInt1556 = Static126.anIntArray344[local25 + 4];
							local1000.anInt1539 = Static126.anIntArray344[local25 + 5];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1110) {
							local25--;
							local775 = Static126.anIntArray344[local25];
							if (local775 != local1000.anInt1575) {
								local1000.anInt1595 = 0;
								local1000.anInt1575 = local775;
								local1000.anInt1582 = 0;
								Static17.method316(local1000);
							}
							continue;
						}
						if (local217 == 1111) {
							local25--;
							local1000.aBoolean114 = Static126.anIntArray344[local25] == 1;
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1112) {
							local32--;
							local1165 = Static68.aClass40Array9[local32];
							if (!local1165.method960(local1000.aClass40_768)) {
								local1000.aClass40_768 = local1165;
								Static17.method316(local1000);
							}
							continue;
						}
						if (local217 == 1113) {
							local25--;
							local1000.anInt1564 = Static126.anIntArray344[local25];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1114) {
							local25 -= 3;
							local1000.anInt1585 = Static126.anIntArray344[local25];
							local1000.anInt1566 = Static126.anIntArray344[local25 + 1];
							local1000.anInt1548 = Static126.anIntArray344[local25 + 2];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1115) {
							local25--;
							local1000.aBoolean117 = Static126.anIntArray344[local25] == 1;
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1116) {
							local25--;
							local1000.anInt1589 = Static126.anIntArray344[local25];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1117) {
							local25--;
							local1000.anInt1569 = Static126.anIntArray344[local25];
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1118) {
							local25--;
							local1000.aBoolean108 = Static126.anIntArray344[local25] == 1;
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1119) {
							local25--;
							local1000.aBoolean119 = Static126.anIntArray344[local25] == 1;
							Static17.method316(local1000);
							continue;
						}
						if (local217 == 1120) {
							local25 -= 2;
							local1000.anInt1534 = Static126.anIntArray344[local25];
							local1000.anInt1535 = Static126.anIntArray344[local25 + 1];
							Static17.method316(local1000);
							continue;
						}
					} else if (local217 >= 1200 && local217 < 1300 || local217 >= 2200 && local217 < 2300) {
						if (local217 < 2000) {
							local1000 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
						} else {
							local217 -= 1000;
							local25--;
							local1000 = Static55.method972(Static126.anIntArray344[local25]);
						}
						Static17.method316(local1000);
						if (local217 == 1200) {
							local25 -= 2;
							local775 = Static126.anIntArray344[local25];
							local1027 = Static126.anIntArray344[local25 + 1];
							local1000.anInt1565 = local1027;
							local1000.anInt1550 = local775;
							@Pc(1037) Class2_Sub1_Sub10 local1037 = Static102.method1800(local775);
							local1000.anInt1557 = local1037.anInt2240;
							local1000.anInt1580 = local1037.anInt2248;
							local1000.anInt1577 = local1037.anInt2218;
							local1000.anInt1556 = local1037.anInt2222;
							local1000.anInt1539 = local1037.anInt2239;
							local1000.anInt1593 = local1037.anInt2224;
							if (local1000.anInt1599 > 0) {
								local1000.anInt1539 = local1000.anInt1539 * 32 / local1000.anInt1599;
							}
							continue;
						}
						if (local217 == 1201) {
							local1000.anInt1559 = 2;
							local25--;
							local1000.anInt1562 = Static126.anIntArray344[local25];
							continue;
						}
						if (local217 == 1202) {
							local1000.anInt1559 = 3;
							local1000.anInt1562 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass41_1.method993();
							continue;
						}
					} else if (local217 >= 1300 && local217 < 1400 || local217 >= 2300 && local217 < 2400) {
						if (local217 >= 2000) {
							local217 -= 1000;
							local25--;
							local1000 = Static55.method972(Static126.anIntArray344[local25]);
						} else {
							local1000 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
						}
						if (local217 == 1300) {
							local25--;
							local775 = Static126.anIntArray344[local25] - 1;
							if (local775 >= 0 && local775 <= 9) {
								local32--;
								local1000.method1047(local775, Static68.aClass40Array9[local32]);
								continue;
							}
							local32--;
							continue;
						}
						if (local217 == 1301) {
							local25 -= 2;
							local775 = Static126.anIntArray344[local25];
							local1027 = Static126.anIntArray344[local25 + 1];
							local1000.aClass2_Sub13_8 = Static87.method894(local1027, local775);
							continue;
						}
						if (local217 == 1302) {
							local25--;
							local1000.aBoolean110 = Static126.anIntArray344[local25] == 1;
							continue;
						}
						if (local217 == 1303) {
							local25--;
							local1000.anInt1581 = Static126.anIntArray344[local25];
							continue;
						}
						if (local217 == 1304) {
							local25--;
							local1000.anInt1584 = Static126.anIntArray344[local25];
							continue;
						}
						if (local217 == 1305) {
							local32--;
							local1000.aClass40_777 = Static68.aClass40Array9[local32];
							continue;
						}
						if (local217 == 1306) {
							local32--;
							local1000.aClass40_778 = Static68.aClass40Array9[local32];
							continue;
						}
						if (local217 == 1307) {
							local1000.aClass40Array6 = null;
							continue;
						}
					} else {
						if (local217 >= 1400 && local217 < 1500 || local217 >= 2400 && local217 < 2500) {
							if (local217 >= 2000) {
								local25--;
								local1000 = Static55.method972(Static126.anIntArray344[local25]);
								local217 -= 1000;
							} else {
								local1000 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
							}
							@Pc(1160) int[] local1160 = null;
							local32--;
							local1165 = Static68.aClass40Array9[local32];
							if (local1165.method950() > 0 && local1165.method982(local1165.method950() - 1) == 89) {
								local25--;
								local637 = Static126.anIntArray344[local25];
								if (local637 > 0) {
									local1160 = new int[local637];
									while (local637-- > 0) {
										local25--;
										local1160[local637] = Static126.anIntArray344[local25];
									}
								}
								local1165 = local1165.method953(0, local1165.method950() - 1);
							}
							@Pc(1221) Object[] local1221 = new Object[local1165.method950() + 1];
							for (local661 = local1221.length - 1; local661 >= 1; local661--) {
								if (local1165.method982(local661 - 1) == 115) {
									local32--;
									local1221[local661] = Static68.aClass40Array9[local32];
								} else {
									local25--;
									local1221[local661] = Integer.valueOf(Static126.anIntArray344[local25]);
								}
							}
							local25--;
							local1266 = Static126.anIntArray344[local25];
							if (local1266 == -1) {
								local1221 = null;
							} else {
								local1221[0] = Integer.valueOf(local1266);
							}
							if (local217 == 1416) {
								local1000.anObjectArray15 = local1221;
							}
							if (local217 == 1405) {
								local1000.anObjectArray6 = local1221;
							}
							if (local217 == 1400) {
								local1000.anObjectArray22 = local1221;
							}
							if (local217 == 1409) {
								local1000.anObjectArray4 = local1221;
							}
							if (local217 == 1411) {
								local1000.anObjectArray24 = local1221;
							}
							if (local217 == 1419) {
								local1000.anObjectArray7 = local1221;
							}
							if (local217 == 1402) {
								local1000.anObjectArray23 = local1221;
							}
							if (local217 == 1424) {
								local1000.anObjectArray18 = local1221;
							}
							if (local217 == 1412) {
								local1000.anObjectArray13 = local1221;
							}
							if (local217 == 1410) {
								local1000.anObjectArray16 = local1221;
							}
							if (local217 == 1423) {
								local1000.anObjectArray21 = local1221;
							}
							if (local217 == 1407) {
								local1000.anIntArray160 = local1160;
								local1000.anObjectArray26 = local1221;
							}
							if (local217 == 1418) {
								local1000.anObjectArray20 = local1221;
							}
							if (local217 == 1403) {
								local1000.anObjectArray9 = local1221;
							}
							if (local217 == 1415) {
								local1000.anObjectArray19 = local1221;
								local1000.anIntArray157 = local1160;
							}
							if (local217 == 1404) {
								local1000.anObjectArray12 = local1221;
							}
							if (local217 == 1421) {
								local1000.anObjectArray17 = local1221;
							}
							if (local217 == 1401) {
								local1000.anObjectArray5 = local1221;
							}
							local1000.aBoolean115 = true;
							if (local217 == 1408) {
								local1000.anObjectArray11 = local1221;
							}
							if (local217 == 1414) {
								local1000.anObjectArray3 = local1221;
								local1000.anIntArray156 = local1160;
							}
							if (local217 == 1417) {
								local1000.anObjectArray10 = local1221;
							}
							if (local217 == 1406) {
								local1000.anObjectArray25 = local1221;
							}
							if (local217 == 1420) {
								local1000.anObjectArray27 = local1221;
							}
							if (local217 == 1422) {
								local1000.anObjectArray14 = local1221;
							}
							continue;
						}
						if (local217 < 1600) {
							local1000 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
							if (local217 == 1500) {
								Static126.anIntArray344[local25++] = local1000.anInt1591;
								continue;
							}
							if (local217 == 1501) {
								Static126.anIntArray344[local25++] = local1000.anInt1545;
								continue;
							}
							if (local217 == 1502) {
								Static126.anIntArray344[local25++] = local1000.anInt1599;
								continue;
							}
							if (local217 == 1503) {
								Static126.anIntArray344[local25++] = local1000.anInt1568;
								continue;
							}
							if (local217 == 1504) {
								Static126.anIntArray344[local25++] = local1000.aBoolean118 ? 1 : 0;
								continue;
							}
							if (local217 == 1505) {
								Static126.anIntArray344[local25++] = local1000.anInt1543;
								continue;
							}
						} else if (local217 < 1700) {
							local1000 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
							if (local217 == 1600) {
								Static126.anIntArray344[local25++] = local1000.anInt1606;
								continue;
							}
							if (local217 == 1601) {
								Static126.anIntArray344[local25++] = local1000.anInt1598;
								continue;
							}
							if (local217 == 1602) {
								Static68.aClass40Array9[local32++] = local1000.aClass40_768;
								continue;
							}
							if (local217 == 1603) {
								Static126.anIntArray344[local25++] = local1000.anInt1534;
								continue;
							}
							if (local217 == 1604) {
								Static126.anIntArray344[local25++] = local1000.anInt1535;
								continue;
							}
							if (local217 == 1605) {
								Static126.anIntArray344[local25++] = local1000.anInt1539;
								continue;
							}
							if (local217 == 1606) {
								Static126.anIntArray344[local25++] = local1000.anInt1580;
								continue;
							}
							if (local217 == 1607) {
								Static126.anIntArray344[local25++] = local1000.anInt1556;
								continue;
							}
							if (local217 == 1608) {
								Static126.anIntArray344[local25++] = local1000.anInt1557;
								continue;
							}
						} else if (local217 < 1800) {
							local1000 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
							if (local217 == 1700) {
								Static126.anIntArray344[local25++] = local1000.anInt1550;
								continue;
							}
							if (local217 == 1701) {
								if (local1000.anInt1550 == -1) {
									Static126.anIntArray344[local25++] = 0;
								} else {
									Static126.anIntArray344[local25++] = local1000.anInt1565;
								}
								continue;
							}
							if (local217 == 1702) {
								Static126.anIntArray344[local25++] = local1000.anInt1578;
								continue;
							}
						} else if (local217 < 1900) {
							local1000 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
							if (local217 == 1800) {
								Static126.anIntArray344[local25++] = Static100.method1793(Static116.method1945(local1000));
								continue;
							}
							if (local217 == 1801) {
								local25--;
								local775 = Static126.anIntArray344[local25];
								@Pc(1711) int local1711 = local775 - 1;
								if (local1000.aClass40Array6 != null && local1711 < local1000.aClass40Array6.length && local1000.aClass40Array6[local1711] != null) {
									Static68.aClass40Array9[local32++] = local1000.aClass40Array6[local1711];
									continue;
								}
								Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								continue;
							}
							if (local217 == 1802) {
								if (local1000.aClass40_777 == null) {
									Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								} else {
									Static68.aClass40Array9[local32++] = local1000.aClass40_777;
								}
								continue;
							}
						} else if (local217 < 2600) {
							local25--;
							local1000 = Static55.method972(Static126.anIntArray344[local25]);
							if (local217 == 2500) {
								Static126.anIntArray344[local25++] = local1000.anInt1591;
								continue;
							}
							if (local217 == 2501) {
								Static126.anIntArray344[local25++] = local1000.anInt1545;
								continue;
							}
							if (local217 == 2502) {
								Static126.anIntArray344[local25++] = local1000.anInt1599;
								continue;
							}
							if (local217 == 2503) {
								Static126.anIntArray344[local25++] = local1000.anInt1568;
								continue;
							}
							if (local217 == 2504) {
								Static126.anIntArray344[local25++] = local1000.aBoolean118 ? 1 : 0;
								continue;
							}
							if (local217 == 2505) {
								Static126.anIntArray344[local25++] = local1000.anInt1543;
								continue;
							}
						} else if (local217 < 2700) {
							local25--;
							local1000 = Static55.method972(Static126.anIntArray344[local25]);
							if (local217 == 2600) {
								Static126.anIntArray344[local25++] = local1000.anInt1606;
								continue;
							}
							if (local217 == 2601) {
								Static126.anIntArray344[local25++] = local1000.anInt1598;
								continue;
							}
							if (local217 == 2602) {
								Static68.aClass40Array9[local32++] = local1000.aClass40_768;
								continue;
							}
							if (local217 == 2603) {
								Static126.anIntArray344[local25++] = local1000.anInt1534;
								continue;
							}
							if (local217 == 2604) {
								Static126.anIntArray344[local25++] = local1000.anInt1535;
								continue;
							}
							if (local217 == 2605) {
								Static126.anIntArray344[local25++] = local1000.anInt1539;
								continue;
							}
							if (local217 == 2606) {
								Static126.anIntArray344[local25++] = local1000.anInt1580;
								continue;
							}
							if (local217 == 2607) {
								Static126.anIntArray344[local25++] = local1000.anInt1556;
								continue;
							}
							if (local217 == 2608) {
								Static126.anIntArray344[local25++] = local1000.anInt1557;
								continue;
							}
						} else if (local217 < 2800) {
							if (local217 == 2700) {
								local25--;
								local1000 = Static55.method972(Static126.anIntArray344[local25]);
								Static126.anIntArray344[local25++] = local1000.anInt1550;
								continue;
							}
							if (local217 == 2701) {
								local25--;
								local1000 = Static55.method972(Static126.anIntArray344[local25]);
								if (local1000.anInt1550 == -1) {
									Static126.anIntArray344[local25++] = 0;
								} else {
									Static126.anIntArray344[local25++] = local1000.anInt1565;
								}
								continue;
							}
							if (local217 == 2702) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								@Pc(1932) Class2_Sub11 local1932 = (Class2_Sub11) Static61.aClass77_6.method2034((long) local781);
								if (local1932 == null) {
									Static126.anIntArray344[local25++] = 0;
								} else {
									Static126.anIntArray344[local25++] = 1;
								}
								continue;
							}
						} else if (local217 < 2900) {
							local25--;
							local1000 = Static55.method972(Static126.anIntArray344[local25]);
							if (local217 == 2800) {
								Static126.anIntArray344[local25++] = Static100.method1793(Static116.method1945(local1000));
								continue;
							}
							if (local217 == 2801) {
								local25--;
								local775 = Static126.anIntArray344[local25];
								local775--;
								if (local1000.aClass40Array6 != null && local775 < local1000.aClass40Array6.length && local1000.aClass40Array6[local775] != null) {
									Static68.aClass40Array9[local32++] = local1000.aClass40Array6[local775];
									continue;
								}
								Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								continue;
							}
							if (local217 == 2802) {
								if (local1000.aClass40_777 == null) {
									Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								} else {
									Static68.aClass40Array9[local32++] = local1000.aClass40_777;
								}
								continue;
							}
						} else if (local217 < 3200) {
							if (local217 == 3100) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								Static72.method1228(local595, Static21.aClass40_362, 0);
								continue;
							}
							if (local217 == 3101) {
								local25 -= 2;
								Static12.method2206(Static126.anIntArray344[local25 + 1], Static126.anIntArray344[local25], Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1);
								continue;
							}
							if (local217 == 3103) {
								Static65.method1143();
								continue;
							}
							if (local217 == 3104) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local775 = 0;
								if (local595.method980()) {
									local775 = local595.method974();
								}
								Static57.aClass2_Sub9_Sub1_2.method673(89);
								Static57.aClass2_Sub9_Sub1_2.method620(local775);
								continue;
							}
							if (local217 == 3105) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								Static57.aClass2_Sub9_Sub1_2.method673(39);
								Static57.aClass2_Sub9_Sub1_2.method647(local595.method981());
								continue;
							}
							if (local217 == 3106) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								Static57.aClass2_Sub9_Sub1_2.method673(40);
								Static57.aClass2_Sub9_Sub1_2.method644(local595.method950() + 1);
								Static57.aClass2_Sub9_Sub1_2.method664(local595);
								continue;
							}
							if (local217 == 3107) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								local32--;
								local1165 = Static68.aClass40Array9[local32];
								Static81.method1415(local1165, local781);
								continue;
							}
							if (local217 == 3108) {
								local25 -= 3;
								local1027 = Static126.anIntArray344[local25 + 2];
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								local5893 = Static55.method972(local1027);
								Static134.method1095(local5893, local781, local775);
								continue;
							}
							if (local217 == 3109) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								local5920 = local940 ? Static77.aClass2_Sub13_12 : Static29.aClass2_Sub13_3;
								Static134.method1095(local5920, local781, local775);
								continue;
							}
						} else if (local217 < 3300) {
							if (local217 == 3200) {
								local25 -= 3;
								Static61.method1111(Static126.anIntArray344[local25 + 2], Static126.anIntArray344[local25], Static126.anIntArray344[local25 + 1]);
								continue;
							}
							if (local217 == 3201) {
								local25--;
								Static126.method2092(Static126.anIntArray344[local25]);
								continue;
							}
							if (local217 == 3202) {
								local25 -= 2;
								Static24.method2215(Static126.anIntArray344[local25], Static126.anIntArray344[local25 + 1]);
								continue;
							}
						} else if (local217 < 3400) {
							if (local217 == 3300) {
								Static126.anIntArray344[local25++] = Static28.anInt704;
								continue;
							}
							if (local217 == 3301) {
								local25 -= 2;
								local775 = Static126.anIntArray344[local25 + 1];
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static97.method1768(local775, local781);
								continue;
							}
							if (local217 == 3302) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								Static126.anIntArray344[local25++] = Static114.method1894(local775, local781);
								continue;
							}
							if (local217 == 3303) {
								local25 -= 2;
								local775 = Static126.anIntArray344[local25 + 1];
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static68.method1193(local775, local781);
								continue;
							}
							if (local217 == 3304) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static61.method1114(local781).anInt2862;
								continue;
							}
							if (local217 == 3305) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static112.anIntArray297[local781];
								continue;
							}
							if (local217 == 3306) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static40.anIntArray109[local781];
								continue;
							}
							if (local217 == 3307) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static111.anIntArray294[local781];
								continue;
							}
							if (local217 == 3308) {
								local781 = Static105.anInt2531;
								local775 = (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 >> 7) + Static107.anInt2546;
								local1027 = (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 >> 7) + Static29.anInt720;
								Static126.anIntArray344[local25++] = local1027 + (local781 << 28) + (local775 << 14);
								continue;
							}
							if (local217 == 3309) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = local781 >> 14 & 0x3FFF;
								continue;
							}
							if (local217 == 3310) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = local781 >> 28;
								continue;
							}
							if (local217 == 3311) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = local781 & 0x3FFF;
								continue;
							}
							if (local217 == 3312) {
								Static126.anIntArray344[local25++] = Static92.aBoolean184 ? 1 : 0;
								continue;
							}
							if (local217 == 3313) {
								local25 -= 2;
								local775 = Static126.anIntArray344[local25 + 1];
								local781 = Static126.anIntArray344[local25] + 32768;
								Static126.anIntArray344[local25++] = Static97.method1768(local775, local781);
								continue;
							}
							if (local217 == 3314) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25] + 32768;
								local775 = Static126.anIntArray344[local25 + 1];
								Static126.anIntArray344[local25++] = Static114.method1894(local775, local781);
								continue;
							}
							if (local217 == 3315) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25] + 32768;
								local775 = Static126.anIntArray344[local25 + 1];
								Static126.anIntArray344[local25++] = Static68.method1193(local775, local781);
								continue;
							}
							if (local217 == 3316) {
								if (Static112.anInt2609 < 2) {
									Static126.anIntArray344[local25++] = 0;
								} else {
									Static126.anIntArray344[local25++] = Static112.anInt2609;
								}
								continue;
							}
							if (local217 == 3317) {
								Static126.anIntArray344[local25++] = Static1.anInt9;
								continue;
							}
							if (local217 == 3318) {
								Static126.anIntArray344[local25++] = Static15.anInt298;
								continue;
							}
							if (local217 == 3321) {
								Static126.anIntArray344[local25++] = Static54.anInt1414;
								continue;
							}
							if (local217 == 3322) {
								Static126.anIntArray344[local25++] = Static1.anInt12;
								continue;
							}
							if (local217 == 3323) {
								if (Static112.anInt2609 == 1) {
									Static126.anIntArray344[local25++] = 1;
								} else {
									Static126.anIntArray344[local25++] = 0;
								}
								continue;
							}
						} else if (local217 < 3500) {
							if (local217 == 3400) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								@Pc(5540) Class2_Sub1_Sub16 local5540 = Static10.method2131(local781);
								for (local637 = 0; local637 < local5540.anInt2935; local637++) {
									if (local775 == local5540.anIntArray350[local637]) {
										Static68.aClass40Array9[local32++] = local5540.aClass40Array23[local637];
										local5540 = null;
										break;
									}
								}
								if (local5540 != null) {
									Static68.aClass40Array9[local32++] = local5540.aClass40_1593;
								}
								continue;
							}
							if (local217 == 3408) {
								local25 -= 4;
								local781 = Static126.anIntArray344[local25];
								local1027 = Static126.anIntArray344[local25 + 2];
								local775 = Static126.anIntArray344[local25 + 1];
								local637 = Static126.anIntArray344[local25 + 3];
								@Pc(5612) Class2_Sub1_Sub16 local5612 = Static10.method2131(local1027);
								if (local781 == local5612.anInt2939 && local5612.anInt2938 == local775) {
									for (local1266 = 0; local1266 < local5612.anInt2935; local1266++) {
										if (local5612.anIntArray350[local1266] == local637) {
											if (local775 == 115) {
												Static68.aClass40Array9[local32++] = local5612.aClass40Array23[local1266];
											} else {
												Static126.anIntArray344[local25++] = local5612.anIntArray349[local1266];
											}
											local5612 = null;
											break;
										}
									}
									if (local5612 != null) {
										if (local775 == 115) {
											Static68.aClass40Array9[local32++] = local5612.aClass40_1593;
										} else {
											Static126.anIntArray344[local25++] = local5612.anInt2933;
										}
									}
									continue;
								}
								if (local775 == 115) {
									Static68.aClass40Array9[local32++] = Static56.aClass40_732;
								} else {
									Static126.anIntArray344[local25++] = 0;
								}
								continue;
							}
						} else if (local217 < 3700) {
							if (local217 == 3600) {
								if (Static103.anInt2510 == 0) {
									Static126.anIntArray344[local25++] = -2;
								} else if (Static103.anInt2510 == 1) {
									Static126.anIntArray344[local25++] = -1;
								} else {
									Static126.anIntArray344[local25++] = Static114.anInt2621;
								}
								continue;
							}
							if (local217 == 3601) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								if (Static103.anInt2510 == 2 && local781 < Static114.anInt2621) {
									Static68.aClass40Array9[local32++] = Static85.aClass40Array17[local781];
									continue;
								}
								Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								continue;
							}
							if (local217 == 3602) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								if (Static103.anInt2510 == 2 && local781 < Static114.anInt2621) {
									Static126.anIntArray344[local25++] = Static39.anIntArray104[local781];
									continue;
								}
								Static126.anIntArray344[local25++] = 0;
								continue;
							}
							if (local217 == 3603) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								if (Static103.anInt2510 == 2 && local781 < Static114.anInt2621) {
									Static126.anIntArray344[local25++] = Static3.anIntArray7[local781];
									continue;
								}
								Static126.anIntArray344[local25++] = 0;
								continue;
							}
							if (local217 == 3604) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local25--;
								local775 = Static126.anIntArray344[local25];
								Static62.method1117(local595, local775);
								continue;
							}
							if (local217 == 3605) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								method1027(local595.method981());
								continue;
							}
							if (local217 == 3606) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								Static74.method634(local595.method981());
								continue;
							}
							if (local217 == 3607) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								Static87.method893(local595.method981());
								continue;
							}
							if (local217 == 3608) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								Static25.method422(local595.method981());
								continue;
							}
							if (local217 == 3609) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								if (local595.method959(Static3.aClass40_76) || local595.method959(Static117.aClass40_1471)) {
									local595 = local595.method968(7);
								}
								Static126.anIntArray344[local25++] = Static39.method710(local595) ? 1 : 0;
								continue;
							}
							if (local217 == 3611) {
								if (Static59.aClass40_774 == null) {
									Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								} else {
									Static68.aClass40Array9[local32++] = Static59.aClass40_774.method965();
								}
								continue;
							}
							if (local217 == 3612) {
								if (Static59.aClass40_774 == null) {
									Static126.anIntArray344[local25++] = 0;
								} else {
									Static126.anIntArray344[local25++] = Static87.anInt1327;
								}
								continue;
							}
							if (local217 == 3613) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								if (Static59.aClass40_774 != null && Static87.anInt1327 > local781) {
									Static68.aClass40Array9[local32++] = Static115.aClass2_Sub16Array1[local781].aClass40_971.method965();
									continue;
								}
								Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								continue;
							}
							if (local217 == 3614) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								if (Static59.aClass40_774 != null && local781 < Static87.anInt1327) {
									Static126.anIntArray344[local25++] = Static115.aClass2_Sub16Array1[local781].anInt1943;
									continue;
								}
								Static126.anIntArray344[local25++] = 0;
								continue;
							}
							if (local217 == 3615) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								if (Static59.aClass40_774 != null && local781 < Static87.anInt1327) {
									Static126.anIntArray344[local25++] = Static115.aClass2_Sub16Array1[local781].aByte4;
									continue;
								}
								Static126.anIntArray344[local25++] = 0;
								continue;
							}
							if (local217 == 3616) {
								Static126.anIntArray344[local25++] = Static67.aByte3;
								continue;
							}
							if (local217 == 3617) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								Static31.method469(local595);
								continue;
							}
							if (local217 == 3618) {
								Static126.anIntArray344[local25++] = Static76.aByte5;
								continue;
							}
							if (local217 == 3619) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								Static20.method397(local595.method981());
								continue;
							}
							if (local217 == 3620) {
								Static83.method1491();
								continue;
							}
							if (local217 == 3621) {
								if (Static103.anInt2510 == 0) {
									Static126.anIntArray344[local25++] = -1;
								} else {
									Static126.anIntArray344[local25++] = Static75.anInt1945;
								}
								continue;
							}
							if (local217 == 3622) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								if (Static103.anInt2510 != 0 && Static75.anInt1945 > local781) {
									Static68.aClass40Array9[local32++] = Static74.method665(Static10.aLongArray8[local781]).method965();
									continue;
								}
								Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								continue;
							}
							if (local217 == 3623) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								if (local595.method959(Static3.aClass40_76) || local595.method959(Static117.aClass40_1471)) {
									local595 = local595.method968(7);
								}
								Static126.anIntArray344[local25++] = Static74.method654(local595) ? 1 : 0;
								continue;
							}
							if (local217 == 3624) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								if (Static115.aClass2_Sub16Array1 != null && Static87.anInt1327 > local781 && Static115.aClass2_Sub16Array1[local781].aClass40_971.method984(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass40_892)) {
									Static126.anIntArray344[local25++] = 1;
									continue;
								}
								Static126.anIntArray344[local25++] = 0;
								continue;
							}
							if (local217 == 3625) {
								if (Static11.aClass40_200 == null) {
									Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								} else {
									Static68.aClass40Array9[local32++] = Static11.aClass40_200.method965();
								}
								continue;
							}
						} else if (local217 < 4100) {
							if (local217 == 4000) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								Static126.anIntArray344[local25++] = local775 + local781;
								continue;
							}
							if (local217 == 4001) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								Static126.anIntArray344[local25++] = local781 - local775;
								continue;
							}
							if (local217 == 4002) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								Static126.anIntArray344[local25++] = local781 * local775;
								continue;
							}
							if (local217 == 4003) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								Static126.anIntArray344[local25++] = local781 / local775;
								continue;
							}
							if (local217 == 4004) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = (int) (Math.random() * (double) local781);
								continue;
							}
							if (local217 == 4005) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = (int) (Math.random() * (double) (local781 + 1));
								continue;
							}
							if (local217 == 4006) {
								local25 -= 5;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								local637 = Static126.anIntArray344[local25 + 3];
								local1027 = Static126.anIntArray344[local25 + 2];
								local661 = Static126.anIntArray344[local25 + 4];
								Static126.anIntArray344[local25++] = local781 + (local775 - local781) * (local661 + -local1027) / (local637 - local1027);
								continue;
							}
							if (local217 == 4007) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								Static126.anIntArray344[local25++] = local781 * local775 / 100 + local781;
								continue;
							}
							if (local217 == 4008) {
								local25 -= 2;
								local775 = Static126.anIntArray344[local25 + 1];
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = local781 | 0x1 << local775;
								continue;
							}
							if (local217 == 4009) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								Static126.anIntArray344[local25++] = -(0x1 << local775) - 1 & local781;
								continue;
							}
							if (local217 == 4010) {
								local25 -= 2;
								local775 = Static126.anIntArray344[local25 + 1];
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = (local781 & 0x1 << local775) == 0 ? 0 : 1;
								continue;
							}
							if (local217 == 4011) {
								local25 -= 2;
								local775 = Static126.anIntArray344[local25 + 1];
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = local781 % local775;
								continue;
							}
							if (local217 == 4012) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								if (local781 == 0) {
									Static126.anIntArray344[local25++] = 0;
								} else {
									Static126.anIntArray344[local25++] = (int) Math.pow((double) local781, (double) local775);
								}
								continue;
							}
							if (local217 == 4013) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								if (local781 == 0) {
									Static126.anIntArray344[local25++] = 0;
								} else if (local775 == 0) {
									Static126.anIntArray344[local25++] = Integer.MAX_VALUE;
								} else {
									Static126.anIntArray344[local25++] = (int) Math.pow((double) local781, 1.0D / (double) local775);
								}
								continue;
							}
							if (local217 == 4014) {
								local25 -= 2;
								local775 = Static126.anIntArray344[local25 + 1];
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = local781 & local775;
								continue;
							}
							if (local217 == 4015) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								Static126.anIntArray344[local25++] = local781 | local775;
								continue;
							}
						} else if (local217 < 4200) {
							if (local217 == 4100) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local25--;
								local775 = Static126.anIntArray344[local25];
								Static68.aClass40Array9[local32++] = Static40.method722(new Class40[] { local595, Static49.method886(local775) });
								continue;
							}
							if (local217 == 4101) {
								local32 -= 2;
								local595 = Static68.aClass40Array9[local32];
								local1165 = Static68.aClass40Array9[local32 + 1];
								Static68.aClass40Array9[local32++] = Static40.method722(new Class40[] { local595, local1165 });
								continue;
							}
							if (local217 == 4102) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local25--;
								local775 = Static126.anIntArray344[local25];
								Static68.aClass40Array9[local32++] = Static40.method722(new Class40[] { local595, Static93.method1731(local775) });
								continue;
							}
							if (local217 == 4103) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								Static68.aClass40Array9[local32++] = local595.method985();
								continue;
							}
							if (local217 == 4104) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								@Pc(2694) long local2694 = (long) local781 * 86400000L + 1014768000000L;
								Static2.aCalendar1.setTime(new Date(local2694));
								local637 = Static2.aCalendar1.get(5);
								local661 = Static2.aCalendar1.get(2);
								local1266 = Static2.aCalendar1.get(1);
								Static68.aClass40Array9[local32++] = Static40.method722(new Class40[] { Static49.method886(local637), Static75.aClass40_974, Static85.aClass40Array16[local661], Static75.aClass40_974, Static49.method886(local1266) });
								continue;
							}
							if (local217 == 4105) {
								local32 -= 2;
								local595 = Static68.aClass40Array9[local32];
								local1165 = Static68.aClass40Array9[local32 + 1];
								if (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass41_1 != null && Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass41_1.aBoolean103) {
									Static68.aClass40Array9[local32++] = local1165;
									continue;
								}
								Static68.aClass40Array9[local32++] = local595;
								continue;
							}
							if (local217 == 4106) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static68.aClass40Array9[local32++] = Static49.method886(local781);
								continue;
							}
							if (local217 == 4107) {
								local32 -= 2;
								Static126.anIntArray344[local25++] = Static68.aClass40Array9[local32].method963(Static68.aClass40Array9[local32 + 1]);
								continue;
							}
							@Pc(2851) byte[] local2851;
							@Pc(2856) Class2_Sub1_Sub2_Sub3_Sub1 local2856;
							if (local217 == 4108) {
								local25 -= 2;
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local775 = Static126.anIntArray344[local25];
								local1027 = Static126.anIntArray344[local25 + 1];
								local2851 = Static66.aClass24_Sub1_10.method1931(0, local1027);
								local2856 = new Class2_Sub1_Sub2_Sub3_Sub1(local2851);
								Static126.anIntArray344[local25++] = local2856.method1545(local595, local775);
								continue;
							}
							if (local217 == 4109) {
								local25 -= 2;
								local775 = Static126.anIntArray344[local25];
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local1027 = Static126.anIntArray344[local25 + 1];
								local2851 = Static66.aClass24_Sub1_10.method1931(0, local1027);
								local2856 = new Class2_Sub1_Sub2_Sub3_Sub1(local2851);
								Static126.anIntArray344[local25++] = local2856.method1552(local595, local775);
								continue;
							}
							if (local217 == 4110) {
								local32 -= 2;
								local1165 = Static68.aClass40Array9[local32 + 1];
								local595 = Static68.aClass40Array9[local32];
								local25--;
								if (Static126.anIntArray344[local25] == 1) {
									Static68.aClass40Array9[local32++] = local595;
								} else {
									Static68.aClass40Array9[local32++] = local1165;
								}
								continue;
							}
							if (local217 == 4111) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								Static68.aClass40Array9[local32++] = Static82.method1541(local595);
								continue;
							}
							if (local217 == 4112) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local25--;
								local775 = Static126.anIntArray344[local25];
								Static68.aClass40Array9[local32++] = local595.method983(local775);
								continue;
							}
							if (local217 == 4113) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static105.method1829(local781) ? 1 : 0;
								continue;
							}
							if (local217 == 4114) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = method1026(local781) ? 1 : 0;
								continue;
							}
							if (local217 == 4115) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static114.method1895(local781) ? 1 : 0;
								continue;
							}
							if (local217 == 4116) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static122.method2063(local781) ? 1 : 0;
								continue;
							}
							if (local217 == 4117) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								if (local595 == null) {
									Static126.anIntArray344[local25++] = 0;
								} else {
									Static126.anIntArray344[local25++] = local595.method950();
								}
								continue;
							}
							if (local217 == 4118) {
								local25 -= 2;
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local775 = Static126.anIntArray344[local25];
								local1027 = Static126.anIntArray344[local25 + 1];
								Static68.aClass40Array9[local32++] = local595.method953(local775, local1027);
								continue;
							}
							if (local217 == 4119) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local1165 = Static115.method1906(local595.method950());
								@Pc(3147) boolean local3147 = false;
								for (local637 = 0; local595.method950() > local637; local637++) {
									local661 = local595.method982(local637);
									if (local661 == 60) {
										local3147 = true;
									} else if (local661 == 62) {
										local3147 = false;
									} else if (!local3147) {
										local1165.method988(local661);
									}
								}
								local1165.method961();
								Static68.aClass40Array9[local32++] = local1165;
								continue;
							}
							if (local217 == 4120) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local25--;
								local775 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = local595.method970(local775);
								continue;
							}
						} else if (local217 < 4300) {
							if (local217 == 4200) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static68.aClass40Array9[local32++] = Static102.method1800(local781).aClass40_1161;
								continue;
							}
							@Pc(3262) Class2_Sub1_Sub10 local3262;
							if (local217 == 4201) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								local3262 = Static102.method1800(local781);
								if (local775 >= 1 && local775 <= 5 && local3262.aClass40Array15[local775 - 1] != null) {
									Static68.aClass40Array9[local32++] = local3262.aClass40Array15[local775 - 1];
									continue;
								}
								Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								continue;
							}
							if (local217 == 4202) {
								local25 -= 2;
								local781 = Static126.anIntArray344[local25];
								local775 = Static126.anIntArray344[local25 + 1];
								local3262 = Static102.method1800(local781);
								if (local775 >= 1 && local775 <= 5 && local3262.aClass40Array14[local775 - 1] != null) {
									Static68.aClass40Array9[local32++] = local3262.aClass40Array14[local775 - 1];
									continue;
								}
								Static68.aClass40Array9[local32++] = Static21.aClass40_362;
								continue;
							}
							if (local217 == 4203) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static102.method1800(local781).anInt2257;
								continue;
							}
							if (local217 == 4204) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static102.method1800(local781).anInt2258 == 1 ? 1 : 0;
								continue;
							}
							@Pc(3407) Class2_Sub1_Sub10 local3407;
							if (local217 == 4205) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								local3407 = Static102.method1800(local781);
								if (local3407.anInt2215 == -1 && local3407.anInt2253 >= 0) {
									Static126.anIntArray344[local25++] = local3407.anInt2253;
									continue;
								}
								Static126.anIntArray344[local25++] = local781;
								continue;
							}
							if (local217 == 4206) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								local3407 = Static102.method1800(local781);
								if (local3407.anInt2215 >= 0 && local3407.anInt2253 >= 0) {
									Static126.anIntArray344[local25++] = local3407.anInt2253;
									continue;
								}
								Static126.anIntArray344[local25++] = local781;
								continue;
							}
							if (local217 == 4207) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								Static126.anIntArray344[local25++] = Static102.method1800(local781).aBoolean171 ? 1 : 0;
								continue;
							}
						} else if (local217 < 5100) {
							if (local217 == 5000) {
								Static126.anIntArray344[local25++] = Static23.anInt652;
								continue;
							}
							if (local217 == 5001) {
								local25 -= 3;
								Static23.anInt652 = Static126.anIntArray344[local25];
								Static14.anInt279 = Static126.anIntArray344[local25 + 1];
								Static133.anInt3072 = Static126.anIntArray344[local25 + 2];
								Static57.aClass2_Sub9_Sub1_2.method673(184);
								Static57.aClass2_Sub9_Sub1_2.method644(Static23.anInt652);
								Static57.aClass2_Sub9_Sub1_2.method644(Static14.anInt279);
								Static57.aClass2_Sub9_Sub1_2.method644(Static133.anInt3072);
								continue;
							}
							if (local217 == 5002) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								local25 -= 2;
								local775 = Static126.anIntArray344[local25];
								local1027 = Static126.anIntArray344[local25 + 1];
								Static57.aClass2_Sub9_Sub1_2.method673(30);
								Static57.aClass2_Sub9_Sub1_2.method647(local595.method981());
								Static57.aClass2_Sub9_Sub1_2.method644(local775 - 1);
								Static57.aClass2_Sub9_Sub1_2.method644(local1027);
								continue;
							}
							if (local217 == 5003) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								local1165 = null;
								if (local781 < 100) {
									local1165 = Static127.aClass40Array24[local781];
								}
								if (local1165 == null) {
									local1165 = Static21.aClass40_362;
								}
								Static68.aClass40Array9[local32++] = local1165;
								continue;
							}
							if (local217 == 5004) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								local775 = -1;
								if (local781 < 100 && Static127.aClass40Array24[local781] != null) {
									local775 = Static10.anIntArray352[local781];
								}
								Static126.anIntArray344[local25++] = local775;
								continue;
							}
							if (local217 == 5005) {
								Static126.anIntArray344[local25++] = Static14.anInt279;
								continue;
							}
							if (local217 == 5008) {
								local32--;
								local595 = Static68.aClass40Array9[local32];
								if (local595.method959(Static120.aClass40_1516)) {
									Static12.method2208(local595);
								} else {
									local1165 = local595.method985();
									@Pc(3691) byte local3691 = 0;
									@Pc(3693) byte local3693 = 0;
									if (local1165.method959(Static112.aClass40_1422)) {
										local595 = local595.method968(Static112.aClass40_1422.method950());
										local3693 = 0;
									} else if (local1165.method959(Static97.aClass40_1283)) {
										local3693 = 1;
										local595 = local595.method968(Static97.aClass40_1283.method950());
									} else if (local1165.method959(Static12.aClass40_1639)) {
										local3693 = 2;
										local595 = local595.method968(Static12.aClass40_1639.method950());
									} else if (local1165.method959(Static100.aClass40_1316)) {
										local595 = local595.method968(Static100.aClass40_1316.method950());
										local3693 = 3;
									} else if (local1165.method959(Static99.aClass40_1307)) {
										local595 = local595.method968(Static99.aClass40_1307.method950());
										local3693 = 4;
									} else if (local1165.method959(Static111.aClass40_1407)) {
										local595 = local595.method968(Static111.aClass40_1407.method950());
										local3693 = 5;
									} else if (local1165.method959(Static77.aClass40_1023)) {
										local3693 = 6;
										local595 = local595.method968(Static77.aClass40_1023.method950());
									} else if (local1165.method959(Static32.aClass40_462)) {
										local595 = local595.method968(Static32.aClass40_462.method950());
										local3693 = 7;
									} else if (local1165.method959(Static69.aClass40_955)) {
										local3693 = 8;
										local595 = local595.method968(Static69.aClass40_955.method950());
									} else if (local1165.method959(Static63.aClass40_245)) {
										local595 = local595.method968(Static63.aClass40_245.method950());
										local3693 = 9;
									} else if (local1165.method959(Static95.aClass40_1256)) {
										local595 = local595.method968(Static95.aClass40_1256.method950());
										local3693 = 10;
									} else if (local1165.method959(Static34.aClass40_472)) {
										local595 = local595.method968(Static34.aClass40_472.method950());
										local3693 = 11;
									} else if (Static17.anInt432 != 0) {
										if (local1165.method959(Static112.aClass40_1417)) {
											local595 = local595.method968(Static112.aClass40_1417.method950());
											local3693 = 0;
										} else if (local1165.method959(Static97.aClass40_1284)) {
											local595 = local595.method968(Static97.aClass40_1284.method950());
											local3693 = 1;
										} else if (local1165.method959(Static12.aClass40_1641)) {
											local595 = local595.method968(Static12.aClass40_1641.method950());
											local3693 = 2;
										} else if (local1165.method959(Static100.aClass40_1317)) {
											local595 = local595.method968(Static100.aClass40_1317.method950());
											local3693 = 3;
										} else if (local1165.method959(Static99.aClass40_1306)) {
											local3693 = 4;
											local595 = local595.method968(Static99.aClass40_1306.method950());
										} else if (local1165.method959(Static111.aClass40_1403)) {
											local3693 = 5;
											local595 = local595.method968(Static111.aClass40_1403.method950());
										} else if (local1165.method959(Static77.aClass40_1021)) {
											local3693 = 6;
											local595 = local595.method968(Static77.aClass40_1021.method950());
										} else if (local1165.method959(Static32.aClass40_461)) {
											local595 = local595.method968(Static32.aClass40_461.method950());
											local3693 = 7;
										} else if (local1165.method959(Static69.aClass40_953)) {
											local595 = local595.method968(Static69.aClass40_953.method950());
											local3693 = 8;
										} else if (local1165.method959(Static63.aClass40_244)) {
											local3693 = 9;
											local595 = local595.method968(Static63.aClass40_244.method950());
										} else if (local1165.method959(Static95.aClass40_1259)) {
											local595 = local595.method968(Static95.aClass40_1259.method950());
											local3693 = 10;
										} else if (local1165.method959(Static34.aClass40_470)) {
											local595 = local595.method968(Static34.aClass40_470.method950());
											local3693 = 11;
										}
									}
									local1165 = local595.method985();
									if (local1165.method959(Static45.aClass40_596)) {
										local3691 = 1;
										local595 = local595.method968(Static45.aClass40_596.method950());
									} else if (local1165.method959(Static108.aClass40_1386)) {
										local595 = local595.method968(Static108.aClass40_1386.method950());
										local3691 = 2;
									} else if (local1165.method959(Static49.aClass40_651)) {
										local595 = local595.method968(Static49.aClass40_651.method950());
										local3691 = 3;
									} else if (local1165.method959(Static25.aClass40_389)) {
										local595 = local595.method968(Static25.aClass40_389.method950());
										local3691 = 4;
									} else if (local1165.method959(Static115.aClass40_1446)) {
										local595 = local595.method968(Static115.aClass40_1446.method950());
										local3691 = 5;
									} else if (Static17.anInt432 != 0) {
										if (local1165.method959(Static45.aClass40_598)) {
											local595 = local595.method968(Static45.aClass40_598.method950());
											local3691 = 1;
										} else if (local1165.method959(Static108.aClass40_1388)) {
											local3691 = 2;
											local595 = local595.method968(Static108.aClass40_1388.method950());
										} else if (local1165.method959(Static49.aClass40_653)) {
											local3691 = 3;
											local595 = local595.method968(Static49.aClass40_653.method950());
										} else if (local1165.method959(Static25.aClass40_388)) {
											local3691 = 4;
											local595 = local595.method968(Static25.aClass40_388.method950());
										} else if (local1165.method959(Static115.aClass40_1444)) {
											local3691 = 5;
											local595 = local595.method968(Static115.aClass40_1444.method950());
										}
									}
									Static57.aClass2_Sub9_Sub1_2.method673(27);
									Static57.aClass2_Sub9_Sub1_2.method644(0);
									local661 = Static57.aClass2_Sub9_Sub1_2.anInt976;
									Static57.aClass2_Sub9_Sub1_2.method644(local3693);
									Static57.aClass2_Sub9_Sub1_2.method644(local3691);
									Static8.method184(Static57.aClass2_Sub9_Sub1_2, local595);
									Static57.aClass2_Sub9_Sub1_2.method608(Static57.aClass2_Sub9_Sub1_2.anInt976 - local661);
								}
								continue;
							}
							if (local217 == 5009) {
								local32 -= 2;
								local595 = Static68.aClass40Array9[local32];
								local1165 = Static68.aClass40Array9[local32 + 1];
								Static57.aClass2_Sub9_Sub1_2.method673(224);
								Static57.aClass2_Sub9_Sub1_2.method644(0);
								local1027 = Static57.aClass2_Sub9_Sub1_2.anInt976;
								Static57.aClass2_Sub9_Sub1_2.method647(local595.method981());
								Static8.method184(Static57.aClass2_Sub9_Sub1_2, local1165);
								Static57.aClass2_Sub9_Sub1_2.method608(Static57.aClass2_Sub9_Sub1_2.anInt976 - local1027);
								continue;
							}
							if (local217 == 5010) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								local1165 = null;
								if (local781 < 100) {
									local1165 = Static31.aClass40Array2[local781];
								}
								if (local1165 == null) {
									local1165 = Static21.aClass40_362;
								}
								Static68.aClass40Array9[local32++] = local1165;
								continue;
							}
							if (local217 == 5011) {
								local25--;
								local781 = Static126.anIntArray344[local25];
								local1165 = null;
								if (local781 < 100) {
									local1165 = Static120.aClass40Array21[local781];
								}
								if (local1165 == null) {
									local1165 = Static21.aClass40_362;
								}
								Static68.aClass40Array9[local32++] = local1165;
								continue;
							}
							if (local217 == 5015) {
								if (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1 == null || Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass40_892 == null) {
									local595 = Static87.aClass40_661;
								} else {
									local595 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass40_892;
								}
								Static68.aClass40Array9[local32++] = local595;
								continue;
							}
							if (local217 == 5016) {
								Static126.anIntArray344[local25++] = Static133.anInt3072;
								continue;
							}
							if (local217 == 5017) {
								Static126.anIntArray344[local25++] = Static56.anInt1475;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7078) Exception local7078) {
			if (local18.aClass40_1115 == null) {
				if (Static34.anInt804 != 0) {
					Static72.method1228(Static65.aClass40_855, Static21.aClass40_362, 0);
				}
				Static92.method1662(local7078, "CS2 - scr:" + local18.aLong100 + " op:" + local42);
			} else {
				@Pc(7085) Class40 local7085 = Static115.method1906(30);
				local7085.method951(Static21.aClass40_366).method951(local18.aClass40_1115);
				for (local59 = Static17.anInt435 - 1; local59 >= 0; local59--) {
					local7085.method951(Static118.aClass40_1493).method951(Static120.aClass72Array1[local59].aClass2_Sub1_Sub9_1.aClass40_1115);
				}
				if (local42 == 40) {
					local72 = local45[local30];
					local7085.method951(Static77.aClass40_1024).method951(Static49.method886(local72));
				}
				if (Static34.anInt804 != 0) {
					Static72.method1228(Static40.method722(new Class40[] { Static53.aClass40_711, local18.aClass40_1115 }), Static21.aClass40_362, 0);
				}
				Static92.method1662(local7078, "CS2 - scr:" + local18.aLong100 + " op:" + local42 + new String(local7085.method952()));
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public static void method1029(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			Static123.anInt2876 = -1;
			Static118.anInt2788 = -1;
			return;
		}
		@Pc(37) int local37 = Static93.method1730(arg0, Static105.anInt2531, arg1) - arg2;
		@Pc(41) int local41 = arg1 - Static127.anInt2944;
		@Pc(45) int local45 = arg0 - Static83.anInt2155;
		@Pc(49) int local49 = local37 - Static2.anInt101;
		@Pc(53) int local53 = Class2_Sub1_Sub2_Sub2.anIntArray219[Static38.anInt1005];
		@Pc(57) int local57 = Class2_Sub1_Sub2_Sub2.anIntArray219[Static67.anInt1832];
		@Pc(61) int local61 = Class2_Sub1_Sub2_Sub2.anIntArray221[Static38.anInt1005];
		@Pc(65) int local65 = Class2_Sub1_Sub2_Sub2.anIntArray221[Static67.anInt1832];
		@Pc(75) int local75 = local65 * local45 + local57 * local41 >> 16;
		@Pc(85) int local85 = local41 * local65 - local45 * local57 >> 16;
		@Pc(87) int local87 = local75;
		@Pc(98) int local98 = local49 * local61 - local85 * local53 >> 16;
		@Pc(108) int local108 = local61 * local85 + local49 * local53 >> 16;
		if (local108 < 50) {
			Static123.anInt2876 = -1;
			Static118.anInt2788 = -1;
		} else {
			Static123.anInt2876 = (local87 << 9) / local108 + 256;
			Static118.anInt2788 = (local98 << 9) / local108 + 167;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method1030() {
		aClass40_752 = null;
		aClass40_753 = null;
		aClass40_750 = null;
		aClass40_754 = null;
		aClass40_751 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)Z")
	public static boolean method1031(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}
}
