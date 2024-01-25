import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public static int anInt9026;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Lclient!pe;")
	public static Class254 aClass254_122;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!pe;)I")
	public static int method7397(@OriginalArg(1) Class254 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method6417(Static370.anInt7270)) {
			local10++;
		}
		if (arg0.method6417(Static260.anInt5555)) {
			local10++;
		}
		if (arg0.method6417(Static312.anInt6270)) {
			local10++;
		}
		if (arg0.method6417(Static506.anInt9835)) {
			local10++;
		}
		if (arg0.method6417(Static545.anInt9831)) {
			local10++;
		}
		if (arg0.method6417(Static459.anInt8633)) {
			local10++;
		}
		if (arg0.method6417(Static560.anInt9971)) {
			local10++;
		}
		if (arg0.method6417(Static486.anInt9076)) {
			local10++;
		}
		if (arg0.method6417(Static525.anInt9590)) {
			local10++;
		}
		if (arg0.method6417(Static374.anInt7300)) {
			local10++;
		}
		if (arg0.method6417(Static186.anInt3735)) {
			local10++;
		}
		if (arg0.method6417(Static337.anInt6959)) {
			local10++;
		}
		if (arg0.method6417(Static399.anInt7790)) {
			local10++;
		}
		if (arg0.method6417(Static287.anInt5958)) {
			local10++;
		}
		if (arg0.method6417(Static150.anInt3338)) {
			local10++;
		}
		if (arg0.method6417(Static125.anInt2898)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[Lclient!tc;IIIIBI)V")
	public static void method7398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class305[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
		for (@Pc(11) int local11 = 0; local11 < arg3.length; local11++) {
			@Pc(16) Class305 local16 = arg3[local11];
			if (local16 != null && (arg1 == local16.anInt9199 || arg1 == -1412584499 && Static360.aClass305_3 == local16)) {
				@Pc(39) int local39;
				if (arg8 == -1) {
					Class43.aRectangleArray6[Static377.anInt7315].setBounds(local16.anInt9197 + arg6, arg0 + local16.anInt9206, local16.anInt9242, local16.anInt9160);
					local39 = Static377.anInt7315++;
				} else {
					local39 = arg8;
				}
				local16.anInt9229 = local39;
				local16.anInt9235 = Static129.anInt10429;
				if (!Static68.method1702(local16)) {
					if (local16.anInt9218 != 0) {
						Static387.method6202(local16);
					}
					@Pc(85) int local85 = arg6 + local16.anInt9197;
					@Pc(91) int local91 = local16.anInt9206 + arg0;
					@Pc(94) int local94 = local16.anInt9209;
					if (Static230.aBoolean352 && (Static68.method1694(local16).anInt1877 != 0 || local16.anInt9211 == 0) && local94 > 127) {
						local94 = 127;
					}
					@Pc(151) int local151;
					@Pc(155) int local155;
					if (Static360.aClass305_3 == local16) {
						if (arg1 != -1412584499 && (local16.anInt9200 == Static157.anInt3404 || local16.anInt9200 == Static5.anInt274)) {
							Static64.aClass305Array1 = arg3;
							Static251.anInt5430 = arg0;
							Static233.anInt4814 = arg6;
							continue;
						}
						if (Static354.aBoolean598 && Static484.aBoolean752) {
							local151 = Static258.aClass116_1.method8249();
							local155 = Static258.aClass116_1.method8250();
							local151 -= Static337.anInt6958;
							local155 -= Static99.anInt2399;
							if (Static63.anInt1628 > local151) {
								local151 = Static63.anInt1628;
							}
							if (Static49.anInt1211 > local155) {
								local155 = Static49.anInt1211;
							}
							if (Static63.anInt1628 + Static327.aClass305_9.anInt9242 < local151 + local16.anInt9242) {
								local151 = Static327.aClass305_9.anInt9242 + Static63.anInt1628 - local16.anInt9242;
							}
							if (Static327.aClass305_9.anInt9160 + Static49.anInt1211 < local155 - -local16.anInt9160) {
								local155 = Static327.aClass305_9.anInt9160 + Static49.anInt1211 - local16.anInt9160;
							}
							local85 = local151;
							local91 = local155;
						}
						if (local16.anInt9200 == Static5.anInt274) {
							local94 = 128;
						}
					}
					@Pc(234) int local234;
					@Pc(236) int local236;
					@Pc(242) int local242;
					@Pc(248) int local248;
					if (local16.anInt9211 == 2) {
						local151 = arg2;
						local155 = arg5;
						local234 = arg7;
						local236 = arg4;
					} else {
						local242 = local85 + local16.anInt9242;
						local248 = local91 + local16.anInt9160;
						local151 = local85 > arg2 ? local85 : arg2;
						if (local16.anInt9211 == 9) {
							local242++;
							local248++;
						}
						local155 = local91 <= arg5 ? arg5 : local91;
						local236 = local248 < arg4 ? local248 : arg4;
						local234 = arg7 > local242 ? local242 : arg7;
					}
					if (local151 < local234 && local236 > local155) {
						@Pc(475) int local475;
						@Pc(509) int local509;
						@Pc(520) int local520;
						@Pc(613) int local613;
						@Pc(507) int local507;
						if (local16.anInt9218 != 0) {
							if (local16.anInt9218 == Static58.anInt1503 || Static195.anInt3799 == local16.anInt9218) {
								Static437.method6896(local85, local16.anInt9242, local16.anInt9160, local91, Static195.anInt3799 == local16.anInt9218);
								Static518.aBooleanArray37[local39] = true;
								Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
								continue;
							}
							if (Static593.anInt10389 == local16.anInt9218) {
								if (local16.method7501(Static546.aClass15_16) != null) {
									Static129.method8413();
									Static164.method3082(local91, local16, Static546.aClass15_16, local85);
									Static52.aBooleanArray4[local39] = true;
									Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
								}
								continue;
							}
							if (Static218.anInt4459 == local16.anInt9218) {
								if (local16.method7501(Static546.aClass15_16) != null) {
									Static445.method6950(local85, local16, local91);
									Static52.aBooleanArray4[local39] = true;
									Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
								}
								continue;
							}
							if (local16.anInt9218 == Static514.anInt9449) {
								Static458.method7064(local16.anInt9160, local91, Static546.aClass15_16, local16.anInt9242, Static122.anInterface4_5, local85);
								Static518.aBooleanArray37[local39] = true;
								Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
								continue;
							}
							if (Static298.anInt6041 == local16.anInt9218) {
								Static199.method3355(local16.anInt9160, local85, local91, local16.anInt9242, Static546.aClass15_16);
								Static518.aBooleanArray37[local39] = true;
								Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
								continue;
							}
							if (Static45.anInt1120 == local16.anInt9218) {
								if (!Static126.aBoolean224 && !Static216.aBoolean340) {
									continue;
								}
								local242 = local16.anInt9242 + local85;
								local248 = local91 + 15;
								if (Static126.aBoolean224) {
									local475 = -256;
									if (Static156.anInt10168 < 20) {
										local475 = -65536;
									}
									Static137.aClass111_5.method6666("Fps:" + Static156.anInt10168, local248, local475, local242);
									local248 += 15;
									@Pc(497) Runtime local497 = Runtime.getRuntime();
									local507 = (int) ((local497.totalMemory() - local497.freeMemory()) / 1024L);
									local509 = -256;
									if (local507 > 65536) {
										if (Static566.aBoolean835) {
											Static221.method3802();
											for (local520 = 0; local520 < 10; local520++) {
												System.gc();
											}
											local507 = (int) ((local497.totalMemory() - local497.freeMemory()) / 1024L);
											if (local507 > 65536) {
												Static477.method7310("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local509 = -65536;
									}
									Static137.aClass111_5.method6666("Mem:" + local507 + "k", local248, local509, local242);
									local248 += 15;
									Static137.aClass111_5.method6666("In:" + Static508.anInt9392 + "B/s Out:" + Static441.anInt8404 + "B/s", local248, -256, local242);
									local248 += 15;
									local520 = Static546.aClass15_16.v() / 1024;
									Static137.aClass111_5.method6666("Offheap:" + local520 + "k", local248, local520 <= 65536 ? -256 : -65536, local242);
									local248 += 15;
									local613 = 0;
									@Pc(615) int local615 = 0;
									@Pc(617) int local617 = 0;
									for (@Pc(619) int local619 = 0; local619 < 35; local619++) {
										if (Static104.aClass62_Sub1Array1[local619] != null) {
											local613 += Static104.aClass62_Sub1Array1[local619].method2085();
											local615 += Static104.aClass62_Sub1Array1[local619].method2081();
											local617 += Static104.aClass62_Sub1Array1[local619].method2082();
										}
									}
									@Pc(658) int local658 = local617 * 100 / local613;
									@Pc(664) int local664 = local615 * 10000 / local613;
									@Pc(684) String local684 = "Cache:" + Static198.method3347((long) local664, 2, true, 0) + "% (" + local658 + "%)";
									Static598.aClass111_14.method6666(local684, local248, -256, local242);
									local248 += 12;
								}
								if (Static518.anInt9484 > 0) {
									Static598.aClass111_14.method6666("Particles: " + Static65.anInt1698 + " / " + Static518.anInt9484, local248, -256, local242);
								}
								local248 += 12;
								if (Static216.aBoolean340) {
									Static598.aClass111_14.method6666("Polys: " + Static546.aClass15_16.SA() + " Models: " + Static546.aClass15_16.aa(), local248, -256, local242);
									local248 += 12;
									Static598.aClass111_14.method6666("Ls: " + Static393.anInt7568 + " La: " + Static11.anInt366 + " NPC: " + Static171.anInt3554 + " Pl: " + Static378.anInt10236, local248, -256, local242);
									local248 += 12;
									Static263.method4644();
								}
								Static518.aBooleanArray37[local39] = true;
								continue;
							}
						}
						if (local16.anInt9211 == 0) {
							if (local16.anInt9218 == Static61.anInt1567 && Static546.aClass15_16.method5325()) {
								Static546.aClass15_16.method5330(local85, local91, local16.anInt9242, local16.anInt9160);
							}
							method7398(local91 - local16.anInt9233, local16.anInt9167, local151, arg3, local236, local155, local85 - local16.anInt9215, local234, local39);
							if (local16.aClass305Array2 != null) {
								method7398(local91 - local16.anInt9233, local16.anInt9167, local151, local16.aClass305Array2, local236, local155, local85 - local16.anInt9215, local234, local39);
							}
							@Pc(842) Class3_Sub18 local842 = (Class3_Sub18) Static283.aClass25_23.method946((long) local16.anInt9167);
							if (local842 != null) {
								Static551.method8045(local85, local842.anInt3962, local91, local39, local234, local236, local155, local151);
							}
							if (local16.anInt9218 == Static61.anInt1567 && Static546.aClass15_16.method5325()) {
								Static546.aClass15_16.method5285();
								Static109.aBoolean199 = true;
							}
							Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
						}
						if (Static296.aBooleanArray20[local39] || Static157.anInt3409 > 1) {
							if (local16.anInt9211 == 3) {
								if (local94 == 0) {
									if (local16.aBoolean769) {
										Static546.aClass15_16.C(local85, local91, local16.anInt9242, local16.anInt9160, local16.anInt9205, 0);
									} else {
										Static546.aClass15_16.method5334(local85, local91, local16.anInt9242, local16.anInt9160, local16.anInt9205, 0);
									}
								} else if (local16.aBoolean769) {
									Static546.aClass15_16.C(local85, local91, local16.anInt9242, local16.anInt9160, 255 - (local94 & 0xFF) << 24 | local16.anInt9205 & 0xFFFFFF, 1);
								} else {
									Static546.aClass15_16.method5334(local85, local91, local16.anInt9242, local16.anInt9160, 255 - (local94 & 0xFF) << 24 | local16.anInt9205 & 0xFFFFFF, 1);
								}
							} else if (local16.anInt9211 == 4) {
								@Pc(979) Class111 local979 = local16.method7500(Static546.aClass15_16);
								if (local979 != null) {
									local248 = local16.anInt9205;
									@Pc(993) String local993 = local16.aString109;
									if (local16.anInt9216 != -1) {
										@Pc(1003) Class18 local1003 = Static517.aClass23_2.method901(local16.anInt9216);
										local993 = local1003.aString6;
										if (local993 == null) {
											local993 = "null";
										}
										if ((local1003.anInt680 == 1 || local16.anInt9170 != 1) && local16.anInt9170 != -1) {
											local993 = "<col=ff9040>" + local993 + "</col> x" + Static155.method2984(local16.anInt9170);
										}
									}
									if (Static321.aClass305_8 == local16) {
										local993 = Static139.aClass101_30.method2841(Static126.anInt2904);
										local248 = local16.anInt9205;
									}
									if (Static109.aBoolean198) {
										Static546.aClass15_16.Q(local85, local91, local16.anInt9242 + local85, local16.anInt9160 + local91);
									}
									local979.method6682(Static541.aClass37Array12, null, local85, null, 0, local91, local16.anInt9230, local16.aBoolean771 ? 255 - (local94 & 0xFF) << 24 : -1, local16.anInt9242, local248 | 255 - (local94 & 0xFF) << 24, local16.anInt9160, local993, 0, local16.anInt9174, local16.anInt9195, local16.anInt9175);
									if (Static109.aBoolean198) {
										Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
									}
								} else if (Static45.aBoolean90) {
									Static282.method4860(local16);
								}
							} else {
								@Pc(1202) int local1202;
								if (local16.anInt9211 == 5) {
									if (local16.anInt9180 < 0) {
										@Pc(1163) Class37 local1163;
										if (local16.anInt9216 == -1) {
											local1163 = local16.method7493(Static546.aClass15_16);
										} else {
											@Pc(1145) Class314 local1145 = local16.aBoolean764 ? Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1 : null;
											local1163 = Static517.aClass23_2.method905(Static546.aClass15_16, local16.anInt9172, local16.anInt9240 | 0xFF000000, local16.anInt9170, local16.anInt9234, local16.anInt9216, local1145);
										}
										if (local1163 != null) {
											local248 = local1163.AA();
											local475 = local1163.a();
											local1202 = 255 - (local94 & 0xFF) << 24 | (local16.anInt9205 == 0 ? 16777215 : local16.anInt9205 & 0xFFFFFF);
											if (local16.aBoolean765) {
												Static546.aClass15_16.Q(local85, local91, local16.anInt9242 + local85, local91 - -local16.anInt9160);
												if (local16.anInt9155 != 0) {
													local507 = (local248 + local16.anInt9242 - 1) / local248;
													local509 = (local16.anInt9160 + local475 - 1) / local475;
													for (local520 = 0; local520 < local507; local520++) {
														for (local613 = 0; local613 < local509; local613++) {
															if (local16.anInt9205 == 0) {
																local1163.method7075((float) local248 / 2.0F + (float) (local520 * local248 + local85), (float) local475 / 2.0F + (float) (local475 * local613 + local91), 4096, local16.anInt9155);
															} else {
																local1163.method7078((float) (local85 + local520 * local248) + (float) local248 / 2.0F, (float) (local91 - -(local475 * local613)) + (float) local475 / 2.0F, 4096, local16.anInt9155, local1202);
															}
														}
													}
												} else if (local16.anInt9205 == 0 && local94 == 0) {
													local1163.method7083(local85, local91, local16.anInt9242, local16.anInt9160);
												} else {
													local1163.ba(local85, local91, local16.anInt9242, local16.anInt9160, 0, local1202, 1);
												}
												Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
											} else if (local16.anInt9205 == 0 && local94 == 0) {
												if (local16.anInt9155 != 0) {
													local1163.method7075((float) local16.anInt9242 / 2.0F + (float) local85, (float) local91 + (float) local16.anInt9160 / 2.0F, local16.anInt9242 * 4096 / local248, local16.anInt9155);
												} else if (local16.anInt9242 == local248 && local16.anInt9160 == local475) {
													local1163.method7076(local85, local91);
												} else {
													local1163.method7080(local85, local91, local16.anInt9242, local16.anInt9160);
												}
											} else if (local16.anInt9155 != 0) {
												local1163.method7078((float) local85 + (float) local16.anInt9242 / 2.0F, (float) local16.anInt9160 / 2.0F + (float) local91, local16.anInt9242 * 4096 / local248, local16.anInt9155, local1202);
											} else if (local16.anInt9242 == local248 && local16.anInt9160 == local475) {
												local1163.I(local85, local91, 0, local1202, 1);
											} else {
												local1163.KA(local85, local91, local16.anInt9242, local16.anInt9160, 0, local1202, 1);
											}
										} else if (Static45.aBoolean90) {
											Static282.method4860(local16);
										}
									} else {
										local16.method7484(Static136.aClass272_1, Static271.aClass176_1).method3294(local16.anInt9236 << 3, 0, local16.anInt9177 << 3, local91, local85, Static546.aClass15_16, local16.anInt9242, 0, local16.anInt9160);
									}
								} else if (local16.anInt9211 == 6) {
									Static562.method8115();
									@Pc(1529) Class21 local1529 = null;
									local248 = 0;
									@Pc(1709) Class174 local1709;
									@Pc(1719) Class314 local1719;
									if (local16.anInt9216 != -1) {
										@Pc(1749) Class18 local1749 = Static517.aClass23_2.method901(local16.anInt9216);
										if (local1749 != null) {
											local1749 = local1749.method771(local16.anInt9170);
											local1709 = local16.anInt9189 == -1 ? null : Static532.aClass157_2.method3734(local16.anInt9189);
											local1719 = local16.aBoolean764 ? Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1 : null;
											local1529 = local1749.method775(local16.anInt9183, 1, local1709, 2048, local16.anInt9204, local16.anInt9186, Static546.aClass15_16, local1719);
											if (local1529 == null) {
												Static282.method4860(local16);
											} else {
												local248 = -local1529.DA() >> 1;
											}
										}
									} else if (local16.anInt9217 == 5) {
										local475 = local16.anInt9219;
										if (local475 >= 0 && local475 < 2048) {
											@Pc(1559) Class2_Sub2_Sub1_Sub1 local1559 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local475];
											@Pc(1572) Class174 local1572 = local16.anInt9189 == -1 ? null : Static532.aClass157_2.method3734(local16.anInt9189);
											if (local1559 != null && (local475 == Static381.anInt1560 || Static491.method6680(local1559.aString23) == local16.anInt9192)) {
												local1529 = local1559.aClass314_1.method7649(null, 0, local1572, Static546.aClass15_16, null, Static588.aClass322_1, 2048, Static341.aClass6_1, Static144.aClass188_1, local16.anInt9204, -1, Static532.aClass157_2, local16.anInt9186, local16.anInt9183, 0, Static121.aClass118_2, Static517.aClass23_2);
											}
										}
									} else if (local16.anInt9217 == 8 || local16.anInt9217 == 9) {
										@Pc(1697) Class3_Sub29 local1697 = Static535.method7881(false, local16.anInt9219);
										local1709 = local16.anInt9189 == -1 ? null : Static532.aClass157_2.method3734(local16.anInt9189);
										if (local1697 != null) {
											local1719 = local16.aBoolean764 ? Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1 : null;
											local1529 = local1697.method4562(local16.anInt9192, Static546.aClass15_16, local16.anInt9204, local16.anInt9183, local1719, local16.anInt9217 == 9, local1709, local16.anInt9186);
										}
									} else if (local16.anInt9189 == -1) {
										local1529 = local16.method7489(Static341.aClass6_1, -1, -1, Static517.aClass23_2, null, 0, Static546.aClass15_16, Static144.aClass188_1, Static532.aClass157_2, 2048, Static588.aClass322_1, Static121.aClass118_2, Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1);
										if (local1529 == null && Static45.aBoolean90) {
											Static282.method4860(local16);
										}
									} else {
										@Pc(1636) Class174 local1636 = Static532.aClass157_2.method3734(local16.anInt9189);
										local1529 = local16.method7489(Static341.aClass6_1, local16.anInt9204, local16.anInt9186, Static517.aClass23_2, local1636, local16.anInt9183, Static546.aClass15_16, Static144.aClass188_1, Static532.aClass157_2, 2048, Static588.aClass322_1, Static121.aClass118_2, Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1);
										if (local1529 == null && Static45.aBoolean90) {
											Static282.method4860(local16);
										}
									}
									if (local1529 != null) {
										if (local16.anInt9198 <= 0) {
											local475 = 512;
										} else {
											local475 = (local16.anInt9242 << 9) / local16.anInt9198;
										}
										if (local16.anInt9237 > 0) {
											local1202 = (local16.anInt9160 << 9) / local16.anInt9237;
										} else {
											local1202 = 512;
										}
										local507 = local85 + local16.anInt9242 / 2 + (local16.anInt9187 * local475 >> 9);
										local509 = (local16.anInt9238 * local1202 >> 9) + local91 + local16.anInt9160 / 2;
										Static574.aClass255_9.Y();
										Static546.aClass15_16.method5291(Static574.aClass255_9);
										Static546.aClass15_16.m(local507, local509, local475, local1202);
										Static546.aClass15_16.ka((float) (local16.anInt9221 << 2), local16.aBoolean772 ? (float) (local16.anInt9181 << 2) : (float) (local16.anInt9181 << 2) * 1.5F);
										if (arg1 == -1412584499 || Static109.aBoolean199) {
											Static546.aClass15_16.F();
											Static546.aClass15_16.method5342();
											Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
											Static109.aBoolean199 = false;
										}
										if (local16.aBoolean770) {
											Static546.aClass15_16.method5336(false);
										}
										local520 = (local16.anInt9156 << 2) * Class2_Sub3.anIntArray620[local16.anInt9194 << 3] >> 14;
										local613 = (local16.anInt9156 << 2) * Class2_Sub3.anIntArray621[local16.anInt9194 << 3] >> 14;
										Static202.aClass255_6.ra(-local16.anInt9191 << 3);
										Static202.aClass255_6.P(local16.anInt9227 << 3);
										Static202.aClass255_6.G(local16.anInt9179 << 2, local520 + (local16.anInt9188 << 2) + local248, (local16.anInt9188 << 2) + local613);
										Static202.aClass255_6.S(local16.anInt9194 << 3);
										local16.method7502(Static202.aClass255_6, Static129.anInt10429, Static546.aClass15_16, local1529);
										if (Static109.aBoolean198) {
											Static546.aClass15_16.Q(local85, local91, local16.anInt9242 + local85, local91 - -local16.anInt9160);
										}
										if (local16.aBoolean772) {
											local1529.method7133(Static202.aClass255_6, null, local16.anInt9156 << 2);
										} else if (local16.aClass55_Sub8_8 == null) {
											local1529.method7145(Static202.aClass255_6, null, 1);
										} else {
											Static546.aClass15_16.method5309(local1529, local16.aClass55_Sub8_8.method7113(), Static202.aClass255_6, null, 1);
										}
										if (Static109.aBoolean198) {
											Static546.aClass15_16.ca(arg2, arg5, arg7, arg4);
										}
										if (local16.aBoolean770) {
											Static546.aClass15_16.method5336(true);
										}
										Static546.aClass15_16.ka(0.0F, 0.0F);
									}
								} else if (local16.anInt9211 == 9) {
									if (local16.aBoolean761) {
										local475 = local16.anInt9242 + local85;
										local1202 = local91;
										local248 = local91 + local16.anInt9160;
									} else {
										local1202 = local91 + local16.anInt9160;
										local475 = local16.anInt9242 + local85;
										local248 = local91;
									}
									if (local16.anInt9208 == 1) {
										Static546.aClass15_16.method5347(local85, local248, local475, local1202, local16.anInt9205, 0);
									} else {
										Static546.aClass15_16.method5312(local85, local248, local475, local1202, local16.anInt9205, local16.anInt9208);
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
