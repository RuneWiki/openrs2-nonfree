import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "J")
	public static long aLong39;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!tl;")
	public static final Class316 aClass316_1 = new Class316();

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_7 = new Class244();

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!n;")
	public static Class225 aClass225_8 = null;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1167() {
		@Pc(1) int local1 = Static413.anInt8212;
		@Pc(3) int[] local3 = Static229.anIntArray201;
		@Pc(20) boolean local20 = Static214.aClass4_Sub19_Sub1_1.anInt3052 == 1 && local1 > 200 || Static214.aClass4_Sub19_Sub1_1.anInt3052 == 0 && local1 > 50;
		@Pc(82) int local82;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class1_Sub4_Sub2_Sub1_Sub2 local29 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local3[local22]];
			if (!local29.method6942()) {
				local29.anInt8374 = -1;
			} else if (local29.aBoolean596) {
				local29.anInt8374 = -1;
			} else {
				local29.method8132();
				if (local29.aShort121 >= 0 && local29.aShort120 >= 0 && local29.aShort122 < Static428.anInt8046 && local29.aShort119 < Static119.anInt2717) {
					local29.aBoolean598 = local29.aBoolean589 ? local20 : false;
					if (local29 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1) {
						local29.anInt8374 = Integer.MAX_VALUE;
					} else {
						local82 = 0;
						if (!local29.aBoolean590) {
							local82++;
						}
						if (local29.anInt8444 > Static106.anInt2418) {
							local82 += 2;
						}
						local82 += 5 - local29.method6925() << 2;
						if (local29.aBoolean594) {
							local82 += 512;
						} else {
							if (Static276.anInt5641 == 0) {
								local82 += 32;
							} else {
								local82 += 128;
							}
							local82 += 256;
						}
						local29.anInt8374 = local82 + 1;
					}
				} else {
					local29.anInt8374 = -1;
				}
			}
		}
		for (@Pc(123) int local123 = 0; local123 < Static418.anInt7866; local123++) {
			@Pc(134) Class1_Sub4_Sub2_Sub1_Sub1 local134 = ((Class4_Sub4) Static585.aClass350_41.method8207((long) Static43.anIntArray23[local123])).aClass1_Sub4_Sub2_Sub1_Sub1_1;
			if (local134.method4517() && local134.aClass283_1.method6836(Static45.aClass148_1)) {
				local134.method8132();
				if (local134.aShort121 >= 0 && local134.aShort120 >= 0 && local134.aShort122 < Static428.anInt8046 && local134.aShort119 < Static119.anInt2717) {
					@Pc(171) int local171 = 0;
					if (!local134.aBoolean590) {
						local171++;
					}
					if (local134.anInt8444 > Static106.anInt2418) {
						local171 += 2;
					}
					local171 += 5 - local134.method6925() << 2;
					if (Static276.anInt5641 == 0) {
						if (local134.aClass283_1.aBoolean577) {
							local171 += 64;
						} else {
							local171 += 128;
						}
					} else if (Static276.anInt5641 == 1) {
						if (local134.aClass283_1.aBoolean577) {
							local171 += 32;
						} else {
							local171 += 64;
						}
					}
					if (local134.aClass283_1.aBoolean574) {
						local171 += 1024;
					} else if (!local134.aClass283_1.aBoolean573) {
						local171 += 256;
					}
					local134.anInt8374 = local171 + 1;
				} else {
					local134.anInt8374 = -1;
				}
			} else {
				local134.anInt8374 = -1;
			}
		}
		for (local82 = 0; local82 < Static532.aClass366Array1.length; local82++) {
			@Pc(237) Class366 local237 = Static532.aClass366Array1[local82];
			if (local237 != null) {
				if (local237.anInt10235 == 1) {
					@Pc(251) Class4_Sub4 local251 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local237.anInt10240);
					if (local251 != null) {
						@Pc(256) Class1_Sub4_Sub2_Sub1_Sub1 local256 = local251.aClass1_Sub4_Sub2_Sub1_Sub1_1;
						if (local256.anInt8374 >= 0) {
							local256.anInt8374 += 2048;
						}
					}
				} else if (local237.anInt10235 == 10) {
					@Pc(275) Class1_Sub4_Sub2_Sub1_Sub2 local275 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local237.anInt10240];
					if (local275 != null && local275 != Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 && local275.anInt8374 >= 0) {
						local275.anInt8374 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1168() {
		for (@Pc(1) int local1 = 0; local1 < Static428.anInt8046; local1++) {
			@Pc(6) int[] local6 = Static241.anIntArrayArray28[local1];
			for (@Pc(8) int local8 = 0; local8 < Static119.anInt2717; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1171() {
		Static449.anInt8494 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static418.anInt7866; local3++) {
			@Pc(14) Class1_Sub4_Sub2_Sub1_Sub1 local14 = ((Class4_Sub4) Static585.aClass350_41.method8207((long) Static43.anIntArray23[local3])).aClass1_Sub4_Sub2_Sub1_Sub1_1;
			if (local14.aBoolean590 && local14.method6932() != -1) {
				@Pc(32) int local32 = (local14.method6925() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9934 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9935 - local32 >> 9;
				@Pc(53) Class1_Sub4_Sub2_Sub1 local53 = Static520.method7612(local14.aByte126, local46, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt8435;
					if (local53 instanceof Class1_Sub4_Sub2_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt8367 == 0 && local53.method6932() != -1) {
						Static306.anIntArray300[Static449.anInt8494] = local58;
						Static340.anIntArray338[Static449.anInt8494] = local58;
						Static449.anInt8494++;
						local53.anInt8367++;
					}
					Static306.anIntArray300[Static449.anInt8494] = local58;
					Static340.anIntArray338[Static449.anInt8494] = local14.anInt8435 + 2048;
					Static449.anInt8494++;
					local53.anInt8367++;
				}
			}
		}
		Static98.method2173(Static306.anIntArray300, Static340.anIntArray338, 0, Static449.anInt8494 - 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBII)Z")
	public static boolean method1172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Interface19 local13 = (Interface19) Static353.method5714(arg2, arg1, arg0);
		@Pc(15) boolean local15 = true;
		if (local13 != null) {
			local15 = Static472.method7092(local13) & true;
		}
		local13 = (Interface19) Static397.method6277(arg2, arg1, arg0, pn.class);
		if (local13 != null) {
			local15 &= Static472.method7092(local13);
		}
		local13 = (Interface19) Static460.method7015(arg2, arg1, arg0);
		if (local13 != null) {
			local15 &= Static472.method7092(local13);
		}
		return local15;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1173(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static413.anInt8212;
		@Pc(3) int[] local3 = Static229.anIntArray201;
		@Pc(11) int local11 = Static417.aBoolean538 ? local1 : local1 + Static418.anInt7866;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub4_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class4_Sub4) Static585.aClass350_41.method8207((long) Static43.anIntArray23[local13 - local1])).aClass1_Sub4_Sub2_Sub1_Sub1_1;
			}
			if (local23.aByte126 == arg0) {
				local23.anInt8367 = 0;
				if (local23.anInt8374 < 0) {
					local23.aBoolean590 = false;
				} else {
					@Pc(54) int local54 = local23.method6925();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9934 & 0x1FF) != 0 || (local23.anInt9935 & 0x1FF) != 0) {
							local23.aBoolean590 = false;
							continue;
						}
					} else if ((local23.anInt9934 & 0x1FF) != 256 || (local23.anInt9935 & 0x1FF) != 256) {
						local23.aBoolean590 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9934 >> 9;
						local101 = local23.anInt9935 >> 9;
						if (local23.anInt8374 != Static241.anIntArrayArray28[local96][local101]) {
							local23.aBoolean590 = true;
							continue;
						}
						if (Static51.anIntArrayArray6[local96][local101] > 1) {
							local126 = Static51.anIntArrayArray6[local96][local101]--;
							local23.aBoolean590 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9934 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9935 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9934 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9935 + local96 >> 9;
						if (!Static198.method3515(local23.anInt8374, local155, local101, local162, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt8374 == Static241.anIntArrayArray28[local180][local183]) {
										local126 = Static51.anIntArrayArray6[local180][local183]--;
									}
								}
							}
							local23.aBoolean590 = true;
							continue;
						}
					}
					local23.aBoolean590 = false;
					local23.anInt9932 = Static501.method5641(local23.anInt9934, local23.aByte126, local23.anInt9935);
					Static101.method2202(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1175() {
		@Pc(1) int local1 = Static413.anInt8212;
		@Pc(3) int[] local3 = Static229.anIntArray201;
		@Pc(11) int local11 = Static417.aBoolean538 ? local1 : local1 + Static418.anInt7866;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub4_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class4_Sub4) Static585.aClass350_41.method8207((long) Static43.anIntArray23[local13 - local1])).aClass1_Sub4_Sub2_Sub1_Sub1_1;
			}
			if (local23.anInt8374 >= 0) {
				@Pc(43) int local43 = local23.method6925();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9934 & 0x1FF) == 0 && (local23.anInt9935 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9934 & 0x1FF) == 256 && (local23.anInt9935 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt9932 = Static501.method5641(local23.anInt9934, local23.aByte126, local23.anInt9935);
				Static101.method2202(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1176(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static413.anInt8212;
		@Pc(3) int[] local3 = Static229.anIntArray201;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static418.anInt7866; local5++) {
			@Pc(15) Class1_Sub4_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class4_Sub4) Static585.aClass350_41.method8207((long) Static43.anIntArray23[local5 - local1])).aClass1_Sub4_Sub2_Sub1_Sub1_1;
			}
			if (local15.aByte126 == arg0 && local15.anInt8374 >= 0) {
				@Pc(39) int local39 = local15.method6925();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9934 & 0x1FF) != 0 || (local15.anInt9935 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9934 & 0x1FF) != 256 || (local15.anInt9935 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9934 >> 9;
					local80 = local15.anInt9935 >> 9;
					if (local15.anInt8374 > Static241.anIntArrayArray28[local75][local80]) {
						Static241.anIntArrayArray28[local75][local80] = local15.anInt8374;
						Static51.anIntArrayArray6[local75][local80] = 1;
					} else if (local15.anInt8374 == Static241.anIntArrayArray28[local75][local80]) {
						local116 = Static51.anIntArrayArray6[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9934 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9935 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9934 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9935 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt8374 > Static241.anIntArrayArray28[local158][local161]) {
								Static241.anIntArrayArray28[local158][local161] = local15.anInt8374;
								Static51.anIntArrayArray6[local158][local161] = 1;
							} else if (local15.anInt8374 == Static241.anIntArrayArray28[local158][local161]) {
								local116 = Static51.anIntArrayArray6[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!n;IIIIIIIII)V")
	public static void method1178(@OriginalArg(0) Class225[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class225 local6 = arg0[local1];
			if (local6 != null && local6.anInt6559 == arg1) {
				@Pc(17) int local17 = local6.anInt6552 + arg6;
				@Pc(22) int local22 = local6.anInt6494 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6508 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6529;
					@Pc(45) int local45 = local22 + local6.anInt6521;
					if (local6.anInt6508 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6508 == 0 || local6.aBoolean480 || method1180(local6).anInt156 != 0 || local6 == Static167.aClass225_16 || local6.anInt6491 == Static80.anInt9683 || local6.anInt6491 == Static394.anInt7576) {
					if (!method1181(local6)) {
						if (local6 == Static317.aClass225_54 && Static164.method2975(Static317.aClass225_54) != null) {
							Static487.aBoolean624 = true;
							Static173.anInt3515 = local17;
							Static275.anInt5634 = local22;
						}
						if (local6.aBoolean470 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean485 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(156) Class4_Sub25 local156 = (Class4_Sub25) Static525.aClass244_59.method5963(); local156 != null; local156 = (Class4_Sub25) Static525.aClass244_59.method5965()) {
									if (local156.aBoolean319) {
										local156.method8379();
										local156.aClass225_21.aBoolean482 = false;
									}
								}
								if (Static453.anInt8515 == 0) {
									Static317.aClass225_54 = null;
									Static167.aClass225_16 = null;
								}
								Static116.anInt2677 = 0;
								Static517.aBoolean648 = false;
								Static145.aBoolean271 = false;
								if (!Static49.aBoolean36) {
									Static10.method173();
								}
							}
							@Pc(212) boolean local212;
							if (Static172.aClass135_1.method6370() >= local28 && Static172.aClass135_1.method6378() >= local30 && Static172.aClass135_1.method6370() < local32 && Static172.aClass135_1.method6378() < local34) {
								local212 = true;
							} else {
								local212 = false;
							}
							if (!Static418.aBoolean541 && local212) {
								if (local6.anInt6535 >= 0) {
									Static180.anInt3622 = local6.anInt6535;
								} else if (local6.aBoolean485) {
									Static180.anInt3622 = -1;
								}
							}
							if (!Static49.aBoolean36 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static12.method177(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(256) boolean local256 = false;
							if (Static172.aClass135_1.method6371() && local212) {
								local256 = true;
							}
							@Pc(266) boolean local266 = false;
							@Pc(271) Class4_Sub15 local271 = (Class4_Sub15) Static222.aClass244_35.method5963();
							if (local271 != null && local271.method3496() == 0 && local271.method3495() >= local28 && local271.method3498() >= local30 && local271.method3495() < local32 && local271.method3498() < local34) {
								local266 = true;
							}
							@Pc(307) int local307;
							@Pc(441) int local441;
							if (local6.aByteArray73 != null && !Static282.method4054()) {
								for (local307 = 0; local307 < local6.aByteArray73.length; local307++) {
									if (Static584.aClass154_1.method3569(local6.aByteArray73[local307])) {
										if (local6.anIntArray323 == null || Static106.anInt2418 >= local6.anIntArray323[local307]) {
											@Pc(339) byte local339 = local6.aByteArray74[local307];
											if (local339 == 0 || ((local339 & 0x8) == 0 || !Static584.aClass154_1.method3569(86) && !Static584.aClass154_1.method3569(82) && !Static584.aClass154_1.method3569(81)) && ((local339 & 0x2) == 0 || Static584.aClass154_1.method3569(86)) && ((local339 & 0x1) == 0 || Static584.aClass154_1.method3569(82)) && ((local339 & 0x4) == 0 || Static584.aClass154_1.method3569(81))) {
												if (local307 < 10) {
													Static34.method453(-1, local307 + 1, "", local6.anInt6555);
												} else if (local307 == 10) {
													Static419.method6558();
													@Pc(410) Class4_Sub2 local410 = method1180(local6);
													Static572.method8105(local410.method131(), local6, local410.anInt151);
													Static152.aString28 = Static327.method5372(local6);
													if (Static152.aString28 == null) {
														Static152.aString28 = "Null";
													}
													Static551.aString95 = local6.aString65 + "<col=ffffff>";
												}
												local441 = local6.anIntArray327[local307];
												if (local6.anIntArray323 == null) {
													local6.anIntArray323 = new int[local6.aByteArray73.length];
												}
												if (local441 == 0) {
													local6.anIntArray323[local307] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray323[local307] = Static106.anInt2418 + local441;
												}
											}
										}
									} else if (local6.anIntArray323 != null) {
										local6.anIntArray323[local307] = 0;
									}
								}
							}
							if (local266) {
								Static9.method169(local271.method3498() - local22, local6, local271.method3495() - local17);
							}
							if (Static317.aClass225_54 != null && Static317.aClass225_54 != local6 && local212 && method1180(local6).method129()) {
								Static529.aClass225_48 = local6;
							}
							if (local6 == Static167.aClass225_16) {
								Static320.aBoolean455 = true;
								Static366.anInt8691 = local17;
								Static307.anInt6169 = local22;
							}
							if (local6.aBoolean480 || local6.anInt6491 != 0) {
								@Pc(526) Class4_Sub25 local526;
								if (local212 && Static581.anInt10088 != 0 && local6.anObjectArray24 != null) {
									local526 = new Class4_Sub25();
									local526.aBoolean319 = true;
									local526.aClass225_21 = local6;
									local526.anInt4393 = Static581.anInt10088;
									local526.anObjectArray1 = local6.anObjectArray24;
									Static525.aClass244_59.method5960(local526);
								}
								if (Static317.aClass225_54 != null || Static49.aBoolean36 || local6.anInt6491 != Static135.anInt2898 && Static116.anInt2677 > 0) {
									local266 = false;
									local256 = false;
									local212 = false;
								}
								@Pc(681) int local681;
								if (local6.anInt6491 != 0) {
									if (local6.anInt6491 == Static452.anInt8509 || local6.anInt6491 == Static526.anInt3463) {
										Static320.aClass225_29 = local6;
										if (Static529.aClass215_1 != null) {
											Static529.aClass215_1.method5316(local6.anInt6521, Static440.aClass44_12);
										}
										if (local6.anInt6491 == Static452.anInt8509) {
											if (!Static49.aBoolean36 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static546.method7904(arg9, arg8, Static440.aClass44_12);
												for (@Pc(609) Class1_Sub6 local609 = (Class1_Sub6) Static110.aClass136_3.method3288(); local609 != null; local609 = (Class1_Sub6) Static110.aClass136_3.method3286()) {
													if (arg8 >= local609.anInt5071 && arg8 < local609.anInt5072 && arg9 >= local609.anInt5073 && arg9 < local609.anInt5074) {
														Static10.method173();
														Static510.method2778(local609.aClass1_Sub4_Sub2_Sub1_1);
													}
												}
											}
											Static272.method4722(local6, local17, local22);
											continue;
										}
									}
									@Pc(720) int local720;
									if (local6.anInt6491 == Static80.anInt9683) {
										if (local6.method5508(Static440.aClass44_12) == null || Static574.anInt10047 != 0 && Static574.anInt10047 != 3 || Static49.aBoolean36 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local307 = arg8 - local17;
										local681 = arg9 - local22;
										local441 = local6.anIntArray331[local681];
										if (local307 < local441 || local307 > local441 + local6.anIntArray325[local681]) {
											continue;
										}
										local307 -= local6.anInt6529 / 2;
										local681 -= local6.anInt6521 / 2;
										if (Static166.anInt3419 == 4) {
											local720 = (int) Static201.aFloat128 & 0x3FFF;
										} else {
											local720 = (int) Static201.aFloat128 + Static368.anInt7167 & 0x3FFF;
										}
										@Pc(732) int local732 = Class4_Sub27.anIntArray296[local720];
										@Pc(736) int local736 = Class4_Sub27.anIntArray297[local720];
										if (Static166.anInt3419 != 4) {
											local732 = local732 * (Static595.anInt10298 + 256) >> 8;
											local736 = local736 * (Static595.anInt10298 + 256) >> 8;
										}
										@Pc(765) int local765 = local681 * local732 + local307 * local736 >> 14;
										@Pc(775) int local775 = local681 * local736 - local307 * local732 >> 14;
										@Pc(786) int local786;
										@Pc(794) int local794;
										if (Static166.anInt3419 == 4) {
											local786 = (Static413.anInt8208 >> 9) + (local765 >> 2);
											local794 = (Static339.anInt6576 >> 9) - (local775 >> 2);
										} else {
											@Pc(803) int local803 = (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6925() - 1) * 256;
											local786 = (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 - local803 >> 9) + (local765 >> 2);
											local794 = (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 - local803 >> 9) - (local775 >> 2);
										}
										if (Static418.aBoolean541 && (Static163.anInt3317 & 0x40) != 0) {
											@Pc(836) Class225 local836 = Static24.method318(Static7.anInt173, Static317.anInt10281);
											if (local836 == null) {
												Static419.method6558();
											} else {
												Static369.method5938(1L, 57, false, local6.anInt6527, Static397.anInt7611, local794, Static152.aString28, local786, true, " ->");
											}
											continue;
										}
										if (Static438.aClass92_4 == Static264.aClass92_3) {
											Static369.method5938(1L, 17, false, -1, -1, local794, Static590.aClass364_31.method8334(Static154.anInt3181), local786, true, "");
										}
										Static369.method5938(1L, 60, false, -1, Static410.anInt7776, local794, Static478.aString85, local786, true, "");
										continue;
									}
									if (local6.anInt6491 == Static135.anInt2898) {
										Static136.aClass225_14 = local6;
										if (local212) {
											Static517.aBoolean648 = true;
										}
										if (local266) {
											local307 = (int) ((double) (local271.method3495() - local17 - local6.anInt6529 / 2) * 2.0D / (double) Static455.aFloat121);
											local681 = (int) -((double) (local271.method3498() - local22 - local6.anInt6521 / 2) * 2.0D / (double) Static455.aFloat121);
											local441 = Static529.anInt9422 + local307 + Static455.anInt3448;
											local720 = Static480.anInt10076 + local681 + Static455.anInt3450;
											@Pc(950) Class4_Sub5_Sub8 local950 = Static383.method6075();
											if (local950 == null) {
												continue;
											}
											@Pc(955) int[] local955 = new int[3];
											local950.method3441(local441, local955, local720);
											if (local955 != null) {
												if (Static584.aClass154_1.method3569(82) && Static204.anInt8827 > 0) {
													Static326.method5358(local955[2], local955[1], local955[0]);
													continue;
												}
												Static145.aBoolean271 = true;
												Static215.anInt4009 = local955[0];
												Static215.anInt4006 = local955[1];
												Static111.anInt2629 = local955[2];
											}
											Static116.anInt2677 = 1;
											Static290.aBoolean440 = false;
											Static255.anInt4672 = Static172.aClass135_1.method6370();
											Static323.anInt6277 = Static172.aClass135_1.method6378();
											continue;
										}
										if (local256 && Static116.anInt2677 > 0) {
											if (Static116.anInt2677 == 1 && (Static255.anInt4672 != Static172.aClass135_1.method6370() || Static323.anInt6277 != Static172.aClass135_1.method6378())) {
												Static334.anInt6424 = Static529.anInt9422;
												Static445.anInt8288 = Static480.anInt10076;
												Static116.anInt2677 = 2;
											}
											if (Static116.anInt2677 == 2) {
												Static290.aBoolean440 = true;
												Static555.method8028(Static334.anInt6424 + (int) ((double) (Static255.anInt4672 - Static172.aClass135_1.method6370()) * 2.0D / (double) Static455.aFloat120));
												Static466.method7860(Static445.anInt8288 - (int) ((double) (Static323.anInt6277 - Static172.aClass135_1.method6378()) * 2.0D / (double) Static455.aFloat120));
											}
											continue;
										}
										if (Static116.anInt2677 > 0 && !Static290.aBoolean440) {
											if ((Static297.anInt6005 == 1 || Static400.method6306()) && Static339.anInt6583 > 2) {
												Static41.method502(Static323.anInt6277, Static255.anInt4672);
											} else if (Static220.method3589()) {
												Static41.method502(Static323.anInt6277, Static255.anInt4672);
											}
										}
										Static116.anInt2677 = 0;
										continue;
									}
									if (local6.anInt6491 == Static246.anInt4514) {
										if (local256) {
											Static88.method2070(local6.anInt6529, local6.anInt6521, Static172.aClass135_1.method6378() - local22, Static172.aClass135_1.method6370() - local17);
										}
										continue;
									}
									if (local6.anInt6491 == Static394.anInt7576) {
										Static182.method3246(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean471 && local266) {
									local6.aBoolean471 = true;
									if (local6.anObjectArray23 != null) {
										local526 = new Class4_Sub25();
										local526.aBoolean319 = true;
										local526.aClass225_21 = local6;
										local526.anInt4397 = local271.method3495() - local17;
										local526.anInt4393 = local271.method3498() - local22;
										local526.anObjectArray1 = local6.anObjectArray23;
										Static525.aClass244_59.method5960(local526);
									}
								}
								if (local6.aBoolean471 && local256 && local6.anObjectArray20 != null) {
									local526 = new Class4_Sub25();
									local526.aBoolean319 = true;
									local526.aClass225_21 = local6;
									local526.anInt4397 = Static172.aClass135_1.method6370() - local17;
									local526.anInt4393 = Static172.aClass135_1.method6378() - local22;
									local526.anObjectArray1 = local6.anObjectArray20;
									Static525.aClass244_59.method5960(local526);
								}
								if (local6.aBoolean471 && !local256) {
									local6.aBoolean471 = false;
									if (local6.anObjectArray8 != null) {
										local526 = new Class4_Sub25();
										local526.aBoolean319 = true;
										local526.aClass225_21 = local6;
										local526.anInt4397 = Static172.aClass135_1.method6370() - local17;
										local526.anInt4393 = Static172.aClass135_1.method6378() - local22;
										local526.anObjectArray1 = local6.anObjectArray8;
										Static60.aClass244_5.method5960(local526);
									}
								}
								if (local256 && local6.anObjectArray26 != null) {
									local526 = new Class4_Sub25();
									local526.aBoolean319 = true;
									local526.aClass225_21 = local6;
									local526.anInt4397 = Static172.aClass135_1.method6370() - local17;
									local526.anInt4393 = Static172.aClass135_1.method6378() - local22;
									local526.anObjectArray1 = local6.anObjectArray26;
									Static525.aClass244_59.method5960(local526);
								}
								if (!local6.aBoolean482 && local212) {
									local6.aBoolean482 = true;
									if (local6.anObjectArray30 != null) {
										local526 = new Class4_Sub25();
										local526.aBoolean319 = true;
										local526.aClass225_21 = local6;
										local526.anInt4397 = Static172.aClass135_1.method6370() - local17;
										local526.anInt4393 = Static172.aClass135_1.method6378() - local22;
										local526.anObjectArray1 = local6.anObjectArray30;
										Static525.aClass244_59.method5960(local526);
									}
								}
								if (local6.aBoolean482 && local212 && local6.anObjectArray11 != null) {
									local526 = new Class4_Sub25();
									local526.aBoolean319 = true;
									local526.aClass225_21 = local6;
									local526.anInt4397 = Static172.aClass135_1.method6370() - local17;
									local526.anInt4393 = Static172.aClass135_1.method6378() - local22;
									local526.anObjectArray1 = local6.anObjectArray11;
									Static525.aClass244_59.method5960(local526);
								}
								if (local6.aBoolean482 && !local212) {
									local6.aBoolean482 = false;
									if (local6.anObjectArray28 != null) {
										local526 = new Class4_Sub25();
										local526.aBoolean319 = true;
										local526.aClass225_21 = local6;
										local526.anInt4397 = Static172.aClass135_1.method6370() - local17;
										local526.anInt4393 = Static172.aClass135_1.method6378() - local22;
										local526.anObjectArray1 = local6.anObjectArray28;
										Static60.aClass244_5.method5960(local526);
									}
								}
								if (local6.anObjectArray9 != null) {
									local526 = new Class4_Sub25();
									local526.aClass225_21 = local6;
									local526.anObjectArray1 = local6.anObjectArray9;
									Static61.aClass244_6.method5960(local526);
								}
								@Pc(1494) Class4_Sub25 local1494;
								if (local6.anObjectArray21 != null && Static328.anInt6327 > local6.anInt6554) {
									if (local6.anIntArray332 == null || Static328.anInt6327 - local6.anInt6554 > 32) {
										local526 = new Class4_Sub25();
										local526.aClass225_21 = local6;
										local526.anObjectArray1 = local6.anObjectArray21;
										Static525.aClass244_59.method5960(local526);
									} else {
										label683: for (local307 = local6.anInt6554; local307 < Static328.anInt6327; local307++) {
											local681 = Static58.anIntArray36[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray332.length; local441++) {
												if (local6.anIntArray332[local441] == local681) {
													local1494 = new Class4_Sub25();
													local1494.aClass225_21 = local6;
													local1494.anObjectArray1 = local6.anObjectArray21;
													Static525.aClass244_59.method5960(local1494);
													break label683;
												}
											}
										}
									}
									local6.anInt6554 = Static328.anInt6327;
								}
								if (local6.anObjectArray31 != null && Static11.anInt218 > local6.anInt6517) {
									if (local6.anIntArray330 == null || Static11.anInt218 - local6.anInt6517 > 32) {
										local526 = new Class4_Sub25();
										local526.aClass225_21 = local6;
										local526.anObjectArray1 = local6.anObjectArray31;
										Static525.aClass244_59.method5960(local526);
									} else {
										label659: for (local307 = local6.anInt6517; local307 < Static11.anInt218; local307++) {
											local681 = Static469.anIntArray475[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray330.length; local441++) {
												if (local6.anIntArray330[local441] == local681) {
													local1494 = new Class4_Sub25();
													local1494.aClass225_21 = local6;
													local1494.anObjectArray1 = local6.anObjectArray31;
													Static525.aClass244_59.method5960(local1494);
													break label659;
												}
											}
										}
									}
									local6.anInt6517 = Static11.anInt218;
								}
								if (local6.anObjectArray5 != null && Static532.anInt9484 > local6.anInt6547) {
									if (local6.anIntArray324 == null || Static532.anInt9484 - local6.anInt6547 > 32) {
										local526 = new Class4_Sub25();
										local526.aClass225_21 = local6;
										local526.anObjectArray1 = local6.anObjectArray5;
										Static525.aClass244_59.method5960(local526);
									} else {
										label635: for (local307 = local6.anInt6547; local307 < Static532.anInt9484; local307++) {
											local681 = Static246.anIntArray228[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray324.length; local441++) {
												if (local6.anIntArray324[local441] == local681) {
													local1494 = new Class4_Sub25();
													local1494.aClass225_21 = local6;
													local1494.anObjectArray1 = local6.anObjectArray5;
													Static525.aClass244_59.method5960(local1494);
													break label635;
												}
											}
										}
									}
									local6.anInt6547 = Static532.anInt9484;
								}
								if (local6.anObjectArray3 != null && Static552.anInt9807 > local6.anInt6532) {
									if (local6.anIntArray326 == null || Static552.anInt9807 - local6.anInt6532 > 32) {
										local526 = new Class4_Sub25();
										local526.aClass225_21 = local6;
										local526.anObjectArray1 = local6.anObjectArray3;
										Static525.aClass244_59.method5960(local526);
									} else {
										label611: for (local307 = local6.anInt6532; local307 < Static552.anInt9807; local307++) {
											local681 = Static453.anIntArray466[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray326.length; local441++) {
												if (local6.anIntArray326[local441] == local681) {
													local1494 = new Class4_Sub25();
													local1494.aClass225_21 = local6;
													local1494.anObjectArray1 = local6.anObjectArray3;
													Static525.aClass244_59.method5960(local1494);
													break label611;
												}
											}
										}
									}
									local6.anInt6532 = Static552.anInt9807;
								}
								if (local6.anObjectArray13 != null && Static264.anInt5062 > local6.anInt6536) {
									if (local6.anIntArray329 == null || Static264.anInt5062 - local6.anInt6536 > 32) {
										local526 = new Class4_Sub25();
										local526.aClass225_21 = local6;
										local526.anObjectArray1 = local6.anObjectArray13;
										Static525.aClass244_59.method5960(local526);
									} else {
										label587: for (local307 = local6.anInt6536; local307 < Static264.anInt5062; local307++) {
											local681 = Static306.anIntArray301[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray329.length; local441++) {
												if (local6.anIntArray329[local441] == local681) {
													local1494 = new Class4_Sub25();
													local1494.aClass225_21 = local6;
													local1494.anObjectArray1 = local6.anObjectArray13;
													Static525.aClass244_59.method5960(local1494);
													break label587;
												}
											}
										}
									}
									local6.anInt6536 = Static264.anInt5062;
								}
								if (Static450.anInt8504 > local6.anInt6515 && local6.anObjectArray33 != null) {
									local526 = new Class4_Sub25();
									local526.aClass225_21 = local6;
									local526.anObjectArray1 = local6.anObjectArray33;
									Static525.aClass244_59.method5960(local526);
								}
								if (Static341.anInt6623 > local6.anInt6515 && local6.anObjectArray22 != null) {
									local526 = new Class4_Sub25();
									local526.aClass225_21 = local6;
									local526.anObjectArray1 = local6.anObjectArray22;
									Static525.aClass244_59.method5960(local526);
								}
								if (Static74.anInt1244 > local6.anInt6515 && local6.anObjectArray18 != null) {
									local526 = new Class4_Sub25();
									local526.aClass225_21 = local6;
									local526.anObjectArray1 = local6.anObjectArray18;
									Static525.aClass244_59.method5960(local526);
								}
								if (Static502.anInt9043 > local6.anInt6515 && local6.anObjectArray32 != null) {
									local526 = new Class4_Sub25();
									local526.aClass225_21 = local6;
									local526.anObjectArray1 = local6.anObjectArray32;
									Static525.aClass244_59.method5960(local526);
								}
								if (Static284.anInt5784 > local6.anInt6515 && local6.anObjectArray19 != null) {
									local526 = new Class4_Sub25();
									local526.aClass225_21 = local6;
									local526.anObjectArray1 = local6.anObjectArray19;
									Static525.aClass244_59.method5960(local526);
								}
								local6.anInt6515 = Static436.anInt8161;
								if (local6.anObjectArray14 != null) {
									for (local307 = 0; local307 < Static114.anInt9774; local307++) {
										@Pc(1962) Class4_Sub25 local1962 = new Class4_Sub25();
										local1962.aClass225_21 = local6;
										local1962.anInt4392 = Static84.anInterface2Array2[local307].method5852();
										local1962.anInt4391 = Static84.anInterface2Array2[local307].method5851();
										local1962.anObjectArray1 = local6.anObjectArray14;
										Static525.aClass244_59.method5960(local1962);
									}
								}
								if (Static412.aBoolean536 && local6.anObjectArray15 != null) {
									local526 = new Class4_Sub25();
									local526.aClass225_21 = local6;
									local526.anObjectArray1 = local6.anObjectArray15;
									Static525.aClass244_59.method5960(local526);
								}
							}
							if (local6.anInt6508 == 5 && local6.anInt6564 != -1) {
								local6.method5519(Static419.aClass28_1, Static594.aClass170_1).method5316(local6.anInt6521, Static440.aClass44_12);
							}
							Static129.method2633(local6);
							if (local6.anInt6508 == 0) {
								method1178(arg0, local6.anInt6555, local28, local30, local32, local34, local17 - local6.anInt6485, local22 - local6.anInt6563, arg8, arg9);
								if (local6.aClass225Array1 != null) {
									method1178(local6.aClass225Array1, local6.anInt6555, local28, local30, local32, local34, local17 - local6.anInt6485, local22 - local6.anInt6563, arg8, arg9);
								}
								@Pc(2084) Class4_Sub37 local2084 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local6.anInt6555);
								if (local2084 != null) {
									if (Static438.aClass92_4 == Static248.aClass92_2 && local2084.anInt8142 == 0 && !Static49.aBoolean36 && local212 && !Static57.aBoolean43) {
										Static10.method173();
									}
									Static252.method4038(local34, local28, local17, local30, local22, arg8, arg9, local32, local2084.anInt8141);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static129.method2633(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!n;)Lclient!aba;")
	public static Class4_Sub2 method1180(@OriginalArg(0) Class225 arg0) {
		@Pc(13) Class4_Sub2 local13 = (Class4_Sub2) Static307.aClass350_24.method8207(((long) arg0.anInt6555 << 32) + (long) arg0.anInt6565);
		return local13 == null ? arg0.aClass4_Sub2_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!n;)Z")
	public static boolean method1181(@OriginalArg(0) Class225 arg0) {
		if (Static57.aBoolean43) {
			if (method1180(arg0).anInt156 != 0) {
				return false;
			}
			if (arg0.anInt6508 == 0) {
				return false;
			}
		}
		return arg0.aBoolean484;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!n;)Lclient!n;")
	public static Class225 method1182(@OriginalArg(0) Class225 arg0) {
		@Pc(4) int local4 = method1180(arg0).method126();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static490.method7272(arg0.anInt6559);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
