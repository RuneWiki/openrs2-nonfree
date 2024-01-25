import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	public static int anInt2126;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public static void method1690() {
		for (@Pc(10) Class2_Sub15 local10 = (Class2_Sub15) Static35.aClass238_3.method5795(); local10 != null; local10 = (Class2_Sub15) Static35.aClass238_3.method5799()) {
			if (local10.anInt2549 == -1) {
				local10.anInt2541 = 0;
				Static243.method4285(local10);
			} else {
				local10.method6130();
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V")
	public static void method1691() {
		if (Static222.anInt4434 > 1) {
			Static222.anInt4434--;
			Static287.anInt5313 = Static245.anInt4796;
		}
		if (Static54.anInt1175 > 0) {
			Static54.anInt1175--;
		}
		if (Static218.aBoolean316) {
			Static218.aBoolean316 = false;
			Static185.method3422();
			return;
		}
		if (!Static214.aBoolean313) {
			Static41.method585();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static119.method2123(); local38++) {
		}
		if (Static121.anInt6774 != 30) {
			return;
		}
		Static130.method5371(Static76.aClass2_Sub24_Sub2_7, Static5.aClass183_1.method4573());
		if (Static357.aClass2_Sub22_2 == null) {
			if (Static7.aLong4 <= Static101.method1805()) {
				Static357.aClass2_Sub22_2 = Static359.aClass145_1.method3770(Static283.aString49);
			}
		} else if (Static357.aClass2_Sub22_2.anInt3502 != -1) {
			Static77.method1332(Static269.aClass183_75);
			Static76.aClass2_Sub24_Sub2_7.method5721(Static357.aClass2_Sub22_2.anInt3502);
			Static357.aClass2_Sub22_2 = null;
			Static7.aLong4 = Static101.method1805() + 30000L;
		}
		@Pc(114) int local114;
		@Pc(135) int local135;
		@Pc(153) int local153;
		@Pc(166) boolean local166;
		@Pc(219) int local219;
		@Pc(226) int local226;
		@Pc(238) int local238;
		if (Static248.aClass2_Sub17_1 != null || Static379.aLong201 < Static101.method1805() - 2000L) {
			@Pc(111) boolean local111 = false;
			local114 = Static76.aClass2_Sub24_Sub2_7.anInt6669;
			for (@Pc(119) Class2_Sub17 local119 = (Class2_Sub17) Static142.aClass238_9.method5795(); local119 != null && Static76.aClass2_Sub24_Sub2_7.anInt6669 - local114 < 240; local119 = (Class2_Sub17) Static142.aClass238_9.method5799()) {
				local119.method6130();
				local135 = local119.method2186();
				if (local135 < 0) {
					local135 = 0;
				} else if (local135 > 65534) {
					local135 = 65534;
				}
				local153 = local119.method2189();
				if (local153 < 0) {
					local153 = 0;
				} else if (local153 > 65534) {
					local153 = 65534;
				}
				local166 = false;
				if (local119.method2186() == -1 && local119.method2189() == -1) {
					local135 = -1;
					local153 = -1;
					local166 = true;
				}
				if (Static378.anInt4760 != local153 || local135 != Static310.anInt5684) {
					if (!local111) {
						Static77.method1332(Static280.aClass183_78);
						Static76.aClass2_Sub24_Sub2_7.method5746(0);
						local111 = true;
						local114 = Static76.aClass2_Sub24_Sub2_7.anInt6669;
					}
					local219 = local153 - Static378.anInt4760;
					Static378.anInt4760 = local153;
					local226 = local135 - Static310.anInt5684;
					Static310.anInt5684 = local135;
					local238 = (int) ((local119.method2188() - Static379.aLong201) / 20L);
					if (local238 < 8 && local219 >= -32 && local219 <= 31 && local226 >= -32 && local226 <= 31) {
						local226 += 32;
						local219 += 32;
						Static76.aClass2_Sub24_Sub2_7.method5721((local219 << 6) + (local238 << 12) + local226);
					} else if (local238 < 32 && local219 >= -128 && local219 <= 127 && local226 >= -128 && local226 <= 127) {
						local226 += 128;
						Static76.aClass2_Sub24_Sub2_7.method5746(local238 + 128);
						local219 += 128;
						Static76.aClass2_Sub24_Sub2_7.method5721((local219 << 8) + local226);
					} else if (local238 < 32) {
						Static76.aClass2_Sub24_Sub2_7.method5746(local238 + 192);
						if (local166) {
							Static76.aClass2_Sub24_Sub2_7.method5734(Integer.MIN_VALUE);
						} else {
							Static76.aClass2_Sub24_Sub2_7.method5734(local135 << 16 | local153);
						}
					} else {
						Static76.aClass2_Sub24_Sub2_7.method5721(local238 + 57344);
						if (local166) {
							Static76.aClass2_Sub24_Sub2_7.method5734(Integer.MIN_VALUE);
						} else {
							Static76.aClass2_Sub24_Sub2_7.method5734(local153 | local135 << 16);
						}
					}
					Static379.aLong201 = local119.method2188();
				}
			}
			if (local111) {
				Static76.aClass2_Sub24_Sub2_7.method5727(Static76.aClass2_Sub24_Sub2_7.anInt6669 - local114);
			}
		}
		@Pc(421) int local421;
		@Pc(464) int local464;
		if (Static248.aClass2_Sub17_1 != null) {
			@Pc(405) long local405 = (Static248.aClass2_Sub17_1.method2188() - Static32.aLong12) / 50L;
			Static32.aLong12 = Static248.aClass2_Sub17_1.method2188();
			if (local405 > 32767L) {
				local405 = 32767L;
			}
			local421 = Static248.aClass2_Sub17_1.method2186();
			if (local421 < 0) {
				local421 = 0;
			} else if (local421 > 65535) {
				local421 = 65535;
			}
			local135 = Static248.aClass2_Sub17_1.method2189();
			if (local135 < 0) {
				local135 = 0;
			} else if (local135 > 65535) {
				local135 = 65535;
			}
			@Pc(454) byte local454 = 0;
			if (Static248.aClass2_Sub17_1.method2187() == 2) {
				local454 = 1;
			}
			local464 = (int) local405;
			Static77.method1332(Static24.aClass183_3);
			Static76.aClass2_Sub24_Sub2_7.method5721(local454 << 15 | local464);
			Static76.aClass2_Sub24_Sub2_7.method5734(local421 << 16 | local135);
		}
		@Pc(496) int local496;
		if (Static154.anInt3218 > 0) {
			local496 = 0;
			for (local114 = 0; local114 < Static154.anInt3218; local114++) {
				if (Static286.aClass13Array1[local114].method118()) {
					local496++;
				}
			}
			if (local496 > 0) {
				Static77.method1332(Static27.aClass183_36);
				if (local496 > 75) {
					local496 = 75;
				}
				Static76.aClass2_Sub24_Sub2_7.method5746(local496 * 3);
				for (local421 = 0; local421 < Static154.anInt3218; local421++) {
					@Pc(541) Class13 local541 = Static286.aClass13Array1[local421];
					if (local541.method118()) {
						@Pc(556) long local556 = (local541.method121() - Static150.aLong88) / 50L;
						if (local556 > 65535L) {
							local556 = 65535L;
						}
						Static150.aLong88 = local541.method121();
						Static76.aClass2_Sub24_Sub2_7.method5746(local541.method122());
						Static76.aClass2_Sub24_Sub2_7.method5721((int) local556);
					}
				}
			}
		}
		if (Static220.anInt4427 > 0) {
			Static220.anInt4427--;
		}
		if (Static221.aBoolean480 && Static220.anInt4427 <= 0) {
			Static220.anInt4427 = 20;
			Static221.aBoolean480 = false;
			Static77.method1332(Static25.aClass183_58);
			Static76.aClass2_Sub24_Sub2_7.method5715((int) Static323.aFloat71 >> 3);
			Static76.aClass2_Sub24_Sub2_7.method5715((int) Static350.aFloat74 >> 3);
		}
		if (Static174.aBoolean267 && !Static256.aBoolean363) {
			Static256.aBoolean363 = true;
			Static77.method1332(Static210.aClass183_106);
			Static76.aClass2_Sub24_Sub2_7.method5746(1);
		}
		if (!Static174.aBoolean267 && Static256.aBoolean363) {
			Static256.aBoolean363 = false;
			Static77.method1332(Static210.aClass183_106);
			Static76.aClass2_Sub24_Sub2_7.method5746(0);
		}
		if (!Static383.aBoolean489) {
			Static77.method1332(Static104.aClass183_27);
			Static76.aClass2_Sub24_Sub2_7.method5734(Static49.method728());
			Static383.aBoolean489 = true;
		}
		if (Static45.aClass188ArrayArrayArray5 != null) {
			if (Static198.anInt4108 == 2) {
				Static224.method3965();
			} else if (Static198.anInt4108 == 3) {
				Static287.method4734();
			}
		}
		if (Static390.aBoolean507) {
			Static390.aBoolean507 = false;
		} else {
			Static335.aFloat72 /= 2.0F;
		}
		if (Static9.aBoolean23) {
			Static9.aBoolean23 = false;
		} else {
			Static106.aFloat8 /= 2.0F;
		}
		Static245.method4304();
		if (Static121.anInt6774 != 30) {
			return;
		}
		Static147.method2659();
		Static4.method60();
		Static34.method472();
		Static115.method2054();
		Static89.anInt1900++;
		if (Static89.anInt1900 > 750) {
			Static185.method3422();
			return;
		}
		Static29.method339();
		Static24.method277();
		Static195.method3551();
		for (local496 = Static179.aClass115_1.method2777(true); local496 != -1; local496 = Static179.aClass115_1.method2777(false)) {
			Static285.method4704(local496);
			Static235.anIntArray388[Static71.anInt1580++ & 0x1F] = local496;
		}
		@Pc(862) Class3 local862;
		for (@Pc(794) Class2_Sub7_Sub2 local794 = Static330.method5315(); local794 != null; local794 = Static330.method5315()) {
			local421 = local794.method1200();
			local135 = local794.method1194();
			if (local421 == 1) {
				Static318.anIntArray509[local135] = local794.anInt1465;
				Static176.aBoolean269 |= Static137.aBooleanArray7[local135];
				Static44.anIntArray63[Static223.anInt4471++ & 0x1F] = local135;
			} else if (local421 == 2) {
				Static197.aStringArray20[local135] = local794.aString16;
				Static75.anIntArray126[Static354.anInt6503++ & 0x1F] = local135;
			} else if (local421 == 3) {
				local862 = Static380.method5987(local135);
				if (!local794.aString16.equals(local862.aString4)) {
					local862.aString4 = local794.aString16;
					Static128.method2229(local862);
				}
			} else if (local421 == 4) {
				local862 = Static380.method5987(local135);
				local464 = local794.anInt1465;
				local219 = local794.anInt1462;
				local226 = local794.anInt1468;
				if (local464 != local862.anInt63 || local219 != local862.anInt101 || local226 != local862.anInt69) {
					local862.anInt69 = local226;
					local862.anInt63 = local464;
					local862.anInt101 = local219;
					Static128.method2229(local862);
				}
			} else if (local421 == 5) {
				local862 = Static380.method5987(local135);
				if (local794.anInt1465 != local862.anInt48 || local794.anInt1465 == -1) {
					local862.anInt48 = local794.anInt1465;
					local862.anInt80 = 1;
					local862.anInt112 = 0;
					local862.anInt82 = 0;
					Static128.method2229(local862);
				}
			} else if (local421 == 6) {
				local153 = local794.anInt1465;
				local464 = local153 >> 10 & 0x1F;
				local219 = local153 >> 5 & 0x1F;
				local226 = local153 & 0x1F;
				local238 = (local226 << 3) + (local219 << 11) + (local464 << 19);
				@Pc(1260) Class3 local1260 = Static380.method5987(local135);
				if (local238 != local1260.anInt103) {
					local1260.anInt103 = local238;
					Static128.method2229(local1260);
				}
			} else if (local421 == 7) {
				local862 = Static380.method5987(local135);
				local166 = local794.anInt1465 == 1;
				if (local862.aBoolean12 != local166) {
					local862.aBoolean12 = local166;
					Static128.method2229(local862);
				}
			} else if (local421 == 8) {
				local862 = Static380.method5987(local135);
				if (local862.anInt44 != local794.anInt1465 || local862.anInt105 != local794.anInt1462 || local862.anInt68 != local794.anInt1468) {
					local862.anInt44 = local794.anInt1465;
					local862.anInt105 = local794.anInt1462;
					local862.anInt68 = local794.anInt1468;
					if (local862.anInt56 != -1) {
						if (local862.anInt70 > 0) {
							local862.anInt68 = local862.anInt68 * 32 / local862.anInt70;
						} else if (local862.anInt52 > 0) {
							local862.anInt68 = local862.anInt68 * 32 / local862.anInt52;
						}
					}
					Static128.method2229(local862);
				}
			} else if (local421 == 9) {
				local862 = Static380.method5987(local135);
				if (local862.anInt56 != local794.anInt1465 || local862.anInt92 != local794.anInt1462) {
					local862.anInt92 = local794.anInt1462;
					local862.anInt56 = local794.anInt1465;
					Static128.method2229(local862);
				}
			} else if (local421 == 10) {
				local862 = Static380.method5987(local135);
				if (local862.anInt57 != local794.anInt1465 || local794.anInt1462 != local862.anInt117 || local862.anInt102 != local794.anInt1468) {
					local862.anInt102 = local794.anInt1468;
					local862.anInt57 = local794.anInt1465;
					local862.anInt117 = local794.anInt1462;
					Static128.method2229(local862);
				}
			} else if (local421 == 11) {
				local862 = Static380.method5987(local135);
				local862.anInt114 = local862.anInt41 = local794.anInt1465;
				local862.anInt50 = local862.anInt40 = local794.anInt1462;
				local862.aByte4 = 0;
				local862.aByte2 = 0;
				Static128.method2229(local862);
			} else if (local421 == 12) {
				local862 = Static380.method5987(local135);
				local464 = local794.anInt1465;
				if (local862 != null && local862.anInt91 == 0) {
					if (local862.anInt111 - local862.anInt116 < local464) {
						local464 = local862.anInt111 - local862.anInt116;
					}
					if (local464 < 0) {
						local464 = 0;
					}
					if (local464 != local862.anInt93) {
						local862.anInt93 = local464;
						Static128.method2229(local862);
					}
				}
			} else if (local421 == 14) {
				local862 = Static380.method5987(local135);
				local862.anInt42 = local794.anInt1465;
			} else if (local421 == 15) {
				Static391.anInt7123 = local794.anInt1465;
				Static280.anInt5248 = local794.anInt1462;
				Static177.aBoolean270 = true;
			} else if (local421 == 16) {
				local862 = Static380.method5987(local135);
				local862.anInt108 = local794.anInt1465;
			}
		}
		Static278.anInt5166++;
		if (Static386.anInt7023 != 0) {
			Static370.anInt4786 += 20;
			if (Static370.anInt4786 >= 400) {
				Static386.anInt7023 = 0;
			}
		}
		if (Static72.aClass3_7 != null) {
			Static311.anInt3022++;
			if (Static311.anInt3022 >= 15) {
				Static128.method2229(Static72.aClass3_7);
				Static72.aClass3_7 = null;
			}
		}
		Static305.aBoolean492 = false;
		Static360.aClass3_18 = null;
		Static302.aBoolean412 = false;
		Static85.aClass3_8 = null;
		Static315.method5101(-1, -1, null);
		Static38.method534(-1, null, -1);
		Static215.method3853();
		Static245.anInt4796++;
		if (Static236.aBoolean347) {
			Static77.method1332(Static388.aClass183_113);
			Static76.aClass2_Sub24_Sub2_7.method5734(Static189.anInt638 << 28 | Static140.anInt2986 << 14 | Static224.anInt4489);
			Static236.aBoolean347 = false;
		}
		while (true) {
			@Pc(1416) Class2_Sub5 local1416;
			@Pc(1421) Class3 local1421;
			do {
				local1416 = (Class2_Sub5) Static342.aClass238_41.method5803();
				if (local1416 == null) {
					while (true) {
						do {
							local1416 = (Class2_Sub5) Static207.aClass238_18.method5803();
							if (local1416 == null) {
								while (true) {
									do {
										local1416 = (Class2_Sub5) Static269.aClass238_30.method5803();
										if (local1416 == null) {
											if (Static85.aClass3_8 == null) {
												Static334.anInt6171 = 0;
											}
											if (Static268.aClass3_13 != null) {
												Static339.method5457();
											}
											if (Static273.anInt5130 > 0 && Static68.aClass98_1.method4517(82) && Static68.aClass98_1.method4517(81) && Static256.anInt4912 != 0) {
												local421 = Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 - Static256.anInt4912;
												if (local421 < 0) {
													local421 = 0;
												} else if (local421 > 3) {
													local421 = 3;
												}
												Static206.method3764(Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray465[0] + Static350.anInt6470, Static182.aClass1_Sub2_Sub1_Sub1_1.anIntArray466[0] + Static279.anInt5198, local421);
											}
											Static385.method6038();
											for (local421 = 0; local421 < 5; local421++) {
												@Pc(1615) int local1615 = Static45.anIntArray526[local421]++;
											}
											if (Static176.aBoolean269 && Static194.aLong117 < Static101.method1805() - 60000L) {
												Static209.method3787();
											}
											Static270.anInt5105++;
											if (Static270.anInt5105 > 500) {
												Static270.anInt5105 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x1) == 1) {
													Static378.anInt4759 += Static51.anInt1107;
												}
												if ((local135 & 0x4) == 4) {
													Static347.anInt6374 += Static22.anInt339;
												}
												if ((local135 & 0x2) == 2) {
													Static312.anInt5705 += Static354.anInt6509;
												}
											}
											if (Static378.anInt4759 < -50) {
												Static51.anInt1107 = 2;
											}
											if (Static378.anInt4759 > 50) {
												Static51.anInt1107 = -2;
											}
											if (Static312.anInt5705 < -55) {
												Static354.anInt6509 = 2;
											}
											if (Static312.anInt5705 > 55) {
												Static354.anInt6509 = -2;
											}
											if (Static347.anInt6374 < -40) {
												Static22.anInt339 = 1;
											}
											Static293.anInt1079++;
											if (Static347.anInt6374 > 40) {
												Static22.anInt339 = -1;
											}
											if (Static293.anInt1079 > 500) {
												Static293.anInt1079 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x2) == 2) {
													Static59.anInt1283 += Static94.anInt2030;
												}
												if ((local135 & 0x1) == 1) {
													Static319.anInt5841 += Static313.anInt5735;
												}
											}
											if (Static319.anInt5841 < -60) {
												Static313.anInt5735 = 2;
											}
											if (Static59.anInt1283 < -20) {
												Static94.anInt2030 = 1;
											}
											if (Static319.anInt5841 > 60) {
												Static313.anInt5735 = -2;
											}
											if (Static59.anInt1283 > 10) {
												Static94.anInt2030 = -1;
											}
											Static279.anInt5197++;
											if (Static279.anInt5197 > 50) {
												Static77.method1332(Static322.aClass183_94);
											}
											if (Static150.aBoolean242) {
												Static63.method1171();
												Static150.aBoolean242 = false;
											}
											try {
												if (Static386.aClass226_4 != null && Static76.aClass2_Sub24_Sub2_7.anInt6669 > 0) {
													Static261.anInt4992 += Static76.aClass2_Sub24_Sub2_7.anInt6669;
													Static386.aClass226_4.method5549(Static76.aClass2_Sub24_Sub2_7.anInt6669, Static76.aClass2_Sub24_Sub2_7.aByteArray100);
													Static279.anInt5197 = 0;
													Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
												}
											} catch (@Pc(1828) IOException local1828) {
												Static185.method3422();
											}
											return;
										}
										local1421 = local1416.aClass3_4;
										if (local1421.anInt45 < 0) {
											break;
										}
										local862 = Static380.method5987(local1421.anInt87);
									} while (local862 == null || local862.aClass3Array1 == null || local862.aClass3Array1.length <= local1421.anInt45 || local1421 != local862.aClass3Array1[local1421.anInt45]);
									Static351.method5589(local1416);
								}
							}
							local1421 = local1416.aClass3_4;
							if (local1421.anInt45 < 0) {
								break;
							}
							local862 = Static380.method5987(local1421.anInt87);
						} while (local862 == null || local862.aClass3Array1 == null || local862.aClass3Array1.length <= local1421.anInt45 || local1421 != local862.aClass3Array1[local1421.anInt45]);
						Static351.method5589(local1416);
					}
				}
				local1421 = local1416.aClass3_4;
				if (local1421.anInt45 < 0) {
					break;
				}
				local862 = Static380.method5987(local1421.anInt87);
			} while (local862 == null || local862.aClass3Array1 == null || local862.aClass3Array1.length <= local1421.anInt45 || local1421 != local862.aClass3Array1[local1421.anInt45]);
			Static351.method5589(local1416);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!bi;Z)V")
	public static void method1692(@OriginalArg(0) Class25 arg0) {
		Static169.aClass25_3 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method1693(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) long local17 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = (local17 << 5) - (local17 - ((long) arg0.charAt(local19)));
		}
		return local17;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)Lclient!ob;")
	public static Class2_Sub7_Sub12 method1694() {
		return Static20.aClass2_Sub7_Sub12_3;
	}
}
