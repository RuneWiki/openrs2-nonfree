import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ju", name = "V", descriptor = "Lclient!dn;")
	public static Class56 aClass56_50;

	@OriginalMember(owner = "client!ju", name = "fb", descriptor = "Lclient!ia;")
	public static Class106 aClass106_2;

	@OriginalMember(owner = "client!ju", name = "ab", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIB)V")
	public static void method3335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static414.method5552(Static94.aClass92_68);
		Static302.aClass3_Sub2_Sub2_2.method6002(arg0);
		Static302.aClass3_Sub2_Sub2_2.method6008(arg1);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIIII)V")
	public static void method3336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = Static207.anInt4136;
		@Pc(9) int[] local9 = Static322.anIntArray436;
		Static216.anInt4254 = 0;
		@Pc(189) int local189;
		@Pc(210) int local210;
		@Pc(264) int local264;
		@Pc(338) int local338;
		@Pc(427) int local427;
		@Pc(879) int local879;
		@Pc(533) int local533;
		for (@Pc(21) int local21 = 0; local21 < local7 + Static453.anInt7682; local21++) {
			@Pc(25) Class47 local25 = null;
			@Pc(38) Class1_Sub3_Sub3 local38;
			if (local7 > local21) {
				local38 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local9[local21]];
			} else {
				local38 = Static451.aClass1_Sub3_Sub3_Sub2Array1[Static29.anIntArray56[local21 - local7]];
				local25 = ((Class1_Sub3_Sub3_Sub2) local38).aClass47_1;
				if (local25.anIntArray134 != null) {
					local25 = local25.method1296(Static369.aClass11_1);
					if (local25 == null) {
						continue;
					}
				}
			}
			if (local38.anInt6115 >= 0 && (Static164.anInt3507 == local38.anInt6090 || Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 == local38.aByte77)) {
				Static204.method731(local38.method4846(), arg2 >> 1, local38, arg3 >> 1);
				if (Static189.anIntArray294[0] >= 0) {
					if (local38.aString57 != null && (local21 >= local7 || Static282.anInt5193 == 0 || Static282.anInt5193 == 3 || Static282.anInt5193 == 1 && Static58.method1178(((Class1_Sub3_Sub3_Sub1) local38).aString47)) && Static253.anInt4748 > Static216.anInt4254) {
						Static253.anIntArray368[Static216.anInt4254] = Static222.aClass179_10.method4385(local38.aString57) / 2;
						Static253.anIntArray369[Static216.anInt4254] = Static189.anIntArray294[0];
						Static253.anIntArray371[Static216.anInt4254] = Static189.anIntArray294[1];
						Static253.anIntArray367[Static216.anInt4254] = local38.anInt6110;
						Static253.anIntArray372[Static216.anInt4254] = local38.anInt6125;
						Static253.anIntArray370[Static216.anInt4254] = local38.anInt6119;
						Static253.aStringArray110[Static216.anInt4254] = local38.aString57;
						Static216.anInt4254++;
					}
					local189 = Static189.anIntArray294[1] + arg1;
					@Pc(249) Class22[] local249;
					@Pc(256) Class166[] local256;
					@Pc(310) Class22 local310;
					if (local38.aBoolean427 || Static290.anInt5325 >= local38.anInt6059) {
						local189 -= Math.max(Static222.aClass179_10.anInt5455, Static169.aClass22Array12[0].qa());
					} else {
						@Pc(200) byte local200 = 1;
						if (local21 >= local7) {
							local210 = local25.anInt1603;
							if (local210 == -1) {
								local210 = local38.method4837().anInt4217;
							}
						} else {
							@Pc(227) Class1_Sub3_Sub3_Sub1 local227 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local9[local21]];
							local210 = local38.method4837().anInt4217;
							if (local227.aBoolean364) {
								local200 = 2;
							}
						}
						@Pc(239) Class22[] local239 = Static169.aClass22Array12;
						if (local210 != -1) {
							local249 = (Class22[]) Static133.aClass5_25.method104((long) local210);
							if (local249 == null) {
								local256 = Static460.method3984(Static20.aClass56_10, local210);
								if (local256 != null) {
									local249 = new Class22[local256.length];
									for (local264 = 0; local264 < local256.length; local264++) {
										local249[local264] = Static266.aClass75_7.method2590(local256[local264]);
									}
									Static133.aClass5_25.method114((long) local210, local249);
								}
							}
							if (local249 != null && local249.length >= 2) {
								local239 = local249;
							}
						}
						if (local239.length <= local200) {
							local200 = 1;
						}
						@Pc(306) Class22 local306 = local239[0];
						local310 = local239[local200];
						local189 -= Math.max(Static222.aClass179_10.anInt5455, local306.qa());
						local264 = Static189.anIntArray294[0] + arg0 - (local306.UA() >> 1);
						local338 = local306.UA() * local38.anInt6099 / 255;
						if (local38.anInt6099 > 0 && local338 < 2) {
							local338 = 2;
						}
						local306.method6074(local264, local189);
						Static266.aClass75_7.Z(local264, local189, local264 + local338, local306.qa() + local189);
						local310.method6074(local264, local189);
						Static266.aClass75_7.pa(arg0, arg1, arg0 + arg2, arg3 + arg1);
					}
					local189 -= 2;
					if (!local38.aBoolean427) {
						@Pc(410) Class22 local410;
						if (local38.anInt6112 > Static290.anInt5325) {
							local410 = Static8.aClass22Array3[local38.aBoolean428 ? 2 : 0];
							@Pc(419) Class22 local419 = Static8.aClass22Array3[local38.aBoolean428 ? 3 : 1];
							if (local38 instanceof Class1_Sub3_Sub3_Sub2) {
								local427 = local25.anInt1604;
								if (local427 == -1) {
									local427 = local38.method4837().anInt4223;
								}
							} else {
								local427 = local38.method4837().anInt4223;
							}
							if (local427 != -1) {
								local249 = (Class22[]) Static360.aClass5_51.method104((long) local427);
								if (local249 == null) {
									local256 = Static460.method3984(Static20.aClass56_10, local427);
									if (local256 != null) {
										local249 = new Class22[local256.length];
										for (local264 = 0; local264 < local256.length; local264++) {
											local249[local264] = Static266.aClass75_7.method2590(local256[local264]);
										}
										Static360.aClass5_51.method114((long) local427, local249);
									}
								}
								if (local249 != null && local249.length == 4) {
									local410 = local249[local38.aBoolean428 ? 2 : 0];
									local419 = local249[local38.aBoolean428 ? 3 : 1];
								}
							}
							@Pc(522) int local522 = local38.anInt6112 - Static290.anInt5325;
							if (local522 <= local38.anInt6097) {
								local533 = local410.UA();
							} else {
								local522 -= local38.anInt6097;
								local264 = local38.anInt6107 == 0 ? 0 : local38.anInt6107 * ((local38.anInt6109 - local522) / local38.anInt6107);
								local533 = local264 * local410.UA() / local38.anInt6109;
							}
							local264 = local410.qa();
							local189 -= local264;
							local338 = arg0 + Static189.anIntArray294[0] - (local410.UA() >> 1);
							local410.method6074(local338, local189);
							Static266.aClass75_7.Z(local338, local189, local533 + local338, local189 - -local264);
							local419.method6074(local338, local189);
							local189 -= 2;
							Static266.aClass75_7.pa(arg0, arg1, arg0 + arg2, arg1 + arg3);
						}
						if (local7 > local21) {
							@Pc(654) Class1_Sub3_Sub3_Sub1 local654 = (Class1_Sub3_Sub3_Sub1) local38;
							if (local654.anInt4887 != -1) {
								local189 -= 25;
								Static96.aClass22Array5[local654.anInt4887].method6074(arg0 + Static189.anIntArray294[0] - 12, local189);
								local189 -= 2;
							}
							if (local654.anInt4890 != -1) {
								local189 -= 25;
								Static352.aClass22Array20[local654.anInt4890].method6074(arg0 + Static189.anIntArray294[0] - 12, local189);
								local189 -= 2;
							}
						} else if (local25.anInt1599 >= 0 && local25.anInt1599 < Static352.aClass22Array20.length) {
							local410 = Static352.aClass22Array20[local25.anInt1599];
							local189 -= 25;
							local410.method6074(Static189.anIntArray294[0] + arg0 - (local410.UA() >> 1), local189);
							local189 -= 2;
						}
					}
					@Pc(703) Class125[] local703;
					@Pc(711) Class125 local711;
					if (!(local38 instanceof Class1_Sub3_Sub3_Sub1)) {
						local210 = 0;
						local703 = Static370.aClass125Array1;
						for (local427 = 0; local427 < local703.length; local427++) {
							local711 = local703[local427];
							if (local711 != null && local711.anInt3865 == 1 && local711.anInt3862 == Static29.anIntArray56[local21 - local7]) {
								local310 = Static106.aClass22Array7[local711.anInt3870];
								if (local310.qa() > local210) {
									local210 = local310.qa();
								}
								if (Static290.anInt5325 % 20 < 10) {
									local310.method6074(arg0 + Static189.anIntArray294[0] - 12, local189 + -local310.qa());
								}
							}
						}
						if (local210 > 0) {
						}
					} else if (local21 >= 0) {
						local210 = 0;
						local703 = Static370.aClass125Array1;
						for (local427 = 0; local427 < local703.length; local427++) {
							local711 = local703[local427];
							if (local711 != null && local711.anInt3865 == 10 && local711.anInt3862 == local9[local21]) {
								local310 = Static106.aClass22Array7[local711.anInt3870];
								if (local210 < local310.qa()) {
									local210 = local310.qa();
								}
								local310.method6074(arg0 + Static189.anIntArray294[0] - 12, -local310.qa() + local189);
							}
						}
						if (local210 > 0) {
						}
					}
					for (local210 = 0; local210 < 4; local210++) {
						if (Static290.anInt5325 < local38.anIntArray450[local210]) {
							local879 = local38.method4846() / 2;
							Static204.method731(local879, arg2 >> 1, local38, arg3 >> 1);
							if (Static189.anIntArray294[0] > -1) {
								if (local210 == 1) {
									Static189.anIntArray294[1] -= 20;
								}
								if (local210 == 2) {
									Static189.anIntArray294[0] -= 15;
									Static189.anIntArray294[1] -= 10;
								}
								if (local210 == 3) {
									Static189.anIntArray294[0] += 15;
									Static189.anIntArray294[1] -= 10;
								}
								Static168.aClass22Array11[local38.anIntArray452[local210]].method6074(arg0 + Static189.anIntArray294[0] - 12, arg1 + -12 - -Static189.anIntArray294[1]);
								Static183.aClass65_3.method5804(Integer.toString(local38.anIntArray451[local210]), arg0 + Static189.anIntArray294[0] - 1, arg1 + 3 + Static189.anIntArray294[1], -1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(1009) int local1009;
		for (@Pc(1003) int local1003 = 0; local1003 < Static398.anInt6893; local1003++) {
			local1009 = Static75.anIntArray151[local1003];
			@Pc(1016) Class1_Sub3_Sub3 local1016;
			if (local1009 < 2048) {
				local1016 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local1009];
			} else {
				local1016 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local1009 - 2048];
			}
			local210 = Static64.anIntArray93[local1003];
			@Pc(1039) Class1_Sub3_Sub3 local1039;
			if (local210 >= 2048) {
				local1039 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local210 - 2048];
			} else {
				local1039 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local210];
			}
			Static194.method3196(local1016, local1039, arg1, arg0, arg2, arg3, --local1016.anInt6076);
		}
		local1009 = Static222.aClass179_10.anInt5440 + Static222.aClass179_10.anInt5455 + 2;
		for (local189 = 0; local189 < Static216.anInt4254; local189++) {
			local210 = Static253.anIntArray369[local189];
			local879 = Static253.anIntArray371[local189];
			local427 = Static253.anIntArray368[local189];
			@Pc(1096) boolean local1096 = true;
			while (local1096) {
				local1096 = false;
				for (local533 = 0; local533 < local189; local533++) {
					if (local879 + 2 > Static253.anIntArray371[local533] - local1009 && local879 - local1009 < Static253.anIntArray371[local533] - -2 && local210 - local427 < Static253.anIntArray368[local533] + Static253.anIntArray369[local533] && Static253.anIntArray369[local533] - Static253.anIntArray368[local533] < local427 + local210 && Static253.anIntArray371[local533] - local1009 < local879) {
						local1096 = true;
						local879 = Static253.anIntArray371[local533] - local1009;
					}
				}
			}
			Static253.anIntArray371[local189] = local879;
			@Pc(1194) String local1194 = Static253.aStringArray110[local189];
			if (Static200.anInt3952 == 0) {
				local264 = 16776960;
				if (Static253.anIntArray367[local189] < 6) {
					local264 = Static258.anIntArray568[Static253.anIntArray367[local189]];
				}
				if (Static253.anIntArray367[local189] == 6) {
					local264 = Static164.anInt3507 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static253.anIntArray367[local189] == 7) {
					local264 = Static164.anInt3507 % 20 < 10 ? 255 : 65535;
				}
				if (Static253.anIntArray367[local189] == 8) {
					local264 = Static164.anInt3507 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static253.anIntArray367[local189] == 9) {
					local338 = 150 - Static253.anIntArray370[local189];
					if (local338 < 50) {
						local264 = local338 * 1280 + 16711680;
					} else if (local338 < 100) {
						local264 = 16384000 + 16776960 - local338 * 327680;
					} else if (local338 < 150) {
						local264 = local338 * 5 + 65280 - 500;
					}
				}
				if (Static253.anIntArray367[local189] == 10) {
					local338 = 150 - Static253.anIntArray370[local189];
					if (local338 < 50) {
						local264 = local338 * 5 + 16711680;
					} else if (local338 < 100) {
						local264 = 33095935 - local338 * 327680;
					} else if (local338 < 150) {
						local264 = (local338 + -100) * 327680 + 255 - (local338 - 100) * 5;
					}
				}
				if (Static253.anIntArray367[local189] == 11) {
					local338 = 150 - Static253.anIntArray370[local189];
					if (local338 < 50) {
						local264 = 16777215 - local338 * 327685;
					} else if (local338 < 100) {
						local264 = local338 * 327685 + 65280 - 16384250;
					} else if (local338 < 150) {
						local264 = 16777215 - (local338 - 100) * 327680;
					}
				}
				local338 = local264 | 0xFF000000;
				if (Static253.anIntArray372[local189] == 0) {
					Static399.aClass65_7.method5804(local1194, arg0 + local210, local879 + arg1, local338, -16777216);
				}
				if (Static253.anIntArray372[local189] == 1) {
					Static399.aClass65_7.method5812(arg0 + local210, local879 + arg1, Static164.anInt3507, local338, local1194);
				}
				if (Static253.anIntArray372[local189] == 2) {
					Static399.aClass65_7.method5801(arg0 + local210, Static164.anInt3507, local1194, arg1 + local879, local338);
				}
				if (Static253.anIntArray372[local189] == 3) {
					Static399.aClass65_7.method5811(local1194, local338, 150 - Static253.anIntArray370[local189], Static164.anInt3507, local879 + arg1, local210 + arg0);
				}
				@Pc(1543) int local1543;
				if (Static253.anIntArray372[local189] == 4) {
					local1543 = (150 - Static253.anIntArray370[local189]) * (Static222.aClass179_10.method4385(local1194) - -100) / 150;
					Static266.aClass75_7.Z(local210 + arg0 - 50, arg1, local210 + arg0 + 50, arg1 + arg3);
					Static399.aClass65_7.method5818(local879 + arg1, local210 + arg0 + 50 + -local1543, -16777216, local338, local1194);
					Static266.aClass75_7.pa(arg0, arg1, arg2 + arg0, arg1 + arg3);
				}
				if (Static253.anIntArray372[local189] == 5) {
					local1543 = 150 - Static253.anIntArray370[local189];
					@Pc(1600) int local1600 = 0;
					if (local1543 < 25) {
						local1600 = local1543 - 25;
					} else if (local1543 > 125) {
						local1600 = local1543 - 125;
					}
					@Pc(1622) int local1622 = Static222.aClass179_10.anInt5455 + Static222.aClass179_10.anInt5440;
					Static266.aClass75_7.Z(arg0, local879 + arg1 - local1622 - 1, arg2 + arg0, local879 + arg1 + 5);
					Static399.aClass65_7.method5804(local1194, local210 + arg0, local1600 + local879 + arg1, local338, -16777216);
					Static266.aClass75_7.pa(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
			} else {
				Static399.aClass65_7.method5804(local1194, local210 + arg0, arg1 - -local879, -256, -16777216);
			}
		}
	}
}
