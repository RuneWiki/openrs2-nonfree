import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIII)V")
	public static void method3060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static121.anInt2062;
		Static78.anInt1270 = 0;
		@Pc(16) int[] local16 = Static311.anIntArray474;
		@Pc(188) int local188;
		@Pc(225) int local225;
		@Pc(271) int local271;
		@Pc(351) int local351;
		@Pc(430) int local430;
		@Pc(892) int local892;
		@Pc(564) int local564;
		for (@Pc(18) int local18 = 0; local18 < Static458.anInt7721 + local12; local18++) {
			@Pc(22) Class82 local22 = null;
			@Pc(35) Class11_Sub5_Sub2 local35;
			if (local18 < local12) {
				local35 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local16[local18]];
			} else {
				local35 = ((Class2_Sub34) Static400.aClass220_41.method5099((long) Static164.anIntArray253[local18 - local12])).aClass11_Sub5_Sub2_Sub2_2;
				local22 = ((Class11_Sub5_Sub2_Sub2) local35).aClass82_1;
				if (local22.anIntArray149 != null) {
					local22 = local22.method1888(Static63.aClass120_2);
					if (local22 == null) {
						continue;
					}
				}
			}
			if (local35.anInt7699 >= 0 && (Static383.anInt6623 == local35.anInt7695 || local35.aByte101 == Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101)) {
				Static368.method6269(local35, arg1 >> 1, local35.method6224(), arg0 >> 1);
				if (Static242.anIntArray380[0] >= 0) {
					if (local35.aString74 != null && (local12 <= local18 || Static381.anInt6606 == 0 || Static381.anInt6606 == 3 || Static381.anInt6606 == 1 && Static267.method3707(((Class11_Sub5_Sub2_Sub1) local35).aString20)) && Static78.anInt1270 < Static427.anInt7254) {
						Static427.anIntArray588[Static78.anInt1270] = Static9.aClass15_9.method320(local35.aString74) / 2;
						Static427.anIntArray592[Static78.anInt1270] = Static242.anIntArray380[0];
						Static427.anIntArray589[Static78.anInt1270] = Static242.anIntArray380[1];
						Static427.anIntArray593[Static78.anInt1270] = local35.anInt7697;
						Static427.anIntArray591[Static78.anInt1270] = local35.anInt7671;
						Static427.anIntArray590[Static78.anInt1270] = local35.anInt7659;
						Static427.aStringArray66[Static78.anInt1270] = local35.aString74;
						Static78.anInt1270++;
					}
					local188 = Static242.anIntArray380[1] + arg3;
					@Pc(256) Class41[] local256;
					@Pc(263) Class190[] local263;
					@Pc(323) Class41 local323;
					if (local35.aBoolean513 || local35.anInt7690 <= Static277.anInt5022) {
						local188 -= Math.max(Static9.aClass15_9.anInt326, Static233.aClass41Array6[0].ZA());
					} else {
						@Pc(211) byte local211 = 1;
						if (local12 > local18) {
							@Pc(220) Class11_Sub5_Sub2_Sub1 local220 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local16[local18]];
							local225 = local35.method6218().anInt2648;
							if (local220.aBoolean144) {
								local211 = 2;
							}
						} else {
							local225 = local22.anInt1959;
							if (local225 == -1) {
								local225 = local35.method6218().anInt2648;
							}
						}
						@Pc(245) Class41[] local245 = Static233.aClass41Array6;
						if (local225 != -1) {
							local256 = (Class41[]) Static348.aClass188_47.method4158((long) local225);
							if (local256 == null) {
								local263 = Static470.method4237(Static446.aClass171_101, local225);
								if (local263 != null) {
									local256 = new Class41[local263.length];
									for (local271 = 0; local271 < local263.length; local271++) {
										local256[local271] = Static257.aClass75_8.method5986(local263[local271]);
									}
									Static348.aClass188_47.method4155((long) local225, local256);
								}
							}
							if (local256 != null && local256.length >= 2) {
								local245 = local256;
							}
						}
						if (local245.length <= local211) {
							local211 = 1;
						}
						@Pc(319) Class41 local319 = local245[0];
						local323 = local245[local211];
						local188 -= Math.max(Static9.aClass15_9.anInt326, local319.ZA());
						local271 = Static242.anIntArray380[0] + arg2 - (local319.YA() >> 1);
						local351 = local319.YA() * local35.anInt7685 / 255;
						if (local35.anInt7685 > 0 && local351 < 2) {
							local351 = 2;
						}
						local319.method6090(local271, local188);
						Static257.aClass75_8.HA(local271, local188, local351 + local271, local319.ZA() + local188);
						local323.method6090(local271, local188);
						Static257.aClass75_8.ba(arg2, arg3, arg2 + arg1, arg0 + arg3);
					}
					local188 -= 2;
					if (!local35.aBoolean513) {
						@Pc(413) Class41 local413;
						if (Static277.anInt5022 < local35.anInt7677) {
							local413 = Static255.aClass41Array9[local35.aBoolean515 ? 2 : 0];
							@Pc(422) Class41 local422 = Static255.aClass41Array9[local35.aBoolean515 ? 3 : 1];
							if (local35 instanceof Class11_Sub5_Sub2_Sub2) {
								local430 = local22.anInt1950;
								if (local430 == -1) {
									local430 = local35.method6218().anInt2628;
								}
							} else {
								local430 = local35.method6218().anInt2628;
							}
							if (local430 != -1) {
								local256 = (Class41[]) Static59.aClass188_48.method4158((long) local430);
								if (local256 == null) {
									local263 = Static470.method4237(Static446.aClass171_101, local430);
									if (local263 != null) {
										local256 = new Class41[local263.length];
										for (local271 = 0; local271 < local263.length; local271++) {
											local256[local271] = Static257.aClass75_8.method5986(local263[local271]);
										}
										Static59.aClass188_48.method4155((long) local430, local256);
									}
								}
								if (local256 != null && local256.length == 4) {
									local413 = local256[local35.aBoolean515 ? 2 : 0];
									local422 = local256[local35.aBoolean515 ? 3 : 1];
								}
							}
							@Pc(523) int local523 = local35.anInt7677 - Static277.anInt5022;
							if (local35.anInt7649 < local523) {
								local523 -= local35.anInt7649;
								local271 = local35.anInt7696 == 0 ? 0 : local35.anInt7696 * ((local35.anInt7630 - local523) / local35.anInt7696);
								local564 = local271 * local413.YA() / local35.anInt7630;
							} else {
								local564 = local413.YA();
							}
							local271 = local413.ZA();
							local188 -= local271;
							local351 = arg2 + Static242.anIntArray380[0] - (local413.YA() >> 1);
							local413.method6090(local351, local188);
							Static257.aClass75_8.HA(local351, local188, local564 + local351, local271 + local188);
							local422.method6090(local351, local188);
							Static257.aClass75_8.ba(arg2, arg3, arg2 + arg1, arg0 + arg3);
							local188 -= 2;
						}
						if (local18 < local12) {
							@Pc(629) Class11_Sub5_Sub2_Sub1 local629 = (Class11_Sub5_Sub2_Sub1) local35;
							if (local629.anInt2394 != -1) {
								local188 -= 25;
								Static230.aClass41Array5[local629.anInt2394].method6090(arg2 + Static242.anIntArray380[0] - 12, local188);
								local188 -= 2;
							}
							if (local629.anInt2390 != -1) {
								local188 -= 25;
								Static170.aClass41Array2[local629.anInt2390].method6090(Static242.anIntArray380[0] + arg2 - 12, local188);
								local188 -= 2;
							}
						} else if (local22.anInt1951 >= 0 && Static170.aClass41Array2.length > local22.anInt1951) {
							local188 -= 25;
							local413 = Static170.aClass41Array2[local22.anInt1951];
							local413.method6090(arg2 + Static242.anIntArray380[0] - (local413.YA() >> 1), local188);
							local188 -= 2;
						}
					}
					@Pc(717) Class166[] local717;
					@Pc(725) Class166 local725;
					if (!(local35 instanceof Class11_Sub5_Sub2_Sub1)) {
						local225 = 0;
						local717 = Static223.aClass166Array1;
						for (local430 = 0; local430 < local717.length; local430++) {
							local725 = local717[local430];
							if (local725 != null && local725.anInt4251 == 1 && Static164.anIntArray253[local18 - local12] == local725.anInt4246) {
								local323 = Static157.aClass41Array1[local725.anInt4242];
								if (local323.ZA() > local225) {
									local225 = local323.ZA();
								}
								if (Static277.anInt5022 % 20 < 10) {
									local323.method6090(arg2 + Static242.anIntArray380[0] - 12, -local323.ZA() + local188);
								}
							}
						}
						if (local225 > 0) {
						}
					} else if (local18 >= 0) {
						local225 = 0;
						local717 = Static223.aClass166Array1;
						for (local430 = 0; local430 < local717.length; local430++) {
							local725 = local717[local430];
							if (local725 != null && local725.anInt4251 == 10 && local16[local18] == local725.anInt4246) {
								local323 = Static157.aClass41Array1[local725.anInt4242];
								if (local323.ZA() > local225) {
									local225 = local323.ZA();
								}
								local323.method6090(arg2 + Static242.anIntArray380[0] - 12, -local323.ZA() + local188);
							}
						}
						if (local225 > 0) {
						}
					}
					for (local225 = 0; local225 < 4; local225++) {
						if (Static277.anInt5022 < local35.anIntArray631[local225]) {
							local892 = local35.method6224() / 2;
							Static368.method6269(local35, arg1 >> 1, local892, arg0 >> 1);
							if (Static242.anIntArray380[0] > -1) {
								local430 = Static202.aClass41Array4[local35.anIntArray628[local225]].YA();
								if (local225 == 1) {
									Static242.anIntArray380[1] -= 20;
								}
								if (local225 == 2) {
									Static242.anIntArray380[1] -= 10;
									Static242.anIntArray380[0] -= local430 - 9;
								}
								if (local225 == 3) {
									Static242.anIntArray380[0] += local430 - 9;
									Static242.anIntArray380[1] -= 10;
								}
								Static202.aClass41Array4[local35.anIntArray628[local225]].method6090(Static242.anIntArray380[0] + arg2 - (local430 >> 1), Static242.anIntArray380[1] + arg3 + -12);
								Static352.aClass14_3.method4883(Integer.toString(local35.anIntArray630[local225]), Static242.anIntArray380[0] + arg2 - 1, Static242.anIntArray380[1] + 3 + arg3, -1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(1040) int local1040;
		for (@Pc(1034) int local1034 = 0; local1034 < Static183.anInt3212; local1034++) {
			local1040 = Static268.anIntArray403[local1034];
			@Pc(1053) Class11_Sub5_Sub2 local1053;
			if (local1040 >= 2048) {
				local1053 = ((Class2_Sub34) Static400.aClass220_41.method5099((long) (local1040 - 2048))).aClass11_Sub5_Sub2_Sub2_2;
			} else {
				local1053 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local1040];
			}
			local225 = Static83.anIntArray99[local1034];
			@Pc(1070) Class11_Sub5_Sub2 local1070;
			if (local225 < 2048) {
				local1070 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local225];
			} else {
				local1070 = ((Class2_Sub34) Static400.aClass220_41.method5099((long) (local225 - 2048))).aClass11_Sub5_Sub2_Sub2_2;
			}
			Static370.method5161(arg0, local1070, arg3, local1053, arg2, --local1053.anInt7642, arg1);
		}
		local1040 = Static9.aClass15_9.anInt318 + Static9.aClass15_9.anInt326 + 2;
		for (local188 = 0; local188 < Static78.anInt1270; local188++) {
			local225 = Static427.anIntArray592[local188];
			local892 = Static427.anIntArray589[local188];
			local430 = Static427.anIntArray588[local188];
			@Pc(1131) boolean local1131 = true;
			while (local1131) {
				local1131 = false;
				for (local564 = 0; local564 < local188; local564++) {
					if (Static427.anIntArray589[local564] - local1040 < local892 + 2 && Static427.anIntArray589[local564] + 2 > local892 + -local1040 && Static427.anIntArray592[local564] + Static427.anIntArray588[local564] > -local430 + local225 && Static427.anIntArray592[local564] - Static427.anIntArray588[local564] < local430 + local225 && Static427.anIntArray589[local564] - local1040 < local892) {
						local892 = Static427.anIntArray589[local564] - local1040;
						local1131 = true;
					}
				}
			}
			Static427.anIntArray589[local188] = local892;
			@Pc(1220) String local1220 = Static427.aStringArray66[local188];
			if (Static222.anInt3728 == 0) {
				local271 = 16776960;
				if (Static427.anIntArray593[local188] < 6) {
					local271 = Static162.anIntArray252[Static427.anIntArray593[local188]];
				}
				if (Static427.anIntArray593[local188] == 6) {
					local271 = Static383.anInt6623 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static427.anIntArray593[local188] == 7) {
					local271 = Static383.anInt6623 % 20 >= 10 ? 65535 : 255;
				}
				if (Static427.anIntArray593[local188] == 8) {
					local271 = Static383.anInt6623 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static427.anIntArray593[local188] == 9) {
					local351 = 150 - Static427.anIntArray590[local188];
					if (local351 < 50) {
						local271 = local351 * 1280 + 16711680;
					} else if (local351 < 100) {
						local271 = 16384000 + 16776960 - local351 * 327680;
					} else if (local351 < 150) {
						local271 = local351 * 5 + 65280 - 500;
					}
				}
				if (Static427.anIntArray593[local188] == 10) {
					local351 = 150 - Static427.anIntArray590[local188];
					if (local351 < 50) {
						local271 = local351 * 5 + 16711680;
					} else if (local351 < 100) {
						local271 = 16711935 - (local351 - 50) * 327680;
					} else if (local351 < 150) {
						local271 = local351 * 327680 + 500 + 255 - local351 * 5 - 32768000;
					}
				}
				if (Static427.anIntArray593[local188] == 11) {
					local351 = 150 - Static427.anIntArray590[local188];
					if (local351 < 50) {
						local271 = 16777215 - local351 * 327685;
					} else if (local351 < 100) {
						local271 = local351 * 327685 - 16318970;
					} else if (local351 < 150) {
						local271 = 16777215 - (local351 - 100) * 327680;
					}
				}
				local351 = local271 | 0xFF000000;
				if (Static427.anIntArray591[local188] == 0) {
					Static143.aClass14_2.method4883(local1220, arg2 + local225, arg3 - -local892, local351, -16777216);
				}
				if (Static427.anIntArray591[local188] == 1) {
					Static143.aClass14_2.method4884(local892 + arg3, local351, Static383.anInt6623, arg2 + local225, local1220);
				}
				if (Static427.anIntArray591[local188] == 2) {
					Static143.aClass14_2.method4877(local892 + arg3, local1220, Static383.anInt6623, local351, arg2 + local225);
				}
				if (Static427.anIntArray591[local188] == 3) {
					Static143.aClass14_2.method4898(local1220, 150 - Static427.anIntArray590[local188], local351, local892 + arg3, local225 + arg2, Static383.anInt6623);
				}
				@Pc(1573) int local1573;
				if (Static427.anIntArray591[local188] == 4) {
					local1573 = (150 - Static427.anIntArray590[local188]) * (Static9.aClass15_9.method320(local1220) + 100) / 150;
					Static257.aClass75_8.HA(arg2 + local225 - 50, arg3, local225 + arg2 + 50, arg3 - -arg0);
					Static143.aClass14_2.method4886(local351, -16777216, local1220, arg2 + local225 + 50 - local1573, local892 + arg3);
					Static257.aClass75_8.ba(arg2, arg3, arg1 + arg2, arg3 - -arg0);
				}
				if (Static427.anIntArray591[local188] == 5) {
					local1573 = 150 - Static427.anIntArray590[local188];
					@Pc(1636) int local1636 = 0;
					if (local1573 < 25) {
						local1636 = local1573 - 25;
					} else if (local1573 > 125) {
						local1636 = local1573 - 125;
					}
					@Pc(1660) int local1660 = Static9.aClass15_9.anInt318 + Static9.aClass15_9.anInt326;
					Static257.aClass75_8.HA(arg2, arg3 + local892 - local1660 - 1, arg1 + arg2, local892 + arg3 + 5);
					Static143.aClass14_2.method4883(local1220, arg2 + local225, local1636 + arg3 - -local892, local351, -16777216);
					Static257.aClass75_8.ba(arg2, arg3, arg1 + arg2, arg3 + arg0);
				}
			} else {
				Static143.aClass14_2.method4883(local1220, arg2 + local225, local892 + arg3, -256, -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)I")
	public static int method3061(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
