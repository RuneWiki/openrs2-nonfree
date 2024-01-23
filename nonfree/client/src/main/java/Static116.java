import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
	public static int anInt5523 = 0;

	@OriginalMember(owner = "client!ij", name = "U", descriptor = "[I")
	public static int[] anIntArray438 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)Lclient!ph;")
	public static Class4_Sub2_Sub17 method4401(@OriginalArg(0) int arg0) {
		@Pc(18) Class4_Sub2_Sub17 local18 = (Class4_Sub2_Sub17) Static94.aClass111_5.method2890((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(34) byte[] local34;
		if (arg0 >= 32768) {
			local34 = Static147.aClass22_49.method665(0, arg0 & 0x7FFF);
		} else {
			local34 = Static218.aClass22_74.method665(0, arg0);
		}
		local18 = new Class4_Sub2_Sub17();
		if (local34 != null) {
			local18.method3312(new Class4_Sub24(local34));
		}
		if (arg0 >= 32768) {
			local18.method3321();
		}
		Static94.aClass111_5.method2886((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIII)V")
	public static void method4402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static53.anInt1201 = 0;
		@Pc(17) int local17;
		@Pc(647) int local647;
		@Pc(254) int local254;
		@Pc(117) int local117;
		@Pc(158) int local158;
		@Pc(208) int local208;
		@Pc(644) int local644;
		for (local17 = -1; local17 < Static85.anInt1730 + Static99.anInt1950; local17++) {
			@Pc(33) Class13_Sub5 local33;
			if (local17 == -1) {
				local33 = Static72.aClass13_Sub5_Sub1_1;
			} else if (Static85.anInt1730 <= local17) {
				local33 = Static260.aClass13_Sub5_Sub2Array114[Static123.anIntArray214[local17 - Static85.anInt1730]];
			} else {
				local33 = Static100.aClass13_Sub5_Sub1Array1[Static291.anIntArray457[local17]];
			}
			if (local33 != null && local33.method4213()) {
				@Pc(68) Class185 local68;
				if (local33 instanceof Class13_Sub5_Sub2) {
					local68 = ((Class13_Sub5_Sub2) local33).aClass185_1;
					if (local68.anIntArray466 != null) {
						local68 = local68.method4658();
					}
					if (local68 == null) {
						continue;
					}
				}
				@Pc(339) int local339;
				if (Static85.anInt1730 <= local17) {
					local68 = ((Class13_Sub5_Sub2) local33).aClass185_1;
					if (local68.anIntArray466 != null) {
						local68 = local68.method4658();
					}
					if (local68.anInt5773 >= 0 && Static55.aClass4_Sub2_Sub4Array1.length > local68.anInt5773) {
						if (local68.anInt5774 == -1) {
							local117 = local33.method4220() + 15;
						} else {
							local117 = local68.anInt5774 + 15;
						}
						Static138.method2223(local33, arg5 >> 1, arg2, arg3 >> 1, local117, arg1);
						if (Static288.anInt5635 > -1) {
							Static55.aClass4_Sub2_Sub4Array1[local68.anInt5773].method4142(arg4 + Static288.anInt5635 - 12, Static297.anInt5194 + arg0 + -30);
						}
					}
					@Pc(156) Class171[] local156 = Static56.aClass171Array1;
					for (local158 = 0; local158 < local156.length; local158++) {
						@Pc(170) Class171 local170 = local156[local158];
						if (local170 != null && local170.anInt5452 == 1 && local170.anInt5453 == Static123.anIntArray214[local17 - Static85.anInt1730] && Static50.anInt1118 % 20 < 10) {
							if (local68.anInt5774 == -1) {
								local208 = local33.method4220() + 15;
							} else {
								local208 = local68.anInt5774 + 15;
							}
							Static138.method2223(local33, arg5 >> 1, arg2, arg3 >> 1, local208, arg1);
							if (Static288.anInt5635 > -1) {
								Static161.aClass4_Sub2_Sub4Array9[local170.anInt5450].method4142(Static288.anInt5635 + arg4 - 12, arg0 + Static297.anInt5194 + -28);
							}
						}
					}
				} else {
					local254 = 30;
					@Pc(257) Class13_Sub5_Sub1 local257 = (Class13_Sub5_Sub1) local33;
					if (local257.anInt4458 != -1 || local257.anInt4476 != -1) {
						Static138.method2223(local33, arg5 >> 1, arg2, arg3 >> 1, local33.method4220() + 15, arg1);
						if (Static288.anInt5635 > -1) {
							if (local257.anInt4458 != -1) {
								Static276.aClass4_Sub2_Sub4Array10[local257.anInt4458].method4142(arg4 + Static288.anInt5635 - 12, arg0 - -Static297.anInt5194 + -30);
								local254 += 25;
							}
							if (local257.anInt4476 != -1) {
								Static55.aClass4_Sub2_Sub4Array1[local257.anInt4476].method4142(arg4 + Static288.anInt5635 - 12, Static297.anInt5194 + arg0 - local254);
								local254 += 25;
							}
						}
					}
					if (local17 >= 0) {
						@Pc(337) Class171[] local337 = Static56.aClass171Array1;
						for (local339 = 0; local339 < local337.length; local339++) {
							@Pc(347) Class171 local347 = local337[local339];
							if (local347 != null && local347.anInt5452 == 10 && Static291.anIntArray457[local17] == local347.anInt5453) {
								Static138.method2223(local33, arg5 >> 1, arg2, arg3 >> 1, local33.method4220() + 15, arg1);
								if (Static288.anInt5635 > -1) {
									Static161.aClass4_Sub2_Sub4Array9[local347.anInt5450].method4142(arg4 + Static288.anInt5635 - 12, -local254 + arg0 + Static297.anInt5194);
								}
							}
						}
					}
				}
				if (local33.aString178 != null && (local17 >= Static85.anInt1730 || Static96.anInt1875 == 0 || Static96.anInt1875 == 3 || Static96.anInt1875 == 1 && Static293.method4562(((Class13_Sub5_Sub1) local33).aString148))) {
					Static138.method2223(local33, arg5 >> 1, arg2, arg3 >> 1, local33.method4220(), arg1);
					if (Static288.anInt5635 > -1 && Static53.anInt1201 < Static22.anInt474) {
						Static22.anIntArray61[Static53.anInt1201] = Static86.aClass4_Sub2_Sub9_3.method4086(local33.aString178) / 2;
						Static22.anIntArray59[Static53.anInt1201] = Static86.aClass4_Sub2_Sub9_3.anInt5130;
						Static22.anIntArray62[Static53.anInt1201] = Static288.anInt5635;
						Static22.anIntArray58[Static53.anInt1201] = Static297.anInt5194;
						Static22.anIntArray64[Static53.anInt1201] = local33.anInt5303;
						Static22.anIntArray63[Static53.anInt1201] = local33.anInt5248;
						Static22.anIntArray60[Static53.anInt1201] = local33.anInt5253;
						Static22.aStringArray2[Static53.anInt1201] = local33.aString178;
						Static53.anInt1201++;
					}
				}
				if (Static50.anInt1118 < local33.anInt5292) {
					@Pc(510) Class4_Sub2_Sub4 local510 = Static110.aClass4_Sub2_Sub4Array6[0];
					@Pc(514) Class4_Sub2_Sub4 local514 = Static110.aClass4_Sub2_Sub4Array6[1];
					if (local33 instanceof Class13_Sub5_Sub2) {
						@Pc(526) Class13_Sub5_Sub2 local526 = (Class13_Sub5_Sub2) local33;
						@Pc(536) Class4_Sub2_Sub4[] local536 = (Class4_Sub2_Sub4[]) Static7.aClass172_1.method4347((long) local526.aClass185_1.anInt5763);
						if (local536 == null) {
							local536 = Static266.method4195(Static60.aClass22_26, local526.aClass185_1.anInt5763);
							if (local536 != null) {
								Static7.aClass172_1.method4345(local536, (long) local526.aClass185_1.anInt5763);
							}
						}
						@Pc(561) Class185 local561 = local526.aClass185_1;
						if (local536 != null && local536.length == 2) {
							local514 = local536[1];
							local510 = local536[0];
						}
						if (local561.anInt5774 == -1) {
							local158 = local33.method4220();
						} else {
							local158 = local561.anInt5774;
						}
					} else {
						local158 = local33.method4220();
					}
					Static138.method2223(local33, arg5 >> 1, arg2, arg3 >> 1, local158 + local510.anInt5191 + 10, arg1);
					if (Static288.anInt5635 > -1) {
						local339 = arg4 + Static288.anInt5635 - (local510.anInt5193 >> 1);
						local208 = arg0 + Static297.anInt5194 - 3;
						local510.method4142(local339, local208);
						local644 = local510.anInt5193 * local33.anInt5289 / 255;
						local647 = local510.anInt5191;
						if (Static251.aBoolean330) {
							Static87.method1458(local339, local208, local644 + local339, local647 + local208);
						} else {
							Static258.method4023(local339, local208, local644 + local339, local647 + local208);
						}
						local514.method4142(local339, local208);
						if (Static251.aBoolean330) {
							Static87.method1457(arg4, arg0, arg4 + arg5, arg3 + arg0);
						} else {
							Static258.method4029(arg4, arg0, arg5 + arg4, arg0 - -arg3);
						}
					}
				}
				for (local254 = 0; local254 < 4; local254++) {
					if (Static50.anInt1118 < local33.anIntArray415[local254]) {
						if (local33 instanceof Class13_Sub5_Sub2) {
							@Pc(714) Class13_Sub5_Sub2 local714 = (Class13_Sub5_Sub2) local33;
							@Pc(717) Class185 local717 = local714.aClass185_1;
							if (local717.anInt5774 == -1) {
								local117 = local33.method4220() / 2;
							} else {
								local117 = local717.anInt5774 / 2;
							}
						} else {
							local117 = local33.method4220() / 2;
						}
						Static138.method2223(local33, arg5 >> 1, arg2, arg3 >> 1, local117, arg1);
						if (Static288.anInt5635 > -1) {
							if (local254 == 1) {
								Static297.anInt5194 -= 20;
							}
							if (local254 == 2) {
								Static288.anInt5635 -= 15;
								Static297.anInt5194 -= 10;
							}
							if (local254 == 3) {
								Static297.anInt5194 -= 10;
								Static288.anInt5635 += 15;
							}
							Static89.aClass4_Sub2_Sub4Array4[local33.anIntArray412[local254]].method4142(arg4 + Static288.anInt5635 - 12, arg0 + Static297.anInt5194 + -12);
							Static131.aClass4_Sub2_Sub9_2.method4101(Integer.toString(local33.anIntArray413[local254]), Static288.anInt5635 + arg4 - 1, Static297.anInt5194 + (arg0 - -3), 16777215, 0);
						}
					}
				}
			}
		}
		for (local17 = 0; local17 < Static53.anInt1201; local17++) {
			local254 = Static22.anIntArray58[local17];
			@Pc(846) int local846 = Static22.anIntArray62[local17];
			local117 = Static22.anIntArray61[local17];
			@Pc(852) boolean local852 = true;
			local158 = Static22.anIntArray59[local17];
			while (local852) {
				local852 = false;
				for (local208 = 0; local208 < local17; local208++) {
					if (Static22.anIntArray58[local208] - Static22.anIntArray59[local208] < local254 + 2 && local254 - local158 < Static22.anIntArray58[local208] + 2 && Static22.anIntArray61[local208] + Static22.anIntArray62[local208] > local846 - local117 && local846 + local117 > Static22.anIntArray62[local208] - Static22.anIntArray61[local208] && local254 > Static22.anIntArray58[local208] - Static22.anIntArray59[local208]) {
						local254 = Static22.anIntArray58[local208] - Static22.anIntArray59[local208];
						local852 = true;
					}
				}
			}
			Static288.anInt5635 = Static22.anIntArray62[local17];
			Static297.anInt5194 = Static22.anIntArray58[local17] = local254;
			@Pc(955) String local955 = Static22.aStringArray2[local17];
			if (Static278.anInt5381 == 0) {
				local644 = 16776960;
				if (Static22.anIntArray64[local17] < 6) {
					local644 = Static169.anIntArray281[Static22.anIntArray64[local17]];
				}
				if (Static22.anIntArray64[local17] == 6) {
					local644 = Static180.anInt3623 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static22.anIntArray64[local17] == 7) {
					local644 = Static180.anInt3623 % 20 < 10 ? 255 : 65535;
				}
				if (Static22.anIntArray64[local17] == 8) {
					local644 = Static180.anInt3623 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static22.anIntArray64[local17] == 9) {
					local647 = 150 - Static22.anIntArray60[local17];
					if (local647 < 50) {
						local644 = local647 * 1280 + 16711680;
					} else if (local647 < 100) {
						local644 = 16776960 - (local647 - 50) * 327680;
					} else if (local647 < 150) {
						local644 = (local647 - 100) * 5 + 65280;
					}
				}
				if (Static22.anIntArray64[local17] == 10) {
					local647 = 150 - Static22.anIntArray60[local17];
					if (local647 < 50) {
						local644 = local647 * 5 + 16711680;
					} else if (local647 < 100) {
						local644 = 16711935 + 16384000 - local647 * 327680;
					} else if (local647 < 150) {
						local644 = (local647 - 100) * 327680 + 255 - (local647 - 100) * 5;
					}
				}
				if (Static22.anIntArray64[local17] == 11) {
					local647 = 150 - Static22.anIntArray60[local17];
					if (local647 < 50) {
						local644 = 16777215 - local647 * 327685;
					} else if (local647 < 100) {
						local644 = local647 * 327685 - 16318970;
					} else if (local647 < 150) {
						local644 = 49545215 - local647 * 327680;
					}
				}
				if (Static22.anIntArray63[local17] == 0) {
					Static86.aClass4_Sub2_Sub9_3.method4101(local955, Static288.anInt5635 + arg4, arg0 + Static297.anInt5194, local644, 0);
				}
				if (Static22.anIntArray63[local17] == 1) {
					Static86.aClass4_Sub2_Sub9_3.method4110(local955, arg4 + Static288.anInt5635, arg0 - -Static297.anInt5194, local644, Static180.anInt3623);
				}
				if (Static22.anIntArray63[local17] == 2) {
					Static86.aClass4_Sub2_Sub9_3.method4109(local955, Static288.anInt5635 + arg4, arg0 + Static297.anInt5194, local644, Static180.anInt3623);
				}
				if (Static22.anIntArray63[local17] == 3) {
					Static86.aClass4_Sub2_Sub9_3.method4087(local955, Static288.anInt5635 + arg4, arg0 - -Static297.anInt5194, local644, Static180.anInt3623, 150 - Static22.anIntArray60[local17]);
				}
				if (Static22.anIntArray63[local17] == 4) {
					local647 = (150 - Static22.anIntArray60[local17]) * (Static86.aClass4_Sub2_Sub9_3.method4086(local955) + 100) / 150;
					if (Static251.aBoolean330) {
						Static87.method1458(arg4 + Static288.anInt5635 - 50, arg0, arg4 + Static288.anInt5635 + 50, arg3 + arg0);
					} else {
						Static258.method4023(arg4 + Static288.anInt5635 - 50, arg0, arg4 + Static288.anInt5635 + 50, arg0 - -arg3);
					}
					Static86.aClass4_Sub2_Sub9_3.method4105(local955, Static288.anInt5635 + arg4 + 50 - local647, Static297.anInt5194 + arg0, local644, 0);
					if (Static251.aBoolean330) {
						Static87.method1457(arg4, arg0, arg4 + arg5, arg3 + arg0);
					} else {
						Static258.method4029(arg4, arg0, arg5 + arg4, arg3 + arg0);
					}
				}
				if (Static22.anIntArray63[local17] == 5) {
					local647 = 150 - Static22.anIntArray60[local17];
					if (Static251.aBoolean330) {
						Static87.method1458(arg4, arg0 + Static297.anInt5194 - Static86.aClass4_Sub2_Sub9_3.anInt5130 - 1, arg4 + arg5, Static297.anInt5194 + arg0 + 5);
					} else {
						Static258.method4023(arg4, arg0 + Static297.anInt5194 - Static86.aClass4_Sub2_Sub9_3.anInt5130 - 1, arg4 - -arg5, Static297.anInt5194 + arg0 + 5);
					}
					@Pc(1417) int local1417 = 0;
					if (local647 < 25) {
						local1417 = local647 - 25;
					} else if (local647 > 125) {
						local1417 = local647 - 125;
					}
					Static86.aClass4_Sub2_Sub9_3.method4101(local955, arg4 + Static288.anInt5635, local1417 + arg0 - -Static297.anInt5194, local644, 0);
					if (Static251.aBoolean330) {
						Static87.method1457(arg4, arg0, arg4 + arg5, arg3 + arg0);
					} else {
						Static258.method4029(arg4, arg0, arg5 + arg4, arg3 + arg0);
					}
				}
			} else {
				Static86.aClass4_Sub2_Sub9_3.method4101(local955, Static288.anInt5635 + arg4, arg0 - -Static297.anInt5194, 16776960, 0);
			}
		}
	}
}
