import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!sf;")
	public static Class5 aClass5_20;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!bb;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!sc;")
	private static Class66 aClass66_362 = Static106.method1849("Create a free account");

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_363 = Static106.method1849("<col=ffff00>");

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!sc;")
	private static Class66 aClass66_364 = Static106.method1849("This computers address has been blocked");

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!sc;")
	private static Class66 aClass66_365 = Static106.method1849(" from your ignore list first)3");

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!sc;")
	public static Class66 aClass66_366 = Static106.method1849("::noclip");

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_367 = aClass66_364;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
	public static int anInt607 = 0;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!sc;")
	public static Class66 aClass66_368 = aClass66_365;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!sc;")
	public static Class66 aClass66_369 = aClass66_362;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method484() {
		aClass66_367 = null;
		aClass66_366 = null;
		aClass66_364 = null;
		aClass66_369 = null;
		aClass5_20 = null;
		aClass66_365 = null;
		aClass66_363 = null;
		aClass66_368 = null;
		aClass7_2 = null;
		aClass66_362 = null;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method485() {
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(56) int local56;
		@Pc(48) int local48;
		if (Static59.anInt1826 == 72) {
			local22 = Static133.aClass1_Sub12_Sub1_3.method1212();
			local26 = local22 >> 2;
			local30 = local22 & 0x3;
			local34 = Static65.anIntArray310[local26];
			local38 = Static133.aClass1_Sub12_Sub1_3.method1194();
			local42 = Static133.aClass1_Sub12_Sub1_3.method1212();
			local48 = Static67.anInt1683 + (local42 & 0x7);
			local56 = Static131.anInt2695 + (local42 >> 4 & 0x7);
			if (local56 >= 0 && local48 >= 0 && local56 < 104 && local48 < 104) {
				Static32.method626(Static22.anInt635, local26, -1, local34, local56, 0, local48, local30, local38);
			}
			return;
		}
		@Pc(138) Class1_Sub1_Sub1_Sub1 local138;
		if (Static59.anInt1826 == 149) {
			local22 = Static133.aClass1_Sub12_Sub1_3.method1183();
			local26 = Static133.aClass1_Sub12_Sub1_3.method1212();
			local34 = Static67.anInt1683 + (local26 & 0x7);
			local30 = Static131.anInt2695 + (local26 >> 4 & 0x7);
			if (local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104) {
				@Pc(131) Class61 local131 = Static101.aClass61ArrayArrayArray1[Static22.anInt635][local30][local34];
				if (local131 != null) {
					for (local138 = (Class1_Sub1_Sub1_Sub1) local131.method1748(); local138 != null; local138 = (Class1_Sub1_Sub1_Sub1) local131.method1760()) {
						if ((local22 & 0x7FFF) == local138.anInt72) {
							local138.method2050();
							break;
						}
					}
					if (local131.method1748() == null) {
						Static101.aClass61ArrayArrayArray1[Static22.anInt635][local30][local34] = null;
					}
					Static44.method962(local30, local34);
				}
			}
			return;
		}
		@Pc(238) int local238;
		if (Static59.anInt1826 == 248) {
			local22 = Static133.aClass1_Sub12_Sub1_3.method1190();
			local26 = Static131.anInt2695 + (local22 >> 4 & 0x7);
			local30 = Static67.anInt1683 + (local22 & 0x7);
			local34 = Static133.aClass1_Sub12_Sub1_3.method1176();
			local38 = Static133.aClass1_Sub12_Sub1_3.method1190();
			local42 = local38 >> 4 & 0xF;
			local56 = local38 & 0x7;
			local48 = Static133.aClass1_Sub12_Sub1_3.method1190();
			if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
				local238 = local42 + 1;
				if (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0] >= local26 - local238 && Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0] <= local238 + local26 && local30 - local238 <= Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0] && local30 + local238 >= Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0] && Static119.anInt2780 != 0 && local56 > 0 && Static44.anInt1408 < 50) {
					Static120.anIntArray482[Static44.anInt1408] = local34;
					Static47.anIntArray225[Static44.anInt1408] = local56;
					Static50.anIntArray237[Static44.anInt1408] = local48;
					Static74.aClass11Array1[Static44.anInt1408] = null;
					Static87.anIntArray388[Static44.anInt1408] = (local26 << 16) + (local30 << 8) + local42;
					Static44.anInt1408++;
				}
			}
		}
		if (Static59.anInt1826 == 237) {
			local22 = Static133.aClass1_Sub12_Sub1_3.method1194();
			local26 = Static133.aClass1_Sub12_Sub1_3.method1183();
			local30 = Static133.aClass1_Sub12_Sub1_3.method1190();
			local38 = (local30 & 0x7) + Static67.anInt1683;
			local34 = (local30 >> 4 & 0x7) + Static131.anInt2695;
			local42 = Static133.aClass1_Sub12_Sub1_3.method1222();
			if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local26 != Static25.anInt694) {
				@Pc(393) Class1_Sub1_Sub1_Sub1 local393 = new Class1_Sub1_Sub1_Sub1();
				local393.anInt72 = local22;
				local393.anInt75 = local42;
				if (Static101.aClass61ArrayArrayArray1[Static22.anInt635][local34][local38] == null) {
					Static101.aClass61ArrayArrayArray1[Static22.anInt635][local34][local38] = new Class61();
				}
				Static101.aClass61ArrayArrayArray1[Static22.anInt635][local34][local38].method1754(local393);
				Static44.method962(local34, local38);
			}
		} else if (Static59.anInt1826 == 106) {
			local22 = Static133.aClass1_Sub12_Sub1_3.method1176();
			local26 = Static133.aClass1_Sub12_Sub1_3.method1203();
			local30 = (local26 >> 4 & 0x7) + Static131.anInt2695;
			local34 = Static67.anInt1683 + (local26 & 0x7);
			local38 = Static133.aClass1_Sub12_Sub1_3.method1176();
			if (local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104) {
				local138 = new Class1_Sub1_Sub1_Sub1();
				local138.anInt75 = local38;
				local138.anInt72 = local22;
				if (Static101.aClass61ArrayArrayArray1[Static22.anInt635][local30][local34] == null) {
					Static101.aClass61ArrayArrayArray1[Static22.anInt635][local30][local34] = new Class61();
				}
				Static101.aClass61ArrayArrayArray1[Static22.anInt635][local30][local34].method1754(local138);
				Static44.method962(local30, local34);
			}
		} else {
			@Pc(599) int local599;
			if (Static59.anInt1826 == 118) {
				local22 = Static133.aClass1_Sub12_Sub1_3.method1194();
				local26 = Static133.aClass1_Sub12_Sub1_3.method1203();
				local30 = Static131.anInt2695 + (local26 >> 4 & 0x7);
				local34 = Static67.anInt1683 + (local26 & 0x7);
				local38 = Static133.aClass1_Sub12_Sub1_3.method1212();
				local42 = local38 >> 2;
				local56 = local38 & 0x3;
				local48 = Static65.anIntArray310[local42];
				if (local30 >= 0 && local34 >= 0 && local30 < 103 && local34 < 103) {
					if (local48 == 0) {
						@Pc(590) Class21 local590 = Static129.aClass9_1.method330(Static22.anInt635, local30, local34);
						if (local590 != null) {
							local599 = local590.anInt732 >> 14 & 0x7FFF;
							if (local42 == 2) {
								local590.aClass1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub4(local599, 2, local56 + 4, Static22.anInt635, local30, local34, local22, false, local590.aClass1_Sub1_Sub1_4);
								local590.aClass1_Sub1_Sub1_5 = new Class1_Sub1_Sub1_Sub4(local599, 2, local56 + 1 & 0x3, Static22.anInt635, local30, local34, local22, false, local590.aClass1_Sub1_Sub1_5);
							} else {
								local590.aClass1_Sub1_Sub1_4 = new Class1_Sub1_Sub1_Sub4(local599, local42, local56, Static22.anInt635, local30, local34, local22, false, local590.aClass1_Sub1_Sub1_4);
							}
						}
					}
					if (local48 == 1) {
						@Pc(666) Class41 local666 = Static129.aClass9_1.method348(Static22.anInt635, local30, local34);
						if (local666 != null) {
							local599 = local666.anInt1862 >> 14 & 0x7FFF;
							if (local42 == 4 || local42 == 5) {
								local666.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub4(local599, 4, local56, Static22.anInt635, local30, local34, local22, false, local666.aClass1_Sub1_Sub1_6);
							} else if (local42 == 6) {
								local666.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub4(local599, 4, local56 + 4, Static22.anInt635, local30, local34, local22, false, local666.aClass1_Sub1_Sub1_6);
							} else if (local42 == 7) {
								local666.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub4(local599, 4, (local56 + 2 & 0x3) + 4, Static22.anInt635, local30, local34, local22, false, local666.aClass1_Sub1_Sub1_6);
							} else if (local42 == 8) {
								local666.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub4(local599, 4, local56 + 4, Static22.anInt635, local30, local34, local22, false, local666.aClass1_Sub1_Sub1_6);
								local666.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub4(local599, 4, (local56 + 2 & 0x3) + 4, Static22.anInt635, local30, local34, local22, false, local666.aClass1_Sub1_Sub1_7);
							}
						}
					}
					if (local48 == 2) {
						if (local42 == 11) {
							local42 = 10;
						}
						@Pc(807) Class73 local807 = Static129.aClass9_1.method345(Static22.anInt635, local30, local34);
						if (local807 != null) {
							local807.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub4(local807.anInt2753 >> 14 & 0x7FFF, local42, local56, Static22.anInt635, local30, local34, local22, false, local807.aClass1_Sub1_Sub1_8);
						}
					}
					if (local48 == 3) {
						@Pc(840) Class82 local840 = Static129.aClass9_1.method316(Static22.anInt635, local30, local34);
						if (local840 != null) {
							local840.aClass1_Sub1_Sub1_9 = new Class1_Sub1_Sub1_Sub4(local840.anInt2931 >> 14 & 0x7FFF, 22, local56, Static22.anInt635, local30, local34, local22, false, local840.aClass1_Sub1_Sub1_9);
						}
					}
				}
			} else if (Static59.anInt1826 == 140) {
				local22 = Static133.aClass1_Sub12_Sub1_3.method1212();
				local26 = local22 >> 2;
				local30 = local22 & 0x3;
				local34 = Static65.anIntArray310[local26];
				local38 = Static133.aClass1_Sub12_Sub1_3.method1212();
				local56 = (local38 & 0x7) + Static67.anInt1683;
				local42 = Static131.anInt2695 + (local38 >> 4 & 0x7);
				if (local42 >= 0 && local56 >= 0 && local42 < 104 && local56 < 104) {
					Static32.method626(Static22.anInt635, local26, -1, local34, local42, 0, local56, local30, -1);
				}
			} else {
				@Pc(989) int local989;
				if (Static59.anInt1826 == 164) {
					local22 = Static133.aClass1_Sub12_Sub1_3.method1176();
					local26 = Static133.aClass1_Sub12_Sub1_3.method1222();
					@Pc(943) byte local943 = Static133.aClass1_Sub12_Sub1_3.method1182();
					local34 = Static133.aClass1_Sub12_Sub1_3.method1203();
					local42 = (local34 & 0x7) + Static67.anInt1683;
					local38 = (local34 >> 4 & 0x7) + Static131.anInt2695;
					local56 = Static133.aClass1_Sub12_Sub1_3.method1203();
					local48 = local56 >> 2;
					local238 = local56 & 0x3;
					local599 = Static65.anIntArray310[local48];
					@Pc(981) byte local981 = Static133.aClass1_Sub12_Sub1_3.method1201();
					@Pc(985) byte local985 = Static133.aClass1_Sub12_Sub1_3.method1182();
					local989 = Static133.aClass1_Sub12_Sub1_3.method1194();
					@Pc(993) int local993 = Static133.aClass1_Sub12_Sub1_3.method1176();
					@Pc(997) byte local997 = Static133.aClass1_Sub12_Sub1_3.method1201();
					@Pc(1004) Class1_Sub1_Sub1_Sub5_Sub2 local1004;
					if (local993 == Static25.anInt694) {
						local1004 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1;
					} else {
						local1004 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local993];
					}
					if (local1004 != null) {
						@Pc(1014) Class1_Sub1_Sub9 local1014 = Static122.method1995(local989);
						@Pc(1030) int local1030;
						@Pc(1027) int local1027;
						if (local238 == 1 || local238 == 3) {
							local1030 = local1014.anInt2083;
							local1027 = local1014.anInt2065;
						} else {
							local1027 = local1014.anInt2083;
							local1030 = local1014.anInt2065;
						}
						@Pc(1044) int local1044 = (local1030 >> 1) + local38;
						@Pc(1052) int local1052 = (local1030 + 1 >> 1) + local38;
						@Pc(1058) int local1058 = (local1027 >> 1) + local42;
						@Pc(1066) int local1066 = (local1027 + 1 >> 1) + local42;
						@Pc(1070) int[][] local1070 = Static44.anIntArrayArrayArray3[Static22.anInt635];
						@Pc(1078) int local1078 = (local38 << 7) + (local1030 << 6);
						@Pc(1104) int local1104 = local1070[local1044][local1066] + local1070[local1052][local1058] + local1070[local1044][local1058] + local1070[local1052][local1066] >> 2;
						@Pc(1113) int local1113 = (local42 << 7) + (local1027 << 6);
						@Pc(1123) Class1_Sub1_Sub1_Sub6 local1123 = local1014.method1445(local1104, local1070, local1113, local1078, local48, local238);
						if (local1123 != null) {
							Static32.method626(Static22.anInt635, 0, local26 + 1, local599, local38, local22 + 1, local42, 0, -1);
							local1004.anInt1302 = local22 + Static22.anInt636;
							@Pc(1154) byte local1154;
							if (local981 < local985) {
								local1154 = local985;
								local985 = local981;
								local981 = local1154;
							}
							local1004.anInt1320 = local38 * 128 + local1030 * 64;
							local1004.anInt1322 = Static22.anInt636 + local26;
							local1004.anInt1307 = local985 + local38;
							local1004.aClass1_Sub1_Sub1_Sub6_1 = local1123;
							local1004.anInt1298 = local981 + local38;
							local1004.anInt1301 = local42 * 128 + local1027 * 64;
							local1004.anInt1304 = local1104;
							if (local943 < local997) {
								local1154 = local997;
								local997 = local943;
								local943 = local1154;
							}
							local1004.anInt1310 = local42 + local943;
							local1004.anInt1300 = local997 + local42;
						}
					}
				}
				if (Static59.anInt1826 == 50) {
					local22 = Static133.aClass1_Sub12_Sub1_3.method1190();
					local26 = (local22 >> 4 & 0x7) + Static131.anInt2695;
					local30 = (local22 & 0x7) + Static67.anInt1683;
					local34 = Static133.aClass1_Sub12_Sub1_3.method1211() + local26;
					local38 = local30 + Static133.aClass1_Sub12_Sub1_3.method1211();
					local42 = Static133.aClass1_Sub12_Sub1_3.method1181();
					local56 = Static133.aClass1_Sub12_Sub1_3.method1176();
					local48 = Static133.aClass1_Sub12_Sub1_3.method1190() * 4;
					local238 = Static133.aClass1_Sub12_Sub1_3.method1190() * 4;
					local599 = Static133.aClass1_Sub12_Sub1_3.method1176();
					@Pc(1279) int local1279 = Static133.aClass1_Sub12_Sub1_3.method1176();
					@Pc(1283) int local1283 = Static133.aClass1_Sub12_Sub1_3.method1190();
					local989 = Static133.aClass1_Sub12_Sub1_3.method1190();
					if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local56 != 65535) {
						local38 = local38 * 128 + 64;
						local34 = local34 * 128 + 64;
						local26 = local26 * 128 + 64;
						local30 = local30 * 128 + 64;
						@Pc(1373) Class1_Sub1_Sub1_Sub3 local1373 = new Class1_Sub1_Sub1_Sub3(local56, Static22.anInt635, local26, local30, Static77.method1476(local30, Static22.anInt635, local26) - local48, local599 - -Static22.anInt636, Static22.anInt636 + local1279, local1283, local989, local42, local238);
						local1373.method526(local38, local34, Static77.method1476(local38, Static22.anInt635, local34) - local238, local599 + Static22.anInt636);
						Static35.aClass61_8.method1754(local1373);
					}
				} else if (Static59.anInt1826 == 83) {
					local22 = Static133.aClass1_Sub12_Sub1_3.method1190();
					local26 = Static131.anInt2695 + (local22 >> 4 & 0x7);
					local30 = Static67.anInt1683 + (local22 & 0x7);
					local34 = Static133.aClass1_Sub12_Sub1_3.method1176();
					local38 = Static133.aClass1_Sub12_Sub1_3.method1190();
					local42 = Static133.aClass1_Sub12_Sub1_3.method1176();
					if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
						local30 = local30 * 128 + 64;
						local26 = local26 * 128 + 64;
						@Pc(1470) Class1_Sub1_Sub1_Sub2 local1470 = new Class1_Sub1_Sub1_Sub2(local34, Static22.anInt635, local26, local30, Static77.method1476(local30, Static22.anInt635, local26) - local38, local42, Static22.anInt636);
						Static112.aClass61_16.method1754(local1470);
					}
				} else if (Static59.anInt1826 == 144) {
					local22 = Static133.aClass1_Sub12_Sub1_3.method1190();
					local26 = Static131.anInt2695 + (local22 >> 4 & 0x7);
					local30 = (local22 & 0x7) + Static67.anInt1683;
					local34 = Static133.aClass1_Sub12_Sub1_3.method1176();
					local38 = Static133.aClass1_Sub12_Sub1_3.method1176();
					local42 = Static133.aClass1_Sub12_Sub1_3.method1176();
					if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
						@Pc(1532) Class61 local1532 = Static101.aClass61ArrayArrayArray1[Static22.anInt635][local26][local30];
						if (local1532 != null) {
							for (@Pc(1539) Class1_Sub1_Sub1_Sub1 local1539 = (Class1_Sub1_Sub1_Sub1) local1532.method1748(); local1539 != null; local1539 = (Class1_Sub1_Sub1_Sub1) local1532.method1760()) {
								if ((local34 & 0x7FFF) == local1539.anInt72 && local1539.anInt75 == local38) {
									local1539.anInt75 = local42;
									break;
								}
							}
							Static44.method962(local26, local30);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public static void method486(@OriginalArg(0) int arg0) {
		@Pc(18) Class1_Sub24 local18 = (Class1_Sub24) Static38.aClass65_43.method1802((long) arg0);
		if (local18 != null) {
			local18.method2050();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V")
	public static void method487(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static65.anIntArray311[arg0];
		@Pc(17) int local17 = Static98.anIntArray419[arg0];
		@Pc(21) int local21 = Static53.anIntArray247[arg0];
		if (local17 >= 2000) {
			local17 -= 2000;
		}
		@Pc(29) int local29 = Static33.anIntArray114[arg0];
		if (local17 == 1003) {
			Static56.anInt1780 = 0;
			Static104.anInt2550 = 2;
			Static131.anInt2694 = Static35.anInt866;
			Static14.anInt477 = Static6.anInt308;
			Static127.aClass1_Sub12_Sub1_2.method1227(29);
			Static127.aClass1_Sub12_Sub1_2.method1217(local29);
		}
		@Pc(59) Class1_Sub1_Sub1_Sub5_Sub2 local59;
		if (local17 == 40) {
			local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local29];
			if (local59 != null) {
				Static35.method633(local59.anIntArray189[0], 0, 0, 1, 2, local59.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static131.anInt2694 = Static35.anInt866;
				Static14.anInt477 = Static6.anInt308;
				Static104.anInt2550 = 2;
				Static56.anInt1780 = 0;
				Static127.aClass1_Sub12_Sub1_2.method1227(55);
				Static127.aClass1_Sub12_Sub1_2.method1200(local29);
			}
		}
		@Pc(122) Class1_Sub1_Sub1_Sub5_Sub1 local122;
		if (local17 == 1006) {
			Static131.anInt2694 = Static35.anInt866;
			Static104.anInt2550 = 2;
			Static56.anInt1780 = 0;
			Static14.anInt477 = Static6.anInt308;
			local122 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local29];
			if (local122 != null) {
				@Pc(127) Class1_Sub1_Sub5 local127 = local122.aClass1_Sub1_Sub5_1;
				if (local127.anIntArray222 != null) {
					local127 = local127.method1040();
				}
				if (local127 != null) {
					Static127.aClass1_Sub12_Sub1_2.method1227(44);
					Static127.aClass1_Sub12_Sub1_2.method1200(local127.anInt1488);
				}
			}
		}
		@Pc(172) boolean local172;
		if (local17 == 24) {
			local172 = Static35.method633(local13, 0, 0, 0, 2, local21, 0, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			if (!local172) {
				Static35.method633(local13, 0, 0, 1, 2, local21, 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			}
			Static104.anInt2550 = 2;
			Static56.anInt1780 = 0;
			Static131.anInt2694 = Static35.anInt866;
			Static14.anInt477 = Static6.anInt308;
			Static127.aClass1_Sub12_Sub1_2.method1227(34);
			Static127.aClass1_Sub12_Sub1_2.method1217(Static3.anInt117);
			Static127.aClass1_Sub12_Sub1_2.method1217(Static41.anInt1204);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			Static127.aClass1_Sub12_Sub1_2.method1217(Static48.anInt1496 + local13);
			Static127.aClass1_Sub12_Sub1_2.method1217(local21 + Static52.anInt1603);
			Static127.aClass1_Sub12_Sub1_2.method1196(Static47.anInt1476);
		}
		if (local17 == 51) {
			local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local29];
			if (local59 != null) {
				Static35.method633(local59.anIntArray189[0], 0, 0, 1, 2, local59.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static56.anInt1780 = 0;
				Static14.anInt477 = Static6.anInt308;
				Static104.anInt2550 = 2;
				Static131.anInt2694 = Static35.anInt866;
				Static127.aClass1_Sub12_Sub1_2.method1227(208);
				Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			}
		}
		if (local17 == 1001) {
			Static131.anInt2694 = Static35.anInt866;
			Static14.anInt477 = Static6.anInt308;
			Static104.anInt2550 = 2;
			Static56.anInt1780 = 0;
			Static127.aClass1_Sub12_Sub1_2.method1227(35);
			Static127.aClass1_Sub12_Sub1_2.method1204(local29 >> 14 & 0x7FFF);
		}
		if (local17 == 5) {
			Static85.method1542(local29, local21, local13);
			Static127.aClass1_Sub12_Sub1_2.method1227(236);
			Static127.aClass1_Sub12_Sub1_2.method1175(Static48.anInt1496 + local13);
			Static127.aClass1_Sub12_Sub1_2.method1217(local21 + Static52.anInt1603);
			Static127.aClass1_Sub12_Sub1_2.method1200(local29 >> 14 & 0x7FFF);
		}
		if (local17 == 22) {
			Static127.aClass1_Sub12_Sub1_2.method1227(231);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			Static127.aClass1_Sub12_Sub1_2.method1217(local13);
			Static127.aClass1_Sub12_Sub1_2.method1193(local21);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 12) {
			local122 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local29];
			if (local122 != null) {
				Static35.method633(local122.anIntArray189[0], 0, 0, 1, 2, local122.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static104.anInt2550 = 2;
				Static14.anInt477 = Static6.anInt308;
				Static56.anInt1780 = 0;
				Static131.anInt2694 = Static35.anInt866;
				Static127.aClass1_Sub12_Sub1_2.method1227(72);
				Static127.aClass1_Sub12_Sub1_2.method1200(local29);
			}
		}
		if (local17 == 38) {
			Static85.method1542(local29, local21, local13);
			Static127.aClass1_Sub12_Sub1_2.method1227(199);
			Static127.aClass1_Sub12_Sub1_2.method1217(local21 + Static52.anInt1603);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29 >> 14 & 0x7FFF);
			Static127.aClass1_Sub12_Sub1_2.method1175(Static48.anInt1496 + local13);
		}
		if (local17 == 1005) {
			Static85.method1542(local29, local21, local13);
			Static127.aClass1_Sub12_Sub1_2.method1227(6);
			Static127.aClass1_Sub12_Sub1_2.method1175(Static52.anInt1603 + local21);
			Static127.aClass1_Sub12_Sub1_2.method1204(local13 + Static48.anInt1496);
			Static127.aClass1_Sub12_Sub1_2.method1217(local29 >> 14 & 0x7FFF);
		}
		if (local17 == 43) {
			local122 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local29];
			if (local122 != null) {
				Static35.method633(local122.anIntArray189[0], 0, 0, 1, 2, local122.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static14.anInt477 = Static6.anInt308;
				Static131.anInt2694 = Static35.anInt866;
				Static56.anInt1780 = 0;
				Static104.anInt2550 = 2;
				Static127.aClass1_Sub12_Sub1_2.method1227(33);
				Static127.aClass1_Sub12_Sub1_2.method1200(local29);
			}
		}
		if (local17 == 2 && Static85.method1542(local29, local21, local13)) {
			Static127.aClass1_Sub12_Sub1_2.method1227(96);
			Static127.aClass1_Sub12_Sub1_2.method1217(local21 + Static52.anInt1603);
			Static127.aClass1_Sub12_Sub1_2.method1175(local13 + Static48.anInt1496);
			Static127.aClass1_Sub12_Sub1_2.method1204(local29 >> 14 & 0x7FFF);
			Static127.aClass1_Sub12_Sub1_2.method1175(Static3.anInt117);
			Static127.aClass1_Sub12_Sub1_2.method1217(Static41.anInt1204);
			Static127.aClass1_Sub12_Sub1_2.method1220(Static47.anInt1476);
		}
		if (local17 == 11) {
			Static127.aClass1_Sub12_Sub1_2.method1227(193);
			Static127.aClass1_Sub12_Sub1_2.method1200(local13);
			Static127.aClass1_Sub12_Sub1_2.method1196(local21);
			Static127.aClass1_Sub12_Sub1_2.method1217(local29);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 36) {
			local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local29];
			if (local59 != null) {
				Static35.method633(local59.anIntArray189[0], 0, 0, 1, 2, local59.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static131.anInt2694 = Static35.anInt866;
				Static104.anInt2550 = 2;
				Static56.anInt1780 = 0;
				Static14.anInt477 = Static6.anInt308;
				Static127.aClass1_Sub12_Sub1_2.method1227(120);
				Static127.aClass1_Sub12_Sub1_2.method1204(local29);
			}
		}
		if (local17 == 32) {
			local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local29];
			if (local59 != null) {
				Static35.method633(local59.anIntArray189[0], 0, 0, 1, 2, local59.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static14.anInt477 = Static6.anInt308;
				Static131.anInt2694 = Static35.anInt866;
				Static56.anInt1780 = 0;
				Static104.anInt2550 = 2;
				Static127.aClass1_Sub12_Sub1_2.method1227(115);
				Static127.aClass1_Sub12_Sub1_2.method1204(local29);
			}
		}
		if (local17 == 25) {
			local122 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local29];
			if (local122 != null) {
				Static35.method633(local122.anIntArray189[0], 0, 0, 1, 2, local122.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static104.anInt2550 = 2;
				Static131.anInt2694 = Static35.anInt866;
				Static56.anInt1780 = 0;
				Static14.anInt477 = Static6.anInt308;
				Static127.aClass1_Sub12_Sub1_2.method1227(13);
				Static127.aClass1_Sub12_Sub1_2.method1217(Static41.anInt1204);
				Static127.aClass1_Sub12_Sub1_2.method1172(Static47.anInt1476);
				Static127.aClass1_Sub12_Sub1_2.method1200(local29);
				Static127.aClass1_Sub12_Sub1_2.method1200(Static3.anInt117);
			}
		}
		@Pc(851) Class1_Sub10 local851;
		if (local17 == 1002) {
			local851 = Static38.method2002(local21);
			if (local851 == null || local851.anIntArray206[local13] < 100000) {
				Static127.aClass1_Sub12_Sub1_2.method1227(29);
				Static127.aClass1_Sub12_Sub1_2.method1217(local29);
			} else {
				Static103.method1791(0, Static13.aClass66_284, Static41.method897(new Class66[] { Static88.method1632(local851.anIntArray206[local13]), Static93.aClass66_1334, Static20.method496(local29).aClass66_847 }));
			}
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		@Pc(950) int local950;
		if (local17 == 4) {
			Static127.aClass1_Sub12_Sub1_2.method1227(79);
			Static127.aClass1_Sub12_Sub1_2.method1193(local21);
			local851 = Static38.method2002(local21);
			if (local851.anIntArrayArray14 != null && local851.anIntArrayArray14[0][0] == 5) {
				local950 = local851.anIntArrayArray14[0][1];
				Static103.anIntArray429[local950] = 1 - Static103.anIntArray429[local950];
				Static57.method1262(local950);
			}
		}
		if (local17 == 31) {
			Static127.aClass1_Sub12_Sub1_2.method1227(185);
			Static127.aClass1_Sub12_Sub1_2.method1217(local29);
			Static127.aClass1_Sub12_Sub1_2.method1217(local13);
			Static127.aClass1_Sub12_Sub1_2.method1220(local21);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 7) {
			Static85.method1542(local29, local21, local13);
			Static127.aClass1_Sub12_Sub1_2.method1227(90);
			Static127.aClass1_Sub12_Sub1_2.method1204(Static48.anInt1496 + local13);
			Static127.aClass1_Sub12_Sub1_2.method1204(local21 + Static52.anInt1603);
			Static127.aClass1_Sub12_Sub1_2.method1200(local29 >> 14 & 0x7FFF);
		}
		if (local17 == 42) {
			Static127.aClass1_Sub12_Sub1_2.method1227(127);
			Static127.aClass1_Sub12_Sub1_2.method1200(Static24.anInt688);
			Static127.aClass1_Sub12_Sub1_2.method1196(local21);
			Static127.aClass1_Sub12_Sub1_2.method1172(Static90.anInt1844);
			Static127.aClass1_Sub12_Sub1_2.method1200(local13);
		}
		if (local17 == 48 && Static87.aClass1_Sub10_10 == null) {
			Static27.method549(local21, local13);
			Static87.aClass1_Sub10_10 = Static127.method2030(local21, local13);
			Static70.method537(Static87.aClass1_Sub10_10);
		}
		if (local17 == 13 || local17 == 1004) {
			Static84.method1526(Static84.aClass66Array18[arg0], local29, local13, local21);
		}
		if (local17 == 1) {
			local851 = Static127.method2030(local21, local13);
			if (local851 != null) {
				Static55.method1241();
				Static70.method540(local13, local21, Static5.method162(Static61.method1301(local851)));
				Static84.anInt2224 = 0;
				Static87.aClass66_1277 = Static25.method529(local851);
				if (Static87.aClass66_1277 == null) {
					Static87.aClass66_1277 = Static20.aClass66_370;
				}
				if (!local851.aBoolean54) {
					Static27.aClass66_445 = Static41.method897(new Class66[] { Static83.aClass66_1183, local851.aClass66_726, Static134.aClass66_1760 });
					return;
				}
				Static27.aClass66_445 = Static41.method897(new Class66[] { local851.aClass66_731, Static134.aClass66_1760 });
			}
			return;
		}
		if (local17 == 39) {
			Static83.method1508();
		}
		if (local17 == 44) {
			Static127.aClass1_Sub12_Sub1_2.method1227(71);
			Static127.aClass1_Sub12_Sub1_2.method1220(local21);
			Static127.aClass1_Sub12_Sub1_2.method1217(local29);
			Static127.aClass1_Sub12_Sub1_2.method1217(local13);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 29) {
			Static127.aClass1_Sub12_Sub1_2.method1227(176);
			Static127.aClass1_Sub12_Sub1_2.method1172(local21);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			Static127.aClass1_Sub12_Sub1_2.method1200(local13);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 18) {
			local172 = Static35.method633(local13, 0, 0, 0, 2, local21, 0, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			if (!local172) {
				Static35.method633(local13, 0, 0, 1, 2, local21, 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			}
			Static131.anInt2694 = Static35.anInt866;
			Static56.anInt1780 = 0;
			Static14.anInt477 = Static6.anInt308;
			Static104.anInt2550 = 2;
			Static127.aClass1_Sub12_Sub1_2.method1227(121);
			Static127.aClass1_Sub12_Sub1_2.method1200(Static24.anInt688);
			Static127.aClass1_Sub12_Sub1_2.method1175(Static48.anInt1496 + local13);
			Static127.aClass1_Sub12_Sub1_2.method1172(Static90.anInt1844);
			Static127.aClass1_Sub12_Sub1_2.method1217(local21 + Static52.anInt1603);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29);
		}
		if (local17 == 50) {
			local172 = Static35.method633(local13, 0, 0, 0, 2, local21, 0, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			if (!local172) {
				Static35.method633(local13, 0, 0, 1, 2, local21, 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			}
			Static104.anInt2550 = 2;
			Static14.anInt477 = Static6.anInt308;
			Static131.anInt2694 = Static35.anInt866;
			Static56.anInt1780 = 0;
			Static127.aClass1_Sub12_Sub1_2.method1227(41);
			Static127.aClass1_Sub12_Sub1_2.method1204(local21 + Static52.anInt1603);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			Static127.aClass1_Sub12_Sub1_2.method1175(Static48.anInt1496 + local13);
		}
		if (local17 == 47) {
			local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local29];
			if (local59 != null) {
				Static35.method633(local59.anIntArray189[0], 0, 0, 1, 2, local59.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static56.anInt1780 = 0;
				Static104.anInt2550 = 2;
				Static14.anInt477 = Static6.anInt308;
				Static131.anInt2694 = Static35.anInt866;
				Static127.aClass1_Sub12_Sub1_2.method1227(211);
				Static127.aClass1_Sub12_Sub1_2.method1200(Static41.anInt1204);
				Static127.aClass1_Sub12_Sub1_2.method1200(local29);
				Static127.aClass1_Sub12_Sub1_2.method1196(Static47.anInt1476);
				Static127.aClass1_Sub12_Sub1_2.method1204(Static3.anInt117);
			}
		}
		if (local17 == 37) {
			local172 = Static35.method633(local13, 0, 0, 0, 2, local21, 0, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			if (!local172) {
				Static35.method633(local13, 0, 0, 1, 2, local21, 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			}
			Static104.anInt2550 = 2;
			Static131.anInt2694 = Static35.anInt866;
			Static56.anInt1780 = 0;
			Static14.anInt477 = Static6.anInt308;
			Static127.aClass1_Sub12_Sub1_2.method1227(84);
			Static127.aClass1_Sub12_Sub1_2.method1217(local21 + Static52.anInt1603);
			Static127.aClass1_Sub12_Sub1_2.method1204(local29);
			Static127.aClass1_Sub12_Sub1_2.method1204(local13 + Static48.anInt1496);
		}
		if (local17 == 58) {
			local122 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local29];
			if (local122 != null) {
				Static35.method633(local122.anIntArray189[0], 0, 0, 1, 2, local122.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static56.anInt1780 = 0;
				Static14.anInt477 = Static6.anInt308;
				Static131.anInt2694 = Static35.anInt866;
				Static104.anInt2550 = 2;
				Static127.aClass1_Sub12_Sub1_2.method1227(98);
				Static127.aClass1_Sub12_Sub1_2.method1204(local29);
			}
		}
		if (local17 == 33) {
			Static127.aClass1_Sub12_Sub1_2.method1227(9);
			Static127.aClass1_Sub12_Sub1_2.method1204(Static3.anInt117);
			Static127.aClass1_Sub12_Sub1_2.method1193(Static47.anInt1476);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			Static127.aClass1_Sub12_Sub1_2.method1204(Static41.anInt1204);
			Static127.aClass1_Sub12_Sub1_2.method1217(local13);
			Static127.aClass1_Sub12_Sub1_2.method1172(local21);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 49) {
			Static85.method1542(local29, local21, local13);
			Static127.aClass1_Sub12_Sub1_2.method1227(8);
			Static127.aClass1_Sub12_Sub1_2.method1200(local13 + Static48.anInt1496);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29 >> 14 & 0x7FFF);
			Static127.aClass1_Sub12_Sub1_2.method1200(Static52.anInt1603 + local21);
		}
		if (local17 == 23) {
			local172 = Static35.method633(local13, 0, 0, 0, 2, local21, 0, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			if (!local172) {
				Static35.method633(local13, 0, 0, 1, 2, local21, 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			}
			Static56.anInt1780 = 0;
			Static131.anInt2694 = Static35.anInt866;
			Static14.anInt477 = Static6.anInt308;
			Static104.anInt2550 = 2;
			Static127.aClass1_Sub12_Sub1_2.method1227(171);
			Static127.aClass1_Sub12_Sub1_2.method1217(local29);
			Static127.aClass1_Sub12_Sub1_2.method1175(Static52.anInt1603 + local21);
			Static127.aClass1_Sub12_Sub1_2.method1204(Static48.anInt1496 + local13);
		}
		if (local17 == 30) {
			Static127.aClass1_Sub12_Sub1_2.method1227(82);
			Static127.aClass1_Sub12_Sub1_2.method1175(local13);
			Static127.aClass1_Sub12_Sub1_2.method1204(local29);
			Static127.aClass1_Sub12_Sub1_2.method1172(local21);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 15) {
			local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local29];
			if (local59 != null) {
				Static35.method633(local59.anIntArray189[0], 0, 0, 1, 2, local59.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static104.anInt2550 = 2;
				Static131.anInt2694 = Static35.anInt866;
				Static14.anInt477 = Static6.anInt308;
				Static56.anInt1780 = 0;
				Static127.aClass1_Sub12_Sub1_2.method1227(170);
				Static127.aClass1_Sub12_Sub1_2.method1200(local29);
			}
		}
		if (local17 == 21 && Static85.method1542(local29, local21, local13)) {
			Static127.aClass1_Sub12_Sub1_2.method1227(23);
			Static127.aClass1_Sub12_Sub1_2.method1175(Static48.anInt1496 + local13);
			Static127.aClass1_Sub12_Sub1_2.method1200(Static24.anInt688);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29 >> 14 & 0x7FFF);
			Static127.aClass1_Sub12_Sub1_2.method1193(Static90.anInt1844);
			Static127.aClass1_Sub12_Sub1_2.method1204(local21 + Static52.anInt1603);
		}
		if (local17 == 10) {
			local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local29];
			if (local59 != null) {
				Static35.method633(local59.anIntArray189[0], 0, 0, 1, 2, local59.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static104.anInt2550 = 2;
				Static14.anInt477 = Static6.anInt308;
				Static56.anInt1780 = 0;
				Static131.anInt2694 = Static35.anInt866;
				Static127.aClass1_Sub12_Sub1_2.method1227(106);
				Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			}
		}
		if (local17 == 46) {
			Static129.aClass9_1.method317(Static22.anInt635, local13, local21);
		}
		if (local17 == 45) {
			local122 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local29];
			if (local122 != null) {
				Static35.method633(local122.anIntArray189[0], 0, 0, 1, 2, local122.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static14.anInt477 = Static6.anInt308;
				Static104.anInt2550 = 2;
				Static56.anInt1780 = 0;
				Static131.anInt2694 = Static35.anInt866;
				Static127.aClass1_Sub12_Sub1_2.method1227(31);
				Static127.aClass1_Sub12_Sub1_2.method1175(local29);
				Static127.aClass1_Sub12_Sub1_2.method1217(Static24.anInt688);
				Static127.aClass1_Sub12_Sub1_2.method1172(Static90.anInt1844);
			}
		}
		if (local17 == 16) {
			Static127.aClass1_Sub12_Sub1_2.method1227(201);
			Static127.aClass1_Sub12_Sub1_2.method1196(local21);
			Static127.aClass1_Sub12_Sub1_2.method1200(local29);
			Static127.aClass1_Sub12_Sub1_2.method1175(local13);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 34) {
			local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local29];
			if (local59 != null) {
				Static35.method633(local59.anIntArray189[0], 0, 0, 1, 2, local59.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static104.anInt2550 = 2;
				Static14.anInt477 = Static6.anInt308;
				Static56.anInt1780 = 0;
				Static131.anInt2694 = Static35.anInt866;
				Static127.aClass1_Sub12_Sub1_2.method1227(64);
				Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			}
		}
		if (local17 == 6) {
			Static127.aClass1_Sub12_Sub1_2.method1227(79);
			Static127.aClass1_Sub12_Sub1_2.method1193(local21);
			local851 = Static38.method2002(local21);
			if (local851.anIntArrayArray14 != null && local851.anIntArrayArray14[0][0] == 5) {
				local950 = local851.anIntArrayArray14[0][1];
				if (Static103.anIntArray429[local950] != local851.anIntArray202[0]) {
					Static103.anIntArray429[local950] = local851.anIntArray202[0];
					Static57.method1262(local950);
				}
			}
		}
		if (local17 == 41) {
			Static127.aClass1_Sub12_Sub1_2.method1227(202);
			Static127.aClass1_Sub12_Sub1_2.method1204(local13);
			Static127.aClass1_Sub12_Sub1_2.method1193(Static90.anInt1844);
			Static127.aClass1_Sub12_Sub1_2.method1175(Static24.anInt688);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			Static127.aClass1_Sub12_Sub1_2.method1193(local21);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 28) {
			Static127.aClass1_Sub12_Sub1_2.method1227(248);
			Static127.aClass1_Sub12_Sub1_2.method1193(local21);
			Static127.aClass1_Sub12_Sub1_2.method1217(local13);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 57) {
			Static127.aClass1_Sub12_Sub1_2.method1227(145);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29);
			Static127.aClass1_Sub12_Sub1_2.method1175(local13);
			Static127.aClass1_Sub12_Sub1_2.method1193(local21);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 19) {
			local122 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local29];
			if (local122 != null) {
				Static35.method633(local122.anIntArray189[0], 0, 0, 1, 2, local122.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static56.anInt1780 = 0;
				Static14.anInt477 = Static6.anInt308;
				Static104.anInt2550 = 2;
				Static131.anInt2694 = Static35.anInt866;
				Static127.aClass1_Sub12_Sub1_2.method1227(30);
				Static127.aClass1_Sub12_Sub1_2.method1217(local29);
			}
		}
		if (local17 == 17) {
			Static127.aClass1_Sub12_Sub1_2.method1227(169);
			Static127.aClass1_Sub12_Sub1_2.method1217(local13);
			Static127.aClass1_Sub12_Sub1_2.method1204(local29);
			Static127.aClass1_Sub12_Sub1_2.method1220(local21);
			Static132.anInt2930 = 0;
			Static28.aClass1_Sub10_4 = Static38.method2002(local21);
			Static86.anInt2292 = local13;
		}
		if (local17 == 9) {
			Static55.method1241();
			local851 = Static38.method2002(local21);
			Static47.anInt1476 = local21;
			Static3.anInt117 = local13;
			Static41.anInt1204 = local29;
			Static84.anInt2224 = 1;
			Static70.method537(local851);
			Static42.aClass66_710 = Static41.method897(new Class66[] { Static68.aClass66_1060, Static20.method496(local29).aClass66_847, Static134.aClass66_1760 });
			if (Static42.aClass66_710 == null) {
				Static42.aClass66_710 = Static52.aClass66_862;
			}
			return;
		}
		if (local17 == 14) {
			local172 = Static35.method633(local13, 0, 0, 0, 2, local21, 0, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			if (!local172) {
				Static35.method633(local13, 0, 0, 1, 2, local21, 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			}
			Static131.anInt2694 = Static35.anInt866;
			Static104.anInt2550 = 2;
			Static56.anInt1780 = 0;
			Static14.anInt477 = Static6.anInt308;
			Static127.aClass1_Sub12_Sub1_2.method1227(197);
			Static127.aClass1_Sub12_Sub1_2.method1204(Static52.anInt1603 + local21);
			Static127.aClass1_Sub12_Sub1_2.method1175(local13 + Static48.anInt1496);
			Static127.aClass1_Sub12_Sub1_2.method1175(local29);
		}
		if (local17 == 3) {
			local851 = Static38.method2002(local21);
			@Pc(2504) boolean local2504 = true;
			if (local851.anInt1329 > 0) {
				local2504 = Static11.method359(local851);
			}
			if (local2504) {
				Static127.aClass1_Sub12_Sub1_2.method1227(79);
				Static127.aClass1_Sub12_Sub1_2.method1193(local21);
			}
		}
		if (local17 == 8) {
			local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local29];
			if (local59 != null) {
				Static35.method633(local59.anIntArray189[0], 0, 0, 1, 2, local59.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static56.anInt1780 = 0;
				Static131.anInt2694 = Static35.anInt866;
				Static14.anInt477 = Static6.anInt308;
				Static104.anInt2550 = 2;
				Static127.aClass1_Sub12_Sub1_2.method1227(154);
				Static127.aClass1_Sub12_Sub1_2.method1204(local29);
			}
		}
		if (local17 == 20) {
			local59 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local29];
			if (local59 != null) {
				Static35.method633(local59.anIntArray189[0], 0, 0, 1, 2, local59.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static131.anInt2694 = Static35.anInt866;
				Static104.anInt2550 = 2;
				Static14.anInt477 = Static6.anInt308;
				Static56.anInt1780 = 0;
				Static127.aClass1_Sub12_Sub1_2.method1227(62);
				Static127.aClass1_Sub12_Sub1_2.method1204(local29);
				Static127.aClass1_Sub12_Sub1_2.method1204(Static24.anInt688);
				Static127.aClass1_Sub12_Sub1_2.method1193(Static90.anInt1844);
			}
		}
		if (local17 == 26) {
			local172 = Static35.method633(local13, 0, 0, 0, 2, local21, 0, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			if (!local172) {
				Static35.method633(local13, 0, 0, 1, 2, local21, 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
			}
			Static131.anInt2694 = Static35.anInt866;
			Static104.anInt2550 = 2;
			Static56.anInt1780 = 0;
			Static14.anInt477 = Static6.anInt308;
			Static127.aClass1_Sub12_Sub1_2.method1227(213);
			Static127.aClass1_Sub12_Sub1_2.method1200(Static48.anInt1496 + local13);
			Static127.aClass1_Sub12_Sub1_2.method1217(local29);
			Static127.aClass1_Sub12_Sub1_2.method1175(local21 + Static52.anInt1603);
		}
		if (local17 == 35) {
			local122 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local29];
			if (local122 != null) {
				Static35.method633(local122.anIntArray189[0], 0, 0, 1, 2, local122.anIntArray191[0], 1, false, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
				Static56.anInt1780 = 0;
				Static14.anInt477 = Static6.anInt308;
				Static104.anInt2550 = 2;
				Static131.anInt2694 = Static35.anInt866;
				Static127.aClass1_Sub12_Sub1_2.method1227(224);
				Static127.aClass1_Sub12_Sub1_2.method1217(local29);
			}
		}
		if (Static84.anInt2224 != 0) {
			Static84.anInt2224 = 0;
			Static70.method537(Static38.method2002(Static47.anInt1476));
		}
		if (Static51.aBoolean65) {
			Static55.method1241();
		}
		if (Static28.aClass1_Sub10_4 != null && Static132.anInt2930 == 0) {
			Static70.method537(Static28.aClass1_Sub10_4);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZ)V")
	public static void method488(@OriginalArg(1) boolean arg0) {
		Static33.aBoolean36 = arg0;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(31) int local31;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(69) int local69;
		@Pc(106) int local106;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(145) int local145;
		if (!Static33.aBoolean36) {
			local19 = Static133.aClass1_Sub12_Sub1_3.method1183();
			local23 = Static133.aClass1_Sub12_Sub1_3.method1194();
			local31 = (Static105.anInt2602 - Static133.aClass1_Sub12_Sub1_3.anInt1694) / 16;
			Static28.anIntArrayArray12 = new int[local31][4];
			for (local37 = 0; local37 < local31; local37++) {
				for (local41 = 0; local41 < 4; local41++) {
					Static28.anIntArrayArray12[local37][local41] = Static133.aClass1_Sub12_Sub1_3.method1210();
				}
			}
			local41 = Static133.aClass1_Sub12_Sub1_3.method1222();
			local69 = Static133.aClass1_Sub12_Sub1_3.method1194();
			@Pc(71) boolean local71 = false;
			if ((local23 / 8 == 48 || local23 / 8 == 49) && local69 / 8 == 48) {
				local71 = true;
			}
			if (local23 / 8 == 48 && local69 / 8 == 148) {
				local71 = true;
			}
			local106 = Static133.aClass1_Sub12_Sub1_3.method1203();
			Static9.aByteArrayArray1 = new byte[local31][];
			Static51.anIntArray240 = new int[local31];
			Static63.anIntArray293 = new int[local31];
			Static87.aByteArrayArray8 = new byte[local31][];
			Static13.anIntArray75 = new int[local31];
			local31 = 0;
			for (local129 = (local23 - 6) / 8; local129 <= (local23 + 6) / 8; local129++) {
				for (local137 = (local69 - 6) / 8; local137 <= (local69 + 6) / 8; local137++) {
					local145 = local137 + (local129 << 8);
					if (!local71 || local137 != 49 && local137 != 149 && local137 != 147 && local129 != 50 && (local129 != 49 || local137 != 47)) {
						Static51.anIntArray240[local31] = local145;
						Static63.anIntArray293[local31] = Static1.aClass5_Sub1_3.method122(Static41.method897(new Class66[] { Static116.aClass66_1564, Static88.method1632(local129), Static101.aClass66_1397, Static88.method1632(local137) }));
						Static13.anIntArray75[local31] = Static1.aClass5_Sub1_3.method122(Static41.method897(new Class66[] { Static85.aClass66_1220, Static88.method1632(local129), Static101.aClass66_1397, Static88.method1632(local137) }));
						local31++;
					}
				}
			}
			Static43.method955(local23, local19, local41, local106, local69);
			return;
		}
		local19 = Static133.aClass1_Sub12_Sub1_3.method1194();
		local23 = Static133.aClass1_Sub12_Sub1_3.method1183();
		local31 = Static133.aClass1_Sub12_Sub1_3.method1176();
		local37 = Static133.aClass1_Sub12_Sub1_3.method1222();
		local41 = Static133.aClass1_Sub12_Sub1_3.method1202();
		Static133.aClass1_Sub12_Sub1_3.method1228();
		@Pc(305) int local305;
		for (local69 = 0; local69 < 4; local69++) {
			for (local106 = 0; local106 < 13; local106++) {
				for (local305 = 0; local305 < 13; local305++) {
					local129 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
					if (local129 == 1) {
						Static82.anIntArrayArrayArray7[local69][local106][local305] = Static133.aClass1_Sub12_Sub1_3.method1232(26);
					} else {
						Static82.anIntArrayArrayArray7[local69][local106][local305] = -1;
					}
				}
			}
		}
		Static133.aClass1_Sub12_Sub1_3.method1231();
		local106 = (Static105.anInt2602 - Static133.aClass1_Sub12_Sub1_3.anInt1694) / 16;
		Static28.anIntArrayArray12 = new int[local106][4];
		for (local305 = 0; local305 < local106; local305++) {
			for (local129 = 0; local129 < 4; local129++) {
				Static28.anIntArrayArray12[local305][local129] = Static133.aClass1_Sub12_Sub1_3.method1189();
			}
		}
		Static63.anIntArray293 = new int[local106];
		Static87.aByteArrayArray8 = new byte[local106][];
		Static13.anIntArray75 = new int[local106];
		Static9.aByteArrayArray1 = new byte[local106][];
		Static51.anIntArray240 = new int[local106];
		local106 = 0;
		for (local129 = 0; local129 < 4; local129++) {
			for (local137 = 0; local137 < 13; local137++) {
				for (local145 = 0; local145 < 13; local145++) {
					@Pc(432) int local432 = Static82.anIntArrayArrayArray7[local129][local137][local145];
					if (local432 != -1) {
						@Pc(441) int local441 = local432 >> 14 & 0x3FF;
						@Pc(447) int local447 = local432 >> 3 & 0x7FF;
						@Pc(457) int local457 = local447 / 8 + (local441 / 8 << 8);
						for (@Pc(459) int local459 = 0; local459 < local106; local459++) {
							if (Static51.anIntArray240[local459] == local457) {
								local457 = -1;
								break;
							}
						}
						if (local457 != -1) {
							@Pc(487) int local487 = local457 >> 8 & 0xFF;
							@Pc(491) int local491 = local457 & 0xFF;
							Static51.anIntArray240[local106] = local457;
							Static63.anIntArray293[local106] = Static1.aClass5_Sub1_3.method122(Static41.method897(new Class66[] { Static116.aClass66_1564, Static88.method1632(local487), Static101.aClass66_1397, Static88.method1632(local491) }));
							Static13.anIntArray75[local106] = Static1.aClass5_Sub1_3.method122(Static41.method897(new Class66[] { Static85.aClass66_1220, Static88.method1632(local487), Static101.aClass66_1397, Static88.method1632(local491) }));
							local106++;
						}
					}
				}
			}
		}
		Static43.method955(local19, local37, local31, local41, local23);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
	public static void method489(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static131.aClass1_Sub1_Sub2_Sub1_14.anIntArray44;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local42 = (52736 - local29 * 512) * 4 + 24628;
			for (local44 = 1; local44 < 103; local44++) {
				if ((Static87.aByteArrayArrayArray15[arg0][local44][local29] & 0x18) == 0) {
					Static129.aClass9_1.method313(local8, local42, arg0, local44, local29);
				}
				if (arg0 < 3 && (Static87.aByteArrayArrayArray15[arg0 + 1][local44][local29] & 0x8) != 0) {
					Static129.aClass9_1.method313(local8, local42, arg0 + 1, local44, local29);
				}
				local42 += 4;
			}
		}
		local42 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + (int) (Math.random() * 20.0D) + 228;
		local44 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		Static131.aClass1_Sub1_Sub2_Sub1_14.method246();
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
			for (local151 = 1; local151 < 103; local151++) {
				if ((Static87.aByteArrayArrayArray15[arg0][local151][local147] & 0x18) == 0) {
					Static35.method635(arg0, local147, local42, local44, local151);
				}
				if (arg0 < 3 && (Static87.aByteArrayArrayArray15[arg0 + 1][local151][local147] & 0x8) != 0) {
					Static35.method635(arg0 + 1, local147, local42, local44, local151);
				}
			}
		}
		Static26.anInt700 = 0;
		for (local151 = 0; local151 < 104; local151++) {
			for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
				@Pc(228) int local228 = Static129.aClass9_1.method352(Static22.anInt635, local151, local220);
				if (local228 != 0) {
					local228 = local228 >> 14 & 0x7FFF;
					@Pc(241) int local241 = Static122.method1995(local228).anInt2095;
					if (local241 >= 0) {
						@Pc(248) int local248 = local151;
						@Pc(250) int local250 = local220;
						if (local241 != 22 && local241 != 29 && local241 != 34 && local241 != 36 && local241 != 46 && local241 != 47 && local241 != 48) {
							@Pc(284) int[][] local284 = Static83.aClass13Array1[Static22.anInt635].anIntArrayArray11;
							for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
								@Pc(293) int local293 = (int) (Math.random() * 4.0D);
								if (local293 == 0 && local248 > 0 && local248 > local151 - 3 && (local284[local248 - 1][local250] & 0x12C0108) == 0) {
									local248--;
								}
								if (local293 == 1 && local248 < 103 && local151 + 3 > local248 && (local284[local248 + 1][local250] & 0x12C0180) == 0) {
									local248++;
								}
								if (local293 == 2 && local250 > 0 && local250 > local220 - 3 && (local284[local248][local250 - 1] & 0x12C0102) == 0) {
									local250--;
								}
								if (local293 == 3 && local250 < 103 && local250 < local220 + 3 && (local284[local248][local250 + 1] & 0x12C0120) == 0) {
									local250++;
								}
							}
						}
						Static80.aClass1_Sub1_Sub2_Sub1Array46[Static26.anInt700] = Static102.aClass1_Sub1_Sub2_Sub1Array61[local241];
						Static26.anIntArray102[Static26.anInt700] = local248;
						Static117.anIntArray473[Static26.anInt700] = local250;
						Static26.anInt700++;
					}
				}
			}
		}
		Static3.aClass6_1.method907();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BJ)V")
	public static void method491(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static27.anInt730 >= 100 && Static13.anInt464 != 1 || Static27.anInt730 >= 200) {
			Static103.method1791(0, Static13.aClass66_284, Static89.aClass66_1302);
			return;
		}
		@Pc(35) Class66 local35 = Static106.method1850(arg0).method1820();
		for (@Pc(37) int local37 = 0; local37 < Static27.anInt730; local37++) {
			if (arg0 == Static43.aLongArray5[local37]) {
				Static103.method1791(0, Static13.aClass66_284, Static41.method897(new Class66[] { local35, Static15.aClass66_1744 }));
				return;
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static126.anInt2886; local73++) {
			if (Static41.aLongArray4[local73] == arg0) {
				Static103.method1791(0, Static13.aClass66_284, Static41.method897(new Class66[] { Static100.aClass66_1388, local35, aClass66_368 }));
				return;
			}
		}
		if (local35.method1824(Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass66_707)) {
			Static103.method1791(0, Static13.aClass66_284, Static33.aClass66_494);
			return;
		}
		Static88.aClass66Array20[Static27.anInt730] = local35;
		Static43.aLongArray5[Static27.anInt730] = arg0;
		Static9.anIntArray56[Static27.anInt730] = 0;
		Static8.anIntArray55[Static27.anInt730] = 0;
		Static60.anInt1850 = Static112.anInt2674;
		Static27.anInt730++;
		Static127.aClass1_Sub12_Sub1_2.method1227(207);
		Static127.aClass1_Sub12_Sub1_2.method1195(arg0);
	}
}
