import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!ha;")
	public static Class84 aClass84_7;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
	public static int anInt4448;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_118 = new Class88("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[Lclient!mc;IIIIII)V")
	public static void method3762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class198[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
		for (@Pc(13) int local13 = 0; local13 < arg3.length; local13++) {
			@Pc(19) Class198 local19 = arg3[local13];
			if (local19 != null && (arg1 == local19.anInt5787 || arg1 == -1412584499 && Static191.aClass198_6 == local19)) {
				@Pc(65) int local65;
				if (arg4 == -1) {
					Class101.aRectangleArray1[Static24.anInt388].setBounds(local19.anInt5713 + arg0, arg5 + local19.anInt5741, local19.anInt5762, local19.anInt5715);
					local65 = Static24.anInt388++;
				} else {
					local65 = arg4;
				}
				local19.anInt5769 = Static409.anInt7683;
				local19.anInt5714 = local65;
				if (!Static67.method1545(local19)) {
					if (local19.anInt5788 != 0) {
						Static320.method5076(local19);
					}
					@Pc(91) int local91 = arg0 + local19.anInt5713;
					@Pc(96) int local96 = arg5 + local19.anInt5741;
					@Pc(99) int local99 = local19.anInt5796;
					if (Static470.aBoolean610 && (Static67.method1529(local19).anInt6901 != 0 || local19.anInt5776 == 0) && local99 > 127) {
						local99 = 127;
					}
					@Pc(152) int local152;
					@Pc(156) int local156;
					if (local19 == Static191.aClass198_6) {
						if (arg1 != -1412584499 && (Static243.anInt5002 == local19.anInt5764 || Static56.anInt1412 == local19.anInt5764)) {
							Static493.aClass198Array2 = arg3;
							Static418.anInt7781 = arg5;
							Static486.anInt8842 = arg0;
							continue;
						}
						if (Static478.aBoolean614 && Static109.aBoolean213) {
							local152 = Static527.aClass6_1.method3754();
							local156 = Static527.aClass6_1.method3757();
							local156 -= Static427.anInt7899;
							local152 -= Static43.anInt839;
							if (local152 < Static511.anInt9214) {
								local152 = Static511.anInt9214;
							}
							if (Static309.aClass198_9.anInt5762 + Static511.anInt9214 < local152 + local19.anInt5762) {
								local152 = Static511.anInt9214 + Static309.aClass198_9.anInt5762 - local19.anInt5762;
							}
							if (Static75.anInt1788 > local156) {
								local156 = Static75.anInt1788;
							}
							if (Static75.anInt1788 + Static309.aClass198_9.anInt5715 < local19.anInt5715 + local156) {
								local156 = Static75.anInt1788 + Static309.aClass198_9.anInt5715 - local19.anInt5715;
							}
							local91 = local152;
							local96 = local156;
						}
						if (local19.anInt5764 == Static56.anInt1412) {
							local99 = 128;
						}
					}
					@Pc(237) int local237;
					@Pc(241) int local241;
					@Pc(250) int local250;
					@Pc(255) int local255;
					if (local19.anInt5776 == 2) {
						local237 = arg2;
						local156 = arg8;
						local241 = arg7;
						local152 = arg6;
					} else {
						local250 = local19.anInt5762 + local91;
						local255 = local19.anInt5715 + local96;
						local156 = local96 <= arg8 ? arg8 : local96;
						local152 = arg6 < local91 ? local91 : arg6;
						if (local19.anInt5776 == 9) {
							local255++;
							local250++;
						}
						local237 = local250 >= arg2 ? arg2 : local250;
						local241 = arg7 <= local255 ? arg7 : local255;
					}
					if (local237 > local152 && local156 < local241) {
						@Pc(529) int local529;
						@Pc(542) int local542;
						@Pc(631) int local631;
						@Pc(495) int local495;
						@Pc(527) int local527;
						if (local19.anInt5788 != 0) {
							if (local19.anInt5788 == Static517.anInt9282 || Static370.anInt6852 == local19.anInt5788) {
								Static366.method7367(local19.anInt5762, local96, local91, local19.anInt5788 == Static370.anInt6852, local19.anInt5715);
								Static154.aBooleanArray31[local65] = true;
								Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
								continue;
							}
							if (local19.anInt5788 == Static276.anInt5467) {
								if (local19.method4813(Static243.aClass42_4) != null) {
									Static365.method5697();
									Static188.method3652(local19, Static243.aClass42_4, local96, local91);
									Static49.aBooleanArray8[local65] = true;
									Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
								}
								continue;
							}
							if (Static495.anInt8946 == local19.anInt5788) {
								if (local19.method4813(Static243.aClass42_4) != null) {
									Static367.method5707(local19, local91, local96);
									Static49.aBooleanArray8[local65] = true;
									Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
								}
								continue;
							}
							if (Static274.anInt5452 == local19.anInt5788) {
								Static74.method1673(local91, Static450.anInterface11_12, local96, Static243.aClass42_4, local19.anInt5762, local19.anInt5715);
								Static154.aBooleanArray31[local65] = true;
								Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
								continue;
							}
							if (Static341.anInt6478 == local19.anInt5788) {
								Static87.method1912(local19.anInt5715, local96, local91, Static243.aClass42_4, local19.anInt5762);
								Static154.aBooleanArray31[local65] = true;
								Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
								continue;
							}
							if (local19.anInt5788 == Static439.anInt8072) {
								if (!Static191.aBoolean341 && !Static193.aBoolean344) {
									continue;
								}
								local250 = local91 + local19.anInt5762;
								local255 = local96 + 15;
								if (Static191.aBoolean341) {
									local495 = -256;
									if (Static159.anInt3566 < 20) {
										local495 = -65536;
									}
									Static56.aClass80_2.method7779(local250, local495, local255, "Fps:" + Static159.anInt3566);
									local255 += 15;
									@Pc(517) Runtime local517 = Runtime.getRuntime();
									local527 = (int) ((local517.totalMemory() - local517.freeMemory()) / 1024L);
									local529 = -256;
									if (local527 > 65536) {
										local529 = -65536;
										if (Static98.aBoolean195) {
											Static350.method5483();
											for (local542 = 0; local542 < 10; local542++) {
												System.gc();
											}
											local527 = (int) ((local517.totalMemory() - local517.freeMemory()) / 1024L);
											if (local527 > 65536) {
												Static206.method7966("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static56.aClass80_2.method7779(local250, local529, local255, "Mem:" + local527 + "k");
									local255 += 15;
									Static56.aClass80_2.method7779(local250, -256, local255, "In:" + Static410.anInt7708 + "B/s Out:" + Static513.anInt9239 + "B/s");
									local255 += 15;
									local542 = Static243.aClass42_4.U() / 1024;
									Static56.aClass80_2.method7779(local250, local542 > 65536 ? -65536 : -256, local255, "Offheap:" + local542 + "k");
									local255 += 15;
									local631 = 0;
									@Pc(633) int local633 = 0;
									@Pc(635) int local635 = 0;
									for (@Pc(637) int local637 = 0; local637 < 32; local637++) {
										local631 += Static426.aClass117_Sub1Array4[local637].method4004();
										local633 += Static426.aClass117_Sub1Array4[local637].method4011();
										local635 += Static426.aClass117_Sub1Array4[local637].method4012();
									}
									@Pc(673) int local673 = local635 * 100 / local631;
									@Pc(679) int local679 = local633 * 10000 / local631;
									@Pc(699) String local699 = "Cache:" + Static205.method3831(0, true, (long) local679, 2) + "% (" + local673 + "%)";
									Static340.aClass80_3.method7779(local250, -256, local255, local699);
									local255 += 12;
								}
								if (Static129.anInt9539 > 0) {
									Static340.aClass80_3.method7779(local250, -256, local255, "Particles: " + Static543.anInt6966 + " / " + Static129.anInt9539);
								}
								local255 += 12;
								if (Static193.aBoolean344) {
									Static340.aClass80_3.method7779(local250, -256, local255, "Polys: " + Static243.aClass42_4.YA() + " Models: " + Static243.aClass42_4.ba());
									local255 += 12;
									Static340.aClass80_3.method7779(local250, -256, local255, "Ls: " + Static400.anInt7498 + " La: " + Static338.anInt2905 + " NPC: " + Static105.anInt2399 + " Pl: " + Static425.anInt7891);
									Static133.method2767();
									local255 += 12;
								}
								Static154.aBooleanArray31[local65] = true;
								continue;
							}
						}
						if (local19.anInt5776 == 0) {
							if (local19.anInt5788 == Static331.anInt6313 && Static243.aClass42_4.method5836()) {
								Static243.aClass42_4.method5795(local91, local96, local19.anInt5762, local19.anInt5715);
							}
							method3762(local91 - local19.anInt5732, local19.anInt5739, local237, arg3, local65, local96 - local19.anInt5791, local152, local241, local156);
							if (local19.aClass198Array1 != null) {
								method3762(local91 - local19.anInt5732, local19.anInt5739, local237, local19.aClass198Array1, local65, local96 - local19.anInt5791, local152, local241, local156);
							}
							@Pc(863) Class12_Sub34 local863 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local19.anInt5739);
							if (local863 != null) {
								Static402.method6313(local863.anInt5831, local152, local237, local65, local91, local96, local156, local241);
							}
							if (Static331.anInt6313 == local19.anInt5788 && Static243.aClass42_4.method5836()) {
								Static243.aClass42_4.method5845();
								Static515.aBoolean655 = true;
							}
							Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
						}
						if (Static101.aBooleanArray21[local65] || Static98.anInt2275 > 1) {
							if (local19.anInt5776 == 3) {
								if (local99 == 0) {
									if (local19.aBoolean432) {
										Static243.aClass42_4.f(local91, local96, local19.anInt5762, local19.anInt5715, local19.anInt5709, 0);
									} else {
										Static243.aClass42_4.method5834(local91, local96, local19.anInt5762, local19.anInt5715, local19.anInt5709, 0);
									}
								} else if (local19.aBoolean432) {
									Static243.aClass42_4.f(local91, local96, local19.anInt5762, local19.anInt5715, local19.anInt5709 & 0xFFFFFF | 255 - (local99 & 0xFF) << 24, 1);
								} else {
									Static243.aClass42_4.method5834(local91, local96, local19.anInt5762, local19.anInt5715, 255 - (local99 & 0xFF) << 24 | local19.anInt5709 & 0xFFFFFF, 1);
								}
							} else if (local19.anInt5776 == 4) {
								@Pc(998) Class80 local998 = local19.method4817(Static243.aClass42_4);
								if (local998 != null) {
									local255 = local19.anInt5709;
									@Pc(1013) String local1013 = local19.aString67;
									if (local19.anInt5726 != -1) {
										@Pc(1024) Class56 local1024 = Static150.aClass254_2.method6340(local19.anInt5726);
										local1013 = local1024.aString12;
										if (local1013 == null) {
											local1013 = "null";
										}
										if ((local1024.anInt1661 == 1 || local19.anInt5768 != 1) && local19.anInt5768 != -1) {
											local1013 = "<col=ff9040>" + local1013 + "</col> x" + Static260.method1524(local19.anInt5768);
										}
									}
									if (Static188.aClass198_5 == local19) {
										local1013 = Static218.aClass88_129.method2391(Static345.anInt6495);
										local255 = local19.anInt5709;
									}
									if (Static215.aBoolean371) {
										Static243.aClass42_4.F(local91, local96, local19.anInt5762 + local91, local96 + local19.anInt5715);
									}
									local998.method7775(Static275.aClass84Array9, local19.aBoolean444 ? 255 - (local99 & 0xFF) << 24 : -1, null, local91, 255 - (local99 & 0xFF) << 24 | local255, local19.anInt5715, null, local19.anInt5762, 0, local19.anInt5771, local19.anInt5728, local1013, local19.anInt5749, local96, 0, local19.anInt5773);
									if (Static215.aBoolean371) {
										Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
									}
								} else if (Static155.aBoolean276) {
									Static331.method5282(local19);
								}
							} else {
								@Pc(1216) int local1216;
								if (local19.anInt5776 == 5) {
									if (local19.anInt5746 < 0) {
										@Pc(1162) Class84 local1162;
										if (local19.anInt5726 == -1) {
											local1162 = local19.method4809(Static243.aClass42_4);
										} else {
											@Pc(1172) Class58 local1172 = local19.aBoolean437 ? Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1 : null;
											local1162 = Static150.aClass254_2.method6342(local19.anInt5738 | 0xFF000000, local19.anInt5766, local1172, local19.anInt5768, Static243.aClass42_4, local19.anInt5724, local19.anInt5726);
										}
										if (local1162 != null) {
											local255 = local1162.EA();
											local495 = local1162.ma();
											local1216 = 255 - (local99 & 0xFF) << 24 | (local19.anInt5709 == 0 ? 16777215 : local19.anInt5709 & 0xFFFFFF);
											if (local19.aBoolean431) {
												Static243.aClass42_4.F(local91, local96, local19.anInt5762 + local91, local96 + local19.anInt5715);
												if (local19.anInt5795 != 0) {
													local527 = (local19.anInt5762 + local255 - 1) / local255;
													local529 = (local495 + local19.anInt5715 - 1) / local495;
													for (local542 = 0; local542 < local527; local542++) {
														for (local631 = 0; local631 < local529; local631++) {
															if (local19.anInt5709 == 0) {
																local1162.method7491((float) (local542 * local255 + local91) + (float) local255 / 2.0F, (float) (local495 * local631 + local96) + (float) local495 / 2.0F, 4096, local19.anInt5795);
															} else {
																local1162.method7488((float) (local91 + local542 * local255) + (float) local255 / 2.0F, (float) local495 / 2.0F + (float) (local96 + local631 * local495), 4096, local19.anInt5795, local1216);
															}
														}
													}
												} else if (local19.anInt5709 == 0 && local99 == 0) {
													local1162.method7485(local91, local96, local19.anInt5762, local19.anInt5715);
												} else {
													local1162.i(local91, local96, local19.anInt5762, local19.anInt5715, 0, local1216, 1);
												}
												Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
											} else if (local19.anInt5709 == 0 && local99 == 0) {
												if (local19.anInt5795 != 0) {
													local1162.method7491((float) local19.anInt5762 / 2.0F + (float) local91, (float) local96 + (float) local19.anInt5715 / 2.0F, local19.anInt5762 * 4096 / local255, local19.anInt5795);
												} else if (local19.anInt5762 == local255 && local495 == local19.anInt5715) {
													local1162.method7487(local91, local96);
												} else {
													local1162.method7489(local91, local96, local19.anInt5762, local19.anInt5715);
												}
											} else if (local19.anInt5795 != 0) {
												local1162.method7488((float) local19.anInt5762 / 2.0F + (float) local91, (float) local96 + (float) local19.anInt5715 / 2.0F, local19.anInt5762 * 4096 / local255, local19.anInt5795, local1216);
											} else if (local255 == local19.anInt5762 && local495 == local19.anInt5715) {
												local1162.DA(local91, local96, 0, local1216, 1);
											} else {
												local1162.ra(local91, local96, local19.anInt5762, local19.anInt5715, 0, local1216, 1);
											}
										} else if (Static155.aBoolean276) {
											Static331.method5282(local19);
										}
									} else {
										local19.method4802(Static114.aClass252_1, Static496.aClass60_3).method4607(local91, local19.anInt5748 << 3, local19.anInt5715, 0, local96, local19.anInt5762, 0, Static243.aClass42_4, local19.anInt5760 << 3);
									}
								} else if (local19.anInt5776 == 6) {
									Static203.method3817();
									@Pc(1568) Class26 local1568 = null;
									local255 = 0;
									@Pc(1602) Class64 local1602;
									@Pc(1610) Class58 local1610;
									if (local19.anInt5726 != -1) {
										@Pc(1581) Class56 local1581 = Static150.aClass254_2.method6340(local19.anInt5726);
										if (local1581 != null) {
											local1581 = local1581.method1560(local19.anInt5768);
											local1602 = local19.anInt5708 == -1 ? null : Static47.aClass41_1.method911(local19.anInt5708);
											local1610 = local19.aBoolean437 ? Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1 : null;
											local1568 = local1581.method1567(2048, local19.anInt5735, 1, local19.anInt5783, local1602, Static243.aClass42_4, local19.anInt5753, local1610);
											if (local1568 == null) {
												Static331.method5282(local19);
											} else {
												local255 = -local1568.TA() >> 1;
											}
										}
									} else if (local19.anInt5722 == 5) {
										local495 = local19.anInt5744;
										if (local495 >= 0 && local495 < 2048) {
											@Pc(1660) Class30_Sub1_Sub1_Sub1 local1660 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local495];
											@Pc(1673) Class64 local1673 = local19.anInt5708 == -1 ? null : Static47.aClass41_1.method911(local19.anInt5708);
											if (local1660 != null && (Static396.anInt7452 == local495 || Static470.method7078(local1660.aString6) == local19.anInt5765)) {
												local1568 = local1660.aClass58_1.method1587(local19.anInt5753, null, Static274.aClass78_1, Static218.aClass160_1, local19.anInt5783, 2048, -1, null, Static150.aClass254_2, local1673, Static47.aClass41_1, 0, Static393.aClass31_1, Static161.aClass110_3, 0, Static243.aClass42_4, local19.anInt5735);
											}
										}
									} else if (local19.anInt5722 == 8 || local19.anInt5722 == 9) {
										@Pc(1734) Class12_Sub23 local1734 = Static292.method4742(local19.anInt5744, false);
										local1602 = local19.anInt5708 == -1 ? null : Static47.aClass41_1.method911(local19.anInt5708);
										if (local1734 != null) {
											local1610 = local19.aBoolean437 ? Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1 : null;
											local1568 = local1734.method3787(local19.anInt5783, local19.anInt5765, local19.anInt5722 == 9, local19.anInt5753, Static243.aClass42_4, local1602, local19.anInt5735, local1610);
										}
									} else if (local19.anInt5708 == -1) {
										local1568 = local19.method4819(Static393.aClass31_1, -1, Static243.aClass42_4, Static161.aClass110_3, 2048, Static274.aClass78_1, Static150.aClass254_2, 0, null, Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1, -1, Static47.aClass41_1, Static218.aClass160_1);
										if (local1568 == null && Static155.aBoolean276) {
											Static331.method5282(local19);
										}
									} else {
										@Pc(1820) Class64 local1820 = Static47.aClass41_1.method911(local19.anInt5708);
										local1568 = local19.method4819(Static393.aClass31_1, local19.anInt5783, Static243.aClass42_4, Static161.aClass110_3, 2048, Static274.aClass78_1, Static150.aClass254_2, local19.anInt5753, local1820, Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1, local19.anInt5735, Static47.aClass41_1, Static218.aClass160_1);
										if (local1568 == null && Static155.aBoolean276) {
											Static331.method5282(local19);
										}
									}
									if (local1568 != null) {
										if (local19.anInt5721 <= 0) {
											local495 = 512;
										} else {
											local495 = (local19.anInt5762 << 9) / local19.anInt5721;
										}
										if (local19.anInt5719 > 0) {
											local1216 = (local19.anInt5715 << 9) / local19.anInt5719;
										} else {
											local1216 = 512;
										}
										local527 = (local19.anInt5784 * local495 >> 9) + local19.anInt5762 / 2 + local91;
										local529 = (local19.anInt5792 * local1216 >> 9) + local19.anInt5715 / 2 + local96;
										Static180.aClass91_5.ha();
										Static243.aClass42_4.method5855(Static180.aClass91_5);
										Static243.aClass42_4.b(local527, local529, local495, local1216);
										Static243.aClass42_4.la((float) (local19.anInt5707 << 0), local19.aBoolean445 ? (float) (local19.anInt5789 << 0) : (float) (local19.anInt5789 << 0) * 1.5F);
										if (arg1 == -1412584499 || Static515.aBoolean655) {
											Static243.aClass42_4.n();
											Static243.aClass42_4.method5792();
											Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
											Static515.aBoolean655 = false;
										}
										if (local19.aBoolean438) {
											Static243.aClass42_4.method5822(false);
										}
										local542 = (local19.anInt5782 << 0) * Class12_Sub1_Sub36.anIntArray667[local19.anInt5745 << 3] >> 15;
										local631 = (local19.anInt5782 << 0) * Class12_Sub1_Sub36.anIntArray668[local19.anInt5745 << 3] >> 15;
										Static110.aClass91_4.ta(-local19.anInt5772 << 3);
										Static110.aClass91_4.XA(local19.anInt5730 << 3);
										Static110.aClass91_4.TA(local19.anInt5756 << 0, local255 + (local19.anInt5725 << 0) + local542, local631 - -(local19.anInt5725 << 0));
										Static110.aClass91_4.k(local19.anInt5745 << 3);
										if (Static215.aBoolean371) {
											Static243.aClass42_4.F(local91, local96, local91 + local19.anInt5762, local19.anInt5715 + local96);
										}
										if (local19.aBoolean445) {
											local1568.method7994(Static110.aClass91_4, null, local19.anInt5782 << 0);
										} else {
											local1568.method8003(Static110.aClass91_4, null, 1);
										}
										if (Static215.aBoolean371) {
											Static243.aClass42_4.N(arg6, arg8, arg2, arg7);
										}
										if (local19.aBoolean438) {
											Static243.aClass42_4.method5822(true);
										}
										Static243.aClass42_4.la(0.0F, 0.0F);
									}
								} else if (local19.anInt5776 == 9) {
									if (local19.aBoolean434) {
										local495 = local19.anInt5762 + local91;
										local255 = local19.anInt5715 + local96;
										local1216 = local96;
									} else {
										local495 = local91 + local19.anInt5762;
										local1216 = local96 + local19.anInt5715;
										local255 = local96;
									}
									if (local19.anInt5723 == 1) {
										Static243.aClass42_4.method5851(local91, local255, local495, local1216, local19.anInt5709, 0);
									} else {
										Static243.aClass42_4.method5802(local91, local255, local495, local1216, local19.anInt5709, local19.anInt5723);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIZ)Lclient!mg;")
	public static Class12_Sub34 method3764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class12_Sub34 local7 = new Class12_Sub34();
		local7.anInt5829 = arg2;
		local7.anInt5831 = arg0;
		Static456.aClass68_67.method1916(local7, (long) arg1);
		Static382.method6045(arg0);
		@Pc(38) Class198 local38 = Static104.method2137(arg1);
		if (local38 != null) {
			Static331.method5282(local38);
		}
		if (Static188.aClass198_5 != null) {
			Static331.method5282(Static188.aClass198_5);
			Static188.aClass198_5 = null;
		}
		Static86.method1909();
		if (local38 != null) {
			Static190.method3668(local38, !arg3);
		}
		if (!arg3) {
			Static312.method5016(arg0);
		}
		if (!arg3 && Static406.anInt7660 != -1) {
			Static376.method7936(1, Static406.anInt7660);
		}
		return local7;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method3765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg5 && arg0 == arg1 && arg6 == arg3 && arg2 == arg8) {
			Static280.method4642(arg1, arg6, arg7, arg5, arg2);
			return;
		}
		@Pc(43) int local43 = arg5;
		@Pc(45) int local45 = arg1;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(53) int local53 = arg1 * 3;
		@Pc(57) int local57 = arg4 * 3;
		@Pc(61) int local61 = arg0 * 3;
		@Pc(65) int local65 = arg3 * 3;
		@Pc(69) int local69 = arg8 * 3;
		@Pc(79) int local79 = local57 + arg6 - arg5 - local65;
		@Pc(89) int local89 = arg2 + local61 - arg1 - local69;
		@Pc(99) int local99 = local65 + local49 - local57 - local57;
		@Pc(108) int local108 = local53 + local69 - local61 - local61;
		@Pc(113) int local113 = local57 - local49;
		@Pc(118) int local118 = local61 - local53;
		for (@Pc(120) int local120 = 128; local120 <= 4096; local120 += 128) {
			@Pc(128) int local128 = local120 * local120 >> 12;
			@Pc(134) int local134 = local128 * local120 >> 12;
			@Pc(138) int local138 = local79 * local134;
			@Pc(142) int local142 = local134 * local89;
			@Pc(146) int local146 = local99 * local128;
			@Pc(150) int local150 = local108 * local128;
			@Pc(154) int local154 = local120 * local113;
			@Pc(158) int local158 = local120 * local118;
			@Pc(169) int local169 = arg5 + (local154 + local146 + local138 >> 12);
			@Pc(180) int local180 = arg1 + (local150 + local142 + local158 >> 12);
			Static280.method4642(local45, local169, arg7, local43, local180);
			local45 = local180;
			local43 = local169;
		}
	}
}
