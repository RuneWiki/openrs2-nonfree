import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!client", name = "X", descriptor = "I")
	public static volatile int anInt1090 = 0;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_14 = new Class66(50);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method963() {
		@Pc(7) int local7 = Static236.aBoolean335 ? Static161.anInt3258 : Static161.anInt3258 + Static63.anInt1486;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class25_Sub1_Sub1 local14;
			if (local9 < 0) {
				local14 = Static85.aClass25_Sub1_Sub1_Sub1_1;
			} else if (local9 < Static161.anInt3258) {
				local14 = Static312.aClass25_Sub1_Sub1_Sub1Array1[Static220.anIntArray311[local9]];
			} else {
				local14 = Static188.aClass25_Sub1_Sub1_Sub2Array1[Static331.anIntArray535[local9 - Static161.anInt3258]];
			}
			local14.anInt5277 = 0;
			if (local14.anInt5327 < 0) {
				local14.aBoolean403 = false;
			} else {
				@Pc(47) int local47 = local14.method4646();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt5769 & 0x7F) != 0 || (local14.anInt5773 & 0x7F) != 0) {
						local14.aBoolean403 = false;
						continue;
					}
				} else if ((local14.anInt5769 & 0x7F) != 64 || (local14.anInt5773 & 0x7F) != 64) {
					local14.aBoolean403 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt5769 >> 7;
					local94 = local14.anInt5773 >> 7;
					if (local14.anInt5327 != Static123.anIntArrayArray16[local89][local94]) {
						local14.aBoolean403 = true;
						continue;
					}
					if (Static193.anIntArrayArray31[local89][local94] > 1) {
						local119 = Static193.anIntArrayArray31[local89][local94]--;
						local14.aBoolean403 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt5769 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt5773 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt5769 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt5773 + local89 >> 7;
					if (!Static159.method2976(local148, local14.anInt5327, local162, local94, local155)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt5327 == Static123.anIntArrayArray16[local173][local176]) {
									local119 = Static193.anIntArrayArray31[local173][local176]--;
								}
							}
						}
						local14.aBoolean403 = true;
						continue;
					}
				}
				if (local14 instanceof Class25_Sub1_Sub1_Sub1 && local14.anInterface8_3 != null && Static180.anInt3606 >= local14.anInt5335 && Static180.anInt3606 < local14.anInt5338) {
					((Class25_Sub1_Sub1_Sub1) local14).aBoolean289 = false;
				}
				local14.aBoolean403 = false;
				local14.anInt5772 = Static66.method1393(local14.anInt5773, Static156.anInt3123, local14.anInt5769);
				Static82.method1817(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method964(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static31.method765(arg0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!ra;)V")
	public static void method965(@OriginalArg(1) Class170 arg0) {
		Static225.aClass170_78 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
	public static void method967(@OriginalArg(1) int arg0) {
		Static60.method1252();
		Static263.method4508();
		Static75.method1607(true, arg0);
		Static316.method5382(Static15.aClass59_1, Static317.aClass170_114, Static202.aClass170_75);
		Static338.method3594(Static317.aClass170_114, Static15.aClass59_1);
		Static141.method2636(Static29.aClass54Array1);
		Static77.method1710();
		Static241.method4110();
		if (Static247.anInt3874 == 10) {
			Static199.method3527(false);
		} else if (Static247.anInt3874 == 30) {
			Static293.method4971(25);
		} else if (Static247.anInt3874 == 5) {
			Static230.method3965(Static15.aClass59_1, Static317.aClass170_114);
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method968() {
		@Pc(14) boolean local14 = Static332.anInt6258 == 1 && Static161.anInt3258 > 200 || Static332.anInt6258 == 0 && Static161.anInt3258 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static161.anInt3258; local16++) {
			@Pc(23) Class25_Sub1_Sub1_Sub1 local23 = Static312.aClass25_Sub1_Sub1_Sub1Array1[Static220.anIntArray311[local16]];
			if (local23.method3683()) {
				local23.method5095();
				if (local23.aShort76 >= 0 && local23.aShort75 >= 0 && local23.aShort73 < Static266.anInt5101 && local23.aShort74 < Static339.anInt6352) {
					local23.aBoolean289 = local23.aBoolean405 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean403) {
						local62++;
					}
					if (local23.anInt5323 > Static180.anInt3606) {
						local62 += 2;
					}
					local62 += 5 - local23.method4646() << 2;
					if (Static76.anInt5488 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt5327 = local62 + 1;
				} else {
					local23.anInt5327 = -1;
				}
			} else {
				local23.anInt5327 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static63.anInt1486; local98++) {
			@Pc(105) Class25_Sub1_Sub1_Sub2 local105 = Static188.aClass25_Sub1_Sub1_Sub2Array1[Static331.anIntArray535[local98]];
			if (local105.method4662() && local105.aClass216_1.method5771()) {
				local105.method5095();
				if (local105.aShort76 >= 0 && local105.aShort75 >= 0 && local105.aShort73 < Static266.anInt5101 && local105.aShort74 < Static339.anInt6352) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean403) {
						local141++;
					}
					if (local105.anInt5323 > Static180.anInt3606) {
						local141 += 2;
					}
					local141 += 5 - local105.method4646() << 2;
					if (Static76.anInt5488 == 0) {
						if (local105.aClass216_1.aBoolean484) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static76.anInt5488 == 1) {
						if (local105.aClass216_1.aBoolean484) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass216_1.aBoolean483) {
						local141 += 512;
					} else if (!local105.aClass216_1.aBoolean486) {
						local141 += 256;
					}
					local105.anInt5327 = local141 + 1;
				} else {
					local105.anInt5327 = -1;
				}
			} else {
				local105.anInt5327 = -1;
			}
		}
		for (local62 = 0; local62 < Static141.aClass104Array1.length; local62++) {
			@Pc(207) Class104 local207 = Static141.aClass104Array1[local62];
			if (local207 != null) {
				if (local207.anInt3106 == 1) {
					@Pc(218) Class25_Sub1_Sub1_Sub2 local218 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local207.anInt3095];
					if (local218 != null && local218.anInt5327 >= 0) {
						local218.anInt5327 += 1024;
					}
				} else if (local207.anInt3106 == 10) {
					@Pc(239) Class25_Sub1_Sub1_Sub1 local239 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local207.anInt3095];
					if (local239 != null && local239.anInt5327 >= 0) {
						local239.anInt5327 += 1024;
					}
				}
			}
		}
		Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5327 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method969() {
		@Pc(7) int local7 = Static236.aBoolean335 ? Static161.anInt3258 : Static161.anInt3258 + Static63.anInt1486;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class25_Sub1_Sub1 local14;
			if (local9 < 0) {
				local14 = Static85.aClass25_Sub1_Sub1_Sub1_1;
			} else if (local9 < Static161.anInt3258) {
				local14 = Static312.aClass25_Sub1_Sub1_Sub1Array1[Static220.anIntArray311[local9]];
			} else {
				local14 = Static188.aClass25_Sub1_Sub1_Sub2Array1[Static331.anIntArray535[local9 - Static161.anInt3258]];
			}
			if (local14.anInt5327 >= 0) {
				@Pc(40) int local40 = local14.method4646();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt5769 & 0x7F) == 0 && (local14.anInt5773 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt5769 & 0x7F) == 64 && (local14.anInt5773 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class25_Sub1_Sub1_Sub1 && local14.anInterface8_3 != null && Static180.anInt3606 >= local14.anInt5335 && Static180.anInt3606 < local14.anInt5338) {
					((Class25_Sub1_Sub1_Sub1) local14).aBoolean289 = false;
				}
				local14.anInt5772 = Static66.method1393(local14.anInt5773, Static156.anInt3123, local14.anInt5769);
				Static82.method1817(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!jf;IIIIIII)V")
	public static void method970(@OriginalArg(0) Class96[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class96 local6 = arg0[local1];
			if (local6 != null && local6.anInt2929 == arg1) {
				@Pc(17) int local17 = local6.anInt2893 + arg6;
				@Pc(22) int local22 = local6.anInt2951 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2933 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2943;
					@Pc(45) int local45 = local22 + local6.anInt2916;
					if (local6.anInt2933 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (!local6.aBoolean197 || local6.anInt2933 == 0 || local6.aBoolean202 || method975(local6).anInt1281 != 0 || local6 == Static232.aClass96_15 || local6.anInt2935 == 1338) {
					if (!local6.aBoolean197 || !method974(local6)) {
						if (local6 == Static287.aClass96_16) {
							Static138.aBoolean185 = true;
							Static153.anInt3097 = local17;
							Static26.anInt623 = local22;
						}
						if (!local6.aBoolean197 || local6.aBoolean194 || local28 < local32 && local30 < local34) {
							if (local6.anInt2933 == 0) {
								if (!local6.aBoolean197 && method974(local6) && Static287.aClass96_17 != local6) {
									continue;
								}
								if (local6.aBoolean209 && Static270.anInt5171 >= local28 && Static274.anInt5378 >= local30 && Static270.anInt5171 < local32 && Static274.anInt5378 < local34) {
									for (@Pc(175) Class5_Sub12 local175 = (Class5_Sub12) Static145.aClass211_39.method5608(); local175 != null; local175 = (Class5_Sub12) Static145.aClass211_39.method5603()) {
										if (local175.aBoolean90) {
											local175.method5803();
											local175.aClass96_4.aBoolean205 = false;
										}
									}
									if (Static110.anInt2338 == 0) {
										Static287.aClass96_16 = null;
										Static232.aClass96_15 = null;
									}
									Static302.anInt5825 = 0;
									Static226.aBoolean329 = false;
									Static70.aBoolean118 = false;
									if (!Static188.aBoolean264) {
										Static181.method3376();
									}
								}
							}
							@Pc(223) boolean local223;
							if (Static270.anInt5171 >= local28 && Static274.anInt5378 >= local30 && Static270.anInt5171 < local32 && Static274.anInt5378 < local34) {
								local223 = true;
							} else {
								local223 = false;
							}
							if (!Static188.aBoolean264 && local223) {
								Static346.method5696(Static274.anInt5378 - local22, Static270.anInt5171 - local17, local6);
							}
							if (local6.aBoolean197) {
								@Pc(244) boolean local244 = false;
								if (Static160.anInt3228 == 1 && local223) {
									local244 = true;
								}
								@Pc(253) boolean local253 = false;
								if (Static278.anInt5427 == 1 && Static61.anInt1429 >= local28 && Static318.anInt5916 >= local30 && Static61.anInt1429 < local32 && Static318.anInt5916 < local34) {
									local253 = true;
								}
								@Pc(275) int local275;
								@Pc(364) int local364;
								if (local6.aByteArray30 != null) {
									for (local275 = 0; local275 < local6.aByteArray30.length; local275++) {
										if (Static233.aBooleanArray19[local6.aByteArray30[local275]]) {
											if (local6.anIntArray187 == null || Static180.anInt3606 >= local6.anIntArray187[local275]) {
												@Pc(306) byte local306 = local6.aByteArray31[local275];
												if (local306 == 0 || ((local306 & 0x8) == 0 || !Static233.aBooleanArray19[86] && !Static233.aBooleanArray19[82] && !Static233.aBooleanArray19[81]) && ((local306 & 0x2) == 0 || Static233.aBooleanArray19[86]) && ((local306 & 0x1) == 0 || Static233.aBooleanArray19[82]) && ((local306 & 0x4) == 0 || Static233.aBooleanArray19[81])) {
													Static250.method4375("", local275 + 1, local6.anInt2877, -1);
													local364 = local6.anIntArray182[local275];
													if (local6.anIntArray187 == null) {
														local6.anIntArray187 = new int[local6.aByteArray30.length];
													}
													if (local364 == 0) {
														local6.anIntArray187[local275] = Integer.MAX_VALUE;
													} else {
														local6.anIntArray187[local275] = Static180.anInt3606 + local364;
													}
												}
											}
										} else if (local6.anIntArray187 != null) {
											local6.anIntArray187[local275] = 0;
										}
									}
								}
								if (local253) {
									Static37.method870(Static318.anInt5916 - local22, Static61.anInt1429 - local17, local6);
								}
								if (Static287.aClass96_16 != null && Static287.aClass96_16 != local6 && local223 && method975(local6).method1146()) {
									Static295.aClass96_18 = local6;
								}
								if (local6 == Static232.aClass96_15) {
									Static10.aBoolean13 = true;
									Static311.anInt6465 = local17;
									Static353.anInt6608 = local22;
								}
								if (local6.aBoolean202 || local6.anInt2935 != 0) {
									@Pc(445) Class5_Sub12 local445;
									if (local223 && Static175.anInt3555 != 0 && local6.anObjectArray23 != null) {
										local445 = new Class5_Sub12();
										local445.aBoolean90 = true;
										local445.aClass96_4 = local6;
										local445.anInt1380 = Static175.anInt3555;
										local445.anObjectArray3 = local6.anObjectArray23;
										Static145.aClass211_39.method5609(local445);
									}
									if (Static287.aClass96_16 != null || Static47.aClass96_2 != null || Static188.aBoolean264 || local6.anInt2935 != 1400 && Static302.anInt5825 > 0) {
										local253 = false;
										local244 = false;
										local223 = false;
									}
									@Pc(580) int local580;
									if (local6.anInt2935 != 0) {
										if (local6.anInt2935 == 1337 || local6.anInt2935 == 1403) {
											Static70.aClass96_5 = local6;
											if (Static34.aClass129_1 != null) {
												Static34.aClass129_1.method3482(Static15.aClass59_1, local6.anInt2916);
											}
											if (local6.anInt2935 == 1337) {
												if (!Static188.aBoolean264 && local223) {
													Static9.method273(Static15.aClass59_1);
													for (@Pc(518) Class63_Sub4 local518 = (Class63_Sub4) Static178.aClass24_3.method619(); local518 != null; local518 = (Class63_Sub4) Static178.aClass24_3.method627()) {
														if (Static270.anInt5171 >= local518.anInt4445 && Static270.anInt5171 < local518.anInt4442 && Static274.anInt5378 >= local518.anInt4441 && Static274.anInt5378 < local518.anInt4436) {
															Static181.method3376();
															Static159.method2978(local518.aClass25_Sub1_Sub1_1);
														}
													}
												}
												Static118.method2319(local17, local6, local22);
												continue;
											}
										}
										@Pc(619) int local619;
										if (local6.anInt2935 == 1338) {
											if (local6.method2702(Static15.aClass59_1) == null || Static115.anInt2459 != 0 && Static115.anInt2459 != 3 || Static188.aBoolean264 || !local223) {
												continue;
											}
											local275 = Static270.anInt5171 - local17;
											local580 = Static274.anInt5378 - local22;
											local364 = local6.anIntArray183[local580];
											if (local275 < local364 || local275 > local364 + local6.anIntArray186[local580]) {
												continue;
											}
											local275 -= local6.anInt2943 / 2;
											local580 -= local6.anInt2916 / 2;
											if (Static215.anInt4279 == 4) {
												local619 = (int) Static155.aFloat64 & 0x3FFF;
											} else {
												local619 = (int) Static155.aFloat64 + Static253.anInt4957 & 0x3FFF;
											}
											@Pc(631) int local631 = Class5_Sub9_Sub12.anIntArray169[local619];
											@Pc(635) int local635 = Class5_Sub9_Sub12.anIntArray170[local619];
											if (Static215.anInt4279 != 4) {
												local631 = local631 * (Static339.anInt6353 + 256) >> 8;
												local635 = local635 * (Static339.anInt6353 + 256) >> 8;
											}
											@Pc(664) int local664 = local580 * local631 + local275 * local635 >> 15;
											@Pc(674) int local674 = local580 * local635 - local275 * local631 >> 15;
											@Pc(685) int local685;
											@Pc(693) int local693;
											if (Static215.anInt4279 == 4) {
												local685 = (Static159.anInt3220 >> 7) + (local664 >> 2);
												local693 = (Static130.anInt2662 >> 7) - (local674 >> 2);
											} else {
												@Pc(702) int local702 = (Static85.aClass25_Sub1_Sub1_Sub1_1.method4646() - 1) * 64;
												local685 = (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 - local702 >> 7) + (local664 >> 2);
												local693 = (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 - local702 >> 7) - (local674 >> 2);
											}
											if (Static20.aBoolean40 && (Static240.anInt4648 & 0x40) != 0) {
												@Pc(735) Class96 local735 = Static305.method5232(Static21.anInt6209, Static151.anInt3085);
												if (local735 == null) {
													Static279.method4734();
												} else {
													Static345.method5684(1, Static221.aString254, " ->", Static258.anInt5020, local685, local693, 1L);
												}
												continue;
											}
											if (Static298.anInt5725 == 1) {
												Static345.method5684(21, Static261.aString296, "", -1, local685, local693, 1L);
											}
											Static345.method5684(59, Static27.aString305, "", -1, local685, local693, 1L);
											continue;
										}
										if (local6.anInt2935 == 1400) {
											Static17.aClass96_19 = local6;
											if (local223) {
												Static226.aBoolean329 = true;
											}
											if (local253) {
												local275 = (int) ((double) (Static61.anInt1429 - local17 - local6.anInt2943 / 2) * 2.0D / (double) Static186.aFloat98);
												local580 = (int) -((double) (Static318.anInt5916 - local22 - local6.anInt2916 / 2) * 2.0D / (double) Static186.aFloat98);
												local364 = Static180.anInt3602 + local275 + Static186.anInt6007;
												local619 = Static9.anInt302 + local580 + Static186.anInt6012;
												@Pc(832) Class5_Sub9_Sub8 local832 = Static51.method1134();
												if (local832 == null) {
													continue;
												}
												@Pc(837) int[] local837 = new int[3];
												local832.method2050(local619, local364, local837);
												if (local837 != null) {
													if (Static233.aBooleanArray19[82] && Static70.anInt1768 > 0) {
														Static194.method3500(local837[2], local837[0], local837[1]);
														continue;
													}
													Static70.aBoolean118 = true;
													Static339.anInt6355 = local837[0];
													Static353.anInt6601 = local837[1];
													Static6.anInt196 = local837[2];
												}
												Static302.anInt5825 = 1;
												Static110.aBoolean154 = false;
												Static25.anInt606 = Static270.anInt5171;
												Static42.anInt1007 = Static274.anInt5378;
												continue;
											}
											if (local244 && Static302.anInt5825 > 0) {
												if (Static302.anInt5825 == 1 && (Static25.anInt606 != Static270.anInt5171 || Static42.anInt1007 != Static274.anInt5378)) {
													Static289.anInt5545 = Static180.anInt3602;
													Static194.anInt3830 = Static9.anInt302;
													Static302.anInt5825 = 2;
												}
												if (Static302.anInt5825 == 2) {
													Static110.aBoolean154 = true;
													Static215.method3794(Static289.anInt5545 + (int) ((double) (Static25.anInt606 - Static270.anInt5171) * 2.0D / (double) Static186.aFloat99));
													Static122.method2405(Static194.anInt3830 - (int) ((double) (Static42.anInt1007 - Static274.anInt5378) * 2.0D / (double) Static186.aFloat99));
												}
												continue;
											}
											if (Static302.anInt5825 > 0 && !Static110.aBoolean154) {
												if ((Static305.anInt5879 == 1 || Static175.method3300()) && Static27.anInt5324 > 2) {
													Static261.method4494(2);
												} else if (Static215.method3792()) {
													Static261.method4494(1);
												}
											}
											Static302.anInt5825 = 0;
											continue;
										}
										if (local6.anInt2935 == 1401) {
											if (local244) {
												Static173.method3938(Static270.anInt5171 - local17, Static274.anInt5378 - local22, local6.anInt2943, local6.anInt2916);
											}
											continue;
										}
										if (local6.anInt2935 == 1402) {
											Static336.method4719(local6);
											continue;
										}
										if (local6.anInt2935 == 1406) {
											Static109.method2174(local6, local22, local17);
											continue;
										}
									}
									if (!local6.aBoolean193 && local253) {
										local6.aBoolean193 = true;
										if (local6.anObjectArray18 != null) {
											local445 = new Class5_Sub12();
											local445.aBoolean90 = true;
											local445.aClass96_4 = local6;
											local445.anInt1384 = Static61.anInt1429 - local17;
											local445.anInt1380 = Static318.anInt5916 - local22;
											local445.anObjectArray3 = local6.anObjectArray18;
											Static145.aClass211_39.method5609(local445);
										}
									}
									if (local6.aBoolean193 && local244 && local6.anObjectArray12 != null) {
										local445 = new Class5_Sub12();
										local445.aBoolean90 = true;
										local445.aClass96_4 = local6;
										local445.anInt1384 = Static270.anInt5171 - local17;
										local445.anInt1380 = Static274.anInt5378 - local22;
										local445.anObjectArray3 = local6.anObjectArray12;
										Static145.aClass211_39.method5609(local445);
									}
									if (local6.aBoolean193 && !local244) {
										local6.aBoolean193 = false;
										if (local6.anObjectArray21 != null) {
											local445 = new Class5_Sub12();
											local445.aBoolean90 = true;
											local445.aClass96_4 = local6;
											local445.anInt1384 = Static270.anInt5171 - local17;
											local445.anInt1380 = Static274.anInt5378 - local22;
											local445.anObjectArray3 = local6.anObjectArray21;
											Static237.aClass211_20.method5609(local445);
										}
									}
									if (local244 && local6.anObjectArray19 != null) {
										local445 = new Class5_Sub12();
										local445.aBoolean90 = true;
										local445.aClass96_4 = local6;
										local445.anInt1384 = Static270.anInt5171 - local17;
										local445.anInt1380 = Static274.anInt5378 - local22;
										local445.anObjectArray3 = local6.anObjectArray19;
										Static145.aClass211_39.method5609(local445);
									}
									if (!local6.aBoolean205 && local223) {
										local6.aBoolean205 = true;
										if (local6.anObjectArray13 != null) {
											local445 = new Class5_Sub12();
											local445.aBoolean90 = true;
											local445.aClass96_4 = local6;
											local445.anInt1384 = Static270.anInt5171 - local17;
											local445.anInt1380 = Static274.anInt5378 - local22;
											local445.anObjectArray3 = local6.anObjectArray13;
											Static145.aClass211_39.method5609(local445);
										}
									}
									if (local6.aBoolean205 && local223 && local6.anObjectArray27 != null) {
										local445 = new Class5_Sub12();
										local445.aBoolean90 = true;
										local445.aClass96_4 = local6;
										local445.anInt1384 = Static270.anInt5171 - local17;
										local445.anInt1380 = Static274.anInt5378 - local22;
										local445.anObjectArray3 = local6.anObjectArray27;
										Static145.aClass211_39.method5609(local445);
									}
									if (local6.aBoolean205 && !local223) {
										local6.aBoolean205 = false;
										if (local6.anObjectArray29 != null) {
											local445 = new Class5_Sub12();
											local445.aBoolean90 = true;
											local445.aClass96_4 = local6;
											local445.anInt1384 = Static270.anInt5171 - local17;
											local445.anInt1380 = Static274.anInt5378 - local22;
											local445.anObjectArray3 = local6.anObjectArray29;
											Static237.aClass211_20.method5609(local445);
										}
									}
									if (local6.anObjectArray16 != null) {
										local445 = new Class5_Sub12();
										local445.aClass96_4 = local6;
										local445.anObjectArray3 = local6.anObjectArray16;
										Static42.aClass211_2.method5609(local445);
									}
									@Pc(1337) Class5_Sub12 local1337;
									if (local6.anObjectArray26 != null && Static121.anInt2578 > local6.anInt2934) {
										if (local6.anIntArray188 == null || Static121.anInt2578 - local6.anInt2934 > 32) {
											local445 = new Class5_Sub12();
											local445.aClass96_4 = local6;
											local445.anObjectArray3 = local6.anObjectArray26;
											Static145.aClass211_39.method5609(local445);
										} else {
											label675: for (local275 = local6.anInt2934; local275 < Static121.anInt2578; local275++) {
												local580 = Static115.anIntArray150[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray188.length; local364++) {
													if (local6.anIntArray188[local364] == local580) {
														local1337 = new Class5_Sub12();
														local1337.aClass96_4 = local6;
														local1337.anObjectArray3 = local6.anObjectArray26;
														Static145.aClass211_39.method5609(local1337);
														break label675;
													}
												}
											}
										}
										local6.anInt2934 = Static121.anInt2578;
									}
									if (local6.anObjectArray7 != null && Static322.anInt6107 > local6.anInt2928) {
										if (local6.anIntArray196 == null || Static322.anInt6107 - local6.anInt2928 > 32) {
											local445 = new Class5_Sub12();
											local445.aClass96_4 = local6;
											local445.anObjectArray3 = local6.anObjectArray7;
											Static145.aClass211_39.method5609(local445);
										} else {
											label655: for (local275 = local6.anInt2928; local275 < Static322.anInt6107; local275++) {
												local580 = Static102.anIntArray131[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray196.length; local364++) {
													if (local6.anIntArray196[local364] == local580) {
														local1337 = new Class5_Sub12();
														local1337.aClass96_4 = local6;
														local1337.anObjectArray3 = local6.anObjectArray7;
														Static145.aClass211_39.method5609(local1337);
														break label655;
													}
												}
											}
										}
										local6.anInt2928 = Static322.anInt6107;
									}
									if (local6.anObjectArray33 != null && Static18.anInt538 > local6.anInt2955) {
										if (local6.anIntArray192 == null || Static18.anInt538 - local6.anInt2955 > 32) {
											local445 = new Class5_Sub12();
											local445.aClass96_4 = local6;
											local445.anObjectArray3 = local6.anObjectArray33;
											Static145.aClass211_39.method5609(local445);
										} else {
											label635: for (local275 = local6.anInt2955; local275 < Static18.anInt538; local275++) {
												local580 = Static254.anIntArray403[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray192.length; local364++) {
													if (local6.anIntArray192[local364] == local580) {
														local1337 = new Class5_Sub12();
														local1337.aClass96_4 = local6;
														local1337.anObjectArray3 = local6.anObjectArray33;
														Static145.aClass211_39.method5609(local1337);
														break label635;
													}
												}
											}
										}
										local6.anInt2955 = Static18.anInt538;
									}
									if (local6.anObjectArray31 != null && Static75.anInt1825 > local6.anInt2971) {
										if (local6.anIntArray194 == null || Static75.anInt1825 - local6.anInt2971 > 32) {
											local445 = new Class5_Sub12();
											local445.aClass96_4 = local6;
											local445.anObjectArray3 = local6.anObjectArray31;
											Static145.aClass211_39.method5609(local445);
										} else {
											label615: for (local275 = local6.anInt2971; local275 < Static75.anInt1825; local275++) {
												local580 = Static22.anIntArray29[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray194.length; local364++) {
													if (local6.anIntArray194[local364] == local580) {
														local1337 = new Class5_Sub12();
														local1337.aClass96_4 = local6;
														local1337.anObjectArray3 = local6.anObjectArray31;
														Static145.aClass211_39.method5609(local1337);
														break label615;
													}
												}
											}
										}
										local6.anInt2971 = Static75.anInt1825;
									}
									if (local6.anObjectArray32 != null && Static176.anInt1942 > local6.anInt2899) {
										if (local6.anIntArray180 == null || Static176.anInt1942 - local6.anInt2899 > 32) {
											local445 = new Class5_Sub12();
											local445.aClass96_4 = local6;
											local445.anObjectArray3 = local6.anObjectArray32;
											Static145.aClass211_39.method5609(local445);
										} else {
											label595: for (local275 = local6.anInt2899; local275 < Static176.anInt1942; local275++) {
												local580 = Static219.anIntArray310[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray180.length; local364++) {
													if (local6.anIntArray180[local364] == local580) {
														local1337 = new Class5_Sub12();
														local1337.aClass96_4 = local6;
														local1337.anObjectArray3 = local6.anObjectArray32;
														Static145.aClass211_39.method5609(local1337);
														break label595;
													}
												}
											}
										}
										local6.anInt2899 = Static176.anInt1942;
									}
									if (Static312.anInt5961 > local6.anInt2960 && local6.anObjectArray20 != null) {
										local445 = new Class5_Sub12();
										local445.aClass96_4 = local6;
										local445.anObjectArray3 = local6.anObjectArray20;
										Static145.aClass211_39.method5609(local445);
									}
									if (Static1.anInt8 > local6.anInt2960 && local6.anObjectArray30 != null) {
										local445 = new Class5_Sub12();
										local445.aClass96_4 = local6;
										local445.anObjectArray3 = local6.anObjectArray30;
										Static145.aClass211_39.method5609(local445);
									}
									if (Static277.anInt5401 > local6.anInt2960 && local6.anObjectArray14 != null) {
										local445 = new Class5_Sub12();
										local445.aClass96_4 = local6;
										local445.anObjectArray3 = local6.anObjectArray14;
										Static145.aClass211_39.method5609(local445);
									}
									if (Static211.anInt4203 > local6.anInt2960 && local6.anObjectArray17 != null) {
										local445 = new Class5_Sub12();
										local445.aClass96_4 = local6;
										local445.anObjectArray3 = local6.anObjectArray17;
										Static145.aClass211_39.method5609(local445);
									}
									if (Static233.anInt4549 > local6.anInt2960 && local6.anObjectArray28 != null) {
										local445 = new Class5_Sub12();
										local445.aClass96_4 = local6;
										local445.anObjectArray3 = local6.anObjectArray28;
										Static145.aClass211_39.method5609(local445);
									}
									local6.anInt2960 = Static211.anInt4205;
									if (local6.anObjectArray24 != null) {
										for (local275 = 0; local275 < Static260.anInt6423; local275++) {
											@Pc(1805) Class5_Sub12 local1805 = new Class5_Sub12();
											local1805.aClass96_4 = local6;
											local1805.anInt1382 = Static57.anIntArray65[local275];
											local1805.anInt1386 = Static88.anIntArray74[local275];
											local1805.anObjectArray3 = local6.anObjectArray24;
											Static145.aClass211_39.method5609(local1805);
										}
									}
									if (Static302.aBoolean432 && local6.anObjectArray10 != null) {
										local445 = new Class5_Sub12();
										local445.aClass96_4 = local6;
										local445.anObjectArray3 = local6.anObjectArray10;
										Static145.aClass211_39.method5609(local445);
									}
								}
								if (local6.anInt2933 == 5 && local6.anInt2885 != -1) {
									local6.method2707().method3482(Static15.aClass59_1, local6.anInt2916);
								}
							}
							if (!local6.aBoolean197 && Static287.aClass96_16 == null && Static47.aClass96_2 == null && !Static188.aBoolean264) {
								if ((local6.anInt2876 >= 0 || local6.anInt2889 != 0) && Static270.anInt5171 >= local28 && Static274.anInt5378 >= local30 && Static270.anInt5171 < local32 && Static274.anInt5378 < local34) {
									if (local6.anInt2876 >= 0) {
										Static287.aClass96_17 = arg0[local6.anInt2876];
									} else {
										Static287.aClass96_17 = local6;
									}
								}
								if (local6.anInt2933 == 8 && Static270.anInt5171 >= local28 && Static274.anInt5378 >= local30 && Static270.anInt5171 < local32 && Static274.anInt5378 < local34) {
									Static347.aClass96_21 = local6;
								}
								if (local6.anInt2965 > local6.anInt2916) {
									Static57.method1218(local22, local17 + local6.anInt2943, local6.anInt2916, local6.anInt2965, local6, Static274.anInt5378, Static270.anInt5171);
								}
							}
							Static188.method3462(local22, arg5, local6, local17, arg4, arg2, arg3);
							if (local6.anInt2933 == 0) {
								method970(arg0, local6.anInt2877, local28, local30, local32, local34, local17 - local6.anInt2918, local22 - local6.anInt2904);
								if (local6.aClass96Array1 != null) {
									method970(local6.aClass96Array1, local6.anInt2877, local28, local30, local32, local34, local17 - local6.anInt2918, local22 - local6.anInt2904);
								}
								@Pc(1998) Class5_Sub40 local1998 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local6.anInt2877);
								if (local1998 != null) {
									if (local1998.anInt6229 == 0 && !Static188.aBoolean264 && local223 && !Static213.aBoolean311) {
										Static181.method3376();
									}
									Static32.method797(local28, local1998.anInt6233, local22, local32, local17, local34, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static188.method3462(local22, arg5, local6, local17, arg4, arg2, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ml;B)V")
	public static void method972(@OriginalArg(0) Class5_Sub29 arg0) {
		if (Static138.aClass51ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface8 local8 = null;
		if (arg0.anInt3815 == 0) {
			local8 = (Interface8) Static178.method3304(arg0.anInt3813, arg0.anInt3819, arg0.anInt3810);
		}
		if (arg0.anInt3815 == 1) {
			local8 = (Interface8) Static258.method4479(arg0.anInt3813, arg0.anInt3819, arg0.anInt3810);
		}
		if (arg0.anInt3815 == 2) {
			local8 = (Interface8) Static82.method1816(arg0.anInt3813, arg0.anInt3819, arg0.anInt3810, sl.class);
		}
		if (arg0.anInt3815 == 3) {
			local8 = (Interface8) Static251.method4403(arg0.anInt3813, arg0.anInt3819, arg0.anInt3810);
		}
		if (local8 == null) {
			arg0.anInt3821 = 0;
			arg0.anInt3812 = 0;
			arg0.anInt3820 = -1;
		} else {
			arg0.anInt3820 = local8.method5549();
			arg0.anInt3821 = local8.method5554();
			arg0.anInt3812 = local8.method5552();
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	public static void method973() {
		for (@Pc(18) Class5_Sub29 local18 = (Class5_Sub29) Static208.aClass211_18.method5608(); local18 != null; local18 = (Class5_Sub29) Static208.aClass211_18.method5603()) {
			if (local18.anInt3811 == -1) {
				local18.anInt3809 = 0;
				method972(local18);
			} else {
				local18.method5803();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jf;)Z")
	public static boolean method974(@OriginalArg(0) Class96 arg0) {
		if (Static213.aBoolean311) {
			if (method975(arg0).anInt1281 != 0) {
				return false;
			}
			if (arg0.anInt2933 == 0) {
				return false;
			}
		}
		return arg0.aBoolean201;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!jf;)Lclient!dc;")
	public static Class5_Sub10 method975(@OriginalArg(0) Class96 arg0) {
		@Pc(13) Class5_Sub10 local13 = (Class5_Sub10) Static61.aClass42_6.method1052(((long) arg0.anInt2877 << 32) + (long) arg0.anInt2914);
		return local13 == null ? arg0.aClass5_Sub10_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)I")
	public static int method976(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class5_Sub19 local10 = (Class5_Sub19) Static331.aClass42_54.method1052((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray134.length > arg0) {
			return local10.anIntArray134[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method979() {
		Static322.anInt6101 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static63.anInt1486; local3++) {
			@Pc(10) Class25_Sub1_Sub1_Sub2 local10 = Static188.aClass25_Sub1_Sub1_Sub2Array1[Static331.anIntArray535[local3]];
			if (local10.aBoolean403 && local10.method4643() != -1) {
				@Pc(28) int local28 = (local10.method4646() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt5769 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt5773 - local28 >> 7;
				@Pc(48) Class25_Sub1_Sub1 local48 = Static159.method2977(Static156.anInt3123, local42, local35);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt5287;
					if (local48 instanceof Class25_Sub1_Sub1_Sub2) {
						local53 += 2048;
					}
					if (local48.anInt5277 == 0 && local48.method4643() != -1) {
						Static110.anIntArray142[Static322.anInt6101] = local53;
						Static52.anIntArray62[Static322.anInt6101] = local53;
						Static322.anInt6101++;
						local48.anInt5277++;
					}
					Static110.anIntArray142[Static322.anInt6101] = local53;
					Static52.anIntArray62[Static322.anInt6101] = local10.anInt5287 + 2048;
					Static322.anInt6101++;
					local48.anInt5277++;
				}
			}
		}
		Static38.method877(0, Static52.anIntArray62, Static110.anIntArray142, Static322.anInt6101 - 1);
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method982() {
		for (@Pc(1) int local1 = -1; local1 < Static161.anInt3258 + Static63.anInt1486; local1++) {
			@Pc(6) Class25_Sub1_Sub1 local6;
			if (local1 < 0) {
				local6 = Static85.aClass25_Sub1_Sub1_Sub1_1;
			} else if (local1 < Static161.anInt3258) {
				local6 = Static312.aClass25_Sub1_Sub1_Sub1Array1[Static220.anIntArray311[local1]];
			} else {
				local6 = Static188.aClass25_Sub1_Sub1_Sub2Array1[Static331.anIntArray535[local1 - Static161.anInt3258]];
			}
			if (local6.anInt5327 >= 0) {
				@Pc(32) int local32 = local6.method4646();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt5769 & 0x7F) != 0 || (local6.anInt5773 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt5769 & 0x7F) != 64 || (local6.anInt5773 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt5769 >> 7;
					local73 = local6.anInt5773 >> 7;
					if (local6.anInt5327 > Static123.anIntArrayArray16[local68][local73]) {
						Static123.anIntArrayArray16[local68][local73] = local6.anInt5327;
						Static193.anIntArrayArray31[local68][local73] = 1;
					} else if (local6.anInt5327 == Static123.anIntArrayArray16[local68][local73]) {
						local109 = Static193.anIntArrayArray31[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt5769 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt5773 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt5769 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt5773 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt5327 > Static123.anIntArrayArray16[local151][local154]) {
								Static123.anIntArrayArray16[local151][local154] = local6.anInt5327;
								Static193.anIntArrayArray31[local151][local154] = 1;
							} else if (local6.anInt5327 == Static123.anIntArrayArray16[local151][local154]) {
								local109 = Static193.anIntArrayArray31[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!jf;)Lclient!jf;")
	public static Class96 method983(@OriginalArg(0) Class96 arg0) {
		@Pc(4) int local4 = method975(arg0).method1133();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static121.method2396(arg0.anInt2929);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method984() {
		for (@Pc(1) int local1 = 0; local1 < Static266.anInt5101; local1++) {
			@Pc(6) int[] local6 = Static123.anIntArrayArray16[local1];
			for (@Pc(8) int local8 = 0; local8 < Static339.anInt6352; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
