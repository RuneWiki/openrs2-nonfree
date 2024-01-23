import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	public static int anInt5398;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!fh;")
	public static Class58 aClass58_100;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Z")
	public static boolean aBoolean367 = true;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
	public static int anInt5399 = -1;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	public static int anInt5401 = 0;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString332 = "green:";

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIB)V")
	public static void method4407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static192.anInt3635 = 0;
		@Pc(17) int local17;
		@Pc(351) int local351;
		@Pc(656) int local656;
		@Pc(260) int local260;
		@Pc(129) int local129;
		@Pc(214) int local214;
		@Pc(653) int local653;
		for (local17 = -1; local17 < Static236.anInt4452 + Static129.anInt2510; local17++) {
			@Pc(31) Class53_Sub1 local31;
			if (local17 == -1) {
				local31 = Static154.aClass53_Sub1_Sub1_2;
			} else if (local17 < Static129.anInt2510) {
				local31 = Static182.aClass53_Sub1_Sub1Array1[Static172.anIntArray317[local17]];
			} else {
				local31 = Static110.aClass53_Sub1_Sub2Array1[Static278.anIntArray595[local17 - Static129.anInt2510]];
			}
			if (local31 != null && local31.method3323()) {
				@Pc(70) Class171 local70;
				if (local31 instanceof Class53_Sub1_Sub2) {
					local70 = ((Class53_Sub1_Sub2) local31).aClass171_1;
					if (local70.anIntArray590 != null) {
						local70 = local70.method4302();
					}
					if (local70 == null) {
						continue;
					}
				}
				@Pc(172) int local172;
				if (local17 >= Static129.anInt2510) {
					local70 = ((Class53_Sub1_Sub2) local31).aClass171_1;
					if (local70.anIntArray590 != null) {
						local70 = local70.method4302();
					}
					if (local70.anInt5239 >= 0 && local70.anInt5239 < Static10.aClass4_Sub3_Sub14Array1.length) {
						if (local70.anInt5260 == -1) {
							local129 = local31.method3319() + 15;
						} else {
							local129 = local70.anInt5260 + 15;
						}
						Static207.method3338(arg2 >> 1, arg3, arg1, arg4 >> 1, local129, local31);
						if (Static299.anInt5585 > -1) {
							Static10.aClass4_Sub3_Sub14Array1[local70.anInt5239].method4543(arg0 + Static299.anInt5585 - 12, arg5 + -30 + Static168.anInt3290);
						}
					}
					@Pc(170) Class95[] local170 = Static305.aClass95Array1;
					for (local172 = 0; local172 < local170.length; local172++) {
						@Pc(180) Class95 local180 = local170[local172];
						if (local180 != null && local180.anInt2561 == 1 && local180.anInt2560 == Static278.anIntArray595[local17 - Static129.anInt2510] && Static50.anInt954 % 20 < 10) {
							if (local70.anInt5260 == -1) {
								local214 = local31.method3319() + 15;
							} else {
								local214 = local70.anInt5260 + 15;
							}
							Static207.method3338(arg2 >> 1, arg3, arg1, arg4 >> 1, local214, local31);
							if (Static299.anInt5585 > -1) {
								Static241.aClass4_Sub3_Sub14Array11[local180.anInt2559].method4543(arg0 + Static299.anInt5585 - 12, arg5 + Static168.anInt3290 + -28);
							}
						}
					}
				} else {
					local260 = 30;
					@Pc(263) Class53_Sub1_Sub1 local263 = (Class53_Sub1_Sub1) local31;
					if (local263.anInt1573 != -1 || local263.anInt1596 != -1) {
						Static207.method3338(arg2 >> 1, arg3, arg1, arg4 >> 1, local31.method3319() + 15, local31);
						if (Static299.anInt5585 > -1) {
							if (local263.anInt1573 != -1) {
								Static89.aClass4_Sub3_Sub14Array8[local263.anInt1573].method4543(arg0 + Static299.anInt5585 - 12, Static168.anInt3290 + arg5 + -30);
								local260 += 25;
							}
							if (local263.anInt1596 != -1) {
								Static10.aClass4_Sub3_Sub14Array1[local263.anInt1596].method4543(Static299.anInt5585 + arg0 - 12, -local260 + arg5 + Static168.anInt3290);
								local260 += 25;
							}
						}
					}
					if (local17 >= 0) {
						@Pc(349) Class95[] local349 = Static305.aClass95Array1;
						for (local351 = 0; local351 < local349.length; local351++) {
							@Pc(363) Class95 local363 = local349[local351];
							if (local363 != null && local363.anInt2561 == 10 && Static172.anIntArray317[local17] == local363.anInt2560) {
								Static207.method3338(arg2 >> 1, arg3, arg1, arg4 >> 1, local31.method3319() + 15, local31);
								if (Static299.anInt5585 > -1) {
									Static241.aClass4_Sub3_Sub14Array11[local363.anInt2559].method4543(Static299.anInt5585 + arg0 - 12, arg5 - -Static168.anInt3290 + -local260);
								}
							}
						}
					}
				}
				if (local31.aString234 != null && (local17 >= Static129.anInt2510 || Static289.anInt5414 == 0 || Static289.anInt5414 == 3 || Static289.anInt5414 == 1 && Static160.method2575(((Class53_Sub1_Sub1) local31).aString88))) {
					Static207.method3338(arg2 >> 1, arg3, arg1, arg4 >> 1, local31.method3319(), local31);
					if (Static299.anInt5585 > -1 && Static192.anInt3635 < Static194.anInt5200) {
						Static194.anIntArray566[Static192.anInt3635] = Static211.aClass4_Sub3_Sub5_3.method2259(local31.aString234) / 2;
						Static194.anIntArray563[Static192.anInt3635] = Static211.aClass4_Sub3_Sub5_3.anInt2820;
						Static194.anIntArray565[Static192.anInt3635] = Static299.anInt5585;
						Static194.anIntArray569[Static192.anInt3635] = Static168.anInt3290;
						Static194.anIntArray564[Static192.anInt3635] = local31.anInt3981;
						Static194.anIntArray562[Static192.anInt3635] = local31.anInt3998;
						Static194.anIntArray567[Static192.anInt3635] = local31.anInt4023;
						Static194.aStringArray34[Static192.anInt3635] = local31.aString234;
						Static192.anInt3635++;
					}
				}
				if (Static50.anInt954 < local31.anInt3993) {
					@Pc(525) Class4_Sub3_Sub14 local525 = Static63.aClass4_Sub3_Sub14Array7[0];
					@Pc(529) Class4_Sub3_Sub14 local529 = Static63.aClass4_Sub3_Sub14Array7[1];
					if (local31 instanceof Class53_Sub1_Sub2) {
						@Pc(541) Class53_Sub1_Sub2 local541 = (Class53_Sub1_Sub2) local31;
						@Pc(551) Class4_Sub3_Sub14[] local551 = (Class4_Sub3_Sub14[]) Static25.aClass26_5.method518((long) local541.aClass171_1.anInt5241);
						if (local551 == null) {
							local551 = Static200.method3238(Static7.aClass58_4, local541.aClass171_1.anInt5241);
							if (local551 != null) {
								Static25.aClass26_5.method510(local551, (long) local541.aClass171_1.anInt5241);
							}
						}
						if (local551 != null && local551.length == 2) {
							local529 = local551[1];
							local525 = local551[0];
						}
						@Pc(593) Class171 local593 = local541.aClass171_1;
						if (local593.anInt5260 == -1) {
							local172 = local31.method3319();
						} else {
							local172 = local593.anInt5260;
						}
					} else {
						local172 = local31.method3319();
					}
					Static207.method3338(arg2 >> 1, arg3, arg1, arg4 >> 1, local525.anInt5609 + local172 + 10, local31);
					if (Static299.anInt5585 > -1) {
						local351 = Static299.anInt5585 + arg0 - (local525.anInt5610 >> 1);
						local214 = Static168.anInt3290 + arg5 - 3;
						local525.method4543(local351, local214);
						local653 = local31.anInt4022 * local525.anInt5610 / 255;
						local656 = local525.anInt5609;
						if (Static94.aBoolean138) {
							Static104.method1693(local351, local214, local351 + local653, local656 + local214);
						} else {
							Static270.method4257(local351, local214, local653 + local351, local214 - -local656);
						}
						local529.method4543(local351, local214);
						if (Static94.aBoolean138) {
							Static104.method1694(arg0, arg5, arg4 + arg0, arg2 + arg5);
						} else {
							Static270.method4246(arg0, arg5, arg4 + arg0, arg2 + arg5);
						}
					}
				}
				for (local260 = 0; local260 < 4; local260++) {
					if (local31.anIntArray425[local260] > Static50.anInt954) {
						if (local31 instanceof Class53_Sub1_Sub2) {
							@Pc(729) Class53_Sub1_Sub2 local729 = (Class53_Sub1_Sub2) local31;
							@Pc(732) Class171 local732 = local729.aClass171_1;
							if (local732.anInt5260 == -1) {
								local129 = local31.method3319() / 2;
							} else {
								local129 = local732.anInt5260 / 2;
							}
						} else {
							local129 = local31.method3319() / 2;
						}
						Static207.method3338(arg2 >> 1, arg3, arg1, arg4 >> 1, local129, local31);
						if (Static299.anInt5585 > -1) {
							if (local260 == 1) {
								Static168.anInt3290 -= 20;
							}
							if (local260 == 2) {
								Static168.anInt3290 -= 10;
								Static299.anInt5585 -= 15;
							}
							if (local260 == 3) {
								Static299.anInt5585 += 15;
								Static168.anInt3290 -= 10;
							}
							Static52.aClass4_Sub3_Sub14Array10[local31.anIntArray424[local260]].method4543(Static299.anInt5585 + arg0 - 12, arg5 - (-Static168.anInt3290 + 12));
							Static32.aClass4_Sub3_Sub5_1.method2278(Integer.toString(local31.anIntArray423[local260]), arg0 + Static299.anInt5585 - 1, arg5 - -Static168.anInt3290 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (local17 = 0; local17 < Static192.anInt3635; local17++) {
			@Pc(861) int local861 = Static194.anIntArray565[local17];
			@Pc(865) int local865 = Static194.anIntArray569[local17];
			local260 = Static194.anIntArray566[local17];
			local129 = Static194.anIntArray563[local17];
			@Pc(875) boolean local875 = true;
			while (local875) {
				local875 = false;
				for (local351 = 0; local351 < local17; local351++) {
					if (Static194.anIntArray569[local351] - Static194.anIntArray563[local351] < local865 - -2 && local865 - local129 < Static194.anIntArray569[local351] + 2 && local861 - local260 < Static194.anIntArray566[local351] + Static194.anIntArray565[local351] && local861 + local260 > Static194.anIntArray565[local351] - Static194.anIntArray566[local351] && local865 > Static194.anIntArray569[local351] - Static194.anIntArray563[local351]) {
						local875 = true;
						local865 = Static194.anIntArray569[local351] - Static194.anIntArray563[local351];
					}
				}
			}
			Static299.anInt5585 = Static194.anIntArray565[local17];
			Static168.anInt3290 = Static194.anIntArray569[local17] = local865;
			@Pc(968) String local968 = Static194.aStringArray34[local17];
			if (Static72.anInt1599 == 0) {
				local214 = 16776960;
				if (Static194.anIntArray564[local17] < 6) {
					local214 = Static160.anIntArray301[Static194.anIntArray564[local17]];
				}
				if (Static194.anIntArray564[local17] == 6) {
					local214 = Static86.anInt1997 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static194.anIntArray564[local17] == 7) {
					local214 = Static86.anInt1997 % 20 < 10 ? 255 : 65535;
				}
				if (Static194.anIntArray564[local17] == 8) {
					local214 = Static86.anInt1997 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static194.anIntArray564[local17] == 9) {
					local653 = 150 - Static194.anIntArray567[local17];
					if (local653 < 50) {
						local214 = local653 * 1280 + 16711680;
					} else if (local653 < 100) {
						local214 = 16776960 - (local653 - 50) * 327680;
					} else if (local653 < 150) {
						local214 = local653 * 5 + 65280 - 500;
					}
				}
				if (Static194.anIntArray564[local17] == 10) {
					local653 = 150 - Static194.anIntArray567[local17];
					if (local653 < 50) {
						local214 = local653 * 5 + 16711680;
					} else if (local653 < 100) {
						local214 = 16711935 - (local653 - 50) * 327680;
					} else if (local653 < 150) {
						local214 = (local653 - 100) * 327680 + 500 + 255 - local653 * 5;
					}
				}
				if (Static194.anIntArray564[local17] == 11) {
					local653 = 150 - Static194.anIntArray567[local17];
					if (local653 < 50) {
						local214 = 16777215 - local653 * 327685;
					} else if (local653 < 100) {
						local214 = (local653 - 50) * 327685 + 65280;
					} else if (local653 < 150) {
						local214 = 32768000 + 16777215 - local653 * 327680;
					}
				}
				if (Static194.anIntArray562[local17] == 0) {
					Static211.aClass4_Sub3_Sub5_3.method2278(local968, arg0 + Static299.anInt5585, arg5 - -Static168.anInt3290, local214, 0);
				}
				if (Static194.anIntArray562[local17] == 1) {
					Static211.aClass4_Sub3_Sub5_3.method2269(local968, Static299.anInt5585 + arg0, arg5 - -Static168.anInt3290, local214, Static86.anInt1997);
				}
				if (Static194.anIntArray562[local17] == 2) {
					Static211.aClass4_Sub3_Sub5_3.method2263(local968, Static299.anInt5585 + arg0, Static168.anInt3290 + arg5, local214, Static86.anInt1997);
				}
				if (Static194.anIntArray562[local17] == 3) {
					Static211.aClass4_Sub3_Sub5_3.method2273(local968, arg0 + Static299.anInt5585, Static168.anInt3290 + arg5, local214, Static86.anInt1997, 150 - Static194.anIntArray567[local17]);
				}
				if (Static194.anIntArray562[local17] == 4) {
					local653 = (150 - Static194.anIntArray567[local17]) * (Static211.aClass4_Sub3_Sub5_3.method2259(local968) - -100) / 150;
					if (Static94.aBoolean138) {
						Static104.method1693(Static299.anInt5585 + arg0 - 50, arg5, arg0 + Static299.anInt5585 + 50, arg5 - -arg2);
					} else {
						Static270.method4257(arg0 + Static299.anInt5585 - 50, arg5, Static299.anInt5585 + arg0 + 50, arg2 + arg5);
					}
					Static211.aClass4_Sub3_Sub5_3.method2266(local968, Static299.anInt5585 + arg0 + 50 - local653, arg5 - -Static168.anInt3290, local214, 0);
					if (Static94.aBoolean138) {
						Static104.method1694(arg0, arg5, arg4 + arg0, arg5 - -arg2);
					} else {
						Static270.method4246(arg0, arg5, arg0 + arg4, arg5 - -arg2);
					}
				}
				if (Static194.anIntArray562[local17] == 5) {
					local656 = 0;
					local653 = 150 - Static194.anIntArray567[local17];
					if (Static94.aBoolean138) {
						Static104.method1693(arg0, Static168.anInt3290 + arg5 - Static211.aClass4_Sub3_Sub5_3.anInt2820 - 1, arg0 - -arg4, Static168.anInt3290 + arg5 + 5);
					} else {
						Static270.method4257(arg0, Static168.anInt3290 + arg5 - Static211.aClass4_Sub3_Sub5_3.anInt2820 - 1, arg4 + arg0, arg5 + Static168.anInt3290 + 5);
					}
					if (local653 < 25) {
						local656 = local653 - 25;
					} else if (local653 > 125) {
						local656 = local653 - 125;
					}
					Static211.aClass4_Sub3_Sub5_3.method2278(local968, Static299.anInt5585 + arg0, local656 + Static168.anInt3290 + arg5, local214, 0);
					if (Static94.aBoolean138) {
						Static104.method1694(arg0, arg5, arg0 + arg4, arg5 - -arg2);
					} else {
						Static270.method4246(arg0, arg5, arg0 + arg4, arg5 + arg2);
					}
				}
			} else {
				Static211.aClass4_Sub3_Sub5_3.method2278(local968, Static299.anInt5585 + arg0, Static168.anInt3290 + arg5, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public static void method4408() {
		Static50.aClass78_1.method3301();
		@Pc(10) int local10;
		for (local10 = 0; local10 < 32; local10++) {
			Static280.aLongArray8[local10] = 0L;
		}
		for (local10 = 0; local10 < 32; local10++) {
			Static239.aLongArray40[local10] = 0L;
		}
		Static172.anInt3326 = 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public static void method4409(@OriginalArg(0) int arg0) {
		Static168.aFloatArray38[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static168.aFloatArray38[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static168.aFloatArray38[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static253.method4018(3);
		Static253.method4018(4);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
	public static void method4411(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static218.anInt4231 = arg0;
		Static131.anInt2553 = arg1;
		Static156.anInt3086 = 0;
		Static48.anInt902 = 0;
	}
}
