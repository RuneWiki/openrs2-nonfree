import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
	public static void method690(@OriginalArg(0) int arg0) {
		if (Static347.anInt6319 == 0) {
			Static408.aClass3_Sub5_Sub1_118.method3610(arg0);
		} else {
			Static454.anInt7690 = arg0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII[Lclient!eo;IIIII)V")
	public static void method691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class68[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
		for (@Pc(13) int local13 = 0; local13 < arg4.length; local13++) {
			@Pc(21) Class68 local21 = arg4[local13];
			if (local21 != null && (arg6 == local21.anInt2225 || arg6 == -1412584499 && Static435.aClass68_14 == local21)) {
				@Pc(43) int local43;
				if (arg1 == -1) {
					Class7_Sub1.aRectangleArray4[Static54.anInt1292].setBounds(arg0 + local21.anInt2217, local21.anInt2212 + arg5, local21.anInt2178, local21.lb);
					local43 = Static54.anInt1292++;
				} else {
					local43 = arg1;
				}
				local21.anInt2215 = Static290.anInt5325;
				local21.anInt2218 = local43;
				if (!Static56.method1156(local21)) {
					if (local21.anInt2211 != 0) {
						Static392.method5298(local21);
					}
					@Pc(91) int local91 = local21.anInt2217 + arg0;
					@Pc(96) int local96 = arg5 + local21.anInt2212;
					@Pc(99) int local99 = local21.anInt2219;
					if (Static176.aBoolean278 && (Static56.method1160(local21).anInt4282 != 0 || local21.anInt2182 == 0) && local99 > 127) {
						local99 = 127;
					}
					@Pc(147) int local147;
					@Pc(151) int local151;
					if (Static435.aClass68_14 == local21) {
						if (arg6 != -1412584499 && (Static312.anInt5686 == local21.anInt2175 || local21.anInt2175 == Static376.anInt7411)) {
							Static12.aClass68Array1 = arg4;
							Static305.anInt5581 = arg5;
							Static370.anInt6574 = arg0;
							continue;
						}
						if (Static9.aBoolean14 && Static439.aBoolean517) {
							local147 = Static155.aClass74_1.method1870();
							local151 = Static155.aClass74_1.method1865();
							local151 -= Static418.anInt7210;
							local147 -= Static273.anInt5049;
							if (Static273.anInt5050 > local147) {
								local147 = Static273.anInt5050;
							}
							if (local151 < Static13.anInt424) {
								local151 = Static13.anInt424;
							}
							if (Static71.aClass68_1.anInt2178 + Static273.anInt5050 < local147 - -local21.anInt2178) {
								local147 = Static71.aClass68_1.anInt2178 + Static273.anInt5050 - local21.anInt2178;
							}
							if (local151 + local21.lb > Static13.anInt424 + Static71.aClass68_1.lb) {
								local151 = Static13.anInt424 + Static71.aClass68_1.lb - local21.lb;
							}
							local91 = local147;
							local96 = local151;
						}
						if (Static376.anInt7411 == local21.anInt2175) {
							local99 = 128;
						}
					}
					@Pc(290) int local290;
					@Pc(283) int local283;
					@Pc(247) int local247;
					@Pc(252) int local252;
					if (local21.anInt2182 == 2) {
						local290 = arg3;
						local283 = arg8;
						local147 = arg7;
						local151 = arg2;
					} else {
						local247 = local21.anInt2178 + local91;
						local252 = local96 + local21.lb;
						local151 = local96 > arg2 ? local96 : arg2;
						if (local21.anInt2182 == 9) {
							local247++;
							local252++;
						}
						local147 = local91 > arg7 ? local91 : arg7;
						local283 = arg8 > local252 ? local252 : arg8;
						local290 = local247 < arg3 ? local247 : arg3;
					}
					if (local147 < local290 && local151 < local283) {
						@Pc(568) int local568;
						@Pc(592) int local592;
						@Pc(594) int local594;
						@Pc(516) int local516;
						@Pc(518) int local518;
						if (local21.anInt2211 != 0) {
							if (local21.anInt2211 == Static27.anInt769 || local21.anInt2211 == Static259.anInt4913) {
								Static199.method3240(local21.lb, local21.anInt2178, Static259.anInt4913 == local21.anInt2211, local91, local96);
								Static308.aBooleanArray18[local43] = true;
								Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
								continue;
							}
							if (Static219.anInt4286 == local21.anInt2211) {
								if (local21.method1726(Static266.aClass75_7) != null) {
									Static143.method2556();
									Static35.method4619(local96, local21, Static266.aClass75_7, local91);
									Static290.aBooleanArray16[local43] = true;
									Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
								}
								continue;
							}
							if (local21.anInt2211 == Static202.anInt4003) {
								if (local21.method1726(Static266.aClass75_7) != null) {
									Static274.method4072(local91, local96, local21);
									Static290.aBooleanArray16[local43] = true;
									Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
								}
								continue;
							}
							if (local21.anInt2211 == Static400.anInt6965) {
								Static300.method4444(Static239.anInterface7_8, local96, local21.lb, local21.anInt2178, local91, Static266.aClass75_7);
								Static308.aBooleanArray18[local43] = true;
								Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
								continue;
							}
							if (Static312.anInt5694 == local21.anInt2211) {
								Static427.method5668(local96, local21.anInt2178, Static266.aClass75_7, local21.lb, local91);
								Static308.aBooleanArray18[local43] = true;
								Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
								continue;
							}
							if (Static179.anInt3654 == local21.anInt2211) {
								if (!Static156.aBoolean259 && !Static267.aBoolean371) {
									continue;
								}
								local247 = local21.anInt2178 + local91;
								local252 = local96 + 15;
								if (Static156.aBoolean259) {
									Static277.aClass65_5.method5813(local247, local252, "Fps:" + Static53.anInt1285, -256);
									local252 += 15;
									@Pc(507) Runtime local507 = Runtime.getRuntime();
									local516 = (int) ((local507.totalMemory() - local507.freeMemory()) / 1024L);
									local518 = -256;
									if (local516 > 65536) {
										local518 = -65536;
									}
									Static277.aClass65_5.method5813(local247, local252, "Mem:" + local516 + "k", local518);
									local252 += 15;
									Static277.aClass65_5.method5813(local247, local252, "In:" + Static107.anInt2380 + "B/s Out:" + Static228.anInt7612 + "B/s", -256);
									local252 += 15;
									local568 = Static266.aClass75_7.FA() / 1024;
									Static277.aClass65_5.method5813(local247, local252, "Offheap:" + local568 + "k", local568 <= 65536 ? -256 : -65536);
									local252 += 15;
									local592 = 0;
									local594 = 0;
									@Pc(596) int local596 = 0;
									for (@Pc(598) int local598 = 0; local598 < 30; local598++) {
										local592 += Static58.aClass50_Sub1Array1[local598].method1837();
										local594 += Static58.aClass50_Sub1Array1[local598].method1832();
										local596 += Static58.aClass50_Sub1Array1[local598].method1835();
									}
									@Pc(634) int local634 = local596 * 100 / local592;
									@Pc(640) int local640 = local594 * 10000 / local592;
									@Pc(660) String local660 = "Cache:" + Static410.method5506((long) local640, 2, true, 0) + "% (" + local634 + "%)";
									Static183.aClass65_3.method5813(local247, local252, local660, -256);
									local252 += 12;
								}
								if (Static217.anInt4262 > 0) {
									Static183.aClass65_3.method5813(local247, local252, "Particles: " + Static187.anInt3763 + " / " + Static217.anInt4262, -256);
								}
								local252 += 12;
								if (Static267.aBoolean371) {
									Static183.aClass65_3.method5813(local247, local252, "Polys: " + Static266.aClass75_7.xa() + " Models: " + Static266.aClass75_7.g(), -256);
									local252 += 12;
									Static183.aClass65_3.method5813(local247, local252, "Ls: " + Static211.anInt4168 + " La: " + Static204.anInt778 + " NPC: " + Static234.anInt4519 + " Pl: " + Static126.anInt3502, -256);
									local252 += 12;
									Static393.method5307();
								}
								Static308.aBooleanArray18[local43] = true;
								continue;
							}
						}
						if (local21.anInt2182 == 0) {
							if (local21.anInt2211 == Static226.anInt4377 && Static266.aClass75_7.method2609()) {
								Static266.aClass75_7.method2577(local91, local96, local21.anInt2178, local21.lb);
							}
							method691(local91 - local21.anInt2147, local43, local151, local290, arg4, local96 - local21.anInt2151, local21.anInt2177, local147, local283);
							if (local21.aClass68Array2 != null) {
								method691(local91 - local21.anInt2147, local43, local151, local290, local21.aClass68Array2, local96 - local21.anInt2151, local21.anInt2177, local147, local283);
							}
							@Pc(831) Class3_Sub40 local831 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local21.anInt2177);
							if (local831 != null) {
								Static439.method5864(local290, local91, local283, local147, local151, local96, local831.anInt6668, local43);
							}
							if (local21.anInt2211 == Static226.anInt4377 && Static266.aClass75_7.method2609()) {
								Static266.aClass75_7.method2633();
								Static329.aBoolean423 = true;
							}
							Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
						}
						if (Static406.aBooleanArray24[local43] || Static57.anInt1412 > 1) {
							if (local21.anInt2182 == 3) {
								if (local99 == 0) {
									if (local21.aBoolean175) {
										Static266.aClass75_7.NA(local91, local96, local21.anInt2178, local21.lb, local21.anInt2174, 0);
									} else {
										Static266.aClass75_7.method2637(local91, local96, local21.anInt2178, local21.lb, local21.anInt2174, 0);
									}
								} else if (local21.aBoolean175) {
									Static266.aClass75_7.NA(local91, local96, local21.anInt2178, local21.lb, 255 - (local99 & 0xFF) << 24 | local21.anInt2174 & 0xFFFFFF, 1);
								} else {
									Static266.aClass75_7.method2637(local91, local96, local21.anInt2178, local21.lb, local21.anInt2174 & 0xFFFFFF | 255 - (local99 & 0xFF) << 24, 1);
								}
							} else if (local21.anInt2182 == 4) {
								@Pc(977) Class65 local977 = local21.method1730(Static266.aClass75_7);
								if (local977 != null) {
									local252 = local21.anInt2174;
									@Pc(994) String local994 = local21.aString20;
									if (local21.anInt2192 != -1) {
										@Pc(1005) Class191 local1005 = Static89.aClass157_1.method3832(local21.anInt2192);
										local994 = local1005.aString56;
										if (local994 == null) {
											local994 = "null";
										}
										if ((local1005.anInt5837 == 1 || local21.anInt2186 != 1) && local21.anInt2186 != -1) {
											local994 = "<col=ff9040>" + local994 + "</col> x" + Static136.method1777(local21.anInt2186);
										}
									}
									if (local21 == Static426.aClass68_13) {
										local994 = Static66.aClass175_54.method4201(Static216.anInt4257);
										local252 = local21.anInt2174;
									}
									if (Static112.aBoolean439) {
										Static266.aClass75_7.Z(local91, local96, local21.anInt2178 + local91, local21.lb + local96);
									}
									local977.method5816(local21.aBoolean171 ? 255 - (local99 & 0xFF) << 24 : -1, null, null, local21.anInt2138, Static240.aClass22Array17, local21.anInt2178, local21.anInt2189, local21.lb, local91, local21.anInt2143, local994, local96, local252 | 255 - (local99 & 0xFF) << 24, 0, 0, local21.anInt2167);
									if (Static112.aBoolean439) {
										Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
									}
								} else if (Static395.aBoolean472) {
									Static442.method5899(local21);
								}
							} else {
								@Pc(1210) int local1210;
								if (local21.anInt2182 == 5) {
									if (local21.anInt2154 >= 0) {
										local21.method1734(Static290.aClass2_1, Static430.aClass211_1).method933(local96, local91, local21.anInt2178, local21.lb, local21.anInt2204 << 3, local21.anInt2202 << 3, 0, 0, Static266.aClass75_7);
									} else {
										@Pc(1193) Class22 local1193;
										if (local21.anInt2192 == -1) {
											local1193 = local21.method1731(Static266.aClass75_7);
										} else {
											@Pc(1175) Class8 local1175 = local21.aBoolean170 ? Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1 : null;
											local1193 = Static89.aClass157_1.method3834(local1175, local21.anInt2144, local21.anInt2149, local21.anInt2186, local21.anInt2179 | 0xFF000000, local21.anInt2192, Static266.aClass75_7);
										}
										if (local1193 != null) {
											local252 = local1193.ja();
											local1210 = local1193.JA();
											local516 = (local21.anInt2174 == 0 ? 16777215 : local21.anInt2174 & 0xFFFFFF) | 255 - (local99 & 0xFF) << 24;
											if (local21.aBoolean172) {
												Static266.aClass75_7.Z(local91, local96, local21.anInt2178 + local91, local96 - -local21.lb);
												if (local21.anInt2206 != 0) {
													local518 = (local252 + local21.anInt2178 - 1) / local252;
													local568 = (local21.lb + local1210 - 1) / local1210;
													for (local592 = 0; local592 < local518; local592++) {
														for (local594 = 0; local594 < local568; local594++) {
															if (local21.anInt2174 == 0) {
																local1193.method6069((float) (local91 + local592 * local252) + (float) local252 / 2.0F, (float) (local594 * local1210 + local96) + (float) local1210 / 2.0F, 4096, local21.anInt2206);
															} else {
																local1193.method6068((float) (local252 * local592 + local91) + (float) local252 / 2.0F, (float) local1210 / 2.0F + (float) (local96 - -(local594 * local1210)), 4096, local21.anInt2206, local516);
															}
														}
													}
												} else if (local21.anInt2174 == 0 && local99 == 0) {
													local1193.method6072(local91, local96, local21.anInt2178, local21.lb);
												} else {
													local1193.D(local91, local96, local21.anInt2178, local21.lb, 0, local516, 1);
												}
												Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
											} else if (local21.anInt2174 == 0 && local99 == 0) {
												if (local21.anInt2206 != 0) {
													local1193.method6069((float) local91 + (float) local21.anInt2178 / 2.0F, (float) local21.lb / 2.0F + (float) local96, local21.anInt2178 * 4096 / local252, local21.anInt2206);
												} else if (local252 == local21.anInt2178 && local21.lb == local1210) {
													local1193.method6074(local91, local96);
												} else {
													local1193.method6075(local91, local96, local21.anInt2178, local21.lb);
												}
											} else if (local21.anInt2206 != 0) {
												local1193.method6068((float) local91 + (float) local21.anInt2178 / 2.0F, (float) local96 + (float) local21.lb / 2.0F, local21.anInt2178 * 4096 / local252, local21.anInt2206, local516);
											} else if (local21.anInt2178 == local252 && local1210 == local21.lb) {
												local1193.YA(local91, local96, 0, local516, 1);
											} else {
												local1193.M(local91, local96, local21.anInt2178, local21.lb, 0, local516, 1);
											}
										} else if (Static395.aBoolean472) {
											Static442.method5899(local21);
										}
									}
								} else if (local21.anInt2182 == 6) {
									Static10.method249();
									@Pc(1550) Class31 local1550 = null;
									local252 = 0;
									@Pc(1658) Class96 local1658;
									@Pc(1668) Class8 local1668;
									if (local21.anInt2192 != -1) {
										@Pc(1767) Class191 local1767 = Static89.aClass157_1.method3832(local21.anInt2192);
										if (local1767 != null) {
											local1767 = local1767.method4674(local21.anInt2186);
											local1658 = local21.anInt2205 == -1 ? null : Static196.aClass30_2.method942(local21.anInt2205);
											local1668 = local21.aBoolean170 ? Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1 : null;
											local1550 = local1767.method4670(2048, local21.anInt2139, Static266.aClass75_7, 1, local21.anInt2152, local21.anInt2216, local1658, local1668);
											if (local1550 == null) {
												Static442.method5899(local21);
											} else {
												local252 = -local1550.b() >> 1;
											}
										}
									} else if (local21.anInt2173 == 5) {
										local1210 = local21.anInt2146;
										if (local1210 >= 0 && local1210 < 2048) {
											@Pc(1709) Class1_Sub3_Sub3_Sub1 local1709 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local1210];
											@Pc(1722) Class96 local1722 = local21.anInt2205 == -1 ? null : Static196.aClass30_2.method942(local21.anInt2205);
											if (local1709 != null && (local1210 == Static177.anInt3617 || Static298.method4383(local1709.aString47) == local21.anInt2190)) {
												local1550 = local1709.aClass8_1.method244(2048, local1722, Static154.aClass251_2, Static427.aClass237_1, local21.anInt2152, Static196.aClass30_2, -1, local21.anInt2139, null, local21.anInt2216, Static369.aClass11_1, Static266.aClass75_7, 0, null, 0, Static279.aClass109_8, Static89.aClass157_1);
											}
										}
									} else if (local21.anInt2173 == 8 || local21.anInt2173 == 9) {
										@Pc(1645) Class3_Sub30 local1645 = Static9.method237(false, local21.anInt2146);
										local1658 = local21.anInt2205 == -1 ? null : Static196.aClass30_2.method942(local21.anInt2205);
										if (local1645 != null) {
											local1668 = local21.aBoolean170 ? Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1 : null;
											local1550 = local1645.method3810(local21.anInt2173 == 9, local21.anInt2152, local21.anInt2216, local1668, local21.anInt2139, Static266.aClass75_7, local1658, local21.anInt2190);
										}
									} else if (local21.anInt2205 == -1) {
										local1550 = local21.method1720(Static427.aClass237_1, Static266.aClass75_7, Static196.aClass30_2, -1, 0, Static369.aClass11_1, null, Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1, -1, Static279.aClass109_8, Static154.aClass251_2, 2048, Static89.aClass157_1);
										if (local1550 == null && Static395.aBoolean472) {
											Static442.method5899(local21);
										}
									} else {
										@Pc(1582) Class96 local1582 = Static196.aClass30_2.method942(local21.anInt2205);
										local1550 = local21.method1720(Static427.aClass237_1, Static266.aClass75_7, Static196.aClass30_2, local21.anInt2139, local21.anInt2152, Static369.aClass11_1, local1582, Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1, local21.anInt2216, Static279.aClass109_8, Static154.aClass251_2, 2048, Static89.aClass157_1);
										if (local1550 == null && Static395.aBoolean472) {
											Static442.method5899(local21);
										}
									}
									if (local1550 != null) {
										if (local21.anInt2209 <= 0) {
											local1210 = 512;
										} else {
											local1210 = (local21.anInt2178 << 9) / local21.anInt2209;
										}
										if (local21.anInt2183 > 0) {
											local516 = (local21.lb << 9) / local21.anInt2183;
										} else {
											local516 = 512;
										}
										local518 = local21.anInt2178 / 2 + local91 + (local21.anInt2227 * local1210 >> 9);
										local568 = local96 + local21.lb / 2 + (local516 * local21.anInt2207 >> 9);
										Static203.aClass106_2.HA();
										Static266.aClass75_7.m(Static203.aClass106_2);
										Static266.aClass75_7.GA(local518, local568, local1210, local516);
										Static266.aClass75_7.o((float) (local21.anInt2176 << 0), local21.aBoolean168 ? (float) (local21.anInt2201 << 0) : (float) (local21.anInt2201 << 0) * 1.5F);
										if (arg6 == -1412584499 || Static329.aBoolean423) {
											Static266.aClass75_7.va();
											Static266.aClass75_7.method2570();
											Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
											Static329.aBoolean423 = false;
										}
										if (local21.aBoolean177) {
											Static266.aClass75_7.method2572(false);
										}
										local592 = Applet_Sub1.anIntArray85[local21.anInt2141 << 3] * (local21.anInt2191 << 0) >> 15;
										local594 = Applet_Sub1.anIntArray87[local21.anInt2141 << 3] * (local21.anInt2191 << 0) >> 15;
										Static306.aClass106_5.ma(-local21.anInt2198 << 3);
										Static306.aClass106_5.c(local21.anInt2195 << 3);
										Static306.aClass106_5.ZA(local21.anInt2208 << 0, (local21.anInt2142 << 0) + (local592 + local252), (local21.anInt2142 << 0) + local594);
										Static306.aClass106_5.na(local21.anInt2141 << 3);
										if (Static112.aBoolean439) {
											Static266.aClass75_7.Z(local91, local96, local91 + local21.anInt2178, local21.lb + local96);
										}
										if (local21.aBoolean168) {
											local1550.method5706(Static306.aClass106_5, null, local21.anInt2191 << 0);
										} else {
											local1550.method5704(Static306.aClass106_5, null, 1);
										}
										if (Static112.aBoolean439) {
											Static266.aClass75_7.pa(arg7, arg2, arg3, arg8);
										}
										if (local21.aBoolean177) {
											Static266.aClass75_7.method2572(true);
										}
										Static266.aClass75_7.o(0.0F, 0.0F);
									}
								} else if (local21.anInt2182 == 9) {
									if (local21.aBoolean173) {
										local516 = local96;
										local252 = local21.lb + local96;
										local1210 = local21.anInt2178 + local91;
									} else {
										local252 = local96;
										local1210 = local91 + local21.anInt2178;
										local516 = local96 + local21.lb;
									}
									if (local21.anInt2145 == 1) {
										Static266.aClass75_7.method2618(local91, local252, local1210, local516, local21.anInt2174, 0);
									} else {
										Static266.aClass75_7.method2575(local91, local252, local1210, local516, local21.anInt2174, local21.anInt2145);
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
