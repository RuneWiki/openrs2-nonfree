import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!dp;")
	public static Class53 aClass53_142;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	public static int anInt5793;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString265 = "purple:";

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
	public static void method5246() {
		if (Static213.anInt3921 < 0) {
			return;
		}
		@Pc(16) long local16 = Static245.method4300();
		Static213.anInt3921 = (int) ((long) Static213.anInt3921 + Static316.aLong196 - local16);
		if (Static213.anInt3921 > 0) {
			@Pc(32) int local32 = (Static213.anInt3921 << 8) / Static56.anInt2420;
			@Pc(37) int local37 = 255 - local32;
			@Pc(42) float local42 = (float) local32 / 255.0F;
			@Pc(47) float local47 = 1.0F - local42;
			Static352.anInt6322 = ((Static133.aClass14_2.anInt320 & 0xFF00FF) * local37 + local32 * (Static203.anInt3733 & 0xFF00FF) & 0xFF00FF00) + ((Static133.aClass14_2.anInt320 & 0xFF00) * local37 + local32 * (Static203.anInt3733 & 0xFF00) & 0xFF0000) >>> 8;
			Static292.anInt5494 = (local32 * (Static34.anInt615 & 0xFF00FF) + local37 * (Static133.aClass14_2.anInt315 & 0xFF00FF) & 0xFF00FF00) + (local37 * (Static133.aClass14_2.anInt315 & 0xFF00) + local32 * (Static34.anInt615 & 0xFF00) & 0xFF0000) >>> 8;
			Static12.aFloat1 = Static246.aFloat74 + (Static133.aClass14_2.aFloat3 - Static246.aFloat74) * local47;
			Static68.aFloat72 = local47 * (Static133.aClass14_2.aFloat5 - Static323.aFloat84) + Static323.aFloat84;
			Static158.aFloat82 = (Static133.aClass14_2.aFloat7 - Static228.aFloat73) * local47 + Static228.aFloat73;
			Static311.aFloat83 = Static159.aFloat67 + (Static133.aClass14_2.aFloat6 - Static159.aFloat67) * local47;
			Static226.anInt4209 = local37 * Static133.aClass14_2.anInt318 + local32 * Static113.anInt2100 >> 8;
			Static329.aFloat85 = local47 * (Static133.aClass14_2.aFloat2 - Static122.aFloat59) + Static122.aFloat59;
			Static209.aFloat71 = (Static133.aClass14_2.aFloat4 - Static34.aFloat13) * local47 + Static34.aFloat13;
			if (Static349.aClass19_4 != Static133.aClass14_2.aClass19_1) {
				Static201.aClass19_2 = Static16.aClass81_1.method2991(Static349.aClass19_4, Static133.aClass14_2.aClass19_1, local47, Static201.aClass19_2);
			}
		} else {
			Static311.aFloat83 = Static133.aClass14_2.aFloat6;
			Static12.aFloat1 = Static133.aClass14_2.aFloat3;
			Static226.anInt4209 = Static133.aClass14_2.anInt318;
			Static213.anInt3921 = -1;
			Static352.anInt6322 = Static133.aClass14_2.anInt320;
			Static68.aFloat72 = Static133.aClass14_2.aFloat5;
			Static209.aFloat71 = Static133.aClass14_2.aFloat4;
			Static201.aClass19_2 = Static133.aClass14_2.aClass19_1;
			Static329.aFloat85 = Static133.aClass14_2.aFloat2;
			Static292.anInt5494 = Static133.aClass14_2.anInt315;
			Static158.aFloat82 = Static133.aClass14_2.aFloat7;
		}
		Static316.aLong196 = local16;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZIIIIII)V")
	public static void method5247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg2 - arg4;
		@Pc(18) int local18 = arg1 + arg4;
		for (@Pc(20) int local20 = arg1; local20 < local18; local20++) {
			Static14.method247(arg0, arg3, Static11.anIntArrayArray11[local20], arg5);
		}
		@Pc(39) int local39 = arg0 - arg4;
		@Pc(43) int local43 = arg4 + arg5;
		for (@Pc(45) int local45 = arg2; local45 > local14; local45--) {
			Static14.method247(arg0, arg3, Static11.anIntArrayArray11[local45], arg5);
		}
		for (@Pc(65) int local65 = local18; local65 <= local14; local65++) {
			@Pc(71) int[] local71 = Static11.anIntArrayArray11[local65];
			Static14.method247(local43, arg3, local71, arg5);
			Static14.method247(arg0, arg3, local71, local39);
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)V")
	public static void method5248() {
		Static320.aClass81_9 = null;
		Static238.aClass30_3 = null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)I")
	public static int method5249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static203.aClass106Array3 == null) {
			return 0;
		}
		@Pc(20) int local20 = arg1 >> 7;
		@Pc(24) int local24 = arg0 >> 7;
		if (local20 < 0 || local24 < 0 || local20 > Static153.anInt2883 - 1 || local24 > Static246.anInt4606 - 1) {
			return 0;
		}
		@Pc(56) int local56 = arg2;
		if (arg2 < 3 && (Static265.aByteArrayArrayArray11[1][local20][local24] & 0x2) != 0) {
			local56 = arg2 + 1;
		}
		return Static203.aClass106Array3[local56].method5717(arg1, arg0);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!ja;I)Z")
	public static boolean method5251(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1) {
		@Pc(11) int local11 = (Static153.anInt2883 - 104) / 2;
		@Pc(17) int local17 = (Static246.anInt4606 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static247.method4078(local21, local25, arg0, local29)) {
						local40 = local29;
						if (Static222.method3934(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static158.method5099(local21, local40, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(88) int[] local88 = new int[262144];
		for (local29 = 0; local29 < local88.length; local29++) {
			local88[local29] = -16777216;
		}
		Static296.aClass40_18 = arg1.method2996(local88, 512, 512, 512);
		Static165.method5483();
		local40 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((((int) (Math.random() * 20.0D)) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
		@Pc(157) int local157 = ((int) (Math.random() * 20.0D) + 228 | 0xFF00) << 16;
		@Pc(176) int local176 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(180) boolean[][] local180 = new boolean[Static339.anInt6186][Static339.anInt6186];
		@Pc(186) int local186;
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(211) int local211;
		@Pc(264) int local264;
		@Pc(270) int local270;
		@Pc(274) int local274;
		@Pc(293) int local293;
		for (@Pc(182) int local182 = local11; local182 < local11 + 104; local182 += Static339.anInt6186) {
			for (local186 = local17; local186 < local17 + 104; local186 += Static339.anInt6186) {
				arg1.method3033(0, 0, Static339.anInt6186 * 4, Static339.anInt6186 * 4);
				arg1.method2987(-16777216);
				for (local203 = arg0; local203 <= 3; local203++) {
					for (local207 = 0; local207 < Static339.anInt6186; local207++) {
						for (local211 = 0; local211 < Static339.anInt6186; local211++) {
							local180[local207][local211] = Static247.method4078(local182 + local207, local211 + local186, arg0, local203);
						}
					}
					Static99.aClass106Array4[local203].method5728(local182, local186, local182 + Static339.anInt6186, Static339.anInt6186 + local186, local180);
					if (!Static49.aBoolean76) {
						for (local211 = -4; local211 < Static339.anInt6186; local211++) {
							for (local264 = -4; local264 < Static339.anInt6186; local264++) {
								local270 = local211 + local182;
								local274 = local264 + local186;
								if (local11 <= local270 && local17 <= local274 && Static247.method4078(local270, local274, arg0, local203)) {
									local293 = local203;
									if (Static222.method3934(local270, local274)) {
										local293 = local203 - 1;
									}
									if (local293 >= 0) {
										Static342.method5630(local270, arg1, (Static339.anInt6186 - local264) * 4 - 4, local40, local211 * 4, local274, local157, local293);
									}
								}
							}
						}
					}
				}
				if (Static49.aBoolean76) {
					@Pc(344) Class27 local344 = Static334.aClass27Array1[arg0];
					for (local211 = 0; local211 < Static339.anInt6186; local211++) {
						for (local264 = 0; local264 < Static339.anInt6186; local264++) {
							local270 = local182 + local211;
							local274 = local264 + local186;
							local293 = local344.anIntArrayArray31[local270 - local344.anInt632][local274 - local344.anInt621];
							if ((local293 & 0x40240000) != 0) {
								arg1.method3017(4, -1713569622, 4, local211 * 4, (Static339.anInt6186 - local264) * 4 - 4);
							} else if ((local293 & 0x800000) != 0) {
								arg1.method2999(4, (Static339.anInt6186 - local264) * 4 - 4, local211 * 4, -1713569622);
							} else if ((local293 & 0x2000000) != 0) {
								arg1.method2973((Static339.anInt6186 - local264) * 4 - 4, local211 * 4 + 3, 4, -1713569622);
							} else if ((local293 & 0x8000000) != 0) {
								arg1.method2999(4, (Static339.anInt6186 - local264) * 4 - 1, local211 * 4, -1713569622);
							} else if ((local293 & 0x20000000) != 0) {
								arg1.method2973((Static339.anInt6186 - local264) * 4 - 4, local211 * 4, 4, -1713569622);
							}
						}
					}
				}
				arg1.method2962(0, 0, Static339.anInt6186 * 4, Static339.anInt6186 * 4, local176, 2);
				Static296.aClass40_18.method5081((local182 - local11) * 4 + 48, -((local186 + -local17) * 4) + (464 - Static339.anInt6186 * 4), Static339.anInt6186 * 4, Static339.anInt6186 * 4);
			}
		}
		arg1.method3032();
		arg1.method2987(-16777215);
		Static205.method5709();
		Static171.anInt3184 = 0;
		Static280.aClass211_33.method5584();
		if (!Static49.aBoolean76) {
			for (local186 = local11; local186 < local11 + 104; local186++) {
				for (local203 = local17; local203 < local17 + 104; local203++) {
					for (local207 = arg0; local207 <= arg0 + 1 && local207 <= 3; local207++) {
						if (Static247.method4078(local186, local203, arg0, local207)) {
							@Pc(619) Interface7 local619 = (Interface7) Static68.method4012(local207, local186, local203);
							if (local619 == null) {
								local619 = (Interface7) Static162.method3236(local207, local186, local203, sc.class);
							}
							if (local619 == null) {
								local619 = (Interface7) Static9.method161(local207, local186, local203);
							}
							if (local619 == null) {
								local619 = (Interface7) Static105.method2135(local207, local186, local203);
							}
							if (local619 != null) {
								@Pc(659) Class66 local659 = Static196.method3622(local619.method5799());
								if (!local659.aBoolean103 || Static177.aBoolean242) {
									local270 = local659.anInt1458;
									if (local659.anIntArray162 != null) {
										for (local274 = 0; local274 < local659.anIntArray162.length; local274++) {
											if (local659.anIntArray162[local274] != -1) {
												@Pc(687) Class66 local687 = Static196.method3622(local659.anIntArray162[local274]);
												if (local687.anInt1458 >= 0) {
													local270 = local687.anInt1458;
												}
											}
										}
									}
									if (local270 >= 0) {
										@Pc(707) boolean local707 = false;
										if (local270 >= 0) {
											@Pc(716) Class165 local716 = Static345.method5701(local270);
											if (local716 != null && local716.aBoolean331) {
												local707 = true;
											}
										}
										local293 = local186;
										@Pc(727) int local727 = local203;
										if (local707) {
											@Pc(734) int[][] local734 = Static334.aClass27Array1[local207].anIntArrayArray31;
											@Pc(739) int local739 = Static334.aClass27Array1[local207].anInt632;
											@Pc(744) int local744 = Static334.aClass27Array1[local207].anInt621;
											for (@Pc(746) int local746 = 0; local746 < 10; local746++) {
												@Pc(753) int local753 = (int) (Math.random() * 4.0D);
												if (local753 == 0 && local11 < local293 && local293 > local186 - 3 && (local734[local293 - local739 - 1][local727 - local744] & 0x2C0108) == 0) {
													local293--;
												}
												if (local753 == 1 && local11 + 104 - 1 > local293 && local293 < local186 + 3 && (local734[local293 + 1 - local739][local727 - local744] & 0x2C0180) == 0) {
													local293++;
												}
												if (local753 == 2 && local17 < local727 && local727 > local203 - 3 && (local734[local293 - local739][local727 - local744 - 1] & 0x2C0102) == 0) {
													local727--;
												}
												if (local753 == 3 && local17 + 104 - 1 > local727 && local203 + 3 > local727 && (local734[local293 - local739][local727 + 1 - local744] & 0x2C0120) == 0) {
													local727++;
												}
											}
										}
										Static132.anIntArray316[Static171.anInt3184] = local659.anInt1497;
										Static284.anIntArray578[Static171.anInt3184] = local293;
										Static95.anIntArray245[Static171.anInt3184] = local727;
										Static171.anInt3184++;
									}
								}
							}
						}
					}
				}
			}
			if (Static37.aClass41_1 != null) {
				Static114.aClass53_62.anInt1133 = 1;
				Static60.method984(1024, 64);
				for (local203 = 0; local203 < Static37.aClass41_1.anInt969; local203++) {
					local207 = Static37.aClass41_1.anIntArray111[local203];
					if (Static343.anInt6225 == local207 >> 28) {
						local211 = (local207 >> 14 & 0x3FFF) - Static44.anInt881;
						local264 = (local207 & 0x3FFF) - Static300.anInt5672;
						if (local211 >= 0 && Static153.anInt2883 > local211 && local264 >= 0 && Static246.anInt4606 > local264) {
							Static280.aClass211_33.method5585(new Class6_Sub43(local203));
						} else {
							@Pc(1019) Class165 local1019 = Static345.method5701(Static37.aClass41_1.anIntArray110[local203]);
							if (local1019.anIntArray509 != null && local1019.anInt4671 + local211 >= 0 && local1019.anInt4691 + local211 < Static153.anInt2883 && local264 + local1019.anInt4668 >= 0 && local264 + local1019.anInt4677 < Static246.anInt4606) {
								Static280.aClass211_33.method5585(new Class6_Sub43(local203));
							}
						}
					}
				}
				Static60.method984(128, 64);
				Static114.aClass53_62.anInt1133 = 2;
				Static114.aClass53_62.method1021();
			}
		}
		return true;
	}
}
