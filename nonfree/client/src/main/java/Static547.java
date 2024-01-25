import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "Lclient!oh;")
	public static Class237 aClass237_132;

	@OriginalMember(owner = "client!tia", name = "d", descriptor = "[Lclient!q;")
	public static final Interface21[] anInterface21Array2 = new Interface21[128];

	@OriginalMember(owner = "client!tia", name = "f", descriptor = "Lclient!tp;")
	public static Class331 aClass331_17 = null;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIIIIBI)V")
	public static void method7692(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static315.anInt9128;
		Static125.anInt6633 = 0;
		@Pc(11) int[] local11 = Static533.anIntArray506;
		@Pc(176) int local176;
		@Pc(217) int local217;
		@Pc(263) int local263;
		@Pc(344) int local344;
		@Pc(347) int local347;
		@Pc(429) int local429;
		@Pc(530) int local530;
		@Pc(1035) int local1035;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static59.anInt1906; local13++) {
			@Pc(17) Class300 local17 = null;
			@Pc(36) Class15_Sub1_Sub2_Sub2 local36;
			if (local13 >= local7) {
				local36 = ((Class8_Sub50) Static278.aClass253_20.method6594((long) Static620.anIntArray609[local13 - local7])).aClass15_Sub1_Sub2_Sub2_Sub2_2;
				local17 = ((Class15_Sub1_Sub2_Sub2_Sub2) local36).aClass300_1;
				if (local17.anIntArray498 != null) {
					local17 = local17.method7306(Static420.aClass77_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local36 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local11[local13]];
			}
			if (local36.anInt8086 >= 0 && (Static609.anInt9845 == local36.anInt8051 || local36.aByte124 == Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124)) {
				Static171.method3369(arg2 >> 1, local36, arg3 >> 1, local36.method6695());
				if (Static390.anIntArray410[0] >= 0) {
					if (local36.aString85 != null && (local7 <= local13 || Static446.anInt7846 == 0 || Static446.anInt7846 == 3 || Static446.anInt7846 == 1 && Static127.method2820(((Class15_Sub1_Sub2_Sub2_Sub1) local36).aString35)) && Static47.anInt1599 > Static125.anInt6633) {
						Static47.anIntArray65[Static125.anInt6633] = Static469.aClass345_15.method8112(local36.aString85) / 2;
						Static47.anIntArray63[Static125.anInt6633] = Static390.anIntArray410[0];
						Static47.anIntArray68[Static125.anInt6633] = Static390.anIntArray410[1];
						Static47.anIntArray67[Static125.anInt6633] = local36.anInt8121;
						Static47.anIntArray64[Static125.anInt6633] = local36.anInt8123;
						Static47.anIntArray66[Static125.anInt6633] = local36.anInt8053;
						Static47.aStringArray5[Static125.anInt6633] = local36.aString85;
						Static125.anInt6633++;
					}
					local176 = arg0 + Static390.anIntArray410[1];
					@Pc(248) Class21[] local248;
					@Pc(255) Class111[] local255;
					@Pc(317) Class21 local317;
					if (local36.aBoolean583 || local36.anInt8136 <= Static435.anInt8192) {
						local176 -= Math.max(Static469.aClass345_15.anInt10013, Static624.aClass21Array23[0].method5783());
					} else {
						@Pc(199) byte local199 = 1;
						if (local7 > local13) {
							@Pc(212) Class15_Sub1_Sub2_Sub2_Sub1 local212 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local11[local13]];
							local217 = local36.method6686().anInt3759;
							if (local212.aBoolean249) {
								local199 = 2;
							}
						} else {
							local217 = local17.anInt8882;
							if (local217 == -1) {
								local217 = local36.method6686().anInt3759;
							}
						}
						@Pc(237) Class21[] local237 = Static624.aClass21Array23;
						if (local217 != -1) {
							local248 = (Class21[]) Static439.aClass236_76.method6242((long) local217);
							if (local248 == null) {
								local255 = Static647.method3297(Static630.aClass237_149, local217);
								if (local255 != null) {
									local248 = new Class21[local255.length];
									for (local263 = 0; local263 < local255.length; local263++) {
										local248[local263] = Static171.aClass16_5.method6135(local255[local263], true);
									}
									Static439.aClass236_76.method6241((long) local217, local248);
								}
							}
							if (local248 != null && local248.length >= 2) {
								local237 = local248;
							}
						}
						if (local237.length <= local199) {
							local199 = 1;
						}
						@Pc(313) Class21 local313 = local237[0];
						local317 = local237[local199];
						local176 -= Math.max(Static469.aClass345_15.anInt10013, local313.method5783());
						local263 = Static390.anIntArray410[0] + arg1 - (local313.method5790() >> 1);
						local344 = local313.method5790() * local36.anInt8052 / 255;
						local347 = local313.method5783();
						if (local36.anInt8052 > 0 && local344 < 2) {
							local344 = 2;
						}
						local313.method5796(local263, local176);
						Static171.aClass16_5.T(local263, local176, local344 + local263, local347 + local176);
						local317.method5796(local263, local176);
						Static171.aClass16_5.KA(arg1, arg0, arg1 + arg3, arg2 + arg0);
						Static460.method6945(local176, local176 + local347, local263, local313.method5779() + local263);
					}
					local176 -= 2;
					if (!local36.aBoolean583) {
						@Pc(412) Class21 local412;
						@Pc(421) Class21 local421;
						if (local36.anInt8127 > Static435.anInt8192) {
							local412 = Static7.aClass21Array16[local36.aBoolean584 ? 2 : 0];
							local421 = Static7.aClass21Array16[local36.aBoolean584 ? 3 : 1];
							if (local36 instanceof Class15_Sub1_Sub2_Sub2_Sub2) {
								local429 = local17.anInt8876;
								if (local429 == -1) {
									local429 = local36.method6686().anInt3742;
								}
							} else {
								local429 = local36.method6686().anInt3742;
							}
							if (local429 != -1) {
								local248 = (Class21[]) Static135.aClass236_25.method6242((long) local429);
								if (local248 == null) {
									local255 = Static647.method3297(Static630.aClass237_149, local429);
									if (local255 != null) {
										local248 = new Class21[local255.length];
										for (local263 = 0; local263 < local255.length; local263++) {
											local248[local263] = Static171.aClass16_5.method6135(local255[local263], true);
										}
										Static135.aClass236_25.method6241((long) local429, local248);
									}
								}
								if (local248 != null && local248.length == 4) {
									local421 = local248[local36.aBoolean584 ? 3 : 1];
									local412 = local248[local36.aBoolean584 ? 2 : 0];
								}
							}
							@Pc(523) int local523 = local36.anInt8127 - Static435.anInt8192;
							if (local36.anInt8130 >= local523) {
								local530 = local412.method5790();
							} else {
								local523 -= local36.anInt8130;
								local263 = local36.anInt8090 == 0 ? 0 : local36.anInt8090 * ((local36.anInt8079 - local523) / local36.anInt8090);
								local530 = local412.method5790() * local263 / local36.anInt8079;
							}
							local263 = local412.method5783();
							local176 -= local263;
							local344 = arg1 + Static390.anIntArray410[0] - (local412.method5790() >> 1);
							local412.method5796(local344, local176);
							Static171.aClass16_5.T(local344, local176, local530 + local344, local263 + local176);
							local421.method5796(local344, local176);
							Static171.aClass16_5.KA(arg1, arg0, arg3 + arg1, arg0 + arg2);
							Static460.method6945(local176, local176 + local263, local344, local412.method5779() + local344);
							local176 -= 2;
						}
						if (local13 < local7) {
							@Pc(632) Class15_Sub1_Sub2_Sub2_Sub1 local632 = (Class15_Sub1_Sub2_Sub2_Sub1) local36;
							if (local632.anInt3306 != -1) {
								local176 -= 25;
								local421 = Static1.aClass21Array21[local632.anInt3306];
								local421.method5796(Static390.anIntArray410[0] + arg1 - 12, local176);
								Static460.method6945(local176, local421.method5785() + local176, arg1 + Static390.anIntArray410[0] - 12, arg1 + Static390.anIntArray410[0] + local421.method5779() - 12);
								local176 -= 2;
							}
							if (local632.anInt3304 != -1) {
								local176 -= 25;
								local421 = Static218.aClass21Array12[local632.anInt3304];
								local421.method5796(arg1 + Static390.anIntArray410[0] - 12, local176);
								Static460.method6945(local176, local421.method5785() + local176, Static390.anIntArray410[0] + (arg1 - 12), arg1 + Static390.anIntArray410[0] + local421.method5779() - 12);
								local176 -= 2;
							}
						} else if (local17.anInt8872 >= 0 && Static218.aClass21Array12.length > local17.anInt8872) {
							local412 = Static218.aClass21Array12[local17.anInt8872];
							local176 -= 25;
							local412.method5796(Static390.anIntArray410[0] + arg1 - (local412.method5790() >> 1), local176);
							Static460.method6945(local176, local176 + local412.method5785(), Static390.anIntArray410[0] + arg1 + -(local412.method5790() >> 1), Static390.anIntArray410[0] + arg1 - (local412.method5790() >> 1) + local412.method5779());
							local176 -= 2;
						}
					}
					@Pc(805) Class319[] local805;
					@Pc(813) Class319 local813;
					if (!(local36 instanceof Class15_Sub1_Sub2_Sub2_Sub1)) {
						local217 = 0;
						local805 = Static447.aClass319Array3;
						for (local429 = 0; local429 < local805.length; local429++) {
							local813 = local805[local429];
							if (local813 != null && local813.anInt9116 == 1 && Static620.anIntArray609[local13 - local7] == local813.anInt9124) {
								local317 = Static152.aClass21Array7[local813.anInt9123];
								if (local317.method5783() > local217) {
									local217 = local317.method5783();
								}
								if (Static435.anInt8192 % 20 < 10) {
									local317.method5796(Static390.anIntArray410[0] + arg1 - 12, -local317.method5783() + local176);
									Static460.method6945(local176 - local317.method5783(), local176 - local317.method5783() - -local317.method5785(), Static390.anIntArray410[0] + arg1 - 12, Static390.anIntArray410[0] + -12 + arg1 + local317.method5779());
								}
							}
						}
						if (local217 > 0) {
						}
					} else if (local13 >= 0) {
						local217 = 0;
						local805 = Static447.aClass319Array3;
						for (local429 = 0; local429 < local805.length; local429++) {
							local813 = local805[local429];
							if (local813 != null && local813.anInt9116 == 10 && local11[local13] == local813.anInt9124) {
								local317 = Static152.aClass21Array7[local813.anInt9123];
								if (local217 < local317.method5783()) {
									local217 = local317.method5783();
								}
								local317.method5796(Static390.anIntArray410[0] + arg1 - 12, local176 + -local317.method5783());
								Static460.method6945(local176 - local317.method5783(), local176 + -local317.method5783() - -local317.method5785(), Static390.anIntArray410[0] + arg1 - 12, Static390.anIntArray410[0] + -12 + (arg1 - -local317.method5779()));
							}
						}
						if (local217 > 0) {
						}
					}
					for (local217 = 0; local217 < 4; local217++) {
						if (local36.anIntArray431[local217] > Static435.anInt8192) {
							local1035 = local36.method6695() / 2;
							Static171.method3369(arg2 >> 1, local36, arg3 >> 1, local1035);
							if (Static390.anIntArray410[0] > -1) {
								local429 = Static619.aClass21Array22[local36.anIntArray429[local217]].method5790();
								if (local217 == 1) {
									Static390.anIntArray410[1] -= 20;
								}
								if (local217 == 2) {
									Static390.anIntArray410[1] -= 10;
									Static390.anIntArray410[0] -= local429 - 9;
								}
								if (local217 == 3) {
									Static390.anIntArray410[0] += local429 - 9;
									Static390.anIntArray410[1] -= 10;
								}
								Static619.aClass21Array22[local36.anIntArray429[local217]].method5796(Static390.anIntArray410[0] + arg1 - (local429 >> 1), arg0 - -Static390.anIntArray410[1] + -12);
								Static87.aClass27_21.method7002(0, -1, Integer.toString(local36.anIntArray432[local217]), Static390.anIntArray410[0] + arg1 - 1, Static390.anIntArray410[1] + 3 + arg0);
							}
						}
					}
				}
			}
		}
		@Pc(1181) int local1181;
		for (@Pc(1175) int local1175 = 0; local1175 < Static124.anInt3366; local1175++) {
			local1181 = Static197.anIntArray253[local1175];
			@Pc(1194) Class15_Sub1_Sub2_Sub2 local1194;
			if (local1181 >= 2048) {
				local1194 = ((Class8_Sub50) Static278.aClass253_20.method6594((long) (local1181 - 2048))).aClass15_Sub1_Sub2_Sub2_Sub2_2;
			} else {
				local1194 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local1181];
			}
			local217 = Static172.anIntArray228[local1175];
			@Pc(1213) Class15_Sub1_Sub2_Sub2 local1213;
			if (local217 < 2048) {
				local1213 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local217];
			} else {
				local1213 = ((Class8_Sub50) Static278.aClass253_20.method6594((long) (local217 - 2048))).aClass15_Sub1_Sub2_Sub2_Sub2_2;
			}
			Static577.method8049(arg3, arg1, arg0, local1194, arg2, local1213, --local1194.anInt8067);
		}
		local1181 = Static469.aClass345_15.anInt10013 + Static469.aClass345_15.anInt10003 + 2;
		for (local176 = 0; local176 < Static125.anInt6633; local176++) {
			local217 = Static47.anIntArray63[local176];
			local1035 = Static47.anIntArray68[local176];
			local429 = Static47.anIntArray65[local176];
			@Pc(1282) boolean local1282 = true;
			while (local1282) {
				local1282 = false;
				for (local530 = 0; local530 < local176; local530++) {
					if (Static47.anIntArray68[local530] - local1181 < local1035 + 2 && local1035 - local1181 < Static47.anIntArray68[local530] - -2 && local217 - local429 < Static47.anIntArray63[local530] + Static47.anIntArray65[local530] && Static47.anIntArray63[local530] - Static47.anIntArray65[local530] < local429 + local217 && local1035 > Static47.anIntArray68[local530] - local1181) {
						local1035 = Static47.anIntArray68[local530] - local1181;
						local1282 = true;
					}
				}
			}
			Static47.anIntArray68[local176] = local1035;
			@Pc(1379) String local1379 = Static47.aStringArray5[local176];
			local263 = Static469.aClass345_15.method8112(local1379);
			local344 = local217 + arg1;
			local347 = local1035 + arg0 - Static469.aClass345_15.anInt10013;
			@Pc(1399) int local1399 = local344 + local263;
			@Pc(1406) int local1406 = Static469.aClass345_15.anInt10003 + local1035 + arg0;
			if (Static624.anInt10431 == 0) {
				@Pc(1413) int local1413 = 16776960;
				if (Static47.anIntArray67[local176] < 6) {
					local1413 = Static66.anIntArray79[Static47.anIntArray67[local176]];
				}
				if (Static47.anIntArray67[local176] == 6) {
					local1413 = Static609.anInt9845 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static47.anIntArray67[local176] == 7) {
					local1413 = Static609.anInt9845 % 20 >= 10 ? 65535 : 255;
				}
				if (Static47.anIntArray67[local176] == 8) {
					local1413 = Static609.anInt9845 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(1488) int local1488;
				if (Static47.anIntArray67[local176] == 9) {
					local1488 = 150 - Static47.anIntArray66[local176];
					if (local1488 < 50) {
						local1413 = local1488 * 1280 + 16711680;
					} else if (local1488 < 100) {
						local1413 = 16384000 + 16776960 - local1488 * 327680;
					} else if (local1488 < 150) {
						local1413 = (local1488 - 100) * 5 + 65280;
					}
				}
				if (Static47.anIntArray67[local176] == 10) {
					local1488 = 150 - Static47.anIntArray66[local176];
					if (local1488 < 50) {
						local1413 = local1488 * 5 + 16711680;
					} else if (local1488 < 100) {
						local1413 = 16384000 + 16711935 - local1488 * 327680;
					} else if (local1488 < 150) {
						local1413 = local1488 * 327680 - (local1488 - 100) * 5 - 32767745;
					}
				}
				if (Static47.anIntArray67[local176] == 11) {
					local1488 = 150 - Static47.anIntArray66[local176];
					if (local1488 < 50) {
						local1413 = 16777215 - local1488 * 327685;
					} else if (local1488 < 100) {
						local1413 = local1488 * 327685 + 65280 - 16384250;
					} else if (local1488 < 150) {
						local1413 = 49545215 - local1488 * 327680;
					}
				}
				local1488 = local1413 | 0xFF000000;
				if (Static47.anIntArray64[local176] == 0) {
					local1399 -= local263 >> 1;
					Static206.aClass27_20.method7002(-16777216, local1488, local1379, local217 + arg1, arg0 - -local1035);
					local344 -= local263 >> 1;
				}
				if (Static47.anIntArray64[local176] == 1) {
					local1406 += 5;
					local347 -= 5;
					Static206.aClass27_20.method6994(arg0 + local1035, local1379, Static609.anInt9845, local1488, arg1 + local217);
					local344 -= local263 >> 1;
					local1399 -= local263 >> 1;
				}
				if (Static47.anIntArray64[local176] == 2) {
					local1406 += 5;
					local344 -= (local263 >> 1) + 5;
					local347 -= 5;
					local1399 -= (local263 >> 1) - 5;
					Static206.aClass27_20.method7006(Static609.anInt9845, local217 + arg1, local1488, local1379, local1035 + arg0);
				}
				if (Static47.anIntArray64[local176] == 3) {
					Static206.aClass27_20.method7010(arg1 + local217, local1488, 150 - Static47.anIntArray66[local176], arg0 + local1035, Static609.anInt9845, local1379);
					local1406 += 7;
					local344 -= local263 >> 1;
					local1399 -= local263 >> 1;
					local347 -= 7;
				}
				@Pc(1804) int local1804;
				if (Static47.anIntArray64[local176] == 4) {
					local1804 = (150 - Static47.anIntArray66[local176]) * (Static469.aClass345_15.method8112(local1379) + 100) / 150;
					Static171.aClass16_5.T(arg1 + local217 - 50, arg0, local217 + arg1 + 50, arg0 - -arg2);
					local1399 += 50 - local1804;
					local344 += 50 - local1804;
					Static206.aClass27_20.method6993(local217 + arg1 + 50 - local1804, -16777216, local1035 + arg0, local1488, local1379);
					Static171.aClass16_5.KA(arg1, arg0, arg1 + arg3, arg0 + arg2);
				}
				if (Static47.anIntArray64[local176] == 5) {
					local1804 = 150 - Static47.anIntArray66[local176];
					@Pc(1878) int local1878 = 0;
					if (local1804 < 25) {
						local1878 = local1804 - 25;
					} else if (local1804 > 125) {
						local1878 = local1804 - 125;
					}
					@Pc(1905) int local1905 = Static469.aClass345_15.anInt10013 + Static469.aClass345_15.anInt10003;
					Static171.aClass16_5.T(arg1, local1035 + arg0 - local1905 - 1, arg3 + arg1, local1035 + arg0 + 5);
					local347 += local1878;
					local344 -= local263 >> 1;
					Static206.aClass27_20.method7002(-16777216, local1488, local1379, local217 + arg1, local1878 + arg0 + local1035);
					local1406 += local1878;
					local1399 -= local263 >> 1;
					Static171.aClass16_5.KA(arg1, arg0, arg1 + arg3, arg0 + arg2);
				}
			} else {
				Static206.aClass27_20.method7002(-16777216, -256, local1379, local217 + arg1, local1035 + arg0);
				local1399 -= local263 >> 1;
				local344 -= local263 >> 1;
			}
			Static460.method6945(local347, local1406 + 1, local344, local1399 + 1);
		}
	}
}
