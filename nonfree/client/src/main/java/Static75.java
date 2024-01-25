import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!tg;")
	public static final Class330 aClass330_5 = new Class330();

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Z")
	public static boolean aBoolean114 = false;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
	public static final int[] anIntArray109 = new int[3];

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1282(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static320.anInt5442;
		@Pc(3) int[] local3 = Static278.anIntArray264;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static280.anInt4989; local5++) {
			@Pc(15) Class4_Sub2_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local3[local5]];
			} else {
				local15 = ((Class5_Sub3) Static445.aClass273_29.method6581((long) Static209.anIntArray198[local5 - local1])).aClass4_Sub2_Sub1_Sub1_Sub2_1;
			}
			if (local15.aByte132 == arg0 && local15.anInt1261 >= 0) {
				@Pc(39) int local39 = local15.method1018();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10231 & 0x1FF) != 0 || (local15.anInt10229 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10231 & 0x1FF) != 256 || (local15.anInt10229 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10231 >> 9;
					local80 = local15.anInt10229 >> 9;
					if (local15.anInt1261 > Static254.anIntArrayArray24[local75][local80]) {
						Static254.anIntArrayArray24[local75][local80] = local15.anInt1261;
						Static217.anIntArrayArray20[local75][local80] = 1;
					} else if (local15.anInt1261 == Static254.anIntArrayArray24[local75][local80]) {
						local116 = Static217.anIntArrayArray20[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10231 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10229 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10231 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10229 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt1261 > Static254.anIntArrayArray24[local158][local161]) {
								Static254.anIntArrayArray24[local158][local161] = local15.anInt1261;
								Static217.anIntArrayArray20[local158][local161] = 1;
							} else if (local15.anInt1261 == Static254.anIntArrayArray24[local158][local161]) {
								local116 = Static217.anIntArrayArray20[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1284() {
		for (@Pc(1) int local1 = 0; local1 < Static326.anInt5541; local1++) {
			@Pc(6) int[] local6 = Static254.anIntArrayArray24[local1];
			for (@Pc(8) int local8 = 0; local8 < Static448.anInt7637; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!raa;)Lclient!qaa;")
	public static Class5_Sub40 method1286(@OriginalArg(0) Class295 arg0) {
		@Pc(13) Class5_Sub40 local13 = (Class5_Sub40) Static421.aClass273_26.method6581(((long) arg0.anInt8022 << 32) + (long) arg0.anInt8025);
		return local13 == null ? arg0.aClass5_Sub40_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1287(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static320.anInt5442;
		@Pc(3) int[] local3 = Static278.anIntArray264;
		@Pc(11) int local11 = Static42.aBoolean50 ? local1 : local1 + Static280.anInt4989;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class4_Sub2_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local3[local13]];
			} else {
				local23 = ((Class5_Sub3) Static445.aClass273_29.method6581((long) Static209.anIntArray198[local13 - local1])).aClass4_Sub2_Sub1_Sub1_Sub2_1;
			}
			if (local23.aByte132 == arg0) {
				local23.anInt1243 = 0;
				if (local23.anInt1261 < 0) {
					local23.aBoolean71 = false;
				} else {
					@Pc(54) int local54 = local23.method1018();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10231 & 0x1FF) != 0 || (local23.anInt10229 & 0x1FF) != 0) {
							local23.aBoolean71 = false;
							continue;
						}
					} else if ((local23.anInt10231 & 0x1FF) != 256 || (local23.anInt10229 & 0x1FF) != 256) {
						local23.aBoolean71 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10231 >> 9;
						local101 = local23.anInt10229 >> 9;
						if (local23.anInt1261 != Static254.anIntArrayArray24[local96][local101]) {
							local23.aBoolean71 = true;
							continue;
						}
						if (Static217.anIntArrayArray20[local96][local101] > 1) {
							local126 = Static217.anIntArrayArray20[local96][local101]--;
							local23.aBoolean71 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10231 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10229 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10231 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10229 + local96 >> 9;
						if (!Static526.method7810(local162, local169, local23.anInt1261, local101, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt1261 == Static254.anIntArrayArray24[local180][local183]) {
										local126 = Static217.anIntArrayArray20[local180][local183]--;
									}
								}
							}
							local23.aBoolean71 = true;
							continue;
						}
					}
					local23.aBoolean71 = false;
					local23.anInt10228 = Static644.method9021(local23.anInt10229, local23.anInt10231, local23.aByte132);
					Static37.method569(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1288() {
		@Pc(1) int local1 = Static320.anInt5442;
		@Pc(3) int[] local3 = Static278.anIntArray264;
		@Pc(8) int local8 = Static97.aClass5_Sub25_8.aClass6_Sub7_1.method1780();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class4_Sub2_Sub1_Sub1_Sub1 local32 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local3[local25]];
			if (!local32.method738()) {
				local32.anInt1261 = -1;
			} else if (local32.aBoolean49) {
				local32.anInt1261 = -1;
			} else {
				local32.method8165();
				if (local32.aShort107 >= 0 && local32.aShort108 >= 0 && local32.aShort109 < Static326.anInt5541 && local32.aShort110 < Static448.anInt7637) {
					local32.aBoolean47 = local32.aBoolean70 ? local23 : false;
					if (local32 == Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2) {
						local32.anInt1261 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean71) {
							local85++;
						}
						if (local32.anInt1275 > Static631.anInt10493) {
							local85 += 2;
						}
						local85 += 5 - local32.method1018() << 2;
						if (local32.aBoolean48) {
							local85 += 512;
						} else {
							if (Static111.anInt2092 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt1261 = local85 + 1;
					}
				} else {
					local32.anInt1261 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static280.anInt4989; local126++) {
			@Pc(137) Class4_Sub2_Sub1_Sub1_Sub2 local137 = ((Class5_Sub3) Static445.aClass273_29.method6581((long) Static209.anIntArray198[local126])).aClass4_Sub2_Sub1_Sub1_Sub2_1;
			if (local137.method1042() && local137.aClass225_1.method4987(Static301.aClass59_1)) {
				local137.method8165();
				if (local137.aShort107 >= 0 && local137.aShort108 >= 0 && local137.aShort109 < Static326.anInt5541 && local137.aShort110 < Static448.anInt7637) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean71) {
						local174++;
					}
					if (local137.anInt1275 > Static631.anInt10493) {
						local174 += 2;
					}
					local174 += 5 - local137.method1018() << 2;
					if (Static111.anInt2092 == 0) {
						if (local137.aClass225_1.lb) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static111.anInt2092 == 1) {
						if (local137.aClass225_1.lb) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass225_1.aBoolean405) {
						local174 += 1024;
					} else if (!local137.aClass225_1.aBoolean406) {
						local174 += 256;
					}
					local137.anInt1261 = local174 + 1;
				} else {
					local137.anInt1261 = -1;
				}
			} else {
				local137.anInt1261 = -1;
			}
		}
		for (local85 = 0; local85 < Static82.aClass154Array1.length; local85++) {
			@Pc(240) Class154 local240 = Static82.aClass154Array1[local85];
			if (local240 != null) {
				if (local240.anInt4132 == 1) {
					@Pc(254) Class5_Sub3 local254 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local240.anInt4129);
					if (local254 != null) {
						@Pc(259) Class4_Sub2_Sub1_Sub1_Sub2 local259 = local254.aClass4_Sub2_Sub1_Sub1_Sub2_1;
						if (local259.anInt1261 >= 0) {
							local259.anInt1261 += 2048;
						}
					}
				} else if (local240.anInt4132 == 10) {
					@Pc(278) Class4_Sub2_Sub1_Sub1_Sub1 local278 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local240.anInt4129];
					if (local278 != null && local278 != Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 && local278.anInt1261 >= 0) {
						local278.anInt1261 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!raa;)Z")
	public static boolean method1289(@OriginalArg(0) Class295 arg0) {
		if (Static132.aBoolean513) {
			if (method1286(arg0).anInt7590 != 0) {
				return false;
			}
			if (arg0.anInt8001 == 0) {
				return false;
			}
		}
		return arg0.aBoolean567;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z")
	public static boolean method1290(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1291() {
		@Pc(1) int local1 = Static320.anInt5442;
		@Pc(3) int[] local3 = Static278.anIntArray264;
		@Pc(11) int local11 = Static42.aBoolean50 ? local1 : local1 + Static280.anInt4989;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class4_Sub2_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local3[local13]];
			} else {
				local23 = ((Class5_Sub3) Static445.aClass273_29.method6581((long) Static209.anIntArray198[local13 - local1])).aClass4_Sub2_Sub1_Sub1_Sub2_1;
			}
			if (local23.anInt1261 >= 0) {
				@Pc(43) int local43 = local23.method1018();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10231 & 0x1FF) == 0 && (local23.anInt10229 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10231 & 0x1FF) == 256 && (local23.anInt10229 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10228 = Static644.method9021(local23.anInt10229, local23.anInt10231, local23.aByte132);
				Static37.method569(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZZIIII)V")
	public static void method1292(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 <= arg4) {
			return;
		}
		@Pc(23) int local23 = (arg4 + arg0) / 2;
		@Pc(25) int local25 = arg4;
		@Pc(29) Class33_Sub1 local29 = Static103.aClass33_Sub1Array2[local23];
		Static103.aClass33_Sub1Array2[local23] = Static103.aClass33_Sub1Array2[arg0];
		Static103.aClass33_Sub1Array2[arg0] = local29;
		for (@Pc(41) int local41 = arg4; local41 < arg0; local41++) {
			if (Static241.method4008(arg3, Static103.aClass33_Sub1Array2[local41], arg2, local29, arg5, arg1) <= 0) {
				@Pc(58) Class33_Sub1 local58 = Static103.aClass33_Sub1Array2[local41];
				Static103.aClass33_Sub1Array2[local41] = Static103.aClass33_Sub1Array2[local25];
				Static103.aClass33_Sub1Array2[local25++] = local58;
			}
		}
		Static103.aClass33_Sub1Array2[arg0] = Static103.aClass33_Sub1Array2[local25];
		Static103.aClass33_Sub1Array2[local25] = local29;
		method1292(local25 - 1, arg1, arg2, arg3, arg4, arg5);
		method1292(arg0, arg1, arg2, arg3, local25 + 1, arg5);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!raa;IIIIIIIIIII)V")
	public static void method1293(@OriginalArg(0) Class295[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class295 local6 = arg0[local1];
			if (local6 != null && local6.anInt7944 == arg1) {
				@Pc(17) int local17 = local6.anInt8030 + arg6;
				@Pc(22) int local22 = local6.anInt7996 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt8001 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt7957;
					local45 = local22 + local6.anInt7985;
					if (local6.anInt8001 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt8001 == 0 || local6.aBoolean572 || method1286(local6).anInt7590 != 0 || local6 == Static106.aClass295_6 || local6.anInt7960 == Static7.anInt153 || local6.anInt7960 == Static299.anInt5199) {
					if (!method1289(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static428.aBoolean526) {
							local40 = Static584.method8436();
							local45 = Static88.method1487();
						}
						if (local6 == Static443.aClass295_14 && Static42.method756(Static443.aClass295_14) != null) {
							Static172.aBoolean216 = true;
							Static27.anInt356 = local17;
							Static185.anInt3257 = local22;
						}
						if (local6.aBoolean580 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean568 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class5_Sub51 local168 = (Class5_Sub51) Static354.aClass330_10.method7908(); local168 != null; local168 = (Class5_Sub51) Static354.aClass330_10.method7914()) {
									if (local168.aBoolean675) {
										local168.method9047();
										local168.aClass295_19.aBoolean577 = false;
									}
								}
								if (Static465.anInt7824 == 0) {
									Static443.aClass295_14 = null;
									Static106.aClass295_6 = null;
								}
								Static349.anInt5874 = 0;
								Static466.aBoolean553 = false;
								aBoolean114 = false;
								if (!Static142.aBoolean190) {
									Static356.method5282();
								}
							}
							@Pc(232) boolean local232;
							if (Static3.aClass3_3.method8875() + local40 >= local28 && Static3.aClass3_3.method8879() + local45 >= local30 && Static3.aClass3_3.method8875() + local40 < local32 && Static3.aClass3_3.method8879() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static285.aBoolean378 && local232) {
								if (local6.anInt8002 >= 0) {
									Static578.anInt4589 = local6.anInt8002;
								} else if (local6.aBoolean568) {
									Static578.anInt4589 = -1;
								}
							}
							if (!Static142.aBoolean190 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static576.method8348(arg11 - local22, arg10 - local17, local6);
							}
							@Pc(276) boolean local276 = false;
							if (Static3.aClass3_3.method8874() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class5_Sub13 local291 = (Class5_Sub13) aClass330_5.method7908();
							if (local291 != null && local291.method5399() == 0 && local291.method5403() + local40 >= local28 && local291.method5401() + local45 >= local30 && local291.method5403() + local40 < local32 && local291.method5401() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray77 != null && !Static123.method4146()) {
								for (local335 = 0; local335 < local6.aByteArray77.length; local335++) {
									if (Static45.aClass115_1.method2490(local6.aByteArray77[local335])) {
										if (local6.anIntArray450 == null || Static631.anInt10493 >= local6.anIntArray450[local335]) {
											@Pc(367) byte local367 = local6.aByteArray76[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static45.aClass115_1.method2490(86) && !Static45.aClass115_1.method2490(82) && !Static45.aClass115_1.method2490(81)) && ((local367 & 0x2) == 0 || Static45.aClass115_1.method2490(86)) && ((local367 & 0x1) == 0 || Static45.aClass115_1.method2490(82)) && ((local367 & 0x4) == 0 || Static45.aClass115_1.method2490(81))) {
												if (local335 < 10) {
													Static360.method5376(local335 + 1, local6.anInt8022, "", -1);
												} else if (local335 == 10) {
													Static420.method6387();
													@Pc(438) Class5_Sub40 local438 = method1286(local6);
													Static356.method5281(local438.anInt7585, local6, local438.method6707());
													Static493.aString96 = Static393.method8896(local6);
													if (Static493.aString96 == null) {
														Static493.aString96 = "Null";
													}
													Static92.aString22 = local6.aString92 + "<col=ffffff>";
												}
												local469 = local6.anIntArray452[local335];
												if (local6.anIntArray450 == null) {
													local6.anIntArray450 = new int[local6.aByteArray77.length];
												}
												if (local469 == 0) {
													local6.anIntArray450[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray450[local335] = Static631.anInt10493 + local469;
												}
											}
										}
									} else if (local6.anIntArray450 != null) {
										local6.anIntArray450[local335] = 0;
									}
								}
							}
							if (local286) {
								Static250.method4149(local45 + local291.method5401() - local22, local6, local40 + local291.method5403() - local17);
							}
							if (Static443.aClass295_14 != null && Static443.aClass295_14 != local6 && local232 && method1286(local6).method6711()) {
								Static573.aClass295_9 = local6;
							}
							if (local6 == Static106.aClass295_6) {
								Static553.aBoolean673 = true;
								Static384.anInt6352 = local17;
								Static274.anInt4912 = local22;
							}
							if (local6.aBoolean572 || local6.anInt7960 != 0) {
								@Pc(558) Class5_Sub51 local558;
								if (local232 && Static236.anInt4330 != 0 && local6.anObjectArray18 != null) {
									local558 = new Class5_Sub51();
									local558.aBoolean675 = true;
									local558.aClass295_19 = local6;
									local558.anInt9442 = Static236.anInt4330;
									local558.anObjectArray33 = local6.anObjectArray18;
									Static354.aClass330_10.method7917(local558);
								}
								if (Static443.aClass295_14 != null || Static142.aBoolean190 || local6.anInt7960 != Static605.anInt10103 && Static349.anInt5874 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt7960 != 0) {
									if (local6.anInt7960 == Static27.anInt354 || local6.anInt7960 == Static621.anInt10358) {
										Static477.aClass295_16 = local6;
										if (Static360.aClass64_1 != null) {
											Static360.aClass64_1.method1360(local6.anInt7985, Static213.aClass133_5);
										}
										if (local6.anInt7960 == Static27.anInt354) {
											if (Static142.aBoolean190 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static287.method5382(arg8, arg9, Static213.aClass133_5);
											@Pc(641) Class4_Sub10 local641 = (Class4_Sub10) Static609.aClass99_10.method2045();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt8177 && arg10 < local641.anInt8179 && arg11 >= local641.anInt8176 && arg11 < local641.anInt8178) {
													Static356.method5282();
													Static223.method3812(local641.aClass4_Sub2_Sub1_Sub1_1);
												}
												local641 = (Class4_Sub10) Static609.aClass99_10.method2047();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt7960 == Static7.anInt153) {
										if (local6.method6998(Static213.aClass133_5) == null || Static606.anInt10177 != 0 && Static606.anInt10177 != 3 || Static142.aBoolean190 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray446[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray453[local708]) {
											continue;
										}
										local335 -= local6.anInt7957 / 2;
										local708 -= local6.anInt7985 / 2;
										if (Static254.anInt4612 == 4) {
											local747 = (int) Static311.aFloat95 & 0x3FFF;
										} else {
											local747 = (int) Static311.aFloat95 + Static2.anInt7 & 0x3FFF;
										}
										@Pc(759) int local759 = Class377.anIntArray600[local747];
										@Pc(763) int local763 = Class377.anIntArray601[local747];
										if (Static254.anInt4612 != 4) {
											local759 = local759 * (Static372.anInt6183 + 256) >> 8;
											local763 = local763 * (Static372.anInt6183 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static254.anInt4612 == 4) {
											local813 = (Static536.anInt9158 >> 9) + (local792 >> 2);
											local821 = (Static325.anInt5511 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method1018() - 1) * 256;
											local813 = (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 - local830 >> 9) + (local792 >> 2);
											local821 = (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 - local830 >> 9) - (local802 >> 2);
										}
										if (Static285.aBoolean378 && (Static427.anInt7391 & 0x40) != 0) {
											@Pc(863) Class295 local863 = Static324.method4920(Static375.anInt6224, Static570.anInt9615);
											if (local863 == null) {
												Static420.method6387();
											} else {
												Static150.method2214(local821, " ->", true, true, Static83.anInt6737, local813, local6.anInt8010, (long) (local6.anInt8025 << 0 | local6.anInt8022), false, Static493.aString96, 21, 1L);
											}
											continue;
										}
										if (Static156.aClass63_2 == Static265.aClass63_4) {
											Static150.method2214(local821, "", true, true, -1, local813, -1, 0L, false, Static174.aClass120_27.method2690(Static266.anInt4796), 59, 1L);
										}
										Static150.method2214(local821, "", true, true, Static405.anInt6784, local813, -1, 0L, false, Static502.aString99, 16, 1L);
										continue;
									}
									if (local6.anInt7960 == Static605.anInt10103) {
										Static135.aClass295_7 = local6;
										if (local232) {
											Static466.aBoolean553 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method5403() - local17 - local6.anInt7957 / 2) * 2.0D / (double) Static620.aFloat147);
											local708 = (int) -((double) (local45 + local291.method5401() - local22 - local6.anInt7985 / 2) * 2.0D / (double) Static620.aFloat147);
											local469 = Static196.anInt3883 + local335 + Static620.anInt8206;
											local747 = Static235.anInt4321 + local708 + Static620.anInt8210;
											@Pc(994) Class5_Sub5_Sub16 local994 = Static459.method6834();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method6557(local747, local999, local469);
											if (local999 != null) {
												if (Static45.aClass115_1.method2490(82) && Static210.anInt4035 > 0) {
													Static180.method2779(local999[1], local999[2], local999[0]);
													continue;
												}
												aBoolean114 = true;
												Static78.anInt1649 = local999[0];
												Static269.anInt4835 = local999[1];
												Static189.anInt10184 = local999[2];
											}
											Static349.anInt5874 = 1;
											Static239.aBoolean319 = false;
											Static246.anInt4495 = Static3.aClass3_3.method8875();
											Static380.anInt6270 = Static3.aClass3_3.method8879();
											continue;
										}
										if (local276 && Static349.anInt5874 > 0) {
											if (Static349.anInt5874 == 1 && (Static246.anInt4495 != Static3.aClass3_3.method8875() || Static380.anInt6270 != Static3.aClass3_3.method8879())) {
												Static296.anInt5188 = Static196.anInt3883;
												Static335.anInt5661 = Static235.anInt4321;
												Static349.anInt5874 = 2;
											}
											if (Static349.anInt5874 == 2) {
												Static239.aBoolean319 = true;
												Static495.method7327(Static296.anInt5188 + (int) ((double) (Static246.anInt4495 - Static3.aClass3_3.method8875()) * 2.0D / (double) Static620.aFloat146));
												Static448.method6756(Static335.anInt5661 - (int) ((double) (Static380.anInt6270 - Static3.aClass3_3.method8879()) * 2.0D / (double) Static620.aFloat146));
											}
											continue;
										}
										if (Static349.anInt5874 > 0 && !Static239.aBoolean319) {
											if ((Static197.anInt10376 == 1 || Static535.method7886()) && Static491.anInt8293 > 2) {
												Static270.method4337(Static246.anInt4495, Static380.anInt6270);
											} else if (Static498.method7455()) {
												Static270.method4337(Static246.anInt4495, Static380.anInt6270);
											}
										}
										Static349.anInt5874 = 0;
										continue;
									}
									if (local6.anInt7960 == Static588.anInt9884) {
										if (local276) {
											Static273.method4416(local6.anInt7985, local6.anInt7957, local45 + Static3.aClass3_3.method8879() - local22, local40 + Static3.aClass3_3.method8875() - local17);
										}
										continue;
									}
									if (local6.anInt7960 == Static299.anInt5199) {
										Static138.method2020(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean581 && local286) {
									local6.aBoolean581 = true;
									if (local6.anObjectArray17 != null) {
										local558 = new Class5_Sub51();
										local558.aBoolean675 = true;
										local558.aClass295_19 = local6;
										local558.anInt9438 = local40 + local291.method5403() - local17;
										local558.anInt9442 = local45 + local291.method5401() - local22;
										local558.anObjectArray33 = local6.anObjectArray17;
										Static354.aClass330_10.method7917(local558);
									}
								}
								if (local6.aBoolean581 && local276 && local6.anObjectArray24 != null) {
									local558 = new Class5_Sub51();
									local558.aBoolean675 = true;
									local558.aClass295_19 = local6;
									local558.anInt9438 = local40 + Static3.aClass3_3.method8875() - local17;
									local558.anInt9442 = local45 + Static3.aClass3_3.method8879() - local22;
									local558.anObjectArray33 = local6.anObjectArray24;
									Static354.aClass330_10.method7917(local558);
								}
								if (local6.aBoolean581 && !local276) {
									local6.aBoolean581 = false;
									if (local6.anObjectArray7 != null) {
										local558 = new Class5_Sub51();
										local558.aBoolean675 = true;
										local558.aClass295_19 = local6;
										local558.anInt9438 = local40 + Static3.aClass3_3.method8875() - local17;
										local558.anInt9442 = local45 + Static3.aClass3_3.method8879() - local22;
										local558.anObjectArray33 = local6.anObjectArray7;
										Static191.aClass330_16.method7917(local558);
									}
								}
								if (local276 && local6.anObjectArray26 != null) {
									local558 = new Class5_Sub51();
									local558.aBoolean675 = true;
									local558.aClass295_19 = local6;
									local558.anInt9438 = local40 + Static3.aClass3_3.method8875() - local17;
									local558.anInt9442 = local45 + Static3.aClass3_3.method8879() - local22;
									local558.anObjectArray33 = local6.anObjectArray26;
									Static354.aClass330_10.method7917(local558);
								}
								if (!local6.aBoolean577 && local232) {
									local6.aBoolean577 = true;
									if (local6.anObjectArray22 != null) {
										local558 = new Class5_Sub51();
										local558.aBoolean675 = true;
										local558.aClass295_19 = local6;
										local558.anInt9438 = local40 + Static3.aClass3_3.method8875() - local17;
										local558.anInt9442 = local45 + Static3.aClass3_3.method8879() - local22;
										local558.anObjectArray33 = local6.anObjectArray22;
										Static354.aClass330_10.method7917(local558);
									}
								}
								if (local6.aBoolean577 && local232 && local6.anObjectArray20 != null) {
									local558 = new Class5_Sub51();
									local558.aBoolean675 = true;
									local558.aClass295_19 = local6;
									local558.anInt9438 = local40 + Static3.aClass3_3.method8875() - local17;
									local558.anInt9442 = local45 + Static3.aClass3_3.method8879() - local22;
									local558.anObjectArray33 = local6.anObjectArray20;
									Static354.aClass330_10.method7917(local558);
								}
								if (local6.aBoolean577 && !local232) {
									local6.aBoolean577 = false;
									if (local6.anObjectArray31 != null) {
										local558 = new Class5_Sub51();
										local558.aBoolean675 = true;
										local558.aClass295_19 = local6;
										local558.anInt9438 = local40 + Static3.aClass3_3.method8875() - local17;
										local558.anInt9442 = local45 + Static3.aClass3_3.method8879() - local22;
										local558.anObjectArray33 = local6.anObjectArray31;
										Static191.aClass330_16.method7917(local558);
									}
								}
								if (local6.anObjectArray32 != null) {
									local558 = new Class5_Sub51();
									local558.aClass295_19 = local6;
									local558.anObjectArray33 = local6.anObjectArray32;
									Static8.aClass330_31.method7917(local558);
								}
								@Pc(1570) Class5_Sub51 local1570;
								if (local6.anObjectArray2 != null && Static308.anInt7112 > local6.anInt8033) {
									if (local6.anIntArray447 == null || Static308.anInt7112 - local6.anInt8033 > 32) {
										local558 = new Class5_Sub51();
										local558.aClass295_19 = local6;
										local558.anObjectArray33 = local6.anObjectArray2;
										Static354.aClass330_10.method7917(local558);
									} else {
										label687: for (local335 = local6.anInt8033; local335 < Static308.anInt7112; local335++) {
											local708 = Static199.anIntArray192[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray447.length; local469++) {
												if (local6.anIntArray447[local469] == local708) {
													local1570 = new Class5_Sub51();
													local1570.aClass295_19 = local6;
													local1570.anObjectArray33 = local6.anObjectArray2;
													Static354.aClass330_10.method7917(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt8033 = Static308.anInt7112;
								}
								if (local6.anObjectArray30 != null && Static509.anInt8839 > local6.lb) {
									if (local6.anIntArray454 == null || Static509.anInt8839 - local6.lb > 32) {
										local558 = new Class5_Sub51();
										local558.aClass295_19 = local6;
										local558.anObjectArray33 = local6.anObjectArray30;
										Static354.aClass330_10.method7917(local558);
									} else {
										label663: for (local335 = local6.lb; local335 < Static509.anInt8839; local335++) {
											local708 = Static120.anIntArray138[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray454.length; local469++) {
												if (local6.anIntArray454[local469] == local708) {
													local1570 = new Class5_Sub51();
													local1570.aClass295_19 = local6;
													local1570.anObjectArray33 = local6.anObjectArray30;
													Static354.aClass330_10.method7917(local1570);
													break label663;
												}
											}
										}
									}
									local6.lb = Static509.anInt8839;
								}
								if (local6.anObjectArray15 != null && Static508.anInt8815 > local6.anInt8011) {
									if (local6.anIntArray451 == null || Static508.anInt8815 - local6.anInt8011 > 32) {
										local558 = new Class5_Sub51();
										local558.aClass295_19 = local6;
										local558.anObjectArray33 = local6.anObjectArray15;
										Static354.aClass330_10.method7917(local558);
									} else {
										label639: for (local335 = local6.anInt8011; local335 < Static508.anInt8815; local335++) {
											local708 = Static329.anIntArray166[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray451.length; local469++) {
												if (local6.anIntArray451[local469] == local708) {
													local1570 = new Class5_Sub51();
													local1570.aClass295_19 = local6;
													local1570.anObjectArray33 = local6.anObjectArray15;
													Static354.aClass330_10.method7917(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt8011 = Static508.anInt8815;
								}
								if (local6.anObjectArray12 != null && Static3.anInt10435 > local6.anInt7963) {
									if (local6.anIntArray455 == null || Static3.anInt10435 - local6.anInt7963 > 32) {
										local558 = new Class5_Sub51();
										local558.aClass295_19 = local6;
										local558.anObjectArray33 = local6.anObjectArray12;
										Static354.aClass330_10.method7917(local558);
									} else {
										label615: for (local335 = local6.anInt7963; local335 < Static3.anInt10435; local335++) {
											local708 = Static568.anIntArray525[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray455.length; local469++) {
												if (local6.anIntArray455[local469] == local708) {
													local1570 = new Class5_Sub51();
													local1570.aClass295_19 = local6;
													local1570.anObjectArray33 = local6.anObjectArray12;
													Static354.aClass330_10.method7917(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt7963 = Static3.anInt10435;
								}
								if (local6.anObjectArray13 != null && Static550.anInt9297 > local6.anInt8005) {
									if (local6.anIntArray449 == null || Static550.anInt9297 - local6.anInt8005 > 32) {
										local558 = new Class5_Sub51();
										local558.aClass295_19 = local6;
										local558.anObjectArray33 = local6.anObjectArray13;
										Static354.aClass330_10.method7917(local558);
									} else {
										label591: for (local335 = local6.anInt8005; local335 < Static550.anInt9297; local335++) {
											local708 = Static605.anIntArray579[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray449.length; local469++) {
												if (local6.anIntArray449[local469] == local708) {
													local1570 = new Class5_Sub51();
													local1570.aClass295_19 = local6;
													local1570.anObjectArray33 = local6.anObjectArray13;
													Static354.aClass330_10.method7917(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt8005 = Static550.anInt9297;
								}
								if (Static303.anInt5290 > local6.anInt7986 && local6.anObjectArray29 != null) {
									local558 = new Class5_Sub51();
									local558.aClass295_19 = local6;
									local558.anObjectArray33 = local6.anObjectArray29;
									Static354.aClass330_10.method7917(local558);
								}
								if (Static197.anInt10377 > local6.anInt7986 && local6.anObjectArray3 != null) {
									local558 = new Class5_Sub51();
									local558.aClass295_19 = local6;
									local558.anObjectArray33 = local6.anObjectArray3;
									Static354.aClass330_10.method7917(local558);
								}
								if (Static393.anInt10472 > local6.anInt7986 && local6.anObjectArray10 != null) {
									local558 = new Class5_Sub51();
									local558.aClass295_19 = local6;
									local558.anObjectArray33 = local6.anObjectArray10;
									Static354.aClass330_10.method7917(local558);
								}
								if (Static536.anInt9157 > local6.anInt7986 && local6.anObjectArray16 != null) {
									local558 = new Class5_Sub51();
									local558.aClass295_19 = local6;
									local558.anObjectArray33 = local6.anObjectArray16;
									Static354.aClass330_10.method7917(local558);
								}
								if (Static462.anInt7776 > local6.anInt7986 && local6.anObjectArray23 != null) {
									local558 = new Class5_Sub51();
									local558.aClass295_19 = local6;
									local558.anObjectArray33 = local6.anObjectArray23;
									Static354.aClass330_10.method7917(local558);
								}
								local6.anInt7986 = Static126.anInt2290;
								if (local6.anObjectArray27 != null) {
									for (local335 = 0; local335 < Static61.anInt9889; local335++) {
										@Pc(2038) Class5_Sub51 local2038 = new Class5_Sub51();
										local2038.aClass295_19 = local6;
										local2038.anInt9441 = Static327.anInterface1Array2[local335].method7651();
										local2038.anInt9440 = Static327.anInterface1Array2[local335].method7648();
										local2038.anObjectArray33 = local6.anObjectArray27;
										Static354.aClass330_10.method7917(local2038);
									}
								}
								if (Static53.aBoolean62 && local6.anObjectArray6 != null) {
									local558 = new Class5_Sub51();
									local558.aClass295_19 = local6;
									local558.anObjectArray33 = local6.anObjectArray6;
									Static354.aClass330_10.method7917(local558);
								}
							}
							if (local6.anInt8001 == 5 && local6.anInt8014 != -1) {
								local6.method6993(Static55.aClass191_1, Static513.aClass260_2).method1360(local6.anInt7985, Static213.aClass133_5);
							}
							Static41.method745(local6);
							if (local6.anInt8001 == 0) {
								method1293(arg0, local6.anInt8022, local28, local30, local32, local34, local17 - local6.anInt7988, local22 - local6.anInt7997, arg8, arg9, arg10, arg11);
								if (local6.aClass295Array2 != null) {
									method1293(local6.aClass295Array2, local6.anInt8022, local28, local30, local32, local34, local17 - local6.anInt7988, local22 - local6.anInt7997, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class5_Sub27 local2164 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local6.anInt8022);
								if (local2164 != null) {
									if (Static156.aClass63_2 == Static550.aClass63_6 && local2164.anInt4272 == 0 && !Static142.aBoolean190 && local232 && !Static132.aBoolean513) {
										Static356.method5282();
									}
									Static243.method4022(arg9, arg11, arg10, arg8, local22, local34, local28, local32, local2164.anInt4270, local17, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static41.method745(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mq;I)I")
	public static int method1296(@OriginalArg(0) Class236 arg0) {
		if (arg0 == Static626.aClass236_6) {
			return 5890;
		} else if (Static273.aClass236_3 == arg0) {
			return 34167;
		} else if (Static229.aClass236_2 == arg0) {
			return 34168;
		} else if (arg0 == Static105.aClass236_1) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1298() {
		Static256.anInt4674 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static280.anInt4989; local3++) {
			@Pc(14) Class4_Sub2_Sub1_Sub1_Sub2 local14 = ((Class5_Sub3) Static445.aClass273_29.method6581((long) Static209.anIntArray198[local3])).aClass4_Sub2_Sub1_Sub1_Sub2_1;
			if (local14.aBoolean71 && local14.method1019() != -1) {
				@Pc(32) int local32 = (local14.method1018() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10231 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10229 - local32 >> 9;
				@Pc(53) Class4_Sub2_Sub1_Sub1 local53 = Static534.method7880(local46, local39, local14.aByte132);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt1225;
					if (local53 instanceof Class4_Sub2_Sub1_Sub1_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt1243 == 0 && local53.method1019() != -1) {
						Static57.anIntArray75[Static256.anInt4674] = local58;
						Static424.anIntArray392[Static256.anInt4674] = local58;
						Static256.anInt4674++;
						local53.anInt1243++;
					}
					Static57.anIntArray75[Static256.anInt4674] = local58;
					Static424.anIntArray392[Static256.anInt4674] = local14.anInt1225 + 2048;
					Static256.anInt4674++;
					local53.anInt1243++;
				}
			}
		}
		Static564.method8208(0, Static424.anIntArray392, Static57.anIntArray75, Static256.anInt4674 - 1);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!raa;)Lclient!raa;")
	public static Class295 method1300(@OriginalArg(0) Class295 arg0) {
		@Pc(4) int local4 = method1286(arg0).method6710();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static107.method9049(arg0.anInt7944);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
