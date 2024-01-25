import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!vv;")
	public static final Class376 aClass376_8 = new Class376();

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!vea;")
	public static final Class363 aClass363_13 = new Class363(3);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)I")
	public static int method7620() {
		return 16;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)I")
	public static int method7621(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(51) double local51 = local14;
		if (local14 < local23) {
			local51 = local23;
		}
		if (local51 < local30) {
			local51 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local51 + local32) / 2.0D;
		if (local32 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local32) / (local32 + local51);
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local32) / (2.0D - local32 - local51);
			}
			if (local14 == local51) {
				local65 = (local23 - local30) / (local51 - local32);
			} else if (local51 == local23) {
				local65 = (local30 - local14) / (-local32 + local51) + 2.0D;
			} else if (local30 == local51) {
				local65 = (local14 - local23) / (local51 - local32) + 4.0D;
			}
		}
		local65 /= 6.0D;
		@Pc(162) int local162 = (int) (local65 * 256.0D);
		@Pc(167) int local167 = (int) (local67 * 256.0D);
		if (local167 < 0) {
			local167 = 0;
		} else if (local167 > 255) {
			local167 = 255;
		}
		@Pc(188) int local188 = (int) (local73 * 256.0D);
		if (local188 < 0) {
			local188 = 0;
		} else if (local188 > 255) {
			local188 = 255;
		}
		if (local188 > 243) {
			local167 >>= 0x4;
		} else if (local188 > 217) {
			local167 >>= 0x3;
		} else if (local188 > 192) {
			local167 >>= 0x2;
		} else if (local188 > 179) {
			local167 >>= 0x1;
		}
		return (local188 >> 1) + (((local162 & 0xFF) >> 2 << 10) + (local167 >> 5 << 7));
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ha;BI)Z")
	public static boolean method7622(@OriginalArg(0) Class137 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static26.anInt462 - 104) / 2;
		@Pc(17) int local17 = (Static445.anInt6140 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static169.method2765(local21, local29, local25, arg1)) {
						local40 = local29;
						if (Static329.method5158(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static474.method1892(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(89) int[] local89 = new int[262144];
		for (local29 = 0; local29 < local89.length; local29++) {
			local89[local29] = -16777216;
		}
		Static659.aClass20_37 = arg0.method7885(512, 512, local89, 512);
		Static364.method5497();
		local40 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(160) int local160 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(179) int local179 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(191) boolean[][] local191 = new boolean[Static60.anInt1434 + 1 + 2][Static60.anInt1434 + 2 + 1];
		@Pc(197) int local197;
		@Pc(201) int local201;
		@Pc(203) int local203;
		@Pc(205) int local205;
		@Pc(211) int local211;
		@Pc(218) int local218;
		@Pc(226) int local226;
		@Pc(253) int local253;
		@Pc(257) int local257;
		@Pc(315) int local315;
		@Pc(322) int local322;
		@Pc(327) int local327;
		@Pc(346) int local346;
		for (@Pc(193) int local193 = local11; local193 < local11 + 104; local193 += Static60.anInt1434) {
			for (local197 = local17; local197 < local17 + 104; local197 += Static60.anInt1434) {
				local201 = 0;
				local203 = 0;
				local205 = local193;
				if (local193 > 0) {
					local205 = local193 - 1;
					local201 += 4;
				}
				local211 = local197;
				if (local197 > 0) {
					local211 = local197 - 1;
				}
				local218 = Static60.anInt1434 + local193;
				if (local218 < 104) {
					local218++;
				}
				local226 = Static60.anInt1434 + local197;
				if (local226 < 104) {
					local203 += 4;
					local226++;
				}
				arg0.KA(0, 0, Static60.anInt1434 * 4 + local201, local203 - -(Static60.anInt1434 * 4));
				arg0.GA(-16777216);
				@Pc(261) int local261;
				for (local253 = arg1; local253 <= 3; local253++) {
					for (local257 = 0; local257 <= Static60.anInt1434; local257++) {
						for (local261 = 0; local261 <= Static60.anInt1434; local261++) {
							local191[local257][local261] = Static169.method2765(local205 + local257, local253, local261 + local211, arg1);
						}
					}
					Static343.aClass51Array1[local253].method7863(local205, local211, local218, local226, local191);
					if (!Static580.aBoolean705) {
						for (local261 = -4; local261 < Static60.anInt1434; local261++) {
							for (local315 = -4; local315 < Static60.anInt1434; local315++) {
								local322 = local193 + local261;
								local327 = local197 + local315;
								if (local322 >= local11 && local327 >= local17 && Static169.method2765(local322, local253, local327, arg1)) {
									local346 = local253;
									if (Static329.method5158(local327, local322)) {
										local346 = local253 - 1;
									}
									if (local346 >= 0) {
										Static244.method3636(local346, local160, local322, local40, local327, local261 * 4 + local201, local203 - -((Static60.anInt1434 - local315) * 4) - 4, arg0);
									}
								}
							}
						}
					}
				}
				if (Static580.aBoolean705) {
					@Pc(395) Class226 local395 = Static226.aClass226Array3[arg1];
					for (local261 = 0; local261 < Static60.anInt1434; local261++) {
						for (local315 = 0; local315 < Static60.anInt1434; local315++) {
							local322 = local193 + local261;
							local327 = local197 + local315;
							local346 = local395.anIntArrayArray39[local322 - local395.anInt6536][local327 - local395.anInt6545];
							if ((local346 & 0x40240000) != 0) {
								arg0.method7869(local201 + local261 * 4, 4, -1713569622, (Static60.anInt1434 - local315) * 4 + local203 - 4, 4);
							} else if ((local346 & 0x800000) != 0) {
								arg0.method7891(4, (Static60.anInt1434 - local315) * 4 + local203 - 4, -1713569622, local201 + local261 * 4);
							} else if ((local346 & 0x2000000) != 0) {
								arg0.method7947(local261 * 4 + local201 + 3, 4, local203 + (Static60.anInt1434 + -local315) * 4 - 4, -1713569622);
							} else if ((local346 & 0x8000000) != 0) {
								arg0.method7891(4, (Static60.anInt1434 - local315) * 4 + local203 - 1, -1713569622, local201 + local261 * 4);
							} else if ((local346 & 0x20000000) != 0) {
								arg0.method7947(local261 * 4 + local201, 4, (Static60.anInt1434 - local315) * 4 + local203 - 4, -1713569622);
							}
						}
					}
				}
				arg0.aa(local201, local203, Static60.anInt1434 * 4, Static60.anInt1434 * 4, local179, 2);
				Static659.aClass20_37.method7395((local193 - local11) * 4 + 48, -(Static60.anInt1434 * 4) + 464 - (-local17 + local197) * 4, Static60.anInt1434 * 4, Static60.anInt1434 * 4, local201, local203);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static31.method720();
		Static547.anInt9326 = 0;
		Static456.aClass262_46.method6316();
		if (!Static580.aBoolean705) {
			for (local197 = local11; local197 < local11 + 104; local197++) {
				for (local201 = local17; local201 < local17 + 104; local201++) {
					for (local203 = arg1; arg1 + 1 >= local203 && local203 <= 3; local203++) {
						if (Static169.method2765(local197, local203, local201, arg1)) {
							@Pc(686) Interface19 local686 = (Interface19) Static430.method6312(local203, local197, local201);
							if (local686 == null) {
								local686 = (Interface19) Static595.method8438(local203, local197, local201, nq.class);
							}
							if (local686 == null) {
								local686 = (Interface19) Static622.method8738(local203, local197, local201);
							}
							if (local686 == null) {
								local686 = (Interface19) Static385.method5716(local203, local197, local201);
							}
							if (local686 != null) {
								@Pc(727) Class203 local727 = Static511.aClass13_2.method86(local686.method9171());
								if (!local727.aBoolean422 || Static377.aBoolean495) {
									local218 = local727.anInt6009;
									if (local727.anIntArray440 != null) {
										for (local226 = 0; local226 < local727.anIntArray440.length; local226++) {
											if (local727.anIntArray440[local226] != -1) {
												@Pc(756) Class203 local756 = Static511.aClass13_2.method86(local727.anIntArray440[local226]);
												if (local756.anInt6009 >= 0) {
													local218 = local756.anInt6009;
												}
											}
										}
									}
									if (local218 >= 0) {
										@Pc(775) boolean local775 = false;
										if (local218 >= 0) {
											@Pc(782) Class42 local782 = Static196.aClass116_2.method2783(local218);
											if (local782 != null && local782.aBoolean103) {
												local775 = true;
											}
										}
										local253 = local197;
										local257 = local201;
										if (local775) {
											@Pc(800) int[][] local800 = Static226.aClass226Array3[local203].anIntArrayArray39;
											local315 = Static226.aClass226Array3[local203].anInt6536;
											local322 = Static226.aClass226Array3[local203].anInt6545;
											for (local327 = 0; local327 < 10; local327++) {
												local346 = (int) (Math.random() * 4.0D);
												if (local346 == 0 && local11 < local253 && local253 > local197 - 3 && (local800[local253 - local315 - 1][local257 - local322] & 0x2C0108) == 0) {
													local253--;
												}
												if (local346 == 1 && local253 < local11 + 104 - 1 && local253 < local197 + 3 && (local800[local253 + 1 - local315][local257 - local322] & 0x2C0180) == 0) {
													local253++;
												}
												if (local346 == 2 && local257 > local17 && local201 - 3 < local257 && (local800[local253 - local315][local257 - local322 - 1] & 0x2C0102) == 0) {
													local257--;
												}
												if (local346 == 3 && local17 + 104 - 1 > local257 && local257 < local201 + 3 && (local800[local253 - local315][local257 + 1 - local322] & 0x2C0120) == 0) {
													local257++;
												}
											}
										}
										Static222.anIntArray328[Static547.anInt9326] = local727.anInt6014;
										Static609.anIntArray750[Static547.anInt9326] = local253;
										Static673.anIntArray824[Static547.anInt9326] = local257;
										Static547.anInt9326++;
									}
								}
							}
						}
					}
				}
			}
			if (Static628.aClass294_3 != null) {
				Static634.aClass386_134.anInt11070 = 1;
				Static196.aClass116_2.method2789(1024, 64);
				for (local201 = 0; local201 < Static628.aClass294_3.anInt8833; local201++) {
					local203 = Static628.aClass294_3.anIntArray654[local201];
					if (local203 >> 28 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146) {
						local205 = (local203 >> 14 & 0x3FFF) - Static329.anInt6225;
						local211 = (local203 & 0x3FFF) - Static202.anInt3755;
						if (local205 >= 0 && Static26.anInt462 > local205 && local211 >= 0 && local211 < Static445.anInt6140) {
							Static456.aClass262_46.method6314(new Class14_Sub18(local201));
						} else {
							@Pc(1085) Class42 local1085 = Static196.aClass116_2.method2783(Static628.aClass294_3.anIntArray655[local201]);
							if (local1085.anIntArray91 != null && local1085.anInt1288 + local205 >= 0 && Static26.anInt462 > local1085.anInt1306 + local205 && local211 + local1085.anInt1292 >= 0 && Static445.anInt6140 > local1085.anInt1298 + local211) {
								Static456.aClass262_46.method6314(new Class14_Sub18(local201));
							}
						}
					}
				}
				Static196.aClass116_2.method2789(128, 64);
				Static634.aClass386_134.anInt11070 = 2;
				Static634.aClass386_134.method9197();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIILclient!mb;IIIII)Z")
	public static boolean method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class226 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg7;
		@Pc(18) int local18 = arg5 - 64;
		Static533.anIntArrayArray51[64][64] = 99;
		@Pc(29) int local29 = arg7 - 64;
		Static323.anIntArrayArray37[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static669.anIntArray823[0] = arg5;
		@Pc(46) int local46 = local37 + 1;
		Static1.anIntArray748[0] = arg7;
		@Pc(51) int[][] local51 = arg4.anIntArrayArray39;
		while (local39 != local46) {
			local9 = Static1.anIntArray748[local39];
			local7 = Static669.anIntArray823[local39];
			@Pc(74) int local74 = local7 - local18;
			@Pc(80) int local80 = local9 - arg4.anInt6545;
			local39 = local39 + 1 & 0xFFF;
			@Pc(91) int local91 = local9 - local29;
			@Pc(96) int local96 = local7 - arg4.anInt6536;
			if (arg9 == -4) {
				if (arg1 == local7 && arg8 == local9) {
					Static437.anInt7796 = local7;
					Static71.anInt1587 = local9;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static89.method1687(local7, 1, arg8, local9, 1, arg1, arg0, arg2)) {
					Static71.anInt1587 = local9;
					Static437.anInt7796 = local7;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg4.method5375(local9, 1, arg2, arg1, arg6, local7, arg8, arg0, 1)) {
					Static71.anInt1587 = local9;
					Static437.anInt7796 = local7;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg4.method5367(arg8, arg2, 1, arg0, local7, local9, arg1, arg6)) {
					Static71.anInt1587 = local9;
					Static437.anInt7796 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg4.method5365(1, local9, arg8, local7, arg3, arg1, arg9)) {
					Static437.anInt7796 = local7;
					Static71.anInt1587 = local9;
					return true;
				}
			} else if (arg4.method5372(1, arg8, arg9, local9, local7, arg1, arg3)) {
				Static437.anInt7796 = local7;
				Static71.anInt1587 = local9;
				return true;
			}
			@Pc(248) int local248 = Static323.anIntArrayArray37[local74][local91] + 1;
			if (local74 > 0 && Static533.anIntArrayArray51[local74 - 1][local91] == 0 && (local51[local96 - 1][local80] & 0x42240000) == 0) {
				Static669.anIntArray823[local46] = local7 - 1;
				Static1.anIntArray748[local46] = local9;
				Static533.anIntArrayArray51[local74 - 1][local91] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local74 - 1][local91] = local248;
			}
			if (local74 < 127 && Static533.anIntArrayArray51[local74 + 1][local91] == 0 && (local51[local96 + 1][local80] & 0x60240000) == 0) {
				Static669.anIntArray823[local46] = local7 + 1;
				Static1.anIntArray748[local46] = local9;
				Static533.anIntArrayArray51[local74 + 1][local91] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local74 + 1][local91] = local248;
			}
			if (local91 > 0 && Static533.anIntArrayArray51[local74][local91 - 1] == 0 && (local51[local96][local80 - 1] & 0x40A40000) == 0) {
				Static669.anIntArray823[local46] = local7;
				Static1.anIntArray748[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static533.anIntArrayArray51[local74][local91 - 1] = 1;
				Static323.anIntArrayArray37[local74][local91 - 1] = local248;
			}
			if (local91 < 127 && Static533.anIntArrayArray51[local74][local91 + 1] == 0 && (local51[local96][local80 + 1] & 0x48240000) == 0) {
				Static669.anIntArray823[local46] = local7;
				Static1.anIntArray748[local46] = local9 + 1;
				Static533.anIntArrayArray51[local74][local91 + 1] = 4;
				local46 = local46 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local74][local91 + 1] = local248;
			}
			if (local74 > 0 && local91 > 0 && Static533.anIntArrayArray51[local74 - 1][local91 - 1] == 0 && (local51[local96 - 1][local80 - 1] & 0x43A40000) == 0 && (local51[local96 - 1][local80] & 0x42240000) == 0 && (local51[local96][local80 - 1] & 0x40A40000) == 0) {
				Static669.anIntArray823[local46] = local7 - 1;
				Static1.anIntArray748[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static533.anIntArrayArray51[local74 - 1][local91 - 1] = 3;
				Static323.anIntArrayArray37[local74 - 1][local91 - 1] = local248;
			}
			if (local74 < 127 && local91 > 0 && Static533.anIntArrayArray51[local74 + 1][local91 - 1] == 0 && (local51[local96 + 1][local80 - 1] & 0x60E40000) == 0 && (local51[local96 + 1][local80] & 0x60240000) == 0 && (local51[local96][local80 - 1] & 0x40A40000) == 0) {
				Static669.anIntArray823[local46] = local7 + 1;
				Static1.anIntArray748[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static533.anIntArrayArray51[local74 + 1][local91 - 1] = 9;
				Static323.anIntArrayArray37[local74 + 1][local91 - 1] = local248;
			}
			if (local74 > 0 && local91 < 127 && Static533.anIntArrayArray51[local74 - 1][local91 + 1] == 0 && (local51[local96 - 1][local80 + 1] & 0x4E240000) == 0 && (local51[local96 - 1][local80] & 0x42240000) == 0 && (local51[local96][local80 + 1] & 0x48240000) == 0) {
				Static669.anIntArray823[local46] = local7 - 1;
				Static1.anIntArray748[local46] = local9 + 1;
				Static533.anIntArrayArray51[local74 - 1][local91 + 1] = 6;
				local46 = local46 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local74 - 1][local91 + 1] = local248;
			}
			if (local74 < 127 && local91 < 127 && Static533.anIntArrayArray51[local74 + 1][local91 + 1] == 0 && (local51[local96 + 1][local80 + 1] & 0x78240000) == 0 && (local51[local96 + 1][local80] & 0x60240000) == 0 && (local51[local96][local80 + 1] & 0x48240000) == 0) {
				Static669.anIntArray823[local46] = local7 + 1;
				Static1.anIntArray748[local46] = local9 + 1;
				Static533.anIntArrayArray51[local74 + 1][local91 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local74 + 1][local91 + 1] = local248;
			}
		}
		Static437.anInt7796 = local7;
		Static71.anInt1587 = local9;
		return false;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIII)V")
	public static void method7626(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static483.anInt8667 == arg2 && Static336.anInt6341 == arg1 && Static155.anInt3058 == arg0) {
			return;
		}
		Static336.anInt6341 = arg1;
		Static155.anInt3058 = arg0;
		Static483.anInt8667 = arg2;
		Static17.aBoolean15 = true;
		@Pc(35) double local35 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(45) double local45 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(48) double local48 = Math.cos(local45);
		@Pc(51) double local51 = Math.sin(local45);
		@Pc(54) double local54 = Math.cos(local35);
		@Pc(57) double local57 = Math.sin(local35);
		Static187.aDouble8 = 0.0D;
		Static571.aDouble21 = -local48 * local57;
		Static153.aDouble7 = -local51 * local54;
		Static409.aDouble19 = local57;
		Static143.aDouble6 = local57 * local51;
		Static382.aDouble17 = local51;
		Static121.aDouble5 = local48 * local54;
		Static111.aDouble4 = local48;
		Static388.aDouble18 = local54;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)Z")
	public static boolean method7628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IZ)V")
	public static void method7629(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class14_Sub19 local6 = Static621.method8714();
		local6.aClass14_Sub29_Sub1_1.method5854(Static453.aClass174_6.anInt4603);
		local6.aClass14_Sub29_Sub1_1.method5859(0);
		@Pc(21) int local21 = local6.aClass14_Sub29_Sub1_1.anInt7264;
		local6.aClass14_Sub29_Sub1_1.method5859(650);
		@Pc(30) int[] local30 = Static302.method8417(local6);
		@Pc(34) int local34 = local6.aClass14_Sub29_Sub1_1.anInt7264;
		local6.aClass14_Sub29_Sub1_1.method5855(arg2);
		local6.aClass14_Sub29_Sub1_1.method5859(Static349.anInt6487);
		local6.aClass14_Sub29_Sub1_1.method5855(arg0);
		local6.aClass14_Sub29_Sub1_1.method5905(Static598.aLong266);
		local6.aClass14_Sub29_Sub1_1.method5854(Static232.anInt4258);
		local6.aClass14_Sub29_Sub1_1.method5854(Static630.aClass77_8.anInt2295);
		Static555.method7802(local6.aClass14_Sub29_Sub1_1);
		@Pc(71) String local71 = Static89.aString23;
		local6.aClass14_Sub29_Sub1_1.method5854(local71 == null ? 0 : 1);
		if (local71 != null) {
			local6.aClass14_Sub29_Sub1_1.method5855(local71);
		}
		local6.aClass14_Sub29_Sub1_1.method5854(arg1);
		local6.aClass14_Sub29_Sub1_1.method5854(arg3 ? 1 : 0);
		local6.aClass14_Sub29_Sub1_1.anInt7264 += 7;
		local6.aClass14_Sub29_Sub1_1.method5865(local30, local34, local6.aClass14_Sub29_Sub1_1.anInt7264);
		local6.aClass14_Sub29_Sub1_1.method5839(local6.aClass14_Sub29_Sub1_1.anInt7264 - local21);
		Static576.method8234(local6);
		Static132.anInt2538 = 0;
		Static408.anInt7106 = -3;
		Static622.anInt10474 = 0;
		Static101.anInt2152 = 1;
		if (arg1 < 13) {
			Static141.aBoolean152 = true;
			Static462.method6789();
		}
	}
}
