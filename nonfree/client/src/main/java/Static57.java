import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "Lclient!gf;")
	public static Class33 aClass33_9;

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
	public static int anInt1590;

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "Lclient!eh;")
	private static Class28 aClass28_478 = Static170.method3101("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "Lclient!eh;")
	private static Class28 aClass28_479 = Static170.method3101("Invalid username or password)3");

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "Lclient!eh;")
	public static Class28 aClass28_480 = aClass28_479;

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array8 = new Class28[100];

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "Lclient!eh;")
	public static Class28 aClass28_481 = Static170.method3101("headicons_prayer");

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_482 = aClass28_478;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V")
	public static void method1257(@OriginalArg(0) int arg0) {
		if (Static8.anInt1209 == 0) {
			Static156.aClass3_Sub3_Sub2_2.method1898(arg0);
		} else {
			Static164.anInt3981 = arg0;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method1258() {
		aByteArrayArrayArray11 = null;
		aClass33_9 = null;
		aClass28Array8 = null;
		anIntArray281 = null;
		aClass28_482 = null;
		aClass28_478 = null;
		aClass28_480 = null;
		aClass28_479 = null;
		aClass28_481 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[Lclient!gf;IIIIIIII)V")
	public static void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) Class33[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static147.method1773(arg3, arg4, arg2, arg8);
		Static13.method509();
		for (@Pc(25) int local25 = 0; local25 < arg1.length; local25++) {
			@Pc(30) Class33 local30 = arg1[local25];
			if (local30 != null && (local30.anInt1488 == arg0 || arg0 == -1412584499 && Static22.aClass33_2 == local30)) {
				@Pc(79) int local79;
				if (arg5 == -1) {
					Static24.anIntArray154[Static2.anInt84] = local30.anInt1492 + arg6;
					Static64.anIntArray332[Static2.anInt84] = arg7 + local30.anInt1480;
					Static78.anIntArray382[Static2.anInt84] = local30.anInt1457;
					Static166.anIntArray675[Static2.anInt84] = local30.anInt1515;
					local79 = Static2.anInt84++;
				} else {
					local79 = arg5;
				}
				local30.anInt1476 = Static14.anInt481;
				local30.anInt1454 = local79;
				if (!local30.aBoolean90 || !Static61.method1440(local30)) {
					if (local30.anInt1477 > 0) {
						Static99.method2104(local30);
					}
					@Pc(106) int local106 = arg6 + local30.anInt1492;
					@Pc(112) int local112 = local30.anInt1480 + arg7;
					@Pc(115) int local115 = local30.anInt1456;
					@Pc(137) int local137;
					@Pc(169) int local169;
					if (local30 == Static22.aClass33_2) {
						if (arg0 != -1412584499 && !local30.aBoolean76) {
							Static108.anInt2798 = arg7;
							Static35.aClass33Array1 = arg1;
							Static113.anInt2912 = arg6;
							continue;
						}
						if (Static58.aBoolean106 && Static176.aBoolean193) {
							local137 = Static73.anInt2181;
							local137 -= Static122.anInt3147;
							if (local137 < Static168.anInt4083) {
								local137 = Static168.anInt4083;
							}
							if (local30.anInt1457 + local137 > Static54.aClass33_8.anInt1457 + Static168.anInt4083) {
								local137 = Static54.aClass33_8.anInt1457 + Static168.anInt4083 - local30.anInt1457;
							}
							local169 = Static35.anInt1049;
							local169 -= Static155.anInt3860;
							if (local169 < Static34.anInt1034) {
								local169 = Static34.anInt1034;
							}
							if (Static34.anInt1034 + Static54.aClass33_8.anInt1515 < local30.anInt1515 + local169) {
								local169 = Static54.aClass33_8.anInt1515 + Static34.anInt1034 - local30.anInt1515;
							}
							local106 = local137;
							local112 = local169;
						}
						if (!local30.aBoolean76) {
							local115 = 128;
						}
					}
					@Pc(218) int local218;
					@Pc(220) int local220;
					@Pc(249) int local249;
					@Pc(262) int local262;
					@Pc(283) int local283;
					@Pc(312) int local312;
					if (local30.anInt1522 == 2) {
						local169 = arg4;
						local218 = arg2;
						local220 = arg8;
						local137 = arg3;
					} else if (local30.anInt1522 == 9) {
						local249 = local106;
						local262 = local112;
						local283 = local30.anInt1457 + local106;
						if (local283 < local106) {
							local249 = local283;
							local283 = local106;
						}
						local283++;
						local218 = local283 < arg2 ? local283 : arg2;
						local137 = arg3 >= local249 ? arg3 : local249;
						local312 = local112 + local30.anInt1515;
						if (local112 > local312) {
							local262 = local312;
							local312 = local112;
						}
						local312++;
						local220 = arg8 <= local312 ? arg8 : local312;
						local169 = arg4 < local262 ? local262 : arg4;
					} else {
						local137 = arg3 >= local106 ? arg3 : local106;
						local169 = arg4 < local112 ? local112 : arg4;
						local249 = local106 + local30.anInt1457;
						local218 = local249 >= arg2 ? arg2 : local249;
						local262 = local112 + local30.anInt1515;
						local220 = arg8 <= local262 ? arg8 : local262;
					}
					if (!local30.aBoolean90 || local218 > local137 && local220 > local169) {
						if (local30.anInt1477 != 0) {
							if (local30.anInt1477 == 1337) {
								Static170.anInt4093 = local106;
								Static82.anInt2401 = local112;
								Static171.method3109(local112, local30.anInt1457, local30.anInt1515, local106);
								Static147.method1773(arg3, arg4, arg2, arg8);
								continue;
							}
							if (local30.anInt1477 == 1338) {
								if (local30.method1204()) {
									Static168.method3095(local30, local112, local79, local106);
									Static147.method1773(arg3, arg4, arg2, arg8);
								}
								continue;
							}
							if (local30.anInt1477 == 1339) {
								if (local30.method1204()) {
									Static34.method856(local106, local30, local79, local112);
									Static147.method1773(arg3, arg4, arg2, arg8);
								}
								continue;
							}
						}
						local249 = Static73.anInt2181;
						local262 = Static35.anInt1049;
						if (!Static69.aBoolean112 && local249 >= local137 && local262 >= local169 && local249 < local218 && local220 > local262) {
							Static152.method2883(local249 - local106, local30, local262 - local112);
						}
						if (local30.anInt1522 == 0) {
							if (!local30.aBoolean90 && Static61.method1440(local30) && aClass33_9 != local30) {
								continue;
							}
							if (!local30.aBoolean90) {
								if (local30.anInt1490 > local30.anInt1458 - local30.anInt1515) {
									local30.anInt1490 = local30.anInt1458 - local30.anInt1515;
								}
								if (local30.anInt1490 < 0) {
									local30.anInt1490 = 0;
								}
							}
							method1259(local30.anInt1471, arg1, local218, local137, local169, local79, local106 - local30.anInt1524, -local30.anInt1490 + local112, local220);
							if (local30.aClass33Array2 != null) {
								method1259(local30.anInt1471, local30.aClass33Array2, local218, local137, local169, local79, local106 - local30.anInt1524, local112 - local30.anInt1490, local220);
							}
							@Pc(561) Class3_Sub7 local561 = (Class3_Sub7) Static119.aClass87_11.method3201((long) local30.anInt1471);
							if (local561 != null) {
								if (local561.anInt1547 == 0 && Static73.anInt2181 >= local137 && local169 <= Static35.anInt1049 && local218 > Static73.anInt2181 && local220 > Static35.anInt1049 && !Static69.aBoolean112 && !Static168.aBoolean190) {
									Static145.aClass28Array22[0] = Static107.aClass28_893;
									Static82.anInt2400 = 1;
									Static69.aClass28Array12[0] = Static156.aClass28_1306;
									Static21.aShortArray8[0] = 1003;
								}
								Static155.method2948(local220, local561.anInt1548, local79, local106, local112, local137, local169, local218);
							}
							Static147.method1773(arg3, arg4, arg2, arg8);
							Static13.method509();
						}
						if (Static138.aBooleanArray16[local79] || Static116.anInt2985 > 1) {
							if (local30.anInt1522 == 0 && !local30.aBoolean90 && local30.anInt1458 > local30.anInt1515) {
								Static118.method2370(local30.anInt1457 + local106, local30.anInt1515, local30.anInt1490, local112, local30.anInt1458);
							}
							if (local30.anInt1522 != 1) {
								@Pc(673) int local673;
								@Pc(692) int local692;
								@Pc(834) int local834;
								@Pc(728) int local728;
								@Pc(891) int local891;
								@Pc(893) int local893;
								@Pc(916) int local916;
								@Pc(683) int local683;
								@Pc(851) int local851;
								if (local30.anInt1522 == 2) {
									local283 = 0;
									for (local312 = 0; local312 < local30.anInt1515; local312++) {
										for (local673 = 0; local673 < local30.anInt1457; local673++) {
											local683 = local112 + (local30.anInt1489 + 32) * local312;
											local692 = local673 * (local30.anInt1483 + 32) + local106;
											if (local283 < 20) {
												local692 += local30.anIntArray260[local283];
												local683 += local30.anIntArray259[local283];
											}
											if (local30.anIntArray261[local283] > 0) {
												local728 = local30.anIntArray261[local283] - 1;
												if (local692 + 32 > arg3 && arg2 > local692 && arg4 < local683 + 32 && arg8 > local683 || local30 == Static165.aClass33_13 && Static69.anInt2118 == local283) {
													@Pc(793) Class3_Sub2_Sub2_Sub4 local793;
													if (Static95.anInt2636 == 1 && Static161.anInt3932 == local283 && Static167.anInt4077 == local30.anInt1471) {
														local793 = Static14.method529(local728, 2, 0, local30.anIntArray266[local283], false);
													} else {
														local793 = Static14.method529(local728, 1, 3153952, local30.anIntArray266[local283], false);
													}
													if (local793 == null) {
														Static16.method534(local30);
													} else if (Static165.aClass33_13 == local30 && Static69.anInt2118 == local283) {
														local834 = Static35.anInt1049 - Static15.anInt1150;
														if (local834 < 5 && local834 > -5) {
															local834 = 0;
														}
														local851 = Static73.anInt2181 - Static79.anInt2335;
														if (local851 < 5 && local851 > -5) {
															local851 = 0;
														}
														if (Static38.anInt1097 < 5) {
															local851 = 0;
															local834 = 0;
														}
														local793.method1001(local851 + local692, local834 + local683, 128);
														if (arg0 != -1) {
															@Pc(889) Class33 local889 = arg1[arg0 & 0xFFFF];
															local891 = Static147.anInt2299;
															local893 = Static147.anInt2300;
															if (local891 > local683 + local834 && local889.anInt1490 > 0) {
																local916 = (local891 - local834 - local683) * Static165.anInt3991 / 3;
																if (local916 > Static165.anInt3991 * 10) {
																	local916 = Static165.anInt3991 * 10;
																}
																if (local916 > local889.anInt1490) {
																	local916 = local889.anInt1490;
																}
																local889.anInt1490 -= local916;
																Static15.anInt1150 += local916;
																Static16.method534(local889);
															}
															if (local893 < local683 + local834 + 32 && local889.anInt1490 < local889.anInt1458 - local889.anInt1515) {
																local916 = Static165.anInt3991 * (local683 + local834 + 32 - local893) / 3;
																if (Static165.anInt3991 * 10 < local916) {
																	local916 = Static165.anInt3991 * 10;
																}
																if (local889.anInt1458 - local889.anInt1490 - local889.anInt1515 < local916) {
																	local916 = local889.anInt1458 - local889.anInt1515 - local889.anInt1490;
																}
																local889.anInt1490 += local916;
																Static15.anInt1150 -= local916;
																Static16.method534(local889);
															}
														}
													} else if (Static159.aClass33_12 == local30 && Static19.anInt557 == local283) {
														local793.method1001(local692, local683, 128);
													} else {
														local793.method996(local692, local683);
													}
												}
											} else if (local30.anIntArray267 != null && local283 < 20) {
												@Pc(1055) Class3_Sub2_Sub2_Sub4 local1055 = local30.method1197(local283);
												if (local1055 != null) {
													local1055.method996(local692, local683);
												} else if (Static52.aBoolean88) {
													Static16.method534(local30);
												}
											}
											local283++;
										}
									}
								} else if (local30.anInt1522 == 3) {
									if (Static113.method2278(local30)) {
										local283 = local30.anInt1469;
										if (local30 == aClass33_9 && local30.anInt1470 != 0) {
											local283 = local30.anInt1470;
										}
									} else {
										local283 = local30.anInt1461;
										if (aClass33_9 == local30 && local30.anInt1481 != 0) {
											local283 = local30.anInt1481;
										}
									}
									if (local115 == 0) {
										if (local30.aBoolean80) {
											Static147.method1775(local106, local112, local30.anInt1457, local30.anInt1515, local283);
										} else {
											Static147.method1777(local106, local112, local30.anInt1457, local30.anInt1515, local283);
										}
									} else if (local30.aBoolean80) {
										Static147.method1768(local106, local112, local30.anInt1457, local30.anInt1515, local283, 256 - (local115 & 0xFF));
									} else {
										Static147.method1779(local106, local112, local30.anInt1457, local30.anInt1515, local283, 256 - (local115 & 0xFF));
									}
								} else {
									@Pc(1180) Class3_Sub2_Sub2_Sub1_Sub1 local1180;
									if (local30.anInt1522 == 4) {
										local1180 = local30.method1208();
										if (local1180 != null) {
											@Pc(1191) Class28 local1191 = local30.aClass28_455;
											if (Static113.method2278(local30)) {
												local312 = local30.anInt1469;
												if (local30 == aClass33_9 && local30.anInt1470 != 0) {
													local312 = local30.anInt1470;
												}
												if (local30.aClass28_454.method901() > 0) {
													local1191 = local30.aClass28_454;
												}
											} else {
												local312 = local30.anInt1461;
												if (aClass33_9 == local30 && local30.anInt1481 != 0) {
													local312 = local30.anInt1481;
												}
											}
											if (local30.aBoolean90 && local30.anInt1514 != -1) {
												@Pc(1246) Class3_Sub2_Sub10 local1246 = Static76.method1736(local30.anInt1514);
												local1191 = local1246.aClass28_566;
												if (local1191 == null) {
													local1191 = Static50.aClass28_439;
												}
												if ((local1246.anInt1896 == 1 || local30.anInt1511 != 1) && local30.anInt1511 != -1) {
													local1191 = Static4.method96(new Class28[] { Static29.aClass28_304, local1191, Static103.aClass28_858, Static163.method3016(local30.anInt1511) });
												}
											}
											if (local30 == Static175.aClass33_15) {
												local312 = local30.anInt1461;
												local1191 = Static117.aClass28_982;
											}
											if (!local30.aBoolean90) {
												local1191 = Static159.method2977(local30, local1191);
											}
											local1180.method1810(local1191, local106, local112, local30.anInt1457, local30.anInt1515, local312, local30.aBoolean81 ? 0 : -1, local30.anInt1473, local30.anInt1466, local30.anInt1478);
										} else if (Static52.aBoolean88) {
											Static16.method534(local30);
										}
									} else if (local30.anInt1522 == 5) {
										@Pc(1359) Class3_Sub2_Sub2_Sub4 local1359;
										if (local30.aBoolean90) {
											if (local30.anInt1514 == -1) {
												local1359 = local30.method1198(false);
											} else {
												local1359 = Static14.method529(local30.anInt1514, local30.anInt1506, local30.anInt1482, local30.anInt1511, false);
											}
											if (local1359 != null) {
												local312 = local1359.anInt1173;
												local673 = local1359.anInt1172;
												if (local30.aBoolean89) {
													Static147.method1764(local106, local112, local106 + local30.anInt1457, local30.anInt1515 + local112);
													local692 = (local312 + local30.anInt1457 - 1) / local312;
													local683 = (local30.anInt1515 + local673 - 1) / local673;
													for (local851 = 0; local851 < local692; local851++) {
														for (local834 = 0; local834 < local683; local834++) {
															if (local30.anInt1484 != 0) {
																local1359.method1000(local312 / 2 + local106 + local312 * local851, local673 * local834 + (local112 - -(local673 / 2)), local30.anInt1484, 4096);
															} else if (local115 == 0) {
																local1359.method996(local106 + local312 * local851, local673 * local834 + local112);
															} else {
																local1359.method1001(local851 * local312 + local106, local112 + local834 * local673, 256 - (local115 & 0xFF));
															}
														}
													}
													Static147.method1773(arg3, arg4, arg2, arg8);
												} else {
													local692 = local30.anInt1457 * 4096 / local312;
													if (local30.anInt1484 != 0) {
														local1359.method1000(local30.anInt1457 / 2 + local106, local30.anInt1515 / 2 + local112, local30.anInt1484, local692);
													} else if (local115 != 0) {
														local1359.method997(local106, local112, local30.anInt1457, local30.anInt1515, 256 - (local115 & 0xFF));
													} else if (local312 == local30.anInt1457 && local673 == local30.anInt1515) {
														local1359.method996(local106, local112);
													} else {
														local1359.method983(local106, local112, local30.anInt1457, local30.anInt1515);
													}
												}
											} else if (Static52.aBoolean88) {
												Static16.method534(local30);
											}
										} else {
											local1359 = local30.method1198(Static113.method2278(local30));
											if (local1359 != null) {
												local1359.method996(local106, local112);
											} else if (Static52.aBoolean88) {
												Static16.method534(local30);
											}
										}
									} else {
										@Pc(1620) Class3_Sub2_Sub10 local1620;
										if (local30.anInt1522 == 6) {
											@Pc(1597) boolean local1597 = Static113.method2278(local30);
											if (local1597) {
												local312 = local30.anInt1495;
											} else {
												local312 = local30.anInt1523;
											}
											local692 = 0;
											@Pc(1610) Class3_Sub2_Sub1_Sub1 local1610 = null;
											if (local30.anInt1514 != -1) {
												local1620 = Static76.method1736(local30.anInt1514);
												if (local1620 != null) {
													local1620 = local1620.method1466(local30.anInt1511);
													local1610 = local1620.method1453(null, 0, 1);
													if (local1610 == null) {
														Static16.method534(local30);
													} else {
														local1610.method191();
														local692 = -local1610.aShort36 / 2;
													}
												}
											} else if (local30.anInt1493 == 5) {
												if (local30.anInt1455 == -1) {
													local1610 = Static180.aClass76_2.method2967(-1, null, null, -1);
												} else {
													local683 = local30.anInt1455 & 0x7FF;
													if (Static155.anInt3857 == local683) {
														local683 = 2047;
													}
													@Pc(1732) Class3_Sub2_Sub1_Sub2_Sub1 local1732 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local683];
													@Pc(1741) Class3_Sub2_Sub4 local1741 = local312 == -1 ? null : Static21.method594(local312);
													if (local1732 != null && (int) local1732.aClass28_296.method924() << 11 == (local30.anInt1455 & 0xFFFFF800)) {
														local1610 = local1732.aClass76_1.method2967(0, local1741, null, local30.anInt1467);
													}
												}
											} else if (local312 == -1) {
												local1610 = local30.method1202(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass76_1, local1597, null, -1);
												if (local1610 == null && Static52.aBoolean88) {
													Static16.method534(local30);
												}
											} else {
												@Pc(1664) Class3_Sub2_Sub4 local1664 = Static21.method594(local312);
												local1610 = local30.method1202(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass76_1, local1597, local1664, local30.anInt1467);
												if (local1610 == null && Static52.aBoolean88) {
													Static16.method534(local30);
												}
											}
											if (local1610 != null) {
												Static13.method510(local30.anInt1465 + local30.anInt1457 / 2 + local106, local30.anInt1505 + local112 + local30.anInt1515 / 2);
												local683 = local30.anInt1519 * Class3_Sub2_Sub2_Sub2.anIntArray127[local30.anInt1474] >> 16;
												local851 = local30.anInt1519 * Class3_Sub2_Sub2_Sub2.anIntArray129[local30.anInt1474] >> 16;
												if (!local30.aBoolean90) {
													local1610.method193(local30.anInt1508, 0, local30.anInt1474, 0, local683, local851);
												} else if (local30.aBoolean84) {
													local1610.method198(local30.anInt1508, local30.anInt1504, local30.anInt1474, local30.anInt1526, local683 + local692 + local30.anInt1459, local851 + local30.anInt1459, local30.anInt1519);
												} else {
													local1610.method193(local30.anInt1508, local30.anInt1504, local30.anInt1474, local30.anInt1526, local692 + local683 + local30.anInt1459, local851 - -local30.anInt1459);
												}
												Static13.method517();
											}
										} else {
											if (local30.anInt1522 == 7) {
												local1180 = local30.method1208();
												if (local1180 == null) {
													if (Static52.aBoolean88) {
														Static16.method534(local30);
													}
													continue;
												}
												local312 = 0;
												for (local673 = 0; local673 < local30.anInt1515; local673++) {
													for (local692 = 0; local692 < local30.anInt1457; local692++) {
														if (local30.anIntArray261[local312] > 0) {
															local1620 = Static76.method1736(local30.anIntArray261[local312] - 1);
															@Pc(1959) Class28 local1959;
															if (local1620.anInt1896 != 1 && local30.anIntArray266[local312] == 1) {
																local1959 = Static4.method96(new Class28[] { Static29.aClass28_304, local1620.aClass28_566, Static7.aClass28_85 });
															} else {
																local1959 = Static4.method96(new Class28[] { Static29.aClass28_304, local1620.aClass28_566, Static103.aClass28_858, Static163.method3016(local30.anIntArray266[local312]) });
															}
															local728 = local673 * (local30.anInt1489 + 12) + local112;
															local834 = local106 + (local30.anInt1483 + 115) * local692;
															if (local30.anInt1473 == 0) {
																local1180.method1811(local1959, local834, local728, local30.anInt1461, local30.aBoolean81 ? 0 : -1);
															} else if (local30.anInt1473 == 1) {
																local1180.method1787(local1959, local834 + local30.anInt1457 / 2, local728, local30.anInt1461, local30.aBoolean81 ? 0 : -1);
															} else {
																local1180.method1803(local1959, local834 + local30.anInt1457 - 1, local728, local30.anInt1461, local30.aBoolean81 ? 0 : -1);
															}
														}
														local312++;
													}
												}
											}
											@Pc(2240) int local2240;
											if (local30.anInt1522 == 8 && local30 == Static51.aClass33_6 && Static54.anInt1550 == Static112.anInt2869) {
												local283 = 0;
												local312 = 0;
												@Pc(2089) Class28 local2089 = local30.aClass28_455;
												@Pc(2091) Class3_Sub2_Sub2_Sub1_Sub1 local2091 = Static41.aClass3_Sub2_Sub2_Sub1_Sub1_1;
												local2089 = Static159.method2977(local30, local2089);
												@Pc(2112) Class28 local2112;
												while (local2089.method901() > 0) {
													local851 = local2089.method903(Static162.aClass28_1375);
													if (local851 == -1) {
														local2112 = local2089;
														local2089 = Static156.aClass28_1306;
													} else {
														local2112 = local2089.method926(local851, 0);
														local2089 = local2089.method905(local851 + 4);
													}
													local834 = local2091.method1805(local2112);
													local312 += local2091.anInt2310 + 1;
													if (local283 < local834) {
														local283 = local834;
													}
												}
												local312 += 7;
												local283 += 6;
												local851 = local30.anInt1457 + local106 - local283 - 5;
												if (local851 < local106 + 5) {
													local851 = local106 + 5;
												}
												local834 = local30.anInt1515 + local112 + 5;
												if (arg8 < local834 + local312) {
													local834 = arg8 - local312;
												}
												if (local283 + local851 > arg2) {
													local851 = arg2 - local283;
												}
												Static147.method1775(local851, local834, local283, local312, 16777120);
												Static147.method1777(local851, local834, local283, local312, 0);
												local728 = local834 + local2091.anInt2310 + 2;
												local2089 = local30.aClass28_455;
												local2089 = Static159.method2977(local30, local2089);
												while (local2089.method901() > 0) {
													local2240 = local2089.method903(Static162.aClass28_1375);
													if (local2240 == -1) {
														local2112 = local2089;
														local2089 = Static156.aClass28_1306;
													} else {
														local2112 = local2089.method926(local2240, 0);
														local2089 = local2089.method905(local2240 + 4);
													}
													local2091.method1811(local2112, local851 + 3, local728, 0, -1);
													local728 += local2091.anInt2310 + 1;
												}
											}
											if (local30.anInt1522 == 9) {
												if (local30.anInt1463 == 1) {
													Static147.method1770(local106, local112, local106 + local30.anInt1457, local112 + local30.anInt1515, local30.anInt1461);
												} else {
													local283 = local30.anInt1457 >= 0 ? local30.anInt1457 : -local30.anInt1457;
													local673 = local283;
													local312 = local30.anInt1515 >= 0 ? local30.anInt1515 : -local30.anInt1515;
													if (local312 > local283) {
														local673 = local312;
													}
													if (local673 != 0) {
														local692 = (local30.anInt1457 << 16) / local673;
														local683 = (local30.anInt1515 << 16) / local673;
														@Pc(2360) int local2360 = local106 - arg3;
														if (local692 < local683) {
															local683 = -local683;
														} else {
															local692 = -local692;
														}
														local891 = local112 - arg4;
														local2240 = local692 * local30.anInt1463 + 1 >> 17;
														local834 = local30.anInt1463 * local683 + 1 >> 17;
														local728 = local30.anInt1463 * local692 >> 17;
														@Pc(2412) int local2412 = local2360 + local30.anInt1457 - local834;
														local916 = local2360 - local834;
														@Pc(2421) int local2421 = local728 + local891;
														@Pc(2425) int local2425 = local891 - local2240;
														local851 = local683 * local30.anInt1463 >> 17;
														@Pc(2439) int local2439 = local851 + local30.anInt1457 + local2360;
														@Pc(2448) int local2448 = local891 + local30.anInt1515 - local2240;
														@Pc(2455) int local2455 = local728 + local30.anInt1515 + local891;
														local893 = local851 + local2360;
														Static13.method512(local893, local916, local2412);
														Static13.method518(local2421, local2425, local2448, local893, local916, local2412, local30.anInt1461);
														Static13.method512(local893, local2412, local2439);
														Static13.method518(local2421, local2448, local2455, local893, local2412, local2439, local30.anInt1461);
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

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)V")
	public static void method1260() {
		@Pc(5) boolean local5 = false;
		while (!local5) {
			local5 = true;
			for (@Pc(10) int local10 = 0; local10 < Static82.anInt2400 - 1; local10++) {
				if (Static21.aShortArray8[local10] < 1000 && Static21.aShortArray8[local10 + 1] > 1000) {
					local5 = false;
					@Pc(31) Class28 local31 = Static69.aClass28Array12[local10];
					Static69.aClass28Array12[local10] = Static69.aClass28Array12[local10 + 1];
					Static69.aClass28Array12[local10 + 1] = local31;
					@Pc(49) Class28 local49 = Static145.aClass28Array22[local10];
					Static145.aClass28Array22[local10] = Static145.aClass28Array22[local10 + 1];
					Static145.aClass28Array22[local10 + 1] = local49;
					@Pc(67) int local67 = Static8.anIntArray228[local10];
					Static8.anIntArray228[local10] = Static8.anIntArray228[local10 + 1];
					Static8.anIntArray228[local10 + 1] = local67;
					@Pc(85) int local85 = Static46.anIntArray238[local10];
					Static46.anIntArray238[local10] = Static46.anIntArray238[local10 + 1];
					Static46.anIntArray238[local10 + 1] = local85;
					@Pc(103) short local103 = Static21.aShortArray8[local10];
					Static21.aShortArray8[local10] = Static21.aShortArray8[local10 + 1];
					Static21.aShortArray8[local10 + 1] = local103;
					@Pc(121) long local121 = Static149.aLongArray6[local10];
					Static149.aLongArray6[local10] = Static149.aLongArray6[local10 + 1];
					Static149.aLongArray6[local10 + 1] = local121;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZI)V")
	public static void method1261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static82.anInt2400 < 2 && Static95.anInt2636 == 0 && !Static67.aBoolean109) {
			return;
		}
		@Pc(50) Class28 local50;
		if (Static95.anInt2636 == 1 && Static82.anInt2400 < 2) {
			local50 = Static4.method96(new Class28[] { Static85.aClass28_786, Static22.aClass28_242, Static154.aClass28_1288, Static83.aClass28_761 });
		} else if (Static67.aBoolean109 && Static82.anInt2400 < 2) {
			local50 = Static4.method96(new Class28[] { Static30.aClass28_313, Static22.aClass28_242, Static101.aClass28_843, Static83.aClass28_761 });
		} else {
			local50 = Static87.method1995(Static82.anInt2400 - 1);
		}
		if (Static82.anInt2400 > 2) {
			local50 = Static4.method96(new Class28[] { local50, Static159.aClass28_1316, Static146.method2793(Static82.anInt2400 - 2), Static68.aClass28_625 });
		}
		@Pc(121) int local121 = Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1782(local50, arg1 + 4, arg0 + 15, Static64.aRandom1, Static177.anInt4214);
		Static23.method618(arg0, local121 + Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1805(local50), 15, arg1 + 4);
	}
}
