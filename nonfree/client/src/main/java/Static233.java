import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "Lclient!es;")
	public static final Class73 aClass73_4 = new Class73("WTRC", 1);

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
	public static int anInt3887 = -1;

	@OriginalMember(owner = "client!nb", name = "T", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_103 = new Class211(37, 8);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZI)I")
	public static int method3202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return local16 + ((arg1 >>> 31) + arg1) % arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBIIIII)V")
	public static void method3203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg6) {
			Static252.method3887(arg0, arg2, arg1, arg3, arg4, arg5);
		} else if (arg4 - arg5 >= Static372.anInt1561 && arg4 + arg5 <= Static98.anInt1774 && Static194.anInt3448 <= arg2 - arg6 && arg6 + arg2 <= Static264.anInt4589) {
			Static368.method5119(arg5, arg6, arg4, arg1, arg2, arg0, arg3);
		} else {
			Static230.method5264(arg5, arg4, arg3, arg1, arg2, arg0, arg6);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Lclient!go;")
	public static Class25_Sub3 method3205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub3_1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBIIII)V")
	public static void method3207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static331.anInt5548;
		Static47.anInt922 = 0;
		@Pc(11) int[] local11 = Static345.anIntArray681;
		@Pc(190) int local190;
		@Pc(209) int local209;
		@Pc(251) int local251;
		@Pc(430) int local430;
		@Pc(547) int local547;
		@Pc(661) int local661;
		@Pc(313) int local313;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static309.anInt5243; local13++) {
			@Pc(17) Class59 local17 = null;
			@Pc(30) Class25_Sub1_Sub1 local30;
			if (local7 > local13) {
				local30 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local11[local13]];
			} else {
				local30 = Static171.aClass25_Sub1_Sub1_Sub2Array1[Static131.anIntArray302[local13 - local7]];
				local17 = ((Class25_Sub1_Sub1_Sub2) local30).aClass59_1;
				if (local17.anIntArray186 != null) {
					local17 = local17.method1150(Static230.aClass72_3);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt2316 >= 0 && (Static32.anInt649 == local30.anInt2367 || Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70 == local30.aByte70)) {
				Static133.method1958(arg2 >> 1, local30.method1879(), arg1 >> 1, local30);
				if (Static202.anIntArray421[0] >= 0) {
					if (local30.aString23 != null && (local7 <= local13 || Static6.anInt91 == 0 || Static6.anInt91 == 3 || Static6.anInt91 == 1 && Static294.method4444(((Class25_Sub1_Sub1_Sub1) local30).aString6)) && Static47.anInt922 < Static32.anInt651) {
						Static32.anIntArray101[Static47.anInt922] = Static102.aClass110_3.method2413(local30.aString23) / 2;
						Static32.anIntArray99[Static47.anInt922] = Static202.anIntArray421[0];
						Static32.anIntArray98[Static47.anInt922] = Static202.anIntArray421[1];
						Static32.anIntArray100[Static47.anInt922] = local30.anInt2369;
						Static32.anIntArray96[Static47.anInt922] = local30.anInt2318;
						Static32.anIntArray97[Static47.anInt922] = local30.anInt2327;
						Static32.aStringArray9[Static47.anInt922] = local30.aString23;
						Static47.anInt922++;
					}
					@Pc(177) Class51 local177 = Static11.aClass51Array13[0];
					local190 = arg0 + Static202.anIntArray421[1] - Math.max(Static102.aClass110_3.anInt2963, local177.method4681());
					@Pc(201) Class51 local201;
					@Pc(301) int local301;
					if (!local30.aBoolean190 && local30.anInt2348 > Static366.anInt5883) {
						local201 = Static11.aClass51Array13[1];
						if (local30 instanceof Class25_Sub1_Sub1_Sub2) {
							local209 = local17.anInt1407;
							if (local209 == -1) {
								local209 = local30.method1880().anInt130;
							}
						} else {
							local209 = local30.method1880().anInt130;
						}
						if (local209 != -1) {
							@Pc(236) Class51[] local236 = (Class51[]) Static17.aClass227_2.method4863((long) local209);
							if (local236 == null) {
								@Pc(243) Class80[] local243 = Static397.method1432(Static145.aClass230_41, local209);
								if (local243 != null) {
									local236 = new Class51[local243.length];
									for (local251 = 0; local251 < local243.length; local251++) {
										local236[local251] = Static66.aClass164_2.method5360(local243[local251]);
									}
									Static17.aClass227_2.method4865(local236, (long) local209);
								}
							}
							if (local236 != null && local236.length == 2) {
								local177 = local236[0];
								local201 = local236[1];
							}
						}
						local301 = arg3 + Static202.anIntArray421[0] - (local177.method4685() >> 1);
						local177.method4669(local301, local190);
						local313 = local177.method4685() * local30.anInt2360 / 255;
						if (local30.anInt2360 > 0 && local313 < 2) {
							local313 = 2;
						}
						Static66.aClass164_2.method5385(local301, local190, local301 + local313, local190 + local177.method4681());
						local201.method4669(local301, local190);
						Static66.aClass164_2.method5313(arg3, arg0, arg1 + arg3, arg2 + arg0);
					}
					local190 -= 2;
					if (!local30.aBoolean190) {
						if (Static366.anInt5883 < local30.anInt2343) {
							local201 = Static250.aClass51Array16[local30.aBoolean188 ? 2 : 0];
							@Pc(378) Class51 local378 = Static250.aClass51Array16[local30.aBoolean188 ? 3 : 1];
							if (local30 instanceof Class25_Sub1_Sub1_Sub2) {
								local301 = local17.anInt1419;
								if (local301 == -1) {
									local301 = local30.method1880().anInt140;
								}
							} else {
								local301 = local30.method1880().anInt140;
							}
							if (local301 != -1) {
								@Pc(415) Class51[] local415 = (Class51[]) Static309.aClass227_42.method4863((long) local301);
								if (local415 == null) {
									@Pc(422) Class80[] local422 = Static397.method1432(Static145.aClass230_41, local301);
									if (local422 != null) {
										local415 = new Class51[local422.length];
										for (local430 = 0; local430 < local422.length; local430++) {
											local415[local430] = Static66.aClass164_2.method5360(local422[local430]);
										}
										Static309.aClass227_42.method4865(local415, (long) local301);
									}
								}
								if (local415 != null && local415.length == 4) {
									local201 = local415[local30.aBoolean188 ? 2 : 0];
									local378 = local415[local30.aBoolean188 ? 3 : 1];
								}
							}
							local313 = local30.anInt2343 - Static366.anInt5883;
							if (local30.anInt2377 < local313) {
								local313 -= local30.anInt2377;
								local430 = local30.anInt2357 == 0 ? 0 : local30.anInt2357 * ((local30.anInt2376 - local313) / local30.anInt2357);
								local251 = local201.method4685() * local430 / local30.anInt2376;
							} else {
								local251 = local201.method4685();
							}
							local430 = local201.method4681();
							local190 -= local430;
							local547 = arg3 + Static202.anIntArray421[0] - (local201.method4685() >> 1);
							local201.method4669(local547, local190);
							Static66.aClass164_2.method5385(local547, local190, local547 + local251, local430 + local190);
							local378.method4669(local547, local190);
							Static66.aClass164_2.method5313(arg3, arg0, arg1 + arg3, arg0 + arg2);
							local190 -= 2;
						}
						if (local7 > local13) {
							@Pc(616) Class25_Sub1_Sub1_Sub1 local616 = (Class25_Sub1_Sub1_Sub1) local30;
							if (local616.anInt600 != -1) {
								local190 -= 25;
								Static114.aClass51Array9[local616.anInt600].method4669(Static202.anIntArray421[0] + arg3 - 12, local190);
								local190 -= 2;
							}
							if (local616.anInt582 != -1) {
								local190 -= 25;
								Static317.aClass51Array18[local616.anInt582].method4669(arg3 + Static202.anIntArray421[0] - 12, local190);
								local190 -= 2;
							}
						} else if (local17.anInt1432 >= 0 && Static317.aClass51Array18.length > local17.anInt1432) {
							local201 = Static317.aClass51Array18[local17.anInt1432];
							local190 -= 25;
							local201.method4669(Static202.anIntArray421[0] + arg3 - (local201.method4685() >> 1), local190);
							local190 -= 2;
						}
					}
					@Pc(663) Class11[] local663;
					@Pc(671) Class11 local671;
					@Pc(697) Class51 local697;
					if (!(local30 instanceof Class25_Sub1_Sub1_Sub1)) {
						local661 = 0;
						local663 = Static274.aClass11Array1;
						for (local301 = 0; local301 < local663.length; local301++) {
							local671 = local663[local301];
							if (local671 != null && local671.anInt167 == 1 && local671.anInt172 == Static131.anIntArray302[local13 - local7]) {
								local697 = Static372.aClass51Array7[local671.anInt173];
								if (local661 < local697.method4681()) {
									local661 = local697.method4681();
								}
								if (Static366.anInt5883 % 20 < 10) {
									local697.method4669(arg3 + Static202.anIntArray421[0] - 12, -local697.method4681() + local190);
								}
							}
						}
						if (local661 > 0) {
						}
					} else if (local13 >= 0) {
						local661 = 0;
						local663 = Static274.aClass11Array1;
						for (local301 = 0; local301 < local663.length; local301++) {
							local671 = local663[local301];
							if (local671 != null && local671.anInt167 == 10 && local671.anInt172 == local11[local13]) {
								local697 = Static372.aClass51Array7[local671.anInt173];
								if (local661 < local697.method4681()) {
									local661 = local697.method4681();
								}
								local697.method4669(arg3 + Static202.anIntArray421[0] - 12, -local697.method4681() + local190);
							}
						}
						if (local661 > 0) {
						}
					}
					for (local661 = 0; local661 < 4; local661++) {
						if (Static366.anInt5883 < local30.anIntArray292[local661]) {
							local209 = local30.method1879() / 2;
							Static133.method1958(arg2 >> 1, local209, arg1 >> 1, local30);
							if (Static202.anIntArray421[0] > -1) {
								if (local661 == 1) {
									Static202.anIntArray421[1] -= 20;
								}
								if (local661 == 2) {
									Static202.anIntArray421[0] -= 15;
									Static202.anIntArray421[1] -= 10;
								}
								if (local661 == 3) {
									Static202.anIntArray421[0] += 15;
									Static202.anIntArray421[1] -= 10;
								}
								Static294.aClass51Array17[local30.anIntArray293[local661]].method4669(arg3 + Static202.anIntArray421[0] - 12, arg0 + Static202.anIntArray421[1] - 12);
								Static227.aClass137_6.method5098(0, -1, Static202.anIntArray421[0] + arg3 - 1, Integer.toString(local30.anIntArray294[local661]), arg0 + Static202.anIntArray421[1] + 3);
							}
						}
					}
				}
			}
		}
		@Pc(980) int local980;
		for (@Pc(974) int local974 = 0; local974 < Static22.anInt3895; local974++) {
			local980 = Static67.anIntArray181[local974];
			@Pc(989) Class25_Sub1_Sub1 local989;
			if (local980 >= 2048) {
				local989 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local980 - 2048];
			} else {
				local989 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local980];
			}
			local190 = Static54.anIntArray144[local974];
			@Pc(1008) Class25_Sub1_Sub1 local1008;
			if (local190 >= 2048) {
				local1008 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local190 - 2048];
			} else {
				local1008 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local190];
			}
			Static251.method3882(local989, --local989.anInt2320, arg3, arg2, local1008, arg1, arg0);
		}
		local980 = Static102.aClass110_3.anInt2963 + Static102.aClass110_3.anInt2957 + 2;
		for (@Pc(1050) int local1050 = 0; local1050 < Static47.anInt922; local1050++) {
			local190 = Static32.anIntArray99[local1050];
			local661 = Static32.anIntArray98[local1050];
			local209 = Static32.anIntArray101[local1050];
			@Pc(1066) boolean local1066 = true;
			while (local1066) {
				local1066 = false;
				for (local313 = 0; local313 < local1050; local313++) {
					if (local661 + 2 > Static32.anIntArray98[local313] - local980 && Static32.anIntArray98[local313] + 2 > local661 - local980 && Static32.anIntArray99[local313] + Static32.anIntArray101[local313] > local190 + -local209 && local190 + local209 > -Static32.anIntArray101[local313] + Static32.anIntArray99[local313] && local661 > Static32.anIntArray98[local313] - local980) {
						local1066 = true;
						local661 = Static32.anIntArray98[local313] - local980;
					}
				}
			}
			Static32.anIntArray98[local1050] = local661;
			@Pc(1160) String local1160 = Static32.aStringArray9[local1050];
			if (Static229.anInt3858 == 0) {
				local251 = 16776960;
				if (Static32.anIntArray100[local1050] < 6) {
					local251 = Static57.anIntArray699[Static32.anIntArray100[local1050]];
				}
				if (Static32.anIntArray100[local1050] == 6) {
					local251 = Static32.anInt649 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static32.anIntArray100[local1050] == 7) {
					local251 = Static32.anInt649 % 20 < 10 ? 255 : 65535;
				}
				if (Static32.anIntArray100[local1050] == 8) {
					local251 = Static32.anInt649 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static32.anIntArray100[local1050] == 9) {
					local430 = 150 - Static32.anIntArray97[local1050];
					if (local430 < 50) {
						local251 = local430 * 1280 + 16711680;
					} else if (local430 < 100) {
						local251 = 16384000 + 16776960 - local430 * 327680;
					} else if (local430 < 150) {
						local251 = local430 * 5 + 65280 - 500;
					}
				}
				if (Static32.anIntArray100[local1050] == 10) {
					local430 = 150 - Static32.anIntArray97[local1050];
					if (local430 < 50) {
						local251 = local430 * 5 + 16711680;
					} else if (local430 < 100) {
						local251 = 16711935 - (local430 - 50) * 327680;
					} else if (local430 < 150) {
						local251 = (local430 - 100) * 327680 + 255 - (local430 - 100) * 5;
					}
				}
				if (Static32.anIntArray100[local1050] == 11) {
					local430 = 150 - Static32.anIntArray97[local1050];
					if (local430 < 50) {
						local251 = 16777215 - local430 * 327685;
					} else if (local430 < 100) {
						local251 = local430 * 327685 + 65280 - 16384250;
					} else if (local430 < 150) {
						local251 = 16777215 - (local430 - 100) * 327680;
					}
				}
				local430 = local251 | 0xFF000000;
				if (Static32.anIntArray96[local1050] == 0) {
					Static101.aClass137_2.method5098(-16777216, local430, arg3 + local190, local1160, arg0 + local661);
				}
				if (Static32.anIntArray96[local1050] == 1) {
					Static101.aClass137_2.method5092(local1160, local430, Static32.anInt649, local190 + arg3, arg0 - -local661);
				}
				if (Static32.anIntArray96[local1050] == 2) {
					Static101.aClass137_2.method5102(local430, local1160, local661 + arg0, Static32.anInt649, local190 + arg3);
				}
				if (Static32.anIntArray96[local1050] == 3) {
					Static101.aClass137_2.method5104(local1160, 150 - Static32.anIntArray97[local1050], arg0 - -local661, local430, Static32.anInt649, local190 + arg3);
				}
				if (Static32.anIntArray96[local1050] == 4) {
					local547 = (150 - Static32.anIntArray97[local1050]) * (Static102.aClass110_3.method2413(local1160) + 100) / 150;
					Static66.aClass164_2.method5385(local190 + arg3 - 50, arg0, local190 + arg3 + 50, arg0 - -arg2);
					Static101.aClass137_2.method5101(-16777216, local1160, local190 + arg3 + 50 - local547, local430, arg0 + local661);
					Static66.aClass164_2.method5313(arg3, arg0, arg1 + arg3, arg0 + arg2);
				}
				if (Static32.anIntArray96[local1050] == 5) {
					local547 = 150 - Static32.anIntArray97[local1050];
					@Pc(1576) int local1576 = 0;
					if (local547 < 25) {
						local1576 = local547 - 25;
					} else if (local547 > 125) {
						local1576 = local547 - 125;
					}
					@Pc(1599) int local1599 = Static102.aClass110_3.anInt2963 + Static102.aClass110_3.anInt2957;
					Static66.aClass164_2.method5385(arg3, arg0 + local661 - local1599 - 1, arg3 - -arg1, local661 + arg0 + 5);
					Static101.aClass137_2.method5098(-16777216, local430, local190 + arg3, local1160, local1576 + local661 + arg0);
					Static66.aClass164_2.method5313(arg3, arg0, arg1 + arg3, arg0 + arg2);
				}
			} else {
				Static101.aClass137_2.method5098(-16777216, -256, local190 + arg3, local1160, arg0 + local661);
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)Z")
	public static boolean method3208(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static66.aClass164_2.method5317();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static66.aClass164_2.method5305();
		} else if (!Static66.aClass164_2.method5405()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static188.aClass135_Sub1_1.aBoolean316 = arg0;
			Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
			return true;
		}
	}
}
