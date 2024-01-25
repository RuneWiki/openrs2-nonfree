import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
	public static int anInt5417;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
	public static int anInt5419;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
	public static int anInt5421;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "Z")
	public static boolean aBoolean407 = false;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method4765(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static130.method2325(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static541.method7235(local7);
			local7 = Static84.method1755(":", "%3a", local7);
			local7 = Static84.method1755("@", "%40", local7);
			local7 = Static84.method1755("&", "%26", local7);
			local7 = Static84.method1755("#", "%23", local7);
			if (Static134.anApplet1 != null) {
				@Pc(102) Class281 local102 = Static524.aClass207_4.method4568(new URL(Static134.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static483.anInt7606 + "&u=" + (Static603.aString116 == null ? String.valueOf(Static306.aLong151) : Static603.aString116) + "&v1=" + Static332.aString67 + "&v2=" + Static332.aString66 + "&e=" + local7));
				while (local102.anInt7338 == 0) {
					Static491.method6679(1L);
				}
				if (local102.anInt7338 == 1) {
					@Pc(145) DataInputStream local145 = (DataInputStream) local102.anObject17;
					local145.read();
					local145.close();
				}
			}
		} catch (@Pc(152) Exception local152) {
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([IZII[I[II[[[BIIIIB[I[IIZI)V")
	public static void method4766(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int[] arg13, @OriginalArg(14) int[] arg14, @OriginalArg(17) int arg15) {
		if (Static106.anInt2134 == -1) {
			return;
		}
		@Pc(12) int[] local12 = Static340.aClass33_9.Y();
		@Pc(16) int local16 = local12[0];
		@Pc(20) int local20 = local12[1];
		@Pc(24) int local24 = local12[2];
		@Pc(28) int local28 = local12[3];
		@Pc(38) int local38 = local24;
		@Pc(40) int local40 = local28;
		if (Static106.anInt2134 == 1) {
			local38 = (int) ((double) local24 * (double) Static461.anInt7413 / (double) Static118.anInt2257);
			local40 = (int) ((double) Static461.anInt7413 * (double) local28 / (double) Static118.anInt2257);
		}
		if (!Static42.aBoolean73) {
			if (Static106.anInt2134 == 1) {
				Static253.method3679();
			}
			@Pc(77) int local77 = arg15 - Static656.anInt10355;
			@Pc(82) int local82 = arg2 - Static367.anInt5512;
			@Pc(87) int local87 = arg8 - Static69.anInt1458;
			@Pc(109) int local109 = (int) ((double) local38 * (Static246.aDouble16 * (double) local87 + (double) local77 * Static603.aDouble27 + (double) local82 * Static419.aDouble25) / (double) arg10);
			@Pc(131) int local131 = (int) (((double) local87 * Static395.aDouble13 + (double) local77 * Static284.aDouble20 + (double) local82 * Static310.aDouble21) * (double) local40 / (double) arg10);
			@Pc(146) double local146 = (double) local82 * Static278.aDouble18 + (double) local77 * Static201.aDouble15 + Static380.aDouble24 * (double) local87;
			@Pc(153) int local153 = local109 + Static617.anInt9691 - Static536.anInt8305;
			@Pc(160) int local160 = Static590.anInt9079 + local131 - Static55.anInt1261;
			@Pc(164) int local164 = Static445.anInt6953 + local153;
			@Pc(168) int local168 = Static461.anInt7413 + local160;
			if (local153 >= 0 && local160 >= 0 && Static235.anInt5516 >= local164 && local168 <= Static118.anInt2257 || Static106.anInt2134 == 2) {
				if (Static106.anInt2134 == 2) {
					Static270.aDouble17 = -local146;
				}
				Static658.anInt10391 = local153;
				Static426.anInt6744 = local160;
			} else if (local164 > 0 && local168 > 0 && Static235.anInt5516 > local153 && Static118.anInt2257 > local160) {
				@Pc(202) int local202 = local153 - Static617.anInt9691;
				@Pc(207) int local207 = local160 - Static590.anInt9079;
				@Pc(209) int local209 = 0;
				@Pc(211) int local211 = 0;
				@Pc(213) int local213 = 0;
				@Pc(215) int local215 = 0;
				@Pc(217) double local217 = 0.0D;
				if (Static106.anInt2134 == 0) {
					local211 = local207;
					local217 = local146 + Static270.aDouble17;
					local209 = local202;
				} else if (Static106.anInt2134 == 1) {
					local215 = local207 / Static567.anInt8756;
					local213 = local202 / Static614.anInt9423;
					local209 = Static614.anInt9423 * local213;
					local211 = Static567.anInt8756 * local215;
					local217 = (double) (local211 * local207 + local209 * local202) * (local146 + Static270.aDouble17) / (double) (local207 * local207 + local202 * local202);
				}
				local217 = -local217;
				@Pc(277) int local277 = 0;
				@Pc(279) int local279 = 0;
				@Pc(281) int local281 = 0;
				@Pc(283) int local283 = 0;
				@Pc(285) int local285 = 0;
				@Pc(287) int local287 = 0;
				@Pc(296) int local296;
				@Pc(294) int local294;
				@Pc(310) int local310;
				@Pc(308) int local308;
				if (local209 >= 0) {
					local294 = Static235.anInt5516 - local209;
					local296 = 0;
					if (Static106.anInt2134 == 1) {
						local281 = Static217.anInt3516 - local213;
						local285 = local213;
					}
					local308 = local209;
					local310 = local294;
				} else {
					local294 = Static235.anInt5516 + local209;
					local296 = -local209;
					local310 = 0;
					local308 = local296;
					if (Static106.anInt2134 == 1) {
						local285 = -local213;
						local281 = 0;
					}
				}
				@Pc(343) int local343;
				@Pc(341) int local341;
				@Pc(362) int local362;
				@Pc(345) int local345;
				@Pc(347) int local347;
				if (local211 >= 0) {
					local341 = Static118.anInt2257 - local211;
					local343 = 0;
					local345 = local211;
					local347 = 0;
					if (Static106.anInt2134 == 1) {
						local283 = 0;
						local277 = Static257.anInt4179 - local215;
						local279 = local215;
						local287 = local277;
					}
					local362 = local341;
				} else {
					local343 = -local211;
					local362 = 0;
					local341 = Static118.anInt2257 + local211;
					local345 = local343;
					local347 = local343;
					if (Static106.anInt2134 == 1) {
						local277 = 0;
						local279 = -local215;
						local287 = Static257.anInt4179 + local215;
						local283 = local279;
					}
				}
				@Pc(402) Class236 local402 = Static395.aClass223_2.aClass236_5;
				@Pc(416) int local416;
				for (@Pc(407) Class3_Sub6 local407 = (Class3_Sub6) local402.method4958(); local407 != null; local407 = (Class3_Sub6) local402.method4950()) {
					@Pc(412) Class3_Sub4[] local412 = local407.aClass3_Sub4Array1;
					@Pc(414) boolean local414 = true;
					for (local416 = 0; local416 < local412.length; local416++) {
						@Pc(422) Class3_Sub4 local422 = local412[local416];
						@Pc(425) int local425 = local422.anInt3114;
						@Pc(428) int local428 = local422.anInt3111;
						@Pc(431) int local431 = local422.anInt3113;
						@Pc(434) int local434 = local422.anInt3115;
						@Pc(441) int local441;
						local422.anInt3114 = local441 = local425 - local209;
						@Pc(449) int local449;
						local422.anInt3113 = local449 = local431 - local209;
						@Pc(453) int local453 = local422.anInt3112;
						@Pc(460) int local460;
						local422.anInt3115 = local460 = local434 - local211;
						@Pc(468) int local468;
						local422.anInt3111 = local468 = local428 - local211;
						if (local414) {
							@Pc(484) int local484 = (local449 <= local441 ? local449 : local441) - local453;
							if (local484 <= Static235.anInt5516) {
								@Pc(505) int local505 = (local468 < local460 ? local468 : local460) - local453;
								if (Static118.anInt2257 >= local505) {
									@Pc(517) int local517 = (local449 <= local441 ? local441 : local449) + local453;
									if (local517 >= 0) {
										@Pc(528) int local528 = local453 + (local460 > local468 ? local460 : local468);
										if (local528 >= 0) {
											local414 = false;
										}
									}
								}
							}
						}
					}
					if (local414) {
						local407.method8898();
						Static405.method5135(local407);
					}
				}
				if (Static106.anInt2134 == 0) {
					Static340.aClass33_9.method8117(Static417.anInterface18_1);
				}
				Static340.aClass33_9.F(-local209, -local211);
				Static340.aClass33_9.b(local296, local343, local294, local341, local217);
				Static565.method7484(local217 + Static270.aDouble17);
				Static251.aDouble11 = local217 + Static270.aDouble17;
				if (Static106.anInt2134 == 1) {
					Static636.anInt9898 = local20 - Static55.anInt1261 - local211;
					Static82.anInt8417 = local38;
					anInt5419 = local40;
					Static650.anInt10259 = local16 - Static536.anInt8305 - local209;
					Static340.aClass33_9.DA(Static650.anInt10259, Static636.anInt9898, Static82.anInt8417, anInt5419);
				} else {
					anInt5419 = local40;
					Static636.anInt9898 = Static590.anInt9079 + local20 - local211 - Static55.anInt1261;
					Static650.anInt10259 = Static617.anInt9691 + local16 - Static536.anInt8305 - local209;
					Static82.anInt8417 = local38;
					Static340.aClass33_9.DA(Static650.anInt10259, Static636.anInt9898, Static82.anInt8417, anInt5419);
				}
				Static181.method2898(Static395.aClass223_2);
				if (local345 > 0) {
					Static340.aClass33_9.KA(0, local362, Static235.anInt5516, local345 + local362);
					Static340.aClass33_9.ya();
					Static340.aClass33_9.GA(Static531.anInt8226);
					Static622.method8369(arg6, arg15, arg2, arg8, arg7, arg4, arg5, arg14, arg0, arg13, arg9, arg12, arg11, arg3, arg1, arg10, 1, false);
				}
				if (local308 > 0) {
					Static340.aClass33_9.KA(local310, local347, local308 + local310, local347 - -local341);
					Static340.aClass33_9.ya();
					Static340.aClass33_9.GA(Static531.anInt8226);
					Static622.method8369(arg6, arg15, arg2, arg8, arg7, arg4, arg5, arg14, arg0, arg13, arg9, arg12, arg11, arg3, arg1, arg10, 1, false);
				}
				Static340.aClass33_9.la();
				Static449.method6179();
				if (Static106.anInt2134 == 0) {
					Static340.aClass33_9.method8134();
				}
				Static536.anInt8305 += local209;
				Static55.anInt1261 += local211;
				Static270.aDouble17 += local217;
				Static426.anInt6744 = Static590.anInt9079 + local131 - Static55.anInt1261;
				Static658.anInt10391 = Static617.anInt9691 + local109 - Static536.anInt8305;
				if (Static106.anInt2134 == 1) {
					Static473.anInt7504 += local213;
					Static280.anInt10342 += local215;
					for (@Pc(774) int local774 = 0; local774 < Static257.anInt4179; local774++) {
						@Pc(785) int local785 = Static130.method2322(Static280.anInt10342 + local774, Static257.anInt4179) * Static217.anInt3516;
						for (local416 = 0; local416 < Static217.anInt3516; local416++) {
							@Pc(798) int local798 = Static130.method2322(Static473.anInt7504 + local416, Static217.anInt3516) + local785;
							@Pc(834) boolean local834 = local277 <= local774 && local774 < local277 + local279 || local774 >= local283 && local774 < local283 + local287 && local416 >= local281 && local416 < local285 + local281;
							Static151.anInterface18Array1[local798].method8693(Static614.anInt9423 * local416, local774 * Static567.anInt8756, Static614.anInt9423, Static567.anInt8756, local834);
						}
					}
				}
			} else {
				Static42.aBoolean73 = true;
			}
		}
		if (Static42.aBoolean73) {
			Static55.anInt1261 = 0;
			Static426.anInt6744 = Static590.anInt9079;
			Static656.anInt10355 = arg15;
			Static536.anInt8305 = 0;
			Static367.anInt5512 = arg2;
			Static658.anInt10391 = Static617.anInt9691;
			Static69.anInt1458 = arg8;
			Static270.aDouble17 = 0.0D;
			if (Static106.anInt2134 == 0) {
				Static340.aClass33_9.method8117(Static417.anInterface18_1);
			}
			Static340.aClass33_9.la();
			Static340.aClass33_9.ya();
			Static340.aClass33_9.GA(Static531.anInt8226);
			Static665.aClass92_9.method3863(Static656.anInt10355, Static367.anInt5512, Static69.anInt1458, Static494.anInt7907, Static423.anInt6689, Static633.anInt9789);
			Static340.aClass33_9.method8133(Static665.aClass92_9);
			if (Static106.anInt2134 == 1) {
				Static650.anInt10259 = local16;
				Static636.anInt9898 = local20;
				Static82.anInt8417 = local38;
				anInt5419 = local40;
				Static340.aClass33_9.DA(Static650.anInt10259, Static636.anInt9898, Static82.anInt8417, anInt5419);
			} else {
				Static82.anInt8417 = local38;
				anInt5419 = local40;
				Static636.anInt9898 = Static590.anInt9079 + local20;
				Static650.anInt10259 = local16 + Static617.anInt9691;
				Static340.aClass33_9.DA(Static650.anInt10259, Static636.anInt9898, Static82.anInt8417, anInt5419);
			}
			Static251.aDouble11 = 0.0D;
			Static395.aClass223_2.method4810();
			Static181.method2898(Static395.aClass223_2);
			Static622.method8369(arg6, arg15, arg2, arg8, arg7, arg4, arg5, arg14, arg0, arg13, arg9, arg12, arg11, arg3, arg1, arg10, 1, false);
			Static449.method6179();
			Static42.aBoolean73 = false;
			if (Static106.anInt2134 == 0) {
				Static340.aClass33_9.method8134();
			}
			if (Static106.anInt2134 == 1) {
				Static592.method7784();
			}
		}
		if (Static106.anInt2134 == 0) {
			Static417.anInterface18_1.method8692(Static658.anInt10391, Static426.anInt6744, Static445.anInt6953, Static461.anInt7413, 0, 0);
		}
		Static604.anInt9294++;
		Static565.method7484(Static270.aDouble17);
		Static346.aDouble23 = Static270.aDouble17;
		if (Static106.anInt2134 == 0 || Static106.anInt2134 == 2) {
			if (Static106.anInt2134 == 2) {
				Static340.aClass33_9.GA(Static531.anInt8226);
				Static340.aClass33_9.ya();
			}
			Static266.anInt4302 = Static590.anInt9079 + local20 - Static426.anInt6744 - Static55.anInt1261;
			Static543.anInt8401 = local16 + Static617.anInt9691 - Static536.anInt8305 - Static658.anInt10391;
			Static618.anInt9706 = local40;
			Static429.anInt6768 = local38;
			Static340.aClass33_9.DA(Static543.anInt8401, Static266.anInt4302, Static429.anInt6768, Static618.anInt9706);
		} else if (Static106.anInt2134 == 1) {
			Static429.anInt6768 = local38;
			Static618.anInt9706 = local40;
			Static266.anInt4302 = local20 - Static55.anInt1261;
			Static543.anInt8401 = local16 - Static536.anInt8305;
			Static340.aClass33_9.DA(Static543.anInt8401, Static266.anInt4302, Static429.anInt6768, Static618.anInt9706);
			Static340.aClass33_9.KA(Static658.anInt10391, Static426.anInt6744, Static445.anInt6953 + Static658.anInt10391, Static461.anInt7413 + Static426.anInt6744);
		}
		Static622.method8369(arg6, arg15, arg2, arg8, arg7, arg4, arg5, arg14, arg0, arg13, arg9, arg12, arg11, arg3, arg1, arg10, Static106.anInt2134 == 2 ? 0 : 2, Static106.anInt2134 == 1);
		Static340.aClass33_9.la();
		Static340.aClass33_9.DA(local16, local20, local24, local28);
	}
}
