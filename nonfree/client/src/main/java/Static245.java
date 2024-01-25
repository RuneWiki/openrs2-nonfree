import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray108;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_97 = new Class205(82, -1);

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_98 = new Class205(68, 0);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!kk;)Lclient!f;")
	public static Class65_Sub1 method3912(@OriginalArg(1) Class2_Sub16 arg0) {
		return new Class65_Sub1(arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5356(), arg0.method5350());
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIBIILclient!pf;IIIII)Z")
	public static boolean method3913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class188 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg9 - 64;
		Static381.anIntArrayArray59[64][64] = 99;
		@Pc(29) int local29 = arg3 - 64;
		Static135.anIntArrayArray28[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static189.anIntArray1355[0] = arg9;
		@Pc(46) int local46 = local37 + 1;
		Static275.anIntArray914[0] = arg3;
		@Pc(51) int[][] local51 = arg5.anIntArrayArray34;
		while (true) {
			label282: while (true) {
				@Pc(76) int local76;
				@Pc(71) int local71;
				@Pc(82) int local82;
				@Pc(87) int local87;
				@Pc(242) int local242;
				@Pc(284) int local284;
				do {
					do {
						do {
							label259: do {
								if (local39 == local46) {
									Static60.anInt1160 = local7;
									Static197.anInt3647 = local9;
									return false;
								}
								local9 = Static275.anIntArray914[local39];
								local7 = Static189.anIntArray1355[local39];
								local39 = local39 + 1 & 0xFFF;
								local71 = local9 - local29;
								local76 = local7 - local18;
								local82 = local7 - arg5.anInt4570;
								local87 = local9 - arg5.anInt4574;
								if (arg7 == -4) {
									if (arg1 == local7 && arg8 == local9) {
										Static197.anInt3647 = local9;
										Static60.anInt1160 = local7;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static323.method4787(arg10, arg10, arg2, arg1, arg4, local9, arg8, local7)) {
										Static60.anInt1160 = local7;
										Static197.anInt3647 = local9;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg5.method4039(arg4, arg8, arg10, arg10, arg1, arg6, arg2, local7, local9)) {
										Static197.anInt3647 = local9;
										Static60.anInt1160 = local7;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg5.method4052(arg6, arg1, arg8, arg2, local7, local9, arg10, arg4)) {
										Static60.anInt1160 = local7;
										Static197.anInt3647 = local9;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg5.method4046(arg1, arg10, local9, arg7, local7, arg0, arg8)) {
										Static197.anInt3647 = local9;
										Static60.anInt1160 = local7;
										return true;
									}
								} else if (arg5.method4054(local7, arg10, arg1, arg8, arg0, local9, arg7)) {
									Static197.anInt3647 = local9;
									Static60.anInt1160 = local7;
									return true;
								}
								local242 = Static135.anIntArrayArray28[local76][local71] + 1;
								if (local76 > 0 && Static381.anIntArrayArray59[local76 - 1][local71] == 0 && (local51[local82 - 1][local87] & 0x43A40000) == 0 && (local51[local82 - 1][arg10 + local87 - 1] & 0x4E240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg10 - 1) {
											Static189.anIntArray1355[local46] = local7 - 1;
											Static275.anIntArray914[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static381.anIntArrayArray59[local76 - 1][local71] = 2;
											Static135.anIntArrayArray28[local76 - 1][local71] = local242;
											break;
										}
										if ((local51[local82 - 1][local284 + local87] & 0x4FA40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local76 < 128 - arg10 && Static381.anIntArrayArray59[local76 + 1][local71] == 0 && (local51[arg10 + local82][local87] & 0x60E40000) == 0 && (local51[local82 + arg10][arg10 + local87 - 1] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg10 - 1) {
											Static189.anIntArray1355[local46] = local7 + 1;
											Static275.anIntArray914[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static381.anIntArrayArray59[local76 + 1][local71] = 8;
											Static135.anIntArrayArray28[local76 + 1][local71] = local242;
											break;
										}
										if ((local51[local82 + arg10][local87 + local284] & 0x78E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local71 > 0 && Static381.anIntArrayArray59[local76][local71 - 1] == 0 && (local51[local82][local87 - 1] & 0x43A40000) == 0 && (local51[arg10 + local82 - 1][local87 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (arg10 - 1 <= local284) {
											Static189.anIntArray1355[local46] = local7;
											Static275.anIntArray914[local46] = local9 - 1;
											Static381.anIntArrayArray59[local76][local71 - 1] = 1;
											local46 = local46 + 1 & 0xFFF;
											Static135.anIntArrayArray28[local76][local71 - 1] = local242;
											break;
										}
										if ((local51[local284 + local82][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local71 < 128 - arg10 && Static381.anIntArrayArray59[local76][local71 + 1] == 0 && (local51[local82][local87 + arg10] & 0x4E240000) == 0 && (local51[arg10 + local82 - 1][arg10 + local87] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg10 - 1) {
											Static189.anIntArray1355[local46] = local7;
											Static275.anIntArray914[local46] = local9 + 1;
											Static381.anIntArrayArray59[local76][local71 + 1] = 4;
											local46 = local46 + 1 & 0xFFF;
											Static135.anIntArrayArray28[local76][local71 + 1] = local242;
											break;
										}
										if ((local51[local284 + local82][arg10 + local87] & 0x7E240000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local76 > 0 && local71 > 0 && Static381.anIntArrayArray59[local76 - 1][local71 - 1] == 0 && (local51[local82 - 1][local87 - 1] & 0x43A40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg10) {
											Static189.anIntArray1355[local46] = local7 - 1;
											Static275.anIntArray914[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static381.anIntArrayArray59[local76 - 1][local71 - 1] = 3;
											Static135.anIntArrayArray28[local76 - 1][local71 - 1] = local242;
											break;
										}
										if ((local51[local82 - 1][local284 + local87 - 1] & 0x4FA40000) != 0 || (local51[local82 + local284 - 1][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local76 < 128 - arg10 && local71 > 0 && Static381.anIntArrayArray59[local76 + 1][local71 - 1] == 0 && (local51[arg10 + local82][local87 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg10) {
											Static189.anIntArray1355[local46] = local7 + 1;
											Static275.anIntArray914[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static381.anIntArrayArray59[local76 + 1][local71 - 1] = 9;
											Static135.anIntArrayArray28[local76 + 1][local71 - 1] = local242;
											break;
										}
										if ((local51[arg10 + local82][local284 + local87 - 1] & 0x78E40000) != 0 || (local51[local82 + local284][local87 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local76 > 0 && 128 - arg10 > local71 && Static381.anIntArrayArray59[local76 - 1][local71 + 1] == 0 && (local51[local82 - 1][local87 + arg10] & 0x4E240000) == 0) {
									for (local284 = 1; local284 < arg10; local284++) {
										if ((local51[local82 - 1][local284 + local87] & 0x4FA40000) != 0 || (local51[local284 + local82 - 1][arg10 + local87] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static189.anIntArray1355[local46] = local7 - 1;
									Static275.anIntArray914[local46] = local9 + 1;
									local46 = local46 + 1 & 0xFFF;
									Static381.anIntArrayArray59[local76 - 1][local71 + 1] = 6;
									Static135.anIntArrayArray28[local76 - 1][local71 + 1] = local242;
								}
							} while (128 - arg10 <= local76);
						} while (128 - arg10 <= local71);
					} while (Static381.anIntArrayArray59[local76 + 1][local71 + 1] != 0);
				} while ((local51[arg10 + local82][arg10 + local87] & 0x78240000) != 0);
				for (local284 = 1; local284 < arg10; local284++) {
					if ((local51[local284 + local82][local87 + arg10] & 0x7E240000) != 0 || (local51[arg10 + local82][local284 + local87] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static189.anIntArray1355[local46] = local7 + 1;
				Static275.anIntArray914[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static381.anIntArrayArray59[local76 + 1][local71 + 1] = 12;
				Static135.anIntArrayArray28[local76 + 1][local71 + 1] = local242;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method3916(@OriginalArg(0) int[] arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer();
		@Pc(18) int local18 = Static141.anInt2849;
		for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
			@Pc(31) Class38 local31 = Static27.aClass51_1.method1043(arg0[local20]);
			if (local31.anInt965 != -1) {
				@Pc(44) Class18 local44 = (Class18) Static331.aClass160_52.method3599((long) local31.anInt965);
				if (local44 == null) {
					@Pc(52) Class86 local52 = Static397.method2330(Static263.aClass171_64, local31.anInt965, 0);
					if (local52 != null) {
						local44 = Static111.aClass63_3.method2000(local52);
						Static331.aClass160_52.method3602((long) local31.anInt965, local44);
					}
				}
				if (local44 != null) {
					Static382.aClass18Array14[local18] = local44;
					local16.append(" <img=").append(local18).append(">");
					local18++;
				}
			}
		}
		return local16.toString();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public static void method3917() {
		Static280.aClass246_25.method5610();
		Static189.aClass87_15.method2358();
		Static238.aClass87_13.method2358();
	}
}
