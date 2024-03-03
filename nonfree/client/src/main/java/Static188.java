import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[Lclient!nk;BIIIIII)V", line = 16)
	public static void method3654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
		for (@Pc(13) int local13 = 0; local13 < arg2.length; local13++) {
			@Pc(19) Class161 local19 = arg2[local13];
			if (local19 != null && (local19.anInt4268 == arg1 || arg1 == -1412584499 && local19 == Class243.aClass161_14)) {
				@Pc(66) int local66;
				if (arg7 == -1) {
					Class55.aRectangleArray1[Class109.anInt2803].setBounds(local19.anInt4298 + arg8, local19.anInt4248 - -arg4, local19.anInt4242, local19.anInt4255);
					local66 = Class109.anInt2803++;
				} else {
					local66 = arg7;
				}
				local19.anInt4251 = local66;
				local19.lb = Class83.anInt2345;
				if (!Static42.method1405(local19)) {
					if (local19.anInt4266 != 0) {
						Static262.method4887(local19);
					}
					@Pc(90) int local90 = arg8 + local19.anInt4298;
					@Pc(95) int local95 = arg4 + local19.anInt4248;
					@Pc(98) int local98 = local19.anInt4304;
					if (Class15_Sub1.aBoolean30 && (Static42.method1406(local19).anInt1756 != 0 || local19.anInt4265 == 0) && local98 > 127) {
						local98 = 127;
					}
					@Pc(151) int local151;
					@Pc(155) int local155;
					if (Class243.aClass161_14 == local19) {
						if (arg1 != -1412584499 && (Class62.anInt1836 == local19.anInt4278 || local19.anInt4278 == Class2_Sub3_Sub17.anInt3134)) {
							Static233.anInt4680 = arg4;
							Static45.anInt1255 = arg8;
							Static53.aClass161Array1 = arg2;
							continue;
						}
						if (Class45.aBoolean124 && Class2_Sub3_Sub26.aBoolean377) {
							local151 = Static210.aClass119_1.method3305();
							local155 = Static210.aClass119_1.method3314();
							local155 -= Class251.anInt7215;
							local151 -= Class15_Sub1.anInt530;
							if (local151 < Class3_Sub1.anInt88) {
								local151 = Class3_Sub1.anInt88;
							}
							if (Class2_Sub13.anInt2108 > local155) {
								local155 = Class2_Sub13.anInt2108;
							}
							if (Class2_Sub3_Sub30.aClass161_13.anInt4242 + Class3_Sub1.anInt88 < local151 - -local19.anInt4242) {
								local151 = Class2_Sub3_Sub30.aClass161_13.anInt4242 + Class3_Sub1.anInt88 - local19.anInt4242;
							}
							local90 = local151;
							if (local155 + local19.anInt4255 > Class2_Sub13.anInt2108 - -Class2_Sub3_Sub30.aClass161_13.anInt4255) {
								local155 = Class2_Sub13.anInt2108 + Class2_Sub3_Sub30.aClass161_13.anInt4255 - local19.anInt4255;
							}
							local95 = local155;
						}
						if (Class2_Sub3_Sub17.anInt3134 == local19.anInt4278) {
							local98 = 128;
						}
					}
					@Pc(275) int local275;
					@Pc(286) int local286;
					@Pc(243) int local243;
					@Pc(248) int local248;
					if (local19.anInt4265 == 2) {
						local286 = arg0;
						local155 = arg3;
						local151 = arg5;
						local275 = arg6;
					} else {
						local243 = local90 + local19.anInt4242;
						local248 = local19.anInt4255 + local95;
						local155 = local95 > arg3 ? local95 : arg3;
						local151 = local90 > arg5 ? local90 : arg5;
						if (local19.anInt4265 == 9) {
							local248++;
							local243++;
						}
						local275 = arg6 <= local243 ? arg6 : local243;
						local286 = arg0 <= local248 ? arg0 : local248;
					}
					if (local275 > local151 && local155 < local286) {
						@Pc(564) int local564;
						@Pc(588) int local588;
						@Pc(590) int local590;
						@Pc(514) int local514;
						@Pc(516) int local516;
						if (local19.anInt4266 != 0) {
							if (local19.anInt4266 == Class2_Sub24.anInt5743 || Class104.anInt2705 == local19.anInt4266) {
								Static160.method3259(local95, local90, Class104.anInt2705 == local19.anInt4266, local19.anInt4242, local19.anInt4255);
								Class2_Sub3_Sub10_Sub1.aBooleanArray59[local66] = true;
								Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
								continue;
							}
							if (local19.anInt4266 == Class2_Sub3_Sub13.anInt2518) {
								if (local19.method4110(Static177.aClass19_8) != null) {
									Static36.method1135();
									Static86.method1969(local19, Static177.aClass19_8, local95, local90);
									Class243.aBooleanArray64[local66] = true;
									Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
								}
								continue;
							}
							if (Class2_Sub2_Sub13.anInt4489 == local19.anInt4266) {
								if (local19.method4110(Static177.aClass19_8) != null) {
									Static198.method3727(local19, local90, local95);
									Class243.aBooleanArray64[local66] = true;
									Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
								}
								continue;
							}
							if (local19.anInt4266 == Class67.anInt1907) {
								Static261.method4882(Static120.anInterface2_4, local19.anInt4255, local95, local19.anInt4242, local90, Static177.aClass19_8);
								Class2_Sub3_Sub10_Sub1.aBooleanArray59[local66] = true;
								Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
								continue;
							}
							if (Class43.anInt1460 == local19.anInt4266) {
								Static237.method3929(local90, local19.anInt4255, local95, local19.anInt4242, Static177.aClass19_8);
								Class2_Sub3_Sub10_Sub1.aBooleanArray59[local66] = true;
								Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
								continue;
							}
							if (local19.anInt4266 == Class25.anInt667) {
								if (!Class2_Sub2_Sub6_Sub2.aBoolean456 && !Class2_Sub31.aBoolean392) {
									continue;
								}
								local243 = local19.anInt4242 + local90;
								local248 = local95 + 15;
								if (Class2_Sub2_Sub6_Sub2.aBoolean456) {
									Static253.aClass130_4.method5899(local243, local248, "Fps:" + Class2_Sub2_Sub1.anInt62, -256);
									local248 += 15;
									@Pc(504) Runtime local504 = Runtime.getRuntime();
									local514 = (int) ((local504.totalMemory() - local504.freeMemory()) / 1024L);
									local516 = -256;
									if (local514 > 65536) {
										local516 = -65536;
									}
									Static253.aClass130_4.method5899(local243, local248, "Mem:" + local514 + "k", local516);
									local248 += 15;
									Static253.aClass130_4.method5899(local243, local248, "In:" + Static275.anInt2434 + "B/s Out:" + Static193.anInt3742 + "B/s", -256);
									local248 += 15;
									local564 = Static177.aClass19_8.method2901() / 1024;
									Static253.aClass130_4.method5899(local243, local248, "Offheap:" + local564 + "k", local564 <= 65536 ? -256 : -65536);
									local248 += 15;
									local588 = 0;
									local590 = 0;
									@Pc(592) int local592 = 0;
									for (@Pc(594) int local594 = 0; local594 < 29; local594++) {
										local588 += Class242.aClass25_Sub1Array2[local594].method895();
										local590 += Class242.aClass25_Sub1Array2[local594].method898();
										local592 += Class242.aClass25_Sub1Array2[local594].method897();
									}
									@Pc(632) int local632 = local592 * 100 / local588;
									@Pc(638) int local638 = local590 * 10000 / local588;
									@Pc(658) String local658 = "Cache:" + Static161.method3290((long) local638, 0, true, 2) + "% (" + local632 + "%)";
									Static187.aClass130_3.method5899(local243, local248, local658, -256);
									local248 += 12;
								}
								if (Static288.anInt5797 > 0) {
									Static187.aClass130_3.method5899(local243, local248, "Particles: " + Class84.anInt2357 + " / " + Static288.anInt5797, -256);
								}
								local248 += 12;
								if (Class2_Sub31.aBoolean392) {
									Static187.aClass130_3.method5899(local243, local248, "Polys: " + Static177.aClass19_8.method2845() + " Models: " + Static177.aClass19_8.method2822(), -256);
									local248 += 12;
									Static187.aClass130_3.method5899(local243, local248, "Ls: " + Class2_Sub3_Sub35.anInt6431 + " La: " + Class12.anInt6223 + " NPC: " + Class244.anInt7041 + " Pl: " + Class127.anInt3419, -256);
									local248 += 12;
									Static46.method1473();
								}
								Class2_Sub3_Sub10_Sub1.aBooleanArray59[local66] = true;
								continue;
							}
						}
						if (local19.anInt4265 == 0) {
							if (Class179.anInt4954 == local19.anInt4266 && Static177.aClass19_8.method2894()) {
								Static177.aClass19_8.method2864(local90, local95, local19.anInt4242, local19.anInt4255);
							}
							method3654(local286, local19.anInt4310, arg2, local155, local95 - local19.anInt4253, local151, local275, local66, local90 - local19.anInt4252);
							if (local19.aClass161Array2 != null) {
								method3654(local286, local19.anInt4310, local19.aClass161Array2, local155, local95 - local19.anInt4253, local151, local275, local66, local90 - local19.anInt4252);
							}
							@Pc(820) Class2_Sub7 local820 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local19.anInt4310);
							if (local820 != null) {
								Static186.method5247(local155, local286, local275, local820.anInt1368, local66, local95, local151, local90);
							}
							if (local19.anInt4266 == Class179.anInt4954 && Static177.aClass19_8.method2894()) {
								Static177.aClass19_8.method2889();
								Class2_Sub3_Sub12.aBoolean164 = true;
							}
							Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
						}
						if (Class17.aBooleanArray6[local66] || Class109.anInt2804 > 1) {
							if (local19.anInt4265 == 3) {
								if (local98 == 0) {
									if (local19.aBoolean293) {
										Static177.aClass19_8.method2903(local90, local95, local19.anInt4242, local19.anInt4255, local19.anInt4283, 0);
									} else {
										Static177.aClass19_8.method2838(local90, local95, local19.anInt4242, local19.anInt4255, local19.anInt4283, 0);
									}
								} else if (local19.aBoolean293) {
									Static177.aClass19_8.method2903(local90, local95, local19.anInt4242, local19.anInt4255, local19.anInt4283 & 0xFFFFFF | 255 - (local98 & 0xFF) << 24, 1);
								} else {
									Static177.aClass19_8.method2838(local90, local95, local19.anInt4242, local19.anInt4255, 255 - (local98 & 0xFF) << 24 | local19.anInt4283 & 0xFFFFFF, 1);
								}
							} else if (local19.anInt4265 == 4) {
								@Pc(955) Class130 local955 = local19.method4102(Static177.aClass19_8);
								if (local955 != null) {
									local248 = local19.anInt4283;
									@Pc(970) String local970 = local19.aString47;
									if (local19.anInt4293 != -1) {
										@Pc(981) Class188 local981 = Static290.aClass107_2.method2761(local19.anInt4293);
										local970 = local981.aString55;
										if (local970 == null) {
											local970 = "null";
										}
										if ((local981.lb == 1 || local19.anInt4234 != 1) && local19.anInt4234 != -1) {
											local970 = "<col=ff9040>" + local970 + "</col> x" + Static44.method1466(local19.anInt4234);
										}
									}
									if (Class133.aClass161_8 == local19) {
										local970 = Class93.aClass79_82.method2269(Class197.anInt5569);
										local248 = local19.anInt4283;
									}
									if (Class65.aBoolean134) {
										Static177.aClass19_8.method2819(local90, local95, local90 + local19.anInt4242, local19.anInt4255 + local95);
									}
									local955.method5894(0, local19.anInt4296, local90, local19.anInt4291, local19.aBoolean291 ? 255 - (local98 & 0xFF) << 24 : -1, null, 0, null, local19.anInt4255, local970, local19.anInt4286, local95, Static117.aClass13Array27, local248 | 255 - (local98 & 0xFF) << 24, local19.anInt4242);
									if (Class65.aBoolean134) {
										Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
									}
								} else if (Class11_Sub3_Sub1.aBoolean133) {
									Static187.method3646(local19);
								}
							} else {
								@Pc(1161) int local1161;
								if (local19.anInt4265 == 5) {
									if (local19.anInt4273 < 0) {
										@Pc(1139) Class13 local1139;
										if (local19.anInt4293 == -1) {
											local1139 = local19.method4114(Static177.aClass19_8);
										} else {
											@Pc(1121) Class117 local1121 = local19.aBoolean280 ? Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 : null;
											local1139 = Static290.aClass107_2.method2760(local19.anInt4299, local19.anInt4293, local1121, Static177.aClass19_8, local19.anInt4246 | 0xFF000000, local19.anInt4272, local19.anInt4234);
										}
										if (local1139 != null) {
											local248 = local1139.method6400();
											local1161 = local1139.method6385();
											if (local19.aBoolean286) {
												Static177.aClass19_8.method2819(local90, local95, local19.anInt4242 + local90, local19.anInt4255 + local95);
												if (local19.anInt4301 != 0) {
													local514 = (local19.anInt4242 + local248 - 1) / local248;
													local516 = (local19.anInt4255 + local1161 - 1) / local1161;
													for (local564 = 0; local564 < local514; local564++) {
														for (local588 = 0; local588 < local516; local588++) {
															local1139.method6387((float) (local248 * local564 + local90) + (float) local248 / 2.0F, (float) local1161 / 2.0F + (float) (local588 * local1161 + local95), 4096, local19.anInt4301);
														}
													}
												} else if (local98 == 0) {
													local1139.method6398(local90, local95, local19.anInt4242, local19.anInt4255, 0, 0);
												} else {
													local1139.method6398(local90, local95, local19.anInt4242, local19.anInt4255, 1, 255 - (local98 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
											} else if (local98 != 0) {
												local514 = 255 - (local98 & 0xFF) << 24 | 0xFFFFFF;
												if (local19.anInt4301 != 0) {
													local1139.method6401((float) local90 + (float) local19.anInt4242 / 2.0F, (float) local19.anInt4255 / 2.0F + (float) local95, local19.anInt4242 * 4096 / local248, local19.anInt4301, local514);
												} else if (local19.anInt4242 == local248 && local1161 == local19.anInt4255) {
													local1139.method6402(local90, local95, 1, local514);
												} else {
													local1139.method6396(local90, local95, local19.anInt4242, local19.anInt4255, 1, local514, 1);
												}
											} else if (local19.anInt4301 != 0) {
												local1139.method6387((float) local19.anInt4242 / 2.0F + (float) local90, (float) local19.anInt4255 / 2.0F + (float) local95, local19.anInt4242 * 4096 / local248, local19.anInt4301);
											} else if (local248 == local19.anInt4242 && local19.anInt4255 == local1161) {
												local1139.method6386(local90, local95);
											} else {
												local1139.method6389(local90, local95, local19.anInt4242, local19.anInt4255);
											}
										} else if (Class11_Sub3_Sub1.aBoolean133) {
											Static187.method3646(local19);
										}
									} else {
										local19.method4112(Static9.aClass213_1, Static255.aClass160_1).method1614(local19.anInt4295 << 3, 0, Static177.aClass19_8, local19.anInt4255, local19.anInt4263 << 3, 0, local90, local19.anInt4242, local95);
									}
								} else if (local19.anInt4265 == 6) {
									Static92.method2148();
									@Pc(1477) Class31 local1477 = null;
									local248 = 0;
									@Pc(1511) Class157 local1511;
									@Pc(1519) Class117 local1519;
									if (local19.anInt4293 != -1) {
										@Pc(1490) Class188 local1490 = Static290.aClass107_2.method2761(local19.anInt4293);
										if (local1490 != null) {
											local1490 = local1490.method4783(local19.anInt4234);
											local1511 = local19.anInt4292 == -1 ? null : Static37.aClass85_1.method2373(local19.anInt4292);
											local1519 = local19.aBoolean280 ? Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 : null;
											local1477 = local1490.method4777(local19.anInt4276, 1024, local19.anInt4309, local1511, Static177.aClass19_8, 1, local1519, local19.anInt4241);
											if (local1477 == null) {
												Static187.method3646(local19);
											} else {
												local248 = -local1477.method3803() / 2;
											}
										}
									} else if (local19.anInt4281 == 5) {
										local1161 = local19.anInt4306;
										if (local1161 >= 0 && local1161 < 2048) {
											@Pc(1566) Class11_Sub5_Sub2_Sub1 local1566 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local1161];
											@Pc(1579) Class157 local1579 = local19.anInt4292 == -1 ? null : Static37.aClass85_1.method2373(local19.anInt4292);
											if (local1566 != null && (local1161 == Class11_Sub3_Sub2.anInt4220 || Static253.method4652(local1566.aString41) == local19.anInt4230)) {
												local1477 = local1566.aClass117_1.method3192(local19.anInt4276, Static55.aClass7_1, Static37.aClass85_1, Static21.aClass55_1, local1579, local19.anInt4309, 0, 1024, -1, 0, null, Static199.aClass226_1, Static290.aClass107_2, Static177.aClass19_8, Static6.aClass219_1, null, local19.anInt4241);
											}
										}
									} else if (local19.anInt4281 == 8 || local19.anInt4281 == 9) {
										@Pc(1701) Class2_Sub41 local1701 = Static349.method6276(false, local19.anInt4306);
										local1511 = local19.anInt4292 == -1 ? null : Static37.aClass85_1.method2373(local19.anInt4292);
										if (local1701 != null) {
											local1519 = local19.aBoolean280 ? Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 : null;
											local1477 = local1701.method6361(local19.anInt4241, local19.anInt4276, local19.anInt4230, local19.anInt4281 == 9, local1511, local19.anInt4309, local1519, Static177.aClass19_8);
										}
									} else if (local19.anInt4292 == -1) {
										local1477 = local19.method4106(0, -1, Static290.aClass107_2, Static199.aClass226_1, null, Static55.aClass7_1, Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1, Static6.aClass219_1, -1, Static37.aClass85_1, 1024, Static21.aClass55_1, Static177.aClass19_8);
										if (local1477 == null && Class11_Sub3_Sub1.aBoolean133) {
											Static187.method3646(local19);
										}
									} else {
										@Pc(1640) Class157 local1640 = Static37.aClass85_1.method2373(local19.anInt4292);
										local1477 = local19.method4106(local19.anInt4276, local19.anInt4309, Static290.aClass107_2, Static199.aClass226_1, local1640, Static55.aClass7_1, Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1, Static6.aClass219_1, local19.anInt4241, Static37.aClass85_1, 1024, Static21.aClass55_1, Static177.aClass19_8);
										if (local1477 == null && Class11_Sub3_Sub1.aBoolean133) {
											Static187.method3646(local19);
										}
									}
									if (local1477 != null) {
										if (local19.anInt4245 <= 0) {
											local1161 = 512;
										} else {
											local1161 = (local19.anInt4242 << 9) / local19.anInt4245;
										}
										if (local19.anInt4262 > 0) {
											local514 = (local19.anInt4255 << 9) / local19.anInt4262;
										} else {
											local514 = 512;
										}
										local516 = local90 + local19.anInt4242 / 2 + (local19.anInt4300 * local1161 >> 9);
										local564 = (local19.anInt4247 * local514 >> 9) + local19.anInt4255 / 2 + local95;
										Static72.aClass14_3.method3933();
										Static177.aClass19_8.method2898(Static72.aClass14_3);
										local588 = local19.anInt4249 * Class19.anIntArray178[local19.anInt4313 << 3] >> 15;
										local590 = local19.anInt4249 * Class19.anIntArray177[local19.anInt4313 << 3] >> 15;
										Static177.aClass19_8.method2823(local516, local564, local1161, local514);
										Static177.aClass19_8.method2825((float) local19.aShort61, local19.aBoolean290 ? (float) local19.aShort62 : (float) local19.aShort62 * 1.5F);
										if (arg1 == -1412584499 || Class2_Sub3_Sub12.aBoolean164) {
											Static177.aClass19_8.method2900();
											Static177.aClass19_8.method2821();
											Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
											Class2_Sub3_Sub12.aBoolean164 = false;
										}
										if (local19.aBoolean289) {
											Static177.aClass19_8.method2854(false);
										}
										Static215.aClass14_4.method3932(-local19.anInt4312 << 3);
										Static215.aClass14_4.method3927(local19.anInt4267 << 3);
										Static215.aClass14_4.method3937(local19.anInt4271, local19.anInt4244 + local588 + local248, local590 + local19.anInt4244);
										Static215.aClass14_4.method3930(local19.anInt4313 << 3);
										if (Class65.aBoolean134) {
											Static177.aClass19_8.method2819(local90, local95, local90 + local19.anInt4242, local95 + local19.anInt4255);
										}
										if (local19.aBoolean290) {
											local1477.method3845(Static215.aClass14_4, null, local19.anInt4249);
										} else {
											local1477.method3836(Static215.aClass14_4, null, 1);
										}
										if (Class65.aBoolean134) {
											Static177.aClass19_8.method2897(arg5, arg3, arg6, arg0);
										}
										if (local19.aBoolean289) {
											Static177.aClass19_8.method2854(true);
										}
									}
								} else if (local19.anInt4265 == 9) {
									if (local19.aBoolean292) {
										local1161 = local90 + local19.anInt4242;
										local514 = local95;
										local248 = local95 + local19.anInt4255;
									} else {
										local1161 = local90 + local19.anInt4242;
										local514 = local95 + local19.anInt4255;
										local248 = local95;
									}
									if (local19.anInt4231 == 1) {
										Static177.aClass19_8.method2811(local90, local248, local1161, local514, local19.anInt4283, 0);
									} else {
										Static177.aClass19_8.method2847(local90, local248, local1161, local514, local19.anInt4283, local19.anInt4231);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V", line = 667)
	public static void method3655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub3_2 != null) {
			local7.aClass11_Sub3_2 = null;
		}
		if (local7.aClass11_Sub3_3 != null) {
			local7.aClass11_Sub3_3 = null;
		}
	}
}
