import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3 aClass5_Sub2_Sub6_Sub3_1;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!mb;")
	public static Class45 aClass45_959 = Static63.method1251("Menge eingeben:");

	@OriginalMember(owner = "client!od", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_960 = Static63.method1251("_");

	@OriginalMember(owner = "client!od", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_961 = Static63.method1251("(X100(U(Y");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
	public static boolean method1512(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ia;IIIIIBIII[Lclient!ia;)Lclient!ia;")
	public static Class5_Sub2_Sub8 method1513(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class5_Sub2_Sub8[] arg10) {
		if (arg3 < arg5 || arg9 > arg6 || arg4 <= arg3 || arg2 <= arg6) {
			return null;
		}
		for (@Pc(32) int local32 = 0; local32 < arg10.length; local32++) {
			@Pc(37) Class5_Sub2_Sub8 local37 = arg10[local32];
			if (local37 != null && local37.anInt1301 == arg8 && !Static60.method1218(local37) && local37 != arg1) {
				@Pc(60) int local60 = local37.anInt1294 + arg9 - arg0;
				@Pc(68) int local68 = arg5 + local37.anInt1252 - arg7;
				if (local37.anInt1269 == 0) {
					@Pc(94) Class5_Sub2_Sub8 local94 = method1513(local37.anInt1244, arg1, local60 + local37.anInt1243, arg3, local37.anInt1260 + local68, local68, arg6, local37.anInt1265, local37.anInt1262, local60, arg10);
					if (local94 != null) {
						return local94;
					}
					if (local37.aClass5_Sub2_Sub8Array1 != null) {
						local94 = method1513(local37.anInt1244, arg1, local60 + local37.anInt1243, arg3, local37.anInt1260 + local68, local68, arg6, local37.anInt1265, local37.anInt1262, local60, local37.aClass5_Sub2_Sub8Array1);
						if (local94 != null) {
							return local94;
						}
					}
				}
				if (Static49.method1107(Static74.method1700(local37)) && local68 <= arg3 && arg6 >= local60 && arg3 < local68 + local37.anInt1260 && local60 + local37.anInt1243 > arg6) {
					return local37;
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)Lclient!be;")
	public static Class5_Sub2_Sub3 method1515(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub3 local10 = (Class5_Sub2_Sub3) Static99.aClass67_21.method1823((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static80.aClass29_53.method733(arg0, 10);
		local10 = new Class5_Sub2_Sub3();
		local10.anInt234 = arg0;
		if (local20 != null) {
			local10.method174(new Class5_Sub9(local20));
		}
		local10.method172();
		if (local10.anInt275 != -1) {
			local10.method169(method1515(local10.anInt275), method1515(local10.anInt232));
		}
		if (!Static8.aBoolean8 && local10.aBoolean9) {
			local10.aClass45_108 = Static31.aClass45_448;
			local10.aClass45Array1 = null;
			local10.anInt274 = 0;
			local10.aClass45Array2 = null;
		}
		Static99.aClass67_21.method1818(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method1516() {
		aClass45_959 = null;
		aClass45_961 = null;
		aClass45_960 = null;
		aClass5_Sub2_Sub6_Sub3_1 = null;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	public static void method1517() {
		Static31.aClass67_9.method1819();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)V")
	public static void method1518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class10 local11 = Static30.aClass10ArrayArrayArray2[Static8.anInt262][arg1][arg0];
		if (local11 == null) {
			Static110.aClass34_1.method925(Static8.anInt262, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class5_Sub2_Sub4_Sub1 local23 = null;
		@Pc(28) Class5_Sub2_Sub4_Sub1 local28;
		for (local28 = (Class5_Sub2_Sub4_Sub1) local11.method230(); local28 != null; local28 = (Class5_Sub2_Sub4_Sub1) local11.method233()) {
			@Pc(34) Class5_Sub2_Sub3 local34 = method1515(local28.anInt339);
			@Pc(37) int local37 = local34.anInt241;
			if (local34.anInt268 == 1) {
				local37 *= local28.anInt340 + 1;
			}
			if (local37 > local21) {
				local21 = local37;
				local23 = local28;
			}
		}
		if (local23 == null) {
			Static110.aClass34_1.method925(Static8.anInt262, arg1, arg0);
			return;
		}
		local11.method235(local23);
		@Pc(80) Class5_Sub2_Sub4_Sub1 local80 = null;
		local28 = (Class5_Sub2_Sub4_Sub1) local11.method230();
		@Pc(87) Class5_Sub2_Sub4_Sub1 local87 = null;
		while (local28 != null) {
			if (local23.anInt339 != local28.anInt339) {
				if (local80 == null) {
					local80 = local28;
				}
				if (local80.anInt339 != local28.anInt339 && local87 == null) {
					local87 = local28;
				}
			}
			local28 = (Class5_Sub2_Sub4_Sub1) local11.method233();
		}
		@Pc(129) int local129 = (arg0 << 7) + arg1 + 1610612736;
		Static110.aClass34_1.method921(Static8.anInt262, arg1, arg0, Static32.method676(arg1 * 128 + 64, arg0 * 128 + 64, Static8.anInt262), local23, local129, local80, local87);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([Lclient!ia;IIIIIIIII)Z")
	public static boolean method1519(@OriginalArg(0) Class5_Sub2_Sub8[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) boolean local3 = true;
		Static118.method1869(arg8, arg1, arg5, arg3);
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			@Pc(16) Class5_Sub2_Sub8 local16 = arg0[local10];
			if (local16 != null && (local16.anInt1301 == arg6 || arg6 == -1412584499 && Static104.aClass5_Sub2_Sub8_5 == local16)) {
				if (local16.anInt1267 > 0) {
					Static23.method543(local16);
				}
				@Pc(47) int local47 = local16.anInt1252 + arg8 - arg7;
				@Pc(50) int local50 = local16.anInt1259;
				@Pc(58) int local58 = arg1 + local16.anInt1294 - arg2;
				@Pc(95) int local95;
				@Pc(99) int local99;
				@Pc(162) int local162;
				@Pc(208) int local208;
				if (local16 == Static104.aClass5_Sub2_Sub8_5) {
					if (arg6 != -1412584499 && !local16.aBoolean69) {
						Static62.anInt1823 = arg2;
						Static87.anInt2495 = arg7;
						Static48.aClass5_Sub2_Sub8Array2 = arg0;
						continue;
					}
					@Pc(81) Class5_Sub2_Sub8 local81 = Static79.method1504(local16);
					if (local81 == null) {
						Static104.aClass5_Sub2_Sub8_5 = null;
					} else {
						@Pc(87) int[] local87 = Static42.method570(local81);
						@Pc(91) int[] local91 = Static42.method570(local16);
						local95 = Static14.anInt425 - Static100.anInt2700;
						local99 = Static47.anInt1354 - Static42.anInt800;
						if (local95 <= local16.anInt1295 && -local16.anInt1295 <= local95 && local99 <= local16.anInt1295 && local99 >= -local16.anInt1295 && !Static67.aBoolean93) {
							local99 = 0;
							local95 = 0;
						} else if (local16.anInt1293 < Static40.anInt1173 || Static67.aBoolean93) {
							Static67.aBoolean93 = true;
						} else {
							local99 = 0;
							local95 = 0;
						}
						local162 = local95 + local91[0] - local87[0];
						if (!local16.aBoolean69) {
							local50 = 128;
						}
						if (local162 < 0) {
							local162 = 0;
						}
						if (local16.anInt1260 + local162 > local81.anInt1260) {
							local162 = local81.anInt1260 - local16.anInt1260;
						}
						local47 = local162 + local87[0];
						local208 = local99 + local91[1] - local87[1];
						if (local208 < 0) {
							local208 = 0;
						}
						if (local81.anInt1243 < local16.anInt1243 + local208) {
							local208 = local81.anInt1243 - local16.anInt1243;
						}
						local58 = local87[1] + local208;
					}
				}
				if ((!local16.aBoolean66 || Static118.anInt2723 >= local47 && local58 <= Static118.anInt2720 && local47 + local16.anInt1260 >= Static118.anInt2721 && local16.anInt1243 + local58 >= Static118.anInt2724) && (!local16.aBoolean66 || !Static60.method1218(local16))) {
					if (local16.anInt1269 == 0) {
						if (!local16.aBoolean66 && Static60.method1218(local16) && !Static112.method2057(arg4, local10)) {
							continue;
						}
						if (!local16.aBoolean66) {
							if (local16.anInt1244 > local16.anInt1232 - local16.anInt1243) {
								local16.anInt1244 = local16.anInt1232 - local16.anInt1243;
							}
							if (local16.anInt1244 < 0) {
								local16.anInt1244 = 0;
							}
						}
						local3 &= method1519(arg0, local58, local16.anInt1244, local16.anInt1243 + local58, arg4, local47 + local16.anInt1260, local16.anInt1262, local16.anInt1265, local47);
						if (local16.aClass5_Sub2_Sub8Array1 != null) {
							local3 &= method1519(local16.aClass5_Sub2_Sub8Array1, local58, local16.anInt1244, local16.anInt1243 + local58, arg4, local16.anInt1260 + local47, local16.anInt1262, local16.anInt1265, local47);
						}
						Static118.method1869(arg8, arg1, arg5, arg3);
						if (local16.anInt1232 > local16.anInt1243 && !local16.aBoolean66) {
							Static52.method2154(local16.anInt1243, local58, local16.anInt1244, local16.anInt1260 + local47, local16.anInt1232);
						}
					}
					if (local16.anInt1269 != 1) {
						@Pc(475) int local475;
						@Pc(661) int local661;
						@Pc(412) int local412;
						@Pc(414) int local414;
						@Pc(418) int local418;
						if (local16.anInt1269 == 2) {
							local412 = 0;
							for (local414 = 0; local414 < local16.anInt1243; local414++) {
								for (local418 = 0; local418 < local16.anInt1260; local418++) {
									local95 = local418 * (local16.anInt1290 + 32) + local47;
									local99 = (local16.anInt1282 + 32) * local414 + local58;
									if (local412 < 20) {
										local95 += local16.anIntArray210[local412];
										local99 += local16.anIntArray207[local412];
									}
									if (local16.anIntArray201[local412] > 0) {
										local475 = local16.anIntArray201[local412] - 1;
										if (Static118.anInt2721 - 32 < local95 && local95 < Static118.anInt2723 && local99 > Static118.anInt2724 - 32 && local99 < Static118.anInt2720 || Static96.anInt2617 != 0 && local412 == Static70.anInt2022) {
											@Pc(544) Class5_Sub2_Sub6_Sub3 local544;
											if (Static16.anInt502 == 1 && local412 == Static40.anInt1179 && Static4.anInt95 == local16.anInt1262) {
												local544 = Static77.method1480(local16.anIntArray208[local412], local475, 0, false, 2);
											} else {
												local544 = Static77.method1480(local16.anIntArray208[local412], local475, 3153952, false, 1);
											}
											if (local544 == null) {
												local3 = false;
											} else if (Static96.anInt2617 != 0 && local412 == Static70.anInt2022 && Static50.anInt1603 == local16.anInt1262) {
												local162 = Static14.anInt425 - Static100.anInt2686;
												local208 = Static47.anInt1354 - Static119.anInt3088;
												if (local208 < 5 && local208 > -5) {
													local208 = 0;
												}
												if (local162 < 5 && local162 > -5) {
													local162 = 0;
												}
												if (Static100.anInt2701 < 5) {
													local162 = 0;
													local208 = 0;
												}
												local544.method1779(local162 + local95, local208 + local99, 128);
												if (arg6 != -1) {
													@Pc(637) Class5_Sub2_Sub8 local637 = arg0[arg6 & 0xFFFF];
													if (local99 + local208 < Static118.anInt2724 && local637.anInt1244 > 0) {
														local661 = (Static118.anInt2724 - local208 - local99) * Static90.anInt2533 / 3;
														if (local661 > Static90.anInt2533 * 10) {
															local661 = Static90.anInt2533 * 10;
														}
														if (local637.anInt1244 < local661) {
															local661 = local637.anInt1244;
														}
														local637.anInt1244 -= local661;
														Static119.anInt3088 += local661;
													}
													if (Static118.anInt2720 < local99 + local208 + 32 && local637.anInt1232 - local637.anInt1243 > local637.anInt1244) {
														local661 = (local99 + local208 + 32 - Static118.anInt2720) * Static90.anInt2533 / 3;
														if (local661 > Static90.anInt2533 * 10) {
															local661 = Static90.anInt2533 * 10;
														}
														if (local637.anInt1232 - local637.anInt1244 - local637.anInt1243 < local661) {
															local661 = local637.anInt1232 - local637.anInt1243 - local637.anInt1244;
														}
														Static119.anInt3088 -= local661;
														local637.anInt1244 += local661;
													}
												}
											} else if (Static28.anInt879 != 0 && Static90.anInt2531 == local412 && local16.anInt1262 == Static100.anInt2698) {
												local544.method1779(local95, local99, 128);
											} else {
												local544.method1781(local95, local99);
											}
										}
									} else if (local16.anIntArray204 != null && local412 < 20) {
										@Pc(818) Class5_Sub2_Sub6_Sub3 local818 = local16.method950(local412);
										if (local818 != null) {
											local818.method1781(local95, local99);
										} else if (Static117.aBoolean135) {
											local3 = false;
										}
									}
									local412++;
								}
							}
						} else if (local16.anInt1269 == 3) {
							if (Static85.method1627(local16)) {
								local412 = local16.anInt1258;
								if (Static112.method2057(arg4, local10) && local16.anInt1247 != 0) {
									local412 = local16.anInt1247;
								}
							} else {
								local412 = local16.anInt1233;
								if (Static112.method2057(arg4, local10) && local16.anInt1249 != 0) {
									local412 = local16.anInt1249;
								}
							}
							if (local50 == 0) {
								if (local16.aBoolean60) {
									Static118.method1858(local47, local58, local16.anInt1260, local16.anInt1243, local412);
								} else {
									Static118.method1867(local47, local58, local16.anInt1260, local16.anInt1243, local412);
								}
							} else if (local16.aBoolean60) {
								Static118.method1871(local47, local58, local16.anInt1260, local16.anInt1243, local412, 256 - (local50 & 0xFF));
							} else {
								Static118.method1872(local47, local58, local16.anInt1260, local16.anInt1243, local412, 256 - (local50 & 0xFF));
							}
						} else {
							@Pc(956) Class5_Sub2_Sub6_Sub1 local956;
							if (local16.anInt1269 == 4) {
								local956 = local16.method951();
								if (local956 != null) {
									@Pc(967) Class45 local967 = local16.aClass45_544;
									if (Static85.method1627(local16)) {
										local414 = local16.anInt1258;
										if (Static112.method2057(arg4, local10) && local16.anInt1247 != 0) {
											local414 = local16.anInt1247;
										}
										if (local16.aClass45_550.method1317() > 0) {
											local967 = local16.aClass45_550;
										}
									} else {
										local414 = local16.anInt1233;
										if (Static112.method2057(arg4, local10) && local16.anInt1249 != 0) {
											local414 = local16.anInt1249;
										}
									}
									if (local16.aBoolean66 && local16.anInt1289 != -1) {
										@Pc(1030) Class5_Sub2_Sub3 local1030 = method1515(local16.anInt1289);
										local967 = local1030.aClass45_108;
										if (local967 == null) {
											local967 = Static75.aClass45_904;
										}
										if ((local1030.anInt268 == 1 || local16.anInt1285 != 1) && local16.anInt1285 != -1) {
											local967 = Static39.method1443(new Class45[] { local967, Static40.aClass45_522, Static71.method1382(local16.anInt1285) });
										}
									}
									if (Static119.anInt3089 == local16.anInt1262 && local16.anInt1288 == Static54.anInt1637) {
										local414 = local16.anInt1233;
										local967 = Static96.aClass45_1110;
									}
									if (Static118.anInt2722 == 479) {
										if (local414 == 16776960) {
											local414 = 255;
										}
										if (local414 == 49152) {
											local414 = 16777215;
										}
									}
									local967 = Static7.method135(local16, local967);
									local956.method521(local967, local47, local58, local16.anInt1260, local16.anInt1243, local414, local16.aBoolean61, local16.anInt1280, local16.anInt1238, local16.anInt1242);
								} else if (Static117.aBoolean135) {
									local3 = false;
								}
							} else {
								@Pc(1261) int local1261;
								@Pc(1251) int local1251;
								@Pc(1267) int local1267;
								if (local16.anInt1269 == 5) {
									@Pc(1144) Class5_Sub2_Sub6_Sub3 local1144;
									if (local16.aBoolean66) {
										if (local16.anInt1289 == -1) {
											local1144 = local16.method954(false);
										} else {
											local1144 = Static77.method1480(local16.anInt1285, local16.anInt1289, local16.anInt1272, false, local16.anInt1271);
										}
										if (local1144 != null) {
											local414 = local1144.anInt2601;
											local418 = local1144.anInt2600;
											if (local16.aBoolean62) {
												local162 = local58;
												@Pc(1174) int[] local1174 = new int[4];
												Static118.method1861(local1174);
												if (local58 < local1174[1]) {
													local162 = local1174[1];
												}
												local208 = local16.anInt1260 + local47;
												if (local1174[2] < local208) {
													local208 = local1174[2];
												}
												local99 = local47;
												local475 = local58 + local16.anInt1243;
												if (local1174[3] < local475) {
													local475 = local1174[3];
												}
												if (local1174[0] > local47) {
													local99 = local1174[0];
												}
												Static118.method1869(local99, local162, local208, local475);
												local1251 = (local16.anInt1243 + local418 - 1) / local418;
												local1261 = (local16.anInt1260 + local414 - 1) / local414;
												for (local661 = 0; local661 < local1261; local661++) {
													for (local1267 = 0; local1267 < local1251; local1267++) {
														if (local16.anInt1274 != 0) {
															local1144.method1768(local414 / 2 + local661 * local414 + local47, local418 / 2 + local1267 * local418 + local58, local16.anInt1274, 4096);
														} else if (local50 == 0) {
															local1144.method1781(local414 * local661 + local47, local58 - -(local418 * local1267));
														} else {
															local1144.method1779(local414 * local661 + local47, local418 * local1267 + local58, 256 - (local50 & 0xFF));
														}
													}
												}
												Static118.method1870(local1174);
											} else {
												local95 = local16.anInt1260 * 4096 / local414;
												if (local16.anInt1274 != 0) {
													local1144.method1768(local16.anInt1260 / 2 + local47, local16.anInt1243 / 2 + local58, local16.anInt1274, local95);
												} else if (local50 != 0) {
													local1144.method1769(local47, local58, local16.anInt1260, local16.anInt1243, 256 - (local50 & 0xFF));
												} else if (local16.anInt1260 == local414 && local418 == local16.anInt1243) {
													local1144.method1781(local47, local58);
												} else {
													local1144.method1766(local47, local58, local16.anInt1260, local16.anInt1243);
												}
											}
										} else if (Static117.aBoolean135) {
											local3 = false;
										}
									} else {
										local1144 = local16.method954(Static85.method1627(local16));
										if (local1144 != null) {
											local1144.method1781(local47, local58);
										} else if (Static117.aBoolean135) {
											local3 = false;
										}
									}
								} else {
									@Pc(1554) Class5_Sub2_Sub3 local1554;
									if (local16.anInt1269 == 6) {
										@Pc(1462) Class5_Sub2_Sub4_Sub2 local1462 = null;
										@Pc(1468) boolean local1468 = Static85.method1627(local16);
										if (local1468) {
											local414 = local16.anInt1275;
										} else {
											local414 = local16.anInt1279;
										}
										local95 = 0;
										if (local16.anInt1289 != -1) {
											local1554 = method1515(local16.anInt1289);
											if (local1554 != null) {
												local1554 = local1554.method175(local16.anInt1285);
												local1462 = local1554.method160(1);
												if (local1462 == null) {
													local3 = false;
												} else {
													local1462.method419();
													local95 = local1462.anInt2379 / 2;
												}
											}
										} else if (local16.anInt1291 == 5) {
											if (local16.anInt1254 == 0) {
												local1462 = Static34.aClass32_1.method874(-1, -1, null, null);
											} else {
												local1462 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.method1612();
											}
										} else if (local414 == -1) {
											local1462 = local16.method953(local1468, null, -1, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass32_2);
											if (local1462 == null && Static117.aBoolean135) {
												local3 = false;
											}
										} else {
											@Pc(1532) Class5_Sub2_Sub9 local1532 = Static63.method1252(local414);
											local1462 = local16.method953(local1468, local1532, local16.anInt1236, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.aClass32_2);
											if (local1462 == null && Static117.aBoolean135) {
												local3 = false;
											}
										}
										Static86.method1673(local16.anInt1260 / 2 + local47, local58 + local16.anInt1243 / 2);
										local99 = Class5_Sub2_Sub6_Sub2.anIntArray360[local16.anInt1266] * local16.anInt1281 >> 16;
										local162 = local16.anInt1281 * Class5_Sub2_Sub6_Sub2.anIntArray362[local16.anInt1266] >> 16;
										if (local1462 != null) {
											if (local16.aBoolean66) {
												local1462.method419();
												if (local16.aBoolean64) {
													local1462.method426(local16.anInt1235, local16.anInt1270, local16.anInt1266, local16.anInt1297, local16.anInt1286 + local99 + local95, local16.anInt1286 + local162, local16.anInt1281);
												} else {
													local1462.method429(local16.anInt1235, local16.anInt1270, local16.anInt1266, local16.anInt1297, local16.anInt1286 + local95 + local99, local16.anInt1286 + local162);
												}
											} else {
												local1462.method429(local16.anInt1235, 0, local16.anInt1266, 0, local99, local162);
											}
										}
										Static86.method1671();
									} else {
										if (local16.anInt1269 == 7) {
											local956 = local16.method951();
											if (local956 == null) {
												if (Static117.aBoolean135) {
													local3 = false;
												}
												continue;
											}
											local414 = 0;
											for (local418 = 0; local418 < local16.anInt1243; local418++) {
												for (local95 = 0; local95 < local16.anInt1260; local95++) {
													if (local16.anIntArray201[local414] > 0) {
														local1554 = method1515(local16.anIntArray201[local414] - 1);
														@Pc(1734) Class45 local1734 = local1554.aClass45_108;
														if (local1734 == null) {
															local1734 = Static75.aClass45_904;
														}
														if (local1554.anInt268 == 1 || local16.anIntArray208[local414] != 1) {
															local1734 = Static39.method1443(new Class45[] { local1734, Static40.aClass45_522, Static71.method1382(local16.anIntArray208[local414]) });
														}
														local475 = local58 + local418 * (local16.anInt1282 + 12);
														local208 = local47 + local95 * (local16.anInt1290 + 115);
														if (local16.anInt1280 == 0) {
															local956.method524(local1734, local208, local475, local16.anInt1233, local16.aBoolean61);
														} else if (local16.anInt1280 == 1) {
															local956.method503(local1734, local208 + local16.anInt1260 / 2, local475, local16.anInt1233, local16.aBoolean61);
														} else {
															local956.method512(local1734, local208 + local16.anInt1260 - 1, local475, local16.anInt1233, local16.aBoolean61);
														}
													}
													local414++;
												}
											}
										}
										if (local16.anInt1269 == 8 && Static78.method1484(local10, arg4) && Static53.anInt2376 == Static57.anInt1707) {
											local414 = 0;
											@Pc(1874) Class5_Sub2_Sub6_Sub1 local1874 = Static78.aClass5_Sub2_Sub6_Sub1_5;
											local412 = 0;
											@Pc(1879) Class45 local1879 = local16.aClass45_544;
											local1879 = Static7.method135(local16, local1879);
											@Pc(1900) Class45 local1900;
											while (local1879.method1317() > 0) {
												local162 = local1879.method1328(Static75.aClass45_902);
												if (local162 == -1) {
													local1900 = local1879;
													local1879 = Static78.aClass45_929;
												} else {
													local1900 = local1879.method1322(local162, 0);
													local1879 = local1879.method1296(local162 + 2);
												}
												local208 = local1874.method501(local1900);
												local414 += local1874.anInt748 + 1;
												if (local412 < local208) {
													local412 = local208;
												}
											}
											local414 += 7;
											local412 += 6;
											local208 = local16.anInt1243 + local58 + 5;
											local162 = local16.anInt1260 + local47 - local412 - 5;
											if (local414 + local208 > arg3) {
												local208 = arg3 - local414;
											}
											if (local162 < local47 + 5) {
												local162 = local47 + 5;
											}
											if (arg5 < local162 + local412) {
												local162 = arg5 - local412;
											}
											Static118.method1858(local162, local208, local412, local414, 16777120);
											Static118.method1867(local162, local208, local412, local414, 0);
											local475 = local208 + local1874.anInt748 + 2;
											local1879 = local16.aClass45_544;
											local1879 = Static7.method135(local16, local1879);
											while (local1879.method1317() > 0) {
												local1261 = local1879.method1328(Static75.aClass45_902);
												if (local1261 == -1) {
													local1900 = local1879;
													local1879 = Static78.aClass45_929;
												} else {
													local1900 = local1879.method1322(local1261, 0);
													local1879 = local1879.method1296(local1261 + 2);
												}
												local1874.method524(local1900, local162 + 3, local475, 0, false);
												local475 += local1874.anInt748 + 1;
											}
										}
										if (local16.anInt1269 == 9) {
											if (local16.anInt1298 == 1) {
												Static118.method1866(local47, local58, local16.anInt1260 + local47, local16.anInt1243 + local58, local16.anInt1233);
											} else {
												local412 = local16.anInt1260 >= 0 ? local16.anInt1260 : -local16.anInt1260;
												local414 = local16.anInt1243 < 0 ? -local16.anInt1243 : local16.anInt1243;
												local418 = local412;
												if (local412 < local414) {
													local418 = local414;
												}
												if (local418 != 0) {
													local95 = (local16.anInt1260 << 16) / local418;
													local99 = (local16.anInt1243 << 16) / local418;
													if (local95 < local99) {
														local99 = -local99;
													} else {
														local95 = -local95;
													}
													local475 = local16.anInt1298 * local95 >> 17;
													local208 = local16.anInt1298 * local99 + 1 >> 17;
													local162 = local16.anInt1298 * local99 >> 17;
													local1251 = local47 + local162;
													local661 = local47 - local208;
													local1261 = local95 * local16.anInt1298 + 1 >> 17;
													@Pc(2186) int local2186 = local47 + local16.anInt1260 + local162;
													local1267 = local16.anInt1260 + local47 - local208;
													@Pc(2199) int local2199 = local58 - local1261;
													@Pc(2203) int local2203 = local475 + local58;
													@Pc(2210) int local2210 = local475 + local16.anInt1243 + local58;
													@Pc(2217) int local2217 = local58 + local16.anInt1243 - local1261;
													Static86.method1657(local1251, local661, local1267);
													Static86.method1668(local2203, local2199, local2217, local1251, local661, local1267, local16.anInt1233);
													Static86.method1657(local1251, local1267, local2186);
													Static86.method1668(local2203, local2217, local2210, local1251, local1267, local2186, local16.anInt1233);
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
		return local3;
	}
}
