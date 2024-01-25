import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	public static int anInt4484;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	public static int anInt4486 = 0;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "Ljava/lang/String;")
	public static final String aString262 = "red:";

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
	public static int anInt4495 = 500;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)I")
	public static int method3948(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
	public static void method3949() {
		if (Static28.anInt770 > 0) {
			Static28.anInt770--;
		}
		if (Static269.anInt5162 > 1) {
			Static233.anInt4549 = Static211.anInt4205;
			Static269.anInt5162--;
		}
		if (Static222.aBoolean326) {
			Static222.aBoolean326 = false;
			Static79.method1765();
			return;
		}
		if (!Static188.aBoolean264) {
			Static181.method3376();
		}
		for (@Pc(35) int local35 = 0; local35 < 100 && Static118.method2320(); local35++) {
		}
		if (Static247.anInt3874 != 30) {
			return;
		}
		Static190.method3479(Static335.aClass5_Sub1_Sub1_3);
		@Pc(59) Object local59 = Static338.aClass198_3.anObject7;
		@Pc(89) int local89;
		@Pc(91) int local91;
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(124) int local124;
		@Pc(188) int local188;
		synchronized (Static338.aClass198_3.anObject7) {
			if (!Static105.aBoolean147) {
				Static338.aClass198_3.anInt6025 = 0;
			} else if (Static278.anInt5427 != 0 || Static338.aClass198_3.anInt6025 >= 40) {
				Static335.aClass5_Sub1_Sub1_3.method174(216);
				Static335.aClass5_Sub1_Sub1_3.method1886(0);
				local89 = Static335.aClass5_Sub1_Sub1_3.anInt2029;
				local91 = 0;
				for (local93 = 0; Static338.aClass198_3.anInt6025 > local93 && Static335.aClass5_Sub1_Sub1_3.anInt2029 - local89 < 240; local93++) {
					local91++;
					local108 = Static338.aClass198_3.anIntArray514[local93];
					if (local108 < 0) {
						local108 = 0;
					} else if (local108 > 65534) {
						local108 = 65534;
					}
					local124 = Static338.aClass198_3.anIntArray513[local93];
					if (local124 < 0) {
						local124 = 0;
					} else if (local124 > 65534) {
						local124 = 65534;
					}
					@Pc(142) boolean local142 = false;
					if (Static338.aClass198_3.anIntArray514[local93] == -1 && Static338.aClass198_3.anIntArray513[local93] == -1) {
						local142 = true;
						local124 = -1;
						local108 = -1;
					}
					if (Static78.anInt1886 != local124 || Static276.anInt5400 != local108) {
						local188 = local124 - Static78.anInt1886;
						Static78.anInt1886 = local124;
						@Pc(195) int local195 = local108 - Static276.anInt5400;
						Static276.anInt5400 = local108;
						if (Static350.anInt6549 < 8 && local188 >= -32 && local188 <= 31 && local195 >= -32 && local195 <= 31) {
							local188 += 32;
							local195 += 32;
							Static335.aClass5_Sub1_Sub1_3.method1870((Static350.anInt6549 << 12) + (local188 << 6) + local195);
							Static350.anInt6549 = 0;
						} else if (Static350.anInt6549 < 32 && local188 >= -128 && local188 <= 127 && local195 >= -128 && local195 <= 127) {
							local188 += 128;
							local195 += 128;
							Static335.aClass5_Sub1_Sub1_3.method1886(Static350.anInt6549 + 128);
							Static335.aClass5_Sub1_Sub1_3.method1870((local188 << 8) + local195);
							Static350.anInt6549 = 0;
						} else if (Static350.anInt6549 < 32) {
							Static335.aClass5_Sub1_Sub1_3.method1886(Static350.anInt6549 + 192);
							if (local142) {
								Static335.aClass5_Sub1_Sub1_3.method1851(Integer.MIN_VALUE);
							} else {
								Static335.aClass5_Sub1_Sub1_3.method1851(local108 << 16 | local124);
							}
							Static350.anInt6549 = 0;
						} else {
							Static335.aClass5_Sub1_Sub1_3.method1870(Static350.anInt6549 + 57344);
							if (local142) {
								Static335.aClass5_Sub1_Sub1_3.method1851(Integer.MIN_VALUE);
							} else {
								Static335.aClass5_Sub1_Sub1_3.method1851(local124 | local108 << 16);
							}
							Static350.anInt6549 = 0;
						}
					} else if (Static350.anInt6549 < 2047) {
						Static350.anInt6549++;
					}
				}
				Static335.aClass5_Sub1_Sub1_3.method1857(Static335.aClass5_Sub1_Sub1_3.anInt2029 - local89);
				if (Static338.aClass198_3.anInt6025 > local91) {
					Static338.aClass198_3.anInt6025 -= local91;
					for (local108 = 0; local108 < Static338.aClass198_3.anInt6025; local108++) {
						Static338.aClass198_3.anIntArray513[local108] = Static338.aClass198_3.anIntArray513[local91 + local108];
						Static338.aClass198_3.anIntArray514[local108] = Static338.aClass198_3.anIntArray514[local91 + local108];
					}
				} else {
					Static338.aClass198_3.anInt6025 = 0;
				}
			}
		}
		if (Static278.anInt5427 != 0) {
			@Pc(410) long local410 = (Static177.aLong88 - Static21.aLong210) / 50L;
			if (local410 > 32767L) {
				local410 = 32767L;
			}
			Static21.aLong210 = Static177.aLong88;
			local89 = Static318.anInt5916;
			if (local89 < 0) {
				local89 = 0;
			} else if (local89 > 65535) {
				local89 = 65535;
			}
			local91 = Static61.anInt1429;
			if (local91 < 0) {
				local91 = 0;
			} else if (local91 > 65535) {
				local91 = 65535;
			}
			@Pc(453) byte local453 = 0;
			if (Static278.anInt5427 == 2) {
				local453 = 1;
			}
			Static335.aClass5_Sub1_Sub1_3.method174(59);
			local108 = (int) local410;
			Static335.aClass5_Sub1_Sub1_3.method1844(local453 << 15 | local108);
			Static335.aClass5_Sub1_Sub1_3.method1851(local89 << 16 | local91);
		}
		if (Static5.anInt179 > 0) {
			Static5.anInt179--;
		}
		if (Static255.aBoolean381 && Static5.anInt179 <= 0) {
			Static255.aBoolean381 = false;
			Static5.anInt179 = 20;
			Static335.aClass5_Sub1_Sub1_3.method174(197);
			Static335.aClass5_Sub1_Sub1_3.method1844((int) Static5.aFloat2 >> 3);
			Static335.aClass5_Sub1_Sub1_3.method1844((int) Static155.aFloat64 >> 3);
		}
		if (Static252.aBoolean378 && !Static169.aBoolean246) {
			Static169.aBoolean246 = true;
			Static335.aClass5_Sub1_Sub1_3.method174(86);
			Static335.aClass5_Sub1_Sub1_3.method1886(1);
		}
		if (!Static252.aBoolean378 && Static169.aBoolean246) {
			Static169.aBoolean246 = false;
			Static335.aClass5_Sub1_Sub1_3.method174(86);
			Static335.aClass5_Sub1_Sub1_3.method1886(0);
		}
		if (!Static76.aBoolean414) {
			Static335.aClass5_Sub1_Sub1_3.method174(91);
			Static335.aClass5_Sub1_Sub1_3.method1851(Static258.method4480());
			Static76.aBoolean414 = true;
		}
		if (Static252.aBoolean377) {
			Static252.aBoolean377 = false;
		} else {
			Static230.aFloat69 /= 2.0F;
		}
		if (Static195.aBoolean270) {
			Static195.aBoolean270 = false;
		} else {
			Static183.aFloat46 /= 2.0F;
		}
		Static133.method5817();
		if (Static247.anInt3874 != 30) {
			return;
		}
		Static343.method5678();
		Static15.method518();
		Static4.method27();
		Static12.anInt371++;
		if (Static12.anInt371 > 750) {
			Static79.method1765();
			return;
		}
		Static270.method4576();
		Static36.method861();
		Static29.method726();
		for (@Pc(649) int local649 = Static344.method953(true); local649 != -1; local649 = Static344.method953(false)) {
			Static25.method610(local649);
			Static254.anIntArray403[Static18.anInt538++ & 0x1F] = local649;
		}
		@Pc(720) Class96 local720;
		@Pc(1126) int local1126;
		for (@Pc(674) Class5_Sub9_Sub16 local674 = Static67.method1486(); local674 != null; local674 = Static67.method1486()) {
			local89 = local674.method4143();
			local91 = local674.method4142();
			if (local89 == 1) {
				Static286.anIntArray412[local91] = local674.anInt4723;
				Static236.aBoolean334 |= Static161.aBooleanArray15[local91];
				Static115.anIntArray150[Static121.anInt2578++ & 0x1F] = local91;
			} else if (local89 == 2) {
				Static291.aStringArray41[local91] = local674.aString276;
				Static102.anIntArray131[Static322.anInt6107++ & 0x1F] = local91;
			} else if (local89 == 3) {
				local720 = Static121.method2396(local91);
				if (!local674.aString276.equals(local720.aString187)) {
					local720.aString187 = local674.aString276;
					Static336.method4719(local720);
				}
			} else if (local89 == 4) {
				local720 = Static121.method2396(local91);
				local108 = local674.anInt4723;
				local124 = local674.anInt4721;
				local1126 = local674.anInt4724;
				if (local720.anInt2958 != local108 || local124 != local720.anInt2925 || local1126 != local720.anInt2957) {
					local720.anInt2957 = local1126;
					local720.anInt2925 = local124;
					local720.anInt2958 = local108;
					Static336.method4719(local720);
				}
			} else if (local89 == 5) {
				local720 = Static121.method2396(local91);
				if (local720.anInt2888 != local674.anInt4723 || local674.anInt4723 == -1) {
					local720.anInt2950 = 0;
					local720.anInt2892 = 0;
					local720.anInt2888 = local674.anInt4723;
					local720.anInt2906 = 1;
					Static336.method4719(local720);
				}
			} else if (local89 == 6) {
				local93 = local674.anInt4723;
				local108 = local93 >> 10 & 0x1F;
				local124 = local93 >> 5 & 0x1F;
				local1126 = local93 & 0x1F;
				local188 = (local1126 << 3) + (local108 << 19) + (local124 << 11);
				@Pc(1142) Class96 local1142 = Static121.method2396(local91);
				if (local1142.anInt2911 != local188) {
					local1142.anInt2911 = local188;
					Static336.method4719(local1142);
				}
			} else if (local89 == 7) {
				local720 = Static121.method2396(local91);
				@Pc(1091) boolean local1091 = local674.anInt4723 == 1;
				if (local720.aBoolean201 != local1091) {
					local720.aBoolean201 = local1091;
					Static336.method4719(local720);
				}
			} else if (local89 == 8) {
				local720 = Static121.method2396(local91);
				if (local674.anInt4723 != local720.anInt2886 || local674.anInt4721 != local720.anInt2927 || local720.anInt2920 != local674.anInt4724) {
					local720.anInt2920 = local674.anInt4724;
					local720.anInt2927 = local674.anInt4721;
					local720.anInt2886 = local674.anInt4723;
					if (local720.anInt2969 != -1) {
						if (local720.anInt2931 > 0) {
							local720.anInt2920 = local720.anInt2920 * 32 / local720.anInt2931;
						} else if (local720.anInt2901 > 0) {
							local720.anInt2920 = local720.anInt2920 * 32 / local720.anInt2901;
						}
					}
					Static336.method4719(local720);
				}
			} else if (local89 == 9) {
				local720 = Static121.method2396(local91);
				if (local720.anInt2969 != local674.anInt4723 || local720.anInt2879 != local674.anInt4721) {
					local720.anInt2969 = local674.anInt4723;
					local720.anInt2879 = local674.anInt4721;
					Static336.method4719(local720);
				}
			} else if (local89 == 10) {
				local720 = Static121.method2396(local91);
				if (local720.anInt2908 != local674.anInt4723 || local674.anInt4721 != local720.anInt2932 || local674.anInt4724 != local720.anInt2891) {
					local720.anInt2891 = local674.anInt4724;
					local720.anInt2908 = local674.anInt4723;
					local720.anInt2932 = local674.anInt4721;
					Static336.method4719(local720);
				}
			} else if (local89 == 11) {
				local720 = Static121.method2396(local91);
				local720.aByte33 = 0;
				local720.anInt2951 = local720.anInt2917 = local674.anInt4721;
				local720.anInt2893 = local720.anInt2870 = local674.anInt4723;
				local720.aByte35 = 0;
				Static336.method4719(local720);
			} else if (local89 == 12) {
				local720 = Static121.method2396(local91);
				local108 = local674.anInt4723;
				if (local720 != null && local720.anInt2933 == 0) {
					if (local720.anInt2965 - local720.anInt2916 < local108) {
						local108 = local720.anInt2965 - local720.anInt2916;
					}
					if (local108 < 0) {
						local108 = 0;
					}
					if (local108 != local720.anInt2904) {
						local720.anInt2904 = local108;
						Static336.method4719(local720);
					}
				}
			} else if (local89 == 13) {
				local720 = Static121.method2396(local91);
				local720.anInt2959 = local674.anInt4723;
			} else if (local89 == 14) {
				local720 = Static121.method2396(local91);
				local720.anInt2930 = local674.anInt4723;
			} else if (local89 == 15) {
				Static79.anInt1909 = local674.anInt4723;
				Static301.aBoolean447 = true;
				Static238.anInt4612 = local674.anInt4721;
			}
		}
		Static346.anInt6449++;
		if (Static171.anInt3516 != 0) {
			Static247.anInt3876 += 20;
			if (Static247.anInt3876 >= 400) {
				Static171.anInt3516 = 0;
			}
		}
		if (Static72.aClass96_6 != null) {
			Static233.anInt4552++;
			if (Static233.anInt4552 >= 15) {
				Static336.method4719(Static72.aClass96_6);
				Static72.aClass96_6 = null;
			}
		}
		@Pc(1262) Class96 local1262 = Static287.aClass96_17;
		Static287.aClass96_17 = null;
		@Pc(1266) Class96 local1266 = Static347.aClass96_21;
		Static138.aBoolean185 = false;
		Static10.aBoolean13 = false;
		Static260.anInt6423 = 0;
		Static347.aClass96_21 = null;
		Static295.aClass96_18 = null;
		while (Static133.method5820() && Static260.anInt6423 < 128) {
			if (!Static47.method1053() || Static74.aChar2 != '`' && Static74.aChar2 != '§') {
				Static57.anIntArray65[Static260.anInt6423] = Static46.anInt1195;
				Static88.anIntArray74[Static260.anInt6423] = Static74.aChar2;
				Static260.anInt6423++;
			} else if (Static129.method2472()) {
				Static66.method1396();
			} else {
				Static68.method1517();
			}
		}
		if (Static129.method2472()) {
			Static261.method4491();
		}
		Static17.aClass96_19 = null;
		Static118.method2319(-1, null, -1);
		Static109.method2174(null, -1, -1);
		if (Static207.anInt4106 != -1) {
			Static32.method797(0, Static207.anInt4106, 0, Static17.anInt5991, 0, Static246.anInt4801, 0);
		}
		Static211.anInt4205++;
		if (Static17.aClass96_19 != null) {
			Static24.method1838();
		}
		if (Static70.aBoolean118) {
			Static335.aClass5_Sub1_Sub1_3.method174(226);
			Static335.aClass5_Sub1_Sub1_3.method1851(Static6.anInt196 | Static353.anInt6601 << 14 | Static339.anInt6355 << 28);
			Static70.aBoolean118 = false;
		}
		while (true) {
			@Pc(1404) Class96 local1404;
			@Pc(1388) Class5_Sub12 local1388;
			@Pc(1393) Class96 local1393;
			do {
				local1388 = (Class5_Sub12) Static42.aClass211_2.method5596();
				if (local1388 == null) {
					while (true) {
						do {
							local1388 = (Class5_Sub12) Static237.aClass211_20.method5596();
							if (local1388 == null) {
								while (true) {
									do {
										local1388 = (Class5_Sub12) Static145.aClass211_39.method5596();
										if (local1388 == null) {
											if (Static17.aClass96_19 == null) {
												Static302.anInt5825 = 0;
											}
											if (Static287.aClass96_16 != null) {
												Static293.method4975();
											}
											if (Static70.anInt1768 > 0 && Static233.aBooleanArray19[82] && Static233.aBooleanArray19[81] && Static175.anInt3555 != 0) {
												local93 = Static156.anInt3123 - Static175.anInt3555;
												if (local93 < 0) {
													local93 = 0;
												} else if (local93 > 3) {
													local93 = 3;
												}
												Static194.method3500(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0] + Static28.anInt773, local93, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0] + Static263.anInt5063);
											}
											Static9.method276();
											if (Static47.aClass96_2 != null) {
												Static336.method4719(Static47.aClass96_2);
												Static244.anInt4736++;
												if (Static270.anInt5171 > Static353.anInt6602 + 5 || Static270.anInt5171 < Static353.anInt6602 - 5 || Static246.anInt4800 + 5 < Static274.anInt5378 || Static246.anInt4800 - 5 > Static274.anInt5378) {
													Static272.aBoolean399 = true;
												}
												if (Static160.anInt3228 == 0) {
													if (Static272.aBoolean399 && Static244.anInt4736 >= 5) {
														if (Static84.aClass96_7 == Static47.aClass96_2 && Static28.anInt774 != Static239.anInt4617) {
															local720 = Static47.aClass96_2;
															@Pc(1666) byte local1666 = 0;
															if (Static148.anInt3014 == 1 && local720.anInt2935 == 206) {
																local1666 = 1;
															}
															if (local720.anIntArray191[Static239.anInt4617] <= 0) {
																local1666 = 0;
															}
															if (local1666 == 1) {
																local124 = Static28.anInt774;
																local1126 = Static239.anInt4617;
																while (local124 != local1126) {
																	if (local1126 < local124) {
																		local720.method2697(local124 - 1, local124);
																		local124--;
																	} else if (local124 < local1126) {
																		local720.method2697(local124 + 1, local124);
																		local124++;
																	}
																}
															} else {
																local720.method2697(Static239.anInt4617, Static28.anInt774);
															}
															Static335.aClass5_Sub1_Sub1_3.method174(223);
															Static335.aClass5_Sub1_Sub1_3.method1851(Static47.aClass96_2.anInt2877);
															Static335.aClass5_Sub1_Sub1_3.method1835(local1666);
															Static335.aClass5_Sub1_Sub1_3.method1861(Static239.anInt4617);
															Static335.aClass5_Sub1_Sub1_3.method1861(Static28.anInt774);
														}
													} else if ((Static305.anInt5879 == 1 || Static175.method3300()) && Static27.anInt5324 > 2) {
														Static5.method170();
													} else if (Static215.method3792()) {
														Static249.method4372();
													}
													Static278.anInt5427 = 0;
													Static233.anInt4552 = 10;
													Static47.aClass96_2 = null;
												}
											}
											if (local1262 != Static287.aClass96_17) {
												if (local1262 != null) {
													Static336.method4719(local1262);
												}
												if (Static287.aClass96_17 != null) {
													Static336.method4719(Static287.aClass96_17);
												}
											}
											if (Static347.aClass96_21 != local1266 && Static184.anInt6249 == Static31.anInt824) {
												if (local1266 != null) {
													Static336.method4719(local1266);
												}
												if (Static347.aClass96_21 != null) {
													Static336.method4719(Static347.aClass96_21);
												}
											}
											if (Static347.aClass96_21 == null) {
												if (Static184.anInt6249 > 0) {
													Static184.anInt6249--;
												}
											} else if (Static184.anInt6249 < Static31.anInt824) {
												Static184.anInt6249++;
												if (Static31.anInt824 == Static184.anInt6249) {
													Static336.method4719(Static347.aClass96_21);
												}
											}
											for (local93 = 0; local93 < 5; local93++) {
												@Pc(1837) int local1837 = Static238.anIntArray366[local93]++;
											}
											local108 = Static92.method1968();
											local124 = Static275.method4687();
											if (local108 > 15000 && local124 > 15000) {
												Static28.anInt770 = 250;
												Static181.method3377(14500);
												Static335.aClass5_Sub1_Sub1_3.method174(9);
											}
											if (Static236.aBoolean334 && Static284.method4783() - 60000L > Static287.aLong190) {
												Static123.method2411();
											}
											Static1.anInt6++;
											if (Static1.anInt6 > 500) {
												Static1.anInt6 = 0;
												local1126 = (int) (Math.random() * 8.0D);
												if ((local1126 & 0x1) == 1) {
													Static288.anInt5541 += Static297.anInt5709;
												}
												if ((local1126 & 0x4) == 4) {
													Static293.anInt5615 += Static100.anInt2204;
												}
												if ((local1126 & 0x2) == 2) {
													Static191.anInt5842 += Static160.anInt3242;
												}
											}
											if (Static288.anInt5541 < -50) {
												Static297.anInt5709 = 2;
											}
											if (Static191.anInt5842 < -55) {
												Static160.anInt3242 = 2;
											}
											if (Static288.anInt5541 > 50) {
												Static297.anInt5709 = -2;
											}
											if (Static293.anInt5615 < -40) {
												Static100.anInt2204 = 1;
											}
											if (Static191.anInt5842 > 55) {
												Static160.anInt3242 = -2;
											}
											if (Static293.anInt5615 > 40) {
												Static100.anInt2204 = -1;
											}
											Static6.anInt194++;
											if (Static6.anInt194 > 500) {
												Static6.anInt194 = 0;
												local1126 = (int) (Math.random() * 8.0D);
												if ((local1126 & 0x1) == 1) {
													Static253.anInt4957 += Static15.anInt502;
												}
												if ((local1126 & 0x2) == 2) {
													Static339.anInt6353 += Static310.anInt5951;
												}
											}
											if (Static253.anInt4957 < -60) {
												Static15.anInt502 = 2;
											}
											if (Static339.anInt6353 < -20) {
												Static310.anInt5951 = 1;
											}
											if (Static253.anInt4957 > 60) {
												Static15.anInt502 = -2;
											}
											Static256.anInt4995++;
											if (Static339.anInt6353 > 10) {
												Static310.anInt5951 = -1;
											}
											if (Static256.anInt4995 > 50) {
												Static335.aClass5_Sub1_Sub1_3.method174(111);
											}
											if (Static168.aBoolean244) {
												Static253.method4426();
												Static168.aBoolean244 = false;
											}
											try {
												if (Static95.aClass68_23 != null && Static335.aClass5_Sub1_Sub1_3.anInt2029 > 0) {
													Static95.aClass68_23.method2002(Static335.aClass5_Sub1_Sub1_3.anInt2029, Static335.aClass5_Sub1_Sub1_3.aByteArray18);
													Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
													Static256.anInt4995 = 0;
													return;
												}
												return;
											} catch (@Pc(2059) IOException local2059) {
												Static79.method1765();
												return;
											}
										}
										local1393 = local1388.aClass96_4;
										if (local1393.anInt2914 < 0) {
											break;
										}
										local1404 = Static121.method2396(local1393.anInt2929);
									} while (local1404 == null || local1404.aClass96Array1 == null || local1393.anInt2914 >= local1404.aClass96Array1.length || local1404.aClass96Array1[local1393.anInt2914] != local1393);
									Static223.method3891(local1388);
								}
							}
							local1393 = local1388.aClass96_4;
							if (local1393.anInt2914 < 0) {
								break;
							}
							local1404 = Static121.method2396(local1393.anInt2929);
						} while (local1404 == null || local1404.aClass96Array1 == null || local1404.aClass96Array1.length <= local1393.anInt2914 || local1404.aClass96Array1[local1393.anInt2914] != local1393);
						Static223.method3891(local1388);
					}
				}
				local1393 = local1388.aClass96_4;
				if (local1393.anInt2914 < 0) {
					break;
				}
				local1404 = Static121.method2396(local1393.anInt2929);
			} while (local1404 == null || local1404.aClass96Array1 == null || local1393.anInt2914 >= local1404.aClass96Array1.length || local1404.aClass96Array1[local1393.anInt2914] != local1393);
			Static223.method3891(local1388);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)I")
	public static int method3950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local19;
	}
}
