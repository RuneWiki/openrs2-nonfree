import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	public static int anInt4248;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public static int anInt4252;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	public static int anInt4254;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1211 = Static181.method2795("logo");

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1213 = Static181.method2795("as it was used to break our rules)3");

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1212 = aClass83_1213;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public static int anInt4249 = 0;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
	public static int anInt4250 = 0;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
	public static final int[] anIntArray404 = new int[25];

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Z")
	public static boolean method3234() throws IOException {
		if (Static175.aClass25_5 == null) {
			return false;
		}
		@Pc(13) int local13 = Static175.aClass25_5.method798();
		if (local13 == 0) {
			return false;
		}
		if (Static148.anInt3046 == -1) {
			Static175.aClass25_5.method804(Static33.aClass2_Sub3_Sub1_1.aByteArray2, 0, 1);
			Static33.aClass2_Sub3_Sub1_1.anInt340 = 0;
			local13--;
			Static148.anInt3046 = Static33.aClass2_Sub3_Sub1_1.method278();
			Static131.anInt2843 = Static35.anIntArray73[Static148.anInt3046];
		}
		if (Static131.anInt2843 == -1) {
			if (local13 <= 0) {
				return false;
			}
			local13--;
			Static175.aClass25_5.method804(Static33.aClass2_Sub3_Sub1_1.aByteArray2, 0, 1);
			Static131.anInt2843 = Static33.aClass2_Sub3_Sub1_1.aByteArray2[0] & 0xFF;
		}
		if (Static131.anInt2843 == -2) {
			if (local13 <= 1) {
				return false;
			}
			local13 -= 2;
			Static175.aClass25_5.method804(Static33.aClass2_Sub3_Sub1_1.aByteArray2, 0, 2);
			Static33.aClass2_Sub3_Sub1_1.anInt340 = 0;
			Static131.anInt2843 = Static33.aClass2_Sub3_Sub1_1.method269();
		}
		if (Static131.anInt2843 > local13) {
			return false;
		}
		Static33.aClass2_Sub3_Sub1_1.anInt340 = 0;
		Static175.aClass25_5.method804(Static33.aClass2_Sub3_Sub1_1.aByteArray2, 0, Static131.anInt2843);
		Static168.anInt3481 = Static197.anInt3927;
		Static197.anInt3927 = Static2.anInt56;
		Static17.anInt503 = 0;
		Static2.anInt56 = Static148.anInt3046;
		@Pc(125) int local125;
		@Pc(129) int local129;
		@Pc(137) Class5 local137;
		@Pc(133) int local133;
		if (Static148.anInt3046 == 143) {
			local125 = Static33.aClass2_Sub3_Sub1_1.method258();
			local129 = Static33.aClass2_Sub3_Sub1_1.method268();
			local133 = Static33.aClass2_Sub3_Sub1_1.method258();
			local137 = Static74.method1401(local129);
			local137.aByte1 = 0;
			local137.anInt154 = local137.anInt101 = local125;
			local137.anInt105 = local137.anInt121 = local133;
			local137.aByte4 = 0;
			Static121.method2085(local137);
			Static148.anInt3046 = -1;
			return true;
		} else if (Static148.anInt3046 == 209) {
			Static100.method1730(Static33.aClass2_Sub3_Sub1_1, Static23.aClass1_1, Static131.anInt2843);
			Static148.anInt3046 = -1;
			return true;
		} else {
			@Pc(209) int local209;
			@Pc(231) int local231;
			@Pc(235) int local235;
			@Pc(317) int local317;
			@Pc(321) int local321;
			@Pc(277) Class2_Sub13 local277;
			@Pc(323) int local323;
			@Pc(334) long local334;
			if (Static148.anInt3046 == 65) {
				local125 = Static33.aClass2_Sub3_Sub1_1.anInt340 + Static131.anInt2843;
				local129 = Static33.aClass2_Sub3_Sub1_1.method269();
				local133 = Static33.aClass2_Sub3_Sub1_1.method269();
				if (Static138.anInt2942 != local129) {
					Static138.anInt2942 = local129;
					Static143.method2296(Static138.anInt2942);
					Static153.method2526();
					Static211.method3200(Static138.anInt2942);
					for (local209 = 0; local209 < 100; local209++) {
						Static124.aBooleanArray16[local209] = true;
					}
				}
				while (local133-- > 0) {
					local209 = Static33.aClass2_Sub3_Sub1_1.method248();
					local231 = Static33.aClass2_Sub3_Sub1_1.method269();
					local235 = Static33.aClass2_Sub3_Sub1_1.method260();
					@Pc(242) Class2_Sub13 local242 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local209);
					if (local242 != null && local231 != local242.anInt1869) {
						Static95.method1619(true, local242);
						local242 = null;
					}
					if (local242 == null) {
						local242 = Static28.method594(local231, local235, local209);
					}
					local242.aBoolean99 = true;
				}
				for (local277 = (Class2_Sub13) Static33.aClass63_3.method2114(); local277 != null; local277 = (Class2_Sub13) Static33.aClass63_3.method2108()) {
					if (local277.aBoolean99) {
						local277.aBoolean99 = false;
					} else {
						Static95.method1619(true, local277);
					}
				}
				Static27.aClass63_4 = new Class63(512);
				while (Static33.aClass2_Sub3_Sub1_1.anInt340 < local125) {
					local231 = Static33.aClass2_Sub3_Sub1_1.method248();
					local235 = Static33.aClass2_Sub3_Sub1_1.method269();
					local317 = Static33.aClass2_Sub3_Sub1_1.method269();
					local321 = Static33.aClass2_Sub3_Sub1_1.method248();
					for (local323 = local235; local323 <= local317; local323++) {
						local334 = ((long) local231 << 32) + ((long) local323);
						Static27.aClass63_4.method2115(local334, new Class2_Sub10(local321));
					}
				}
				Static148.anInt3046 = -1;
				return true;
			} else if (Static148.anInt3046 == 21) {
				local125 = Static33.aClass2_Sub3_Sub1_1.method267();
				local129 = Static33.aClass2_Sub3_Sub1_1.method257();
				local209 = local125 >> 5 & 0x1F;
				local231 = local125 & 0x1F;
				local133 = local125 >> 10 & 0x1F;
				local235 = (local133 << 19) - (-(local209 << 11) - (local231 << 3));
				@Pc(405) Class5 local405 = Static74.method1401(local129);
				if (local235 != local405.anInt167) {
					local405.anInt167 = local235;
					Static121.method2085(local405);
				}
				Static148.anInt3046 = -1;
				return true;
			} else if (Static148.anInt3046 == 145) {
				Static121.anInt2747 = 0;
				Static148.anInt3046 = -1;
				return true;
			} else if (Static148.anInt3046 == 191) {
				local125 = Static33.aClass2_Sub3_Sub1_1.method257();
				Static128.aClass15_8 = Static23.aClass1_1.method10(local125);
				Static148.anInt3046 = -1;
				return true;
			} else if (Static148.anInt3046 == 78) {
				Static215.anInt4272 = Static33.aClass2_Sub3_Sub1_1.method260();
				Static38.anInt976 = Static29.anInt739;
				Static148.anInt3046 = -1;
				return true;
			} else if (Static148.anInt3046 == 67) {
				local125 = Static33.aClass2_Sub3_Sub1_1.method269();
				if (local125 == 65535) {
					local125 = -1;
				}
				local129 = Static33.aClass2_Sub3_Sub1_1.method260();
				local133 = Static33.aClass2_Sub3_Sub1_1.method269();
				Static105.method1825(local125, local129, local133);
				Static148.anInt3046 = -1;
				return true;
			} else {
				@Pc(531) int local531;
				@Pc(499) long local499;
				@Pc(507) long local507;
				@Pc(512) long local512;
				@Pc(517) long local517;
				@Pc(558) int local558;
				if (Static148.anInt3046 == 220) {
					local499 = Static33.aClass2_Sub3_Sub1_1.method243();
					Static33.aClass2_Sub3_Sub1_1.method221();
					local507 = Static33.aClass2_Sub3_Sub1_1.method243();
					local512 = Static33.aClass2_Sub3_Sub1_1.method269();
					local517 = Static33.aClass2_Sub3_Sub1_1.method261();
					local323 = Static33.aClass2_Sub3_Sub1_1.method260();
					local334 = (local512 << 32) + local517;
					@Pc(529) boolean local529 = false;
					for (local531 = 0; local531 < 100; local531++) {
						if (Static157.aLongArray5[local531] == local334) {
							local529 = true;
							break;
						}
					}
					if (local323 <= 1) {
						for (local558 = 0; local558 < Static85.anInt1875; local558++) {
							if (local499 == Static211.aLongArray8[local558]) {
								local529 = true;
								break;
							}
						}
					}
					if (!local529 && Static95.anInt2023 == 0) {
						Static157.aLongArray5[Static118.anInt2709] = local334;
						Static118.anInt2709 = (Static118.anInt2709 + 1) % 100;
						@Pc(606) Class83 local606 = Static136.method1098(Static157.method2393(Static33.aClass2_Sub3_Sub1_1).method2419());
						if (local323 == 2 || local323 == 3) {
							Static163.method2503(Static67.method1268(new Class83[] { Static153.aClass83_971, Static12.method296(local499).method2400() }), Static12.method296(local507).method2400(), local606);
						} else if (local323 == 1) {
							Static163.method2503(Static67.method1268(new Class83[] { Static107.aClass83_928, Static12.method296(local499).method2400() }), Static12.method296(local507).method2400(), local606);
						} else {
							Static163.method2503(Static12.method296(local499).method2400(), Static12.method296(local507).method2400(), local606);
						}
					}
					Static148.anInt3046 = -1;
					return true;
				} else if (Static148.anInt3046 == 16) {
					local125 = Static33.aClass2_Sub3_Sub1_1.method240();
					local129 = Static33.aClass2_Sub3_Sub1_1.method269();
					if (local125 == 1) {
						Static154.method2372();
						for (local133 = 0; local133 < 4; local133++) {
							Static117.aClass22Array1[local133].method738();
						}
						System.gc();
					} else if (local125 == 2) {
						Static114.method2021();
						System.gc();
						Static197.method2972(25);
					}
					Static138.anInt2942 = local129;
					Static143.method2296(local129);
					Static153.method2526();
					Static211.method3200(Static138.anInt2942);
					for (local133 = 0; local133 < 100; local133++) {
						Static124.aBooleanArray16[local133] = true;
					}
					Static148.anInt3046 = -1;
					return true;
				} else {
					@Pc(798) int local798;
					if (Static148.anInt3046 == 148) {
						local499 = Static33.aClass2_Sub3_Sub1_1.method243();
						Static33.aClass2_Sub3_Sub1_1.method221();
						local507 = Static33.aClass2_Sub3_Sub1_1.method243();
						local512 = Static33.aClass2_Sub3_Sub1_1.method269();
						local517 = Static33.aClass2_Sub3_Sub1_1.method261();
						local323 = Static33.aClass2_Sub3_Sub1_1.method260();
						local798 = Static33.aClass2_Sub3_Sub1_1.method269();
						@Pc(800) boolean local800 = false;
						@Pc(806) long local806 = local517 + (local512 << 32);
						for (local558 = 0; local558 < 100; local558++) {
							if (Static157.aLongArray5[local558] == local806) {
								local800 = true;
								break;
							}
						}
						if (local323 <= 1) {
							for (@Pc(835) int local835 = 0; local835 < Static85.anInt1875; local835++) {
								if (Static211.aLongArray8[local835] == local499) {
									local800 = true;
									break;
								}
							}
						}
						if (!local800 && Static95.anInt2023 == 0) {
							Static157.aLongArray5[Static118.anInt2709] = local806;
							Static118.anInt2709 = (Static118.anInt2709 + 1) % 100;
							@Pc(879) Class83 local879 = Static212.method3222(local798).method1989(Static33.aClass2_Sub3_Sub1_1);
							if (local323 == 2 || local323 == 3) {
								Static51.method1183(local879, 20, Static12.method296(local507).method2400(), Static67.method1268(new Class83[] { Static153.aClass83_971, Static12.method296(local499).method2400() }), local798);
							} else if (local323 == 1) {
								Static51.method1183(local879, 20, Static12.method296(local507).method2400(), Static67.method1268(new Class83[] { Static107.aClass83_928, Static12.method296(local499).method2400() }), local798);
							} else {
								Static51.method1183(local879, 20, Static12.method296(local507).method2400(), Static12.method296(local499).method2400(), local798);
							}
						}
						Static148.anInt3046 = -1;
						return true;
					}
					@Pc(974) boolean local974;
					@Pc(1069) Class83 local1069;
					if (Static148.anInt3046 == 214) {
						local499 = Static33.aClass2_Sub3_Sub1_1.method243();
						local974 = false;
						if ((Long.MIN_VALUE & local499) != 0L) {
							local974 = true;
						}
						local133 = Static33.aClass2_Sub3_Sub1_1.method269();
						@Pc(992) byte local992 = Static33.aClass2_Sub3_Sub1_1.method221();
						if (local974) {
							if (Static141.anInt2978 == 0) {
								Static148.anInt3046 = -1;
								return true;
							}
							local499 &= Long.MAX_VALUE;
							for (local235 = 0; local235 < Static141.anInt2978 && (Static135.aClass2_Sub27Array1[local235].aLong149 != local499 || local133 != Static135.aClass2_Sub27Array1[local235].anInt4274); local235++) {
							}
							if (local235 < Static141.anInt2978) {
								while (local235 < Static141.anInt2978 - 1) {
									Static135.aClass2_Sub27Array1[local235] = Static135.aClass2_Sub27Array1[local235 + 1];
									local235++;
								}
								Static141.anInt2978--;
								Static135.aClass2_Sub27Array1[Static141.anInt2978] = null;
							}
						} else {
							local1069 = Static33.aClass2_Sub3_Sub1_1.method259();
							@Pc(1073) Class2_Sub27 local1073 = new Class2_Sub27();
							local1073.aLong149 = local499;
							local1073.aClass83_1225 = Static12.method296(local1073.aLong149);
							local1073.aByte13 = local992;
							local1073.anInt4274 = local133;
							local1073.aClass83_1220 = local1069;
							for (local321 = Static141.anInt2978 - 1; local321 >= 0; local321--) {
								local323 = Static135.aClass2_Sub27Array1[local321].aClass83_1225.method2392(local1073.aClass83_1225);
								if (local323 == 0) {
									Static135.aClass2_Sub27Array1[local321].anInt4274 = local133;
									Static135.aClass2_Sub27Array1[local321].aByte13 = local992;
									Static135.aClass2_Sub27Array1[local321].aClass83_1220 = local1069;
									if (Static16.aLong78 == local499) {
										Static174.aByte9 = local992;
									}
									Static148.anInt3046 = -1;
									Static214.anInt4261 = Static29.anInt739;
									return true;
								}
								if (local323 < 0) {
									break;
								}
							}
							if (Static135.aClass2_Sub27Array1.length <= Static141.anInt2978) {
								Static148.anInt3046 = -1;
								return true;
							}
							for (local323 = Static141.anInt2978 - 1; local323 > local321; local323--) {
								Static135.aClass2_Sub27Array1[local323 + 1] = Static135.aClass2_Sub27Array1[local323];
							}
							if (Static141.anInt2978 == 0) {
								Static135.aClass2_Sub27Array1 = new Class2_Sub27[100];
							}
							Static135.aClass2_Sub27Array1[local321 + 1] = local1073;
							if (Static16.aLong78 == local499) {
								Static174.aByte9 = local992;
							}
							Static141.anInt2978++;
						}
						Static214.anInt4261 = Static29.anInt739;
						Static148.anInt3046 = -1;
						return true;
					} else if (Static148.anInt3046 == 243) {
						Static113.method1993();
						Static114.anInt2624 = Static33.aClass2_Sub3_Sub1_1.method260();
						Static199.anInt3947 = Static29.anInt739;
						Static148.anInt3046 = -1;
						return true;
					} else {
						@Pc(1254) Class5 local1254;
						if (Static148.anInt3046 == 107) {
							local125 = Static33.aClass2_Sub3_Sub1_1.method254();
							local129 = Static33.aClass2_Sub3_Sub1_1.method267();
							local133 = Static33.aClass2_Sub3_Sub1_1.method267();
							local209 = Static33.aClass2_Sub3_Sub1_1.method257();
							local1254 = Static74.method1401(local209);
							if (local129 != local1254.anInt152 || local125 != local1254.anInt171 || local133 != local1254.anInt142) {
								local1254.anInt142 = local133;
								local1254.anInt152 = local129;
								local1254.anInt171 = local125;
								Static121.method2085(local1254);
							}
							Static148.anInt3046 = -1;
							return true;
						} else if (Static148.anInt3046 == 170) {
							for (local125 = 0; local125 < Static14.anIntArray235.length; local125++) {
								if (Static108.anIntArray242[local125] != Static14.anIntArray235[local125]) {
									Static14.anIntArray235[local125] = Static108.anIntArray242[local125];
									Static34.method719(local125);
									Static101.anIntArray227[Static43.anInt1135++ & 0x1F] = local125;
								}
							}
							Static148.anInt3046 = -1;
							return true;
						} else if (Static148.anInt3046 == 45) {
							Static97.aBoolean106 = false;
							for (local125 = 0; local125 < 5; local125++) {
								Static216.aBooleanArray30[local125] = false;
							}
							Static148.anInt3046 = -1;
							return true;
						} else {
							@Pc(1375) Class5 local1375;
							if (Static148.anInt3046 == 238) {
								local125 = Static33.aClass2_Sub3_Sub1_1.method257();
								local129 = Static33.aClass2_Sub3_Sub1_1.method254();
								if (local129 == 65535) {
									local129 = -1;
								}
								local1375 = Static74.method1401(local125);
								if (local1375.anInt178 != 2 || local129 != local1375.anInt144) {
									local1375.anInt178 = 2;
									local1375.anInt144 = local129;
									Static121.method2085(local1375);
								}
								Static148.anInt3046 = -1;
								return true;
							}
							@Pc(1411) Class83 local1411;
							if (Static148.anInt3046 == 210) {
								local1411 = Static33.aClass2_Sub3_Sub1_1.method259();
								@Pc(1418) Object[] local1418 = new Object[local1411.method2428() + 1];
								for (local133 = local1411.method2428() - 1; local133 >= 0; local133--) {
									if (local1411.method2421(local133) == 115) {
										local1418[local133 + 1] = Static33.aClass2_Sub3_Sub1_1.method259();
									} else {
										local1418[local133 + 1] = Integer.valueOf(Static33.aClass2_Sub3_Sub1_1.method248());
									}
								}
								local1418[0] = Integer.valueOf(Static33.aClass2_Sub3_Sub1_1.method248());
								@Pc(1474) Class2_Sub4 local1474 = new Class2_Sub4();
								local1474.anObjectArray27 = local1418;
								Static89.method3267(local1474);
								Static148.anInt3046 = -1;
								return true;
							} else if (Static148.anInt3046 == 163) {
								local125 = Static33.aClass2_Sub3_Sub1_1.method260();
								if (Static33.aClass2_Sub3_Sub1_1.method260() == 0) {
									Static72.aClass59Array2[local125] = new Class59();
								} else {
									Static33.aClass2_Sub3_Sub1_1.anInt340--;
									Static72.aClass59Array2[local125] = new Class59(Static33.aClass2_Sub3_Sub1_1);
								}
								Static128.anInt2815 = Static29.anInt739;
								Static148.anInt3046 = -1;
								return true;
							} else if (Static148.anInt3046 == 134) {
								Static152.method2357(Static33.aClass2_Sub3_Sub1_1);
								Static148.anInt3046 = -1;
								return true;
							} else if (Static148.anInt3046 == 174) {
								local125 = Static33.aClass2_Sub3_Sub1_1.method267();
								Static11.method293(local125);
								Static123.anIntArray275[Static194.anInt3844++ & 0x1F] = local125 & 0x7FFF;
								Static148.anInt3046 = -1;
								return true;
							} else if (Static148.anInt3046 == 88) {
								local125 = Static33.aClass2_Sub3_Sub1_1.method248();
								local129 = Static33.aClass2_Sub3_Sub1_1.method269();
								if (local125 < -70000) {
									local129 += 32768;
								}
								if (local125 >= 0) {
									local1375 = Static74.method1401(local125);
								} else {
									local1375 = null;
								}
								if (local1375 != null) {
									for (local209 = 0; local209 < local1375.anIntArray9.length; local209++) {
										local1375.anIntArray9[local209] = 0;
										local1375.anIntArray5[local209] = 0;
									}
								}
								Static199.method3014(local129);
								local209 = Static33.aClass2_Sub3_Sub1_1.method269();
								for (local231 = 0; local231 < local209; local231++) {
									local235 = Static33.aClass2_Sub3_Sub1_1.method262();
									local317 = Static33.aClass2_Sub3_Sub1_1.method219();
									if (local317 == 255) {
										local317 = Static33.aClass2_Sub3_Sub1_1.method257();
									}
									if (local1375 != null && local1375.anIntArray9.length > local231) {
										local1375.anIntArray9[local231] = local235;
										local1375.anIntArray5[local231] = local317;
									}
									Static79.method1447(local235 - 1, local231, local317, local129);
								}
								if (local1375 != null) {
									Static121.method2085(local1375);
								}
								Static113.method1993();
								Static123.anIntArray275[Static194.anInt3844++ & 0x1F] = local129 & 0x7FFF;
								Static148.anInt3046 = -1;
								return true;
							} else if (Static148.anInt3046 == 255) {
								local125 = Static33.aClass2_Sub3_Sub1_1.method269();
								if (local125 == 65535) {
									local125 = -1;
								}
								local129 = Static33.aClass2_Sub3_Sub1_1.method248();
								local133 = Static33.aClass2_Sub3_Sub1_1.method268();
								local209 = Static33.aClass2_Sub3_Sub1_1.method254();
								if (local209 == 65535) {
									local209 = -1;
								}
								for (local231 = local125; local231 <= local209; local231++) {
									@Pc(1743) long local1743 = (long) local231 + ((long) local129 << 32);
									@Pc(1748) Class2 local1748 = Static27.aClass63_4.method2110(local1743);
									if (local1748 != null) {
										local1748.method3254();
									}
									Static27.aClass63_4.method2115(local1743, new Class2_Sub10(local133));
								}
								Static148.anInt3046 = -1;
								return true;
							} else if (Static148.anInt3046 == 254) {
								local125 = Static33.aClass2_Sub3_Sub1_1.method244();
								local129 = Static33.aClass2_Sub3_Sub1_1.method267();
								if (local129 == 65535) {
									local129 = -1;
								}
								local133 = Static33.aClass2_Sub3_Sub1_1.method268();
								local137 = Static74.method1401(local133);
								@Pc(1806) Class2_Sub2_Sub3 local1806;
								if (local137.aBoolean7) {
									local137.anInt158 = local129;
									local137.anInt165 = local125;
									local1806 = Static113.method1987(local129);
									local137.anInt146 = local1806.anInt431;
									local137.anInt171 = local1806.anInt460;
									local137.anInt179 = local1806.anInt433;
									local137.anInt148 = local1806.anInt434;
									local137.anInt142 = local1806.anInt421;
									if (local137.anInt177 > 0) {
										local137.anInt142 = local137.anInt142 * 32 / local137.anInt177;
									} else if (local137.anInt111 > 0) {
										local137.anInt142 = local137.anInt142 * 32 / local137.anInt111;
									}
									local137.anInt152 = local1806.anInt445;
									Static121.method2085(local137);
								} else if (local129 == -1) {
									local137.anInt178 = 0;
									Static148.anInt3046 = -1;
									return true;
								} else {
									local1806 = Static113.method1987(local129);
									local137.anInt178 = 4;
									local137.anInt144 = local129;
									local137.anInt152 = local1806.anInt445;
									local137.anInt171 = local1806.anInt460;
									local137.anInt142 = local1806.anInt421 * 100 / local125;
									Static121.method2085(local137);
								}
								Static148.anInt3046 = -1;
								return true;
							} else if (Static148.anInt3046 == 146) {
								Static113.method1993();
								local125 = Static33.aClass2_Sub3_Sub1_1.method220();
								local129 = Static33.aClass2_Sub3_Sub1_1.method268();
								local133 = Static33.aClass2_Sub3_Sub1_1.method220();
								Static118.anIntArray268[local125] = local129;
								Static60.anIntArray208[local125] = local133;
								anIntArray404[local125] = 1;
								for (local209 = 0; local209 < 98; local209++) {
									if (local129 >= Class2_Sub19.anIntArray265[local209]) {
										anIntArray404[local125] = local209 + 2;
									}
								}
								Static96.anIntArray204[Static208.anInt4117++ & 0x1F] = local125;
								Static148.anInt3046 = -1;
								return true;
							} else {
								@Pc(2128) boolean local2128;
								@Pc(2167) int local2167;
								@Pc(2185) Class83 local2185;
								@Pc(2203) Class83 local2203;
								if (Static148.anInt3046 == 232) {
									local499 = Static33.aClass2_Sub3_Sub1_1.method243();
									local133 = Static33.aClass2_Sub3_Sub1_1.method269();
									local209 = Static33.aClass2_Sub3_Sub1_1.method260();
									@Pc(1993) Class83 local1993 = Static182.aClass83_1067;
									if (local133 > 0) {
										local1993 = Static33.aClass2_Sub3_Sub1_1.method259();
									}
									local1069 = Static12.method296(local499).method2400();
									for (local317 = 0; local317 < Static177.anInt3618; local317++) {
										if (local499 == Static139.aLongArray3[local317]) {
											if (Static10.anIntArray19[local317] != local133) {
												Static10.anIntArray19[local317] = local133;
												if (local133 > 0) {
													Static165.method2554(5, Static67.method1268(new Class83[] { local1069, Static216.aClass83_1232 }), Static182.aClass83_1067);
												}
												if (local133 == 0) {
													Static165.method2554(5, Static67.method1268(new Class83[] { local1069, Static69.aClass83_516 }), Static182.aClass83_1067);
												}
											}
											local1069 = null;
											Static211.aClass83Array58[local317] = local1993;
											Static121.anIntArray274[local317] = local209;
											break;
										}
									}
									if (local1069 != null && Static177.anInt3618 < 200) {
										Static139.aLongArray3[Static177.anInt3618] = local499;
										Static133.aClass83Array49[Static177.anInt3618] = local1069;
										Static10.anIntArray19[Static177.anInt3618] = local133;
										Static211.aClass83Array58[Static177.anInt3618] = local1993;
										Static121.anIntArray274[Static177.anInt3618] = local209;
										Static177.anInt3618++;
									}
									Static38.anInt976 = Static29.anInt739;
									local323 = Static177.anInt3618;
									while (local323 > 0) {
										local323--;
										local2128 = true;
										for (local798 = 0; local798 < local323; local798++) {
											if (Static10.anIntArray19[local798] != Static118.anInt2710 && Static10.anIntArray19[local798 + 1] == Static118.anInt2710 || Static10.anIntArray19[local798] == 0 && Static10.anIntArray19[local798 + 1] != 0) {
												local2128 = false;
												local2167 = Static10.anIntArray19[local798];
												Static10.anIntArray19[local798] = Static10.anIntArray19[local798 + 1];
												Static10.anIntArray19[local798 + 1] = local2167;
												local2185 = Static211.aClass83Array58[local798];
												Static211.aClass83Array58[local798] = Static211.aClass83Array58[local798 + 1];
												Static211.aClass83Array58[local798 + 1] = local2185;
												local2203 = Static133.aClass83Array49[local798];
												Static133.aClass83Array49[local798] = Static133.aClass83Array49[local798 + 1];
												Static133.aClass83Array49[local798 + 1] = local2203;
												@Pc(2221) long local2221 = Static139.aLongArray3[local798];
												Static139.aLongArray3[local798] = Static139.aLongArray3[local798 + 1];
												Static139.aLongArray3[local798 + 1] = local2221;
												@Pc(2239) int local2239 = Static121.anIntArray274[local798];
												Static121.anIntArray274[local798] = Static121.anIntArray274[local798 + 1];
												Static121.anIntArray274[local798 + 1] = local2239;
											}
										}
										if (local2128) {
											break;
										}
									}
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 165) {
									local125 = Static33.aClass2_Sub3_Sub1_1.method267();
									if (local125 == 65535) {
										local125 = -1;
									}
									Static163.method2507(local125);
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 204) {
									local125 = Static33.aClass2_Sub3_Sub1_1.method269();
									if (local125 == 65535) {
										local125 = -1;
									}
									local129 = Static33.aClass2_Sub3_Sub1_1.method264();
									Static37.method755(local125, local129);
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 18) {
									local125 = Static33.aClass2_Sub3_Sub1_1.method254();
									if (local125 == 65535) {
										local125 = -1;
									}
									local129 = Static33.aClass2_Sub3_Sub1_1.method268();
									local1375 = Static74.method1401(local129);
									if (local1375.anInt178 != 1 || local1375.anInt144 != local125) {
										local1375.anInt178 = 1;
										local1375.anInt144 = local125;
										Static121.method2085(local1375);
									}
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 52) {
									if (Static138.anInt2942 != -1) {
										Static169.method2640(Static138.anInt2942, 0);
									}
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 38) {
									Static97.aBoolean106 = true;
									Static19.anInt544 = Static33.aClass2_Sub3_Sub1_1.method260();
									Static109.anInt2540 = Static33.aClass2_Sub3_Sub1_1.method260();
									Static75.anInt1758 = Static33.aClass2_Sub3_Sub1_1.method269();
									Static55.anInt1366 = Static33.aClass2_Sub3_Sub1_1.method260();
									Static51.anInt1522 = Static33.aClass2_Sub3_Sub1_1.method260();
									if (Static51.anInt1522 >= 100) {
										Static21.anInt567 = Static19.anInt544 * 128 + 64;
										Static174.anInt3596 = Static109.anInt2540 * 128 + 64;
										Static199.anInt3952 = Static177.method2711(Static21.anInt567, Static43.anInt1126, Static174.anInt3596) - Static75.anInt1758;
									}
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 46) {
									Static107.method2367();
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 14) {
									local1411 = Static33.aClass2_Sub3_Sub1_1.method259();
									local129 = Static33.aClass2_Sub3_Sub1_1.method268();
									local1375 = Static74.method1401(local129);
									if (!local1411.method2402(local1375.aClass83_29)) {
										local1375.aClass83_29 = local1411;
										Static121.method2085(local1375);
									}
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 103) {
									local125 = Static33.aClass2_Sub3_Sub1_1.method260();
									@Pc(2489) Class76 local2489 = new Class76();
									local2489.anInt3018 = local125 & 0x3F;
									local129 = local125 >> 6;
									local2489.anInt3013 = Static33.aClass2_Sub3_Sub1_1.method260();
									if (local2489.anInt3013 >= 0 && Static170.aClass2_Sub2_Sub17Array9.length > local2489.anInt3013) {
										if (local2489.anInt3018 == 1 || local2489.anInt3018 == 10) {
											local2489.anInt3019 = Static33.aClass2_Sub3_Sub1_1.method269();
											Static33.aClass2_Sub3_Sub1_1.anInt340 += 3;
										} else if (local2489.anInt3018 >= 2 && local2489.anInt3018 <= 6) {
											if (local2489.anInt3018 == 2) {
												local2489.anInt3020 = 64;
												local2489.anInt3016 = 64;
											}
											if (local2489.anInt3018 == 3) {
												local2489.anInt3016 = 64;
												local2489.anInt3020 = 0;
											}
											if (local2489.anInt3018 == 4) {
												local2489.anInt3020 = 128;
												local2489.anInt3016 = 64;
											}
											if (local2489.anInt3018 == 5) {
												local2489.anInt3020 = 64;
												local2489.anInt3016 = 0;
											}
											if (local2489.anInt3018 == 6) {
												local2489.anInt3020 = 64;
												local2489.anInt3016 = 128;
											}
											local2489.anInt3018 = 2;
											local2489.anInt3017 = Static33.aClass2_Sub3_Sub1_1.method269();
											local2489.anInt3015 = Static33.aClass2_Sub3_Sub1_1.method269();
											local2489.anInt3011 = Static33.aClass2_Sub3_Sub1_1.method260();
										}
										local2489.anInt3012 = Static33.aClass2_Sub3_Sub1_1.method269();
										if (local2489.anInt3012 == 65535) {
											local2489.anInt3012 = -1;
										}
										Static163.aClass76Array1[local129] = local2489;
									}
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 116) {
									Static83.anInt1852 = Static33.aClass2_Sub3_Sub1_1.method220();
									Static124.anInt2520 = Static33.aClass2_Sub3_Sub1_1.method220();
									for (local125 = Static83.anInt1852; local125 < Static83.anInt1852 + 8; local125++) {
										for (local129 = Static124.anInt2520; local129 < Static124.anInt2520 + 8; local129++) {
											if (Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local125][local129] != null) {
												Static93.aClass19ArrayArrayArray1[Static43.anInt1126][local125][local129] = null;
												Static51.method1187(local129, local125);
											}
										}
									}
									for (@Pc(2699) Class2_Sub15 local2699 = (Class2_Sub15) Static51.aClass19_4.method691(); local2699 != null; local2699 = (Class2_Sub15) Static51.aClass19_4.method686()) {
										if (Static83.anInt1852 <= local2699.anInt2084 && Static83.anInt1852 + 8 > local2699.anInt2084 && Static124.anInt2520 <= local2699.anInt2082 && Static124.anInt2520 + 8 > local2699.anInt2082 && Static43.anInt1126 == local2699.anInt2080) {
											local2699.anInt2079 = 0;
										}
									}
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 226) {
									local125 = Static33.aClass2_Sub3_Sub1_1.method248();
									local129 = Static33.aClass2_Sub3_Sub1_1.method248();
									@Pc(2761) Class2_Sub13 local2761 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local125);
									local277 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local129);
									if (local277 != null) {
										Static95.method1619(local2761 == null || local277.anInt1869 != local2761.anInt1869, local277);
									}
									if (local2761 != null) {
										local2761.method3254();
										Static33.aClass63_3.method2115((long) local129, local2761);
									}
									local1254 = Static74.method1401(local125);
									if (local1254 != null) {
										Static121.method2085(local1254);
									}
									local1254 = Static74.method1401(local129);
									if (local1254 != null) {
										Static121.method2085(local1254);
									}
									if (Static138.anInt2942 != -1) {
										Static169.method2640(Static138.anInt2942, 1);
									}
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 121) {
									Static113.method1993();
									Static33.anInt872 = Static33.aClass2_Sub3_Sub1_1.method242();
									Static148.anInt3046 = -1;
									Static199.anInt3947 = Static29.anInt739;
									return true;
								} else if (Static148.anInt3046 == 75) {
									Static193.method2906();
									Static148.anInt3046 = -1;
									return false;
								} else if (Static148.anInt3046 == 195) {
									local125 = Static33.aClass2_Sub3_Sub1_1.method262();
									local129 = Static33.aClass2_Sub3_Sub1_1.method268();
									Static108.anIntArray242[local125] = local129;
									if (local129 != Static14.anIntArray235[local125]) {
										Static14.anIntArray235[local125] = local129;
										Static34.method719(local125);
									}
									Static101.anIntArray227[Static43.anInt1135++ & 0x1F] = local125;
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 229) {
									Static170.anInt3526 = Static33.aClass2_Sub3_Sub1_1.method260();
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 84) {
									local125 = Static33.aClass2_Sub3_Sub1_1.method260();
									local129 = Static33.aClass2_Sub3_Sub1_1.method260();
									local133 = Static33.aClass2_Sub3_Sub1_1.method260();
									local209 = Static33.aClass2_Sub3_Sub1_1.method260();
									local231 = Static33.aClass2_Sub3_Sub1_1.method269();
									Static216.aBooleanArray30[local125] = true;
									Static127.anIntArray280[local125] = local129;
									Static11.anIntArray21[local125] = local133;
									Static82.anIntArray175[local125] = local209;
									Static62.anIntArray124[local125] = local231;
									Static148.anInt3046 = -1;
									return true;
								} else if (Static148.anInt3046 == 133) {
									@Pc(2960) byte[] local2960 = new byte[Static131.anInt2843];
									Static33.aClass2_Sub3_Sub1_1.method280(local2960, Static131.anInt2843);
									Static150.method2340(Static16.method1831(Static131.anInt2843, local2960, 0));
									Static148.anInt3046 = -1;
									return true;
								} else {
									@Pc(2993) Class83 local2993;
									if (Static148.anInt3046 == 17) {
										local499 = Static33.aClass2_Sub3_Sub1_1.method243();
										local2993 = Static136.method1098(Static157.method2393(Static33.aClass2_Sub3_Sub1_1).method2419());
										Static165.method2554(6, local2993, Static12.method296(local499).method2400());
										Static148.anInt3046 = -1;
										return true;
									} else if (Static148.anInt3046 == 168) {
										local125 = Static33.aClass2_Sub3_Sub1_1.method248();
										@Pc(3022) Class2_Sub13 local3022 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local125);
										if (local3022 != null) {
											Static95.method1619(true, local3022);
										}
										if (Static104.aClass5_11 != null) {
											Static121.method2085(Static104.aClass5_11);
											Static104.aClass5_11 = null;
										}
										Static148.anInt3046 = -1;
										return true;
									} else if (Static148.anInt3046 == 37) {
										local125 = Static33.aClass2_Sub3_Sub1_1.method220();
										local129 = Static33.aClass2_Sub3_Sub1_1.method220();
										local2993 = Static33.aClass2_Sub3_Sub1_1.method259();
										if (local129 >= 1 && local129 <= 8) {
											if (local2993.method2398(Static21.aClass83_129)) {
												local2993 = null;
											}
											Static146.aClass83Array51[local129 - 1] = local2993;
											Static154.aBooleanArray19[local129 - 1] = local125 == 0;
										}
										Static148.anInt3046 = -1;
										return true;
									} else if (Static148.anInt3046 == 194) {
										for (local125 = 0; local125 < Static22.aClass24_Sub4_Sub1Array1.length; local125++) {
											if (Static22.aClass24_Sub4_Sub1Array1[local125] != null) {
												Static22.aClass24_Sub4_Sub1Array1[local125].anInt3336 = -1;
											}
										}
										for (local129 = 0; local129 < Static47.aClass24_Sub4_Sub2Array1.length; local129++) {
											if (Static47.aClass24_Sub4_Sub2Array1[local129] != null) {
												Static47.aClass24_Sub4_Sub2Array1[local129].anInt3336 = -1;
											}
										}
										Static148.anInt3046 = -1;
										return true;
									} else if (Static148.anInt3046 == 96) {
										local1411 = Static33.aClass2_Sub3_Sub1_1.method259();
										@Pc(3160) Class83 local3160;
										if (local1411.method2396(Static75.aClass83_541)) {
											local3160 = local1411.method2416(local1411.method2388(Static148.aClass83_895), 0);
											local507 = local3160.method2397();
											local974 = false;
											for (local235 = 0; local235 < Static85.anInt1875; local235++) {
												if (Static211.aLongArray8[local235] == local507) {
													local974 = true;
													break;
												}
											}
											if (!local974 && Static95.anInt2023 == 0) {
												Static165.method2554(4, Static131.aClass83_841, local3160);
											}
										} else if (local1411.method2396(Static30.aClass83_225)) {
											local3160 = local1411.method2416(local1411.method2388(Static148.aClass83_895), 0);
											local974 = false;
											local507 = local3160.method2397();
											for (local235 = 0; local235 < Static85.anInt1875; local235++) {
												if (local507 == Static211.aLongArray8[local235]) {
													local974 = true;
													break;
												}
											}
											if (!local974 && Static95.anInt2023 == 0) {
												@Pc(3203) Class83 local3203 = local1411.method2416(local1411.method2428() - 9, local1411.method2388(Static148.aClass83_895) + 1);
												Static165.method2554(8, local3203, local3160);
											}
										} else if (local1411.method2396(Static119.aClass83_807)) {
											local3160 = local1411.method2416(local1411.method2388(Static148.aClass83_895), 0);
											local974 = false;
											local507 = local3160.method2397();
											for (local235 = 0; local235 < Static85.anInt1875; local235++) {
												if (local507 == Static211.aLongArray8[local235]) {
													local974 = true;
													break;
												}
											}
											if (!local974 && Static95.anInt2023 == 0) {
												Static165.method2554(10, Static182.aClass83_1067, local3160);
											}
										} else if (local1411.method2396(Static123.aClass83_820)) {
											local3160 = local1411.method2416(local1411.method2388(Static123.aClass83_820), 0);
											Static165.method2554(11, local3160, Static182.aClass83_1067);
										} else if (local1411.method2396(Static33.aClass83_278)) {
											local3160 = local1411.method2416(local1411.method2388(Static33.aClass83_278), 0);
											if (Static95.anInt2023 == 0) {
												Static165.method2554(12, local3160, Static182.aClass83_1067);
											}
										} else if (local1411.method2396(Static73.aClass83_533)) {
											local3160 = local1411.method2416(local1411.method2388(Static73.aClass83_533), 0);
											if (Static95.anInt2023 == 0) {
												Static165.method2554(13, local3160, Static182.aClass83_1067);
											}
										} else if (local1411.method2396(Static171.aClass83_1015)) {
											local3160 = local1411.method2416(local1411.method2388(Static148.aClass83_895), 0);
											local507 = local3160.method2397();
											local974 = false;
											for (local235 = 0; local235 < Static85.anInt1875; local235++) {
												if (Static211.aLongArray8[local235] == local507) {
													local974 = true;
													break;
												}
											}
											if (!local974 && Static95.anInt2023 == 0) {
												Static165.method2554(14, Static182.aClass83_1067, local3160);
											}
										} else if (local1411.method2396(Static8.aClass83_45)) {
											local3160 = local1411.method2416(local1411.method2388(Static148.aClass83_895), 0);
											local507 = local3160.method2397();
											local974 = false;
											for (local235 = 0; local235 < Static85.anInt1875; local235++) {
												if (Static211.aLongArray8[local235] == local507) {
													local974 = true;
													break;
												}
											}
											if (!local974 && Static95.anInt2023 == 0) {
												Static165.method2554(15, Static182.aClass83_1067, local3160);
											}
										} else if (local1411.method2396(Static22.aClass83_137)) {
											local3160 = local1411.method2416(local1411.method2388(Static148.aClass83_895), 0);
											local507 = local3160.method2397();
											local974 = false;
											for (local235 = 0; local235 < Static85.anInt1875; local235++) {
												if (local507 == Static211.aLongArray8[local235]) {
													local974 = true;
													break;
												}
											}
											if (!local974 && Static95.anInt2023 == 0) {
												Static165.method2554(16, Static182.aClass83_1067, local3160);
											}
										} else {
											Static165.method2554(0, local1411, Static182.aClass83_1067);
										}
										Static148.anInt3046 = -1;
										return true;
									} else if (Static148.anInt3046 == 164) {
										for (local125 = 0; local125 < Static182.anInt3710; local125++) {
											@Pc(3575) Class2_Sub2_Sub1 local3575 = Static216.method3272(local125);
											if (local3575 != null && local3575.anInt87 == 0) {
												Static108.anIntArray242[local125] = 0;
												Static14.anIntArray235[local125] = 0;
											}
										}
										Static113.method1993();
										Static43.anInt1135 += 32;
										Static148.anInt3046 = -1;
										return true;
									} else {
										@Pc(3663) int local3663;
										if (Static148.anInt3046 == 221) {
											local499 = Static33.aClass2_Sub3_Sub1_1.method243();
											local507 = Static33.aClass2_Sub3_Sub1_1.method269();
											local512 = Static33.aClass2_Sub3_Sub1_1.method261();
											local317 = Static33.aClass2_Sub3_Sub1_1.method260();
											@Pc(3631) boolean local3631 = false;
											@Pc(3638) long local3638 = (local507 << 32) + local512;
											for (local2167 = 0; local2167 < 100; local2167++) {
												if (Static157.aLongArray5[local2167] == local3638) {
													local3631 = true;
													break;
												}
											}
											if (local317 <= 1) {
												for (local3663 = 0; local3663 < Static85.anInt1875; local3663++) {
													if (local499 == Static211.aLongArray8[local3663]) {
														local3631 = true;
														break;
													}
												}
											}
											if (!local3631 && Static95.anInt2023 == 0) {
												Static157.aLongArray5[Static118.anInt2709] = local3638;
												Static118.anInt2709 = (Static118.anInt2709 + 1) % 100;
												local2185 = Static136.method1098(Static157.method2393(Static33.aClass2_Sub3_Sub1_1).method2419());
												if (local317 == 2 || local317 == 3) {
													Static165.method2554(7, local2185, Static67.method1268(new Class83[] { Static153.aClass83_971, Static12.method296(local499).method2400() }));
												} else if (local317 == 1) {
													Static165.method2554(7, local2185, Static67.method1268(new Class83[] { Static107.aClass83_928, Static12.method296(local499).method2400() }));
												} else {
													Static165.method2554(3, local2185, Static12.method296(local499).method2400());
												}
											}
											Static148.anInt3046 = -1;
											return true;
										} else if (Static148.anInt3046 == 110) {
											local125 = Static33.aClass2_Sub3_Sub1_1.method267();
											local129 = Static33.aClass2_Sub3_Sub1_1.method262();
											local133 = Static33.aClass2_Sub3_Sub1_1.method257();
											local137 = Static74.method1401(local133);
											local137.anInt103 = (local129 << 16) + local125;
											Static148.anInt3046 = -1;
											return true;
										} else if (Static148.anInt3046 == 6) {
											Static130.anInt2830 = Static33.aClass2_Sub3_Sub1_1.method269() * 30;
											Static148.anInt3046 = -1;
											Static199.anInt3947 = Static29.anInt739;
											return true;
										} else if (Static148.anInt3046 == 11) {
											Static83.anInt1852 = Static33.aClass2_Sub3_Sub1_1.method240();
											Static124.anInt2520 = Static33.aClass2_Sub3_Sub1_1.method260();
											while (Static33.aClass2_Sub3_Sub1_1.anInt340 < Static131.anInt2843) {
												Static148.anInt3046 = Static33.aClass2_Sub3_Sub1_1.method260();
												Static209.method3167();
											}
											Static148.anInt3046 = -1;
											return true;
										} else if (Static148.anInt3046 == 104) {
											local125 = Static33.aClass2_Sub3_Sub1_1.method269();
											local129 = Static33.aClass2_Sub3_Sub1_1.method260();
											local133 = Static33.aClass2_Sub3_Sub1_1.method268();
											local277 = (Class2_Sub13) Static33.aClass63_3.method2110((long) local133);
											if (local277 != null) {
												Static95.method1619(local277.anInt1869 != local125, local277);
											}
											Static28.method594(local125, local129, local133);
											Static148.anInt3046 = -1;
											return true;
										} else if (Static148.anInt3046 == 86) {
											Static63.aClass83_988 = Static33.aClass2_Sub3_Sub1_1.method259();
											Static57.method1116(Static63.aClass83_988);
											Static148.anInt3046 = -1;
											return true;
										} else if (Static148.anInt3046 == 219) {
											local499 = Static33.aClass2_Sub3_Sub1_1.method243();
											local133 = Static33.aClass2_Sub3_Sub1_1.method269();
											@Pc(3938) Class83 local3938 = Static212.method3222(local133).method1989(Static33.aClass2_Sub3_Sub1_1);
											Static51.method1183(local3938, 19, null, Static12.method296(local499).method2400(), local133);
											Static148.anInt3046 = -1;
											return true;
										} else if (Static148.anInt3046 == 180) {
											Static214.anInt4261 = Static29.anInt739;
											local499 = Static33.aClass2_Sub3_Sub1_1.method243();
											if (local499 == 0L) {
												Static102.aClass83_679 = null;
												Static135.aClass2_Sub27Array1 = null;
												Static141.anInt2978 = 0;
												Static40.aClass83_338 = null;
												Static148.anInt3046 = -1;
												return true;
											}
											local507 = Static33.aClass2_Sub3_Sub1_1.method243();
											Static102.aClass83_679 = Static12.method296(local507);
											Static40.aClass83_338 = Static12.method296(local499);
											Static175.aByte10 = Static33.aClass2_Sub3_Sub1_1.method221();
											local231 = Static33.aClass2_Sub3_Sub1_1.method260();
											if (local231 == 255) {
												Static148.anInt3046 = -1;
												return true;
											}
											@Pc(4012) Class2_Sub27[] local4012 = new Class2_Sub27[100];
											Static141.anInt2978 = local231;
											for (local317 = 0; local317 < Static141.anInt2978; local317++) {
												local4012[local317] = new Class2_Sub27();
												local4012[local317].aLong149 = Static33.aClass2_Sub3_Sub1_1.method243();
												local4012[local317].aClass83_1225 = Static12.method296(local4012[local317].aLong149);
												local4012[local317].anInt4274 = Static33.aClass2_Sub3_Sub1_1.method269();
												local4012[local317].aByte13 = Static33.aClass2_Sub3_Sub1_1.method221();
												local4012[local317].aClass83_1220 = Static33.aClass2_Sub3_Sub1_1.method259();
												if (local4012[local317].aLong149 == Static16.aLong78) {
													Static174.aByte9 = local4012[local317].aByte13;
												}
											}
											local798 = Static141.anInt2978;
											while (local798 > 0) {
												local798--;
												local2128 = true;
												for (local2167 = 0; local2167 < local798; local2167++) {
													if (local4012[local2167].aClass83_1225.method2392(local4012[local2167 + 1].aClass83_1225) > 0) {
														@Pc(4112) Class2_Sub27 local4112 = local4012[local2167];
														local2128 = false;
														local4012[local2167] = local4012[local2167 + 1];
														local4012[local2167 + 1] = local4112;
													}
												}
												if (local2128) {
													break;
												}
											}
											Static135.aClass2_Sub27Array1 = local4012;
											Static148.anInt3046 = -1;
											return true;
										} else if (Static148.anInt3046 == 51) {
											local125 = Static33.aClass2_Sub3_Sub1_1.method244();
											@Pc(4169) boolean local4169 = Static33.aClass2_Sub3_Sub1_1.method219() == 1;
											local1375 = Static74.method1401(local125);
											if (local1375.aBoolean19 != local4169) {
												local1375.aBoolean19 = local4169;
												Static121.method2085(local1375);
											}
											Static148.anInt3046 = -1;
											return true;
										} else {
											@Pc(4206) Class5 local4206;
											if (Static148.anInt3046 == 60) {
												local125 = Static33.aClass2_Sub3_Sub1_1.method248();
												local4206 = Static74.method1401(local125);
												for (local133 = 0; local133 < local4206.anIntArray9.length; local133++) {
													local4206.anIntArray9[local133] = -1;
													local4206.anIntArray9[local133] = 0;
												}
												Static121.method2085(local4206);
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 97) {
												local125 = Static33.aClass2_Sub3_Sub1_1.method267();
												@Pc(4246) byte local4246 = Static33.aClass2_Sub3_Sub1_1.method251();
												Static108.anIntArray242[local125] = local4246;
												if (Static14.anIntArray235[local125] != local4246) {
													Static14.anIntArray235[local125] = local4246;
													Static34.method719(local125);
												}
												Static101.anIntArray227[Static43.anInt1135++ & 0x1F] = local125;
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 56) {
												local125 = Static33.aClass2_Sub3_Sub1_1.method240();
												local129 = Static33.aClass2_Sub3_Sub1_1.method220();
												local133 = Static33.aClass2_Sub3_Sub1_1.method260();
												Static43.anInt1126 = local129 >> 1;
												Static54.aClass24_Sub4_Sub1_1.method2524(local133, (local129 & 0x1) == 1, local125);
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 22) {
												if (Static131.anInt2843 == 0) {
													Static29.aClass83_220 = Static105.aClass83_698;
												} else {
													Static29.aClass83_220 = Static33.aClass2_Sub3_Sub1_1.method259();
												}
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 213) {
												Static83.anInt1852 = Static33.aClass2_Sub3_Sub1_1.method220();
												Static124.anInt2520 = Static33.aClass2_Sub3_Sub1_1.method260();
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 23) {
												Static97.aBoolean106 = true;
												Static22.anInt581 = Static33.aClass2_Sub3_Sub1_1.method260();
												anInt4248 = Static33.aClass2_Sub3_Sub1_1.method260();
												Static129.anInt2828 = Static33.aClass2_Sub3_Sub1_1.method269();
												Static170.anInt3527 = Static33.aClass2_Sub3_Sub1_1.method260();
												Static128.anInt2813 = Static33.aClass2_Sub3_Sub1_1.method260();
												if (Static128.anInt2813 >= 100) {
													local125 = Static22.anInt581 * 128 + 64;
													local129 = anInt4248 * 128 + 64;
													local133 = Static177.method2711(local125, Static43.anInt1126, local129) - Static129.anInt2828;
													local209 = local125 - Static21.anInt567;
													local231 = local133 - Static199.anInt3952;
													local235 = local129 - Static174.anInt3596;
													local317 = (int) Math.sqrt((double) (local235 * local235 + local209 * local209));
													Static18.anInt2017 = (int) (Math.atan2((double) local231, (double) local317) * 325.949D) & 0x7FF;
													Static54.anInt1360 = (int) (Math.atan2((double) local209, (double) local235) * -325.949D) & 0x7FF;
													if (Static18.anInt2017 < 128) {
														Static18.anInt2017 = 128;
													}
													if (Static18.anInt2017 > 383) {
														Static18.anInt2017 = 383;
													}
												}
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 83) {
												local499 = Static33.aClass2_Sub3_Sub1_1.method243();
												local507 = Static33.aClass2_Sub3_Sub1_1.method269();
												local512 = Static33.aClass2_Sub3_Sub1_1.method261();
												@Pc(4488) long local4488 = (local507 << 32) + local512;
												@Pc(4490) boolean local4490 = false;
												local317 = Static33.aClass2_Sub3_Sub1_1.method260();
												local321 = Static33.aClass2_Sub3_Sub1_1.method269();
												for (local3663 = 0; local3663 < 100; local3663++) {
													if (Static157.aLongArray5[local3663] == local4488) {
														local4490 = true;
														break;
													}
												}
												if (local317 <= 1) {
													for (local531 = 0; local531 < Static85.anInt1875; local531++) {
														if (local499 == Static211.aLongArray8[local531]) {
															local4490 = true;
															break;
														}
													}
												}
												if (!local4490 && Static95.anInt2023 == 0) {
													Static157.aLongArray5[Static118.anInt2709] = local4488;
													Static118.anInt2709 = (Static118.anInt2709 + 1) % 100;
													local2203 = Static212.method3222(local321).method1989(Static33.aClass2_Sub3_Sub1_1);
													if (local317 == 2) {
														Static51.method1183(local2203, 18, null, Static67.method1268(new Class83[] { Static153.aClass83_971, Static12.method296(local499).method2400() }), local321);
													} else if (local317 == 1) {
														Static51.method1183(local2203, 18, null, Static67.method1268(new Class83[] { Static107.aClass83_928, Static12.method296(local499).method2400() }), local321);
													} else {
														Static51.method1183(local2203, 18, null, Static12.method296(local499).method2400(), local321);
													}
												}
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 188) {
												Static85.anInt1875 = Static131.anInt2843 / 8;
												for (local125 = 0; local125 < Static85.anInt1875; local125++) {
													Static211.aLongArray8[local125] = Static33.aClass2_Sub3_Sub1_1.method243();
													Static57.aClass83Array28[local125] = Static12.method296(Static211.aLongArray8[local125]);
												}
												Static148.anInt3046 = -1;
												Static38.anInt976 = Static29.anInt739;
												return true;
											} else if (Static148.anInt3046 == 142) {
												Static26.method502();
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 85) {
												local125 = Static33.aClass2_Sub3_Sub1_1.method244();
												local129 = Static33.aClass2_Sub3_Sub1_1.method258();
												local1375 = Static74.method1401(local125);
												if (local129 != local1375.anInt164 || local129 == -1) {
													local1375.anInt169 = 0;
													local1375.anInt164 = local129;
													local1375.anInt139 = 0;
													Static121.method2085(local1375);
												}
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 102) {
												Static18.method1617(true);
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 19) {
												local125 = Static33.aClass2_Sub3_Sub1_1.method268();
												local4206 = Static74.method1401(local125);
												local4206.anInt178 = 3;
												local4206.anInt144 = Static54.aClass24_Sub4_Sub1_1.aClass49_2.method1510();
												Static121.method2085(local4206);
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 39) {
												local125 = Static33.aClass2_Sub3_Sub1_1.method248();
												local129 = Static33.aClass2_Sub3_Sub1_1.method269();
												if (local125 >= 0) {
													local1375 = Static74.method1401(local125);
												} else {
													local1375 = null;
												}
												if (local125 < -70000) {
													local129 += 32768;
												}
												while (Static33.aClass2_Sub3_Sub1_1.anInt340 < Static131.anInt2843) {
													local209 = Static33.aClass2_Sub3_Sub1_1.method232();
													local235 = 0;
													local231 = Static33.aClass2_Sub3_Sub1_1.method269();
													if (local231 != 0) {
														local235 = Static33.aClass2_Sub3_Sub1_1.method260();
														if (local235 == 255) {
															local235 = Static33.aClass2_Sub3_Sub1_1.method248();
														}
													}
													if (local1375 != null && local209 >= 0 && local1375.anIntArray9.length > local209) {
														local1375.anIntArray9[local209] = local231;
														local1375.anIntArray5[local209] = local235;
													}
													Static79.method1447(local231 - 1, local209, local235, local129);
												}
												if (local1375 != null) {
													Static121.method2085(local1375);
												}
												Static113.method1993();
												Static123.anIntArray275[Static194.anInt3844++ & 0x1F] = local129 & 0x7FFF;
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 89) {
												local125 = Static33.aClass2_Sub3_Sub1_1.method244();
												local129 = Static33.aClass2_Sub3_Sub1_1.method267();
												local1375 = Static74.method1401(local125);
												if (local1375 != null && local1375.anInt130 == 0) {
													if (local129 > local1375.anInt114 - local1375.anInt100) {
														local129 = local1375.anInt114 - local1375.anInt100;
													}
													if (local129 < 0) {
														local129 = 0;
													}
													if (local129 != local1375.anInt125) {
														local1375.anInt125 = local129;
														Static121.method2085(local1375);
													}
												}
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 176) {
												Static18.method1617(false);
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 252) {
												Static93.anInt1979 = Static33.aClass2_Sub3_Sub1_1.method260();
												Static82.anInt1827 = Static33.aClass2_Sub3_Sub1_1.method260();
												Static37.anInt948 = Static33.aClass2_Sub3_Sub1_1.method260();
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 211 || Static148.anInt3046 == 74 || Static148.anInt3046 == 109 || Static148.anInt3046 == 131 || Static148.anInt3046 == 43 || Static148.anInt3046 == 71 || Static148.anInt3046 == 162 || Static148.anInt3046 == 8 || Static148.anInt3046 == 223 || Static148.anInt3046 == 28 || Static148.anInt3046 == 117) {
												Static209.method3167();
												Static148.anInt3046 = -1;
												return true;
											} else if (Static148.anInt3046 == 31) {
												local125 = Static33.aClass2_Sub3_Sub1_1.method262();
												local129 = Static33.aClass2_Sub3_Sub1_1.method254();
												Static210.anInt4184 = local129;
												Static153.anInt3302 = local125;
												Static104.method1814();
												Static148.anInt3046 = -1;
												return true;
											} else {
												Static188.method2856("T1 - " + Static148.anInt3046 + "," + Static197.anInt3927 + "," + Static168.anInt3481 + " - " + Static131.anInt2843, null);
												Static193.method2906();
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
