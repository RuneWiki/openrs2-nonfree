import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!st", name = "m", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_122 = new Class254(7, 0);

	@OriginalMember(owner = "client!st", name = "B", descriptor = "[I")
	public static final int[] anIntArray500 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([Lclient!tn;IIIIIIIII)V")
	public static void method5280(@OriginalArg(0) Class229[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(24) Class229 local24 = arg0[local18];
			if (local24 != null && (arg3 == local24.anInt6882 || arg3 == -1412584499 && local24 == Static206.aClass229_6)) {
				@Pc(48) int local48;
				if (arg5 == -1) {
					Class1_Sub31.aRectangleArray2[Static346.anInt6355].setBounds(local24.anInt6864 + arg6, local24.anInt6896 - -arg1, local24.anInt6905, local24.anInt6895);
					local48 = Static346.anInt6355++;
				} else {
					local48 = arg5;
				}
				local24.anInt6930 = Static123.anInt2333;
				local24.anInt6938 = local48;
				if (!Static51.method740(local24)) {
					if (local24.anInt6893 != 0) {
						Static160.method5111(local24);
					}
					@Pc(93) int local93 = arg6 + local24.anInt6864;
					@Pc(98) int local98 = arg1 + local24.anInt6896;
					@Pc(101) int local101 = local24.anInt6932;
					if (Static424.aBoolean633 && (Static51.method751(local24).anInt1143 != 0 || local24.anInt6863 == 0) && local101 > 127) {
						local101 = 127;
					}
					@Pc(159) int local159;
					@Pc(165) int local165;
					if (local24 == Static206.aClass229_6) {
						if (arg3 != -1412584499 && (local24.anInt6902 == Static427.anInt7219 || local24.anInt6902 == Static298.anInt4990)) {
							Static380.anInt6830 = arg6;
							Static15.anInt286 = arg1;
							Static361.aClass229Array1 = arg0;
							continue;
						}
						if (Static280.aBoolean374 && Static196.aBoolean280) {
							local159 = Static38.aClass32_1.method3517();
							local165 = Static38.aClass32_1.method3524();
							local159 -= Static255.anInt4375;
							local165 -= Static367.anInt6677;
							if (local159 < Static283.anInt4756) {
								local159 = Static283.anInt4756;
							}
							if (Static283.anInt4756 + Static196.aClass229_5.anInt6905 < local159 + local24.anInt6905) {
								local159 = Static283.anInt4756 + Static196.aClass229_5.anInt6905 - local24.anInt6905;
							}
							if (local165 < Static296.anInt4967) {
								local165 = Static296.anInt4967;
							}
							local93 = local159;
							if (local24.anInt6895 + local165 > Static296.anInt4967 - -Static196.aClass229_5.anInt6895) {
								local165 = Static296.anInt4967 + Static196.aClass229_5.anInt6895 - local24.anInt6895;
							}
							local98 = local165;
						}
						if (local24.anInt6902 == Static298.anInt4990) {
							local101 = 128;
						}
					}
					@Pc(257) int local257;
					@Pc(261) int local261;
					@Pc(270) int local270;
					@Pc(275) int local275;
					if (local24.anInt6863 == 2) {
						local257 = arg8;
						local165 = arg7;
						local261 = arg2;
						local159 = arg4;
					} else {
						local270 = local24.anInt6905 + local93;
						local275 = local24.anInt6895 + local98;
						local159 = local93 > arg4 ? local93 : arg4;
						local165 = local98 > arg7 ? local98 : arg7;
						if (local24.anInt6863 == 9) {
							local275++;
							local270++;
						}
						local261 = arg2 > local275 ? local275 : arg2;
						local257 = arg8 > local270 ? local270 : arg8;
					}
					if (local159 < local257 && local165 < local261) {
						@Pc(599) int local599;
						@Pc(625) int local625;
						@Pc(627) int local627;
						@Pc(545) int local545;
						@Pc(547) int local547;
						if (local24.anInt6893 != 0) {
							if (local24.anInt6893 == Static67.anInt1218 || local24.anInt6893 == Static388.anInt7308) {
								Static453.method2832(Static388.anInt7308 == local24.anInt6893, local93, local24.anInt6905, local98, local24.anInt6895);
								Static204.aBooleanArray15[local48] = true;
								Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
								continue;
							}
							if (local24.anInt6893 == Static165.anInt4807) {
								if (local24.method5378(Static447.aClass121_11) != null) {
									Static442.method5918();
									Static343.method4930(local24, local93, local98, Static447.aClass121_11);
									Static41.aBooleanArray2[local48] = true;
									Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
								}
								continue;
							}
							if (local24.anInt6893 == Static448.anInt7744) {
								if (local24.method5378(Static447.aClass121_11) != null) {
									Static173.method2757(local98, local24, local93);
									Static41.aBooleanArray2[local48] = true;
									Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
								}
								continue;
							}
							if (local24.anInt6893 == Static274.anInt4625) {
								Static100.method1622(Static447.aClass121_11, local24.anInt6895, Static80.anInterface5_18, local98, local24.anInt6905, local93);
								Static204.aBooleanArray15[local48] = true;
								Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
								continue;
							}
							if (local24.anInt6893 == Static204.anInt3636) {
								Static128.method2032(local24.anInt6905, Static447.aClass121_11, local24.anInt6895, local98, local93);
								Static204.aBooleanArray15[local48] = true;
								Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
								continue;
							}
							if (Static330.anInt6002 == local24.anInt6893) {
								if (!Static356.aBoolean529 && !Static358.aBoolean530) {
									continue;
								}
								local270 = local93 + local24.anInt6905;
								local275 = local98 + 15;
								if (Static356.aBoolean529) {
									Static199.aClass4_4.method5841(local275, local270, -256, "Fps:" + Static270.anInt2352);
									local275 += 15;
									@Pc(535) Runtime local535 = Runtime.getRuntime();
									local545 = (int) ((local535.totalMemory() - local535.freeMemory()) / 1024L);
									local547 = -256;
									if (local545 > 65536) {
										local547 = -65536;
									}
									Static199.aClass4_4.method5841(local275, local270, local547, "Mem:" + local545 + "k");
									local275 += 15;
									Static199.aClass4_4.method5841(local275, local270, -256, "In:" + Static238.anInt4206 + "B/s Out:" + Static70.anInt1286 + "B/s");
									local275 += 15;
									local599 = Static447.aClass121_11.FA() / 1024;
									Static199.aClass4_4.method5841(local275, local270, local599 <= 65536 ? -256 : -65536, "Offheap:" + local599 + "k");
									local275 += 15;
									local625 = 0;
									local627 = 0;
									@Pc(629) int local629 = 0;
									for (@Pc(631) int local631 = 0; local631 < 30; local631++) {
										local625 += Static171.aClass113_Sub1Array1[local631].method3797();
										local627 += Static171.aClass113_Sub1Array1[local631].method3790();
										local629 += Static171.aClass113_Sub1Array1[local631].method3794();
									}
									@Pc(671) int local671 = local629 * 100 / local625;
									@Pc(677) int local677 = local627 * 10000 / local625;
									@Pc(697) String local697 = "Cache:" + Static453.method2829(true, 2, (long) local677, 0) + "% (" + local671 + "%)";
									Static209.aClass4_6.method5841(local275, local270, -256, local697);
									local275 += 12;
								}
								if (Static361.anInt6591 > 0) {
									Static209.aClass4_6.method5841(local275, local270, -256, "Particles: " + Static53.anInt930 + " / " + Static361.anInt6591);
								}
								local275 += 12;
								if (Static358.aBoolean530) {
									Static209.aClass4_6.method5841(local275, local270, -256, "Polys: " + Static447.aClass121_11.xa() + " Models: " + Static447.aClass121_11.g());
									local275 += 12;
									Static209.aClass4_6.method5841(local275, local270, -256, "Ls: " + Static175.anInt5396 + " La: " + Static418.anInt7338 + " NPC: " + Static231.anInt4043 + " Pl: " + Static371.anInt6722);
									Static264.method3705();
									local275 += 12;
								}
								Static204.aBooleanArray15[local48] = true;
								continue;
							}
						}
						if (local24.anInt6863 == 0) {
							if (Static418.anInt7336 == local24.anInt6893 && Static447.aClass121_11.method4613()) {
								Static447.aClass121_11.method4606(local93, local98, local24.anInt6905, local24.anInt6895);
							}
							method5280(arg0, local98 - local24.anInt6871, local261, local24.anInt6923, local159, local48, local93 - local24.anInt6886, local165, local257);
							if (local24.aClass229Array2 != null) {
								method5280(local24.aClass229Array2, local98 - local24.anInt6871, local261, local24.anInt6923, local159, local48, local93 - local24.anInt6886, local165, local257);
							}
							@Pc(864) Class1_Sub38 local864 = (Class1_Sub38) Static81.aClass51_5.method930((long) local24.anInt6923);
							if (local864 != null) {
								Static42.method4170(local48, local159, local165, local261, local257, local864.anInt6527, local98, local93);
							}
							if (local24.anInt6893 == Static418.anInt7336 && Static447.aClass121_11.method4613()) {
								Static447.aClass121_11.method4570();
								Static81.aBoolean127 = true;
							}
							Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
						}
						if (Static105.aBooleanArray7[local48] || Static41.anInt661 > 1) {
							if (local24.anInt6863 == 3) {
								if (local101 == 0) {
									if (local24.aBoolean554) {
										Static447.aClass121_11.NA(local93, local98, local24.anInt6905, local24.anInt6895, local24.anInt6915, 0);
									} else {
										Static447.aClass121_11.method4639(local93, local98, local24.anInt6905, local24.anInt6895, local24.anInt6915, 0);
									}
								} else if (local24.aBoolean554) {
									Static447.aClass121_11.NA(local93, local98, local24.anInt6905, local24.anInt6895, local24.anInt6915 & 0xFFFFFF | 255 - (local101 & 0xFF) << 24, 1);
								} else {
									Static447.aClass121_11.method4639(local93, local98, local24.anInt6905, local24.anInt6895, 255 - (local101 & 0xFF) << 24 | local24.anInt6915 & 0xFFFFFF, 1);
								}
							} else if (local24.anInt6863 == 4) {
								@Pc(1001) Class4 local1001 = local24.method5377(Static447.aClass121_11);
								if (local1001 != null) {
									local275 = local24.anInt6915;
									@Pc(1016) String local1016 = local24.aString79;
									if (local24.anInt6918 != -1) {
										@Pc(1026) Class206 local1026 = Static388.aClass193_3.method4249(local24.anInt6918);
										local1016 = local1026.aString72;
										if (local1016 == null) {
											local1016 = "null";
										}
										if ((local1026.anInt6289 == 1 || local24.anInt6933 != 1) && local24.anInt6933 != -1) {
											local1016 = "<col=ff9040>" + local1016 + "</col> x" + Static94.method1470(local24.anInt6933);
										}
									}
									if (Static405.aClass229_12 == local24) {
										local1016 = Static300.aClass96_84.method1935(Static389.anInt7061);
										local275 = local24.anInt6915;
									}
									if (Static167.aBoolean234) {
										Static447.aClass121_11.Z(local93, local98, local93 + local24.anInt6905, local24.anInt6895 + local98);
									}
									local1001.method5855(local24.anInt6905, local1016, null, Static407.aClass78Array13, local24.anInt6862, 0, local24.aBoolean561 ? 255 - (local101 & 0xFF) << 24 : -1, local93, 255 - (local101 & 0xFF) << 24 | local275, local24.anInt6895, null, local24.anInt6940, local24.anInt6899, local24.anInt6870, local98, 0);
									if (Static167.aBoolean234) {
										Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
									}
								} else if (Static169.aBoolean237) {
									Static373.method5289(local24);
								}
							} else {
								@Pc(1227) int local1227;
								if (local24.anInt6863 == 5) {
									if (local24.anInt6920 >= 0) {
										local24.method5389(Static377.aClass243_1, Static347.aClass163_1).method5318(0, local24.anInt6905, Static447.aClass121_11, local24.anInt6927 << 3, local24.anInt6904 << 3, local93, local98, local24.anInt6895, 0);
									} else {
										@Pc(1212) Class78 local1212;
										if (local24.anInt6918 == -1) {
											local1212 = local24.method5388(Static447.aClass121_11);
										} else {
											@Pc(1194) Class201 local1194 = local24.aBoolean551 ? Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1 : null;
											local1212 = Static388.aClass193_3.method4256(local24.anInt6933, Static447.aClass121_11, local24.anInt6890, local24.anInt6869, local24.anInt6937 | 0xFF000000, local1194, local24.anInt6918);
										}
										if (local1212 != null) {
											local275 = local1212.ja();
											local1227 = local1212.JA();
											local545 = 255 - (local101 & 0xFF) << 24 | (local24.anInt6915 == 0 ? 16777215 : local24.anInt6915 & 0xFFFFFF);
											if (local24.aBoolean559) {
												Static447.aClass121_11.Z(local93, local98, local24.anInt6905 + local93, local24.anInt6895 + local98);
												if (local24.anInt6878 != 0) {
													local547 = (local275 + local24.anInt6905 - 1) / local275;
													local599 = (local1227 + local24.anInt6895 - 1) / local1227;
													for (local625 = 0; local625 < local547; local625++) {
														for (local627 = 0; local627 < local599; local627++) {
															if (local24.anInt6915 == 0) {
																local1212.method6004((float) local275 / 2.0F + (float) (local275 * local625 + local93), (float) (local98 + local1227 * local627) + (float) local1227 / 2.0F, 4096, local24.anInt6878);
															} else {
																local1212.method6005((float) (local93 + local275 * local625) + (float) local275 / 2.0F, (float) local1227 / 2.0F + (float) (local98 + local627 * local1227), 4096, local24.anInt6878, local545);
															}
														}
													}
												} else if (local24.anInt6915 == 0 && local101 == 0) {
													local1212.method6002(local93, local98, local24.anInt6905, local24.anInt6895);
												} else {
													local1212.D(local93, local98, local24.anInt6905, local24.anInt6895, 0, local545, 1);
												}
												Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
											} else if (local24.anInt6915 == 0 && local101 == 0) {
												if (local24.anInt6878 != 0) {
													local1212.method6004((float) local24.anInt6905 / 2.0F + (float) local93, (float) local98 + (float) local24.anInt6895 / 2.0F, local24.anInt6905 * 4096 / local275, local24.anInt6878);
												} else if (local24.anInt6905 == local275 && local1227 == local24.anInt6895) {
													local1212.method6003(local93, local98);
												} else {
													local1212.method6001(local93, local98, local24.anInt6905, local24.anInt6895);
												}
											} else if (local24.anInt6878 != 0) {
												local1212.method6005((float) local24.anInt6905 / 2.0F + (float) local93, (float) local24.anInt6895 / 2.0F + (float) local98, local24.anInt6905 * 4096 / local275, local24.anInt6878, local545);
											} else if (local24.anInt6905 == local275 && local24.anInt6895 == local1227) {
												local1212.YA(local93, local98, 0, local545, 1);
											} else {
												local1212.M(local93, local98, local24.anInt6905, local24.anInt6895, 0, local545, 1);
											}
										} else if (Static169.aBoolean237) {
											Static373.method5289(local24);
										}
									}
								} else if (local24.anInt6863 == 6) {
									Static26.method377();
									@Pc(1570) Class37 local1570 = null;
									local275 = 0;
									@Pc(1603) Class58 local1603;
									@Pc(1611) Class201 local1611;
									if (local24.anInt6918 != -1) {
										@Pc(1583) Class206 local1583 = Static388.aClass193_3.method4249(local24.anInt6918);
										if (local1583 != null) {
											local1583 = local1583.method4958(local24.anInt6933);
											local1603 = local24.anInt6901 == -1 ? null : Static322.aClass45_5.method690(local24.anInt6901);
											local1611 = local24.aBoolean551 ? Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1 : null;
											local1570 = local1583.method4969(1, local24.anInt6916, 2048, local24.anInt6898, Static447.aClass121_11, local1611, local24.anInt6879, local1603);
											if (local1570 == null) {
												Static373.method5289(local24);
											} else {
												local275 = -local1570.b() >> 1;
											}
										}
									} else if (local24.anInt6917 == 5) {
										local1227 = local24.anInt6929;
										if (local1227 >= 0 && local1227 < 2048) {
											@Pc(1791) Class47_Sub1_Sub5_Sub2 local1791 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local1227];
											@Pc(1803) Class58 local1803 = local24.anInt6901 == -1 ? null : Static322.aClass45_5.method690(local24.anInt6901);
											if (local1791 != null && (local1227 == Static179.anInt3373 || Static221.method5879(local1791.aString66) == local24.anInt6894)) {
												local1570 = local1791.aClass201_1.method4765(null, 2048, -1, Static237.aClass80_1, local24.anInt6898, Static447.aClass121_11, 0, Static117.aClass81_1, Static388.aClass193_3, 0, local1803, local24.anInt6879, Static322.aClass45_5, local24.anInt6916, null, Static160.aClass122_5, Static268.aClass26_1);
											}
										}
									} else if (local24.anInt6917 == 8 || local24.anInt6917 == 9) {
										@Pc(1728) Class1_Sub13 local1728 = Static379.method5347(local24.anInt6929, false);
										local1603 = local24.anInt6901 == -1 ? null : Static322.aClass45_5.method690(local24.anInt6901);
										if (local1728 != null) {
											local1611 = local24.aBoolean551 ? Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1 : null;
											local1570 = local1728.method1250(local24.anInt6879, local24.anInt6916, local1611, Static447.aClass121_11, local1603, local24.anInt6894, local24.anInt6917 == 9, local24.anInt6898);
										}
									} else if (local24.anInt6901 == -1) {
										local1570 = local24.method5381(Static237.aClass80_1, Static388.aClass193_3, Static160.aClass122_5, -1, Static268.aClass26_1, Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1, null, 2048, Static117.aClass81_1, Static322.aClass45_5, Static447.aClass121_11, -1, 0);
										if (local1570 == null && Static169.aBoolean237) {
											Static373.method5289(local24);
										}
									} else {
										@Pc(1693) Class58 local1693 = Static322.aClass45_5.method690(local24.anInt6901);
										local1570 = local24.method5381(Static237.aClass80_1, Static388.aClass193_3, Static160.aClass122_5, local24.anInt6898, Static268.aClass26_1, Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1, local1693, 2048, Static117.aClass81_1, Static322.aClass45_5, Static447.aClass121_11, local24.anInt6879, local24.anInt6916);
										if (local1570 == null && Static169.aBoolean237) {
											Static373.method5289(local24);
										}
									}
									if (local1570 != null) {
										if (local24.anInt6872 > 0) {
											local1227 = (local24.anInt6905 << 9) / local24.anInt6872;
										} else {
											local1227 = 512;
										}
										if (local24.anInt6926 <= 0) {
											local545 = 512;
										} else {
											local545 = (local24.anInt6895 << 9) / local24.anInt6926;
										}
										local547 = (local24.anInt6885 * local1227 >> 9) + local93 + local24.anInt6905 / 2;
										local599 = (local24.anInt6889 * local545 >> 9) + local24.anInt6895 / 2 + local98;
										Static198.aClass43_2.HA();
										Static447.aClass121_11.m(Static198.aClass43_2);
										Static447.aClass121_11.GA(local547, local599, local1227, local545);
										Static447.aClass121_11.o((float) (local24.anInt6875 << 0), local24.aBoolean565 ? (float) (local24.anInt6868 << 0) : (float) (local24.anInt6868 << 0) * 1.5F);
										if (arg3 == -1412584499 || Static81.aBoolean127) {
											Static447.aClass121_11.va();
											Static447.aClass121_11.method4621();
											Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
											Static81.aBoolean127 = false;
										}
										if (local24.aBoolean555) {
											Static447.aClass121_11.method4596(false);
										}
										local625 = Class262.anIntArray575[local24.anInt6942 << 3] * (local24.anInt6857 << 0) >> 15;
										local627 = Class262.anIntArray576[local24.anInt6942 << 3] * (local24.anInt6857 << 0) >> 15;
										Static407.aClass43_4.ma(-local24.anInt6909 << 3);
										Static407.aClass43_4.c(local24.anInt6881 << 3);
										Static407.aClass43_4.ZA(local24.anInt6866 << 0, (local24.anInt6880 << 0) + local625 + local275, (local24.anInt6880 << 0) + local627);
										Static407.aClass43_4.na(local24.anInt6942 << 3);
										if (Static167.aBoolean234) {
											Static447.aClass121_11.Z(local93, local98, local24.anInt6905 + local93, local98 - -local24.anInt6895);
										}
										if (local24.aBoolean565) {
											local1570.method4163(Static407.aClass43_4, null, local24.anInt6857 << 0);
										} else {
											local1570.method4167(Static407.aClass43_4, null, 1);
										}
										if (Static167.aBoolean234) {
											Static447.aClass121_11.pa(arg4, arg7, arg8, arg2);
										}
										if (local24.aBoolean555) {
											Static447.aClass121_11.method4596(true);
										}
										Static447.aClass121_11.o(0.0F, 0.0F);
									}
								} else if (local24.anInt6863 == 9) {
									if (local24.aBoolean560) {
										local1227 = local24.anInt6905 + local93;
										local545 = local98;
										local275 = local98 + local24.anInt6895;
									} else {
										local275 = local98;
										local1227 = local24.anInt6905 + local93;
										local545 = local24.anInt6895 + local98;
									}
									if (local24.anInt6903 == 1) {
										Static447.aClass121_11.method4611(local93, local275, local1227, local545, local24.anInt6915, 0);
									} else {
										Static447.aClass121_11.method4573(local93, local275, local1227, local545, local24.anInt6915, local24.anInt6903);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)I")
	public static int method5281(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
