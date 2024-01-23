import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
	public static int anInt2200;

	@OriginalMember(owner = "client!kf", name = "Y", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
	public static int anInt2205 = 0;

	@OriginalMember(owner = "client!kf", name = "bb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_712 = Static186.method3527("Mem:");

	@OriginalMember(owner = "client!kf", name = "fb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_713 = Static186.method3527("Eingabeprozedur geladen)3");

	@OriginalMember(owner = "client!kf", name = "hb", descriptor = "Z")
	public static boolean aBoolean98 = true;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)Z")
	public static boolean method1752() throws IOException {
		if (Static33.aClass26_2 == null) {
			return false;
		}
		@Pc(13) int local13 = Static33.aClass26_2.method777();
		if (local13 == 0) {
			return false;
		}
		if (Static157.anInt3267 == -1) {
			Static33.aClass26_2.method779(Static97.aClass1_Sub17_Sub1_2.aByteArray40, 1, 0);
			Static97.aClass1_Sub17_Sub1_2.anInt2656 = 0;
			local13--;
			Static157.anInt3267 = Static97.aClass1_Sub17_Sub1_2.method2187();
			Static217.anInt4289 = Static172.anIntArray377[Static157.anInt3267];
		}
		if (Static217.anInt4289 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static33.aClass26_2.method779(Static97.aClass1_Sub17_Sub1_2.aByteArray40, 1, 0);
			Static217.anInt4289 = Static97.aClass1_Sub17_Sub1_2.aByteArray40[0] & 0xFF;
			local13--;
		}
		if (Static217.anInt4289 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static33.aClass26_2.method779(Static97.aClass1_Sub17_Sub1_2.aByteArray40, 2, 0);
			Static97.aClass1_Sub17_Sub1_2.anInt2656 = 0;
			local13 -= 2;
			Static217.anInt4289 = Static97.aClass1_Sub17_Sub1_2.method2178();
		}
		if (local13 < Static217.anInt4289) {
			return false;
		}
		Static97.aClass1_Sub17_Sub1_2.anInt2656 = 0;
		Static33.aClass26_2.method779(Static97.aClass1_Sub17_Sub1_2.aByteArray40, Static217.anInt4289, 0);
		Static173.anInt3576 = 0;
		Static60.anInt1181 = Static134.anInt2778;
		Static134.anInt2778 = Static49.anInt1041;
		Static49.anInt1041 = Static157.anInt3267;
		@Pc(130) int local130;
		@Pc(126) Class50 local126;
		@Pc(134) int local134;
		if (Static157.anInt3267 == 88) {
			local126 = Static97.aClass1_Sub17_Sub1_2.method2125();
			local130 = Static97.aClass1_Sub17_Sub1_2.method2128();
			local134 = Static97.aClass1_Sub17_Sub1_2.method2128();
			if (local130 >= 1 && local130 <= 8) {
				if (local126.method1256(Static216.aClass50_1347)) {
					local126 = null;
				}
				Static138.aClass50Array53[local130 - 1] = local126;
				Static47.aBooleanArray2[local130 - 1] = local134 == 0;
			}
			Static157.anInt3267 = -1;
			return true;
		}
		@Pc(181) int local181;
		@Pc(197) int local197;
		@Pc(193) int local193;
		if (Static157.anInt3267 == 8) {
			local181 = Static97.aClass1_Sub17_Sub1_2.method2142();
			local130 = Static97.aClass1_Sub17_Sub1_2.method2142();
			local134 = Static97.aClass1_Sub17_Sub1_2.method2178();
			local193 = Static97.aClass1_Sub17_Sub1_2.method2142();
			local197 = Static97.aClass1_Sub17_Sub1_2.method2142();
			Static25.method366(local134, local193, true, local181, local197, local130);
			Static157.anInt3267 = -1;
			return true;
		}
		@Pc(228) Class93 local228;
		if (Static157.anInt3267 == 210) {
			local181 = Static97.aClass1_Sub17_Sub1_2.method2131();
			local130 = Static97.aClass1_Sub17_Sub1_2.method2159();
			local134 = Static97.aClass1_Sub17_Sub1_2.method2178();
			local228 = Static164.method2725(local130);
			local228.anInt3671 = local134 + (local181 << 16);
			Static157.anInt3267 = -1;
			return true;
		}
		@Pc(263) Class93 local263;
		if (Static157.anInt3267 == 53) {
			local181 = Static97.aClass1_Sub17_Sub1_2.method2134();
			if (local181 == 65535) {
				local181 = -1;
			}
			local130 = Static97.aClass1_Sub17_Sub1_2.method2123();
			local263 = Static164.method2725(local130);
			if (local263.anInt3615 != 1 || local181 != local263.anInt3632) {
				local263.anInt3632 = local181;
				local263.anInt3615 = 1;
				Static66.method999(local263);
			}
			Static157.anInt3267 = -1;
			return true;
		} else if (Static157.anInt3267 == 203) {
			local181 = Static97.aClass1_Sub17_Sub1_2.method2131();
			local130 = Static97.aClass1_Sub17_Sub1_2.method2140();
			if (local181 == 65535) {
				local181 = -1;
			}
			local263 = Static164.method2725(local130);
			if (local263.anInt3615 != 2 || local181 != local263.anInt3632) {
				local263.anInt3632 = local181;
				local263.anInt3615 = 2;
				Static66.method999(local263);
			}
			Static157.anInt3267 = -1;
			return true;
		} else if (Static157.anInt3267 == 173) {
			local181 = Static97.aClass1_Sub17_Sub1_2.method2128();
			local130 = Static97.aClass1_Sub17_Sub1_2.method2134();
			local134 = Static97.aClass1_Sub17_Sub1_2.method2131();
			@Pc(358) Class20_Sub3_Sub2 local358 = Static78.aClass20_Sub3_Sub2Array1[local134];
			if (local358 != null) {
				Static141.method3012(local358, local130, local181);
			}
			Static157.anInt3267 = -1;
			return true;
		} else if (Static157.anInt3267 == 129) {
			local181 = Static97.aClass1_Sub17_Sub1_2.method2149();
			local130 = Static97.aClass1_Sub17_Sub1_2.method2178();
			Static104.anInt2068 = local130;
			Static176.anInt3690 = local181;
			Static56.method823();
			Static157.anInt3267 = -1;
			return true;
		} else if (Static157.anInt3267 == 94) {
			Static210.method3288();
			Static157.anInt3267 = -1;
			return false;
		} else {
			@Pc(412) Class93 local412;
			if (Static157.anInt3267 == 156) {
				local181 = Static97.aClass1_Sub17_Sub1_2.method2159();
				local412 = Static164.method2725(local181);
				local412.anInt3615 = 3;
				local412.anInt3632 = Static230.aClass20_Sub3_Sub1_3.aClass25_2.method772();
				Static66.method999(local412);
				Static157.anInt3267 = -1;
				return true;
			} else if (Static157.anInt3267 == 240) {
				Static105.anInt2092 = Static97.aClass1_Sub17_Sub1_2.method2139();
				Static91.anInt4085 = Static97.aClass1_Sub17_Sub1_2.method2129();
				while (Static97.aClass1_Sub17_Sub1_2.anInt2656 < Static217.anInt4289) {
					Static157.anInt3267 = Static97.aClass1_Sub17_Sub1_2.method2142();
					Static165.method2162();
				}
				Static157.anInt3267 = -1;
				return true;
			} else {
				@Pc(494) int local494;
				@Pc(488) int local488;
				@Pc(502) int local502;
				@Pc(498) int local498;
				if (Static157.anInt3267 == 7) {
					local181 = Static97.aClass1_Sub17_Sub1_2.method2129();
					local130 = local181 >> 2;
					local193 = Static22.anIntArray45[local130];
					local134 = local181 & 0x3;
					local197 = Static97.aClass1_Sub17_Sub1_2.method2138();
					local488 = local197 >> 14 & 0x3FFF;
					local494 = local197 >> 28 & 0x3;
					local498 = local197 & 0x3FFF;
					local502 = Static97.aClass1_Sub17_Sub1_2.method2131();
					local498 -= Static101.anInt2041;
					if (local502 == 65535) {
						local502 = -1;
					}
					local488 -= Static91.anInt4078;
					Static141.method3011(local130, local488, local193, local502, local494, local498, local134);
					Static157.anInt3267 = -1;
					return true;
				} else if (Static157.anInt3267 == 101) {
					local126 = Static97.aClass1_Sub17_Sub1_2.method2125();
					local130 = Static97.aClass1_Sub17_Sub1_2.method2134();
					local134 = Static97.aClass1_Sub17_Sub1_2.method2131();
					method1754(local134);
					Static138.method2294(local130, local126);
					Static157.anInt3267 = -1;
					return true;
				} else if (Static157.anInt3267 == 10) {
					Static164.method2728(Static4.aClass87_1, Static97.aClass1_Sub17_Sub1_2, Static217.anInt4289);
					Static157.anInt3267 = -1;
					return true;
				} else if (Static157.anInt3267 == 233) {
					local181 = Static97.aClass1_Sub17_Sub1_2.method2142();
					local130 = local181 >> 6;
					@Pc(587) Class64 local587 = new Class64();
					local587.anInt2222 = local181 & 0x3F;
					local587.anInt2213 = Static97.aClass1_Sub17_Sub1_2.method2142();
					if (local587.anInt2213 >= 0 && local587.anInt2213 < Static14.aClass1_Sub1_Sub8Array1.length) {
						if (local587.anInt2222 == 1 || local587.anInt2222 == 10) {
							local587.anInt2223 = Static97.aClass1_Sub17_Sub1_2.method2178();
							Static97.aClass1_Sub17_Sub1_2.anInt2656 += 3;
						} else if (local587.anInt2222 >= 2 && local587.anInt2222 <= 6) {
							if (local587.anInt2222 == 2) {
								local587.anInt2220 = 64;
								local587.anInt2218 = 64;
							}
							if (local587.anInt2222 == 3) {
								local587.anInt2218 = 64;
								local587.anInt2220 = 0;
							}
							if (local587.anInt2222 == 4) {
								local587.anInt2220 = 128;
								local587.anInt2218 = 64;
							}
							if (local587.anInt2222 == 5) {
								local587.anInt2218 = 0;
								local587.anInt2220 = 64;
							}
							if (local587.anInt2222 == 6) {
								local587.anInt2220 = 64;
								local587.anInt2218 = 128;
							}
							local587.anInt2222 = 2;
							local587.anInt2224 = Static97.aClass1_Sub17_Sub1_2.method2178();
							local587.anInt2214 = Static97.aClass1_Sub17_Sub1_2.method2178();
							local587.anInt2219 = Static97.aClass1_Sub17_Sub1_2.method2142();
						}
						local587.anInt2216 = Static97.aClass1_Sub17_Sub1_2.method2178();
						if (local587.anInt2216 == 65535) {
							local587.anInt2216 = -1;
						}
						Static229.aClass64Array1[local130] = local587;
					}
					Static157.anInt3267 = -1;
					return true;
				} else {
					@Pc(875) int local875;
					@Pc(750) long local750;
					@Pc(770) long local770;
					@Pc(868) int local868;
					if (Static157.anInt3267 == 17) {
						Static185.anInt3847 = Static31.anInt594;
						local750 = Static97.aClass1_Sub17_Sub1_2.method2172();
						if (local750 == 0L) {
							Static157.anInt3267 = -1;
							Static213.anInt4208 = 0;
							Static60.aClass50_422 = null;
							Static212.aClass1_Sub9Array1 = null;
							Static219.aClass50_1010 = null;
							return true;
						}
						local770 = Static97.aClass1_Sub17_Sub1_2.method2172();
						Static60.aClass50_422 = Static130.method2183(local770);
						Static219.aClass50_1010 = Static130.method2183(local750);
						Static206.aByte16 = Static97.aClass1_Sub17_Sub1_2.method2155();
						local197 = Static97.aClass1_Sub17_Sub1_2.method2142();
						if (local197 == 255) {
							Static157.anInt3267 = -1;
							return true;
						}
						Static213.anInt4208 = local197;
						@Pc(800) Class1_Sub9[] local800 = new Class1_Sub9[100];
						for (local488 = 0; local488 < Static213.anInt4208; local488++) {
							local800[local488] = new Class1_Sub9();
							local800[local488].aLong173 = Static97.aClass1_Sub17_Sub1_2.method2172();
							local800[local488].aClass50_336 = Static130.method2183(local800[local488].aLong173);
							local800[local488].anInt937 = Static97.aClass1_Sub17_Sub1_2.method2178();
							local800[local488].aByte3 = Static97.aClass1_Sub17_Sub1_2.method2155();
							local800[local488].aClass50_332 = Static97.aClass1_Sub17_Sub1_2.method2125();
							if (Static148.aLong122 == local800[local488].aLong173) {
								Static146.aByte6 = local800[local488].aByte3;
							}
						}
						local868 = Static213.anInt4208;
						while (local868 > 0) {
							@Pc(872) boolean local872 = true;
							local868--;
							for (local875 = 0; local875 < local868; local875++) {
								if (local800[local875].aClass50_336.method1220(local800[local875 + 1].aClass50_336) > 0) {
									local872 = false;
									@Pc(896) Class1_Sub9 local896 = local800[local875];
									local800[local875] = local800[local875 + 1];
									local800[local875 + 1] = local896;
								}
							}
							if (local872) {
								break;
							}
						}
						Static157.anInt3267 = -1;
						Static212.aClass1_Sub9Array1 = local800;
						return true;
					} else if (Static157.anInt3267 == 96 || Static157.anInt3267 == 22 || Static157.anInt3267 == 139 || Static157.anInt3267 == 78 || Static157.anInt3267 == 177 || Static157.anInt3267 == 23 || Static157.anInt3267 == 108 || Static157.anInt3267 == 241 || Static157.anInt3267 == 238 || Static157.anInt3267 == 18 || Static157.anInt3267 == 95 || Static157.anInt3267 == 144) {
						Static165.method2162();
						Static157.anInt3267 = -1;
						return true;
					} else if (Static157.anInt3267 == 237) {
						Static105.anInt2092 = Static97.aClass1_Sub17_Sub1_2.method2129();
						Static91.anInt4085 = Static97.aClass1_Sub17_Sub1_2.method2139();
						for (local181 = Static91.anInt4085; local181 < Static91.anInt4085 + 8; local181++) {
							for (local130 = Static105.anInt2092; local130 < Static105.anInt2092 + 8; local130++) {
								if (Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local181][local130] != null) {
									Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local181][local130] = null;
									Static183.method3009(local181, local130);
								}
							}
						}
						for (@Pc(1032) Class1_Sub4 local1032 = (Class1_Sub4) Static76.aClass75_9.method2239(); local1032 != null; local1032 = (Class1_Sub4) Static76.aClass75_9.method2238()) {
							if (Static91.anInt4085 <= local1032.anInt365 && Static91.anInt4085 + 8 > local1032.anInt365 && local1032.anInt366 >= Static105.anInt2092 && Static105.anInt2092 + 8 > local1032.anInt366 && local1032.anInt361 == Static212.anInt4195) {
								local1032.anInt369 = 0;
							}
						}
						Static157.anInt3267 = -1;
						return true;
					} else if (Static157.anInt3267 == 254) {
						Static216.method3372(Static97.aClass1_Sub17_Sub1_2.method2125());
						Static157.anInt3267 = -1;
						return true;
					} else if (Static157.anInt3267 == 143) {
						local181 = Static97.aClass1_Sub17_Sub1_2.method2134();
						local130 = Static97.aClass1_Sub17_Sub1_2.method2159();
						Static70.method1018(local181, local130);
						Static157.anInt3267 = -1;
						return true;
					} else if (Static157.anInt3267 == 158) {
						Static134.method2262();
						Static157.anInt3267 = -1;
						return true;
					} else if (Static157.anInt3267 == 12) {
						Static219.anInt2996 = Static97.aClass1_Sub17_Sub1_2.method2131() * 30;
						Static155.anInt3200 = Static31.anInt594;
						Static157.anInt3267 = -1;
						return true;
					} else if (Static157.anInt3267 == 230) {
						if (Static10.anInt204 != -1) {
							Static113.method1839(0, Static10.anInt204);
						}
						Static157.anInt3267 = -1;
						return true;
					} else if (Static157.anInt3267 == 248) {
						local181 = Static97.aClass1_Sub17_Sub1_2.method2159();
						local130 = Static97.aClass1_Sub17_Sub1_2.method2131();
						local263 = Static164.method2725(local181);
						if (local263 != null && local263.anInt3656 == 0) {
							if (local263.anInt3587 - local263.anInt3620 < local130) {
								local130 = local263.anInt3587 - local263.anInt3620;
							}
							if (local130 < 0) {
								local130 = 0;
							}
							if (local263.anInt3608 != local130) {
								local263.anInt3608 = local130;
								Static66.method999(local263);
							}
						}
						Static157.anInt3267 = -1;
						return true;
					} else {
						@Pc(1231) long local1231;
						@Pc(1285) int local1285;
						if (Static157.anInt3267 == 145) {
							local750 = Static97.aClass1_Sub17_Sub1_2.method2172();
							local770 = Static97.aClass1_Sub17_Sub1_2.method2178();
							local1231 = Static97.aClass1_Sub17_Sub1_2.method2135();
							@Pc(1238) long local1238 = (local770 << 32) + local1231;
							@Pc(1240) boolean local1240 = false;
							local488 = Static97.aClass1_Sub17_Sub1_2.method2142();
							local875 = 0;
							label1070: while (true) {
								if (local875 >= 100) {
									if (local488 <= 1) {
										if (Static138.anInt2817 == 1 || Static47.anInt979 == 1) {
											local1240 = true;
										} else {
											for (local1285 = 0; local1285 < Static201.anInt4066; local1285++) {
												if (Static118.aLongArray5[local1285] == local750) {
													local1240 = true;
													break label1070;
												}
											}
										}
									}
									break;
								}
								if (Static231.aLongArray10[local875] == local1238) {
									local1240 = true;
									break;
								}
								local875++;
							}
							if (!local1240 && Static69.anInt1317 == 0) {
								Static231.aLongArray10[Static210.anInt4163] = local1238;
								Static210.anInt4163 = (Static210.anInt4163 + 1) % 100;
								@Pc(1322) Class50 local1322 = Static154.method1824(Static146.method2476(Static97.aClass1_Sub17_Sub1_2).method1228());
								if (local488 == 2 || local488 == 3) {
									Static123.method1275(local1322, Static17.method257(new Class50[] { Static99.aClass50_1436, Static130.method2183(local750).method1218() }), 7);
								} else if (local488 == 1) {
									Static123.method1275(local1322, Static17.method257(new Class50[] { Static210.aClass50_1326, Static130.method2183(local750).method1218() }), 7);
								} else {
									Static123.method1275(local1322, Static130.method2183(local750).method1218(), 3);
								}
							}
							Static157.anInt3267 = -1;
							return true;
						} else if (Static157.anInt3267 == 90) {
							local181 = Static97.aClass1_Sub17_Sub1_2.method2138();
							local130 = Static97.aClass1_Sub17_Sub1_2.method2149();
							if (local130 == 65535) {
								local130 = -1;
							}
							local134 = Static97.aClass1_Sub17_Sub1_2.method2123();
							local228 = Static164.method2725(local134);
							@Pc(1433) Class70 local1433;
							if (local228.aBoolean156) {
								local228.anInt3595 = local130;
								local228.anInt3623 = local181;
								local1433 = Static16.method227(local130);
								local228.anInt3624 = local1433.anInt2410;
								local228.anInt3627 = local1433.anInt2451;
								local228.anInt3612 = local1433.anInt2436;
								if (local228.anInt3604 > 0) {
									local228.anInt3627 = local228.anInt3627 * 32 / local228.anInt3604;
								} else if (local228.anInt3669 > 0) {
									local228.anInt3627 = local228.anInt3627 * 32 / local228.anInt3669;
								}
								local228.anInt3674 = local1433.anInt2452;
								local228.anInt3665 = local1433.anInt2427;
								local228.anInt3607 = local1433.anInt2446;
								Static66.method999(local228);
							} else if (local130 == -1) {
								local228.anInt3615 = 0;
								Static157.anInt3267 = -1;
								return true;
							} else {
								local1433 = Static16.method227(local130);
								local228.anInt3615 = 4;
								local228.anInt3627 = local1433.anInt2451 * 100 / local181;
								local228.anInt3632 = local130;
								local228.anInt3624 = local1433.anInt2410;
								local228.anInt3607 = local1433.anInt2446;
								Static66.method999(local228);
							}
							Static157.anInt3267 = -1;
							return true;
						} else {
							@Pc(1578) int local1578;
							@Pc(1560) long local1560;
							@Pc(1642) Class50 local1642;
							if (Static157.anInt3267 == 31) {
								local750 = Static97.aClass1_Sub17_Sub1_2.method2172();
								Static97.aClass1_Sub17_Sub1_2.method2155();
								local770 = Static97.aClass1_Sub17_Sub1_2.method2172();
								local1231 = Static97.aClass1_Sub17_Sub1_2.method2178();
								local1560 = Static97.aClass1_Sub17_Sub1_2.method2135();
								local502 = Static97.aClass1_Sub17_Sub1_2.method2142();
								local868 = Static97.aClass1_Sub17_Sub1_2.method2178();
								@Pc(1574) long local1574 = (local1231 << 32) + local1560;
								@Pc(1576) boolean local1576 = false;
								local1578 = 0;
								label1093: while (true) {
									if (local1578 >= 100) {
										if (local502 <= 1) {
											for (@Pc(1605) int local1605 = 0; local1605 < Static201.anInt4066; local1605++) {
												if (local750 == Static118.aLongArray5[local1605]) {
													local1576 = true;
													break label1093;
												}
											}
										}
										break;
									}
									if (Static231.aLongArray10[local1578] == local1574) {
										local1576 = true;
										break;
									}
									local1578++;
								}
								if (!local1576 && Static69.anInt1317 == 0) {
									Static231.aLongArray10[Static210.anInt4163] = local1574;
									Static210.anInt4163 = (Static210.anInt4163 + 1) % 100;
									local1642 = Static219.method2418(local868).method1919(Static97.aClass1_Sub17_Sub1_2);
									if (local502 == 2 || local502 == 3) {
										Static181.method2964(local1642, local868, Static17.method257(new Class50[] { Static99.aClass50_1436, Static130.method2183(local750).method1218() }), 20, Static130.method2183(local770).method1218());
									} else if (local502 == 1) {
										Static181.method2964(local1642, local868, Static17.method257(new Class50[] { Static210.aClass50_1326, Static130.method2183(local750).method1218() }), 20, Static130.method2183(local770).method1218());
									} else {
										Static181.method2964(local1642, local868, Static130.method2183(local750).method1218(), 20, Static130.method2183(local770).method1218());
									}
								}
								Static157.anInt3267 = -1;
								return true;
							} else if (Static157.anInt3267 == 193) {
								for (local181 = 0; local181 < Static24.anIntArray49.length; local181++) {
									if (Static66.anIntArray108[local181] != Static24.anIntArray49[local181]) {
										Static24.anIntArray49[local181] = Static66.anIntArray108[local181];
										Static203.method543(local181);
										Static204.anIntArray466[Static176.anInt3680++ & 0x1F] = local181;
									}
								}
								Static157.anInt3267 = -1;
								return true;
							} else if (Static157.anInt3267 == 188) {
								Static63.method972(true);
								Static157.anInt3267 = -1;
								return true;
							} else if (Static157.anInt3267 == 120) {
								local181 = Static97.aClass1_Sub17_Sub1_2.method2138();
								local130 = Static97.aClass1_Sub17_Sub1_2.method2134();
								local193 = local130 >> 5 & 0x1F;
								local134 = local130 >> 10 & 0x1F;
								local197 = local130 & 0x1F;
								local494 = (local197 << 3) + (local134 << 19) + (local193 << 11);
								@Pc(1831) Class93 local1831 = Static164.method2725(local181);
								if (local1831.anInt3591 != local494) {
									local1831.anInt3591 = local494;
									Static66.method999(local1831);
								}
								Static157.anInt3267 = -1;
								return true;
							} else if (Static157.anInt3267 == 216) {
								Static42.method670();
								Static157.anInt3267 = -1;
								return true;
							} else if (Static157.anInt3267 == 180) {
								local181 = Static97.aClass1_Sub17_Sub1_2.method2178();
								if (local181 == 65535) {
									local181 = -1;
								}
								local130 = Static97.aClass1_Sub17_Sub1_2.method2142();
								local134 = Static97.aClass1_Sub17_Sub1_2.method2178();
								Static103.method1590(local130, local181, local134);
								Static157.anInt3267 = -1;
								return true;
							} else if (Static157.anInt3267 == 58) {
								local181 = Static97.aClass1_Sub17_Sub1_2.method2142();
								if (Static97.aClass1_Sub17_Sub1_2.method2142() == 0) {
									Static35.aClass100Array1[local181] = new Class100();
								} else {
									Static97.aClass1_Sub17_Sub1_2.anInt2656--;
									Static35.aClass100Array1[local181] = new Class100(Static97.aClass1_Sub17_Sub1_2);
								}
								Static91.anInt4082 = Static31.anInt594;
								Static157.anInt3267 = -1;
								return true;
							} else if (Static157.anInt3267 == 226) {
								Static181.method2969();
								Static220.anInt4308 = Static97.aClass1_Sub17_Sub1_2.method2167();
								Static155.anInt3200 = Static31.anInt594;
								Static157.anInt3267 = -1;
								return true;
							} else if (Static157.anInt3267 == 118) {
								local181 = Static97.aClass1_Sub17_Sub1_2.method2140();
								local130 = Static97.aClass1_Sub17_Sub1_2.method2131();
								Static224.method68(local181, local130);
								Static157.anInt3267 = -1;
								return true;
							} else {
								@Pc(1992) Class1_Sub13 local1992;
								@Pc(2022) Class93 local2022;
								if (Static157.anInt3267 == 123) {
									local181 = Static97.aClass1_Sub17_Sub1_2.method2140();
									local130 = Static97.aClass1_Sub17_Sub1_2.method2140();
									@Pc(1985) Class1_Sub13 local1985 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local181);
									local1992 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local130);
									if (local1992 != null) {
										Static203.method532(local1985 == null || local1985.anInt1588 != local1992.anInt1588, local1992);
									}
									if (local1985 != null) {
										local1985.method3525();
										Static157.aClass90_19.method2817(local1985, (long) local130);
									}
									local2022 = Static164.method2725(local181);
									if (local2022 != null) {
										Static66.method999(local2022);
									}
									local2022 = Static164.method2725(local130);
									if (local2022 != null) {
										Static66.method999(local2022);
										Static71.method1029(local2022, true);
									}
									if (Static10.anInt204 != -1) {
										Static113.method1839(1, Static10.anInt204);
									}
									Static157.anInt3267 = -1;
									return true;
								} else if (Static157.anInt3267 == 223) {
									local181 = Static97.aClass1_Sub17_Sub1_2.method2178();
									local130 = Static97.aClass1_Sub17_Sub1_2.method2131();
									local134 = Static97.aClass1_Sub17_Sub1_2.method2131();
									local193 = Static97.aClass1_Sub17_Sub1_2.method2159();
									if (local193 >> 30 != 0) {
										local494 = (local193 >> 14 & 0x3FFF) - Static91.anInt4078;
										local197 = local193 >> 28 & 0x3;
										local488 = (local193 & 0x3FFF) - Static101.anInt2041;
										if (local494 >= 0 && local488 >= 0 && local494 < 104 && local488 < 104) {
											local494 = local494 * 128 + 64;
											local488 = local488 * 128 + 64;
											@Pc(2248) Class20_Sub7 local2248 = new Class20_Sub7(local134, local197, local494, local488, Static131.method2213(local488, local494, local197) - local130, local181, Static107.anInt2132);
											Static40.aClass75_4.method2240(new Class1_Sub1_Sub9(local2248));
										}
									} else if (local193 >> 29 != 0) {
										local197 = local193 & 0xFFFF;
										@Pc(2090) Class20_Sub3_Sub2 local2090 = Static78.aClass20_Sub3_Sub2Array1[local197];
										if (local2090 != null) {
											local2090.anInt3025 = 0;
											local2090.anInt3058 = local134;
											local2090.anInt3045 = Static107.anInt2132 + local181;
											if (local2090.anInt3058 == 65535) {
												local2090.anInt3058 = -1;
											}
											local2090.anInt3037 = local130;
											local2090.anInt3019 = 0;
											if (Static107.anInt2132 < local2090.anInt3045) {
												local2090.anInt3019 = -1;
											}
										}
									} else if (local193 >> 28 != 0) {
										local197 = local193 & 0xFFFF;
										@Pc(2144) Class20_Sub3_Sub1 local2144;
										if (Static20.anInt417 == local197) {
											local2144 = Static230.aClass20_Sub3_Sub1_3;
										} else {
											local2144 = Static232.aClass20_Sub3_Sub1Array1[local197];
										}
										if (local2144 != null) {
											local2144.anInt3037 = local130;
											local2144.anInt3058 = local134;
											local2144.anInt3019 = 0;
											if (local2144.anInt3058 == 65535) {
												local2144.anInt3058 = -1;
											}
											local2144.anInt3025 = 0;
											local2144.anInt3045 = local181 + Static107.anInt2132;
											if (Static107.anInt2132 < local2144.anInt3045) {
												local2144.anInt3019 = -1;
											}
										}
									}
									Static157.anInt3267 = -1;
									return true;
								} else if (Static157.anInt3267 == 4) {
									local181 = Static97.aClass1_Sub17_Sub1_2.method2149();
									local130 = Static97.aClass1_Sub17_Sub1_2.method2134();
									local134 = Static97.aClass1_Sub17_Sub1_2.method2178();
									local193 = Static97.aClass1_Sub17_Sub1_2.method2159();
									local2022 = Static164.method2725(local193);
									if (local2022.anInt3607 != local181 || local2022.anInt3624 != local134 || local2022.anInt3627 != local130) {
										local2022.anInt3624 = local134;
										local2022.anInt3607 = local181;
										local2022.anInt3627 = local130;
										Static66.method999(local2022);
									}
									Static157.anInt3267 = -1;
									return true;
								} else {
									@Pc(2384) int local2384;
									if (Static157.anInt3267 == 243) {
										@Pc(2327) boolean local2327 = false;
										local750 = Static97.aClass1_Sub17_Sub1_2.method2172();
										local770 = Static97.aClass1_Sub17_Sub1_2.method2178();
										local1231 = Static97.aClass1_Sub17_Sub1_2.method2135();
										local488 = Static97.aClass1_Sub17_Sub1_2.method2142();
										@Pc(2351) long local2351 = local1231 + (local770 << 32);
										local498 = Static97.aClass1_Sub17_Sub1_2.method2178();
										local1285 = 0;
										label1126: while (true) {
											if (local1285 >= 100) {
												if (local488 <= 1) {
													for (local2384 = 0; local2384 < Static201.anInt4066; local2384++) {
														if (Static118.aLongArray5[local2384] == local750) {
															local2327 = true;
															break label1126;
														}
													}
												}
												break;
											}
											if (Static231.aLongArray10[local1285] == local2351) {
												local2327 = true;
												break;
											}
											local1285++;
										}
										if (!local2327 && Static69.anInt1317 == 0) {
											Static231.aLongArray10[Static210.anInt4163] = local2351;
											Static210.anInt4163 = (Static210.anInt4163 + 1) % 100;
											@Pc(2421) Class50 local2421 = Static219.method2418(local498).method1919(Static97.aClass1_Sub17_Sub1_2);
											if (local488 == 2) {
												Static181.method2964(local2421, local498, Static17.method257(new Class50[] { Static99.aClass50_1436, Static130.method2183(local750).method1218() }), 18, null);
											} else if (local488 == 1) {
												Static181.method2964(local2421, local498, Static17.method257(new Class50[] { Static210.aClass50_1326, Static130.method2183(local750).method1218() }), 18, null);
											} else {
												Static181.method2964(local2421, local498, Static130.method2183(local750).method1218(), 18, null);
											}
										}
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 92) {
										@Pc(2508) boolean local2508 = Static97.aClass1_Sub17_Sub1_2.method2129() == 1;
										local130 = Static97.aClass1_Sub17_Sub1_2.method2138();
										local263 = Static164.method2725(local130);
										if (local263.aBoolean165 != local2508) {
											local263.aBoolean165 = local2508;
											Static66.method999(local263);
										}
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 64) {
										local181 = Static97.aClass1_Sub17_Sub1_2.method2178();
										local130 = Static97.aClass1_Sub17_Sub1_2.method2129();
										if (local130 == 2) {
											Static75.method1098();
										}
										Static10.anInt204 = local181;
										Static114.method1848(local181);
										Static14.method195(false);
										Static185.method3083(Static10.anInt204);
										for (local134 = 0; local134 < 100; local134++) {
											Static98.aBooleanArray5[local134] = true;
										}
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 169) {
										local181 = Static97.aClass1_Sub17_Sub1_2.method2140();
										@Pc(2593) Class1_Sub13 local2593 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local181);
										if (local2593 != null) {
											Static203.method532(true, local2593);
										}
										if (Static199.aClass93_112 != null) {
											Static66.method999(Static199.aClass93_112);
											Static199.aClass93_112 = null;
										}
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 165) {
										Static181.method2969();
										local181 = Static97.aClass1_Sub17_Sub1_2.method2142();
										local130 = Static97.aClass1_Sub17_Sub1_2.method2123();
										local134 = Static97.aClass1_Sub17_Sub1_2.method2139();
										Static140.anIntArray300[local134] = local130;
										Static143.anIntArray303[local134] = local181;
										Static218.anIntArray385[local134] = 1;
										for (local193 = 0; local193 < 98; local193++) {
											if (Class51.anIntArray150[local193] <= local130) {
												Static218.anIntArray385[local134] = local193 + 2;
											}
										}
										Static227.anIntArray504[Static109.anInt2169++ & 0x1F] = local134;
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 103) {
										local750 = Static97.aClass1_Sub17_Sub1_2.method2172();
										@Pc(2688) Class50 local2688 = Static154.method1824(Static146.method2476(Static97.aClass1_Sub17_Sub1_2).method1228());
										Static123.method1275(local2688, Static130.method2183(local750).method1218(), 6);
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 138) {
										Static147.anInt3081 = Static97.aClass1_Sub17_Sub1_2.method2142();
										Static1.anInt42 = Static97.aClass1_Sub17_Sub1_2.method2142();
										Static140.anInt2857 = Static97.aClass1_Sub17_Sub1_2.method2142();
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 37) {
										Static163.anInt3375 = 0;
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 198) {
										Static181.method2969();
										Static11.anInt228 = Static97.aClass1_Sub17_Sub1_2.method2142();
										Static155.anInt3200 = Static31.anInt594;
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 40) {
										local181 = Static97.aClass1_Sub17_Sub1_2.method2142();
										local130 = Static97.aClass1_Sub17_Sub1_2.method2142();
										local134 = Static97.aClass1_Sub17_Sub1_2.method2178();
										local193 = Static97.aClass1_Sub17_Sub1_2.method2142();
										local197 = Static97.aClass1_Sub17_Sub1_2.method2142();
										Static45.method690(local193, local197, local130, local134, local181);
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 197) {
										Static91.anInt4085 = Static97.aClass1_Sub17_Sub1_2.method2129();
										Static105.anInt2092 = Static97.aClass1_Sub17_Sub1_2.method2128();
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 75) {
										local181 = Static97.aClass1_Sub17_Sub1_2.method2142();
										local130 = Static97.aClass1_Sub17_Sub1_2.method2134();
										local134 = Static97.aClass1_Sub17_Sub1_2.method2140();
										local1992 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local134);
										if (local1992 != null) {
											Static203.method532(local1992.anInt1588 != local130, local1992);
										}
										Static175.method2900(local134, local130, local181);
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 11) {
										local181 = Static97.aClass1_Sub17_Sub1_2.method2131();
										if (local181 == 65535) {
											local181 = -1;
										}
										Static103.method1593(local181);
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 130) {
										local181 = Static97.aClass1_Sub17_Sub1_2.method2127();
										local130 = Static97.aClass1_Sub17_Sub1_2.method2134();
										if (local130 == 65535) {
											local130 = -1;
										}
										Static187.method3088(local130, local181);
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 81) {
										local181 = Static97.aClass1_Sub17_Sub1_2.method2138();
										local412 = Static164.method2725(local181);
										for (local134 = 0; local134 < local412.anIntArray392.length; local134++) {
											local412.anIntArray392[local134] = -1;
											local412.anIntArray392[local134] = 0;
										}
										Static66.method999(local412);
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 42) {
										Static64.method986();
										Static181.method2969();
										Static157.anInt3267 = -1;
										Static176.anInt3680 += 32;
										return true;
									} else if (Static157.anInt3267 == 87) {
										for (local181 = 0; local181 < Static232.aClass20_Sub3_Sub1Array1.length; local181++) {
											if (Static232.aClass20_Sub3_Sub1Array1[local181] != null) {
												Static232.aClass20_Sub3_Sub1Array1[local181].anInt3060 = -1;
											}
										}
										for (local130 = 0; local130 < Static78.aClass20_Sub3_Sub2Array1.length; local130++) {
											if (Static78.aClass20_Sub3_Sub2Array1[local130] != null) {
												Static78.aClass20_Sub3_Sub2Array1[local130].anInt3060 = -1;
											}
										}
										Static157.anInt3267 = -1;
										return true;
									} else if (Static157.anInt3267 == 244) {
										local181 = Static97.aClass1_Sub17_Sub1_2.method2126();
										local130 = Static97.aClass1_Sub17_Sub1_2.method2167();
										local134 = Static97.aClass1_Sub17_Sub1_2.method2138();
										local228 = Static164.method2725(local134);
										local228.aByte9 = 0;
										local228.anInt3631 = local228.anInt3657 = local181;
										local228.aByte11 = 0;
										local228.anInt3619 = local228.anInt3590 = local130;
										Static66.method999(local228);
										Static157.anInt3267 = -1;
										return true;
									} else {
										@Pc(3060) Class50 local3060;
										if (Static157.anInt3267 == 146) {
											local181 = Static97.aClass1_Sub17_Sub1_2.method2149();
											local3060 = Static97.aClass1_Sub17_Sub1_2.method2125();
											local134 = Static97.aClass1_Sub17_Sub1_2.method2149();
											method1754(local181);
											Static138.method2294(local134, local3060);
											Static157.anInt3267 = -1;
											return true;
										}
										@Pc(3107) boolean local3107;
										@Pc(3151) Class50 local3151;
										if (Static157.anInt3267 == 27) {
											local126 = Static97.aClass1_Sub17_Sub1_2.method2125();
											if (local126.method1223(Static15.aClass50_120)) {
												local3060 = local126.method1216(local126.method1257(Static212.aClass50_1334), 0);
												local770 = local3060.method1221();
												local3107 = false;
												for (local494 = 0; local494 < Static201.anInt4066; local494++) {
													if (Static118.aLongArray5[local494] == local770) {
														local3107 = true;
														break;
													}
												}
												if (!local3107 && Static69.anInt1317 == 0) {
													Static123.method1275(Static62.aClass50_445, local3060, 4);
												}
											} else if (local126.method1223(Static160.aClass50_1083)) {
												local3060 = local126.method1216(local126.method1257(Static212.aClass50_1334), 0);
												local770 = local3060.method1221();
												local3107 = false;
												for (local494 = 0; local494 < Static201.anInt4066; local494++) {
													if (local770 == Static118.aLongArray5[local494]) {
														local3107 = true;
														break;
													}
												}
												if (!local3107 && Static69.anInt1317 == 0) {
													local3151 = local126.method1216(local126.method1249() - 9, local126.method1257(Static212.aClass50_1334) + 1);
													Static123.method1275(local3151, local3060, 8);
												}
											} else if (local126.method1223(Static67.aClass50_475)) {
												local3060 = local126.method1216(local126.method1257(Static212.aClass50_1334), 0);
												local3107 = false;
												local770 = local3060.method1221();
												for (local494 = 0; local494 < Static201.anInt4066; local494++) {
													if (Static118.aLongArray5[local494] == local770) {
														local3107 = true;
														break;
													}
												}
												if (!local3107 && Static69.anInt1317 == 0) {
													Static123.method1275(Static7.aClass50_69, local3060, 10);
												}
											} else if (local126.method1223(Static145.aClass50_1001)) {
												local3060 = local126.method1216(local126.method1257(Static145.aClass50_1001), 0);
												Static123.method1275(local3060, Static7.aClass50_69, 11);
											} else if (local126.method1223(Static99.aClass50_1435)) {
												local3060 = local126.method1216(local126.method1257(Static99.aClass50_1435), 0);
												if (Static69.anInt1317 == 0) {
													Static123.method1275(local3060, Static7.aClass50_69, 12);
												}
											} else if (local126.method1223(Static26.aClass50_200)) {
												local3060 = local126.method1216(local126.method1257(Static26.aClass50_200), 0);
												if (Static69.anInt1317 == 0) {
													Static123.method1275(local3060, Static7.aClass50_69, 13);
												}
											} else if (local126.method1223(Static194.aClass50_1269)) {
												local3060 = local126.method1216(local126.method1257(Static212.aClass50_1334), 0);
												local3107 = false;
												local770 = local3060.method1221();
												for (local494 = 0; local494 < Static201.anInt4066; local494++) {
													if (Static118.aLongArray5[local494] == local770) {
														local3107 = true;
														break;
													}
												}
												if (!local3107 && Static69.anInt1317 == 0) {
													Static123.method1275(Static7.aClass50_69, local3060, 14);
												}
											} else if (local126.method1223(Static87.aClass50_579)) {
												local3060 = local126.method1216(local126.method1257(Static212.aClass50_1334), 0);
												local770 = local3060.method1221();
												local3107 = false;
												for (local494 = 0; local494 < Static201.anInt4066; local494++) {
													if (local770 == Static118.aLongArray5[local494]) {
														local3107 = true;
														break;
													}
												}
												if (!local3107 && Static69.anInt1317 == 0) {
													Static123.method1275(Static7.aClass50_69, local3060, 15);
												}
											} else if (local126.method1223(Static164.aClass50_1102)) {
												local3060 = local126.method1216(local126.method1257(Static212.aClass50_1334), 0);
												local770 = local3060.method1221();
												local3107 = false;
												for (local494 = 0; local494 < Static201.anInt4066; local494++) {
													if (local770 == Static118.aLongArray5[local494]) {
														local3107 = true;
														break;
													}
												}
												if (!local3107 && Static69.anInt1317 == 0) {
													Static123.method1275(Static7.aClass50_69, local3060, 16);
												}
											} else {
												Static123.method1275(local126, Static7.aClass50_69, 0);
											}
											Static157.anInt3267 = -1;
											return true;
										} else if (Static157.anInt3267 == 52) {
											local181 = Static97.aClass1_Sub17_Sub1_2.method2128();
											local130 = Static97.aClass1_Sub17_Sub1_2.method2139();
											local134 = Static97.aClass1_Sub17_Sub1_2.method2129();
											Static212.anInt4195 = local181 >> 1;
											Static230.aClass20_Sub3_Sub1_3.method2470(local130, local134, (local181 & 0x1) == 1);
											Static157.anInt3267 = -1;
											return true;
										} else if (Static157.anInt3267 == 68) {
											local181 = Static97.aClass1_Sub17_Sub1_2.method2134();
											local130 = Static97.aClass1_Sub17_Sub1_2.method2178();
											local134 = Static97.aClass1_Sub17_Sub1_2.method2138();
											method1754(local130);
											Static14.method196(local134, local181);
											Static157.anInt3267 = -1;
											return true;
										} else if (Static157.anInt3267 == 126) {
											local126 = Static97.aClass1_Sub17_Sub1_2.method2125();
											local130 = Static97.aClass1_Sub17_Sub1_2.method2138();
											local263 = Static164.method2725(local130);
											if (!local126.method1236(local263.aClass50_1188)) {
												local263.aClass50_1188 = local126;
												Static66.method999(local263);
											}
											Static157.anInt3267 = -1;
											return true;
										} else if (Static157.anInt3267 == 71) {
											local181 = Static97.aClass1_Sub17_Sub1_2.method2134();
											@Pc(3605) byte local3605 = Static97.aClass1_Sub17_Sub1_2.method2146();
											Static70.method1018(local181, local3605);
											Static157.anInt3267 = -1;
											return true;
										} else if (Static157.anInt3267 == 35) {
											local181 = Static97.aClass1_Sub17_Sub1_2.method2140();
											local130 = Static97.aClass1_Sub17_Sub1_2.method2178();
											if (local181 < -70000) {
												local130 += 32768;
											}
											if (local181 >= 0) {
												local263 = Static164.method2725(local181);
											} else {
												local263 = null;
											}
											while (Static97.aClass1_Sub17_Sub1_2.anInt2656 < Static217.anInt4289) {
												local193 = Static97.aClass1_Sub17_Sub1_2.method2156();
												local197 = Static97.aClass1_Sub17_Sub1_2.method2178();
												local494 = 0;
												if (local197 != 0) {
													local494 = Static97.aClass1_Sub17_Sub1_2.method2142();
													if (local494 == 255) {
														local494 = Static97.aClass1_Sub17_Sub1_2.method2140();
													}
												}
												if (local263 != null && local193 >= 0 && local263.anIntArray392.length > local193) {
													local263.anIntArray392[local193] = local197;
													local263.anIntArray401[local193] = local494;
												}
												Static102.method1585(local494, local193, local197 - 1, local130);
											}
											if (local263 != null) {
												Static66.method999(local263);
											}
											Static181.method2969();
											Static188.anIntArray439[Static46.anInt950++ & 0x1F] = local130 & 0x7FFF;
											Static157.anInt3267 = -1;
											return true;
										} else {
											@Pc(3764) Class50 local3764;
											@Pc(3968) Class50 local3968;
											if (Static157.anInt3267 == 99) {
												local750 = Static97.aClass1_Sub17_Sub1_2.method2172();
												local134 = Static97.aClass1_Sub17_Sub1_2.method2178();
												local193 = Static97.aClass1_Sub17_Sub1_2.method2142();
												local3107 = true;
												if (local750 < 0L) {
													local3107 = false;
													local750 &= Long.MAX_VALUE;
												}
												local3764 = Static7.aClass50_69;
												if (local134 > 0) {
													local3764 = Static97.aClass1_Sub17_Sub1_2.method2125();
												}
												local3151 = Static130.method2183(local750).method1218();
												for (local498 = 0; local498 < Static21.anInt420; local498++) {
													if (local750 == Static129.aLongArray6[local498]) {
														if (local134 != Static206.anIntArray467[local498]) {
															Static206.anIntArray467[local498] = local134;
															if (local134 > 0) {
																Static123.method1275(Static17.method257(new Class50[] { local3151, Static80.aClass50_530 }), Static7.aClass50_69, 5);
															}
															if (local134 == 0) {
																Static123.method1275(Static17.method257(new Class50[] { local3151, Static173.aClass50_1183 }), Static7.aClass50_69, 5);
															}
														}
														Static131.aClass50Array50[local498] = local3764;
														Static113.anIntArray254[local498] = local193;
														Static11.aBooleanArray1[local498] = local3107;
														local3151 = null;
														break;
													}
												}
												if (local3151 != null && Static21.anInt420 < 200) {
													Static129.aLongArray6[Static21.anInt420] = local750;
													Static149.aClass50Array58[Static21.anInt420] = local3151;
													Static206.anIntArray467[Static21.anInt420] = local134;
													Static131.aClass50Array50[Static21.anInt420] = local3764;
													Static113.anIntArray254[Static21.anInt420] = local193;
													Static11.aBooleanArray1[Static21.anInt420] = local3107;
													Static21.anInt420++;
												}
												local868 = Static21.anInt420;
												Static205.anInt4112 = Static31.anInt594;
												while (local868 > 0) {
													local868--;
													@Pc(3908) boolean local3908 = true;
													for (local875 = 0; local875 < local868; local875++) {
														if (Static206.anIntArray467[local875] != Static59.anInt1179 && Static59.anInt1179 == Static206.anIntArray467[local875 + 1] || Static206.anIntArray467[local875] == 0 && Static206.anIntArray467[local875 + 1] != 0) {
															local1285 = Static206.anIntArray467[local875];
															local3908 = false;
															Static206.anIntArray467[local875] = Static206.anIntArray467[local875 + 1];
															Static206.anIntArray467[local875 + 1] = local1285;
															local3968 = Static131.aClass50Array50[local875];
															Static131.aClass50Array50[local875] = Static131.aClass50Array50[local875 + 1];
															Static131.aClass50Array50[local875 + 1] = local3968;
															local1642 = Static149.aClass50Array58[local875];
															Static149.aClass50Array58[local875] = Static149.aClass50Array58[local875 + 1];
															Static149.aClass50Array58[local875 + 1] = local1642;
															@Pc(4004) long local4004 = Static129.aLongArray6[local875];
															Static129.aLongArray6[local875] = Static129.aLongArray6[local875 + 1];
															Static129.aLongArray6[local875 + 1] = local4004;
															@Pc(4022) int local4022 = Static113.anIntArray254[local875];
															Static113.anIntArray254[local875] = Static113.anIntArray254[local875 + 1];
															Static113.anIntArray254[local875 + 1] = local4022;
															@Pc(4040) boolean local4040 = Static11.aBooleanArray1[local875];
															Static11.aBooleanArray1[local875] = Static11.aBooleanArray1[local875 + 1];
															Static11.aBooleanArray1[local875 + 1] = local4040;
														}
													}
													if (local3908) {
														break;
													}
												}
												Static157.anInt3267 = -1;
												return true;
											}
											@Pc(4112) long local4112;
											if (Static157.anInt3267 == 65) {
												local750 = Static97.aClass1_Sub17_Sub1_2.method2172();
												Static97.aClass1_Sub17_Sub1_2.method2155();
												local770 = Static97.aClass1_Sub17_Sub1_2.method2172();
												@Pc(4092) boolean local4092 = false;
												local1231 = Static97.aClass1_Sub17_Sub1_2.method2178();
												local1560 = Static97.aClass1_Sub17_Sub1_2.method2135();
												local502 = Static97.aClass1_Sub17_Sub1_2.method2142();
												local4112 = local1560 + (local1231 << 32);
												local2384 = 0;
												label1256: while (true) {
													if (local2384 >= 100) {
														if (local502 <= 1) {
															if (Static138.anInt2817 == 1 || Static47.anInt979 == 1) {
																local4092 = true;
															} else {
																for (local1578 = 0; local1578 < Static201.anInt4066; local1578++) {
																	if (local750 == Static118.aLongArray5[local1578]) {
																		local4092 = true;
																		break label1256;
																	}
																}
															}
														}
														break;
													}
													if (local4112 == Static231.aLongArray10[local2384]) {
														local4092 = true;
														break;
													}
													local2384++;
												}
												if (!local4092 && Static69.anInt1317 == 0) {
													Static231.aLongArray10[Static210.anInt4163] = local4112;
													Static210.anInt4163 = (Static210.anInt4163 + 1) % 100;
													local3968 = Static154.method1824(Static146.method2476(Static97.aClass1_Sub17_Sub1_2).method1228());
													if (local502 == 2 || local502 == 3) {
														Static87.method1368(local3968, Static130.method2183(local770).method1218(), Static17.method257(new Class50[] { Static99.aClass50_1436, Static130.method2183(local750).method1218() }));
													} else if (local502 == 1) {
														Static87.method1368(local3968, Static130.method2183(local770).method1218(), Static17.method257(new Class50[] { Static210.aClass50_1326, Static130.method2183(local750).method1218() }));
													} else {
														Static87.method1368(local3968, Static130.method2183(local770).method1218(), Static130.method2183(local750).method1218());
													}
												}
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 47) {
												local181 = Static97.aClass1_Sub17_Sub1_2.anInt2656 + Static217.anInt4289;
												local130 = Static97.aClass1_Sub17_Sub1_2.method2178();
												local134 = Static97.aClass1_Sub17_Sub1_2.method2178();
												if (Static10.anInt204 != local130) {
													Static10.anInt204 = local130;
													Static114.method1848(Static10.anInt204);
													Static14.method195(false);
													Static185.method3083(Static10.anInt204);
													for (local193 = 0; local193 < 100; local193++) {
														Static98.aBooleanArray5[local193] = true;
													}
												}
												while (local134-- > 0) {
													local193 = Static97.aClass1_Sub17_Sub1_2.method2140();
													local197 = Static97.aClass1_Sub17_Sub1_2.method2178();
													local494 = Static97.aClass1_Sub17_Sub1_2.method2142();
													@Pc(4351) Class1_Sub13 local4351 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local193);
													if (local4351 != null && local197 != local4351.anInt1588) {
														Static203.method532(true, local4351);
														local4351 = null;
													}
													if (local4351 == null) {
														local4351 = Static175.method2900(local193, local197, local494);
													}
													local4351.aBoolean74 = true;
												}
												for (local1992 = (Class1_Sub13) Static157.aClass90_19.method2823(); local1992 != null; local1992 = (Class1_Sub13) Static157.aClass90_19.method2821()) {
													if (local1992.aBoolean74) {
														local1992.aBoolean74 = false;
													} else {
														Static203.method532(true, local1992);
													}
												}
												Static144.aClass90_14.method2818();
												while (Static97.aClass1_Sub17_Sub1_2.anInt2656 < local181) {
													local197 = Static97.aClass1_Sub17_Sub1_2.method2140();
													local494 = Static97.aClass1_Sub17_Sub1_2.method2178();
													local488 = Static97.aClass1_Sub17_Sub1_2.method2178();
													local498 = Static97.aClass1_Sub17_Sub1_2.method2140();
													for (local502 = local494; local502 <= local488; local502++) {
														local4112 = (long) local502 + ((long) local197 << 32);
														Static144.aClass90_14.method2817(new Class1_Sub5(local498), local4112);
													}
												}
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 76) {
												local750 = Static97.aClass1_Sub17_Sub1_2.method2172();
												local3107 = false;
												local134 = Static97.aClass1_Sub17_Sub1_2.method2178();
												if ((Long.MIN_VALUE & local750) != 0L) {
													local3107 = true;
												}
												@Pc(4489) byte local4489 = Static97.aClass1_Sub17_Sub1_2.method2155();
												if (local3107) {
													if (Static213.anInt4208 == 0) {
														Static157.anInt3267 = -1;
														return true;
													}
													local750 &= Long.MAX_VALUE;
													for (local494 = 0; Static213.anInt4208 > local494 && (local750 != Static212.aClass1_Sub9Array1[local494].aLong173 || Static212.aClass1_Sub9Array1[local494].anInt937 != local134); local494++) {
													}
													if (local494 < Static213.anInt4208) {
														while (Static213.anInt4208 - 1 > local494) {
															Static212.aClass1_Sub9Array1[local494] = Static212.aClass1_Sub9Array1[local494 + 1];
															local494++;
														}
														Static213.anInt4208--;
														Static212.aClass1_Sub9Array1[Static213.anInt4208] = null;
													}
												} else {
													local3764 = Static97.aClass1_Sub17_Sub1_2.method2125();
													@Pc(4499) Class1_Sub9 local4499 = new Class1_Sub9();
													local4499.aLong173 = local750;
													local4499.aClass50_336 = Static130.method2183(local4499.aLong173);
													local4499.aClass50_332 = local3764;
													local4499.aByte3 = local4489;
													local4499.anInt937 = local134;
													for (local498 = Static213.anInt4208 - 1; local498 >= 0; local498--) {
														local502 = Static212.aClass1_Sub9Array1[local498].aClass50_336.method1220(local4499.aClass50_336);
														if (local502 == 0) {
															Static212.aClass1_Sub9Array1[local498].anInt937 = local134;
															Static212.aClass1_Sub9Array1[local498].aByte3 = local4489;
															Static212.aClass1_Sub9Array1[local498].aClass50_332 = local3764;
															Static185.anInt3847 = Static31.anInt594;
															if (local750 == Static148.aLong122) {
																Static146.aByte6 = local4489;
															}
															Static157.anInt3267 = -1;
															return true;
														}
														if (local502 < 0) {
															break;
														}
													}
													if (Static212.aClass1_Sub9Array1.length <= Static213.anInt4208) {
														Static157.anInt3267 = -1;
														return true;
													}
													for (local502 = Static213.anInt4208 - 1; local502 > local498; local502--) {
														Static212.aClass1_Sub9Array1[local502 + 1] = Static212.aClass1_Sub9Array1[local502];
													}
													if (Static213.anInt4208 == 0) {
														Static212.aClass1_Sub9Array1 = new Class1_Sub9[100];
													}
													Static212.aClass1_Sub9Array1[local498 + 1] = local4499;
													Static213.anInt4208++;
													if (Static148.aLong122 == local750) {
														Static146.aByte6 = local4489;
													}
												}
												Static185.anInt3847 = Static31.anInt594;
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 213) {
												local181 = Static97.aClass1_Sub17_Sub1_2.method2178();
												Static105.method1615(local181);
												Static188.anIntArray439[Static46.anInt950++ & 0x1F] = local181 & 0x7FFF;
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 168) {
												local181 = Static97.aClass1_Sub17_Sub1_2.method2142();
												local130 = Static97.aClass1_Sub17_Sub1_2.method2142();
												local134 = Static97.aClass1_Sub17_Sub1_2.method2142();
												local193 = Static97.aClass1_Sub17_Sub1_2.method2142();
												local197 = Static97.aClass1_Sub17_Sub1_2.method2178();
												Static116.aBooleanArray8[local181] = true;
												Static153.anIntArray329[local181] = local130;
												Static185.anIntArray431[local181] = local134;
												Static194.anIntArray445[local181] = local193;
												Static1.anIntArray10[local181] = local197;
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 164) {
												Static63.method972(false);
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 125) {
												local181 = Static97.aClass1_Sub17_Sub1_2.method2149();
												local130 = Static97.aClass1_Sub17_Sub1_2.method2139();
												Static224.method68(local130, local181);
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 195) {
												Static56.anInt1096 = Static97.aClass1_Sub17_Sub1_2.method2142();
												Static157.anInt3267 = -1;
												Static205.anInt4112 = Static31.anInt594;
												return true;
											} else if (Static157.anInt3267 == 232) {
												local750 = Static97.aClass1_Sub17_Sub1_2.method2172();
												local134 = Static97.aClass1_Sub17_Sub1_2.method2178();
												@Pc(4846) Class50 local4846 = Static219.method2418(local134).method1919(Static97.aClass1_Sub17_Sub1_2);
												Static181.method2964(local4846, local134, Static130.method2183(local750).method1218(), 19, null);
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 83) {
												local181 = Static97.aClass1_Sub17_Sub1_2.method2123();
												local130 = Static97.aClass1_Sub17_Sub1_2.method2140();
												local134 = Static97.aClass1_Sub17_Sub1_2.method2131();
												local193 = Static97.aClass1_Sub17_Sub1_2.method2131();
												if (local134 == 65535) {
													local134 = -1;
												}
												if (local193 == 65535) {
													local193 = -1;
												}
												for (local197 = local193; local197 <= local134; local197++) {
													@Pc(4908) long local4908 = (long) local197 + ((long) local130 << 32);
													@Pc(4913) Class1 local4913 = Static144.aClass90_14.method2819(local4908);
													if (local4913 != null) {
														local4913.method3525();
													}
													Static144.aClass90_14.method2817(new Class1_Sub5(local181), local4908);
												}
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 242) {
												Static214.anInt4249 = Static97.aClass1_Sub17_Sub1_2.method2142();
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 72) {
												if (Static217.anInt4289 == 0) {
													Static53.aClass50_379 = Static175.aClass50_1196;
												} else {
													Static53.aClass50_379 = Static97.aClass1_Sub17_Sub1_2.method2125();
												}
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 148) {
												@Pc(4972) byte[] local4972 = new byte[Static217.anInt4289];
												Static97.aClass1_Sub17_Sub1_2.method2190(local4972, Static217.anInt4289);
												Static124.method1979(Static20.method301(Static217.anInt4289, 0, local4972), true);
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 192) {
												local181 = Static97.aClass1_Sub17_Sub1_2.method2159();
												Static179.aClass116_7 = Static4.aClass87_1.method2691(local181);
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 227) {
												Static208.method2996(Static97.aClass1_Sub17_Sub1_2);
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 204) {
												Static82.method1205();
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 179) {
												local181 = Static97.aClass1_Sub17_Sub1_2.method2140();
												local130 = Static97.aClass1_Sub17_Sub1_2.method2178();
												if (local181 >= 0) {
													local263 = Static164.method2725(local181);
												} else {
													local263 = null;
												}
												if (local263 != null) {
													for (local193 = 0; local193 < local263.anIntArray392.length; local193++) {
														local263.anIntArray392[local193] = 0;
														local263.anIntArray401[local193] = 0;
													}
												}
												if (local181 < -70000) {
													local130 += 32768;
												}
												Static152.method2549(local130);
												local193 = Static97.aClass1_Sub17_Sub1_2.method2178();
												for (local197 = 0; local197 < local193; local197++) {
													local494 = Static97.aClass1_Sub17_Sub1_2.method2149();
													local488 = Static97.aClass1_Sub17_Sub1_2.method2128();
													if (local488 == 255) {
														local488 = Static97.aClass1_Sub17_Sub1_2.method2159();
													}
													if (local263 != null && local197 < local263.anIntArray392.length) {
														local263.anIntArray392[local197] = local494;
														local263.anIntArray401[local197] = local488;
													}
													Static102.method1585(local488, local197, local494 - 1, local130);
												}
												if (local263 != null) {
													Static66.method999(local263);
												}
												Static181.method2969();
												Static188.anIntArray439[Static46.anInt950++ & 0x1F] = local130 & 0x7FFF;
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 36) {
												Static201.anInt4066 = Static217.anInt4289 / 8;
												for (local181 = 0; local181 < Static201.anInt4066; local181++) {
													Static118.aLongArray5[local181] = Static97.aClass1_Sub17_Sub1_2.method2172();
													Static209.aClass50Array79[local181] = Static130.method2183(Static118.aLongArray5[local181]);
												}
												Static157.anInt3267 = -1;
												Static205.anInt4112 = Static31.anInt594;
												return true;
											} else if (Static157.anInt3267 == 161) {
												local126 = Static97.aClass1_Sub17_Sub1_2.method2125();
												@Pc(5214) Object[] local5214 = new Object[local126.method1249() + 1];
												for (local134 = local126.method1249() - 1; local134 >= 0; local134--) {
													if (local126.method1241(local134) == 115) {
														local5214[local134 + 1] = Static97.aClass1_Sub17_Sub1_2.method2125();
													} else {
														local5214[local134 + 1] = Integer.valueOf(Static97.aClass1_Sub17_Sub1_2.method2140());
													}
												}
												local5214[0] = Integer.valueOf(Static97.aClass1_Sub17_Sub1_2.method2140());
												@Pc(5270) Class1_Sub29 local5270 = new Class1_Sub29();
												local5270.anObjectArray33 = local5214;
												Static144.method2381(local5270);
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 20) {
												local181 = Static97.aClass1_Sub17_Sub1_2.method2129();
												local130 = Static97.aClass1_Sub17_Sub1_2.method2134();
												local134 = Static97.aClass1_Sub17_Sub1_2.method2131();
												method1754(local130);
												Static14.method196(local181, local134);
												Static157.anInt3267 = -1;
												return true;
											} else if (Static157.anInt3267 == 231) {
												local181 = Static97.aClass1_Sub17_Sub1_2.method2140();
												local130 = Static97.aClass1_Sub17_Sub1_2.method2167();
												local263 = Static164.method2725(local181);
												if (local263.anInt3606 != local130 || local130 == -1) {
													local263.anInt3606 = local130;
													local263.anInt3654 = 0;
													local263.anInt3636 = 0;
													Static66.method999(local263);
												}
												Static157.anInt3267 = -1;
												return true;
											} else {
												Static204.method3249(null, "T1 - " + Static157.anInt3267 + "," + Static134.anInt2778 + "," + Static60.anInt1181 + " - " + Static217.anInt4289);
												Static210.method3288();
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

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIIII)V")
	public static void method1753(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = arg3;
		Static107.method1641(arg0 - arg3, arg2, Static139.anIntArrayArray21[arg1], arg0 + arg3);
		@Pc(33) int local33 = -1;
		@Pc(36) int local36 = -arg3;
		while (local17 > local7) {
			local7++;
			local33 += 2;
			local36 += local33;
			if (local36 >= 0) {
				local17--;
				@Pc(57) int[] local57 = Static139.anIntArrayArray21[arg1 + local17];
				local36 -= local17 << 1;
				@Pc(70) int[] local70 = Static139.anIntArrayArray21[arg1 - local17];
				@Pc(74) int local74 = local7 + arg0;
				@Pc(79) int local79 = arg0 - local7;
				Static107.method1641(local79, arg2, local57, local74);
				Static107.method1641(local79, arg2, local70, local74);
			}
			@Pc(96) int local96 = arg0 + local17;
			@Pc(101) int local101 = arg0 - local17;
			@Pc(108) int[] local108 = Static139.anIntArrayArray21[arg1 + local7];
			@Pc(115) int[] local115 = Static139.anIntArrayArray21[arg1 - local7];
			Static107.method1641(local101, arg2, local108, local96);
			Static107.method1641(local101, arg2, local115, local96);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)V")
	private static void method1754(@OriginalArg(0) int arg0) {
		Static82.aClass75_10.method2240(new Class1_Sub5(arg0));
	}
}
