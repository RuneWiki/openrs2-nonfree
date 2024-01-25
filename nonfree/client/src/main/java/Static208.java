import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt3851;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "[I")
	public static int[] anIntArray319;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "Lclient!te;")
	public static Class222 aClass222_3;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
	public static int anInt3847 = 0;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_51 = new Class84("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_52 = new Class84(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_53 = new Class84("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILclient!gf;)V")
	public static void method3188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26_Sub4 arg3) {
		@Pc(4) Class211 local4 = Static197.method3007(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass26_Sub4_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII[Lclient!ss;IIII)V")
	public static void method3190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class219[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
		for (@Pc(18) int local18 = 0; local18 < arg5.length; local18++) {
			@Pc(24) Class219 local24 = arg5[local18];
			if (local24 != null && (arg2 == local24.anInt6379 || arg2 == -1412584499 && local24 == Static442.aClass219_14)) {
				@Pc(67) int local67;
				if (arg6 == -1) {
					Class1_Sub45.aRectangleArray2[Static262.anInt4661].setBounds(arg8 + local24.anInt6418, arg4 + local24.anInt6375, local24.anInt6398, local24.anInt6363);
					local67 = Static262.anInt4661++;
				} else {
					local67 = arg6;
				}
				local24.anInt6361 = Static403.anInt6978;
				local24.anInt6359 = local67;
				if (!Static53.method925(local24)) {
					if (local24.anInt6384 != 0) {
						Static415.method5605(local24);
					}
					@Pc(94) int local94 = local24.anInt6418 + arg8;
					@Pc(100) int local100 = local24.anInt6375 + arg4;
					@Pc(103) int local103 = local24.anInt6348;
					if (Static239.aBoolean287 && (Static53.method916(local24).anInt7461 != 0 || local24.anInt6377 == 0) && local103 > 127) {
						local103 = 127;
					}
					@Pc(160) int local160;
					@Pc(164) int local164;
					if (local24 == Static442.aClass219_14) {
						if (arg2 != -1412584499 && (Static90.anInt1736 == local24.anInt6426 || Static126.anInt2250 == local24.anInt6426)) {
							Static195.anInt3535 = arg4;
							Static209.anInt7824 = arg8;
							Static268.aClass219Array2 = arg5;
							continue;
						}
						if (Static385.aBoolean439 && Static400.aBoolean448) {
							local160 = Static16.aClass228_1.method5485();
							local164 = Static16.aClass228_1.method5486();
							local160 -= Static63.anInt1323;
							local164 -= Static285.anInt7840;
							if (local160 < Static365.anInt6210) {
								local160 = Static365.anInt6210;
							}
							if (local164 < Static394.anInt6861) {
								local164 = Static394.anInt6861;
							}
							if (Static365.anInt6210 + Static207.aClass219_11.anInt6398 < local160 - -local24.anInt6398) {
								local160 = Static365.anInt6210 + Static207.aClass219_11.anInt6398 - local24.anInt6398;
							}
							local94 = local160;
							if (Static394.anInt6861 + Static207.aClass219_11.anInt6363 < local24.anInt6363 + local164) {
								local164 = Static207.aClass219_11.anInt6363 + Static394.anInt6861 - local24.anInt6363;
							}
							local100 = local164;
						}
						if (Static126.anInt2250 == local24.anInt6426) {
							local103 = 128;
						}
					}
					@Pc(259) int local259;
					@Pc(261) int local261;
					@Pc(268) int local268;
					@Pc(273) int local273;
					if (local24.anInt6377 == 2) {
						local160 = arg7;
						local164 = arg0;
						local259 = arg1;
						local261 = arg3;
					} else {
						local268 = local94 + local24.anInt6398;
						local273 = local24.anInt6363 + local100;
						local164 = local100 <= arg0 ? arg0 : local100;
						if (local24.anInt6377 == 9) {
							local268++;
							local273++;
						}
						local160 = local94 <= arg7 ? arg7 : local94;
						local259 = local268 >= arg1 ? arg1 : local268;
						local261 = local273 < arg3 ? local273 : arg3;
					}
					if (local259 > local160 && local261 > local164) {
						@Pc(577) int local577;
						@Pc(603) int local603;
						@Pc(605) int local605;
						@Pc(527) int local527;
						@Pc(529) int local529;
						if (local24.anInt6384 != 0) {
							if (local24.anInt6384 == Static67.anInt1398 || Static353.anInt6049 == local24.anInt6384) {
								Static20.method388(local24.anInt6363, local94, local24.anInt6398, local100, local24.anInt6384 == Static353.anInt6049);
								Static22.aBooleanArray12[local67] = true;
								Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
								continue;
							}
							if (local24.anInt6384 == Static315.anInt5852) {
								if (local24.method5127(Static276.aClass109_10) != null) {
									Static81.method1403();
									Static144.method2159(local94, local100, local24, Static276.aClass109_10);
									Static108.aBooleanArray7[local67] = true;
									Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
								}
								continue;
							}
							if (local24.anInt6384 == Static166.anInt6110) {
								if (local24.method5127(Static276.aClass109_10) != null) {
									Static129.method1884(local24, local94, local100);
									Static108.aBooleanArray7[local67] = true;
									Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
								}
								continue;
							}
							if (Static253.anInt4559 == local24.anInt6384) {
								Static13.method301(local24.anInt6363, Static276.aClass109_10, local94, Static184.anInterface7_8, local100, local24.anInt6398);
								Static22.aBooleanArray12[local67] = true;
								Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
								continue;
							}
							if (local24.anInt6384 == Static399.anInt6929) {
								Static75.method1287(local24.anInt6363, Static276.aClass109_10, local24.anInt6398, local100, local94);
								Static22.aBooleanArray12[local67] = true;
								Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
								continue;
							}
							if (Static227.anInt4114 == local24.anInt6384) {
								if (!Static195.aBoolean209 && !Static197.aBoolean250) {
									continue;
								}
								local268 = local94 + local24.anInt6398;
								local273 = local100 + 15;
								if (Static195.aBoolean209) {
									Static372.aClass129_6.method5834("Fps:" + Static14.anInt344, -256, local273, local268);
									local273 += 15;
									@Pc(518) Runtime local518 = Runtime.getRuntime();
									local527 = (int) ((local518.totalMemory() - local518.freeMemory()) / 1024L);
									local529 = -256;
									if (local527 > 65536) {
										local529 = -65536;
									}
									Static372.aClass129_6.method5834("Mem:" + local527 + "k", local529, local273, local268);
									local273 += 15;
									Static372.aClass129_6.method5834("In:" + Static3.anInt170 + "B/s Out:" + Static361.anInt6132 + "B/s", -256, local273, local268);
									local273 += 15;
									local577 = Static276.aClass109_10.FA() / 1024;
									Static372.aClass129_6.method5834("Offheap:" + local577 + "k", local577 <= 65536 ? -256 : -65536, local273, local268);
									local273 += 15;
									local603 = 0;
									local605 = 0;
									@Pc(607) int local607 = 0;
									for (@Pc(609) int local609 = 0; local609 < 30; local609++) {
										local603 += Static324.aClass16_Sub1Array1[local609].method408();
										local605 += Static324.aClass16_Sub1Array1[local609].method404();
										local607 += Static324.aClass16_Sub1Array1[local609].method401();
									}
									@Pc(645) int local645 = local607 * 100 / local603;
									@Pc(651) int local651 = local605 * 10000 / local603;
									@Pc(671) String local671 = "Cache:" + Static113.method4625(true, (long) local651, 0, 2) + "% (" + local645 + "%)";
									Static197.aClass129_2.method5834(local671, -256, local273, local268);
									local273 += 12;
								}
								if (Static63.anInt1320 > 0) {
									Static197.aClass129_2.method5834("Particles: " + Static119.anInt7599 + " / " + Static63.anInt1320, -256, local273, local268);
								}
								local273 += 12;
								if (Static197.aBoolean250) {
									Static197.aClass129_2.method5834("Polys: " + Static276.aClass109_10.xa() + " Models: " + Static276.aClass109_10.g(), -256, local273, local268);
									local273 += 12;
									Static197.aClass129_2.method5834("Ls: " + Static351.anInt5993 + " La: " + Static110.anInt2505 + " NPC: " + Static153.anInt6274 + " Pl: " + Static247.anInt3928, -256, local273, local268);
									Static52.method873();
									local273 += 12;
								}
								Static22.aBooleanArray12[local67] = true;
								continue;
							}
						}
						if (local24.anInt6377 == 0) {
							if (Static351.anInt5996 == local24.anInt6384 && Static276.aClass109_10.method4687()) {
								Static276.aClass109_10.method4742(local94, local100, local24.anInt6398, local24.anInt6363);
							}
							method3190(local164, local259, local24.anInt6422, local261, local100 - local24.anInt6371, arg5, local67, local160, local94 - local24.anInt6368);
							if (local24.aClass219Array3 != null) {
								method3190(local164, local259, local24.anInt6422, local261, local100 - local24.anInt6371, local24.aClass219Array3, local67, local160, local94 - local24.anInt6368);
							}
							@Pc(834) Class1_Sub36 local834 = (Class1_Sub36) Static445.aClass27_42.method553((long) local24.anInt6422);
							if (local834 != null) {
								Static243.method3592(local261, local160, local100, local67, local164, local259, local834.anInt5680, local94);
							}
							if (Static351.anInt5996 == local24.anInt6384 && Static276.aClass109_10.method4687()) {
								Static276.aClass109_10.method4693();
								Static203.aBoolean253 = true;
							}
							Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
						}
						if (Static240.aBooleanArray15[local67] || Static86.anInt1673 > 1) {
							if (local24.anInt6377 == 3) {
								if (local103 == 0) {
									if (local24.aBoolean415) {
										Static276.aClass109_10.NA(local94, local100, local24.anInt6398, local24.anInt6363, local24.anInt6339, 0);
									} else {
										Static276.aClass109_10.method4685(local94, local100, local24.anInt6398, local24.anInt6363, local24.anInt6339, 0);
									}
								} else if (local24.aBoolean415) {
									Static276.aClass109_10.NA(local94, local100, local24.anInt6398, local24.anInt6363, local24.anInt6339 & 0xFFFFFF | 255 - (local103 & 0xFF) << 24, 1);
								} else {
									Static276.aClass109_10.method4685(local94, local100, local24.anInt6398, local24.anInt6363, local24.anInt6339 & 0xFFFFFF | 255 - (local103 & 0xFF) << 24, 1);
								}
							} else if (local24.anInt6377 == 4) {
								@Pc(968) Class129 local968 = local24.method5120(Static276.aClass109_10);
								if (local968 != null) {
									local273 = local24.anInt6339;
									@Pc(983) String local983 = local24.aString45;
									if (local24.anInt6421 != -1) {
										@Pc(994) Class268 local994 = Static196.aClass139_1.method3228(local24.anInt6421);
										local983 = local994.aString66;
										if (local983 == null) {
											local983 = "null";
										}
										if ((local994.anInt7785 == 1 || local24.anInt6374 != 1) && local24.anInt6374 != -1) {
											local983 = "<col=ff9040>" + local983 + "</col> x" + Static107.method1657(local24.anInt6374);
										}
									}
									if (local24 == Static419.aClass219_18) {
										local983 = Static376.aClass84_86.method1678(Static167.anInt3118);
										local273 = local24.anInt6339;
									}
									if (Static205.aBoolean261) {
										Static276.aClass109_10.Z(local94, local100, local94 + local24.anInt6398, local100 - -local24.anInt6363);
									}
									local968.method5833(local983, local24.aBoolean414 ? 255 - (local103 & 0xFF) << 24 : -1, 0, local24.anInt6393, local24.anInt6400, local24.anInt6398, null, local24.anInt6424, local100, local24.anInt6363, 0, local273 | 255 - (local103 & 0xFF) << 24, local24.anInt6364, local94, Static201.aClass80Array7, null);
									if (Static205.aBoolean261) {
										Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
									}
								} else if (Static184.aBoolean198) {
									Static355.method4895(local24);
								}
							} else {
								@Pc(1192) int local1192;
								if (local24.anInt6377 == 5) {
									if (local24.anInt6383 >= 0) {
										local24.method5123(Static141.aClass168_1, Static199.aClass134_1).method3594(local24.anInt6397 << 3, local100, 0, local24.anInt6363, local24.anInt6429 << 3, Static276.aClass109_10, local24.anInt6398, local94, 0);
									} else {
										@Pc(1177) Class80 local1177;
										if (local24.anInt6421 == -1) {
											local1177 = local24.method5130(Static276.aClass109_10);
										} else {
											@Pc(1159) Class127 local1159 = local24.aBoolean421 ? Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1 : null;
											local1177 = Static196.aClass139_1.method3234(local24.anInt6374, local24.anInt6421, local1159, local24.anInt6403, local24.anInt6389, Static276.aClass109_10, local24.anInt6405 | 0xFF000000);
										}
										if (local1177 != null) {
											local273 = local1177.ja();
											local1192 = local1177.JA();
											local527 = 255 - (local103 & 0xFF) << 24 | (local24.anInt6339 == 0 ? 16777215 : local24.anInt6339 & 0xFFFFFF);
											if (local24.aBoolean412) {
												Static276.aClass109_10.Z(local94, local100, local24.anInt6398 + local94, local24.anInt6363 + local100);
												if (local24.anInt6392 != 0) {
													local529 = (local273 + local24.anInt6398 - 1) / local273;
													local577 = (local24.anInt6363 + local1192 - 1) / local1192;
													for (local603 = 0; local603 < local529; local603++) {
														for (local605 = 0; local605 < local577; local605++) {
															if (local24.anInt6339 == 0) {
																local1177.method6097((float) (local94 + local273 * local603) + (float) local273 / 2.0F, (float) local1192 / 2.0F + (float) (local100 + local1192 * local605), 4096, local24.anInt6392);
															} else {
																local1177.method6095((float) local273 / 2.0F + (float) (local603 * local273 + local94), (float) local1192 / 2.0F + (float) (local1192 * local605 + local100), 4096, local24.anInt6392, local527);
															}
														}
													}
												} else if (local24.anInt6339 == 0 && local103 == 0) {
													local1177.method6100(local94, local100, local24.anInt6398, local24.anInt6363);
												} else {
													local1177.D(local94, local100, local24.anInt6398, local24.anInt6363, 0, local527, 1);
												}
												Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
											} else if (local24.anInt6339 == 0 && local103 == 0) {
												if (local24.anInt6392 != 0) {
													local1177.method6097((float) local24.anInt6398 / 2.0F + (float) local94, (float) local24.anInt6363 / 2.0F + (float) local100, local24.anInt6398 * 4096 / local273, local24.anInt6392);
												} else if (local24.anInt6398 == local273 && local24.anInt6363 == local1192) {
													local1177.method6099(local94, local100);
												} else {
													local1177.method6093(local94, local100, local24.anInt6398, local24.anInt6363);
												}
											} else if (local24.anInt6392 != 0) {
												local1177.method6095((float) local24.anInt6398 / 2.0F + (float) local94, (float) local24.anInt6363 / 2.0F + (float) local100, local24.anInt6398 * 4096 / local273, local24.anInt6392, local527);
											} else if (local24.anInt6398 == local273 && local24.anInt6363 == local1192) {
												local1177.YA(local94, local100, 0, local527, 1);
											} else {
												local1177.M(local94, local100, local24.anInt6398, local24.anInt6363, 0, local527, 1);
											}
										} else if (Static184.aBoolean198) {
											Static355.method4895(local24);
										}
									}
								} else if (local24.anInt6377 == 6) {
									Static170.method2698();
									@Pc(1531) Class37 local1531 = null;
									local273 = 0;
									@Pc(1564) Class191 local1564;
									@Pc(1572) Class127 local1572;
									if (local24.anInt6421 != -1) {
										@Pc(1544) Class268 local1544 = Static196.aClass139_1.method3228(local24.anInt6421);
										if (local1544 != null) {
											local1544 = local1544.method6029(local24.anInt6374);
											local1564 = local24.anInt6417 == -1 ? null : Static191.aClass28_1.method567(local24.anInt6417);
											local1572 = local24.aBoolean421 ? Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1 : null;
											local1531 = local1544.method6028(1, local24.anInt6396, local24.anInt6420, local1564, local1572, 2048, Static276.aClass109_10, local24.anInt6425);
											if (local1531 == null) {
												Static355.method4895(local24);
											} else {
												local273 = -local1531.b() >> 1;
											}
										}
									} else if (local24.anInt6366 == 5) {
										local1192 = local24.anInt6353;
										if (local1192 >= 0 && local1192 < 2048) {
											@Pc(1748) Class26_Sub2_Sub2_Sub1 local1748 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local1192];
											@Pc(1761) Class191 local1761 = local24.anInt6417 == -1 ? null : Static191.aClass28_1.method567(local24.anInt6417);
											if (local1748 != null && (Static453.anInt7845 == local1192 || Static61.method1098(local1748.aString51) == local24.anInt6410)) {
												local1531 = local1748.aClass127_1.method2938(0, local24.anInt6425, local24.anInt6420, Static46.aClass233_1, Static14.aClass193_1, -1, 0, Static276.aClass109_10, local24.anInt6396, 2048, Static322.aClass187_2, Static196.aClass139_1, Static51.aClass79_1, null, local1761, Static191.aClass28_1, null);
											}
										}
									} else if (local24.anInt6366 == 8 || local24.anInt6366 == 9) {
										@Pc(1687) Class1_Sub45 local1687 = Static193.method906(false, local24.anInt6353);
										local1564 = local24.anInt6417 == -1 ? null : Static191.aClass28_1.method567(local24.anInt6417);
										if (local1687 != null) {
											local1572 = local24.aBoolean421 ? Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1 : null;
											local1531 = local1687.method6020(local24.anInt6425, local24.anInt6410, local1572, local24.anInt6420, local1564, local24.anInt6366 == 9, local24.anInt6396, Static276.aClass109_10);
										}
									} else if (local24.anInt6417 == -1) {
										local1531 = local24.method5124(Static276.aClass109_10, -1, 0, Static51.aClass79_1, 2048, Static14.aClass193_1, Static46.aClass233_1, null, -1, Static322.aClass187_2, Static196.aClass139_1, Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1, Static191.aClass28_1);
										if (local1531 == null && Static184.aBoolean198) {
											Static355.method4895(local24);
										}
									} else {
										@Pc(1652) Class191 local1652 = Static191.aClass28_1.method567(local24.anInt6417);
										local1531 = local24.method5124(Static276.aClass109_10, local24.anInt6425, local24.anInt6396, Static51.aClass79_1, 2048, Static14.aClass193_1, Static46.aClass233_1, local1652, local24.anInt6420, Static322.aClass187_2, Static196.aClass139_1, Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1, Static191.aClass28_1);
										if (local1531 == null && Static184.aBoolean198) {
											Static355.method4895(local24);
										}
									}
									if (local1531 != null) {
										if (local24.anInt6351 <= 0) {
											local1192 = 512;
										} else {
											local1192 = (local24.anInt6398 << 9) / local24.anInt6351;
										}
										if (local24.anInt6358 > 0) {
											local527 = (local24.anInt6363 << 9) / local24.anInt6358;
										} else {
											local527 = 512;
										}
										local529 = local94 + local24.anInt6398 / 2 + (local1192 * local24.anInt6390 >> 9);
										local577 = local24.anInt6363 / 2 + local100 + (local527 * local24.anInt6385 >> 9);
										Static126.aClass18_1.HA();
										Static276.aClass109_10.m(Static126.aClass18_1);
										Static276.aClass109_10.GA(local529, local577, local1192, local527);
										Static276.aClass109_10.o((float) (local24.anInt6388 << 0), local24.aBoolean422 ? (float) (local24.anInt6401 << 0) : (float) (local24.anInt6401 << 0) * 1.5F);
										if (arg2 == -1412584499 || Static203.aBoolean253) {
											Static276.aClass109_10.va();
											Static276.aClass109_10.method4696();
											Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
											Static203.aBoolean253 = false;
										}
										if (local24.aBoolean416) {
											Static276.aClass109_10.method4733(false);
										}
										local603 = (local24.anInt6391 << 0) * Class4.anIntArray7[local24.anInt6423 << 3] >> 15;
										local605 = Class4.anIntArray6[local24.anInt6423 << 3] * (local24.anInt6391 << 0) >> 15;
										Static172.aClass18_3.ma(-local24.anInt6416 << 3);
										Static172.aClass18_3.c(local24.anInt6395 << 3);
										Static172.aClass18_3.ZA(local24.anInt6346 << 0, local603 + (local24.anInt6352 << 0) + local273, (local24.anInt6352 << 0) + local605);
										Static172.aClass18_3.na(local24.anInt6423 << 3);
										if (Static205.aBoolean261) {
											Static276.aClass109_10.Z(local94, local100, local94 + local24.anInt6398, local100 - -local24.anInt6363);
										}
										if (local24.aBoolean422) {
											local1531.method4223(Static172.aClass18_3, null, local24.anInt6391 << 0);
										} else {
											local1531.method4230(Static172.aClass18_3, null, 1);
										}
										if (Static205.aBoolean261) {
											Static276.aClass109_10.pa(arg7, arg0, arg1, arg3);
										}
										if (local24.aBoolean416) {
											Static276.aClass109_10.method4733(true);
										}
										Static276.aClass109_10.o(0.0F, 0.0F);
									}
								} else if (local24.anInt6377 == 9) {
									if (local24.aBoolean420) {
										local1192 = local94 + local24.anInt6398;
										local273 = local24.anInt6363 + local100;
										local527 = local100;
									} else {
										local527 = local24.anInt6363 + local100;
										local273 = local100;
										local1192 = local24.anInt6398 + local94;
									}
									if (local24.anInt6350 == 1) {
										Static276.aClass109_10.method4705(local94, local273, local1192, local527, local24.anInt6339, 0);
									} else {
										Static276.aClass109_10.method4745(local94, local273, local1192, local527, local24.anInt6339, local24.anInt6350);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method3191(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public static void method3192(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static55.method989(Static89.aClass131_55);
			Static232.aClass1_Sub1_Sub1_2.method4115(Static43.method4229(arg0));
			Static232.aClass1_Sub1_Sub1_2.method4104(arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZFII[FIIIIFI)V")
	public static void method3193(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg5 - arg2;
		@Pc(9) int local9 = arg7 - arg9;
		@Pc(13) int local13 = arg1 - arg6;
		@Pc(38) float local38 = (float) local5 * arg3[2] + (float) local9 * arg3[1] + arg3[0] * (float) local13;
		@Pc(59) float local59 = arg3[3] * (float) local13 + (float) local9 * arg3[4] + (float) local5 * arg3[5];
		@Pc(84) float local84 = (float) local5 * arg3[8] + arg3[7] * (float) local9 + (float) local13 * arg3[6];
		@Pc(95) float local95 = (float) Math.atan2((double) local38, (double) local84) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local95 *= arg8;
		}
		@Pc(109) float local109 = arg0 + local59 + 0.5F;
		@Pc(132) float local132;
		if (arg4 == 1) {
			local132 = local95;
			local95 = -local109;
			local109 = local132;
		} else if (arg4 == 2) {
			local109 = -local109;
			local95 = -local95;
		} else if (arg4 == 3) {
			local132 = local95;
			local95 = local109;
			local109 = -local132;
		}
		Static147.aFloat37 = local109;
		Static203.aFloat66 = local95;
	}
}
