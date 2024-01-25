import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qq", name = "W", descriptor = "Lclient!sg;")
	public static Class97 aClass97_17;

	@OriginalMember(owner = "client!qq", name = "E", descriptor = "Z")
	public static boolean aBoolean342 = false;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)V")
	public static void method4512() {
		@Pc(8) Class11_Sub4_Sub12 local8 = Static35.method512(15, 0);
		local8.method3864();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZI[Lclient!ms;IIIIII)V")
	public static void method4513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
		for (@Pc(17) int local17 = 0; local17 < arg2.length; local17++) {
			@Pc(23) Class137 local23 = arg2[local17];
			if (local23 != null && (arg3 == local23.anInt4124 || arg3 == -1412584499 && Static45.aClass137_4 == local23)) {
				@Pc(69) int local69;
				if (arg0 == -1) {
					Class157.aRectangleArray3[Static280.anInt219].setBounds(local23.anInt4071 + arg4, arg5 + local23.anInt4098, local23.anInt4060, local23.anInt4110);
					local69 = Static280.anInt219++;
				} else {
					local69 = arg0;
				}
				local23.anInt4045 = Static293.anInt5807;
				local23.anInt4047 = local69;
				if (!Static42.method640(local23)) {
					if (local23.anInt4093 > 0) {
						Static263.method4564(local23);
					}
					@Pc(96) int local96 = arg4 + local23.anInt4071;
					@Pc(101) int local101 = arg5 + local23.anInt4098;
					@Pc(104) int local104 = local23.anInt4055;
					if (Static332.aBoolean414 && (Static42.method634(local23).anInt5612 != 0 || local23.anInt4067 == 0) && local104 > 127) {
						local104 = 127;
					}
					@Pc(146) int local146;
					@Pc(150) int local150;
					if (local23 == Static45.aClass137_4) {
						if (arg3 != -1412584499 && !local23.aBoolean267) {
							Static140.anInt2594 = arg5;
							Static13.aClass137Array1 = arg2;
							Static49.anInt940 = arg4;
							continue;
						}
						if (Static131.aBoolean156 && Static137.aBoolean171) {
							local146 = Static214.aClass29_1.method384();
							local150 = Static214.aClass29_1.method381();
							local146 -= Static325.anInt1278;
							local150 -= Static91.anInt1787;
							if (Static74.anInt1410 > local146) {
								local146 = Static74.anInt1410;
							}
							if (local23.anInt4060 + local146 > Static42.aClass137_3.anInt4060 + Static74.anInt1410) {
								local146 = Static42.aClass137_3.anInt4060 + Static74.anInt1410 - local23.anInt4060;
							}
							if (Static67.anInt1250 > local150) {
								local150 = Static67.anInt1250;
							}
							if (local150 + local23.anInt4110 > Static67.anInt1250 + Static42.aClass137_3.anInt4110) {
								local150 = Static67.anInt1250 + Static42.aClass137_3.anInt4110 - local23.anInt4110;
							}
							local96 = local146;
							local101 = local150;
						}
						if (!local23.aBoolean267) {
							local104 = 128;
						}
					}
					@Pc(232) int local232;
					@Pc(228) int local228;
					@Pc(239) int local239;
					@Pc(244) int local244;
					if (local23.anInt4067 == 2) {
						local150 = arg8;
						local228 = arg6;
						local146 = arg7;
						local232 = arg1;
					} else {
						local239 = local96 + local23.anInt4060;
						local244 = local23.anInt4110 + local101;
						local150 = local101 <= arg8 ? arg8 : local101;
						local146 = arg7 >= local96 ? arg7 : local96;
						if (local23.anInt4067 == 9) {
							local244++;
							local239++;
						}
						local232 = local239 >= arg1 ? arg1 : local239;
						local228 = local244 < arg6 ? local244 : arg6;
					}
					if (local232 > local146 && local150 < local228) {
						@Pc(527) int local527;
						@Pc(551) int local551;
						@Pc(553) int local553;
						@Pc(496) int local496;
						@Pc(498) int local498;
						if (local23.anInt4093 != 0) {
							if (local23.anInt4093 == 1337 || local23.anInt4093 == 1403) {
								Static292.method4862(local23.anInt4110, local101, local23.anInt4093 == 1403, local23.anInt4060, local96);
								Static292.aBooleanArray22[local69] = true;
								Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
								continue;
							}
							if (local23.anInt4093 == 1338) {
								if (local23.method3609(Static107.aClass129_4) != null) {
									Static168.method2723();
									Static13.method189(Static107.aClass129_4, local23, local101, local96);
									Static18.aBooleanArray1[local69] = true;
									Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
								}
								continue;
							}
							if (local23.anInt4093 == 1339) {
								if (local23.method3609(Static107.aClass129_4) != null) {
									Static206.method3697(local23, local101, local96);
									Static18.aBooleanArray1[local69] = true;
									Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
								}
								continue;
							}
							if (local23.anInt4093 == 1400) {
								Static327.method5386(local101, local96, Static76.anInterface2_6, local23.anInt4060, Static107.aClass129_4, local23.anInt4110);
								Static292.aBooleanArray22[local69] = true;
								Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
								continue;
							}
							if (local23.anInt4093 == 1401) {
								Static165.method2678(local96, local23.anInt4110, local101, local23.anInt4060, Static107.aClass129_4);
								Static292.aBooleanArray22[local69] = true;
								Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
								continue;
							}
							if (local23.anInt4093 == 1405) {
								if (!Static215.aBoolean293 && !Static266.aBoolean355) {
									continue;
								}
								local239 = local96 + local23.anInt4060;
								local244 = local101 + 15;
								if (Static215.aBoolean293) {
									Static30.aClass9_1.method3571(local239, local244, -256, "Fps:" + Static347.anInt6638);
									local244 += 15;
									@Pc(486) Runtime local486 = Runtime.getRuntime();
									local496 = (int) ((local486.totalMemory() - local486.freeMemory()) / 1024L);
									local498 = -256;
									if (local496 > 65536) {
										local498 = -65536;
									}
									Static30.aClass9_1.method3571(local239, local244, local498, "Mem:" + local496 + "k");
									local244 += 15;
									local527 = Static107.aClass129_4.method4923() / 1024;
									Static30.aClass9_1.method3571(local239, local244, local527 <= 65536 ? -256 : -65536, "Offheap:" + local527 + "k");
									local244 += 15;
									local551 = 0;
									local553 = 0;
									@Pc(555) int local555 = 0;
									for (@Pc(557) int local557 = 0; local557 < 29; local557++) {
										local551 += Static350.aClass138_Sub1Array2[local557].method3689();
										local553 += Static350.aClass138_Sub1Array2[local557].method3698();
										local555 += Static350.aClass138_Sub1Array2[local557].method3692();
									}
									@Pc(595) int local595 = local555 * 100 / local551;
									@Pc(601) int local601 = local553 * 10000 / local551;
									@Pc(621) String local621 = "Cache:" + Static106.method1615(true, 0, 2, (long) local601) + "% (" + local595 + "%)";
									Static283.aClass9_3.method3571(local239, local244, -256, local621);
									local244 += 12;
								}
								if (Static46.anInt907 > 0) {
									Static283.aClass9_3.method3571(local239, local244, -256, "Particles: " + Static61.anInt1143 + " / " + Static46.anInt907);
								}
								local244 += 12;
								if (Static266.aBoolean355) {
									Static283.aClass9_3.method3571(local239, local244, -256, "Polys: " + Static107.aClass129_4.method4999() + " Models: " + Static107.aClass129_4.method4980());
									local244 += 12;
									Static283.aClass9_3.method3571(local239, local244, -256, "Ls: " + Static261.anInt5349 + " La: " + Static80.anInt5684 + " NPC: " + Static17.anInt281 + " Pl: " + Static39.anInt727);
									local244 += 12;
									Static37.method546();
								}
								Static292.aBooleanArray22[local69] = true;
								continue;
							}
						}
						if (local23.anInt4067 == 0) {
							if (local23.anInt4093 == 1407 && Static107.aClass129_4.method5020()) {
								Static107.aClass129_4.method4934(local96, local101, local23.anInt4060, local23.anInt4110);
							}
							method4513(local69, local232, arg2, local23.anInt4044, local96 - local23.anInt4107, local101 - local23.anInt4062, local228, local146, local150);
							if (local23.aClass137Array2 != null) {
								method4513(local69, local232, local23.aClass137Array2, local23.anInt4044, local96 - local23.anInt4107, local101 - local23.anInt4062, local228, local146, local150);
							}
							@Pc(781) Class11_Sub41 local781 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local23.anInt4044);
							if (local781 != null) {
								Static356.method5721(local781.anInt6364, local228, local232, local96, local150, local69, local101, local146);
							}
							if (local23.anInt4093 == 1407 && Static107.aClass129_4.method5020()) {
								Static107.aClass129_4.method4967();
								Static261.aBoolean349 = true;
							}
							Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
						}
						if (Static83.aBooleanArray8[local69] || Static204.anInt4166 > 1) {
							if (local23.anInt4067 == 3) {
								if (local104 == 0) {
									if (local23.aBoolean274) {
										Static107.aClass129_4.method4945(local96, local101, local23.anInt4060, local23.anInt4110, local23.anInt4048, 0);
									} else {
										Static107.aClass129_4.method5015(local96, local101, local23.anInt4060, local23.anInt4110, local23.anInt4048, 0);
									}
								} else if (local23.aBoolean274) {
									Static107.aClass129_4.method4945(local96, local101, local23.anInt4060, local23.anInt4110, local23.anInt4048 & 0xFFFFFF | 255 - (local104 & 0xFF) << 24, 1);
								} else {
									Static107.aClass129_4.method5015(local96, local101, local23.anInt4060, local23.anInt4110, 255 - (local104 & 0xFF) << 24 | local23.anInt4048 & 0xFFFFFF, 1);
								}
							} else if (local23.anInt4067 == 4) {
								@Pc(919) Class9 local919 = local23.method3606(Static107.aClass129_4);
								if (local919 != null) {
									local244 = local23.anInt4048;
									@Pc(934) String local934 = local23.aString37;
									if (local23.anInt4112 != -1) {
										@Pc(944) Class170 local944 = Static283.method4717(local23.anInt4112);
										local934 = local944.aString53;
										if (local934 == null) {
											local934 = "null";
										}
										if ((local944.anInt5333 == 1 || local23.anInt4089 != 1) && local23.anInt4089 != -1) {
											local934 = "<col=ff9040>" + local934 + "</col> x" + Static128.method1982(local23.anInt4089);
										}
									}
									if (local23 == Static242.aClass137_17) {
										local934 = Static68.aClass117_27.method2684(Static230.anInt4634);
										local244 = local23.anInt4048;
									}
									if (Static81.aBoolean89) {
										Static107.aClass129_4.method4984(local96, local101, local96 + local23.anInt4060, local101 - -local23.anInt4110);
									}
									local919.method3574(local23.aBoolean278 ? -16777216 : -1, 0, local23.anInt4060, local244 | 0xFF000000, local23.anInt4052, local101, local934, local23.anInt4110, local23.anInt4046, local23.lb, 0, null, local96, null, Static213.aClass97Array17);
									if (Static81.aBoolean89) {
										Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
									}
								} else if (Static264.aBoolean352) {
									Static69.method1039(local23);
								}
							} else {
								@Pc(1108) int local1108;
								if (local23.anInt4067 == 5) {
									if (local23.anInt4090 < 0) {
										@Pc(1066) Class97 local1066;
										if (local23.anInt4112 == -1) {
											local1066 = local23.method3611(Static107.aClass129_4);
										} else {
											@Pc(1076) Class140 local1076 = local23.aBoolean264 ? Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2 : null;
											local1066 = Static182.method3090(Static107.aClass129_4, local23.anInt4051, local23.anInt4074, local1076, local23.anInt4089, local23.anInt4092 | 0xFF000000, local23.anInt4112);
										}
										if (local1066 != null) {
											local244 = local1066.method5542();
											local1108 = local1066.method5557();
											if (local23.aBoolean270) {
												Static107.aClass129_4.method4984(local96, local101, local96 + local23.anInt4060, local23.anInt4110 + local101);
												if (local23.anInt4117 != 0) {
													local496 = (local23.anInt4060 + local244 - 1) / local244;
													local498 = (local1108 + local23.anInt4110 - 1) / local1108;
													for (local527 = 0; local527 < local496; local527++) {
														for (local551 = 0; local551 < local498; local551++) {
															local1066.method5553((float) local244 / 2.0F + (float) (local527 * local244 + local96), (float) local1108 / 2.0F + (float) (local101 + local551 * local1108), 4096, local23.anInt4117);
														}
													}
												} else if (local104 == 0) {
													local1066.method5559(local96, local101, local23.anInt4060, local23.anInt4110, 0, 0);
												} else {
													local1066.method5559(local96, local101, local23.anInt4060, local23.anInt4110, 1, 255 - (local104 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
											} else if (local104 != 0) {
												local496 = 255 - (local104 & 0xFF) << 24 | 0xFFFFFF;
												if (local23.anInt4117 != 0) {
													local1066.method5545((float) local96 + (float) local23.anInt4060 / 2.0F, (float) local23.anInt4110 / 2.0F + (float) local101, local23.anInt4060 * 4096 / local244, local23.anInt4117, local496);
												} else if (local244 == local23.anInt4060 && local1108 == local23.anInt4110) {
													local1066.method5544(local96, local101, 1, local496);
												} else {
													local1066.method5550(local96, local101, local23.anInt4060, local23.anInt4110, 1, local496, 1);
												}
											} else if (local23.anInt4117 != 0) {
												local1066.method5553((float) local23.anInt4060 / 2.0F + (float) local96, (float) local101 + (float) local23.anInt4110 / 2.0F, local23.anInt4060 * 4096 / local244, local23.anInt4117);
											} else if (local244 == local23.anInt4060 && local23.anInt4110 == local1108) {
												local1066.method5555(local96, local101);
											} else {
												local1066.method5548(local96, local101, local23.anInt4060, local23.anInt4110);
											}
										} else if (Static264.aBoolean352) {
											Static69.method1039(local23);
										}
									} else {
										local23.method3615().method586(local23.anInt4110, local23.anInt4060, 0, local23.anInt4057 << 3, 0, local96, local23.anInt4086 << 3, Static107.aClass129_4, local101);
									}
								} else if (local23.anInt4067 == 6) {
									Static250.method4393();
									@Pc(1417) Class126 local1417 = null;
									local244 = 0;
									@Pc(1589) Class111 local1589;
									@Pc(1599) Class140 local1599;
									if (local23.anInt4112 != -1) {
										@Pc(1628) Class170 local1628 = Static283.method4717(local23.anInt4112);
										if (local1628 != null) {
											local1628 = local1628.method4532(local23.anInt4089);
											local1589 = local23.anInt4076 == -1 ? null : Static306.method5143(local23.anInt4076);
											local1599 = local23.aBoolean264 ? Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2 : null;
											local1417 = local1628.method4528(Static107.aClass129_4, local1589, 1024, 1, local23.anInt4099, local23.anInt4104, local23.anInt4091, local1599);
											if (local1417 == null) {
												Static69.method1039(local23);
											} else {
												local244 = -local1417.method3155() / 2;
											}
										}
									} else if (local23.anInt4108 == 5) {
										if (local23.anInt4050 == -1) {
											local1417 = Static24.aClass140_1.method3754(-1, 1024, null, -1, null, -1, Static107.aClass129_4, -1, 0, 0, null);
										} else {
											local1108 = local23.anInt4050;
											@Pc(1459) Class67_Sub3_Sub3_Sub2 local1459;
											if (Static256.anInt5197 == local1108) {
												local1459 = Static156.aClass67_Sub3_Sub3_Sub2_2;
											} else {
												local1459 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local1108];
											}
											@Pc(1475) Class111 local1475 = local23.anInt4076 == -1 ? null : Static306.method5143(local23.anInt4076);
											if (local1459 != null && (local1108 == 2047 || Static113.method1751(local1459.aString50) == local23.anInt4054)) {
												local1417 = local1459.aClass140_2.method3754(local23.anInt4104, 1024, local1475, -1, null, local23.anInt4091, Static107.aClass129_4, 0, 0, local23.anInt4099, null);
											}
										}
									} else if (local23.anInt4108 == 8 || local23.anInt4108 == 9) {
										@Pc(1578) Class11_Sub6 local1578 = Static158.method2534(local23.anInt4050, false);
										local1589 = local23.anInt4076 == -1 ? null : Static306.method5143(local23.anInt4076);
										if (local1578 != null) {
											local1599 = local23.aBoolean264 ? Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2 : null;
											local1417 = local1578.method510(local1599, local1589, local23.anInt4091, local23.anInt4099, local23.anInt4104, local23.anInt4108 == 9, Static107.aClass129_4, local23.anInt4054);
										}
									} else if (local23.anInt4076 == -1) {
										local1417 = local23.method3614(Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2, Static107.aClass129_4, 0, -1, -1, 1024, null);
										if (local1417 == null && Static264.aBoolean352) {
											Static69.method1039(local23);
										}
									} else {
										@Pc(1529) Class111 local1529 = Static306.method5143(local23.anInt4076);
										local1417 = local23.method3614(Static156.aClass67_Sub3_Sub3_Sub2_2.aClass140_2, Static107.aClass129_4, local23.anInt4099, local23.anInt4104, local23.anInt4091, 1024, local1529);
										if (local1417 == null && Static264.aBoolean352) {
											Static69.method1039(local23);
										}
									}
									if (local1417 != null) {
										if (local23.anInt4094 <= 0) {
											local1108 = 512;
										} else {
											local1108 = (local23.anInt4060 << 9) / local23.anInt4094;
										}
										if (local23.anInt4058 > 0) {
											local496 = (local23.anInt4110 << 9) / local23.anInt4058;
										} else {
											local496 = 512;
										}
										local498 = (local23.anInt4083 * local1108 >> 9) + (local96 + (local23.anInt4060 / 2));
										local527 = local23.anInt4110 / 2 + local101 + (local496 * local23.anInt4111 >> 9);
										Static319.aClass61_5.method3663();
										Static107.aClass129_4.method4971(Static319.aClass61_5);
										local551 = local23.anInt4078 * Class140.anIntArray330[local23.anInt4120 << 3] >> 15;
										local553 = local23.anInt4078 * Class140.anIntArray329[local23.anInt4120 << 3] >> 15;
										Static107.aClass129_4.method4996(local498, local527, local1108, local496);
										Static107.aClass129_4.method4986((float) local23.aShort65, local23.aBoolean276 ? (float) local23.aShort64 : (float) local23.aShort64 * 1.5F);
										if (Static261.aBoolean349) {
											Static107.aClass129_4.method4966();
											Static107.aClass129_4.method4944();
											Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
											Static261.aBoolean349 = false;
										}
										if (local23.aBoolean271) {
											Static107.aClass129_4.method4995(false);
										}
										Static134.aClass61_2.method3659(-local23.anInt4066 << 3);
										Static134.aClass61_2.method3657(local23.anInt4114 << 3);
										Static134.aClass61_2.method3665(local23.anInt4080, local551 + local244 + local23.anInt4123, local553 + local23.anInt4123);
										Static134.aClass61_2.method3664(local23.anInt4120 << 3);
										if (Static81.aBoolean89) {
											Static107.aClass129_4.method4984(local96, local101, local96 + local23.anInt4060, local23.anInt4110 + local101);
										}
										if (local23.aBoolean276) {
											local1417.method3133(Static134.aClass61_2, null, local23.anInt4078);
										} else {
											local1417.method3139(Static134.aClass61_2, null, 1);
										}
										if (Static81.aBoolean89) {
											Static107.aClass129_4.method4952(arg7, arg8, arg1, arg6);
										}
										if (local23.aBoolean271) {
											Static107.aClass129_4.method4995(true);
										}
									}
								} else if (local23.anInt4067 == 9) {
									if (local23.aBoolean272) {
										local1108 = local23.anInt4060 + local96;
										local244 = local101 + local23.anInt4110;
										local496 = local101;
									} else {
										local244 = local101;
										local1108 = local23.anInt4060 + local96;
										local496 = local101 + local23.anInt4110;
									}
									if (local23.anInt4056 == 1) {
										Static107.aClass129_4.method4951(local96, local244, local1108, local496, local23.anInt4048, 0);
									} else {
										Static107.aClass129_4.method5007(local96, local244, local1108, local496, local23.anInt4048, local23.anInt4056);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)Z")
	public static boolean method4515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static171.anIntArrayArrayArray11[arg0][arg1][arg2];
		if (local7 == -Static212.anInt4350) {
			return false;
		} else if (local7 == Static212.anInt4350) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static153.method2460(local22 + 1, Static108.aClass77Array2[arg0].method4122(arg1, arg2), local26 + 1) && Static153.method2460(local22 + 128 - 1, Static108.aClass77Array2[arg0].method4122(arg1 + 1, arg2), local26 + 1) && Static153.method2460(local22 + 128 - 1, Static108.aClass77Array2[arg0].method4122(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static153.method2460(local22 + 1, Static108.aClass77Array2[arg0].method4122(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static171.anIntArrayArrayArray11[arg0][arg1][arg2] = Static212.anInt4350;
				return true;
			} else {
				Static171.anIntArrayArrayArray11[arg0][arg1][arg2] = -Static212.anInt4350;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
	public static void method4516(@OriginalArg(0) int arg0) {
		Static96.method1449();
		@Pc(15) int local15 = Static17.method227(arg0).anInt2051;
		if (local15 == 0) {
			return;
		}
		@Pc(25) int local25 = Static198.anIntArray311[arg0];
		if (local15 == 5) {
			Static294.anInt5813 = local25;
		}
		if (local15 == 6) {
			Static170.anInt3356 = local25;
		}
	}

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V")
	public static void method4517() {
		for (@Pc(6) Class11_Sub14 local6 = (Class11_Sub14) Static119.aClass16_21.method193(); local6 != null; local6 = (Class11_Sub14) Static119.aClass16_21.method188()) {
			if (Static64.method945(local6.anInt1765)) {
				Static59.method894(local6);
			}
		}
		if (Static13.anInt245 == 1) {
			Static38.aBoolean40 = false;
			Static168.method2724(Static45.anInt880, Static24.anInt452, Static204.anInt4174, Static101.anInt1790);
			return;
		}
		Static168.method2724(Static45.anInt880, Static24.anInt452, Static204.anInt4174, Static101.anInt1790);
		@Pc(50) int local50 = Static102.aClass114_3.method2472(Static349.aClass117_118.method2684(Static230.anInt4634));
		for (@Pc(55) Class11_Sub14 local55 = (Class11_Sub14) Static119.aClass16_21.method193(); local55 != null; local55 = (Class11_Sub14) Static119.aClass16_21.method188()) {
			@Pc(61) int local61 = Static110.method3645(local55);
			if (local50 < local61) {
				local50 = local61;
			}
		}
		Static45.anInt880 = Static13.anInt245 * 16 + (Static206.aBoolean282 ? 26 : 22);
		Static101.anInt1790 = local50 + 8;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIBLclient!uo;Lclient!gm;)V")
	public static void method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class129 arg3, @OriginalArg(5) Class84 arg4) {
		@Pc(8) Class121 local8 = Static36.method533(arg4.anInt1987);
		if (local8.anInt3437 == -1) {
			return;
		}
		if (arg4.aBoolean124) {
			@Pc(25) int local25 = arg0 + arg4.anInt2017;
			arg0 = local25 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(37) Class97 local37 = local8.method2817(arg3, arg0, arg4.aBoolean133);
		if (local37 == null) {
			return;
		}
		@Pc(51) int local51 = arg4.anInt1988;
		@Pc(54) int local54 = arg4.anInt2035;
		if ((arg0 & 0x1) == 1) {
			local51 = arg4.anInt2035;
			local54 = arg4.anInt1988;
		}
		@Pc(68) int local68 = local37.method5542();
		@Pc(71) int local71 = local37.method5557();
		if (local8.aBoolean218) {
			local71 = local54 * 4;
			local68 = local51 * 4;
		}
		if (local8.anInt3434 == 0) {
			local37.method5548(arg1, arg2 - (local54 - 1) * 4, local68, local71);
		} else {
			local37.method5550(arg1, arg2 + 4 - local54 * 4, local68, local71, 1, local8.anInt3434 | 0xFF000000, 1);
		}
	}
}
