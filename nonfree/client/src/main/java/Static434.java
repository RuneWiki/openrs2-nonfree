import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V")
	public static void method4791(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static476.anInt8277;
		@Pc(9) int[] local9 = Static10.anIntArray19;
		Static325.anInt5840 = 0;
		@Pc(178) int local178;
		@Pc(221) int local221;
		@Pc(267) int local267;
		@Pc(345) int local345;
		@Pc(423) int local423;
		@Pc(867) int local867;
		@Pc(561) int local561;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static49.anInt1058; local13++) {
			@Pc(17) Class294 local17 = null;
			@Pc(34) Class9_Sub1_Sub1_Sub2 local34;
			if (local13 >= local7) {
				local34 = ((Class3_Sub39) Static243.aClass310_16.method6601((long) Static480.anIntArray603[local13 - local7])).aClass9_Sub1_Sub1_Sub2_Sub1_2;
				local17 = ((Class9_Sub1_Sub1_Sub2_Sub1) local34).aClass294_1;
				if (local17.anIntArray588 != null) {
					local17 = local17.method6429(Static427.aClass56_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local34 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local9[local13]];
			}
			if (local34.anInt6455 >= 0 && (Static337.anInt5983 == local34.anInt6404 || Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 == local34.aByte126)) {
				Static62.method4284(arg0 >> 1, arg3 >> 1, local34.method5564(), local34);
				if (Static449.anIntArray577[0] >= 0) {
					if (local34.aString93 != null && (local7 <= local13 || Static67.anInt1795 == 0 || Static67.anInt1795 == 3 || Static67.anInt1795 == 1 && Static277.method4435(((Class9_Sub1_Sub1_Sub2_Sub2) local34).aString94)) && Static325.anInt5840 < Static162.anInt3254) {
						Static162.anIntArray273[Static325.anInt5840] = Static159.aClass58_7.method1767(local34.aString93) / 2;
						Static162.anIntArray277[Static325.anInt5840] = Static449.anIntArray577[0];
						Static162.anIntArray278[Static325.anInt5840] = Static449.anIntArray577[1];
						Static162.anIntArray276[Static325.anInt5840] = local34.anInt6433;
						Static162.anIntArray272[Static325.anInt5840] = local34.anInt6452;
						Static162.anIntArray275[Static325.anInt5840] = local34.anInt6414;
						Static162.aStringArray21[Static325.anInt5840] = local34.aString93;
						Static325.anInt5840++;
					}
					local178 = arg1 + Static449.anIntArray577[1];
					@Pc(252) Class46[] local252;
					@Pc(259) Class355[] local259;
					@Pc(317) Class46 local317;
					if (local34.aBoolean527 || Static305.anInt5560 >= local34.anInt6431) {
						local178 -= Math.max(Static159.aClass58_7.anInt2039, Static594.aClass46Array15[0].u());
					} else {
						@Pc(205) byte local205 = 1;
						if (local7 > local13) {
							@Pc(214) Class9_Sub1_Sub1_Sub2_Sub2 local214 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local9[local13]];
							local221 = local34.method5573().anInt7052;
							if (local214.aBoolean535) {
								local205 = 2;
							}
						} else {
							local221 = local17.anInt7604;
							if (local221 == -1) {
								local221 = local34.method5573().anInt7052;
							}
						}
						@Pc(241) Class46[] local241 = Static594.aClass46Array15;
						if (local221 != -1) {
							local252 = (Class46[]) Static421.aClass10_45.method250((long) local221);
							if (local252 == null) {
								local259 = Static606.method7593(Static171.aClass246_84, local221);
								if (local259 != null) {
									local252 = new Class46[local259.length];
									for (local267 = 0; local267 < local259.length; local267++) {
										local252[local267] = Static4.aClass43_1.method7205(local259[local267], true);
									}
									Static421.aClass10_45.method254(local252, (long) local221);
								}
							}
							if (local252 != null && local252.length >= 2) {
								local241 = local252;
							}
						}
						if (local241.length <= local205) {
							local205 = 1;
						}
						@Pc(313) Class46 local313 = local241[0];
						local317 = local241[local205];
						local178 -= Math.max(Static159.aClass58_7.anInt2039, local313.u());
						local267 = Static449.anIntArray577[0] + arg2 - (local313.E() >> 1);
						local345 = local313.E() * local34.anInt6460 / 255;
						if (local34.anInt6460 > 0 && local345 < 2) {
							local345 = 2;
						}
						local313.method7606(local267, local178);
						Static4.aClass43_1.V(local267, local178, local267 + local345, local313.u() + local178);
						local317.method7606(local267, local178);
						Static4.aClass43_1.da(arg2, arg1, arg2 + arg0, arg3 + arg1);
					}
					local178 -= 2;
					if (!local34.aBoolean527) {
						@Pc(406) Class46 local406;
						if (local34.anInt6442 > Static305.anInt5560) {
							local406 = Static231.aClass46Array9[local34.aBoolean526 ? 2 : 0];
							@Pc(415) Class46 local415 = Static231.aClass46Array9[local34.aBoolean526 ? 3 : 1];
							if (local34 instanceof Class9_Sub1_Sub1_Sub2_Sub1) {
								local423 = local17.anInt7590;
								if (local423 == -1) {
									local423 = local34.method5573().anInt7045;
								}
							} else {
								local423 = local34.method5573().anInt7045;
							}
							if (local423 != -1) {
								local252 = (Class46[]) Static582.aClass10_67.method250((long) local423);
								if (local252 == null) {
									local259 = Static606.method7593(Static171.aClass246_84, local423);
									if (local259 != null) {
										local252 = new Class46[local259.length];
										for (local267 = 0; local267 < local259.length; local267++) {
											local252[local267] = Static4.aClass43_1.method7205(local259[local267], true);
										}
										Static582.aClass10_67.method254(local252, (long) local423);
									}
								}
								if (local252 != null && local252.length == 4) {
									local415 = local252[local34.aBoolean526 ? 3 : 1];
									local406 = local252[local34.aBoolean526 ? 2 : 0];
								}
							}
							@Pc(520) int local520 = local34.anInt6442 - Static305.anInt5560;
							if (local520 > local34.anInt6446) {
								local520 -= local34.anInt6446;
								local267 = local34.anInt6406 == 0 ? 0 : local34.anInt6406 * ((local34.anInt6413 - local520) / local34.anInt6406);
								local561 = local406.E() * local267 / local34.anInt6413;
							} else {
								local561 = local406.E();
							}
							local267 = local406.u();
							local178 -= local267;
							local345 = Static449.anIntArray577[0] + arg2 - (local406.E() >> 1);
							local406.method7606(local345, local178);
							Static4.aClass43_1.V(local345, local178, local345 + local561, local178 + local267);
							local415.method7606(local345, local178);
							Static4.aClass43_1.da(arg2, arg1, arg2 + arg0, arg3 + arg1);
							local178 -= 2;
						}
						if (local13 < local7) {
							@Pc(624) Class9_Sub1_Sub1_Sub2_Sub2 local624 = (Class9_Sub1_Sub1_Sub2_Sub2) local34;
							if (local624.anInt6475 != -1) {
								local178 -= 25;
								Static223.aClass46Array8[local624.anInt6475].method7606(Static449.anIntArray577[0] + arg2 - 12, local178);
								local178 -= 2;
							}
							if (local624.anInt6488 != -1) {
								local178 -= 25;
								Static503.aClass46Array14[local624.anInt6488].method7606(arg2 + Static449.anIntArray577[0] - 12, local178);
								local178 -= 2;
							}
						} else if (local17.anInt7616 >= 0 && local17.anInt7616 < Static503.aClass46Array14.length) {
							local406 = Static503.aClass46Array14[local17.anInt7616];
							local178 -= 25;
							local406.method7606(Static449.anIntArray577[0] + arg2 - (local406.E() >> 1), local178);
							local178 -= 2;
						}
					}
					@Pc(705) Class122[] local705;
					@Pc(713) Class122 local713;
					if (!(local34 instanceof Class9_Sub1_Sub1_Sub2_Sub2)) {
						local221 = 0;
						local705 = Static443.aClass122Array1;
						for (local423 = 0; local423 < local705.length; local423++) {
							local713 = local705[local423];
							if (local713 != null && local713.anInt3557 == 1 && Static480.anIntArray603[local13 - local7] == local713.anInt3554) {
								local317 = Static56.aClass46Array2[local713.anInt3547];
								if (local221 < local317.u()) {
									local221 = local317.u();
								}
								if (Static305.anInt5560 % 20 < 10) {
									local317.method7606(arg2 + Static449.anIntArray577[0] - 12, -local317.u() + local178);
								}
							}
						}
						if (local221 > 0) {
						}
					} else if (local13 >= 0) {
						local221 = 0;
						local705 = Static443.aClass122Array1;
						for (local423 = 0; local423 < local705.length; local423++) {
							local713 = local705[local423];
							if (local713 != null && local713.anInt3557 == 10 && local713.anInt3554 == local9[local13]) {
								local317 = Static56.aClass46Array2[local713.anInt3547];
								if (local317.u() > local221) {
									local221 = local317.u();
								}
								local317.method7606(Static449.anIntArray577[0] + arg2 - 12, local178 + -local317.u());
							}
						}
						if (local221 > 0) {
						}
					}
					for (local221 = 0; local221 < 4; local221++) {
						if (Static305.anInt5560 < local34.anIntArray514[local221]) {
							local867 = local34.method5564() / 2;
							Static62.method4284(arg0 >> 1, arg3 >> 1, local867, local34);
							if (Static449.anIntArray577[0] > -1) {
								local423 = Static10.aClass46Array1[local34.anIntArray513[local221]].E();
								if (local221 == 1) {
									Static449.anIntArray577[1] -= 20;
								}
								if (local221 == 2) {
									Static449.anIntArray577[0] -= local423 - 9;
									Static449.anIntArray577[1] -= 10;
								}
								if (local221 == 3) {
									Static449.anIntArray577[1] -= 10;
									Static449.anIntArray577[0] += local423 - 9;
								}
								Static10.aClass46Array1[local34.anIntArray513[local221]].method7606(Static449.anIntArray577[0] + arg2 - (local423 >> 1), Static449.anIntArray577[1] + -12 + arg1);
								Static410.aClass117_8.method7655(arg1 + Static449.anIntArray577[1] + 3, 0, arg2 + Static449.anIntArray577[0] - 1, Integer.toString(local34.anIntArray516[local221]), -1);
							}
						}
					}
				}
			}
		}
		@Pc(1033) int local1033;
		for (@Pc(1027) int local1027 = 0; local1027 < Static334.anInt5949; local1027++) {
			local1033 = Static239.anIntArray362[local1027];
			@Pc(1050) Class9_Sub1_Sub1_Sub2 local1050;
			if (local1033 >= 2048) {
				local1050 = ((Class3_Sub39) Static243.aClass310_16.method6601((long) (local1033 - 2048))).aClass9_Sub1_Sub1_Sub2_Sub1_2;
			} else {
				local1050 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local1033];
			}
			local221 = Static20.anIntArray50[local1027];
			@Pc(1075) Class9_Sub1_Sub1_Sub2 local1075;
			if (local221 >= 2048) {
				local1075 = ((Class3_Sub39) Static243.aClass310_16.method6601((long) (local221 - 2048))).aClass9_Sub1_Sub1_Sub2_Sub1_2;
			} else {
				local1075 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local221];
			}
			Static480.method6571(arg3, arg1, arg0, arg2, --local1050.anInt6399, local1075, local1050);
		}
		local1033 = Static159.aClass58_7.anInt2031 + Static159.aClass58_7.anInt2039 + 2;
		for (local178 = 0; local178 < Static325.anInt5840; local178++) {
			local221 = Static162.anIntArray277[local178];
			local867 = Static162.anIntArray278[local178];
			local423 = Static162.anIntArray273[local178];
			@Pc(1132) boolean local1132 = true;
			while (local1132) {
				local1132 = false;
				for (local561 = 0; local561 < local178; local561++) {
					if (local867 + 2 > -local1033 + Static162.anIntArray278[local561] && Static162.anIntArray278[local561] + 2 > local867 - local1033 && Static162.anIntArray273[local561] + Static162.anIntArray277[local561] > local221 + -local423 && Static162.anIntArray277[local561] - Static162.anIntArray273[local561] < local221 - -local423 && Static162.anIntArray278[local561] - local1033 < local867) {
						local1132 = true;
						local867 = Static162.anIntArray278[local561] - local1033;
					}
				}
			}
			Static162.anIntArray278[local178] = local867;
			@Pc(1219) String local1219 = Static162.aStringArray21[local178];
			if (Static123.anInt2784 == 0) {
				local267 = 16776960;
				if (Static162.anIntArray276[local178] < 6) {
					local267 = Static10.anIntArray17[Static162.anIntArray276[local178]];
				}
				if (Static162.anIntArray276[local178] == 6) {
					local267 = Static337.anInt5983 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static162.anIntArray276[local178] == 7) {
					local267 = Static337.anInt5983 % 20 < 10 ? 255 : 65535;
				}
				if (Static162.anIntArray276[local178] == 8) {
					local267 = Static337.anInt5983 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static162.anIntArray276[local178] == 9) {
					local345 = 150 - Static162.anIntArray275[local178];
					if (local345 < 50) {
						local267 = local345 * 1280 + 16711680;
					} else if (local345 < 100) {
						local267 = 16776960 + 16384000 - local345 * 327680;
					} else if (local345 < 150) {
						local267 = local345 * 5 + 65280 - 500;
					}
				}
				if (Static162.anIntArray276[local178] == 10) {
					local345 = 150 - Static162.anIntArray275[local178];
					if (local345 < 50) {
						local267 = local345 * 5 + 16711680;
					} else if (local345 < 100) {
						local267 = 16711935 + 16384000 - local345 * 327680;
					} else if (local345 < 150) {
						local267 = local345 * 327680 + 500 - local345 * 5 - 32767745;
					}
				}
				if (Static162.anIntArray276[local178] == 11) {
					local345 = 150 - Static162.anIntArray275[local178];
					if (local345 < 50) {
						local267 = 16777215 - local345 * 327685;
					} else if (local345 < 100) {
						local267 = local345 * 327685 + 65280 - 16384250;
					} else if (local345 < 150) {
						local267 = 32768000 + 16777215 - local345 * 327680;
					}
				}
				local345 = local267 | 0xFF000000;
				if (Static162.anIntArray272[local178] == 0) {
					Static480.aClass117_9.method7655(local867 + arg1, -16777216, local221 + arg2, local1219, local345);
				}
				if (Static162.anIntArray272[local178] == 1) {
					Static480.aClass117_9.method7649(local345, Static337.anInt5983, local1219, arg1 + local867, local221 + arg2);
				}
				if (Static162.anIntArray272[local178] == 2) {
					Static480.aClass117_9.method7662(local345, local1219, arg1 + local867, local221 + arg2, Static337.anInt5983);
				}
				if (Static162.anIntArray272[local178] == 3) {
					Static480.aClass117_9.method7647(arg2 + local221, arg1 - -local867, local1219, 150 - Static162.anIntArray275[local178], Static337.anInt5983, local345);
				}
				@Pc(1577) int local1577;
				if (Static162.anIntArray272[local178] == 4) {
					local1577 = (150 - Static162.anIntArray275[local178]) * (Static159.aClass58_7.method1767(local1219) + 100) / 150;
					Static4.aClass43_1.V(arg2 + local221 - 50, arg1, arg2 + local221 + 50, arg1 + arg3);
					Static480.aClass117_9.method7654(local1219, local867 + arg1, local345, local221 + arg2 + 50 - local1577, -16777216);
					Static4.aClass43_1.da(arg2, arg1, arg2 + arg0, arg1 - -arg3);
				}
				if (Static162.anIntArray272[local178] == 5) {
					local1577 = 150 - Static162.anIntArray275[local178];
					@Pc(1638) int local1638 = 0;
					if (local1577 < 25) {
						local1638 = local1577 - 25;
					} else if (local1577 > 125) {
						local1638 = local1577 - 125;
					}
					@Pc(1662) int local1662 = Static159.aClass58_7.anInt2031 + Static159.aClass58_7.anInt2039;
					Static4.aClass43_1.V(arg2, local867 + arg1 - local1662 - 1, arg0 + arg2, arg1 + local867 + 5);
					Static480.aClass117_9.method7655(local1638 + arg1 + local867, -16777216, local221 + arg2, local1219, local345);
					Static4.aClass43_1.da(arg2, arg1, arg0 + arg2, arg1 + arg3);
				}
			} else {
				Static480.aClass117_9.method7655(arg1 + local867, -16777216, arg2 + local221, local1219, -256);
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)Ljava/lang/String;")
	public static String method4794() {
		return Static255.aBoolean352 || Static99.aClass3_Sub44_2 == null ? "" : Static99.aClass3_Sub44_2.aString106;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)V")
	public static void method4796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static560.aClass211_4 == Static227.aClass211_1) {
			if (!Static436.method6152(arg1, 0, -2, 1, false, 0, arg0, 1)) {
				Static436.method6152(arg1, 0, -3, 1, false, 0, arg0, 1);
			}
		} else if (!Static436.method6152(arg1, 0, -3, 1, false, 0, arg0, 1)) {
			Static436.method6152(arg1, 0, -2, 1, false, 0, arg0, 1);
		}
	}
}
