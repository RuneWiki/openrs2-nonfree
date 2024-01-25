import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	public static final int[] anIntArray23 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[Lclient!vg;IIBIIII)V")
	public static void method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
		for (@Pc(13) int local13 = 0; local13 < arg2.length; local13++) {
			@Pc(21) Class250 local21 = arg2[local13];
			if (local21 != null && (local21.anInt7002 == arg5 || arg5 == -1412584499 && Static68.aClass250_2 == local21)) {
				@Pc(45) int local45;
				if (arg6 == -1) {
					Class138.aRectangleArray5[Static193.anInt7328].setBounds(local21.anInt6964 + arg0, arg1 + local21.anInt7013, local21.anInt7041, local21.anInt6997);
					local45 = Static193.anInt7328++;
				} else {
					local45 = arg6;
				}
				local21.anInt7020 = Static368.anInt6250;
				local21.anInt6962 = local45;
				if (!Static52.method809(local21)) {
					if (local21.anInt6983 != 0) {
						Static427.method5348(local21);
					}
					@Pc(93) int local93 = arg0 + local21.anInt6964;
					@Pc(99) int local99 = local21.anInt7013 + arg1;
					@Pc(102) int local102 = local21.anInt7036;
					if (Static419.aBoolean556 && (Static52.method804(local21).anInt2172 != 0 || local21.anInt7009 == 0) && local102 > 127) {
						local102 = 127;
					}
					@Pc(148) int local148;
					@Pc(152) int local152;
					if (Static68.aClass250_2 == local21) {
						if (arg5 != -1412584499 && (Static209.anInt3369 == local21.anInt7012 || local21.anInt7012 == Static391.anInt6421)) {
							Static436.anInt7238 = arg0;
							Static32.aClass250Array1 = arg2;
							Static88.anInt1566 = arg1;
							continue;
						}
						if (Static359.aBoolean496 && Static245.aBoolean313) {
							local148 = Static210.aClass26_1.method576();
							local152 = Static210.aClass26_1.method574();
							local148 -= Static380.anInt6320;
							local152 -= Static16.anInt3240;
							if (Static15.anInt285 > local148) {
								local148 = Static15.anInt285;
							}
							if (local21.anInt7041 + local148 > Static15.anInt285 - -Static6.aClass250_1.anInt7041) {
								local148 = Static15.anInt285 + Static6.aClass250_1.anInt7041 - local21.anInt7041;
							}
							if (local152 < Static118.anInt2023) {
								local152 = Static118.anInt2023;
							}
							local93 = local148;
							if (Static118.anInt2023 + Static6.aClass250_1.anInt6997 < local21.anInt6997 + local152) {
								local152 = Static118.anInt2023 + Static6.aClass250_1.anInt6997 - local21.anInt6997;
							}
							local99 = local152;
						}
						if (Static391.anInt6421 == local21.anInt7012) {
							local102 = 128;
						}
					}
					@Pc(239) int local239;
					@Pc(241) int local241;
					@Pc(252) int local252;
					@Pc(258) int local258;
					if (local21.anInt7009 == 2) {
						local239 = arg4;
						local241 = arg7;
						local152 = arg8;
						local148 = arg3;
					} else {
						local252 = local21.anInt7041 + local93;
						local258 = local99 + local21.anInt6997;
						local152 = local99 > arg8 ? local99 : arg8;
						local148 = local93 <= arg3 ? arg3 : local93;
						if (local21.anInt7009 == 9) {
							local252++;
							local258++;
						}
						local239 = local252 >= arg4 ? arg4 : local252;
						local241 = arg7 <= local258 ? arg7 : local258;
					}
					if (local239 > local148 && local152 < local241) {
						@Pc(567) int local567;
						@Pc(591) int local591;
						@Pc(593) int local593;
						@Pc(517) int local517;
						@Pc(519) int local519;
						if (local21.anInt6983 != 0) {
							if (local21.anInt6983 == Static363.anInt6140 || local21.anInt6983 == Static406.anInt6569) {
								Static157.method2198(local21.anInt7041, local21.anInt6997, local99, local93, Static406.anInt6569 == local21.anInt6983);
								Static145.aBooleanArray15[local45] = true;
								Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
								continue;
							}
							if (local21.anInt6983 == Static282.anInt4477) {
								if (local21.method5342(Static213.aClass128_22) != null) {
									Static15.method239();
									Static60.method952(local21, local93, local99, Static213.aClass128_22);
									Static308.aBooleanArray24[local45] = true;
									Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
								}
								continue;
							}
							if (local21.anInt6983 == Static33.anInt676) {
								if (local21.method5342(Static213.aClass128_22) != null) {
									Static252.method2869(local99, local21, local93);
									Static308.aBooleanArray24[local45] = true;
									Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
								}
								continue;
							}
							if (local21.anInt6983 == Static439.anInt7306) {
								Static289.method3779(local21.anInt7041, local21.anInt6997, Static213.aClass128_22, local99, local93, Static190.anInterface8_5);
								Static145.aBooleanArray15[local45] = true;
								Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
								continue;
							}
							if (Static26.anInt546 == local21.anInt6983) {
								Static371.method4802(local21.anInt6997, local93, local21.anInt7041, Static213.aClass128_22, local99);
								Static145.aBooleanArray15[local45] = true;
								Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
								continue;
							}
							if (local21.anInt6983 == Static171.anInt2834) {
								if (!Static365.aBoolean510 && !Static273.aBoolean344) {
									continue;
								}
								local252 = local21.anInt7041 + local93;
								local258 = local99 + 15;
								if (Static365.aBoolean510) {
									Static275.aClass16_2.method5492("Fps:" + Static38.anInt741, -256, local252, local258);
									local258 += 15;
									@Pc(507) Runtime local507 = Runtime.getRuntime();
									local517 = (int) ((local507.totalMemory() - local507.freeMemory()) / 1024L);
									local519 = -256;
									if (local517 > 65536) {
										local519 = -65536;
									}
									Static275.aClass16_2.method5492("Mem:" + local517 + "k", local519, local252, local258);
									local258 += 15;
									Static275.aClass16_2.method5492("In:" + Static389.anInt1932 + "B/s Out:" + Static325.anInt5363 + "B/s", -256, local252, local258);
									local258 += 15;
									local567 = Static213.aClass128_22.FA() / 1024;
									Static275.aClass16_2.method5492("Offheap:" + local567 + "k", local567 <= 65536 ? -256 : -65536, local252, local258);
									local258 += 15;
									local591 = 0;
									local593 = 0;
									@Pc(595) int local595 = 0;
									for (@Pc(597) int local597 = 0; local597 < 30; local597++) {
										local591 += Static324.aClass222_Sub1Array1[local597].method4789();
										local593 += Static324.aClass222_Sub1Array1[local597].method4790();
										local595 += Static324.aClass222_Sub1Array1[local597].method4795();
									}
									@Pc(635) int local635 = local595 * 100 / local591;
									@Pc(641) int local641 = local593 * 10000 / local591;
									@Pc(661) String local661 = "Cache:" + Static388.method790((long) local641, true, 0, 2) + "% (" + local635 + "%)";
									Static439.aClass16_4.method5492(local661, -256, local252, local258);
									local258 += 12;
								}
								if (Static10.anInt225 > 0) {
									Static439.aClass16_4.method5492("Particles: " + Static408.anInt6633 + " / " + Static10.anInt225, -256, local252, local258);
								}
								local258 += 12;
								if (Static273.aBoolean344) {
									Static439.aClass16_4.method5492("Polys: " + Static213.aClass128_22.xa() + " Models: " + Static213.aClass128_22.g(), -256, local252, local258);
									local258 += 12;
									Static439.aClass16_4.method5492("Ls: " + Static433.anInt7200 + " La: " + Static158.anInt2644 + " NPC: " + Static275.anInt4348 + " Pl: " + Static120.anInt4989, -256, local252, local258);
									Static454.method5609();
									local258 += 12;
								}
								Static145.aBooleanArray15[local45] = true;
								continue;
							}
						}
						if (local21.anInt7009 == 0) {
							if (Static164.anInt2700 == local21.anInt6983 && Static213.aClass128_22.method3536()) {
								Static213.aClass128_22.method3543(local93, local99, local21.anInt7041, local21.anInt6997);
							}
							method393(local93 - local21.anInt7015, local99 + -local21.anInt6966, arg2, local148, local239, local21.anInt6994, local45, local241, local152);
							if (local21.aClass250Array2 != null) {
								method393(local93 - local21.anInt7015, -local21.anInt6966 + local99, local21.aClass250Array2, local148, local239, local21.anInt6994, local45, local241, local152);
							}
							@Pc(825) Class1_Sub26 local825 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local21.anInt6994);
							if (local825 != null) {
								Static359.method4649(local152, local99, local241, local45, local93, local825.anInt3847, local148, local239);
							}
							if (local21.anInt6983 == Static164.anInt2700 && Static213.aClass128_22.method3536()) {
								Static213.aClass128_22.method3542();
								Static346.aBoolean457 = true;
							}
							Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
						}
						if (Static219.aBooleanArray11[local45] || Static348.anInt5665 > 1) {
							if (local21.anInt7009 == 3) {
								if (local102 == 0) {
									if (local21.aBoolean581) {
										Static213.aClass128_22.NA(local93, local99, local21.anInt7041, local21.anInt6997, local21.anInt7029, 0);
									} else {
										Static213.aClass128_22.method3593(local93, local99, local21.anInt7041, local21.anInt6997, local21.anInt7029, 0);
									}
								} else if (local21.aBoolean581) {
									Static213.aClass128_22.NA(local93, local99, local21.anInt7041, local21.anInt6997, local21.anInt7029 & 0xFFFFFF | 255 - (local102 & 0xFF) << 24, 1);
								} else {
									Static213.aClass128_22.method3593(local93, local99, local21.anInt7041, local21.anInt6997, 255 - (local102 & 0xFF) << 24 | local21.anInt7029 & 0xFFFFFF, 1);
								}
							} else if (local21.anInt7009 == 4) {
								@Pc(959) Class16 local959 = local21.method5350(Static213.aClass128_22);
								if (local959 != null) {
									local258 = local21.anInt7029;
									@Pc(974) String local974 = local21.aString62;
									if (local21.anInt7030 != -1) {
										@Pc(984) Class74 local984 = Static227.aClass65_2.method1327(local21.anInt7030);
										local974 = local984.aString14;
										if (local974 == null) {
											local974 = "null";
										}
										if ((local984.anInt1894 == 1 || local21.anInt7046 != 1) && local21.anInt7046 != -1) {
											local974 = "<col=ff9040>" + local974 + "</col> x" + Static159.method2210(local21.anInt7046);
										}
									}
									if (local21 == Static394.aClass250_13) {
										local974 = Static136.aClass151_78.method3122(Static188.anInt3028);
										local258 = local21.anInt7029;
									}
									if (Static69.aBoolean480) {
										Static213.aClass128_22.Z(local93, local99, local93 + local21.anInt7041, local21.anInt6997 + local99);
									}
									local959.method5485(local99, 255 - (local102 & 0xFF) << 24 | local258, Static361.aClass49Array120, local21.anInt6976, local974, null, 0, local93, local21.anInt6973, 0, local21.aBoolean578 ? 255 - (local102 & 0xFF) << 24 : -1, local21.anInt7039, null, local21.anInt7007, local21.anInt6997, local21.anInt7041);
									if (Static69.aBoolean480) {
										Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
									}
								} else if (Static433.aBoolean592) {
									Static94.method1357(local21);
								}
							} else {
								@Pc(1186) int local1186;
								if (local21.anInt7009 == 5) {
									if (local21.anInt6957 >= 0) {
										local21.method5336(Static128.aClass66_1, Static331.aClass238_1).method5476(0, Static213.aClass128_22, 0, local99, local21.anInt7000 << 3, local21.anInt7041, local93, local21.anInt7026 << 3, local21.anInt6997);
									} else {
										@Pc(1171) Class49 local1171;
										if (local21.anInt7030 == -1) {
											local1171 = local21.method5334(Static213.aClass128_22);
										} else {
											@Pc(1153) Class45 local1153 = local21.aBoolean582 ? Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1 : null;
											local1171 = Static227.aClass65_2.method1333(local21.anInt7030, local21.anInt6996, local1153, local21.anInt6987 | 0xFF000000, Static213.aClass128_22, local21.anInt7046, local21.anInt7019);
										}
										if (local1171 != null) {
											local258 = local1171.ja();
											local1186 = local1171.JA();
											local517 = 255 - (local102 & 0xFF) << 24 | (local21.anInt7029 == 0 ? 16777215 : local21.anInt7029 & 0xFFFFFF);
											if (local21.aBoolean580) {
												Static213.aClass128_22.Z(local93, local99, local93 + local21.anInt7041, local99 - -local21.anInt6997);
												if (local21.anInt7032 != 0) {
													local519 = (local21.anInt7041 + local258 - 1) / local258;
													local567 = (local21.anInt6997 + local1186 - 1) / local1186;
													for (local591 = 0; local591 < local519; local591++) {
														for (local593 = 0; local593 < local567; local593++) {
															if (local21.anInt7029 == 0) {
																local1171.method5641((float) (local591 * local258 + local93) + (float) local258 / 2.0F, (float) local1186 / 2.0F + (float) (local1186 * local593 + local99), 4096, local21.anInt7032);
															} else {
																local1171.method5643((float) local258 / 2.0F + (float) (local93 + local258 * local591), (float) (local99 - -(local593 * local1186)) + (float) local1186 / 2.0F, 4096, local21.anInt7032, local517);
															}
														}
													}
												} else if (local21.anInt7029 == 0 && local102 == 0) {
													local1171.method5642(local93, local99, local21.anInt7041, local21.anInt6997);
												} else {
													local1171.D(local93, local99, local21.anInt7041, local21.anInt6997, 0, local517, 1);
												}
												Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
											} else if (local21.anInt7029 == 0 && local102 == 0) {
												if (local21.anInt7032 != 0) {
													local1171.method5641((float) local93 + (float) local21.anInt7041 / 2.0F, (float) local99 + (float) local21.anInt6997 / 2.0F, local21.anInt7041 * 4096 / local258, local21.anInt7032);
												} else if (local21.anInt7041 == local258 && local21.anInt6997 == local1186) {
													local1171.method5636(local93, local99);
												} else {
													local1171.method5640(local93, local99, local21.anInt7041, local21.anInt6997);
												}
											} else if (local21.anInt7032 != 0) {
												local1171.method5643((float) local93 + (float) local21.anInt7041 / 2.0F, (float) local99 + (float) local21.anInt6997 / 2.0F, local21.anInt7041 * 4096 / local258, local21.anInt7032, local517);
											} else if (local21.anInt7041 == local258 && local1186 == local21.anInt6997) {
												local1171.YA(local93, local99, 0, local517, 1);
											} else {
												local1171.M(local93, local99, local21.anInt7041, local21.anInt6997, 0, local517, 1);
											}
										} else if (Static433.aBoolean592) {
											Static94.method1357(local21);
										}
									}
								} else if (local21.anInt7009 == 6) {
									Static120.method3899();
									@Pc(1530) Class33 local1530 = null;
									local258 = 0;
									@Pc(1564) Class171 local1564;
									@Pc(1572) Class45 local1572;
									if (local21.anInt7030 != -1) {
										@Pc(1543) Class74 local1543 = Static227.aClass65_2.method1327(local21.anInt7030);
										if (local1543 != null) {
											local1543 = local1543.method1493(local21.anInt7046);
											local1564 = local21.anInt6960 == -1 ? null : Static152.aClass213_1.method4410(local21.anInt6960);
											local1572 = local21.aBoolean582 ? Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1 : null;
											local1530 = local1543.method1502(1, Static213.aClass128_22, local21.anInt6980, 2048, local21.anInt6988, local21.anInt7023, local1572, local1564);
											if (local1530 == null) {
												Static94.method1357(local21);
											} else {
												local258 = -local1530.b() >> 1;
											}
										}
									} else if (local21.anInt7024 == 5) {
										local1186 = local21.anInt6981;
										if (local1186 >= 0 && local1186 < 2048) {
											@Pc(1617) Class20_Sub3_Sub3_Sub1 local1617 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local1186];
											@Pc(1630) Class171 local1630 = local21.anInt6960 == -1 ? null : Static152.aClass213_1.method4410(local21.anInt6960);
											if (local1617 != null && (local1186 == Static348.anInt5668 || Static14.method215(local1617.aString48) == local21.anInt6982)) {
												local1530 = local1617.aClass45_1.method982(local21.anInt6988, Static152.aClass213_1, Static213.aClass128_22, Static227.aClass65_2, null, Static304.aClass27_1, local21.anInt7023, Static221.aClass129_2, null, Static364.aClass259_1, Static332.aClass174_1, 0, local21.anInt6980, 2048, -1, local1630, 0);
											}
										}
									} else if (local21.anInt7024 == 8 || local21.anInt7024 == 9) {
										@Pc(1750) Class1_Sub20 local1750 = Static240.method3131(false, local21.anInt6981);
										local1564 = local21.anInt6960 == -1 ? null : Static152.aClass213_1.method4410(local21.anInt6960);
										if (local1750 != null) {
											local1572 = local21.aBoolean582 ? Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1 : null;
											local1530 = local1750.method2332(local21.anInt7024 == 9, local21.anInt6982, local21.anInt7023, Static213.aClass128_22, local1572, local21.anInt6988, local21.anInt6980, local1564);
										}
									} else if (local21.anInt6960 == -1) {
										local1530 = local21.method5338(Static221.aClass129_2, Static332.aClass174_1, Static304.aClass27_1, null, 0, -1, Static152.aClass213_1, Static227.aClass65_2, 2048, Static364.aClass259_1, -1, Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1, Static213.aClass128_22);
										if (local1530 == null && Static433.aBoolean592) {
											Static94.method1357(local21);
										}
									} else {
										@Pc(1689) Class171 local1689 = Static152.aClass213_1.method4410(local21.anInt6960);
										local1530 = local21.method5338(Static221.aClass129_2, Static332.aClass174_1, Static304.aClass27_1, local1689, local21.anInt6988, local21.anInt6980, Static152.aClass213_1, Static227.aClass65_2, 2048, Static364.aClass259_1, local21.anInt7023, Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1, Static213.aClass128_22);
										if (local1530 == null && Static433.aBoolean592) {
											Static94.method1357(local21);
										}
									}
									if (local1530 != null) {
										if (local21.anInt7027 > 0) {
											local1186 = (local21.anInt7041 << 9) / local21.anInt7027;
										} else {
											local1186 = 512;
										}
										if (local21.anInt6955 > 0) {
											local517 = (local21.anInt6997 << 9) / local21.anInt6955;
										} else {
											local517 = 512;
										}
										local519 = local93 + local21.anInt7041 / 2 + (local21.anInt6995 * local1186 >> 9);
										local567 = (local517 * local21.anInt6986 >> 9) + (local99 + (local21.anInt6997 / 2));
										Static217.aClass40_5.HA();
										Static213.aClass128_22.m(Static217.aClass40_5);
										Static213.aClass128_22.GA(local519, local567, local1186, local517);
										Static213.aClass128_22.o((float) (local21.anInt6975 << 0), local21.aBoolean573 ? (float) (local21.anInt6978 << 0) : (float) (local21.anInt6978 << 0) * 1.5F);
										if (arg5 == -1412584499 || Static346.aBoolean457) {
											Static213.aClass128_22.va();
											Static213.aClass128_22.method3582();
											Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
											Static346.aBoolean457 = false;
										}
										if (local21.aBoolean575) {
											Static213.aClass128_22.method3598(false);
										}
										local591 = (local21.anInt6972 << 0) * Class1_Sub1_Sub25.anIntArray249[local21.anInt7006 << 3] >> 15;
										local593 = (local21.anInt6972 << 0) * Class1_Sub1_Sub25.anIntArray248[local21.anInt7006 << 3] >> 15;
										Static136.aClass40_2.ma(-local21.anInt7003 << 3);
										Static136.aClass40_2.c(local21.anInt6961 << 3);
										Static136.aClass40_2.ZA(local21.anInt7045 << 0, local258 + (local21.anInt6993 << 0) + local591, local593 + (local21.anInt6993 << 0));
										Static136.aClass40_2.na(local21.anInt7006 << 3);
										if (Static69.aBoolean480) {
											Static213.aClass128_22.Z(local93, local99, local93 + local21.anInt7041, local21.anInt6997 + local99);
										}
										if (local21.aBoolean573) {
											local1530.method5386(Static136.aClass40_2, null, local21.anInt6972 << 0);
										} else {
											local1530.method5391(Static136.aClass40_2, null, 1);
										}
										if (Static69.aBoolean480) {
											Static213.aClass128_22.pa(arg3, arg8, arg4, arg7);
										}
										if (local21.aBoolean575) {
											Static213.aClass128_22.method3598(true);
										}
										Static213.aClass128_22.o(0.0F, 0.0F);
									}
								} else if (local21.anInt7009 == 9) {
									if (local21.aBoolean584) {
										local1186 = local93 + local21.anInt7041;
										local517 = local99;
										local258 = local21.anInt6997 + local99;
									} else {
										local258 = local99;
										local1186 = local21.anInt7041 + local93;
										local517 = local21.anInt6997 + local99;
									}
									if (local21.anInt7018 == 1) {
										Static213.aClass128_22.method3599(local93, local258, local1186, local517, local21.anInt7029, 0);
									} else {
										Static213.aClass128_22.method3553(local93, local258, local1186, local517, local21.anInt7029, local21.anInt7018);
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
