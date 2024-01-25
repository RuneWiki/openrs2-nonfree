import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
	public static int anInt7803;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
	public static int anInt7805;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "[I")
	public static final int[] anIntArray413 = new int[4096];

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "Z")
	public static boolean aBoolean546 = true;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
	public static int anInt7807 = 0;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	public static void method6860() {
		Static285.method4777();
		Static455.aBoolean533 = false;
		Static226.method5053(Static78.anInt1261, Static252.anInt4767, Static501.anInt8738, Static189.anInt3199);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[I[III[I[[[B[IZIIIIBZII[I)V")
	public static void method6862(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) byte arg11, @OriginalArg(14) boolean arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int[] arg15) {
		if (Static18.anInt243 == -1) {
			return;
		}
		@Pc(14) int[] local14 = Static22.aClass144_1.Y();
		@Pc(18) int local18 = local14[0];
		@Pc(22) int local22 = local14[1];
		@Pc(26) int local26 = local14[2];
		@Pc(30) int local30 = local14[3];
		@Pc(32) int local32 = local26;
		@Pc(34) int local34 = local30;
		if (Static18.anInt243 == 1) {
			local34 = (int) ((double) local30 * (double) Static649.anInt10660 / (double) Static347.anInt5886);
			local32 = (int) ((double) Static649.anInt10660 * (double) local26 / (double) Static347.anInt5886);
		}
		if (!Static282.aBoolean384) {
			if (Static18.anInt243 == 1) {
				Static118.method1851();
			}
			@Pc(76) int local76 = arg8 - Static121.anInt1981;
			@Pc(81) int local81 = arg3 - Static33.anInt540;
			@Pc(86) int local86 = arg10 - Static484.anInt7504;
			@Pc(108) int local108 = (int) ((double) local32 * (Static211.aDouble12 * (double) local86 + (double) local81 * Static419.aDouble21 + Static237.aDouble14 * (double) local76) / (double) arg13);
			@Pc(130) int local130 = (int) ((double) local34 * ((double) local86 * Static615.aDouble20 + (double) local76 * Static121.aDouble1 + Static566.aDouble19 * (double) local81) / (double) arg13);
			@Pc(145) double local145 = Static662.aDouble23 * (double) local86 + Static654.aDouble22 * (double) local76 + Static404.aDouble16 * (double) local81;
			@Pc(152) int local152 = Static296.anInt5320 + local108 - Static491.anInt8479;
			@Pc(159) int local159 = Static302.anInt5402 + local130 - Static203.anInt3517;
			@Pc(164) int local164 = local152 + Static453.anInt7570;
			@Pc(168) int local168 = local159 + Static649.anInt10660;
			if (local152 >= 0 && local159 >= 0 && local164 <= Static187.anInt3099 && local168 <= Static347.anInt5886 || Static18.anInt243 == 2) {
				Static35.anInt549 = local159;
				if (Static18.anInt243 == 2) {
					Static683.aDouble26 = -local145;
				}
				Static673.anInt10975 = local152;
			} else if (local164 > 0 && local168 > 0 && Static187.anInt3099 > local152 && Static347.anInt5886 > local159) {
				@Pc(231) int local231 = local152 - Static296.anInt5320;
				@Pc(236) int local236 = local159 - Static302.anInt5402;
				@Pc(238) int local238 = 0;
				@Pc(240) int local240 = 0;
				@Pc(242) int local242 = 0;
				@Pc(244) int local244 = 0;
				@Pc(246) double local246 = 0.0D;
				if (Static18.anInt243 == 0) {
					local246 = local145 + Static683.aDouble26;
					local240 = local236;
					local238 = local231;
				} else if (Static18.anInt243 == 1) {
					local244 = local236 / Static611.anInt10061;
					local242 = local231 / Static599.anInt9885;
					local238 = Static599.anInt9885 * local242;
					local240 = local244 * Static611.anInt10061;
					local246 = (local145 + Static683.aDouble26) * (double) (local231 * local238 + local236 * local240) / (double) (local236 * local236 + local231 * local231);
				}
				local246 = -local246;
				@Pc(311) int local311 = 0;
				@Pc(313) int local313 = 0;
				@Pc(315) int local315 = 0;
				@Pc(317) int local317 = 0;
				@Pc(319) int local319 = 0;
				@Pc(321) int local321 = 0;
				@Pc(326) int local326;
				@Pc(330) int local330;
				@Pc(332) int local332;
				@Pc(334) int local334;
				if (local238 < 0) {
					local326 = -local238;
					local330 = Static187.anInt3099 + local238;
					local332 = 0;
					local334 = local326;
					if (Static18.anInt243 == 1) {
						local319 = -local242;
						local315 = 0;
					}
				} else {
					local330 = Static187.anInt3099 - local238;
					local326 = 0;
					if (Static18.anInt243 == 1) {
						local319 = local242;
						local315 = Static93.anInt1647 - local242;
					}
					local334 = local238;
					local332 = local330;
				}
				@Pc(372) int local372;
				@Pc(378) int local378;
				@Pc(374) int local374;
				@Pc(380) int local380;
				@Pc(382) int local382;
				if (local240 < 0) {
					local372 = -local240;
					local374 = 0;
					local378 = Static347.anInt5886 + local240;
					local380 = local372;
					local382 = local372;
					if (Static18.anInt243 == 1) {
						local313 = -local244;
						local311 = 0;
						local317 = local313;
						local321 = Static117.anInt1906 + local244;
					}
				} else {
					local372 = 0;
					local378 = Static347.anInt5886 - local240;
					local374 = local378;
					local382 = 0;
					local380 = local240;
					if (Static18.anInt243 == 1) {
						local317 = 0;
						local313 = local244;
						local311 = Static117.anInt1906 - local244;
						local321 = local311;
					}
				}
				@Pc(434) Class283 local434 = Static89.aClass307_5.aClass283_13;
				@Pc(448) int local448;
				for (@Pc(439) Class4_Sub9 local439 = (Class4_Sub9) local434.method6791(); local439 != null; local439 = (Class4_Sub9) local434.method6792()) {
					@Pc(444) Class4_Sub1[] local444 = local439.aClass4_Sub1Array1;
					@Pc(446) boolean local446 = true;
					for (local448 = 0; local448 < local444.length; local448++) {
						@Pc(454) Class4_Sub1 local454 = local444[local448];
						@Pc(457) int local457 = local454.anInt28;
						@Pc(460) int local460 = local454.anInt29;
						@Pc(463) int local463 = local454.anInt31;
						@Pc(466) int local466 = local454.anInt32;
						@Pc(469) int local469 = local454.anInt30;
						@Pc(476) int local476;
						local454.anInt31 = local476 = local463 - local238;
						@Pc(483) int local483;
						local454.anInt32 = local483 = local466 - local240;
						@Pc(491) int local491;
						local454.anInt29 = local491 = local460 - local240;
						@Pc(499) int local499;
						local454.anInt28 = local499 = local457 - local238;
						if (local446) {
							@Pc(515) int local515 = (local499 >= local476 ? local476 : local499) - local469;
							if (Static187.anInt3099 >= local515) {
								@Pc(535) int local535 = (local483 > local491 ? local491 : local483) - local469;
								if (local535 <= Static347.anInt5886) {
									@Pc(550) int local550 = local469 + (local476 > local499 ? local476 : local499);
									if (local550 >= 0) {
										@Pc(567) int local567 = local469 + (local483 <= local491 ? local491 : local483);
										if (local567 >= 0) {
											local446 = false;
										}
									}
								}
							}
						}
					}
					if (local446) {
						local439.method9473();
						Static51.method942(local439);
					}
				}
				if (Static18.anInt243 == 0) {
					Static22.aClass144_1.method6891(Static456.anInterface22_1);
				}
				Static22.aClass144_1.F(-local238, -local240);
				Static22.aClass144_1.b(local326, local372, local330, local378, local246);
				Static464.method6835(Static683.aDouble26 + local246);
				Static231.aDouble13 = local246 + Static683.aDouble26;
				if (Static18.anInt243 == 1) {
					Static464.anInt7770 = local34;
					Static523.anInt9004 = local32;
					Static686.anInt11144 = local18 - local238 - Static491.anInt8479;
					Static585.anInt9689 = local22 - local240 - Static203.anInt3517;
					Static22.aClass144_1.DA(Static686.anInt11144, Static585.anInt9689, Static523.anInt9004, Static464.anInt7770);
				} else {
					Static523.anInt9004 = local32;
					Static585.anInt9689 = Static302.anInt5402 + local22 - Static203.anInt3517 - local240;
					Static464.anInt7770 = local34;
					Static686.anInt11144 = local18 + Static296.anInt5320 - local238 - Static491.anInt8479;
					Static22.aClass144_1.DA(Static686.anInt11144, Static585.anInt9689, Static523.anInt9004, Static464.anInt7770);
				}
				Static285.method4780(Static89.aClass307_5);
				if (local380 > 0) {
					Static22.aClass144_1.KA(0, local374, Static187.anInt3099, local380 + local374);
					Static22.aClass144_1.ya();
					Static22.aClass144_1.GA(Static651.anInt10688);
					Static362.method4763(arg14, arg8, arg3, arg10, arg6, arg5, arg7, arg1, arg15, arg2, arg0, arg11, arg9, arg4, arg12, arg13, 1, false);
				}
				if (local334 > 0) {
					Static22.aClass144_1.KA(local332, local382, local332 + local334, local382 + local378);
					Static22.aClass144_1.ya();
					Static22.aClass144_1.GA(Static651.anInt10688);
					Static362.method4763(arg14, arg8, arg3, arg10, arg6, arg5, arg7, arg1, arg15, arg2, arg0, arg11, arg9, arg4, arg12, arg13, 1, false);
				}
				Static22.aClass144_1.la();
				Static318.method5037();
				if (Static18.anInt243 == 0) {
					Static22.aClass144_1.method6953();
				}
				Static491.anInt8479 += local238;
				Static683.aDouble26 += local246;
				Static203.anInt3517 += local240;
				Static35.anInt549 = Static302.anInt5402 + local130 - Static203.anInt3517;
				Static673.anInt10975 = local108 + Static296.anInt5320 - Static491.anInt8479;
				if (Static18.anInt243 == 1) {
					Static511.anInt8867 += local242;
					Static515.anInt8875 += local244;
					for (@Pc(828) int local828 = 0; local828 < Static117.anInt1906; local828++) {
						@Pc(839) int local839 = Static596.method8450(Static515.anInt8875 + local828, Static117.anInt1906) * Static93.anInt1647;
						for (local448 = 0; local448 < Static93.anInt1647; local448++) {
							@Pc(852) int local852 = Static596.method8450(local448 + Static511.anInt8867, Static93.anInt1647) + local839;
							@Pc(909) boolean local909 = local311 <= local828 && local828 < local311 + local313 || local828 >= local317 && local321 + local317 > local828 && local315 <= local448 && local315 + local319 > local448;
							Static276.anInterface22Array1[local852].method9218(local448 * Static599.anInt9885, Static611.anInt10061 * local828, Static599.anInt9885, Static611.anInt10061, local909);
						}
					}
				}
			} else {
				Static282.aBoolean384 = true;
			}
		}
		if (Static282.aBoolean384) {
			Static203.anInt3517 = 0;
			Static491.anInt8479 = 0;
			Static35.anInt549 = Static302.anInt5402;
			Static673.anInt10975 = Static296.anInt5320;
			Static683.aDouble26 = 0.0D;
			Static121.anInt1981 = arg8;
			Static33.anInt540 = arg3;
			Static484.anInt7504 = arg10;
			if (Static18.anInt243 == 0) {
				Static22.aClass144_1.method6891(Static456.anInterface22_1);
			}
			Static22.aClass144_1.la();
			Static22.aClass144_1.ya();
			Static22.aClass144_1.GA(Static651.anInt10688);
			Static65.aClass263_1.method8446(Static121.anInt1981, Static33.anInt540, Static484.anInt7504, Static260.anInt4868, Static530.anInt9101, Static16.anInt226);
			Static22.aClass144_1.method6896(Static65.aClass263_1);
			if (Static18.anInt243 == 1) {
				Static686.anInt11144 = local18;
				Static523.anInt9004 = local32;
				Static464.anInt7770 = local34;
				Static585.anInt9689 = local22;
				Static22.aClass144_1.DA(Static686.anInt11144, Static585.anInt9689, Static523.anInt9004, Static464.anInt7770);
			} else {
				Static464.anInt7770 = local34;
				Static686.anInt11144 = Static296.anInt5320 + local18;
				Static585.anInt9689 = local22 + Static302.anInt5402;
				Static523.anInt9004 = local32;
				Static22.aClass144_1.DA(Static686.anInt11144, Static585.anInt9689, Static523.anInt9004, Static464.anInt7770);
			}
			Static231.aDouble13 = 0.0D;
			Static89.aClass307_5.method7676();
			Static285.method4780(Static89.aClass307_5);
			Static362.method4763(arg14, arg8, arg3, arg10, arg6, arg5, arg7, arg1, arg15, arg2, arg0, arg11, arg9, arg4, arg12, arg13, 1, false);
			Static318.method5037();
			Static282.aBoolean384 = false;
			if (Static18.anInt243 == 0) {
				Static22.aClass144_1.method6953();
			}
			if (Static18.anInt243 == 1) {
				Static279.method7930();
			}
		}
		if (Static18.anInt243 == 0) {
			Static456.anInterface22_1.method9219(Static673.anInt10975, Static35.anInt549, Static453.anInt7570, Static649.anInt10660, 0, 0);
		}
		Static186.anInt3088++;
		Static464.method6835(Static683.aDouble26);
		Static210.aDouble11 = Static683.aDouble26;
		if (Static18.anInt243 == 0 || Static18.anInt243 == 2) {
			if (Static18.anInt243 == 2) {
				Static22.aClass144_1.GA(Static651.anInt10688);
				Static22.aClass144_1.ya();
			}
			Static207.anInt3639 = local18 + Static296.anInt5320 - Static673.anInt10975 - Static491.anInt8479;
			Static469.anInt11069 = local34;
			Static458.anInt7635 = Static302.anInt5402 + local22 - Static203.anInt3517 - Static35.anInt549;
			Static346.anInt5880 = local32;
			Static22.aClass144_1.DA(Static207.anInt3639, Static458.anInt7635, Static346.anInt5880, Static469.anInt11069);
		} else if (Static18.anInt243 == 1) {
			Static346.anInt5880 = local32;
			Static469.anInt11069 = local34;
			Static458.anInt7635 = local22 - Static203.anInt3517;
			Static207.anInt3639 = local18 - Static491.anInt8479;
			Static22.aClass144_1.DA(Static207.anInt3639, Static458.anInt7635, Static346.anInt5880, Static469.anInt11069);
			Static22.aClass144_1.KA(Static673.anInt10975, Static35.anInt549, Static453.anInt7570 + Static673.anInt10975, Static649.anInt10660 + Static35.anInt549);
		}
		Static362.method4763(arg14, arg8, arg3, arg10, arg6, arg5, arg7, arg1, arg15, arg2, arg0, arg11, arg9, arg4, arg12, arg13, Static18.anInt243 == 2 ? 0 : 2, Static18.anInt243 == 1);
		Static22.aClass144_1.la();
		Static22.aClass144_1.DA(local18, local22, local26, local30);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZJI)Ljava/lang/String;")
	public static String method6863(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(5) char local5 = ',';
		@Pc(7) char local7 = '.';
		if (arg3 == 0) {
			local5 = '.';
			local7 = ',';
		}
		if (arg3 == 2) {
			local7 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local25 = true;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(52) int local52;
		if (arg0 > 0) {
			for (local48 = 0; local48 < arg0; local48++) {
				local52 = (int) arg2;
				arg2 /= 10L;
				local41.append((char) (local52 + 48 - (int) arg2 * 10));
			}
			local41.append(local5);
		}
		local48 = 0;
		while (true) {
			local52 = (int) arg2;
			arg2 /= 10L;
			local41.append((char) (local52 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local25) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg1) {
				local48++;
				if (local48 % 3 == 0) {
					local41.append(local7);
				}
			}
		}
	}
}
