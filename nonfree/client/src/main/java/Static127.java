import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!h;")
	public static final Class114 aClass114_58 = new Class114("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	public static final int anInt3048 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[Lclient!vp;IIIIIIII)V")
	public static void method2787(@OriginalArg(0) int arg0, @OriginalArg(1) Class309[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(16) Class309 local16 = arg1[local11];
			if (local16 != null && (local16.anInt8764 == arg6 || arg6 == -1412584499 && local16 == Static279.aClass309_6)) {
				@Pc(56) int local56;
				if (arg8 == -1) {
					Class1_Sub1_Sub2.aRectangleArray1[Static361.anInt6491].setBounds(local16.anInt8744 + arg0, local16.anInt8777 - -arg7, local16.anInt8790, local16.anInt8752);
					local56 = Static361.anInt6491++;
				} else {
					local56 = arg8;
				}
				local16.anInt8743 = local56;
				local16.anInt8789 = Static416.anInt7252;
				if (!Static62.method1751(local16)) {
					if (local16.anInt8761 != 0) {
						Static166.method3271(local16);
					}
					@Pc(83) int local83 = local16.anInt8744 + arg0;
					@Pc(89) int local89 = local16.anInt8777 + arg7;
					@Pc(92) int local92 = local16.anInt8730;
					if (Static192.aBoolean246 && (Static62.method1740(local16).anInt9474 != 0 || local16.anInt8802 == 0) && local92 > 127) {
						local92 = 127;
					}
					@Pc(139) int local139;
					@Pc(143) int local143;
					if (local16 == Static279.aClass309_6) {
						if (arg6 != -1412584499 && (Static184.anInt3930 == local16.anInt8785 || anInt3048 == local16.anInt8785)) {
							Static466.aClass309Array1 = arg1;
							Static190.anInt4010 = arg0;
							Static76.anInt2071 = arg7;
							continue;
						}
						if (Static102.aBoolean173 && Static519.aBoolean611) {
							local139 = Static42.aClass191_1.method5138();
							local143 = Static42.aClass191_1.method5141();
							local143 -= Static120.anInt2882;
							local139 -= Static106.anInt2480;
							if (Static115.anInt2806 > local139) {
								local139 = Static115.anInt2806;
							}
							if (local16.anInt8790 + local139 > Static395.aClass309_9.anInt8790 + Static115.anInt2806) {
								local139 = Static395.aClass309_9.anInt8790 + Static115.anInt2806 - local16.anInt8790;
							}
							if (Static388.anInt6744 > local143) {
								local143 = Static388.anInt6744;
							}
							if (local16.anInt8752 + local143 > Static388.anInt6744 - -Static395.aClass309_9.anInt8752) {
								local143 = Static395.aClass309_9.anInt8752 + Static388.anInt6744 - local16.anInt8752;
							}
							local83 = local139;
							local89 = local143;
						}
						if (local16.anInt8785 == anInt3048) {
							local92 = 128;
						}
					}
					@Pc(218) int local218;
					@Pc(222) int local222;
					@Pc(230) int local230;
					@Pc(235) int local235;
					if (local16.anInt8802 == 2) {
						local218 = arg5;
						local143 = arg2;
						local222 = arg4;
						local139 = arg3;
					} else {
						local230 = local16.anInt8790 + local83;
						local235 = local89 + local16.anInt8752;
						if (local16.anInt8802 == 9) {
							local230++;
							local235++;
						}
						local143 = local89 > arg2 ? local89 : arg2;
						local139 = arg3 < local83 ? local83 : arg3;
						local218 = local230 < arg5 ? local230 : arg5;
						local222 = arg4 <= local235 ? arg4 : local235;
					}
					if (local218 > local139 && local143 < local222) {
						@Pc(458) int local458;
						@Pc(494) int local494;
						@Pc(507) int local507;
						@Pc(598) int local598;
						@Pc(492) int local492;
						if (local16.anInt8761 != 0) {
							if (local16.anInt8761 == Static287.anInt5617 || local16.anInt8761 == Static61.anInt1714) {
								Static400.method6031(local89, local16.anInt8790, Static61.anInt1714 == local16.anInt8761, local83, local16.anInt8752);
								Static145.aBooleanArray14[local56] = true;
								Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
								continue;
							}
							if (Static53.anInt1520 == local16.anInt8761) {
								if (local16.method7389(Static478.aClass9_10) != null) {
									Static443.method6413();
									Static94.method2175(Static478.aClass9_10, local16, local83, local89);
									Static44.aBooleanArray8[local56] = true;
									Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
								}
								continue;
							}
							if (Static82.anInt2172 == local16.anInt8761) {
								if (local16.method7389(Static478.aClass9_10) != null) {
									Static500.method7155(local89, local16, local83);
									Static44.aBooleanArray8[local56] = true;
									Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
								}
								continue;
							}
							if (local16.anInt8761 == Static459.anInt7942) {
								Static371.method5696(local16.anInt8790, local89, local83, Static389.anInterface8_10, local16.anInt8752, Static478.aClass9_10);
								Static145.aBooleanArray14[local56] = true;
								Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
								continue;
							}
							if (local16.anInt8761 == Static407.anInt7143) {
								Static393.method5920(local16.anInt8752, local89, local16.anInt8790, Static478.aClass9_10, local83);
								Static145.aBooleanArray14[local56] = true;
								Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
								continue;
							}
							if (local16.anInt8761 == Static315.anInt5992) {
								if (!Static184.aBoolean244 && !Static513.aBoolean593) {
									continue;
								}
								local230 = local16.anInt8790 + local83;
								local235 = local89 + 15;
								if (Static184.aBoolean244) {
									local458 = -256;
									if (Static193.anInt4053 < 20) {
										local458 = -65536;
									}
									Static268.aClass27_4.method7818("Fps:" + Static193.anInt4053, local235, local458, local230);
									local235 += 15;
									@Pc(482) Runtime local482 = Runtime.getRuntime();
									local492 = (int) ((local482.totalMemory() - local482.freeMemory()) / 1024L);
									local494 = -256;
									if (local492 > 65536) {
										local494 = -65536;
										if (Static120.aBoolean188) {
											Static393.method5917();
											for (local507 = 0; local507 < 10; local507++) {
												System.gc();
											}
											local492 = (int) ((local482.totalMemory() - local482.freeMemory()) / 1024L);
											if (local492 > 65536) {
												Static289.method4881("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static268.aClass27_4.method7818("Mem:" + local492 + "k", local235, local494, local230);
									local235 += 15;
									Static268.aClass27_4.method7818("In:" + Static139.anInt3271 + "B/s Out:" + Static106.anInt2479 + "B/s", local235, -256, local230);
									local235 += 15;
									local507 = Static478.aClass9_10.U() / 1024;
									Static268.aClass27_4.method7818("Offheap:" + local507 + "k", local235, local507 > 65536 ? -65536 : -256, local230);
									local235 += 15;
									local598 = 0;
									@Pc(600) int local600 = 0;
									@Pc(602) int local602 = 0;
									for (@Pc(604) int local604 = 0; local604 < 32; local604++) {
										local598 += Static224.aClass87_Sub1Array1[local604].method2850();
										local600 += Static224.aClass87_Sub1Array1[local604].method2851();
										local602 += Static224.aClass87_Sub1Array1[local604].method2844();
									}
									@Pc(643) int local643 = local602 * 100 / local598;
									@Pc(649) int local649 = local600 * 10000 / local598;
									@Pc(669) String local669 = "Cache:" + Static260.method4372((long) local649, 2, true, 0) + "% (" + local643 + "%)";
									Static58.aClass27_2.method7818(local669, local235, -256, local230);
									local235 += 12;
								}
								if (Static406.anInt7096 > 0) {
									Static58.aClass27_2.method7818("Particles: " + Static497.anInt8451 + " / " + Static406.anInt7096, local235, -256, local230);
								}
								local235 += 12;
								if (Static513.aBoolean593) {
									Static58.aClass27_2.method7818("Polys: " + Static478.aClass9_10.YA() + " Models: " + Static478.aClass9_10.ba(), local235, -256, local230);
									local235 += 12;
									Static58.aClass27_2.method7818("Ls: " + Static79.anInt2108 + " La: " + Static289.anInt5647 + " NPC: " + Static395.anInt6903 + " Pl: " + Static392.anInt6841, local235, -256, local230);
									Static226.method3964();
									local235 += 12;
								}
								Static145.aBooleanArray14[local56] = true;
								continue;
							}
						}
						if (local16.anInt8802 == 0) {
							if (Static184.anInt3929 == local16.anInt8761 && Static478.aClass9_10.method7591()) {
								Static478.aClass9_10.method7617(local83, local89, local16.anInt8790, local16.anInt8752);
							}
							method2787(local83 - local16.anInt8786, arg1, local143, local139, local222, local218, local16.anInt8750, local89 - local16.anInt8721, local56);
							if (local16.lb != null) {
								method2787(local83 - local16.anInt8786, local16.lb, local143, local139, local222, local218, local16.anInt8750, local89 - local16.anInt8721, local56);
							}
							@Pc(831) Class1_Sub5 local831 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local16.anInt8750);
							if (local831 != null) {
								Static179.method3453(local143, local218, local831.anInt1389, local89, local222, local139, local56, local83);
							}
							if (local16.anInt8761 == Static184.anInt3929 && Static478.aClass9_10.method7591()) {
								Static478.aClass9_10.method7619();
								Static256.aBoolean338 = true;
							}
							Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
						}
						if (Static547.aBooleanArray42[local56] || Static457.anInt7684 > 1) {
							if (local16.anInt8802 == 3) {
								if (local92 == 0) {
									if (local16.aBoolean609) {
										Static478.aClass9_10.f(local83, local89, local16.anInt8790, local16.anInt8752, local16.anInt8729, 0);
									} else {
										Static478.aClass9_10.method7568(local83, local89, local16.anInt8790, local16.anInt8752, local16.anInt8729, 0);
									}
								} else if (local16.aBoolean609) {
									Static478.aClass9_10.f(local83, local89, local16.anInt8790, local16.anInt8752, local16.anInt8729 & 0xFFFFFF | 255 - (local92 & 0xFF) << 24, 1);
								} else {
									Static478.aClass9_10.method7568(local83, local89, local16.anInt8790, local16.anInt8752, local16.anInt8729 & 0xFFFFFF | 255 - (local92 & 0xFF) << 24, 1);
								}
							} else if (local16.anInt8802 == 4) {
								@Pc(959) Class27 local959 = local16.method7383(Static478.aClass9_10);
								if (local959 != null) {
									local235 = local16.anInt8729;
									@Pc(973) String local973 = local16.aString78;
									if (local16.anInt8735 != -1) {
										@Pc(984) Class192 local984 = Static454.aClass153_2.method4007(local16.anInt8735);
										local973 = local984.aString55;
										if (local973 == null) {
											local973 = "null";
										}
										if ((local984.anInt5781 == 1 || local16.anInt8741 != 1) && local16.anInt8741 != -1) {
											local973 = "<col=ff9040>" + local973 + "</col> x" + Static125.method2766(local16.anInt8741);
										}
									}
									if (local16 == Static531.aClass309_14) {
										local973 = Static425.aClass114_144.method3330(Static315.anInt5993);
										local235 = local16.anInt8729;
									}
									if (Static17.aBoolean60) {
										Static478.aClass9_10.F(local83, local89, local16.anInt8790 + local83, local16.anInt8752 + local89);
									}
									local959.method7820(local973, local16.anInt8798, null, local16.anInt8793, local16.anInt8752, local235 | 255 - (local92 & 0xFF) << 24, local16.aBoolean604 ? 255 - (local92 & 0xFF) << 24 : -1, local16.anInt8780, null, local16.anInt8790, local16.anInt8800, 0, local89, local83, 0, Static107.aClass12Array9);
									if (Static17.aBoolean60) {
										Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
									}
								} else if (Static204.aBoolean260) {
									Static291.method4908(local16);
								}
							} else {
								@Pc(1210) int local1210;
								if (local16.anInt8802 == 5) {
									if (local16.anInt8731 >= 0) {
										local16.method7382(Static86.aClass254_1, Static27.aClass310_1).method2908(local83, local89, Static478.aClass9_10, 0, local16.anInt8790, 0, local16.anInt8742 << 3, local16.anInt8752, local16.anInt8762 << 3);
									} else {
										@Pc(1168) Class12 local1168;
										if (local16.anInt8735 == -1) {
											local1168 = local16.method7380(Static478.aClass9_10);
										} else {
											@Pc(1150) Class258 local1150 = local16.aBoolean603 ? Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1 : null;
											local1168 = Static454.aClass153_2.method3998(local16.anInt8741, local1150, Static478.aClass9_10, local16.anInt8770 | 0xFF000000, local16.anInt8733, local16.anInt8735, local16.anInt8719);
										}
										if (local1168 != null) {
											local235 = local1168.EA();
											local458 = local1168.ma();
											local1210 = 255 - (local92 & 0xFF) << 24 | (local16.anInt8729 == 0 ? 16777215 : local16.anInt8729 & 0xFFFFFF);
											if (local16.aBoolean600) {
												Static478.aClass9_10.F(local83, local89, local83 + local16.anInt8790, local89 - -local16.anInt8752);
												if (local16.anInt8727 != 0) {
													local492 = (local235 + local16.anInt8790 - 1) / local235;
													local494 = (local16.anInt8752 + local458 - 1) / local458;
													for (local507 = 0; local507 < local492; local507++) {
														for (local598 = 0; local598 < local494; local598++) {
															if (local16.anInt8729 == 0) {
																local1168.method7196((float) (local83 + local507 * local235) + (float) local235 / 2.0F, (float) local458 / 2.0F + (float) (local89 + local598 * local458), 4096, local16.anInt8727);
															} else {
																local1168.method7195((float) (local83 + local507 * local235) + (float) local235 / 2.0F, (float) (local89 + local598 * local458) + (float) local458 / 2.0F, 4096, local16.anInt8727, local1210);
															}
														}
													}
												} else if (local16.anInt8729 == 0 && local92 == 0) {
													local1168.method7193(local83, local89, local16.anInt8790, local16.anInt8752);
												} else {
													local1168.i(local83, local89, local16.anInt8790, local16.anInt8752, 0, local1210, 1);
												}
												Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
											} else if (local16.anInt8729 == 0 && local92 == 0) {
												if (local16.anInt8727 != 0) {
													local1168.method7196((float) local83 + (float) local16.anInt8790 / 2.0F, (float) local89 + (float) local16.anInt8752 / 2.0F, local16.anInt8790 * 4096 / local235, local16.anInt8727);
												} else if (local235 == local16.anInt8790 && local458 == local16.anInt8752) {
													local1168.method7191(local83, local89);
												} else {
													local1168.method7192(local83, local89, local16.anInt8790, local16.anInt8752);
												}
											} else if (local16.anInt8727 != 0) {
												local1168.method7195((float) local83 + (float) local16.anInt8790 / 2.0F, (float) local89 + (float) local16.anInt8752 / 2.0F, local16.anInt8790 * 4096 / local235, local16.anInt8727, local1210);
											} else if (local16.anInt8790 == local235 && local16.anInt8752 == local458) {
												local1168.DA(local83, local89, 0, local1210, 1);
											} else {
												local1168.ra(local83, local89, local16.anInt8790, local16.anInt8752, 0, local1210, 1);
											}
										} else if (Static204.aBoolean260) {
											Static291.method4908(local16);
										}
									}
								} else if (local16.anInt8802 == 6) {
									Static516.method7362();
									@Pc(1509) Class19 local1509 = null;
									local235 = 0;
									@Pc(1625) Class280 local1625;
									@Pc(1635) Class258 local1635;
									if (local16.anInt8735 != -1) {
										@Pc(1730) Class192 local1730 = Static454.aClass153_2.method4007(local16.anInt8735);
										if (local1730 != null) {
											local1730 = local1730.method5018(local16.anInt8741);
											local1625 = local16.anInt8766 == -1 ? null : Static6.aClass126_1.method3574(local16.anInt8766);
											local1635 = local16.aBoolean603 ? Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1 : null;
											local1509 = local1730.method5022(Static478.aClass9_10, 1, local1635, local16.anInt8738, local16.anInt8791, local16.anInt8776, local1625, 2048);
											if (local1509 == null) {
												Static291.method4908(local16);
											} else {
												local235 = -local1509.TA() >> 1;
											}
										}
									} else if (local16.anInt8792 == 5) {
										local458 = local16.anInt8794;
										if (local458 >= 0 && local458 < 2048) {
											@Pc(1534) Class47_Sub2_Sub3_Sub2 local1534 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local458];
											@Pc(1547) Class280 local1547 = local16.anInt8766 == -1 ? null : Static6.aClass126_1.method3574(local16.anInt8766);
											if (local1534 != null && (Static150.anInt3353 == local458 || Static476.method6226(local1534.aString36) == local16.anInt8778)) {
												local1509 = local1534.aClass258_1.method6282(Static345.aClass222_1, Static343.aClass286_1, local1547, local16.anInt8738, null, 0, -1, 0, 2048, local16.anInt8791, Static478.aClass9_10, null, Static109.aClass18_1, Static454.aClass153_2, Static489.aClass34_2, Static6.aClass126_1, local16.anInt8776);
											}
										}
									} else if (local16.anInt8792 == 8 || local16.anInt8792 == 9) {
										@Pc(1610) Class1_Sub49 local1610 = Static393.method5919(false, local16.anInt8794);
										local1625 = local16.anInt8766 == -1 ? null : Static6.aClass126_1.method3574(local16.anInt8766);
										if (local1610 != null) {
											local1635 = local16.aBoolean603 ? Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1 : null;
											local1509 = local1610.method7374(local16.anInt8738, local1635, local16.anInt8778, local16.anInt8792 == 9, Static478.aClass9_10, local16.anInt8776, local1625, local16.anInt8791);
										}
									} else if (local16.anInt8766 == -1) {
										local1509 = local16.method7388(Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1, -1, Static345.aClass222_1, Static478.aClass9_10, 2048, Static6.aClass126_1, -1, Static489.aClass34_2, Static109.aClass18_1, 0, Static343.aClass286_1, null, Static454.aClass153_2);
										if (local1509 == null && Static204.aBoolean260) {
											Static291.method4908(local16);
										}
									} else {
										@Pc(1669) Class280 local1669 = Static6.aClass126_1.method3574(local16.anInt8766);
										local1509 = local16.method7388(Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1, local16.anInt8738, Static345.aClass222_1, Static478.aClass9_10, 2048, Static6.aClass126_1, local16.anInt8776, Static489.aClass34_2, Static109.aClass18_1, local16.anInt8791, Static343.aClass286_1, local1669, Static454.aClass153_2);
										if (local1509 == null && Static204.aBoolean260) {
											Static291.method4908(local16);
										}
									}
									if (local1509 != null) {
										if (local16.anInt8781 > 0) {
											local458 = (local16.anInt8790 << 9) / local16.anInt8781;
										} else {
											local458 = 512;
										}
										if (local16.anInt8782 <= 0) {
											local1210 = 512;
										} else {
											local1210 = (local16.anInt8752 << 9) / local16.anInt8782;
										}
										local492 = local83 + local16.anInt8790 / 2 + (local458 * local16.anInt8732 >> 9);
										local494 = local89 + local16.anInt8752 / 2 + (local1210 * local16.anInt8758 >> 9);
										Static56.aClass22_5.ha();
										Static478.aClass9_10.method7597(Static56.aClass22_5);
										Static478.aClass9_10.b(local492, local494, local458, local1210);
										Static478.aClass9_10.la((float) (local16.anInt8771 << 0), local16.aBoolean597 ? (float) (local16.anInt8748 << 0) : (float) (local16.anInt8748 << 0) * 1.5F);
										if (arg6 == -1412584499 || Static256.aBoolean338) {
											Static478.aClass9_10.n();
											Static478.aClass9_10.method7623();
											Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
											Static256.aBoolean338 = false;
										}
										if (local16.aBoolean594) {
											Static478.aClass9_10.method7589(false);
										}
										local507 = Class307.anIntArray744[local16.anInt8724 << 3] * (local16.anInt8805 << 0) >> 15;
										local598 = (local16.anInt8805 << 0) * Class307.anIntArray743[local16.anInt8724 << 3] >> 15;
										Static163.aClass22_6.ta(-local16.anInt8763 << 3);
										Static163.aClass22_6.XA(local16.anInt8757 << 3);
										Static163.aClass22_6.TA(local16.anInt8723 << 0, local507 + (local16.anInt8725 << 0) + local235, (local16.anInt8725 << 0) + local598);
										Static163.aClass22_6.k(local16.anInt8724 << 3);
										if (Static17.aBoolean60) {
											Static478.aClass9_10.F(local83, local89, local16.anInt8790 + local83, local16.anInt8752 + local89);
										}
										if (local16.aBoolean597) {
											local1509.method7253(Static163.aClass22_6, null, local16.anInt8805 << 0);
										} else {
											local1509.method7258(Static163.aClass22_6, null, 1);
										}
										if (Static17.aBoolean60) {
											Static478.aClass9_10.N(arg3, arg2, arg5, arg4);
										}
										if (local16.aBoolean594) {
											Static478.aClass9_10.method7589(true);
										}
										Static478.aClass9_10.la(0.0F, 0.0F);
									}
								} else if (local16.anInt8802 == 9) {
									if (local16.aBoolean605) {
										local235 = local89 + local16.anInt8752;
										local458 = local16.anInt8790 + local83;
										local1210 = local89;
									} else {
										local235 = local89;
										local458 = local83 + local16.anInt8790;
										local1210 = local16.anInt8752 + local89;
									}
									if (local16.anInt8787 == 1) {
										Static478.aClass9_10.method7572(local83, local235, local458, local1210, local16.anInt8729, 0);
									} else {
										Static478.aClass9_10.method7587(local83, local235, local458, local1210, local16.anInt8729, local16.anInt8787);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Z")
	public static boolean method2789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
