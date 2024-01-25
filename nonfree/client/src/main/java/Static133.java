import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "Lclient!mn;")
	public static Class4_Sub1_Sub4 aClass4_Sub1_Sub4_2;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
	public static int anInt3104 = 0;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	public static int anInt3105 = 2;

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
	public static int anInt3106 = 0;

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "Z")
	public static boolean aBoolean245 = false;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public static void method2841() {
		@Pc(1) Class198 local1 = Static140.aClass198_108;
		synchronized (Static140.aClass198_108) {
			Static140.aClass198_108.method5209();
		}
		local1 = Static349.aClass198_243;
		synchronized (Static349.aClass198_243) {
			Static349.aClass198_243.method5209();
		}
		local1 = Static325.aClass198_228;
		synchronized (Static325.aClass198_228) {
			Static325.aClass198_228.method5209();
		}
		local1 = Static265.aClass198_192;
		synchronized (Static265.aClass198_192) {
			Static265.aClass198_192.method5209();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method2844() {
		Static104.aClass198_85.method5209();
		Static52.aClass198_47.method5209();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III[Lclient!br;IIIIII)V")
	public static void method2846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class21[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
		for (@Pc(18) int local18 = 0; local18 < arg3.length; local18++) {
			@Pc(24) Class21 local24 = arg3[local18];
			if (local24 != null && (arg7 == local24.anInt723 || arg7 == -1412584499 && Static103.aClass21_5 == local24)) {
				@Pc(69) int local69;
				if (arg8 == -1) {
					Class13.aRectangleArray1[Static67.anInt1778].setBounds(local24.anInt709 + arg0, local24.anInt712 - -arg5, local24.anInt740, local24.anInt758);
					local69 = Static67.anInt1778++;
				} else {
					local69 = arg8;
				}
				local24.anInt731 = local69;
				local24.anInt781 = Static199.anInt4137;
				if (!Static44.method889(local24)) {
					if (local24.anInt757 > 0) {
						Static234.method4152(local24);
					}
					@Pc(96) int local96 = local24.anInt709 + arg0;
					@Pc(101) int local101 = arg5 + local24.anInt712;
					@Pc(104) int local104 = local24.anInt778;
					if (Static189.aBoolean306 && (Static44.method877(local24).anInt1386 != 0 || local24.anInt722 == 0) && local104 > 127) {
						local104 = 127;
					}
					@Pc(148) int local148;
					@Pc(154) int local154;
					if (local24 == Static103.aClass21_5) {
						if (arg7 != -1412584499 && !local24.aBoolean74) {
							Static147.aClass21Array2 = arg3;
							Static348.anInt6591 = arg5;
							Static296.anInt5723 = arg0;
							continue;
						}
						if (Static176.aBoolean141 && Static211.aBoolean343) {
							local148 = Static258.aClass127_1.method3588();
							local154 = Static258.aClass127_1.method3595();
							local148 -= Static70.anInt1828;
							local154 -= Static173.anInt3682;
							if (Static320.anInt6196 > local148) {
								local148 = Static320.anInt6196;
							}
							if (Static241.anInt4874 > local154) {
								local154 = Static241.anInt4874;
							}
							if (local148 + local24.anInt740 > Static182.aClass21_11.anInt740 + Static320.anInt6196) {
								local148 = Static320.anInt6196 + Static182.aClass21_11.anInt740 - local24.anInt740;
							}
							local96 = local148;
							if (Static182.aClass21_11.anInt758 + Static241.anInt4874 < local24.anInt758 + local154) {
								local154 = Static241.anInt4874 + Static182.aClass21_11.anInt758 - local24.anInt758;
							}
							local101 = local154;
						}
						if (!local24.aBoolean74) {
							local104 = 128;
						}
					}
					@Pc(275) int local275;
					@Pc(264) int local264;
					@Pc(227) int local227;
					@Pc(233) int local233;
					if (local24.anInt722 == 2) {
						local148 = arg4;
						local275 = arg1;
						local264 = arg6;
						local154 = arg2;
					} else {
						local227 = local96 + local24.anInt740;
						local233 = local101 + local24.anInt758;
						local154 = arg2 >= local101 ? arg2 : local101;
						local148 = arg4 < local96 ? local96 : arg4;
						if (local24.anInt722 == 9) {
							local227++;
							local233++;
						}
						local264 = arg6 <= local233 ? arg6 : local233;
						local275 = local227 >= arg1 ? arg1 : local227;
					}
					if (local275 > local148 && local154 < local264) {
						@Pc(525) int local525;
						@Pc(551) int local551;
						@Pc(553) int local553;
						@Pc(496) int local496;
						@Pc(498) int local498;
						if (local24.anInt757 != 0) {
							if (local24.anInt757 == 1337 || local24.anInt757 == 1403) {
								Static181.method3490(local96, local101, local24.anInt757 == 1403, local24.anInt740, local24.anInt758);
								Static172.aBooleanArray19[local69] = true;
								Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
								continue;
							}
							if (local24.anInt757 == 1338) {
								if (local24.method545(Static274.aClass47_9) != null) {
									Static319.method5250();
									Static32.method559(Static274.aClass47_9, local101, local24, local96);
									Static353.aBooleanArray12[local69] = true;
									Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
								}
								continue;
							}
							if (local24.anInt757 == 1339) {
								if (local24.method545(Static274.aClass47_9) != null) {
									Static215.method3920(local101, local24, local96);
									Static353.aBooleanArray12[local69] = true;
									Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
								}
								continue;
							}
							if (local24.anInt757 == 1400) {
								Static259.method4499(Static141.anInterface3_6, Static274.aClass47_9, local101, local24.anInt740, local24.anInt758, local96);
								Static172.aBooleanArray19[local69] = true;
								Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
								continue;
							}
							if (local24.anInt757 == 1401) {
								Static123.method2572(local24.anInt740, local101, local96, Static274.aClass47_9, local24.anInt758);
								Static172.aBooleanArray19[local69] = true;
								Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
								continue;
							}
							if (local24.anInt757 == 1405) {
								if (!Static274.aBoolean398 && !Static157.aBoolean269) {
									continue;
								}
								local227 = local24.anInt740 + local96;
								local233 = local101 + 15;
								if (Static274.aBoolean398) {
									Static238.aClass51_6.method4247(local227, "Fps:" + Static296.anInt5726, local233, -256);
									local233 += 15;
									@Pc(487) Runtime local487 = Runtime.getRuntime();
									local496 = (int) ((local487.totalMemory() - local487.freeMemory()) / 1024L);
									local498 = -256;
									if (local496 > 65536) {
										local498 = -65536;
									}
									Static238.aClass51_6.method4247(local227, "Mem:" + local496 + "k", local233, local498);
									local233 += 15;
									local525 = Static274.aClass47_9.method2730() / 1024;
									Static238.aClass51_6.method4247(local227, "Offheap:" + local525 + "k", local233, local525 > 65536 ? -65536 : -256);
									local233 += 15;
									local551 = 0;
									local553 = 0;
									@Pc(555) int local555 = 0;
									for (@Pc(557) int local557 = 0; local557 < 29; local557++) {
										local551 += Static28.aClass7_Sub1Array6[local557].method2598();
										local553 += Static28.aClass7_Sub1Array6[local557].method2595();
										local555 += Static28.aClass7_Sub1Array6[local557].method2596();
									}
									@Pc(593) int local593 = local555 * 100 / local551;
									@Pc(599) int local599 = local553 * 10000 / local551;
									@Pc(619) String local619 = "Cache:" + Static80.method1996((long) local599, true, 2, 0) + "% (" + local593 + "%)";
									Static63.aClass51_1.method4247(local227, local619, local233, -256);
									local233 += 12;
								}
								if (Static73.anInt2038 > 0) {
									Static63.aClass51_1.method4247(local227, "Particles: " + Static330.anInt6311 + " / " + Static73.anInt2038, local233, -256);
								}
								local233 += 12;
								if (Static157.aBoolean269) {
									Static63.aClass51_1.method4247(local227, "Polys: " + Static274.aClass47_9.method2708() + " Models: " + Static274.aClass47_9.method2694(), local233, -256);
									local233 += 12;
									Static63.aClass51_1.method4247(local227, "Ls: " + Static114.anInt2730 + " La: " + Static118.anInt2819 + " NPC: " + Static51.anInt1369 + " Pl: " + Static261.anInt5270, local233, -256);
									Static167.method3259();
									local233 += 12;
								}
								Static172.aBooleanArray19[local69] = true;
								continue;
							}
						}
						if (local24.anInt722 == 0) {
							if (local24.anInt757 == 1407 && Static274.aClass47_9.method2757()) {
								Static274.aClass47_9.method2665(local96, local101, local24.anInt740, local24.anInt758);
							}
							method2846(local96 - local24.anInt790, local275, local154, arg3, local148, local101 - local24.anInt736, local264, local24.anInt728, local69);
							if (local24.aClass21Array1 != null) {
								method2846(local96 - local24.anInt790, local275, local154, local24.aClass21Array1, local148, local101 - local24.anInt736, local264, local24.anInt728, local69);
							}
							@Pc(780) Class4_Sub25 local780 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local24.anInt728);
							if (local780 != null) {
								Static15.method858(local96, local69, local275, local264, local154, local101, local148, local780.anInt3695);
							}
							if (local24.anInt757 == 1407 && Static274.aClass47_9.method2757()) {
								Static274.aClass47_9.method2657();
								Static121.aBoolean372 = true;
							}
							Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
						}
						if (Static89.aBooleanArray9[local69] || Static30.anInt769 > 1) {
							if (local24.anInt722 == 3) {
								if (local104 == 0) {
									if (local24.aBoolean78) {
										Static274.aClass47_9.method2682(local96, local101, local24.anInt740, local24.anInt758, local24.anInt724, 0);
									} else {
										Static274.aClass47_9.method2759(local96, local101, local24.anInt740, local24.anInt758, local24.anInt724, 0);
									}
								} else if (local24.aBoolean78) {
									Static274.aClass47_9.method2682(local96, local101, local24.anInt740, local24.anInt758, local24.anInt724 & 0xFFFFFF | 255 - (local104 & 0xFF) << 24, 1);
								} else {
									Static274.aClass47_9.method2759(local96, local101, local24.anInt740, local24.anInt758, 255 - (local104 & 0xFF) << 24 | local24.anInt724 & 0xFFFFFF, 1);
								}
							} else if (local24.anInt722 == 4) {
								@Pc(922) Class51 local922 = local24.method539(Static274.aClass47_9);
								if (local922 != null) {
									local233 = local24.anInt724;
									@Pc(937) String local937 = local24.aString12;
									if (local24.anInt770 != -1) {
										@Pc(947) Class210 local947 = Static177.method3465(local24.anInt770);
										local937 = local947.aString65;
										if (local937 == null) {
											local937 = "null";
										}
										if ((local947.anInt6501 == 1 || local24.anInt776 != 1) && local24.anInt776 != -1) {
											local937 = "<col=ff9040>" + local937 + "</col> x" + Static86.method2108(local24.anInt776);
										}
									}
									if (local24 == Static16.aClass21_1) {
										local937 = Static134.aClass159_158.method4311(Static180.anInt3835);
										local233 = local24.anInt724;
									}
									if (Static151.aBoolean249) {
										Static274.aClass47_9.method2681(local96, local101, local96 + local24.anInt740, local24.anInt758 + local101);
									}
									local922.method4244(local24.anInt714, local24.anInt729, local233 | 0xFF000000, local937, local24.anInt715, local96, local24.anInt758, null, local101, local24.aBoolean69 ? -16777216 : -1, 0, null, 0, local24.anInt740, Static237.aClass58Array136);
									if (Static151.aBoolean249) {
										Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
									}
								} else if (Static322.aBoolean184) {
									Static349.method5536(local24);
								}
							} else {
								@Pc(1131) int local1131;
								if (local24.anInt722 == 5) {
									if (local24.anInt727 >= 0) {
										local24.method544().method2230(local24.anInt740, local24.anInt758, local24.anInt741 << 3, local101, local96, local24.anInt752 << 3, 0, Static274.aClass47_9, 0);
									} else {
										@Pc(1096) Class58 local1096;
										if (local24.anInt770 == -1) {
											local1096 = local24.method543(Static274.aClass47_9);
										} else {
											@Pc(1106) Class33 local1106 = local24.aBoolean76 ? Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1 : null;
											local1096 = Static295.method4919(local24.anInt784 | 0xFF000000, local1106, local24.anInt776, local24.anInt765, local24.anInt770, Static274.aClass47_9, local24.anInt739);
										}
										if (local1096 != null) {
											local233 = local1096.method4282();
											local1131 = local1096.method4286();
											if (local24.aBoolean70) {
												Static274.aClass47_9.method2681(local96, local101, local24.anInt740 + local96, local101 - -local24.anInt758);
												if (local24.anInt773 != 0) {
													local496 = (local24.anInt740 + local233 - 1) / local233;
													local498 = (local24.anInt758 + local1131 - 1) / local1131;
													for (local525 = 0; local525 < local496; local525++) {
														for (local551 = 0; local551 < local498; local551++) {
															local1096.method4284((float) (local233 * local525 + local96) + (float) local233 / 2.0F, (float) local1131 / 2.0F + (float) (local1131 * local551 + local101), 4096, local24.anInt773);
														}
													}
												} else if (local104 == 0) {
													local1096.method4271(local96, local101, local24.anInt740, local24.anInt758, 0, 0);
												} else {
													local1096.method4271(local96, local101, local24.anInt740, local24.anInt758, 1, 255 - (local104 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
											} else if (local104 != 0) {
												local496 = 255 - (local104 & 0xFF) << 24 | 0xFFFFFF;
												if (local24.anInt773 != 0) {
													local1096.method4283((float) local24.anInt740 / 2.0F + (float) local96, (float) local101 + (float) local24.anInt758 / 2.0F, local24.anInt740 * 4096 / local233, local24.anInt773, local496);
												} else if (local24.anInt740 == local233 && local24.anInt758 == local1131) {
													local1096.method4276(local96, local101, 1, local496);
												} else {
													local1096.method4272(local96, local101, local24.anInt740, local24.anInt758, 1, local496, 1);
												}
											} else if (local24.anInt773 != 0) {
												local1096.method4284((float) local24.anInt740 / 2.0F + (float) local96, (float) local101 + (float) local24.anInt758 / 2.0F, local24.anInt740 * 4096 / local233, local24.anInt773);
											} else if (local233 == local24.anInt740 && local24.anInt758 == local1131) {
												local1096.method4269(local96, local101);
											} else {
												local1096.method4278(local96, local101, local24.anInt740, local24.anInt758);
											}
										} else if (Static322.aBoolean184) {
											Static349.method5536(local24);
										}
									}
								} else if (local24.anInt722 == 6) {
									Static123.method2571();
									@Pc(1424) Class38 local1424 = null;
									local233 = 0;
									@Pc(1599) Class14 local1599;
									@Pc(1609) Class33 local1609;
									if (local24.anInt770 != -1) {
										@Pc(1638) Class210 local1638 = Static177.method3465(local24.anInt770);
										if (local1638 != null) {
											local1638 = local1638.method5458(local24.anInt776);
											local1599 = local24.anInt716 == -1 ? null : Static225.method4042(local24.anInt716);
											local1609 = local24.aBoolean76 ? Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1 : null;
											local1424 = local1638.method5459(Static274.aClass47_9, local1599, 1024, local24.anInt749, local24.anInt756, 1, local1609, local24.anInt764);
											if (local1424 == null) {
												Static349.method5536(local24);
											} else {
												local233 = -local1424.method1921() / 2;
											}
										}
									} else if (local24.anInt787 == 5) {
										if (local24.anInt771 == -1) {
											local1424 = Static99.aClass33_2.method923(0, null, Static274.aClass47_9, -1, -1, 1024, null, -1, 0, -1, null);
										} else {
											local1131 = local24.anInt771;
											@Pc(1469) Class8_Sub1_Sub2_Sub1 local1469;
											if (local1131 == Static64.anInt1674) {
												local1469 = Static158.aClass8_Sub1_Sub2_Sub1_1;
											} else {
												local1469 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local1131];
											}
											@Pc(1485) Class14 local1485 = local24.anInt716 == -1 ? null : Static225.method4042(local24.anInt716);
											if (local1469 != null && (local1131 == 2047 || Static294.method4904(local1469.aString24) == local24.anInt745)) {
												local1424 = local1469.aClass33_1.method923(local24.anInt749, null, Static274.aClass47_9, local24.anInt756, 0, 1024, local1485, -1, 0, local24.anInt764, null);
											}
										}
									} else if (local24.anInt787 == 8 || local24.anInt787 == 9) {
										@Pc(1588) Class4_Sub44 local1588 = Static92.method531(false, local24.anInt771);
										local1599 = local24.anInt716 == -1 ? null : Static225.method4042(local24.anInt716);
										if (local1588 != null) {
											local1609 = local24.aBoolean76 ? Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1 : null;
											local1424 = local1588.method5481(local24.anInt745, local24.anInt756, local24.anInt764, local24.anInt749, local1599, Static274.aClass47_9, local1609, local24.anInt787 == 9);
										}
									} else if (local24.anInt716 == -1) {
										local1424 = local24.method549(-1, 0, -1, Static274.aClass47_9, null, 1024, Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1);
										if (local1424 == null && Static322.aBoolean184) {
											Static349.method5536(local24);
										}
									} else {
										@Pc(1559) Class14 local1559 = Static225.method4042(local24.anInt716);
										local1424 = local24.method549(local24.anInt764, local24.anInt749, local24.anInt756, Static274.aClass47_9, local1559, 1024, Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1);
										if (local1424 == null && Static322.aBoolean184) {
											Static349.method5536(local24);
										}
									}
									if (local1424 != null) {
										if (local24.anInt750 > 0) {
											local1131 = (local24.anInt740 << 9) / local24.anInt750;
										} else {
											local1131 = 512;
										}
										if (local24.anInt710 <= 0) {
											local496 = 512;
										} else {
											local496 = (local24.anInt758 << 9) / local24.anInt710;
										}
										local498 = local96 + local24.anInt740 / 2 + (local1131 * local24.anInt766 >> 9);
										local525 = (local24.anInt726 * local496 >> 9) + local24.anInt758 / 2 + local101;
										Static288.aClass57_6.method4193();
										Static274.aClass47_9.method2656(Static288.aClass57_6);
										local551 = local24.anInt748 * Class118_Sub1.anIntArray314[local24.anInt734 << 3] >> 15;
										local553 = local24.anInt748 * Class118_Sub1.anIntArray317[local24.anInt734 << 3] >> 15;
										Static274.aClass47_9.method2660(local498, local525, local1131, local496);
										Static274.aClass47_9.method2701((float) local24.aShort12, local24.aBoolean77 ? (float) local24.aShort11 : (float) local24.aShort11 * 1.5F);
										if (Static121.aBoolean372) {
											Static274.aClass47_9.method2722();
											Static274.aClass47_9.method2678();
											Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
											Static121.aBoolean372 = false;
										}
										if (local24.aBoolean71) {
											Static274.aClass47_9.method2758(false);
										}
										Static281.aClass57_4.method4200(-local24.anInt755 << 3);
										Static281.aClass57_4.method4199(local24.anInt783 << 3);
										Static281.aClass57_4.method4190(local24.anInt720, local24.anInt774 + local233 + local551, local24.anInt774 + local553);
										Static281.aClass57_4.method4196(local24.anInt734 << 3);
										if (Static151.aBoolean249) {
											Static274.aClass47_9.method2681(local96, local101, local96 + local24.anInt740, local101 + local24.anInt758);
										}
										if (local24.aBoolean77) {
											local1424.method1920(Static281.aClass57_4, null, local24.anInt748);
										} else {
											local1424.method1925(Static281.aClass57_4, null, 1);
										}
										if (Static151.aBoolean249) {
											Static274.aClass47_9.method2709(arg4, arg2, arg1, arg6);
										}
										if (local24.aBoolean71) {
											Static274.aClass47_9.method2758(true);
										}
									}
								} else if (local24.anInt722 == 9) {
									if (local24.aBoolean67) {
										local233 = local24.anInt758 + local101;
										local1131 = local96 + local24.anInt740;
										local496 = local101;
									} else {
										local496 = local24.anInt758 + local101;
										local233 = local101;
										local1131 = local24.anInt740 + local96;
									}
									if (local24.anInt777 == 1) {
										Static274.aClass47_9.method2751(local96, local233, local1131, local496, local24.anInt724, 0);
									} else {
										Static274.aClass47_9.method2749(local96, local233, local1131, local496, local24.anInt724, local24.anInt777);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	public static void method2847() {
		Static171.aClass198_132.method5213();
	}
}
