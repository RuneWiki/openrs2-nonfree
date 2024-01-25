import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "J")
	public static volatile long aLong105 = 0L;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIII)I")
	public static int method3263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static364.aClass51Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg1 >> 9;
		@Pc(20) int local20 = arg0 >> 9;
		if (local16 < 0 || local20 < 0 || Static634.anInt10129 - 1 < local16 || Static638.anInt10172 - 1 < local20) {
			return 0;
		}
		@Pc(48) int local48 = arg2;
		if (arg2 < 3 && (Static513.aByteArrayArrayArray18[1][local16][local20] & 0x2) != 0) {
			local48 = arg2 + 1;
		}
		return Static364.aClass51Array3[local48].method7839(arg1, arg0);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIZ[Lclient!qk;IIIIII)V")
	public static void method3264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class279[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static323.aClass5_9.KA(arg1, arg2, arg6, arg5);
		for (@Pc(13) int local13 = 0; local13 < arg4.length; local13++) {
			@Pc(34) Class279 local34 = arg4[local13];
			if (local34 != null && (arg9 == local34.anInt8203 || arg9 == -1412584499 && local34 == Static608.aClass279_18)) {
				@Pc(60) int local60 = local34.anInt8200 + arg7;
				@Pc(65) int local65 = arg0 + local34.anInt8139;
				@Pc(72) int local72 = local34.anInt8153 + local60 + 1;
				@Pc(79) int local79 = local34.anInt8141 + local65 + 1;
				@Pc(106) int local106;
				if (arg8 == -1) {
					Class10_Sub2.aRectangleArray2[Static619.anInt10014].setBounds(local34.anInt8200 + arg7, arg0 + local34.anInt8139, local34.anInt8153, local34.anInt8141);
					local106 = Static619.anInt10014++;
				} else {
					local106 = arg8;
				}
				local34.anInt8215 = local106;
				local34.anInt8208 = Static101.anInt2262;
				if (!Static76.method1836(local34)) {
					if (local34.anInt8137 != 0) {
						Static19.method899(local34);
					}
					@Pc(133) int local133 = arg7 + local34.anInt8200;
					@Pc(138) int local138 = local34.anInt8139 + arg0;
					@Pc(140) int local140 = 0;
					@Pc(142) int local142 = 0;
					if (Static219.aBoolean285) {
						local140 = Static30.method1089();
						local142 = Static166.method2921();
					}
					@Pc(153) int local153 = local34.anInt8168;
					if (Static351.aBoolean491 && (Static76.method1833(local34).anInt2466 != 0 || local34.anInt8204 == 0) && local153 > 127) {
						local153 = 127;
					}
					@Pc(202) int local202;
					@Pc(208) int local208;
					if (local34 == Static608.aClass279_18) {
						if (arg9 != -1412584499 && (Static320.anInt6023 == local34.anInt8187 || local34.anInt8187 == Static444.anInt8952)) {
							Static76.aClass279Array1 = arg4;
							Static146.anInt2907 = arg0;
							Static191.anInt3612 = arg7;
							continue;
						}
						if (Static557.aBoolean671 && Static465.aBoolean562) {
							local202 = Static483.aClass191_1.method6989() + local140;
							local208 = Static483.aClass191_1.method6982() + local142;
							local208 -= Static448.anInt7978;
							local202 -= Static219.anInt4151;
							if (local202 < Static322.anInt6043) {
								local202 = Static322.anInt6043;
							}
							if (Static322.anInt6043 + Static220.aClass279_6.anInt8153 < local34.anInt8153 + local202) {
								local202 = Static322.anInt6043 + Static220.aClass279_6.anInt8153 - local34.anInt8153;
							}
							if (Static92.anInt2193 > local208) {
								local208 = Static92.anInt2193;
							}
							local133 = local202;
							if (Static92.anInt2193 + Static220.aClass279_6.anInt8141 < local34.anInt8141 + local208) {
								local208 = Static220.aClass279_6.anInt8141 + Static92.anInt2193 - local34.anInt8141;
							}
							local138 = local208;
						}
						if (local34.anInt8187 == Static444.anInt8952) {
							local153 = 128;
						}
					}
					@Pc(287) int local287;
					@Pc(289) int local289;
					@Pc(296) int local296;
					@Pc(302) int local302;
					if (local34.anInt8204 == 2) {
						local202 = arg1;
						local208 = arg2;
						local287 = arg6;
						local289 = arg5;
					} else {
						local296 = local34.anInt8153 + local133;
						local302 = local138 + local34.anInt8141;
						local202 = local133 > arg1 ? local133 : arg1;
						if (local34.anInt8204 == 9) {
							local296++;
							local302++;
						}
						local208 = arg2 < local138 ? local138 : arg2;
						local287 = local296 < arg6 ? local296 : arg6;
						local289 = arg5 <= local302 ? arg5 : local302;
					}
					if (local202 < local287 && local289 > local208) {
						@Pc(640) int local640;
						@Pc(651) int local651;
						@Pc(746) int local746;
						@Pc(607) int local607;
						@Pc(638) int local638;
						if (local34.anInt8137 != 0) {
							if (local34.anInt8137 == Static198.anInt8759 || local34.anInt8137 == Static334.anInt6286) {
								Static556.method8021(local138, local34, local133);
								if (!Static219.aBoolean285) {
									Static595.method8718(local133, local138, Static334.anInt6286 == local34.anInt8137, local34.anInt8153, local34.anInt8141);
									Static323.aClass5_9.KA(arg1, arg2, arg6, arg5);
								}
								Static477.aBooleanArray21[local106] = true;
								continue;
							}
							if (Static470.anInt8250 == local34.anInt8137) {
								if (local34.method7073(Static323.aClass5_9) != null) {
									Static1.method8294();
									Static460.method7013(local34, Static323.aClass5_9, local133, local138);
									Static314.aBooleanArray17[local106] = true;
									Static323.aClass5_9.KA(arg1, arg2, arg6, arg5);
									if (Static219.aBoolean285) {
										if (arg3) {
											Static520.method8069(local60, local65, local72, local79);
										} else {
											Static533.method7801(local79, local72, local65, local60);
										}
									}
								}
								continue;
							}
							if (local34.anInt8137 == Static636.anInt10159) {
								if (local34.method7073(Static323.aClass5_9) != null) {
									Static303.method4829(local34, local133, local138);
									Static314.aBooleanArray17[local106] = true;
									Static323.aClass5_9.KA(arg1, arg2, arg6, arg5);
									if (Static219.aBoolean285) {
										if (arg3) {
											Static520.method8069(local60, local65, local72, local79);
										} else {
											Static533.method7801(local79, local72, local65, local60);
										}
									}
								}
								continue;
							}
							if (local34.anInt8137 == Static511.anInt8835) {
								Static219.method3677(local34.anInt8153, local138, Static473.anInterface7_14, local133, Static323.aClass5_9, local34.anInt8141);
								Static477.aBooleanArray21[local106] = true;
								Static323.aClass5_9.KA(arg1, arg2, arg6, arg5);
								continue;
							}
							if (local34.anInt8137 == Static334.anInt6285) {
								Static532.method7798(local34.anInt8141, local133, local138, Static323.aClass5_9, local34.anInt8153);
								Static477.aBooleanArray21[local106] = true;
								Static323.aClass5_9.KA(arg1, arg2, arg6, arg5);
								continue;
							}
							if (local34.anInt8137 == Static300.anInt5338) {
								if (!Static106.aBoolean155 && !Static506.aBoolean620) {
									continue;
								}
								local296 = local133 + local34.anInt8153;
								local302 = local138 + 15;
								if (Static219.aBoolean285) {
									if (arg3) {
										Static520.method8069(local60, local65, local72, local79);
									} else {
										Static533.method7801(local79, local72, local65, local60);
									}
								}
								if (Static106.aBoolean155) {
									local607 = -256;
									if (Static295.anInt5199 < 20) {
										local607 = -65536;
									}
									Static187.aClass62_4.method8366(-1, local296, "Fps:" + Static295.anInt5199, local302, local607);
									local302 += 15;
									@Pc(629) Runtime local629 = Runtime.getRuntime();
									local638 = (int) ((local629.totalMemory() - local629.freeMemory()) / 1024L);
									local640 = -256;
									if (local638 > 98304) {
										if (Static574.aBoolean677) {
											Static173.method3039();
											for (local651 = 0; local651 < 10; local651++) {
												System.gc();
											}
											local638 = (int) ((local629.totalMemory() - local629.freeMemory()) / 1024L);
											if (local638 > 65536) {
												Static612.method8491("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local640 = -65536;
									}
									Static187.aClass62_4.method8366(-1, local296, "Mem:" + local638 + "k", local302, local640);
									local302 += 15;
									Static187.aClass62_4.method8366(-1, local296, "In:" + Static272.anInt4940 + "B/s Out:" + Static277.anInt4995 + "B/s", local302, -256);
									local302 += 15;
									local651 = Static323.aClass5_9.E() / 1024;
									Static187.aClass62_4.method8366(-1, local296, "Offheap:" + local651 + "k", local302, local651 <= 65536 ? -256 : -65536);
									local302 += 15;
									local746 = 0;
									@Pc(748) int local748 = 0;
									@Pc(750) int local750 = 0;
									for (@Pc(752) int local752 = 0; local752 < 37; local752++) {
										if (Static534.aClass147_Sub1Array2[local752] != null) {
											local746 += Static534.aClass147_Sub1Array2[local752].method7349();
											local748 += Static534.aClass147_Sub1Array2[local752].method7350();
											local750 += Static534.aClass147_Sub1Array2[local752].method7353();
										}
									}
									@Pc(794) int local794 = local750 * 100 / local746;
									@Pc(800) int local800 = local748 * 10000 / local746;
									@Pc(820) String local820 = "Cache:" + Static423.method6621(2, 0, (long) local800, true) + "% (" + local794 + "%)";
									Static557.aClass62_12.method8366(-1, local296, local820, local302, -256);
									local302 += 12;
								}
								if (Static622.anInt10061 > 0) {
									Static557.aClass62_12.method8366(-1, local296, "Particles: " + Static455.anInt8041 + " / " + Static622.anInt10061, local302, -256);
								}
								local302 += 12;
								if (Static506.aBoolean620) {
									Static557.aClass62_12.method8366(-1, local296, "Polys: " + Static323.aClass5_9.I() + " Models: " + Static323.aClass5_9.M(), local302, -256);
									local302 += 12;
									Static557.aClass62_12.method8366(-1, local296, "Ls: " + Static23.anInt925 + " La: " + Static588.anInt9613 + " NPC: " + Static387.anInt7217 + " Pl: " + Static410.anInt7495, local302, -256);
									local302 += 12;
									Static546.method7958();
								}
								Static477.aBooleanArray21[local106] = true;
								continue;
							}
						}
						if (local34.anInt8204 == 0) {
							if (local34.anInt8137 == Static317.anInt5960 && Static323.aClass5_9.method7516()) {
								Static323.aClass5_9.method7562(local133, local138, local34.anInt8153, local34.anInt8141);
							}
							method3264(local138 - local34.anInt8130, local202, local208, arg3, arg4, local289, local287, local133 - local34.anInt8136, local106, local34.anInt8185);
							if (local34.aClass279Array2 != null) {
								method3264(local138 - local34.anInt8130, local202, local208, arg3, local34.aClass279Array2, local289, local287, local133 - local34.anInt8136, local106, local34.anInt8185);
							}
							@Pc(982) Class3_Sub29 local982 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local34.anInt8185);
							if (local982 != null) {
								Static32.method6779(local106, local208, local133, local138, local289, local287, local982.anInt4601, local202);
							}
							if (Static317.anInt5960 == local34.anInt8137 && Static323.aClass5_9.method7516()) {
								Static323.aClass5_9.method7489();
							}
							Static323.aClass5_9.KA(arg1, arg2, arg6, arg5);
						}
						if (Static504.aBooleanArray23[local106] || Static277.anInt4996 > 1) {
							if (local34.anInt8204 == 3) {
								if (local153 == 0) {
									if (local34.aBoolean565) {
										Static323.aClass5_9.aa(local133, local138, local34.anInt8153, local34.anInt8141, local34.anInt8150, 0);
									} else {
										Static323.aClass5_9.method7506(local133, local138, local34.anInt8153, local34.anInt8141, local34.anInt8150, 0);
									}
								} else if (local34.aBoolean565) {
									Static323.aClass5_9.aa(local133, local138, local34.anInt8153, local34.anInt8141, local34.anInt8150 & 0xFFFFFF | 255 - (local153 & 0xFF) << 24, 1);
								} else {
									Static323.aClass5_9.method7506(local133, local138, local34.anInt8153, local34.anInt8141, local34.anInt8150 & 0xFFFFFF | 255 - (local153 & 0xFF) << 24, 1);
								}
								if (Static219.aBoolean285) {
									if (arg3) {
										Static520.method8069(local60, local65, local72, local79);
									} else {
										Static533.method7801(local79, local72, local65, local60);
									}
								}
							} else if (local34.anInt8204 == 4) {
								@Pc(1140) Class62 local1140 = local34.method7078(Static323.aClass5_9);
								if (local1140 != null) {
									local302 = local34.anInt8150;
									@Pc(1155) String local1155 = local34.aString92;
									if (local34.anInt8217 != -1) {
										@Pc(1166) Class38 local1166 = Static320.aClass53_2.method1770(local34.anInt8217);
										local1155 = local1166.aString6;
										if (local1155 == null) {
											local1155 = "null";
										}
										if ((local1166.anInt1434 == 1 || local34.anInt8155 != 1) && local34.anInt8155 != -1) {
											local1155 = "<col=ff9040>" + local1155 + "</col> x" + Static503.method7434(local34.anInt8155);
										}
									}
									if (local34.anInt8213 != -1) {
										local1155 = Static56.method1574(local34.anInt8213);
										if (local1155 == null) {
											local1155 = "";
										}
									}
									if (Static25.aClass279_13 == local34) {
										local1155 = Static59.aClass43_31.method1598(Static325.anInt6083);
										local302 = local34.anInt8150;
									}
									if (Static327.aBoolean434) {
										Static323.aClass5_9.T(local133, local138, local133 + local34.anInt8153, local34.anInt8141 + local138);
									}
									local1140.method8369(local133, local34.anInt8163, local34.aBoolean572 ? 255 - (local153 & 0xFF) << 24 : -1, 0, local1155, local34.anInt8141, local34.anInt8180, null, null, local138, local302 | 255 - (local153 & 0xFF) << 24, 0, local34.anInt8197, Static135.aClass24Array7, local34.anInt8153, local34.anInt8220);
									if (Static327.aBoolean434) {
										Static323.aClass5_9.KA(arg1, arg2, arg6, arg5);
									}
									if (local1155.trim().length() > 0) {
										if (!Static327.aBoolean434) {
											@Pc(1307) Class282 local1307 = Static89.method2005(Static323.aClass5_9, local34.anInt8144);
											local638 = local1307.method7139(local34.anInt8153, local1155, Static135.aClass24Array7);
											local640 = local1307.method7137(local34.anInt8153, Static135.aClass24Array7, local1155, local34.anInt8197);
											if (Static219.aBoolean285) {
												if (arg3) {
													Static520.method8069(local133, local138, local133 + local638, local138 + local640);
												} else {
													Static533.method7801(local138 + local640, local638 + local133, local138, local133);
												}
											}
										} else if (Static219.aBoolean285) {
											if (arg3) {
												Static520.method8069(local60, local65, local72, local79);
											} else {
												Static533.method7801(local79, local72, local65, local60);
											}
										}
									}
								} else if (Static534.aBoolean649) {
									Static482.method7193(local34);
								}
							} else {
								@Pc(1463) int local1463;
								if (local34.anInt8204 == 5) {
									if (local34.anInt8172 < 0) {
										@Pc(1399) Class24 local1399;
										if (local34.anInt8217 != -1) {
											@Pc(1416) Class178 local1416 = local34.aBoolean567 ? Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1 : null;
											local1399 = Static320.aClass53_2.method1772(local34.anInt8169 | 0xFF000000, local34.anInt8155, local1416, local34.anInt8196, local34.anInt8156, Static323.aClass5_9, local34.anInt8217);
										} else if (local34.anInt8213 == -1) {
											local1399 = local34.method7066(Static323.aClass5_9);
										} else {
											local1399 = Static413.method6523(local34.anInt8213, Static323.aClass5_9);
										}
										if (local1399 != null) {
											local302 = local1399.method8576();
											local607 = local1399.method8573();
											local1463 = 255 - (local153 & 0xFF) << 24 | (local34.anInt8150 == 0 ? 16777215 : local34.anInt8150 & 0xFFFFFF);
											if (local34.aBoolean574) {
												Static323.aClass5_9.T(local133, local138, local34.anInt8153 + local133, local34.anInt8141 + local138);
												if (local34.anInt8174 != 0) {
													local638 = (local302 + local34.anInt8153 - 1) / local302;
													local640 = (local34.anInt8141 + local607 - 1) / local607;
													for (local651 = 0; local651 < local638; local651++) {
														for (local746 = 0; local746 < local640; local746++) {
															if (local34.anInt8150 == 0) {
																local1399.method8568((float) local302 / 2.0F + (float) (local133 + local651 * local302), (float) local607 / 2.0F + (float) (local607 * local746 + local138), 4096, local34.anInt8174);
															} else {
																local1399.method8566((float) local302 / 2.0F + (float) (local133 + local651 * local302), (float) (local607 * local746 + local138) + (float) local607 / 2.0F, 4096, local34.anInt8174, local1463);
															}
														}
													}
												} else if (local34.anInt8150 == 0 && local153 == 0) {
													local1399.method8571(local133, local138, local34.anInt8153, local34.anInt8141);
												} else {
													local1399.method8572(local133, local138, local34.anInt8153, local34.anInt8141, 0, local1463, 1);
												}
												Static323.aClass5_9.KA(arg1, arg2, arg6, arg5);
											} else if (local34.anInt8150 == 0 && local153 == 0) {
												if (local34.anInt8174 != 0) {
													local1399.method8568((float) local133 + (float) local34.anInt8153 / 2.0F, (float) local34.anInt8141 / 2.0F + (float) local138, local34.anInt8153 * 4096 / local302, local34.anInt8174);
												} else if (local302 == local34.anInt8153 && local607 == local34.anInt8141) {
													local1399.method8559(local133, local138);
												} else {
													local1399.method8564(local133, local138, local34.anInt8153, local34.anInt8141);
												}
											} else if (local34.anInt8174 != 0) {
												local1399.method8566((float) local133 + (float) local34.anInt8153 / 2.0F, (float) local138 + (float) local34.anInt8141 / 2.0F, local34.anInt8153 * 4096 / local302, local34.anInt8174, local1463);
											} else if (local34.anInt8153 == local302 && local34.anInt8141 == local607) {
												local1399.method8570(local133, local138, 0, local1463, 1);
											} else {
												local1399.method8562(local133, local138, local34.anInt8153, local34.anInt8141, 0, local1463, 1);
											}
										} else if (Static534.aBoolean649) {
											Static482.method7193(local34);
										}
									} else {
										local34.method7071(Static229.aClass306_1, Static300.aClass186_1).method8025(local34.anInt8154 << 3, local133, 0, local34.anInt8141, local34.anInt8153, local34.anInt8146 << 3, 0, Static323.aClass5_9, local138);
									}
									if (Static219.aBoolean285) {
										if (arg3) {
											Static520.method8069(local60, local65, local72, local79);
										} else {
											Static533.method7801(local79, local72, local65, local60);
										}
									}
								} else if (local34.anInt8204 == 6) {
									Static553.method7994();
									@Pc(1803) Class17 local1803 = null;
									local302 = 0;
									@Pc(1836) Class361 local1836;
									@Pc(1844) Class178 local1844;
									if (local34.anInt8217 != -1) {
										@Pc(1815) Class38 local1815 = Static320.aClass53_2.method1770(local34.anInt8217);
										if (local1815 != null) {
											local1815 = local1815.method1483(local34.anInt8155);
											local1836 = local34.anInt8175 == -1 ? null : Static115.aClass227_1.method5968(local34.anInt8175);
											local1844 = local34.aBoolean567 ? Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1 : null;
											local1803 = local1815.method1484(local1844, 2048, local34.anInt8145, 1, local34.anInt8135, Static323.aClass5_9, local34.anInt8179, local1836);
											if (local1803 == null) {
												Static482.method7193(local34);
											} else {
												local302 = -local1803.fa() >> 1;
											}
										}
									} else if (local34.anInt8152 == 5) {
										local607 = local34.anInt8214;
										if (local607 >= 0 && local607 < 2048) {
											@Pc(2027) Class4_Sub1_Sub2_Sub1_Sub2 local2027 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local607];
											@Pc(2039) Class361 local2039 = local34.anInt8175 == -1 ? null : Static115.aClass227_1.method5968(local34.anInt8175);
											if (local2027 != null && (Static97.anInt2234 == local607 || Static142.method7673(local2027.aString63) == local34.anInt8142)) {
												local1803 = local2027.aClass178_1.method4493(-1, Static373.aClass150_1, null, 0, local2039, Static547.aClass177_2, Static115.aClass227_1, 0, local34.anInt8179, Static53.aClass286_6, Static323.aClass5_9, local34.anInt8135, local34.anInt8145, Static78.aClass261_1, Static320.aClass53_2, null, 2048, 0, null);
											}
										}
									} else if (local34.anInt8152 == 8 || local34.anInt8152 == 9) {
										@Pc(1965) Class3_Sub32 local1965 = Static210.method3568(false, local34.anInt8214);
										local1836 = local34.anInt8175 == -1 ? null : Static115.aClass227_1.method5968(local34.anInt8175);
										if (local1965 != null) {
											local1844 = local34.aBoolean567 ? Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1 : null;
											local1803 = local1965.method4517(local34.anInt8179, local34.anInt8145, local1836, Static323.aClass5_9, local34.anInt8142, local34.anInt8152 == 9, local34.anInt8135, local1844);
										}
									} else if (local34.anInt8175 == -1) {
										local1803 = local34.method7077(Static53.aClass286_6, Static373.aClass150_1, Static323.aClass5_9, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1, Static78.aClass261_1, Static547.aClass177_2, -1, 0, -1, Static115.aClass227_1, null, 2048, Static320.aClass53_2);
										if (local1803 == null && Static534.aBoolean649) {
											Static482.method7193(local34);
										}
									} else {
										@Pc(1928) Class361 local1928 = Static115.aClass227_1.method5968(local34.anInt8175);
										local1803 = local34.method7077(Static53.aClass286_6, Static373.aClass150_1, Static323.aClass5_9, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1, Static78.aClass261_1, Static547.aClass177_2, local34.anInt8135, local34.anInt8145, local34.anInt8179, Static115.aClass227_1, local1928, 2048, Static320.aClass53_2);
										if (local1803 == null && Static534.aBoolean649) {
											Static482.method7193(local34);
										}
									}
									if (local1803 != null) {
										if (local34.anInt8149 > 0) {
											local607 = (local34.anInt8153 << 9) / local34.anInt8149;
										} else {
											local607 = 512;
										}
										if (local34.anInt8166 > 0) {
											local1463 = (local34.anInt8141 << 9) / local34.anInt8166;
										} else {
											local1463 = 512;
										}
										local638 = local34.anInt8153 / 2 + local133;
										local640 = local138 + local34.anInt8141 / 2;
										if (!local34.aBoolean573) {
											local638 += local34.anInt8189 * local607 >> 9;
											local640 += local1463 * local34.anInt8221 >> 9;
										}
										Static250.aClass39_4.method7246();
										Static323.aClass5_9.method7504(Static250.aClass39_4);
										Static323.aClass5_9.DA(local638, local640, local607, local1463);
										Static323.aClass5_9.ya();
										if (local34.aBoolean577) {
											Static323.aClass5_9.C(false);
										}
										if (local34.aBoolean573) {
											Static1.aClass39_12.method7237(local34.anInt8218);
											Static1.aClass39_12.method7247(local34.anInt8188);
											Static1.aClass39_12.method7252(local34.anInt8162);
											Static1.aClass39_12.method7244(local34.anInt8189, local34.anInt8221, local34.anInt8206);
										} else {
											local651 = (local34.anInt8201 << 2) * Class21.anIntArray656[local34.anInt8218 << 3] >> 14;
											local746 = (local34.anInt8201 << 2) * Class21.anIntArray655[local34.anInt8218 << 3] >> 14;
											Static1.aClass39_12.method7253(-local34.anInt8162 << 3);
											Static1.aClass39_12.method7247(local34.anInt8188 << 3);
											Static1.aClass39_12.method7244(local34.anInt8140 << 2, (local34.anInt8176 << 2) + local651 + local302, local746 - -(local34.anInt8176 << 2));
											Static1.aClass39_12.method7255(local34.anInt8218 << 3);
										}
										local34.method7064(Static1.aClass39_12, local1803, Static323.aClass5_9, Static101.anInt2262);
										if (Static327.aBoolean434) {
											Static323.aClass5_9.T(local133, local138, local34.anInt8153 + local133, local34.anInt8141 + local138);
										}
										if (local34.aBoolean573) {
											if (local34.aBoolean571) {
												local1803.method5413(Static1.aClass39_12, null, local34.anInt8201, 1);
											} else {
												local1803.method5411(Static1.aClass39_12, null, 1);
												if (local34.aClass4_Sub10_7 != null) {
													Static323.aClass5_9.method7538(local34.aClass4_Sub10_7.method7846());
												}
											}
										} else if (local34.aBoolean571) {
											local1803.method5413(Static1.aClass39_12, null, local34.anInt8201 << 2, 1);
										} else {
											local1803.method5411(Static1.aClass39_12, null, 1);
											if (local34.aClass4_Sub10_7 != null) {
												Static323.aClass5_9.method7538(local34.aClass4_Sub10_7.method7846());
											}
										}
										if (Static327.aBoolean434) {
											Static323.aClass5_9.KA(arg1, arg2, arg6, arg5);
										}
										if (local34.aBoolean577) {
											Static323.aClass5_9.C(true);
										}
									}
									if (Static219.aBoolean285) {
										if (arg3) {
											Static520.method8069(local60, local65, local72, local79);
										} else {
											Static533.method7801(local79, local72, local65, local60);
										}
									}
								} else if (local34.anInt8204 == 9) {
									if (local34.aBoolean578) {
										local607 = local133 + local34.anInt8153;
										local302 = local34.anInt8141 + local138;
										local1463 = local138;
									} else {
										local1463 = local34.anInt8141 + local138;
										local607 = local133 + local34.anInt8153;
										local302 = local138;
									}
									if (local34.anInt8205 == 1) {
										Static323.aClass5_9.method7537(local133, local302, local607, local1463, local34.anInt8150, 0);
									} else {
										Static323.aClass5_9.method7496(local133, local302, local607, local1463, local34.anInt8150, local34.anInt8205);
									}
									if (Static219.aBoolean285) {
										if (arg3) {
											Static520.method8069(local60, local65, local72, local79);
										} else {
											Static533.method7801(local79, local72, local65, local60);
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

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Lclient!dj;")
	public static Class74 method3265(@OriginalArg(0) int arg0) {
		@Pc(8) Class74[] local8 = Static494.method7320();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			if (arg0 == local8[local15].anInt2256) {
				return local8[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIB)Z")
	public static boolean method3266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V")
	public static void method3267() {
		if (Static71.aClass5_17 != null) {
			Static71.aClass5_17.method7548();
			Static71.aClass5_17 = null;
			Static292.aClass62_10 = null;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILclient!cs;)V")
	public static void method3268(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1_Sub2_Sub1 arg1) {
		if (arg1.anIntArray306 == null) {
			return;
		}
		@Pc(13) int local13 = arg1.anIntArray306[arg0 + 1];
		if (local13 == arg1.anInt5718) {
			return;
		}
		arg1.anInt5777 = 1;
		arg1.anInt5723 = 0;
		arg1.anInt5763 = 0;
		arg1.anInt5793 = arg1.anInt5792;
		arg1.anInt5718 = local13;
		arg1.anInt5770 = 0;
		if (arg1.anInt5718 != -1) {
			Static74.method1765(arg1.anInt5770, Static115.aClass227_1.method5968(arg1.anInt5718), arg1);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public static void method3270() {
		if (!Static359.aBoolean496) {
			return;
		}
		while (true) {
			while (Static100.anInt2253 < Static528.aClass96_Sub1Array2.length) {
				@Pc(29) Class96_Sub1 local29 = Static528.aClass96_Sub1Array2[Static100.anInt2253];
				if (local29 != null && local29.anInt3304 == -1) {
					if (Static442.aClass3_Sub42_1 == null) {
						Static442.aClass3_Sub42_1 = Static465.aClass27_1.method1257(local29.aString29);
					}
					@Pc(53) int local53 = Static442.aClass3_Sub42_1.anInt7574;
					if (local53 == -1) {
						return;
					}
					Static100.anInt2253++;
					local29.anInt3304 = local53;
					Static442.aClass3_Sub42_1 = null;
				} else {
					Static100.anInt2253++;
				}
			}
			return;
		}
	}
}
