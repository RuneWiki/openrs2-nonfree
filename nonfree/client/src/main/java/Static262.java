import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "Lclient!th;")
	public static Class168 aClass168_178;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Lclient!ci;")
	public static Class26 aClass26_50 = new Class26();

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString377 = "Mechscape is loading - please wait...";

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public static int method4001(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)Lclient!qm;")
	public static Class1_Sub14 method4002() {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(34);
		local8.method2191(11);
		local8.method2191(Static166.anInt3743);
		local8.method2191(Static316.aBoolean419 ? 1 : 0);
		local8.method2191(Static72.aBoolean118 ? 1 : 0);
		local8.method2191(Static293.aBoolean364 ? 1 : 0);
		local8.method2191(Static41.aBoolean72 ? 1 : 0);
		local8.method2191(Static280.aBoolean353 ? 1 : 0);
		local8.method2191(Static125.aBoolean164 ? 1 : 0);
		local8.method2191(Static282.aBoolean355 ? 1 : 0);
		local8.method2191(Static35.aBoolean65 ? 1 : 0);
		local8.method2191(Static208.anInt4490);
		local8.method2191(Static65.aBoolean96 ? 1 : 0);
		local8.method2191(Static255.aBoolean321 ? 1 : 0);
		local8.method2191(Static202.aBoolean276 ? 1 : 0);
		local8.method2191(Static124.anInt2706);
		local8.method2191(Static11.aBoolean17 ? 1 : 0);
		local8.method2191(Static57.anInt6309);
		local8.method2191(Static87.anInt2035);
		local8.method2191(Static286.anInt5742);
		local8.method2208(Static153.anInt3412);
		local8.method2208(Static139.anInt3176);
		local8.method2191(Static42.method849());
		local8.method2236(Static236.anInt1713);
		local8.method2191(Static309.anInt6184);
		local8.method2191(Static283.aBoolean357 ? 1 : 0);
		local8.method2191(Static211.aBoolean285 ? 1 : 0);
		local8.method2191(Static266.anInt5317);
		local8.method2191(Static198.aBoolean269 ? 1 : 0);
		local8.method2191(Static210.aBoolean284 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(CI)Z")
	public static boolean method4004(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)Z")
	public static boolean method4009() throws IOException {
		if (Static5.aClass104_5 == null) {
			return false;
		}
		@Pc(14) int local14 = Static5.aClass104_5.method2581();
		if (local14 == 0) {
			return false;
		}
		if (Static281.anInt2783 == -1) {
			local14--;
			Static5.aClass104_5.method2574(Static140.aClass1_Sub14_Sub1_2.aByteArray55, 0, 1);
			Static140.aClass1_Sub14_Sub1_2.anInt3000 = 0;
			Static281.anInt2783 = Static140.aClass1_Sub14_Sub1_2.method2261();
			Static188.anInt4164 = Static129.anIntArray281[Static281.anInt2783];
		}
		if (Static188.anInt4164 == -1) {
			if (local14 <= 0) {
				return false;
			}
			Static5.aClass104_5.method2574(Static140.aClass1_Sub14_Sub1_2.aByteArray55, 0, 1);
			Static188.anInt4164 = Static140.aClass1_Sub14_Sub1_2.aByteArray55[0] & 0xFF;
			local14--;
		}
		if (Static188.anInt4164 == -2) {
			if (local14 <= 1) {
				return false;
			}
			Static5.aClass104_5.method2574(Static140.aClass1_Sub14_Sub1_2.aByteArray55, 0, 2);
			local14 -= 2;
			Static140.aClass1_Sub14_Sub1_2.anInt3000 = 0;
			Static188.anInt4164 = Static140.aClass1_Sub14_Sub1_2.method2244();
		}
		if (local14 < Static188.anInt4164) {
			return false;
		}
		Static140.aClass1_Sub14_Sub1_2.anInt3000 = 0;
		Static5.aClass104_5.method2574(Static140.aClass1_Sub14_Sub1_2.aByteArray55, 0, Static188.anInt4164);
		Static169.anInt3805 = 0;
		Static148.anInt3326 = Static124.anInt2710;
		Static124.anInt2710 = Static64.anInt1379;
		Static64.anInt1379 = Static281.anInt2783;
		@Pc(127) int local127;
		@Pc(131) int local131;
		@Pc(135) int local135;
		@Pc(139) int local139;
		if (Static281.anInt2783 == 201) {
			local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
			local131 = Static140.aClass1_Sub14_Sub1_2.method2194();
			local135 = Static140.aClass1_Sub14_Sub1_2.method2238();
			local139 = Static140.aClass1_Sub14_Sub1_2.method2249();
			if (local135 == 65535) {
				local135 = -1;
			}
			if (Static6.method217(local127)) {
				@Pc(157) Class191 local157 = Static171.method2789(local131);
				@Pc(174) Class57 local174;
				if (local157.aBoolean408) {
					Static23.method503(local135, local139, local131);
					local174 = Static56.method1050(local135);
					Static311.method4705(local131, local174.anInt1806, local174.anInt1790, local174.anInt1794);
					Static121.method1967(local131, local174.anInt1779, local174.anInt1815, local174.anInt1791);
				} else if (local135 == -1) {
					local157.anInt6149 = 0;
					Static281.anInt2783 = -1;
					return true;
				} else {
					local174 = Static56.method1050(local135);
					local157.anInt6091 = local174.anInt1806;
					local157.anInt6173 = local174.anInt1794 * 100 / local139;
					local157.anInt6149 = 4;
					local157.anInt6171 = local135;
					local157.anInt6118 = local174.anInt1790;
					Static40.method817(local157);
				}
			}
			Static281.anInt2783 = -1;
			return true;
		} else if (Static281.anInt2783 == 28) {
			Static248.anInt5062 = Static140.aClass1_Sub14_Sub1_2.method2199();
			Static95.anInt2191 = Static140.aClass1_Sub14_Sub1_2.method2199();
			Static202.anInt4405 = Static140.aClass1_Sub14_Sub1_2.method2199();
			Static281.anInt2783 = -1;
			return true;
		} else if (Static281.anInt2783 == 27) {
			local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
			Static28.method614(local127);
			Static150.anIntArray312[Static232.anInt4880++ & 0x1F] = local127 & 0x7FFF;
			Static281.anInt2783 = -1;
			return true;
		} else if (Static281.anInt2783 == 212) {
			local127 = Static140.aClass1_Sub14_Sub1_2.method2249();
			@Pc(292) Class191 local292 = Static171.method2789(local127);
			for (local135 = 0; local135 < local292.anIntArray561.length; local135++) {
				local292.anIntArray561[local135] = -1;
				local292.anIntArray561[local135] = 0;
			}
			Static40.method817(local292);
			Static281.anInt2783 = -1;
			return true;
		} else {
			@Pc(326) String local326;
			@Pc(337) String local337;
			if (Static281.anInt2783 == 114) {
				local326 = Static140.aClass1_Sub14_Sub1_2.method2237();
				local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local337 = Static240.method3781(local131).method3301(Static140.aClass1_Sub14_Sub1_2);
				Static215.method3446(local326, local337, null, local326, 19, local131, 0);
				Static281.anInt2783 = -1;
				return true;
			}
			@Pc(362) String local362;
			if (Static281.anInt2783 == 222) {
				local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local362 = Static140.aClass1_Sub14_Sub1_2.method2237();
				@Pc(368) Object[] local368 = new Object[local362.length() + 1];
				for (local139 = local362.length() - 1; local139 >= 0; local139--) {
					if (local362.charAt(local139) == 's') {
						local368[local139 + 1] = Static140.aClass1_Sub14_Sub1_2.method2237();
					} else {
						local368[local139 + 1] = Integer.valueOf(Static140.aClass1_Sub14_Sub1_2.method2194());
					}
				}
				local368[0] = Integer.valueOf(Static140.aClass1_Sub14_Sub1_2.method2194());
				if (Static6.method217(local127)) {
					@Pc(422) Class1_Sub27 local422 = new Class1_Sub27();
					local422.anObjectArray1 = local368;
					Static140.method2329(local422);
				}
				Static281.anInt2783 = -1;
				return true;
			}
			@Pc(456) int local456;
			if (Static281.anInt2783 == 116) {
				local127 = Static140.aClass1_Sub14_Sub1_2.method2238();
				local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
				local135 = Static140.aClass1_Sub14_Sub1_2.method2242();
				local139 = Static140.aClass1_Sub14_Sub1_2.method2203();
				local456 = Static140.aClass1_Sub14_Sub1_2.method2242();
				if (Static6.method217(local135)) {
					Static123.method2014(7, local131 | local127 << 16, local139, local456);
				}
				Static281.anInt2783 = -1;
				return true;
			} else if (Static281.anInt2783 == 188) {
				Static280.method4267();
				Static102.method731();
				Static259.anInt5238 += 32;
				Static281.anInt2783 = -1;
				return true;
			} else {
				@Pc(532) boolean local532;
				@Pc(549) int local549;
				@Pc(635) int local635;
				@Pc(648) int local648;
				if (Static281.anInt2783 == 29) {
					local326 = Static140.aClass1_Sub14_Sub1_2.method2237();
					@Pc(512) boolean local512 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
					if (local512) {
						local362 = Static140.aClass1_Sub14_Sub1_2.method2237();
					} else {
						local362 = local326;
					}
					local139 = Static140.aClass1_Sub14_Sub1_2.method2244();
					@Pc(530) byte local530 = Static140.aClass1_Sub14_Sub1_2.method2212();
					local532 = false;
					if (local530 == -128) {
						local532 = true;
					}
					if (local532) {
						if (Static69.anInt1441 == 0) {
							Static281.anInt2783 = -1;
							return true;
						}
						for (local549 = 0; Static69.anInt1441 > local549 && (!Static304.aClass132Array1[local549].aString324.equals(local362) || local139 != Static304.aClass132Array1[local549].anInt4668); local549++) {
						}
						if (Static69.anInt1441 > local549) {
							while (Static69.anInt1441 - 1 > local549) {
								Static304.aClass132Array1[local549] = Static304.aClass132Array1[local549 + 1];
								local549++;
							}
							Static69.anInt1441--;
							Static304.aClass132Array1[Static69.anInt1441] = null;
						}
					} else {
						@Pc(612) String local612 = Static140.aClass1_Sub14_Sub1_2.method2237();
						@Pc(616) Class132 local616 = new Class132();
						local616.anInt4668 = local139;
						local616.aString325 = local326;
						local616.aString326 = local612;
						local616.aByte18 = local530;
						local616.aString324 = local362;
						for (local635 = Static69.anInt1441 - 1; local635 >= 0; local635--) {
							local648 = Static304.aClass132Array1[local635].aString324.compareTo(local616.aString324);
							if (local648 == 0) {
								Static304.aClass132Array1[local635].anInt4668 = local139;
								Static304.aClass132Array1[local635].aByte18 = local530;
								Static304.aClass132Array1[local635].aString326 = local612;
								if (local362.equals(Static56.aClass2_Sub4_Sub2_1.aString182)) {
									Static206.aByte17 = local530;
								}
								Static281.anInt2783 = -1;
								Static316.anInt6313 = Static12.anInt4023;
								return true;
							}
							if (local648 < 0) {
								break;
							}
						}
						if (Static69.anInt1441 >= Static304.aClass132Array1.length) {
							Static281.anInt2783 = -1;
							return true;
						}
						for (local648 = Static69.anInt1441 - 1; local648 > local635; local648--) {
							Static304.aClass132Array1[local648 + 1] = Static304.aClass132Array1[local648];
						}
						if (Static69.anInt1441 == 0) {
							Static304.aClass132Array1 = new Class132[100];
						}
						Static304.aClass132Array1[local635 + 1] = local616;
						Static69.anInt1441++;
						if (local362.equals(Static56.aClass2_Sub4_Sub2_1.aString182)) {
							Static206.aByte17 = local530;
						}
					}
					Static316.anInt6313 = Static12.anInt4023;
					Static281.anInt2783 = -1;
					return true;
				}
				@Pc(800) boolean local800;
				@Pc(977) int local977;
				@Pc(1277) int local1277;
				if (Static281.anInt2783 == 249) {
					local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
					local131 = Static140.aClass1_Sub14_Sub1_2.method2243();
					local135 = Static140.aClass1_Sub14_Sub1_2.method2245();
					local139 = Static140.aClass1_Sub14_Sub1_2.method2242();
					if (local135 >> 30 == 0) {
						@Pc(819) Class94 local819;
						@Pc(914) Class32 local914;
						@Pc(907) Class32 local907;
						@Pc(833) Class32 local833;
						@Pc(894) Class94 local894;
						if (local135 >> 29 != 0) {
							local456 = local135 & 0xFFFF;
							@Pc(790) Class2_Sub4_Sub1 local790 = Static105.aClass2_Sub4_Sub1Array1[local456];
							if (local790 != null) {
								if (local127 == 65535) {
									local127 = -1;
								}
								local800 = true;
								if (local127 != -1 && local790.anInt2825 != -1) {
									if (local790.anInt2825 == local127) {
										local819 = Static28.method611(local127);
										if (local819.aBoolean220 && local819.anInt3368 != -1) {
											local833 = Static202.method3231(local819.anInt3368);
											local648 = local833.anInt972;
											if (local648 == 1) {
												local790.anInt2786 = local131 + Static133.anInt3061;
												local790.anInt2808 = 0;
												local800 = false;
												local790.anInt2837 = 0;
												local790.anInt2815 = 0;
												local790.anInt2785 = 1;
												Static154.method2507(false, local790.anInt2846, local790.anInt2794, local790.anInt2837, local833);
											} else if (local648 == 2) {
												local790.anInt2811 = 0;
												local800 = false;
											}
										}
									} else {
										local819 = Static28.method611(local127);
										local894 = Static28.method611(local790.anInt2825);
										if (local819.anInt3368 != -1 && local894.anInt3368 != -1) {
											local907 = Static202.method3231(local819.anInt3368);
											local914 = Static202.method3231(local894.anInt3368);
											if (local907.anInt967 < local914.anInt967) {
												local800 = false;
											}
										}
									}
								}
								if (local800) {
									local790.anInt2808 = 0;
									local790.anInt2825 = local127;
									local790.anInt2786 = Static133.anInt3061 + local131;
									local790.anInt2785 = 1;
									local790.anInt2837 = 0;
									if (local790.anInt2786 > Static133.anInt3061) {
										local790.anInt2837 = -1;
									}
									local790.anInt2792 = local139;
									if (local790.anInt2825 != -1 && local790.anInt2786 == Static133.anInt3061) {
										local977 = Static28.method611(local790.anInt2825).anInt3368;
										if (local977 != -1) {
											local833 = Static202.method3231(local977);
											if (local833 != null && local833.anIntArray123 != null) {
												Static154.method2507(false, local790.anInt2846, local790.anInt2794, 0, local833);
											}
										}
									}
								}
							}
						} else if (local135 >> 28 != 0) {
							local456 = local135 & 0xFFFF;
							@Pc(1027) Class2_Sub4_Sub2 local1027;
							if (Static62.anInt1348 == local456) {
								local1027 = Static56.aClass2_Sub4_Sub2_1;
							} else {
								local1027 = Static155.aClass2_Sub4_Sub2Array1[local456];
							}
							if (local1027 != null) {
								if (local127 == 65535) {
									local127 = -1;
								}
								local800 = true;
								if (local127 != -1 && local1027.anInt2825 != -1) {
									if (local1027.anInt2825 == local127) {
										local819 = Static28.method611(local127);
										if (local819.aBoolean220 && local819.anInt3368 != -1) {
											local833 = Static202.method3231(local819.anInt3368);
											local648 = local833.anInt972;
											if (local648 == 1) {
												local1027.anInt2808 = 0;
												local800 = false;
												local1027.anInt2785 = 1;
												local1027.anInt2786 = local131 + Static133.anInt3061;
												local1027.anInt2837 = 0;
												local1027.anInt2815 = 0;
												Static154.method2507(false, local1027.anInt2846, local1027.anInt2794, local1027.anInt2837, local833);
											} else if (local648 == 2) {
												local800 = false;
												local1027.anInt2811 = 0;
											}
										}
									} else {
										local819 = Static28.method611(local127);
										local894 = Static28.method611(local1027.anInt2825);
										if (local819.anInt3368 != -1 && local894.anInt3368 != -1) {
											local907 = Static202.method3231(local819.anInt3368);
											local914 = Static202.method3231(local894.anInt3368);
											if (local907.anInt967 < local914.anInt967) {
												local800 = false;
											}
										}
									}
								}
								if (local800) {
									local1027.anInt2786 = Static133.anInt3061 + local131;
									local1027.anInt2825 = local127;
									local1027.anInt2785 = 1;
									local1027.anInt2792 = local139;
									local1027.anInt2837 = 0;
									local1027.anInt2808 = 0;
									if (Static133.anInt3061 < local1027.anInt2786) {
										local1027.anInt2837 = -1;
									}
									if (local1027.anInt2825 == 65535) {
										local1027.anInt2825 = -1;
									}
									if (local1027.anInt2825 != -1 && Static133.anInt3061 == local1027.anInt2786) {
										local977 = Static28.method611(local1027.anInt2825).anInt3368;
										if (local977 != -1) {
											local833 = Static202.method3231(local977);
											if (local833 != null && local833.anIntArray123 != null) {
												Static154.method2507(Static56.aClass2_Sub4_Sub2_1 == local1027, local1027.anInt2846, local1027.anInt2794, 0, local833);
											}
										}
									}
								}
							}
						}
					} else {
						local456 = local135 >> 28 & 0x3;
						local549 = (local135 & 0x3FFF) - Static217.anInt4673;
						local1277 = (local135 >> 14 & 0x3FFF) - Static159.anInt3527;
						if (local1277 >= 0 && local549 >= 0 && local1277 < 104 && local549 < 104) {
							local1277 = local1277 * 128 + 64;
							local549 = local549 * 128 + 64;
							@Pc(1324) Class2_Sub6 local1324 = new Class2_Sub6(local127, local456, local1277, local549, Static93.method1576(local549, local1277, local456) - local139, local131, Static133.anInt3061);
							Static250.aClass26_48.method668(new Class1_Sub3_Sub12(local1324));
						}
					}
					Static281.anInt2783 = -1;
					return true;
				} else if (Static281.anInt2783 == 17) {
					local127 = Static140.aClass1_Sub14_Sub1_2.method2238();
					local131 = Static140.aClass1_Sub14_Sub1_2.method2241();
					local135 = Static140.aClass1_Sub14_Sub1_2.method2238();
					if (Static6.method217(local127)) {
						if (local131 == 2) {
							Static176.method2831();
						}
						Static36.anInt902 = local135;
						Static211.method3377(local135);
						Static210.method3373(false);
						Static23.method502(Static36.anInt902);
						for (local139 = 0; local139 < 100; local139++) {
							Static29.aBooleanArray6[local139] = true;
						}
					}
					Static281.anInt2783 = -1;
					return true;
				} else {
					@Pc(1426) boolean local1426;
					if (Static281.anInt2783 == 195) {
						Static316.anInt6313 = Static12.anInt4023;
						if (Static188.anInt4164 == 0) {
							Static281.anInt2783 = -1;
							Static292.aString418 = null;
							Static69.anInt1441 = 0;
							Static304.aClass132Array1 = null;
							Static129.aString176 = null;
							return true;
						}
						Static292.aString418 = Static140.aClass1_Sub14_Sub1_2.method2237();
						local1426 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
						if (local1426) {
							Static140.aClass1_Sub14_Sub1_2.method2237();
						}
						@Pc(1437) long local1437 = Static140.aClass1_Sub14_Sub1_2.method2213();
						Static129.aString176 = Static205.method3266(local1437);
						Static254.aByte23 = Static140.aClass1_Sub14_Sub1_2.method2212();
						local139 = Static140.aClass1_Sub14_Sub1_2.method2199();
						if (local139 == 255) {
							Static281.anInt2783 = -1;
							return true;
						}
						Static69.anInt1441 = local139;
						@Pc(1462) Class132[] local1462 = new Class132[100];
						for (local1277 = 0; local1277 < Static69.anInt1441; local1277++) {
							local1462[local1277] = new Class132();
							local1462[local1277].aString325 = Static140.aClass1_Sub14_Sub1_2.method2237();
							local1426 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
							if (local1426) {
								local1462[local1277].aString324 = Static140.aClass1_Sub14_Sub1_2.method2237();
							} else {
								local1462[local1277].aString324 = local1462[local1277].aString325;
							}
							local1462[local1277].anInt4668 = Static140.aClass1_Sub14_Sub1_2.method2244();
							local1462[local1277].aByte18 = Static140.aClass1_Sub14_Sub1_2.method2212();
							local1462[local1277].aString326 = Static140.aClass1_Sub14_Sub1_2.method2237();
							if (local1462[local1277].aString324.equals(Static56.aClass2_Sub4_Sub2_1.aString182)) {
								Static206.aByte17 = local1462[local1277].aByte18;
							}
						}
						local977 = Static69.anInt1441;
						while (local977 > 0) {
							local532 = true;
							local977--;
							for (local635 = 0; local635 < local977; local635++) {
								if (local1462[local635].aString325.compareTo(local1462[local635 + 1].aString325) > 0) {
									@Pc(1588) Class132 local1588 = local1462[local635];
									local1462[local635] = local1462[local635 + 1];
									local532 = false;
									local1462[local635 + 1] = local1588;
								}
							}
							if (local532) {
								break;
							}
						}
						Static304.aClass132Array1 = local1462;
						Static281.anInt2783 = -1;
						return true;
					} else if (Static281.anInt2783 == 123) {
						local127 = Static140.aClass1_Sub14_Sub1_2.method2241();
						local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
						Static108.method1773(local131, local127);
						Static281.anInt2783 = -1;
						return true;
					} else {
						@Pc(1651) String local1651;
						@Pc(1653) String local1653;
						@Pc(1685) String local1685;
						if (Static281.anInt2783 == 241) {
							local127 = Static140.aClass1_Sub14_Sub1_2.method2187();
							local131 = Static140.aClass1_Sub14_Sub1_2.method2194();
							local1651 = "";
							local1653 = local1651;
							local135 = Static140.aClass1_Sub14_Sub1_2.method2199();
							if ((local135 & 0x1) != 0) {
								local1651 = Static140.aClass1_Sub14_Sub1_2.method2237();
								if ((local135 & 0x2) == 0) {
									local1653 = local1651;
								} else {
									local1653 = Static140.aClass1_Sub14_Sub1_2.method2237();
								}
							}
							local1685 = Static140.aClass1_Sub14_Sub1_2.method2237();
							if (!local1653.equals("") && Static269.method4067(local1653)) {
								Static281.anInt2783 = -1;
								return true;
							} else {
								Static147.method2381(local131, local1685, local127, local1651, local1653);
								Static281.anInt2783 = -1;
								return true;
							}
						} else if (Static281.anInt2783 == 235) {
							Static79.method1343();
							Static281.anInt2783 = -1;
							return true;
						} else if (Static281.anInt2783 == 196) {
							Static13.anInt358 = Static140.aClass1_Sub14_Sub1_2.method2199();
							Static211.anInt4569 = Static140.aClass1_Sub14_Sub1_2.method2241();
							while (Static188.anInt4164 > Static140.aClass1_Sub14_Sub1_2.anInt3000) {
								Static281.anInt2783 = Static140.aClass1_Sub14_Sub1_2.method2199();
								Static94.method1605();
							}
							Static281.anInt2783 = -1;
							return true;
						} else if (Static281.anInt2783 == 61) {
							local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
							local131 = Static140.aClass1_Sub14_Sub1_2.method2203();
							if (Static6.method217(local127)) {
								local135 = 0;
								if (Static56.aClass2_Sub4_Sub2_1.aClass167_1 != null) {
									local135 = Static56.aClass2_Sub4_Sub2_1.aClass167_1.method4037();
								}
								Static123.method2014(3, local135, local131, -1);
							}
							Static281.anInt2783 = -1;
							return true;
						} else if (Static281.anInt2783 == 239) {
							for (local127 = 0; local127 < Static155.aClass2_Sub4_Sub2Array1.length; local127++) {
								if (Static155.aClass2_Sub4_Sub2Array1[local127] != null) {
									Static155.aClass2_Sub4_Sub2Array1[local127].anInt2822 = -1;
								}
							}
							for (local127 = 0; local127 < Static105.aClass2_Sub4_Sub1Array1.length; local127++) {
								if (Static105.aClass2_Sub4_Sub1Array1[local127] != null) {
									Static105.aClass2_Sub4_Sub1Array1[local127].anInt2822 = -1;
								}
							}
							Static281.anInt2783 = -1;
							return true;
						} else if (Static281.anInt2783 == 41) {
							Static221.anInt4695 = Static140.aClass1_Sub14_Sub1_2.method2199();
							Static281.anInt2783 = -1;
							return true;
						} else if (Static281.anInt2783 == 185) {
							Static170.method2760();
							Static281.anInt2783 = -1;
							return false;
						} else if (Static281.anInt2783 == 237 || Static281.anInt2783 == 173 || Static281.anInt2783 == 54 || Static281.anInt2783 == 38 || Static281.anInt2783 == 236 || Static281.anInt2783 == 168 || Static281.anInt2783 == 36 || Static281.anInt2783 == 209 || Static281.anInt2783 == 7 || Static281.anInt2783 == 97 || Static281.anInt2783 == 88 || Static281.anInt2783 == 244 || Static281.anInt2783 == 208 || Static281.anInt2783 == 81) {
							Static94.method1605();
							Static281.anInt2783 = -1;
							return true;
						} else if (Static281.anInt2783 == 189) {
							Static133.method2269(Static188.anInt4164, Static140.aClass1_Sub14_Sub1_2, Static142.aClass112_2);
							Static281.anInt2783 = -1;
							return true;
						} else {
							@Pc(2003) long local2003;
							@Pc(2019) Class1_Sub30 local2019;
							@Pc(2009) Class1_Sub30 local2009;
							if (Static281.anInt2783 == 107) {
								local127 = Static140.aClass1_Sub14_Sub1_2.method2245();
								local131 = Static140.aClass1_Sub14_Sub1_2.method2243();
								if (local131 == 65535) {
									local131 = -1;
								}
								local135 = Static140.aClass1_Sub14_Sub1_2.method2238();
								if (local135 == 65535) {
									local135 = -1;
								}
								local139 = Static140.aClass1_Sub14_Sub1_2.method2245();
								local456 = Static140.aClass1_Sub14_Sub1_2.method2244();
								if (Static6.method217(local456)) {
									for (local1277 = local131; local1277 <= local135; local1277++) {
										local2003 = ((long) local127 << 32) + ((long) local1277);
										local2009 = (Class1_Sub30) Static204.aClass186_19.method4570(local2003);
										if (local2009 != null) {
											local2019 = new Class1_Sub30(local139, local2009.anInt5928);
											local2009.method4767();
										} else if (local1277 == -1) {
											local2019 = new Class1_Sub30(local139, Static171.method2789(local127).aClass1_Sub30_1.anInt5928);
										} else {
											local2019 = new Class1_Sub30(local139, -1);
										}
										Static204.aClass186_19.method4575(local2003, local2019);
									}
								}
								Static281.anInt2783 = -1;
								return true;
							} else if (Static281.anInt2783 == 23) {
								local127 = Static140.aClass1_Sub14_Sub1_2.method2238();
								local131 = Static140.aClass1_Sub14_Sub1_2.method2203();
								local135 = Static140.aClass1_Sub14_Sub1_2.method2238();
								if (Static6.method217(local127)) {
									Static163.method2580(local131, local135);
								}
								Static281.anInt2783 = -1;
								return true;
							} else if (Static281.anInt2783 == 9) {
								local127 = Static140.aClass1_Sub14_Sub1_2.method2249();
								local131 = Static140.aClass1_Sub14_Sub1_2.method2238();
								local135 = Static140.aClass1_Sub14_Sub1_2.method2248();
								local139 = Static140.aClass1_Sub14_Sub1_2.method2216();
								if (Static6.method217(local131)) {
									Static63.method1121(local135, local127, local139);
								}
								Static281.anInt2783 = -1;
								return true;
							} else if (Static281.anInt2783 == 2) {
								local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
								local131 = Static140.aClass1_Sub14_Sub1_2.method2243();
								local135 = Static140.aClass1_Sub14_Sub1_2.method2227();
								@Pc(2149) Class2_Sub4_Sub1 local2149 = Static105.aClass2_Sub4_Sub1Array1[local127];
								if (local2149 != null) {
									Static167.method2739(local135, local2149, local131);
								}
								Static281.anInt2783 = -1;
								return true;
							} else if (Static281.anInt2783 == 229) {
								local127 = Static140.aClass1_Sub14_Sub1_2.method2242();
								local131 = Static140.aClass1_Sub14_Sub1_2.method2242();
								local135 = Static140.aClass1_Sub14_Sub1_2.method2242();
								local139 = Static140.aClass1_Sub14_Sub1_2.method2194();
								if (Static6.method217(local131)) {
									Static25.method534((local127 << 16) + local135, local139);
								}
								Static281.anInt2783 = -1;
								return true;
							} else if (Static281.anInt2783 == 52) {
								local127 = Static140.aClass1_Sub14_Sub1_2.method2199();
								local337 = Static140.aClass1_Sub14_Sub1_2.method2237();
								@Pc(2218) boolean local2218 = (local127 & 0x1) == 1;
								local1651 = Static140.aClass1_Sub14_Sub1_2.method2237();
								local1653 = Static140.aClass1_Sub14_Sub1_2.method2237();
								local1685 = Static140.aClass1_Sub14_Sub1_2.method2237();
								if (local2218) {
									for (local549 = 0; local549 < Static159.anInt3526; local549++) {
										if (Static18.aStringArray2[local549].equals(local1685)) {
											Static64.aStringArray14[local549] = local337;
											if (local1651.equals("")) {
												Static18.aStringArray2[local549] = local337;
											} else {
												Static18.aStringArray2[local549] = local1651;
											}
											Static60.aStringArray13[local549] = local1653;
											if (local1685.equals("")) {
												Static100.aStringArray21[local549] = local1653;
											} else {
												Static100.aStringArray21[local549] = local1685;
											}
											break;
										}
									}
								} else {
									Static64.aStringArray14[Static159.anInt3526] = local337;
									if (local1651.equals("")) {
										Static18.aStringArray2[Static159.anInt3526] = local337;
									} else {
										Static18.aStringArray2[Static159.anInt3526] = local1651;
									}
									Static60.aStringArray13[Static159.anInt3526] = local1653;
									if (local1685.equals("")) {
										Static100.aStringArray21[Static159.anInt3526] = local1653;
									} else {
										Static100.aStringArray21[Static159.anInt3526] = local1685;
									}
									Static141.aBooleanArray26[Static159.anInt3526] = (local127 & 0x2) == 2;
									Static159.anInt3526++;
								}
								Static41.anInt1002 = Static12.anInt4023;
								Static281.anInt2783 = -1;
								return true;
							} else if (Static281.anInt2783 == 117) {
								local127 = Static140.aClass1_Sub14_Sub1_2.method2194();
								local131 = Static140.aClass1_Sub14_Sub1_2.method2238();
								local135 = Static140.aClass1_Sub14_Sub1_2.method2238();
								if (local135 == 65535) {
									local135 = -1;
								}
								if (Static6.method217(local131)) {
									Static123.method2014(2, local135, local127, -1);
								}
								Static281.anInt2783 = -1;
								return true;
							} else if (Static281.anInt2783 == 148) {
								Static34.method689();
								Static281.anInt2783 = -1;
								return true;
							} else if (Static281.anInt2783 == 26) {
								if (Static229.aFrame1 != null) {
									Static286.method4392(Static309.anInt6184, -1, -1, false);
								}
								@Pc(2409) byte[] local2409 = new byte[Static188.anInt4164];
								Static140.aClass1_Sub14_Sub1_2.method2260(local2409, Static188.anInt4164);
								local362 = Static166.method2722(0, local2409, Static188.anInt4164);
								if (Static280.aFrame2 == null && (Static179.anInt3942 == 3 || !Static179.aString261.startsWith("win") || Static264.aBoolean330)) {
									Static5.method2409(local362, true);
								} else {
									Static205.aBoolean278 = true;
									Static209.aString309 = local362;
									Static296.aClass47_7 = Static142.aClass112_2.method2882(local362);
								}
								Static281.anInt2783 = -1;
								return true;
							} else {
								@Pc(2465) byte local2465;
								if (Static281.anInt2783 == 73) {
									local127 = Static140.aClass1_Sub14_Sub1_2.method2238();
									local2465 = Static140.aClass1_Sub14_Sub1_2.method2239();
									local135 = Static140.aClass1_Sub14_Sub1_2.method2238();
									if (Static6.method217(local127)) {
										Static167.method2737(local135, local2465);
									}
									Static281.anInt2783 = -1;
									return true;
								} else if (Static281.anInt2783 == 167) {
									local127 = Static140.aClass1_Sub14_Sub1_2.method2194();
									Static248.aClass47_6 = Static142.aClass112_2.method2887(local127);
									Static281.anInt2783 = -1;
									return true;
								} else if (Static281.anInt2783 == 78) {
									Static102.method731();
									Static281.anInt2795 = Static140.aClass1_Sub14_Sub1_2.method2248();
									Static190.anInt4200 = Static12.anInt4023;
									Static281.anInt2783 = -1;
									return true;
								} else if (Static281.anInt2783 == 112) {
									if (Static36.anInt902 != -1) {
										Static82.method1413(Static36.anInt902, 0);
									}
									Static281.anInt2783 = -1;
									return true;
								} else if (Static281.anInt2783 == 40) {
									local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
									local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
									local135 = Static140.aClass1_Sub14_Sub1_2.method2245();
									if (Static6.method217(local131)) {
										Static286.method4391(local135, local127);
									}
									Static281.anInt2783 = -1;
									return true;
								} else if (Static281.anInt2783 == 233) {
									local127 = Static140.aClass1_Sub14_Sub1_2.method2249();
									local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
									local135 = Static140.aClass1_Sub14_Sub1_2.method2244();
									if (local135 == 65535) {
										local135 = -1;
									}
									if (Static6.method217(local131)) {
										Static123.method2014(1, local135, local127, -1);
									}
									Static281.anInt2783 = -1;
									return true;
								} else if (Static281.anInt2783 == 144) {
									local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
									local131 = Static140.aClass1_Sub14_Sub1_2.method2249();
									local135 = Static140.aClass1_Sub14_Sub1_2.method2243();
									if (Static6.method217(local135)) {
										Static65.method1143(local131, local127);
									}
									Static281.anInt2783 = -1;
									return true;
								} else if (Static281.anInt2783 == 183) {
									local127 = Static140.aClass1_Sub14_Sub1_2.method2242();
									local131 = Static140.aClass1_Sub14_Sub1_2.method2238();
									local337 = Static140.aClass1_Sub14_Sub1_2.method2237();
									if (Static6.method217(local127)) {
										Static74.method1293(local337, local131);
									}
									Static281.anInt2783 = -1;
									return true;
								} else if (Static281.anInt2783 == 160) {
									local127 = Static140.aClass1_Sub14_Sub1_2.method2199();
									local362 = Static140.aClass1_Sub14_Sub1_2.method2237();
									local135 = Static140.aClass1_Sub14_Sub1_2.method2242();
									local139 = Static140.aClass1_Sub14_Sub1_2.method2241();
									if (local135 == 65535) {
										local135 = -1;
									}
									if (local127 >= 1 && local127 <= 8) {
										if (local362.equalsIgnoreCase("null")) {
											local362 = null;
										}
										Static290.aStringArray45[local127 - 1] = local362;
										Static129.anIntArray280[local127 - 1] = local135;
										Static241.aBooleanArray24[local127 - 1] = local139 == 0;
									}
									Static281.anInt2783 = -1;
									return true;
								} else if (Static281.anInt2783 == 199) {
									local127 = Static140.aClass1_Sub14_Sub1_2.method2242();
									local131 = Static140.aClass1_Sub14_Sub1_2.method2203();
									local135 = Static140.aClass1_Sub14_Sub1_2.method2238();
									local139 = Static140.aClass1_Sub14_Sub1_2.method2242();
									local456 = Static140.aClass1_Sub14_Sub1_2.method2243();
									if (Static6.method217(local456)) {
										Static311.method4705(local131, local139, local135, local127);
									}
									Static281.anInt2783 = -1;
									return true;
								} else if (Static281.anInt2783 == 143) {
									local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
									if (Static6.method217(local127)) {
										Static44.method877();
									}
									Static281.anInt2783 = -1;
									return true;
								} else {
									@Pc(2843) Class1_Sub12 local2843;
									if (Static281.anInt2783 == 13) {
										local127 = Static140.aClass1_Sub14_Sub1_2.method2249();
										local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
										local135 = Static140.aClass1_Sub14_Sub1_2.method2245();
										if (Static6.method217(local131)) {
											@Pc(2836) Class1_Sub12 local2836 = (Class1_Sub12) Static48.aClass186_5.method4570((long) local127);
											local2843 = (Class1_Sub12) Static48.aClass186_5.method4570((long) local135);
											if (local2843 != null) {
												Static236.method1277(local2836 == null || local2836.anInt2208 != local2843.anInt2208, local2843);
											}
											if (local2836 != null) {
												local2836.method4767();
												Static48.aClass186_5.method4575((long) local135, local2836);
											}
											@Pc(2875) Class191 local2875 = Static171.method2789(local127);
											if (local2875 != null) {
												Static40.method817(local2875);
											}
											local2875 = Static171.method2789(local135);
											if (local2875 != null) {
												Static40.method817(local2875);
												Static99.method1655(local2875, true);
											}
											if (Static36.anInt902 != -1) {
												Static82.method1413(Static36.anInt902, 1);
											}
										}
										Static281.anInt2783 = -1;
										return true;
									}
									@Pc(3159) int local3159;
									@Pc(3177) String local3177;
									@Pc(3195) String local3195;
									@Pc(3213) String local3213;
									@Pc(3231) int local3231;
									if (Static281.anInt2783 == 72) {
										local1426 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
										local362 = Static140.aClass1_Sub14_Sub1_2.method2237();
										local337 = Static140.aClass1_Sub14_Sub1_2.method2237();
										local139 = Static140.aClass1_Sub14_Sub1_2.method2244();
										local456 = Static140.aClass1_Sub14_Sub1_2.method2199();
										local800 = false;
										local1685 = "";
										if (local139 > 0) {
											local1685 = Static140.aClass1_Sub14_Sub1_2.method2237();
											local800 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
										}
										for (local977 = 0; local977 < Static223.anInt4775; local977++) {
											if (local1426) {
												if (local337.equals(Static280.aStringArray43[local977])) {
													Static280.aStringArray43[local977] = local362;
													Static234.aStringArray39[local977] = local337;
													local362 = null;
													break;
												}
											} else if (local362.equals(Static280.aStringArray43[local977])) {
												if (local139 != Static114.anIntArray259[local977]) {
													Static114.anIntArray259[local977] = local139;
													if (local139 > 0) {
														Static147.method2381(0, local362 + Static38.aString55, 5, "", "");
													}
													if (local139 == 0) {
														Static147.method2381(0, local362 + Static161.aString214, 5, "", "");
													}
												}
												local362 = null;
												Static234.aStringArray39[local977] = local337;
												Static142.aStringArray29[local977] = local1685;
												Static77.anIntArray187[local977] = local456;
												Static60.aBooleanArray16[local977] = local800;
												break;
											}
										}
										if (local362 != null && Static223.anInt4775 < 200) {
											Static280.aStringArray43[Static223.anInt4775] = local362;
											Static234.aStringArray39[Static223.anInt4775] = local337;
											Static114.anIntArray259[Static223.anInt4775] = local139;
											Static142.aStringArray29[Static223.anInt4775] = local1685;
											Static77.anIntArray187[Static223.anInt4775] = local456;
											Static60.aBooleanArray16[Static223.anInt4775] = local800;
											Static223.anInt4775++;
										}
										local635 = Static223.anInt4775;
										Static41.anInt1002 = Static12.anInt4023;
										while (local635 > 0) {
											@Pc(3117) boolean local3117 = true;
											local635--;
											for (local648 = 0; local648 < local635; local648++) {
												if (Static96.anInt2210 != Static114.anIntArray259[local648] && Static96.anInt2210 == Static114.anIntArray259[local648 + 1] || Static114.anIntArray259[local648] == 0 && Static114.anIntArray259[local648 + 1] != 0) {
													local3117 = false;
													local3159 = Static114.anIntArray259[local648];
													Static114.anIntArray259[local648] = Static114.anIntArray259[local648 + 1];
													Static114.anIntArray259[local648 + 1] = local3159;
													local3177 = Static142.aStringArray29[local648];
													Static142.aStringArray29[local648] = Static142.aStringArray29[local648 + 1];
													Static142.aStringArray29[local648 + 1] = local3177;
													local3195 = Static280.aStringArray43[local648];
													Static280.aStringArray43[local648] = Static280.aStringArray43[local648 + 1];
													Static280.aStringArray43[local648 + 1] = local3195;
													local3213 = Static234.aStringArray39[local648];
													Static234.aStringArray39[local648] = Static234.aStringArray39[local648 + 1];
													Static234.aStringArray39[local648 + 1] = local3213;
													local3231 = Static77.anIntArray187[local648];
													Static77.anIntArray187[local648] = Static77.anIntArray187[local648 + 1];
													Static77.anIntArray187[local648 + 1] = local3231;
													@Pc(3249) boolean local3249 = Static60.aBooleanArray16[local648];
													Static60.aBooleanArray16[local648] = Static60.aBooleanArray16[local648 + 1];
													Static60.aBooleanArray16[local648 + 1] = local3249;
												}
											}
											if (local3117) {
												break;
											}
										}
										Static281.anInt2783 = -1;
										return true;
									} else if (Static281.anInt2783 == 122) {
										Static3.anInt60 = Static140.aClass1_Sub14_Sub1_2.method2199();
										Static281.anInt2783 = -1;
										Static41.anInt1002 = Static12.anInt4023;
										return true;
									} else if (Static281.anInt2783 == 22) {
										local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
										local131 = Static140.aClass1_Sub14_Sub1_2.method2199();
										local135 = Static140.aClass1_Sub14_Sub1_2.method2199();
										local139 = Static140.aClass1_Sub14_Sub1_2.method2244();
										local456 = Static140.aClass1_Sub14_Sub1_2.method2199();
										local1277 = Static140.aClass1_Sub14_Sub1_2.method2199();
										if (Static6.method217(local127)) {
											Static137.method1693(local139, local135, local1277, local456, local131);
										}
										Static281.anInt2783 = -1;
										return true;
									} else if (Static281.anInt2783 == 214) {
										local127 = Static140.aClass1_Sub14_Sub1_2.method2194();
										local131 = Static140.aClass1_Sub14_Sub1_2.method2242();
										Static108.method1773(local131, local127);
										Static281.anInt2783 = -1;
										return true;
									} else if (Static281.anInt2783 == 182) {
										local127 = Static140.aClass1_Sub14_Sub1_2.method2243();
										local2465 = Static140.aClass1_Sub14_Sub1_2.method2212();
										Static101.method202(local2465, local127);
										Static281.anInt2783 = -1;
										return true;
									} else if (Static281.anInt2783 == 30) {
										Static102.method731();
										local127 = Static140.aClass1_Sub14_Sub1_2.method2227();
										local131 = Static140.aClass1_Sub14_Sub1_2.method2229();
										local135 = Static140.aClass1_Sub14_Sub1_2.method2203();
										Static189.anIntArray363[local131] = local135;
										Static269.anIntArray483[local131] = local127;
										Static55.anIntArray155[local131] = 1;
										for (local139 = 0; local139 < 98; local139++) {
											if (Class1_Sub7.anIntArray163[local139] <= local135) {
												Static55.anIntArray155[local131] = local139 + 2;
											}
										}
										Static139.anIntArray294[Static205.anInt4447++ & 0x1F] = local131;
										Static281.anInt2783 = -1;
										return true;
									} else if (Static281.anInt2783 == 108) {
										local127 = Static140.aClass1_Sub14_Sub1_2.method2242();
										if (local127 == 65535) {
											local127 = -1;
										}
										local131 = Static140.aClass1_Sub14_Sub1_2.method2241();
										local135 = local131 >> 2;
										local139 = local131 & 0x3;
										local456 = Static66.anIntArray439[local135];
										local1277 = Static140.aClass1_Sub14_Sub1_2.method2249();
										local549 = local1277 >> 28 & 0x3;
										local635 = local1277 & 0x3FFF;
										local977 = local1277 >> 14 & 0x3FFF;
										local977 -= Static159.anInt3527;
										local635 -= Static217.anInt4673;
										Static154.method2506(local977, local139, local456, local549, local635, local135, local127);
										Static281.anInt2783 = -1;
										return true;
									} else if (Static281.anInt2783 == 181) {
										Static206.method3269(false);
										Static281.anInt2783 = -1;
										return true;
									} else if (Static281.anInt2783 == 155) {
										local127 = Static140.aClass1_Sub14_Sub1_2.method2203();
										local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
										if (Static6.method217(local131)) {
											Static123.method2014(5, 2047, local127, 0);
										}
										Static281.anInt2783 = -1;
										return true;
									} else if (Static281.anInt2783 == 119) {
										local127 = Static140.aClass1_Sub14_Sub1_2.method2229();
										local131 = Static140.aClass1_Sub14_Sub1_2.method2242();
										if (Static6.method217(local131)) {
											Static5.anInt3336 = local127;
										}
										Static281.anInt2783 = -1;
										return true;
									} else if (Static281.anInt2783 == 49) {
										Static140.aClass1_Sub14_Sub1_2.anInt3000 += 28;
										if (Static140.aClass1_Sub14_Sub1_2.method2235()) {
											Static209.method3352(Static140.aClass1_Sub14_Sub1_2.anInt3000 - 28, Static140.aClass1_Sub14_Sub1_2);
										}
										Static281.anInt2783 = -1;
										return true;
									} else {
										@Pc(3622) Class191 local3622;
										if (Static281.anInt2783 == 153) {
											local127 = Static140.aClass1_Sub14_Sub1_2.method2194();
											local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
											if (local127 < 0) {
												local3622 = null;
											} else {
												local3622 = Static171.method2789(local127);
											}
											if (local3622 != null) {
												for (local139 = 0; local139 < local3622.anIntArray561.length; local139++) {
													local3622.anIntArray561[local139] = 0;
													local3622.anIntArray553[local139] = 0;
												}
											}
											if (local127 < -70000) {
												local131 += 32768;
											}
											Static47.method953(local131);
											local139 = Static140.aClass1_Sub14_Sub1_2.method2244();
											for (local456 = 0; local456 < local139; local456++) {
												local1277 = Static140.aClass1_Sub14_Sub1_2.method2227();
												if (local1277 == 255) {
													local1277 = Static140.aClass1_Sub14_Sub1_2.method2194();
												}
												local549 = Static140.aClass1_Sub14_Sub1_2.method2242();
												if (local3622 != null && local3622.anIntArray561.length > local456) {
													local3622.anIntArray561[local456] = local549;
													local3622.anIntArray553[local456] = local1277;
												}
												Static109.method1799(local456, local549 - 1, local1277, local131);
											}
											if (local3622 != null) {
												Static40.method817(local3622);
											}
											Static102.method731();
											Static150.anIntArray312[Static232.anInt4880++ & 0x1F] = local131 & 0x7FFF;
											Static281.anInt2783 = -1;
											return true;
										} else if (Static281.anInt2783 == 70) {
											local127 = Static140.aClass1_Sub14_Sub1_2.method2194();
											local131 = Static140.aClass1_Sub14_Sub1_2.method2243();
											local135 = Static140.aClass1_Sub14_Sub1_2.method2238();
											if (Static6.method217(local131)) {
												Static167.method2737(local135, local127);
											}
											Static281.anInt2783 = -1;
											return true;
										} else {
											@Pc(3816) long local3816;
											@Pc(3821) long local3821;
											if (Static281.anInt2783 == 33) {
												local1426 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
												local362 = Static140.aClass1_Sub14_Sub1_2.method2237();
												local337 = local362;
												if (local1426) {
													local337 = Static140.aClass1_Sub14_Sub1_2.method2237();
												}
												@Pc(3811) boolean local3811 = false;
												local3816 = Static140.aClass1_Sub14_Sub1_2.method2244();
												local3821 = Static140.aClass1_Sub14_Sub1_2.method2215();
												@Pc(3827) long local3827 = local3821 + (local3816 << 32);
												local977 = Static140.aClass1_Sub14_Sub1_2.method2199();
												@Pc(3833) int local3833 = 0;
												while (true) {
													if (local3833 < 100) {
														if (Static253.aLongArray9[local3833] != local3827) {
															local3833++;
															continue;
														}
														local3811 = true;
														break;
													}
													if (local977 <= 1) {
														if (Static50.aBoolean16 && !Static159.aBoolean228 || Static80.aBoolean125) {
															local3811 = true;
														} else if (Static269.method4067(local337)) {
															local3811 = true;
														}
													}
													break;
												}
												if (!local3811 && Static286.anInt5741 == 0) {
													Static253.aLongArray9[Static167.anInt3761] = local3827;
													Static167.anInt3761 = (Static167.anInt3761 + 1) % 100;
													local3177 = Static45.method3520(Static75.method1318(Static265.method4016(Static140.aClass1_Sub14_Sub1_2)));
													if (local977 == 2) {
														Static215.method3446("<img=1>" + local362, local3177, null, "<img=1>" + local337, 7, -1, 0);
													} else if (local977 == 1) {
														Static215.method3446("<img=0>" + local362, local3177, null, "<img=0>" + local337, 7, -1, 0);
													} else {
														Static215.method3446(local362, local3177, null, local337, 3, -1, 0);
													}
												}
												Static281.anInt2783 = -1;
												return true;
											} else if (Static281.anInt2783 == 60) {
												Static28.method612(Static140.aClass1_Sub14_Sub1_2.method2237());
												Static281.anInt2783 = -1;
												return true;
											} else if (Static281.anInt2783 == 51) {
												local127 = Static140.aClass1_Sub14_Sub1_2.method2245();
												local131 = Static140.aClass1_Sub14_Sub1_2.method2242();
												local135 = Static140.aClass1_Sub14_Sub1_2.method2249();
												local139 = Static140.aClass1_Sub14_Sub1_2.method2244();
												if (Static6.method217(local139)) {
													Static123.method2014(5, local131, local127, local135);
												}
												Static281.anInt2783 = -1;
												return true;
											} else if (Static281.anInt2783 == 149) {
												local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
												local131 = Static140.aClass1_Sub14_Sub1_2.method2238();
												local135 = Static140.aClass1_Sub14_Sub1_2.method2243();
												if (Static6.method217(local135)) {
													Static223.method3534(local131, local127);
												}
												Static281.anInt2783 = -1;
												return true;
											} else if (Static281.anInt2783 == 76) {
												if (Static188.anInt4164 == 0) {
													Static86.aString118 = Static170.aString240;
												} else {
													Static86.aString118 = Static140.aClass1_Sub14_Sub1_2.method2237();
												}
												Static281.anInt2783 = -1;
												return true;
											} else if (Static281.anInt2783 == 0) {
												local127 = Static140.aClass1_Sub14_Sub1_2.method2238();
												local362 = Static140.aClass1_Sub14_Sub1_2.method2237();
												local135 = Static140.aClass1_Sub14_Sub1_2.method2249();
												if (Static6.method217(local127)) {
													Static94.method1603(local362, local135);
												}
												Static281.anInt2783 = -1;
												return true;
											} else if (Static281.anInt2783 == 98) {
												local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
												local131 = Static140.aClass1_Sub14_Sub1_2.method2194();
												if (Static6.method217(local127)) {
													@Pc(4137) Class1_Sub12 local4137 = (Class1_Sub12) Static48.aClass186_5.method4570((long) local131);
													if (local4137 != null) {
														Static236.method1277(true, local4137);
													}
													if (Static290.aClass191_16 != null) {
														Static40.method817(Static290.aClass191_16);
														Static290.aClass191_16 = null;
													}
												}
												Static281.anInt2783 = -1;
												return true;
											} else if (Static281.anInt2783 == 228) {
												Static13.anInt358 = Static140.aClass1_Sub14_Sub1_2.method2227();
												Static211.anInt4569 = Static140.aClass1_Sub14_Sub1_2.method2227();
												Static281.anInt2783 = -1;
												return true;
											} else if (Static281.anInt2783 == 166) {
												local127 = Static140.aClass1_Sub14_Sub1_2.method2194();
												local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
												if (local127 < -70000) {
													local131 += 32768;
												}
												if (local127 >= 0) {
													local3622 = Static171.method2789(local127);
												} else {
													local3622 = null;
												}
												while (Static140.aClass1_Sub14_Sub1_2.anInt3000 < Static188.anInt4164) {
													local139 = Static140.aClass1_Sub14_Sub1_2.method2187();
													local456 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local1277 = 0;
													if (local456 != 0) {
														local1277 = Static140.aClass1_Sub14_Sub1_2.method2199();
														if (local1277 == 255) {
															local1277 = Static140.aClass1_Sub14_Sub1_2.method2194();
														}
													}
													if (local3622 != null && local139 >= 0 && local139 < local3622.anIntArray561.length) {
														local3622.anIntArray561[local139] = local456;
														local3622.anIntArray553[local139] = local1277;
													}
													Static109.method1799(local139, local456 - 1, local1277, local131);
												}
												if (local3622 != null) {
													Static40.method817(local3622);
												}
												Static102.method731();
												Static150.anIntArray312[Static232.anInt4880++ & 0x1F] = local131 & 0x7FFF;
												Static281.anInt2783 = -1;
												return true;
											} else if (Static281.anInt2783 == 120) {
												Static102.method731();
												Static132.anInt3053 = Static140.aClass1_Sub14_Sub1_2.method2199();
												Static190.anInt4200 = Static12.anInt4023;
												Static281.anInt2783 = -1;
												return true;
											} else if (Static281.anInt2783 == 34) {
												Static264.anInt5302 = Static140.aClass1_Sub14_Sub1_2.method2242() * 30;
												Static281.anInt2783 = -1;
												Static190.anInt4200 = Static12.anInt4023;
												return true;
											} else {
												@Pc(4378) long local4378;
												if (Static281.anInt2783 == 162) {
													local1426 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
													local362 = Static140.aClass1_Sub14_Sub1_2.method2237();
													local337 = local362;
													if (local1426) {
														local337 = Static140.aClass1_Sub14_Sub1_2.method2237();
													}
													@Pc(4362) boolean local4362 = false;
													local3816 = Static140.aClass1_Sub14_Sub1_2.method2213();
													local3821 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local4378 = Static140.aClass1_Sub14_Sub1_2.method2215();
													local648 = Static140.aClass1_Sub14_Sub1_2.method2199();
													@Pc(4388) long local4388 = (local3821 << 32) + local4378;
													@Pc(4390) int local4390 = 0;
													while (true) {
														if (local4390 < 100) {
															if (local4388 != Static253.aLongArray9[local4390]) {
																local4390++;
																continue;
															}
															local4362 = true;
															break;
														}
														if (local648 <= 1) {
															if (Static50.aBoolean16 && !Static159.aBoolean228 || Static80.aBoolean125) {
																local4362 = true;
															} else if (Static269.method4067(local337)) {
																local4362 = true;
															}
														}
														break;
													}
													if (!local4362 && Static286.anInt5741 == 0) {
														Static253.aLongArray9[Static167.anInt3761] = local4388;
														Static167.anInt3761 = (Static167.anInt3761 + 1) % 100;
														local3213 = Static45.method3520(Static75.method1318(Static265.method4016(Static140.aClass1_Sub14_Sub1_2)));
														if (local648 == 2 || local648 == 3) {
															Static215.method3446("<img=1>" + local362, local3213, Static216.method3452(local3816), "<img=1>" + local337, 9, -1, 0);
														} else if (local648 == 1) {
															Static215.method3446("<img=0>" + local362, local3213, Static216.method3452(local3816), "<img=0>" + local337, 9, -1, 0);
														} else {
															Static215.method3446(local362, local3213, Static216.method3452(local3816), local337, 9, -1, 0);
														}
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 145) {
													Static206.method3269(true);
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 31) {
													for (local127 = 0; local127 < Static296.anIntArray530.length; local127++) {
														if (Static296.anIntArray530[local127] != Static90.anIntArray207[local127]) {
															Static296.anIntArray530[local127] = Static90.anIntArray207[local127];
															Static146.method3260(local127);
															Static137.anIntArray228[Static259.anInt5238++ & 0x1F] = local127;
														}
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 95) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2199();
													if (Static140.aClass1_Sub14_Sub1_2.method2199() == 0) {
														Static184.aClass33Array1[local127] = new Class33();
													} else {
														Static140.aClass1_Sub14_Sub1_2.anInt3000--;
														Static184.aClass33Array1[local127] = new Class33(Static140.aClass1_Sub14_Sub1_2);
													}
													Static133.anInt3068 = Static12.anInt4023;
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 96) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
													if (Static6.method217(local127)) {
														Static226.method3586();
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 24) {
													Static159.anInt3526 = Static140.aClass1_Sub14_Sub1_2.method2199();
													for (local127 = 0; local127 < Static159.anInt3526; local127++) {
														Static64.aStringArray14[local127] = Static140.aClass1_Sub14_Sub1_2.method2237();
														Static18.aStringArray2[local127] = Static140.aClass1_Sub14_Sub1_2.method2237();
														if (Static18.aStringArray2[local127].equals("")) {
															Static18.aStringArray2[local127] = Static64.aStringArray14[local127];
														}
														Static60.aStringArray13[local127] = Static140.aClass1_Sub14_Sub1_2.method2237();
														Static100.aStringArray21[local127] = Static140.aClass1_Sub14_Sub1_2.method2237();
														if (Static100.aStringArray21[local127].equals("")) {
															Static100.aStringArray21[local127] = Static60.aStringArray13[local127];
														}
														Static141.aBooleanArray26[local127] = false;
													}
													Static281.anInt2783 = -1;
													Static41.anInt1002 = Static12.anInt4023;
													return true;
												} else if (Static281.anInt2783 == 77) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2238();
													if (local131 == 65535) {
														local131 = -1;
													}
													Static87.method1506(local127, local131);
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 80) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2243();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2202();
													if (local127 == 65535) {
														local127 = -1;
													}
													local135 = Static140.aClass1_Sub14_Sub1_2.method2241();
													Static123.method2017(local131, local135, local127);
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 75) {
													local1426 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
													local362 = Static140.aClass1_Sub14_Sub1_2.method2237();
													local337 = local362;
													if (local1426) {
														local337 = Static140.aClass1_Sub14_Sub1_2.method2237();
													}
													local3816 = Static140.aClass1_Sub14_Sub1_2.method2213();
													local3821 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local4378 = Static140.aClass1_Sub14_Sub1_2.method2215();
													local648 = Static140.aClass1_Sub14_Sub1_2.method2199();
													@Pc(4849) long local4849 = (local3821 << 32) + local4378;
													@Pc(4851) boolean local4851 = false;
													local3159 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local3231 = 0;
													while (true) {
														if (local3231 >= 100) {
															if (local648 <= 1 && Static269.method4067(local337)) {
																local4851 = true;
															}
															break;
														}
														if (local4849 == Static253.aLongArray9[local3231]) {
															local4851 = true;
															break;
														}
														local3231++;
													}
													if (!local4851 && Static286.anInt5741 == 0) {
														Static253.aLongArray9[Static167.anInt3761] = local4849;
														Static167.anInt3761 = (Static167.anInt3761 + 1) % 100;
														@Pc(4909) String local4909 = Static240.method3781(local3159).method3301(Static140.aClass1_Sub14_Sub1_2);
														if (local648 == 2) {
															Static215.method3446("<img=1>" + local362, local4909, Static216.method3452(local3816), "<img=1>" + local337, 20, local3159, 0);
														} else if (local648 == 1) {
															Static215.method3446("<img=0>" + local362, local4909, Static216.method3452(local3816), "<img=0>" + local337, 20, local3159, 0);
														} else {
															Static215.method3446(local362, local4909, Static216.method3452(local3816), local337, 20, local3159, 0);
														}
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 58) {
													Static211.anInt4569 = Static140.aClass1_Sub14_Sub1_2.method2199();
													Static13.anInt358 = Static140.aClass1_Sub14_Sub1_2.method2227();
													for (local127 = Static211.anInt4569; local127 < Static211.anInt4569 + 8; local127++) {
														for (local131 = Static13.anInt358; local131 < Static13.anInt358 + 8; local131++) {
															if (Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local127][local131] != null) {
																Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local127][local131] = null;
																Static129.method2068(local127, local131);
															}
														}
													}
													for (@Pc(5063) Class1_Sub4 local5063 = (Class1_Sub4) Static122.aClass26_26.method666(); local5063 != null; local5063 = (Class1_Sub4) Static122.aClass26_26.method672()) {
														if (Static211.anInt4569 <= local5063.anInt903 && Static211.anInt4569 + 8 > local5063.anInt903 && Static13.anInt358 <= local5063.anInt917 && Static13.anInt358 + 8 > local5063.anInt917 && local5063.anInt908 == Static185.anInt4085) {
															local5063.anInt909 = 0;
														}
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 127) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2245();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2243();
													local135 = Static140.aClass1_Sub14_Sub1_2.method2199();
													if (Static6.method217(local131)) {
														Static53.method1011(local135, local127);
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 245) {
													local326 = Static140.aClass1_Sub14_Sub1_2.method2237();
													local362 = Static45.method3520(Static75.method1318(Static265.method4016(Static140.aClass1_Sub14_Sub1_2)));
													Static147.method2381(0, local362, 6, local326, local326);
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 16) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2241();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2229();
													local135 = Static140.aClass1_Sub14_Sub1_2.method2227();
													Static185.anInt4085 = local131 >> 1;
													Static56.aClass2_Sub4_Sub2_1.method2110(local127, local135, (local131 & 0x1) == 1);
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 138) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2242();
													if (local127 == 65535) {
														local127 = -1;
													}
													local131 = Static140.aClass1_Sub14_Sub1_2.method2238();
													local135 = Static140.aClass1_Sub14_Sub1_2.method2242();
													if (local131 == 65535) {
														local131 = -1;
													}
													local139 = Static140.aClass1_Sub14_Sub1_2.method2203();
													local456 = Static140.aClass1_Sub14_Sub1_2.method2242();
													if (Static6.method217(local135)) {
														for (local1277 = local131; local1277 <= local127; local1277++) {
															local2003 = ((long) local139 << 32) + (long) local1277;
															local2009 = (Class1_Sub30) Static204.aClass186_19.method4570(local2003);
															if (local2009 != null) {
																local2019 = new Class1_Sub30(local2009.anInt5933, local456);
																local2009.method4767();
															} else if (local1277 == -1) {
																local2019 = new Class1_Sub30(Static171.method2789(local139).aClass1_Sub30_1.anInt5933, local456);
															} else {
																local2019 = new Class1_Sub30(0, local456);
															}
															Static204.aClass186_19.method4575(local2003, local2019);
														}
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 15) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2203();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2242();
													Static101.method202(local127, local131);
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 225) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2199();
													@Pc(5350) byte local5350 = Static140.aClass1_Sub14_Sub1_2.method2212();
													if (Static273.aByte24 != local5350) {
														Static281.anInt2783 = -1;
														return true;
													}
													if (local127 == 255) {
														Static259.anInt5240 = 0;
														Static280.anInt5624 = 0;
														Static240.aBoolean314 = false;
													} else {
														Static259.anInt5240 = local131;
														Static240.aBoolean314 = true;
														Static280.anInt5624 = local127;
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 219) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local135 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local139 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local456 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local1277 = Static140.aClass1_Sub14_Sub1_2.method2244();
													if (Static6.method217(local127)) {
														Static103.aBooleanArray18[local131] = true;
														Static211.anIntArray411[local131] = local135;
														Static225.anIntArray441[local131] = local139;
														Static221.anIntArray430[local131] = local456;
														Static44.anIntArray132[local131] = local1277;
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 129) {
													local1426 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
													local362 = Static140.aClass1_Sub14_Sub1_2.method2237();
													local337 = local362;
													if (local1426) {
														local337 = Static140.aClass1_Sub14_Sub1_2.method2237();
													}
													local3816 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local3821 = Static140.aClass1_Sub14_Sub1_2.method2215();
													local977 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local635 = Static140.aClass1_Sub14_Sub1_2.method2244();
													@Pc(5492) long local5492 = (local3816 << 32) + local3821;
													@Pc(5494) boolean local5494 = false;
													@Pc(5496) int local5496 = 0;
													while (true) {
														if (local5496 < 100) {
															if (local5492 != Static253.aLongArray9[local5496]) {
																local5496++;
																continue;
															}
															local5494 = true;
															break;
														}
														if (local977 <= 1 && Static269.method4067(local337)) {
															local5494 = true;
														}
														break;
													}
													if (!local5494 && Static286.anInt5741 == 0) {
														Static253.aLongArray9[Static167.anInt3761] = local5492;
														Static167.anInt3761 = (Static167.anInt3761 + 1) % 100;
														local3195 = Static240.method3781(local635).method3301(Static140.aClass1_Sub14_Sub1_2);
														if (local977 == 2) {
															Static215.method3446("<img=1>" + local362, local3195, null, "<img=1>" + local337, 18, local635, 0);
														} else if (local977 == 1) {
															Static215.method3446("<img=0>" + local362, local3195, null, "<img=0>" + local337, 18, local635, 0);
														} else {
															Static215.method3446(local362, local3195, null, local337, 18, local635, 0);
														}
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 179) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local135 = Static140.aClass1_Sub14_Sub1_2.method2244();
													if (local127 == 65535) {
														local127 = -1;
													}
													local139 = Static140.aClass1_Sub14_Sub1_2.method2199();
													Static81.method1381(local127, local135, local139, local131);
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 125) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local135 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local139 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local456 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local1277 = Static140.aClass1_Sub14_Sub1_2.method2199();
													if (Static6.method217(local127)) {
														Static137.method1698(local135, local1277, local131, true, local456, local139);
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 135) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2238();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local337 = Static140.aClass1_Sub14_Sub1_2.method2237();
													if (Static6.method217(local131)) {
														Static74.method1293(local337, local127);
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 203) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2249();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2244();
													local135 = Static140.aClass1_Sub14_Sub1_2.method2229();
													local139 = Static140.aClass1_Sub14_Sub1_2.method2238();
													if (Static6.method217(local131)) {
														local2843 = (Class1_Sub12) Static48.aClass186_5.method4570((long) local127);
														if (local2843 != null) {
															Static236.method1277(local139 != local2843.anInt2208, local2843);
														}
														Static106.method1770(local139, local135, local127);
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 240) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2199();
													local131 = local127 >> 5;
													local135 = local127 & 0x1F;
													if (local135 == 0) {
														Static170.aClass64Array1[local131] = null;
														Static281.anInt2783 = -1;
														return true;
													}
													@Pc(5833) Class64 local5833 = new Class64();
													local5833.anInt2092 = local135;
													local5833.anInt2094 = Static140.aClass1_Sub14_Sub1_2.method2199();
													if (local5833.anInt2094 >= 0 && local5833.anInt2094 < Static82.aClass1_Sub3_Sub13Array5.length) {
														if (local5833.anInt2092 == 1 || local5833.anInt2092 == 10) {
															local5833.anInt2090 = Static140.aClass1_Sub14_Sub1_2.method2244();
															Static140.aClass1_Sub14_Sub1_2.anInt3000 += 5;
														} else if (local5833.anInt2092 >= 2 && local5833.anInt2092 <= 6) {
															if (local5833.anInt2092 == 2) {
																local5833.anInt2098 = 64;
																local5833.anInt2099 = 64;
															}
															if (local5833.anInt2092 == 3) {
																local5833.anInt2099 = 0;
																local5833.anInt2098 = 64;
															}
															if (local5833.anInt2092 == 4) {
																local5833.anInt2099 = 128;
																local5833.anInt2098 = 64;
															}
															if (local5833.anInt2092 == 5) {
																local5833.anInt2098 = 0;
																local5833.anInt2099 = 64;
															}
															if (local5833.anInt2092 == 6) {
																local5833.anInt2098 = 128;
																local5833.anInt2099 = 64;
															}
															local5833.anInt2092 = 2;
															local5833.anInt2097 = Static140.aClass1_Sub14_Sub1_2.method2244();
															local5833.anInt2095 = Static140.aClass1_Sub14_Sub1_2.method2244();
															local5833.anInt2087 = Static140.aClass1_Sub14_Sub1_2.method2199();
															local5833.anInt2093 = Static140.aClass1_Sub14_Sub1_2.method2244();
														}
														local5833.anInt2089 = Static140.aClass1_Sub14_Sub1_2.method2244();
														if (local5833.anInt2089 == 65535) {
															local5833.anInt2089 = -1;
														}
														Static170.aClass64Array1[local131] = local5833;
													}
													Static281.anInt2783 = -1;
													return true;
												} else if (Static281.anInt2783 == 124) {
													local127 = Static140.aClass1_Sub14_Sub1_2.method2243();
													local131 = Static140.aClass1_Sub14_Sub1_2.method2216();
													local135 = Static140.aClass1_Sub14_Sub1_2.method2245();
													if (Static6.method217(local127)) {
														Static162.method2565(local135, local131);
													}
													Static281.anInt2783 = -1;
													return true;
												} else {
													Static66.method3525(null, "T1 - " + Static281.anInt2783 + "," + Static124.anInt2710 + "," + Static148.anInt3326 + " - " + Static188.anInt4164);
													Static170.method2760();
													return true;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
