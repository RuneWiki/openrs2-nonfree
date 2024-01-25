import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "Lclient!wia;")
	public static Class386 aClass386_103;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
	public static int anInt8261;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
	public static int anInt8259 = 0;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
	private static final int anInt8264 = 1409;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIB[Lclient!mea;ZII)V")
	public static void method6872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class230[] arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static677.aClass137_47.KA(arg9, arg8, arg0, arg2);
		for (@Pc(13) int local13 = 0; local13 < arg6.length; local13++) {
			@Pc(19) Class230 local19 = arg6[local13];
			if (local19 != null && (local19.anInt6668 == arg5 || arg5 == -1412584499 && local19 == Static299.aClass230_4)) {
				@Pc(44) int local44 = local19.anInt6725 + arg1;
				@Pc(50) int local50 = local19.anInt6676 + arg3;
				@Pc(57) int local57 = local44 + local19.anInt6703 + 1;
				@Pc(64) int local64 = local19.anInt6701 + local50 + 1;
				@Pc(90) int local90;
				if (arg4 == -1) {
					Class334.aRectangleArray1[Static599.anInt6161].setBounds(arg1 + local19.anInt6725, local19.anInt6676 - -arg3, local19.anInt6703, local19.anInt6701);
					local90 = Static599.anInt6161++;
				} else {
					local90 = arg4;
				}
				local19.anInt6704 = Static87.anInt1951;
				local19.anInt6682 = local90;
				if (!Static78.method1473(local19)) {
					if (local19.anInt6693 != 0) {
						Static160.method2608(local19);
					}
					@Pc(117) int local117 = arg1 + local19.anInt6725;
					@Pc(123) int local123 = local19.anInt6676 + arg3;
					@Pc(125) int local125 = 0;
					@Pc(127) int local127 = 0;
					if (Static128.aBoolean202) {
						local125 = Static619.method8679();
						local127 = Static571.method8194();
					}
					@Pc(138) int local138 = local19.anInt6715;
					if (Static28.aBoolean59 && (Static78.method1481(local19).anInt6586 != 0 || local19.anInt6660 == 0) && local138 > 127) {
						local138 = 127;
					}
					@Pc(195) int local195;
					@Pc(201) int local201;
					if (Static299.aClass230_4 == local19) {
						if (arg5 != -1412584499 && (local19.anInt6694 == Static46.anInt1125 || Static200.anInt3718 == local19.anInt6694)) {
							Static43.aClass230Array1 = arg6;
							Static114.anInt2293 = arg3;
							Static178.anInt3433 = arg1;
							continue;
						}
						if (Static96.aBoolean171 && Static380.aBoolean497) {
							local195 = local125 + Static666.aClass79_1.method3361();
							local201 = local127 + Static666.aClass79_1.method3358();
							local195 -= Static325.anInt6166;
							local201 -= Static260.anInt4561;
							if (local195 < Static174.anInt10838) {
								local195 = Static174.anInt10838;
							}
							if (local19.anInt6703 + local195 > Static176.aClass230_2.anInt6703 + Static174.anInt10838) {
								local195 = Static174.anInt10838 + Static176.aClass230_2.anInt6703 - local19.anInt6703;
							}
							if (Static660.anInt10983 > local201) {
								local201 = Static660.anInt10983;
							}
							if (Static660.anInt10983 + Static176.aClass230_2.anInt6701 < local19.anInt6701 + local201) {
								local201 = Static660.anInt10983 + Static176.aClass230_2.anInt6701 - local19.anInt6701;
							}
							local117 = local195;
							local123 = local201;
						}
						if (Static200.anInt3718 == local19.anInt6694) {
							local138 = 128;
						}
					}
					@Pc(333) int local333;
					@Pc(326) int local326;
					@Pc(288) int local288;
					@Pc(293) int local293;
					if (local19.anInt6660 == 2) {
						local326 = arg2;
						local195 = arg9;
						local333 = arg0;
						local201 = arg8;
					} else {
						local288 = local19.anInt6703 + local117;
						local293 = local19.anInt6701 + local123;
						if (local19.anInt6660 == 9) {
							local293++;
							local288++;
						}
						local201 = local123 > arg8 ? local123 : arg8;
						local195 = local117 <= arg9 ? arg9 : local117;
						local326 = local293 < arg2 ? local293 : arg2;
						local333 = local288 < arg0 ? local288 : arg0;
					}
					if (local333 > local195 && local326 > local201) {
						@Pc(638) int local638;
						@Pc(683) int local683;
						@Pc(780) int local780;
						@Pc(782) int local782;
						@Pc(672) int local672;
						@Pc(674) int local674;
						if (local19.anInt6693 != 0) {
							if (Static243.anInt4385 == local19.anInt6693 || local19.anInt6693 == Static553.anInt9422) {
								Static369.method5533(local19, local123, local117);
								if (!Static128.aBoolean202) {
									Static582.method8312(local19.anInt6703, local123, local117, local19.anInt6693 == Static553.anInt9422, local19.anInt6701);
									Static677.aClass137_47.KA(arg9, arg8, arg0, arg2);
								}
								Static446.aBooleanArray18[local90] = true;
								continue;
							}
							if (Static240.anInt4349 == local19.anInt6693) {
								if (local19.method5457(Static677.aClass137_47) != null) {
									Static299.method4404();
									Static106.method6920(local123, local19, local117, Static677.aClass137_47);
									Static337.aBooleanArray16[local90] = true;
									Static677.aClass137_47.KA(arg9, arg8, arg0, arg2);
									if (Static128.aBoolean202) {
										if (arg7) {
											Static357.method5407(local44, local50, local64, local57);
										} else {
											Static152.method2446(local44, local64, local50, local57);
										}
									}
								}
								continue;
							}
							if (local19.anInt6693 == Static278.anInt4830) {
								Static26.method488(local117, Static677.aClass137_47, local19, local123);
								continue;
							}
							if (anInt8264 == local19.anInt6693) {
								Static448.method6507(local117, local19.anInt6713 % 64, local19, local123, Static677.aClass137_47);
								continue;
							}
							if (Static646.anInt10802 == local19.anInt6693) {
								if (local19.method5457(Static677.aClass137_47) != null) {
									Static375.method5570(local123, local19, local117);
									Static337.aBooleanArray16[local90] = true;
									Static677.aClass137_47.KA(arg9, arg8, arg0, arg2);
									if (Static128.aBoolean202) {
										if (arg7) {
											Static357.method5407(local44, local50, local64, local57);
										} else {
											Static152.method2446(local44, local64, local50, local57);
										}
									}
								}
								continue;
							}
							if (local19.anInt6693 == Static87.anInt1953) {
								Static292.method4331(local123, local19.anInt6701, Static677.aClass137_47, Static526.anInterface3_10, local117, local19.anInt6703);
								Static446.aBooleanArray18[local90] = true;
								Static677.aClass137_47.KA(arg9, arg8, arg0, arg2);
								continue;
							}
							if (local19.anInt6693 == Static122.anInt2457) {
								Static527.method7555(local123, local117, local19.anInt6701, local19.anInt6703, Static677.aClass137_47);
								Static446.aBooleanArray18[local90] = true;
								Static677.aClass137_47.KA(arg9, arg8, arg0, arg2);
								continue;
							}
							if (local19.anInt6693 == Static148.anInt2839) {
								if (!Class12_Sub2_Sub1_Sub2.lb && !Static13.aBoolean13) {
									continue;
								}
								local288 = local19.anInt6703 + local117;
								local293 = local123 + 15;
								if (Static128.aBoolean202) {
									if (arg7) {
										Static357.method5407(local44, local50, local64, local57);
									} else {
										Static152.method2446(local44, local64, local50, local57);
									}
								}
								if (Class12_Sub2_Sub1_Sub2.lb) {
									local638 = -256;
									if (Static12.anInt96 < 20) {
										local638 = -65536;
									}
									Static242.aClass38_5.method8990(local638, local288, local293, -1, "Fps:" + Static12.anInt96);
									local293 += 15;
									@Pc(662) Runtime local662 = Runtime.getRuntime();
									local672 = (int) ((local662.totalMemory() - local662.freeMemory()) / 1024L);
									local674 = -256;
									if (local672 > 98304) {
										if (Static289.aBoolean343) {
											Static150.method2365();
											for (local683 = 0; local683 < 10; local683++) {
												System.gc();
											}
											local672 = (int) ((local662.totalMemory() - local662.freeMemory()) / 1024L);
											if (local672 > 65536) {
												Static271.method3957("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local674 = -65536;
									}
									Static242.aClass38_5.method8990(local674, local288, local293, -1, "Mem:" + local672 + "k");
									local293 += 15;
									Static242.aClass38_5.method8990(-256, local288, local293, -1, "In:" + Static12.anInt95 + "B/s Out:" + Static310.anInt5392 + "B/s");
									local293 += 15;
									local683 = Static677.aClass137_47.E() / 1024;
									Static242.aClass38_5.method8990(local683 > 65536 ? -65536 : -256, local288, local293, -1, "Offheap:" + local683 + "k");
									local293 += 15;
									local780 = 0;
									local782 = 0;
									@Pc(784) int local784 = 0;
									for (@Pc(786) int local786 = 0; local786 < 37; local786++) {
										if (Static177.aClass167_Sub1Array1[local786] != null) {
											local780 += Static177.aClass167_Sub1Array1[local786].method3713();
											local782 += Static177.aClass167_Sub1Array1[local786].method3710();
											local784 += Static177.aClass167_Sub1Array1[local786].method3714();
										}
									}
									@Pc(828) int local828 = local784 * 100 / local780;
									@Pc(834) int local834 = local782 * 10000 / local780;
									@Pc(854) String local854 = "Cache:" + Static345.method5288(0, true, 2, (long) local834) + "% (" + local828 + "%)";
									Static294.aClass38_9.method8990(-256, local288, local293, -1, local854);
									local293 += 12;
								}
								if (Static132.anInt2539 > 0) {
									Static294.aClass38_9.method8990(-256, local288, local293, -1, "Particles: " + Static486.anInt8727 + " / " + Static132.anInt2539);
								}
								local293 += 12;
								if (Static13.aBoolean13) {
									Static294.aClass38_9.method8990(-256, local288, local293, -1, "Polys: " + Static677.aClass137_47.I() + " Models: " + Static677.aClass137_47.M());
									local293 += 12;
									Static294.aClass38_9.method8990(-256, local288, local293, -1, "Ls: " + Static473.anInt8240 + " La: " + Static563.anInt9771 + " NPC: " + Static143.anInt2732 + " Pl: " + Static130.anInt2522);
									Static345.method5294();
									local293 += 12;
								}
								Static446.aBooleanArray18[local90] = true;
								continue;
							}
						}
						@Pc(1025) Class14_Sub32 local1025;
						if (local19.anInt6660 == 0) {
							if (local19.anInt6693 == Static344.anInt11211 && Static677.aClass137_47.method7880()) {
								Static677.aClass137_47.method7879(local117, local123, local19.anInt6703, local19.anInt6701);
							}
							method6872(local333, local117 - local19.anInt6705, local326, local123 - local19.anInt6641, local90, local19.anInt6663, arg6, arg7, local201, local195);
							if (local19.aClass230Array2 != null) {
								method6872(local333, local117 - local19.anInt6705, local326, local123 - local19.anInt6641, local90, local19.anInt6663, local19.aClass230Array2, arg7, local201, local195);
							}
							local1025 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local19.anInt6663);
							if (local1025 != null) {
								Static443.method6487(local90, local333, local117, local1025.anInt6351, local326, local195, local201, local123);
							}
							if (Static344.anInt11211 == local19.anInt6693 && Static677.aClass137_47.method7880()) {
								Static677.aClass137_47.method7919();
							}
							Static677.aClass137_47.KA(arg9, arg8, arg0, arg2);
						}
						if (Static50.aBooleanArray4[local90] || Static624.anInt10511 > 1) {
							if (local19.anInt6660 == 3) {
								if (local138 == 0) {
									if (local19.aBoolean484) {
										Static677.aClass137_47.aa(local117, local123, local19.anInt6703, local19.anInt6701, local19.anInt6713, 0);
									} else {
										Static677.aClass137_47.method7927(local117, local123, local19.anInt6703, local19.anInt6701, local19.anInt6713, 0);
									}
								} else if (local19.aBoolean484) {
									Static677.aClass137_47.aa(local117, local123, local19.anInt6703, local19.anInt6701, local19.anInt6713 & 0xFFFFFF | 255 - (local138 & 0xFF) << 24, 1);
								} else {
									Static677.aClass137_47.method7927(local117, local123, local19.anInt6703, local19.anInt6701, 255 - (local138 & 0xFF) << 24 | local19.anInt6713 & 0xFFFFFF, 1);
								}
								if (Static128.aBoolean202) {
									if (arg7) {
										Static357.method5407(local44, local50, local64, local57);
									} else {
										Static152.method2446(local44, local64, local50, local57);
									}
								}
							} else {
								@Pc(1207) Class27 local1207;
								if (local19.anInt6660 == 4) {
									@Pc(1179) Class38 local1179 = local19.method5453(Static677.aClass137_47);
									if (local1179 != null) {
										local293 = local19.anInt6713;
										@Pc(1194) String local1194 = local19.aString72;
										if (local19.anInt6646 != -1) {
											local1207 = Static175.aClass247_2.method5962(local19.anInt6646);
											local1194 = local1207.aString9;
											if (local1194 == null) {
												local1194 = "null";
											}
											if ((local1207.anInt901 == 1 || local19.anInt6692 != 1) && local19.anInt6692 != -1) {
												local1194 = "<col=ff9040>" + local1194 + "</col> x" + Static471.method6841(local19.anInt6692);
											}
										}
										if (local19.anInt6671 != -1) {
											local1194 = Static402.method8594(local19.anInt6671);
											if (local1194 == null) {
												local1194 = "";
											}
										}
										if (local19 == Static354.aClass230_5) {
											local1194 = Static514.aClass303_33.method7473(Static232.anInt4258);
											local293 = local19.anInt6713;
										}
										if (Static436.aBoolean533) {
											Static677.aClass137_47.T(local117, local123, local19.anInt6703 + local117, local123 - -local19.anInt6701);
										}
										local1179.method8988(local19.anInt6651, local19.anInt6665, local19.anInt6703, local117, local293 | 255 - (local138 & 0xFF) << 24, 0, (Class1) null, local19.anInt6701, Static521.aClass20Array13, local1194, 0, local19.anInt6672, (int[]) null, local123, local19.aBoolean472 ? 255 - (local138 & 0xFF) << 24 : -1, local19.anInt6681);
										if (Static436.aBoolean533) {
											Static677.aClass137_47.KA(arg9, arg8, arg0, arg2);
										}
										if (local1194.trim().length() > 0) {
											if (!Static436.aBoolean533) {
												@Pc(1378) Class158 local1378 = Static250.method3681(Static677.aClass137_47, local19.anInt6690);
												local672 = local1378.method3599(Static521.aClass20Array13, local1194, local19.anInt6703);
												local674 = local1378.method3607(local19.anInt6703, Static521.aClass20Array13, local1194, local19.anInt6651);
												if (Static128.aBoolean202) {
													if (arg7) {
														Static357.method5407(local117, local123, local674 + local123, local672 + local117);
													} else {
														Static152.method2446(local117, local674 + local123, local123, local117 + local672);
													}
												}
											} else if (Static128.aBoolean202) {
												if (arg7) {
													Static357.method5407(local44, local50, local64, local57);
												} else {
													Static152.method2446(local44, local64, local50, local57);
												}
											}
										}
									} else if (Static634.aBoolean731) {
										Static634.method8860(local19);
									}
								} else {
									@Pc(1545) int local1545;
									if (local19.anInt6660 == 5) {
										if (local19.anInt6719 >= 0) {
											local19.method5456(Static20.aClass385_31, Static379.aClass250_13).method3545(local19.anInt6703, local19.anInt6639 << 3, Static677.aClass137_47, 0, 0, local117, local19.anInt6701, local19.anInt6644 << 3, local123);
										} else {
											@Pc(1479) Class20 local1479;
											if (local19.anInt6646 != -1) {
												@Pc(1496) Class325 local1496 = local19.aBoolean471 ? Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 : null;
												local1479 = Static175.aClass247_2.method5957(local1496, local19.anInt6646, local19.anInt6712, Static677.aClass137_47, local19.anInt6692, local19.anInt6721, local19.anInt6698 | 0xFF000000);
											} else if (local19.anInt6671 == -1) {
												local1479 = local19.method5472(Static677.aClass137_47);
											} else {
												local1479 = Static663.method9202(local19.anInt6671, Static677.aClass137_47);
											}
											if (local1479 != null) {
												local293 = local1479.method7394();
												local638 = local1479.method7408();
												local1545 = 255 - (local138 & 0xFF) << 24 | (local19.anInt6713 == 0 ? 16777215 : local19.anInt6713 & 0xFFFFFF);
												if (local19.aBoolean481) {
													Static677.aClass137_47.T(local117, local123, local117 + local19.anInt6703, local19.anInt6701 + local123);
													if (local19.anInt6661 != 0) {
														local672 = (local293 + local19.anInt6703 - 1) / local293;
														local674 = (local19.anInt6701 + local638 - 1) / local638;
														for (local683 = 0; local683 < local672; local683++) {
															for (local780 = 0; local780 < local674; local780++) {
																if (local19.anInt6713 == 0) {
																	local1479.method7416((float) (local293 * local683 + local117) + (float) local293 / 2.0F, (float) (local638 * local780 + local123) + (float) local638 / 2.0F, 4096, local19.anInt6661);
																} else {
																	local1479.method7400((float) (local117 + local293 * local683) + (float) local293 / 2.0F, (float) (local638 * local780 + local123) + (float) local638 / 2.0F, 4096, local19.anInt6661, local1545);
																}
															}
														}
													} else if (local19.anInt6713 == 0 && local138 == 0) {
														local1479.method7414(local117, local123, local19.anInt6703, local19.anInt6701);
													} else {
														local1479.method7406(local117, local123, local19.anInt6703, local19.anInt6701, 0, local1545, 1);
													}
													Static677.aClass137_47.KA(arg9, arg8, arg0, arg2);
												} else if (local19.anInt6713 == 0 && local138 == 0) {
													if (local19.anInt6661 != 0) {
														local1479.method7416((float) local19.anInt6703 / 2.0F + (float) local117, (float) local123 + (float) local19.anInt6701 / 2.0F, local19.anInt6703 * 4096 / local293, local19.anInt6661);
													} else if (local293 == local19.anInt6703 && local19.anInt6701 == local638) {
														local1479.method7399(local117, local123);
													} else {
														local1479.method7405(local117, local123, local19.anInt6703, local19.anInt6701);
													}
												} else if (local19.anInt6661 != 0) {
													local1479.method7400((float) local117 + (float) local19.anInt6703 / 2.0F, (float) local19.anInt6701 / 2.0F + (float) local123, local19.anInt6703 * 4096 / local293, local19.anInt6661, local1545);
												} else if (local19.anInt6703 == local293 && local638 == local19.anInt6701) {
													local1479.method7402(local117, local123, 0, local1545, 1);
												} else {
													local1479.method7398(local117, local123, local19.anInt6703, local19.anInt6701, 0, local1545, 1);
												}
											} else if (Static634.aBoolean731) {
												Static634.method8860(local19);
											}
										}
										if (Static128.aBoolean202) {
											if (arg7) {
												Static357.method5407(local44, local50, local64, local57);
											} else {
												Static152.method2446(local44, local64, local50, local57);
											}
										}
									} else if (local19.anInt6660 == 6) {
										Static364.method5497();
										local1025 = null;
										@Pc(1887) Class80 local1887 = null;
										local638 = 0;
										@Pc(1920) Class275 local1920;
										@Pc(1928) Class325 local1928;
										if (local19.anInt6646 != -1) {
											local1207 = Static175.aClass247_2.method5962(local19.anInt6646);
											if (local1207 != null) {
												local1207 = local1207.method819(local19.anInt6692);
												local1920 = local19.anInt6637 == -1 ? null : Static501.aClass191_2.method4322(local19.anInt6637);
												local1928 = local19.aBoolean471 ? Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 : null;
												local1887 = local1207.method816(local19.anInt6666, local1928, local1920, Static677.aClass137_47, 2048, local19.anInt6723, local19.anInt6728, 1);
												if (local1887 == null) {
													Static634.method8860(local19);
												} else {
													local638 = -local1887.fa() >> 1;
												}
											}
										} else if (local19.anInt6680 == 5) {
											local1545 = local19.anInt6674;
											if (local1545 >= 0 && local1545 < 2048) {
												@Pc(1978) Class12_Sub2_Sub2_Sub1_Sub2 local1978 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local1545];
												@Pc(1991) Class275 local1991 = local19.anInt6637 == -1 ? null : Static501.aClass191_2.method4322(local19.anInt6637);
												if (local1978 != null && (Static568.anInt9800 == local1545 || Static328.method5138(local1978.aString35) == local19.anInt6648)) {
													local1887 = local1978.aClass325_1.method7783(local19.anInt6666, Static110.aClass197_1, (Class275) null, 0, (Class351[]) null, local19.anInt6728, Static677.aClass137_47, Static63.aClass37_1, Static501.aClass191_2, -1, local1991, 2048, 0, Static595.aClass241_1, Static372.aClass154_2, (int[]) null, Static175.aClass247_2, 0, local19.anInt6723);
												}
											}
										} else if (local19.anInt6680 == 8 || local19.anInt6680 == 9) {
											@Pc(2117) Class14_Sub50 local2117 = Static250.method3683(local19.anInt6674, false);
											local1920 = local19.anInt6637 == -1 ? null : Static501.aClass191_2.method4322(local19.anInt6637);
											if (local2117 != null) {
												local1928 = local19.aBoolean471 ? Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 : null;
												local1887 = local2117.method7852(local1920, Static677.aClass137_47, local1928, local19.anInt6723, local19.anInt6648, local19.anInt6680 == 9, local19.anInt6666, local19.anInt6728);
											}
										} else if (local19.anInt6637 == -1) {
											local1887 = local19.method5473((Class275) null, 0, Static595.aClass241_1, Static677.aClass137_47, Static372.aClass154_2, Static110.aClass197_1, -1, Static501.aClass191_2, local1025, -1, Static175.aClass247_2, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1, Static63.aClass37_1, 2048);
											if (local1887 == null && Static634.aBoolean731) {
												Static634.method8860(local19);
											}
										} else {
											@Pc(2052) Class275 local2052 = Static501.aClass191_2.method4322(local19.anInt6637);
											local1887 = local19.method5473(local2052, local19.anInt6723, Static595.aClass241_1, Static677.aClass137_47, Static372.aClass154_2, Static110.aClass197_1, local19.anInt6728, Static501.aClass191_2, local1025, local19.anInt6666, Static175.aClass247_2, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1, Static63.aClass37_1, 2048);
											if (local1887 == null && Static634.aBoolean731) {
												Static634.method8860(local19);
											}
										}
										if (local1887 != null) {
											if (local19.anInt6677 <= 0) {
												local1545 = 512;
											} else {
												local1545 = (local19.anInt6703 << 9) / local19.anInt6677;
											}
											if (local19.anInt6691 <= 0) {
												local672 = 512;
											} else {
												local672 = (local19.anInt6701 << 9) / local19.anInt6691;
											}
											local674 = local19.anInt6703 / 2 + local117;
											local683 = local123 + local19.anInt6701 / 2;
											if (!local19.aBoolean483) {
												local674 += local19.anInt6652 * local1545 >> 9;
												local683 += local672 * local19.anInt6657 >> 9;
											}
											Static551.aClass26_7.method6459();
											Static677.aClass137_47.method7950(Static551.aClass26_7);
											Static677.aClass137_47.DA(local674, local683, local1545, local672);
											Static677.aClass137_47.ya();
											if (local19.aBoolean480) {
												Static677.aClass137_47.C(false);
											}
											if (local19.aBoolean483) {
												Static491.aClass26_12.method6460(local19.anInt6640);
												Static491.aClass26_12.method6449(local19.anInt6685);
												Static491.aClass26_12.method6446(local19.anInt6659);
												Static491.aClass26_12.method6443(local19.anInt6652, local19.anInt6657, local19.anInt6696);
											} else {
												local780 = (local19.anInt6710 << 2) * Class32.anIntArray76[local19.anInt6640 << 3] >> 14;
												local782 = Class32.anIntArray77[local19.anInt6640 << 3] * (local19.anInt6710 << 2) >> 14;
												Static491.aClass26_12.method6450(-local19.anInt6659 << 3);
												Static491.aClass26_12.method6449(local19.anInt6685 << 3);
												Static491.aClass26_12.method6443(local19.anInt6695 << 2, (local19.anInt6655 << 2) + local780 + local638, local782 - -(local19.anInt6655 << 2));
												Static491.aClass26_12.method6458(local19.anInt6640 << 3);
											}
											local19.method5466(Static491.aClass26_12, Static677.aClass137_47, Static87.anInt1951, local1887);
											if (Static436.aBoolean533) {
												Static677.aClass137_47.T(local117, local123, local19.anInt6703 + local117, local123 + local19.anInt6701);
											}
											if (local19.aBoolean483) {
												if (local19.aBoolean469) {
													local1887.method6375(Static491.aClass26_12, (Class12_Sub1) null, local19.anInt6710, 1);
												} else {
													local1887.method6391(Static491.aClass26_12, (Class12_Sub1) null, 1);
													if (local19.aClass12_Sub4_5 != null) {
														Static677.aClass137_47.method7917(local19.aClass12_Sub4_5.method1619());
													}
												}
											} else if (local19.aBoolean469) {
												local1887.method6375(Static491.aClass26_12, (Class12_Sub1) null, local19.anInt6710 << 2, 1);
											} else {
												local1887.method6391(Static491.aClass26_12, (Class12_Sub1) null, 1);
												if (local19.aClass12_Sub4_5 != null) {
													Static677.aClass137_47.method7917(local19.aClass12_Sub4_5.method1619());
												}
											}
											if (Static436.aBoolean533) {
												Static677.aClass137_47.KA(arg9, arg8, arg0, arg2);
											}
											if (local19.aBoolean480) {
												Static677.aClass137_47.C(true);
											}
										}
										if (Static128.aBoolean202) {
											if (arg7) {
												Static357.method5407(local44, local50, local64, local57);
											} else {
												Static152.method2446(local44, local64, local50, local57);
											}
										}
									} else if (local19.anInt6660 == 9) {
										if (local19.aBoolean470) {
											local1545 = local123;
											local638 = local117 + local19.anInt6703;
											local293 = local19.anInt6701 + local123;
										} else {
											local1545 = local123 + local19.anInt6701;
											local638 = local117 + local19.anInt6703;
											local293 = local123;
										}
										if (local19.anInt6650 == 1) {
											Static677.aClass137_47.method7907(local117, local293, local638, local1545, local19.anInt6713, 0);
										} else {
											Static677.aClass137_47.method7892(local117, local293, local638, local1545, local19.anInt6713, local19.anInt6650);
										}
										if (Static128.aBoolean202) {
											if (arg7) {
												Static357.method5407(local44, local50, local64, local57);
											} else {
												Static152.method2446(local44, local64, local50, local57);
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

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	public static void method6875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static432.method6337(local7.aClass12_Sub2_Sub4_1);
			if (local7.aClass12_Sub2_Sub4_1 != null) {
				local7.aClass12_Sub2_Sub4_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!vn;)V")
	public static void method6876(@OriginalArg(1) Class12_Sub2_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class12_Sub2_Sub2_Sub1_Sub1) {
			@Pc(32) Class12_Sub2_Sub2_Sub1_Sub1 local32 = (Class12_Sub2_Sub2_Sub1_Sub1) arg0;
			if (local32.aClass283_1 == null) {
				return;
			}
			Static571.method8197(local32, local32.aByte146 != Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146);
		} else if (arg0 instanceof Class12_Sub2_Sub2_Sub1_Sub2) {
			@Pc(17) Class12_Sub2_Sub2_Sub1_Sub2 local17 = (Class12_Sub2_Sub2_Sub1_Sub2) arg0;
			Static47.method969(local17.aByte146 != Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146, local17);
			return;
		}
	}
}
