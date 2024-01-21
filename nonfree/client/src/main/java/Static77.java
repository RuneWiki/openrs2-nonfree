import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	public static boolean aBoolean68;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!cc;")
	public static Class2_Sub2_Sub1_Sub3 aClass2_Sub2_Sub1_Sub3_9;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_33;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
	public static int[] anIntArray246 = new int[500];

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Lclient!u;")
	public static Class74 aClass74_1149 = Static72.method1077("System)2Update in: ");

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_1150 = Static72.method1077(" )2> @cya@");

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[Lclient!pf;")
	public static Class2_Sub2_Sub2_Sub7[] aClass2_Sub2_Sub2_Sub7Array1 = new Class2_Sub2_Sub2_Sub7[4];

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_1151 = Static72.method1077("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!u;")
	public static Class74 aClass74_1152 = Static72.method1077(" @whi@(X");

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public static int anInt1674 = 0;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public static int anInt1675 = 0;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "Lclient!u;")
	public static Class74 aClass74_1153 = Static72.method1077("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[BII)I")
	public static int method1204(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(12) int local12 = arg2; local12 < arg1; local12++) {
			local5 = local5 >>> 8 ^ Class14.anIntArray58[(arg0[local12] ^ local5) & 0xFF];
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1205() {
		@Pc(12) int local12;
		@Pc(26) int local26;
		@Pc(18) int local18;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (Static35.anInt2888 == 181) {
			local12 = Static19.aClass2_Sub10_Sub1_1.method1514();
			local18 = (local12 & 0x7) + Static114.anInt2460;
			local26 = (local12 >> 4 & 0x7) + Static36.anInt867;
			local30 = Static19.aClass2_Sub10_Sub1_1.method1525();
			local34 = Static19.aClass2_Sub10_Sub1_1.method1517();
			local38 = Static19.aClass2_Sub10_Sub1_1.method1525();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104 && Static39.anInt949 != local34) {
				@Pc(69) Class2_Sub2_Sub2_Sub6 local69 = new Class2_Sub2_Sub2_Sub6();
				local69.anInt1889 = local30;
				local69.anInt1884 = local38;
				if (Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local26][local18] == null) {
					Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local26][local18] = new Class13();
				}
				Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local26][local18].method418(local69);
				Static121.method1782(local18, local26);
			}
			return;
		}
		@Pc(148) int local148;
		@Pc(152) int local152;
		if (Static35.anInt2888 == 33) {
			local12 = Static19.aClass2_Sub10_Sub1_1.method1517();
			local26 = Static19.aClass2_Sub10_Sub1_1.method1518();
			local18 = Static36.anInt867 + (local26 >> 4 & 0x7);
			local30 = (local26 & 0x7) + Static114.anInt2460;
			local34 = Static19.aClass2_Sub10_Sub1_1.method1503();
			local38 = local34 >> 2;
			local148 = local34 & 0x3;
			local152 = Static47.anIntArray133[local38];
			if (local18 >= 0 && local30 >= 0 && local18 < 104 && local30 < 104) {
				Static70.method1060(local38, local18, 0, -1, Static117.anInt2529, local152, local148, local12, local30);
			}
		} else if (Static35.anInt2888 == 98) {
			local12 = Static19.aClass2_Sub10_Sub1_1.method1514();
			local26 = local12 >> 2;
			local30 = Static47.anIntArray133[local26];
			local18 = local12 & 0x3;
			local34 = Static19.aClass2_Sub10_Sub1_1.method1514();
			local38 = Static36.anInt867 + (local34 >> 4 & 0x7);
			local148 = Static114.anInt2460 + (local34 & 0x7);
			if (local38 >= 0 && local148 >= 0 && local38 < 104 && local148 < 104) {
				Static70.method1060(local26, local38, 0, -1, Static117.anInt2529, local30, local18, -1, local148);
			}
		} else if (Static35.anInt2888 == 92) {
			local12 = Static19.aClass2_Sub10_Sub1_1.method1514();
			local26 = (local12 >> 4 & 0x7) + Static36.anInt867;
			local18 = (local12 & 0x7) + Static114.anInt2460;
			local30 = Static19.aClass2_Sub10_Sub1_1.method1517();
			local34 = Static19.aClass2_Sub10_Sub1_1.method1514();
			local38 = Static19.aClass2_Sub10_Sub1_1.method1517();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				local26 = local26 * 128 + 64;
				local18 = local18 * 128 + 64;
				@Pc(329) Class2_Sub2_Sub2_Sub4 local329 = new Class2_Sub2_Sub2_Sub4(local30, Static117.anInt2529, local26, local18, Static15.method348(local26, local18, Static117.anInt2529) - local34, local38, Static107.anInt2338);
				Static113.aClass13_58.method418(local329);
			}
		} else if (Static35.anInt2888 == 146) {
			local12 = Static19.aClass2_Sub10_Sub1_1.method1514();
			local18 = (local12 & 0x7) + Static114.anInt2460;
			local26 = Static36.anInt867 + (local12 >> 4 & 0x7);
			local30 = Static19.aClass2_Sub10_Sub1_1.method1517();
			local34 = Static19.aClass2_Sub10_Sub1_1.method1517();
			local38 = Static19.aClass2_Sub10_Sub1_1.method1517();
			if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
				@Pc(392) Class13 local392 = Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local26][local18];
				if (local392 != null) {
					for (@Pc(399) Class2_Sub2_Sub2_Sub6 local399 = (Class2_Sub2_Sub2_Sub6) local392.method415(); local399 != null; local399 = (Class2_Sub2_Sub2_Sub6) local392.method414()) {
						if ((local30 & 0x7FFF) == local399.anInt1889 && local399.anInt1884 == local34) {
							local399.anInt1884 = local38;
							break;
						}
					}
					Static121.method1782(local18, local26);
				}
			}
		} else {
			@Pc(483) Class2_Sub2_Sub2_Sub6 local483;
			if (Static35.anInt2888 == 64) {
				local12 = Static19.aClass2_Sub10_Sub1_1.method1518();
				local26 = Static36.anInt867 + (local12 >> 4 & 0x7);
				local18 = (local12 & 0x7) + Static114.anInt2460;
				local30 = Static19.aClass2_Sub10_Sub1_1.method1525();
				local34 = Static19.aClass2_Sub10_Sub1_1.method1517();
				if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
					local483 = new Class2_Sub2_Sub2_Sub6();
					local483.anInt1884 = local30;
					local483.anInt1889 = local34;
					if (Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local26][local18] == null) {
						Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local26][local18] = new Class13();
					}
					Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local26][local18].method418(local483);
					Static121.method1782(local18, local26);
				}
			} else {
				@Pc(586) int local586;
				if (Static35.anInt2888 == 162) {
					local12 = Static19.aClass2_Sub10_Sub1_1.method1514();
					local26 = (local12 >> 4 & 0x7) + Static36.anInt867;
					local18 = Static114.anInt2460 + (local12 & 0x7);
					local30 = Static19.aClass2_Sub10_Sub1_1.method1517();
					local34 = Static19.aClass2_Sub10_Sub1_1.method1514();
					local152 = Static19.aClass2_Sub10_Sub1_1.method1514();
					local148 = local34 & 0x7;
					local38 = local34 >> 4 & 0xF;
					if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104) {
						local586 = local38 + 1;
						if (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0] >= local26 - local586 && Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0] <= local586 + local26 && Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0] >= local18 - local586 && local586 + local18 >= Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0] && Static75.anInt1600 != 0 && local148 > 0 && Static48.anInt1157 < 50) {
							Static63.anIntArray173[Static48.anInt1157] = local30;
							Static20.anIntArray59[Static48.anInt1157] = local148;
							Static32.anIntArray97[Static48.anInt1157] = local152;
							Static21.aClass36Array1[Static48.anInt1157] = null;
							Static1.anIntArray307[Static48.anInt1157] = (local26 << 16) + (local18 << 8) + local38;
							Static48.anInt1157++;
						}
					}
				}
				@Pc(755) int local755;
				@Pc(777) int local777;
				@Pc(794) int local794;
				@Pc(767) int local767;
				if (Static35.anInt2888 == 165) {
					local12 = Static19.aClass2_Sub10_Sub1_1.method1490();
					local18 = (local12 & 0x7) + Static114.anInt2460;
					local26 = (local12 >> 4 & 0x7) + Static36.anInt867;
					local30 = Static19.aClass2_Sub10_Sub1_1.method1522();
					local34 = Static19.aClass2_Sub10_Sub1_1.method1518();
					local38 = local34 >> 2;
					local148 = local34 & 0x3;
					local152 = Static47.anIntArray133[local38];
					if (local26 >= 0 && local18 >= 0 && local26 < 103 && local18 < 103) {
						local586 = Static56.anIntArrayArrayArray2[Static117.anInt2529][local26][local18];
						local755 = Static56.anIntArrayArrayArray2[Static117.anInt2529][local26 + 1][local18];
						local767 = Static56.anIntArrayArrayArray2[Static117.anInt2529][local26 + 1][local18 + 1];
						local777 = Static56.anIntArrayArrayArray2[Static117.anInt2529][local26][local18 + 1];
						if (local152 == 0) {
							@Pc(785) Class3 local785 = Static84.aClass69_1.method1616(Static117.anInt2529, local26, local18);
							if (local785 != null) {
								local794 = local785.anInt45 >> 14 & 0x7FFF;
								if (local38 == 2) {
									local785.aClass2_Sub2_Sub2_1 = new Class2_Sub2_Sub2_Sub2(local794, 2, local148 + 4, local586, local755, local767, local777, local30, false, local785.aClass2_Sub2_Sub2_1);
									local785.aClass2_Sub2_Sub2_2 = new Class2_Sub2_Sub2_Sub2(local794, 2, local148 + 1 & 0x3, local586, local755, local767, local777, local30, false, local785.aClass2_Sub2_Sub2_2);
								} else {
									local785.aClass2_Sub2_Sub2_1 = new Class2_Sub2_Sub2_Sub2(local794, local38, local148, local586, local755, local767, local777, local30, false, local785.aClass2_Sub2_Sub2_1);
								}
							}
						}
						if (local152 == 1) {
							@Pc(864) Class17 local864 = Static84.aClass69_1.method1640(Static117.anInt2529, local26, local18);
							if (local864 != null) {
								local864.aClass2_Sub2_Sub2_3 = new Class2_Sub2_Sub2_Sub2(local864.anInt663 >> 14 & 0x7FFF, 4, 0, local586, local755, local767, local777, local30, false, local864.aClass2_Sub2_Sub2_3);
							}
						}
						if (local152 == 2) {
							@Pc(898) Class25 local898 = Static84.aClass69_1.method1651(Static117.anInt2529, local26, local18);
							if (local38 == 11) {
								local38 = 10;
							}
							if (local898 != null) {
								local898.aClass2_Sub2_Sub2_4 = new Class2_Sub2_Sub2_Sub2(local898.anInt852 >> 14 & 0x7FFF, local38, local148, local586, local755, local767, local777, local30, false, local898.aClass2_Sub2_Sub2_4);
							}
						}
						if (local152 == 3) {
							@Pc(939) Class81 local939 = Static84.aClass69_1.method1613(Static117.anInt2529, local26, local18);
							if (local939 != null) {
								local939.aClass2_Sub2_Sub2_8 = new Class2_Sub2_Sub2_Sub2(local939.anInt2876 >> 14 & 0x7FFF, 22, local148, local586, local755, local767, local777, local30, false, local939.aClass2_Sub2_Sub2_8);
							}
						}
					}
				} else {
					@Pc(1049) int local1049;
					if (Static35.anInt2888 == 241) {
						local12 = Static19.aClass2_Sub10_Sub1_1.method1514();
						local18 = Static114.anInt2460 + (local12 & 0x7);
						local26 = (local12 >> 4 & 0x7) + Static36.anInt867;
						local30 = Static19.aClass2_Sub10_Sub1_1.method1509() + local26;
						local34 = local18 + Static19.aClass2_Sub10_Sub1_1.method1509();
						local38 = Static19.aClass2_Sub10_Sub1_1.method1480();
						local148 = Static19.aClass2_Sub10_Sub1_1.method1517();
						local152 = Static19.aClass2_Sub10_Sub1_1.method1514() * 4;
						local586 = Static19.aClass2_Sub10_Sub1_1.method1514() * 4;
						local755 = Static19.aClass2_Sub10_Sub1_1.method1517();
						local767 = Static19.aClass2_Sub10_Sub1_1.method1517();
						local777 = Static19.aClass2_Sub10_Sub1_1.method1514();
						local1049 = Static19.aClass2_Sub10_Sub1_1.method1514();
						if (local26 >= 0 && local18 >= 0 && local26 < 104 && local18 < 104 && local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104 && local148 != 65535) {
							local18 = local18 * 128 + 64;
							local30 = local30 * 128 + 64;
							local34 = local34 * 128 + 64;
							local26 = local26 * 128 + 64;
							@Pc(1134) Class2_Sub2_Sub2_Sub3 local1134 = new Class2_Sub2_Sub2_Sub3(local148, Static117.anInt2529, local26, local18, Static15.method348(local26, local18, Static117.anInt2529) - local152, Static107.anInt2338 + local755, Static107.anInt2338 + local767, local777, local1049, local38, local586);
							local1134.method790(local34, Static107.anInt2338 + local755, -local586 + Static15.method348(local30, local34, Static117.anInt2529), local30);
							Static5.aClass13_4.method418(local1134);
						}
					} else if (Static35.anInt2888 == 104) {
						local12 = Static19.aClass2_Sub10_Sub1_1.method1506();
						local26 = Static19.aClass2_Sub10_Sub1_1.method1503();
						local18 = Static36.anInt867 + (local26 >> 4 & 0x7);
						local30 = Static114.anInt2460 + (local26 & 0x7);
						if (local18 >= 0 && local30 >= 0 && local18 < 104 && local30 < 104) {
							@Pc(1208) Class13 local1208 = Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local18][local30];
							if (local1208 != null) {
								for (local483 = (Class2_Sub2_Sub2_Sub6) local1208.method415(); local483 != null; local483 = (Class2_Sub2_Sub2_Sub6) local1208.method414()) {
									if (local483.anInt1889 == (local12 & 0x7FFF)) {
										local483.method1930();
										break;
									}
								}
								if (local1208.method415() == null) {
									Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local18][local30] = null;
								}
								Static121.method1782(local30, local18);
							}
						}
					} else if (Static35.anInt2888 == 107) {
						local12 = Static19.aClass2_Sub10_Sub1_1.method1518();
						local26 = Static36.anInt867 + (local12 >> 4 & 0x7);
						local18 = Static114.anInt2460 + (local12 & 0x7);
						@Pc(1280) byte local1280 = Static19.aClass2_Sub10_Sub1_1.method1531();
						local34 = Static19.aClass2_Sub10_Sub1_1.method1503();
						local38 = local34 >> 2;
						local152 = Static47.anIntArray133[local38];
						@Pc(1296) byte local1296 = Static19.aClass2_Sub10_Sub1_1.method1531();
						local755 = Static19.aClass2_Sub10_Sub1_1.method1506();
						@Pc(1306) byte local1306 = Static19.aClass2_Sub10_Sub1_1.method1509();
						local777 = Static19.aClass2_Sub10_Sub1_1.method1506();
						local1049 = Static19.aClass2_Sub10_Sub1_1.method1506();
						local794 = Static19.aClass2_Sub10_Sub1_1.method1517();
						local148 = local34 & 0x3;
						@Pc(1326) byte local1326 = Static19.aClass2_Sub10_Sub1_1.method1509();
						@Pc(1331) Class2_Sub2_Sub2_Sub1_Sub2 local1331;
						if (local777 == Static39.anInt949) {
							local1331 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1;
						} else {
							local1331 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local777];
						}
						if (local1331 != null) {
							@Pc(1342) Class2_Sub2_Sub14 local1342 = Static2.method19(local755);
							@Pc(1350) int local1350 = Static56.anIntArrayArrayArray2[Static117.anInt2529][local26][local18];
							@Pc(1362) int local1362 = Static56.anIntArrayArrayArray2[Static117.anInt2529][local26 + 1][local18 + 1];
							@Pc(1372) int local1372 = Static56.anIntArrayArrayArray2[Static117.anInt2529][local26 + 1][local18];
							@Pc(1382) int local1382 = Static56.anIntArrayArrayArray2[Static117.anInt2529][local26][local18 + 1];
							@Pc(1394) Class2_Sub2_Sub2_Sub5 local1394 = local1342.method1551(local38, local1382, local1362, local1350, local148, local1372);
							if (local1394 != null) {
								Static70.method1060(0, local26, local1049 + 1, local794 + 1, Static117.anInt2529, local152, 0, -1, local18);
								local1331.aClass2_Sub2_Sub2_Sub5_3 = local1394;
								local1331.anInt2733 = local1049 + Static107.anInt2338;
								@Pc(1423) int local1423 = local1342.anInt2279;
								@Pc(1426) int local1426 = local1342.anInt2259;
								local1331.anInt2732 = Static107.anInt2338 + local794;
								@Pc(1436) byte local1436;
								if (local1306 > local1296) {
									local1436 = local1306;
									local1306 = local1296;
									local1296 = local1436;
								}
								if (local148 == 1 || local148 == 3) {
									local1423 = local1342.anInt2259;
									local1426 = local1342.anInt2279;
								}
								if (local1326 > local1280) {
									local1436 = local1326;
									local1326 = local1280;
									local1280 = local1436;
								}
								local1331.anInt2728 = local26 * 128 + local1423 * 64;
								local1331.anInt2746 = local18 * 128 + local1426 * 64;
								local1331.anInt2744 = Static15.method348(local1331.anInt2728, local1331.anInt2746, Static117.anInt2529);
								local1331.anInt2743 = local1306 + local26;
								local1331.anInt2730 = local1326 + local18;
								local1331.anInt2745 = local26 + local1296;
								local1331.anInt2731 = local18 + local1280;
								return;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public static void method1206() {
		if (Static52.anInt1251 == 2) {
			Static19.method420(Static42.anInt979 * 2, Static35.anInt2887 + (Static30.anInt727 - Static107.anInt2343 << 7), Static87.anInt1345 + (Static47.anInt1098 + -Static62.anInt1413 << 7));
			if (Static119.anInt2549 > -1 && Static107.anInt2338 % 20 < 10) {
				Static55.aClass2_Sub2_Sub1_Sub2Array3[0].method213(Static119.anInt2549 - 12, Static55.anInt513 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lclient!df;")
	public static Class2_Sub2_Sub5 method1207(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub5 local6 = (Class2_Sub2_Sub5) Static109.aClass16_81.method490((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static11.aClass26_3.method1358(arg0, 1);
		local6 = new Class2_Sub2_Sub5();
		if (local25 != null) {
			local6.method481(new Class2_Sub10(local25), arg0);
		}
		local6.method479();
		Static109.aClass16_81.method492(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method1208() {
		anIntArray246 = null;
		aClass74_1151 = null;
		aClass2_Sub2_Sub1_Sub1_33 = null;
		aClass74_1153 = null;
		aClass74_1149 = null;
		aClass2_Sub2_Sub2_Sub7Array1 = null;
		aClass74_1152 = null;
		aClass74_1150 = null;
		aClass2_Sub2_Sub1_Sub3_9 = null;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Z")
	public static boolean method1209(@OriginalArg(1) int arg0) {
		if (Static99.aBooleanArray10[arg0]) {
			return true;
		} else if (Static92.aClass26_24.method1359(arg0)) {
			@Pc(23) int local23 = Static92.aClass26_24.method1369(arg0);
			if (local23 == 0) {
				Static99.aBooleanArray10[arg0] = true;
				return true;
			}
			if (Static89.aClass2_Sub2_Sub17ArrayArray1[arg0] == null) {
				Static89.aClass2_Sub2_Sub17ArrayArray1[arg0] = new Class2_Sub2_Sub17[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static89.aClass2_Sub2_Sub17ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static92.aClass26_24.method1358(local42, arg0);
					if (local56 != null) {
						Static89.aClass2_Sub2_Sub17ArrayArray1[arg0][local42] = new Class2_Sub2_Sub17();
						Static89.aClass2_Sub2_Sub17ArrayArray1[arg0][local42].anInt2794 = local42 + (arg0 << 16);
						if (local56[0] == -1) {
							Static89.aClass2_Sub2_Sub17ArrayArray1[arg0][local42].method1894(new Class2_Sub10(local56));
						} else {
							Static89.aClass2_Sub2_Sub17ArrayArray1[arg0][local42].method1892(new Class2_Sub10(local56));
						}
					}
				}
			}
			Static99.aBooleanArray10[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
