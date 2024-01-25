import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!mb;")
	public static Class132 aClass132_16;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "I")
	public static int anInt5395;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public static int anInt5393 = 0;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	public static int anInt5397 = 0;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35 = null;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZILclient!c;IIIIIIII)Z")
	public static boolean method4906(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class27 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg1;
		@Pc(18) int local18 = arg3 - 64;
		Static27.anIntArrayArray28[64][64] = 99;
		@Pc(29) int local29 = arg1 - 64;
		Static339.anIntArrayArray215[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static52.anIntArray112[0] = arg3;
		@Pc(46) int local46 = local37 + 1;
		Static101.anIntArray258[0] = arg1;
		@Pc(51) int[][] local51 = arg2.anIntArrayArray31;
		while (true) {
			label282: while (true) {
				@Pc(77) int local77;
				@Pc(66) int local66;
				@Pc(83) int local83;
				@Pc(89) int local89;
				@Pc(239) int local239;
				@Pc(284) int local284;
				do {
					do {
						do {
							label259: do {
								if (local39 == local46) {
									Static151.anInt2862 = local7;
									Static78.anInt1445 = local9;
									return false;
								}
								local7 = Static52.anIntArray112[local39];
								local9 = Static101.anIntArray258[local39];
								local66 = local9 - local29;
								local39 = local39 + 1 & 0xFFF;
								local77 = local7 - local18;
								local83 = local7 - arg2.anInt632;
								local89 = local9 - arg2.anInt621;
								if (arg6 == -4) {
									if (arg4 == local7 && local9 == arg0) {
										Static151.anInt2862 = local7;
										Static78.anInt1445 = local9;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static102.method4781(arg4, arg0, arg7, arg5, local9, arg9, arg5, local7)) {
										Static78.anInt1445 = local9;
										Static151.anInt2862 = local7;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg2.method517(local7, arg9, local9, arg5, arg7, arg8, arg5, arg0, arg4)) {
										Static151.anInt2862 = local7;
										Static78.anInt1445 = local9;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg2.method511(local7, arg4, arg8, arg9, arg5, arg7, local9, arg0)) {
										Static78.anInt1445 = local9;
										Static151.anInt2862 = local7;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg2.method515(local7, arg0, local9, arg5, arg10, arg4, arg6)) {
										Static151.anInt2862 = local7;
										Static78.anInt1445 = local9;
										return true;
									}
								} else if (arg2.method524(arg0, local9, arg4, arg5, arg6, local7, arg10)) {
									Static151.anInt2862 = local7;
									Static78.anInt1445 = local9;
									return true;
								}
								local239 = Static339.anIntArrayArray215[local77][local66] + 1;
								if (local77 > 0 && Static27.anIntArrayArray28[local77 - 1][local66] == 0 && (local51[local83 - 1][local89] & 0x43A40000) == 0 && (local51[local83 - 1][local89 + arg5 - 1] & 0x4E240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg5 - 1) {
											Static52.anIntArray112[local46] = local7 - 1;
											Static101.anIntArray258[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static27.anIntArrayArray28[local77 - 1][local66] = 2;
											Static339.anIntArrayArray215[local77 - 1][local66] = local239;
											break;
										}
										if ((local51[local83 - 1][local284 + local89] & 0x4FA40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (128 - arg5 > local77 && Static27.anIntArrayArray28[local77 + 1][local66] == 0 && (local51[local83 + arg5][local89] & 0x60E40000) == 0 && (local51[local83 + arg5][arg5 + local89 - 1] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (arg5 - 1 <= local284) {
											Static52.anIntArray112[local46] = local7 + 1;
											Static101.anIntArray258[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static27.anIntArrayArray28[local77 + 1][local66] = 8;
											Static339.anIntArrayArray215[local77 + 1][local66] = local239;
											break;
										}
										if ((local51[local83 + arg5][local89 + local284] & 0x78E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local66 > 0 && Static27.anIntArrayArray28[local77][local66 - 1] == 0 && (local51[local83][local89 - 1] & 0x43A40000) == 0 && (local51[local83 + arg5 - 1][local89 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg5 - 1) {
											Static52.anIntArray112[local46] = local7;
											Static101.anIntArray258[local46] = local9 - 1;
											Static27.anIntArrayArray28[local77][local66 - 1] = 1;
											local46 = local46 + 1 & 0xFFF;
											Static339.anIntArrayArray215[local77][local66 - 1] = local239;
											break;
										}
										if ((local51[local83 + local284][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (128 - arg5 > local66 && Static27.anIntArrayArray28[local77][local66 + 1] == 0 && (local51[local83][arg5 + local89] & 0x4E240000) == 0 && (local51[local83 + arg5 - 1][arg5 + local89] & 0x78240000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg5 - 1) {
											Static52.anIntArray112[local46] = local7;
											Static101.anIntArray258[local46] = local9 + 1;
											local46 = local46 + 1 & 0xFFF;
											Static27.anIntArrayArray28[local77][local66 + 1] = 4;
											Static339.anIntArrayArray215[local77][local66 + 1] = local239;
											break;
										}
										if ((local51[local83 + local284][local89 + arg5] & 0x7E240000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local77 > 0 && local66 > 0 && Static27.anIntArrayArray28[local77 - 1][local66 - 1] == 0 && (local51[local83 - 1][local89 - 1] & 0x43A40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg5) {
											Static52.anIntArray112[local46] = local7 - 1;
											Static101.anIntArray258[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static27.anIntArrayArray28[local77 - 1][local66 - 1] = 3;
											Static339.anIntArrayArray215[local77 - 1][local66 - 1] = local239;
											break;
										}
										if ((local51[local83 - 1][local284 + local89 - 1] & 0x4FA40000) != 0 || (local51[local83 + local284 - 1][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local77 < 128 - arg5 && local66 > 0 && Static27.anIntArrayArray28[local77 + 1][local66 - 1] == 0 && (local51[arg5 + local83][local89 - 1] & 0x60E40000) == 0) {
									local284 = 1;
									while (true) {
										if (local284 >= arg5) {
											Static52.anIntArray112[local46] = local7 + 1;
											Static101.anIntArray258[local46] = local9 - 1;
											Static27.anIntArrayArray28[local77 + 1][local66 - 1] = 9;
											local46 = local46 + 1 & 0xFFF;
											Static339.anIntArrayArray215[local77 + 1][local66 - 1] = local239;
											break;
										}
										if ((local51[arg5 + local83][local284 + local89 - 1] & 0x78E40000) != 0 || (local51[local284 + local83][local89 - 1] & 0x63E40000) != 0) {
											break;
										}
										local284++;
									}
								}
								if (local77 > 0 && local66 < 128 - arg5 && Static27.anIntArrayArray28[local77 - 1][local66 + 1] == 0 && (local51[local83 - 1][local89 + arg5] & 0x4E240000) == 0) {
									for (local284 = 1; local284 < arg5; local284++) {
										if ((local51[local83 - 1][local89 + local284] & 0x4FA40000) != 0 || (local51[local83 + local284 - 1][arg5 + local89] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static52.anIntArray112[local46] = local7 - 1;
									Static101.anIntArray258[local46] = local9 + 1;
									local46 = local46 + 1 & 0xFFF;
									Static27.anIntArrayArray28[local77 - 1][local66 + 1] = 6;
									Static339.anIntArrayArray215[local77 - 1][local66 + 1] = local239;
								}
							} while (128 - arg5 <= local77);
						} while (128 - arg5 <= local66);
					} while (Static27.anIntArrayArray28[local77 + 1][local66 + 1] != 0);
				} while ((local51[local83 + arg5][local89 + arg5] & 0x78240000) != 0);
				for (local284 = 1; local284 < arg5; local284++) {
					if ((local51[local284 + local83][arg5 + local89] & 0x7E240000) != 0 || (local51[arg5 + local83][local89 + local284] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static52.anIntArray112[local46] = local7 + 1;
				Static101.anIntArray258[local46] = local9 + 1;
				Static27.anIntArrayArray28[local77 + 1][local66 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static339.anIntArrayArray215[local77 + 1][local66 + 1] = local239;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
	public static void method4909(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class6 local11 = Static126.aClass108_18.method2903(); local11 != null; local11 = Static126.aClass108_18.method2905()) {
			if ((long) arg0 == (local11.aLong218 >> 48 & 0xFFFFL)) {
				local11.method5756();
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qo;B)V")
	public static void method4910(@OriginalArg(0) Class44_Sub4_Sub4_Sub1 arg0) {
		@Pc(11) Class6_Sub39 local11 = (Class6_Sub39) Static225.aClass108_26.method2900((long) arg0.anInt5127);
		if (local11 == null) {
			return;
		}
		if (local11.aClass6_Sub12_Sub4_3 != null) {
			Static241.aClass6_Sub12_Sub3_6.method4902(local11.aClass6_Sub12_Sub4_3);
			local11.aClass6_Sub12_Sub4_3 = null;
		}
		local11.method5756();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)I")
	public static int method4913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xF;
		@Pc(21) int local21 = local7 < 8 ? arg3 : arg0;
		@Pc(40) int local40 = local7 < 4 ? arg0 : local7 == 12 || local7 == 14 ? arg3 : arg2;
		return ((local7 & 0x1) == 0 ? local21 : -local21) + ((local7 & 0x2) == 0 ? local40 : -local40);
	}
}
