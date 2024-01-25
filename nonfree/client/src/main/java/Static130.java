import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
	public static int anInt2443;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_25 = new Class286(92, 4);

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
	public static int anInt2440 = 0;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZI[B)Ljava/lang/String;")
	public static String method2162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg1;
		@Pc(22) int local22 = arg1 + arg0;
		while (local12 < local22) {
			@Pc(31) int local31 = arg2[local12++] & 0xFF;
			@Pc(66) int local66;
			if (local31 >= 128) {
				if (local31 < 192) {
					local66 = 65533;
				} else if (local31 < 224) {
					if (local22 > local12 && (arg2[local12] & 0xC0) == 128) {
						local66 = arg2[local12++] & 0x3F | (local31 & 0x1F) << 6;
						if (local66 < 128) {
							local66 = 65533;
						}
					} else {
						local66 = 65533;
					}
				} else if (local31 < 240) {
					if (local22 > local12 + 1 && (arg2[local12] & 0xC0) == 128 && (arg2[local12 + 1] & 0xC0) == 128) {
						local66 = (arg2[local12++] & 0x3F) << 6 | (local31 & 0xF) << 12 | arg2[local12++] & 0x3F;
						if (local66 < 2048) {
							local66 = 65533;
						}
					} else {
						local66 = 65533;
					}
				} else if (local31 >= 248) {
					local66 = 65533;
				} else if (local12 + 2 < local22 && (arg2[local12] & 0xC0) == 128 && (arg2[local12 + 1] & 0xC0) == 128 && (arg2[local12 + 2] & 0xC0) == 128) {
					local66 = (arg2[local12++] & 0x3F) << 12 | local31 << 18 & 0x1C0000 | (arg2[local12++] & 0x3F) << 6 | arg2[local12++] & 0x3F;
					if (local66 >= 65536 && local66 <= 1114111) {
						local66 = 65533;
					} else {
						local66 = 65533;
					}
				} else {
					local66 = 65533;
				}
			} else if (local31 == 0) {
				local66 = 65533;
			} else {
				local66 = local31;
			}
			local8[local10++] = (char) local66;
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V")
	public static void method2164() {
		Static628.aClass338_58.method8051();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!q;I)Ljava/lang/String;")
	public static String method2165(@OriginalArg(0) Class3_Sub4_Sub17 arg0) {
		return arg0.aString112 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I[Lclient!av;IZIIIIIII)V")
	public static void method2166(@OriginalArg(0) int arg0, @OriginalArg(1) Class20[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static488.aClass67_12.KA(arg9, arg8, arg2, arg5);
		for (@Pc(18) int local18 = 0; local18 < arg1.length; local18++) {
			@Pc(24) Class20 local24 = arg1[local18];
			if (local24 != null && (local24.anInt556 == arg6 || arg6 == -1412584499 && local24 == Static509.aClass20_16)) {
				@Pc(55) int local55 = local24.anInt524 + arg7;
				@Pc(61) int local61 = local24.anInt574 + arg0;
				@Pc(69) int local69 = local55 + local24.anInt509 + 1;
				@Pc(76) int local76 = local61 + local24.anInt569 + 1;
				@Pc(103) int local103;
				if (arg4 == -1) {
					Class320.aRectangleArray2[Static583.anInt9536].setBounds(arg7 + local24.anInt524, local24.anInt574 - -arg0, local24.anInt509, local24.anInt569);
					local103 = Static583.anInt9536++;
				} else {
					local103 = arg4;
				}
				local24.anInt548 = Static269.anInt4883;
				local24.anInt535 = local103;
				if (!Static87.method1183(local24)) {
					if (local24.anInt552 != 0) {
						Static241.method3698(local24);
					}
					@Pc(132) int local132 = local24.anInt524 + arg7;
					@Pc(137) int local137 = local24.anInt574 + arg0;
					@Pc(139) int local139 = 0;
					@Pc(141) int local141 = 0;
					if (Static178.aBoolean264) {
						local139 = Static448.method6652();
						local141 = Static143.method2382();
					}
					@Pc(152) int local152 = local24.anInt576;
					if (Static632.aBoolean738 && (Static87.method1164(local24).anInt5450 != 0 || local24.anInt532 == 0) && local152 > 127) {
						local152 = 127;
					}
					@Pc(223) int local223;
					@Pc(229) int local229;
					if (local24 == Static509.aClass20_16) {
						if (arg6 != -1412584499 && (local24.anInt533 == Static123.anInt2373 || local24.anInt533 == Static406.anInt7246)) {
							Static238.aClass20Array3 = arg1;
							Static178.anInt3227 = arg0;
							Static19.anInt346 = arg7;
							continue;
						}
						if (Static659.aBoolean761 && Static89.aBoolean123) {
							local223 = Static714.aClass161_1.method8581() + local139;
							local229 = local141 + Static714.aClass161_1.method8573();
							local223 -= Static273.anInt5007;
							local229 -= Static445.anInt7712;
							if (Static535.anInt9010 > local223) {
								local223 = Static535.anInt9010;
							}
							if (local223 + local24.anInt509 > Static85.aClass20_5.anInt509 + Static535.anInt9010) {
								local223 = Static535.anInt9010 + Static85.aClass20_5.anInt509 - local24.anInt509;
							}
							if (local229 < Static162.anInt3022) {
								local229 = Static162.anInt3022;
							}
							local132 = local223;
							if (Static85.aClass20_5.anInt569 + Static162.anInt3022 < local24.anInt569 + local229) {
								local229 = Static162.anInt3022 + Static85.aClass20_5.anInt569 - local24.anInt569;
							}
							local137 = local229;
						}
						if (local24.anInt533 == Static406.anInt7246) {
							local152 = 128;
						}
					}
					@Pc(324) int local324;
					@Pc(322) int local322;
					@Pc(331) int local331;
					@Pc(336) int local336;
					if (local24.anInt532 == 2) {
						local223 = arg9;
						local229 = arg8;
						local322 = arg5;
						local324 = arg2;
					} else {
						local331 = local132 + local24.anInt509;
						local336 = local24.anInt569 + local137;
						local223 = arg9 < local132 ? local132 : arg9;
						local229 = local137 <= arg8 ? arg8 : local137;
						if (local24.anInt532 == 9) {
							local336++;
							local331++;
						}
						local324 = local331 >= arg2 ? arg2 : local331;
						local322 = local336 < arg5 ? local336 : arg5;
					}
					if (local223 < local324 && local229 < local322) {
						@Pc(745) int local745;
						@Pc(780) int local780;
						@Pc(795) int local795;
						@Pc(942) int local942;
						@Pc(944) int local944;
						@Pc(782) int local782;
						if (local24.anInt552 != 0) {
							if (Static241.anInt4520 == local24.anInt552 || Static650.anInt10442 == local24.anInt552) {
								Static145.method2394(local132, local137, local24);
								if (!Static178.aBoolean264) {
									Static206.method9437(Static650.anInt10442 == local24.anInt552, local24.anInt509, local24.anInt569, local132, local137);
									Static488.aClass67_12.KA(arg9, arg8, arg2, arg5);
								}
								Static195.aBooleanArray17[local103] = true;
								continue;
							}
							if (local24.anInt552 == Static163.anInt3046 && Static334.anInt5845 == 0) {
								if (local24.method473(Static488.aClass67_12) != null) {
									Static140.method2345();
									Static420.method6214(Static488.aClass67_12, local137, local24, local132);
									Static565.aBooleanArray24[local103] = true;
									Static488.aClass67_12.KA(arg9, arg8, arg2, arg5);
									if (Static178.aBoolean264) {
										if (arg3) {
											Static30.method402(local61, local69, local55, local76);
										} else {
											Static293.method4419(local55, local69, local76, local61);
										}
									}
								}
								continue;
							}
							if (Static703.anInt10994 == local24.anInt552) {
								Static536.method7527(local24, Static488.aClass67_12, local132, local137);
								continue;
							}
							if (local24.anInt552 == Class19_Sub1_Sub3_Sub5.lb) {
								Static72.method922(Static488.aClass67_12, local132, local24, local24.anInt540 % 64, local137);
								continue;
							}
							if (Static583.anInt9527 == local24.anInt552) {
								if (local24.method473(Static488.aClass67_12) != null) {
									Static196.method2961(local24, local137, local132);
									Static565.aBooleanArray24[local103] = true;
									Static488.aClass67_12.KA(arg9, arg8, arg2, arg5);
									if (Static178.aBoolean264) {
										if (arg3) {
											Static30.method402(local61, local69, local55, local76);
										} else {
											Static293.method4419(local55, local69, local76, local61);
										}
									}
								}
								continue;
							}
							if (local24.anInt552 == Static638.anInt10345) {
								Static350.method5058(local132, local137, Static644.anInterface2_12, local24.anInt509, Static488.aClass67_12, local24.anInt569);
								Static195.aBooleanArray17[local103] = true;
								Static488.aClass67_12.KA(arg9, arg8, arg2, arg5);
								continue;
							}
							if (Static545.anInt7058 == local24.anInt552) {
								Static87.method1182(local137, local24.anInt509, Static488.aClass67_12, local132, local24.anInt569);
								Static195.aBooleanArray17[local103] = true;
								Static488.aClass67_12.KA(arg9, arg8, arg2, arg5);
								continue;
							}
							if (local24.anInt552 == Static492.anInt8482) {
								if (!Static226.aBoolean354 && !Static181.aBoolean266) {
									continue;
								}
								local331 = local132 + local24.anInt509;
								if (Static178.aBoolean264) {
									if (arg3) {
										Static30.method402(local61, local69, local55, local76);
									} else {
										Static293.method4419(local55, local69, local76, local61);
									}
								}
								local336 = local137 + 15;
								if (Static226.aBoolean354) {
									local745 = -256;
									if (Static482.anInt8392 < 20) {
										local745 = -65536;
									}
									Static418.aClass44_32.method8117(-1, "Fps:" + Static482.anInt8392, local745, local336, local331);
									local336 += 15;
									@Pc(771) Runtime local771 = Runtime.getRuntime();
									local780 = (int) ((local771.totalMemory() - local771.freeMemory()) / 1024L);
									local782 = -256;
									if (local780 > 98304) {
										if (Static547.aBoolean675) {
											Static174.method8801();
											for (local795 = 0; local795 < 10; local795++) {
												System.gc();
											}
											local780 = (int) ((local771.totalMemory() - local771.freeMemory()) / 1024L);
											if (local780 > 65536) {
												Static332.method4975("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local782 = -65536;
									}
									Static418.aClass44_32.method8117(-1, "Mem:" + local780 + "k", local782, local336, local331);
									local336 += 15;
									Static418.aClass44_32.method8117(-1, "Game: In:" + Static532.aClass400_3.anInt11057 + "B/s Out:" + Static532.aClass400_3.anInt11059 + "B/s", -256, local336, local331);
									local336 += 15;
									Static418.aClass44_32.method8117(-1, "Lobby: In:" + Static532.aClass400_2.anInt11057 + "B/s Out:" + Static532.aClass400_2.anInt11059 + "B/s", -256, local336, local331);
									local336 += 15;
									local795 = Static488.aClass67_12.E() / 1024;
									Static418.aClass44_32.method8117(-1, "Offheap:" + local795 + "k", local795 <= 65536 ? -256 : -65536, local336, local331);
									local336 += 15;
									local942 = 0;
									local944 = 0;
									@Pc(946) int local946 = 0;
									for (@Pc(948) int local948 = 0; local948 < 37; local948++) {
										if (Static231.aClass171_Sub1Array1[local948] != null) {
											local942 += Static231.aClass171_Sub1Array1[local948].method4227();
											local944 += Static231.aClass171_Sub1Array1[local948].method4220();
											local946 += Static231.aClass171_Sub1Array1[local948].method4229();
										}
									}
									@Pc(996) int local996 = local946 * 100 / local942;
									@Pc(1002) int local1002 = local944 * 10000 / local942;
									@Pc(1028) String local1028 = "Cache:" + Static389.method5886((long) local1002, 0, 2, true) + "% (" + local996 + "%)";
									Static705.aClass44_53.method8117(-1, local1028, -256, local336, local331);
									local336 += 12;
								}
								if (Static49.anInt835 > 0) {
									Static705.aClass44_53.method8117(-1, "Particles: " + Static418.anInt7392 + " / " + Static49.anInt835, -256, local336, local331);
								}
								local336 += 12;
								if (Static181.aBoolean266) {
									Static705.aClass44_53.method8117(-1, "Polys: " + Static488.aClass67_12.I() + " Models: " + Static488.aClass67_12.M(), -256, local336, local331);
									local336 += 12;
									Static705.aClass44_53.method8117(-1, "Ls: " + Static711.anInt11103 + " La: " + Static135.anInt2517 + " NPC: " + Static310.anInt5524 + " Pl: " + Static495.anInt8511, -256, local336, local331);
									Static369.method5345();
									local336 += 12;
								}
								Static195.aBooleanArray17[local103] = true;
								continue;
							}
						}
						@Pc(1268) int local1268;
						@Pc(1227) Class3_Sub52 local1227;
						if (local24.anInt532 == 0) {
							if (local24.anInt552 == Static135.anInt2509 && Static488.aClass67_12.method7643()) {
								Static488.aClass67_12.method7635(local132, local137, local24.anInt509, local24.anInt569);
							}
							method2166(local137 - local24.anInt554, arg1, local324, arg3, local103, local322, local24.anInt600, local132 - local24.anInt537, local229, local223);
							if (local24.aClass20Array2 != null) {
								method2166(local137 - local24.anInt554, local24.aClass20Array2, local324, arg3, local103, local322, local24.anInt600, local132 - local24.anInt537, local229, local223);
							}
							local1227 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local24.anInt600);
							if (local1227 != null) {
								Static292.method4411(local229, local324, local1227.anInt10202, local137, local223, local322, local103, local132);
							}
							if (local24.anInt552 == Static135.anInt2509) {
								if (Static488.aClass67_12.method7643()) {
									Static488.aClass67_12.method7667();
								}
								if (Static334.anInt5845 == 3) {
									local336 = Static134.anInt2500;
									local745 = Static134.anInt2496;
									local1268 = Static445.anInt7716;
									local780 = Static23.anInt402;
									if (Static269.anInt4883 < Static215.anInt4179) {
										@Pc(1285) float local1285 = (float) (Static269.anInt4883 - Static46.anInt800) / (float) (Static215.anInt4179 - Static46.anInt800);
										local1268 = (int) ((float) Static445.anInt7716 * local1285 + (1.0F - local1285) * (float) Static540.anInt9067);
										local745 = (int) ((1.0F - local1285) * (float) Static552.anInt9237 + (float) Static134.anInt2496 * local1285);
										local336 = (int) ((float) Static166.anInt3107 * (1.0F - local1285) + local1285 * (float) Static134.anInt2500);
										local780 = (int) (local1285 * (float) Static23.anInt402 + (float) Static424.anInt7466 * (1.0F - local1285));
									}
									if (local336 > 0) {
										Static488.aClass67_12.method7696(local223, local322 - local229, local324 + -local223, local229, local780 | local745 << 16 | local336 << 24 | local1268 << 8);
									}
								}
							}
							Static488.aClass67_12.KA(arg9, arg8, arg2, arg5);
						}
						if (Static589.aBooleanArray26[local103] || Static59.anInt936 > 1) {
							if (local24.anInt532 == 3) {
								if (local152 == 0) {
									if (local24.aBoolean33) {
										Static488.aClass67_12.aa(local132, local137, local24.anInt509, local24.anInt569, local24.anInt540, 0);
									} else {
										Static488.aClass67_12.method7700(local132, local137, local24.anInt509, local24.anInt569, local24.anInt540, 0);
									}
								} else if (local24.aBoolean33) {
									Static488.aClass67_12.aa(local132, local137, local24.anInt509, local24.anInt569, local24.anInt540 & 0xFFFFFF | 255 - (local152 & 0xFF) << 24, 1);
								} else {
									Static488.aClass67_12.method7700(local132, local137, local24.anInt509, local24.anInt569, local24.anInt540 & 0xFFFFFF | 255 - (local152 & 0xFF) << 24, 1);
								}
								if (Static178.aBoolean264) {
									if (arg3) {
										Static30.method402(local61, local69, local55, local76);
									} else {
										Static293.method4419(local55, local69, local76, local61);
									}
								}
							} else {
								@Pc(1558) Class91 local1558;
								if (local24.anInt532 == 4) {
									@Pc(1529) Class44 local1529 = local24.method461(Static488.aClass67_12);
									if (local1529 != null) {
										local336 = local24.anInt540;
										@Pc(1548) String local1548 = local24.aString7;
										if (local24.anInt595 != -1) {
											local1558 = Static243.aClass406_2.method9394(local24.anInt595);
											local1548 = local1558.aString47;
											if (local1548 == null) {
												local1548 = "null";
											}
											if ((local1558.anInt2705 == 1 || local24.anInt593 != 1) && local24.anInt593 != -1) {
												local1548 = "<col=ff9040>" + local1548 + "</col> x" + Static181.method2790(local24.anInt593);
											}
										}
										if (local24.anInt557 != -1) {
											local1548 = Static322.method4799(local24.anInt557);
											if (local1548 == null) {
												local1548 = "";
											}
										}
										if (local24 == Static70.aClass20_4) {
											local1548 = Static476.aClass279_31.method6992(Static141.anInt2658);
											local336 = local24.anInt540;
										}
										if (Static599.aBoolean706) {
											Static488.aClass67_12.T(local132, local137, local24.anInt509 + local132, local24.anInt569 + local137);
										}
										local1529.method8131((Class1) null, local24.anInt509, 0, local132, 0, local24.aBoolean30 ? 255 - (local152 & 0xFF) << 24 : -1, 255 - (local152 & 0xFF) << 24 | local336, Static619.aClass9Array44, local24.anInt534, local137, local24.anInt585, local1548, local24.anInt569, local24.anInt545, (int[]) null, local24.anInt598);
										if (Static599.aBoolean706) {
											Static488.aClass67_12.KA(arg9, arg8, arg2, arg5);
										}
										if (local1548.trim().length() > 0) {
											if (!Static599.aBoolean706) {
												@Pc(1747) Class330 local1747 = Static607.method8322(local24.anInt591, Static488.aClass67_12);
												local780 = local1747.method7907(local1548, local24.anInt509, Static619.aClass9Array44);
												local782 = local1747.method7909(local1548, local24.anInt585, Static619.aClass9Array44, local24.anInt509);
												if (Static178.aBoolean264) {
													if (arg3) {
														Static30.method402(local137, local780 + local132, local132, local782 + local137);
													} else {
														Static293.method4419(local132, local132 + local780, local137 + local782, local137);
													}
												}
											} else if (Static178.aBoolean264) {
												if (arg3) {
													Static30.method402(local61, local69, local55, local76);
												} else {
													Static293.method4419(local55, local69, local76, local61);
												}
											}
										}
									} else if (Static74.aBoolean94) {
										Static391.method5905(local24);
									}
								} else if (local24.anInt532 == 5) {
									if (local24.anInt541 < 0) {
										@Pc(1850) Class9 local1850;
										if (local24.anInt595 != -1) {
											@Pc(1832) Class236 local1832 = local24.aBoolean34 ? Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 : null;
											local1850 = Static243.aClass406_2.method9390(Static488.aClass67_12, local24.anInt593, local24.anInt578 | 0xFF000000, local24.anInt595, local24.anInt584, local24.anInt596, local1832);
										} else if (local24.anInt557 == -1) {
											local1850 = local24.method472(Static488.aClass67_12);
										} else {
											local1850 = Static8.method113(local24.anInt557, Static488.aClass67_12);
										}
										if (local1850 != null) {
											local336 = local1850.method8619();
											local745 = local1850.method8613();
											local1268 = (local24.anInt540 == 0 ? 16777215 : local24.anInt540 & 0xFFFFFF) | 255 - (local152 & 0xFF) << 24;
											if (local24.aBoolean45) {
												Static488.aClass67_12.T(local132, local137, local132 + local24.anInt509, local24.anInt569 + local137);
												if (local24.anInt577 != 0) {
													local780 = (local24.anInt509 + local336 - 1) / local336;
													local782 = (local745 + local24.anInt569 - 1) / local745;
													for (local795 = 0; local795 < local780; local795++) {
														for (local942 = 0; local942 < local782; local942++) {
															if (local24.anInt540 == 0) {
																local1850.method8606((float) local336 / 2.0F + (float) (local132 + local336 * local795), (float) (local745 * local942 + local137) + (float) local745 / 2.0F, 4096, local24.anInt577);
															} else {
																local1850.method8624((float) (local336 * local795 + local132) + (float) local336 / 2.0F, (float) local745 / 2.0F + (float) (local745 * local942 + local137), 4096, local24.anInt577, local1268);
															}
														}
													}
												} else if (local24.anInt540 == 0 && local152 == 0) {
													local1850.method8614(local132, local137, local24.anInt509, local24.anInt569);
												} else {
													local1850.method8625(local132, local137, local24.anInt509, local24.anInt569, 0, local1268, 1);
												}
												Static488.aClass67_12.KA(arg9, arg8, arg2, arg5);
											} else if (local24.anInt540 == 0 && local152 == 0) {
												if (local24.anInt577 != 0) {
													local1850.method8606((float) local24.anInt509 / 2.0F + (float) local132, (float) local137 + (float) local24.anInt569 / 2.0F, local24.anInt509 * 4096 / local336, local24.anInt577);
												} else if (local24.anInt509 == local336 && local745 == local24.anInt569) {
													local1850.method8617(local132, local137);
												} else {
													local1850.method8620(local132, local137, local24.anInt509, local24.anInt569);
												}
											} else if (local24.anInt577 != 0) {
												local1850.method8624((float) local24.anInt509 / 2.0F + (float) local132, (float) local137 + (float) local24.anInt569 / 2.0F, local24.anInt509 * 4096 / local336, local24.anInt577, local1268);
											} else if (local24.anInt509 == local336 && local745 == local24.anInt569) {
												local1850.method8621(local132, local137, 0, local1268, 1);
											} else {
												local1850.method8604(local132, local137, local24.anInt509, local24.anInt569, 0, local1268, 1);
											}
										} else if (Static74.aBoolean94) {
											Static391.method5905(local24);
										}
									} else {
										local24.method459(Static103.aClass114_1, Static102.aClass126_1).method6917(local24.anInt569, local137, local24.lb << 3, local24.anInt509, Static488.aClass67_12, local24.anInt553 << 3, local132);
									}
									if (Static178.aBoolean264) {
										if (arg3) {
											Static30.method402(local61, local69, local55, local76);
										} else {
											Static293.method4419(local55, local69, local76, local61);
										}
									}
								} else if (local24.anInt532 == 6) {
									Static497.method7167();
									local1227 = null;
									@Pc(2334) Class157 local2334 = null;
									local745 = 0;
									if (local24.anInt595 != -1) {
										local1558 = Static243.aClass406_2.method9394(local24.anInt595);
										if (local1558 != null) {
											local1558 = local1558.method2375(local24.anInt593);
											local2334 = local1558.method2365(local24.aClass100_1, Static488.aClass67_12, 2048, 1, local24.aBoolean34 ? Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 : null);
											if (local2334 == null) {
												Static391.method5905(local24);
											} else {
												local745 = -local2334.fa() >> 1;
											}
										}
									} else if (local24.anInt568 == 5) {
										local1268 = local24.anInt520;
										if (local1268 >= 0 && local1268 < 2048) {
											@Pc(2362) Class19_Sub1_Sub3_Sub2_Sub2 local2362 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local1268];
											if (local2362 != null && (Static584.anInt9539 == local1268 || Static456.method6763(local2362.aString109) == local24.anInt570)) {
												local2334 = local2362.aClass236_1.method5755(0, local24.aClass100_1, Static577.aClass362_1, Static208.aClass29_2, Static243.aClass406_2, Static255.aClass238_1, 2048, (Class100[]) null, Static631.aClass85_2, Static488.aClass67_12, (Class100) null, Static59.aClass177_1, (int[]) null, Static423.aClass218_2);
											}
										}
									} else if (local24.anInt568 == 8 || local24.anInt568 == 9) {
										@Pc(2489) Class3_Sub51 local2489 = Static321.method5223(false, local24.anInt520);
										if (local2489 != null) {
											local2334 = local2489.method8447(local24.anInt568 == 9, local24.anInt570, local24.aBoolean34 ? Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 : null, local24.aClass100_1, Static488.aClass67_12);
										}
									} else if (local24.aClass100_1 != null && local24.aClass100_1.method8963()) {
										local2334 = local24.method469(Static59.aClass177_1, local1227, local24.aClass100_1, Static243.aClass406_2, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1, Static631.aClass85_2, Static488.aClass67_12, Static577.aClass362_1, 2048, Static255.aClass238_1, Static208.aClass29_2);
										if (local2334 == null && Static74.aBoolean94) {
											Static391.method5905(local24);
										}
									} else {
										local2334 = local24.method469(Static59.aClass177_1, local1227, (Class100) null, Static243.aClass406_2, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1, Static631.aClass85_2, Static488.aClass67_12, Static577.aClass362_1, 2048, Static255.aClass238_1, Static208.aClass29_2);
										if (local2334 == null && Static74.aBoolean94) {
											Static391.method5905(local24);
										}
									}
									if (local2334 != null) {
										if (local24.anInt550 > 0) {
											local1268 = (local24.anInt509 << 9) / local24.anInt550;
										} else {
											local1268 = 512;
										}
										if (local24.anInt558 <= 0) {
											local780 = 512;
										} else {
											local780 = (local24.anInt569 << 9) / local24.anInt558;
										}
										local782 = local132 + local24.anInt509 / 2;
										local795 = local137 + local24.anInt569 / 2;
										if (!local24.aBoolean44) {
											local782 += local24.anInt519 * local1268 >> 9;
											local795 += local780 * local24.anInt561 >> 9;
										}
										Static122.aClass181_12.method6349();
										Static488.aClass67_12.method7642(Static122.aClass181_12);
										Static488.aClass67_12.DA(local782, local795, local1268, local780);
										Static488.aClass67_12.ya();
										if (local24.aBoolean39) {
											Static488.aClass67_12.C(false);
										}
										if (local24.aBoolean44) {
											Static377.aClass181_7.method6345(local24.anInt511);
											Static377.aClass181_7.method6358(local24.anInt573);
											Static377.aClass181_7.method6357(local24.anInt523);
											Static377.aClass181_7.method6354(local24.anInt519, local24.anInt561, local24.anInt597);
										} else {
											local942 = (local24.anInt508 << 2) * Class3_Sub2_Sub21.anIntArray358[local24.anInt511 << 3] >> 14;
											local944 = Class3_Sub2_Sub21.anIntArray356[local24.anInt511 << 3] * (local24.anInt508 << 2) >> 14;
											Static377.aClass181_7.method6351(-local24.anInt523 << 3);
											Static377.aClass181_7.method6358(local24.anInt573 << 3);
											Static377.aClass181_7.method6354(local24.anInt588 << 2, (local24.anInt531 << 2) + (local942 + local745), (local24.anInt531 << 2) + local944);
											Static377.aClass181_7.method6343(local24.anInt511 << 3);
										}
										local24.method477(local2334, Static269.anInt4883, Static488.aClass67_12, Static377.aClass181_7);
										if (Static599.aBoolean706) {
											Static488.aClass67_12.T(local132, local137, local132 + local24.anInt509, local137 - -local24.anInt569);
										}
										if (local24.aBoolean44) {
											if (local24.aBoolean48) {
												local2334.method5227(Static377.aClass181_7, (Class19_Sub6) null, local24.anInt508, 1);
											} else {
												local2334.method5232(Static377.aClass181_7, (Class19_Sub6) null, 1);
												if (local24.aClass19_Sub9_1 != null) {
													Static488.aClass67_12.method7656(local24.aClass19_Sub9_1.method6770());
												}
											}
										} else if (local24.aBoolean48) {
											local2334.method5227(Static377.aClass181_7, (Class19_Sub6) null, local24.anInt508 << 2, 1);
										} else {
											local2334.method5232(Static377.aClass181_7, (Class19_Sub6) null, 1);
											if (local24.aClass19_Sub9_1 != null) {
												Static488.aClass67_12.method7656(local24.aClass19_Sub9_1.method6770());
											}
										}
										if (Static599.aBoolean706) {
											Static488.aClass67_12.KA(arg9, arg8, arg2, arg5);
										}
										if (local24.aBoolean39) {
											Static488.aClass67_12.C(true);
										}
									}
									if (Static178.aBoolean264) {
										if (arg3) {
											Static30.method402(local61, local69, local55, local76);
										} else {
											Static293.method4419(local55, local69, local76, local61);
										}
									}
								} else if (local24.anInt532 == 9) {
									if (local24.aBoolean40) {
										local745 = local132 + local24.anInt509;
										local1268 = local137;
										local336 = local137 + local24.anInt569;
									} else {
										local1268 = local137 + local24.anInt569;
										local336 = local137;
										local745 = local132 + local24.anInt509;
									}
									if (local24.anInt517 == 1) {
										Static488.aClass67_12.method7650(local132, local336, local745, local1268, local24.anInt540, 0);
									} else {
										Static488.aClass67_12.method7680(local132, local336, local745, local1268, local24.anInt540, local24.anInt517);
									}
									if (Static178.aBoolean264) {
										if (arg3) {
											Static30.method402(local61, local69, local55, local76);
										} else {
											Static293.method4419(local55, local69, local76, local61);
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
