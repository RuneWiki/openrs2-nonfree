import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(Z)V", line = 16)
	public static void method4921() {
		for (@Pc(23) Class12_Sub5 local23 = (Class12_Sub5) Static122.aClass36_4.method1417(); local23 != null; local23 = (Class12_Sub5) Static122.aClass36_4.method1422()) {
			local23.method4351();
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V", line = 41)
	public static void method4922() {
		Class171.aClass98_39.method2616();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!jg;ILclient!wm;Lclient!np;BI)Z", line = 160)
	public static boolean method4924(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) Class164 arg2) {
		@Pc(24) int local24 = Integer.MAX_VALUE;
		@Pc(26) int local26 = Integer.MIN_VALUE;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		if (arg2.anIntArray290 != null) {
			local24 = (Static321.anInt6039 - Static321.anInt6038) * (arg0.anInt2946 + arg2.anInt4427 - Static321.anInt6046) / (Static321.anInt6042 - Static321.anInt6046) + Static321.anInt6038;
			local30 = Static321.anInt6049 - (arg0.anInt2949 + arg2.anInt4425 - Static321.anInt6047) * (-Static321.anInt6041 + Static321.anInt6049) / (Static321.anInt6048 - Static321.anInt6047);
			local26 = Static321.anInt6038 + (arg2.anInt4412 + arg0.anInt2946 - Static321.anInt6046) * (-Static321.anInt6038 + Static321.anInt6039) / (Static321.anInt6042 - Static321.anInt6046);
			local28 = Static321.anInt6049 - (Static321.anInt6049 - Static321.anInt6041) * (-Static321.anInt6047 + arg0.anInt2949 + arg2.anInt4421) / (Static321.anInt6048 - Static321.anInt6047);
		}
		@Pc(123) Class13 local123 = null;
		@Pc(125) int local125 = 0;
		@Pc(127) int local127 = 0;
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		if (arg2.anInt4413 != -1) {
			if (arg0.aBoolean207 && arg2.anInt4431 != -1) {
				local123 = arg2.method4190(arg1, true);
			} else {
				local123 = arg2.method4190(arg1, false);
			}
			if (local123 != null) {
				local125 = arg0.anInt2945 - (local123.method6400() + 1 >> 1);
				local127 = arg0.anInt2945 + (local123.method6400() + 1 >> 1);
				if (local125 < local24) {
					local24 = local125;
				}
				local129 = arg0.anInt2941 - (local123.method6385() + 1 >> 1);
				if (local127 > local26) {
					local26 = local127;
				}
				if (local28 > local129) {
					local28 = local129;
				}
				local131 = arg0.anInt2941 + (local123.method6385() + 1 >> 1);
				if (local131 > local30) {
					local30 = local131;
				}
			}
		}
		@Pc(232) Class113 local232 = null;
		@Pc(234) int local234 = 0;
		@Pc(236) int local236 = 0;
		@Pc(238) int local238 = 0;
		@Pc(240) int local240 = 0;
		@Pc(242) int local242 = 0;
		@Pc(244) int local244 = 0;
		@Pc(246) int local246 = 0;
		@Pc(296) int local296;
		@Pc(323) int local323;
		if (arg2.aString48 != null) {
			local232 = Static198.method3730(arg2.anInt4411);
			if (local232 != null) {
				local234 = Static49.aClass239_1.method6120(Class192.aStringArray52, arg2.aString48, null, null);
				local236 = arg0.anInt2941;
				if (local123 == null) {
					local236 -= local234 * local232.method2948() / 2;
				} else {
					local236 -= (local123.method6385() >> 1) + (local234 * local232.method2949());
				}
				for (local296 = 0; local296 < local234; local296++) {
					@Pc(302) String local302 = Class192.aStringArray52[local296];
					if (local296 < local234 - 1) {
						local302 = local302.substring(0, local302.length() - 4);
					}
					local323 = local232.method2951(local302);
					if (local238 < local323) {
						local238 = local323;
					}
				}
				local240 = arg0.anInt2945 - local238 / 2;
				local242 = local238 / 2 + arg0.anInt2945;
				if (local24 > local240) {
					local24 = local240;
				}
				if (local26 < local242) {
					local26 = local242;
				}
				local244 = local236;
				if (local244 < local28) {
					local28 = local244;
				}
				local246 = local236 + local232.method2949() * local234;
				if (local30 < local246) {
					local30 = local246;
				}
			}
		}
		if (Static321.anInt6038 > local26 || Static321.anInt6039 < local24 || local30 < Static321.anInt6041 || local28 > Static321.anInt6049) {
			return true;
		}
		@Pc(439) int local439;
		if (arg2.anIntArray290 != null) {
			@Pc(437) int[] local437 = new int[arg2.anIntArray290.length];
			for (local439 = 0; local439 < local437.length / 2; local439++) {
				local323 = arg2.anIntArray290[local439 * 2] + arg0.anInt2946;
				@Pc(464) int local464 = arg2.anIntArray290[local439 * 2 + 1] + arg0.anInt2949;
				local437[local439 * 2] = (local323 - Static321.anInt6046) * (Static321.anInt6039 + -Static321.anInt6038) / (Static321.anInt6042 - Static321.anInt6046) + Static321.anInt6038;
				local437[local439 * 2 + 1] = Static321.anInt6049 - (local464 - Static321.anInt6047) * (Static321.anInt6049 + -Static321.anInt6041) / (Static321.anInt6048 - Static321.anInt6047);
			}
			Static270.method5047(arg1, local437, arg2.anInt4407);
			for (local323 = 0; local323 < local437.length / 2 - 1; local323++) {
				arg1.method2846(local437[local323 * 2 + 1], local437[local323 * 2 + 2], local437[local323 * 2], arg2.anInt4415, local437[local323 * 2 + 3]);
			}
			arg1.method2846(local437[local437.length - 1], local437[0], local437[local437.length - 2], arg2.anInt4415, local437[1]);
		}
		if (local123 != null) {
			if (Static226.anInt4488 > 0 && (Class11_Sub4_Sub1.anInt3974 != -1 && Class11_Sub4_Sub1.anInt3974 == arg0.anInt2944 || Class161.anInt4294 != -1 && Class161.anInt4294 == arg2.anInt4417)) {
				if (Static84.anInt6624 <= 50) {
					local296 = Static84.anInt6624 * 2;
				} else {
					local296 = (100 - Static84.anInt6624) * 2;
				}
				local439 = local296 << 24 | 0xFFFF00;
				arg1.method2863(arg0.anInt2945, local123.method6390() / 2 + 7, local439, arg0.anInt2941);
				arg1.method2863(arg0.anInt2945, local123.method6390() / 2 + 5, local439, arg0.anInt2941);
				arg1.method2863(arg0.anInt2945, local123.method6390() / 2 + 3, local439, arg0.anInt2941);
				arg1.method2863(arg0.anInt2945, local123.method6390() / 2 + 1, local439, arg0.anInt2941);
				arg1.method2863(arg0.anInt2945, local123.method6390() / 2, local439, arg0.anInt2941);
			}
			local123.method6386(arg0.anInt2945 - (local123.method6400() >> 1), arg0.anInt2941 + -(local123.method6385() >> 1));
		}
		if (arg2.aString48 != null && local232 != null) {
			Static198.method3728(local238, local234, local236, local232, arg1, arg0, arg2);
		}
		if (arg2.anInt4413 != -1 || arg2.aString48 != null) {
			@Pc(760) Class2_Sub15 local760 = new Class2_Sub15(arg0);
			local760.anInt2340 = local246;
			local760.anInt2331 = local244;
			local760.anInt2332 = local240;
			local760.anInt2333 = local131;
			local760.anInt2335 = local125;
			local760.anInt2337 = local127;
			local760.anInt2339 = local242;
			local760.anInt2338 = local129;
			Static184.aClass135_24.method3541(local760);
		}
		return false;
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(IZI)V", line = 450)
	public static void method4926(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub41 local10 = Static349.method6276(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray489.length; local15++) {
				local10.anIntArray489[local15] = -1;
				local10.anIntArray488[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIBIILclient!dg;IIII)Z", line = 505)
	public static boolean method4928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class46 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg10;
		@Pc(9) int local9 = arg9;
		@Pc(17) int local17 = arg10 - 64;
		@Pc(22) int local22 = arg9 - 64;
		Class2_Sub3_Sub30.anIntArrayArray49[64][64] = 99;
		Class11_Sub1_Sub1.anIntArrayArray4[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Class37_Sub1.anIntArray90[0] = arg10;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Class14.anIntArray257[0] = arg9;
		@Pc(50) int[][] local50 = arg6.anIntArrayArray14;
		while (true) {
			label282: while (true) {
				@Pc(79) int local79;
				@Pc(74) int local74;
				@Pc(84) int local84;
				@Pc(90) int local90;
				@Pc(237) int local237;
				@Pc(274) int local274;
				do {
					do {
						do {
							label259: do {
								if (local45 == local42) {
									Static172.anInt3431 = local7;
									Static170.anInt3418 = local9;
									return false;
								}
								local7 = Class37_Sub1.anIntArray90[local42];
								local9 = Class14.anIntArray257[local42];
								local42 = local42 + 1 & 0xFFF;
								local74 = local9 - local22;
								local79 = local7 - local17;
								local84 = local7 - arg6.anInt1466;
								local90 = local9 - arg6.anInt1482;
								if (arg0 == -4) {
									if (local7 == arg5 && local9 == arg4) {
										Static172.anInt3431 = local7;
										Static170.anInt3418 = local9;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static23.method856(arg7, local9, arg4, local7, arg5, arg1, arg8, arg1)) {
										Static172.anInt3431 = local7;
										Static170.anInt3418 = local9;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg6.method1639(arg7, local7, arg4, arg1, arg2, arg5, local9, arg1, arg8)) {
										Static172.anInt3431 = local7;
										Static170.anInt3418 = local9;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg6.method1642(arg2, arg5, arg7, local7, arg4, arg8, local9, arg1)) {
										Static170.anInt3418 = local9;
										Static172.anInt3431 = local7;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg6.method1631(arg1, arg5, arg0, arg4, arg3, local9, local7)) {
										Static172.anInt3431 = local7;
										Static170.anInt3418 = local9;
										return true;
									}
								} else if (arg6.method1632(arg3, arg1, local9, local7, arg0, arg4, arg5)) {
									Static172.anInt3431 = local7;
									Static170.anInt3418 = local9;
									return true;
								}
								local237 = Class11_Sub1_Sub1.anIntArrayArray4[local79][local74] + 1;
								if (local79 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local79 - 1][local74] == 0 && (local50[local84 - 1][local90] & 0x43A40000) == 0 && (local50[local84 - 1][local90 + arg1 - 1] & 0x4E240000) == 0) {
									local274 = 1;
									while (true) {
										if (arg1 - 1 <= local274) {
											Class37_Sub1.anIntArray90[local45] = local7 - 1;
											Class14.anIntArray257[local45] = local9;
											local45 = local45 + 1 & 0xFFF;
											Class2_Sub3_Sub30.anIntArrayArray49[local79 - 1][local74] = 2;
											Class11_Sub1_Sub1.anIntArrayArray4[local79 - 1][local74] = local237;
											break;
										}
										if ((local50[local84 - 1][local90 + local274] & 0x4FA40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local79 < 128 - arg1 && Class2_Sub3_Sub30.anIntArrayArray49[local79 + 1][local74] == 0 && (local50[arg1 + local84][local90] & 0x60E40000) == 0 && (local50[local84 + arg1][local90 + arg1 - 1] & 0x78240000) == 0) {
									local274 = 1;
									while (true) {
										if (local274 >= arg1 - 1) {
											Class37_Sub1.anIntArray90[local45] = local7 + 1;
											Class14.anIntArray257[local45] = local9;
											Class2_Sub3_Sub30.anIntArrayArray49[local79 + 1][local74] = 8;
											local45 = local45 + 1 & 0xFFF;
											Class11_Sub1_Sub1.anIntArrayArray4[local79 + 1][local74] = local237;
											break;
										}
										if ((local50[local84 + arg1][local90 + local274] & 0x78E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local74 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local79][local74 - 1] == 0 && (local50[local84][local90 - 1] & 0x43A40000) == 0 && (local50[local84 + arg1 - 1][local90 - 1] & 0x60E40000) == 0) {
									local274 = 1;
									while (true) {
										if (arg1 - 1 <= local274) {
											Class37_Sub1.anIntArray90[local45] = local7;
											Class14.anIntArray257[local45] = local9 - 1;
											local45 = local45 + 1 & 0xFFF;
											Class2_Sub3_Sub30.anIntArrayArray49[local79][local74 - 1] = 1;
											Class11_Sub1_Sub1.anIntArrayArray4[local79][local74 - 1] = local237;
											break;
										}
										if ((local50[local84 + local274][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local74 < 128 - arg1 && Class2_Sub3_Sub30.anIntArrayArray49[local79][local74 + 1] == 0 && (local50[local84][local90 + arg1] & 0x4E240000) == 0 && (local50[local84 + arg1 - 1][arg1 + local90] & 0x78240000) == 0) {
									local274 = 1;
									while (true) {
										if (arg1 - 1 <= local274) {
											Class37_Sub1.anIntArray90[local45] = local7;
											Class14.anIntArray257[local45] = local9 + 1;
											Class2_Sub3_Sub30.anIntArrayArray49[local79][local74 + 1] = 4;
											local45 = local45 + 1 & 0xFFF;
											Class11_Sub1_Sub1.anIntArrayArray4[local79][local74 + 1] = local237;
											break;
										}
										if ((local50[local274 + local84][local90 + arg1] & 0x7E240000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local79 > 0 && local74 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local79 - 1][local74 - 1] == 0 && (local50[local84 - 1][local90 - 1] & 0x43A40000) == 0) {
									local274 = 1;
									while (true) {
										if (arg1 <= local274) {
											Class37_Sub1.anIntArray90[local45] = local7 - 1;
											Class14.anIntArray257[local45] = local9 - 1;
											Class2_Sub3_Sub30.anIntArrayArray49[local79 - 1][local74 - 1] = 3;
											local45 = local45 + 1 & 0xFFF;
											Class11_Sub1_Sub1.anIntArrayArray4[local79 - 1][local74 - 1] = local237;
											break;
										}
										if ((local50[local84 - 1][local90 + local274 - 1] & 0x4FA40000) != 0 || (local50[local274 + local84 - 1][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (128 - arg1 > local79 && local74 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local79 + 1][local74 - 1] == 0 && (local50[arg1 + local84][local90 - 1] & 0x60E40000) == 0) {
									local274 = 1;
									while (true) {
										if (local274 >= arg1) {
											Class37_Sub1.anIntArray90[local45] = local7 + 1;
											Class14.anIntArray257[local45] = local9 - 1;
											Class2_Sub3_Sub30.anIntArrayArray49[local79 + 1][local74 - 1] = 9;
											local45 = local45 + 1 & 0xFFF;
											Class11_Sub1_Sub1.anIntArrayArray4[local79 + 1][local74 - 1] = local237;
											break;
										}
										if ((local50[arg1 + local84][local274 + local90 - 1] & 0x78E40000) != 0 || (local50[local84 + local274][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local79 > 0 && local74 < 128 - arg1 && Class2_Sub3_Sub30.anIntArrayArray49[local79 - 1][local74 + 1] == 0 && (local50[local84 - 1][arg1 + local90] & 0x4E240000) == 0) {
									for (local274 = 1; local274 < arg1; local274++) {
										if ((local50[local84 - 1][local90 + local274] & 0x4FA40000) != 0 || (local50[local84 + local274 - 1][local90 + arg1] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Class37_Sub1.anIntArray90[local45] = local7 - 1;
									Class14.anIntArray257[local45] = local9 + 1;
									local45 = local45 + 1 & 0xFFF;
									Class2_Sub3_Sub30.anIntArrayArray49[local79 - 1][local74 + 1] = 6;
									Class11_Sub1_Sub1.anIntArrayArray4[local79 - 1][local74 + 1] = local237;
								}
							} while (128 - arg1 <= local79);
						} while (local74 >= 128 - arg1);
					} while (Class2_Sub3_Sub30.anIntArrayArray49[local79 + 1][local74 + 1] != 0);
				} while ((local50[arg1 + local84][arg1 + local90] & 0x78240000) != 0);
				for (local274 = 1; local274 < arg1; local274++) {
					if ((local50[local274 + local84][arg1 + local90] & 0x7E240000) != 0 || (local50[local84 + arg1][local90 + local274] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Class37_Sub1.anIntArray90[local45] = local7 + 1;
				Class14.anIntArray257[local45] = local9 + 1;
				Class2_Sub3_Sub30.anIntArrayArray49[local79 + 1][local74 + 1] = 12;
				local45 = local45 + 1 & 0xFFF;
				Class11_Sub1_Sub1.anIntArrayArray4[local79 + 1][local74 + 1] = local237;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!bt;I)Lclient!jq;", line = 952)
	public static Class2_Sub3 method4929(@OriginalArg(0) Class2_Sub4 arg0) {
		arg0.method4816();
		@Pc(13) int local13 = arg0.method4816();
		@Pc(17) Class2_Sub3 local17 = Static227.method4249(local13);
		local17.anInt7238 = arg0.method4816();
		@Pc(26) int local26 = arg0.method4816();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method4816();
			local17.method6485(local34, arg0);
		}
		local17.method6481();
		return local17;
	}
}
