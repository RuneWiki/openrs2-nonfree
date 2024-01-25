import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
	public static int anInt5261;

	@OriginalMember(owner = "client!bo", name = "pb", descriptor = "Ljava/lang/String;")
	public static String aString305;

	@OriginalMember(owner = "client!bo", name = "Lb", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!bo", name = "ec", descriptor = "Lclient!af;")
	public static Class6 aClass6_4;

	@OriginalMember(owner = "client!bo", name = "mb", descriptor = "[I")
	public static final int[] anIntArray399 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!bo", name = "Cb", descriptor = "I")
	public static int anInt5302 = 0;

	@OriginalMember(owner = "client!bo", name = "bc", descriptor = "I")
	public static int anInt5324 = 0;

	@OriginalMember(owner = "client!bo", name = "fc", descriptor = "Ljava/lang/String;")
	public static String aString306 = "level: ";

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	public static void method4638(@OriginalArg(1) int arg0) {
		Static44.anInt3898 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIII)V")
	public static void method4640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static37.anInt939 = 0;
		@Pc(179) int local179;
		@Pc(222) int local222;
		@Pc(387) int local387;
		@Pc(499) int local499;
		@Pc(274) int local274;
		@Pc(621) int local621;
		@Pc(438) int local438;
		for (@Pc(13) int local13 = -1; local13 < Static63.anInt1486 + Static161.anInt3258; local13++) {
			@Pc(17) Class216 local17 = null;
			@Pc(34) Class25_Sub1_Sub1 local34;
			if (local13 < 0) {
				local34 = Static85.aClass25_Sub1_Sub1_Sub1_1;
			} else if (local13 >= Static161.anInt3258) {
				local34 = Static188.aClass25_Sub1_Sub1_Sub2Array1[Static331.anIntArray535[local13 - Static161.anInt3258]];
				local17 = ((Class25_Sub1_Sub1_Sub2) local34).aClass216_1;
				if (local17.anIntArray562 != null) {
					local17 = local17.method5777();
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local34 = Static312.aClass25_Sub1_Sub1_Sub1Array1[Static220.anIntArray311[local13]];
			}
			if (local34.anInt5327 >= 0) {
				Static287.method4910(local34, local34.method4649(), arg2 >> 1, arg3 >> 1);
				if (Static330.anIntArray121[0] >= 0) {
					if (local34.aString304 != null && (Static161.anInt3258 <= local13 || Static135.anInt2757 == 0 || Static135.anInt2757 == 3 || Static135.anInt2757 == 1 && Static352.method5795(((Class25_Sub1_Sub1_Sub1) local34).aString237)) && Static37.anInt939 < Static169.anInt3467) {
						Static169.anIntArray245[Static37.anInt939] = Static337.aClass138_10.method3725(local34.aString304) / 2;
						Class5_Sub17_Sub2.lb[Static37.anInt939] = Static330.anIntArray121[0];
						Static169.anIntArray242[Static37.anInt939] = Static330.anIntArray121[1];
						Static169.anIntArray257[Static37.anInt939] = local34.anInt5264;
						Static169.anIntArray256[Static37.anInt939] = local34.anInt5267;
						Static169.anIntArray260[Static37.anInt939] = local34.anInt5303;
						Static169.aStringArray23[Static37.anInt939] = local34.aString304;
						Static37.anInt939++;
					}
					@Pc(165) Class54 local165 = Static50.aClass54Array5[0];
					local179 = arg0 + Static330.anIntArray121[1] - Math.max(Static337.aClass138_10.anInt4180, local165.method5565());
					@Pc(190) Class54 local190;
					@Pc(286) int local286;
					if (!local34.aBoolean403 && Static180.anInt3606 < local34.anInt5323) {
						local190 = Static50.aClass54Array5[1];
						if (local34 instanceof Class25_Sub1_Sub1_Sub2) {
							@Pc(196) Class25_Sub1_Sub1_Sub2 local196 = (Class25_Sub1_Sub1_Sub2) local34;
							@Pc(205) Class54[] local205 = (Class54[]) Static21.aClass66_102.method1939((long) local196.aClass216_1.anInt6540);
							if (local205 == null) {
								@Pc(214) Class37[] local214 = Static360.method918(Static317.aClass170_114, local196.aClass216_1.anInt6540);
								if (local214 != null) {
									local205 = new Class54[local214.length];
									for (local222 = 0; local222 < local214.length; local222++) {
										local205[local222] = Static15.aClass59_1.method4872(local214[local222]);
									}
									Static21.aClass66_102.method1936((long) local196.aClass216_1.anInt6540, local205);
								}
							}
							if (local205 != null && local205.length == 2) {
								local165 = local205[0];
								local190 = local205[1];
							}
						}
						local274 = Static330.anIntArray121[0] + arg1 - (local165.method5577() >> 1);
						local165.method5569(local274, local179);
						local286 = local165.method5577() * local34.anInt5271 / 255;
						Static15.aClass59_1.method4829(local274, local179, local286 + local274, local179 + local165.method5565());
						local190.method5569(local274, local179);
						Static15.aClass59_1.method4795(arg1, arg0, arg2 + arg1, arg3 + arg0);
					}
					local179 -= 2;
					if (!local34.aBoolean403) {
						if (Static180.anInt3606 < local34.anInt5317) {
							local190 = Static112.aClass54Array13[local34.aBoolean402 ? 2 : 0];
							@Pc(337) Class54 local337 = Static112.aClass54Array13[local34.aBoolean402 ? 3 : 1];
							if (local34 instanceof Class25_Sub1_Sub1_Sub2) {
								local286 = local17.anInt6565;
								if (local286 == -1) {
									local286 = local34.method4659().anInt972;
								}
							} else {
								local286 = local34.method4659().anInt972;
							}
							if (local286 != -1) {
								@Pc(372) Class54[] local372 = (Class54[]) Static259.aClass66_57.method1939((long) local286);
								if (local372 == null) {
									@Pc(379) Class37[] local379 = Static360.method918(Static317.aClass170_114, local286);
									if (local379 != null) {
										local372 = new Class54[local379.length];
										for (local387 = 0; local387 < local379.length; local387++) {
											local372[local387] = Static15.aClass59_1.method4872(local379[local387]);
										}
										Static259.aClass66_57.method1936((long) local286, local372);
									}
								}
								if (local372 != null && local372.length == 4) {
									local337 = local372[local34.aBoolean402 ? 3 : 1];
									local190 = local372[local34.aBoolean402 ? 2 : 0];
								}
							}
							local438 = local34.anInt5317 - Static180.anInt3606;
							if (local34.anInt5305 < local438) {
								local438 -= local34.anInt5305;
								local387 = local34.anInt5290 == 0 ? 0 : local34.anInt5290 * ((local34.anInt5273 - local438) / local34.anInt5290);
								local222 = local190.method5577() * local387 / local34.anInt5273;
							} else {
								local222 = local190.method5577();
							}
							local387 = local190.method5565();
							local179 -= local387;
							local499 = arg1 + Static330.anIntArray121[0] - (local190.method5577() >> 1);
							local190.method5569(local499, local179);
							Static15.aClass59_1.method4829(local499, local179, local222 + local499, local179 - -local387);
							local337.method5569(local499, local179);
							Static15.aClass59_1.method4795(arg1, arg0, arg2 + arg1, arg0 - -arg3);
							local179 -= 2;
						}
						if (local13 < Static161.anInt3258) {
							@Pc(575) Class25_Sub1_Sub1_Sub1 local575 = (Class25_Sub1_Sub1_Sub1) local34;
							if (local575.anInt4081 != -1) {
								local179 -= 25;
								Static288.aClass54Array22[local575.anInt4081].method5569(arg1 + Static330.anIntArray121[0] - 12, local179);
								local179 -= 2;
							}
							if (local575.anInt4067 != -1) {
								local179 -= 25;
								Static29.aClass54Array2[local575.anInt4067].method5569(arg1 + Static330.anIntArray121[0] - 12, local179);
								local179 -= 2;
							}
						} else if (local17.anInt6546 >= 0 && local17.anInt6546 < Static29.aClass54Array2.length) {
							local179 -= 25;
							local190 = Static29.aClass54Array2[local17.anInt6546];
							local190.method5569(Static330.anIntArray121[0] + arg1 - (local190.method5577() >> 1), local179);
							local179 -= 2;
						}
					}
					@Pc(623) Class104[] local623;
					@Pc(631) Class104 local631;
					@Pc(654) Class54 local654;
					if (!(local34 instanceof Class25_Sub1_Sub1_Sub1)) {
						local621 = 0;
						local623 = Static141.aClass104Array1;
						for (local286 = 0; local286 < local623.length; local286++) {
							local631 = local623[local286];
							if (local631 != null && local631.anInt3106 == 1 && Static331.anIntArray535[local13 - Static161.anInt3258] == local631.anInt3095) {
								local654 = Static148.aClass54Array15[local631.anInt3094];
								if (local621 < local654.method5565()) {
									local621 = local654.method5565();
								}
								if (Static180.anInt3606 % 20 < 10) {
									local654.method5569(Static330.anIntArray121[0] + arg1 - 12, -local654.method5565() + local179);
								}
							}
						}
						if (local621 > 0) {
						}
					} else if (local13 >= 0) {
						local621 = 0;
						local623 = Static141.aClass104Array1;
						for (local286 = 0; local286 < local623.length; local286++) {
							local631 = local623[local286];
							if (local631 != null && local631.anInt3106 == 10 && Static220.anIntArray311[local13] == local631.anInt3095) {
								local654 = Static148.aClass54Array15[local631.anInt3094];
								if (local654.method5565() > local621) {
									local621 = local654.method5565();
								}
								local654.method5569(arg1 + Static330.anIntArray121[0] - 12, -local654.method5565() + local179);
							}
						}
						if (local621 > 0) {
						}
					}
					for (local621 = 0; local621 < 4; local621++) {
						if (Static180.anInt3606 < local34.anIntArray398[local621]) {
							local274 = local34.method4649() / 2;
							Static287.method4910(local34, local274, arg2 >> 1, arg3 >> 1);
							if (Static330.anIntArray121[0] > -1) {
								if (local621 == 1) {
									Static330.anIntArray121[1] -= 20;
								}
								if (local621 == 2) {
									Static330.anIntArray121[1] -= 10;
									Static330.anIntArray121[0] -= 15;
								}
								if (local621 == 3) {
									Static330.anIntArray121[0] += 15;
									Static330.anIntArray121[1] -= 10;
								}
								Static323.aClass54Array24[local34.anIntArray397[local621]].method5569(Static330.anIntArray121[0] + arg1 - 12, arg0 + -12 + Static330.anIntArray121[1]);
								Static247.aClass91_9.method5308(Static330.anIntArray121[1] + arg0 + 3, 0, Integer.toString(local34.anIntArray400[local621]), -1, arg1 + Static330.anIntArray121[0] - 1);
							}
						}
					}
				}
			}
		}
		@Pc(930) int local930;
		for (@Pc(924) int local924 = 0; local924 < Static322.anInt6101; local924++) {
			local930 = Static110.anIntArray142[local924];
			@Pc(939) Class25_Sub1_Sub1 local939;
			if (local930 >= 2048) {
				local939 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local930 - 2048];
			} else {
				local939 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local930];
			}
			local179 = Static52.anIntArray62[local924];
			@Pc(960) Class25_Sub1_Sub1 local960;
			if (local179 >= 2048) {
				local960 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local179 - 2048];
			} else {
				local960 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local179];
			}
			Static210.method4976(arg2, local939, local960, arg3, arg1, arg0, --local939.anInt5277);
		}
		local930 = Static337.aClass138_10.anInt4175 + Static337.aClass138_10.anInt4180 + 2;
		for (@Pc(997) int local997 = 0; local997 < Static37.anInt939; local997++) {
			local179 = Class5_Sub17_Sub2.lb[local997];
			local621 = Static169.anIntArray242[local997];
			local274 = Static169.anIntArray245[local997];
			@Pc(1013) boolean local1013 = true;
			while (local1013) {
				local1013 = false;
				for (local438 = 0; local438 < local997; local438++) {
					if (local621 + 2 > Static169.anIntArray242[local438] + -local930 && Static169.anIntArray242[local438] + 2 > local621 - local930 && Class5_Sub17_Sub2.lb[local438] + Static169.anIntArray245[local438] > local179 + -local274 && local274 + local179 > -Static169.anIntArray245[local438] + Class5_Sub17_Sub2.lb[local438] && Static169.anIntArray242[local438] - local930 < local621) {
						local621 = Static169.anIntArray242[local438] - local930;
						local1013 = true;
					}
				}
			}
			Static169.anIntArray242[local997] = local621;
			@Pc(1111) String local1111 = Static169.aStringArray23[local997];
			if (Static238.anInt4610 == 0) {
				local222 = 16776960;
				if (Static169.anIntArray257[local997] < 6) {
					local222 = Static118.anIntArray152[Static169.anIntArray257[local997]];
				}
				if (Static169.anIntArray257[local997] == 6) {
					local222 = Static117.anInt2497 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static169.anIntArray257[local997] == 7) {
					local222 = Static117.anInt2497 % 20 < 10 ? 255 : 65535;
				}
				if (Static169.anIntArray257[local997] == 8) {
					local222 = Static117.anInt2497 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static169.anIntArray257[local997] == 9) {
					local387 = 150 - Static169.anIntArray260[local997];
					if (local387 < 50) {
						local222 = local387 * 1280 + 16711680;
					} else if (local387 < 100) {
						local222 = 16776960 - (local387 - 50) * 327680;
					} else if (local387 < 150) {
						local222 = (local387 - 100) * 5 + 65280;
					}
				}
				if (Static169.anIntArray257[local997] == 10) {
					local387 = 150 - Static169.anIntArray260[local997];
					if (local387 < 50) {
						local222 = local387 * 5 + 16711680;
					} else if (local387 < 100) {
						local222 = 16384000 + 16711935 - local387 * 327680;
					} else if (local387 < 150) {
						local222 = local387 * 327680 + 255 - (local387 + -100) * 5 - 32768000;
					}
				}
				if (Static169.anIntArray257[local997] == 11) {
					local387 = 150 - Static169.anIntArray260[local997];
					if (local387 < 50) {
						local222 = 16777215 - local387 * 327685;
					} else if (local387 < 100) {
						local222 = local387 * 327685 + 65280 - 16384250;
					} else if (local387 < 150) {
						local222 = 16777215 + 32768000 - local387 * 327680;
					}
				}
				local387 = local222 | 0xFF000000;
				if (Static169.anIntArray256[local997] == 0) {
					Static190.aClass91_8.method5308(local621 + arg0, -16777216, local1111, local387, local179 + arg1);
				}
				if (Static169.anIntArray256[local997] == 1) {
					Static190.aClass91_8.method5298(arg1 + local179, arg0 - -local621, local387, local1111, Static117.anInt2497);
				}
				if (Static169.anIntArray256[local997] == 2) {
					Static190.aClass91_8.method5313(Static117.anInt2497, local1111, local621 + arg0, local387, local179 + arg1);
				}
				if (Static169.anIntArray256[local997] == 3) {
					Static190.aClass91_8.method5301(150 - Static169.anIntArray260[local997], local1111, arg0 + local621, local387, local179 + arg1, Static117.anInt2497);
				}
				if (Static169.anIntArray256[local997] == 4) {
					local499 = (150 - Static169.anIntArray260[local997]) * (Static337.aClass138_10.method3725(local1111) - -100) / 150;
					Static15.aClass59_1.method4829(arg1 + local179 - 50, arg0, arg1 + local179 + 50, arg3 + arg0);
					Static190.aClass91_8.method5300(-16777216, local621 + arg0, local1111, local387, arg1 + local179 + 50 - local499);
					Static15.aClass59_1.method4795(arg1, arg0, arg2 + arg1, arg0 - -arg3);
				}
				if (Static169.anIntArray256[local997] == 5) {
					local499 = 150 - Static169.anIntArray260[local997];
					@Pc(1519) int local1519 = 0;
					if (local499 < 25) {
						local1519 = local499 - 25;
					} else if (local499 > 125) {
						local1519 = local499 - 125;
					}
					@Pc(1543) int local1543 = Static337.aClass138_10.anInt4180 + Static337.aClass138_10.anInt4175;
					Static15.aClass59_1.method4829(arg1, arg0 + local621 - local1543 - 1, arg1 + arg2, local621 + arg0 + 5);
					Static190.aClass91_8.method5308(arg0 + local621 + local1519, -16777216, local1111, local387, local179 + arg1);
					Static15.aClass59_1.method4795(arg1, arg0, arg1 + arg2, arg3 + arg0);
				}
			} else {
				Static190.aClass91_8.method5308(arg0 + local621, -16777216, local1111, -256, local179 + arg1);
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IILjava/lang/String;Lclient!hm;IILclient!jf;IIILclient!nm;Lclient!tc;)V")
	public static void method4645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class15 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class138 arg9, @OriginalArg(11) Class91 arg10) {
		@Pc(15) int local15;
		if (Static215.anInt4279 == 4) {
			local15 = (int) Static155.aFloat64 & 0x3FFF;
		} else {
			local15 = Static253.anInt4957 + (int) Static155.aFloat64 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg6.anInt2943 / 2, arg6.anInt2916 / 2) + 10;
		@Pc(41) int local41 = arg1 * arg1 + arg0 * arg0;
		if (local33 * local33 < local41) {
			return;
		}
		@Pc(51) int local51 = Class5_Sub9_Sub12.anIntArray169[local15];
		@Pc(55) int local55 = Class5_Sub9_Sub12.anIntArray170[local15];
		if (Static215.anInt4279 != 4) {
			local55 = local55 * 256 / (Static339.anInt6353 + 256);
			local51 = local51 * 256 / (Static339.anInt6353 + 256);
		}
		@Pc(93) int local93 = arg1 * local55 + local51 * arg0 >> 15;
		@Pc(103) int local103 = local55 * arg0 - local51 * arg1 >> 15;
		@Pc(110) int local110 = arg9.method3722(arg2, null, 100);
		@Pc(116) int local116 = local93 - local110 / 2;
		@Pc(126) int local126 = arg9.method3728(arg2, null);
		if (-arg6.anInt2943 <= local116 && arg6.anInt2943 >= local116 && local103 >= -arg6.anInt2916 && local103 <= arg6.anInt2916) {
			arg10.method5296(arg5, 50, arg6.anInt2916 / 2 + arg7 - arg4 - local103 - local126, 0, arg3, arg2, arg8, 0, null, arg6.anInt2943 / 2 + local116 + arg5, 1, local110, arg7, null, 0);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZLclient!jf;I)V")
	public static void method4647(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class96 arg1) {
		@Pc(13) int local13 = arg1.anInt2961 == 0 ? arg1.anInt2943 : arg1.anInt2961;
		@Pc(25) int local25 = arg1.anInt2965 == 0 ? arg1.anInt2916 : arg1.anInt2965;
		Static314.method5367(local25, Static348.aClass96ArrayArray1[arg1.anInt2877 >> 16], local13, arg1.anInt2877, arg0);
		if (arg1.aClass96Array1 != null) {
			Static314.method5367(local25, arg1.aClass96Array1, local13, arg1.anInt2877, arg0);
		}
		@Pc(58) Class5_Sub40 local58 = (Class5_Sub40) Static265.aClass42_53.method1052((long) arg1.anInt2877);
		if (local58 != null) {
			Static262.method4498(arg0, local13, local25, local58.anInt6233);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)I")
	public static int method4650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(25) int local25 = ((arg1 & 0xFF00) * local7 & 0xFF0000 | local7 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(29) int local29 = 255 - local7;
		return local25 + (((arg0 & 0xFF00FF) * local29 & 0xFF00FF00 | local29 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V")
	public static void method4657() {
		Static355.aClass42_62.method1054();
		Static283.aClass42_49.method1054();
	}
}
