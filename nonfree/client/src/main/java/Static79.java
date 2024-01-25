import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dq", name = "n", descriptor = "[[[Lclient!ht;")
	public static Class113[][][] aClass113ArrayArrayArray2;

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "[I")
	public static int[] anIntArray103 = new int[1];

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
	public static int anInt1927 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIIIII[Lclient!cr;)V")
	public static void method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class41[] arg8) {
		Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
		for (@Pc(13) int local13 = 0; local13 < arg8.length; local13++) {
			@Pc(19) Class41 local19 = arg8[local13];
			if (local19 != null && (arg3 == local19.anInt1663 || arg3 == -1412584499 && local19 == Static191.aClass41_7)) {
				@Pc(41) int local41;
				if (arg7 == -1) {
					Class2_Sub20_Sub1.aRectangleArray2[Static66.anInt1689].setBounds(arg4 + local19.anInt1618, local19.anInt1675 - -arg6, local19.anInt1622, local19.anInt1599);
					local41 = Static66.anInt1689++;
				} else {
					local41 = arg7;
				}
				local19.anInt1653 = local41;
				local19.anInt1616 = Static164.anInt3206;
				if (!Static56.method1129(local19)) {
					if (local19.anInt1632 != 0) {
						Static60.method1206(local19);
					}
					@Pc(90) int local90 = local19.anInt1618 + arg4;
					@Pc(95) int local95 = arg6 + local19.anInt1675;
					@Pc(98) int local98 = local19.anInt1598;
					if (Static345.aBoolean339 && (Static56.method1112(local19).anInt2146 != 0 || local19.anInt1642 == 0) && local98 > 127) {
						local98 = 127;
					}
					@Pc(151) int local151;
					@Pc(155) int local155;
					if (Static191.aClass41_7 == local19) {
						if (arg3 != -1412584499 && (Static237.anInt4619 == local19.anInt1666 || local19.anInt1666 == Static34.anInt674)) {
							Static210.aClass41Array2 = arg8;
							Static107.anInt2235 = arg6;
							Static252.anInt4784 = arg4;
							continue;
						}
						if (Static150.aBoolean255 && Static238.aBoolean374) {
							local151 = Static304.aClass40_1.method1164();
							local155 = Static304.aClass40_1.method1159();
							local151 -= Static77.anInt7116;
							local155 -= Static396.anInt6928;
							if (Static328.anInt5877 > local151) {
								local151 = Static328.anInt5877;
							}
							if (local151 + local19.anInt1622 > Static328.anInt5877 + Static309.aClass41_11.anInt1622) {
								local151 = Static328.anInt5877 + Static309.aClass41_11.anInt1622 - local19.anInt1622;
							}
							if (local155 < Static194.anInt3808) {
								local155 = Static194.anInt3808;
							}
							local90 = local151;
							if (local19.anInt1599 + local155 > Static309.aClass41_11.anInt1599 + Static194.anInt3808) {
								local155 = Static309.aClass41_11.anInt1599 + Static194.anInt3808 - local19.anInt1599;
							}
							local95 = local155;
						}
						if (local19.anInt1666 == Static34.anInt674) {
							local98 = 128;
						}
					}
					@Pc(286) int local286;
					@Pc(297) int local297;
					@Pc(242) int local242;
					@Pc(247) int local247;
					if (local19.anInt1642 == 2) {
						local286 = arg2;
						local155 = arg5;
						local151 = arg0;
						local297 = arg1;
					} else {
						local242 = local90 + local19.anInt1622;
						local247 = local95 + local19.anInt1599;
						local151 = arg0 < local90 ? local90 : arg0;
						if (local19.anInt1642 == 9) {
							local242++;
							local247++;
						}
						local155 = arg5 < local95 ? local95 : arg5;
						local286 = arg2 <= local242 ? arg2 : local242;
						local297 = local247 >= arg1 ? arg1 : local247;
					}
					if (local286 > local151 && local297 > local155) {
						@Pc(577) int local577;
						@Pc(601) int local601;
						@Pc(603) int local603;
						@Pc(523) int local523;
						@Pc(525) int local525;
						if (local19.anInt1632 != 0) {
							if (local19.anInt1632 == Static225.anInt4312 || local19.anInt1632 == Static382.anInt6773) {
								Static391.method5376(local19.anInt1622, local90, local95, local19.anInt1599, local19.anInt1632 == Static382.anInt6773);
								Static10.aBooleanArray5[local41] = true;
								Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
								continue;
							}
							if (local19.anInt1632 == Static345.anInt4167) {
								if (local19.method1183(Static387.aClass26_9) != null) {
									Static438.method5925();
									Static371.method5225(local19, local95, local90, Static387.aClass26_9);
									Static378.aBooleanArray47[local41] = true;
									Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
								}
								continue;
							}
							if (Static231.anInt4401 == local19.anInt1632) {
								if (local19.method1183(Static387.aClass26_9) != null) {
									Static451.method1153(local90, local19, local95);
									Static378.aBooleanArray47[local41] = true;
									Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
								}
								continue;
							}
							if (local19.anInt1632 == Static259.anInt4839) {
								Static206.method3173(Static387.aClass26_9, local95, local19.anInt1599, local19.anInt1622, local90, Static152.anInterface8_6);
								Static10.aBooleanArray5[local41] = true;
								Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
								continue;
							}
							if (Static397.anInt6953 == local19.anInt1632) {
								Static2.method54(local19.anInt1599, local90, Static387.aClass26_9, local95, local19.anInt1622);
								Static10.aBooleanArray5[local41] = true;
								Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
								continue;
							}
							if (local19.anInt1632 == Static269.anInt4964) {
								if (!Static408.aBoolean598 && !Static100.aBoolean651) {
									continue;
								}
								local242 = local90 + local19.anInt1622;
								local247 = local95 + 15;
								if (Static408.aBoolean598) {
									Static184.aClass56_2.method5853("Fps:" + Static335.anInt1514, local247, local242, -256);
									local247 += 15;
									@Pc(513) Runtime local513 = Runtime.getRuntime();
									local523 = (int) ((local513.totalMemory() - local513.freeMemory()) / 1024L);
									local525 = -256;
									if (local523 > 65536) {
										local525 = -65536;
									}
									Static184.aClass56_2.method5853("Mem:" + local523 + "k", local247, local242, local525);
									local247 += 15;
									Static184.aClass56_2.method5853("In:" + Static259.anInt4838 + "B/s Out:" + Static74.anInt1843 + "B/s", local247, local242, -256);
									local247 += 15;
									local577 = Static387.aClass26_9.FA() / 1024;
									Static184.aClass56_2.method5853("Offheap:" + local577 + "k", local247, local242, local577 <= 65536 ? -256 : -65536);
									local247 += 15;
									local601 = 0;
									local603 = 0;
									@Pc(605) int local605 = 0;
									for (@Pc(607) int local607 = 0; local607 < 30; local607++) {
										local601 += Static29.aClass176_Sub1Array1[local607].method5864();
										local603 += Static29.aClass176_Sub1Array1[local607].method5872();
										local605 += Static29.aClass176_Sub1Array1[local607].method5874();
									}
									@Pc(645) int local645 = local605 * 100 / local601;
									@Pc(651) int local651 = local603 * 10000 / local601;
									@Pc(671) String local671 = "Cache:" + Static201.method3139(2, 0, (long) local651, true) + "% (" + local645 + "%)";
									Static418.aClass56_4.method5853(local671, local247, local242, -256);
									local247 += 12;
								}
								if (Static346.anInt6105 > 0) {
									Static418.aClass56_4.method5853("Particles: " + Static300.anInt5375 + " / " + Static346.anInt6105, local247, local242, -256);
								}
								local247 += 12;
								if (Static100.aBoolean651) {
									Static418.aClass56_4.method5853("Polys: " + Static387.aClass26_9.xa() + " Models: " + Static387.aClass26_9.g(), local247, local242, -256);
									local247 += 12;
									Static418.aClass56_4.method5853("Ls: " + Static119.anInt2383 + " La: " + Static131.anInt2579 + " NPC: " + Static13.anInt320 + " Pl: " + Static427.anInt7455, local247, local242, -256);
									Static371.method5226();
									local247 += 12;
								}
								Static10.aBooleanArray5[local41] = true;
								continue;
							}
						}
						if (local19.anInt1642 == 0) {
							if (Static434.anInt7578 == local19.anInt1632 && Static387.aClass26_9.method2267()) {
								Static387.aClass26_9.method2249(local90, local95, local19.anInt1622, local19.anInt1599);
							}
							method1388(local151, local297, local286, local19.anInt1613, local90 - local19.anInt1665, local155, local95 - local19.anInt1620, local41, arg8);
							if (local19.aClass41Array1 != null) {
								method1388(local151, local297, local286, local19.anInt1613, local90 - local19.anInt1665, local155, local95 - local19.anInt1620, local41, local19.aClass41Array1);
							}
							@Pc(841) Class2_Sub25 local841 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local19.anInt1613);
							if (local841 != null) {
								Static439.method5943(local155, local41, local151, local297, local841.anInt4163, local90, local95, local286);
							}
							if (local19.anInt1632 == Static434.anInt7578 && Static387.aClass26_9.method2267()) {
								Static387.aClass26_9.method2268();
								Static382.aBoolean578 = true;
							}
							Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
						}
						if (Static16.aBooleanArray6[local41] || Static198.anInt3846 > 1) {
							if (local19.anInt1642 == 3) {
								if (local98 == 0) {
									if (local19.aBoolean134) {
										Static387.aClass26_9.NA(local90, local95, local19.anInt1622, local19.anInt1599, local19.anInt1617, 0);
									} else {
										Static387.aClass26_9.method2247(local90, local95, local19.anInt1622, local19.anInt1599, local19.anInt1617, 0);
									}
								} else if (local19.aBoolean134) {
									Static387.aClass26_9.NA(local90, local95, local19.anInt1622, local19.anInt1599, local19.anInt1617 & 0xFFFFFF | 255 - (local98 & 0xFF) << 24, 1);
								} else {
									Static387.aClass26_9.method2247(local90, local95, local19.anInt1622, local19.anInt1599, 255 - (local98 & 0xFF) << 24 | local19.anInt1617 & 0xFFFFFF, 1);
								}
							} else if (local19.anInt1642 == 4) {
								@Pc(982) Class56 local982 = local19.method1189(Static387.aClass26_9);
								if (local982 != null) {
									local247 = local19.anInt1617;
									@Pc(997) String local997 = local19.aString11;
									if (local19.anInt1671 != -1) {
										@Pc(1007) Class30 local1007 = Static350.aClass149_2.method3483(local19.anInt1671);
										local997 = local1007.aString5;
										if (local997 == null) {
											local997 = "null";
										}
										if ((local1007.anInt1053 == 1 || local19.anInt1678 != 1) && local19.anInt1678 != -1) {
											local997 = "<col=ff9040>" + local997 + "</col> x" + Static196.method4359(local19.anInt1678);
										}
									}
									if (local19 == Static351.aClass41_13) {
										local997 = Static379.aClass256_138.method5720(Static272.anInt7537);
										local247 = local19.anInt1617;
									}
									if (Static124.aBoolean204) {
										Static387.aClass26_9.Z(local90, local95, local90 + local19.anInt1622, local19.anInt1599 + local95);
									}
									local982.method5839(local19.aBoolean140 ? 255 - (local98 & 0xFF) << 24 : -1, local19.anInt1601, local95, local19.anInt1604, local19.anInt1673, local19.anInt1622, 0, 255 - (local98 & 0xFF) << 24 | local247, 0, local90, null, local997, Static119.aClass76Array11, local19.anInt1599, null, local19.anInt1631);
									if (Static124.aBoolean204) {
										Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
									}
								} else if (Static305.aBoolean109) {
									Static168.method2616(local19);
								}
							} else {
								@Pc(1179) int local1179;
								if (local19.anInt1642 == 5) {
									if (local19.anInt1664 < 0) {
										@Pc(1143) Class76 local1143;
										if (local19.anInt1671 == -1) {
											local1143 = local19.method1180(Static387.aClass26_9);
										} else {
											@Pc(1153) Class7 local1153 = local19.lb ? Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1 : null;
											local1143 = Static350.aClass149_2.method3485(Static387.aClass26_9, local19.anInt1678, local19.anInt1648 | 0xFF000000, local19.anInt1651, local19.anInt1606, local19.anInt1671, local1153);
										}
										if (local1143 != null) {
											local247 = local1143.ja();
											local1179 = local1143.JA();
											local523 = (local19.anInt1617 == 0 ? 16777215 : local19.anInt1617 & 0xFFFFFF) | 255 - (local98 & 0xFF) << 24;
											if (local19.aBoolean128) {
												Static387.aClass26_9.Z(local90, local95, local19.anInt1622 + local90, local19.anInt1599 + local95);
												if (local19.anInt1670 != 0) {
													local525 = (local247 + local19.anInt1622 - 1) / local247;
													local577 = (local1179 + local19.anInt1599 - 1) / local1179;
													for (local601 = 0; local601 < local525; local601++) {
														for (local603 = 0; local603 < local577; local603++) {
															if (local19.anInt1617 == 0) {
																local1143.method6092((float) (local90 + local247 * local601) + (float) local247 / 2.0F, (float) (local95 + local1179 * local603) + (float) local1179 / 2.0F, 4096, local19.anInt1670);
															} else {
																local1143.method6089((float) (local601 * local247 + local90) + (float) local247 / 2.0F, (float) local1179 / 2.0F + (float) (local95 - -(local1179 * local603)), 4096, local19.anInt1670, local523);
															}
														}
													}
												} else if (local19.anInt1617 == 0 && local98 == 0) {
													local1143.method6095(local90, local95, local19.anInt1622, local19.anInt1599);
												} else {
													local1143.D(local90, local95, local19.anInt1622, local19.anInt1599, 0, local523, 1);
												}
												Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
											} else if (local19.anInt1617 == 0 && local98 == 0) {
												if (local19.anInt1670 != 0) {
													local1143.method6092((float) local19.anInt1622 / 2.0F + (float) local90, (float) local19.anInt1599 / 2.0F + (float) local95, local19.anInt1622 * 4096 / local247, local19.anInt1670);
												} else if (local19.anInt1622 == local247 && local1179 == local19.anInt1599) {
													local1143.method6088(local90, local95);
												} else {
													local1143.method6093(local90, local95, local19.anInt1622, local19.anInt1599);
												}
											} else if (local19.anInt1670 != 0) {
												local1143.method6089((float) local90 + (float) local19.anInt1622 / 2.0F, (float) local95 + (float) local19.anInt1599 / 2.0F, local19.anInt1622 * 4096 / local247, local19.anInt1670, local523);
											} else if (local247 == local19.anInt1622 && local19.anInt1599 == local1179) {
												local1143.YA(local90, local95, 0, local523, 1);
											} else {
												local1143.M(local90, local95, local19.anInt1622, local19.anInt1599, 0, local523, 1);
											}
										} else if (Static305.aBoolean109) {
											Static168.method2616(local19);
										}
									} else {
										local19.method1181(Static148.aClass123_1, Static303.aClass35_1).method5475(local19.anInt1622, Static387.aClass26_9, 0, local90, local95, local19.anInt1650 << 3, 0, local19.anInt1628 << 3, local19.anInt1599);
									}
								} else if (local19.anInt1642 == 6) {
									Static253.method3879();
									@Pc(1551) Class32 local1551 = null;
									local247 = 0;
									@Pc(1664) Class46 local1664;
									@Pc(1674) Class7 local1674;
									if (local19.anInt1671 != -1) {
										@Pc(1772) Class30 local1772 = Static350.aClass149_2.method3483(local19.anInt1671);
										if (local1772 != null) {
											local1772 = local1772.method731(local19.anInt1678);
											local1664 = local19.anInt1605 == -1 ? null : Static9.aClass194_1.method4371(local19.anInt1605);
											local1674 = local19.lb ? Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1 : null;
											local1551 = local1772.method748(local1664, local19.anInt1645, local1674, 1, local19.anInt1640, Static387.aClass26_9, 2048, local19.anInt1680);
											if (local1551 == null) {
												Static168.method2616(local19);
											} else {
												local247 = -local1551.b() >> 1;
											}
										}
									} else if (local19.anInt1662 == 5) {
										local1179 = local19.anInt1659;
										if (local1179 >= 0 && local1179 < 2048) {
											@Pc(1578) Class4_Sub2_Sub2_Sub1 local1578 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local1179];
											@Pc(1591) Class46 local1591 = local19.anInt1605 == -1 ? null : Static9.aClass194_1.method4371(local19.anInt1605);
											if (local1578 != null && (Static393.anInt6881 == local1179 || Static206.method3175(local1578.aString48) == local19.anInt1608)) {
												local1551 = local1578.aClass7_1.method158(Static215.aClass225_1, local19.anInt1680, local1591, 0, -1, null, 0, Static350.aClass149_2, Static417.aClass234_2, 2048, null, local19.anInt1645, Static4.aClass136_1, Static387.aClass26_9, Static9.aClass194_1, Static10.aClass61_1, local19.anInt1640);
											}
										}
									} else if (local19.anInt1662 == 8 || local19.anInt1662 == 9) {
										@Pc(1652) Class2_Sub44 local1652 = Static432.method5828(false, local19.anInt1659);
										local1664 = local19.anInt1605 == -1 ? null : Static9.aClass194_1.method4371(local19.anInt1605);
										if (local1652 != null) {
											local1674 = local19.lb ? Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1 : null;
											local1551 = local1652.method5786(local19.anInt1662 == 9, local19.anInt1645, local19.anInt1608, local1674, local19.anInt1680, local1664, local19.anInt1640, Static387.aClass26_9);
										}
									} else if (local19.anInt1605 == -1) {
										local1551 = local19.method1179(2048, Static4.aClass136_1, 0, Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1, -1, Static350.aClass149_2, Static387.aClass26_9, null, Static417.aClass234_2, Static9.aClass194_1, -1, Static215.aClass225_1, Static10.aClass61_1);
										if (local1551 == null && Static305.aBoolean109) {
											Static168.method2616(local19);
										}
									} else {
										@Pc(1709) Class46 local1709 = Static9.aClass194_1.method4371(local19.anInt1605);
										local1551 = local19.method1179(2048, Static4.aClass136_1, local19.anInt1640, Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1, local19.anInt1680, Static350.aClass149_2, Static387.aClass26_9, local1709, Static417.aClass234_2, Static9.aClass194_1, local19.anInt1645, Static215.aClass225_1, Static10.aClass61_1);
										if (local1551 == null && Static305.aBoolean109) {
											Static168.method2616(local19);
										}
									}
									if (local1551 != null) {
										if (local19.anInt1649 <= 0) {
											local1179 = 512;
										} else {
											local1179 = (local19.anInt1622 << 9) / local19.anInt1649;
										}
										if (local19.anInt1686 <= 0) {
											local523 = 512;
										} else {
											local523 = (local19.anInt1599 << 9) / local19.anInt1686;
										}
										local525 = local19.anInt1622 / 2 + local90 + (local1179 * local19.anInt1667 >> 9);
										local577 = local19.anInt1599 / 2 + local95 + (local19.anInt1609 * local523 >> 9);
										Static416.aClass102_5.HA();
										Static387.aClass26_9.m(Static416.aClass102_5);
										Static387.aClass26_9.GA(local525, local577, local1179, local523);
										Static387.aClass26_9.o((float) (local19.anInt1611 << 0), local19.aBoolean136 ? (float) (local19.anInt1657 << 0) : (float) (local19.anInt1657 << 0) * 1.5F);
										if (arg3 == -1412584499 || Static382.aBoolean578) {
											Static387.aClass26_9.va();
											Static387.aClass26_9.method2284();
											Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
											Static382.aBoolean578 = false;
										}
										if (local19.aBoolean137) {
											Static387.aClass26_9.method2253(false);
										}
										local601 = Class184.anIntArray349[local19.anInt1684 << 3] * (local19.anInt1615 << 0) >> 15;
										local603 = (local19.anInt1615 << 0) * Class184.anIntArray350[local19.anInt1684 << 3] >> 15;
										Static372.aClass102_4.ma(-local19.anInt1627 << 3);
										Static372.aClass102_4.c(local19.anInt1681 << 3);
										Static372.aClass102_4.ZA(local19.anInt1600 << 0, local247 + (local19.anInt1668 << 0) + local601, local603 + (local19.anInt1668 << 0));
										Static372.aClass102_4.na(local19.anInt1684 << 3);
										if (Static124.aBoolean204) {
											Static387.aClass26_9.Z(local90, local95, local19.anInt1622 + local90, local95 - -local19.anInt1599);
										}
										if (local19.aBoolean136) {
											local1551.method5677(Static372.aClass102_4, null, local19.anInt1615 << 0);
										} else {
											local1551.method5675(Static372.aClass102_4, null, 1);
										}
										if (Static124.aBoolean204) {
											Static387.aClass26_9.pa(arg0, arg5, arg2, arg1);
										}
										if (local19.aBoolean137) {
											Static387.aClass26_9.method2253(true);
										}
										Static387.aClass26_9.o(0.0F, 0.0F);
									}
								} else if (local19.anInt1642 == 9) {
									if (local19.aBoolean135) {
										local1179 = local90 + local19.anInt1622;
										local247 = local19.anInt1599 + local95;
										local523 = local95;
									} else {
										local1179 = local19.anInt1622 + local90;
										local247 = local95;
										local523 = local19.anInt1599 + local95;
									}
									if (local19.anInt1682 == 1) {
										Static387.aClass26_9.method2260(local90, local247, local1179, local523, local19.anInt1617, 0);
									} else {
										Static387.aClass26_9.method2217(local90, local247, local1179, local523, local19.anInt1617, local19.anInt1682);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	public static void method1389() {
		for (@Pc(10) Class2_Sub10 local10 = (Class2_Sub10) Static222.aClass265_32.method6005(); local10 != null; local10 = (Class2_Sub10) Static222.aClass265_32.method6001()) {
			if (local10.anInt1376 > 0) {
				local10.anInt1376--;
			}
			if (local10.anInt1376 != 0) {
				if (local10.anInt1385 > 0) {
					local10.anInt1385--;
				}
				if (local10.anInt1385 == 0 && local10.anInt1383 >= 1 && local10.anInt1387 >= 1 && local10.anInt1383 <= Static81.anInt1950 - 2 && local10.anInt1387 <= Static171.anInt3288 - 2 && (local10.anInt1382 < 0 || Static27.method5277(local10.anInt1377, local10.anInt1382))) {
					Static77.method5567(local10.anInt1387, local10.anInt1381, local10.anInt1377, local10.anInt1382, local10.anInt1375, local10.anInt1386, -1, local10.anInt1383);
					local10.anInt1385 = -1;
					if (local10.anInt1382 == local10.anInt1373 && local10.anInt1373 == -1) {
						local10.method6072();
					} else if (local10.anInt1373 == local10.anInt1382 && local10.anInt1374 == local10.anInt1386 && local10.anInt1378 == local10.anInt1377) {
						local10.method6072();
					}
				}
			} else if (local10.anInt1373 < 0 || Static27.method5277(local10.anInt1378, local10.anInt1373)) {
				Static77.method5567(local10.anInt1387, local10.anInt1381, local10.anInt1378, local10.anInt1373, local10.anInt1375, local10.anInt1374, -1, local10.anInt1383);
				local10.method6072();
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method1393() {
		@Pc(7) String local7 = "www";
		if (Static178.aClass269_5 == Static343.aClass269_11) {
			local7 = "www-wtrc";
		} else if (Static343.aClass269_11 == Static185.aClass269_6) {
			local7 = "www-wtqa";
		} else if (Static343.aClass269_11 == Static106.aClass269_3) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static438.aString70 != null) {
			local28 = "/p=" + Static438.aString70;
		}
		return "http://" + local7 + "." + Static107.aClass209_1.aString50 + ".com/l=" + Static272.anInt7537 + "/a=" + Static160.anInt3171 + local28 + "/";
	}
}
