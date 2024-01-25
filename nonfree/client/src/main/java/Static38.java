import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Lclient!ij;")
	public static Class93 aClass93_13;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_11 = new Class109(5);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method598(@OriginalArg(0) String arg0) {
		return Static323.method5589(arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method599() {
		if (Static77.anInt1470 > 0) {
			Static77.anInt1470--;
		}
		if (Static151.anInt2973 > 1) {
			Static245.anInt4912 = Static190.anInt456;
			Static151.anInt2973--;
		}
		if (Static76.aBoolean101) {
			Static76.aBoolean101 = false;
			Static345.method5915();
			return;
		}
		if (!Static93.aBoolean128) {
			Static35.method575();
		}
		for (@Pc(35) int local35 = 0; local35 < 100 && Static219.method4008(); local35++) {
		}
		if (Static278.anInt5495 != 30) {
			return;
		}
		Static122.method2138(Static125.aClass5_Sub12_Sub2_3);
		@Pc(70) int local70;
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(123) boolean local123;
		@Pc(178) int local178;
		@Pc(185) int local185;
		@Pc(196) int local196;
		if (Static150.aClass5_Sub26_1 != null || Static102.aLong67 < Static340.method5863() - 2000L) {
			@Pc(67) boolean local67 = false;
			local70 = Static125.aClass5_Sub12_Sub2_3.anInt5731;
			for (@Pc(75) Class5_Sub26 local75 = (Class5_Sub26) Static121.aClass103_61.method2756(); local75 != null && Static125.aClass5_Sub12_Sub2_3.anInt5731 - local70 < 240; local75 = (Class5_Sub26) Static121.aClass103_61.method2748()) {
				local75.method6005();
				local93 = local75.method4483();
				if (local93 < 0) {
					local93 = 0;
				} else if (local93 > 65534) {
					local93 = 65534;
				}
				local108 = local75.method4478();
				if (local108 < 0) {
					local108 = 0;
				} else if (local108 > 65534) {
					local108 = 65534;
				}
				local123 = false;
				if (local75.method4483() == -1 && local75.method4478() == -1) {
					local123 = true;
					local108 = -1;
					local93 = -1;
				}
				if (local108 != Static42.anInt740 || Static288.anInt5649 != local93) {
					if (!local67) {
						Static125.aClass5_Sub12_Sub2_3.method5125(135);
						Static125.aClass5_Sub12_Sub2_3.method5089(0);
						local70 = Static125.aClass5_Sub12_Sub2_3.anInt5731;
						local67 = true;
					}
					local178 = local108 - Static42.anInt740;
					Static42.anInt740 = local108;
					local185 = local93 - Static288.anInt5649;
					Static288.anInt5649 = local93;
					local196 = (int) ((local75.method4482() - Static102.aLong67) / 20L);
					if (local196 < 8 && local178 >= -32 && local178 <= 31 && local185 >= -32 && local185 <= 31) {
						local178 += 32;
						local185 += 32;
						Static125.aClass5_Sub12_Sub2_3.method5084(local185 + (local196 << 12) + (local178 << 6));
					} else if (local196 < 32 && local178 >= -128 && local178 <= 127 && local185 >= -128 && local185 <= 127) {
						Static125.aClass5_Sub12_Sub2_3.method5089(local196 + 128);
						local185 += 128;
						local178 += 128;
						Static125.aClass5_Sub12_Sub2_3.method5084((local178 << 8) + local185);
					} else if (local196 < 32) {
						Static125.aClass5_Sub12_Sub2_3.method5089(local196 + 192);
						if (local123) {
							Static125.aClass5_Sub12_Sub2_3.method5070(Integer.MIN_VALUE);
						} else {
							Static125.aClass5_Sub12_Sub2_3.method5070(local93 << 16 | local108);
						}
					} else {
						Static125.aClass5_Sub12_Sub2_3.method5084(local196 + 57344);
						if (local123) {
							Static125.aClass5_Sub12_Sub2_3.method5070(Integer.MIN_VALUE);
						} else {
							Static125.aClass5_Sub12_Sub2_3.method5070(local93 << 16 | local108);
						}
					}
					Static102.aLong67 = local75.method4482();
				}
			}
			if (local67) {
				Static125.aClass5_Sub12_Sub2_3.method5111(Static125.aClass5_Sub12_Sub2_3.anInt5731 - local70);
			}
		}
		@Pc(373) int local373;
		@Pc(423) int local423;
		if (Static150.aClass5_Sub26_1 != null) {
			@Pc(357) long local357 = (Static150.aClass5_Sub26_1.method4482() - Static257.aLong173) / 50L;
			Static257.aLong173 = Static150.aClass5_Sub26_1.method4482();
			if (local357 > 32767L) {
				local357 = 32767L;
			}
			local373 = Static150.aClass5_Sub26_1.method4483();
			if (local373 < 0) {
				local373 = 0;
			} else if (local373 > 65535) {
				local373 = 65535;
			}
			local93 = Static150.aClass5_Sub26_1.method4478();
			if (local93 < 0) {
				local93 = 0;
			} else if (local93 > 65535) {
				local93 = 65535;
			}
			@Pc(409) byte local409 = 0;
			if (Static150.aClass5_Sub26_1.method4481() == 2) {
				local409 = 1;
			}
			local423 = (int) local357;
			Static125.aClass5_Sub12_Sub2_3.method5125(176);
			Static125.aClass5_Sub12_Sub2_3.method5084(local409 << 15 | local423);
			Static125.aClass5_Sub12_Sub2_3.method5082(local93 | local373 << 16);
		}
		@Pc(450) int local450;
		if (Static258.anInt5091 > 0) {
			local450 = 0;
			for (local70 = 0; local70 < Static258.anInt5091; local70++) {
				if (Static55.aClass19Array3[local70].method426()) {
					local450++;
				}
			}
			if (local450 > 0) {
				Static125.aClass5_Sub12_Sub2_3.method5125(154);
				if (local450 > 75) {
					local450 = 75;
				}
				Static125.aClass5_Sub12_Sub2_3.method5089(local450 * 3);
				for (local373 = 0; local373 < Static258.anInt5091; local373++) {
					@Pc(494) Class19 local494 = Static55.aClass19Array3[local373];
					if (local494.method426()) {
						@Pc(507) long local507 = (local494.method424() - Static229.aLong161) / 50L;
						Static229.aLong161 = local494.method424();
						if (local507 > 65535L) {
							local507 = 65535L;
						}
						Static125.aClass5_Sub12_Sub2_3.method5089(local494.method429());
						Static125.aClass5_Sub12_Sub2_3.method5084((int) local507);
					}
				}
			}
		}
		if (Static32.anInt631 > 0) {
			Static32.anInt631--;
		}
		if (Static289.aBoolean472 && Static32.anInt631 <= 0) {
			Static289.aBoolean472 = false;
			Static32.anInt631 = 20;
			Static125.aClass5_Sub12_Sub2_3.method5125(166);
			Static125.aClass5_Sub12_Sub2_3.method5084((int) Static164.aFloat24 >> 3);
			Static125.aClass5_Sub12_Sub2_3.method5095((int) Static29.aFloat7 >> 3);
		}
		if (Static87.aBoolean113 && !Static73.aBoolean94) {
			Static73.aBoolean94 = true;
			Static125.aClass5_Sub12_Sub2_3.method5125(223);
			Static125.aClass5_Sub12_Sub2_3.method5089(1);
		}
		if (!Static87.aBoolean113 && Static73.aBoolean94) {
			Static73.aBoolean94 = false;
			Static125.aClass5_Sub12_Sub2_3.method5125(223);
			Static125.aClass5_Sub12_Sub2_3.method5089(0);
		}
		if (!Static157.aBoolean232) {
			Static125.aClass5_Sub12_Sub2_3.method5125(234);
			Static125.aClass5_Sub12_Sub2_3.method5096(Static141.method2509());
			Static157.aBoolean232 = true;
		}
		if (Static178.aClass174ArrayArrayArray3 != null) {
			if (Static53.anInt992 == 2) {
				Static205.method3776();
			} else if (Static53.anInt992 == 3) {
				Static85.method1516();
			}
		}
		if (Static155.aBoolean230) {
			Static155.aBoolean230 = false;
		} else {
			Static215.aFloat55 /= 2.0F;
		}
		if (Static236.aBoolean348) {
			Static236.aBoolean348 = false;
		} else {
			Static192.aFloat34 /= 2.0F;
		}
		Static181.method3305();
		if (Static278.anInt5495 != 30) {
			return;
		}
		Static117.method2044();
		Static43.method6037();
		Static17.method312();
		Static347.anInt6686++;
		if (Static347.anInt6686 > 750) {
			Static345.method5915();
			return;
		}
		Static92.method1658();
		Static156.method2786();
		Static172.method4053();
		for (local450 = Static338.method6007(true); local450 != -1; local450 = Static338.method6007(false)) {
			Static197.method3479(local450);
			Static287.anIntArray548[Static70.anInt1369++ & 0x1F] = local450;
		}
		@Pc(780) Class201 local780;
		for (@Pc(729) Class5_Sub1_Sub2 local729 = Static287.method5004(); local729 != null; local729 = Static287.method5004()) {
			local373 = local729.method853();
			local93 = local729.method849();
			if (local373 == 1) {
				Static234.anIntArray427[local93] = local729.anInt996;
				Static235.aBoolean381 |= Static346.aBooleanArray25[local93];
				Static354.anIntArray642[Static147.anInt78++ & 0x1F] = local93;
			} else if (local373 == 2) {
				Static182.aStringArray43[local93] = local729.aString7;
				Static280.anIntArray533[Static332.anInt6833++ & 0x1F] = local93;
			} else if (local373 == 3) {
				local780 = Static262.method4616(local93);
				if (!local729.aString7.equals(local780.aString60)) {
					local780.aString60 = local729.aString7;
					Static189.method3383(local780);
				}
			} else if (local373 == 4) {
				local780 = Static262.method4616(local93);
				local423 = local729.anInt996;
				local178 = local729.anInt994;
				local185 = local729.anInt991;
				if (local780.anInt6556 != local423 || local178 != local780.anInt6511 || local185 != local780.anInt6533) {
					local780.anInt6556 = local423;
					local780.anInt6533 = local185;
					local780.anInt6511 = local178;
					Static189.method3383(local780);
				}
			} else if (local373 == 5) {
				local780 = Static262.method4616(local93);
				if (local780.anInt6526 != local729.anInt996 || local729.anInt996 == -1) {
					local780.anInt6526 = local729.anInt996;
					local780.anInt6490 = 0;
					local780.anInt6534 = 0;
					local780.anInt6549 = 1;
					Static189.method3383(local780);
				}
			} else if (local373 == 6) {
				local108 = local729.anInt996;
				local423 = local108 >> 10 & 0x1F;
				local178 = local108 >> 5 & 0x1F;
				local185 = local108 & 0x1F;
				local196 = (local178 << 11) + ((local423 << 19) + (local185 << 3));
				@Pc(1218) Class201 local1218 = Static262.method4616(local93);
				if (local1218.anInt6488 != local196) {
					local1218.anInt6488 = local196;
					Static189.method3383(local1218);
				}
			} else if (local373 == 7) {
				local780 = Static262.method4616(local93);
				local123 = local729.anInt996 == 1;
				if (local123 != local780.aBoolean564) {
					local780.aBoolean564 = local123;
					Static189.method3383(local780);
				}
			} else if (local373 == 8) {
				local780 = Static262.method4616(local93);
				if (local729.anInt996 != local780.anInt6484 || local729.anInt994 != local780.anInt6561 || local780.anInt6524 != local729.anInt991) {
					local780.anInt6524 = local729.anInt991;
					local780.anInt6561 = local729.anInt994;
					local780.anInt6484 = local729.anInt996;
					if (local780.anInt6509 != -1) {
						if (local780.anInt6519 > 0) {
							local780.anInt6524 = local780.anInt6524 * 32 / local780.anInt6519;
						} else if (local780.anInt6513 > 0) {
							local780.anInt6524 = local780.anInt6524 * 32 / local780.anInt6513;
						}
					}
					Static189.method3383(local780);
				}
			} else if (local373 == 9) {
				local780 = Static262.method4616(local93);
				if (local780.anInt6509 != local729.anInt996 || local729.anInt994 != local780.anInt6499) {
					local780.anInt6499 = local729.anInt994;
					local780.anInt6509 = local729.anInt996;
					Static189.method3383(local780);
				}
			} else if (local373 == 10) {
				local780 = Static262.method4616(local93);
				if (local729.anInt996 != local780.anInt6503 || local780.anInt6563 != local729.anInt994 || local729.anInt991 != local780.anInt6538) {
					local780.anInt6503 = local729.anInt996;
					local780.anInt6538 = local729.anInt991;
					local780.anInt6563 = local729.anInt994;
					Static189.method3383(local780);
				}
			} else if (local373 == 11) {
				local780 = Static262.method4616(local93);
				local780.anInt6516 = local780.anInt6489 = local729.anInt994;
				local780.aByte70 = 0;
				local780.aByte72 = 0;
				local780.anInt6554 = local780.anInt6525 = local729.anInt996;
				Static189.method3383(local780);
			} else if (local373 == 12) {
				local780 = Static262.method4616(local93);
				local423 = local729.anInt996;
				if (local780 != null && local780.anInt6559 == 0) {
					if (local780.anInt6539 - local780.anInt6510 < local423) {
						local423 = local780.anInt6539 - local780.anInt6510;
					}
					if (local423 < 0) {
						local423 = 0;
					}
					if (local423 != local780.anInt6543) {
						local780.anInt6543 = local423;
						Static189.method3383(local780);
					}
				}
			} else if (local373 == 14) {
				local780 = Static262.method4616(local93);
				local780.anInt6495 = local729.anInt996;
			} else if (local373 == 15) {
				Static159.anInt3128 = local729.anInt994;
				Static48.aBoolean65 = true;
				Static224.anInt4437 = local729.anInt996;
			} else if (local373 == 16) {
				local780 = Static262.method4616(local93);
				local780.anInt6523 = local729.anInt996;
			}
		}
		Static26.anInt519++;
		if (Static208.anInt4116 != 0) {
			Static156.anInt3028 += 20;
			if (Static156.anInt3028 >= 400) {
				Static208.anInt4116 = 0;
			}
		}
		if (Static325.aClass201_11 != null) {
			Static53.anInt995++;
			if (Static53.anInt995 >= 15) {
				Static189.method3383(Static325.aClass201_11);
				Static325.aClass201_11 = null;
			}
		}
		Static188.aClass201_7 = null;
		Static205.aBoolean336 = false;
		Static322.aBoolean41 = false;
		Static14.aClass201_1 = null;
		Static80.method1434(null, -1, -1);
		Static36.method578(-1, -1, null);
		Static312.method5453();
		Static190.anInt456++;
		if (Static326.aBoolean529) {
			Static125.aClass5_Sub12_Sub2_3.method5125(105);
			Static125.aClass5_Sub12_Sub2_3.method5108(Static338.anInt6790 | Static146.anInt2894 << 14 | Static174.anInt3498 << 28);
			Static326.aBoolean529 = false;
		}
		while (true) {
			@Pc(1356) Class5_Sub17 local1356;
			@Pc(1361) Class201 local1361;
			do {
				local1356 = (Class5_Sub17) Static309.aClass103_146.method2743();
				if (local1356 == null) {
					while (true) {
						do {
							local1356 = (Class5_Sub17) Static229.aClass103_111.method2743();
							if (local1356 == null) {
								while (true) {
									do {
										local1356 = (Class5_Sub17) Static144.aClass103_74.method2743();
										if (local1356 == null) {
											if (Static188.aClass201_7 == null) {
												Static284.anInt5599 = 0;
											}
											if (Static204.aClass201_8 != null) {
												Static5.method89();
											}
											if (Static262.anInt5151 > 0 && Static174.aClass2_1.method1425(82) && Static174.aClass2_1.method1425(81) && Static156.anInt3027 != 0) {
												local373 = Static239.anInt4811 - Static156.anInt3027;
												if (local373 < 0) {
													local373 = 0;
												} else if (local373 > 3) {
													local373 = 3;
												}
												Static283.method4923(local373, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0] + Static172.anInt4394, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0] + Static12.anInt3797);
											}
											Static288.method5008();
											for (local373 = 0; local373 < 5; local373++) {
												@Pc(1558) int local1558 = Static118.anIntArray208[local373]++;
											}
											if (Static235.aBoolean381 && Static135.aLong29 < Static340.method5863() - 60000L) {
												Static246.method4391();
											}
											Static27.anInt545++;
											if (Static27.anInt545 > 500) {
												Static27.anInt545 = 0;
												local93 = (int) (Math.random() * 8.0D);
												if ((local93 & 0x1) == 1) {
													Static86.anInt1611 += Static119.anInt3764;
												}
												if ((local93 & 0x2) == 2) {
													Static349.anInt6701 += Static23.anInt483;
												}
												if ((local93 & 0x4) == 4) {
													Static298.anInt1898 += Static69.anInt1352;
												}
											}
											if (Static86.anInt1611 < -50) {
												Static119.anInt3764 = 2;
											}
											if (Static86.anInt1611 > 50) {
												Static119.anInt3764 = -2;
											}
											if (Static349.anInt6701 < -55) {
												Static23.anInt483 = 2;
											}
											if (Static349.anInt6701 > 55) {
												Static23.anInt483 = -2;
											}
											if (Static298.anInt1898 < -40) {
												Static69.anInt1352 = 1;
											}
											Static78.anInt1477++;
											if (Static298.anInt1898 > 40) {
												Static69.anInt1352 = -1;
											}
											if (Static78.anInt1477 > 500) {
												Static78.anInt1477 = 0;
												local93 = (int) (Math.random() * 8.0D);
												if ((local93 & 0x2) == 2) {
													Static9.anInt191 += Static211.anInt4170;
												}
												if ((local93 & 0x1) == 1) {
													Static170.anInt3407 += Static86.anInt1612;
												}
											}
											if (Static170.anInt3407 < -60) {
												Static86.anInt1612 = 2;
											}
											if (Static9.anInt191 < -20) {
												Static211.anInt4170 = 1;
											}
											if (Static170.anInt3407 > 60) {
												Static86.anInt1612 = -2;
											}
											if (Static9.anInt191 > 10) {
												Static211.anInt4170 = -1;
											}
											Static36.anInt657++;
											if (Static36.anInt657 > 50) {
												Static125.aClass5_Sub12_Sub2_3.method5125(57);
											}
											if (Static194.aBoolean297) {
												Static119.method3394();
												Static194.aBoolean297 = false;
											}
											try {
												if (Static155.aClass41_18 != null && Static125.aClass5_Sub12_Sub2_3.anInt5731 > 0) {
													Static155.aClass41_18.method829(Static125.aClass5_Sub12_Sub2_3.aByteArray90, Static125.aClass5_Sub12_Sub2_3.anInt5731);
													Static36.anInt657 = 0;
													Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
													return;
												}
												return;
											} catch (@Pc(1771) IOException local1771) {
												Static345.method5915();
												return;
											}
										}
										local1361 = local1356.aClass201_3;
										if (local1361.anInt6548 < 0) {
											break;
										}
										local780 = Static262.method4616(local1361.anInt6491);
									} while (local780 == null || local780.aClass201Array121 == null || local1361.anInt6548 >= local780.aClass201Array121.length || local1361 != local780.aClass201Array121[local1361.anInt6548]);
									Static108.method1907(local1356);
								}
							}
							local1361 = local1356.aClass201_3;
							if (local1361.anInt6548 < 0) {
								break;
							}
							local780 = Static262.method4616(local1361.anInt6491);
						} while (local780 == null || local780.aClass201Array121 == null || local780.aClass201Array121.length <= local1361.anInt6548 || local1361 != local780.aClass201Array121[local1361.anInt6548]);
						Static108.method1907(local1356);
					}
				}
				local1361 = local1356.aClass201_3;
				if (local1361.anInt6548 < 0) {
					break;
				}
				local780 = Static262.method4616(local1361.anInt6491);
			} while (local780 == null || local780.aClass201Array121 == null || local1361.anInt6548 >= local780.aClass201Array121.length || local780.aClass201Array121[local1361.anInt6548] != local1361);
			Static108.method1907(local1356);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method601() {
		Static167.aClass109_37.method2858();
	}
}
