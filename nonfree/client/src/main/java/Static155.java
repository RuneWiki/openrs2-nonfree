import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!re", name = "U", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1345 = Static120.method1824("Loading fonts )2 ");

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1343 = aClass80_1345;

	@OriginalMember(owner = "client!re", name = "R", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1344 = Static120.method1824("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!re", name = "S", descriptor = "Lclient!mb;")
	public static final Class3_Sub17 aClass3_Sub17_3 = new Class3_Sub17(8);

	@OriginalMember(owner = "client!re", name = "V", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1346 = Static120.method1824("gelb:");

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1347 = Static120.method1824(")1 ");

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "Lclient!rc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
	public static void method2488() {
		for (@Pc(3) int local3 = 0; local3 < Static33.anInt779; local3++) {
			@Pc(9) int local9 = Static3.anIntArray24[local3];
			@Pc(13) Class3_Sub1_Sub5_Sub4_Sub2 local13 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local9];
			@Pc(17) int local17 = Static63.aClass3_Sub17_Sub1_2.method2107();
			if ((local17 & 0x1) != 0) {
				local17 += Static63.aClass3_Sub17_Sub1_2.method2107() << 8;
			}
			Static184.method2975(local9, local13, local17);
		}
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	public static void method2489() {
		for (@Pc(6) Class3_Sub20 local6 = (Class3_Sub20) Static28.aClass54_4.method1503(); local6 != null; local6 = (Class3_Sub20) Static28.aClass54_4.method1497()) {
			@Pc(13) int local13 = local6.anInt2996;
			if (Static188.method3068(local13)) {
				@Pc(19) boolean local19 = true;
				@Pc(23) Class77[] local23 = Static57.aClass77ArrayArray1[local13];
				for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
					if (local23[local25] != null) {
						local19 = local23[local25].aBoolean127;
						break;
					}
				}
				if (!local19) {
					@Pc(49) int local49 = (int) local6.aLong154;
					@Pc(53) Class77 local53 = Static92.method2208(local49);
					if (local53 != null) {
						Static186.method3014(local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(B)V")
	public static void method2491() {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(64) int local64;
		if (Static85.anInt1777 == 181) {
			local12 = Static63.aClass3_Sub17_Sub1_2.method2091();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static108.anIntArray387[local16];
			local30 = Static63.aClass3_Sub17_Sub1_2.method2141();
			@Pc(34) byte local34 = Static63.aClass3_Sub17_Sub1_2.method2103();
			@Pc(40) byte local40 = Static63.aClass3_Sub17_Sub1_2.method2123();
			local44 = Static63.aClass3_Sub17_Sub1_2.method2098();
			local48 = Static63.aClass3_Sub17_Sub1_2.method2098();
			local52 = Static63.aClass3_Sub17_Sub1_2.method2141();
			@Pc(56) byte local56 = Static63.aClass3_Sub17_Sub1_2.method2124();
			@Pc(60) byte local60 = Static63.aClass3_Sub17_Sub1_2.method2116();
			local64 = Static63.aClass3_Sub17_Sub1_2.method2091();
			@Pc(71) int local71 = Static8.anInt226 + (local64 & 0x7);
			@Pc(79) int local79 = (local64 >> 4 & 0x7) + Static28.anInt697;
			@Pc(90) Class3_Sub1_Sub5_Sub4_Sub2 local90;
			if (Static30.anInt4494 == local44) {
				local90 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1;
			} else {
				local90 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local44];
			}
			if (local90 != null) {
				@Pc(100) Class3_Sub1_Sub1 local100 = Static162.method2627(local30);
				@Pc(114) int local114;
				@Pc(111) int local111;
				if (local20 == 1 || local20 == 3) {
					local114 = local100.anInt150;
					local111 = local100.anInt145;
				} else {
					local111 = local100.anInt150;
					local114 = local100.anInt145;
				}
				@Pc(130) int local130 = (local114 + 1 >> 1) + local79;
				@Pc(137) int local137 = local71 + (local111 >> 1);
				@Pc(145) int local145 = (local111 + 1 >> 1) + local71;
				@Pc(151) int local151 = (local114 >> 1) + local79;
				@Pc(155) int[][] local155 = Static42.anIntArrayArrayArray1[Static153.anInt673];
				@Pc(163) int local163 = (local71 << 7) + (local111 << 6);
				@Pc(172) int local172 = (local79 << 7) + (local114 << 6);
				@Pc(200) int local200 = local155[local151][local145] + local155[local151][local137] + local155[local130][local137] + local155[local130][local145] >> 2;
				@Pc(210) Class3_Sub1_Sub5_Sub3 local210 = local100.method117(local20, local200, local16, local163, local172, local155);
				if (local210 != null) {
					@Pc(221) byte local221;
					if (local56 > local40) {
						local221 = local56;
						local56 = local40;
						local40 = local221;
					}
					Static43.method655(0, -1, local48 + 1, Static153.anInt673, local52 + 1, local24, local71, 0, local79);
					local90.anInt4347 = local48 + Static193.anInt4411;
					local90.anInt4335 = Static193.anInt4411 + local52;
					local90.anInt4339 = local79 + local40;
					local90.anInt4332 = local111 * 64 + local71 * 128;
					local90.anInt4345 = local114 * 64 + local79 * 128;
					local90.aClass3_Sub1_Sub5_Sub3_1 = local210;
					local90.anInt4342 = local200;
					local90.anInt4343 = local79 + local56;
					if (local34 < local60) {
						local221 = local60;
						local60 = local34;
						local34 = local221;
					}
					local90.anInt4331 = local71 + local34;
					local90.anInt4351 = local71 + local60;
				}
			}
		}
		@Pc(339) int local339;
		@Pc(345) int local345;
		if (Static85.anInt1777 == 10) {
			local12 = Static63.aClass3_Sub17_Sub1_2.method2109();
			local20 = local12 & 0x3;
			local16 = local12 >> 2;
			local24 = Static108.anIntArray387[local16];
			local30 = Static63.aClass3_Sub17_Sub1_2.method2091();
			local339 = (local30 >> 4 & 0x7) + Static28.anInt697;
			local345 = (local30 & 0x7) + Static8.anInt226;
			if (local339 >= 0 && local345 >= 0 && local339 < 104 && local345 < 104) {
				Static43.method655(local20, -1, 0, Static153.anInt673, -1, local24, local345, local16, local339);
			}
		} else if (Static85.anInt1777 == 242) {
			local12 = Static63.aClass3_Sub17_Sub1_2.method2107();
			local20 = Static8.anInt226 + (local12 & 0x7);
			local16 = (local12 >> 4 & 0x7) + Static28.anInt697;
			local24 = Static63.aClass3_Sub17_Sub1_2.method2111();
			local30 = Static63.aClass3_Sub17_Sub1_2.method2111();
			local339 = Static63.aClass3_Sub17_Sub1_2.method2111();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				@Pc(428) Class70 local428 = Static142.aClass70ArrayArrayArray1[Static153.anInt673][local16][local20];
				if (local428 != null) {
					for (@Pc(435) Class3_Sub1_Sub5_Sub7 local435 = (Class3_Sub1_Sub5_Sub7) local428.method1953(); local435 != null; local435 = (Class3_Sub1_Sub5_Sub7) local428.method1948()) {
						if (local435.anInt4093 == (local24 & 0x7FFF) && local435.anInt4095 == local30) {
							local435.anInt4095 = local339;
							break;
						}
					}
					Static166.method2679(local16, local20);
				}
			}
		} else {
			@Pc(527) Class3_Sub1_Sub5_Sub7 local527;
			if (Static85.anInt1777 == 61) {
				local12 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local16 = Static28.anInt697 + (local12 >> 4 & 0x7);
				local20 = Static8.anInt226 + (local12 & 0x7);
				local24 = Static63.aClass3_Sub17_Sub1_2.method2141();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					@Pc(520) Class70 local520 = Static142.aClass70ArrayArrayArray1[Static153.anInt673][local16][local20];
					if (local520 != null) {
						for (local527 = (Class3_Sub1_Sub5_Sub7) local520.method1953(); local527 != null; local527 = (Class3_Sub1_Sub5_Sub7) local520.method1948()) {
							if ((local24 & 0x7FFF) == local527.anInt4093) {
								local527.method3159();
								break;
							}
						}
						if (local520.method1953() == null) {
							Static142.aClass70ArrayArrayArray1[Static153.anInt673][local16][local20] = null;
						}
						Static166.method2679(local16, local20);
					}
				}
			} else if (Static85.anInt1777 == 177) {
				local12 = Static63.aClass3_Sub17_Sub1_2.method2091();
				local20 = Static8.anInt226 + (local12 & 0x7);
				local16 = Static28.anInt697 + (local12 >> 4 & 0x7);
				local24 = Static63.aClass3_Sub17_Sub1_2.method2109();
				local339 = local24 & 0x3;
				local30 = local24 >> 2;
				local345 = Static108.anIntArray387[local30];
				local44 = Static63.aClass3_Sub17_Sub1_2.method2111();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					Static43.method655(local339, local44, 0, Static153.anInt673, -1, local345, local20, local30, local16);
				}
			} else if (Static85.anInt1777 == 72) {
				local12 = Static63.aClass3_Sub17_Sub1_2.method2098();
				local16 = Static63.aClass3_Sub17_Sub1_2.method2135();
				local20 = Static28.anInt697 + (local16 >> 4 & 0x7);
				local24 = Static8.anInt226 + (local16 & 0x7);
				local30 = Static63.aClass3_Sub17_Sub1_2.method2135();
				local339 = local30 >> 2;
				local345 = local30 & 0x3;
				local44 = Static108.anIntArray387[local339];
				if (local20 >= 0 && local24 >= 0 && local20 < 103 && local24 < 103) {
					if (local44 == 0) {
						@Pc(709) Class51 local709 = Static25.method402(Static153.anInt673, local20, local24);
						if (local709 != null) {
							local52 = Integer.MAX_VALUE & (int) (local709.aLong69 >>> 32);
							if (local339 == 2) {
								local709.aClass3_Sub1_Sub5_5 = new Class3_Sub1_Sub5_Sub6(local52, 2, local345 + 4, Static153.anInt673, local20, local24, local12, false, local709.aClass3_Sub1_Sub5_5);
								local709.aClass3_Sub1_Sub5_4 = new Class3_Sub1_Sub5_Sub6(local52, 2, local345 + 1 & 0x3, Static153.anInt673, local20, local24, local12, false, local709.aClass3_Sub1_Sub5_4);
							} else {
								local709.aClass3_Sub1_Sub5_5 = new Class3_Sub1_Sub5_Sub6(local52, local339, local345, Static153.anInt673, local20, local24, local12, false, local709.aClass3_Sub1_Sub5_5);
							}
						}
					}
					if (local44 == 1) {
						@Pc(785) Class92 local785 = Static194.method3133(Static153.anInt673, local20, local24);
						if (local785 != null) {
							local52 = Integer.MAX_VALUE & (int) (local785.aLong149 >>> 32);
							if (local339 == 4 || local339 == 5) {
								local785.aClass3_Sub1_Sub5_10 = new Class3_Sub1_Sub5_Sub6(local52, 4, local345, Static153.anInt673, local20, local24, local12, false, local785.aClass3_Sub1_Sub5_10);
							} else if (local339 == 6) {
								local785.aClass3_Sub1_Sub5_10 = new Class3_Sub1_Sub5_Sub6(local52, 4, local345 + 4, Static153.anInt673, local20, local24, local12, false, local785.aClass3_Sub1_Sub5_10);
							} else if (local339 == 7) {
								local785.aClass3_Sub1_Sub5_10 = new Class3_Sub1_Sub5_Sub6(local52, 4, (local345 + 2 & 0x3) + 4, Static153.anInt673, local20, local24, local12, false, local785.aClass3_Sub1_Sub5_10);
							} else if (local339 == 8) {
								local785.aClass3_Sub1_Sub5_10 = new Class3_Sub1_Sub5_Sub6(local52, 4, local345 + 4, Static153.anInt673, local20, local24, local12, false, local785.aClass3_Sub1_Sub5_10);
								local785.aClass3_Sub1_Sub5_9 = new Class3_Sub1_Sub5_Sub6(local52, 4, (local345 + 2 & 0x3) + 4, Static153.anInt673, local20, local24, local12, false, local785.aClass3_Sub1_Sub5_9);
							}
						}
					}
					if (local44 == 2) {
						@Pc(923) Class4 local923 = Static138.method2153(Static153.anInt673, local20, local24);
						if (local339 == 11) {
							local339 = 10;
						}
						if (local923 != null) {
							local923.aClass3_Sub1_Sub5_1 = new Class3_Sub1_Sub5_Sub6(Integer.MAX_VALUE & (int) (local923.aLong4 >>> 32), local339, local345, Static153.anInt673, local20, local24, local12, false, local923.aClass3_Sub1_Sub5_1);
						}
					}
					if (local44 == 3) {
						@Pc(959) Class13 local959 = Static132.method2021(Static153.anInt673, local20, local24);
						if (local959 != null) {
							local959.aClass3_Sub1_Sub5_2 = new Class3_Sub1_Sub5_Sub6(Integer.MAX_VALUE & (int) (local959.aLong16 >>> 32), 22, local345, Static153.anInt673, local20, local24, local12, false, local959.aClass3_Sub1_Sub5_2);
						}
					}
				}
			} else if (Static85.anInt1777 == 13) {
				local12 = Static63.aClass3_Sub17_Sub1_2.method2135();
				local20 = Static8.anInt226 + (local12 & 0x7);
				local16 = (local12 >> 4 & 0x7) + Static28.anInt697;
				local24 = Static63.aClass3_Sub17_Sub1_2.method2098();
				local30 = Static63.aClass3_Sub17_Sub1_2.method2098();
				local339 = Static63.aClass3_Sub17_Sub1_2.method2111();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && local339 != Static30.anInt4494) {
					@Pc(1038) Class3_Sub1_Sub5_Sub7 local1038 = new Class3_Sub1_Sub5_Sub7();
					local1038.anInt4093 = local24;
					local1038.anInt4095 = local30;
					if (Static142.aClass70ArrayArrayArray1[Static153.anInt673][local16][local20] == null) {
						Static142.aClass70ArrayArrayArray1[Static153.anInt673][local16][local20] = new Class70();
					}
					Static142.aClass70ArrayArrayArray1[Static153.anInt673][local16][local20].method1958(local1038);
					Static166.method2679(local16, local20);
				}
			} else if (Static85.anInt1777 == 116) {
				local12 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local20 = (local12 & 0x7) + Static8.anInt226;
				local16 = (local12 >> 4 & 0x7) + Static28.anInt697;
				local24 = local16 + Static63.aClass3_Sub17_Sub1_2.method2123();
				local30 = Static63.aClass3_Sub17_Sub1_2.method2123() + local20;
				local339 = Static63.aClass3_Sub17_Sub1_2.method2138();
				local345 = Static63.aClass3_Sub17_Sub1_2.method2111();
				local44 = Static63.aClass3_Sub17_Sub1_2.method2107() * 4;
				local48 = Static63.aClass3_Sub17_Sub1_2.method2107() * 4;
				local52 = Static63.aClass3_Sub17_Sub1_2.method2111();
				@Pc(1140) int local1140 = Static63.aClass3_Sub17_Sub1_2.method2111();
				@Pc(1144) int local1144 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local64 = Static63.aClass3_Sub17_Sub1_2.method2107();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && local24 >= 0 && local30 >= 0 && local24 < 104 && local30 < 104 && local345 != 65535) {
					local24 = local24 * 128 + 64;
					local16 = local16 * 128 + 64;
					local20 = local20 * 128 + 64;
					local30 = local30 * 128 + 64;
					@Pc(1233) Class3_Sub1_Sub5_Sub1 local1233 = new Class3_Sub1_Sub5_Sub1(local345, Static153.anInt673, local16, local20, Static50.method742(Static153.anInt673, local20, local16) - local44, Static193.anInt4411 + local52, local1140 + Static193.anInt4411, local1144, local64, local339, local48);
					local1233.method647(local24, Static50.method742(Static153.anInt673, local30, local24) - local48, local52 + Static193.anInt4411, local30);
					Static164.aClass70_22.method1958(local1233);
				}
			} else if (Static85.anInt1777 == 90) {
				local12 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local20 = (local12 & 0x7) + Static8.anInt226;
				local16 = Static28.anInt697 + (local12 >> 4 & 0x7);
				local24 = Static63.aClass3_Sub17_Sub1_2.method2111();
				local30 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local339 = Static63.aClass3_Sub17_Sub1_2.method2111();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					local20 = local20 * 128 + 64;
					local16 = local16 * 128 + 64;
					@Pc(1335) Class3_Sub1_Sub5_Sub2 local1335 = new Class3_Sub1_Sub5_Sub2(local24, Static153.anInt673, local16, local20, Static50.method742(Static153.anInt673, local20, local16) - local30, local339, Static193.anInt4411);
					Static151.aClass70_21.method1958(local1335);
				}
			} else if (Static85.anInt1777 == 122) {
				local12 = Static63.aClass3_Sub17_Sub1_2.method2091();
				local20 = (local12 & 0x7) + Static8.anInt226;
				local16 = Static28.anInt697 + (local12 >> 4 & 0x7);
				local24 = Static63.aClass3_Sub17_Sub1_2.method2141();
				local30 = Static63.aClass3_Sub17_Sub1_2.method2098();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					local527 = new Class3_Sub1_Sub5_Sub7();
					local527.anInt4093 = local24;
					local527.anInt4095 = local30;
					if (Static142.aClass70ArrayArrayArray1[Static153.anInt673][local16][local20] == null) {
						Static142.aClass70ArrayArrayArray1[Static153.anInt673][local16][local20] = new Class70();
					}
					Static142.aClass70ArrayArrayArray1[Static153.anInt673][local16][local20].method1958(local527);
					Static166.method2679(local16, local20);
				}
			} else if (Static85.anInt1777 == 42) {
				local12 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local16 = (local12 >> 4 & 0x7) + Static28.anInt697;
				local20 = (local12 & 0x7) + Static8.anInt226;
				local24 = Static63.aClass3_Sub17_Sub1_2.method2111();
				local30 = Static63.aClass3_Sub17_Sub1_2.method2107();
				if (local24 == 65535) {
					local24 = -1;
				}
				local339 = local30 >> 4 & 0xF;
				local44 = Static63.aClass3_Sub17_Sub1_2.method2107();
				local345 = local30 & 0x7;
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					local48 = local339 + 1;
					if (local16 - local48 <= Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0] && Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0] <= local16 + local48 && Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0] >= local20 - local48 && Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0] <= local48 + local20 && Static29.anInt739 != 0 && local345 > 0 && Static66.anInt1437 < 50 && local24 != -1) {
						Static82.anIntArray215[Static66.anInt1437] = local24;
						Static17.anIntArray63[Static66.anInt1437] = local345;
						Static145.anIntArray411[Static66.anInt1437] = local44;
						Static159.aClass75Array1[Static66.anInt1437] = null;
						Static106.anIntArray303[Static66.anInt1437] = (local20 << 8) + (local16 << 16) + local339;
						Static66.anInt1437++;
						return;
					}
				}
			}
		}
	}
}
