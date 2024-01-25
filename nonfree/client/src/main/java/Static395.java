import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!od", name = "K", descriptor = "Lclient!ni;")
	public static Class223 aClass223_85;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "I")
	public static int anInt7398;

	@OriginalMember(owner = "client!od", name = "G", descriptor = "[Lclient!gf;")
	public static final Class118[] aClass118Array1 = new Class118[6];

	@OriginalMember(owner = "client!od", name = "H", descriptor = "[S")
	private static final short[] aShortArray120 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!od", name = "R", descriptor = "[S")
	private static final short[] aShortArray122 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!od", name = "O", descriptor = "[S")
	private static final short[] aShortArray121 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!od", name = "S", descriptor = "[S")
	private static final short[] aShortArray123 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!od", name = "L", descriptor = "[[S")
	public static final short[][] aShortArrayArray23 = new short[][] { aShortArray120, aShortArray122, aShortArray121, aShortArray123 };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([BZ)[B")
	public static byte[] method6252(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static653.method6537(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Z")
	public static boolean method6253() {
		try {
			return Static44.method6921();
		} catch (@Pc(17) IOException local17) {
			Static49.method1563();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(80) String local80 = "T2 - " + (Static165.aClass73_55 == null ? -1 : Static165.aClass73_55.method2522()) + "," + (Static461.aClass73_148 == null ? -1 : Static461.aClass73_148.method2522()) + "," + (Static340.aClass73_118 == null ? -1 : Static340.aClass73_118.method2522()) + " - " + Static125.anInt3103 + "," + (Static477.anInt8412 + Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0]) + "," + (Static227.anInt5049 + Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0]) + " - ";
			for (@Pc(82) int local82 = 0; local82 < Static125.anInt3103 && local82 < 50; local82++) {
				local80 = local80 + Static84.aClass6_Sub8_Sub1_1.aByteArray102[local82] + ",";
			}
			Static358.method5809(local22, local80);
			Static5.method440(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZIIII[Lclient!sba;IIZI)V")
	public static void method6254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class302[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		Static467.aClass5_13.KA(arg2, arg3, arg6, arg7);
		for (@Pc(17) int local17 = 0; local17 < arg5.length; local17++) {
			@Pc(23) Class302 local23 = arg5[local17];
			if (local23 != null && (arg0 == local23.anInt8857 || arg0 == -1412584499 && Static448.aClass302_13 == local23)) {
				@Pc(42) int local42 = arg1 + local23.anInt8930;
				@Pc(47) int local47 = local23.anInt8897 + arg9;
				@Pc(54) int local54 = local23.anInt8909 + local42 + 1;
				@Pc(61) int local61 = local23.anInt8872 + local47 + 1;
				@Pc(87) int local87;
				if (arg4 == -1) {
					Class6_Sub38.aRectangleArray1[Static588.anInt9948].setBounds(arg1 + local23.anInt8930, local23.anInt8897 - -arg9, local23.anInt8909, local23.anInt8872);
					local87 = Static588.anInt9948++;
				} else {
					local87 = arg4;
				}
				local23.anInt8868 = Static384.anInt7234;
				local23.anInt8861 = local87;
				if (!Static75.method2146(local23)) {
					if (local23.anInt8904 != 0) {
						Static235.method1732(local23);
					}
					@Pc(115) int local115 = local23.anInt8930 + arg1;
					@Pc(120) int local120 = arg9 + local23.anInt8897;
					@Pc(122) int local122 = 0;
					@Pc(124) int local124 = 0;
					if (Static238.aBoolean425) {
						local122 = Static352.method5739();
						local124 = Static573.method7997();
					}
					@Pc(135) int local135 = local23.anInt8888;
					if (Static30.aBoolean78 && (Static75.method2151(local23).anInt10438 != 0 || local23.anInt8936 == 0) && local135 > 127) {
						local135 = 127;
					}
					@Pc(195) int local195;
					@Pc(201) int local201;
					if (Static448.aClass302_13 == local23) {
						if (arg0 != -1412584499 && (Static74.anInt2417 == local23.anInt8890 || Static628.anInt10537 == local23.anInt8890)) {
							Static125.aClass302Array1 = arg5;
							Static115.anInt2987 = arg1;
							Static92.anInt2698 = arg9;
							continue;
						}
						if (Static30.aBoolean79 && Static423.aBoolean623) {
							local195 = Static6.aClass96_1.method8026() + local122;
							local201 = Static6.aClass96_1.method8019() + local124;
							local201 -= Static131.anInt3186;
							local195 -= Static334.anInt6640;
							if (local195 < Static66.anInt2272) {
								local195 = Static66.anInt2272;
							}
							if (local195 + local23.anInt8909 > Static352.aClass302_9.anInt8909 + Static66.anInt2272) {
								local195 = Static352.aClass302_9.anInt8909 + Static66.anInt2272 - local23.anInt8909;
							}
							if (local201 < Static397.anInt7407) {
								local201 = Static397.anInt7407;
							}
							local115 = local195;
							if (local201 + local23.anInt8872 > Static397.anInt7407 + Static352.aClass302_9.anInt8872) {
								local201 = Static352.aClass302_9.anInt8872 + Static397.anInt7407 - local23.anInt8872;
							}
							local120 = local201;
						}
						if (local23.anInt8890 == Static628.anInt10537) {
							local135 = 128;
						}
					}
					@Pc(323) int local323;
					@Pc(330) int local330;
					@Pc(286) int local286;
					@Pc(292) int local292;
					if (local23.anInt8936 == 2) {
						local201 = arg3;
						local195 = arg2;
						local330 = arg7;
						local323 = arg6;
					} else {
						local286 = local23.anInt8909 + local115;
						local292 = local120 + local23.anInt8872;
						local201 = local120 <= arg3 ? arg3 : local120;
						local195 = arg2 >= local115 ? arg2 : local115;
						if (local23.anInt8936 == 9) {
							local286++;
							local292++;
						}
						local323 = arg6 > local286 ? local286 : arg6;
						local330 = arg7 <= local292 ? arg7 : local292;
					}
					if (local323 > local195 && local201 < local330) {
						@Pc(601) int local601;
						@Pc(645) int local645;
						@Pc(742) int local742;
						@Pc(744) int local744;
						@Pc(632) int local632;
						@Pc(634) int local634;
						if (local23.anInt8904 != 0) {
							if (Static47.anInt1660 == local23.anInt8904 || local23.anInt8904 == Static482.anInt8532) {
								Static13.method524(local115, local120, local23);
								if (!Static238.aBoolean425) {
									Static165.method3160(local115, local120, local23.anInt8872, local23.anInt8904 == Static482.anInt8532, local23.anInt8909);
									Static467.aClass5_13.KA(arg2, arg3, arg6, arg7);
								}
								Static366.aBooleanArray16[local87] = true;
								continue;
							}
							if (local23.anInt8904 == Static562.anInt9684) {
								if (local23.method7356(Static467.aClass5_13) != null) {
									Static245.method4396();
									Static369.method5891(local23, Static467.aClass5_13, local115, local120);
									Static337.aBooleanArray15[local87] = true;
									Static467.aClass5_13.KA(arg2, arg3, arg6, arg7);
									if (Static238.aBoolean425) {
										if (arg8) {
											Static215.method3836(local61, local47, local42, local54);
										} else {
											Static385.method6059(local61, local42, local54, local47);
										}
									}
								}
								continue;
							}
							if (Static171.anInt3815 == local23.anInt8904) {
								if (local23.method7356(Static467.aClass5_13) != null) {
									Static527.method7490(local115, local120, local23);
									Static337.aBooleanArray15[local87] = true;
									Static467.aClass5_13.KA(arg2, arg3, arg6, arg7);
									if (Static238.aBoolean425) {
										if (arg8) {
											Static215.method3836(local61, local47, local42, local54);
										} else {
											Static385.method6059(local61, local42, local54, local47);
										}
									}
								}
								continue;
							}
							if (local23.anInt8904 == Static160.anInt3659) {
								Static630.method8578(Static467.aClass5_13, Static295.anInterface7_9, local120, local115, local23.anInt8872, local23.anInt8909);
								Static366.aBooleanArray16[local87] = true;
								Static467.aClass5_13.KA(arg2, arg3, arg6, arg7);
								continue;
							}
							if (Static423.anInt7804 == local23.anInt8904) {
								Static370.method5896(local115, local23.anInt8909, Static467.aClass5_13, local120, local23.anInt8872);
								Static366.aBooleanArray16[local87] = true;
								Static467.aClass5_13.KA(arg2, arg3, arg6, arg7);
								continue;
							}
							if (local23.anInt8904 == Static514.anInt8951) {
								if (!Static164.aBoolean291 && !Static316.aBoolean491) {
									continue;
								}
								local286 = local23.anInt8909 + local115;
								local292 = local120 + 15;
								if (Static238.aBoolean425) {
									if (arg8) {
										Static215.method3836(local61, local47, local42, local54);
									} else {
										Static385.method6059(local61, local42, local54, local47);
									}
								}
								if (Static164.aBoolean291) {
									local601 = -256;
									if (Static576.anInt9821 < 20) {
										local601 = -65536;
									}
									Static359.aClass34_7.method8584(local601, local286, -1, "Fps:" + Static576.anInt9821, local292);
									local292 += 15;
									@Pc(623) Runtime local623 = Runtime.getRuntime();
									local632 = (int) ((local623.totalMemory() - local623.freeMemory()) / 1024L);
									local634 = -256;
									if (local632 > 98304) {
										if (Static48.aBoolean137) {
											Static57.method1713();
											for (local645 = 0; local645 < 10; local645++) {
												System.gc();
											}
											local632 = (int) ((local623.totalMemory() - local623.freeMemory()) / 1024L);
											if (local632 > 65536) {
												Static238.method4329("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local634 = -65536;
									}
									Static359.aClass34_7.method8584(local634, local286, -1, "Mem:" + local632 + "k", local292);
									local292 += 15;
									Static359.aClass34_7.method8584(-256, local286, -1, "In:" + Static218.anInt4655 + "B/s Out:" + Static139.anInt3322 + "B/s", local292);
									local292 += 15;
									local645 = Static467.aClass5_13.E() / 1024;
									Static359.aClass34_7.method8584(local645 <= 65536 ? -256 : -65536, local286, -1, "Offheap:" + local645 + "k", local292);
									local292 += 15;
									local742 = 0;
									local744 = 0;
									@Pc(746) int local746 = 0;
									for (@Pc(748) int local748 = 0; local748 < 37; local748++) {
										if (Static180.aClass193_Sub1Array1[local748] != null) {
											local742 += Static180.aClass193_Sub1Array1[local748].method5584();
											local744 += Static180.aClass193_Sub1Array1[local748].method5582();
											local746 += Static180.aClass193_Sub1Array1[local748].method5575();
										}
									}
									@Pc(790) int local790 = local746 * 100 / local742;
									@Pc(796) int local796 = local744 * 10000 / local742;
									@Pc(816) String local816 = "Cache:" + Static77.method5027(0, 2, (long) local796, true) + "% (" + local790 + "%)";
									Static588.aClass34_14.method8584(-256, local286, -1, local816, local292);
									local292 += 12;
								}
								if (Static208.anInt4504 > 0) {
									Static588.aClass34_14.method8584(-256, local286, -1, "Particles: " + Static512.anInt8840 + " / " + Static208.anInt4504, local292);
								}
								local292 += 12;
								if (Static316.aBoolean491) {
									Static588.aClass34_14.method8584(-256, local286, -1, "Polys: " + Static467.aClass5_13.I() + " Models: " + Static467.aClass5_13.M(), local292);
									local292 += 12;
									Static588.aClass34_14.method8584(-256, local286, -1, "Ls: " + Static354.anInt6879 + " La: " + Static267.anInt5761 + " NPC: " + Static341.anInt6795 + " Pl: " + Static203.anInt4459, local292);
									Static405.method6337();
									local292 += 12;
								}
								Static366.aBooleanArray16[local87] = true;
								continue;
							}
						}
						@Pc(974) Class6_Sub25 local974;
						if (local23.anInt8936 == 0) {
							if (local23.anInt8904 == Static494.anInt8618 && Static467.aClass5_13.method6131()) {
								Static467.aClass5_13.method6109(local115, local120, local23.anInt8909, local23.anInt8872);
							}
							method6254(local23.anInt8867, local115 - local23.anInt8865, local195, local201, local87, arg5, local323, local330, arg8, local120 - local23.anInt8847);
							if (local23.aClass302Array2 != null) {
								method6254(local23.anInt8867, local115 - local23.anInt8865, local195, local201, local87, local23.aClass302Array2, local323, local330, arg8, local120 - local23.anInt8847);
							}
							local974 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local23.anInt8867);
							if (local974 != null) {
								Static560.method7881(local330, local87, local201, local974.anInt5034, local120, local115, local323, local195);
							}
							if (Static494.anInt8618 == local23.anInt8904 && Static467.aClass5_13.method6131()) {
								Static467.aClass5_13.method6177();
							}
							Static467.aClass5_13.KA(arg2, arg3, arg6, arg7);
						}
						if (Static412.aBooleanArray20[local87] || Static313.anInt6259 > 1) {
							if (local23.anInt8936 == 3) {
								if (local135 == 0) {
									if (local23.aBoolean714) {
										Static467.aClass5_13.aa(local115, local120, local23.anInt8909, local23.anInt8872, local23.anInt8859, 0);
									} else {
										Static467.aClass5_13.method6142(local115, local120, local23.anInt8909, local23.anInt8872, local23.anInt8859, 0);
									}
								} else if (local23.aBoolean714) {
									Static467.aClass5_13.aa(local115, local120, local23.anInt8909, local23.anInt8872, 255 - (local135 & 0xFF) << 24 | local23.anInt8859 & 0xFFFFFF, 1);
								} else {
									Static467.aClass5_13.method6142(local115, local120, local23.anInt8909, local23.anInt8872, 255 - (local135 & 0xFF) << 24 | local23.anInt8859 & 0xFFFFFF, 1);
								}
								if (Static238.aBoolean425) {
									if (arg8) {
										Static215.method3836(local61, local47, local42, local54);
									} else {
										Static385.method6059(local61, local42, local54, local47);
									}
								}
							} else {
								@Pc(1153) Class306 local1153;
								if (local23.anInt8936 == 4) {
									@Pc(1128) Class34 local1128 = local23.method7347(Static467.aClass5_13);
									if (local1128 != null) {
										local292 = local23.anInt8859;
										@Pc(1143) String local1143 = local23.aString90;
										if (local23.anInt8899 != -1) {
											local1153 = Static356.aClass221_1.method5923(local23.anInt8899);
											local1143 = local1153.aString93;
											if (local1143 == null) {
												local1143 = "null";
											}
											if ((local1153.anInt9086 == 1 || local23.anInt8931 != 1) && local23.anInt8931 != -1) {
												local1143 = "<col=ff9040>" + local1143 + "</col> x" + Static630.method8580(local23.anInt8931);
											}
										}
										if (local23.anInt8846 != -1) {
											local1143 = Static101.method2623(local23.anInt8846);
											if (local1143 == null) {
												local1143 = "";
											}
										}
										if (Static97.aClass302_2 == local23) {
											local1143 = Static536.aClass316_33.method7577(Static638.anInt10709);
											local292 = local23.anInt8859;
										}
										if (Static292.aBoolean472) {
											Static467.aClass5_13.T(local115, local120, local115 + local23.anInt8909, local120 + local23.anInt8872);
										}
										local1128.method8592(local115, local23.anInt8932, local23.anInt8872, (Class1) null, 0, local23.anInt8909, local23.aBoolean722 ? 255 - (local135 & 0xFF) << 24 : -1, local23.anInt8864, local23.anInt8894, local120, Static393.aClass4Array11, 255 - (local135 & 0xFF) << 24 | local292, 0, local1143, local23.anInt8926, (int[]) null);
										if (Static292.aBoolean472) {
											Static467.aClass5_13.KA(arg2, arg3, arg6, arg7);
										}
										if (local1143.trim().length() > 0) {
											if (!Static292.aBoolean472) {
												@Pc(1318) Class213 local1318 = Static99.method2384(local23.anInt8877, Static467.aClass5_13);
												local632 = local1318.method5827(local23.anInt8909, local1143, Static393.aClass4Array11);
												local634 = local1318.method5829(Static393.aClass4Array11, local23.anInt8909, local23.anInt8864, local1143);
												if (Static238.aBoolean425) {
													if (arg8) {
														Static215.method3836(local120 + local634, local120, local115, local632 + local115);
													} else {
														Static385.method6059(local634 + local120, local115, local632 + local115, local120);
													}
												}
											} else if (Static238.aBoolean425) {
												if (arg8) {
													Static215.method3836(local61, local47, local42, local54);
												} else {
													Static385.method6059(local61, local42, local54, local47);
												}
											}
										}
									} else if (Static166.aBoolean782) {
										Static580.method8049(local23);
									}
								} else {
									@Pc(1479) int local1479;
									if (local23.anInt8936 == 5) {
										if (local23.lb >= 0) {
											local23.method7354(Static181.aClass132_1, Static82.aClass74_1).method8120(0, local23.anInt8848 << 3, local23.anInt8876 << 3, local120, local115, Static467.aClass5_13, local23.anInt8872, local23.anInt8909, 0);
										} else {
											@Pc(1430) Class4 local1430;
											if (local23.anInt8899 != -1) {
												@Pc(1412) Class320 local1412 = local23.aBoolean713 ? Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 : null;
												local1430 = Static356.aClass221_1.method5919(local23.anInt8901, local23.anInt8899, Static467.aClass5_13, local1412, local23.anInt8931, local23.anInt8902, local23.anInt8937 | 0xFF000000);
											} else if (local23.anInt8846 == -1) {
												local1430 = local23.method7343(Static467.aClass5_13);
											} else {
												local1430 = Static368.method5888(local23.anInt8846, Static467.aClass5_13);
											}
											if (local1430 != null) {
												local292 = local1430.method7700();
												local601 = local1430.method7712();
												local1479 = (local23.anInt8859 == 0 ? 16777215 : local23.anInt8859 & 0xFFFFFF) | 255 - (local135 & 0xFF) << 24;
												if (local23.aBoolean720) {
													Static467.aClass5_13.T(local115, local120, local23.anInt8909 + local115, local120 + local23.anInt8872);
													if (local23.anInt8871 != 0) {
														local632 = (local292 + local23.anInt8909 - 1) / local292;
														local634 = (local601 + local23.anInt8872 - 1) / local601;
														for (local645 = 0; local645 < local632; local645++) {
															for (local742 = 0; local742 < local634; local742++) {
																if (local23.anInt8859 == 0) {
																	local1430.method7693((float) (local645 * local292 + local115) + (float) local292 / 2.0F, (float) (local601 * local742 + local120) + (float) local601 / 2.0F, 4096, local23.anInt8871);
																} else {
																	local1430.method7706((float) (local115 + local645 * local292) + (float) local292 / 2.0F, (float) (local120 + local742 * local601) + (float) local601 / 2.0F, 4096, local23.anInt8871, local1479);
																}
															}
														}
													} else if (local23.anInt8859 == 0 && local135 == 0) {
														local1430.method7701(local115, local120, local23.anInt8909, local23.anInt8872);
													} else {
														local1430.method7691(local115, local120, local23.anInt8909, local23.anInt8872, 0, local1479, 1);
													}
													Static467.aClass5_13.KA(arg2, arg3, arg6, arg7);
												} else if (local23.anInt8859 == 0 && local135 == 0) {
													if (local23.anInt8871 != 0) {
														local1430.method7693((float) local115 + (float) local23.anInt8909 / 2.0F, (float) local120 + (float) local23.anInt8872 / 2.0F, local23.anInt8909 * 4096 / local292, local23.anInt8871);
													} else if (local292 == local23.anInt8909 && local23.anInt8872 == local601) {
														local1430.method7698(local115, local120);
													} else {
														local1430.method7689(local115, local120, local23.anInt8909, local23.anInt8872);
													}
												} else if (local23.anInt8871 != 0) {
													local1430.method7706((float) local23.anInt8909 / 2.0F + (float) local115, (float) local120 + (float) local23.anInt8872 / 2.0F, local23.anInt8909 * 4096 / local292, local23.anInt8871, local1479);
												} else if (local23.anInt8909 == local292 && local23.anInt8872 == local601) {
													local1430.method7711(local115, local120, 0, local1479, 1);
												} else {
													local1430.method7690(local115, local120, local23.anInt8909, local23.anInt8872, 0, local1479, 1);
												}
											} else if (Static166.aBoolean782) {
												Static580.method8049(local23);
											}
										}
										if (Static238.aBoolean425) {
											if (arg8) {
												Static215.method3836(local61, local47, local42, local54);
											} else {
												Static385.method6059(local61, local42, local54, local47);
											}
										}
									} else if (local23.anInt8936 == 6) {
										Static431.method6653();
										local974 = null;
										@Pc(1812) Class92 local1812 = null;
										local601 = 0;
										@Pc(1845) Class113 local1845;
										@Pc(1853) Class320 local1853;
										if (local23.anInt8899 != -1) {
											local1153 = Static356.aClass221_1.method5923(local23.anInt8899);
											if (local1153 != null) {
												local1153 = local1153.method7407(local23.anInt8931);
												local1845 = local23.anInt8844 == -1 ? null : Static528.aClass198_2.method5706(local23.anInt8844);
												local1853 = local23.aBoolean713 ? Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 : null;
												local1812 = local1153.method7415(local23.anInt8910, 2048, local23.anInt8900, local1845, local23.anInt8889, Static467.aClass5_13, 1, local1853);
												if (local1812 == null) {
													Static580.method8049(local23);
												} else {
													local601 = -local1812.fa() >> 1;
												}
											}
										} else if (local23.anInt8856 == 5) {
											local1479 = local23.anInt8927;
											if (local1479 >= 0 && local1479 < 2048) {
												@Pc(2034) Class9_Sub4_Sub2_Sub1_Sub2 local2034 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local1479];
												@Pc(2046) Class113 local2046 = local23.anInt8844 == -1 ? null : Static528.aClass198_2.method5706(local23.anInt8844);
												if (local2034 != null && (Static238.anInt5268 == local1479 || Static367.method7656(local2034.aString46) == local23.anInt8845)) {
													local1812 = local2034.aClass320_1.method7664(Static629.aClass271_1, local2046, (Class113) null, Static528.aClass198_2, local23.anInt8900, Static287.aClass99_1, (int[]) null, Static356.aClass221_1, 0, (Class241[]) null, Static8.aClass309_1, Static140.aClass157_1, 2048, -1, local23.anInt8910, local23.anInt8889, 0, 0, Static467.aClass5_13);
												}
											}
										} else if (local23.anInt8856 == 8 || local23.anInt8856 == 9) {
											@Pc(1902) Class6_Sub6 local1902 = Static612.method8391(local23.anInt8927, false);
											local1845 = local23.anInt8844 == -1 ? null : Static528.aClass198_2.method5706(local23.anInt8844);
											if (local1902 != null) {
												local1853 = local23.aBoolean713 ? Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 : null;
												local1812 = local1902.method784(local1845, local23.anInt8910, local23.anInt8900, local23.anInt8856 == 9, local1853, local23.anInt8845, local23.anInt8889, Static467.aClass5_13);
											}
										} else if (local23.anInt8844 == -1) {
											local1812 = local23.method7348(Static140.aClass157_1, Static528.aClass198_2, Static8.aClass309_1, Static287.aClass99_1, Static467.aClass5_13, Static629.aClass271_1, local974, -1, 2048, -1, 0, (Class113) null, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1, Static356.aClass221_1);
											if (local1812 == null && Static166.aBoolean782) {
												Static580.method8049(local23);
											}
										} else {
											@Pc(1987) Class113 local1987 = Static528.aClass198_2.method5706(local23.anInt8844);
											local1812 = local23.method7348(Static140.aClass157_1, Static528.aClass198_2, Static8.aClass309_1, Static287.aClass99_1, Static467.aClass5_13, Static629.aClass271_1, local974, local23.anInt8889, 2048, local23.anInt8900, local23.anInt8910, local1987, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1, Static356.aClass221_1);
											if (local1812 == null && Static166.aBoolean782) {
												Static580.method8049(local23);
											}
										}
										if (local1812 != null) {
											if (local23.anInt8855 > 0) {
												local1479 = (local23.anInt8909 << 9) / local23.anInt8855;
											} else {
												local1479 = 512;
											}
											if (local23.anInt8852 > 0) {
												local632 = (local23.anInt8872 << 9) / local23.anInt8852;
											} else {
												local632 = 512;
											}
											local634 = local23.anInt8909 / 2 + local115;
											local645 = local120 + local23.anInt8872 / 2;
											if (!local23.aBoolean717) {
												local634 += local23.anInt8924 * local1479 >> 9;
												local645 += local632 * local23.anInt8928 >> 9;
											}
											Static469.aClass115_8.method6281();
											Static467.aClass5_13.method6122(Static469.aClass115_8);
											Static467.aClass5_13.DA(local634, local645, local1479, local632);
											Static467.aClass5_13.ya();
											if (local23.aBoolean724) {
												Static467.aClass5_13.C(false);
											}
											if (local23.aBoolean717) {
												Static267.aClass115_2.method6297(local23.anInt8907);
												Static267.aClass115_2.method6287(local23.anInt8849);
												Static267.aClass115_2.method6280(local23.anInt8929);
												Static267.aClass115_2.method6296(local23.anInt8924, local23.anInt8928, local23.anInt8933);
											} else {
												local742 = (local23.anInt8869 << 2) * Class78_Sub2_Sub2.anIntArray270[local23.anInt8907 << 3] >> 14;
												local744 = Class78_Sub2_Sub2.anIntArray271[local23.anInt8907 << 3] * (local23.anInt8869 << 2) >> 14;
												Static267.aClass115_2.method6294(-local23.anInt8929 << 3);
												Static267.aClass115_2.method6287(local23.anInt8849 << 3);
												Static267.aClass115_2.method6296(local23.anInt8878 << 2, local601 + local742 + (local23.anInt8880 << 2), (local23.anInt8880 << 2) + local744);
												Static267.aClass115_2.method6295(local23.anInt8907 << 3);
											}
											local23.method7351(Static467.aClass5_13, Static384.anInt7234, local1812, Static267.aClass115_2);
											if (Static292.aBoolean472) {
												Static467.aClass5_13.T(local115, local120, local115 + local23.anInt8909, local23.anInt8872 + local120);
											}
											if (local23.aBoolean717) {
												if (local23.aBoolean715) {
													local1812.method7057(Static267.aClass115_2, (Class9_Sub6) null, local23.anInt8869, 1);
												} else {
													local1812.method7053(Static267.aClass115_2, (Class9_Sub6) null, 1);
													if (local23.aClass9_Sub5_7 != null) {
														Static467.aClass5_13.method6183(local23.aClass9_Sub5_7.method5221());
													}
												}
											} else if (local23.aBoolean715) {
												local1812.method7057(Static267.aClass115_2, (Class9_Sub6) null, local23.anInt8869 << 2, 1);
											} else {
												local1812.method7053(Static267.aClass115_2, (Class9_Sub6) null, 1);
												if (local23.aClass9_Sub5_7 != null) {
													Static467.aClass5_13.method6183(local23.aClass9_Sub5_7.method5221());
												}
											}
											if (Static292.aBoolean472) {
												Static467.aClass5_13.KA(arg2, arg3, arg6, arg7);
											}
											if (local23.aBoolean724) {
												Static467.aClass5_13.C(true);
											}
										}
										if (Static238.aBoolean425) {
											if (arg8) {
												Static215.method3836(local61, local47, local42, local54);
											} else {
												Static385.method6059(local61, local42, local54, local47);
											}
										}
									} else if (local23.anInt8936 == 9) {
										if (local23.aBoolean712) {
											local1479 = local120;
											local601 = local115 + local23.anInt8909;
											local292 = local120 + local23.anInt8872;
										} else {
											local292 = local120;
											local601 = local23.anInt8909 + local115;
											local1479 = local23.anInt8872 + local120;
										}
										if (local23.anInt8893 == 1) {
											Static467.aClass5_13.method6158(local115, local292, local601, local1479, local23.anInt8859, 0);
										} else {
											Static467.aClass5_13.method6179(local115, local292, local601, local1479, local23.anInt8859, local23.anInt8893);
										}
										if (Static238.aBoolean425) {
											if (arg8) {
												Static215.method3836(local61, local47, local42, local54);
											} else {
												Static385.method6059(local61, local42, local54, local47);
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
}
