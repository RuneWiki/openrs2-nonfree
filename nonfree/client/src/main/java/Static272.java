import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jca", name = "B", descriptor = "Lclient!gj;")
	public static Class143 aClass143_64;

	@OriginalMember(owner = "client!jca", name = "D", descriptor = "Lclient!be;")
	public static Class32 aClass32_3;

	@OriginalMember(owner = "client!jca", name = "E", descriptor = "Lclient!gj;")
	public static Class143 aClass143_65;

	@OriginalMember(owner = "client!jca", name = "C", descriptor = "I")
	public static int anInt5119 = 0;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B[IIII[[[BII[I[IIZ[IIB[IIZ)V")
	public static void method4335(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(12) int[] arg10, @OriginalArg(13) int arg11, @OriginalArg(14) byte arg12, @OriginalArg(15) int[] arg13, @OriginalArg(16) int arg14, @OriginalArg(17) boolean arg15) {
		if (Static418.anInt7055 == -1) {
			return;
		}
		@Pc(12) int[] local12 = Static535.aClass16_10.Y();
		@Pc(16) int local16 = local12[0];
		@Pc(20) int local20 = local12[1];
		@Pc(24) int local24 = local12[2];
		@Pc(28) int local28 = local12[3];
		@Pc(30) int local30 = local24;
		@Pc(32) int local32 = local28;
		if (Static418.anInt7055 == 1) {
			local32 = (int) ((double) local28 * (double) Static278.anInt5212 / (double) Static554.anInt8569);
			local30 = (int) ((double) local24 * (double) Static278.anInt5212 / (double) Static554.anInt8569);
		}
		if (!Static674.aBoolean763) {
			if (Static418.anInt7055 == 1) {
				Static601.method8007();
			}
			@Pc(68) int local68 = arg14 - Static246.anInt4585;
			@Pc(73) int local73 = arg1 - Static378.anInt6663;
			@Pc(78) int local78 = arg11 - Static12.anInt155;
			@Pc(100) int local100 = (int) ((double) local30 * ((double) local78 * Static544.aDouble29 + Static314.aDouble22 * (double) local68 + Static561.aDouble31 * (double) local73) / (double) arg6);
			@Pc(122) int local122 = (int) (((double) local68 * Static257.aDouble19 + Static197.aDouble17 * (double) local73 + (double) local78 * Static679.aDouble36) * (double) local32 / (double) arg6);
			@Pc(137) double local137 = Static438.aDouble27 * (double) local78 + (double) local68 * Static4.aDouble1 + (double) local73 * Static310.aDouble21;
			@Pc(144) int local144 = Static575.anInt9134 + local100 - Static586.anInt9278;
			@Pc(151) int local151 = Static489.anInt8294 + local122 - Static417.anInt7050;
			@Pc(155) int local155 = local144 + Static224.anInt4089;
			@Pc(159) int local159 = local151 + Static278.anInt5212;
			if (local144 >= 0 && local151 >= 0 && local155 <= Static137.anInt2535 && Static554.anInt8569 >= local159 || Static418.anInt7055 == 2) {
				Static486.anInt8256 = local144;
				if (Static418.anInt7055 == 2) {
					Static303.aDouble35 = -local137;
				}
				Static88.anInt1938 = local151;
			} else if (local155 > 0 && local159 > 0 && Static137.anInt2535 > local144 && Static554.anInt8569 > local151) {
				@Pc(213) int local213 = local144 - Static575.anInt9134;
				@Pc(217) int local217 = local151 - Static489.anInt8294;
				@Pc(219) int local219 = 0;
				@Pc(221) int local221 = 0;
				@Pc(223) int local223 = 0;
				@Pc(225) int local225 = 0;
				@Pc(227) double local227 = 0.0D;
				if (Static418.anInt7055 == 0) {
					local227 = local137 + Static303.aDouble35;
					local219 = local213;
					local221 = local217;
				} else if (Static418.anInt7055 == 1) {
					local223 = local213 / Static552.anInt8938;
					local225 = local217 / Static502.anInt8445;
					local219 = local223 * Static552.anInt8938;
					local221 = local225 * Static502.anInt8445;
					local227 = (double) (local219 * local213 + local221 * local217) * (Static303.aDouble35 + local137) / (double) (local217 * local217 + local213 * local213);
				}
				local227 = -local227;
				@Pc(289) int local289 = 0;
				@Pc(291) int local291 = 0;
				@Pc(293) int local293 = 0;
				@Pc(295) int local295 = 0;
				@Pc(297) int local297 = 0;
				@Pc(299) int local299 = 0;
				@Pc(311) int local311;
				@Pc(309) int local309;
				@Pc(313) int local313;
				@Pc(325) int local325;
				if (local219 >= 0) {
					local309 = Static137.anInt2535 - local219;
					local311 = 0;
					local313 = local309;
					if (Static418.anInt7055 == 1) {
						local297 = local223;
						local293 = Static67.anInt9115 - local223;
					}
					local325 = local219;
				} else {
					local311 = -local219;
					local309 = Static137.anInt2535 + local219;
					local313 = 0;
					if (Static418.anInt7055 == 1) {
						local293 = 0;
						local297 = -local223;
					}
					local325 = local311;
				}
				@Pc(362) int local362;
				@Pc(359) int local359;
				@Pc(355) int local355;
				@Pc(364) int local364;
				@Pc(383) int local383;
				if (local221 < 0) {
					local355 = 0;
					local359 = local221 + Static554.anInt8569;
					local362 = -local221;
					local364 = local362;
					if (Static418.anInt7055 == 1) {
						local291 = -local225;
						local289 = 0;
						local299 = Static653.anInt10053 + local225;
						local295 = local291;
					}
					local383 = local362;
				} else {
					local362 = 0;
					local359 = Static554.anInt8569 - local221;
					local383 = 0;
					if (Static418.anInt7055 == 1) {
						local291 = local225;
						local295 = 0;
						local289 = Static653.anInt10053 - local225;
						local299 = local289;
					}
					local364 = local221;
					local355 = local359;
				}
				@Pc(416) Class105 local416 = Static455.aClass211_3.aClass105_7;
				@Pc(430) int local430;
				for (@Pc(421) Class23_Sub6 local421 = (Class23_Sub6) local416.method2444(); local421 != null; local421 = (Class23_Sub6) local416.method2448()) {
					@Pc(426) Class23_Sub4[] local426 = local421.aClass23_Sub4Array1;
					@Pc(428) boolean local428 = true;
					for (local430 = 0; local430 < local426.length; local430++) {
						@Pc(436) Class23_Sub4 local436 = local426[local430];
						@Pc(439) int local439 = local436.anInt2467;
						@Pc(442) int local442 = local436.anInt2464;
						@Pc(445) int local445 = local436.anInt2463;
						@Pc(448) int local448 = local436.anInt2465;
						@Pc(455) int local455;
						local436.anInt2465 = local455 = local448 - local221;
						@Pc(463) int local463;
						local436.anInt2464 = local463 = local442 - local221;
						@Pc(470) int local470;
						local436.anInt2463 = local470 = local445 - local219;
						@Pc(477) int local477;
						local436.anInt2467 = local477 = local439 - local219;
						@Pc(481) int local481 = local436.anInt2466;
						if (local428) {
							@Pc(497) int local497 = (local470 <= local477 ? local470 : local477) - local481;
							if (Static137.anInt2535 >= local497) {
								@Pc(513) int local513 = (local455 <= local463 ? local455 : local463) - local481;
								if (local513 <= Static554.anInt8569) {
									@Pc(529) int local529 = local481 + (local470 > local477 ? local470 : local477);
									if (local529 >= 0) {
										@Pc(544) int local544 = (local463 < local455 ? local455 : local463) + local481;
										if (local544 >= 0) {
											local428 = false;
										}
									}
								}
							}
						}
					}
					if (local428) {
						local421.method8588();
						Static305.method4702(local421);
					}
				}
				if (Static418.anInt7055 == 0) {
					Static535.aClass16_10.method8152(Static632.anInterface8_1);
				}
				Static535.aClass16_10.F(-local219, -local221);
				Static535.aClass16_10.b(local311, local362, local309, local359, local227);
				Static238.method3816(Static303.aDouble35 + local227);
				Static154.aDouble16 = Static303.aDouble35 + local227;
				if (Static418.anInt7055 == 1) {
					Static95.anInt2053 = local20 - local221 - Static417.anInt7050;
					Static641.anInt9891 = local32;
					Static323.anInt6010 = local16 - local219 - Static586.anInt9278;
					Static525.anInt8702 = local30;
					Static535.aClass16_10.DA(Static323.anInt6010, Static95.anInt2053, Static525.anInt8702, Static641.anInt9891);
				} else {
					Static95.anInt2053 = local20 + Static489.anInt8294 - local221 - Static417.anInt7050;
					Static525.anInt8702 = local30;
					Static323.anInt6010 = local16 + Static575.anInt9134 - Static586.anInt9278 - local219;
					Static641.anInt9891 = local32;
					Static535.aClass16_10.DA(Static323.anInt6010, Static95.anInt2053, Static525.anInt8702, Static641.anInt9891);
				}
				Static216.method3398(Static455.aClass211_3);
				if (local364 > 0) {
					Static535.aClass16_10.KA(0, local355, Static137.anInt2535, local355 + local364);
					Static535.aClass16_10.ya();
					Static535.aClass16_10.GA(Static343.anInt6172);
					Static643.method8445(arg2, arg14, arg1, arg11, arg4, arg10, arg7, arg0, arg13, arg8, arg5, arg12, arg9, arg3, arg15, arg6, 1, false);
				}
				if (local325 > 0) {
					Static535.aClass16_10.KA(local313, local383, local313 + local325, local359 + local383);
					Static535.aClass16_10.ya();
					Static535.aClass16_10.GA(Static343.anInt6172);
					Static643.method8445(arg2, arg14, arg1, arg11, arg4, arg10, arg7, arg0, arg13, arg8, arg5, arg12, arg9, arg3, arg15, arg6, 1, false);
				}
				Static535.aClass16_10.la();
				Static517.method7337();
				if (Static418.anInt7055 == 0) {
					Static535.aClass16_10.method8138();
				}
				Static303.aDouble35 += local227;
				Static417.anInt7050 += local221;
				Static586.anInt9278 += local219;
				Static486.anInt8256 = local100 + Static575.anInt9134 - Static586.anInt9278;
				Static88.anInt1938 = Static489.anInt8294 + local122 - Static417.anInt7050;
				if (Static418.anInt7055 == 1) {
					Static638.anInt9840 += local225;
					Static125.anInt2416 += local223;
					for (@Pc(786) int local786 = 0; local786 < Static653.anInt10053; local786++) {
						@Pc(798) int local798 = Static88.method1799(local786 + Static638.anInt9840, Static653.anInt10053) * Static67.anInt9115;
						for (local430 = 0; local430 < Static67.anInt9115; local430++) {
							@Pc(811) int local811 = local798 + Static88.method1799(local430 + Static125.anInt2416, Static67.anInt9115);
							@Pc(856) boolean local856 = local786 >= local289 && local289 + local291 > local786 || local786 >= local295 && local299 + local295 > local786 && local430 >= local293 && local430 < local293 + local297;
							Static560.anInterface8Array1[local811].method8722(local430 * Static552.anInt8938, local786 * Static502.anInt8445, Static552.anInt8938, Static502.anInt8445, local856);
						}
					}
				}
			} else {
				Static674.aBoolean763 = true;
			}
		}
		if (Static674.aBoolean763) {
			Static586.anInt9278 = 0;
			Static486.anInt8256 = Static575.anInt9134;
			Static417.anInt7050 = 0;
			Static378.anInt6663 = arg1;
			Static12.anInt155 = arg11;
			Static246.anInt4585 = arg14;
			Static303.aDouble35 = 0.0D;
			Static88.anInt1938 = Static489.anInt8294;
			if (Static418.anInt7055 == 0) {
				Static535.aClass16_10.method8152(Static632.anInterface8_1);
			}
			Static535.aClass16_10.la();
			Static535.aClass16_10.ya();
			Static535.aClass16_10.GA(Static343.anInt6172);
			Static576.aClass25_8.method4294(Static246.anInt4585, Static378.anInt6663, Static12.anInt155, Static164.anInt3010, Static660.anInt10216, Static267.anInt5037);
			Static535.aClass16_10.method8135(Static576.aClass25_8);
			if (Static418.anInt7055 == 1) {
				Static641.anInt9891 = local32;
				Static525.anInt8702 = local30;
				Static323.anInt6010 = local16;
				Static95.anInt2053 = local20;
				Static535.aClass16_10.DA(Static323.anInt6010, Static95.anInt2053, Static525.anInt8702, Static641.anInt9891);
			} else {
				Static323.anInt6010 = Static575.anInt9134 + local16;
				Static641.anInt9891 = local32;
				Static525.anInt8702 = local30;
				Static95.anInt2053 = local20 + Static489.anInt8294;
				Static535.aClass16_10.DA(Static323.anInt6010, Static95.anInt2053, Static525.anInt8702, Static641.anInt9891);
			}
			Static154.aDouble16 = 0.0D;
			Static455.aClass211_3.method4939();
			Static216.method3398(Static455.aClass211_3);
			Static643.method8445(arg2, arg14, arg1, arg11, arg4, arg10, arg7, arg0, arg13, arg8, arg5, arg12, arg9, arg3, arg15, arg6, 1, false);
			Static517.method7337();
			Static674.aBoolean763 = false;
			if (Static418.anInt7055 == 0) {
				Static535.aClass16_10.method8138();
			}
			if (Static418.anInt7055 == 1) {
				Static347.method6587();
			}
		}
		if (Static418.anInt7055 == 0) {
			Static632.anInterface8_1.method8721(Static486.anInt8256, Static88.anInt1938, Static224.anInt4089, Static278.anInt5212, 0, 0);
		}
		Static611.anInt9531++;
		Static238.method3816(Static303.aDouble35);
		Static637.aDouble34 = Static303.aDouble35;
		if (Static418.anInt7055 == 0 || Static418.anInt7055 == 2) {
			if (Static418.anInt7055 == 2) {
				Static535.aClass16_10.GA(Static343.anInt6172);
				Static535.aClass16_10.ya();
			}
			Static344.anInt6203 = local32;
			Static557.anInt8985 = Static575.anInt9134 + local16 - Static486.anInt8256 - Static586.anInt9278;
			Static511.anInt10255 = Static489.anInt8294 + local20 - Static417.anInt7050 - Static88.anInt1938;
			Static204.anInt3800 = local30;
			Static535.aClass16_10.DA(Static557.anInt8985, Static511.anInt10255, Static204.anInt3800, Static344.anInt6203);
		} else if (Static418.anInt7055 == 1) {
			Static204.anInt3800 = local30;
			Static344.anInt6203 = local32;
			Static511.anInt10255 = local20 - Static417.anInt7050;
			Static557.anInt8985 = local16 - Static586.anInt9278;
			Static535.aClass16_10.DA(Static557.anInt8985, Static511.anInt10255, Static204.anInt3800, Static344.anInt6203);
			Static535.aClass16_10.KA(Static486.anInt8256, Static88.anInt1938, Static224.anInt4089 + Static486.anInt8256, Static88.anInt1938 + Static278.anInt5212);
		}
		Static643.method8445(arg2, arg14, arg1, arg11, arg4, arg10, arg7, arg0, arg13, arg8, arg5, arg12, arg9, arg3, arg15, arg6, Static418.anInt7055 == 2 ? 0 : 2, Static418.anInt7055 == 1);
		Static535.aClass16_10.la();
		Static535.aClass16_10.DA(local16, local20, local24, local28);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLclient!kh;)V")
	public static void method4336(@OriginalArg(1) Class208 arg0) {
		if (!Static329.aBoolean166) {
			return;
		}
		if (arg0.anObjectArray15 != null) {
			@Pc(18) Class208 local18 = Static108.method2085(Static452.anInt7746, Static395.anInt6819);
			if (local18 != null) {
				@Pc(24) Class3_Sub13 local24 = new Class3_Sub13();
				local24.aClass208_2 = arg0;
				local24.anObjectArray1 = arg0.anObjectArray15;
				local24.aClass208_1 = local18;
				Static543.method7498(local24);
			}
		}
		@Pc(45) Class3_Sub44 local45 = Static275.method5689(Static545.aClass376_128, Static540.aClass282_4);
		local45.aClass3_Sub17_Sub2_3.method4854(arg0.anInt5653);
		local45.aClass3_Sub17_Sub2_3.method4886(Static169.anInt3050);
		local45.aClass3_Sub17_Sub2_3.method4886(Static452.anInt7746);
		local45.aClass3_Sub17_Sub2_3.method4871(Static395.anInt6819);
		local45.aClass3_Sub17_Sub2_3.method4840(arg0.anInt5608);
		local45.aClass3_Sub17_Sub2_3.method4885(arg0.anInt5645);
		Static616.method8089(local45);
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
	public static void method4337() {
		if (Static10.anIntArray5 != null && Static540.anIntArray454 != null) {
			return;
		}
		Static10.anIntArray5 = new int[256];
		Static540.anIntArray454 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static10.anIntArray5[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static540.anIntArray454[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIILclient!ha;III)V")
	public static void method4339(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if ((Static520.aClass102_31 == null || Static454.aClass102_33 == null || Static505.aClass102_35 == null) && Static235.aClass143_57.method3130(Static115.anInt2298) && Static235.aClass143_57.method3130(Static43.anInt1221) && Static235.aClass143_57.method3130(Static63.anInt8307)) {
			@Pc(31) Class150 local31 = Static683.method3275(Static235.aClass143_57, Static43.anInt1221, 0);
			Static454.aClass102_33 = arg2.method8132(local31, true);
			local31.method3272();
			Static369.aClass102_9 = arg2.method8132(local31, true);
			Static520.aClass102_31 = arg2.method8132(Static683.method3275(Static235.aClass143_57, Static115.anInt2298, 0), true);
			@Pc(56) Class150 local56 = Static683.method3275(Static235.aClass143_57, Static63.anInt8307, 0);
			Static505.aClass102_35 = arg2.method8132(local56, true);
			local56.method3272();
			Static371.aClass102_24 = arg2.method8132(local56, true);
		}
		if (Static520.aClass102_31 == null || Static454.aClass102_33 == null || Static505.aClass102_35 == null) {
			return;
		}
		@Pc(89) int local89 = (arg4 - Static505.aClass102_35.method6957() * 2) / Static520.aClass102_31.method6957();
		for (@Pc(91) int local91 = 0; local91 < local89; local91++) {
			Static520.aClass102_31.method6961(arg0 + Static505.aClass102_35.method6957() + Static520.aClass102_31.method6957() * local91, arg3 - -arg1 - Static520.aClass102_31.method6962());
		}
		@Pc(132) int local132 = (arg1 - Static505.aClass102_35.method6962() - 20) / Static454.aClass102_33.method6962();
		for (@Pc(134) int local134 = 0; local134 < local132; local134++) {
			Static454.aClass102_33.method6961(arg0, arg3 + local134 * Static454.aClass102_33.method6962() + 20);
			Static369.aClass102_9.method6961(arg0 + arg4 - Static369.aClass102_9.method6957(), arg3 - -(local134 * Static454.aClass102_33.method6962()) + 20);
		}
		Static505.aClass102_35.method6961(arg0, arg1 + arg3 - Static505.aClass102_35.method6962());
		Static371.aClass102_24.method6961(arg4 + arg0 - Static505.aClass102_35.method6957(), -Static505.aClass102_35.method6962() + arg3 + arg1);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)Lclient!pt;")
	public static Class3_Sub9_Sub5 method4340() {
		return Static402.aClass3_Sub9_Sub5_2;
	}
}
