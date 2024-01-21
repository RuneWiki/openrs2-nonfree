import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!gb;")
	public static Class12 aClass12_2;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
	public static int[] anIntArray19;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "[Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3[] aClass5_Sub2_Sub1_Sub3Array2;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Lclient!gf;")
	public static Class30 aClass30_2;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!ba;")
	public static Class8 aClass8_2;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!r;")
	private static Class61 aClass61_34 = Static129.method2060("This computers address has been blocked");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!r;")
	public static Class61 aClass61_31 = aClass61_34;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_32 = Static129.method2060(" x ");

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "[I")
	public static int[] anIntArray20 = new int[50];

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_33 = Static129.method2060("sl_button");

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!ge;")
	public static Class29 aClass29_3 = new Class29(64);

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Lclient!r;")
	public static Class61 aClass61_35 = Static129.method2060("<img=1>");

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!r;")
	private static Class61 aClass61_37 = Static129.method2060("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!r;")
	public static Class61 aClass61_36 = aClass61_37;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method49() {
		aClass30_2 = null;
		aClass5_Sub2_Sub1_Sub3Array2 = null;
		aClass61_33 = null;
		aClass12_2 = null;
		aClass8_2 = null;
		aClass61_34 = null;
		aClass29_3 = null;
		anIntArray19 = null;
		aClass61_37 = null;
		anIntArray20 = null;
		aClass61_36 = null;
		aClass61_35 = null;
		aClass61_32 = null;
		aClass61_31 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!r;I)I")
	public static int method50(@OriginalArg(0) Class61 arg0) {
		if (Static13.anInt367 == 1) {
			return 7;
		} else if (arg0.method1713(Static17.aClass61_168)) {
			return 1;
		} else if (arg0.method1713(Static68.aClass61_513)) {
			return 1;
		} else if (arg0.method1713(Static11.aClass61_98)) {
			return 2;
		} else if (arg0.method1713(Static11.aClass61_99)) {
			return 2;
		} else if (arg0.method1713(Static127.aClass61_1031)) {
			return 3;
		} else if (arg0.method1713(Static101.aClass61_792)) {
			return 4;
		} else if (arg0.method1713(Static104.aClass61_810)) {
			return 4;
		} else if (arg0.method1713(Static115.aClass61_904)) {
			return 5;
		} else if (arg0.method1713(Static109.aClass61_850)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method51() {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(78) int local78;
		@Pc(46) int local46;
		if (Static73.anInt1747 == 230) {
			local12 = Static47.aClass5_Sub14_Sub1_2.method1471();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static39.anIntArray173[local16];
			local28 = Static47.aClass5_Sub14_Sub1_2.method1459();
			local32 = Static47.aClass5_Sub14_Sub1_2.method1471();
			local40 = (local32 >> 4 & 0x7) + Static12.anInt336;
			local46 = Static82.anInt2265 + (local32 & 0x7);
			if (local40 >= 0 && local46 >= 0 && local40 < 103 && local46 < 103) {
				if (local24 == 0) {
					@Pc(69) Class57 local69 = Static61.aClass81_1.method2069(Static93.anInt2428, local40, local46);
					if (local69 != null) {
						local78 = local69.anInt2444 >> 14 & 0x7FFF;
						if (local16 == 2) {
							local69.aClass5_Sub2_Sub2_5 = new Class5_Sub2_Sub2_Sub7(local78, 2, local20 + 4, Static93.anInt2428, local40, local46, local28, false, local69.aClass5_Sub2_Sub2_5);
							local69.aClass5_Sub2_Sub2_4 = new Class5_Sub2_Sub2_Sub7(local78, 2, local20 + 1 & 0x3, Static93.anInt2428, local40, local46, local28, false, local69.aClass5_Sub2_Sub2_4);
						} else {
							local69.aClass5_Sub2_Sub2_5 = new Class5_Sub2_Sub2_Sub7(local78, local16, local20, Static93.anInt2428, local40, local46, local28, false, local69.aClass5_Sub2_Sub2_5);
						}
					}
				}
				if (local24 == 1) {
					@Pc(143) Class48 local143 = Static61.aClass81_1.method2091(Static93.anInt2428, local40, local46);
					if (local143 != null) {
						local78 = local143.anInt1744 >> 14 & 0x7FFF;
						if (local16 == 4 || local16 == 5) {
							local143.aClass5_Sub2_Sub2_2 = new Class5_Sub2_Sub2_Sub7(local78, 4, local20, Static93.anInt2428, local40, local46, local28, false, local143.aClass5_Sub2_Sub2_2);
						} else if (local16 == 6) {
							local143.aClass5_Sub2_Sub2_2 = new Class5_Sub2_Sub2_Sub7(local78, 4, local20 + 4, Static93.anInt2428, local40, local46, local28, false, local143.aClass5_Sub2_Sub2_2);
						} else if (local16 == 7) {
							local143.aClass5_Sub2_Sub2_2 = new Class5_Sub2_Sub2_Sub7(local78, 4, (local20 + 2 & 0x3) + 4, Static93.anInt2428, local40, local46, local28, false, local143.aClass5_Sub2_Sub2_2);
						} else if (local16 == 8) {
							local143.aClass5_Sub2_Sub2_2 = new Class5_Sub2_Sub2_Sub7(local78, 4, local20 + 4, Static93.anInt2428, local40, local46, local28, false, local143.aClass5_Sub2_Sub2_2);
							local143.aClass5_Sub2_Sub2_3 = new Class5_Sub2_Sub2_Sub7(local78, 4, (local20 + 2 & 0x3) + 4, Static93.anInt2428, local40, local46, local28, false, local143.aClass5_Sub2_Sub2_3);
						}
					}
				}
				if (local24 == 2) {
					@Pc(279) Class70 local279 = Static61.aClass81_1.method2086(Static93.anInt2428, local40, local46);
					if (local16 == 11) {
						local16 = 10;
					}
					if (local279 != null) {
						local279.aClass5_Sub2_Sub2_9 = new Class5_Sub2_Sub2_Sub7(local279.anInt3007 >> 14 & 0x7FFF, local16, local20, Static93.anInt2428, local40, local46, local28, false, local279.aClass5_Sub2_Sub2_9);
					}
				}
				if (local24 == 3) {
					@Pc(317) Class39 local317 = Static61.aClass81_1.method2108(Static93.anInt2428, local40, local46);
					if (local317 != null) {
						local317.aClass5_Sub2_Sub2_1 = new Class5_Sub2_Sub2_Sub7(local317.anInt1417 >> 14 & 0x7FFF, 22, local20, Static93.anInt2428, local40, local46, local28, false, local317.aClass5_Sub2_Sub2_1);
					}
				}
			}
		} else if (Static73.anInt1747 == 242) {
			local12 = Static47.aClass5_Sub14_Sub1_2.method1471();
			local16 = Static12.anInt336 + (local12 >> 4 & 0x7);
			local20 = Static82.anInt2265 + (local12 & 0x7);
			local24 = Static47.aClass5_Sub14_Sub1_2.method1478();
			local28 = Static47.aClass5_Sub14_Sub1_2.method1478();
			local32 = Static47.aClass5_Sub14_Sub1_2.method1478();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				@Pc(401) Class58 local401 = Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local16][local20];
				if (local401 != null) {
					for (@Pc(408) Class5_Sub2_Sub2_Sub4 local408 = (Class5_Sub2_Sub2_Sub4) local401.method1669(); local408 != null; local408 = (Class5_Sub2_Sub2_Sub4) local401.method1664()) {
						if ((local24 & 0x7FFF) == local408.anInt1911 && local28 == local408.anInt1902) {
							local408.anInt1902 = local32;
							break;
						}
					}
					Static32.method648(local20, local16);
				}
			}
		} else {
			@Pc(499) Class5_Sub2_Sub2_Sub4 local499;
			if (Static73.anInt1747 == 146) {
				local12 = Static47.aClass5_Sub14_Sub1_2.method1459();
				local16 = Static47.aClass5_Sub14_Sub1_2.method1437();
				local20 = Static47.aClass5_Sub14_Sub1_2.method1443();
				local24 = (local20 >> 4 & 0x7) + Static12.anInt336;
				local28 = (local20 & 0x7) + Static82.anInt2265;
				if (local24 >= 0 && local28 >= 0 && local24 < 104 && local28 < 104) {
					local499 = new Class5_Sub2_Sub2_Sub4();
					local499.anInt1902 = local16;
					local499.anInt1911 = local12;
					if (Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local24][local28] == null) {
						Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local24][local28] = new Class58();
					}
					Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local24][local28].method1663(local499);
					Static32.method648(local28, local24);
				}
			} else {
				@Pc(593) int local593;
				@Pc(601) int local601;
				@Pc(605) int local605;
				if (Static73.anInt1747 == 209) {
					local12 = Static47.aClass5_Sub14_Sub1_2.method1471();
					local20 = (local12 & 0x7) + Static82.anInt2265;
					local16 = (local12 >> 4 & 0x7) + Static12.anInt336;
					local24 = Static47.aClass5_Sub14_Sub1_2.method1447() + local16;
					local28 = local20 + Static47.aClass5_Sub14_Sub1_2.method1447();
					local32 = Static47.aClass5_Sub14_Sub1_2.method1430();
					local40 = Static47.aClass5_Sub14_Sub1_2.method1478();
					local46 = Static47.aClass5_Sub14_Sub1_2.method1471() * 4;
					local593 = Static47.aClass5_Sub14_Sub1_2.method1471() * 4;
					local78 = Static47.aClass5_Sub14_Sub1_2.method1478();
					local601 = Static47.aClass5_Sub14_Sub1_2.method1478();
					local605 = Static47.aClass5_Sub14_Sub1_2.method1471();
					@Pc(609) int local609 = Static47.aClass5_Sub14_Sub1_2.method1471();
					if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && local24 >= 0 && local28 >= 0 && local24 < 104 && local28 < 104 && local40 != 65535) {
						local16 = local16 * 128 + 64;
						local28 = local28 * 128 + 64;
						local24 = local24 * 128 + 64;
						local20 = local20 * 128 + 64;
						@Pc(693) Class5_Sub2_Sub2_Sub2 local693 = new Class5_Sub2_Sub2_Sub2(local40, Static93.anInt2428, local16, local20, Static42.method757(Static93.anInt2428, local16, local20) - local46, local78 - -Static58.anInt1422, local601 + Static58.anInt1422, local605, local609, local32, local593);
						local693.method484(Static42.method757(Static93.anInt2428, local24, local28) - local593, Static58.anInt1422 + local78, local24, local28);
						Static119.aClass58_66.method1663(local693);
					}
				} else {
					if (Static73.anInt1747 == 100) {
						local12 = Static47.aClass5_Sub14_Sub1_2.method1463();
						local16 = Static12.anInt336 + (local12 >> 4 & 0x7);
						local20 = Static82.anInt2265 + (local12 & 0x7);
						local24 = Static47.aClass5_Sub14_Sub1_2.method1478();
						local28 = Static47.aClass5_Sub14_Sub1_2.method1459();
						local32 = Static47.aClass5_Sub14_Sub1_2.method1472();
						local40 = Static47.aClass5_Sub14_Sub1_2.method1472();
						@Pc(762) byte local762 = Static47.aClass5_Sub14_Sub1_2.method1447();
						local593 = Static47.aClass5_Sub14_Sub1_2.method1463();
						local601 = local593 & 0x3;
						local78 = local593 >> 2;
						local605 = Static39.anIntArray173[local78];
						@Pc(782) byte local782 = Static47.aClass5_Sub14_Sub1_2.method1444();
						@Pc(788) byte local788 = Static47.aClass5_Sub14_Sub1_2.method1458();
						@Pc(794) byte local794 = Static47.aClass5_Sub14_Sub1_2.method1458();
						@Pc(803) Class5_Sub2_Sub2_Sub3_Sub2 local803;
						if (Static85.anInt2316 == local40) {
							local803 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10;
						} else {
							local803 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local40];
						}
						if (local803 != null) {
							@Pc(815) Class5_Sub2_Sub16 local815 = Static43.method767(local32);
							@Pc(826) int local826;
							@Pc(829) int local829;
							if (local601 == 1 || local601 == 3) {
								local829 = local815.anInt3120;
								local826 = local815.anInt3126;
							} else {
								local826 = local815.anInt3120;
								local829 = local815.anInt3126;
							}
							@Pc(843) int local843 = (local826 >> 1) + local16;
							@Pc(851) int local851 = (local826 + 1 >> 1) + local16;
							@Pc(859) int local859 = (local829 + 1 >> 1) + local20;
							@Pc(866) int local866 = local20 + (local829 >> 1);
							@Pc(870) int[][] local870 = Static65.anIntArrayArrayArray3[Static93.anInt2428];
							@Pc(897) int local897 = local870[local851][local866] + local870[local843][local866] + local870[local843][local859] + local870[local851][local859] >> 2;
							@Pc(905) int local905 = (local826 << 6) + (local16 << 7);
							@Pc(913) int local913 = (local829 << 6) + (local20 << 7);
							@Pc(923) Class5_Sub2_Sub2_Sub6 local923 = local815.method1972(local870, local897, local601, local905, local913, local78);
							if (local923 != null) {
								Static49.method885(local605, 0, 0, local16, local24 + 1, local20, -1, local28 + 1, Static93.anInt2428);
								local803.anInt2952 = local897;
								local803.anInt2936 = local16 * 128 + local826 * 64;
								local803.anInt2942 = Static58.anInt1422 + local28;
								local803.aClass5_Sub2_Sub2_Sub6_1 = local923;
								local803.anInt2946 = local20 * 128 + local829 * 64;
								local803.anInt2940 = local24 + Static58.anInt1422;
								@Pc(982) byte local982;
								if (local788 > local762) {
									local982 = local788;
									local788 = local762;
									local762 = local982;
								}
								local803.anInt2951 = local788 + local16;
								if (local782 < local794) {
									local982 = local794;
									local794 = local782;
									local782 = local982;
								}
								local803.anInt2939 = local20 + local782;
								local803.anInt2935 = local16 + local762;
								local803.anInt2953 = local794 + local20;
							}
						}
					}
					if (Static73.anInt1747 == 92) {
						local12 = Static47.aClass5_Sub14_Sub1_2.method1459();
						local16 = Static47.aClass5_Sub14_Sub1_2.method1471();
						local20 = local16 >> 2;
						local28 = Static39.anIntArray173[local20];
						local24 = local16 & 0x3;
						local32 = Static47.aClass5_Sub14_Sub1_2.method1443();
						local46 = Static82.anInt2265 + (local32 & 0x7);
						local40 = (local32 >> 4 & 0x7) + Static12.anInt336;
						if (local40 >= 0 && local46 >= 0 && local40 < 104 && local46 < 104) {
							Static49.method885(local28, local20, local24, local40, -1, local46, local12, 0, Static93.anInt2428);
						}
					} else if (Static73.anInt1747 == 178) {
						local12 = Static47.aClass5_Sub14_Sub1_2.method1471();
						local20 = Static82.anInt2265 + (local12 & 0x7);
						local16 = (local12 >> 4 & 0x7) + Static12.anInt336;
						local24 = Static47.aClass5_Sub14_Sub1_2.method1463();
						local32 = local24 & 0x3;
						local28 = local24 >> 2;
						local40 = Static39.anIntArray173[local28];
						if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
							Static49.method885(local40, local28, local32, local16, -1, local20, -1, 0, Static93.anInt2428);
						}
					} else if (Static73.anInt1747 == 116) {
						local12 = Static47.aClass5_Sub14_Sub1_2.method1437();
						local16 = Static47.aClass5_Sub14_Sub1_2.method1443();
						local24 = Static82.anInt2265 + (local16 & 0x7);
						local20 = (local16 >> 4 & 0x7) + Static12.anInt336;
						if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
							@Pc(1213) Class58 local1213 = Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local20][local24];
							if (local1213 != null) {
								for (local499 = (Class5_Sub2_Sub2_Sub4) local1213.method1669(); local499 != null; local499 = (Class5_Sub2_Sub2_Sub4) local1213.method1664()) {
									if ((local12 & 0x7FFF) == local499.anInt1911) {
										local499.method2189();
										break;
									}
								}
								if (local1213.method1669() == null) {
									Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local20][local24] = null;
								}
								Static32.method648(local24, local20);
							}
						}
					} else if (Static73.anInt1747 == 167) {
						local12 = Static47.aClass5_Sub14_Sub1_2.method1443();
						local20 = (local12 & 0x7) + Static82.anInt2265;
						local16 = Static12.anInt336 + (local12 >> 4 & 0x7);
						local24 = Static47.aClass5_Sub14_Sub1_2.method1459();
						local28 = Static47.aClass5_Sub14_Sub1_2.method1437();
						local32 = Static47.aClass5_Sub14_Sub1_2.method1459();
						if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && local24 != Static85.anInt2316) {
							@Pc(1322) Class5_Sub2_Sub2_Sub4 local1322 = new Class5_Sub2_Sub2_Sub4();
							local1322.anInt1902 = local28;
							local1322.anInt1911 = local32;
							if (Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local16][local20] == null) {
								Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local16][local20] = new Class58();
							}
							Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local16][local20].method1663(local1322);
							Static32.method648(local20, local16);
						}
					} else {
						if (Static73.anInt1747 == 145) {
							local12 = Static47.aClass5_Sub14_Sub1_2.method1471();
							local16 = (local12 >> 4 & 0x7) + Static12.anInt336;
							local20 = (local12 & 0x7) + Static82.anInt2265;
							local24 = Static47.aClass5_Sub14_Sub1_2.method1478();
							local28 = Static47.aClass5_Sub14_Sub1_2.method1471();
							local32 = local28 >> 4 & 0xF;
							local40 = local28 & 0x7;
							local46 = Static47.aClass5_Sub14_Sub1_2.method1471();
							if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
								local593 = local32 + 1;
								if (local16 - local593 <= Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0] && Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0] <= local593 + local16 && local20 - local593 <= Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0] && Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0] <= local20 + local593 && Static82.anInt2264 != 0 && local40 > 0 && Static95.anInt2449 < 50) {
									anIntArray20[Static95.anInt2449] = local24;
									Static67.anIntArray249[Static95.anInt2449] = local40;
									Static121.anIntArray363[Static95.anInt2449] = local46;
									Static45.aClass53Array1[Static95.anInt2449] = null;
									Static10.anIntArray52[Static95.anInt2449] = local32 + (local16 << 16) + (local20 << 8);
									Static95.anInt2449++;
								}
							}
						}
						if (Static73.anInt1747 == 175) {
							local12 = Static47.aClass5_Sub14_Sub1_2.method1471();
							local16 = (local12 >> 4 & 0x7) + Static12.anInt336;
							local20 = Static82.anInt2265 + (local12 & 0x7);
							local24 = Static47.aClass5_Sub14_Sub1_2.method1478();
							local28 = Static47.aClass5_Sub14_Sub1_2.method1471();
							local32 = Static47.aClass5_Sub14_Sub1_2.method1478();
							if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
								local20 = local20 * 128 + 64;
								local16 = local16 * 128 + 64;
								@Pc(1600) Class5_Sub2_Sub2_Sub5 local1600 = new Class5_Sub2_Sub2_Sub5(local24, Static93.anInt2428, local16, local20, Static42.method757(Static93.anInt2428, local16, local20) - local28, local32, Static58.anInt1422);
								Static88.aClass58_75.method1663(local1600);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method52() {
		aClass29_3.method765();
		Static37.aClass29_10.method765();
		Static22.aClass29_7.method765();
		Static9.aClass29_4.method765();
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	public static void method55() {
		Static47.aClass5_Sub14_Sub1_2.method1493();
		@Pc(13) int local13 = Static47.aClass5_Sub14_Sub1_2.method1492(8);
		@Pc(18) int local18;
		if (local13 < Static100.anInt2607) {
			for (local18 = local13; local18 < Static100.anInt2607; local18++) {
				Static2.anIntArray1[Static76.anInt1870++] = Static61.anIntArray225[local18];
			}
		}
		if (Static100.anInt2607 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static100.anInt2607 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = Static61.anIntArray225[local18];
			@Pc(64) Class5_Sub2_Sub2_Sub3_Sub1 local64 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local60];
			@Pc(69) int local69 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
			if (local69 == 0) {
				Static61.anIntArray225[Static100.anInt2607++] = local60;
				local64.anInt2900 = Static58.anInt1422;
			} else {
				@Pc(89) int local89 = Static47.aClass5_Sub14_Sub1_2.method1492(2);
				if (local89 == 0) {
					Static61.anIntArray225[Static100.anInt2607++] = local60;
					local64.anInt2900 = Static58.anInt1422;
					Static132.anIntArray445[Static83.anInt2281++] = local60;
				} else {
					@Pc(131) int local131;
					@Pc(141) int local141;
					if (local89 == 1) {
						Static61.anIntArray225[Static100.anInt2607++] = local60;
						local64.anInt2900 = Static58.anInt1422;
						local131 = Static47.aClass5_Sub14_Sub1_2.method1492(3);
						local64.method1859(false, local131);
						local141 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
						if (local141 == 1) {
							Static132.anIntArray445[Static83.anInt2281++] = local60;
						}
					} else if (local89 == 2) {
						Static61.anIntArray225[Static100.anInt2607++] = local60;
						local64.anInt2900 = Static58.anInt1422;
						local131 = Static47.aClass5_Sub14_Sub1_2.method1492(3);
						local64.method1859(true, local131);
						local141 = Static47.aClass5_Sub14_Sub1_2.method1492(3);
						local64.method1859(true, local141);
						@Pc(195) int local195 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
						if (local195 == 1) {
							Static132.anIntArray445[Static83.anInt2281++] = local60;
						}
					} else if (local89 == 3) {
						Static2.anIntArray1[Static76.anInt1870++] = local60;
					}
				}
			}
		}
	}
}
