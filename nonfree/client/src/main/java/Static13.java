import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array2;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public static int anInt237;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!je;")
	private static Class40 aClass40_203 = Static69.method1231("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_202 = aClass40_203;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	public static int anInt246 = -1;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!kc;")
	public static Class2_Sub13 aClass2_Sub13_1 = null;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Lclient!je;")
	public static Class40 aClass40_204 = Static69.method1231("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	public static void method210() {
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(36) int local36;
		@Pc(48) int local48;
		if (Static35.anInt825 == 24) {
			local14 = Static7.aClass2_Sub9_Sub1_1.method640();
			local18 = local14 >> 2;
			local22 = local14 & 0x3;
			local26 = Static62.anIntArray171[local18];
			local30 = Static7.aClass2_Sub9_Sub1_1.method612();
			local36 = (local30 & 0x7) + Static109.anInt2952;
			local44 = Static57.anInt1501 + (local30 >> 4 & 0x7);
			local48 = Static7.aClass2_Sub9_Sub1_1.method632();
			if (local44 >= 0 && local36 >= 0 && local44 < 104 && local36 < 104) {
				method216(local44, local36, local18, local22, local48, Static105.anInt2531, local26, 0, -1);
			}
			return;
		}
		@Pc(120) Class2_Sub1_Sub1_Sub4 local120;
		if (Static35.anInt825 == 22) {
			local14 = Static7.aClass2_Sub9_Sub1_1.method621();
			local18 = Static7.aClass2_Sub9_Sub1_1.method621();
			local22 = Static7.aClass2_Sub9_Sub1_1.method640();
			local26 = Static57.anInt1501 + (local22 >> 4 & 0x7);
			local30 = Static109.anInt2952 + (local22 & 0x7);
			if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
				local120 = new Class2_Sub1_Sub1_Sub4();
				local120.anInt771 = local14;
				local120.anInt767 = local18;
				if (Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local26][local30] == null) {
					Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local26][local30] = new Class3();
				}
				Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local26][local30].method75(local120);
				Static83.method1495(local26, local30);
			}
		} else if (Static35.anInt825 == 129) {
			local14 = Static7.aClass2_Sub9_Sub1_1.method640();
			local18 = (local14 >> 4 & 0x7) + Static57.anInt1501;
			local22 = (local14 & 0x7) + Static109.anInt2952;
			local26 = Static7.aClass2_Sub9_Sub1_1.method632();
			local30 = Static7.aClass2_Sub9_Sub1_1.method632();
			local44 = Static7.aClass2_Sub9_Sub1_1.method632();
			if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
				@Pc(219) Class3 local219 = Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local18][local22];
				if (local219 != null) {
					for (@Pc(226) Class2_Sub1_Sub1_Sub4 local226 = (Class2_Sub1_Sub1_Sub4) local219.method82(); local226 != null; local226 = (Class2_Sub1_Sub1_Sub4) local219.method74()) {
						if (local226.anInt771 == (local26 & 0x7FFF) && local30 == local226.anInt767) {
							local226.anInt767 = local44;
							break;
						}
					}
					Static83.method1495(local18, local22);
				}
			}
		} else {
			@Pc(332) int local332;
			if (Static35.anInt825 == 67) {
				local14 = Static7.aClass2_Sub9_Sub1_1.method650();
				local18 = Static7.aClass2_Sub9_Sub1_1.method640();
				local22 = local18 >> 2;
				local26 = local18 & 0x3;
				local30 = Static62.anIntArray171[local22];
				local44 = Static7.aClass2_Sub9_Sub1_1.method640();
				local36 = (local44 >> 4 & 0x7) + Static57.anInt1501;
				local48 = (local44 & 0x7) + Static109.anInt2952;
				if (local36 >= 0 && local48 >= 0 && local36 < 103 && local48 < 103) {
					if (local30 == 0) {
						@Pc(323) Class9 local323 = Static111.aClass30_1.method747(Static105.anInt2531, local36, local48);
						if (local323 != null) {
							local332 = local323.anInt242 >> 14 & 0x7FFF;
							if (local22 == 2) {
								local323.aClass2_Sub1_Sub1_2 = new Class2_Sub1_Sub1_Sub1(local332, 2, local26 + 4, Static105.anInt2531, local36, local48, local14, false, local323.aClass2_Sub1_Sub1_2);
								local323.aClass2_Sub1_Sub1_3 = new Class2_Sub1_Sub1_Sub1(local332, 2, local26 + 1 & 0x3, Static105.anInt2531, local36, local48, local14, false, local323.aClass2_Sub1_Sub1_3);
							} else {
								local323.aClass2_Sub1_Sub1_2 = new Class2_Sub1_Sub1_Sub1(local332, local22, local26, Static105.anInt2531, local36, local48, local14, false, local323.aClass2_Sub1_Sub1_2);
							}
						}
					}
					if (local30 == 1) {
						@Pc(401) Class25 local401 = Static111.aClass30_1.method750(Static105.anInt2531, local36, local48);
						if (local401 != null) {
							local332 = local401.anInt811 >> 14 & 0x7FFF;
							if (local22 == 4 || local22 == 5) {
								local401.aClass2_Sub1_Sub1_4 = new Class2_Sub1_Sub1_Sub1(local332, 4, local26, Static105.anInt2531, local36, local48, local14, false, local401.aClass2_Sub1_Sub1_4);
							} else if (local22 == 6) {
								local401.aClass2_Sub1_Sub1_4 = new Class2_Sub1_Sub1_Sub1(local332, 4, local26 + 4, Static105.anInt2531, local36, local48, local14, false, local401.aClass2_Sub1_Sub1_4);
							} else if (local22 == 7) {
								local401.aClass2_Sub1_Sub1_4 = new Class2_Sub1_Sub1_Sub1(local332, 4, (local26 + 2 & 0x3) + 4, Static105.anInt2531, local36, local48, local14, false, local401.aClass2_Sub1_Sub1_4);
							} else if (local22 == 8) {
								local401.aClass2_Sub1_Sub1_4 = new Class2_Sub1_Sub1_Sub1(local332, 4, local26 + 4, Static105.anInt2531, local36, local48, local14, false, local401.aClass2_Sub1_Sub1_4);
								local401.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub1(local332, 4, (local26 + 2 & 0x3) + 4, Static105.anInt2531, local36, local48, local14, false, local401.aClass2_Sub1_Sub1_5);
							}
						}
					}
					if (local30 == 2) {
						if (local22 == 11) {
							local22 = 10;
						}
						@Pc(548) Class53 local548 = Static111.aClass30_1.method745(Static105.anInt2531, local36, local48);
						if (local548 != null) {
							local548.aClass2_Sub1_Sub1_6 = new Class2_Sub1_Sub1_Sub1(local548.anInt1917 >> 14 & 0x7FFF, local22, local26, Static105.anInt2531, local36, local48, local14, false, local548.aClass2_Sub1_Sub1_6);
						}
					}
					if (local30 == 3) {
						@Pc(581) Class6 local581 = Static111.aClass30_1.method754(Static105.anInt2531, local36, local48);
						if (local581 != null) {
							local581.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1_Sub1(local581.anInt207 >> 14 & 0x7FFF, 22, local26, Static105.anInt2531, local36, local48, local14, false, local581.aClass2_Sub1_Sub1_1);
						}
					}
				}
			} else {
				@Pc(659) int local659;
				@Pc(667) int local667;
				@Pc(671) int local671;
				@Pc(679) int local679;
				if (Static35.anInt825 == 66) {
					local14 = Static7.aClass2_Sub9_Sub1_1.method640();
					local18 = Static57.anInt1501 + (local14 >> 4 & 0x7);
					local22 = Static109.anInt2952 + (local14 & 0x7);
					local26 = local18 + Static7.aClass2_Sub9_Sub1_1.method658();
					local30 = local22 + Static7.aClass2_Sub9_Sub1_1.method658();
					local44 = Static7.aClass2_Sub9_Sub1_1.method666();
					local36 = Static7.aClass2_Sub9_Sub1_1.method632();
					local48 = Static7.aClass2_Sub9_Sub1_1.method640() * 4;
					local659 = Static7.aClass2_Sub9_Sub1_1.method640() * 4;
					local332 = Static7.aClass2_Sub9_Sub1_1.method632();
					local667 = Static7.aClass2_Sub9_Sub1_1.method632();
					local671 = Static7.aClass2_Sub9_Sub1_1.method640();
					local679 = Static7.aClass2_Sub9_Sub1_1.method640();
					if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104 && local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104 && local36 != 65535) {
						local18 = local18 * 128 + 64;
						local30 = local30 * 128 + 64;
						local26 = local26 * 128 + 64;
						local22 = local22 * 128 + 64;
						@Pc(766) Class2_Sub1_Sub1_Sub5 local766 = new Class2_Sub1_Sub1_Sub5(local36, Static105.anInt2531, local18, local22, Static93.method1730(local18, Static105.anInt2531, local22) - local48, local332 - -Static28.anInt704, local667 + Static28.anInt704, local671, local679, local44, local659);
						local766.method811(Static93.method1730(local26, Static105.anInt2531, local30) - local659, local30, local26, Static28.anInt704 + local332);
						Static120.aClass3_16.method75(local766);
					}
				} else {
					if (Static35.anInt825 == 68) {
						@Pc(796) byte local796 = Static7.aClass2_Sub9_Sub1_1.method618();
						local18 = Static7.aClass2_Sub9_Sub1_1.method650();
						@Pc(804) byte local804 = Static7.aClass2_Sub9_Sub1_1.method658();
						local26 = Static7.aClass2_Sub9_Sub1_1.method650();
						local30 = Static7.aClass2_Sub9_Sub1_1.method632();
						local44 = Static7.aClass2_Sub9_Sub1_1.method621();
						@Pc(820) byte local820 = Static7.aClass2_Sub9_Sub1_1.method618();
						@Pc(824) byte local824 = Static7.aClass2_Sub9_Sub1_1.method658();
						local659 = Static7.aClass2_Sub9_Sub1_1.method613();
						local667 = local659 & 0x3;
						local332 = local659 >> 2;
						local671 = Static62.anIntArray171[local332];
						local679 = Static7.aClass2_Sub9_Sub1_1.method640();
						@Pc(857) Class2_Sub1_Sub1_Sub3_Sub2 local857;
						if (Static56.anInt1466 == local30) {
							local857 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1;
						} else {
							local857 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local30];
						}
						@Pc(869) int local869 = Static109.anInt2952 + (local679 & 0x7);
						@Pc(877) int local877 = Static57.anInt1501 + (local679 >> 4 & 0x7);
						if (local857 != null) {
							@Pc(883) Class2_Sub1_Sub4 local883 = Static107.method1839(local44);
							@Pc(896) int local896;
							@Pc(899) int local899;
							if (local667 == 1 || local667 == 3) {
								local896 = local883.anInt1066;
								local899 = local883.anInt1036;
							} else {
								local899 = local883.anInt1066;
								local896 = local883.anInt1036;
							}
							@Pc(915) int local915 = (local899 + 1 >> 1) + local869;
							@Pc(921) int local921 = local869 + (local899 >> 1);
							@Pc(925) int[][] local925 = Static118.anIntArrayArrayArray6[Static105.anInt2531];
							@Pc(934) int local934 = (local877 << 7) + (local896 << 6);
							@Pc(940) int local940 = (local896 >> 1) + local877;
							@Pc(948) int local948 = (local899 << 6) + (local869 << 7);
							@Pc(956) int local956 = (local896 + 1 >> 1) + local877;
							@Pc(983) int local983 = local925[local940][local915] + local925[local940][local921] + local925[local956][local921] + local925[local956][local915] >> 2;
							@Pc(993) Class2_Sub1_Sub1_Sub2 local993 = local883.method702(local983, local948, local934, local332, local925, local667);
							if (local993 != null) {
								method216(local877, local869, 0, 0, -1, Static105.anInt2531, local671, local26 + 1, local18 + 1);
								local857.anInt1837 = Static28.anInt704 + local18;
								local857.anInt1840 = local983;
								local857.anInt1830 = Static28.anInt704 + local26;
								@Pc(1028) byte local1028;
								if (local824 < local804) {
									local1028 = local804;
									local804 = local824;
									local824 = local1028;
								}
								local857.anInt1842 = local896 * 64 + local877 * 128;
								local857.anInt1843 = local877 + local804;
								if (local796 > local820) {
									local1028 = local796;
									local796 = local820;
									local820 = local1028;
								}
								local857.anInt1833 = local869 + local796;
								local857.anInt1835 = local869 * 128 + local899 * 64;
								local857.anInt1844 = local820 + local869;
								local857.anInt1845 = local824 + local877;
								local857.aClass2_Sub1_Sub1_Sub2_3 = local993;
							}
						}
					}
					if (Static35.anInt825 == 149) {
						local14 = Static7.aClass2_Sub9_Sub1_1.method640();
						local22 = (local14 & 0x7) + Static109.anInt2952;
						local18 = (local14 >> 4 & 0x7) + Static57.anInt1501;
						local26 = Static7.aClass2_Sub9_Sub1_1.method632();
						local30 = Static7.aClass2_Sub9_Sub1_1.method640();
						local44 = local30 >> 4 & 0xF;
						local36 = local30 & 0x7;
						local48 = Static7.aClass2_Sub9_Sub1_1.method640();
						if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
							local659 = local44 + 1;
							if (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0] >= local18 - local659 && Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0] <= local18 + local659 && local22 - local659 <= Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0] && local659 + local22 >= Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0] && Static106.anInt2536 != 0 && local36 > 0 && Static70.anInt1888 < 50) {
								Static48.anIntArray137[Static70.anInt1888] = local26;
								Static104.anIntArray285[Static70.anInt1888] = local36;
								Static106.anIntArray289[Static70.anInt1888] = local48;
								Static64.aClass66Array1[Static70.anInt1888] = null;
								Static121.anIntArray331[Static70.anInt1888] = (local22 << 8) + (local18 << 16) + local44;
								Static70.anInt1888++;
							}
						}
					}
					if (Static35.anInt825 == 75) {
						local14 = Static7.aClass2_Sub9_Sub1_1.method614();
						local22 = Static109.anInt2952 + (local14 & 0x7);
						local18 = Static57.anInt1501 + (local14 >> 4 & 0x7);
						local26 = Static7.aClass2_Sub9_Sub1_1.method639();
						if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
							@Pc(1292) Class3 local1292 = Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local18][local22];
							if (local1292 != null) {
								for (local120 = (Class2_Sub1_Sub1_Sub4) local1292.method82(); local120 != null; local120 = (Class2_Sub1_Sub1_Sub4) local1292.method74()) {
									if ((local26 & 0x7FFF) == local120.anInt771) {
										local120.method2209();
										break;
									}
								}
								if (local1292.method82() == null) {
									Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local18][local22] = null;
								}
								Static83.method1495(local18, local22);
							}
						}
					} else if (Static35.anInt825 == 10) {
						local14 = Static7.aClass2_Sub9_Sub1_1.method650();
						local18 = Static7.aClass2_Sub9_Sub1_1.method612();
						local22 = Static57.anInt1501 + (local18 >> 4 & 0x7);
						local26 = Static109.anInt2952 + (local18 & 0x7);
						local30 = Static7.aClass2_Sub9_Sub1_1.method650();
						local44 = Static7.aClass2_Sub9_Sub1_1.method632();
						if (local22 >= 0 && local26 >= 0 && local22 < 104 && local26 < 104 && local14 != Static56.anInt1466) {
							@Pc(1390) Class2_Sub1_Sub1_Sub4 local1390 = new Class2_Sub1_Sub1_Sub4();
							local1390.anInt771 = local30;
							local1390.anInt767 = local44;
							if (Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local22][local26] == null) {
								Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local22][local26] = new Class3();
							}
							Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local22][local26].method75(local1390);
							Static83.method1495(local22, local26);
						}
					} else if (Static35.anInt825 == 107) {
						local14 = Static7.aClass2_Sub9_Sub1_1.method640();
						local18 = Static57.anInt1501 + (local14 >> 4 & 0x7);
						local22 = (local14 & 0x7) + Static109.anInt2952;
						local26 = Static7.aClass2_Sub9_Sub1_1.method632();
						local30 = Static7.aClass2_Sub9_Sub1_1.method640();
						local44 = Static7.aClass2_Sub9_Sub1_1.method632();
						if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
							local22 = local22 * 128 + 64;
							local18 = local18 * 128 + 64;
							@Pc(1513) Class2_Sub1_Sub1_Sub6 local1513 = new Class2_Sub1_Sub1_Sub6(local26, Static105.anInt2531, local18, local22, Static93.method1730(local18, Static105.anInt2531, local22) - local30, local44, Static28.anInt704);
							Static79.aClass3_12.method75(local1513);
						}
					} else if (Static35.anInt825 == 140) {
						local14 = Static7.aClass2_Sub9_Sub1_1.method640();
						local18 = Static57.anInt1501 + (local14 >> 4 & 0x7);
						local22 = Static109.anInt2952 + (local14 & 0x7);
						local26 = Static7.aClass2_Sub9_Sub1_1.method613();
						local44 = local26 & 0x3;
						local30 = local26 >> 2;
						local36 = Static62.anIntArray171[local30];
						if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
							method216(local18, local22, local30, local44, -1, Static105.anInt2531, local36, 0, -1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method211() {
		for (@Pc(10) Class2_Sub14 local10 = (Class2_Sub14) Static49.aClass3_6.method82(); local10 != null; local10 = (Class2_Sub14) Static49.aClass3_6.method74()) {
			if (local10.aClass2_Sub5_Sub2_2 != null) {
				Static77.aClass2_Sub5_Sub1_1.method1137(local10.aClass2_Sub5_Sub2_2);
				local10.aClass2_Sub5_Sub2_2 = null;
			}
			if (local10.aClass2_Sub5_Sub2_1 != null) {
				Static77.aClass2_Sub5_Sub1_1.method1137(local10.aClass2_Sub5_Sub2_1);
				local10.aClass2_Sub5_Sub2_1 = null;
			}
		}
		Static49.aClass3_6.method81();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
	public static void method212(@OriginalArg(1) int arg0) {
		Static5.anInt157 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method213() {
		try {
			if (Static26.anInt672 == 0) {
				if (Static85.aClass57_2 != null) {
					Static85.aClass57_2.method1596();
					Static85.aClass57_2 = null;
				}
				Static119.aBoolean231 = false;
				Static26.anInt672 = 1;
				Static41.anInt1092 = 0;
				Static62.aClass26_33 = null;
			}
			if (Static26.anInt672 == 1) {
				if (Static62.aClass26_33 == null) {
					Static62.aClass26_33 = Static129.aClass59_5.method1636(Static45.aString1, Static47.anInt1271);
				}
				if (Static62.aClass26_33.anInt831 == 2) {
					throw new IOException();
				}
				if (Static62.aClass26_33.anInt831 == 1) {
					Static85.aClass57_2 = new Class57((Socket) Static62.aClass26_33.anObject2, Static129.aClass59_5);
					Static62.aClass26_33 = null;
					Static26.anInt672 = 2;
				}
			}
			if (Static26.anInt672 == 2) {
				@Pc(76) long local76 = Static33.aLong75 = Static87.aClass40_661.method981();
				Static57.aClass2_Sub9_Sub1_2.anInt976 = 0;
				@Pc(86) int local86 = (int) (local76 >> 16 & 0x1FL);
				Static57.aClass2_Sub9_Sub1_2.method644(14);
				Static57.aClass2_Sub9_Sub1_2.method644(local86);
				Static85.aClass57_2.method1591(Static57.aClass2_Sub9_Sub1_2.aByteArray16, 2);
				Static26.anInt672 = 3;
				Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
			}
			@Pc(123) int local123;
			if (Static26.anInt672 == 3) {
				if (Static32.aClass34_2 != null) {
					Static32.aClass34_2.method2110();
				}
				if (Static29.aClass34_1 != null) {
					Static29.aClass34_1.method2110();
				}
				local123 = Static85.aClass57_2.method1594();
				if (Static32.aClass34_2 != null) {
					Static32.aClass34_2.method2110();
				}
				if (Static29.aClass34_1 != null) {
					Static29.aClass34_1.method2110();
				}
				if (local123 != 0) {
					Static32.method491(local123);
					return;
				}
				Static26.anInt672 = 4;
				Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
			}
			if (Static26.anInt672 == 4) {
				if (Static7.aClass2_Sub9_Sub1_1.anInt976 < 8) {
					local123 = Static85.aClass57_2.method1597();
					if (local123 > 8 - Static7.aClass2_Sub9_Sub1_1.anInt976) {
						local123 = 8 - Static7.aClass2_Sub9_Sub1_1.anInt976;
					}
					if (local123 > 0) {
						Static85.aClass57_2.method1592(Static7.aClass2_Sub9_Sub1_1.aByteArray16, local123, Static7.aClass2_Sub9_Sub1_1.anInt976);
						Static7.aClass2_Sub9_Sub1_1.anInt976 += local123;
					}
				}
				if (Static7.aClass2_Sub9_Sub1_1.anInt976 == 8) {
					Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
					Static102.aLong69 = Static7.aClass2_Sub9_Sub1_1.method626();
					Static26.anInt672 = 5;
				}
			}
			if (Static26.anInt672 == 5) {
				Static57.aClass2_Sub9_Sub1_2.anInt976 = 0;
				@Pc(214) int[] local214 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static102.aLong69 >> 32), (int) Static102.aLong69 };
				Static57.aClass2_Sub9_Sub1_2.method644(10);
				Static57.aClass2_Sub9_Sub1_2.method620(local214[0]);
				Static57.aClass2_Sub9_Sub1_2.method620(local214[1]);
				Static57.aClass2_Sub9_Sub1_2.method620(local214[2]);
				Static57.aClass2_Sub9_Sub1_2.method620(local214[3]);
				Static57.aClass2_Sub9_Sub1_2.method647(Static87.aClass40_661.method981());
				Static57.aClass2_Sub9_Sub1_2.method664(Static87.aClass40_664);
				Static57.aClass2_Sub9_Sub1_2.method652(Static106.aBigInteger2, Static14.aBigInteger1);
				Static76.aClass2_Sub9_Sub1_3.anInt976 = 0;
				if (Static105.anInt2533 == 40) {
					Static76.aClass2_Sub9_Sub1_3.method644(18);
				} else {
					Static76.aClass2_Sub9_Sub1_3.method644(16);
				}
				Static76.aClass2_Sub9_Sub1_3.method644(Static57.aClass2_Sub9_Sub1_2.anInt976 + 93);
				Static76.aClass2_Sub9_Sub1_3.method620(467);
				Static76.aClass2_Sub9_Sub1_3.method644(Static34.aBoolean60 ? 1 : 0);
				Static85.method1588(Static76.aClass2_Sub9_Sub1_3);
				Static76.aClass2_Sub9_Sub1_3.method620(Static109.aClass24_Sub1_19.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static133.aClass24_Sub1_22.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static39.aClass24_Sub1_3.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static122.aClass24_Sub1_18.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static32.aClass24_Sub1_2.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static80.aClass24_Sub1_13.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static61.aClass24_Sub1_8.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static76.aClass24_Sub1_12.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static10.aClass24_Sub1_20.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static67.aClass24_Sub1_11.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static92.aClass24_Sub1_15.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static105.aClass24_Sub1_17.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static65.aClass24_Sub1_9.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static66.aClass24_Sub1_10.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static129.aClass24_Sub1_21.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method620(Static60.aClass24_Sub1_7.anInt2675);
				Static76.aClass2_Sub9_Sub1_3.method619(Static57.aClass2_Sub9_Sub1_2.anInt976, Static57.aClass2_Sub9_Sub1_2.aByteArray16);
				Static85.aClass57_2.method1591(Static76.aClass2_Sub9_Sub1_3.aByteArray16, Static76.aClass2_Sub9_Sub1_3.anInt976);
				Static57.aClass2_Sub9_Sub1_2.method676(local214);
				for (@Pc(425) int local425 = 0; local425 < 4; local425++) {
					local214[local425] += 50;
				}
				Static7.aClass2_Sub9_Sub1_1.method676(local214);
				Static26.anInt672 = 6;
			}
			if (Static26.anInt672 == 6 && Static85.aClass57_2.method1597() > 0) {
				local123 = Static85.aClass57_2.method1594();
				if (local123 == 21 && Static105.anInt2533 == 20) {
					Static26.anInt672 = 7;
				} else if (local123 == 2) {
					Static26.anInt672 = 9;
				} else if (local123 == 15 && Static105.anInt2533 == 40) {
					Static84.method1571();
					return;
				} else if (local123 == 23 && Static37.anInt1001 < 1) {
					Static26.anInt672 = 0;
					Static37.anInt1001++;
				} else {
					Static32.method491(local123);
					return;
				}
			}
			if (Static26.anInt672 == 7 && Static85.aClass57_2.method1597() > 0) {
				Static119.anInt2792 = Static85.aClass57_2.method1594() * 60 + 180;
				Static26.anInt672 = 8;
			}
			if (Static26.anInt672 == 8) {
				Static41.anInt1092 = 0;
				Static56.method1005(Static62.aClass40_832, Static40.method722(new Class40[] { Static49.method886(Static119.anInt2792 / 60), Static116.aClass40_1453 }), Static12.aClass40_1642);
				if (--Static119.anInt2792 <= 0) {
					Static26.anInt672 = 0;
				}
			} else {
				if (Static26.anInt672 == 9 && Static85.aClass57_2.method1597() >= 8) {
					Static112.anInt2609 = Static85.aClass57_2.method1594();
					Static105.aBoolean205 = Static85.aClass57_2.method1594() == 1;
					Static56.anInt1466 = Static85.aClass57_2.method1594();
					Static56.anInt1466 <<= 0x8;
					Static56.anInt1466 += Static85.aClass57_2.method1594();
					Static81.anInt2090 = Static85.aClass57_2.method1594();
					Static85.aClass57_2.method1592(Static7.aClass2_Sub9_Sub1_1.aByteArray16, 1, 0);
					Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
					Static35.anInt825 = Static7.aClass2_Sub9_Sub1_1.method670();
					Static85.aClass57_2.method1592(Static7.aClass2_Sub9_Sub1_1.aByteArray16, 2, 0);
					Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
					Static130.anInt3009 = Static7.aClass2_Sub9_Sub1_1.method632();
					Static26.anInt672 = 10;
				}
				if (Static26.anInt672 != 10) {
					Static41.anInt1092++;
					if (Static41.anInt1092 > 2000) {
						if (Static37.anInt1001 < 1) {
							if (Static47.anInt1271 == Static7.anInt198) {
								Static47.anInt1271 = Static86.anInt3032;
							} else {
								Static47.anInt1271 = Static7.anInt198;
							}
							Static26.anInt672 = 0;
							Static37.anInt1001++;
						} else {
							Static32.method491(-3);
						}
					}
				} else if (Static85.aClass57_2.method1597() >= Static130.anInt3009) {
					Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
					Static85.aClass57_2.method1592(Static7.aClass2_Sub9_Sub1_1.aByteArray16, Static130.anInt3009, 0);
					Static33.method1930();
					Static134.anInt1646 = -1;
					Static87.method895(false);
					Static35.anInt825 = -1;
				}
			}
		} catch (@Pc(698) IOException local698) {
			if (Static37.anInt1001 < 1) {
				if (Static47.anInt1271 == Static7.anInt198) {
					Static47.anInt1271 = Static86.anInt3032;
				} else {
					Static47.anInt1271 = Static7.anInt198;
				}
				Static37.anInt1001++;
				Static26.anInt672 = 0;
			} else {
				Static32.method491(-2);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method214() {
		Static11.aClass55_12.method1413();
		Static34.aClass55_31.method1413();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method215() {
		aClass40_203 = null;
		aClass2_Sub1_Sub2_Sub4Array2 = null;
		aClass2_Sub13_1 = null;
		aClass40_204 = null;
		aClass40_202 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIII)V")
	private static void method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class2_Sub22 local3 = null;
		for (@Pc(8) Class2_Sub22 local8 = (Class2_Sub22) Static19.aClass3_4.method82(); local8 != null; local8 = (Class2_Sub22) Static19.aClass3_4.method74()) {
			if (local8.anInt2647 == arg5 && local8.anInt2642 == arg0 && arg1 == local8.anInt2653 && arg6 == local8.anInt2654) {
				local3 = local8;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class2_Sub22();
			local3.anInt2642 = arg0;
			local3.anInt2653 = arg1;
			local3.anInt2654 = arg6;
			local3.anInt2647 = arg5;
			Static69.method1236(local3);
			Static19.aClass3_4.method75(local3);
		}
		local3.anInt2639 = arg7;
		local3.anInt2646 = arg4;
		local3.anInt2652 = arg8;
		local3.anInt2648 = arg3;
		local3.anInt2640 = arg2;
	}
}
