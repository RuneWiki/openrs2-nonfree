import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!eu;")
	public static Class92 aClass92_3;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!ur;")
	public static Class345 aClass345_13;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "[I")
	public static int[] anIntArray421;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public static int anInt7846 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZIIIZIIIII[Lclient!tp;)V")
	public static void method6493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class331[] arg9) {
		Static171.aClass16_5.KA(arg0, arg6, arg2, arg4);
		for (@Pc(13) int local13 = 0; local13 < arg9.length; local13++) {
			@Pc(19) Class331 local19 = arg9[local13];
			if (local19 != null && (local19.anInt9509 == arg8 || arg8 == -1412584499 && local19 == Static10.aClass331_3)) {
				@Pc(43) int local43 = local19.anInt9528 + arg7;
				@Pc(48) int local48 = arg1 + local19.anInt9541;
				@Pc(56) int local56 = local43 + local19.anInt9553 + 1;
				@Pc(63) int local63 = local19.anInt9505 + local48 + 1;
				@Pc(69) int local69;
				if (arg5 == -1) {
					Class8_Sub5_Sub1_Sub2.aRectangleArray2[Static259.anInt5574].setBounds(arg7 + local19.anInt9528, arg1 + local19.anInt9541, local19.anInt9553, local19.anInt9505);
					local69 = Static259.anInt5574++;
				} else {
					local69 = arg5;
				}
				local19.anInt9502 = local69;
				local19.anInt9558 = Static435.anInt8192;
				if (!Static73.method1927(local19)) {
					if (local19.anInt9556 != 0) {
						Static334.method5416(local19);
					}
					@Pc(113) int local113 = arg7 + local19.anInt9528;
					@Pc(118) int local118 = arg1 + local19.anInt9541;
					@Pc(120) int local120 = 0;
					@Pc(122) int local122 = 0;
					if (Static513.aBoolean642) {
						local120 = Static550.method8313();
						local122 = Static530.method7484();
					}
					@Pc(133) int local133 = local19.anInt9564;
					if (Static54.aBoolean127 && (Static73.method1921(local19).anInt6421 != 0 || local19.anInt9490 == 0) && local133 > 127) {
						local133 = 127;
					}
					@Pc(186) int local186;
					@Pc(192) int local192;
					if (Static10.aClass331_3 == local19) {
						if (arg8 != -1412584499 && (local19.anInt9496 == Static452.anInt8305 || local19.anInt9496 == Static95.anInt2616)) {
							Static134.anInt3555 = arg7;
							Static508.aClass331Array1 = arg9;
							Static384.anInt7467 = arg1;
							continue;
						}
						if (Static599.aBoolean733 && Static205.aBoolean341) {
							local186 = local120 + Static288.aClass35_6.method5764();
							local192 = Static288.aClass35_6.method5761() + local122;
							local186 -= Static39.anInt1469;
							local192 -= Static632.anInt10539;
							if (Static256.anInt3672 > local186) {
								local186 = Static256.anInt3672;
							}
							if (Static256.anInt3672 + Static514.aClass331_15.anInt9553 < local19.anInt9553 + local186) {
								local186 = Static256.anInt3672 + Static514.aClass331_15.anInt9553 - local19.anInt9553;
							}
							if (Static258.anInt5551 > local192) {
								local192 = Static258.anInt5551;
							}
							if (local19.anInt9505 + local192 > Static514.aClass331_15.anInt9505 + Static258.anInt5551) {
								local192 = Static514.aClass331_15.anInt9505 + Static258.anInt5551 - local19.anInt9505;
							}
							local113 = local186;
							local118 = local192;
						}
						if (local19.anInt9496 == Static95.anInt2616) {
							local133 = 128;
						}
					}
					@Pc(275) int local275;
					@Pc(271) int local271;
					@Pc(285) int local285;
					@Pc(290) int local290;
					if (local19.anInt9490 == 2) {
						local271 = arg4;
						local192 = arg6;
						local275 = arg2;
						local186 = arg0;
					} else {
						local285 = local113 + local19.anInt9553;
						local290 = local118 + local19.anInt9505;
						local192 = local118 <= arg6 ? arg6 : local118;
						local186 = arg0 < local113 ? local113 : arg0;
						if (local19.anInt9490 == 9) {
							local285++;
							local290++;
						}
						local271 = local290 >= arg4 ? arg4 : local290;
						local275 = arg2 <= local285 ? arg2 : local285;
					}
					if (local275 > local186 && local271 > local192) {
						@Pc(629) int local629;
						@Pc(642) int local642;
						@Pc(739) int local739;
						@Pc(593) int local593;
						@Pc(627) int local627;
						if (local19.anInt9556 != 0) {
							if (local19.anInt9556 == Static615.anInt10350 || local19.anInt9556 == Static114.anInt2982) {
								Static385.method8094(local118, local113, local19);
								if (!Static513.aBoolean642) {
									Static365.method5686(local118, local19.anInt9505, local113, local19.anInt9553, local19.anInt9556 == Static114.anInt2982);
									Static171.aClass16_5.KA(arg0, arg6, arg2, arg4);
								}
								Static620.aBooleanArray29[local69] = true;
								continue;
							}
							if (Static418.anInt7918 == local19.anInt9556) {
								if (local19.method7750(Static171.aClass16_5) != null) {
									Static92.method2160();
									Static520.method7421(local19, local113, Static171.aClass16_5, local118);
									Static10.aBooleanArray1[local69] = true;
									Static171.aClass16_5.KA(arg0, arg6, arg2, arg4);
									if (Static513.aBoolean642) {
										if (arg3) {
											Static460.method6945(local48, local63, local43, local56);
										} else {
											Static544.method7671(local43, local63, local56, local48);
										}
									}
								}
								continue;
							}
							if (Static592.anInt10136 == local19.anInt9556) {
								if (local19.method7750(Static171.aClass16_5) != null) {
									Static311.method8383(local19, local118, local113);
									Static10.aBooleanArray1[local69] = true;
									Static171.aClass16_5.KA(arg0, arg6, arg2, arg4);
									if (Static513.aBoolean642) {
										if (arg3) {
											Static460.method6945(local48, local63, local43, local56);
										} else {
											Static544.method7671(local43, local63, local56, local48);
										}
									}
								}
								continue;
							}
							if (local19.anInt9556 == Static136.anInt3569) {
								Static70.method1797(Static118.anInterface2_10, Static171.aClass16_5, local113, local19.anInt9505, local118, local19.anInt9553);
								Static620.aBooleanArray29[local69] = true;
								Static171.aClass16_5.KA(arg0, arg6, arg2, arg4);
								continue;
							}
							if (Static146.anInt3694 == local19.anInt9556) {
								Static569.method7902(local19.anInt9553, local19.anInt9505, local118, Static171.aClass16_5, local113);
								Static620.aBooleanArray29[local69] = true;
								Static171.aClass16_5.KA(arg0, arg6, arg2, arg4);
								continue;
							}
							if (local19.anInt9556 == Static366.anInt6950) {
								if (!Static450.aBoolean595 && !Static42.aBoolean119) {
									continue;
								}
								local285 = local19.anInt9553 + local113;
								local290 = local118 + 15;
								if (Static513.aBoolean642) {
									if (arg3) {
										Static460.method6945(local48, local63, local43, local56);
									} else {
										Static544.method7671(local43, local63, local56, local48);
									}
								}
								if (Static450.aBoolean595) {
									local593 = -256;
									if (Static563.anInt9710 < 20) {
										local593 = -65536;
									}
									Static634.aClass27_19.method6992(local593, "Fps:" + Static563.anInt9710, local290, -1, local285);
									local290 += 15;
									@Pc(617) Runtime local617 = Runtime.getRuntime();
									local627 = (int) ((local617.totalMemory() - local617.freeMemory()) / 1024L);
									local629 = -256;
									if (local627 > 98304) {
										local629 = -65536;
										if (Static358.aBoolean480) {
											Static466.method7018();
											for (local642 = 0; local642 < 10; local642++) {
												System.gc();
											}
											local627 = (int) ((local617.totalMemory() - local617.freeMemory()) / 1024L);
											if (local627 > 65536) {
												Static353.method5583("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static634.aClass27_19.method6992(local629, "Mem:" + local627 + "k", local290, -1, local285);
									local290 += 15;
									Static634.aClass27_19.method6992(-256, "In:" + Static221.anInt5063 + "B/s Out:" + Static12.anInt163 + "B/s", local290, -1, local285);
									local290 += 15;
									local642 = Static171.aClass16_5.E() / 1024;
									Static634.aClass27_19.method6992(local642 <= 65536 ? -256 : -65536, "Offheap:" + local642 + "k", local290, -1, local285);
									local290 += 15;
									local739 = 0;
									@Pc(741) int local741 = 0;
									@Pc(743) int local743 = 0;
									for (@Pc(745) int local745 = 0; local745 < 37; local745++) {
										if (Static357.aClass210_Sub1Array3[local745] != null) {
											local739 += Static357.aClass210_Sub1Array3[local745].method5508();
											local741 += Static357.aClass210_Sub1Array3[local745].method5518();
											local743 += Static357.aClass210_Sub1Array3[local745].method5512();
										}
									}
									@Pc(785) int local785 = local743 * 100 / local739;
									@Pc(791) int local791 = local741 * 10000 / local739;
									@Pc(811) String local811 = "Cache:" + Static506.method7325(0, 2, true, (long) local791) + "% (" + local785 + "%)";
									Static87.aClass27_21.method6992(-256, local811, local290, -1, local285);
									local290 += 12;
								}
								if (Static63.anInt1976 > 0) {
									Static87.aClass27_21.method6992(-256, "Particles: " + Static636.anInt10641 + " / " + Static63.anInt1976, local290, -1, local285);
								}
								local290 += 12;
								if (Static42.aBoolean119) {
									Static87.aClass27_21.method6992(-256, "Polys: " + Static171.aClass16_5.I() + " Models: " + Static171.aClass16_5.M(), local290, -1, local285);
									local290 += 12;
									Static87.aClass27_21.method6992(-256, "Ls: " + Static583.anInt10010 + " La: " + Static514.anInt9009 + " NPC: " + Static636.anInt10642 + " Pl: " + Static383.anInt7454, local290, -1, local285);
									local290 += 12;
									Static36.method1260();
								}
								Static620.aBooleanArray29[local69] = true;
								continue;
							}
						}
						if (local19.anInt9490 == 0) {
							if (local19.anInt9556 == Static424.anInt7965 && Static171.aClass16_5.method6079()) {
								Static171.aClass16_5.method6137(local113, local118, local19.anInt9553, local19.anInt9505);
							}
							method6493(local186, local118 - local19.anInt9503, local275, arg3, local271, local69, local192, local113 - local19.anInt9501, local19.anInt9578, arg9);
							if (local19.aClass331Array2 != null) {
								method6493(local186, local118 - local19.anInt9503, local275, arg3, local271, local69, local192, local113 - local19.anInt9501, local19.anInt9578, local19.aClass331Array2);
							}
							@Pc(972) Class8_Sub51 local972 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local19.anInt9578);
							if (local972 != null) {
								Static144.method3010(local69, local192, local972.anInt10454, local186, local113, local118, local271, local275);
							}
							if (Static424.anInt7965 == local19.anInt9556 && Static171.aClass16_5.method6079()) {
								Static171.aClass16_5.method6095();
							}
							Static171.aClass16_5.KA(arg0, arg6, arg2, arg4);
						}
						if (Static373.aBooleanArray26[local69] || Static22.anInt950 > 1) {
							if (local19.anInt9490 == 3) {
								if (local133 == 0) {
									if (local19.aBoolean669) {
										Static171.aClass16_5.aa(local113, local118, local19.anInt9553, local19.anInt9505, local19.anInt9572, 0);
									} else {
										Static171.aClass16_5.method6106(local113, local118, local19.anInt9553, local19.anInt9505, local19.anInt9572, 0);
									}
								} else if (local19.aBoolean669) {
									Static171.aClass16_5.aa(local113, local118, local19.anInt9553, local19.anInt9505, local19.anInt9572 & 0xFFFFFF | 255 - (local133 & 0xFF) << 24, 1);
								} else {
									Static171.aClass16_5.method6106(local113, local118, local19.anInt9553, local19.anInt9505, 255 - (local133 & 0xFF) << 24 | local19.anInt9572 & 0xFFFFFF, 1);
								}
								if (Static513.aBoolean642) {
									if (arg3) {
										Static460.method6945(local48, local63, local43, local56);
									} else {
										Static544.method7671(local43, local63, local56, local48);
									}
								}
							} else if (local19.anInt9490 == 4) {
								@Pc(1127) Class27 local1127 = local19.method7737(Static171.aClass16_5);
								if (local1127 != null) {
									local290 = local19.anInt9572;
									@Pc(1142) String local1142 = local19.aString100;
									if (local19.anInt9570 != -1) {
										@Pc(1152) Class284 local1152 = Static497.aClass258_21.method6652(local19.anInt9570);
										local1142 = local1152.aString88;
										if (local1142 == null) {
											local1142 = "null";
										}
										if ((local1152.anInt8550 == 1 || local19.anInt9516 != 1) && local19.anInt9516 != -1) {
											local1142 = "<col=ff9040>" + local1142 + "</col> x" + Static356.method5612(local19.anInt9516);
										}
									}
									if (local19.anInt9567 != -1) {
										local1142 = Static291.method4859(local19.anInt9567);
										if (local1142 == null) {
											local1142 = "";
										}
									}
									if (local19 == Static523.aClass331_16) {
										local1142 = Static121.aClass84_31.method2710(Static372.anInt7083);
										local290 = local19.anInt9572;
									}
									if (Static203.aBoolean339) {
										Static171.aClass16_5.T(local113, local118, local113 + local19.anInt9553, local19.anInt9505 + local118);
									}
									local1127.method7001(local19.anInt9497, local113, Static158.aClass21Array8, local19.anInt9505, local19.anInt9562, local1142, local118, 255 - (local133 & 0xFF) << 24 | local290, local19.aBoolean677 ? 255 - (local133 & 0xFF) << 24 : -1, local19.anInt9548, local19.anInt9568, null, 0, null, 0, local19.anInt9553);
									if (Static203.aBoolean339) {
										Static171.aClass16_5.KA(arg0, arg6, arg2, arg4);
									}
									if (local1142.trim().length() > 0) {
										if (!Static203.aBoolean339) {
											@Pc(1320) Class345 local1320 = Static524.method7460(Static171.aClass16_5, local19.anInt9523);
											local627 = local1320.method8116(Static158.aClass21Array8, local1142, local19.anInt9553);
											local629 = local1320.method8118(local19.anInt9553, local19.anInt9568, local1142, Static158.aClass21Array8);
											if (Static513.aBoolean642) {
												if (arg3) {
													Static460.method6945(local118, local629 + local118, local113, local113 + local627);
												} else {
													Static544.method7671(local113, local118 + local629, local627 + local113, local118);
												}
											}
										} else if (Static513.aBoolean642) {
											if (arg3) {
												Static460.method6945(local48, local63, local43, local56);
											} else {
												Static544.method7671(local43, local63, local56, local48);
											}
										}
									}
								} else if (Static318.aBoolean342) {
									Static86.method2113(local19);
								}
							} else {
								@Pc(1486) int local1486;
								if (local19.anInt9490 == 5) {
									if (local19.anInt9529 >= 0) {
										local19.method7745(Static527.aClass321_1, Static274.aClass270_1).method5421(local19.anInt9553, 0, 0, local19.anInt9505, local19.anInt9582 << 3, local19.anInt9532 << 3, Static171.aClass16_5, local113, local118);
									} else {
										@Pc(1421) Class21 local1421;
										if (local19.anInt9570 != -1) {
											@Pc(1438) Class337 local1438 = local19.aBoolean685 ? Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1 : null;
											local1421 = Static497.aClass258_21.method6645(local19.anInt9546, local19.anInt9520, local19.anInt9516, Static171.aClass16_5, local19.anInt9570, local1438, local19.anInt9508 | 0xFF000000);
										} else if (local19.anInt9567 == -1) {
											local1421 = local19.method7740(Static171.aClass16_5);
										} else {
											local1421 = Static282.method4761(local19.anInt9567, Static171.aClass16_5);
										}
										if (local1421 != null) {
											local290 = local1421.method5779();
											local593 = local1421.method5785();
											local1486 = 255 - (local133 & 0xFF) << 24 | (local19.anInt9572 == 0 ? 16777215 : local19.anInt9572 & 0xFFFFFF);
											if (local19.aBoolean672) {
												Static171.aClass16_5.T(local113, local118, local19.anInt9553 + local113, local19.anInt9505 + local118);
												if (local19.anInt9580 != 0) {
													local627 = (local290 + local19.anInt9553 - 1) / local290;
													local629 = (local19.anInt9505 + local593 - 1) / local593;
													for (local642 = 0; local642 < local627; local642++) {
														for (local739 = 0; local739 < local629; local739++) {
															if (local19.anInt9572 == 0) {
																local1421.method5793((float) local290 / 2.0F + (float) (local642 * local290 + local113), (float) (local118 - -(local739 * local593)) + (float) local593 / 2.0F, 4096, local19.anInt9580);
															} else {
																local1421.method5787((float) (local642 * local290 + local113) + (float) local290 / 2.0F, (float) (local593 * local739 + local118) + (float) local593 / 2.0F, 4096, local19.anInt9580, local1486);
															}
														}
													}
												} else if (local19.anInt9572 == 0 && local133 == 0) {
													local1421.method5789(local113, local118, local19.anInt9553, local19.anInt9505);
												} else {
													local1421.method5782(local113, local118, local19.anInt9553, local19.anInt9505, 0, local1486, 1);
												}
												Static171.aClass16_5.KA(arg0, arg6, arg2, arg4);
											} else if (local19.anInt9572 == 0 && local133 == 0) {
												if (local19.anInt9580 != 0) {
													local1421.method5793((float) local19.anInt9553 / 2.0F + (float) local113, (float) local19.anInt9505 / 2.0F + (float) local118, local19.anInt9553 * 4096 / local290, local19.anInt9580);
												} else if (local19.anInt9553 == local290 && local593 == local19.anInt9505) {
													local1421.method5796(local113, local118);
												} else {
													local1421.method5777(local113, local118, local19.anInt9553, local19.anInt9505);
												}
											} else if (local19.anInt9580 != 0) {
												local1421.method5787((float) local19.anInt9553 / 2.0F + (float) local113, (float) local19.anInt9505 / 2.0F + (float) local118, local19.anInt9553 * 4096 / local290, local19.anInt9580, local1486);
											} else if (local19.anInt9553 == local290 && local593 == local19.anInt9505) {
												local1421.method5791(local113, local118, 0, local1486, 1);
											} else {
												local1421.method5788(local113, local118, local19.anInt9553, local19.anInt9505, 0, local1486, 1);
											}
										} else if (Static318.aBoolean342) {
											Static86.method2113(local19);
										}
									}
									if (Static513.aBoolean642) {
										if (arg3) {
											Static460.method6945(local48, local63, local43, local56);
										} else {
											Static544.method7671(local43, local63, local56, local48);
										}
									}
								} else if (local19.anInt9490 == 6) {
									Static424.method6607();
									@Pc(1826) Class83 local1826 = null;
									local290 = 0;
									@Pc(1860) Class97 local1860;
									@Pc(1868) Class337 local1868;
									if (local19.anInt9570 != -1) {
										@Pc(1839) Class284 local1839 = Static497.aClass258_21.method6652(local19.anInt9570);
										if (local1839 != null) {
											local1839 = local1839.method7053(local19.anInt9516);
											local1860 = local19.anInt9579 == -1 ? null : Static28.aClass220_1.method5670(local19.anInt9579);
											local1868 = local19.aBoolean685 ? Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1 : null;
											local1826 = local1839.method7044(local19.anInt9493, local19.anInt9573, 1, local1860, Static171.aClass16_5, local1868, local19.anInt9538, 2048);
											if (local1826 == null) {
												Static86.method2113(local19);
											} else {
												local290 = -local1826.fa() >> 1;
											}
										}
									} else if (local19.anInt9566 == 5) {
										local593 = local19.anInt9518;
										if (local593 >= 0 && local593 < 2048) {
											@Pc(1915) Class15_Sub1_Sub2_Sub2_Sub1 local1915 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local593];
											@Pc(1927) Class97 local1927 = local19.anInt9579 == -1 ? null : Static28.aClass220_1.method5670(local19.anInt9579);
											if (local1915 != null && (Static616.anInt10362 == local593 || Static136.method2948(local1915.aString35) == local19.anInt9495)) {
												local1826 = local1915.aClass337_1.method7843(-1, local1927, Static314.aClass79_1, Static171.aClass16_5, local19.anInt9538, Static497.aClass258_21, Static420.aClass77_1, 0, Static28.aClass220_1, Static297.aClass338_1, local19.anInt9573, null, 2048, Static472.aClass202_4, 0, 0, null, null, local19.anInt9493);
											}
										}
									} else if (local19.anInt9566 == 8 || local19.anInt9566 == 9) {
										@Pc(2054) Class8_Sub18 local2054 = Static211.method4038(false, local19.anInt9518);
										local1860 = local19.anInt9579 == -1 ? null : Static28.aClass220_1.method5670(local19.anInt9579);
										if (local2054 != null) {
											local1868 = local19.aBoolean685 ? Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1 : null;
											local1826 = local2054.method2608(local1868, local1860, local19.anInt9493, local19.anInt9495, local19.anInt9566 == 9, local19.anInt9538, Static171.aClass16_5, local19.anInt9573);
										}
									} else if (local19.anInt9579 == -1) {
										local1826 = local19.method7735(null, Static28.aClass220_1, Static472.aClass202_4, -1, -1, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1, Static497.aClass258_21, Static171.aClass16_5, Static297.aClass338_1, 0, Static314.aClass79_1, 2048, Static420.aClass77_1);
										if (local1826 == null && Static318.aBoolean342) {
											Static86.method2113(local19);
										}
									} else {
										@Pc(2015) Class97 local2015 = Static28.aClass220_1.method5670(local19.anInt9579);
										local1826 = local19.method7735(local2015, Static28.aClass220_1, Static472.aClass202_4, local19.anInt9493, local19.anInt9573, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aClass337_1, Static497.aClass258_21, Static171.aClass16_5, Static297.aClass338_1, local19.anInt9538, Static314.aClass79_1, 2048, Static420.aClass77_1);
										if (local1826 == null && Static318.aBoolean342) {
											Static86.method2113(local19);
										}
									}
									if (local1826 != null) {
										if (local19.anInt9549 <= 0) {
											local593 = 512;
										} else {
											local593 = (local19.anInt9553 << 9) / local19.anInt9549;
										}
										if (local19.anInt9531 <= 0) {
											local1486 = 512;
										} else {
											local1486 = (local19.anInt9505 << 9) / local19.anInt9531;
										}
										local627 = local19.anInt9553 / 2 + local113;
										local629 = local118 + local19.anInt9505 / 2;
										if (!local19.aBoolean678) {
											local629 += local1486 * local19.anInt9559 >> 9;
											local627 += local19.anInt9576 * local593 >> 9;
										}
										Static3.aClass54_1.method5135();
										Static171.aClass16_5.method6066(Static3.aClass54_1);
										Static171.aClass16_5.DA(local627, local629, local593, local1486);
										Static171.aClass16_5.ya();
										if (local19.aBoolean675) {
											Static171.aClass16_5.C(false);
										}
										if (local19.aBoolean678) {
											Static141.aClass54_3.method5131(local19.anInt9517);
											Static141.aClass54_3.method5145(local19.anInt9550);
											Static141.aClass54_3.method5141(local19.anInt9492);
											Static141.aClass54_3.method5142(local19.anInt9576, local19.anInt9559, local19.anInt9512);
										} else {
											local642 = Class344.anIntArray579[local19.anInt9517 << 3] * (local19.anInt9552 << 2) >> 14;
											local739 = (local19.anInt9552 << 2) * Class344.anIntArray578[local19.anInt9517 << 3] >> 14;
											Static141.aClass54_3.method5130(-local19.anInt9492 << 3);
											Static141.aClass54_3.method5145(local19.anInt9550 << 3);
											Static141.aClass54_3.method5142(local19.anInt9500 << 2, local290 + (local19.anInt9524 << 2) + local642, (local19.anInt9524 << 2) + local739);
											Static141.aClass54_3.method5134(local19.anInt9517 << 3);
										}
										local19.method7742(local1826, Static171.aClass16_5, Static435.anInt8192, Static141.aClass54_3);
										if (Static203.aBoolean339) {
											Static171.aClass16_5.T(local113, local118, local113 + local19.anInt9553, local19.anInt9505 + local118);
										}
										if (local19.aBoolean678) {
											if (local19.aBoolean684) {
												local1826.method8009(Static141.aClass54_3, null, local19.anInt9552, 1);
											} else {
												local1826.method8003(Static141.aClass54_3, null, 1);
												if (local19.aClass15_Sub8_8 != null) {
													Static171.aClass16_5.method6100(local19.aClass15_Sub8_8.method6541());
												}
											}
										} else if (local19.aBoolean684) {
											local1826.method8009(Static141.aClass54_3, null, local19.anInt9552 << 2, 1);
										} else {
											local1826.method8003(Static141.aClass54_3, null, 1);
											if (local19.aClass15_Sub8_8 != null) {
												Static171.aClass16_5.method6100(local19.aClass15_Sub8_8.method6541());
											}
										}
										if (Static203.aBoolean339) {
											Static171.aClass16_5.KA(arg0, arg6, arg2, arg4);
										}
										if (local19.aBoolean675) {
											Static171.aClass16_5.C(true);
										}
									}
									if (Static513.aBoolean642) {
										if (arg3) {
											Static460.method6945(local48, local63, local43, local56);
										} else {
											Static544.method7671(local43, local63, local56, local48);
										}
									}
								} else if (local19.anInt9490 == 9) {
									if (local19.aBoolean676) {
										local290 = local19.anInt9505 + local118;
										local593 = local19.anInt9553 + local113;
										local1486 = local118;
									} else {
										local290 = local118;
										local1486 = local118 + local19.anInt9505;
										local593 = local19.anInt9553 + local113;
									}
									if (local19.anInt9530 == 1) {
										Static171.aClass16_5.method6093(local113, local290, local593, local1486, local19.anInt9572, 0);
									} else {
										Static171.aClass16_5.method6136(local113, local290, local593, local1486, local19.anInt9572, local19.anInt9530);
									}
									if (Static513.aBoolean642) {
										if (arg3) {
											Static460.method6945(local48, local63, local43, local56);
										} else {
											Static544.method7671(local43, local63, local56, local48);
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

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!oh;Lclient!d;)V")
	public static void method6498(@OriginalArg(1) Class237 arg0, @OriginalArg(2) Interface2 arg1) {
		Static602.anInterface2_14 = arg1;
		Static350.aClass237_96 = arg0;
	}
}
