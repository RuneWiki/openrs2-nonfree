import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!to", name = "t", descriptor = "I")
	public static int anInt6386;

	@OriginalMember(owner = "client!to", name = "B", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array13;

	@OriginalMember(owner = "client!to", name = "r", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_109 = new Class242(54, 3);

	@OriginalMember(owner = "client!to", name = "x", descriptor = "[I")
	public static final int[] anIntArray464 = new int[1000];

	@OriginalMember(owner = "client!to", name = "A", descriptor = "Lclient!vo;")
	public static final Class265 aClass265_9 = new Class265("", 10);

	@OriginalMember(owner = "client!to", name = "C", descriptor = "I")
	public static int anInt6391 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ih;B)V")
	public static void method5158(@OriginalArg(0) Class117_Sub1 arg0) {
		@Pc(27) byte[] local27;
		if (Static104.anObject2 == null) {
			@Pc(20) Class113_Sub1_Sub1 local20 = new Class113_Sub1_Sub1();
			local27 = local20.method2860();
			Static104.anObject2 = Static257.method3606(local27);
		}
		if (Static316.anObject8 == null) {
			@Pc(38) Class113_Sub2_Sub1 local38 = new Class113_Sub2_Sub1();
			local27 = local38.method4576();
			Static316.anObject8 = Static257.method3606(local27);
		}
		@Pc(55) Class98 local55 = arg0.aClass98_1;
		if (local55.method1766() && Static38.anObject1 == null) {
			local27 = Static403.method5123(16.0F, 0.5F, new Class10_Sub1(419684), 4.0F, 4.0F, 0.6F);
			Static38.anObject1 = Static257.method3606(local27);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIII)V")
	public static void method5159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static103.anInt6434;
		@Pc(13) int[] local13 = Static56.anIntArray110;
		Static144.anInt7179 = 0;
		@Pc(179) int local179;
		@Pc(204) int local204;
		@Pc(249) int local249;
		@Pc(320) int local320;
		@Pc(408) int local408;
		@Pc(851) int local851;
		@Pc(512) int local512;
		for (@Pc(17) int local17 = 0; local17 < Static137.anInt2142 + local7; local17++) {
			@Pc(21) Class272 local21 = null;
			@Pc(37) Class11_Sub1_Sub3 local37;
			if (local17 >= local7) {
				local37 = ((Class1_Sub44) Static46.aClass208_33.method4405((long) Static135.anIntArray183[local17 - local7])).aClass11_Sub1_Sub3_Sub1_2;
				local21 = ((Class11_Sub1_Sub3_Sub1) local37).aClass272_1;
				if (local21.anIntArray543 != null) {
					local21 = local21.method5900(Static32.aClass4_1);
					if (local21 == null) {
						continue;
					}
				}
			} else {
				local37 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local13[local17]];
			}
			if (local37.anInt3284 >= 0 && (local37.anInt3276 == Static330.anInt5429 || local37.aByte90 == Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90)) {
				Static252.method3560(local37.method2638(), arg2 >> 1, arg3 >> 1, local37);
				if (Static99.anIntArray133[0] >= 0) {
					if (local37.aString31 != null && (local17 >= local7 || Static151.anInt2351 == 0 || Static151.anInt2351 == 3 || Static151.anInt2351 == 1 && Static148.method1861(((Class11_Sub1_Sub3_Sub2) local37).aString32)) && Static144.anInt7179 < Static26.anInt383) {
						Static26.anIntArray57[Static144.anInt7179] = Static15.aClass252_5.method5291(local37.aString31) / 2;
						Static26.anIntArray56[Static144.anInt7179] = Static99.anIntArray133[0];
						Static26.anIntArray54[Static144.anInt7179] = Static99.anIntArray133[1];
						Static26.anIntArray59[Static144.anInt7179] = local37.anInt3339;
						Static26.anIntArray55[Static144.anInt7179] = local37.anInt3322;
						Static26.anIntArray58[Static144.anInt7179] = local37.anInt3305;
						Static26.aStringArray4[Static144.anInt7179] = local37.aString31;
						Static144.anInt7179++;
					}
					local179 = Static99.anIntArray133[1] + arg0;
					@Pc(234) Class85[] local234;
					@Pc(241) Class52[] local241;
					@Pc(293) Class85 local293;
					if (local37.aBoolean324 || local37.anInt3309 <= Static98.anInt1304) {
						local179 -= Math.max(Static15.aClass252_5.anInt6656, aClass85Array13[0].ZA());
					} else {
						@Pc(190) byte local190 = 1;
						if (local17 < local7) {
							@Pc(199) Class11_Sub1_Sub3_Sub2 local199 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local13[local17]];
							local204 = local37.method2640().anInt4634;
							if (local199.aBoolean328) {
								local190 = 2;
							}
						} else {
							local204 = local21.anInt7344;
							if (local204 == -1) {
								local204 = local37.method2640().anInt4634;
							}
						}
						@Pc(224) Class85[] local224 = aClass85Array13;
						if (local204 != -1) {
							local234 = (Class85[]) Static13.aClass77_6.method1387((long) local204);
							if (local234 == null) {
								local241 = Static467.method894(Static178.aClass185_49, local204);
								if (local241 != null) {
									local234 = new Class85[local241.length];
									for (local249 = 0; local249 < local241.length; local249++) {
										local234[local249] = Static186.aClass117_3.method5707(local241[local249]);
									}
									Static13.aClass77_6.method1396(local234, (long) local204);
								}
							}
							if (local234 != null && local234.length >= 2) {
								local224 = local234;
							}
						}
						if (local224.length <= local190) {
							local190 = 1;
						}
						@Pc(289) Class85 local289 = local224[0];
						local293 = local224[local190];
						local179 -= Math.max(Static15.aClass252_5.anInt6656, local289.ZA());
						local249 = Static99.anIntArray133[0] + arg1 - (local289.YA() >> 1);
						local320 = local289.YA() * local37.anInt3316 / 255;
						if (local37.anInt3316 > 0 && local320 < 2) {
							local320 = 2;
						}
						local289.method5406(local249, local179);
						Static186.aClass117_3.HA(local249, local179, local320 + local249, local289.ZA() + local179);
						local293.method5406(local249, local179);
						Static186.aClass117_3.ba(arg1, arg0, arg1 + arg2, arg0 - -arg3);
					}
					local179 -= 2;
					if (!local37.aBoolean324) {
						@Pc(391) Class85 local391;
						if (Static98.anInt1304 < local37.anInt3336) {
							local391 = Static40.aClass85Array2[local37.aBoolean323 ? 2 : 0];
							@Pc(400) Class85 local400 = Static40.aClass85Array2[local37.aBoolean323 ? 3 : 1];
							if (local37 instanceof Class11_Sub1_Sub3_Sub1) {
								local408 = local21.anInt7334;
								if (local408 == -1) {
									local408 = local37.method2640().anInt4600;
								}
							} else {
								local408 = local37.method2640().anInt4600;
							}
							if (local408 != -1) {
								local234 = (Class85[]) Static12.aClass77_5.method1387((long) local408);
								if (local234 == null) {
									local241 = Static467.method894(Static178.aClass185_49, local408);
									if (local241 != null) {
										local234 = new Class85[local241.length];
										for (local249 = 0; local249 < local241.length; local249++) {
											local234[local249] = Static186.aClass117_3.method5707(local241[local249]);
										}
										Static12.aClass77_5.method1396(local234, (long) local408);
									}
								}
								if (local234 != null && local234.length == 4) {
									local400 = local234[local37.aBoolean323 ? 3 : 1];
									local391 = local234[local37.aBoolean323 ? 2 : 0];
								}
							}
							@Pc(505) int local505 = local37.anInt3336 - Static98.anInt1304;
							if (local37.anInt3269 >= local505) {
								local512 = local391.YA();
							} else {
								local505 -= local37.anInt3269;
								local249 = local37.anInt3332 == 0 ? 0 : local37.anInt3332 * ((local37.anInt3274 - local505) / local37.anInt3332);
								local512 = local249 * local391.YA() / local37.anInt3274;
							}
							local249 = local391.ZA();
							local179 -= local249;
							local320 = arg1 + Static99.anIntArray133[0] - (local391.YA() >> 1);
							local391.method5406(local320, local179);
							Static186.aClass117_3.HA(local320, local179, local320 + local512, local249 + local179);
							local400.method5406(local320, local179);
							local179 -= 2;
							Static186.aClass117_3.ba(arg1, arg0, arg2 + arg1, arg3 + arg0);
						}
						if (local7 > local17) {
							@Pc(600) Class11_Sub1_Sub3_Sub2 local600 = (Class11_Sub1_Sub3_Sub2) local37;
							if (local600.anInt3372 != -1) {
								local179 -= 25;
								Static299.aClass85Array10[local600.anInt3372].method5406(arg1 + Static99.anIntArray133[0] - 12, local179);
								local179 -= 2;
							}
							if (local600.anInt3376 != -1) {
								local179 -= 25;
								Static90.aClass85Array4[local600.anInt3376].method5406(Static99.anIntArray133[0] + arg1 - 12, local179);
								local179 -= 2;
							}
						} else if (local21.anInt7315 >= 0 && Static90.aClass85Array4.length > local21.anInt7315) {
							local179 -= 25;
							local391 = Static90.aClass85Array4[local21.anInt7315];
							local391.method5406(Static99.anIntArray133[0] + arg1 - (local391.YA() >> 1), local179);
							local179 -= 2;
						}
					}
					@Pc(689) Class78[] local689;
					@Pc(697) Class78 local697;
					if (!(local37 instanceof Class11_Sub1_Sub3_Sub2)) {
						local204 = 0;
						local689 = Static13.aClass78Array1;
						for (local408 = 0; local408 < local689.length; local408++) {
							local697 = local689[local408];
							if (local697 != null && local697.anInt1697 == 1 && local697.anInt1704 == Static135.anIntArray183[local17 - local7]) {
								local293 = Static277.aClass85Array9[local697.anInt1701];
								if (local204 < local293.ZA()) {
									local204 = local293.ZA();
								}
								if (Static98.anInt1304 % 20 < 10) {
									local293.method5406(arg1 + Static99.anIntArray133[0] - 12, local179 - local293.ZA());
								}
							}
						}
						if (local204 > 0) {
						}
					} else if (local17 >= 0) {
						local204 = 0;
						local689 = Static13.aClass78Array1;
						for (local408 = 0; local408 < local689.length; local408++) {
							local697 = local689[local408];
							if (local697 != null && local697.anInt1697 == 10 && local697.anInt1704 == local13[local17]) {
								local293 = Static277.aClass85Array9[local697.anInt1701];
								if (local204 < local293.ZA()) {
									local204 = local293.ZA();
								}
								local293.method5406(arg1 + Static99.anIntArray133[0] - 12, -local293.ZA() + local179);
							}
						}
						if (local204 > 0) {
						}
					}
					for (local204 = 0; local204 < 4; local204++) {
						if (local37.anIntArray244[local204] > Static98.anInt1304) {
							local851 = local37.method2638() / 2;
							Static252.method3560(local851, arg2 >> 1, arg3 >> 1, local37);
							if (Static99.anIntArray133[0] > -1) {
								local408 = Static311.aClass85Array11[local37.anIntArray243[local204]].YA();
								if (local204 == 1) {
									Static99.anIntArray133[1] -= 20;
								}
								if (local204 == 2) {
									Static99.anIntArray133[0] -= local408 - 9;
									Static99.anIntArray133[1] -= 10;
								}
								if (local204 == 3) {
									Static99.anIntArray133[1] -= 10;
									Static99.anIntArray133[0] += local408 - 9;
								}
								Static311.aClass85Array11[local37.anIntArray243[local204]].method5406(arg1 + Static99.anIntArray133[0] - (local408 >> 1), arg0 - -Static99.anIntArray133[1] + -12);
								Static300.aClass137_7.method4586(Integer.toString(local37.anIntArray245[local204]), -1, 0, Static99.anIntArray133[1] + arg0 + 3, arg1 - -Static99.anIntArray133[0] + -1);
							}
						}
					}
				}
			}
		}
		@Pc(1004) int local1004;
		for (@Pc(998) int local998 = 0; local998 < Static87.anInt1184; local998++) {
			local1004 = Static407.anIntArray470[local998];
			@Pc(1013) Class11_Sub1_Sub3 local1013;
			if (local1004 < 2048) {
				local1013 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local1004];
			} else {
				local1013 = ((Class1_Sub44) Static46.aClass208_33.method4405((long) (local1004 - 2048))).aClass11_Sub1_Sub3_Sub1_2;
			}
			local204 = Static92.anIntArray309[local998];
			@Pc(1040) Class11_Sub1_Sub3 local1040;
			if (local204 < 2048) {
				local1040 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local204];
			} else {
				local1040 = ((Class1_Sub44) Static46.aClass208_33.method4405((long) (local204 - 2048))).aClass11_Sub1_Sub3_Sub1_2;
			}
			Static243.method3488(local1040, local1013, arg3, arg2, arg1, arg0, --local1013.anInt3312);
		}
		local1004 = Static15.aClass252_5.anInt6663 + Static15.aClass252_5.anInt6656 + 2;
		for (local179 = 0; local179 < Static144.anInt7179; local179++) {
			local204 = Static26.anIntArray56[local179];
			local851 = Static26.anIntArray54[local179];
			local408 = Static26.anIntArray57[local179];
			@Pc(1099) boolean local1099 = true;
			while (local1099) {
				local1099 = false;
				for (local512 = 0; local512 < local179; local512++) {
					if (local851 + 2 > -local1004 + Static26.anIntArray54[local512] && local851 - local1004 < Static26.anIntArray54[local512] + 2 && local204 - local408 < Static26.anIntArray57[local512] + Static26.anIntArray56[local512] && Static26.anIntArray56[local512] - Static26.anIntArray57[local512] < local204 - -local408 && Static26.anIntArray54[local512] - local1004 < local851) {
						local1099 = true;
						local851 = Static26.anIntArray54[local512] - local1004;
					}
				}
			}
			Static26.anIntArray54[local179] = local851;
			@Pc(1193) String local1193 = Static26.aStringArray4[local179];
			if (Static63.anInt976 == 0) {
				local249 = 16776960;
				if (Static26.anIntArray59[local179] < 6) {
					local249 = Static163.anIntArray438[Static26.anIntArray59[local179]];
				}
				if (Static26.anIntArray59[local179] == 6) {
					local249 = Static330.anInt5429 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static26.anIntArray59[local179] == 7) {
					local249 = Static330.anInt5429 % 20 < 10 ? 255 : 65535;
				}
				if (Static26.anIntArray59[local179] == 8) {
					local249 = Static330.anInt5429 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static26.anIntArray59[local179] == 9) {
					local320 = 150 - Static26.anIntArray58[local179];
					if (local320 < 50) {
						local249 = local320 * 1280 + 16711680;
					} else if (local320 < 100) {
						local249 = 16776960 - (local320 - 50) * 327680;
					} else if (local320 < 150) {
						local249 = (local320 - 100) * 5 + 65280;
					}
				}
				if (Static26.anIntArray59[local179] == 10) {
					local320 = 150 - Static26.anIntArray58[local179];
					if (local320 < 50) {
						local249 = local320 * 5 + 16711680;
					} else if (local320 < 100) {
						local249 = 16384000 + 16711935 - local320 * 327680;
					} else if (local320 < 150) {
						local249 = (local320 - 100) * 327680 + 255 + 500 - local320 * 5;
					}
				}
				if (Static26.anIntArray59[local179] == 11) {
					local320 = 150 - Static26.anIntArray58[local179];
					if (local320 < 50) {
						local249 = 16777215 - local320 * 327685;
					} else if (local320 < 100) {
						local249 = local320 * 327685 + 65280 - 16384250;
					} else if (local320 < 150) {
						local249 = 16777215 + 32768000 - local320 * 327680;
					}
				}
				local320 = local249 | 0xFF000000;
				if (Static26.anIntArray55[local179] == 0) {
					Static17.aClass137_5.method4586(local1193, local320, -16777216, local851 + arg0, local204 + arg1);
				}
				if (Static26.anIntArray55[local179] == 1) {
					Static17.aClass137_5.method4598(arg1 + local204, arg0 - -local851, local320, Static330.anInt5429, local1193);
				}
				if (Static26.anIntArray55[local179] == 2) {
					Static17.aClass137_5.method4602(arg0 + local851, local320, arg1 + local204, Static330.anInt5429, local1193);
				}
				if (Static26.anIntArray55[local179] == 3) {
					Static17.aClass137_5.method4585(arg1 + local204, -Static26.anIntArray58[local179] + 150, local851 + arg0, Static330.anInt5429, local1193, local320);
				}
				@Pc(1535) int local1535;
				if (Static26.anIntArray55[local179] == 4) {
					local1535 = (150 - Static26.anIntArray58[local179]) * (Static15.aClass252_5.method5291(local1193) + 100) / 150;
					Static186.aClass117_3.HA(local204 + arg1 - 50, arg0, arg1 + local204 + 50, arg0 + arg3);
					Static17.aClass137_5.method4587(local851 + arg0, local204 + 50 + (arg1 - local1535), local1193, local320, -16777216);
					Static186.aClass117_3.ba(arg1, arg0, arg2 + arg1, arg0 + arg3);
				}
				if (Static26.anIntArray55[local179] == 5) {
					local1535 = 150 - Static26.anIntArray58[local179];
					@Pc(1593) int local1593 = 0;
					if (local1535 < 25) {
						local1593 = local1535 - 25;
					} else if (local1535 > 125) {
						local1593 = local1535 - 125;
					}
					@Pc(1616) int local1616 = Static15.aClass252_5.anInt6656 + Static15.aClass252_5.anInt6663;
					Static186.aClass117_3.HA(arg1, arg0 + local851 - local1616 - 1, arg1 - -arg2, arg0 + local851 + 5);
					Static17.aClass137_5.method4586(local1193, local320, -16777216, local1593 + arg0 + local851, local204 + arg1);
					Static186.aClass117_3.ba(arg1, arg0, arg1 + arg2, arg3 + arg0);
				}
			} else {
				Static17.aClass137_5.method4586(local1193, -256, -16777216, local851 + arg0, arg1 - -local204);
			}
		}
	}
}
