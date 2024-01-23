import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
	public static int anInt3081;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
	public static int anInt3087;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "[I")
	public static int[] anIntArray284 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z")
	public static boolean method2433(@OriginalArg(1) int arg0) {
		if (Static184.anInt3611 == arg0) {
			return false;
		}
		Static267.anIntArrayArray28 = new int[104][104];
		Static38.anIntArrayArrayArray3 = new int[4][13][13];
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static121.aClass63Array1[local21] = new Class63(104, 104);
		}
		Static275.aByteArrayArrayArray18 = new byte[4][104][104];
		Static10.aClass10ArrayArrayArray1 = new Class10[4][104][104];
		Static46.aByteArrayArrayArray2 = new byte[4][104][104];
		if (Static178.aBoolean216) {
			Static12.method200();
			Static64.method980();
			Static61.aClass64ArrayArray1 = new Class64[13][13];
		}
		Static184.anInt3611 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!qb;I)V")
	public static void method2434(@OriginalArg(0) Class12_Sub3_Sub2 arg0) {
		@Pc(17) Class4_Sub23 local17 = (Class4_Sub23) Static262.aClass97_22.method2360(Static34.method491(arg0.aString132));
		if (local17 == null) {
			return;
		}
		if (local17.aClass4_Sub9_Sub1_3 != null) {
			Static219.aClass4_Sub9_Sub4_2.method1470(local17.aClass4_Sub9_Sub1_3);
			local17.aClass4_Sub9_Sub1_3 = null;
		}
		local17.method4391();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIII[Lclient!cc;I)V")
	public static void method2436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class22[] arg7, @OriginalArg(9) int arg8) {
		if (Static178.aBoolean216) {
			Static186.method2963(arg5, arg1, arg4, arg2);
		} else {
			Static166.method2622(arg5, arg1, arg4, arg2);
			Static204.method3238();
		}
		for (@Pc(18) int local18 = 0; local18 < arg7.length; local18++) {
			@Pc(26) Class22 local26 = arg7[local18];
			if (local26 != null && (local26.anInt587 == arg3 || arg3 == -1412584499 && Static45.aClass22_6 == local26)) {
				@Pc(50) int local50;
				if (arg6 == -1) {
					Static77.anIntArray154[Static220.anInt4365] = arg8 + local26.anInt569;
					Static197.anIntArray324[Static220.anInt4365] = arg0 + local26.anInt593;
					Static267.anIntArray300[Static220.anInt4365] = local26.anInt546;
					Static243.anIntArray427[Static220.anInt4365] = local26.anInt602;
					local50 = Static220.anInt4365++;
				} else {
					local50 = arg6;
				}
				local26.anInt586 = local50;
				local26.anInt540 = Static104.anInt2226;
				if (!local26.aBoolean33 || !Static40.method675(local26)) {
					if (local26.anInt612 > 0) {
						Static296.method1374(local26);
					}
					@Pc(106) int local106 = arg8 + local26.anInt569;
					@Pc(111) int local111 = local26.anInt593 + arg0;
					@Pc(114) int local114 = local26.anInt549;
					if (Static255.aBoolean311 && (Static40.method681(local26).anInt3558 != 0 || local26.anInt542 == 0) && local114 > 127) {
						local114 = 127;
					}
					@Pc(156) int local156;
					@Pc(158) int local158;
					if (Static45.aClass22_6 == local26) {
						if (arg3 != -1412584499 && !local26.aBoolean34) {
							Static76.aClass22Array2 = arg7;
							Static156.anInt3143 = arg8;
							Static6.anInt156 = arg0;
							continue;
						}
						if (Static238.aBoolean300 && Static247.aBoolean304) {
							local156 = Static72.anInt1326;
							local158 = Static117.anInt2589;
							local156 -= Static220.anInt4359;
							local158 -= Static89.anInt1844;
							if (local158 < Static177.anInt3483) {
								local158 = Static177.anInt3483;
							}
							if (local156 < Static214.anInt4262) {
								local156 = Static214.anInt4262;
							}
							if (local158 + local26.anInt602 > Static177.anInt3483 - -Static207.aClass22_17.anInt602) {
								local158 = Static177.anInt3483 + Static207.aClass22_17.anInt602 - local26.anInt602;
							}
							local111 = local158;
							if (Static214.anInt4262 + Static207.aClass22_17.anInt546 < local156 - -local26.anInt546) {
								local156 = Static214.anInt4262 + Static207.aClass22_17.anInt546 - local26.anInt546;
							}
							local106 = local156;
						}
						if (!local26.aBoolean34) {
							local114 = 128;
						}
					}
					@Pc(251) int local251;
					@Pc(247) int local247;
					@Pc(282) int local282;
					@Pc(277) int local277;
					if (local26.anInt542 == 2) {
						local156 = arg5;
						local247 = arg2;
						local158 = arg1;
						local251 = arg4;
					} else {
						local158 = local111 > arg1 ? local111 : arg1;
						local156 = local106 <= arg5 ? arg5 : local106;
						local277 = local111 + local26.anInt602;
						local282 = local26.anInt546 + local106;
						if (local26.anInt542 == 9) {
							local277++;
							local282++;
						}
						local251 = local282 < arg4 ? local282 : arg4;
						local247 = arg2 <= local277 ? arg2 : local277;
					}
					if (!local26.aBoolean33 || local156 < local251 && local158 < local247) {
						@Pc(538) int local538;
						@Pc(554) int local554;
						@Pc(570) int local570;
						@Pc(479) int local479;
						@Pc(497) int local497;
						@Pc(501) int local501;
						@Pc(527) int local527;
						@Pc(452) int local452;
						if (local26.anInt612 != 0) {
							if (local26.anInt612 == 1337 || local26.anInt612 == 1403) {
								Static267.anInt3572 = local111;
								Static221.aClass22_18 = local26;
								Static218.anInt5375 = local106;
								Static244.method3719(local26.anInt602, local26.anInt612 == 1403, local111, local106, local26.anInt546);
								Static222.aBooleanArray20[local50] = true;
								if (Static178.aBoolean216) {
									Static186.method2963(arg5, arg1, arg4, arg2);
								} else {
									Static166.method2622(arg5, arg1, arg4, arg2);
								}
								continue;
							}
							if (local26.anInt612 == 1338) {
								if (!local26.method465()) {
									continue;
								}
								Static90.method1440(local106, local111, local26, local50);
								if (Static178.aBoolean216) {
									Static186.method2963(arg5, arg1, arg4, arg2);
								} else {
									Static166.method2622(arg5, arg1, arg4, arg2);
								}
								if (Static47.anInt949 != 0 && Static47.anInt949 != 3 || Static142.aBoolean192 || local156 > Static273.anInt1118 || Static105.anInt2256 < local158 || local251 <= Static273.anInt1118 || Static105.anInt2256 >= local247) {
									continue;
								}
								local282 = Static273.anInt1118 - local106;
								local277 = Static105.anInt2256 - local111;
								local452 = local26.anIntArray52[local277];
								if (local452 > local282 || local452 + local26.anIntArray60[local277] < local282) {
									continue;
								}
								local479 = (int) Static270.aFloat49 + Static113.anInt2470 & 0x7FF;
								local277 -= local26.anInt602 / 2;
								local282 -= local26.anInt546 / 2;
								local497 = Class131.anIntArray355[local479];
								local501 = Class131.anIntArray353[local479];
								local501 = local501 * (Static44.anInt879 + 256) >> 8;
								local497 = (Static44.anInt879 + 256) * local497 >> 8;
								local527 = local501 * local282 + local277 * local497 >> 11;
								local538 = local501 * local277 - local497 * local282 >> 11;
								local554 = local527 + Static239.aClass12_Sub3_Sub2_2.anInt4141 - (Static239.aClass12_Sub3_Sub2_2.method3375() + -1) * 64 >> 7;
								local570 = Static239.aClass12_Sub3_Sub2_2.anInt4113 + 64 - local538 - Static239.aClass12_Sub3_Sub2_2.method3375() * 64 >> 7;
								if (Static26.aBoolean30 && (Static112.anInt2457 & 0x40) != 0) {
									@Pc(609) Class22 local609 = Static172.method2702(Static52.anInt1044, Static161.anInt3204);
									if (local609 == null) {
										Static66.method1016();
									} else {
										Static66.method1015(local570, (short) 26, 1L, " ->", local554, Static105.anInt2258, Static235.aString155);
									}
									continue;
								}
								if (Static132.anInt2784 == 1) {
									Static66.method1015(local570, (short) 10, 1L, "", local554, -1, Static129.aString84);
								}
								Static66.method1015(local570, (short) 5, 1L, "", local554, -1, Static217.aString138);
								continue;
							}
							if (local26.anInt612 == 1339) {
								if (local26.method465()) {
									Static245.method3747(local111, local106, local26, local50);
									if (Static178.aBoolean216) {
										Static186.method2963(arg5, arg1, arg4, arg2);
									} else {
										Static166.method2622(arg5, arg1, arg4, arg2);
									}
								}
								continue;
							}
							if (local26.anInt612 == 1400) {
								Static296.method1372(local111, local26.anInt546, local26.anInt602, local106);
								Static222.aBooleanArray20[local50] = true;
								Static72.aBooleanArray11[local50] = true;
								if (Static178.aBoolean216) {
									Static186.method2963(arg5, arg1, arg4, arg2);
								} else {
									Static166.method2622(arg5, arg1, arg4, arg2);
								}
								continue;
							}
							if (local26.anInt612 == 1401) {
								Static77.method1207(local26.anInt602, local111, local106, local26.anInt546);
								Static222.aBooleanArray20[local50] = true;
								Static72.aBooleanArray11[local50] = true;
								if (Static178.aBoolean216) {
									Static186.method2963(arg5, arg1, arg4, arg2);
								} else {
									Static166.method2622(arg5, arg1, arg4, arg2);
								}
								continue;
							}
							if (local26.anInt612 == 1402) {
								if (!Static178.aBoolean216) {
									Static179.method2820(local106, local111);
									Static222.aBooleanArray20[local50] = true;
									Static72.aBooleanArray11[local50] = true;
								}
								continue;
							}
							if (local26.anInt612 == 1405) {
								if (!Static131.aBoolean184) {
									continue;
								}
								local277 = local111 + 15;
								local282 = local26.anInt546 + local106;
								Static49.aClass4_Sub2_Sub12_1.method4186("Fps:" + Static85.anInt1723, local282, local277, 16776960, -1);
								@Pc(789) Runtime local789 = Runtime.getRuntime();
								local277 += 15;
								local497 = 16776960;
								local479 = (int) ((local789.totalMemory() - local789.freeMemory()) / 1024L);
								if (local479 > 65536) {
									local497 = 16711680;
								}
								Static49.aClass4_Sub2_Sub12_1.method4186("Mem:" + local479 + "k", local282, local277, local497, -1);
								local277 += 15;
								if (Static178.aBoolean216) {
									local497 = 16776960;
									local501 = (Static163.anInt3219 + Static163.anInt3220 + Static163.anInt3221) / 1024;
									if (local501 > 65536) {
										local497 = 16711680;
									}
									Static49.aClass4_Sub2_Sub12_1.method4186("Card:" + local501 + "k", local282, local277, local497, -1);
									local277 += 15;
								}
								local501 = 0;
								local527 = 0;
								local538 = 0;
								for (local554 = 0; local554 < 29; local554++) {
									local501 += Static165.aClass153_Sub1Array1[local554].method3914();
									local527 += Static165.aClass153_Sub1Array1[local554].method3922();
									local538 += Static165.aClass153_Sub1Array1[local554].method3918();
								}
								local554 = local538 * 100 / local501;
								local570 = local527 * 10000 / local501;
								@Pc(934) String local934 = "Cache:" + Static185.method2904((long) local570, 0, 2, true) + "% (" + local554 + "%)";
								Static79.aClass4_Sub2_Sub12_2.method4186(local934, local282, local277, 16776960, -1);
								local277 += 12;
								Static222.aBooleanArray20[local50] = true;
								Static72.aBooleanArray11[local50] = true;
								continue;
							}
							if (local26.anInt612 == 1406) {
								Static14.aClass22_9 = local26;
								Static94.anInt1945 = local111;
								Static40.anInt849 = local106;
								continue;
							}
						}
						if (!Static142.aBoolean192) {
							if (local26.anInt542 == 0 && local26.aBoolean39 && Static273.anInt1118 >= local156 && local158 <= Static105.anInt2256 && Static273.anInt1118 < local251 && local247 > Static105.anInt2256 && !Static255.aBoolean311) {
								Static196.anIntArray322[0] = Static240.anInt5014;
								Static299.aShortArray93[0] = 1007;
								Static60.anInt1152 = 1;
								Static261.aStringArray34[0] = Static129.aString86;
								Static35.aStringArray7[0] = "";
							}
							if (local156 <= Static273.anInt1118 && Static105.anInt2256 >= local158 && Static273.anInt1118 < local251 && local247 > Static105.anInt2256) {
								Static238.method3674(Static273.anInt1118 - local106, local26, Static105.anInt2256 - local111);
							}
						}
						if (local26.anInt542 == 0) {
							if (!local26.aBoolean33 && Static40.method675(local26) && Static126.aClass22_12 != local26) {
								continue;
							}
							if (!local26.aBoolean33) {
								if (local26.anInt583 - local26.anInt602 < local26.anInt547) {
									local26.anInt547 = local26.anInt583 - local26.anInt602;
								}
								if (local26.anInt547 < 0) {
									local26.anInt547 = 0;
								}
							}
							if (Static178.aBoolean216 && local26.anInt612 == 1407) {
								Static58.method935(local106, local111, local26.anInt546, local26.anInt602);
							}
							method2436(local111 - local26.anInt547, local158, local247, local26.anInt596, local251, local156, local50, arg7, local106 - local26.anInt589);
							if (local26.aClass22Array1 != null) {
								method2436(local111 - local26.anInt547, local158, local247, local26.anInt596, local251, local156, local50, local26.aClass22Array1, local106 - local26.anInt589);
							}
							@Pc(1159) Class4_Sub10 local1159 = (Class4_Sub10) Static227.aClass97_16.method2360((long) local26.anInt596);
							if (local1159 != null) {
								if (local1159.anInt1029 == 0 && !Static142.aBoolean192 && local156 <= Static273.anInt1118 && Static105.anInt2256 >= local158 && Static273.anInt1118 < local251 && local247 > Static105.anInt2256 && !Static255.aBoolean311) {
									Static60.anInt1152 = 1;
									Static196.anIntArray322[0] = Static240.anInt5014;
									Static261.aStringArray34[0] = Static129.aString86;
									Static299.aShortArray93[0] = 1007;
									Static35.aStringArray7[0] = "";
								}
								Static298.method4386(local247, local111, local50, local158, local251, local1159.anInt1032, local156, local106);
							}
							if (Static178.aBoolean216 && local26.anInt612 == 1407) {
								Static58.method937();
							}
							if (Static178.aBoolean216) {
								Static186.method2963(arg5, arg1, arg4, arg2);
							} else {
								Static166.method2622(arg5, arg1, arg4, arg2);
								Static204.method3238();
							}
						}
						if (Static196.aBooleanArray17[local50] || Static14.anInt2092 > 1) {
							if (local26.anInt542 == 0 && !local26.aBoolean33 && local26.anInt602 < local26.anInt583) {
								Static69.method1048(local106 + local26.anInt546, local111, local26.anInt602, local26.anInt583, local26.anInt547);
							}
							if (local26.anInt542 != 1) {
								if (local26.anInt542 == 2) {
									local282 = 0;
									for (local277 = 0; local277 < local26.anInt634; local277++) {
										for (local452 = 0; local452 < local26.anInt600; local452++) {
											local479 = (local26.anInt611 + 32) * local452 + local106;
											local497 = local111 + local277 * (local26.anInt604 + 32);
											if (local282 < 20) {
												local497 += local26.anIntArray65[local282];
												local479 += local26.anIntArray51[local282];
											}
											if (local26.anIntArray63[local282] > 0) {
												local538 = local26.anIntArray63[local282] - 1;
												if (local479 + 32 > arg5 && local479 < arg4 && arg1 < local497 + 32 && local497 < arg2 || local26 == Static24.aClass22_2 && local282 == Static65.anInt1223) {
													@Pc(1450) Class4_Sub2_Sub1 local1450;
													if (Static216.anInt4288 == 1 && Static294.anInt4283 == local282 && local26.anInt596 == Static3.anInt65) {
														local1450 = Static146.method2353(0, 2, local538, local26.aBoolean45, null, local26.anIntArray56[local282]);
													} else {
														local1450 = Static146.method2353(3153952, 1, local538, local26.aBoolean45, null, local26.anIntArray56[local282]);
													}
													if (Static204.aBoolean262) {
														Static222.aBooleanArray20[local50] = true;
													}
													if (local1450 == null) {
														Static81.method3274(local26);
													} else if (local26 == Static24.aClass22_2 && Static65.anInt1223 == local282) {
														local527 = Static117.anInt2589 - Static31.anInt635;
														if (local527 < 5 && local527 > -5) {
															local527 = 0;
														}
														local501 = Static72.anInt1326 - Static36.anInt715;
														if (local501 < 5 && local501 > -5) {
															local501 = 0;
														}
														if (Static34.anInt678 < 5) {
															local501 = 0;
															local527 = 0;
														}
														local1450.method3460(local479 + local501, local527 + local497, 128);
														if (arg3 != -1) {
															@Pc(1564) Class22 local1564 = arg7[arg3 & 0xFFFF];
															@Pc(1568) int local1568;
															@Pc(1570) int local1570;
															if (Static178.aBoolean216) {
																local1568 = Static186.anInt3729;
																local1570 = Static186.anInt3730;
															} else {
																local1568 = Static166.anInt3303;
																local1570 = Static166.anInt3304;
															}
															@Pc(1596) int local1596;
															if (local527 + local497 < local1568 && local1564.anInt547 > 0) {
																local1596 = Static16.anInt307 * (local1568 - local497 - local527) / 3;
																if (local1596 > Static16.anInt307 * 10) {
																	local1596 = Static16.anInt307 * 10;
																}
																if (local1564.anInt547 < local1596) {
																	local1596 = local1564.anInt547;
																}
																local1564.anInt547 -= local1596;
																Static31.anInt635 += local1596;
																Static81.method3274(local1564);
															}
															if (local1570 < local497 + local527 + 32 && local1564.anInt583 - local1564.anInt602 > local1564.anInt547) {
																local1596 = Static16.anInt307 * (local497 + local527 + 32 - local1570) / 3;
																if (Static16.anInt307 * 10 < local1596) {
																	local1596 = Static16.anInt307 * 10;
																}
																if (local1564.anInt583 - local1564.anInt602 - local1564.anInt547 < local1596) {
																	local1596 = local1564.anInt583 - local1564.anInt602 - local1564.anInt547;
																}
																local1564.anInt547 += local1596;
																Static31.anInt635 -= local1596;
																Static81.method3274(local1564);
															}
														}
													} else if (Static287.aClass22_11 == local26 && Static79.anInt1518 == local282) {
														local1450.method3460(local479, local497, 128);
													} else {
														local1450.method3454(local479, local497);
													}
												}
											} else if (local26.anIntArray66 != null && local282 < 20) {
												@Pc(1352) Class4_Sub2_Sub1 local1352 = local26.method457(local282);
												if (local1352 != null) {
													local1352.method3454(local479, local497);
												} else if (Static80.aBoolean121) {
													Static81.method3274(local26);
												}
											}
											local282++;
										}
									}
								} else if (local26.anInt542 == 3) {
									if (Static254.method3834(local26)) {
										local282 = local26.anInt619;
										if (Static126.aClass22_12 == local26 && local26.anInt626 != 0) {
											local282 = local26.anInt626;
										}
									} else {
										local282 = local26.anInt585;
										if (local26 == Static126.aClass22_12 && local26.anInt620 != 0) {
											local282 = local26.anInt620;
										}
									}
									if (local114 == 0) {
										if (local26.aBoolean42) {
											if (Static178.aBoolean216) {
												Static186.method2968(local106, local111, local26.anInt546, local26.anInt602, local282);
											} else {
												Static166.method2627(local106, local111, local26.anInt546, local26.anInt602, local282);
											}
										} else if (Static178.aBoolean216) {
											Static186.method2970(local106, local111, local26.anInt546, local26.anInt602, local282);
										} else {
											Static166.method2614(local106, local111, local26.anInt546, local26.anInt602, local282);
										}
									} else if (local26.aBoolean42) {
										if (Static178.aBoolean216) {
											Static186.method2954(local106, local111, local26.anInt546, local26.anInt602, local282, 256 - (local114 & 0xFF));
										} else {
											Static166.method2616(local106, local111, local26.anInt546, local26.anInt602, local282, 256 - (local114 & 0xFF));
										}
									} else if (Static178.aBoolean216) {
										Static186.method2955(local106, local111, local26.anInt546, local26.anInt602, local282, 256 - (local114 & 0xFF));
									} else {
										Static166.method2612(local106, local111, local26.anInt546, local26.anInt602, local282, 256 - (local114 & 0xFF));
									}
								} else {
									@Pc(1905) Class4_Sub2_Sub12 local1905;
									if (local26.anInt542 == 4) {
										local1905 = local26.method468(Static88.aClass59Array2);
										if (local1905 != null) {
											@Pc(1920) String local1920 = local26.aString10;
											if (Static254.method3834(local26)) {
												local277 = local26.anInt619;
												if (Static126.aClass22_12 == local26 && local26.anInt626 != 0) {
													local277 = local26.anInt626;
												}
												if (local26.aString13.length() > 0) {
													local1920 = local26.aString13;
												}
											} else {
												local277 = local26.anInt585;
												if (Static126.aClass22_12 == local26 && local26.anInt620 != 0) {
													local277 = local26.anInt620;
												}
											}
											if (local26.aBoolean33 && local26.anInt553 != -1) {
												@Pc(1976) Class163 local1976 = Static277.method4117(local26.anInt553);
												local1920 = local1976.aString169;
												if (local1920 == null) {
													local1920 = "null";
												}
												if ((local1976.anInt4887 == 1 || local26.anInt567 != 1) && local26.anInt567 != -1) {
													local1920 = "<col=ff9040>" + local1920 + "</col> x" + Static15.method264(local26.anInt567);
												}
											}
											if (Static32.aClass22_4 == local26) {
												local277 = local26.anInt585;
												local1920 = Static191.aString179;
											}
											if (!local26.aBoolean33) {
												local1920 = Static103.method1660(local1920, local26);
											}
											local1905.method4198(local1920, local106, local111, local26.anInt546, local26.anInt602, local277, local26.aBoolean44 ? 0 : -1, local26.anInt564, local26.anInt603, local26.anInt557);
										} else if (Static80.aBoolean121) {
											Static81.method3274(local26);
										}
									} else if (local26.anInt542 == 5) {
										@Pc(2074) Class4_Sub2_Sub1 local2074;
										if (!local26.aBoolean33) {
											local2074 = local26.method461(Static254.method3834(local26));
											if (local2074 != null) {
												local2074.method3454(local106, local111);
											} else if (Static80.aBoolean121) {
												Static81.method3274(local26);
											}
										} else if (local26.anInt579 >= 0) {
											@Pc(2588) Class178 local2588 = local26.method463();
											if (Static178.aBoolean216) {
												local2588.method4285(0, local106, local111, local26.anInt546, local26.anInt602, local26.anInt562, local26.anInt601, 0);
											} else {
												local2588.method4287(0, local106, local111, local26.anInt546, local26.anInt602, local26.anInt562, local26.anInt601);
											}
										} else {
											if (local26.anInt553 == -1) {
												local2074 = local26.method461(false);
											} else if (local26.aBoolean43 && Static239.aClass12_Sub3_Sub2_2.aClass143_1 != null) {
												local2074 = Static146.method2353(local26.anInt543, local26.anInt581, local26.anInt553, local26.aBoolean45, Static239.aClass12_Sub3_Sub2_2.aClass143_1, local26.anInt567);
											} else {
												local2074 = Static146.method2353(local26.anInt543, local26.anInt581, local26.anInt553, local26.aBoolean45, null, local26.anInt567);
											}
											if (local2074 != null) {
												local277 = local2074.anInt4300;
												local452 = local2074.anInt4305;
												if (local26.aBoolean38) {
													local497 = (local452 + local26.anInt602 - 1) / local452;
													local479 = (local26.anInt546 + local277 - 1) / local277;
													if (Static178.aBoolean216) {
														Static186.method2964(local106, local111, local26.anInt546 + local106, local111 - -local26.anInt602);
														@Pc(2387) boolean local2387 = Static299.method4399(local2074.anInt4301);
														@Pc(2390) Class4_Sub2_Sub1_Sub2 local2390 = (Class4_Sub2_Sub1_Sub2) local2074;
														@Pc(2395) boolean local2395 = Static299.method4399(local2074.anInt4308);
														if (local2387 && local2395) {
															if (local114 == 0) {
																local2390.method2585(local106, local111, local479, local497);
															} else {
																local2390.method2588(local106, local111, 256 - (local114 & 0xFF), local479, local497);
															}
														} else if (local2387) {
															for (local554 = 0; local554 < local497; local554++) {
																if (local114 == 0) {
																	local2390.method2585(local106, local111 + local452 * local554, local479, 1);
																} else {
																	local2390.method2588(local106, local554 * local452 + local111, 256 - (local114 & 0xFF), local479, 1);
																}
															}
														} else if (local2395) {
															for (local554 = 0; local554 < local479; local554++) {
																if (local114 == 0) {
																	local2390.method2585(local106 + local277 * local554, local111, 1, local497);
																} else {
																	local2390.method2588(local106 + local277 * local554, local111, 256 - (local114 & 0xFF), 1, local497);
																}
															}
														} else {
															for (local554 = 0; local554 < local479; local554++) {
																for (local570 = 0; local570 < local497; local570++) {
																	if (local114 == 0) {
																		local2074.method3454(local277 * local554 + local106, local570 * local452 + local111);
																	} else {
																		local2074.method3460(local277 * local554 + local106, local570 * local452 + local111, 256 - (local114 & 0xFF));
																	}
																}
															}
														}
														Static186.method2963(arg5, arg1, arg4, arg2);
													} else {
														Static166.method2617(local106, local111, local106 + local26.anInt546, local111 - -local26.anInt602);
														for (local501 = 0; local501 < local479; local501++) {
															for (local527 = 0; local527 < local497; local527++) {
																if (local26.anInt560 != 0) {
																	local2074.method3458(local277 / 2 + local106 + local277 * local501, local452 / 2 + local111 - -(local527 * local452), 4096, local26.anInt560);
																} else if (local114 == 0) {
																	local2074.method3454(local106 + local277 * local501, local111 - -(local452 * local527));
																} else {
																	local2074.method3460(local106 + local501 * local277, local452 * local527 + local111, 256 - (local114 & 0xFF));
																}
															}
														}
														Static166.method2622(arg5, arg1, arg4, arg2);
													}
												} else {
													local479 = local26.anInt546 * 4096 / local277;
													if (local26.anInt560 != 0) {
														local2074.method3458(local26.anInt546 / 2 + local106, local26.anInt602 / 2 + local111, local479, local26.anInt560);
													} else if (local114 != 0) {
														local2074.method3464(local106, local111, local26.anInt546, local26.anInt602, 256 - (local114 & 0xFF));
													} else if (local26.anInt546 == local277 && local452 == local26.anInt602) {
														local2074.method3454(local106, local111);
													} else {
														local2074.method3462(local106, local111, local26.anInt546, local26.anInt602);
													}
												}
											} else if (Static80.aBoolean121) {
												Static81.method3274(local26);
											}
										}
									} else {
										@Pc(2656) Class163 local2656;
										if (local26.anInt542 == 6) {
											@Pc(2631) boolean local2631 = Static254.method3834(local26);
											if (local2631) {
												local277 = local26.anInt591;
											} else {
												local277 = local26.anInt622;
											}
											@Pc(2643) Class12_Sub2 local2643 = null;
											local479 = 0;
											if (local26.anInt553 != -1) {
												local2656 = Static277.method4117(local26.anInt553);
												if (local2656 != null) {
													local2656 = local2656.method3893(local26.anInt567);
													@Pc(2675) Class141 local2675 = local277 == -1 ? null : Static296.method1376(local277);
													if (local26.aBoolean43 && Static239.aClass12_Sub3_Sub2_2.aClass143_1 != null) {
														local2643 = local2656.method3898(local26.anInt576, local26.anInt632, Static239.aClass12_Sub3_Sub2_2.aClass143_1, local2675, local26.anInt578, 1);
													} else {
														local2643 = local2656.method3898(local26.anInt576, local26.anInt632, null, local2675, local26.anInt578, 1);
													}
													if (local2643 == null) {
														Static81.method3274(local26);
													} else {
														local479 = -local2643.method3355() / 2;
													}
												}
											} else if (local26.anInt628 == 5) {
												if (local26.anInt572 == -1) {
													local2643 = Static247.aClass143_2.method3570(null, null, 0, -1, -1, -1, null, -1, 0);
												} else {
													local497 = local26.anInt572 & 0x7FF;
													if (Static238.anInt4597 == local497) {
														local497 = 2047;
													}
													@Pc(2750) Class12_Sub3_Sub2 local2750 = Static257.aClass12_Sub3_Sub2Array1[local497];
													@Pc(2760) Class141 local2760 = local277 == -1 ? null : Static296.method1376(local277);
													if (local2750 != null && (int) Static34.method491(local2750.aString132) << 11 == (local26.anInt572 & 0xFFFFF800)) {
														local2643 = local2750.aClass143_1.method3570(null, null, 0, local26.anInt632, -1, 0, local2760, -1, 0);
													}
												}
											} else if (local277 == -1) {
												local2643 = local26.method467(-1, local2631, Static239.aClass12_Sub3_Sub2_2.aClass143_1, 0, -1, null);
												if (local2643 == null && Static80.aBoolean121) {
													Static81.method3274(local26);
												}
											} else {
												@Pc(2843) Class141 local2843 = Static296.method1376(local277);
												local2643 = local26.method467(local26.anInt632, local2631, Static239.aClass12_Sub3_Sub2_2.aClass143_1, local26.anInt578, local26.anInt576, local2843);
												if (local2643 == null && Static80.aBoolean121) {
													Static81.method3274(local26);
												}
											}
											if (local2643 != null) {
												if (local26.anInt606 > 0) {
													local501 = (local26.anInt602 << 8) / local26.anInt606;
												} else {
													local501 = 256;
												}
												if (local26.anInt570 <= 0) {
													local497 = 256;
												} else {
													local497 = (local26.anInt546 << 8) / local26.anInt570;
												}
												local527 = local26.anInt546 / 2 + local106 + (local497 * local26.anInt607 >> 8);
												local538 = local26.anInt602 / 2 + local111 + (local501 * local26.anInt615 >> 8);
												if (Static178.aBoolean216) {
													if (local26.aBoolean36) {
														Static178.method2770(local527, local538, local26.anInt623, local26.aShort2, local497, local501);
													} else {
														Static178.method2749(local527, local538, local497, local501);
														Static178.method2775((float) local26.aShort1, (float) local26.aShort2 * 1.5F);
													}
													Static178.method2757();
													Static178.method2751(true);
													Static178.method2772(false);
													Static33.method484(Static165.anInt3301);
													if (Static272.aBoolean337) {
														Static186.method2957();
														Static178.method2781();
														Static186.method2963(arg5, arg1, arg4, arg2);
														Static272.aBoolean337 = false;
													}
													if (local26.aBoolean40) {
														Static178.method2784();
													}
													local554 = local26.anInt623 * Class131.anIntArray355[local26.anInt621] >> 16;
													local570 = local26.anInt623 * Class131.anIntArray353[local26.anInt621] >> 16;
													if (local26.aBoolean33) {
														local2643.method3163(local26.anInt617, local26.anInt566, local26.anInt621, local26.anInt613, local479 + local554 + local26.anInt584, local570 + local26.anInt584, -1L);
													} else {
														local2643.method3163(local26.anInt617, 0, local26.anInt621, 0, local554, local570, -1L);
													}
													if (local26.aBoolean40) {
														Static178.method2748();
													}
												} else {
													Static204.method3218(local527, local538);
													local554 = local26.anInt623 * Class131.anIntArray355[local26.anInt621] >> 16;
													local570 = local26.anInt623 * Class131.anIntArray353[local26.anInt621] >> 16;
													if (!local26.aBoolean33) {
														local2643.method3163(local26.anInt617, 0, local26.anInt621, 0, local554, local570, -1L);
													} else if (local26.aBoolean36) {
														((Class12_Sub2_Sub1) local2643).method604(local26.anInt617, local26.anInt566, local26.anInt621, local26.anInt613, local26.anInt584 + local479 + local554, local570 - -local26.anInt584, local26.anInt623);
													} else {
														local2643.method3163(local26.anInt617, local26.anInt566, local26.anInt621, local26.anInt613, local479 + local554 + local26.anInt584, local570 + local26.anInt584, -1L);
													}
													Static204.method3219();
												}
											}
										} else {
											if (local26.anInt542 == 7) {
												local1905 = local26.method468(Static88.aClass59Array2);
												if (local1905 == null) {
													if (Static80.aBoolean121) {
														Static81.method3274(local26);
													}
													continue;
												}
												local277 = 0;
												for (local452 = 0; local452 < local26.anInt634; local452++) {
													for (local479 = 0; local479 < local26.anInt600; local479++) {
														if (local26.anIntArray63[local277] > 0) {
															local2656 = Static277.method4117(local26.anIntArray63[local277] - 1);
															@Pc(3226) String local3226;
															if (local2656.anInt4887 != 1 && local26.anIntArray56[local277] == 1) {
																local3226 = "<col=ff9040>" + local2656.aString169 + "</col>";
															} else {
																local3226 = "<col=ff9040>" + local2656.aString169 + "</col> x" + Static15.method264(local26.anIntArray56[local277]);
															}
															local527 = local106 + (local26.anInt611 + 115) * local479;
															local538 = local452 * (local26.anInt604 + 12) + local111;
															if (local26.anInt564 == 0) {
																local1905.method4173(local3226, local527, local538, local26.anInt585, local26.aBoolean44 ? 0 : -1);
															} else if (local26.anInt564 == 1) {
																local1905.method4179(local3226, local527 + 57, local538, local26.anInt585, local26.aBoolean44 ? 0 : -1);
															} else {
																local1905.method4186(local3226, local527 + 114, local538, local26.anInt585, local26.aBoolean44 ? 0 : -1);
															}
														}
														local277++;
													}
												}
											}
											if (local26.anInt542 == 8 && Static41.aClass22_5 == local26 && Static278.anInt5194 == Static201.anInt3923) {
												local282 = 0;
												local277 = 0;
												@Pc(3348) Class4_Sub2_Sub12 local3348 = Static49.aClass4_Sub2_Sub12_1;
												@Pc(3351) String local3351 = local26.aString10;
												local3351 = Static103.method1660(local3351, local26);
												@Pc(3371) String local3371;
												while (local3351.length() > 0) {
													local501 = local3351.indexOf("<br>");
													if (local501 == -1) {
														local3371 = local3351;
														local3351 = "";
													} else {
														local3371 = local3351.substring(0, local501);
														local3351 = local3351.substring(local501 + 4);
													}
													local527 = local3348.method4195(local3371);
													local277 += local3348.anInt5274 + 1;
													if (local282 < local527) {
														local282 = local527;
													}
												}
												local282 += 6;
												local277 += 7;
												local501 = local26.anInt546 + local106 - local282 - 5;
												if (local106 + 5 > local501) {
													local501 = local106 + 5;
												}
												if (local501 + local282 > arg4) {
													local501 = arg4 - local282;
												}
												local527 = local26.anInt602 + local111 + 5;
												if (arg2 < local527 + local277) {
													local527 = arg2 - local277;
												}
												if (Static178.aBoolean216) {
													Static186.method2968(local501, local527, local282, local277, 16777120);
													Static186.method2970(local501, local527, local282, local277, 0);
												} else {
													Static166.method2627(local501, local527, local282, local277, 16777120);
													Static166.method2614(local501, local527, local282, local277, 0);
												}
												local538 = local3348.anInt5274 + local527 + 2;
												local3351 = local26.aString10;
												local3351 = Static103.method1660(local3351, local26);
												while (local3351.length() > 0) {
													local554 = local3351.indexOf("<br>");
													if (local554 == -1) {
														local3371 = local3351;
														local3351 = "";
													} else {
														local3371 = local3351.substring(0, local554);
														local3351 = local3351.substring(local554 + 4);
													}
													local3348.method4173(local3371, local501 + 3, local538, 0, -1);
													local538 += local3348.anInt5274 + 1;
												}
											}
											if (local26.anInt542 == 9) {
												if (local26.aBoolean46) {
													local452 = local106 + local26.anInt546;
													local277 = local26.anInt602 + local111;
													local479 = local111;
												} else {
													local452 = local106 + local26.anInt546;
													local277 = local111;
													local479 = local111 + local26.anInt602;
												}
												if (local26.anInt614 == 1) {
													if (Static178.aBoolean216) {
														Static186.method2959(local106, local277, local452, local479, local26.anInt585);
													} else {
														Static166.method2620(local106, local277, local452, local479, local26.anInt585);
													}
												} else if (Static178.aBoolean216) {
													Static186.method2958(local106, local277, local452, local479, local26.anInt585, local26.anInt614);
												} else {
													Static166.method2611(local106, local277, local452, local479, local26.anInt585, local26.anInt614);
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

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
	public static void method2437() {
		anIntArray284 = null;
	}
}
