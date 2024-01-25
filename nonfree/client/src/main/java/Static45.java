import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	private static int anInt1291;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!fi;")
	public static final Class74 aClass74_4 = new Class74();

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	public static int anInt1289 = 99;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	public static final int[] anIntArray201 = new int[14];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1025() {
		@Pc(7) int local7 = Static341.aBoolean470 ? Static223.anInt4466 : Static223.anInt4466 + Static11.anInt3203;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class22_Sub2_Sub1 local14;
			if (local9 < 0) {
				local14 = Static252.aClass22_Sub2_Sub1_Sub1_4;
			} else if (local9 < Static223.anInt4466) {
				local14 = Static157.aClass22_Sub2_Sub1_Sub1Array1[Static314.anIntArray758[local9]];
			} else {
				local14 = Static69.aClass22_Sub2_Sub1_Sub2Array1[Static257.anIntArray649[local9 - Static223.anInt4466]];
			}
			local14.anInt5097 = 0;
			if (local14.anInt5083 < 0) {
				local14.aBoolean377 = false;
			} else {
				@Pc(47) int local47 = local14.method4421();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt5973 & 0x7F) != 0 || (local14.anInt5967 & 0x7F) != 0) {
						local14.aBoolean377 = false;
						continue;
					}
				} else if ((local14.anInt5973 & 0x7F) != 64 || (local14.anInt5967 & 0x7F) != 64) {
					local14.aBoolean377 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt5973 >> 7;
					local94 = local14.anInt5967 >> 7;
					if (local14.anInt5083 != Static42.anIntArrayArray16[local89][local94]) {
						local14.aBoolean377 = true;
						continue;
					}
					if (Static143.anIntArrayArray32[local89][local94] > 1) {
						local119 = Static143.anIntArrayArray32[local89][local94]--;
						local14.aBoolean377 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt5973 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt5967 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt5973 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt5967 + local89 >> 7;
					if (!Static120.method2556(local155, local94, local162, local14.anInt5083, local148)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt5083 == Static42.anIntArrayArray16[local173][local176]) {
									local119 = Static143.anIntArrayArray32[local173][local176]--;
								}
							}
						}
						local14.aBoolean377 = true;
						continue;
					}
				}
				if (local14 instanceof Class22_Sub2_Sub1_Sub1 && local14.anInterface1_3 != null && Static212.anInt4234 >= local14.anInt5148 && Static212.anInt4234 < local14.anInt5147) {
					((Class22_Sub2_Sub1_Sub1) local14).aBoolean75 = false;
				}
				local14.aBoolean377 = false;
				local14.anInt5968 = Static341.method5540(Static168.anInt3508, local14.anInt5967, local14.anInt5973);
				Static235.method4081(local14, true, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1026() {
		for (@Pc(1) int local1 = -1; local1 < Static223.anInt4466 + Static11.anInt3203; local1++) {
			@Pc(6) Class22_Sub2_Sub1 local6;
			if (local1 < 0) {
				local6 = Static252.aClass22_Sub2_Sub1_Sub1_4;
			} else if (local1 < Static223.anInt4466) {
				local6 = Static157.aClass22_Sub2_Sub1_Sub1Array1[Static314.anIntArray758[local1]];
			} else {
				local6 = Static69.aClass22_Sub2_Sub1_Sub2Array1[Static257.anIntArray649[local1 - Static223.anInt4466]];
			}
			if (local6.anInt5083 >= 0) {
				@Pc(32) int local32 = local6.method4421();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt5973 & 0x7F) != 0 || (local6.anInt5967 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt5973 & 0x7F) != 64 || (local6.anInt5967 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt5973 >> 7;
					local73 = local6.anInt5967 >> 7;
					if (local6.anInt5083 > Static42.anIntArrayArray16[local68][local73]) {
						Static42.anIntArrayArray16[local68][local73] = local6.anInt5083;
						Static143.anIntArrayArray32[local68][local73] = 1;
					} else if (local6.anInt5083 == Static42.anIntArrayArray16[local68][local73]) {
						local109 = Static143.anIntArrayArray32[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt5973 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt5967 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt5973 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt5967 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt5083 > Static42.anIntArrayArray16[local151][local154]) {
								Static42.anIntArrayArray16[local151][local154] = local6.anInt5083;
								Static143.anIntArrayArray32[local151][local154] = 1;
							} else if (local6.anInt5083 == Static42.anIntArrayArray16[local151][local154]) {
								local109 = Static143.anIntArrayArray32[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1027() {
		@Pc(7) int local7 = Static341.aBoolean470 ? Static223.anInt4466 : Static223.anInt4466 + Static11.anInt3203;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class22_Sub2_Sub1 local14;
			if (local9 < 0) {
				local14 = Static252.aClass22_Sub2_Sub1_Sub1_4;
			} else if (local9 < Static223.anInt4466) {
				local14 = Static157.aClass22_Sub2_Sub1_Sub1Array1[Static314.anIntArray758[local9]];
			} else {
				local14 = Static69.aClass22_Sub2_Sub1_Sub2Array1[Static257.anIntArray649[local9 - Static223.anInt4466]];
			}
			if (local14.anInt5083 >= 0) {
				@Pc(40) int local40 = local14.method4421();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt5973 & 0x7F) == 0 && (local14.anInt5967 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt5973 & 0x7F) == 64 && (local14.anInt5967 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class22_Sub2_Sub1_Sub1 && local14.anInterface1_3 != null && Static212.anInt4234 >= local14.anInt5148 && Static212.anInt4234 < local14.anInt5147) {
					((Class22_Sub2_Sub1_Sub1) local14).aBoolean75 = false;
				}
				local14.anInt5968 = Static341.method5540(Static168.anInt3508, local14.anInt5967, local14.anInt5973);
				Static235.method4081(local14, true, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!bi;)Lclient!bi;")
	public static Class26 method1028(@OriginalArg(0) Class26 arg0) {
		@Pc(4) int local4 = method1034(arg0).method3762();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static245.method4231(arg0.anInt530);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1029() {
		Static320.anInt6128 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static11.anInt3203; local3++) {
			@Pc(10) Class22_Sub2_Sub1_Sub2 local10 = Static69.aClass22_Sub2_Sub1_Sub2Array1[Static257.anIntArray649[local3]];
			if (local10.aBoolean377 && local10.method4410() != -1) {
				@Pc(28) int local28 = (local10.method4421() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt5973 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt5967 - local28 >> 7;
				@Pc(48) Class22_Sub2_Sub1 local48 = Static288.method1012(Static168.anInt3508, local35, local42);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt5115;
					if (local48 instanceof Class22_Sub2_Sub1_Sub2) {
						local53 += 2048;
					}
					if (local48.anInt5097 == 0 && local48.method4410() != -1) {
						Static197.anIntArray539[Static320.anInt6128] = local53;
						Static175.anIntArray491[Static320.anInt6128] = local53;
						Static320.anInt6128++;
						local48.anInt5097++;
					}
					Static197.anIntArray539[Static320.anInt6128] = local53;
					Static175.anIntArray491[Static320.anInt6128] = local10.anInt5115 + 2048;
					Static320.anInt6128++;
					local48.anInt5097++;
				}
			}
		}
		Static176.method3281(Static197.anIntArray539, Static175.anIntArray491, Static320.anInt6128 - 1, 0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!bi;)Z")
	public static boolean method1031(@OriginalArg(0) Class26 arg0) {
		if (Static105.aBoolean439) {
			if (method1034(arg0).anInt4221 != 0) {
				return false;
			}
			if (arg0.anInt520 == 0) {
				return false;
			}
		}
		return arg0.aBoolean39;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method1033() {
		@Pc(14) boolean local14 = Static2.anInt18 == 1 && Static223.anInt4466 > 200 || Static2.anInt18 == 0 && Static223.anInt4466 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static223.anInt4466; local16++) {
			@Pc(23) Class22_Sub2_Sub1_Sub1 local23 = Static157.aClass22_Sub2_Sub1_Sub1Array1[Static314.anIntArray758[local16]];
			if (local23.method819()) {
				local23.method5058();
				if (local23.aShort83 >= 0 && local23.aShort81 >= 0 && local23.aShort82 < Static15.anInt287 && local23.aShort84 < Static325.anInt6173) {
					local23.aBoolean75 = local23.aBoolean378 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean377) {
						local62++;
					}
					if (local23.anInt5094 > Static212.anInt4234) {
						local62 += 2;
					}
					local62 += 5 - local23.method4421() << 2;
					if (Static101.anInt2449 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt5083 = local62 + 1;
				} else {
					local23.anInt5083 = -1;
				}
			} else {
				local23.anInt5083 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static11.anInt3203; local98++) {
			@Pc(105) Class22_Sub2_Sub1_Sub2 local105 = Static69.aClass22_Sub2_Sub1_Sub2Array1[Static257.anIntArray649[local98]];
			if (local105.method4423() && local105.aClass174_1.method4434()) {
				local105.method5058();
				if (local105.aShort83 >= 0 && local105.aShort81 >= 0 && local105.aShort82 < Static15.anInt287 && local105.aShort84 < Static325.anInt6173) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean377) {
						local141++;
					}
					if (local105.anInt5094 > Static212.anInt4234) {
						local141 += 2;
					}
					local141 += 5 - local105.method4421() << 2;
					if (Static101.anInt2449 == 0) {
						if (local105.aClass174_1.aBoolean383) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static101.anInt2449 == 1) {
						if (local105.aClass174_1.aBoolean383) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass174_1.aBoolean387) {
						local141 += 512;
					} else if (!local105.aClass174_1.aBoolean385) {
						local141 += 256;
					}
					local105.anInt5083 = local141 + 1;
				} else {
					local105.anInt5083 = -1;
				}
			} else {
				local105.anInt5083 = -1;
			}
		}
		for (local62 = 0; local62 < Static174.aClass50Array1.length; local62++) {
			@Pc(207) Class50 local207 = Static174.aClass50Array1[local62];
			if (local207 != null) {
				if (local207.anInt1480 == 1) {
					@Pc(218) Class22_Sub2_Sub1_Sub2 local218 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local207.anInt1473];
					if (local218 != null && local218.anInt5083 >= 0) {
						local218.anInt5083 += 1024;
					}
				} else if (local207.anInt1480 == 10) {
					@Pc(239) Class22_Sub2_Sub1_Sub1 local239 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local207.anInt1473];
					if (local239 != null && local239.anInt5083 >= 0) {
						local239.anInt5083 += 1024;
					}
				}
			}
		}
		Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5083 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!bi;)Lclient!nc;")
	public static Class7_Sub27 method1034(@OriginalArg(0) Class26 arg0) {
		@Pc(13) Class7_Sub27 local13 = (Class7_Sub27) Static247.aClass10_41.method163(((long) arg0.anInt492 << 32) + (long) arg0.anInt550);
		return local13 == null ? arg0.aClass7_Sub27_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!bi;IIIIIII)V")
	public static void method1035(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class26 local6 = arg0[local1];
			if (local6 != null && local6.anInt530 == arg1) {
				@Pc(17) int local17 = local6.anInt540 + arg6;
				@Pc(22) int local22 = local6.anInt519 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt520 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt523;
					@Pc(45) int local45 = local22 + local6.anInt515;
					if (local6.anInt520 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (!local6.aBoolean36 || local6.anInt520 == 0 || local6.aBoolean28 || method1034(local6).anInt4221 != 0 || local6 == Static298.aClass26_28 || local6.anInt557 == 1338) {
					if (!local6.aBoolean36 || !method1031(local6)) {
						if (local6 == Static60.aClass26_13) {
							Static263.aBoolean381 = true;
							Static172.anInt2671 = local17;
							Static234.anInt4653 = local22;
						}
						if (!local6.aBoolean36 || local6.aBoolean44 || local28 < local32 && local30 < local34) {
							if (local6.anInt520 == 0) {
								if (!local6.aBoolean36 && method1031(local6) && Static337.aClass26_30 != local6) {
									continue;
								}
								if (local6.aBoolean32 && Static240.anInt6396 >= local28 && Static100.anInt2436 >= local30 && Static240.anInt6396 < local32 && Static100.anInt2436 < local34) {
									for (@Pc(175) Class7_Sub25 local175 = (Class7_Sub25) Static247.aClass74_34.method1793(); local175 != null; local175 = (Class7_Sub25) Static247.aClass74_34.method1798()) {
										if (local175.aBoolean306) {
											local175.method5648();
											local175.aClass26_22.aBoolean38 = false;
										}
									}
									if (Static179.anInt3659 == 0) {
										Static60.aClass26_13 = null;
										Static298.aClass26_28 = null;
									}
									Static108.anInt1313 = 0;
									Static130.aBoolean223 = false;
									Static312.aBoolean433 = false;
									if (!Static169.aBoolean260) {
										Static223.method3942();
									}
								}
							}
							@Pc(223) boolean local223;
							if (Static240.anInt6396 >= local28 && Static100.anInt2436 >= local30 && Static240.anInt6396 < local32 && Static100.anInt2436 < local34) {
								local223 = true;
							} else {
								local223 = false;
							}
							if (!Static169.aBoolean260 && local223) {
								Static60.method1212(Static240.anInt6396 - local17, local6, Static100.anInt2436 - local22);
							}
							if (local6.aBoolean36) {
								@Pc(244) boolean local244 = false;
								if (Static180.anInt3668 == 1 && local223) {
									local244 = true;
								}
								@Pc(253) boolean local253 = false;
								if (Static354.anInt6682 == 1 && Static169.anInt3518 >= local28 && Static108.anInt1312 >= local30 && Static169.anInt3518 < local32 && Static108.anInt1312 < local34) {
									local253 = true;
								}
								@Pc(275) int local275;
								@Pc(364) int local364;
								if (local6.aByteArray8 != null) {
									for (local275 = 0; local275 < local6.aByteArray8.length; local275++) {
										if (Static17.aBooleanArray24[local6.aByteArray8[local275]]) {
											if (local6.anIntArray67 == null || Static212.anInt4234 >= local6.anIntArray67[local275]) {
												@Pc(306) byte local306 = local6.aByteArray7[local275];
												if (local306 == 0 || ((local306 & 0x8) == 0 || !Static17.aBooleanArray24[86] && !Static17.aBooleanArray24[82] && !Static17.aBooleanArray24[81]) && ((local306 & 0x2) == 0 || Static17.aBooleanArray24[86]) && ((local306 & 0x1) == 0 || Static17.aBooleanArray24[82]) && ((local306 & 0x4) == 0 || Static17.aBooleanArray24[81])) {
													Static319.method5152("", local6.anInt492, -1, local275 + 1);
													local364 = local6.anIntArray65[local275];
													if (local6.anIntArray67 == null) {
														local6.anIntArray67 = new int[local6.aByteArray8.length];
													}
													if (local364 == 0) {
														local6.anIntArray67[local275] = Integer.MAX_VALUE;
													} else {
														local6.anIntArray67[local275] = Static212.anInt4234 + local364;
													}
												}
											}
										} else if (local6.anIntArray67 != null) {
											local6.anIntArray67[local275] = 0;
										}
									}
								}
								if (local253) {
									Static91.method5060(local6, Static169.anInt3518 - local17, Static108.anInt1312 - local22);
								}
								if (Static60.aClass26_13 != null && Static60.aClass26_13 != local6 && local223 && method1034(local6).method3757()) {
									Static76.aClass26_14 = local6;
								}
								if (local6 == Static298.aClass26_28) {
									Static250.aBoolean359 = true;
									Static314.anInt6024 = local17;
									Static122.anInt2754 = local22;
								}
								if (local6.aBoolean28 || local6.anInt557 != 0) {
									@Pc(445) Class7_Sub25 local445;
									if (local223 && Static111.anInt2544 != 0 && local6.anObjectArray11 != null) {
										local445 = new Class7_Sub25();
										local445.aBoolean306 = true;
										local445.aClass26_22 = local6;
										local445.anInt3895 = Static111.anInt2544;
										local445.anObjectArray34 = local6.anObjectArray11;
										Static247.aClass74_34.method1802(local445);
									}
									if (Static60.aClass26_13 != null || Static169.aClass26_20 != null || Static169.aBoolean260 || local6.anInt557 != 1400 && Static108.anInt1313 > 0) {
										local253 = false;
										local244 = false;
										local223 = false;
									}
									@Pc(580) int local580;
									if (local6.anInt557 != 0) {
										if (local6.anInt557 == 1337 || local6.anInt557 == 1403) {
											Static197.aClass26_21 = local6;
											if (Static62.aClass46_1 != null) {
												Static62.aClass46_1.method1116(Static128.aClass89_3, local6.anInt515);
											}
											if (local6.anInt557 == 1337) {
												if (!Static169.aBoolean260 && local223) {
													Static350.method5617(Static128.aClass89_3);
													for (@Pc(518) Class36_Sub8 local518 = (Class36_Sub8) Static13.aClass191_1.method4862(); local518 != null; local518 = (Class36_Sub8) Static13.aClass191_1.method4869()) {
														if (Static240.anInt6396 >= local518.anInt5443 && Static240.anInt6396 < local518.anInt5444 && Static100.anInt2436 >= local518.anInt5439 && Static100.anInt2436 < local518.anInt5442) {
															Static223.method3942();
															Static78.method5355(local518.aClass22_Sub2_Sub1_1);
														}
													}
												}
												Static296.method5032(local22, local17, local6);
												continue;
											}
										}
										@Pc(619) int local619;
										if (local6.anInt557 == 1338) {
											if (local6.method428(Static128.aClass89_3) == null || Static348.anInt6562 != 0 && Static348.anInt6562 != 3 || Static169.aBoolean260 || !local223) {
												continue;
											}
											local275 = Static240.anInt6396 - local17;
											local580 = Static100.anInt2436 - local22;
											local364 = local6.anIntArray64[local580];
											if (local275 < local364 || local275 > local364 + local6.anIntArray66[local580]) {
												continue;
											}
											local275 -= local6.anInt523 / 2;
											local580 -= local6.anInt515 / 2;
											if (Static118.anInt6324 == 4) {
												local619 = (int) Static351.aFloat80 & 0x3FFF;
											} else {
												local619 = (int) Static351.aFloat80 + Static218.anInt4347 & 0x3FFF;
											}
											@Pc(631) int local631 = Class147.anIntArray604[local619];
											@Pc(635) int local635 = Class147.anIntArray603[local619];
											if (Static118.anInt6324 != 4) {
												local631 = local631 * (Static49.anInt1359 + 256) >> 8;
												local635 = local635 * (Static49.anInt1359 + 256) >> 8;
											}
											@Pc(664) int local664 = local580 * local631 + local275 * local635 >> 15;
											@Pc(674) int local674 = local580 * local635 - local275 * local631 >> 15;
											@Pc(685) int local685;
											@Pc(693) int local693;
											if (Static118.anInt6324 == 4) {
												local685 = (Static74.anInt1848 >> 7) + (local664 >> 2);
												local693 = (Static318.anInt611 >> 7) - (local674 >> 2);
											} else {
												@Pc(702) int local702 = (Static252.aClass22_Sub2_Sub1_Sub1_4.method4421() - 1) * 64;
												local685 = (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 - local702 >> 7) + (local664 >> 2);
												local693 = (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 - local702 >> 7) - (local674 >> 2);
											}
											if (Static253.aBoolean361 && (Static72.anInt1772 & 0x40) != 0) {
												@Pc(735) Class26 local735 = Static23.method4815(Static256.anInt4950, Static269.anInt5313);
												if (local735 == null) {
													Static249.method1112();
												} else {
													Static198.method3544(local693, Static301.anInt5782, Static85.aString150, 1L, " ->", 6, local685);
												}
												continue;
											}
											if (Static345.anInt6530 == 1) {
												Static198.method3544(local693, -1, Static240.aString421, 1L, "", 29, local685);
											}
											Static198.method3544(local693, -1, Static272.aString340, 1L, "", 51, local685);
											continue;
										}
										if (local6.anInt557 == 1400) {
											Static116.aClass26_18 = local6;
											if (local223) {
												Static130.aBoolean223 = true;
											}
											if (local253) {
												local275 = (int) ((double) (Static169.anInt3518 - local17 - local6.anInt523 / 2) * 2.0D / (double) Static306.aFloat49);
												local580 = (int) -((double) (Static108.anInt1312 - local22 - local6.anInt515 / 2) * 2.0D / (double) Static306.aFloat49);
												local364 = Static244.anInt4835 + local275 + Static306.anInt3327;
												local619 = Static107.anInt1502 + local580 + Static306.anInt3329;
												@Pc(832) Class7_Sub1_Sub10 local832 = Static338.method5371();
												if (local832 == null) {
													continue;
												}
												@Pc(837) int[] local837 = new int[3];
												local832.method2135(local837, local364, local619);
												if (local837 != null) {
													if (Static17.aBooleanArray24[82] && Static244.anInt4842 > 0) {
														Static262.method4384(local837[0], local837[1], local837[2]);
														continue;
													}
													Static312.aBoolean433 = true;
													Static182.anInt3698 = local837[0];
													Static91.anInt5965 = local837[1];
													Static138.anInt3017 = local837[2];
												}
												Static108.anInt1313 = 1;
												Static353.aBoolean166 = false;
												Static168.anInt3512 = Static240.anInt6396;
												Static46.anInt1319 = Static100.anInt2436;
												continue;
											}
											if (local244 && Static108.anInt1313 > 0) {
												if (Static108.anInt1313 == 1 && (Static168.anInt3512 != Static240.anInt6396 || Static46.anInt1319 != Static100.anInt2436)) {
													Static347.anInt6545 = Static244.anInt4835;
													anInt1291 = Static107.anInt1502;
													Static108.anInt1313 = 2;
												}
												if (Static108.anInt1313 == 2) {
													Static353.aBoolean166 = true;
													Static173.method3244(Static347.anInt6545 + (int) ((double) (Static168.anInt3512 - Static240.anInt6396) * 2.0D / (double) Static306.aFloat50));
													Static255.method3335(anInt1291 - (int) ((double) (Static46.anInt1319 - Static100.anInt2436) * 2.0D / (double) Static306.aFloat50));
												}
												continue;
											}
											if (Static108.anInt1313 > 0 && !Static353.aBoolean166) {
												if ((Static214.anInt4265 == 1 || Static46.method1057()) && Static33.anInt735 > 2) {
													Static17.method4464(2);
												} else if (Static252.method5170()) {
													Static17.method4464(1);
												}
											}
											Static108.anInt1313 = 0;
											continue;
										}
										if (local6.anInt557 == 1401) {
											if (local244) {
												Static144.method2890(Static240.anInt6396 - local17, local6.anInt523, local6.anInt515, Static100.anInt2436 - local22);
											}
											continue;
										}
										if (local6.anInt557 == 1402) {
											Static245.method4226(local6);
											continue;
										}
										if (local6.anInt557 == 1406) {
											Static153.method2990(local22, local17, local6);
											continue;
										}
									}
									if (!local6.aBoolean42 && local253) {
										local6.aBoolean42 = true;
										if (local6.anObjectArray7 != null) {
											local445 = new Class7_Sub25();
											local445.aBoolean306 = true;
											local445.aClass26_22 = local6;
											local445.anInt3894 = Static169.anInt3518 - local17;
											local445.anInt3895 = Static108.anInt1312 - local22;
											local445.anObjectArray34 = local6.anObjectArray7;
											Static247.aClass74_34.method1802(local445);
										}
									}
									if (local6.aBoolean42 && local244 && local6.anObjectArray14 != null) {
										local445 = new Class7_Sub25();
										local445.aBoolean306 = true;
										local445.aClass26_22 = local6;
										local445.anInt3894 = Static240.anInt6396 - local17;
										local445.anInt3895 = Static100.anInt2436 - local22;
										local445.anObjectArray34 = local6.anObjectArray14;
										Static247.aClass74_34.method1802(local445);
									}
									if (local6.aBoolean42 && !local244) {
										local6.aBoolean42 = false;
										if (local6.anObjectArray22 != null) {
											local445 = new Class7_Sub25();
											local445.aBoolean306 = true;
											local445.aClass26_22 = local6;
											local445.anInt3894 = Static240.anInt6396 - local17;
											local445.anInt3895 = Static100.anInt2436 - local22;
											local445.anObjectArray34 = local6.anObjectArray22;
											Static255.aClass74_28.method1802(local445);
										}
									}
									if (local244 && local6.anObjectArray19 != null) {
										local445 = new Class7_Sub25();
										local445.aBoolean306 = true;
										local445.aClass26_22 = local6;
										local445.anInt3894 = Static240.anInt6396 - local17;
										local445.anInt3895 = Static100.anInt2436 - local22;
										local445.anObjectArray34 = local6.anObjectArray19;
										Static247.aClass74_34.method1802(local445);
									}
									if (!local6.aBoolean38 && local223) {
										local6.aBoolean38 = true;
										if (local6.anObjectArray12 != null) {
											local445 = new Class7_Sub25();
											local445.aBoolean306 = true;
											local445.aClass26_22 = local6;
											local445.anInt3894 = Static240.anInt6396 - local17;
											local445.anInt3895 = Static100.anInt2436 - local22;
											local445.anObjectArray34 = local6.anObjectArray12;
											Static247.aClass74_34.method1802(local445);
										}
									}
									if (local6.aBoolean38 && local223 && local6.anObjectArray8 != null) {
										local445 = new Class7_Sub25();
										local445.aBoolean306 = true;
										local445.aClass26_22 = local6;
										local445.anInt3894 = Static240.anInt6396 - local17;
										local445.anInt3895 = Static100.anInt2436 - local22;
										local445.anObjectArray34 = local6.anObjectArray8;
										Static247.aClass74_34.method1802(local445);
									}
									if (local6.aBoolean38 && !local223) {
										local6.aBoolean38 = false;
										if (local6.anObjectArray16 != null) {
											local445 = new Class7_Sub25();
											local445.aBoolean306 = true;
											local445.aClass26_22 = local6;
											local445.anInt3894 = Static240.anInt6396 - local17;
											local445.anInt3895 = Static100.anInt2436 - local22;
											local445.anObjectArray34 = local6.anObjectArray16;
											Static255.aClass74_28.method1802(local445);
										}
									}
									if (local6.anObjectArray18 != null) {
										local445 = new Class7_Sub25();
										local445.aClass26_22 = local6;
										local445.anObjectArray34 = local6.anObjectArray18;
										Static129.aClass74_19.method1802(local445);
									}
									@Pc(1337) Class7_Sub25 local1337;
									if (local6.anObjectArray4 != null && Static184.anInt3750 > local6.anInt575) {
										if (local6.anIntArray71 == null || Static184.anInt3750 - local6.anInt575 > 32) {
											local445 = new Class7_Sub25();
											local445.aClass26_22 = local6;
											local445.anObjectArray34 = local6.anObjectArray4;
											Static247.aClass74_34.method1802(local445);
										} else {
											label675: for (local275 = local6.anInt575; local275 < Static184.anInt3750; local275++) {
												local580 = Static225.anIntArray605[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray71.length; local364++) {
													if (local6.anIntArray71[local364] == local580) {
														local1337 = new Class7_Sub25();
														local1337.aClass26_22 = local6;
														local1337.anObjectArray34 = local6.anObjectArray4;
														Static247.aClass74_34.method1802(local1337);
														break label675;
													}
												}
											}
										}
										local6.anInt575 = Static184.anInt3750;
									}
									if (local6.anObjectArray26 != null && Static237.anInt4702 > local6.anInt558) {
										if (local6.anIntArray74 == null || Static237.anInt4702 - local6.anInt558 > 32) {
											local445 = new Class7_Sub25();
											local445.aClass26_22 = local6;
											local445.anObjectArray34 = local6.anObjectArray26;
											Static247.aClass74_34.method1802(local445);
										} else {
											label655: for (local275 = local6.anInt558; local275 < Static237.anInt4702; local275++) {
												local580 = Static42.anIntArray192[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray74.length; local364++) {
													if (local6.anIntArray74[local364] == local580) {
														local1337 = new Class7_Sub25();
														local1337.aClass26_22 = local6;
														local1337.anObjectArray34 = local6.anObjectArray26;
														Static247.aClass74_34.method1802(local1337);
														break label655;
													}
												}
											}
										}
										local6.anInt558 = Static237.anInt4702;
									}
									if (local6.anObjectArray28 != null && Static88.anInt3953 > local6.anInt572) {
										if (local6.anIntArray61 == null || Static88.anInt3953 - local6.anInt572 > 32) {
											local445 = new Class7_Sub25();
											local445.aClass26_22 = local6;
											local445.anObjectArray34 = local6.anObjectArray28;
											Static247.aClass74_34.method1802(local445);
										} else {
											label635: for (local275 = local6.anInt572; local275 < Static88.anInt3953; local275++) {
												local580 = Static235.anIntArray626[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray61.length; local364++) {
													if (local6.anIntArray61[local364] == local580) {
														local1337 = new Class7_Sub25();
														local1337.aClass26_22 = local6;
														local1337.anObjectArray34 = local6.anObjectArray28;
														Static247.aClass74_34.method1802(local1337);
														break label635;
													}
												}
											}
										}
										local6.anInt572 = Static88.anInt3953;
									}
									if (local6.anObjectArray27 != null && Static271.anInt5360 > local6.anInt484) {
										if (local6.anIntArray59 == null || Static271.anInt5360 - local6.anInt484 > 32) {
											local445 = new Class7_Sub25();
											local445.aClass26_22 = local6;
											local445.anObjectArray34 = local6.anObjectArray27;
											Static247.aClass74_34.method1802(local445);
										} else {
											label615: for (local275 = local6.anInt484; local275 < Static271.anInt5360; local275++) {
												local580 = Static151.anIntArray423[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray59.length; local364++) {
													if (local6.anIntArray59[local364] == local580) {
														local1337 = new Class7_Sub25();
														local1337.aClass26_22 = local6;
														local1337.anObjectArray34 = local6.anObjectArray27;
														Static247.aClass74_34.method1802(local1337);
														break label615;
													}
												}
											}
										}
										local6.anInt484 = Static271.anInt5360;
									}
									if (local6.anObjectArray30 != null && Static242.anInt3403 > local6.anInt568) {
										if (local6.anIntArray63 == null || Static242.anInt3403 - local6.anInt568 > 32) {
											local445 = new Class7_Sub25();
											local445.aClass26_22 = local6;
											local445.anObjectArray34 = local6.anObjectArray30;
											Static247.aClass74_34.method1802(local445);
										} else {
											label595: for (local275 = local6.anInt568; local275 < Static242.anInt3403; local275++) {
												local580 = Static302.anIntArray821[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray63.length; local364++) {
													if (local6.anIntArray63[local364] == local580) {
														local1337 = new Class7_Sub25();
														local1337.aClass26_22 = local6;
														local1337.anObjectArray34 = local6.anObjectArray30;
														Static247.aClass74_34.method1802(local1337);
														break label595;
													}
												}
											}
										}
										local6.anInt568 = Static242.anInt3403;
									}
									if (Static20.anInt408 > local6.anInt576 && local6.anObjectArray29 != null) {
										local445 = new Class7_Sub25();
										local445.aClass26_22 = local6;
										local445.anObjectArray34 = local6.anObjectArray29;
										Static247.aClass74_34.method1802(local445);
									}
									if (Static55.anInt1452 > local6.anInt576 && local6.anObjectArray23 != null) {
										local445 = new Class7_Sub25();
										local445.aClass26_22 = local6;
										local445.anObjectArray34 = local6.anObjectArray23;
										Static247.aClass74_34.method1802(local445);
									}
									if (Static337.anInt6357 > local6.anInt576 && local6.anObjectArray10 != null) {
										local445 = new Class7_Sub25();
										local445.aClass26_22 = local6;
										local445.anObjectArray34 = local6.anObjectArray10;
										Static247.aClass74_34.method1802(local445);
									}
									if (Static69.anInt1715 > local6.anInt576 && local6.anObjectArray3 != null) {
										local445 = new Class7_Sub25();
										local445.aClass26_22 = local6;
										local445.anObjectArray34 = local6.anObjectArray3;
										Static247.aClass74_34.method1802(local445);
									}
									if (Static320.anInt6129 > local6.anInt576 && local6.anObjectArray21 != null) {
										local445 = new Class7_Sub25();
										local445.aClass26_22 = local6;
										local445.anObjectArray34 = local6.anObjectArray21;
										Static247.aClass74_34.method1802(local445);
									}
									local6.anInt576 = Static34.anInt776;
									if (local6.anObjectArray5 != null) {
										for (local275 = 0; local275 < Static126.anInt2794; local275++) {
											@Pc(1805) Class7_Sub25 local1805 = new Class7_Sub25();
											local1805.aClass26_22 = local6;
											local1805.anInt3900 = Static175.anIntArray492[local275];
											local1805.anInt3893 = Static286.anIntArray713[local275];
											local1805.anObjectArray34 = local6.anObjectArray5;
											Static247.aClass74_34.method1802(local1805);
										}
									}
									if (Static299.aBoolean424 && local6.anObjectArray17 != null) {
										local445 = new Class7_Sub25();
										local445.aClass26_22 = local6;
										local445.anObjectArray34 = local6.anObjectArray17;
										Static247.aClass74_34.method1802(local445);
									}
								}
								if (local6.anInt520 == 5 && local6.anInt496 != -1) {
									local6.method436().method1116(Static128.aClass89_3, local6.anInt515);
								}
							}
							if (!local6.aBoolean36 && Static60.aClass26_13 == null && Static169.aClass26_20 == null && !Static169.aBoolean260) {
								if ((local6.anInt497 >= 0 || local6.anInt500 != 0) && Static240.anInt6396 >= local28 && Static100.anInt2436 >= local30 && Static240.anInt6396 < local32 && Static100.anInt2436 < local34) {
									if (local6.anInt497 >= 0) {
										Static337.aClass26_30 = arg0[local6.anInt497];
									} else {
										Static337.aClass26_30 = local6;
									}
								}
								if (local6.anInt520 == 8 && Static240.anInt6396 >= local28 && Static100.anInt2436 >= local30 && Static240.anInt6396 < local32 && Static100.anInt2436 < local34) {
									Static58.aClass26_11 = local6;
								}
								if (local6.anInt548 > local6.anInt515) {
									Static151.method2967(Static240.anInt6396, local22, local17 + local6.anInt523, local6, Static100.anInt2436, local6.anInt548, local6.anInt515);
								}
							}
							Static250.method4282(local6, arg2, arg4, local17, arg5, local22, arg3);
							if (local6.anInt520 == 0) {
								method1035(arg0, local6.anInt492, local28, local30, local32, local34, local17 - local6.anInt533, local22 - local6.anInt499);
								if (local6.aClass26Array1 != null) {
									method1035(local6.aClass26Array1, local6.anInt492, local28, local30, local32, local34, local17 - local6.anInt533, local22 - local6.anInt499);
								}
								@Pc(1998) Class7_Sub17 local1998 = (Class7_Sub17) Static247.aClass10_40.method163((long) local6.anInt492);
								if (local1998 != null) {
									if (local1998.anInt3249 == 0 && !Static169.aBoolean260 && local223 && !Static105.aBoolean439) {
										Static223.method3942();
									}
									Static185.method3389(local34, local1998.anInt3252, local28, local30, local17, local22, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static250.method4282(local6, arg2, arg4, local17, arg5, local22, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method1036() {
		for (@Pc(1) int local1 = 0; local1 < Static15.anInt287; local1++) {
			@Pc(6) int[] local6 = Static42.anIntArrayArray16[local1];
			for (@Pc(8) int local8 = 0; local8 < Static325.anInt6173; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	public static void method1037() {
		Static201.aClass103_39.method2684();
	}
}
