import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "[Lclient!vs;")
	public static Class20_Sub2[] aClass20_Sub2Array14;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
	public static int anInt10301 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[IIII[IIZII[I[I[III[[[BIZ)V")
	public static void method8707(@OriginalArg(0) byte arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int[] arg11, @OriginalArg(14) int arg12, @OriginalArg(15) byte[][][] arg13, @OriginalArg(16) int arg14, @OriginalArg(17) boolean arg15) {
		if (Static469.anInt8256 == -1) {
			return;
		}
		@Pc(12) int[] local12 = Static117.aClass100_5.Y();
		@Pc(16) int local16 = local12[0];
		@Pc(20) int local20 = local12[1];
		@Pc(24) int local24 = local12[2];
		@Pc(28) int local28 = local12[3];
		@Pc(30) int local30 = local24;
		@Pc(32) int local32 = local28;
		if (Static469.anInt8256 == 1) {
			local32 = (int) ((double) local28 * (double) Static8.anInt159 / (double) Static320.anInt6116);
			local30 = (int) ((double) local24 * (double) Static8.anInt159 / (double) Static320.anInt6116);
		}
		if (!Static133.aBoolean183) {
			if (Static469.anInt8256 == 1) {
				Static513.method7615();
			}
			@Pc(69) int local69 = arg6 - Static294.anInt5784;
			@Pc(74) int local74 = arg2 - Static388.anInt7302;
			@Pc(78) int local78 = arg4 - Static611.anInt10089;
			@Pc(100) int local100 = (int) ((Static490.aDouble14 * (double) local78 + (double) local69 * Static550.aDouble17 + (double) local74 * Static145.aDouble4) * (double) local30 / (double) arg3);
			@Pc(122) int local122 = (int) ((Static221.aDouble10 * (double) local69 + Static548.aDouble16 * (double) local74 + (double) local78 * Static298.aDouble12) * (double) local32 / (double) arg3);
			@Pc(137) double local137 = (double) local78 * Static522.aDouble15 + (double) local69 * Static430.aDouble13 + (double) local74 * Static597.aDouble26;
			@Pc(144) int local144 = local100 + Static173.anInt3607 - Static233.anInt4691;
			@Pc(152) int local152 = Static449.anInt8044 + local122 - Static261.anInt5198;
			@Pc(156) int local156 = Static609.anInt10076 + local144;
			@Pc(160) int local160 = local152 + Static8.anInt159;
			if (local144 >= 0 && local152 >= 0 && local156 <= Static164.anInt3399 && Static320.anInt6116 >= local160 || Static469.anInt8256 == 2) {
				if (Static469.anInt8256 == 2) {
					Static69.aDouble1 = -local137;
				}
				Static240.anInt4801 = local144;
				Static617.anInt10193 = local152;
			} else if (local156 > 0 && local160 > 0 && local144 < Static164.anInt3399 && Static320.anInt6116 > local152) {
				@Pc(204) int local204 = local144 - Static173.anInt3607;
				@Pc(209) int local209 = local152 - Static449.anInt8044;
				@Pc(211) int local211 = 0;
				@Pc(213) int local213 = 0;
				@Pc(215) int local215 = 0;
				@Pc(217) int local217 = 0;
				@Pc(219) double local219 = 0.0D;
				if (Static469.anInt8256 == 0) {
					local213 = local209;
					local211 = local204;
					local219 = local137 + Static69.aDouble1;
				} else if (Static469.anInt8256 == 1) {
					local215 = local204 / Static345.anInt6515;
					local217 = local209 / Static11.anInt221;
					local213 = local217 * Static11.anInt221;
					local211 = Static345.anInt6515 * local215;
					local219 = (double) (local211 * local204 + local213 * local209) * (Static69.aDouble1 + local137) / (double) (local209 * local209 + local204 * local204);
				}
				local219 = -local219;
				@Pc(279) int local279 = 0;
				@Pc(281) int local281 = 0;
				@Pc(283) int local283 = 0;
				@Pc(285) int local285 = 0;
				@Pc(287) int local287 = 0;
				@Pc(289) int local289 = 0;
				@Pc(293) int local293;
				@Pc(298) int local298;
				@Pc(314) int local314;
				@Pc(300) int local300;
				if (local211 >= 0) {
					local293 = 0;
					local298 = Static164.anInt3399 - local211;
					local300 = local211;
					if (Static469.anInt8256 == 1) {
						local287 = local215;
						local283 = Static406.anInt7520 - local215;
					}
					local314 = local298;
				} else {
					local293 = -local211;
					local298 = Static164.anInt3399 + local211;
					local314 = 0;
					local300 = local293;
					if (Static469.anInt8256 == 1) {
						local283 = 0;
						local287 = -local215;
					}
				}
				@Pc(342) int local342;
				@Pc(347) int local347;
				@Pc(349) int local349;
				@Pc(369) int local369;
				@Pc(365) int local365;
				if (local213 >= 0) {
					local342 = 0;
					local347 = Static320.anInt6116 - local213;
					local349 = local347;
					if (Static469.anInt8256 == 1) {
						local285 = 0;
						local279 = Static316.anInt6064 - local217;
						local281 = local217;
						local289 = local279;
					}
					local365 = 0;
					local369 = local213;
				} else {
					local347 = local213 + Static320.anInt6116;
					local349 = 0;
					local342 = -local213;
					local369 = local342;
					local365 = local342;
					if (Static469.anInt8256 == 1) {
						local279 = 0;
						local281 = -local217;
						local289 = Static316.anInt6064 + local217;
						local285 = local281;
					}
				}
				@Pc(406) Class81 local406 = Static287.aClass65_4.aClass81_2;
				@Pc(420) int local420;
				for (@Pc(411) Class20_Sub3 local411 = (Class20_Sub3) local406.method2118(); local411 != null; local411 = (Class20_Sub3) local406.method2128()) {
					@Pc(416) Class20_Sub4[] local416 = local411.aClass20_Sub4Array1;
					@Pc(418) boolean local418 = true;
					for (local420 = 0; local420 < local416.length; local420++) {
						@Pc(426) Class20_Sub4 local426 = local416[local420];
						@Pc(429) int local429 = local426.anInt2369;
						@Pc(432) int local432 = local426.anInt2368;
						@Pc(435) int local435 = local426.anInt2370;
						@Pc(438) int local438 = local426.anInt2371;
						@Pc(441) int local441 = local426.anInt2367;
						@Pc(448) int local448;
						local426.anInt2370 = local448 = local435 - local211;
						@Pc(456) int local456;
						local426.anInt2369 = local456 = local429 - local211;
						@Pc(464) int local464;
						local426.anInt2368 = local464 = local432 - local213;
						@Pc(472) int local472;
						local426.anInt2371 = local472 = local438 - local213;
						if (local418) {
							@Pc(484) int local484 = (local456 >= local448 ? local448 : local456) - local441;
							if (Static164.anInt3399 >= local484) {
								@Pc(501) int local501 = (local472 <= local464 ? local472 : local464) - local441;
								if (Static320.anInt6116 >= local501) {
									@Pc(521) int local521 = local441 + (local456 >= local448 ? local456 : local448);
									if (local521 >= 0) {
										@Pc(540) int local540 = (local464 < local472 ? local472 : local464) + local441;
										if (local540 >= 0) {
											local418 = false;
										}
									}
								}
							}
						}
					}
					if (local418) {
						local411.method9004();
						Static53.method902(local411);
					}
				}
				if (Static469.anInt8256 == 0) {
					Static117.aClass100_5.method8794(Static180.anInterface20_1);
				}
				Static117.aClass100_5.F(-local211, -local213);
				Static117.aClass100_5.b(local293, local342, local298, local347, local219);
				Static622.method8664(local219 + Static69.aDouble1);
				Static137.aDouble3 = Static69.aDouble1 + local219;
				if (Static469.anInt8256 == 1) {
					Static19.anInt320 = local32;
					Static272.anInt6592 = local16 - Static233.anInt4691 - local211;
					Static422.anInt7721 = local30;
					Static233.anInt4694 = local20 - Static261.anInt5198 - local213;
					Static117.aClass100_5.DA(Static272.anInt6592, Static233.anInt4694, Static422.anInt7721, Static19.anInt320);
				} else {
					Static272.anInt6592 = Static173.anInt3607 + local16 - Static233.anInt4691 - local211;
					Static422.anInt7721 = local30;
					Static233.anInt4694 = local20 + Static449.anInt8044 - Static261.anInt5198 - local213;
					Static19.anInt320 = local32;
					Static117.aClass100_5.DA(Static272.anInt6592, Static233.anInt4694, Static422.anInt7721, Static19.anInt320);
				}
				Static443.method6843(Static287.aClass65_4);
				if (local369 > 0) {
					Static117.aClass100_5.KA(0, local349, Static164.anInt3399, local349 + local369);
					Static117.aClass100_5.ya();
					Static117.aClass100_5.GA(Static270.anInt5360);
					Static151.method2375(arg14, arg6, arg2, arg4, arg13, arg1, arg11, arg5, arg9, arg10, arg7, arg0, arg12, arg8, arg15, arg3, 1, false);
				}
				if (local300 > 0) {
					Static117.aClass100_5.KA(local314, local365, local300 + local314, local365 - -local347);
					Static117.aClass100_5.ya();
					Static117.aClass100_5.GA(Static270.anInt5360);
					Static151.method2375(arg14, arg6, arg2, arg4, arg13, arg1, arg11, arg5, arg9, arg10, arg7, arg0, arg12, arg8, arg15, arg3, 1, false);
				}
				Static117.aClass100_5.la();
				Static42.method802();
				if (Static469.anInt8256 == 0) {
					Static117.aClass100_5.method8854();
				}
				Static69.aDouble1 += local219;
				Static261.anInt5198 += local213;
				Static233.anInt4691 += local211;
				Static240.anInt4801 = local100 + Static173.anInt3607 - Static233.anInt4691;
				Static617.anInt10193 = Static449.anInt8044 + local122 - Static261.anInt5198;
				if (Static469.anInt8256 == 1) {
					Static426.anInt7764 += local215;
					Static14.anInt268 += local217;
					for (@Pc(787) int local787 = 0; local787 < Static316.anInt6064; local787++) {
						@Pc(798) int local798 = Static507.method7514(Static316.anInt6064, local787 + Static14.anInt268) * Static406.anInt7520;
						for (local420 = 0; local420 < Static406.anInt7520; local420++) {
							@Pc(812) int local812 = Static507.method7514(Static406.anInt7520, local420 + Static426.anInt7764) + local798;
							@Pc(860) boolean local860 = local787 >= local279 && local787 < local281 + local279 || local285 <= local787 && local787 < local289 + local285 && local420 >= local283 && local287 + local283 > local420;
							Static363.anInterface20Array1[local812].method8647(local420 * Static345.anInt6515, local787 * Static11.anInt221, Static345.anInt6515, Static11.anInt221, local860);
						}
					}
				}
			} else {
				Static133.aBoolean183 = true;
			}
		}
		if (Static133.aBoolean183) {
			Static240.anInt4801 = Static173.anInt3607;
			Static233.anInt4691 = 0;
			Static611.anInt10089 = arg4;
			Static388.anInt7302 = arg2;
			Static294.anInt5784 = arg6;
			Static617.anInt10193 = Static449.anInt8044;
			Static261.anInt5198 = 0;
			Static69.aDouble1 = 0.0D;
			if (Static469.anInt8256 == 0) {
				Static117.aClass100_5.method8794(Static180.anInterface20_1);
			}
			Static117.aClass100_5.la();
			Static117.aClass100_5.ya();
			Static117.aClass100_5.GA(Static270.anInt5360);
			Static105.aClass154_1.method6569(Static294.anInt5784, Static388.anInt7302, Static611.anInt10089, Static625.anInt10293, Static419.anInt7662, Static576.anInt4608);
			Static117.aClass100_5.method8850(Static105.aClass154_1);
			if (Static469.anInt8256 == 1) {
				Static233.anInt4694 = local20;
				Static422.anInt7721 = local30;
				Static19.anInt320 = local32;
				Static272.anInt6592 = local16;
				Static117.aClass100_5.DA(Static272.anInt6592, Static233.anInt4694, Static422.anInt7721, Static19.anInt320);
			} else {
				Static272.anInt6592 = Static173.anInt3607 + local16;
				Static19.anInt320 = local32;
				Static233.anInt4694 = Static449.anInt8044 + local20;
				Static422.anInt7721 = local30;
				Static117.aClass100_5.DA(Static272.anInt6592, Static233.anInt4694, Static422.anInt7721, Static19.anInt320);
			}
			Static137.aDouble3 = 0.0D;
			Static287.aClass65_4.method1719();
			Static443.method6843(Static287.aClass65_4);
			Static151.method2375(arg14, arg6, arg2, arg4, arg13, arg1, arg11, arg5, arg9, arg10, arg7, arg0, arg12, arg8, arg15, arg3, 1, false);
			Static42.method802();
			Static133.aBoolean183 = false;
			if (Static469.anInt8256 == 0) {
				Static117.aClass100_5.method8854();
			}
			if (Static469.anInt8256 == 1) {
				Static73.method1292();
			}
		}
		if (Static469.anInt8256 == 0) {
			Static180.anInterface20_1.method8646(Static240.anInt4801, Static617.anInt10193, Static609.anInt10076, Static8.anInt159, 0, 0);
		}
		Static302.anInt5876++;
		Static622.method8664(Static69.aDouble1);
		Static159.aDouble5 = Static69.aDouble1;
		if (Static469.anInt8256 == 0 || Static469.anInt8256 == 2) {
			if (Static469.anInt8256 == 2) {
				Static117.aClass100_5.GA(Static270.anInt5360);
				Static117.aClass100_5.ya();
			}
			Static29.anInt623 = local32;
			Static393.anInt7361 = local20 + Static449.anInt8044 - Static617.anInt10193 - Static261.anInt5198;
			Static153.anInt2793 = local30;
			Static124.anInt2422 = Static173.anInt3607 + local16 - Static240.anInt4801 - Static233.anInt4691;
			Static117.aClass100_5.DA(Static124.anInt2422, Static393.anInt7361, Static153.anInt2793, Static29.anInt623);
		} else if (Static469.anInt8256 == 1) {
			Static393.anInt7361 = local20 - Static261.anInt5198;
			Static124.anInt2422 = local16 - Static233.anInt4691;
			Static153.anInt2793 = local30;
			Static29.anInt623 = local32;
			Static117.aClass100_5.DA(Static124.anInt2422, Static393.anInt7361, Static153.anInt2793, Static29.anInt623);
			Static117.aClass100_5.KA(Static240.anInt4801, Static617.anInt10193, Static240.anInt4801 + Static609.anInt10076, Static8.anInt159 + Static617.anInt10193);
		}
		Static151.method2375(arg14, arg6, arg2, arg4, arg13, arg1, arg11, arg5, arg9, arg10, arg7, arg0, arg12, arg8, arg15, arg3, Static469.anInt8256 == 2 ? 0 : 2, Static469.anInt8256 == 1);
		Static117.aClass100_5.la();
		Static117.aClass100_5.DA(local16, local20, local24, local28);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	public static void method8715(@OriginalArg(0) int arg0) {
		@Pc(13) Class6_Sub2_Sub9 local13 = Static144.method2332(16, arg0);
		local13.method3722();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!rg;B)V")
	public static void method8716(@OriginalArg(0) Class6_Sub40 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static406.aClass73_4 != null) {
			@Pc(24) int local24;
			try {
				Static406.aClass73_4.method1970(0L);
				Static406.aClass73_4.method1967(local12);
				for (local24 = 0; local24 < 24 && local12[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local24 = 0; local24 < 24; local24++) {
					local12[local24] = -1;
				}
			}
		}
		arg0.method8562(0, local12, 24);
	}
}
