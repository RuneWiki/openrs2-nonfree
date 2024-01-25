import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_130 = new Class47(74, 6);

	@OriginalMember(owner = "client!td", name = "e", descriptor = "I")
	public static int anInt8331 = -1;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_131 = new Class47(40, -1);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V")
	public static void method6765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = Static231.anInt4727;
		@Pc(9) int[] local9 = Static249.anIntArray372;
		Static574.anInt9432 = 0;
		@Pc(175) int local175;
		@Pc(196) int local196;
		@Pc(251) int local251;
		@Pc(332) int local332;
		@Pc(422) int local422;
		@Pc(875) int local875;
		@Pc(527) int local527;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static464.anInt7995; local13++) {
			@Pc(17) Class273 local17 = null;
			@Pc(33) Class4_Sub1_Sub1 local33;
			if (local7 <= local13) {
				local33 = ((Class6_Sub34) Static593.aClass128_43.method3263((long) Static291.anIntArray405[local13 - local7])).aClass4_Sub1_Sub1_Sub1_2;
				local17 = ((Class4_Sub1_Sub1_Sub1) local33).aClass273_1;
				if (local17.anIntArray537 != null) {
					local17 = local17.method6159(Static498.aClass101_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local9[local13]];
			}
			if (local33.anInt7111 >= 0 && (Static534.anInt8855 == local33.anInt7066 || Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 == local33.aByte108)) {
				Static59.method1227(local33.method5894(), arg0 >> 1, local33, arg3 >> 1);
				if (Static373.anIntArray490[0] >= 0) {
					if (local33.aString62 != null && (local13 >= local7 || Static248.anInt5463 == 0 || Static248.anInt5463 == 3 || Static248.anInt5463 == 1 && Static373.method5571(((Class4_Sub1_Sub1_Sub2) local33).aString63)) && Static92.anInt1779 > Static574.anInt9432) {
						Static92.anIntArray145[Static574.anInt9432] = Static555.aClass327_13.method7196(local33.aString62) / 2;
						Static92.anIntArray149[Static574.anInt9432] = Static373.anIntArray490[0];
						Static92.anIntArray147[Static574.anInt9432] = Static373.anIntArray490[1];
						Static92.anIntArray150[Static574.anInt9432] = local33.anInt7096;
						Static92.anIntArray146[Static574.anInt9432] = local33.anInt7089;
						Static92.anIntArray148[Static574.anInt9432] = local33.anInt7119;
						Static92.aStringArray3[Static574.anInt9432] = local33.aString62;
						Static574.anInt9432++;
					}
					local175 = Static373.anIntArray490[1] + arg1;
					@Pc(236) Class58[] local236;
					@Pc(243) Class140[] local243;
					@Pc(305) Class58 local305;
					if (local33.aBoolean493 || Static312.anInt5688 >= local33.anInt7073) {
						local175 -= Math.max(Static555.aClass327_13.anInt8785, Static475.aClass58Array20[0].b());
					} else {
						@Pc(190) byte local190 = 1;
						if (local13 >= local7) {
							local196 = local17.anInt7450;
							if (local196 == -1) {
								local196 = local33.method5891().anInt3605;
							}
						} else {
							@Pc(213) Class4_Sub1_Sub1_Sub2 local213 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local9[local13]];
							local196 = local33.method5891().anInt3605;
							if (local213.aBoolean498) {
								local190 = 2;
							}
						}
						@Pc(225) Class58[] local225 = Static475.aClass58Array20;
						if (local196 != -1) {
							local236 = (Class58[]) Static552.aClass136_105.method3473((long) local196);
							if (local236 == null) {
								local243 = Static604.method3627(Static398.aClass251_94, local196);
								if (local243 != null) {
									local236 = new Class58[local243.length];
									for (local251 = 0; local251 < local243.length; local251++) {
										local236[local251] = Static240.aClass14_7.method6889(local243[local251], true);
									}
									Static552.aClass136_105.method3482((long) local196, local236);
								}
							}
							if (local236 != null && local236.length >= 2) {
								local225 = local236;
							}
						}
						if (local225.length <= local190) {
							local190 = 1;
						}
						@Pc(301) Class58 local301 = local225[0];
						local305 = local225[local190];
						local175 -= Math.max(Static555.aClass327_13.anInt8785, local301.b());
						local251 = arg2 + Static373.anIntArray490[0] - (local301.QA() >> 1);
						local332 = local301.QA() * local33.anInt7068 / 255;
						if (local33.anInt7068 > 0 && local332 < 2) {
							local332 = 2;
						}
						local301.method7666(local251, local175);
						Static240.aClass14_7.Q(local251, local175, local332 + local251, local301.b() + local175);
						local305.method7666(local251, local175);
						Static240.aClass14_7.ca(arg2, arg1, arg0 + arg2, arg3 + arg1);
					}
					local175 -= 2;
					if (!local33.aBoolean493) {
						@Pc(403) Class58 local403;
						if (Static312.anInt5688 < local33.anInt7113) {
							local403 = Static224.aClass58Array11[local33.aBoolean494 ? 2 : 0];
							@Pc(412) Class58 local412 = Static224.aClass58Array11[local33.aBoolean494 ? 3 : 1];
							if (local33 instanceof Class4_Sub1_Sub1_Sub1) {
								local422 = local17.anInt7470;
								if (local422 == -1) {
									local422 = local33.method5891().anInt3592;
								}
							} else {
								local422 = local33.method5891().anInt3592;
							}
							if (local422 != -1) {
								local236 = (Class58[]) Static105.aClass136_24.method3473((long) local422);
								if (local236 == null) {
									local243 = Static604.method3627(Static398.aClass251_94, local422);
									if (local243 != null) {
										local236 = new Class58[local243.length];
										for (local251 = 0; local251 < local243.length; local251++) {
											local236[local251] = Static240.aClass14_7.method6889(local243[local251], true);
										}
										Static105.aClass136_24.method3482((long) local422, local236);
									}
								}
								if (local236 != null && local236.length == 4) {
									local412 = local236[local33.aBoolean494 ? 3 : 1];
									local403 = local236[local33.aBoolean494 ? 2 : 0];
								}
							}
							@Pc(520) int local520 = local33.anInt7113 - Static312.anInt5688;
							if (local33.anInt7131 >= local520) {
								local527 = local403.QA();
							} else {
								local520 -= local33.anInt7131;
								local251 = local33.anInt7063 == 0 ? 0 : (local33.anInt7094 - local520) / local33.anInt7063 * local33.anInt7063;
								local527 = local403.QA() * local251 / local33.anInt7094;
							}
							local251 = local403.b();
							local175 -= local251;
							local332 = arg2 + Static373.anIntArray490[0] - (local403.QA() >> 1);
							local403.method7666(local332, local175);
							Static240.aClass14_7.Q(local332, local175, local332 + local527, local175 + local251);
							local412.method7666(local332, local175);
							local175 -= 2;
							Static240.aClass14_7.ca(arg2, arg1, arg2 + arg0, arg1 - -arg3);
						}
						if (local13 < local7) {
							@Pc(658) Class4_Sub1_Sub1_Sub2 local658 = (Class4_Sub1_Sub1_Sub2) local33;
							if (local658.anInt7164 != -1) {
								local175 -= 25;
								Static581.aClass58Array22[local658.anInt7164].method7666(arg2 + Static373.anIntArray490[0] - 12, local175);
								local175 -= 2;
							}
							if (local658.anInt7138 != -1) {
								local175 -= 25;
								Static591.aClass58Array23[local658.anInt7138].method7666(Static373.anIntArray490[0] + arg2 - 12, local175);
								local175 -= 2;
							}
						} else if (local17.anInt7446 >= 0 && local17.anInt7446 < Static591.aClass58Array23.length) {
							local403 = Static591.aClass58Array23[local17.anInt7446];
							local175 -= 25;
							local403.method7666(arg2 + Static373.anIntArray490[0] - (local403.QA() >> 1), local175);
							local175 -= 2;
						}
					}
					@Pc(705) Class262[] local705;
					@Pc(713) Class262 local713;
					if (!(local33 instanceof Class4_Sub1_Sub1_Sub2)) {
						local196 = 0;
						local705 = Static434.aClass262Array1;
						for (local422 = 0; local422 < local705.length; local422++) {
							local713 = local705[local422];
							if (local713 != null && local713.anInt7229 == 1 && Static291.anIntArray405[local13 - local7] == local713.anInt7228) {
								local305 = Static188.aClass58Array8[local713.anInt7227];
								if (local305.b() > local196) {
									local196 = local305.b();
								}
								if (Static312.anInt5688 % 20 < 10) {
									local305.method7666(Static373.anIntArray490[0] + arg2 - 12, -local305.b() + local175);
								}
							}
						}
						if (local196 > 0) {
						}
					} else if (local13 >= 0) {
						local196 = 0;
						local705 = Static434.aClass262Array1;
						for (local422 = 0; local422 < local705.length; local422++) {
							local713 = local705[local422];
							if (local713 != null && local713.anInt7229 == 10 && local713.anInt7228 == local9[local13]) {
								local305 = Static188.aClass58Array8[local713.anInt7227];
								if (local196 < local305.b()) {
									local196 = local305.b();
								}
								local305.method7666(Static373.anIntArray490[0] + arg2 - 12, -local305.b() + local175);
							}
						}
						if (local196 > 0) {
						}
					}
					for (local196 = 0; local196 < 4; local196++) {
						if (local33.anIntArray518[local196] > Static312.anInt5688) {
							local875 = local33.method5894() / 2;
							Static59.method1227(local875, arg0 >> 1, local33, arg3 >> 1);
							if (Static373.anIntArray490[0] > -1) {
								local422 = Static436.aClass58Array19[local33.anIntArray520[local196]].QA();
								if (local196 == 1) {
									Static373.anIntArray490[1] -= 20;
								}
								if (local196 == 2) {
									Static373.anIntArray490[1] -= 10;
									Static373.anIntArray490[0] -= local422 - 9;
								}
								if (local196 == 3) {
									Static373.anIntArray490[0] += local422 - 9;
									Static373.anIntArray490[1] -= 10;
								}
								Static436.aClass58Array19[local33.anIntArray520[local196]].method7666(Static373.anIntArray490[0] + arg2 - (local422 >> 1), arg1 + Static373.anIntArray490[1] + -12);
								Static319.aClass92_11.method6387(Static373.anIntArray490[0] + arg2 - 1, Integer.toString(local33.anIntArray517[local196]), -1, 0, arg1 + Static373.anIntArray490[1] + 3);
							}
						}
					}
				}
			}
		}
		@Pc(1021) int local1021;
		for (@Pc(1015) int local1015 = 0; local1015 < Static17.anInt512; local1015++) {
			local1021 = Static411.anIntArray703[local1015];
			@Pc(1030) Class4_Sub1_Sub1 local1030;
			if (local1021 < 2048) {
				local1030 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local1021];
			} else {
				local1030 = ((Class6_Sub34) Static593.aClass128_43.method3263((long) (local1021 - 2048))).aClass4_Sub1_Sub1_Sub1_2;
			}
			local196 = Static221.anIntArray277[local1015];
			@Pc(1059) Class4_Sub1_Sub1 local1059;
			if (local196 >= 2048) {
				local1059 = ((Class6_Sub34) Static593.aClass128_43.method3263((long) (local196 - 2048))).aClass4_Sub1_Sub1_Sub1_2;
			} else {
				local1059 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local196];
			}
			Static475.method6589(local1059, local1030, arg1, --local1030.anInt7110, arg2, arg3, arg0);
		}
		local1021 = Static555.aClass327_13.anInt8785 + Static555.aClass327_13.anInt8797 + 2;
		for (local175 = 0; local175 < Static574.anInt9432; local175++) {
			local196 = Static92.anIntArray149[local175];
			local875 = Static92.anIntArray147[local175];
			local422 = Static92.anIntArray145[local175];
			@Pc(1112) boolean local1112 = true;
			while (local1112) {
				local1112 = false;
				for (local527 = 0; local527 < local175; local527++) {
					if (Static92.anIntArray147[local527] - local1021 < local875 + 2 && local875 - local1021 < Static92.anIntArray147[local527] + 2 && Static92.anIntArray145[local527] + Static92.anIntArray149[local527] > local196 - local422 && local422 + local196 > Static92.anIntArray149[local527] - Static92.anIntArray145[local527] && Static92.anIntArray147[local527] - local1021 < local875) {
						local1112 = true;
						local875 = Static92.anIntArray147[local527] - local1021;
					}
				}
			}
			Static92.anIntArray147[local175] = local875;
			@Pc(1201) String local1201 = Static92.aStringArray3[local175];
			if (Static593.anInt9600 == 0) {
				local251 = 16776960;
				if (Static92.anIntArray150[local175] < 6) {
					local251 = Static9.anIntArray27[Static92.anIntArray150[local175]];
				}
				if (Static92.anIntArray150[local175] == 6) {
					local251 = Static534.anInt8855 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static92.anIntArray150[local175] == 7) {
					local251 = Static534.anInt8855 % 20 < 10 ? 255 : 65535;
				}
				if (Static92.anIntArray150[local175] == 8) {
					local251 = Static534.anInt8855 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static92.anIntArray150[local175] == 9) {
					local332 = 150 - Static92.anIntArray148[local175];
					if (local332 < 50) {
						local251 = local332 * 1280 + 16711680;
					} else if (local332 < 100) {
						local251 = 16384000 + 16776960 - local332 * 327680;
					} else if (local332 < 150) {
						local251 = (local332 - 100) * 5 + 65280;
					}
				}
				if (Static92.anIntArray150[local175] == 10) {
					local332 = 150 - Static92.anIntArray148[local175];
					if (local332 < 50) {
						local251 = local332 * 5 + 16711680;
					} else if (local332 < 100) {
						local251 = 33095935 - local332 * 327680;
					} else if (local332 < 150) {
						local251 = (local332 - 100) * 327680 + 255 + 500 - local332 * 5;
					}
				}
				if (Static92.anIntArray150[local175] == 11) {
					local332 = 150 - Static92.anIntArray148[local175];
					if (local332 < 50) {
						local251 = 16777215 - local332 * 327685;
					} else if (local332 < 100) {
						local251 = local332 * 327685 + 65280 - 16384250;
					} else if (local332 < 150) {
						local251 = 32768000 + 16777215 - local332 * 327680;
					}
				}
				local332 = local251 | 0xFF000000;
				if (Static92.anIntArray146[local175] == 0) {
					Static114.aClass92_4.method6387(arg2 + local196, local1201, local332, -16777216, local875 + arg1);
				}
				if (Static92.anIntArray146[local175] == 1) {
					Static114.aClass92_4.method6396(arg1 + local875, Static534.anInt8855, local332, local1201, local196 + arg2);
				}
				if (Static92.anIntArray146[local175] == 2) {
					Static114.aClass92_4.method6393(Static534.anInt8855, local875 + arg1, arg2 + local196, local1201, local332);
				}
				if (Static92.anIntArray146[local175] == 3) {
					Static114.aClass92_4.method6392(local332, arg2 + local196, Static534.anInt8855, 150 - Static92.anIntArray148[local175], local1201, local875 + arg1);
				}
				@Pc(1557) int local1557;
				if (Static92.anIntArray146[local175] == 4) {
					local1557 = (150 - Static92.anIntArray148[local175]) * (Static555.aClass327_13.method7196(local1201) - -100) / 150;
					Static240.aClass14_7.Q(arg2 + local196 - 50, arg1, arg2 + local196 + 50, arg3 + arg1);
					Static114.aClass92_4.method6390(arg1 + local875, local332, local196 + arg2 + 50 - local1557, -16777216, local1201);
					Static240.aClass14_7.ca(arg2, arg1, arg0 + arg2, arg1 + arg3);
				}
				if (Static92.anIntArray146[local175] == 5) {
					local1557 = 150 - Static92.anIntArray148[local175];
					@Pc(1616) int local1616 = 0;
					if (local1557 < 25) {
						local1616 = local1557 - 25;
					} else if (local1557 > 125) {
						local1616 = local1557 - 125;
					}
					@Pc(1640) int local1640 = Static555.aClass327_13.anInt8797 + Static555.aClass327_13.anInt8785;
					Static240.aClass14_7.Q(arg2, arg1 + local875 - local1640 - 1, arg2 + arg0, arg1 + local875 + 5);
					Static114.aClass92_4.method6387(arg2 + local196, local1201, local332, -16777216, arg1 + local875 + local1616);
					Static240.aClass14_7.ca(arg2, arg1, arg0 + arg2, arg1 + arg3);
				}
			} else {
				Static114.aClass92_4.method6387(local196 + arg2, local1201, -256, -16777216, arg1 + local875);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static void method6767() {
		Static25.aClass43_1.method3556();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static390.aLongArray12[local14] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static78.aLongArray4[local28] = 0L;
		}
		Static352.anInt6257 = 0;
	}
}
