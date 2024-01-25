import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public static int anInt534;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_8 = new Class198(8);

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[J")
	public static final long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
	public static int anInt532 = 0;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public static int anInt533 = 0;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Ljava/lang/String;")
	public static final String aString10 = "white:";

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!fb;ILjava/lang/String;)I")
	public static int method405(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt4268;
		@Pc(10) byte[] local10 = Static168.method2720(arg1);
		arg0.method3656(local10.length);
		arg0.anInt4268 += Static323.aClass136_1.method3457(arg0.anInt4268, local10, local10.length, 0, arg0.aByteArray70);
		return arg0.anInt4268 - local6;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V")
	public static void method406(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static283.anInt4480 = 0;
		@Pc(174) int local174;
		@Pc(217) int local217;
		@Pc(388) int local388;
		@Pc(500) int local500;
		@Pc(271) int local271;
		@Pc(621) int local621;
		@Pc(440) int local440;
		for (@Pc(9) int local9 = -1; local9 < Static170.anInt6275 + Static42.anInt897; local9++) {
			@Pc(13) Class119 local13 = null;
			@Pc(27) Class5_Sub4_Sub4 local27;
			if (local9 < 0) {
				local27 = Static349.aClass5_Sub4_Sub4_Sub1_2;
			} else if (local9 >= Static170.anInt6275) {
				local27 = Static244.aClass5_Sub4_Sub4_Sub2Array1[Static130.anIntArray180[local9 - Static170.anInt6275]];
				local13 = ((Class5_Sub4_Sub4_Sub2) local27).aClass119_1;
				if (local13.anIntArray248 != null) {
					local13 = local13.method2882();
					if (local13 == null) {
						continue;
					}
				}
			} else {
				local27 = Static254.aClass5_Sub4_Sub4_Sub1Array1[Static235.anIntArray377[local9]];
			}
			if (local27.anInt4893 >= 0) {
				Static350.method5689(arg2 >> 1, local27, local27.method4209(), arg0 >> 1);
				if (Static187.anIntArray302[0] >= 0) {
					if (local27.aString180 != null && (local9 >= Static170.anInt6275 || Static344.anInt6696 == 0 || Static344.anInt6696 == 3 || Static344.anInt6696 == 1 && Static102.method1723(((Class5_Sub4_Sub4_Sub1) local27).aString126)) && Static283.anInt4480 < Static172.anInt3598) {
						Static172.anIntArray246[Static283.anInt4480] = Static191.aClass209_6.method5510(local27.aString180) / 2;
						Static172.anIntArray245[Static283.anInt4480] = Static187.anIntArray302[0];
						Static172.anIntArray242[Static283.anInt4480] = Static187.anIntArray302[1];
						Static172.anIntArray244[Static283.anInt4480] = local27.anInt4913;
						Static172.anIntArray241[Static283.anInt4480] = local27.anInt4939;
						Static172.anIntArray247[Static283.anInt4480] = local27.anInt4900;
						Static172.aStringArray22[Static283.anInt4480] = local27.aString180;
						Static283.anInt4480++;
					}
					@Pc(161) Class57 local161 = Static221.aClass57Array14[0];
					local174 = Static187.anIntArray302[1] + arg3 - Math.max(Static191.aClass209_6.anInt6517, local161.method5447());
					@Pc(185) Class57 local185;
					@Pc(283) int local283;
					if (!local27.aBoolean282 && Static51.anInt1101 < local27.anInt4938) {
						local185 = Static221.aClass57Array14[1];
						if (local27 instanceof Class5_Sub4_Sub4_Sub2) {
							@Pc(191) Class5_Sub4_Sub4_Sub2 local191 = (Class5_Sub4_Sub4_Sub2) local27;
							@Pc(200) Class57[] local200 = (Class57[]) Static258.aClass198_48.method5242((long) local191.aClass119_1.anInt3675);
							if (local200 == null) {
								@Pc(209) Class149[] local209 = Static366.method3882(Static317.aClass100_112, local191.aClass119_1.anInt3675);
								if (local209 != null) {
									local200 = new Class57[local209.length];
									for (local217 = 0; local217 < local209.length; local217++) {
										local200[local217] = Static212.aClass122_2.method4757(local209[local217]);
									}
									Static258.aClass198_48.method5231((long) local191.aClass119_1.anInt3675, local200);
								}
							}
							if (local200 != null && local200.length == 2) {
								local161 = local200[0];
								local185 = local200[1];
							}
						}
						local271 = arg1 + Static187.anIntArray302[0] - (local161.method5440() >> 1);
						local161.method5448(local271, local174);
						local283 = local161.method5440() * local27.anInt4945 / 255;
						Static212.aClass122_2.method4704(local271, local174, local283 + local271, local174 + local161.method5447());
						local185.method5448(local271, local174);
						Static212.aClass122_2.method4768(arg1, arg3, arg2 + arg1, arg3 - -arg0);
					}
					local174 -= 2;
					if (!local27.aBoolean282) {
						if (local27.anInt4940 > Static51.anInt1101) {
							local185 = Static147.aClass57Array9[local27.aBoolean283 ? 2 : 0];
							@Pc(339) Class57 local339 = Static147.aClass57Array9[local27.aBoolean283 ? 3 : 1];
							if (local27 instanceof Class5_Sub4_Sub4_Sub2) {
								local283 = local13.anInt3664;
								if (local283 == -1) {
									local283 = local27.method4201().anInt1481;
								}
							} else {
								local283 = local27.method4201().anInt1481;
							}
							if (local283 != -1) {
								@Pc(373) Class57[] local373 = (Class57[]) Static2.aClass198_1.method5242((long) local283);
								if (local373 == null) {
									@Pc(380) Class149[] local380 = Static366.method3882(Static317.aClass100_112, local283);
									if (local380 != null) {
										local373 = new Class57[local380.length];
										for (local388 = 0; local388 < local380.length; local388++) {
											local373[local388] = Static212.aClass122_2.method4757(local380[local388]);
										}
										Static2.aClass198_1.method5231((long) local283, local373);
									}
								}
								if (local373 != null && local373.length == 4) {
									local339 = local373[local27.aBoolean283 ? 3 : 1];
									local185 = local373[local27.aBoolean283 ? 2 : 0];
								}
							}
							local440 = local27.anInt4940 - Static51.anInt1101;
							if (local440 > local27.anInt4894) {
								local440 -= local27.anInt4894;
								local388 = local27.anInt4886 == 0 ? 0 : local27.anInt4886 * ((local27.anInt4909 - local440) / local27.anInt4886);
								local217 = local388 * local185.method5440() / local27.anInt4909;
							} else {
								local217 = local185.method5440();
							}
							local388 = local185.method5447();
							local174 -= local388;
							local500 = Static187.anIntArray302[0] + arg1 - (local185.method5440() >> 1);
							local185.method5448(local500, local174);
							Static212.aClass122_2.method4704(local500, local174, local500 + local217, local388 + local174);
							local339.method5448(local500, local174);
							local174 -= 2;
							Static212.aClass122_2.method4768(arg1, arg3, arg1 + arg2, arg3 - -arg0);
						}
						if (local9 < Static170.anInt6275) {
							@Pc(540) Class5_Sub4_Sub4_Sub1 local540 = (Class5_Sub4_Sub4_Sub1) local27;
							if (local540.anInt3413 != -1) {
								local174 -= 25;
								Static204.aClass57Array13[local540.anInt3413].method5448(Static187.anIntArray302[0] + arg1 - 12, local174);
								local174 -= 2;
							}
							if (local540.anInt3397 != -1) {
								local174 -= 25;
								Static287.aClass57Array21[local540.anInt3397].method5448(arg1 + Static187.anIntArray302[0] - 12, local174);
								local174 -= 2;
							}
						} else if (local13.anInt3670 >= 0 && local13.anInt3670 < Static287.aClass57Array21.length) {
							local185 = Static287.aClass57Array21[local13.anInt3670];
							local174 -= 25;
							local185.method5448(arg1 + Static187.anIntArray302[0] - (local185.method5440() >> 1), local174);
							local174 -= 2;
						}
					}
					@Pc(623) Class125[] local623;
					@Pc(631) Class125 local631;
					@Pc(652) Class57 local652;
					if (!(local27 instanceof Class5_Sub4_Sub4_Sub1)) {
						local621 = 0;
						local623 = Static108.aClass125Array11;
						for (local283 = 0; local283 < local623.length; local283++) {
							local631 = local623[local283];
							if (local631 != null && local631.anInt3931 == 1 && Static130.anIntArray180[local9 - Static170.anInt6275] == local631.anInt3922) {
								local652 = Static6.aClass57Array23[local631.anInt3924];
								if (local652.method5447() > local621) {
									local621 = local652.method5447();
								}
								if (Static51.anInt1101 % 20 < 10) {
									local652.method5448(Static187.anIntArray302[0] + arg1 - 12, local174 - local652.method5447());
								}
							}
						}
						if (local621 > 0) {
						}
					} else if (local9 >= 0) {
						local621 = 0;
						local623 = Static108.aClass125Array11;
						for (local283 = 0; local283 < local623.length; local283++) {
							local631 = local623[local283];
							if (local631 != null && local631.anInt3931 == 10 && Static235.anIntArray377[local9] == local631.anInt3922) {
								local652 = Static6.aClass57Array23[local631.anInt3924];
								if (local652.method5447() > local621) {
									local621 = local652.method5447();
								}
								local652.method5448(Static187.anIntArray302[0] + arg1 - 12, local174 + -local652.method5447());
							}
						}
						if (local621 > 0) {
						}
					}
					for (local621 = 0; local621 < 4; local621++) {
						if (local27.anIntArray403[local621] > Static51.anInt1101) {
							local271 = local27.method4209() / 2;
							Static350.method5689(arg2 >> 1, local27, local271, arg0 >> 1);
							if (Static187.anIntArray302[0] > -1) {
								if (local621 == 1) {
									Static187.anIntArray302[1] -= 20;
								}
								if (local621 == 2) {
									Static187.anIntArray302[0] -= 15;
									Static187.anIntArray302[1] -= 10;
								}
								if (local621 == 3) {
									Static187.anIntArray302[0] += 15;
									Static187.anIntArray302[1] -= 10;
								}
								Static271.aClass57Array18[local27.anIntArray400[local621]].method5448(arg1 + Static187.anIntArray302[0] - 12, arg3 + Static187.anIntArray302[1] + -12);
								Static232.aClass120_5.method5547(0, Integer.toString(local27.anIntArray401[local621]), arg1 + Static187.anIntArray302[0] - 1, -1, Static187.anIntArray302[1] + arg3 - -3);
							}
						}
					}
				}
			}
		}
		@Pc(924) int local924;
		for (@Pc(918) int local918 = 0; local918 < Static311.anInt6166; local918++) {
			local924 = Static321.anIntArray520[local918];
			@Pc(933) Class5_Sub4_Sub4 local933;
			if (local924 < 2048) {
				local933 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local924];
			} else {
				local933 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local924 - 2048];
			}
			local174 = Static84.anIntArray101[local918];
			@Pc(952) Class5_Sub4_Sub4 local952;
			if (local174 < 2048) {
				local952 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local174];
			} else {
				local952 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local174 - 2048];
			}
			Static336.method5502(arg0, local933, local952, arg1, --local933.anInt4881, arg2, arg3);
		}
		local924 = Static191.aClass209_6.anInt6521 + Static191.aClass209_6.anInt6517 + 2;
		for (@Pc(991) int local991 = 0; local991 < Static283.anInt4480; local991++) {
			local174 = Static172.anIntArray245[local991];
			local621 = Static172.anIntArray242[local991];
			local271 = Static172.anIntArray246[local991];
			@Pc(1007) boolean local1007 = true;
			while (local1007) {
				local1007 = false;
				for (local440 = 0; local440 < local991; local440++) {
					if (Static172.anIntArray242[local440] - local924 < local621 + 2 && Static172.anIntArray242[local440] + 2 > -local924 + local621 && Static172.anIntArray245[local440] + Static172.anIntArray246[local440] > -local271 + local174 && Static172.anIntArray245[local440] - Static172.anIntArray246[local440] < local271 + local174 && Static172.anIntArray242[local440] - local924 < local621) {
						local1007 = true;
						local621 = Static172.anIntArray242[local440] - local924;
					}
				}
			}
			Static172.anIntArray242[local991] = local621;
			@Pc(1106) String local1106 = Static172.aStringArray22[local991];
			if (Static260.anInt5192 == 0) {
				local217 = 16776960;
				if (Static172.anIntArray244[local991] < 6) {
					local217 = Static309.anIntArray510[Static172.anIntArray244[local991]];
				}
				if (Static172.anIntArray244[local991] == 6) {
					local217 = Static293.anInt6246 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static172.anIntArray244[local991] == 7) {
					local217 = Static293.anInt6246 % 20 < 10 ? 255 : 65535;
				}
				if (Static172.anIntArray244[local991] == 8) {
					local217 = Static293.anInt6246 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static172.anIntArray244[local991] == 9) {
					local388 = 150 - Static172.anIntArray247[local991];
					if (local388 < 50) {
						local217 = local388 * 1280 + 16711680;
					} else if (local388 < 100) {
						local217 = 33160960 - local388 * 327680;
					} else if (local388 < 150) {
						local217 = (local388 - 100) * 5 + 65280;
					}
				}
				if (Static172.anIntArray244[local991] == 10) {
					local388 = 150 - Static172.anIntArray247[local991];
					if (local388 < 50) {
						local217 = local388 * 5 + 16711680;
					} else if (local388 < 100) {
						local217 = 33095935 - local388 * 327680;
					} else if (local388 < 150) {
						local217 = (local388 - 100) * 327680 + 255 - (local388 - 100) * 5;
					}
				}
				if (Static172.anIntArray244[local991] == 11) {
					local388 = 150 - Static172.anIntArray247[local991];
					if (local388 < 50) {
						local217 = 16777215 - local388 * 327685;
					} else if (local388 < 100) {
						local217 = (local388 - 50) * 327685 + 65280;
					} else if (local388 < 150) {
						local217 = 16777215 - (local388 - 100) * 327680;
					}
				}
				local388 = local217 | 0xFF000000;
				if (Static172.anIntArray241[local991] == 0) {
					Static243.aClass120_6.method5547(-16777216, local1106, local174 + arg1, local388, arg3 + local621);
				}
				if (Static172.anIntArray241[local991] == 1) {
					Static243.aClass120_6.method5534(local388, Static293.anInt6246, local1106, arg1 + local174, arg3 + local621);
				}
				if (Static172.anIntArray241[local991] == 2) {
					Static243.aClass120_6.method5542(Static293.anInt6246, local1106, arg3 + local621, local174 + arg1, local388);
				}
				if (Static172.anIntArray241[local991] == 3) {
					Static243.aClass120_6.method5530(Static293.anInt6246, 150 - Static172.anIntArray247[local991], local174 + arg1, local388, local621 + arg3, local1106);
				}
				if (Static172.anIntArray241[local991] == 4) {
					local500 = (150 - Static172.anIntArray247[local991]) * (Static191.aClass209_6.method5510(local1106) - -100) / 150;
					Static212.aClass122_2.method4704(local174 + arg1 - 50, arg3, arg1 + local174 + 50, arg0 + arg3);
					Static243.aClass120_6.method5528(local1106, -16777216, arg3 + local621, local388, local174 + arg1 + 50 - local500);
					Static212.aClass122_2.method4768(arg1, arg3, arg1 + arg2, arg0 + arg3);
				}
				if (Static172.anIntArray241[local991] == 5) {
					local500 = 150 - Static172.anIntArray247[local991];
					@Pc(1494) int local1494 = 0;
					if (local500 < 25) {
						local1494 = local500 - 25;
					} else if (local500 > 125) {
						local1494 = local500 - 125;
					}
					@Pc(1516) int local1516 = Static191.aClass209_6.anInt6521 + Static191.aClass209_6.anInt6517;
					Static212.aClass122_2.method4704(arg1, arg3 + local621 - local1516 - 1, arg2 + arg1, arg3 + local621 + 5);
					Static243.aClass120_6.method5547(-16777216, local1106, arg1 + local174, local388, local1494 + arg3 + local621);
					Static212.aClass122_2.method4768(arg1, arg3, arg2 + arg1, arg0 + arg3);
				}
			} else {
				Static243.aClass120_6.method5547(-16777216, local1106, arg1 + local174, -256, arg3 + local621);
			}
		}
	}
}
