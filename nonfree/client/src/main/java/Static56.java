import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array1 = new Class5[29];

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public static int anInt1547 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method1071() {
		if (Static247.aBoolean268) {
			return;
		}
		if (Static138.aBoolean180) {
			Static158.aFloat32 = (int) Static158.aFloat32 + 47 & 0xFFFFFFF0;
		} else {
			Static201.aFloat40 += (12.0F - Static201.aFloat40) / 2.0F;
		}
		Static89.aBoolean139 = true;
		Static247.aBoolean268 = true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method1072() {
		if (Static69.anInt1874 > 1) {
			Static69.anInt1874--;
			Static22.anInt2835 = Static243.anInt5249;
		}
		if (Static143.anInt3466 > 0) {
			Static143.anInt3466--;
		}
		if (Static203.aBoolean224) {
			Static203.aBoolean224 = false;
			Static250.method4059();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static4.method76(); local29++) {
		}
		if (Static224.anInt4922 != 30) {
			return;
		}
		Static5.method88(Static171.aClass1_Sub13_Sub1_3);
		@Pc(55) Object local55 = Static120.aClass27_1.anObject4;
		@Pc(85) int local85;
		@Pc(82) int local82;
		@Pc(87) int local87;
		@Pc(103) int local103;
		@Pc(108) int local108;
		@Pc(186) int local186;
		synchronized (Static120.aClass27_1.anObject4) {
			if (!Static213.aBoolean227) {
				Static120.aClass27_1.anInt1017 = 0;
			} else if (Static143.anInt3469 != 0 || Static120.aClass27_1.anInt1017 >= 40) {
				Static171.aClass1_Sub13_Sub1_3.method1825(97);
				Static171.aClass1_Sub13_Sub1_3.method1766(0);
				local82 = 0;
				local85 = Static171.aClass1_Sub13_Sub1_3.anInt2395;
				for (local87 = 0; Static120.aClass27_1.anInt1017 > local87 && Static171.aClass1_Sub13_Sub1_3.anInt2395 - local85 < 240; local87++) {
					local103 = Static120.aClass27_1.anIntArray80[local87];
					local108 = Static120.aClass27_1.anIntArray79[local87];
					if (local103 < 0) {
						local103 = 0;
					} else if (local103 > 65534) {
						local103 = 65534;
					}
					if (local108 < 0) {
						local108 = 0;
					} else if (local108 > 65534) {
						local108 = 65534;
					}
					local82++;
					@Pc(139) boolean local139 = false;
					if (Static120.aClass27_1.anIntArray80[local87] == -1 && Static120.aClass27_1.anIntArray79[local87] == -1) {
						local139 = true;
						local108 = -1;
						local103 = -1;
					}
					if (local108 != Static102.anInt2770 || Static146.anInt3551 != local103) {
						local186 = local108 - Static102.anInt2770;
						@Pc(191) int local191 = local103 - Static146.anInt3551;
						Static102.anInt2770 = local108;
						Static146.anInt3551 = local103;
						if (Static252.anInt5357 < 8 && local186 >= -32 && local186 <= 31 && local191 >= -32 && local191 <= 31) {
							local186 += 32;
							local191 += 32;
							Static171.aClass1_Sub13_Sub1_3.method1789(local191 + (local186 << 6) + (Static252.anInt5357 << 12));
							Static252.anInt5357 = 0;
						} else if (Static252.anInt5357 < 32 && local186 >= -128 && local186 <= 127 && local191 >= -128 && local191 <= 127) {
							local191 += 128;
							local186 += 128;
							Static171.aClass1_Sub13_Sub1_3.method1766(Static252.anInt5357 + 128);
							Static171.aClass1_Sub13_Sub1_3.method1789(local191 + (local186 << 8));
							Static252.anInt5357 = 0;
						} else if (Static252.anInt5357 < 32) {
							Static171.aClass1_Sub13_Sub1_3.method1766(Static252.anInt5357 + 192);
							if (local139) {
								Static171.aClass1_Sub13_Sub1_3.method1754(Integer.MIN_VALUE);
							} else {
								Static171.aClass1_Sub13_Sub1_3.method1754(local108 | local103 << 16);
							}
							Static252.anInt5357 = 0;
						} else {
							Static171.aClass1_Sub13_Sub1_3.method1789(Static252.anInt5357 + 57344);
							if (local139) {
								Static171.aClass1_Sub13_Sub1_3.method1754(Integer.MIN_VALUE);
							} else {
								Static171.aClass1_Sub13_Sub1_3.method1754(local108 | local103 << 16);
							}
							Static252.anInt5357 = 0;
						}
					} else if (Static252.anInt5357 < 2047) {
						Static252.anInt5357++;
					}
				}
				Static171.aClass1_Sub13_Sub1_3.method1785(Static171.aClass1_Sub13_Sub1_3.anInt2395 - local85);
				if (local82 < Static120.aClass27_1.anInt1017) {
					Static120.aClass27_1.anInt1017 -= local82;
					for (local103 = 0; local103 < Static120.aClass27_1.anInt1017; local103++) {
						Static120.aClass27_1.anIntArray79[local103] = Static120.aClass27_1.anIntArray79[local103 + local82];
						Static120.aClass27_1.anIntArray80[local103] = Static120.aClass27_1.anIntArray80[local82 + local103];
					}
				} else {
					Static120.aClass27_1.anInt1017 = 0;
				}
			}
		}
		if (Static143.anInt3469 != 0) {
			@Pc(411) long local411 = (Static100.aLong92 - Static157.aLong118) / 50L;
			Static157.aLong118 = Static100.aLong92;
			local85 = Static133.anInt3300;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 65535) {
				local85 = 65535;
			}
			local82 = Static256.anInt5442;
			@Pc(432) byte local432 = 0;
			if (local411 > 32767L) {
				local411 = 32767L;
			}
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 65535) {
				local82 = 65535;
			}
			local103 = (int) local411;
			if (Static143.anInt3469 == 2) {
				local432 = 1;
			}
			Static171.aClass1_Sub13_Sub1_3.method1825(226);
			Static171.aClass1_Sub13_Sub1_3.method1808(local85 << 16 | local82);
			Static171.aClass1_Sub13_Sub1_3.method1759(local432 << 15 | local103);
		}
		if (Static132.anInt3291 > 0) {
			Static132.anInt3291--;
		}
		if (Static89.aBoolean139 && Static132.anInt3291 <= 0) {
			Static89.aBoolean139 = false;
			Static132.anInt3291 = 20;
			Static171.aClass1_Sub13_Sub1_3.method1825(197);
			Static171.aClass1_Sub13_Sub1_3.method1759((int) Static230.aFloat51);
			Static171.aClass1_Sub13_Sub1_3.method1807((int) Static158.aFloat32);
		}
		if (Static33.aBoolean264 && !Static15.aBoolean29) {
			Static15.aBoolean29 = true;
			Static171.aClass1_Sub13_Sub1_3.method1825(158);
			Static171.aClass1_Sub13_Sub1_3.method1766(1);
		}
		if (!Static33.aBoolean264 && Static15.aBoolean29) {
			Static15.aBoolean29 = false;
			Static171.aClass1_Sub13_Sub1_3.method1825(158);
			Static171.aClass1_Sub13_Sub1_3.method1766(0);
		}
		if (!Static2.aBoolean2) {
			Static171.aClass1_Sub13_Sub1_3.method1825(147);
			Static171.aClass1_Sub13_Sub1_3.method1782(Static124.method2395());
			Static2.aBoolean2 = true;
		}
		if (Static252.aBoolean273) {
			Static252.aBoolean273 = false;
		} else {
			Static161.aFloat34 /= 2.0F;
		}
		if (Static247.aBoolean268) {
			Static247.aBoolean268 = false;
		} else {
			Static201.aFloat40 /= 2.0F;
		}
		Static10.method189();
		if (Static224.anInt4922 != 30) {
			return;
		}
		Static248.method4048();
		Static175.method3002();
		Static85.method1838();
		Static196.anInt1185++;
		if (Static196.anInt1185 > 750) {
			Static250.method4059();
			return;
		}
		Static87.method1861();
		method1075();
		Static225.method3388();
		if (Static68.aClass122_5 != null) {
			Static29.method581();
		}
		for (@Pc(642) int local642 = Static208.method3461(true); local642 != -1; local642 = Static208.method3461(false)) {
			Static84.method1819(local642);
			Static214.anIntArray367[Static17.anInt621++ & 0x1F] = local642;
		}
		@Pc(731) int local731;
		for (@Pc(673) Class1_Sub2_Sub18 local673 = Static84.method1818(); local673 != null; local673 = Static84.method1818()) {
			local85 = local673.method3806();
			local82 = local673.method3812();
			if (local85 == 1) {
				Static155.anIntArray274[local82] = local673.anInt5009;
				Static74.anIntArray153[Static54.anInt1510++ & 0x1F] = local82;
			} else if (local85 == 2) {
				Static84.aStringArray14[local82] = local673.aString359;
				Static30.anIntArray77[Static30.anInt926++ & 0x1F] = local82;
			} else {
				@Pc(722) Class122 local722;
				if (local85 == 3) {
					local722 = Static206.method3444(local82);
					if (!local673.aString359.equals(local722.aString329)) {
						local722.aString329 = local673.aString359;
						Static257.method4146(local722);
					}
				} else if (local85 == 4) {
					local722 = Static206.method3444(local82);
					local103 = local673.anInt5009;
					local108 = local673.anInt5015;
					local731 = local673.anInt5008;
					if (local103 != local722.anInt4651 || local108 != local722.anInt4676 || local731 != local722.anInt4731) {
						local722.anInt4651 = local103;
						local722.anInt4676 = local108;
						local722.anInt4731 = local731;
						Static257.method4146(local722);
					}
				} else if (local85 == 5) {
					local722 = Static206.method3444(local82);
					if (local722.anInt4680 != local673.anInt5009 || local673.anInt5009 == -1) {
						local722.anInt4680 = local673.anInt5009;
						local722.anInt4666 = 0;
						local722.anInt4647 = 1;
						local722.anInt4675 = 0;
						Static257.method4146(local722);
					}
				} else if (local85 == 6) {
					local87 = local673.anInt5009;
					local103 = local87 >> 10 & 0x1F;
					@Pc(782) Class122 local782 = Static206.method3444(local82);
					local108 = local87 >> 5 & 0x1F;
					local731 = local87 & 0x1F;
					local186 = (local108 << 11) + (local103 << 19) + (local731 << 3);
					if (local782.anInt4719 != local186) {
						local782.anInt4719 = local186;
						Static257.method4146(local782);
					}
				} else if (local85 == 7) {
					local722 = Static206.method3444(local82);
					@Pc(1092) boolean local1092 = local673.anInt5009 == 1;
					if (local1092 != local722.aBoolean238) {
						local722.aBoolean238 = local1092;
						Static257.method4146(local722);
					}
				} else if (local85 == 8) {
					local722 = Static206.method3444(local82);
					if (local673.anInt5009 != local722.anInt4660 || local673.anInt5015 != local722.anInt4661 || local673.anInt5008 != local722.anInt4644) {
						local722.anInt4660 = local673.anInt5009;
						local722.anInt4644 = local673.anInt5008;
						if (local722.anInt4682 != -1) {
							if (local722.anInt4706 > 0) {
								local722.anInt4644 = local722.anInt4644 * 32 / local722.anInt4706;
							} else if (local722.anInt4650 > 0) {
								local722.anInt4644 = local722.anInt4644 * 32 / local722.anInt4650;
							}
						}
						local722.anInt4661 = local673.anInt5015;
						Static257.method4146(local722);
					}
				} else if (local85 == 9) {
					local722 = Static206.method3444(local82);
					if (local722.anInt4682 != local673.anInt5009 || local673.anInt5015 != local722.anInt4707) {
						local722.anInt4707 = local673.anInt5015;
						local722.anInt4682 = local673.anInt5009;
						Static257.method4146(local722);
					}
				} else if (local85 == 10) {
					local722 = Static206.method3444(local82);
					if (local673.anInt5009 != local722.anInt4684 || local673.anInt5015 != local722.anInt4657 || local722.anInt4700 != local673.anInt5008) {
						local722.anInt4684 = local673.anInt5009;
						local722.anInt4657 = local673.anInt5015;
						local722.anInt4700 = local673.anInt5008;
						Static257.method4146(local722);
					}
				} else if (local85 == 11) {
					local722 = Static206.method3444(local82);
					local722.anInt4691 = local722.anInt4678 = local673.anInt5015;
					local722.aByte17 = 0;
					local722.anInt4711 = local722.anInt4649 = local673.anInt5009;
					local722.aByte18 = 0;
					Static257.method4146(local722);
				} else if (local85 == 12) {
					local722 = Static206.method3444(local82);
					local103 = local673.anInt5009;
					if (local722 != null && local722.anInt4656 == 0) {
						if (local103 > local722.anInt4715 - local722.anInt4726) {
							local103 = local722.anInt4715 - local722.anInt4726;
						}
						if (local103 < 0) {
							local103 = 0;
						}
						if (local103 != local722.anInt4653) {
							local722.anInt4653 = local103;
							Static257.method4146(local722);
						}
					}
				} else if (local85 == 13) {
					local722 = Static206.method3444(local82);
					local722.anInt4690 = local673.anInt5009;
				}
			}
		}
		Static37.anInt999++;
		if (Static171.anInt3982 != 0) {
			Static24.anInt805 += 20;
			if (Static24.anInt805 >= 400) {
				Static171.anInt3982 = 0;
			}
		}
		if (Static42.aClass122_3 != null) {
			Static68.anInt1401++;
			if (Static68.anInt1401 >= 15) {
				Static257.method4146(Static42.aClass122_3);
				Static42.aClass122_3 = null;
			}
		}
		@Pc(1285) Class122 local1285;
		if (Static156.aClass122_12 != null) {
			Static257.method4146(Static156.aClass122_12);
			if (Static95.anInt2635 + 5 < Static71.anInt1930 || Static71.anInt1930 < Static95.anInt2635 - 5 || Static240.anInt5167 > Static2.anInt37 + 5 || Static240.anInt5167 < Static2.anInt37 - 5) {
				Static238.aBoolean262 = true;
			}
			Static96.anInt2666++;
			if (Static248.anInt5322 == 0) {
				if (Static238.aBoolean262 && Static96.anInt2666 >= 5) {
					if (Static156.aClass122_12 == Static194.aClass122_14 && Static241.anInt5183 != Static251.anInt5353) {
						local1285 = Static156.aClass122_12;
						@Pc(1287) byte local1287 = 0;
						if (Static182.anInt4172 == 1 && local1285.anInt4672 == 206) {
							local1287 = 1;
						}
						if (local1285.anIntArray362[Static251.anInt5353] <= 0) {
							local1287 = 0;
						}
						if (Static39.method702(local1285).method3654()) {
							local87 = Static241.anInt5183;
							local103 = Static251.anInt5353;
							local1285.anIntArray362[local103] = local1285.anIntArray362[local87];
							local1285.anIntArray360[local103] = local1285.anIntArray360[local87];
							local1285.anIntArray362[local87] = -1;
							local1285.anIntArray360[local87] = 0;
						} else if (local1287 == 1) {
							local87 = Static241.anInt5183;
							local103 = Static251.anInt5353;
							while (local103 != local87) {
								if (local87 > local103) {
									local1285.method3529(local87 - 1, local87);
									local87--;
								} else if (local87 < local103) {
									local1285.method3529(local87 + 1, local87);
									local87++;
								}
							}
						} else {
							local1285.method3529(Static251.anInt5353, Static241.anInt5183);
						}
						Static171.aClass1_Sub13_Sub1_3.method1825(106);
						Static171.aClass1_Sub13_Sub1_3.method1759(Static251.anInt5353);
						Static171.aClass1_Sub13_Sub1_3.method1807(Static241.anInt5183);
						Static171.aClass1_Sub13_Sub1_3.method1806(local1287);
						Static171.aClass1_Sub13_Sub1_3.method1808(Static156.aClass122_12.anInt4686);
					}
				} else if ((Static15.anInt527 == 1 || Static143.method2604(Static230.anInt5417 - 1)) && Static230.anInt5417 > 2) {
					Static249.method4057();
				} else if (Static230.anInt5417 > 0) {
					Static45.method949();
				}
				Static156.aClass122_12 = null;
				Static68.anInt1401 = 10;
				Static143.anInt3469 = 0;
			}
		}
		Static150.aClass122_13 = null;
		Static128.anInt3218 = 0;
		Static66.aBoolean102 = false;
		Static51.aBoolean85 = false;
		local1285 = Static155.aClass122_11;
		Static155.aClass122_11 = null;
		@Pc(1438) Class122 local1438 = Static20.aClass122_1;
		Static20.aClass122_1 = null;
		while (Static136.method2539() && Static128.anInt3218 < 128) {
			Static107.anIntArray211[Static128.anInt3218] = Static128.anInt3220;
			Static90.anIntArray182[Static128.anInt3218] = Static261.aChar4;
			Static128.anInt3218++;
		}
		Static68.aClass122_5 = null;
		if (Static140.anInt3388 != -1) {
			Static79.method1582(0, 0, Static200.anInt4411, 0, Static251.anInt5352, 0, Static140.anInt3388);
		}
		Static243.anInt5249++;
		while (true) {
			@Pc(1501) Class122 local1501;
			@Pc(1485) Class1_Sub30 local1485;
			@Pc(1490) Class122 local1490;
			do {
				local1485 = (Class1_Sub30) Static168.aClass3_16.method37();
				if (local1485 == null) {
					while (true) {
						do {
							local1485 = (Class1_Sub30) Static251.aClass3_24.method37();
							if (local1485 == null) {
								while (true) {
									do {
										local1485 = (Class1_Sub30) Static29.aClass3_4.method37();
										if (local1485 == null) {
											if (Static68.aClass122_5 == null) {
												Static48.anInt1409 = 0;
											}
											if (Static63.aClass122_7 != null) {
												Static45.method950();
											}
											if (Static203.anInt4493 > 0 && Static124.aBooleanArray7[82] && Static124.aBooleanArray7[81] && Static175.anInt4030 != 0) {
												local87 = Static137.anInt3321 - Static175.anInt4030;
												if (local87 < 0) {
													local87 = 0;
												} else if (local87 > 3) {
													local87 = 3;
												}
												Static202.method3369(Static29.anInt907 + Static83.aClass9_Sub1_Sub1_1.anIntArray41[0], Static64.anInt1786 + Static83.aClass9_Sub1_Sub1_1.anIntArray43[0], local87);
											}
											if (Static203.anInt4493 > 0 && Static124.aBooleanArray7[82] && Static124.aBooleanArray7[81]) {
												if (Static58.anInt1619 != -1) {
													Static202.method3369(Static29.anInt907 + Static266.anInt5559, Static58.anInt1619 + Static64.anInt1786, Static137.anInt3321);
												}
												Static215.anInt4736 = 0;
												Static120.anInt3093 = 0;
											} else if (Static120.anInt3093 == 2) {
												if (Static58.anInt1619 != -1) {
													Static171.aClass1_Sub13_Sub1_3.method1825(5);
													Static171.aClass1_Sub13_Sub1_3.method1796(Static64.anInt1786 + Static58.anInt1619);
													Static171.aClass1_Sub13_Sub1_3.method1808(Static167.anInt3917);
													Static171.aClass1_Sub13_Sub1_3.method1796(Static266.anInt5559 + Static29.anInt907);
													Static171.aClass1_Sub13_Sub1_3.method1807(Static161.anInt3798);
													Static171.anInt3982 = 1;
													Static223.anInt4901 = Static133.anInt3300;
													Static24.anInt805 = 0;
													Static266.anInt5550 = Static256.anInt5442;
												}
												Static120.anInt3093 = 0;
											} else if (Static215.anInt4736 == 2) {
												if (Static58.anInt1619 != -1) {
													Static171.aClass1_Sub13_Sub1_3.method1825(96);
													Static171.aClass1_Sub13_Sub1_3.method1789(Static266.anInt5559 + Static29.anInt907);
													Static171.aClass1_Sub13_Sub1_3.method1759(Static58.anInt1619 + Static64.anInt1786);
													Static24.anInt805 = 0;
													Static266.anInt5550 = Static256.anInt5442;
													Static223.anInt4901 = Static133.anInt3300;
													Static171.anInt3982 = 1;
												}
												Static215.anInt4736 = 0;
											} else if (Static58.anInt1619 != -1 && Static120.anInt3093 == 0 && Static215.anInt4736 == 0) {
												Static228.method3804(0, (Static58.anInt1619 << 1) + 1 - Static83.aClass9_Sub1_Sub1_1.method208() >> 1, (Static266.anInt5559 << 1) + 1 - Static83.aClass9_Sub1_Sub1_1.method208() >> 1);
												Static171.anInt3982 = 1;
												Static223.anInt4901 = Static133.anInt3300;
												Static266.anInt5550 = Static256.anInt5442;
												Static24.anInt805 = 0;
											}
											Static58.anInt1619 = -1;
											Static251.method4067();
											if (Static155.aClass122_11 != local1285) {
												if (local1285 != null) {
													Static257.method4146(local1285);
												}
												if (Static155.aClass122_11 != null) {
													Static257.method4146(Static155.aClass122_11);
												}
											}
											if (local1438 != Static20.aClass122_1 && Static179.anInt4089 == Static53.anInt1470) {
												if (local1438 != null) {
													Static257.method4146(local1438);
												}
												if (Static20.aClass122_1 != null) {
													Static257.method4146(Static20.aClass122_1);
												}
											}
											if (Static20.aClass122_1 == null) {
												if (Static179.anInt4089 > 0) {
													Static179.anInt4089--;
												}
											} else if (Static53.anInt1470 > Static179.anInt4089) {
												Static179.anInt4089++;
												if (Static53.anInt1470 == Static179.anInt4089) {
													Static257.method4146(Static20.aClass122_1);
												}
											}
											for (local87 = 0; local87 < 5; local87++) {
												@Pc(1921) int local1921 = Static219.anIntArray384[local87]++;
											}
											local103 = Static158.method2803();
											local108 = Static90.method1897();
											if (local103 > 15000 && local108 > 15000) {
												Static143.anInt3466 = 250;
												Static2.method25(14500);
												Static171.aClass1_Sub13_Sub1_3.method1825(108);
											}
											if (Static99.aClass145_5 != null && Static99.aClass145_5.anInt5354 == 1) {
												if (Static99.aClass145_5.anObject7 != null) {
													Static151.method2719(Static59.aString95, Static263.aBoolean281);
												}
												Static263.aBoolean281 = false;
												Static59.aString95 = null;
												Static99.aClass145_5 = null;
											}
											Static261.anInt5475++;
											Static175.anInt4032++;
											Static32.anInt933++;
											if (Static32.anInt933 > 500) {
												Static32.anInt933 = 0;
												local731 = (int) (Math.random() * 8.0D);
												if ((local731 & 0x1) == 1) {
													Static129.anInt3253 += Static111.anInt2937;
												}
												if ((local731 & 0x2) == 2) {
													Static193.anInt4297 += Static238.anInt5143;
												}
												if ((local731 & 0x4) == 4) {
													Static198.anInt4590 += Static233.anInt5110;
												}
											}
											if (Static175.anInt4032 > 500) {
												local731 = (int) (Math.random() * 8.0D);
												if ((local731 & 0x2) == 2) {
													Static44.anInt1333 += Static17.anInt619;
												}
												if ((local731 & 0x1) == 1) {
													Static83.anInt2232 += Static152.anInt3663;
												}
												Static175.anInt4032 = 0;
											}
											if (Static193.anInt4297 < -55) {
												Static238.anInt5143 = 2;
											}
											if (Static44.anInt1333 < -20) {
												Static17.anInt619 = 1;
											}
											if (Static198.anInt4590 < -40) {
												Static233.anInt5110 = 1;
											}
											if (Static44.anInt1333 > 10) {
												Static17.anInt619 = -1;
											}
											if (Static198.anInt4590 > 40) {
												Static233.anInt5110 = -1;
											}
											if (Static193.anInt4297 > 55) {
												Static238.anInt5143 = -2;
											}
											if (Static83.anInt2232 < -60) {
												Static152.anInt3663 = 2;
											}
											if (Static129.anInt3253 < -50) {
												Static111.anInt2937 = 2;
											}
											if (Static83.anInt2232 > 60) {
												Static152.anInt3663 = -2;
											}
											if (Static129.anInt3253 > 50) {
												Static111.anInt2937 = -2;
											}
											if (Static261.anInt5475 > 50) {
												Static171.aClass1_Sub13_Sub1_3.method1825(116);
											}
											if (Static23.aBoolean40) {
												Static121.method2372();
												Static23.aBoolean40 = false;
											}
											try {
												if (Static34.aClass109_2 != null && Static171.aClass1_Sub13_Sub1_3.anInt2395 > 0) {
													Static34.aClass109_2.method3150(Static171.aClass1_Sub13_Sub1_3.aByteArray29, Static171.aClass1_Sub13_Sub1_3.anInt2395);
													Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
													Static261.anInt5475 = 0;
													return;
												}
												return;
											} catch (@Pc(2158) IOException local2158) {
												Static250.method4059();
												return;
											}
										}
										local1490 = local1485.aClass122_18;
										if (local1490.anInt4662 < 0) {
											break;
										}
										local1501 = Static206.method3444(local1490.anInt4703);
									} while (local1501 == null || local1501.aClass122Array2 == null || local1490.anInt4662 >= local1501.aClass122Array2.length || local1501.aClass122Array2[local1490.anInt4662] != local1490);
									Static153.method2746(local1485);
								}
							}
							local1490 = local1485.aClass122_18;
							if (local1490.anInt4662 < 0) {
								break;
							}
							local1501 = Static206.method3444(local1490.anInt4703);
						} while (local1501 == null || local1501.aClass122Array2 == null || local1490.anInt4662 >= local1501.aClass122Array2.length || local1490 != local1501.aClass122Array2[local1490.anInt4662]);
						Static153.method2746(local1485);
					}
				}
				local1490 = local1485.aClass122_18;
				if (local1490.anInt4662 < 0) {
					break;
				}
				local1501 = Static206.method3444(local1490.anInt4703);
			} while (local1501 == null || local1501.aClass122Array2 == null || local1501.aClass122Array2.length <= local1490.anInt4662 || local1490 != local1501.aClass122Array2[local1490.anInt4662]);
			Static153.method2746(local1485);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public static void method1073() {
		while (true) {
			if (Static58.aClass1_Sub13_Sub1_1.method1824(Static149.anInt3579) >= 11) {
				@Pc(18) int local18 = Static58.aClass1_Sub13_Sub1_1.method1826(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static147.aClass9_Sub1_Sub1Array1[local18] == null) {
						local25 = true;
						Static147.aClass9_Sub1_Sub1Array1[local18] = new Class9_Sub1_Sub1();
						if (Static73.aClass1_Sub13Array1[local18] != null) {
							Static147.aClass9_Sub1_Sub1Array1[local18].method186(Static73.aClass1_Sub13Array1[local18]);
						}
					}
					Static237.anIntArray447[Static238.anInt5146++] = local18;
					@Pc(61) Class9_Sub1_Sub1 local61 = Static147.aClass9_Sub1_Sub1Array1[local18];
					local61.anInt484 = Static156.anInt3722;
					@Pc(69) int local69 = Static58.aClass1_Sub13_Sub1_1.method1826(5);
					if (local69 > 15) {
						local69 -= 32;
					}
					@Pc(80) int local80 = Static58.aClass1_Sub13_Sub1_1.method1826(5);
					@Pc(85) int local85 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
					if (local80 > 15) {
						local80 -= 32;
					}
					if (local85 == 1) {
						Static126.anIntArray244[Static253.anInt3818++] = local18;
					}
					@Pc(109) int local109 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
					@Pc(116) int local116 = Static34.anIntArray78[Static58.aClass1_Sub13_Sub1_1.method1826(3)];
					if (local25) {
						local61.anInt418 = local61.anInt419 = local116;
					}
					local61.method187(Static83.aClass9_Sub1_Sub1_1.anIntArray41[0] + local69, local80 + Static83.aClass9_Sub1_Sub1_1.anIntArray43[0], local109 == 1);
					continue;
				}
			}
			Static58.aClass1_Sub13_Sub1_1.method1821();
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!se;II)I")
	public static int method1074(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		if (!Static39.method702(arg0).method3655(arg1) && arg0.anObjectArray29 == null) {
			return -1;
		} else if (arg0.anIntArray375 == null || arg1 >= arg0.anIntArray375.length) {
			return -1;
		} else {
			return arg0.anIntArray375[arg1];
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	private static void method1075() {
		for (@Pc(3) int local3 = 0; local3 < Static16.anInt4955; local3++) {
			@Pc(9) int local9 = Static142.anIntArray260[local3];
			@Pc(13) Class9_Sub1_Sub2 local13 = Static36.aClass9_Sub1_Sub2Array2[local9];
			if (local13 != null) {
				Static223.method3707(local13.aClass45_1.anInt2021, local13);
			}
		}
	}
}
