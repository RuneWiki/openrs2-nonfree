import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "Lclient!vg;")
	public static Class85 aClass85_11;

	@OriginalMember(owner = "client!od", name = "S", descriptor = "I")
	public static int anInt2474 = -1;

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1135 = Static32.method683("Unable to find ");

	@OriginalMember(owner = "client!od", name = "U", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1134 = aClass49_1135;

	@OriginalMember(owner = "client!od", name = "W", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "Lclient!eh;")
	public static Class25 aClass25_8 = new Class25(32);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIB)V")
	public static void method1992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static124.anInt2746 == 0 && !Static108.aBoolean93) {
			Static11.method162(arg1 - arg3, arg2 - arg0, Static25.aClass49_314, (short) 25, 0L, Static154.aClass49_1489);
		}
		@Pc(30) long local30 = -1L;
		for (@Pc(37) int local37 = 0; local37 < Static166.anInt1304; local37++) {
			@Pc(43) long local43 = Static166.aLongArray8[local37];
			@Pc(50) int local50 = (int) local43 >> 7 & 0x7F;
			@Pc(57) int local57 = Integer.MAX_VALUE & (int) (local43 >>> 32);
			@Pc(62) int local62 = (int) local43 & 0x7F;
			@Pc(69) int local69 = (int) local43 >> 29 & 0x3;
			if (local30 != local43) {
				local30 = local43;
				@Pc(188) int local188;
				if (local69 == 2 && Static31.method658(Static66.anInt1396, local62, local50, local43)) {
					@Pc(90) Class2_Sub2_Sub9 local90 = Static124.method2146(local57);
					if (local90.anIntArray177 != null) {
						local90 = local90.method1196();
					}
					if (local90 == null) {
						continue;
					}
					if (Static124.anInt2746 == 1) {
						Static11.method162(local50, local62, Static64.aClass49_696, (short) 31, local43, Static33.method692(new Class49[] { Static180.aClass49_1728, Static178.aClass49_1720, local90.aClass49_793 }));
					} else if (!Static108.aBoolean93) {
						@Pc(178) Class49[] local178 = local90.aClass49Array10;
						if (Static9.aBoolean10) {
							local178 = Static91.method1579(local178);
						}
						if (local178 != null) {
							for (local188 = 4; local188 >= 0; local188--) {
								if (local178[local188] != null) {
									@Pc(200) short local200 = 0;
									if (local188 == 0) {
										local200 = 58;
									}
									if (local188 == 1) {
										local200 = 19;
									}
									if (local188 == 2) {
										local200 = 23;
									}
									if (local188 == 3) {
										local200 = 40;
									}
									if (local188 == 4) {
										local200 = 1007;
									}
									Static11.method162(local50, local62, local178[local188], local200, local43, Static33.method692(new Class49[] { Static74.aClass49_803, local90.aClass49_793 }));
								}
							}
						}
						Static11.method162(local50, local62, Static51.aClass49_589, (short) 1006, (long) local90.anInt1495, Static33.method692(new Class49[] { Static74.aClass49_803, local90.aClass49_793 }));
					} else if ((Static138.anInt2937 & 0x4) == 4) {
						Static11.method162(local50, local62, Static103.aClass49_1026, (short) 50, local43, Static33.method692(new Class49[] { Static150.aClass49_1450, Static178.aClass49_1720, local90.aClass49_793 }));
					}
				}
				@Pc(309) int local309;
				@Pc(317) Class2_Sub2_Sub3_Sub7_Sub1 local317;
				@Pc(362) Class2_Sub2_Sub3_Sub7_Sub2 local362;
				if (local69 == 1) {
					@Pc(286) Class2_Sub2_Sub3_Sub7_Sub1 local286 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local57];
					if (local286.aClass2_Sub2_Sub15_1.anInt3209 == 1 && (local286.anInt3529 & 0x7F) == 64 && (local286.anInt3578 & 0x7F) == 64) {
						for (local309 = 0; local309 < Static1.anInt2; local309++) {
							local317 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[Static1.anIntArray1[local309]];
							if (local317 != null && local286 != local317 && local317.aClass2_Sub2_Sub15_1.anInt3209 == 1 && local317.anInt3529 == local286.anInt3529 && local317.anInt3578 == local286.anInt3578) {
								Static185.method3041(local62, local317.aClass2_Sub2_Sub15_1, local50, Static1.anIntArray1[local309]);
							}
						}
						for (local188 = 0; local188 < Static139.anInt2969; local188++) {
							local362 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[Static110.anIntArray221[local188]];
							if (local362 != null && local362.anInt3529 == local286.anInt3529 && local362.anInt3578 == local286.anInt3578) {
								Static127.method2160(Static110.anIntArray221[local188], local62, local362, local50);
							}
						}
					}
					Static185.method3041(local62, local286.aClass2_Sub2_Sub15_1, local50, local57);
				}
				if (local69 == 0) {
					@Pc(414) Class2_Sub2_Sub3_Sub7_Sub2 local414 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local57];
					if ((local414.anInt3529 & 0x7F) == 64 && (local414.anInt3578 & 0x7F) == 64) {
						for (local309 = 0; local309 < Static1.anInt2; local309++) {
							local317 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[Static1.anIntArray1[local309]];
							if (local317 != null && local317.aClass2_Sub2_Sub15_1.anInt3209 == 1 && local414.anInt3529 == local317.anInt3529 && local317.anInt3578 == local414.anInt3578) {
								Static185.method3041(local62, local317.aClass2_Sub2_Sub15_1, local50, Static1.anIntArray1[local309]);
							}
						}
						for (local188 = 0; local188 < Static139.anInt2969; local188++) {
							local362 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[Static110.anIntArray221[local188]];
							if (local362 != null && local414 != local362 && local362.anInt3529 == local414.anInt3529 && local362.anInt3578 == local414.anInt3578) {
								Static127.method2160(Static110.anIntArray221[local188], local62, local362, local50);
							}
						}
					}
					Static127.method2160(local57, local62, local414, local50);
				}
				if (local69 == 3) {
					@Pc(544) Class81 local544 = Static177.aClass81ArrayArrayArray1[Static66.anInt1396][local62][local50];
					if (local544 != null) {
						for (@Pc(551) Class2_Sub2_Sub3_Sub5 local551 = (Class2_Sub2_Sub3_Sub5) local544.method2678(); local551 != null; local551 = (Class2_Sub2_Sub3_Sub5) local544.method2685()) {
							@Pc(558) Class2_Sub2_Sub10 local558 = Static113.method1913(local551.anInt1391);
							if (Static124.anInt2746 == 1) {
								Static11.method162(local50, local62, Static64.aClass49_696, (short) 8, (long) local551.anInt1391, Static33.method692(new Class49[] { Static180.aClass49_1728, Static79.aClass49_1752, local558.aClass49_834 }));
							} else if (!Static108.aBoolean93) {
								@Pc(604) Class49[] local604 = local558.aClass49Array11;
								if (Static9.aBoolean10) {
									local604 = Static91.method1579(local604);
								}
								for (@Pc(612) int local612 = 4; local612 >= 0; local612--) {
									if (local604 != null && local604[local612] != null) {
										@Pc(626) byte local626 = 0;
										if (local612 == 0) {
											local626 = 30;
										}
										if (local612 == 1) {
											local626 = 2;
										}
										if (local612 == 2) {
											local626 = 13;
										}
										if (local612 == 3) {
											local626 = 49;
										}
										if (local612 == 4) {
											local626 = 47;
										}
										Static11.method162(local50, local62, local604[local612], local626, (long) local551.anInt1391, Static33.method692(new Class49[] { Static73.aClass49_797, local558.aClass49_834 }));
									} else if (local612 == 2) {
										Static11.method162(local50, local62, Static112.aClass49_1078, (short) 13, (long) local551.anInt1391, Static33.method692(new Class49[] { Static73.aClass49_797, local558.aClass49_834 }));
									}
								}
								Static11.method162(local50, local62, Static51.aClass49_589, (short) 1003, (long) local551.anInt1391, Static33.method692(new Class49[] { Static73.aClass49_797, local558.aClass49_834 }));
							} else if ((Static138.anInt2937 & 0x1) == 1) {
								Static11.method162(local50, local62, Static103.aClass49_1026, (short) 43, (long) local551.anInt1391, Static33.method692(new Class49[] { Static150.aClass49_1450, Static79.aClass49_1752, local558.aClass49_834 }));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
	public static void method1993() {
		Static170.aClass74_90.method2347();
		Static171.aClass74_94.method2347();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V")
	public static void method1994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(22) long local22 = Static17.method2057(arg0, arg4, arg1);
		@Pc(35) int local35;
		@Pc(47) int local47;
		@Pc(37) int local37;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (local22 != 0L) {
			local35 = (int) local22 >> 20 & 0x3;
			local37 = arg3;
			@Pc(40) int[] local40 = Static120.aClass2_Sub2_Sub2_Sub3_5.anIntArray191;
			local47 = (int) local22 >> 14 & 0x1F;
			if (local22 > 0L) {
				local37 = arg2;
			}
			local68 = (52736 - arg1 * 512) * 4 + arg4 * 4 + 24624;
			local75 = Integer.MAX_VALUE & (int) (local22 >>> 32);
			@Pc(81) Class2_Sub2_Sub9 local81 = Static124.method2146(local75);
			if (local81.anInt1503 == -1) {
				if (local47 == 0 || local47 == 2) {
					if (local35 == 0) {
						local40[local68] = local37;
						local40[local68 + 512] = local37;
						local40[local68 + 1024] = local37;
						local40[local68 + 1536] = local37;
					} else if (local35 == 1) {
						local40[local68] = local37;
						local40[local68 + 1] = local37;
						local40[local68 + 2] = local37;
						local40[local68 + 3] = local37;
					} else if (local35 == 2) {
						local40[local68 + 3] = local37;
						local40[local68 + 515] = local37;
						local40[local68 + 1027] = local37;
						local40[local68 + 3 + 1536] = local37;
					} else if (local35 == 3) {
						local40[local68 + 1536] = local37;
						local40[local68 + 1 + 1536] = local37;
						local40[local68 + 1536 + 2] = local37;
						local40[local68 + 3 + 1536] = local37;
					}
				}
				if (local47 == 3) {
					if (local35 == 0) {
						local40[local68] = local37;
					} else if (local35 == 1) {
						local40[local68 + 3] = local37;
					} else if (local35 == 2) {
						local40[local68 + 1539] = local37;
					} else if (local35 == 3) {
						local40[local68 + 1536] = local37;
					}
				}
				if (local47 == 2) {
					if (local35 == 3) {
						local40[local68] = local37;
						local40[local68 + 512] = local37;
						local40[local68 + 1024] = local37;
						local40[local68 + 1536] = local37;
					} else if (local35 == 0) {
						local40[local68] = local37;
						local40[local68 + 1] = local37;
						local40[local68 + 2] = local37;
						local40[local68 + 3] = local37;
					} else if (local35 == 1) {
						local40[local68 + 3] = local37;
						local40[local68 + 515] = local37;
						local40[local68 + 1024 + 3] = local37;
						local40[local68 + 1536 + 3] = local37;
					} else if (local35 == 2) {
						local40[local68 + 1536] = local37;
						local40[local68 + 1536 + 1] = local37;
						local40[local68 + 1538] = local37;
						local40[local68 + 1536 + 3] = local37;
					}
				}
			} else {
				@Pc(90) Class2_Sub2_Sub2_Sub2 local90 = Static43.aClass2_Sub2_Sub2_Sub2Array4[local81.anInt1503];
				if (local90 != null) {
					@Pc(103) int local103 = (local81.anInt1482 * 4 - local90.anInt878) / 2;
					@Pc(113) int local113 = (local81.anInt1480 * 4 - local90.anInt881) / 2;
					local90.method722(arg4 * 4 + local103 + 48, local113 + (-local81.anInt1480 + 104 + -arg1) * 4 + 48);
				}
			}
		}
		local22 = Static156.method2642(arg0, arg4, arg1);
		if (local22 != 0L) {
			local47 = (int) local22 >> 14 & 0x1F;
			local35 = (int) local22 >> 20 & 0x3;
			local37 = Integer.MAX_VALUE & (int) (local22 >>> 32);
			@Pc(484) Class2_Sub2_Sub9 local484 = Static124.method2146(local37);
			@Pc(517) int local517;
			if (local484.anInt1503 != -1) {
				@Pc(494) Class2_Sub2_Sub2_Sub2 local494 = Static43.aClass2_Sub2_Sub2_Sub2Array4[local484.anInt1503];
				if (local494 != null) {
					local75 = (local484.anInt1482 * 4 - local494.anInt878) / 2;
					local517 = (local484.anInt1480 * 4 - local494.anInt881) / 2;
					local494.method722(arg4 * 4 + local75 + 48, (-local484.anInt1480 + 104 - arg1) * 4 + 48 + local517);
				}
			} else if (local47 == 9) {
				local68 = 15658734;
				local517 = (52736 - arg1 * 512) * 4 + arg4 * 4 + 24624;
				if (local22 > 0L) {
					local68 = 15597568;
				}
				@Pc(573) int[] local573 = Static120.aClass2_Sub2_Sub2_Sub3_5.anIntArray191;
				if (local35 == 0 || local35 == 2) {
					local573[local517 + 1536] = local68;
					local573[local517 + 1 + 1024] = local68;
					local573[local517 + 512 + 2] = local68;
					local573[local517 + 3] = local68;
				} else {
					local573[local517] = local68;
					local573[local517 + 512 + 1] = local68;
					local573[local517 + 2 + 1024] = local68;
					local573[local517 + 1536 + 3] = local68;
				}
			}
		}
		local22 = Static71.method1174(arg0, arg4, arg1);
		if (local22 == 0L) {
			return;
		}
		local35 = (int) (local22 >>> 32) & Integer.MAX_VALUE;
		@Pc(660) Class2_Sub2_Sub9 local660 = Static124.method2146(local35);
		if (local660.anInt1503 == -1) {
			return;
		}
		@Pc(670) Class2_Sub2_Sub2_Sub2 local670 = Static43.aClass2_Sub2_Sub2_Sub2Array4[local660.anInt1503];
		if (local670 != null) {
			@Pc(683) int local683 = (local660.anInt1482 * 4 - local670.anInt878) / 2;
			local68 = (local660.anInt1480 * 4 - local670.anInt881) / 2;
			local670.method722(local683 + arg4 * 4 + 48, (-local660.anInt1480 + -arg1 + 104) * 4 + 48 + local68);
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!nf;IIIIIII)V")
	public static void method1995(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static17.anInt2522;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static128.anInt2775;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static27.anIntArrayArrayArray2[arg1][arg6][arg7] - Static156.anInt3422;
		@Pc(49) int local49 = Static27.anIntArrayArrayArray2[arg1][arg6 + 1][arg7] - Static156.anInt3422;
		@Pc(63) int local63 = Static27.anIntArrayArrayArray2[arg1][arg6 + 1][arg7 + 1] - Static156.anInt3422;
		@Pc(75) int local75 = Static27.anIntArrayArrayArray2[arg1][arg6][arg7 + 1] - Static156.anInt3422;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static109.anInt2279 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static109.anInt2281 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static109.anInt2279 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static109.anInt2281 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static109.anInt2279 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static109.anInt2281 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static109.anInt2279 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static109.anInt2281 + (local85 << 9) / local261;
		Static109.anInt2278 = 0;
		@Pc(467) int local467;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static113.aBoolean102 && Static131.method2841(Static31.anInt817, Static155.anInt3387, local315, local331, local299, local307, local323, local291)) {
				Static8.anInt2220 = arg6;
				Static29.anInt698 = arg7;
			}
			Static109.aBoolean97 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static109.anInt2285 || local323 > Static109.anInt2285 || local291 > Static109.anInt2285) {
				Static109.aBoolean97 = true;
			}
			if (arg0.anInt2323 == -1) {
				if (arg0.anInt2317 != 12345678) {
					Static109.method1867(local315, local331, local299, local307, local323, local291, arg0.anInt2317, arg0.anInt2322, arg0.anInt2314);
				}
			} else if (Static171.aBoolean156) {
				local467 = Static109.anInterface1_2.method188(arg0.anInt2323);
				Static109.method1867(local315, local331, local299, local307, local323, local291, Static123.method2141(local467, arg0.anInt2317), Static123.method2141(local467, arg0.anInt2322), Static123.method2141(local467, arg0.anInt2314));
			} else if (arg0.aBoolean101) {
				Static109.method1880(local315, local331, local299, local307, local323, local291, arg0.anInt2317, arg0.anInt2322, arg0.anInt2314, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2323);
			} else {
				Static109.method1880(local315, local331, local299, local307, local323, local291, arg0.anInt2317, arg0.anInt2322, arg0.anInt2314, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt2323);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static113.aBoolean102 && Static131.method2841(Static31.anInt817, Static155.anInt3387, local283, local299, local331, local275, local291, local323)) {
			Static8.anInt2220 = arg6;
			Static29.anInt698 = arg7;
		}
		Static109.aBoolean97 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static109.anInt2285 || local291 > Static109.anInt2285 || local323 > Static109.anInt2285) {
			Static109.aBoolean97 = true;
		}
		if (arg0.anInt2323 != -1) {
			if (!Static171.aBoolean156) {
				Static109.method1880(local283, local299, local331, local275, local291, local323, arg0.anInt2319, arg0.anInt2314, arg0.anInt2322, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2323);
				return;
			}
			local467 = Static109.anInterface1_2.method188(arg0.anInt2323);
			Static109.method1867(local283, local299, local331, local275, local291, local323, Static123.method2141(local467, arg0.anInt2319), Static123.method2141(local467, arg0.anInt2314), Static123.method2141(local467, arg0.anInt2322));
		} else if (arg0.anInt2319 != 12345678) {
			Static109.method1867(local283, local299, local331, local275, local291, local323, arg0.anInt2319, arg0.anInt2314, arg0.anInt2322);
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public static void method1996() {
		aClass25_8 = null;
		aClass85_11 = null;
		aClass49_1134 = null;
		aClass49_1135 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1997(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub13 local8 = new Class2_Sub13(arg0);
		@Pc(12) int local12 = local8.method2962();
		@Pc(21) int local21 = local8.method2946();
		if (local21 < 0 || Static58.anInt1241 != 0 && Static58.anInt1241 < local21) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(50) byte[] local50 = new byte[local21];
			local8.method2947(local50, local21);
			return local50;
		} else {
			@Pc(62) int local62 = local8.method2946();
			if (local62 < 0 || Static58.anInt1241 != 0 && local62 > Static58.anInt1241) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local62];
			if (local12 == 1) {
				Static97.method1678(local79, local62, arg0, local21);
			} else {
				Static185.aClass19_1.method760(local8, local79);
			}
			return local79;
		}
	}
}
