import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Z")
	public static boolean aBoolean4;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_22 = Static38.method685("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!ai;")
	private static Class6 aClass6_26 = Static38.method685("Loaded fonts");

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!ai;")
	public static Class6 aClass6_23 = aClass6_26;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!ai;")
	private static Class6 aClass6_25 = Static38.method685("Loading title screen )2 ");

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!ai;")
	public static Class6 aClass6_24 = aClass6_25;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_27 = Static38.method685("<col=ff3000>");

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!ai;")
	public static Class6 aClass6_28 = Static38.method685("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public static int anInt69 = 0;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!ai;")
	public static Class6 aClass6_29 = null;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method47() {
		@Pc(16) int local16;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (Static86.anInt2213 == 189) {
			local16 = Static64.aClass2_Sub13_Sub1_1.method1402();
			local25 = Static115.anInt2777 + (local16 >> 4 & 0x7);
			local31 = Static74.anInt1798 + (local16 & 0x7);
			local35 = Static64.aClass2_Sub13_Sub1_1.method1397();
			local39 = Static64.aClass2_Sub13_Sub1_1.method1397();
			local43 = Static64.aClass2_Sub13_Sub1_1.method1397();
			if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104) {
				@Pc(65) Class84 local65 = Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local25][local31];
				if (local65 != null) {
					for (@Pc(72) Class2_Sub3_Sub5_Sub2 local72 = (Class2_Sub3_Sub5_Sub2) local65.method2694(); local72 != null; local72 = (Class2_Sub3_Sub5_Sub2) local65.method2697()) {
						if ((local35 & 0x7FFF) == local72.anInt1025 && local39 == local72.anInt1018) {
							local72.anInt1018 = local43;
							break;
						}
					}
					Static117.method1873(local31, local25);
				}
			}
			return;
		}
		@Pc(163) Class2_Sub3_Sub5_Sub2 local163;
		if (Static86.anInt2213 == 194) {
			local16 = Static64.aClass2_Sub13_Sub1_1.method1415();
			local25 = Static64.aClass2_Sub13_Sub1_1.method1402();
			local31 = (local25 >> 4 & 0x7) + Static115.anInt2777;
			local35 = Static74.anInt1798 + (local25 & 0x7);
			if (local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104) {
				@Pc(156) Class84 local156 = Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local31][local35];
				if (local156 != null) {
					for (local163 = (Class2_Sub3_Sub5_Sub2) local156.method2694(); local163 != null; local163 = (Class2_Sub3_Sub5_Sub2) local156.method2697()) {
						if ((local16 & 0x7FFF) == local163.anInt1025) {
							local163.method2808();
							break;
						}
					}
					if (local156.method2694() == null) {
						Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local31][local35] = null;
					}
					Static117.method1873(local35, local31);
				}
			}
			return;
		}
		@Pc(243) int local243;
		@Pc(247) int local247;
		@Pc(269) int local269;
		if (Static86.anInt2213 == 21) {
			local16 = Static64.aClass2_Sub13_Sub1_1.method1402();
			local25 = Static115.anInt2777 + (local16 >> 4 & 0x7);
			local31 = Static74.anInt1798 + (local16 & 0x7);
			local35 = Static64.aClass2_Sub13_Sub1_1.method1397();
			local39 = Static64.aClass2_Sub13_Sub1_1.method1402();
			local43 = local39 >> 4 & 0xF;
			local243 = local39 & 0x7;
			local247 = Static64.aClass2_Sub13_Sub1_1.method1402();
			if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104) {
				local269 = local43 + 1;
				if (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0] >= local25 - local269 && Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0] <= local269 + local25 && Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0] >= local31 - local269 && Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0] <= local269 + local31 && Static107.anInt2566 != 0 && local243 > 0 && Static122.anInt2842 < 50) {
					Static162.anIntArray377[Static122.anInt2842] = local35;
					Static158.anIntArray360[Static122.anInt2842] = local243;
					Static143.anIntArray297[Static122.anInt2842] = local247;
					Static126.aClass86Array1[Static122.anInt2842] = null;
					Static152.anIntArray350[Static122.anInt2842] = local43 + (local25 << 16) + (local31 << 8);
					Static122.anInt2842++;
				}
			}
		}
		if (Static86.anInt2213 == 200) {
			local16 = Static64.aClass2_Sub13_Sub1_1.method1430();
			local25 = Static64.aClass2_Sub13_Sub1_1.method1415();
			local31 = Static64.aClass2_Sub13_Sub1_1.method1402();
			local35 = Static115.anInt2777 + (local31 >> 4 & 0x7);
			local39 = Static74.anInt1798 + (local31 & 0x7);
			local43 = Static64.aClass2_Sub13_Sub1_1.method1410();
			if (local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && Static68.anInt1727 != local25) {
				@Pc(406) Class2_Sub3_Sub5_Sub2 local406 = new Class2_Sub3_Sub5_Sub2();
				local406.anInt1018 = local16;
				local406.anInt1025 = local43;
				if (Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local35][local39] == null) {
					Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local35][local39] = new Class84();
				}
				Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local35][local39].method2701(local406);
				Static117.method1873(local39, local35);
			}
			return;
		}
		@Pc(505) int local505;
		if (Static86.anInt2213 == 11) {
			local16 = Static64.aClass2_Sub13_Sub1_1.method1402();
			local25 = Static115.anInt2777 + (local16 >> 4 & 0x7);
			local31 = Static74.anInt1798 + (local16 & 0x7);
			local35 = local25 + Static64.aClass2_Sub13_Sub1_1.method1394();
			local39 = Static64.aClass2_Sub13_Sub1_1.method1394() + local31;
			local43 = Static64.aClass2_Sub13_Sub1_1.method1400();
			local243 = Static64.aClass2_Sub13_Sub1_1.method1397();
			local247 = Static64.aClass2_Sub13_Sub1_1.method1402() * 4;
			local269 = Static64.aClass2_Sub13_Sub1_1.method1402() * 4;
			local505 = Static64.aClass2_Sub13_Sub1_1.method1397();
			@Pc(509) int local509 = Static64.aClass2_Sub13_Sub1_1.method1397();
			@Pc(513) int local513 = Static64.aClass2_Sub13_Sub1_1.method1402();
			@Pc(517) int local517 = Static64.aClass2_Sub13_Sub1_1.method1402();
			if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104 && local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local243 != 65535) {
				local39 = local39 * 128 + 64;
				local31 = local31 * 128 + 64;
				local25 = local25 * 128 + 64;
				local35 = local35 * 128 + 64;
				@Pc(594) Class2_Sub3_Sub5_Sub5 local594 = new Class2_Sub3_Sub5_Sub5(local243, Static36.anInt1020, local25, local31, Static131.method2041(local25, local31, Static36.anInt1020) - local247, local505 + Static107.anInt2559, local509 + Static107.anInt2559, local513, local517, local43, local269);
				local594.method2139(local505 + Static107.anInt2559, local35, local39, Static131.method2041(local35, local39, Static36.anInt1020) - local269);
				Static112.aClass84_7.method2701(local594);
			}
			return;
		}
		if (Static86.anInt2213 == 2) {
			@Pc(623) byte local623 = Static64.aClass2_Sub13_Sub1_1.method1412();
			local25 = Static64.aClass2_Sub13_Sub1_1.method1410();
			local31 = Static64.aClass2_Sub13_Sub1_1.method1410();
			local35 = Static64.aClass2_Sub13_Sub1_1.method1409();
			local43 = local35 & 0x3;
			local39 = local35 >> 2;
			local243 = Static143.anIntArray299[local39];
			local247 = Static64.aClass2_Sub13_Sub1_1.method1409();
			local269 = (local247 >> 4 & 0x7) + Static115.anInt2777;
			local505 = Static74.anInt1798 + (local247 & 0x7);
			@Pc(670) byte local670 = Static64.aClass2_Sub13_Sub1_1.method1394();
			@Pc(674) byte local674 = Static64.aClass2_Sub13_Sub1_1.method1412();
			@Pc(678) byte local678 = Static64.aClass2_Sub13_Sub1_1.method1412();
			@Pc(682) int local682 = Static64.aClass2_Sub13_Sub1_1.method1410();
			@Pc(686) int local686 = Static64.aClass2_Sub13_Sub1_1.method1430();
			@Pc(695) Class2_Sub3_Sub5_Sub1_Sub1 local695;
			if (local25 == Static68.anInt1727) {
				local695 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1;
			} else {
				local695 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local25];
			}
			if (local695 != null) {
				@Pc(707) Class2_Sub3_Sub6 local707 = Static163.method2609(local682);
				@Pc(716) int local716;
				@Pc(719) int local719;
				if (local43 == 1 || local43 == 3) {
					local716 = local707.anInt1195;
					local719 = local707.anInt1205;
				} else {
					local716 = local707.anInt1205;
					local719 = local707.anInt1195;
				}
				@Pc(733) int local733 = local269 + (local716 >> 1);
				@Pc(741) int local741 = (local716 + 1 >> 1) + local269;
				@Pc(747) int local747 = local505 + (local719 >> 1);
				@Pc(756) int local756 = local505 + (local719 + 1 >> 1);
				@Pc(760) int[][] local760 = Static165.anIntArrayArrayArray10[Static36.anInt1020];
				@Pc(768) int local768 = (local716 << 6) + (local269 << 7);
				@Pc(796) int local796 = local760[local733][local756] + local760[local733][local747] + local760[local741][local747] + local760[local741][local756] >> 2;
				@Pc(805) int local805 = (local505 << 7) + (local719 << 6);
				@Pc(815) Class2_Sub3_Sub5_Sub7 local815 = local707.method742(local760, local805, local768, local796, local39, local43);
				if (local815 != null) {
					Static123.method1928(0, Static36.anInt1020, local686 + 1, 0, local269, local31 + 1, -1, local505, local243);
					local695.aClass2_Sub3_Sub5_Sub7_1 = local815;
					local695.anInt950 = local686 + Static107.anInt2559;
					local695.anInt956 = local505 * 128 + local719 * 64;
					local695.anInt957 = local31 + Static107.anInt2559;
					local695.anInt953 = local796;
					local695.anInt949 = local716 * 64 + local269 * 128;
					@Pc(876) byte local876;
					if (local678 < local670) {
						local876 = local670;
						local670 = local678;
						local678 = local876;
					}
					local695.anInt952 = local670 + local269;
					if (local623 < local674) {
						local876 = local674;
						local674 = local623;
						local623 = local876;
					}
					local695.anInt947 = local505 + local674;
					local695.anInt945 = local623 + local505;
					local695.anInt940 = local269 + local678;
				}
			}
		}
		if (Static86.anInt2213 == 197) {
			local16 = Static64.aClass2_Sub13_Sub1_1.method1436();
			local25 = local16 >> 2;
			local35 = Static143.anIntArray299[local25];
			local31 = local16 & 0x3;
			local39 = Static64.aClass2_Sub13_Sub1_1.method1409();
			local43 = Static115.anInt2777 + (local39 >> 4 & 0x7);
			local243 = (local39 & 0x7) + Static74.anInt1798;
			if (local43 >= 0 && local243 >= 0 && local43 < 104 && local243 < 104) {
				Static123.method1928(local25, Static36.anInt1020, -1, local31, local43, 0, -1, local243, local35);
			}
		} else if (Static86.anInt2213 == 67) {
			local16 = Static64.aClass2_Sub13_Sub1_1.method1436();
			local31 = (local16 & 0x7) + Static74.anInt1798;
			local25 = Static115.anInt2777 + (local16 >> 4 & 0x7);
			local35 = Static64.aClass2_Sub13_Sub1_1.method1410();
			local39 = Static64.aClass2_Sub13_Sub1_1.method1430();
			if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104) {
				local163 = new Class2_Sub3_Sub5_Sub2();
				local163.anInt1018 = local35;
				local163.anInt1025 = local39;
				if (Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local25][local31] == null) {
					Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local25][local31] = new Class84();
				}
				Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local25][local31].method2701(local163);
				Static117.method1873(local31, local25);
			}
		} else if (Static86.anInt2213 == 202) {
			local16 = Static64.aClass2_Sub13_Sub1_1.method1397();
			local25 = Static64.aClass2_Sub13_Sub1_1.method1436();
			local31 = local25 >> 2;
			local35 = local25 & 0x3;
			local39 = Static143.anIntArray299[local31];
			local43 = Static64.aClass2_Sub13_Sub1_1.method1441();
			local243 = (local43 >> 4 & 0x7) + Static115.anInt2777;
			local247 = (local43 & 0x7) + Static74.anInt1798;
			if (local243 >= 0 && local247 >= 0 && local243 < 104 && local247 < 104) {
				Static123.method1928(local31, Static36.anInt1020, -1, local35, local243, 0, local16, local247, local39);
			}
		} else if (Static86.anInt2213 == 114) {
			local16 = Static64.aClass2_Sub13_Sub1_1.method1402();
			local31 = (local16 & 0x7) + Static74.anInt1798;
			local25 = Static115.anInt2777 + (local16 >> 4 & 0x7);
			local35 = Static64.aClass2_Sub13_Sub1_1.method1397();
			local39 = Static64.aClass2_Sub13_Sub1_1.method1402();
			local43 = Static64.aClass2_Sub13_Sub1_1.method1397();
			if (local25 >= 0 && local31 >= 0 && local25 < 104 && local31 < 104) {
				local31 = local31 * 128 + 64;
				local25 = local25 * 128 + 64;
				@Pc(1203) Class2_Sub3_Sub5_Sub4 local1203 = new Class2_Sub3_Sub5_Sub4(local35, Static36.anInt1020, local25, local31, Static131.method2041(local25, local31, Static36.anInt1020) - local39, local43, Static107.anInt2559);
				Static154.aClass84_13.method2701(local1203);
			}
		} else if (Static86.anInt2213 == 72) {
			local16 = Static64.aClass2_Sub13_Sub1_1.method1436();
			local25 = local16 >> 2;
			local31 = local16 & 0x3;
			local35 = Static143.anIntArray299[local25];
			local39 = Static64.aClass2_Sub13_Sub1_1.method1397();
			local43 = Static64.aClass2_Sub13_Sub1_1.method1441();
			local243 = Static115.anInt2777 + (local43 >> 4 & 0x7);
			local247 = (local43 & 0x7) + Static74.anInt1798;
			if (local243 >= 0 && local247 >= 0 && local243 < 103 && local247 < 103) {
				if (local35 == 0) {
					@Pc(1271) Class82 local1271 = Static30.aClass44_1.method1278(Static36.anInt1020, local243, local247);
					if (local1271 != null) {
						local505 = local1271.anInt3864 >> 14 & 0x7FFF;
						if (local25 == 2) {
							local1271.aClass2_Sub3_Sub5_8 = new Class2_Sub3_Sub5_Sub6(local505, 2, local31 + 4, Static36.anInt1020, local243, local247, local39, false, local1271.aClass2_Sub3_Sub5_8);
							local1271.aClass2_Sub3_Sub5_9 = new Class2_Sub3_Sub5_Sub6(local505, 2, local31 + 1 & 0x3, Static36.anInt1020, local243, local247, local39, false, local1271.aClass2_Sub3_Sub5_9);
						} else {
							local1271.aClass2_Sub3_Sub5_8 = new Class2_Sub3_Sub5_Sub6(local505, local25, local31, Static36.anInt1020, local243, local247, local39, false, local1271.aClass2_Sub3_Sub5_8);
						}
					}
				}
				if (local35 == 1) {
					@Pc(1347) Class49 local1347 = Static30.aClass44_1.method1283(Static36.anInt1020, local243, local247);
					if (local1347 != null) {
						local505 = local1347.anInt2258 >> 14 & 0x7FFF;
						if (local25 == 4 || local25 == 5) {
							local1347.aClass2_Sub3_Sub5_2 = new Class2_Sub3_Sub5_Sub6(local505, 4, local31, Static36.anInt1020, local243, local247, local39, false, local1347.aClass2_Sub3_Sub5_2);
						} else if (local25 == 6) {
							local1347.aClass2_Sub3_Sub5_2 = new Class2_Sub3_Sub5_Sub6(local505, 4, local31 + 4, Static36.anInt1020, local243, local247, local39, false, local1347.aClass2_Sub3_Sub5_2);
						} else if (local25 == 7) {
							local1347.aClass2_Sub3_Sub5_2 = new Class2_Sub3_Sub5_Sub6(local505, 4, (local31 + 2 & 0x3) + 4, Static36.anInt1020, local243, local247, local39, false, local1347.aClass2_Sub3_Sub5_2);
						} else if (local25 == 8) {
							local1347.aClass2_Sub3_Sub5_2 = new Class2_Sub3_Sub5_Sub6(local505, 4, local31 + 4, Static36.anInt1020, local243, local247, local39, false, local1347.aClass2_Sub3_Sub5_2);
							local1347.aClass2_Sub3_Sub5_3 = new Class2_Sub3_Sub5_Sub6(local505, 4, (local31 + 2 & 0x3) + 4, Static36.anInt1020, local243, local247, local39, false, local1347.aClass2_Sub3_Sub5_3);
						}
					}
				}
				if (local35 == 2) {
					if (local25 == 11) {
						local25 = 10;
					}
					@Pc(1490) Class8 local1490 = Static30.aClass44_1.method1256(Static36.anInt1020, local243, local247);
					if (local1490 != null) {
						local1490.aClass2_Sub3_Sub5_1 = new Class2_Sub3_Sub5_Sub6(local1490.anInt327 >> 14 & 0x7FFF, local25, local31, Static36.anInt1020, local243, local247, local39, false, local1490.aClass2_Sub3_Sub5_1);
					}
				}
				if (local35 == 3) {
					@Pc(1523) Class63 local1523 = Static30.aClass44_1.method1268(Static36.anInt1020, local243, local247);
					if (local1523 != null) {
						local1523.aClass2_Sub3_Sub5_4 = new Class2_Sub3_Sub5_Sub6(local1523.anInt2818 >> 14 & 0x7FFF, 22, local31, Static36.anInt1020, local243, local247, local39, false, local1523.aClass2_Sub3_Sub5_4);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public static void method48() {
		aClass6_28 = null;
		aClass6_26 = null;
		aClass6_25 = null;
		aClass6_27 = null;
		aClass6_23 = null;
		aClass6_29 = null;
		aClass6_24 = null;
		aClass6_22 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
	public static int method49(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
