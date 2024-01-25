import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gw", name = "T", descriptor = "I")
	public static int anInt3119;

	@OriginalMember(owner = "client!gw", name = "O", descriptor = "I")
	public static int anInt3115 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIBII)V")
	public static void method2865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static16.anInt362;
		Static83.anInt1716 = 0;
		@Pc(11) int[] local11 = Static325.anIntArray473;
		@Pc(184) int local184;
		@Pc(225) int local225;
		@Pc(273) int local273;
		@Pc(351) int local351;
		@Pc(428) int local428;
		@Pc(872) int local872;
		@Pc(561) int local561;
		for (@Pc(13) int local13 = 0; local13 < Static520.anInt1936 + local7; local13++) {
			@Pc(17) Class12 local17 = null;
			@Pc(37) Class1_Sub1_Sub2 local37;
			if (local7 <= local13) {
				local37 = ((Class2_Sub11) Static71.aClass127_13.method3205((long) Static24.anIntArray39[local13 - local7])).aClass1_Sub1_Sub2_Sub2_1;
				local17 = ((Class1_Sub1_Sub2_Sub2) local37).aClass12_1;
				if (local17.anIntArray21 != null) {
					local17 = local17.method455(Static84.aClass302_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local37 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local11[local13]];
			}
			if (local37.anInt5088 >= 0 && (Static313.anInt6819 == local37.anInt5065 || Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90 == local37.aByte90)) {
				Static542.method7779(local37, arg1 >> 1, arg2 >> 1, local37.method4379());
				if (Static429.anIntArray610[0] >= 0) {
					if (local37.aString108 != null && (local7 <= local13 || Static357.anInt6794 == 0 || Static357.anInt6794 == 3 || Static357.anInt6794 == 1 && Static278.method4402(((Class1_Sub1_Sub2_Sub1) local37).aString83)) && Static83.anInt1716 < Static364.anInt6865) {
						Static364.anIntArray530[Static83.anInt1716] = Static188.aClass52_2.method1582(local37.aString108) / 2;
						Static364.anIntArray526[Static83.anInt1716] = Static429.anIntArray610[0];
						Static364.anIntArray528[Static83.anInt1716] = Static429.anIntArray610[1];
						Static364.anIntArray529[Static83.anInt1716] = local37.anInt5085;
						Static364.anIntArray531[Static83.anInt1716] = local37.anInt5078;
						Static364.anIntArray527[Static83.anInt1716] = local37.anInt5054;
						Static364.aStringArray33[Static83.anInt1716] = local37.aString108;
						Static83.anInt1716++;
					}
					local184 = Static429.anIntArray610[1] + arg0;
					@Pc(258) Class35[] local258;
					@Pc(265) Class241[] local265;
					@Pc(323) Class35 local323;
					if (local37.aBoolean384 || Static115.anInt2326 >= local37.anInt5058) {
						local184 -= Math.max(Static188.aClass52_2.anInt1675, Static514.aClass35Array41[0].la());
					} else {
						@Pc(211) byte local211 = 1;
						if (local13 < local7) {
							@Pc(220) Class1_Sub1_Sub2_Sub1 local220 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local11[local13]];
							local225 = local37.method4393().anInt681;
							if (local220.aBoolean259) {
								local211 = 2;
							}
						} else {
							local225 = local17.anInt322;
							if (local225 == -1) {
								local225 = local37.method4393().anInt681;
							}
						}
						@Pc(247) Class35[] local247 = Static514.aClass35Array41;
						if (local225 != -1) {
							local258 = (Class35[]) Static30.aClass231_8.method6228((long) local225);
							if (local258 == null) {
								local265 = Static558.method6365(Static460.aClass53_147, local225);
								if (local265 != null) {
									local258 = new Class35[local265.length];
									for (local273 = 0; local273 < local265.length; local273++) {
										local258[local273] = Static103.aClass39_3.method6018(local265[local273]);
									}
									Static30.aClass231_8.method6232(local258, (long) local225);
								}
							}
							if (local258 != null && local258.length >= 2) {
								local247 = local258;
							}
						}
						if (local211 >= local247.length) {
							local211 = 1;
						}
						@Pc(319) Class35 local319 = local247[0];
						local323 = local247[local211];
						local184 -= Math.max(Static188.aClass52_2.anInt1675, local319.la());
						local273 = arg3 + Static429.anIntArray610[0] - (local319.c() >> 1);
						local351 = local319.c() * local37.anInt5042 / 255;
						if (local37.anInt5042 > 0 && local351 < 2) {
							local351 = 2;
						}
						local319.method7351(local273, local184);
						Static103.aClass39_3.F(local273, local184, local273 + local351, local184 + local319.la());
						local323.method7351(local273, local184);
						Static103.aClass39_3.N(arg3, arg0, arg2 + arg3, arg1 + arg0);
					}
					local184 -= 2;
					if (!local37.aBoolean384) {
						@Pc(409) Class35 local409;
						if (local37.anInt5100 > Static115.anInt2326) {
							local409 = Static15.aClass35Array1[local37.aBoolean386 ? 2 : 0];
							@Pc(418) Class35 local418 = Static15.aClass35Array1[local37.aBoolean386 ? 3 : 1];
							if (local37 instanceof Class1_Sub1_Sub2_Sub2) {
								local428 = local17.anInt318;
								if (local428 == -1) {
									local428 = local37.method4393().anInt658;
								}
							} else {
								local428 = local37.method4393().anInt658;
							}
							if (local428 != -1) {
								local258 = (Class35[]) Static202.aClass231_37.method6228((long) local428);
								if (local258 == null) {
									local265 = Static558.method6365(Static460.aClass53_147, local428);
									if (local265 != null) {
										local258 = new Class35[local265.length];
										for (local273 = 0; local273 < local265.length; local273++) {
											local258[local273] = Static103.aClass39_3.method6018(local265[local273]);
										}
										Static202.aClass231_37.method6232(local258, (long) local428);
									}
								}
								if (local258 != null && local258.length == 4) {
									local409 = local258[local37.aBoolean386 ? 2 : 0];
									local418 = local258[local37.aBoolean386 ? 3 : 1];
								}
							}
							@Pc(523) int local523 = local37.anInt5100 - Static115.anInt2326;
							if (local37.anInt5025 < local523) {
								local523 -= local37.anInt5025;
								local273 = local37.anInt5035 == 0 ? 0 : local37.anInt5035 * ((local37.anInt5047 - local523) / local37.anInt5035);
								local561 = local409.c() * local273 / local37.anInt5047;
							} else {
								local561 = local409.c();
							}
							local273 = local409.la();
							local184 -= local273;
							local351 = arg3 + Static429.anIntArray610[0] - (local409.c() >> 1);
							local409.method7351(local351, local184);
							Static103.aClass39_3.F(local351, local184, local351 + local561, local184 + local273);
							local418.method7351(local351, local184);
							local184 -= 2;
							Static103.aClass39_3.N(arg3, arg0, arg3 + arg2, arg1 + arg0);
						}
						if (local13 < local7) {
							@Pc(656) Class1_Sub1_Sub2_Sub1 local656 = (Class1_Sub1_Sub2_Sub1) local37;
							if (local656.anInt3265 != -1) {
								local184 -= 25;
								Static198.aClass35Array20[local656.anInt3265].method7351(Static429.anIntArray610[0] + arg3 - 12, local184);
								local184 -= 2;
							}
							if (local656.anInt3277 != -1) {
								local184 -= 25;
								Static129.aClass35Array14[local656.anInt3277].method7351(arg3 + Static429.anIntArray610[0] - 12, local184);
								local184 -= 2;
							}
						} else if (local17.anInt335 >= 0 && Static129.aClass35Array14.length > local17.anInt335) {
							local184 -= 25;
							local409 = Static129.aClass35Array14[local17.anInt335];
							local409.method7351(Static429.anIntArray610[0] + arg3 - (local409.c() >> 1), local184);
							local184 -= 2;
						}
					}
					@Pc(708) Class132[] local708;
					@Pc(716) Class132 local716;
					if (!(local37 instanceof Class1_Sub1_Sub2_Sub1)) {
						local225 = 0;
						local708 = Static286.aClass132Array1;
						for (local428 = 0; local428 < local708.length; local428++) {
							local716 = local708[local428];
							if (local716 != null && local716.anInt3729 == 1 && Static24.anIntArray39[local13 - local7] == local716.anInt3734) {
								local323 = Static282.aClass35Array27[local716.anInt3727];
								if (local225 < local323.la()) {
									local225 = local323.la();
								}
								if (Static115.anInt2326 % 20 < 10) {
									local323.method7351(arg3 + Static429.anIntArray610[0] - 12, -local323.la() + local184);
								}
							}
						}
						if (local225 > 0) {
						}
					} else if (local13 >= 0) {
						local225 = 0;
						local708 = Static286.aClass132Array1;
						for (local428 = 0; local428 < local708.length; local428++) {
							local716 = local708[local428];
							if (local716 != null && local716.anInt3729 == 10 && local716.anInt3734 == local11[local13]) {
								local323 = Static282.aClass35Array27[local716.anInt3727];
								if (local323.la() > local225) {
									local225 = local323.la();
								}
								local323.method7351(arg3 + Static429.anIntArray610[0] - 12, local184 + -local323.la());
							}
						}
						if (local225 > 0) {
						}
					}
					for (local225 = 0; local225 < 4; local225++) {
						if (Static115.anInt2326 < local37.anIntArray447[local225]) {
							local872 = local37.method4379() / 2;
							Static542.method7779(local37, arg1 >> 1, arg2 >> 1, local872);
							if (Static429.anIntArray610[0] > -1) {
								local428 = Static182.aClass35Array18[local37.anIntArray446[local225]].c();
								if (local225 == 1) {
									Static429.anIntArray610[1] -= 20;
								}
								if (local225 == 2) {
									Static429.anIntArray610[0] -= local428 - 9;
									Static429.anIntArray610[1] -= 10;
								}
								if (local225 == 3) {
									Static429.anIntArray610[0] += local428 - 9;
									Static429.anIntArray610[1] -= 10;
								}
								Static182.aClass35Array18[local37.anIntArray446[local225]].method7351(arg3 + Static429.anIntArray610[0] - (local428 >> 1), arg0 + -12 + Static429.anIntArray610[1]);
								Static301.aClass47_3.method7598(-1, arg3 + Static429.anIntArray610[0] - 1, Integer.toString(local37.anIntArray448[local225]), 0, arg0 + Static429.anIntArray610[1] + 3);
							}
						}
					}
				}
			}
		}
		@Pc(1026) int local1026;
		for (@Pc(1020) int local1020 = 0; local1020 < Static105.anInt2009; local1020++) {
			local1026 = Static41.anIntArray60[local1020];
			@Pc(1041) Class1_Sub1_Sub2 local1041;
			if (local1026 >= 2048) {
				local1041 = ((Class2_Sub11) Static71.aClass127_13.method3205((long) (local1026 - 2048))).aClass1_Sub1_Sub2_Sub2_1;
			} else {
				local1041 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local1026];
			}
			local225 = Static447.anIntArray623[local1020];
			@Pc(1058) Class1_Sub1_Sub2 local1058;
			if (local225 < 2048) {
				local1058 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local225];
			} else {
				local1058 = ((Class2_Sub11) Static71.aClass127_13.method3205((long) (local225 - 2048))).aClass1_Sub1_Sub2_Sub2_1;
			}
			Static53.method972(arg2, arg3, local1058, --local1041.anInt5059, arg1, local1041, arg0);
		}
		local1026 = Static188.aClass52_2.anInt1675 + Static188.aClass52_2.anInt1673 + 2;
		for (local184 = 0; local184 < Static83.anInt1716; local184++) {
			local225 = Static364.anIntArray526[local184];
			local872 = Static364.anIntArray528[local184];
			local428 = Static364.anIntArray530[local184];
			@Pc(1125) boolean local1125 = true;
			while (local1125) {
				local1125 = false;
				for (local561 = 0; local561 < local184; local561++) {
					if (local872 + 2 > Static364.anIntArray528[local561] - local1026 && local872 - local1026 < Static364.anIntArray528[local561] - -2 && local225 - local428 < Static364.anIntArray526[local561] - -Static364.anIntArray530[local561] && Static364.anIntArray526[local561] - Static364.anIntArray530[local561] < local428 + local225 && local872 > Static364.anIntArray528[local561] - local1026) {
						local1125 = true;
						local872 = Static364.anIntArray528[local561] - local1026;
					}
				}
			}
			Static364.anIntArray528[local184] = local872;
			@Pc(1216) String local1216 = Static364.aStringArray33[local184];
			if (Static418.anInt7795 == 0) {
				local273 = 16776960;
				if (Static364.anIntArray529[local184] < 6) {
					local273 = Static499.anIntArray670[Static364.anIntArray529[local184]];
				}
				if (Static364.anIntArray529[local184] == 6) {
					local273 = Static313.anInt6819 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static364.anIntArray529[local184] == 7) {
					local273 = Static313.anInt6819 % 20 >= 10 ? 65535 : 255;
				}
				if (Static364.anIntArray529[local184] == 8) {
					local273 = Static313.anInt6819 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static364.anIntArray529[local184] == 9) {
					local351 = 150 - Static364.anIntArray527[local184];
					if (local351 < 50) {
						local273 = local351 * 1280 + 16711680;
					} else if (local351 < 100) {
						local273 = 16776960 - (local351 - 50) * 327680;
					} else if (local351 < 150) {
						local273 = (local351 - 100) * 5 + 65280;
					}
				}
				if (Static364.anIntArray529[local184] == 10) {
					local351 = 150 - Static364.anIntArray527[local184];
					if (local351 < 50) {
						local273 = local351 * 5 + 16711680;
					} else if (local351 < 100) {
						local273 = 16711935 + 16384000 - local351 * 327680;
					} else if (local351 < 150) {
						local273 = (local351 - 100) * 327680 + 255 + 500 - local351 * 5;
					}
				}
				if (Static364.anIntArray529[local184] == 11) {
					local351 = 150 - Static364.anIntArray527[local184];
					if (local351 < 50) {
						local273 = 16777215 - local351 * 327685;
					} else if (local351 < 100) {
						local273 = (local351 - 50) * 327685 + 65280;
					} else if (local351 < 150) {
						local273 = 16777215 - (local351 - 100) * 327680;
					}
				}
				local351 = local273 | 0xFF000000;
				if (Static364.anIntArray531[local184] == 0) {
					Static175.aClass47_1.method7598(local351, arg3 + local225, local1216, -16777216, local872 + arg0);
				}
				if (Static364.anIntArray531[local184] == 1) {
					Static175.aClass47_1.method7601(local351, local225 + arg3, Static313.anInt6819, arg0 + local872, local1216);
				}
				if (Static364.anIntArray531[local184] == 2) {
					Static175.aClass47_1.method7604(local1216, local351, local225 + arg3, local872 + arg0, Static313.anInt6819);
				}
				if (Static364.anIntArray531[local184] == 3) {
					Static175.aClass47_1.method7609(local872 + arg0, local1216, arg3 + local225, local351, 150 - Static364.anIntArray527[local184], Static313.anInt6819);
				}
				@Pc(1548) int local1548;
				if (Static364.anIntArray531[local184] == 4) {
					local1548 = (150 - Static364.anIntArray527[local184]) * (Static188.aClass52_2.method1582(local1216) + 100) / 150;
					Static103.aClass39_3.F(local225 + arg3 - 50, arg0, local225 + arg3 + 50, arg0 - -arg1);
					Static175.aClass47_1.method7617(local351, -16777216, local1216, arg3 + local225 + 50 - local1548, local872 + arg0);
					Static103.aClass39_3.N(arg3, arg0, arg3 + arg2, arg0 - -arg1);
				}
				if (Static364.anIntArray531[local184] == 5) {
					local1548 = 150 - Static364.anIntArray527[local184];
					@Pc(1611) int local1611 = 0;
					if (local1548 < 25) {
						local1611 = local1548 - 25;
					} else if (local1548 > 125) {
						local1611 = local1548 - 125;
					}
					@Pc(1638) int local1638 = Static188.aClass52_2.anInt1675 + Static188.aClass52_2.anInt1673;
					Static103.aClass39_3.F(arg3, arg0 + local872 - local1638 - 1, arg2 + arg3, local872 + arg0 + 5);
					Static175.aClass47_1.method7598(local351, arg3 + local225, local1216, -16777216, arg0 + local872 + local1611);
					Static103.aClass39_3.N(arg3, arg0, arg3 + arg2, arg0 - -arg1);
				}
			} else {
				Static175.aClass47_1.method7598(-256, local225 + arg3, local1216, -16777216, local872 + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILclient!wca;)V")
	public static void method2867(@OriginalArg(1) Class310 arg0) {
		if (arg0.anInt9234 != Static370.anInt6930) {
			return;
		}
		if (Static266.aClass1_Sub1_Sub2_Sub1_1.aString83 == null) {
			arg0.anInt9218 = 0;
			arg0.anInt9200 = 0;
			return;
		}
		arg0.anInt9154 = 150;
		arg0.anInt9183 = (int) (Math.sin((double) Static115.anInt2326 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt9158 = 5;
		arg0.anInt9218 = Static174.anInt3154;
		arg0.anInt9200 = Static177.method2963(Static266.aClass1_Sub1_Sub2_Sub1_1.aString83);
		arg0.anInt9162 = 0;
		arg0.anInt9203 = Static266.aClass1_Sub1_Sub2_Sub1_1.anInt5063;
		arg0.anInt9146 = Static266.aClass1_Sub1_Sub2_Sub1_1.anInt5071;
		arg0.anInt9196 = Static266.aClass1_Sub1_Sub2_Sub1_1.anInt5032;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!dda;I)I")
	public static int method2868(@OriginalArg(0) Class53 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1621(Static75.anInt1565)) {
			local5++;
		}
		if (arg0.method1621(Static423.anInt7843)) {
			local5++;
		}
		if (arg0.method1621(Static464.anInt8379)) {
			local5++;
		}
		if (arg0.method1621(Static374.anInt6956)) {
			local5++;
		}
		if (arg0.method1621(Static60.anInt1159)) {
			local5++;
		}
		if (arg0.method1621(Static401.anInt7594)) {
			local5++;
		}
		if (arg0.method1621(Static288.anInt7075)) {
			local5++;
		}
		if (arg0.method1621(Static117.anInt2345)) {
			local5++;
		}
		if (arg0.method1621(Static392.anInt7450)) {
			local5++;
		}
		if (arg0.method1621(Static521.anInt9024)) {
			local5++;
		}
		if (arg0.method1621(Static152.anInt8130)) {
			local5++;
		}
		if (arg0.method1621(Static421.anInt7834)) {
			local5++;
		}
		if (arg0.method1621(Static16.anInt364)) {
			local5++;
		}
		if (arg0.method1621(Static62.anInt1199)) {
			local5++;
		}
		if (arg0.method1621(Static481.anInt8571)) {
			local5++;
		}
		if (arg0.method1621(Static492.anInt8659)) {
			local5++;
		}
		return local5;
	}
}
