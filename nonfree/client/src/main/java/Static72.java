import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
	public static int anInt1493;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "[I")
	public static final int[] anIntArray156 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIBIIIII[Lclient!tq;)V")
	public static void method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class239[] arg8) {
		Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
		for (@Pc(13) int local13 = 0; local13 < arg8.length; local13++) {
			@Pc(21) Class239 local21 = arg8[local13];
			if (local21 != null && (local21.anInt6479 == arg1 || arg1 == -1412584499 && local21 == Static332.aClass239_12)) {
				@Pc(61) int local61;
				if (arg2 == -1) {
					Class121.aRectangleArray2[Static299.anInt4962].setBounds(arg3 + local21.anInt6484, arg6 + local21.anInt6483, local21.anInt6435, local21.anInt6408);
					local61 = Static299.anInt4962++;
				} else {
					local61 = arg2;
				}
				local21.anInt6467 = local61;
				local21.anInt6475 = Static125.anInt2225;
				if (!Static54.method1028(local21)) {
					if (local21.anInt6442 != 0) {
						Static323.method4594(local21);
					}
					@Pc(88) int local88 = local21.anInt6484 + arg3;
					@Pc(93) int local93 = local21.anInt6483 + arg6;
					@Pc(96) int local96 = local21.anInt6414;
					if (Static268.aBoolean330 && (Static54.method1017(local21).anInt5768 != 0 || local21.anInt6447 == 0) && local96 > 127) {
						local96 = 127;
					}
					@Pc(149) int local149;
					@Pc(153) int local153;
					if (local21 == Static332.aClass239_12) {
						if (arg1 != -1412584499 && (local21.anInt6445 == Static9.anInt166 || local21.anInt6445 == Static276.anInt4711)) {
							Static329.anInt5597 = arg6;
							Static122.anInt2157 = arg3;
							Static398.aClass239Array2 = arg8;
							continue;
						}
						if (Static371.aBoolean411 && Static6.aBoolean9) {
							local149 = Static37.aClass71_26.method1618();
							local153 = Static37.aClass71_26.method1624();
							local149 -= Static108.anInt1929;
							local153 -= Static241.anInt4098;
							if (Static407.anInt6817 > local149) {
								local149 = Static407.anInt6817;
							}
							if (local153 < Static343.anInt5750) {
								local153 = Static343.anInt5750;
							}
							if (Static419.aClass239_16.anInt6435 + Static407.anInt6817 < local21.anInt6435 + local149) {
								local149 = Static419.aClass239_16.anInt6435 + Static407.anInt6817 - local21.anInt6435;
							}
							if (Static343.anInt5750 + Static419.aClass239_16.anInt6408 < local21.anInt6408 + local153) {
								local153 = Static419.aClass239_16.anInt6408 + Static343.anInt5750 - local21.anInt6408;
							}
							local88 = local149;
							local93 = local153;
						}
						if (local21.anInt6445 == Static276.anInt4711) {
							local96 = 128;
						}
					}
					@Pc(282) int local282;
					@Pc(275) int local275;
					@Pc(237) int local237;
					@Pc(242) int local242;
					if (local21.anInt6447 == 2) {
						local282 = arg5;
						local153 = arg4;
						local149 = arg7;
						local275 = arg0;
					} else {
						local237 = local21.anInt6435 + local88;
						local242 = local21.anInt6408 + local93;
						if (local21.anInt6447 == 9) {
							local242++;
							local237++;
						}
						local149 = local88 <= arg7 ? arg7 : local88;
						local153 = arg4 >= local93 ? arg4 : local93;
						local275 = local242 < arg0 ? local242 : arg0;
						local282 = arg5 <= local237 ? arg5 : local237;
					}
					if (local282 > local149 && local153 < local275) {
						@Pc(560) int local560;
						@Pc(584) int local584;
						@Pc(586) int local586;
						@Pc(510) int local510;
						@Pc(512) int local512;
						if (local21.anInt6442 != 0) {
							if (local21.anInt6442 == Static286.anInt4821 || local21.anInt6442 == Static127.anInt2253) {
								Static24.method336(local21.anInt6442 == Static127.anInt2253, local21.anInt6408, local93, local88, local21.anInt6435);
								Static194.aBooleanArray25[local61] = true;
								Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
								continue;
							}
							if (local21.anInt6442 == Static404.anInt6765) {
								if (local21.method5364(Static44.aClass28_14) != null) {
									Static88.method1553();
									Static206.method3222(local88, local21, Static44.aClass28_14, local93);
									Static298.aBooleanArray21[local61] = true;
									Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
								}
								continue;
							}
							if (local21.anInt6442 == Static105.anInt1911) {
								if (local21.method5364(Static44.aClass28_14) != null) {
									Static120.method1926(local21, local93, local88);
									Static298.aBooleanArray21[local61] = true;
									Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
								}
								continue;
							}
							if (local21.anInt6442 == Static319.anInt5201) {
								Static230.method3603(local88, local21.anInt6408, Static265.anInterface11_7, local93, Static44.aClass28_14, local21.anInt6435);
								Static194.aBooleanArray25[local61] = true;
								Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
								continue;
							}
							if (local21.anInt6442 == Static41.anInt905) {
								Static71.method1396(local93, local88, local21.anInt6408, Static44.aClass28_14, local21.anInt6435);
								Static194.aBooleanArray25[local61] = true;
								Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
								continue;
							}
							if (Static373.anInt1819 == local21.anInt6442) {
								if (!Static412.aBoolean472 && !Static19.aBoolean15) {
									continue;
								}
								local237 = local88 + local21.anInt6435;
								local242 = local93 + 15;
								if (Static412.aBoolean472) {
									Static60.aClass92_2.method5647(local237, -256, "Fps:" + Static288.anInt4836, local242);
									local242 += 15;
									@Pc(500) Runtime local500 = Runtime.getRuntime();
									local510 = (int) ((local500.totalMemory() - local500.freeMemory()) / 1024L);
									local512 = -256;
									if (local510 > 65536) {
										local512 = -65536;
									}
									Static60.aClass92_2.method5647(local237, local512, "Mem:" + local510 + "k", local242);
									local242 += 15;
									Static60.aClass92_2.method5647(local237, -256, "In:" + Static99.anInt1803 + "B/s Out:" + Static314.anInt7072 + "B/s", local242);
									local242 += 15;
									local560 = Static44.aClass28_14.method3548() / 1024;
									Static60.aClass92_2.method5647(local237, local560 > 65536 ? -65536 : -256, "Offheap:" + local560 + "k", local242);
									local242 += 15;
									local584 = 0;
									local586 = 0;
									@Pc(588) int local588 = 0;
									for (@Pc(590) int local590 = 0; local590 < 30; local590++) {
										local584 += Static420.aClass96_Sub1Array1[local590].method4060();
										local586 += Static420.aClass96_Sub1Array1[local590].method4055();
										local588 += Static420.aClass96_Sub1Array1[local590].method4061();
									}
									@Pc(626) int local626 = local588 * 100 / local584;
									@Pc(632) int local632 = local586 * 10000 / local584;
									@Pc(652) String local652 = "Cache:" + Static364.method5129((long) local632, 0, true, 2) + "% (" + local626 + "%)";
									Static120.aClass92_3.method5647(local237, -256, local652, local242);
									local242 += 12;
								}
								if (Static378.anInt7203 > 0) {
									Static120.aClass92_3.method5647(local237, -256, "Particles: " + Static383.anInt6309 + " / " + Static378.anInt7203, local242);
								}
								local242 += 12;
								if (Static19.aBoolean15) {
									Static120.aClass92_3.method5647(local237, -256, "Polys: " + Static44.aClass28_14.method3517() + " Models: " + Static44.aClass28_14.method3485(), local242);
									local242 += 12;
									Static120.aClass92_3.method5647(local237, -256, "Ls: " + Static351.anInt5921 + " La: " + Static97.anInt1793 + " NPC: " + Static40.anInt883 + " Pl: " + Static171.anInt1652, local242);
									local242 += 12;
									Static327.method4687();
								}
								Static194.aBooleanArray25[local61] = true;
								continue;
							}
						}
						if (local21.anInt6447 == 0) {
							if (local21.anInt6442 == Static19.anInt325 && Static44.aClass28_14.method3563()) {
								Static44.aClass28_14.method3575(local88, local93, local21.anInt6435, local21.anInt6408);
							}
							method1403(local275, local21.anInt6423, local61, local88 - local21.anInt6495, local153, local282, local93 - local21.anInt6438, local149, arg8);
							if (local21.aClass239Array1 != null) {
								method1403(local275, local21.anInt6423, local61, local88 - local21.anInt6495, local153, local282, local93 - local21.anInt6438, local149, local21.aClass239Array1);
							}
							@Pc(817) Class6_Sub16 local817 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local21.anInt6423);
							if (local817 != null) {
								Static429.method5846(local88, local282, local153, local817.anInt2715, local93, local275, local149, local61);
							}
							if (local21.anInt6442 == Static19.anInt325 && Static44.aClass28_14.method3563()) {
								Static44.aClass28_14.method3542();
								Static185.aBoolean348 = true;
							}
							Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
						}
						if (Static73.aBooleanArray10[local61] || Static320.anInt5213 > 1) {
							if (local21.anInt6447 == 3) {
								if (local96 == 0) {
									if (local21.aBoolean427) {
										Static44.aClass28_14.method3559(local88, local93, local21.anInt6435, local21.anInt6408, local21.anInt6431, 0);
									} else {
										Static44.aClass28_14.method3506(local88, local93, local21.anInt6435, local21.anInt6408, local21.anInt6431, 0);
									}
								} else if (local21.aBoolean427) {
									Static44.aClass28_14.method3559(local88, local93, local21.anInt6435, local21.anInt6408, local21.anInt6431 & 0xFFFFFF | 255 - (local96 & 0xFF) << 24, 1);
								} else {
									Static44.aClass28_14.method3506(local88, local93, local21.anInt6435, local21.anInt6408, local21.anInt6431 & 0xFFFFFF | 255 - (local96 & 0xFF) << 24, 1);
								}
							} else if (local21.anInt6447 == 4) {
								@Pc(957) Class92 local957 = local21.method5367(Static44.aClass28_14);
								if (local957 != null) {
									local242 = local21.anInt6431;
									@Pc(972) String local972 = local21.aString59;
									if (local21.anInt6492 != -1) {
										@Pc(982) Class32 local982 = Static354.aClass170_2.method3865(local21.anInt6492);
										local972 = local982.aString8;
										if (local972 == null) {
											local972 = "null";
										}
										if ((local982.anInt860 == 1 || local21.anInt6466 != 1) && local21.anInt6466 != -1) {
											local972 = "<col=ff9040>" + local972 + "</col> x" + Static117.method1895(local21.anInt6466);
										}
									}
									if (Static46.aClass239_13 == local21) {
										local972 = Static160.aClass231_45.method5138(Static382.anInt6289);
										local242 = local21.anInt6431;
									}
									if (Static49.aBoolean80) {
										Static44.aClass28_14.method3536(local88, local93, local88 + local21.anInt6435, local21.anInt6408 + local93);
									}
									local957.method5642(local21.anInt6464, null, local21.anInt6444, local21.aBoolean436 ? 255 - (local96 & 0xFF) << 24 : -1, Static205.aClass12Array3, 0, 0, local21.anInt6450, local21.anInt6408, local21.anInt6435, local88, local972, local93, 255 - (local96 & 0xFF) << 24 | local242, local21.anInt6427, null);
									if (Static49.aBoolean80) {
										Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
									}
								} else if (Static234.aBoolean265) {
									Static354.method4992(local21);
								}
							} else {
								@Pc(1159) int local1159;
								if (local21.anInt6447 == 5) {
									if (local21.anInt6409 < 0) {
										@Pc(1116) Class12 local1116;
										if (local21.anInt6492 == -1) {
											local1116 = local21.method5370(Static44.aClass28_14);
										} else {
											@Pc(1126) Class73 local1126 = local21.aBoolean429 ? Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1 : null;
											local1116 = Static354.aClass170_2.method3863(local21.anInt6481, local21.anInt6474, Static44.aClass28_14, local21.anInt6466, local21.anInt6492, local1126, local21.anInt6420 | 0xFF000000);
										}
										if (local1116 != null) {
											local242 = local1116.method5654();
											local1159 = local1116.method5655();
											local510 = (local21.anInt6431 == 0 ? 16777215 : local21.anInt6431 & 0xFFFFFF) | 255 - (local96 & 0xFF) << 24;
											if (local21.aBoolean430) {
												Static44.aClass28_14.method3536(local88, local93, local88 + local21.anInt6435, local21.anInt6408 + local93);
												if (local21.anInt6453 != 0) {
													local512 = (local21.anInt6435 + local242 - 1) / local242;
													local560 = (local1159 + local21.anInt6408 - 1) / local1159;
													for (local584 = 0; local584 < local512; local584++) {
														for (local586 = 0; local586 < local560; local586++) {
															if (local21.anInt6431 == 0) {
																local1116.method5670((float) (local242 * local584 + local88) + (float) local242 / 2.0F, (float) (local586 * local1159 + local93) + (float) local1159 / 2.0F, 4096, local21.anInt6453);
															} else {
																local1116.method5652((float) (local584 * local242 + local88) + (float) local242 / 2.0F, (float) local1159 / 2.0F + (float) (local1159 * local586 + local93), 4096, local21.anInt6453, local510);
															}
														}
													}
												} else if (local21.anInt6431 == 0 && local96 == 0) {
													local1116.method5666(local88, local93, local21.anInt6435, local21.anInt6408);
												} else {
													local1116.method5669(local88, local93, local21.anInt6435, local21.anInt6408, 0, local510);
												}
												Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
											} else if (local21.anInt6431 == 0 && local96 == 0) {
												if (local21.anInt6453 != 0) {
													local1116.method5670((float) local88 + (float) local21.anInt6435 / 2.0F, (float) local93 + (float) local21.anInt6408 / 2.0F, local21.anInt6435 * 4096 / local242, local21.anInt6453);
												} else if (local21.anInt6435 == local242 && local1159 == local21.anInt6408) {
													local1116.method5665(local88, local93);
												} else {
													local1116.method5667(local88, local93, local21.anInt6435, local21.anInt6408);
												}
											} else if (local21.anInt6453 != 0) {
												local1116.method5652((float) local21.anInt6435 / 2.0F + (float) local88, (float) local93 + (float) local21.anInt6408 / 2.0F, local21.anInt6435 * 4096 / local242, local21.anInt6453, local510);
											} else if (local21.anInt6435 == local242 && local1159 == local21.anInt6408) {
												local1116.method5658(local88, local93, 0, local510);
											} else {
												local1116.method5659(local88, local93, local21.anInt6435, local21.anInt6408, 0, local510, 1);
											}
										} else if (Static234.aBoolean265) {
											Static354.method4992(local21);
										}
									} else {
										local21.method5366(Static187.aClass217_1, Static251.aClass147_1).method1239(local21.anInt6439 << 3, 0, Static44.aClass28_14, local88, 0, local93, local21.anInt6435, local21.anInt6408, local21.anInt6436 << 3);
									}
								} else if (local21.anInt6447 == 6) {
									Static116.method1890();
									@Pc(1510) Class39 local1510 = null;
									local242 = 0;
									@Pc(1543) Class83 local1543;
									@Pc(1551) Class73 local1551;
									if (local21.anInt6492 != -1) {
										@Pc(1522) Class32 local1522 = Static354.aClass170_2.method3865(local21.anInt6492);
										if (local1522 != null) {
											local1522 = local1522.method781(local21.anInt6466);
											local1543 = local21.anInt6493 == -1 ? null : Static244.aClass174_2.method4011(local21.anInt6493);
											local1551 = local21.aBoolean429 ? Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1 : null;
											local1510 = local1522.method771(2048, local1543, local1551, local21.anInt6469, Static44.aClass28_14, local21.anInt6498, 1, local21.anInt6460);
											if (local1510 == null) {
												Static354.method4992(local21);
											} else {
												local242 = -local1510.method4875() >> 1;
											}
										}
									} else if (local21.anInt6446 == 5) {
										local1159 = local21.anInt6426;
										if (local1159 >= 0 && local1159 < 2048) {
											@Pc(1598) Class3_Sub3_Sub6_Sub1 local1598 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local1159];
											@Pc(1611) Class83 local1611 = local21.anInt6493 == -1 ? null : Static244.aClass174_2.method4011(local21.anInt6493);
											if (local1598 != null && (local1159 == Static251.anInt4268 || Static109.method1807(local1598.aString48) == local21.anInt6413)) {
												local1510 = local1598.aClass73_1.method1670(null, local21.anInt6498, 2048, Static336.aClass59_2, -1, 0, local21.anInt6460, 0, null, Static354.aClass170_2, Static255.aClass222_1, Static44.aClass28_14, local21.anInt6469, Static71.aClass126_1, local1611, Static167.aClass223_1, Static244.aClass174_2);
											}
										}
									} else if (local21.anInt6446 == 8 || local21.anInt6446 == 9) {
										@Pc(1740) Class6_Sub17 local1740 = Static85.method1523(local21.anInt6426, false);
										local1543 = local21.anInt6493 == -1 ? null : Static244.aClass174_2.method4011(local21.anInt6493);
										if (local1740 != null) {
											local1551 = local21.aBoolean429 ? Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1 : null;
											local1510 = local1740.method2797(local1551, local21.anInt6498, local21.anInt6446 == 9, local21.anInt6469, Static44.aClass28_14, local21.anInt6460, local21.anInt6413, local1543);
										}
									} else if (local21.anInt6493 == -1) {
										local1510 = local21.method5372(Static354.aClass170_2, Static167.aClass223_1, 2048, null, Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1, -1, 0, Static336.aClass59_2, Static71.aClass126_1, Static255.aClass222_1, -1, Static244.aClass174_2, Static44.aClass28_14);
										if (local1510 == null && Static234.aBoolean265) {
											Static354.method4992(local21);
										}
									} else {
										@Pc(1705) Class83 local1705 = Static244.aClass174_2.method4011(local21.anInt6493);
										local1510 = local21.method5372(Static354.aClass170_2, Static167.aClass223_1, 2048, local1705, Static134.aClass3_Sub3_Sub6_Sub1_1.aClass73_1, local21.anInt6469, local21.anInt6498, Static336.aClass59_2, Static71.aClass126_1, Static255.aClass222_1, local21.anInt6460, Static244.aClass174_2, Static44.aClass28_14);
										if (local1510 == null && Static234.aBoolean265) {
											Static354.method4992(local21);
										}
									}
									if (local1510 != null) {
										if (local21.anInt6407 <= 0) {
											local1159 = 512;
										} else {
											local1159 = (local21.anInt6435 << 9) / local21.anInt6407;
										}
										if (local21.anInt6412 <= 0) {
											local510 = 512;
										} else {
											local510 = (local21.anInt6408 << 9) / local21.anInt6412;
										}
										local512 = local21.anInt6435 / 2 + local88 + (local1159 * local21.anInt6433 >> 9);
										local560 = (local510 * local21.anInt6451 >> 9) + (local93 + (local21.anInt6408 / 2));
										Static318.aClass132_3.method3978();
										Static44.aClass28_14.method3509(Static318.aClass132_3);
										Static44.aClass28_14.method3519(local512, local560, local1159, local510);
										Static44.aClass28_14.method3581((float) (local21.anInt6488 << 0), local21.aBoolean439 ? (float) (local21.anInt6499 << 0) : (float) (local21.anInt6499 << 0) * 1.5F);
										if (arg1 == -1412584499 || Static185.aBoolean348) {
											Static44.aClass28_14.method3554();
											Static44.aClass28_14.method3552();
											Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
											Static185.aBoolean348 = false;
										}
										if (local21.aBoolean435) {
											Static44.aClass28_14.method3483(false);
										}
										local584 = (local21.anInt6462 << 0) * Class6_Sub1_Sub18.anIntArray642[local21.anInt6458 << 3] >> 15;
										local586 = (local21.anInt6462 << 0) * Class6_Sub1_Sub18.anIntArray643[local21.anInt6458 << 3] >> 15;
										Static208.aClass132_1.method3979(-local21.anInt6486 << 3);
										Static208.aClass132_1.method3987(local21.anInt6449 << 3);
										Static208.aClass132_1.method3991(local21.anInt6496 << 0, (local21.anInt6463 << 0) + (local584 + local242), (local21.anInt6463 << 0) + local586);
										Static208.aClass132_1.method3983(local21.anInt6458 << 3);
										if (Static49.aBoolean80) {
											Static44.aClass28_14.method3536(local88, local93, local88 + local21.anInt6435, local93 + local21.anInt6408);
										}
										if (local21.aBoolean439) {
											local1510.method4864(Static208.aClass132_1, null, local21.anInt6462 << 0);
										} else {
											local1510.method4910(Static208.aClass132_1, null, 1);
										}
										if (Static49.aBoolean80) {
											Static44.aClass28_14.method3570(arg7, arg4, arg5, arg0);
										}
										if (local21.aBoolean435) {
											Static44.aClass28_14.method3483(true);
										}
										Static44.aClass28_14.method3581(0.0F, 0.0F);
									}
								} else if (local21.anInt6447 == 9) {
									if (local21.aBoolean434) {
										local510 = local93;
										local242 = local93 + local21.anInt6408;
										local1159 = local21.anInt6435 + local88;
									} else {
										local510 = local93 + local21.anInt6408;
										local1159 = local21.anInt6435 + local88;
										local242 = local93;
									}
									if (local21.anInt6482 == 1) {
										Static44.aClass28_14.method3579(local88, local242, local1159, local510, local21.anInt6431, 0);
									} else {
										Static44.aClass28_14.method3560(local88, local242, local1159, local510, local21.anInt6431, local21.anInt6482);
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
