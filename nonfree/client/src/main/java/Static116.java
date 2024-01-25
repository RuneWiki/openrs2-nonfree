import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	public static int anInt2684;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public static int anInt2677 = 0;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
	public static int anInt2680 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)[Lclient!sb;")
	public static Class299[] method2469() {
		return new Class299[] { Static560.aClass299_6, Static273.aClass299_4, Static458.aClass299_5 };
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILclient!n;)V")
	public static void method2477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class225 arg2) {
		if (arg2.aByte69 == 0) {
			arg2.anInt6552 = arg2.anInt6540;
		} else if (arg2.aByte69 == 1) {
			arg2.anInt6552 = arg2.anInt6540 + (arg0 - arg2.anInt6529) / 2;
		} else if (arg2.aByte69 == 2) {
			arg2.anInt6552 = arg0 - arg2.anInt6540 - arg2.anInt6529;
		} else if (arg2.aByte69 == 3) {
			arg2.anInt6552 = arg2.anInt6540 * arg0 >> 14;
		} else if (arg2.aByte69 == 4) {
			arg2.anInt6552 = (arg0 - arg2.anInt6529) / 2 + (arg2.anInt6540 * arg0 >> 14);
		} else {
			arg2.anInt6552 = arg0 - (arg2.anInt6540 * arg0 >> 14) - arg2.anInt6529;
		}
		if (arg2.aByte68 == 0) {
			arg2.anInt6494 = arg2.anInt6528;
		} else if (arg2.aByte68 == 1) {
			arg2.anInt6494 = (arg1 - arg2.anInt6521) / 2 + arg2.anInt6528;
		} else if (arg2.aByte68 == 2) {
			arg2.anInt6494 = arg1 - arg2.anInt6521 - arg2.anInt6528;
		} else if (arg2.aByte68 == 3) {
			arg2.anInt6494 = arg2.anInt6528 * arg1 >> 14;
		} else if (arg2.aByte68 == 4) {
			arg2.anInt6494 = (arg2.anInt6528 * arg1 >> 14) + (arg1 - arg2.anInt6521) / 2;
		} else {
			arg2.anInt6494 = arg1 - (arg1 * arg2.anInt6528 >> 14) - arg2.anInt6521;
		}
		if (!Static57.aBoolean43) {
			return;
		}
		if (Static69.method1180(arg2).anInt156 == 0 && arg2.anInt6508 != 0) {
			return;
		}
		if (arg2.anInt6552 < 0) {
			arg2.anInt6552 = 0;
		} else if (arg0 < arg2.anInt6552 + arg2.anInt6529) {
			arg2.anInt6552 = arg0 - arg2.anInt6529;
		}
		if (arg2.anInt6494 < 0) {
			arg2.anInt6494 = 0;
			return;
		}
		if (arg1 < arg2.anInt6521 + arg2.anInt6494) {
			arg2.anInt6494 = arg1 - arg2.anInt6521;
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Z")
	public static boolean method2478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static297.method5126(arg0, arg1) || Static363.method5856(arg1, arg0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII[Lclient!n;IIII)V")
	public static void method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class225[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static440.aClass44_12.da(arg5, arg8, arg0, arg3);
		for (@Pc(18) int local18 = 0; local18 < arg4.length; local18++) {
			@Pc(24) Class225 local24 = arg4[local18];
			if (local24 != null && (local24.anInt6559 == arg7 || arg7 == -1412584499 && Static317.aClass225_54 == local24)) {
				@Pc(47) int local47;
				if (arg2 == -1) {
					Class1_Sub4_Sub2_Sub3.aRectangleArray2[Static68.anInt1112].setBounds(arg1 + local24.anInt6552, arg6 + local24.anInt6494, local24.anInt6529, local24.anInt6521);
					local47 = Static68.anInt1112++;
				} else {
					local47 = arg2;
				}
				local24.anInt6524 = local47;
				local24.anInt6496 = Static106.anInt2418;
				if (!Static69.method1181(local24)) {
					if (local24.anInt6491 != 0) {
						Static310.method5265(local24);
					}
					@Pc(91) int local91 = local24.anInt6552 + arg1;
					@Pc(96) int local96 = arg6 + local24.anInt6494;
					@Pc(99) int local99 = local24.anInt6539;
					if (Static57.aBoolean43 && (Static69.method1180(local24).anInt156 != 0 || local24.anInt6508 == 0) && local99 > 127) {
						local99 = 127;
					}
					@Pc(152) int local152;
					@Pc(156) int local156;
					if (Static317.aClass225_54 == local24) {
						if (arg7 != -1412584499 && (Static529.anInt9426 == local24.anInt6567 || Static364.anInt7051 == local24.anInt6567)) {
							Static177.anInt9183 = arg1;
							Static560.aClass225Array2 = arg4;
							Static177.anInt9179 = arg6;
							continue;
						}
						if (Static211.aBoolean299 && Static320.aBoolean455) {
							local152 = Static172.aClass135_1.method6370();
							local156 = Static172.aClass135_1.method6378();
							local152 -= Static255.anInt4672;
							local156 -= Static323.anInt6277;
							if (Static366.anInt8691 > local152) {
								local152 = Static366.anInt8691;
							}
							if (Static366.anInt8691 + Static167.aClass225_16.anInt6529 < local152 + local24.anInt6529) {
								local152 = Static366.anInt8691 + Static167.aClass225_16.anInt6529 - local24.anInt6529;
							}
							if (local156 < Static307.anInt6169) {
								local156 = Static307.anInt6169;
							}
							local91 = local152;
							if (local156 + local24.anInt6521 > Static167.aClass225_16.anInt6521 + Static307.anInt6169) {
								local156 = Static167.aClass225_16.anInt6521 + Static307.anInt6169 - local24.anInt6521;
							}
							local96 = local156;
						}
						if (Static364.anInt7051 == local24.anInt6567) {
							local99 = 128;
						}
					}
					@Pc(249) int local249;
					@Pc(245) int local245;
					@Pc(256) int local256;
					@Pc(262) int local262;
					if (local24.anInt6508 == 2) {
						local156 = arg8;
						local245 = arg3;
						local152 = arg5;
						local249 = arg0;
					} else {
						local256 = local24.anInt6529 + local91;
						local262 = local96 + local24.anInt6521;
						if (local24.anInt6508 == 9) {
							local256++;
							local262++;
						}
						local156 = arg8 < local96 ? local96 : arg8;
						local152 = arg5 >= local91 ? arg5 : local91;
						local245 = arg3 > local262 ? local262 : arg3;
						local249 = arg0 > local256 ? local256 : arg0;
					}
					if (local249 > local152 && local245 > local156) {
						@Pc(538) int local538;
						@Pc(549) int local549;
						@Pc(643) int local643;
						@Pc(502) int local502;
						@Pc(536) int local536;
						if (local24.anInt6491 != 0) {
							if (Static452.anInt8509 == local24.anInt6491 || Static526.anInt3463 == local24.anInt6491) {
								Static66.method1075(local91, local96, local24.anInt6521, local24.anInt6529, Static526.anInt3463 == local24.anInt6491);
								Static261.aBooleanArray18[local47] = true;
								Static440.aClass44_12.da(arg5, arg8, arg0, arg3);
								continue;
							}
							if (Static80.anInt9683 == local24.anInt6491) {
								if (local24.method5508(Static440.aClass44_12) != null) {
									Static390.method6204();
									Static125.method2597(local96, local91, Static440.aClass44_12, local24);
									Static250.aBooleanArray13[local47] = true;
									Static440.aClass44_12.da(arg5, arg8, arg0, arg3);
								}
								continue;
							}
							if (Static437.anInt8178 == local24.anInt6491) {
								if (local24.method5508(Static440.aClass44_12) != null) {
									Static240.method7428(local96, local91, local24);
									Static250.aBooleanArray13[local47] = true;
									Static440.aClass44_12.da(arg5, arg8, arg0, arg3);
								}
								continue;
							}
							if (Static135.anInt2898 == local24.anInt6491) {
								Static386.method6101(Static237.anInterface11_8, Static440.aClass44_12, local91, local24.anInt6529, local96, local24.anInt6521);
								Static261.aBooleanArray18[local47] = true;
								Static440.aClass44_12.da(arg5, arg8, arg0, arg3);
								continue;
							}
							if (Static246.anInt4514 == local24.anInt6491) {
								Static12.method181(local24.anInt6521, Static440.aClass44_12, local24.anInt6529, local91, local96);
								Static261.aBooleanArray18[local47] = true;
								Static440.aClass44_12.da(arg5, arg8, arg0, arg3);
								continue;
							}
							if (Static503.anInt9050 == local24.anInt6491) {
								if (!Static397.aBoolean521 && !Static589.aBoolean719) {
									continue;
								}
								local256 = local24.anInt6529 + local91;
								local262 = local96 + 15;
								if (Static397.aBoolean521) {
									local502 = -256;
									if (Static382.anInt7358 < 20) {
										local502 = -65536;
									}
									Static272.aClass58_5.method8162(local256, local502, local262, -1, "Fps:" + Static382.anInt7358);
									local262 += 15;
									@Pc(526) Runtime local526 = Runtime.getRuntime();
									local536 = (int) ((local526.totalMemory() - local526.freeMemory()) / 1024L);
									local538 = -256;
									if (local536 > 98304) {
										local538 = -65536;
										if (Static34.aBoolean28) {
											Static295.method8178();
											for (local549 = 0; local549 < 10; local549++) {
												System.gc();
											}
											local536 = (int) ((local526.totalMemory() - local526.freeMemory()) / 1024L);
											if (local536 > 65536) {
												Static465.method7052("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static272.aClass58_5.method8162(local256, local538, local262, -1, "Mem:" + local536 + "k");
									local262 += 15;
									Static272.aClass58_5.method8162(local256, -256, local262, -1, "In:" + Static553.anInt9815 + "B/s Out:" + Static582.anInt10108 + "B/s");
									local262 += 15;
									local549 = Static440.aClass44_12.b() / 1024;
									Static272.aClass58_5.method8162(local256, local549 > 65536 ? -65536 : -256, local262, -1, "Offheap:" + local549 + "k");
									local262 += 15;
									local643 = 0;
									@Pc(645) int local645 = 0;
									@Pc(647) int local647 = 0;
									for (@Pc(649) int local649 = 0; local649 < 35; local649++) {
										if (Static31.aClass146_Sub1Array1[local649] != null) {
											local643 += Static31.aClass146_Sub1Array1[local649].method3525();
											local645 += Static31.aClass146_Sub1Array1[local649].method3526();
											local647 += Static31.aClass146_Sub1Array1[local649].method3519();
										}
									}
									@Pc(691) int local691 = local647 * 100 / local643;
									@Pc(697) int local697 = local645 * 10000 / local643;
									@Pc(717) String local717 = "Cache:" + Static461.method7018(true, 2, (long) local697, 0) + "% (" + local691 + "%)";
									Static454.aClass58_13.method8162(local256, -256, local262, -1, local717);
									local262 += 12;
								}
								if (Static542.anInt9640 > 0) {
									Static454.aClass58_13.method8162(local256, -256, local262, -1, "Particles: " + Static307.anInt6164 + " / " + Static542.anInt9640);
								}
								local262 += 12;
								if (Static589.aBoolean719) {
									Static454.aClass58_13.method8162(local256, -256, local262, -1, "Polys: " + Static440.aClass44_12.DA() + " Models: " + Static440.aClass44_12.T());
									local262 += 12;
									Static454.aClass58_13.method8162(local256, -256, local262, -1, "Ls: " + anInt2680 + " La: " + Static439.anInt8200 + " NPC: " + Static536.anInt9532 + " Pl: " + Static499.anInt3412);
									Static102.method5288();
									local262 += 12;
								}
								Static261.aBooleanArray18[local47] = true;
								continue;
							}
						}
						if (local24.anInt6508 == 0) {
							if (Static546.anInt9680 == local24.anInt6491 && Static440.aClass44_12.method5019()) {
								Static440.aClass44_12.method4981(local91, local96, local24.anInt6529, local24.anInt6521);
							}
							method2479(local249, local91 - local24.anInt6485, local47, local245, arg4, local152, local96 - local24.anInt6563, local24.anInt6555, local156);
							if (local24.aClass225Array1 != null) {
								method2479(local249, local91 - local24.anInt6485, local47, local245, local24.aClass225Array1, local152, local96 - local24.anInt6563, local24.anInt6555, local156);
							}
							@Pc(882) Class4_Sub37 local882 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local24.anInt6555);
							if (local882 != null) {
								Static425.method6641(local47, local245, local249, local96, local156, local91, local882.anInt8141, local152);
							}
							if (local24.anInt6491 == Static546.anInt9680 && Static440.aClass44_12.method5019()) {
								Static440.aClass44_12.method5003();
							}
							Static440.aClass44_12.da(arg5, arg8, arg0, arg3);
						}
						if (Static222.aBooleanArray9[local47] || Static534.anInt9511 > 1) {
							if (local24.anInt6508 == 3) {
								if (local99 == 0) {
									if (local24.aBoolean486) {
										Static440.aClass44_12.J(local91, local96, local24.anInt6529, local24.anInt6521, local24.anInt6560, 0);
									} else {
										Static440.aClass44_12.method4996(local91, local96, local24.anInt6529, local24.anInt6521, local24.anInt6560, 0);
									}
								} else if (local24.aBoolean486) {
									Static440.aClass44_12.J(local91, local96, local24.anInt6529, local24.anInt6521, local24.anInt6560 & 0xFFFFFF | 255 - (local99 & 0xFF) << 24, 1);
								} else {
									Static440.aClass44_12.method4996(local91, local96, local24.anInt6529, local24.anInt6521, 255 - (local99 & 0xFF) << 24 | local24.anInt6560 & 0xFFFFFF, 1);
								}
							} else if (local24.anInt6508 == 4) {
								@Pc(1020) Class58 local1020 = local24.method5517(Static440.aClass44_12);
								if (local1020 != null) {
									local262 = local24.anInt6560;
									@Pc(1035) String local1035 = local24.aString67;
									if (local24.anInt6527 != -1) {
										@Pc(1045) Class242 local1045 = Static521.aClass273_2.method6712(local24.anInt6527);
										local1035 = local1045.aString71;
										if (local1035 == null) {
											local1035 = "null";
										}
										if ((local1045.anInt7140 == 1 || local24.anInt6500 != 1) && local24.anInt6500 != -1) {
											local1035 = "<col=ff9040>" + local1035 + "</col> x" + Static157.method2909(local24.anInt6500);
										}
									}
									if (local24 == Static69.aClass225_8) {
										local1035 = Static590.aClass364_35.method8334(Static154.anInt3181);
										local262 = local24.anInt6560;
									}
									if (Static77.aBoolean82) {
										Static440.aClass44_12.V(local91, local96, local24.anInt6529 + local91, local96 - -local24.anInt6521);
									}
									local1020.method8168(null, local262 | 255 - (local99 & 0xFF) << 24, local24.anInt6533, null, local24.anInt6521, local1035, local24.aBoolean472 ? 255 - (local99 & 0xFF) << 24 : -1, local24.anInt6505, 0, local91, Static188.aClass78Array10, local24.anInt6529, local24.anInt6557, local96, local24.anInt6511, 0);
									if (Static77.aBoolean82) {
										Static440.aClass44_12.da(arg5, arg8, arg0, arg3);
									}
								} else if (Static581.aBoolean714) {
									Static92.method2100(local24);
								}
							} else {
								@Pc(1266) int local1266;
								if (local24.anInt6508 == 5) {
									if (local24.anInt6564 >= 0) {
										local24.method5519(Static419.aClass28_1, Static594.aClass170_1).method5317(local24.anInt6521, 0, Static440.aClass44_12, local91, 0, local24.anInt6482 << 3, local96, local24.anInt6529, local24.anInt6562 << 3);
									} else {
										@Pc(1209) Class78 local1209;
										if (local24.anInt6527 == -1) {
											local1209 = local24.method5520(Static440.aClass44_12);
										} else {
											@Pc(1219) Class166 local1219 = local24.aBoolean474 ? Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1 : null;
											local1209 = Static521.aClass273_2.method6723(local1219, local24.anInt6500, Static440.aClass44_12, local24.anInt6479 | 0xFF000000, local24.anInt6566, local24.anInt6498, local24.anInt6527);
										}
										if (local1209 != null) {
											local262 = local1209.A();
											local502 = local1209.ca();
											local1266 = (local24.anInt6560 == 0 ? 16777215 : local24.anInt6560 & 0xFFFFFF) | 255 - (local99 & 0xFF) << 24;
											if (local24.aBoolean475) {
												Static440.aClass44_12.V(local91, local96, local91 + local24.anInt6529, local96 + local24.anInt6521);
												if (local24.lb != 0) {
													local536 = (local262 + local24.anInt6529 - 1) / local262;
													local538 = (local502 + local24.anInt6521 - 1) / local502;
													for (local549 = 0; local549 < local536; local549++) {
														for (local643 = 0; local643 < local538; local643++) {
															if (local24.anInt6560 == 0) {
																local1209.method8189((float) local262 / 2.0F + (float) (local91 + local262 * local549), (float) local502 / 2.0F + (float) (local96 - -(local502 * local643)), 4096, local24.lb);
															} else {
																local1209.method8190((float) local262 / 2.0F + (float) (local549 * local262 + local91), (float) (local502 * local643 + local96) + (float) local502 / 2.0F, 4096, local24.lb, local1266);
															}
														}
													}
												} else if (local24.anInt6560 == 0 && local99 == 0) {
													local1209.method8184(local91, local96, local24.anInt6529, local24.anInt6521);
												} else {
													local1209.DA(local91, local96, local24.anInt6529, local24.anInt6521, 0, local1266, 1);
												}
												Static440.aClass44_12.da(arg5, arg8, arg0, arg3);
											} else if (local24.anInt6560 == 0 && local99 == 0) {
												if (local24.lb != 0) {
													local1209.method8189((float) local91 + (float) local24.anInt6529 / 2.0F, (float) local24.anInt6521 / 2.0F + (float) local96, local24.anInt6529 * 4096 / local262, local24.lb);
												} else if (local262 == local24.anInt6529 && local24.anInt6521 == local502) {
													local1209.method8185(local91, local96);
												} else {
													local1209.method8187(local91, local96, local24.anInt6529, local24.anInt6521);
												}
											} else if (local24.lb != 0) {
												local1209.method8190((float) local91 + (float) local24.anInt6529 / 2.0F, (float) local96 + (float) local24.anInt6521 / 2.0F, local24.anInt6529 * 4096 / local262, local24.lb, local1266);
											} else if (local24.anInt6529 == local262 && local24.anInt6521 == local502) {
												local1209.V(local91, local96, 0, local1266, 1);
											} else {
												local1209.method8194(local91, local96, local24.anInt6529, local24.anInt6521, 0, local1266, 1);
											}
										} else if (Static581.aBoolean714) {
											Static92.method2100(local24);
										}
									}
								} else if (local24.anInt6508 == 6) {
									Static137.method2714();
									@Pc(1590) Class57 local1590 = null;
									local262 = 0;
									@Pc(1623) Class365 local1623;
									@Pc(1631) Class166 local1631;
									if (local24.anInt6527 != -1) {
										@Pc(1602) Class242 local1602 = Static521.aClass273_2.method6712(local24.anInt6527);
										if (local1602 != null) {
											local1602 = local1602.method5886(local24.anInt6500);
											local1623 = local24.anInt6510 == -1 ? null : Static61.aClass48_1.method1016(local24.anInt6510);
											local1631 = local24.aBoolean474 ? Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1 : null;
											local1590 = local1602.method5893(local24.anInt6541, Static440.aClass44_12, local24.anInt6530, local1631, local24.anInt6512, local1623, 2048, 1);
											if (local1590 == null) {
												Static92.method2100(local24);
											} else {
												local262 = -local1590.J() >> 1;
											}
										}
									} else if (local24.anInt6538 == 5) {
										local502 = local24.anInt6488;
										if (local502 >= 0 && local502 < 2048) {
											@Pc(1678) Class1_Sub4_Sub2_Sub1_Sub2 local1678 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local502];
											@Pc(1691) Class365 local1691 = local24.anInt6510 == -1 ? null : Static61.aClass48_1.method1016(local24.anInt6510);
											if (local1678 != null && (Static411.anInt7797 == local502 || Static49.method636(local1678.aString78) == local24.anInt6544)) {
												local1590 = local1678.aClass166_1.method3735(2048, local24.anInt6530, local1691, null, 0, local24.anInt6512, 0, Static462.aClass178_1, Static61.aClass48_1, 0, null, -1, Static237.aClass31_1, Static440.aClass44_12, local24.anInt6541, Static521.aClass273_2, Static45.aClass148_1, Static522.aClass290_6, null);
											}
										}
									} else if (local24.anInt6538 == 8 || local24.anInt6538 == 9) {
										@Pc(1824) Class4_Sub18 local1824 = Static72.method6564(false, local24.anInt6488);
										local1623 = local24.anInt6510 == -1 ? null : Static61.aClass48_1.method1016(local24.anInt6510);
										if (local1824 != null) {
											local1631 = local24.aBoolean474 ? Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1 : null;
											local1590 = local1824.method2748(local24.anInt6512, local24.anInt6544, local24.anInt6538 == 9, local24.anInt6541, local1631, Static440.aClass44_12, local24.anInt6530, local1623);
										}
									} else if (local24.anInt6510 == -1) {
										local1590 = local24.method5521(Static462.aClass178_1, -1, -1, Static45.aClass148_1, null, Static522.aClass290_6, Static440.aClass44_12, 2048, Static61.aClass48_1, Static237.aClass31_1, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1, Static521.aClass273_2, 0);
										if (local1590 == null && Static581.aBoolean714) {
											Static92.method2100(local24);
										}
									} else {
										@Pc(1789) Class365 local1789 = Static61.aClass48_1.method1016(local24.anInt6510);
										local1590 = local24.method5521(Static462.aClass178_1, local24.anInt6541, local24.anInt6530, Static45.aClass148_1, local1789, Static522.aClass290_6, Static440.aClass44_12, 2048, Static61.aClass48_1, Static237.aClass31_1, Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1, Static521.aClass273_2, local24.anInt6512);
										if (local1590 == null && Static581.aBoolean714) {
											Static92.method2100(local24);
										}
									}
									if (local1590 != null) {
										if (local24.anInt6519 > 0) {
											local502 = (local24.anInt6529 << 9) / local24.anInt6519;
										} else {
											local502 = 512;
										}
										if (local24.anInt6483 <= 0) {
											local1266 = 512;
										} else {
											local1266 = (local24.anInt6521 << 9) / local24.anInt6483;
										}
										local536 = local24.anInt6529 / 2 + local91;
										local538 = local24.anInt6521 / 2 + local96;
										if (!local24.aBoolean483) {
											local536 += local502 * local24.anInt6502 >> 9;
											local538 += local24.anInt6551 * local1266 >> 9;
										}
										Static267.aClass8_3.Y();
										Static440.aClass44_12.method4999(Static267.aClass8_3);
										Static440.aClass44_12.la(local536, local538, local502, local1266);
										Static440.aClass44_12.ya();
										if (local24.aBoolean477) {
											Static440.aClass44_12.ZA(false);
										}
										if (local24.aBoolean483) {
											Static410.aClass8_6.oa(local24.anInt6525);
											Static410.aClass8_6.ZA(local24.anInt6548);
											Static410.aClass8_6.AA(local24.anInt6561);
											Static410.aClass8_6.U(local24.anInt6502, local24.anInt6551, local24.anInt6531);
										} else {
											local549 = Class4_Sub27.anIntArray296[local24.anInt6525 << 3] * (local24.anInt6543 << 2) >> 14;
											local643 = Class4_Sub27.anIntArray297[local24.anInt6525 << 3] * (local24.anInt6543 << 2) >> 14;
											Static410.aClass8_6.J(-local24.anInt6561 << 3);
											Static410.aClass8_6.ZA(local24.anInt6548 << 3);
											Static410.aClass8_6.U(local24.anInt6509 << 2, local549 + (local24.anInt6518 << 2) + local262, local643 - -(local24.anInt6518 << 2));
											Static410.aClass8_6.w(local24.anInt6525 << 3);
										}
										local24.method5522(local1590, Static410.aClass8_6, Static106.anInt2418, Static440.aClass44_12);
										if (Static77.aBoolean82) {
											Static440.aClass44_12.V(local91, local96, local91 + local24.anInt6529, local24.anInt6521 + local96);
										}
										if (local24.aBoolean483) {
											if (local24.aBoolean473) {
												local1590.method7919(Static410.aClass8_6, null, local24.anInt6543, 1);
											} else {
												local1590.method7927(Static410.aClass8_6, null, 1);
												if (local24.aClass1_Sub2_5 != null) {
													Static440.aClass44_12.method5017(local24.aClass1_Sub2_5.method326());
												}
											}
										} else if (local24.aBoolean473) {
											local1590.method7919(Static410.aClass8_6, null, local24.anInt6543 << 2, 1);
										} else {
											local1590.method7927(Static410.aClass8_6, null, 1);
											if (local24.aClass1_Sub2_5 != null) {
												Static440.aClass44_12.method5017(local24.aClass1_Sub2_5.method326());
											}
										}
										if (Static77.aBoolean82) {
											Static440.aClass44_12.da(arg5, arg8, arg0, arg3);
										}
										if (local24.aBoolean477) {
											Static440.aClass44_12.ZA(true);
										}
									}
								} else if (local24.anInt6508 == 9) {
									if (local24.aBoolean481) {
										local502 = local91 + local24.anInt6529;
										local262 = local24.anInt6521 + local96;
										local1266 = local96;
									} else {
										local1266 = local24.anInt6521 + local96;
										local262 = local96;
										local502 = local24.anInt6529 + local91;
									}
									if (local24.anInt6495 == 1) {
										Static440.aClass44_12.method5001(local91, local262, local502, local1266, local24.anInt6560, 0);
									} else {
										Static440.aClass44_12.method4978(local91, local262, local502, local1266, local24.anInt6560, local24.anInt6495);
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
