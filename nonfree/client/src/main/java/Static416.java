import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
	public static int anInt7349;

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "F")
	public static float aFloat143;

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "[I")
	public static int[] anIntArray418 = new int[2];

	@OriginalMember(owner = "client!oea", name = "d", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
	public static int anInt7351 = 0;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIII[Lclient!uaa;IIZI)V")
	public static void method6170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class345[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		Static208.aClass65_7.KA(arg3, arg6, arg9, arg7);
		for (@Pc(17) int local17 = 0; local17 < arg5.length; local17++) {
			@Pc(23) Class345 local23 = arg5[local17];
			if (local23 != null && (arg4 == local23.anInt9657 || arg4 == -1412584499 && local23 == Static383.aClass345_10)) {
				@Pc(46) int local46 = arg2 + local23.anInt9651;
				@Pc(51) int local51 = arg0 + local23.anInt9588;
				@Pc(58) int local58 = local23.anInt9649 + local46 + 1;
				@Pc(66) int local66 = local51 + local23.anInt9606 + 1;
				@Pc(72) int local72;
				if (arg1 == -1) {
					Class12_Sub8.aRectangleArray1[Static168.anInt3361].setBounds(local23.anInt9651 + arg2, arg0 + local23.anInt9588, local23.anInt9649, local23.anInt9606);
					local72 = Static168.anInt3361++;
				} else {
					local72 = arg1;
				}
				local23.anInt9643 = local72;
				local23.anInt9579 = Static26.anInt350;
				if (!Static84.method1816(local23)) {
					if (local23.anInt9644 != 0) {
						Static8.method120(local23);
					}
					@Pc(116) int local116 = local23.anInt9651 + arg2;
					@Pc(121) int local121 = arg0 + local23.anInt9588;
					@Pc(123) int local123 = 0;
					@Pc(125) int local125 = 0;
					if (Static66.aBoolean570) {
						local123 = Static106.method2037();
						local125 = Static660.method8815();
					}
					@Pc(136) int local136 = local23.anInt9627;
					if (Static202.aBoolean307 && (Static84.method1822(local23).anInt507 != 0 || local23.anInt9591 == 0) && local136 > 127) {
						local136 = 127;
					}
					@Pc(193) int local193;
					@Pc(199) int local199;
					if (local23 == Static383.aClass345_10) {
						if (arg4 != -1412584499 && (Static613.anInt10014 == local23.anInt9665 || local23.anInt9665 == Static225.anInt4138)) {
							Static550.anInt9004 = arg0;
							Static626.aClass345Array2 = arg5;
							Static604.anInt9933 = arg2;
							continue;
						}
						if (Static511.aBoolean731 && Static134.aBoolean183) {
							local193 = Static359.aClass11_1.method6141() + local123;
							local199 = local125 + Static359.aClass11_1.method6144();
							local199 -= Static316.anInt5982;
							local193 -= Static637.anInt10351;
							if (local193 < Static401.anInt7135) {
								local193 = Static401.anInt7135;
							}
							if (local199 < Static216.anInt4043) {
								local199 = Static216.anInt4043;
							}
							if (Static303.aClass345_8.anInt9649 + Static401.anInt7135 < local23.anInt9649 + local193) {
								local193 = Static303.aClass345_8.anInt9649 + Static401.anInt7135 - local23.anInt9649;
							}
							if (local23.anInt9606 + local199 > Static216.anInt4043 + Static303.aClass345_8.anInt9606) {
								local199 = Static303.aClass345_8.anInt9606 + Static216.anInt4043 - local23.anInt9606;
							}
							local116 = local193;
							local121 = local199;
						}
						if (local23.anInt9665 == Static225.anInt4138) {
							local136 = 128;
						}
					}
					@Pc(289) int local289;
					@Pc(285) int local285;
					@Pc(296) int local296;
					@Pc(301) int local301;
					if (local23.anInt9591 == 2) {
						local193 = arg3;
						local285 = arg7;
						local199 = arg6;
						local289 = arg9;
					} else {
						local296 = local116 + local23.anInt9649;
						local301 = local121 + local23.anInt9606;
						local193 = arg3 >= local116 ? arg3 : local116;
						if (local23.anInt9591 == 9) {
							local301++;
							local296++;
						}
						local199 = arg6 >= local121 ? arg6 : local121;
						local289 = local296 < arg9 ? local296 : arg9;
						local285 = local301 < arg7 ? local301 : arg7;
					}
					if (local193 < local289 && local285 > local199) {
						@Pc(641) int local641;
						@Pc(685) int local685;
						@Pc(783) int local783;
						@Pc(785) int local785;
						@Pc(672) int local672;
						@Pc(674) int local674;
						if (local23.anInt9644 != 0) {
							if (Static299.anInt5765 == local23.anInt9644 || local23.anInt9644 == Static243.anInt4490) {
								Static125.method2266(local121, local116, local23);
								if (!Static66.aBoolean570) {
									Static415.method6169(local23.anInt9606, Static243.anInt4490 == local23.anInt9644, local121, local23.anInt9649, local116);
									Static208.aClass65_7.KA(arg3, arg6, arg9, arg7);
								}
								Static57.aBooleanArray2[local72] = true;
								continue;
							}
							if (local23.anInt9644 == Static20.anInt300) {
								if (local23.method8063(Static208.aClass65_7) != null) {
									Static250.method3863();
									Static33.method487(local121, Static208.aClass65_7, local116, local23);
									Static208.aBooleanArray18[local72] = true;
									Static208.aClass65_7.KA(arg3, arg6, arg9, arg7);
									if (Static66.aBoolean570) {
										if (arg8) {
											Static520.method7366(local46, local66, local51, local58);
										} else {
											Static13.method7331(local51, local58, local66, local46);
										}
									}
								}
								continue;
							}
							if (Static529.anInt9064 == local23.anInt9644) {
								Static259.method4058(local116, Static208.aClass65_7, local23, local121);
								continue;
							}
							if (Static556.anInt9093 == local23.anInt9644) {
								Static516.method7315(local23, local116, local121, local23.anInt9655 % 64, Static208.aClass65_7);
								continue;
							}
							if (local23.anInt9644 == Static387.anInt6923) {
								if (local23.method8063(Static208.aClass65_7) != null) {
									Static615.method8390(local116, local121, local23);
									Static208.aBooleanArray18[local72] = true;
									Static208.aClass65_7.KA(arg3, arg6, arg9, arg7);
									if (Static66.aBoolean570) {
										if (arg8) {
											Static520.method7366(local46, local66, local51, local58);
										} else {
											Static13.method7331(local51, local58, local66, local46);
										}
									}
								}
								continue;
							}
							if (local23.anInt9644 == Static207.anInt3884) {
								Static676.method9027(local116, local23.anInt9649, Static476.anInterface4_10, Static208.aClass65_7, local121, local23.anInt9606);
								Static57.aBooleanArray2[local72] = true;
								Static208.aClass65_7.KA(arg3, arg6, arg9, arg7);
								continue;
							}
							if (local23.anInt9644 == Static290.anInt5660) {
								Static598.method8188(local23.anInt9649, local116, local121, Static208.aClass65_7, local23.anInt9606);
								Static57.aBooleanArray2[local72] = true;
								Static208.aClass65_7.KA(arg3, arg6, arg9, arg7);
								continue;
							}
							if (local23.anInt9644 == Static374.anInt6721) {
								if (!Static198.aBoolean709 && !Static323.aBoolean536) {
									continue;
								}
								local296 = local116 + local23.anInt9649;
								local301 = local121 + 15;
								if (Static66.aBoolean570) {
									if (arg8) {
										Static520.method7366(local46, local66, local51, local58);
									} else {
										Static13.method7331(local51, local58, local66, local46);
									}
								}
								if (Static198.aBoolean709) {
									local641 = -256;
									if (Static457.anInt7750 < 20) {
										local641 = -65536;
									}
									Static604.aClass73_15.method5776(-1, local301, local296, "Fps:" + Static457.anInt7750, local641);
									local301 += 15;
									@Pc(663) Runtime local663 = Runtime.getRuntime();
									local672 = (int) ((local663.totalMemory() - local663.freeMemory()) / 1024L);
									local674 = -256;
									if (local672 > 98304) {
										if (Static266.aBoolean417) {
											Static15.method207();
											for (local685 = 0; local685 < 10; local685++) {
												System.gc();
											}
											local672 = (int) ((local663.totalMemory() - local663.freeMemory()) / 1024L);
											if (local672 > 65536) {
												Static491.method7052("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local674 = -65536;
									}
									Static604.aClass73_15.method5776(-1, local301, local296, "Mem:" + local672 + "k", local674);
									local301 += 15;
									Static604.aClass73_15.method5776(-1, local301, local296, "In:" + Static546.anInt8977 + "B/s Out:" + Static248.anInt4555 + "B/s", -256);
									local301 += 15;
									local685 = Static208.aClass65_7.E() / 1024;
									Static604.aClass73_15.method5776(-1, local301, local296, "Offheap:" + local685 + "k", local685 > 65536 ? -65536 : -256);
									local301 += 15;
									local783 = 0;
									local785 = 0;
									@Pc(787) int local787 = 0;
									for (@Pc(789) int local789 = 0; local789 < 37; local789++) {
										if (Static609.aClass210_Sub1Array2[local789] != null) {
											local783 += Static609.aClass210_Sub1Array2[local789].method5151();
											local785 += Static609.aClass210_Sub1Array2[local789].method5152();
											local787 += Static609.aClass210_Sub1Array2[local789].method5147();
										}
									}
									@Pc(831) int local831 = local787 * 100 / local783;
									@Pc(837) int local837 = local785 * 10000 / local783;
									@Pc(857) String local857 = "Cache:" + Static396.method5827(2, 0, true, (long) local837) + "% (" + local831 + "%)";
									Static431.aClass73_10.method5776(-1, local301, local296, local857, -256);
									local301 += 12;
								}
								if (Static23.anInt331 > 0) {
									Static431.aClass73_10.method5776(-1, local301, local296, "Particles: " + Static250.anInt4568 + " / " + Static23.anInt331, -256);
								}
								local301 += 12;
								if (Static323.aBoolean536) {
									Static431.aClass73_10.method5776(-1, local301, local296, "Polys: " + Static208.aClass65_7.I() + " Models: " + Static208.aClass65_7.M(), -256);
									local301 += 12;
									Static431.aClass73_10.method5776(-1, local301, local296, "Ls: " + Static71.anInt9542 + " La: " + Static77.anInt1100 + " NPC: " + Static127.anInt2598 + " Pl: " + Static425.anInt7483, -256);
									local301 += 12;
									Static106.method2039();
								}
								Static57.aBooleanArray2[local72] = true;
								continue;
							}
						}
						@Pc(1027) Class5_Sub39 local1027;
						if (local23.anInt9591 == 0) {
							if (local23.anInt9644 == Static668.anInt10703 && Static208.aClass65_7.method6934()) {
								Static208.aClass65_7.method6902(local116, local121, local23.anInt9649, local23.anInt9606);
							}
							method6170(local121 - local23.anInt9577, local72, local116 - local23.anInt9583, local193, local23.anInt9664, arg5, local199, local285, arg8, local289);
							if (local23.aClass345Array1 != null) {
								method6170(local121 - local23.anInt9577, local72, local116 - local23.anInt9583, local193, local23.anInt9664, local23.aClass345Array1, local199, local285, arg8, local289);
							}
							local1027 = (Class5_Sub39) Static452.aClass300_33.method7188((long) local23.anInt9664);
							if (local1027 != null) {
								Static597.method8166(local285, local1027.anInt6238, local116, local121, local72, local289, local193, local199);
							}
							if (Static668.anInt10703 == local23.anInt9644 && Static208.aClass65_7.method6934()) {
								Static208.aClass65_7.method6940();
							}
							Static208.aClass65_7.KA(arg3, arg6, arg9, arg7);
						}
						if (Static19.aBooleanArray1[local72] || Static332.anInt6133 > 1) {
							if (local23.anInt9591 == 3) {
								if (local136 == 0) {
									if (local23.aBoolean824) {
										Static208.aClass65_7.aa(local116, local121, local23.anInt9649, local23.anInt9606, local23.anInt9655, 0);
									} else {
										Static208.aClass65_7.method6895(local116, local121, local23.anInt9649, local23.anInt9606, local23.anInt9655, 0);
									}
								} else if (local23.aBoolean824) {
									Static208.aClass65_7.aa(local116, local121, local23.anInt9649, local23.anInt9606, 255 - (local136 & 0xFF) << 24 | local23.anInt9655 & 0xFFFFFF, 1);
								} else {
									Static208.aClass65_7.method6895(local116, local121, local23.anInt9649, local23.anInt9606, 255 - (local136 & 0xFF) << 24 | local23.anInt9655 & 0xFFFFFF, 1);
								}
								if (Static66.aBoolean570) {
									if (arg8) {
										Static520.method7366(local46, local66, local51, local58);
									} else {
										Static13.method7331(local51, local58, local66, local46);
									}
								}
							} else {
								@Pc(1204) Class238 local1204;
								if (local23.anInt9591 == 4) {
									@Pc(1179) Class73 local1179 = local23.method8078(Static208.aClass65_7);
									if (local1179 != null) {
										local301 = local23.anInt9655;
										@Pc(1194) String local1194 = local23.aString95;
										if (local23.anInt9654 != -1) {
											local1204 = Static110.aClass105_1.method2659(local23.anInt9654);
											local1194 = local1204.aString57;
											if (local1194 == null) {
												local1194 = "null";
											}
											if ((local1204.anInt6890 == 1 || local23.anInt9585 != 1) && local23.anInt9585 != -1) {
												local1194 = "<col=ff9040>" + local1194 + "</col> x" + Static222.method3492(local23.anInt9585);
											}
										}
										if (local23.anInt9617 != -1) {
											local1194 = Static614.method8348(local23.anInt9617);
											if (local1194 == null) {
												local1194 = "";
											}
										}
										if (local23 == Static244.aClass345_7) {
											local1194 = Static64.aClass52_31.method907(Static544.anInt8937);
											local301 = local23.anInt9655;
										}
										if (Static547.aBoolean764) {
											Static208.aClass65_7.T(local116, local121, local116 + local23.anInt9649, local23.anInt9606 + local121);
										}
										local1179.method5787(local1194, 0, Static366.aClass50Array9, local23.anInt9628, local23.anInt9598, local23.anInt9638, local23.anInt9637, (Class1) null, 0, 255 - (local136 & 0xFF) << 24 | local301, local23.anInt9649, local116, local23.aBoolean818 ? 255 - (local136 & 0xFF) << 24 : -1, (int[]) null, local23.anInt9606, local121);
										if (Static547.aBoolean764) {
											Static208.aClass65_7.KA(arg3, arg6, arg9, arg7);
										}
										if (local1194.trim().length() > 0) {
											if (!Static547.aBoolean764) {
												@Pc(1371) Class247 local1371 = Static483.method6868(local23.anInt9616, Static208.aClass65_7);
												local672 = local1371.method5769(local1194, Static366.aClass50Array9, local23.anInt9649);
												local674 = local1371.method5763(local1194, Static366.aClass50Array9, local23.anInt9649, local23.anInt9637);
												if (Static66.aBoolean570) {
													if (arg8) {
														Static520.method7366(local116, local674 + local121, local121, local116 + local672);
													} else {
														Static13.method7331(local121, local116 + local672, local121 + local674, local116);
													}
												}
											} else if (Static66.aBoolean570) {
												if (arg8) {
													Static520.method7366(local46, local66, local51, local58);
												} else {
													Static13.method7331(local51, local58, local66, local46);
												}
											}
										}
									} else if (Static204.aBoolean316) {
										Static211.method3351(local23);
									}
								} else {
									@Pc(1536) int local1536;
									if (local23.anInt9591 == 5) {
										if (local23.anInt9595 >= 0) {
											local23.method8074(Static62.aClass393_1, Static230.aClass122_1).method283(0, Static208.aClass65_7, local23.anInt9635 << 3, local121, local116, local23.anInt9606, local23.anInt9649, 0, local23.anInt9640 << 3);
										} else {
											@Pc(1487) Class50 local1487;
											if (local23.anInt9654 != -1) {
												@Pc(1467) Class213 local1467 = local23.aBoolean817 ? Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 : null;
												local1487 = Static110.aClass105_1.method2658(local23.anInt9612 | 0xFF000000, local23.anInt9654, local23.anInt9652, Static208.aClass65_7, local23.anInt9585, local23.anInt9613, local1467);
											} else if (local23.anInt9617 == -1) {
												local1487 = local23.method8080(Static208.aClass65_7);
											} else {
												local1487 = Static22.method287(Static208.aClass65_7, local23.anInt9617);
											}
											if (local1487 != null) {
												local301 = local1487.method6003();
												local641 = local1487.method6010();
												local1536 = (local23.anInt9655 == 0 ? 16777215 : local23.anInt9655 & 0xFFFFFF) | 255 - (local136 & 0xFF) << 24;
												if (local23.aBoolean814) {
													Static208.aClass65_7.T(local116, local121, local23.anInt9649 + local116, local23.anInt9606 + local121);
													if (local23.anInt9629 != 0) {
														local672 = (local301 + local23.anInt9649 - 1) / local301;
														local674 = (local641 + local23.anInt9606 - 1) / local641;
														for (local685 = 0; local685 < local672; local685++) {
															for (local783 = 0; local783 < local674; local783++) {
																if (local23.anInt9655 == 0) {
																	local1487.method5988((float) (local685 * local301 + local116) + (float) local301 / 2.0F, (float) (local641 * local783 + local121) + (float) local641 / 2.0F, 4096, local23.anInt9629);
																} else {
																	local1487.method5993((float) local301 / 2.0F + (float) (local685 * local301 + local116), (float) local641 / 2.0F + (float) (local121 + local641 * local783), 4096, local23.anInt9629, local1536);
																}
															}
														}
													} else if (local23.anInt9655 == 0 && local136 == 0) {
														local1487.method5989(local116, local121, local23.anInt9649, local23.anInt9606);
													} else {
														local1487.method6005(local116, local121, local23.anInt9649, local23.anInt9606, 0, local1536, 1);
													}
													Static208.aClass65_7.KA(arg3, arg6, arg9, arg7);
												} else if (local23.anInt9655 == 0 && local136 == 0) {
													if (local23.anInt9629 != 0) {
														local1487.method5988((float) local23.anInt9649 / 2.0F + (float) local116, (float) local23.anInt9606 / 2.0F + (float) local121, local23.anInt9649 * 4096 / local301, local23.anInt9629);
													} else if (local301 == local23.anInt9649 && local641 == local23.anInt9606) {
														local1487.method5996(local116, local121);
													} else {
														local1487.method6008(local116, local121, local23.anInt9649, local23.anInt9606);
													}
												} else if (local23.anInt9629 != 0) {
													local1487.method5993((float) local23.anInt9649 / 2.0F + (float) local116, (float) local23.anInt9606 / 2.0F + (float) local121, local23.anInt9649 * 4096 / local301, local23.anInt9629, local1536);
												} else if (local301 == local23.anInt9649 && local641 == local23.anInt9606) {
													local1487.method5987(local116, local121, 0, local1536, 1);
												} else {
													local1487.method5991(local116, local121, local23.anInt9649, local23.anInt9606, 0, local1536, 1);
												}
											} else if (Static204.aBoolean316) {
												Static211.method3351(local23);
											}
										}
										if (Static66.aBoolean570) {
											if (arg8) {
												Static520.method7366(local46, local66, local51, local58);
											} else {
												Static13.method7331(local51, local58, local66, local46);
											}
										}
									} else if (local23.anInt9591 == 6) {
										Static593.method8133();
										local1027 = null;
										@Pc(1873) Class153 local1873 = null;
										local641 = 0;
										@Pc(1978) Class175 local1978;
										@Pc(1988) Class213 local1988;
										if (local23.anInt9654 != -1) {
											local1204 = Static110.aClass105_1.method2659(local23.anInt9654);
											if (local1204 != null) {
												local1204 = local1204.method5695(local23.anInt9585);
												local1978 = local23.anInt9601 == -1 ? null : Static591.aClass66_2.method1768(local23.anInt9601);
												local1988 = local23.aBoolean817 ? Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 : null;
												local1873 = local1204.method5700(Static208.aClass65_7, local23.anInt9604, 1, local23.anInt9646, local23.anInt9658, 2048, local1988, local1978);
												if (local1873 == null) {
													Static211.method3351(local23);
												} else {
													local641 = -local1873.fa() >> 1;
												}
											}
										} else if (local23.anInt9656 == 5) {
											local1536 = local23.anInt9624;
											if (local1536 >= 0 && local1536 < 2048) {
												@Pc(2027) Class28_Sub1_Sub4_Sub2_Sub2 local2027 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local1536];
												@Pc(2040) Class175 local2040 = local23.anInt9601 == -1 ? null : Static591.aClass66_2.method1768(local23.anInt9601);
												if (local2027 != null && (local1536 == Static216.anInt4046 || Static300.method8586(local2027.aString45) == local23.anInt9602)) {
													local1873 = local2027.aClass213_1.method5203((Class175) null, local23.anInt9658, (int[]) null, local2040, Static231.aClass19_2, local23.anInt9646, Static208.aClass65_7, Static161.aClass237_3, Static619.aClass94_2, 2048, -1, (Class321[]) null, Static110.aClass105_1, 0, Static299.aClass286_2, local23.anInt9604, 0, 0, Static591.aClass66_2);
												}
											}
										} else if (local23.anInt9656 == 8 || local23.anInt9656 == 9) {
											@Pc(1966) Class5_Sub43 local1966 = Static10.method153(local23.anInt9624, false);
											local1978 = local23.anInt9601 == -1 ? null : Static591.aClass66_2.method1768(local23.anInt9601);
											if (local1966 != null) {
												local1988 = local23.aBoolean817 ? Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1 : null;
												local1873 = local1966.method5979(local23.anInt9602, local1978, local23.anInt9646, local23.anInt9604, local23.anInt9656 == 9, local23.anInt9658, local1988, Static208.aClass65_7);
											}
										} else if (local23.anInt9601 == -1) {
											local1873 = local23.method8067(Static299.aClass286_2, Static110.aClass105_1, Static231.aClass19_2, -1, (Class175) null, Static591.aClass66_2, -1, Static161.aClass237_3, Static619.aClass94_2, Static208.aClass65_7, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1, 0, local1027, 2048);
											if (local1873 == null && Static204.aBoolean316) {
												Static211.method3351(local23);
											}
										} else {
											@Pc(1901) Class175 local1901 = Static591.aClass66_2.method1768(local23.anInt9601);
											local1873 = local23.method8067(Static299.aClass286_2, Static110.aClass105_1, Static231.aClass19_2, local23.anInt9646, local1901, Static591.aClass66_2, local23.anInt9604, Static161.aClass237_3, Static619.aClass94_2, Static208.aClass65_7, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aClass213_1, local23.anInt9658, local1027, 2048);
											if (local1873 == null && Static204.aBoolean316) {
												Static211.method3351(local23);
											}
										}
										if (local1873 != null) {
											if (local23.anInt9634 <= 0) {
												local1536 = 512;
											} else {
												local1536 = (local23.anInt9649 << 9) / local23.anInt9634;
											}
											if (local23.anInt9599 <= 0) {
												local672 = 512;
											} else {
												local672 = (local23.anInt9606 << 9) / local23.anInt9599;
											}
											local674 = local116 + local23.anInt9649 / 2;
											local685 = local121 + local23.anInt9606 / 2;
											if (!local23.aBoolean811) {
												local674 += local23.anInt9603 * local1536 >> 9;
												local685 += local672 * local23.anInt9642 >> 9;
											}
											Static546.aClass254_8.method7357();
											Static208.aClass65_7.method6891(Static546.aClass254_8);
											Static208.aClass65_7.DA(local674, local685, local1536, local672);
											Static208.aClass65_7.ya();
											if (local23.aBoolean819) {
												Static208.aClass65_7.C(false);
											}
											if (local23.aBoolean811) {
												Static109.aClass254_2.method7354(local23.anInt9662);
												Static109.aClass254_2.method7350(local23.anInt9623);
												Static109.aClass254_2.method7347(local23.anInt9633);
												Static109.aClass254_2.method7358(local23.anInt9603, local23.anInt9642, local23.anInt9584);
											} else {
												local783 = (local23.anInt9663 << 2) * Class200.anIntArray337[local23.anInt9662 << 3] >> 14;
												local785 = Class200.anIntArray338[local23.anInt9662 << 3] * (local23.anInt9663 << 2) >> 14;
												Static109.aClass254_2.method7363(-local23.anInt9633 << 3);
												Static109.aClass254_2.method7350(local23.anInt9623 << 3);
												Static109.aClass254_2.method7358(local23.anInt9581 << 2, local641 + (local23.anInt9667 << 2) + local783, (local23.anInt9667 << 2) + local785);
												Static109.aClass254_2.method7352(local23.anInt9662 << 3);
											}
											local23.method8082(local1873, Static26.anInt350, Static109.aClass254_2, Static208.aClass65_7);
											if (Static547.aBoolean764) {
												Static208.aClass65_7.T(local116, local121, local116 + local23.anInt9649, local23.anInt9606 + local121);
											}
											if (local23.aBoolean811) {
												if (local23.aBoolean822) {
													local1873.method8594(Static109.aClass254_2, (Class28_Sub9) null, local23.anInt9663, 1);
												} else {
													local1873.method8585(Static109.aClass254_2, (Class28_Sub9) null, 1);
													if (local23.aClass28_Sub5_7 != null) {
														Static208.aClass65_7.method6899(local23.aClass28_Sub5_7.method5850());
													}
												}
											} else if (local23.aBoolean822) {
												local1873.method8594(Static109.aClass254_2, (Class28_Sub9) null, local23.anInt9663 << 2, 1);
											} else {
												local1873.method8585(Static109.aClass254_2, (Class28_Sub9) null, 1);
												if (local23.aClass28_Sub5_7 != null) {
													Static208.aClass65_7.method6899(local23.aClass28_Sub5_7.method5850());
												}
											}
											if (Static547.aBoolean764) {
												Static208.aClass65_7.KA(arg3, arg6, arg9, arg7);
											}
											if (local23.aBoolean819) {
												Static208.aClass65_7.C(true);
											}
										}
										if (Static66.aBoolean570) {
											if (arg8) {
												Static520.method7366(local46, local66, local51, local58);
											} else {
												Static13.method7331(local51, local58, local66, local46);
											}
										}
									} else if (local23.anInt9591 == 9) {
										if (local23.aBoolean823) {
											local641 = local116 + local23.anInt9649;
											local301 = local121 + local23.anInt9606;
											local1536 = local121;
										} else {
											local641 = local23.anInt9649 + local116;
											local1536 = local121 + local23.anInt9606;
											local301 = local121;
										}
										if (local23.anInt9632 == 1) {
											Static208.aClass65_7.method6932(local116, local301, local641, local1536, local23.anInt9655, 0);
										} else {
											Static208.aClass65_7.method6924(local116, local301, local641, local1536, local23.anInt9655, local23.anInt9632);
										}
										if (Static66.aBoolean570) {
											if (arg8) {
												Static520.method7366(local46, local66, local51, local58);
											} else {
												Static13.method7331(local51, local58, local66, local46);
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
