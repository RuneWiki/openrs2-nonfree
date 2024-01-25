import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public static int anInt1025;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!tj;")
	public static Class193 aClass193_11;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "[I")
	public static final int[] anIntArray47 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public static int anInt1027 = -1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([[BZ[[IIILclient!uh;[[B[[BILclient!vq;Lclient!uh;[[BI)V")
	public static void method758(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class60 arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class47 arg9, @OriginalArg(10) Class60 arg10, @OriginalArg(11) byte[][] arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg3; local3++) {
			@Pc(16) int local16 = arg3 - 1 > local3 ? local3 + 1 : local3;
			for (@Pc(18) int local18 = 0; local18 < arg4; local18++) {
				@Pc(31) int local31 = local18 >= arg4 - 1 ? local18 : local18 + 1;
				if (Static76.method1750() || Static210.method3895(arg8, local18, local3, Static263.anInt6816)) {
					@Pc(45) boolean local45 = false;
					@Pc(47) boolean local47 = false;
					@Pc(50) boolean[] local50 = new boolean[4];
					@Pc(56) int local56 = arg7[local3][local18];
					@Pc(62) int local62 = arg6[local3][local18];
					@Pc(70) int local70 = arg11[local3][local18] & 0xFF;
					@Pc(78) int local78 = arg0[local3][local18] & 0xFF;
					@Pc(86) int local86 = arg0[local3][local31] & 0xFF;
					@Pc(94) int local94 = arg0[local16][local31] & 0xFF;
					@Pc(102) int local102 = arg0[local16][local18] & 0xFF;
					if (local70 != 0 || local78 != 0) {
						@Pc(116) Class121 local116 = local70 == 0 ? null : Static293.method3948(local70 - 1);
						@Pc(126) Class156 local126 = local78 == 0 ? null : Static183.method3514(local78 - 1);
						if (local56 == 0 && local116 == null) {
							local56 = 12;
						}
						@Pc(134) Class121 local134 = local116;
						if (local116 != null) {
							if (local116.anInt3843 == -1 && local116.anInt3840 == -1) {
								local134 = local116;
								local116 = null;
							} else if (local126 != null && local56 != 0) {
								local47 = local116.aBoolean299;
							}
						}
						@Pc(209) int local209;
						@Pc(277) int local277;
						@Pc(331) int local331;
						@Pc(341) int local341;
						if ((local56 == 0 || local56 == 12) && local3 > 0 && local18 > 0 && arg3 > local3 && local18 < arg4) {
							local209 = arg0[local3 - 1][local18 - 1] == local78 ? 1 : -1;
							@Pc(230) int local230 = arg0[local16][local18 - 1] == local78 ? 1 : -1;
							@Pc(243) int local243 = arg0[local16][local31] == local78 ? 1 : -1;
							if (arg0[local3][local18 - 1] == local78) {
								local209++;
								local230++;
							} else {
								local209--;
								local230--;
							}
							local277 = arg0[local3 - 1][local31] == local78 ? 1 : -1;
							if (arg0[local16][local18] == local78) {
								local243++;
								local230++;
							} else {
								local243--;
								local230--;
							}
							if (arg0[local3][local31] == local78) {
								local243++;
								local277++;
							} else {
								local243--;
								local277--;
							}
							if (arg0[local3 - 1][local18] == local78) {
								local209++;
								local277++;
							} else {
								local209--;
								local277--;
							}
							local331 = local209 - local243;
							if (local331 < 0) {
								local331 = -local331;
							}
							local341 = local230 - local277;
							if (local341 < 0) {
								local341 = -local341;
							}
							if (local341 == local331) {
								local331 = arg5.method2264(local3, local18) - arg5.method2264(local16, local31);
								if (local331 < 0) {
									local331 = -local331;
								}
								local341 = arg5.method2264(local16, local18) - arg5.method2264(local3, local31);
								if (local341 < 0) {
									local341 = -local341;
								}
							}
							local62 = local331 < local341 ? 1 : 0;
						}
						for (local209 = 0; local209 < 13; local209++) {
							Static331.anIntArray488[local209] = -1;
							Static139.anIntArray277[local209] = 1;
						}
						@Pc(426) boolean[] local426 = local116 != null && local116.aBoolean299 ? Static72.aBooleanArrayArray3[local56] : Static157.aBooleanArrayArray4[local56];
						Static181.method3483(local50, arg11, arg4, local3, local18, arg6, local116, arg3, local56, arg7, local62, local126, arg9);
						@Pc(452) boolean local452 = local116 != null && local116.anInt3843 != local116.anInt3840;
						if (!local452) {
							for (local277 = 0; local277 < 8; local277++) {
								if (Static331.anIntArray488[local277] >= 0 && Static356.anIntArray513[local277] != Static234.anIntArray393[local277]) {
									local452 = true;
									break;
								}
							}
						}
						if (!local426[local62 + 1 & 0x3]) {
							local50[1] = Static152.method3019(local50[1], (Static139.anIntArray277[4] & Static139.anIntArray277[2]) == 0);
						}
						if (!local426[local62 + 3 & 0x3]) {
							local50[3] = Static152.method3019(local50[3], (Static139.anIntArray277[0] & Static139.anIntArray277[6]) == 0);
						}
						if (!local426[local62 & 0x3]) {
							local50[0] = Static152.method3019(local50[0], (Static139.anIntArray277[0] & Static139.anIntArray277[2]) == 0);
						}
						if (!local426[local62 + 2 & 0x3]) {
							local50[2] = Static152.method3019(local50[2], (Static139.anIntArray277[6] & Static139.anIntArray277[4]) == 0);
						}
						if (!local47 && (local56 == 0 || local56 == 12)) {
							if (local50[0] && !local50[1] && !local50[2] && local50[3]) {
								local56 = local56 == 0 ? 13 : 14;
								local50[0] = local50[3] = false;
								local62 = 0;
							} else if (local50[0] && local50[1] && !local50[2] && !local50[3]) {
								local62 = 3;
								local50[0] = local50[1] = false;
								local56 = local56 == 0 ? 13 : 14;
							} else if (!local50[0] && local50[1] && local50[2] && !local50[3]) {
								local56 = local56 == 0 ? 13 : 14;
								local50[1] = local50[2] = false;
								local62 = 2;
							} else if (!local50[0] && !local50[1] && local50[2] && local50[3]) {
								local56 = local56 == 0 ? 13 : 14;
								local50[2] = local50[3] = false;
								local62 = 1;
							}
						}
						@Pc(755) boolean local755 = !local47 && !local50[0] && !local50[2] && !local50[1] && !local50[3];
						@Pc(757) int[] local757 = null;
						@Pc(777) int[] local777;
						@Pc(789) int[] local789;
						@Pc(773) int[] local773;
						if (local755) {
							local341 = local116 == null ? 0 : Static189.anIntArray336[local56];
							local777 = Static220.anIntArrayArray181[local56];
							local331 = local126 == null ? 0 : Static253.anIntArray422[local56];
							local773 = Static224.anIntArrayArray125[local56];
							local789 = Static304.anIntArrayArray162[local56];
						} else if (local47) {
							local341 = local116 == null ? 0 : Static46.anIntArray54[local56];
							local773 = Static67.anIntArrayArray44[local56];
							local777 = Static201.anIntArrayArray107[local56];
							local331 = local126 == null ? 0 : Static98.anIntArray224[local56];
							local789 = Static91.anIntArrayArray164[local56];
							local757 = Static145.anIntArrayArray83[local56];
						} else {
							local757 = Static258.anIntArrayArray140[local56];
							local773 = Static332.anIntArrayArray177[local56];
							local341 = local116 == null ? 0 : Static253.anIntArray423[local56];
							local777 = Static289.anIntArrayArray157[local56];
							local331 = local126 == null ? 0 : Static329.anIntArray335[local56];
							local789 = Static106.anIntArrayArray71[local56];
						}
						@Pc(859) int local859 = local331 + local341;
						if (local859 <= 0) {
							Static269.method4620(arg8, local3, local18);
						} else {
							if (local50[0]) {
								local859++;
							}
							if (local50[2]) {
								local859++;
							}
							if (local50[1]) {
								local859++;
							}
							if (local50[3]) {
								local859++;
							}
							@Pc(892) int local892 = 0;
							@Pc(894) int local894 = 0;
							@Pc(898) int local898 = local859 * 3;
							@Pc(905) int[] local905 = arg1 ? new int[local898] : null;
							@Pc(912) int[] local912 = local452 ? new int[local898] : null;
							@Pc(915) int[] local915 = new int[local898];
							@Pc(918) int[] local918 = new int[local898];
							@Pc(921) int[] local921 = new int[local898];
							@Pc(924) int[] local924 = new int[local898];
							@Pc(927) int[] local927 = new int[local898];
							@Pc(929) int local929 = -1;
							@Pc(931) int local931 = -1;
							@Pc(933) int local933 = 256;
							@Pc(1029) byte local1029;
							@Pc(983) int local983;
							@Pc(985) int local985;
							@Pc(1212) int local1212;
							@Pc(1218) int local1218;
							@Pc(1227) int local1227;
							@Pc(1231) int local1231;
							@Pc(1235) int local1235;
							@Pc(1310) int local1310;
							@Pc(1318) int local1318;
							if (local116 != null) {
								local929 = local116.anInt3843;
								local931 = arg9.method2712() ? local116.anInt3837 : local116.anInt3842;
								local933 = local116.anInt3846;
								local983 = Static328.method5313(local116, arg9);
								for (local985 = 0; local985 < local341; local985++) {
									if (local50[-local62 & 0x3] && local892 == local757[0]) {
										Static330.anIntArray486[0] = local777[local892];
										Static330.anIntArray486[1] = 1;
										Static330.anIntArray486[2] = local773[local892];
										Static330.anIntArray486[3] = 1;
										Static330.anIntArray486[4] = local789[local892];
										local1029 = 6;
										Static330.anIntArray486[5] = local773[local892];
									} else if (local50[2 - local62 & 0x3] && local757[2] == local892) {
										Static330.anIntArray486[0] = local777[local892];
										Static330.anIntArray486[1] = 5;
										Static330.anIntArray486[2] = local773[local892];
										Static330.anIntArray486[3] = 5;
										Static330.anIntArray486[4] = local789[local892];
										Static330.anIntArray486[5] = local773[local892];
										local1029 = 6;
									} else if (local50[1 - local62 & 0x3] && local892 == local757[1]) {
										Static330.anIntArray486[0] = local777[local892];
										Static330.anIntArray486[1] = 3;
										Static330.anIntArray486[2] = local773[local892];
										Static330.anIntArray486[3] = 3;
										Static330.anIntArray486[4] = local789[local892];
										Static330.anIntArray486[5] = local773[local892];
										local1029 = 6;
									} else if (local50[3 - local62 & 0x3] && local892 == local757[3]) {
										Static330.anIntArray486[0] = local777[local892];
										Static330.anIntArray486[1] = 7;
										Static330.anIntArray486[2] = local773[local892];
										Static330.anIntArray486[3] = 7;
										Static330.anIntArray486[4] = local789[local892];
										local1029 = 6;
										Static330.anIntArray486[5] = local773[local892];
									} else {
										Static330.anIntArray486[0] = local777[local892];
										Static330.anIntArray486[1] = local789[local892];
										local1029 = 3;
										Static330.anIntArray486[2] = local773[local892];
									}
									local892++;
									for (local1212 = 0; local1212 < local1029; local1212++) {
										local1218 = Static330.anIntArray486[local1212];
										local1227 = local1218 - local62 * 2 & 0x7;
										local1231 = Static38.anIntArray46[local1218];
										local1235 = Static120.anIntArray247[local1218];
										if (local62 == 1) {
											local915[local894] = local1235;
											local918[local894] = 128 - local1231;
										} else if (local62 == 2) {
											local915[local894] = 128 - local1231;
											local918[local894] = 128 - local1235;
										} else if (local62 == 3) {
											local915[local894] = 128 - local1235;
											local918[local894] = local1231;
										} else {
											local915[local894] = local1231;
											local918[local894] = local1235;
										}
										if (arg1 && Static204.aBooleanArrayArray5[local56][local1218]) {
											local1310 = (local3 << 7) + local915[local894];
											local1318 = (local18 << 7) + local918[local894];
											local905[local894] = arg10.method2270(local1310, local1318) - arg5.method2270(local1310, local1318);
										}
										if (local1218 < 8 && Static331.anIntArray488[local1227] > local116.anInt3847) {
											if (local912 != null) {
												local912[local894] = Static234.anIntArray393[local1227];
											}
											local927[local894] = Static230.anIntArray484[local1227];
											local924[local894] = Static214.anIntArray120[local1227];
											local921[local894] = Static356.anIntArray513[local1227];
										} else {
											if (local912 != null) {
												local912[local894] = local983;
											}
											local924[local894] = arg9.method2712() ? local116.anInt3837 : local116.anInt3842;
											local927[local894] = local116.anInt3846;
											local921[local894] = local929;
										}
										local894++;
									}
								}
								if (!arg1 && arg8 == 0) {
									Static34.method710(local3, local18, local116.anInt3836, local116.anInt3838 * 8);
								}
								if (local56 != 12 && local116.anInt3843 != -1 && local116.aBoolean300) {
									local45 = true;
								}
							} else if (local755) {
								local892 = Static189.anIntArray336[local56];
							} else if (local47) {
								local892 = Static46.anIntArray54[local56];
							} else {
								local892 = Static253.anIntArray423[local56];
							}
							if (local126 != null) {
								if (local86 == 0) {
									local86 = local78;
								}
								if (local102 == 0) {
									local102 = local78;
								}
								if (local94 == 0) {
									local94 = local78;
								}
								@Pc(1459) Class156 local1459 = Static183.method3514(local78 - 1);
								@Pc(1465) Class156 local1465 = Static183.method3514(local86 - 1);
								@Pc(1471) Class156 local1471 = Static183.method3514(local94 - 1);
								@Pc(1477) Class156 local1477 = Static183.method3514(local102 - 1);
								for (local1227 = 0; local1227 < local331; local1227++) {
									if (local50[-local62 & 0x3] && local892 == local757[0]) {
										Static330.anIntArray486[0] = local777[local892];
										Static330.anIntArray486[1] = 1;
										Static330.anIntArray486[2] = local773[local892];
										Static330.anIntArray486[3] = 1;
										Static330.anIntArray486[4] = local789[local892];
										local1029 = 6;
										Static330.anIntArray486[5] = local773[local892];
									} else if (local50[2 - local62 & 0x3] && local892 == local757[2]) {
										Static330.anIntArray486[0] = local777[local892];
										Static330.anIntArray486[1] = 5;
										Static330.anIntArray486[2] = local773[local892];
										Static330.anIntArray486[3] = 5;
										Static330.anIntArray486[4] = local789[local892];
										Static330.anIntArray486[5] = local773[local892];
										local1029 = 6;
									} else if (local50[1 - local62 & 0x3] && local757[1] == local892) {
										Static330.anIntArray486[0] = local777[local892];
										Static330.anIntArray486[1] = 3;
										Static330.anIntArray486[2] = local773[local892];
										Static330.anIntArray486[3] = 3;
										Static330.anIntArray486[4] = local789[local892];
										Static330.anIntArray486[5] = local773[local892];
										local1029 = 6;
									} else if (local50[3 - local62 & 0x3] && local892 == local757[3]) {
										Static330.anIntArray486[0] = local777[local892];
										Static330.anIntArray486[1] = 7;
										Static330.anIntArray486[2] = local773[local892];
										Static330.anIntArray486[3] = 7;
										Static330.anIntArray486[4] = local789[local892];
										local1029 = 6;
										Static330.anIntArray486[5] = local773[local892];
									} else {
										Static330.anIntArray486[0] = local777[local892];
										Static330.anIntArray486[1] = local789[local892];
										Static330.anIntArray486[2] = local773[local892];
										local1029 = 3;
									}
									for (local1231 = 0; local1231 < local1029; local1231++) {
										local1235 = Static330.anIntArray486[local1231];
										local1310 = local1235 - local62 * 2 & 0x7;
										local1318 = Static38.anIntArray46[local1235];
										@Pc(1729) int local1729 = Static120.anIntArray247[local1235];
										@Pc(1734) int local1734;
										@Pc(1739) int local1739;
										if (local62 == 1) {
											local1734 = local1729;
											local1739 = 128 - local1318;
										} else if (local62 == 2) {
											local1734 = 128 - local1318;
											local1739 = 128 - local1729;
										} else if (local62 == 3) {
											local1739 = local1318;
											local1734 = 128 - local1729;
										} else {
											local1734 = local1318;
											local1739 = local1729;
										}
										local915[local894] = local1734;
										local918[local894] = local1739;
										@Pc(1793) int local1793;
										@Pc(1800) int local1800;
										if (arg1 && Static204.aBooleanArrayArray5[local56][local1235]) {
											local1793 = local1734 + (local3 << 7);
											local1800 = (local18 << 7) + local1739;
											local905[local894] = arg10.method2270(local1793, local1800) - arg5.method2270(local1793, local1800);
										}
										if (local1235 < 8 && Static331.anIntArray488[local1310] >= 0) {
											if (local912 != null) {
												local912[local894] = Static234.anIntArray393[local1310];
											}
											local927[local894] = Static230.anIntArray484[local1310];
											local924[local894] = Static214.anIntArray120[local1310];
											local921[local894] = Static356.anIntArray513[local1310];
										} else {
											if (local47 && Static204.aBooleanArrayArray5[local56][local1235]) {
												local924[local894] = local931;
												local927[local894] = local933;
												local921[local894] = local929;
											} else if (local1734 == 0 && local1739 == 0) {
												local921[local894] = arg2[local3][local18];
												local924[local894] = local1459.anInt4824;
												local927[local894] = local1459.anInt4818;
											} else if (local1734 == 0 && local1739 == 128) {
												local921[local894] = arg2[local3][local31];
												local924[local894] = local1465.anInt4824;
												local927[local894] = local1465.anInt4818;
											} else if (local1734 == 128 && local1739 == 128) {
												local921[local894] = arg2[local16][local31];
												local924[local894] = local1471.anInt4824;
												local927[local894] = local1471.anInt4818;
											} else if (local1734 == 128 && local1739 == 0) {
												local921[local894] = arg2[local16][local18];
												local924[local894] = local1477.anInt4824;
												local927[local894] = local1477.anInt4818;
											} else {
												if (local1734 >= 64) {
													if (local1739 >= 64) {
														local924[local894] = local1471.anInt4824;
														local927[local894] = local1471.anInt4818;
													} else {
														local924[local894] = local1477.anInt4824;
														local927[local894] = local1477.anInt4818;
													}
												} else if (local1739 < 64) {
													local924[local894] = local1459.anInt4824;
													local927[local894] = local1459.anInt4818;
												} else {
													local924[local894] = local1465.anInt4824;
													local927[local894] = local1465.anInt4818;
												}
												local1793 = Static19.method329(local1734 << 7 >> 7, arg2[local16][local18], arg2[local3][local18]);
												local1800 = Static19.method329(local1734 << 7 >> 7, arg2[local16][local31], arg2[local3][local31]);
												local921[local894] = Static19.method329(local1739 << 7 >> 7, local1800, local1793);
											}
											if (local912 != null) {
												local912[local894] = local921[local894];
											}
										}
										local894++;
									}
									local892++;
								}
								if (local56 != 0 && local126.aBoolean364) {
									local45 = true;
								}
							}
							local983 = arg5.method2264(local3, local18);
							local985 = arg5.method2264(local16, local18);
							local1212 = arg5.method2264(local16, local31);
							local1218 = arg5.method2264(local3, local31);
							if (arg8 > 0) {
								@Pc(2143) boolean local2143 = true;
								if (local78 == 0 && local56 != 0) {
									local2143 = false;
								}
								if (local70 > 0 && local134 != null && !local134.aBoolean301) {
									local2143 = false;
								}
								if (local2143 && local985 == local983 && local1212 == local983 && local983 == local1218) {
									Static72.aByteArrayArrayArray5[arg8][local3][local18] = (byte) (Static72.aByteArrayArrayArray5[arg8][local3][local18] | 0x4);
								}
							}
							local1227 = 0;
							local1231 = 0;
							if (arg1) {
								local1227 = Static219.method3979(local3, local18);
								local1231 = Static33.method563(local3, local18);
							}
							arg5.method2260(local3, local18, local915, local905, local918, local921, local912, local924, local927, local1227, local1231, local45);
							Static269.method4620(arg8, local3, local18);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIB)V")
	public static void method759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) Class21 local13 = Static156.method4515(arg1, arg0);
		if (local13 != null && local13.anObjectArray11 != null) {
			@Pc(22) Class4_Sub34 local22 = new Class4_Sub34();
			local22.anObjectArray34 = local13.anObjectArray11;
			local22.aClass21_12 = local13;
			Static164.method3189(local22);
		}
		Static82.anInt2376 = arg0;
		Static273.anInt5438 = arg3;
		Static344.aBoolean219 = true;
		Static199.anInt4136 = arg2;
		Static48.anInt1288 = arg4;
		if (local13 != null) {
			Static209.anInt4333 = local13.anInt770;
		}
		Static255.anInt5164 = arg1;
		Static169.anInt3596 = arg5;
		Static349.method5536(local13);
	}
}
