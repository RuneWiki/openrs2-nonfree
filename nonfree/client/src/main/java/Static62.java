import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!g;")
	public static Class26 aClass26_33;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	public static int anInt1691;

	@OriginalMember(owner = "client!la", name = "Z", descriptor = "[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array11;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!je;")
	private static Class40 aClass40_826 = Static69.method1231("Prepared visibility map");

	@OriginalMember(owner = "client!la", name = "T", descriptor = "Lclient!je;")
	private static Class40 aClass40_834 = Static69.method1231("Password: ");

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_827 = aClass40_834;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	public static int anInt1685 = 0;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "[Lclient!wc;")
	public static Class2_Sub1_Sub1_Sub7[] aClass2_Sub1_Sub1_Sub7Array1 = new Class2_Sub1_Sub1_Sub7[4];

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!je;")
	private static Class40 aClass40_828 = Static69.method1231("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!je;")
	private static Class40 aClass40_829 = Static69.method1231("Loaded wordpack");

	@OriginalMember(owner = "client!la", name = "B", descriptor = "Lclient!je;")
	public static Class40 aClass40_830 = aClass40_829;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Lclient!je;")
	private static Class40 aClass40_831 = Static69.method1231("Your profile will be transferred in:");

	@OriginalMember(owner = "client!la", name = "F", descriptor = "Lclient!ac;")
	public static Class3 aClass3_8 = new Class3();

	@OriginalMember(owner = "client!la", name = "K", descriptor = "Lclient!je;")
	public static Class40 aClass40_832 = aClass40_831;

	@OriginalMember(owner = "client!la", name = "M", descriptor = "Lclient!je;")
	public static Class40 aClass40_833 = aClass40_826;

	@OriginalMember(owner = "client!la", name = "O", descriptor = "[I")
	public static int[] anIntArray171 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!la", name = "W", descriptor = "Lclient!je;")
	public static Class40 aClass40_835 = aClass40_828;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIBI[Lclient!kc;I)V")
	public static void method1116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub13[] arg7, @OriginalArg(9) int arg8) {
		Static6.method1685(arg4, arg3, arg1, arg0);
		Static78.method1390();
		for (@Pc(13) int local13 = 0; local13 < arg7.length; local13++) {
			@Pc(24) Class2_Sub13 local24 = arg7[local13];
			if (local24 != null && (arg5 == local24.anInt1543 || arg5 == -1412584499 && local24 == Static38.aClass2_Sub13_5)) {
				@Pc(46) int local46;
				if (arg2 == -1) {
					Static60.anIntArray168[Static70.anInt1897] = local24.anInt1591 + arg6;
					Static24.anIntArray376[Static70.anInt1897] = arg8 + local24.anInt1545;
					Static46.anIntArray131[Static70.anInt1897] = local24.anInt1599;
					Static117.anIntArray323[Static70.anInt1897] = local24.anInt1568;
					local46 = Static70.anInt1897++;
				} else {
					local46 = arg2;
				}
				local24.anInt1552 = local46;
				local24.anInt1601 = Static28.anInt704;
				if (!local24.aBoolean112 || !Static49.method883(local24)) {
					if (local24.anInt1586 > 0) {
						Static105.method1825(local24);
					}
					@Pc(102) int local102 = arg8 + local24.anInt1545;
					@Pc(105) int local105 = local24.anInt1558;
					@Pc(110) int local110 = arg6 + local24.anInt1591;
					@Pc(133) int local133;
					@Pc(135) int local135;
					if (local24 == Static38.aClass2_Sub13_5) {
						if (arg5 != -1412584499 && !local24.aBoolean110) {
							Static19.anInt612 = arg6;
							Static64.anInt1721 = arg8;
							Static40.aClass2_Sub13Array1 = arg7;
							continue;
						}
						if (Static45.aBoolean85 && Static25.aBoolean50) {
							local133 = Static112.anInt2616;
							local135 = Static85.anInt2261;
							local135 -= Static122.anInt2859;
							local133 -= Static19.anInt615;
							if (local135 < Static103.anInt2505) {
								local135 = Static103.anInt2505;
							}
							if (local133 < Static75.anInt1947) {
								local133 = Static75.anInt1947;
							}
							if (Static65.aClass2_Sub13_11.anInt1599 + Static75.anInt1947 < local24.anInt1599 + local133) {
								local133 = Static65.aClass2_Sub13_11.anInt1599 + Static75.anInt1947 - local24.anInt1599;
							}
							local110 = local133;
							if (local135 + local24.anInt1568 > Static103.anInt2505 + Static65.aClass2_Sub13_11.anInt1568) {
								local135 = Static103.anInt2505 + Static65.aClass2_Sub13_11.anInt1568 - local24.anInt1568;
							}
							local102 = local135;
						}
						if (!local24.aBoolean110) {
							local105 = 128;
						}
					}
					@Pc(225) int local225;
					@Pc(221) int local221;
					@Pc(235) int local235;
					@Pc(237) int local237;
					@Pc(242) int local242;
					@Pc(257) int local257;
					if (local24.anInt1583 == 2) {
						local135 = arg3;
						local221 = arg0;
						local133 = arg4;
						local225 = arg1;
					} else if (local24.anInt1583 == 9) {
						local235 = local110;
						local237 = local102;
						local242 = local110 + local24.anInt1599;
						if (local110 > local242) {
							local235 = local242;
							local242 = local110;
						}
						local242++;
						local257 = local24.anInt1568 + local102;
						local225 = local242 < arg1 ? local242 : arg1;
						if (local257 < local102) {
							local237 = local257;
							local257 = local102;
						}
						local133 = arg4 < local235 ? local235 : arg4;
						local257++;
						local221 = arg0 > local257 ? local257 : arg0;
						local135 = arg3 < local237 ? local237 : arg3;
					} else {
						local135 = arg3 < local102 ? local102 : arg3;
						local133 = local110 <= arg4 ? arg4 : local110;
						local235 = local110 + local24.anInt1599;
						local237 = local24.anInt1568 + local102;
						local221 = arg0 <= local237 ? arg0 : local237;
						local225 = arg1 <= local235 ? arg1 : local235;
					}
					if (!local24.aBoolean112 || local133 < local225 && local135 < local221) {
						if (local24.anInt1586 != 0) {
							if (local24.anInt1586 == 1337) {
								Static20.anInt632 = local110;
								Static110.anInt1824 = local102;
								Static23.method410(local110, local102, local24.anInt1568, local24.anInt1599);
								Static6.method1685(arg4, arg3, arg1, arg0);
								continue;
							}
							if (local24.anInt1586 == 1338) {
								Static133.method2225(local46, local110, local102);
								Static6.method1685(arg4, arg3, arg1, arg0);
								continue;
							}
						}
						local235 = Static112.anInt2616;
						local237 = Static85.anInt2261;
						if (!Static8.aBoolean21 && local235 >= local133 && local237 >= local135 && local235 < local225 && local221 > local237) {
							Static49.method882(local237 - local102, local24, local235 - local110);
						}
						if (local24.anInt1583 == 0) {
							if (!local24.aBoolean112 && Static49.method883(local24) && Static134.aClass2_Sub13_10 != local24) {
								continue;
							}
							if (!local24.aBoolean112) {
								if (local24.anInt1598 > local24.anInt1535 - local24.anInt1568) {
									local24.anInt1598 = local24.anInt1535 - local24.anInt1568;
								}
								if (local24.anInt1598 < 0) {
									local24.anInt1598 = 0;
								}
							}
							method1116(local221, local225, local46, local135, local133, local24.anInt1560, local110 - local24.anInt1606, arg7, local102 - local24.anInt1598);
							if (local24.aClass2_Sub13Array2 != null) {
								method1116(local221, local225, local46, local135, local133, local24.anInt1560, local110 - local24.anInt1606, local24.aClass2_Sub13Array2, local102 - local24.anInt1598);
							}
							@Pc(526) Class2_Sub11 local526 = (Class2_Sub11) Static61.aClass77_6.method2034((long) local24.anInt1560);
							if (local526 != null) {
								if (local526.anInt1312 == 0 && local133 <= Static112.anInt2616 && local135 <= Static85.anInt2261 && local225 > Static112.anInt2616 && local221 > Static85.anInt2261 && !Static8.aBoolean21 && !Static65.aBoolean130) {
									Static57.anInt1500 = 1;
									Static83.anIntArray236[0] = 1005;
									Static45.aClass40Array4[0] = Static60.aClass40_823;
									Static25.aClass40Array1[0] = Static43.aClass40_568;
								}
								Static123.method2068(local135, local526.anInt1313, local110, local46, local102, local133, local225, local221);
							}
							Static6.method1685(arg4, arg3, arg1, arg0);
							Static78.method1390();
						}
						if (Static50.aBooleanArray12[local46] || Static63.anInt395 > 1) {
							if (local24.anInt1583 == 0 && !local24.aBoolean112 && local24.anInt1535 > local24.anInt1568) {
								Static29.method455(local102, local24.anInt1599 + local110, local24.anInt1568, local24.anInt1535, local24.anInt1598);
							}
							if (local24.anInt1583 != 1) {
								@Pc(643) int local643;
								@Pc(655) int local655;
								@Pc(825) int local825;
								@Pc(700) int local700;
								@Pc(891) int local891;
								@Pc(665) int local665;
								@Pc(810) int local810;
								if (local24.anInt1583 == 2) {
									local242 = 0;
									for (local257 = 0; local257 < local24.anInt1568; local257++) {
										for (local643 = 0; local643 < local24.anInt1599; local643++) {
											local655 = (local24.anInt1547 + 32) * local643 + local110;
											local665 = local257 * (local24.anInt1602 + 32) + local102;
											if (local242 < 20) {
												local655 += local24.anIntArray153[local242];
												local665 += local24.anIntArray159[local242];
											}
											if (local24.anIntArray161[local242] > 0) {
												local700 = local24.anIntArray161[local242] - 1;
												if (local655 + 32 > arg4 && arg1 > local655 && local665 + 32 > arg3 && local665 < arg0 || local24 == Static101.aClass2_Sub13_14 && local242 == Static19.anInt613) {
													@Pc(761) Class2_Sub1_Sub2_Sub4 local761;
													if (Static111.anInt2597 == 1 && Static112.anInt2612 == local242 && local24.anInt1560 == Static73.anInt1924) {
														local761 = Static77.method1339(2, local24.anIntArray154[local242], local700, false, 0);
													} else {
														local761 = Static77.method1339(1, local24.anIntArray154[local242], local700, false, 3153952);
													}
													if (local761 == null) {
														Static17.method316(local24);
													} else if (Static101.aClass2_Sub13_14 == local24 && local242 == Static19.anInt613) {
														local810 = Static112.anInt2616 - Static58.anInt1525;
														if (local810 < 5 && local810 > -5) {
															local810 = 0;
														}
														local825 = Static85.anInt2261 - Static64.anInt1725;
														if (local825 < 5 && local825 > -5) {
															local825 = 0;
														}
														if (Static18.anInt605 < 5) {
															local825 = 0;
															local810 = 0;
														}
														local761.method1718(local655 + local810, local665 - -local825, 128);
														if (arg5 != -1) {
															@Pc(863) Class2_Sub13 local863 = arg7[arg5 & 0xFFFF];
															if (local665 + local825 < Static6.anInt2383 && local863.anInt1598 > 0) {
																local891 = Static49.anInt1315 * (Static6.anInt2383 - local665 - local825) / 3;
																if (Static49.anInt1315 * 10 < local891) {
																	local891 = Static49.anInt1315 * 10;
																}
																if (local891 > local863.anInt1598) {
																	local891 = local863.anInt1598;
																}
																local863.anInt1598 -= local891;
																Static64.anInt1725 += local891;
																Static17.method316(local863);
															}
															if (local825 + local665 + 32 > Static6.anInt2379 && local863.anInt1598 < local863.anInt1535 - local863.anInt1568) {
																local891 = (local825 + local665 + 32 - Static6.anInt2379) * Static49.anInt1315 / 3;
																if (local891 > Static49.anInt1315 * 10) {
																	local891 = Static49.anInt1315 * 10;
																}
																if (local863.anInt1535 - local863.anInt1568 - local863.anInt1598 < local891) {
																	local891 = local863.anInt1535 - local863.anInt1568 - local863.anInt1598;
																}
																Static64.anInt1725 -= local891;
																local863.anInt1598 += local891;
																Static17.method316(local863);
															}
														}
													} else if (Static115.aClass2_Sub13_15 == local24 && local242 == Static7.anInt199) {
														local761.method1718(local655, local665, 128);
													} else {
														local761.method1722(local655, local665);
													}
												}
											} else if (local24.anIntArray151 != null && local242 < 20) {
												@Pc(1025) Class2_Sub1_Sub2_Sub4 local1025 = local24.method1046(local242);
												if (local1025 != null) {
													local1025.method1722(local655, local665);
												} else if (Static12.aBoolean250) {
													Static17.method316(local24);
												}
											}
											local242++;
										}
									}
								} else if (local24.anInt1583 == 3) {
									if (Static5.method127(local24)) {
										local242 = local24.anInt1554;
										if (Static134.aClass2_Sub13_10 == local24 && local24.anInt1537 != 0) {
											local242 = local24.anInt1537;
										}
									} else {
										local242 = local24.anInt1549;
										if (local24 == Static134.aClass2_Sub13_10 && local24.anInt1600 != 0) {
											local242 = local24.anInt1600;
										}
									}
									if (local105 == 0) {
										if (local24.aBoolean111) {
											Static6.method1695(local110, local102, local24.anInt1599, local24.anInt1568, local242);
										} else {
											Static6.method1693(local110, local102, local24.anInt1599, local24.anInt1568, local242);
										}
									} else if (local24.aBoolean111) {
										Static6.method1699(local110, local102, local24.anInt1599, local24.anInt1568, local242, 256 - (local105 & 0xFF));
									} else {
										Static6.method1687(local110, local102, local24.anInt1599, local24.anInt1568, local242, 256 - (local105 & 0xFF));
									}
								} else {
									@Pc(1160) Class2_Sub1_Sub2_Sub3_Sub1 local1160;
									if (local24.anInt1583 == 4) {
										local1160 = local24.method1051();
										if (local1160 != null) {
											@Pc(1172) Class40 local1172 = local24.aClass40_768;
											if (Static5.method127(local24)) {
												local257 = local24.anInt1554;
												if (local24 == Static134.aClass2_Sub13_10 && local24.anInt1537 != 0) {
													local257 = local24.anInt1537;
												}
												if (local24.aClass40_771.method950() > 0) {
													local1172 = local24.aClass40_771;
												}
											} else {
												local257 = local24.anInt1549;
												if (local24 == Static134.aClass2_Sub13_10 && local24.anInt1600 != 0) {
													local257 = local24.anInt1600;
												}
											}
											if (local24.aBoolean112 && local24.anInt1550 != -1) {
												@Pc(1229) Class2_Sub1_Sub10 local1229 = Static102.method1800(local24.anInt1550);
												local1172 = local1229.aClass40_1161;
												if (local1172 == null) {
													local1172 = Static12.aClass40_1633;
												}
												if ((local1229.anInt2258 == 1 || local24.anInt1565 != 1) && local24.anInt1565 != -1) {
													local1172 = Static40.method722(new Class40[] { Static112.aClass40_1411, local1172, Static12.aClass40_1640, Static11.method206(local24.anInt1565) });
												}
											}
											if (local24 == Static56.aClass2_Sub13_7) {
												local257 = local24.anInt1549;
												local1172 = Static76.aClass40_994;
											}
											if (!local24.aBoolean112) {
												local1172 = Static51.method922(local24, local1172);
											}
											local1160.method1542(local1172, local110, local102, local24.anInt1599, local24.anInt1568, local257, local24.aBoolean117 ? 0 : -1, local24.anInt1585, local24.anInt1566, local24.anInt1548);
										} else if (Static12.aBoolean250) {
											Static17.method316(local24);
										}
									} else if (local24.anInt1583 == 5) {
										@Pc(1342) Class2_Sub1_Sub2_Sub4 local1342;
										if (local24.aBoolean112) {
											if (local24.anInt1550 == -1) {
												local1342 = local24.method1048(false);
											} else {
												local1342 = Static77.method1339(local24.anInt1589, local24.anInt1565, local24.anInt1550, false, local24.anInt1569);
											}
											if (local1342 != null) {
												local257 = local1342.anInt2387;
												local643 = local1342.anInt2388;
												if (local24.aBoolean116) {
													Static6.method1700(local110, local102, local24.anInt1599 + local110, local24.anInt1568 + local102);
													local655 = (local257 + local24.anInt1599 - 1) / local257;
													local665 = (local24.anInt1568 + local643 - 1) / local643;
													for (local810 = 0; local810 < local655; local810++) {
														for (local825 = 0; local825 < local665; local825++) {
															if (local24.anInt1544 != 0) {
																local1342.method1726(local110 + local257 * local810 + local257 / 2, local102 - -(local643 * local825) - -(local643 / 2), local24.anInt1544, 4096);
															} else if (local105 == 0) {
																local1342.method1722(local110 + local257 * local810, local825 * local643 + local102);
															} else {
																local1342.method1718(local110 + local810 * local257, local102 - -(local825 * local643), 256 - (local105 & 0xFF));
															}
														}
													}
													Static6.method1685(arg4, arg3, arg1, arg0);
												} else {
													local655 = local24.anInt1599 * 4096 / local257;
													if (local24.anInt1544 != 0) {
														local1342.method1726(local110 + local24.anInt1599 / 2, local102 - -(local24.anInt1568 / 2), local24.anInt1544, local655);
													} else if (local105 != 0) {
														local1342.method1710(local110, local102, local24.anInt1599, local24.anInt1568, 256 - (local105 & 0xFF));
													} else if (local257 == local24.anInt1599 && local643 == local24.anInt1568) {
														local1342.method1722(local110, local102);
													} else {
														local1342.method1719(local110, local102, local24.anInt1599, local24.anInt1568);
													}
												}
											} else if (Static12.aBoolean250) {
												Static17.method316(local24);
											}
										} else {
											local1342 = local24.method1048(Static5.method127(local24));
											if (local1342 != null) {
												local1342.method1722(local110, local102);
											} else if (Static12.aBoolean250) {
												Static17.method316(local24);
											}
										}
									} else {
										@Pc(1697) Class2_Sub1_Sub10 local1697;
										if (local24.anInt1583 == 6) {
											@Pc(1607) boolean local1607 = Static5.method127(local24);
											local655 = 0;
											@Pc(1611) Class2_Sub1_Sub1_Sub2 local1611 = null;
											if (local1607) {
												local257 = local24.anInt1561;
											} else {
												local257 = local24.anInt1575;
											}
											if (local24.anInt1550 != -1) {
												local1697 = Static102.method1800(local24.anInt1550);
												if (local1697 != null) {
													local1697 = local1697.method1567(local24.anInt1565);
													local1611 = local1697.method1578(1);
													if (local1611 == null) {
														Static17.method316(local24);
													} else {
														local1611.method117();
														local655 = local1611.anInt3029 / 2;
													}
												}
											} else if (local24.anInt1559 == 5) {
												if (local24.anInt1562 == 0) {
													local1611 = Static127.aClass41_2.method995(null, -1, null, -1);
												} else {
													local1611 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.method2168();
												}
											} else if (local257 == -1) {
												local1611 = local24.method1043(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass41_1, local1607, null, -1);
												if (local1611 == null && Static12.aBoolean250) {
													Static17.method316(local24);
												}
											} else {
												@Pc(1640) Class2_Sub1_Sub7 local1640 = Static40.method724(local257);
												local1611 = local24.method1043(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.aClass41_1, local1607, local1640, local24.anInt1595);
												if (local1611 == null && Static12.aBoolean250) {
													Static17.method316(local24);
												}
											}
											Static78.method1385(local110 + local24.anInt1599 / 2, local24.anInt1568 / 2 + local102);
											local665 = Class2_Sub1_Sub2_Sub2.anIntArray219[local24.anInt1580] * local24.anInt1539 >> 16;
											local810 = local24.anInt1539 * Class2_Sub1_Sub2_Sub2.anIntArray221[local24.anInt1580] >> 16;
											if (local1611 != null) {
												if (local24.aBoolean112) {
													local1611.method117();
													if (local24.aBoolean114) {
														local1611.method110(local24.anInt1557, local24.anInt1556, local24.anInt1580, local24.anInt1593, local655 + local665 + local24.anInt1577, local24.anInt1577 + local810, local24.anInt1539);
													} else {
														local1611.method114(local24.anInt1557, local24.anInt1556, local24.anInt1580, local24.anInt1593, local665 + local655 + local24.anInt1577, local24.anInt1577 + local810);
													}
												} else {
													local1611.method114(local24.anInt1557, 0, local24.anInt1580, 0, local665, local810);
												}
											}
											Static78.method1393();
										} else {
											if (local24.anInt1583 == 7) {
												local1160 = local24.method1051();
												if (local1160 == null) {
													if (Static12.aBoolean250) {
														Static17.method316(local24);
													}
													continue;
												}
												local257 = 0;
												for (local643 = 0; local643 < local24.anInt1568; local643++) {
													for (local655 = 0; local655 < local24.anInt1599; local655++) {
														if (local24.anIntArray161[local257] > 0) {
															local1697 = Static102.method1800(local24.anIntArray161[local257] - 1);
															@Pc(1908) Class40 local1908;
															if (local1697.anInt2258 != 1 && local24.anIntArray154[local257] == 1) {
																local1908 = Static40.method722(new Class40[] { Static112.aClass40_1411, local1697.aClass40_1161, Static103.aClass40_1340 });
															} else {
																local1908 = Static40.method722(new Class40[] { Static112.aClass40_1411, local1697.aClass40_1161, Static12.aClass40_1640, Static11.method206(local24.anIntArray154[local257]) });
															}
															local700 = local643 * (local24.anInt1602 + 12) + local102;
															local825 = local655 * (local24.anInt1547 + 115) + local110;
															if (local24.anInt1585 == 0) {
																local1160.method1549(local1908, local825, local700, local24.anInt1549, local24.aBoolean117 ? 0 : -1);
															} else if (local24.anInt1585 == 1) {
																local1160.method1547(local1908, local825 + local24.anInt1599 / 2, local700, local24.anInt1549, local24.aBoolean117 ? 0 : -1);
															} else {
																local1160.method1531(local1908, local825 + local24.anInt1599 - 1, local700, local24.anInt1549, local24.aBoolean117 ? 0 : -1);
															}
														}
														local257++;
													}
												}
											}
											@Pc(2207) int local2207;
											if (local24.anInt1583 == 8 && local24 == Static54.aClass2_Sub13_6 && Static37.anInt1000 == Static41.anInt1090) {
												local242 = 0;
												local257 = 0;
												@Pc(2057) Class2_Sub1_Sub2_Sub3_Sub1 local2057 = Static33.aClass2_Sub1_Sub2_Sub3_Sub1_5;
												@Pc(2060) Class40 local2060 = local24.aClass40_768;
												local2060 = Static51.method922(local24, local2060);
												@Pc(2078) Class40 local2078;
												while (local2060.method950() > 0) {
													local810 = local2060.method977(Static103.aClass40_1341);
													if (local810 == -1) {
														local2078 = local2060;
														local2060 = Static43.aClass40_568;
													} else {
														local2078 = local2060.method953(0, local810);
														local2060 = local2060.method968(local810 + 4);
													}
													local825 = local2057.method1553(local2078);
													if (local242 < local825) {
														local242 = local825;
													}
													local257 += local2057.anInt2187 + 1;
												}
												local257 += 7;
												local242 += 6;
												local810 = local110 + local24.anInt1599 - local242 - 5;
												local825 = local24.anInt1568 + local102 + 5;
												if (arg0 < local825 + local257) {
													local825 = arg0 - local257;
												}
												if (local110 + 5 > local810) {
													local810 = local110 + 5;
												}
												if (arg1 < local810 + local242) {
													local810 = arg1 - local242;
												}
												Static6.method1695(local810, local825, local242, local257, 16777120);
												Static6.method1693(local810, local825, local242, local257, 0);
												local2060 = local24.aClass40_768;
												local700 = local2057.anInt2187 + local825 + 2;
												local2060 = Static51.method922(local24, local2060);
												while (local2060.method950() > 0) {
													local2207 = local2060.method977(Static103.aClass40_1341);
													if (local2207 == -1) {
														local2078 = local2060;
														local2060 = Static43.aClass40_568;
													} else {
														local2078 = local2060.method953(0, local2207);
														local2060 = local2060.method968(local2207 + 4);
													}
													local2057.method1549(local2078, local810 + 3, local700, 0, -1);
													local700 += local2057.anInt2187 + 1;
												}
											}
											if (local24.anInt1583 == 9) {
												if (local24.anInt1590 == 1) {
													Static6.method1697(local110, local102, local110 + local24.anInt1599, local24.anInt1568 + local102, local24.anInt1549);
												} else {
													local242 = local24.anInt1599 >= 0 ? local24.anInt1599 : -local24.anInt1599;
													local643 = local242;
													local257 = local24.anInt1568 < 0 ? -local24.anInt1568 : local24.anInt1568;
													if (local257 > local242) {
														local643 = local257;
													}
													if (local643 != 0) {
														local655 = (local24.anInt1599 << 16) / local643;
														local665 = (local24.anInt1568 << 16) / local643;
														if (local665 > local655) {
															local665 = -local665;
														} else {
															local655 = -local655;
														}
														local700 = local655 * local24.anInt1590 >> 17;
														local810 = local665 * local24.anInt1590 >> 17;
														local2207 = local24.anInt1590 * local655 + 1 >> 17;
														@Pc(2350) int local2350 = local810 + local110;
														local825 = local24.anInt1590 * local665 + 1 >> 17;
														local891 = local110 - local825;
														@Pc(2372) int local2372 = local810 + local110 + local24.anInt1599;
														@Pc(2380) int local2380 = local24.anInt1599 + local110 - local825;
														@Pc(2384) int local2384 = local700 + local102;
														@Pc(2389) int local2389 = local102 - local2207;
														@Pc(2397) int local2397 = local24.anInt1568 + local102 - local2207;
														@Pc(2404) int local2404 = local700 + local102 + local24.anInt1568;
														Static78.method1391(local2350, local891, local2380);
														Static78.method1388(local2384, local2389, local2397, local2350, local891, local2380, local24.anInt1549);
														Static78.method1391(local2350, local2380, local2372);
														Static78.method1388(local2384, local2397, local2404, local2350, local2380, local2372, local24.anInt1549);
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

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!je;IB)V")
	public static void method1117(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		Static57.aClass2_Sub9_Sub1_2.method673(35);
		Static57.aClass2_Sub9_Sub1_2.method610(arg0.method981());
		Static57.aClass2_Sub9_Sub1_2.method644(arg1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1118() {
		aClass40_834 = null;
		aClass40_829 = null;
		aClass40_832 = null;
		aClass40_828 = null;
		anIntArray171 = null;
		aClass26_33 = null;
		aClass40_835 = null;
		aClass40_833 = null;
		aClass40_827 = null;
		aClass40_831 = null;
		aClass2_Sub1_Sub2_Sub4Array11 = null;
		aClass40_826 = null;
		aClass2_Sub1_Sub1_Sub7Array1 = null;
		aClass40_830 = null;
		aClass3_8 = null;
	}
}
