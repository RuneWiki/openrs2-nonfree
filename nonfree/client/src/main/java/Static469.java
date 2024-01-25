import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
	public static int anInt7626;

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_146 = new Class156(8, -1);

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
	public static int anInt7627 = -1;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	public static void method6629() {
		for (@Pc(10) Class5_Sub1_Sub3 local10 = (Class5_Sub1_Sub3) Static419.aClass20_35.method378(); local10 != null; local10 = (Class5_Sub1_Sub3) Static419.aClass20_35.method366()) {
			@Pc(15) Class4_Sub1_Sub1_Sub4 local15 = local10.aClass4_Sub1_Sub1_Sub4_1;
			if (local15.anInt7944 < Static565.anInt8921) {
				local10.method9222();
				local15.method6892();
			} else if (local15.anInt7958 <= Static565.anInt8921) {
				local15.method6889();
				if (local15.anInt7947 > 0) {
					@Pc(47) Class5_Sub9 local47 = (Class5_Sub9) Static677.aClass306_37.method6943((long) (local15.anInt7947 - 1));
					if (local47 != null) {
						@Pc(52) Class4_Sub1_Sub1_Sub2_Sub2 local52 = local47.aClass4_Sub1_Sub1_Sub2_Sub2_1;
						if (local52.anInt9805 >= 0 && local52.anInt9805 < Static271.anInt4910 * 512 && local52.anInt9803 >= 0 && Static613.anInt9909 * 512 > local52.anInt9803) {
							local15.method6890(local52.anInt9803, local52.anInt9805, Static461.method6500(local52.anInt9805, local15.aByte139, local52.anInt9803) - local15.anInt7942, Static565.anInt8921);
						}
					}
				}
				if (local15.anInt7947 < 0) {
					@Pc(111) int local111 = -local15.anInt7947 - 1;
					@Pc(118) Class4_Sub1_Sub1_Sub2_Sub1 local118;
					if (Static649.anInt10621 == local111) {
						local118 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4;
					} else {
						local118 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local111];
					}
					if (local118 != null && local118.anInt9805 >= 0 && local118.anInt9805 < Static271.anInt4910 * 512 && local118.anInt9803 >= 0 && local118.anInt9803 < Static613.anInt9909 * 512) {
						local15.method6890(local118.anInt9803, local118.anInt9805, Static461.method6500(local118.anInt9805, local15.aByte139, local118.anInt9803) - local15.anInt7942, Static565.anInt8921);
					}
				}
				local15.method6885(Static675.anInt10854);
				Static686.method2955(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z")
	public static boolean method6633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIII[Lclient!mj;ZIIIII)V")
	public static void method6636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class238[] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static273.aClass100_6.KA(arg1, arg6, arg9, arg0);
		for (@Pc(17) int local17 = 0; local17 < arg3.length; local17++) {
			@Pc(23) Class238 local23 = arg3[local17];
			if (local23 != null && (local23.anInt5963 == arg2 || arg2 == -1412584499 && local23 == Static388.aClass238_11)) {
				@Pc(54) int local54 = arg7 + local23.anInt6028;
				@Pc(59) int local59 = arg5 + local23.anInt5989;
				@Pc(66) int local66 = local23.anInt5985 + local54 + 1;
				@Pc(73) int local73 = local59 + local23.anInt5973 + 1;
				@Pc(99) int local99;
				if (arg8 == -1) {
					Class147.aRectangleArray1[Static171.anInt5360].setBounds(arg7 + local23.anInt6028, arg5 + local23.anInt5989, local23.anInt5985, local23.anInt5973);
					local99 = Static171.anInt5360++;
				} else {
					local99 = arg8;
				}
				local23.anInt5957 = local99;
				local23.anInt6018 = Static565.anInt8921;
				if (!Static73.method1224(local23)) {
					if (local23.anInt5962 != 0) {
						Static462.method6509(local23);
					}
					@Pc(127) int local127 = arg7 + local23.anInt6028;
					@Pc(132) int local132 = arg5 + local23.anInt5989;
					@Pc(134) int local134 = 0;
					@Pc(136) int local136 = 0;
					if (Static377.aBoolean419) {
						local134 = Static194.method8971();
						local136 = Static5.method9220();
					}
					@Pc(147) int local147 = local23.anInt5998;
					if (Static628.aBoolean710 && (Static73.method1209(local23).anInt2210 != 0 || local23.anInt5976 == 0) && local147 > 127) {
						local147 = 127;
					}
					@Pc(217) int local217;
					@Pc(224) int local224;
					if (Static388.aClass238_11 == local23) {
						if (arg2 != -1412584499 && (Static254.anInt4626 == local23.anInt5965 || local23.anInt5965 == Static595.anInt9608)) {
							Static74.anInt1311 = arg7;
							Static399.aClass238Array3 = arg3;
							Static535.anInt8531 = arg5;
							continue;
						}
						if (Static595.aBoolean673 && Static129.aBoolean146) {
							local217 = Static300.aClass164_1.method4999() + local134;
							local224 = Static300.aClass164_1.method5000() + local136;
							local217 -= Static412.anInt6980;
							local224 -= Static501.anInt8061;
							if (local217 < Static583.anInt9374) {
								local217 = Static583.anInt9374;
							}
							if (Static230.aClass238_4.anInt5985 + Static583.anInt9374 < local217 + local23.anInt5985) {
								local217 = Static230.aClass238_4.anInt5985 + Static583.anInt9374 - local23.anInt5985;
							}
							if (Static269.anInt4798 > local224) {
								local224 = Static269.anInt4798;
							}
							if (Static269.anInt4798 + Static230.aClass238_4.anInt5973 < local23.anInt5973 + local224) {
								local224 = Static230.aClass238_4.anInt5973 + Static269.anInt4798 - local23.anInt5973;
							}
							local127 = local217;
							local132 = local224;
						}
						if (local23.anInt5965 == Static595.anInt9608) {
							local147 = 128;
						}
					}
					@Pc(314) int local314;
					@Pc(308) int local308;
					@Pc(321) int local321;
					@Pc(326) int local326;
					if (local23.anInt5976 == 2) {
						local308 = arg0;
						local217 = arg1;
						local224 = arg6;
						local314 = arg9;
					} else {
						local321 = local23.anInt5985 + local127;
						local326 = local132 + local23.anInt5973;
						local217 = local127 <= arg1 ? arg1 : local127;
						if (local23.anInt5976 == 9) {
							local321++;
							local326++;
						}
						local224 = arg6 >= local132 ? arg6 : local132;
						local308 = arg0 <= local326 ? arg0 : local326;
						local314 = local321 < arg9 ? local321 : arg9;
					}
					if (local314 > local217 && local224 < local308) {
						@Pc(724) int local724;
						@Pc(774) int local774;
						@Pc(919) int local919;
						@Pc(921) int local921;
						@Pc(759) int local759;
						@Pc(761) int local761;
						if (local23.anInt5962 != 0) {
							if (Static138.anInt2744 == local23.anInt5962 || Static573.anInt8990 == local23.anInt5962) {
								Static472.method6676(local23, local127, local132);
								if (!Static377.aBoolean419) {
									Static45.method786(local132, local127, local23.anInt5985, local23.anInt5973, local23.anInt5962 == Static573.anInt8990);
									Static273.aClass100_6.KA(arg1, arg6, arg9, arg0);
								}
								Static325.aBooleanArray15[local99] = true;
								continue;
							}
							if (local23.anInt5962 == Static236.anInt4067) {
								if (local23.method5323(Static273.aClass100_6) != null) {
									Static455.method6423();
									Static211.method3411(local23, local127, local132, Static273.aClass100_6);
									Static528.aBooleanArray23[local99] = true;
									Static273.aClass100_6.KA(arg1, arg6, arg9, arg0);
									if (Static377.aBoolean419) {
										if (arg4) {
											Static395.method5811(local59, local66, local73, local54);
										} else {
											Static609.method6158(local59, local54, local66, local73);
										}
									}
								}
								continue;
							}
							if (Static266.anInt4745 == local23.anInt5962) {
								Static224.method3549(local23, local132, local127, Static273.aClass100_6);
								continue;
							}
							if (local23.anInt5962 == Static80.anInt1428) {
								Static610.method8371(local127, local23.anInt5981 % 64, local132, local23, Static273.aClass100_6);
								continue;
							}
							if (local23.anInt5962 == Static537.anInt8569) {
								if (local23.method5323(Static273.aClass100_6) != null) {
									Static224.method3552(local127, local132, local23);
									Static528.aBooleanArray23[local99] = true;
									Static273.aClass100_6.KA(arg1, arg6, arg9, arg0);
									if (Static377.aBoolean419) {
										if (arg4) {
											Static395.method5811(local59, local66, local73, local54);
										} else {
											Static609.method6158(local59, local54, local66, local73);
										}
									}
								}
								continue;
							}
							if (Static301.anInt5209 == local23.anInt5962) {
								Static26.method396(local23.anInt5973, Static472.anInterface7_10, local23.anInt5985, local127, Static273.aClass100_6, local132);
								Static325.aBooleanArray15[local99] = true;
								Static273.aClass100_6.KA(arg1, arg6, arg9, arg0);
								continue;
							}
							if (Static283.anInt5030 == local23.anInt5962) {
								Static307.method4793(Static273.aClass100_6, local23.anInt5973, local23.anInt5985, local127, local132);
								Static325.aBooleanArray15[local99] = true;
								Static273.aClass100_6.KA(arg1, arg6, arg9, arg0);
								continue;
							}
							if (Static525.anInt8347 == local23.anInt5962) {
								if (!Static480.aBoolean521 && !Static428.aBoolean477) {
									continue;
								}
								local321 = local127 + local23.anInt5985;
								local326 = local132 + 15;
								if (Static377.aBoolean419) {
									if (arg4) {
										Static395.method5811(local59, local66, local73, local54);
									} else {
										Static609.method6158(local59, local54, local66, local73);
									}
								}
								if (Static480.aBoolean521) {
									local724 = -256;
									if (Static69.anInt1172 < 20) {
										local724 = -65536;
									}
									Static414.aClass70_6.method8428("Fps:" + Static69.anInt1172, local724, local326, -1, local321);
									local326 += 15;
									@Pc(750) Runtime local750 = Runtime.getRuntime();
									local759 = (int) ((local750.totalMemory() - local750.freeMemory()) / 1024L);
									local761 = -256;
									if (local759 > 98304) {
										local761 = -65536;
										if (Static61.aBoolean83) {
											Static270.method4447();
											for (local774 = 0; local774 < 10; local774++) {
												System.gc();
											}
											local759 = (int) ((local750.totalMemory() - local750.freeMemory()) / 1024L);
											if (local759 > 65536) {
												Static218.method3476("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static414.aClass70_6.method8428("Mem:" + local759 + "k", local761, local326, -1, local321);
									local326 += 15;
									Static414.aClass70_6.method8428("Game: In:" + Static4.aClass389_17.anInt10761 + "B/s Out:" + Static4.aClass389_17.anInt10755 + "B/s", -256, local326, -1, local321);
									local326 += 15;
									Static414.aClass70_6.method8428("Lobby: In:" + Static4.aClass389_16.anInt10761 + "B/s Out:" + Static4.aClass389_16.anInt10755 + "B/s", -256, local326, -1, local321);
									local326 += 15;
									local774 = Static273.aClass100_6.E() / 1024;
									Static414.aClass70_6.method8428("Offheap:" + local774 + "k", local774 > 65536 ? -65536 : -256, local326, -1, local321);
									local326 += 15;
									local919 = 0;
									local921 = 0;
									@Pc(923) int local923 = 0;
									for (@Pc(925) int local925 = 0; local925 < 37; local925++) {
										if (Static35.aClass222_Sub1Array1[local925] != null) {
											local919 += Static35.aClass222_Sub1Array1[local925].method7719();
											local921 += Static35.aClass222_Sub1Array1[local925].method7709();
											local923 += Static35.aClass222_Sub1Array1[local925].method7714();
										}
									}
									@Pc(967) int local967 = local923 * 100 / local919;
									@Pc(973) int local973 = local921 * 10000 / local919;
									@Pc(999) String local999 = "Cache:" + Static204.method3367((long) local973, 2, true, 0) + "% (" + local967 + "%)";
									Static510.aClass70_11.method8428(local999, -256, local326, -1, local321);
									local326 += 12;
								}
								if (Static213.anInt3732 > 0) {
									Static510.aClass70_11.method8428("Particles: " + Static161.anInt3205 + " / " + Static213.anInt3732, -256, local326, -1, local321);
								}
								local326 += 12;
								if (Static428.aBoolean477) {
									Static510.aClass70_11.method8428("Polys: " + Static273.aClass100_6.I() + " Models: " + Static273.aClass100_6.M(), -256, local326, -1, local321);
									local326 += 12;
									Static510.aClass70_11.method8428("Ls: " + Static360.anInt5878 + " La: " + Static236.anInt4084 + " NPC: " + Static654.anInt10671 + " Pl: " + Static494.anInt7989, -256, local326, -1, local321);
									Static651.method8994();
									local326 += 12;
								}
								Static325.aBooleanArray15[local99] = true;
								continue;
							}
						}
						@Pc(1195) Class5_Sub38 local1195;
						if (local23.anInt5976 == 0) {
							if (local23.anInt5962 == Static226.anInt3905 && Static273.aClass100_6.method8656()) {
								Static273.aClass100_6.method8603(local127, local132, local23.anInt5985, local23.anInt5973);
							}
							method6636(local308, local217, local23.anInt5971, arg3, arg4, local132 - local23.anInt5953, local224, local127 - local23.anInt5951, local99, local314);
							if (local23.aClass238Array2 != null) {
								method6636(local308, local217, local23.anInt5971, local23.aClass238Array2, arg4, local132 - local23.anInt5953, local224, local127 - local23.anInt5951, local99, local314);
							}
							local1195 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local23.anInt5971);
							if (local1195 != null) {
								Static520.method7109(local224, local99, local308, local314, local132, local1195.anInt6418, local217, local127);
							}
							if (Static226.anInt3905 == local23.anInt5962 && Static273.aClass100_6.method8656()) {
								Static273.aClass100_6.method8654();
							}
							Static273.aClass100_6.KA(arg1, arg6, arg9, arg0);
						}
						if (Static38.aBooleanArray1[local99] || Static151.anInt2970 > 1) {
							if (local23.anInt5976 == 3) {
								if (local147 == 0) {
									if (local23.aBoolean401) {
										Static273.aClass100_6.aa(local127, local132, local23.anInt5985, local23.anInt5973, local23.anInt5981, 0);
									} else {
										Static273.aClass100_6.method8607(local127, local132, local23.anInt5985, local23.anInt5973, local23.anInt5981, 0);
									}
								} else if (local23.aBoolean401) {
									Static273.aClass100_6.aa(local127, local132, local23.anInt5985, local23.anInt5973, 255 - (local147 & 0xFF) << 24 | local23.anInt5981 & 0xFFFFFF, 1);
								} else {
									Static273.aClass100_6.method8607(local127, local132, local23.anInt5985, local23.anInt5973, local23.anInt5981 & 0xFFFFFF | 255 - (local147 & 0xFF) << 24, 1);
								}
								if (Static377.aBoolean419) {
									if (arg4) {
										Static395.method5811(local59, local66, local73, local54);
									} else {
										Static609.method6158(local59, local54, local66, local73);
									}
								}
							} else {
								@Pc(1412) Class246 local1412;
								if (local23.anInt5976 == 4) {
									@Pc(1383) Class70 local1383 = local23.method5314(Static273.aClass100_6);
									if (local1383 != null) {
										local326 = local23.anInt5981;
										@Pc(1402) String local1402 = local23.aString71;
										if (local23.anInt5990 != -1) {
											local1412 = Static82.aClass134_1.method3191(local23.anInt5990);
											local1402 = local1412.aString77;
											if (local1402 == null) {
												local1402 = "null";
											}
											if ((local1412.anInt6474 == 1 || local23.anInt6017 != 1) && local23.anInt6017 != -1) {
												local1402 = "<col=ff9040>" + local1402 + "</col> x" + Static395.method5812(local23.anInt6017);
											}
										}
										if (local23.anInt5974 != -1) {
											local1402 = Static196.method3289(local23.anInt5974);
											if (local1402 == null) {
												local1402 = "";
											}
										}
										if (Static64.aClass238_1 == local23) {
											local1402 = Static184.aClass131_32.method3168(Static375.anInt7800);
											local326 = local23.anInt5981;
										}
										if (Static606.aBoolean685) {
											Static273.aClass100_6.T(local127, local132, local127 + local23.anInt5985, local132 - -local23.anInt5973);
										}
										local1383.method8432(local127, local23.aBoolean400 ? 255 - (local147 & 0xFF) << 24 : -1, local23.anInt5973, 0, (int[]) null, (Class1) null, Static326.aClass155Array13, local23.anInt5945, 255 - (local147 & 0xFF) << 24 | local326, local132, local23.anInt5975, local23.anInt6007, local1402, local23.anInt5985, 0, local23.anInt6009);
										if (Static606.aBoolean685) {
											Static273.aClass100_6.KA(arg1, arg6, arg9, arg0);
										}
										if (local1402.trim().length() > 0) {
											if (!Static606.aBoolean685) {
												@Pc(1602) Class196 local1602 = Static600.method8236(local23.anInt5942, Static273.aClass100_6);
												local759 = local1602.method4562(local1402, local23.anInt5985, Static326.aClass155Array13);
												local761 = local1602.method4563(local1402, Static326.aClass155Array13, local23.anInt5985, local23.anInt6007);
												if (Static377.aBoolean419) {
													if (arg4) {
														Static395.method5811(local132, local759 + local127, local761 + local132, local127);
													} else {
														Static609.method6158(local132, local127, local127 + local759, local761 + local132);
													}
												}
											} else if (Static377.aBoolean419) {
												if (arg4) {
													Static395.method5811(local59, local66, local73, local54);
												} else {
													Static609.method6158(local59, local54, local66, local73);
												}
											}
										}
									} else if (Static87.aBoolean125) {
										Static333.method5032(local23);
									}
								} else {
									@Pc(1769) int local1769;
									if (local23.anInt5976 == 5) {
										if (local23.anInt6020 < 0) {
											@Pc(1706) Class155 local1706;
											if (local23.anInt5990 != -1) {
												@Pc(1688) Class359 local1688 = local23.aBoolean398 ? Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 : null;
												local1706 = Static82.aClass134_1.method3197(local23.anInt6030, local23.anInt5990, local1688, local23.anInt5952, Static273.aClass100_6, local23.anInt5997 | 0xFF000000, local23.anInt6017);
											} else if (local23.anInt5974 == -1) {
												local1706 = local23.method5318(Static273.aClass100_6);
											} else {
												local1706 = Static164.method3005(Static273.aClass100_6, local23.anInt5974);
											}
											if (local1706 != null) {
												local326 = local1706.method7206();
												local724 = local1706.method7209();
												local1769 = 255 - (local147 & 0xFF) << 24 | (local23.anInt5981 == 0 ? 16777215 : local23.anInt5981 & 0xFFFFFF);
												if (local23.aBoolean403) {
													Static273.aClass100_6.T(local127, local132, local23.anInt5985 + local127, local23.anInt5973 + local132);
													if (local23.anInt5969 != 0) {
														local759 = (local23.anInt5985 + local326 - 1) / local326;
														local761 = (local23.anInt5973 + local724 - 1) / local724;
														for (local774 = 0; local774 < local759; local774++) {
															for (local919 = 0; local919 < local761; local919++) {
																if (local23.anInt5981 == 0) {
																	local1706.method7211((float) (local774 * local326 + local127) + (float) local326 / 2.0F, (float) (local132 + local919 * local724) + (float) local724 / 2.0F, 4096, local23.anInt5969);
																} else {
																	local1706.method7195((float) local326 / 2.0F + (float) (local326 * local774 + local127), (float) (local919 * local724 + local132) + (float) local724 / 2.0F, 4096, local23.anInt5969, local1769);
																}
															}
														}
													} else if (local23.anInt5981 == 0 && local147 == 0) {
														local1706.method7204(local127, local132, local23.anInt5985, local23.anInt5973);
													} else {
														local1706.method7199(local127, local132, local23.anInt5985, local23.anInt5973, 0, local1769, 1);
													}
													Static273.aClass100_6.KA(arg1, arg6, arg9, arg0);
												} else if (local23.anInt5981 == 0 && local147 == 0) {
													if (local23.anInt5969 != 0) {
														local1706.method7211((float) local23.anInt5985 / 2.0F + (float) local127, (float) local132 + (float) local23.anInt5973 / 2.0F, local23.anInt5985 * 4096 / local326, local23.anInt5969);
													} else if (local326 == local23.anInt5985 && local724 == local23.anInt5973) {
														local1706.method7202(local127, local132);
													} else {
														local1706.method7192(local127, local132, local23.anInt5985, local23.anInt5973);
													}
												} else if (local23.anInt5969 != 0) {
													local1706.method7195((float) local23.anInt5985 / 2.0F + (float) local127, (float) local23.anInt5973 / 2.0F + (float) local132, local23.anInt5985 * 4096 / local326, local23.anInt5969, local1769);
												} else if (local23.anInt5985 == local326 && local23.anInt5973 == local724) {
													local1706.method7205(local127, local132, 0, local1769, 1);
												} else {
													local1706.method7200(local127, local132, local23.anInt5985, local23.anInt5973, 0, local1769, 1);
												}
											} else if (Static87.aBoolean125) {
												Static333.method5032(local23);
											}
										} else {
											local23.method5316(Static332.aClass161_1, Static635.aClass356_1).method3975(local23.anInt5973, Static273.aClass100_6, local23.anInt6019 << 3, 0, local132, 0, local23.anInt5985, local23.anInt6008 << 3, local127);
										}
										if (Static377.aBoolean419) {
											if (arg4) {
												Static395.method5811(local59, local66, local73, local54);
											} else {
												Static609.method6158(local59, local54, local66, local73);
											}
										}
									} else if (local23.anInt5976 == 6) {
										Static674.method9144();
										local1195 = null;
										@Pc(2176) Class43 local2176 = null;
										local724 = 0;
										@Pc(2223) Class264 local2223;
										@Pc(2236) Class359 local2236;
										if (local23.anInt5990 != -1) {
											local1412 = Static82.aClass134_1.method3191(local23.anInt5990);
											if (local1412 != null) {
												local1412 = local1412.method5690(local23.anInt6017);
												local2223 = local23.anInt5996 == -1 ? null : Static315.aClass14_1.method227(local23.anInt5996);
												local2236 = local23.aBoolean398 ? Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 : null;
												local2176 = local1412.method5688(local2236, 1, local23.anInt5968, Static273.aClass100_6, local23.anInt6023, 2048, local23.anInt6022, local2223);
												if (local2176 == null) {
													Static333.method5032(local23);
												} else {
													local724 = -local2176.fa() >> 1;
												}
											}
										} else if (local23.anInt5967 == 5) {
											local1769 = local23.anInt5964;
											if (local1769 >= 0 && local1769 < 2048) {
												@Pc(2348) Class4_Sub1_Sub1_Sub2_Sub1 local2348 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local1769];
												@Pc(2362) Class264 local2362 = local23.anInt5996 == -1 ? null : Static315.aClass14_1.method227(local23.anInt5996);
												if (local2348 != null && (Static649.anInt10621 == local1769 || Static46.method848(local2348.aString44) == local23.anInt6016)) {
													local2176 = local2348.aClass359_1.method8160(0, local23.anInt6023, Static591.aClass148_2, 0, Static239.aClass294_1, Static315.aClass14_1, Static82.aClass134_1, (Class264) null, Static23.aClass247_1, (Class64[]) null, -1, 2048, Static378.aClass369_2, local23.anInt6022, local2362, (int[]) null, Static273.aClass100_6, Static87.aClass133_1, 0, local23.anInt5968);
												}
											}
										} else if (local23.anInt5967 == 8 || local23.anInt5967 == 9) {
											@Pc(2209) Class5_Sub31 local2209 = Static93.method1470(false, local23.anInt5964);
											local2223 = local23.anInt5996 == -1 ? null : Static315.aClass14_1.method227(local23.anInt5996);
											if (local2209 != null) {
												local2236 = local23.aBoolean398 ? Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 : null;
												local2176 = local2209.method5031(local23.anInt5968, local2223, local23.anInt6022, local23.anInt6016, local23.anInt5967 == 9, Static273.aClass100_6, local23.anInt6023, local2236);
											}
										} else if (local23.anInt5996 == -1) {
											local2176 = local23.method5310(local1195, Static239.aClass294_1, -1, (Class264) null, Static591.aClass148_2, Static23.aClass247_1, -1, Static82.aClass134_1, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1, Static378.aClass369_2, 0, 2048, Static273.aClass100_6, Static315.aClass14_1);
											if (local2176 == null && Static87.aBoolean125) {
												Static333.method5032(local23);
											}
										} else {
											@Pc(2271) Class264 local2271 = Static315.aClass14_1.method227(local23.anInt5996);
											local2176 = local23.method5310(local1195, Static239.aClass294_1, local23.anInt5968, local2271, Static591.aClass148_2, Static23.aClass247_1, local23.anInt6022, Static82.aClass134_1, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1, Static378.aClass369_2, local23.anInt6023, 2048, Static273.aClass100_6, Static315.aClass14_1);
											if (local2176 == null && Static87.aBoolean125) {
												Static333.method5032(local23);
											}
										}
										if (local2176 != null) {
											if (local23.anInt5991 > 0) {
												local1769 = (local23.anInt5985 << 9) / local23.anInt5991;
											} else {
												local1769 = 512;
											}
											if (local23.anInt6024 <= 0) {
												local759 = 512;
											} else {
												local759 = (local23.anInt5973 << 9) / local23.anInt6024;
											}
											local761 = local23.anInt5985 / 2 + local127;
											local774 = local132 + local23.anInt5973 / 2;
											if (!local23.aBoolean395) {
												local761 += local23.anInt5959 * local1769 >> 9;
												local774 += local759 * local23.anInt5939 >> 9;
											}
											Static155.aClass10_2.method4224();
											Static273.aClass100_6.method8590(Static155.aClass10_2);
											Static273.aClass100_6.DA(local761, local774, local1769, local759);
											Static273.aClass100_6.ya();
											if (local23.aBoolean406) {
												Static273.aClass100_6.C(false);
											}
											if (local23.aBoolean395) {
												Static196.aClass10_3.method4218(local23.anInt5946);
												Static196.aClass10_3.method4215(local23.anInt6025);
												Static196.aClass10_3.method4210(local23.anInt6002);
												Static196.aClass10_3.method4225(local23.anInt5959, local23.anInt5939, local23.anInt6015);
											} else {
												local919 = Class42.anIntArray51[local23.anInt5946 << 3] * (local23.anInt5982 << 2) >> 14;
												local921 = Class42.anIntArray52[local23.anInt5946 << 3] * (local23.anInt5982 << 2) >> 14;
												Static196.aClass10_3.method4221(-local23.anInt6002 << 3);
												Static196.aClass10_3.method4215(local23.anInt6025 << 3);
												Static196.aClass10_3.method4225(local23.anInt6011 << 2, local724 + local919 + (local23.anInt6027 << 2), (local23.anInt6027 << 2) + local921);
												Static196.aClass10_3.method4213(local23.anInt5946 << 3);
											}
											local23.method5315(local2176, Static196.aClass10_3, Static565.anInt8921, Static273.aClass100_6);
											if (Static606.aBoolean685) {
												Static273.aClass100_6.T(local127, local132, local127 + local23.anInt5985, local23.anInt5973 + local132);
											}
											if (local23.aBoolean395) {
												if (local23.aBoolean407) {
													local2176.method8846(Static196.aClass10_3, (Class4_Sub8) null, local23.anInt5982, 1);
												} else {
													local2176.method8849(Static196.aClass10_3, (Class4_Sub8) null, 1);
													if (local23.aClass4_Sub9_5 != null) {
														Static273.aClass100_6.method8586(local23.aClass4_Sub9_5.method8055());
													}
												}
											} else if (local23.aBoolean407) {
												local2176.method8846(Static196.aClass10_3, (Class4_Sub8) null, local23.anInt5982 << 2, 1);
											} else {
												local2176.method8849(Static196.aClass10_3, (Class4_Sub8) null, 1);
												if (local23.aClass4_Sub9_5 != null) {
													Static273.aClass100_6.method8586(local23.aClass4_Sub9_5.method8055());
												}
											}
											if (Static606.aBoolean685) {
												Static273.aClass100_6.KA(arg1, arg6, arg9, arg0);
											}
											if (local23.aBoolean406) {
												Static273.aClass100_6.C(true);
											}
										}
										if (Static377.aBoolean419) {
											if (arg4) {
												Static395.method5811(local59, local66, local73, local54);
											} else {
												Static609.method6158(local59, local54, local66, local73);
											}
										}
									} else if (local23.anInt5976 == 9) {
										if (local23.aBoolean396) {
											local326 = local23.anInt5973 + local132;
											local1769 = local132;
											local724 = local127 + local23.anInt5985;
										} else {
											local724 = local127 + local23.anInt5985;
											local326 = local132;
											local1769 = local132 + local23.anInt5973;
										}
										if (local23.anInt6014 == 1) {
											Static273.aClass100_6.method8638(local127, local326, local724, local1769, local23.anInt5981, 0);
										} else {
											Static273.aClass100_6.method8637(local127, local326, local724, local1769, local23.anInt5981, local23.anInt6014);
										}
										if (Static377.aBoolean419) {
											if (arg4) {
												Static395.method5811(local59, local66, local73, local54);
											} else {
												Static609.method6158(local59, local54, local66, local73);
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
