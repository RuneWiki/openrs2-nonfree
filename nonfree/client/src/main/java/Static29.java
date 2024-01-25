import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_7 = new Class180(16, -2);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIII)V")
	public static void method689(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(10, (long) arg0);
		local9.method2195();
		local9.anInt2394 = arg1;
		local9.anInt2400 = arg3;
		local9.anInt2401 = arg2;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIZII)V")
	public static void method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static24.aClass3_Sub22_4.aClass6_Sub28_1.method8690() != 0 && arg0 != 0 && Static199.anInt3915 < 50 && arg5 != -1) {
			Static240.aClass182Array1[Static199.anInt3915++] = new Class182((byte) 1, arg5, arg0, arg3, arg1, arg4, arg2, (Class28_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIILclient!oga;IIIIII)Z")
	public static boolean method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class252 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg8;
		@Pc(7) int local7 = arg0;
		@Pc(16) int local16 = arg8 - 64;
		Static199.anIntArrayArray20[64][64] = 99;
		@Pc(27) int local27 = arg0 - 64;
		Static94.anIntArrayArray13[64][64] = 0;
		@Pc(35) byte local35 = 0;
		@Pc(37) int local37 = 0;
		Static19.anIntArray26[0] = arg8;
		@Pc(44) int local44 = local35 + 1;
		Static491.anIntArray684[0] = arg0;
		@Pc(49) int[][] local49 = arg5.anIntArrayArray45;
		while (true) {
			label282: while (true) {
				@Pc(63) int local63;
				@Pc(68) int local68;
				@Pc(79) int local79;
				@Pc(85) int local85;
				@Pc(238) int local238;
				@Pc(274) int local274;
				do {
					do {
						do {
							label259: do {
								if (local44 == local37) {
									Static421.anInt6741 = local5;
									Static561.anInt9113 = local7;
									return false;
								}
								local5 = Static19.anIntArray26[local37];
								local7 = Static491.anIntArray684[local37];
								local63 = local5 - local16;
								local68 = local7 - local27;
								local37 = local37 + 1 & 0xFFF;
								local79 = local5 - arg5.anInt6837;
								local85 = local7 - arg5.anInt6831;
								if (arg4 == -4) {
									if (arg3 == local5 && local7 == arg2) {
										Static561.anInt9113 = local7;
										Static421.anInt6741 = local5;
										return true;
									}
								} else if (arg4 == -3) {
									if (Static510.method4484(arg9, arg2, arg3, arg10, local5, arg7, arg7, local7)) {
										Static561.anInt9113 = local7;
										Static421.anInt6741 = local5;
										return true;
									}
								} else if (arg4 == -2) {
									if (arg5.method6162(arg3, local5, arg7, arg9, arg2, local7, arg7, arg6, arg10)) {
										Static421.anInt6741 = local5;
										Static561.anInt9113 = local7;
										return true;
									}
								} else if (arg4 == -1) {
									if (arg5.method6168(local7, arg9, arg10, arg6, arg3, local5, arg2, arg7)) {
										Static561.anInt9113 = local7;
										Static421.anInt6741 = local5;
										return true;
									}
								} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
									if (arg5.method6163(arg4, arg2, local7, arg3, arg7, arg1, local5)) {
										Static421.anInt6741 = local5;
										Static561.anInt9113 = local7;
										return true;
									}
								} else if (arg5.method6171(arg1, arg3, local5, arg4, local7, arg2, arg7)) {
									Static561.anInt9113 = local7;
									Static421.anInt6741 = local5;
									return true;
								}
								local238 = Static94.anIntArrayArray13[local63][local68] + 1;
								if (local63 > 0 && Static199.anIntArrayArray20[local63 - 1][local68] == 0 && (local49[local79 - 1][local85] & 0x43A40000) == 0 && (local49[local79 - 1][local85 + arg7 - 1] & 0x4E240000) == 0) {
									local274 = 1;
									while (true) {
										if (local274 >= arg7 - 1) {
											Static19.anIntArray26[local44] = local5 - 1;
											Static491.anIntArray684[local44] = local7;
											Static199.anIntArrayArray20[local63 - 1][local68] = 2;
											local44 = local44 + 1 & 0xFFF;
											Static94.anIntArrayArray13[local63 - 1][local68] = local238;
											break;
										}
										if ((local49[local79 - 1][local85 + local274] & 0x4FA40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (128 - arg7 > local63 && Static199.anIntArrayArray20[local63 + 1][local68] == 0 && (local49[local79 + arg7][local85] & 0x60E40000) == 0 && (local49[arg7 + local79][local85 + arg7 - 1] & 0x78240000) == 0) {
									local274 = 1;
									while (true) {
										if (arg7 - 1 <= local274) {
											Static19.anIntArray26[local44] = local5 + 1;
											Static491.anIntArray684[local44] = local7;
											Static199.anIntArrayArray20[local63 + 1][local68] = 8;
											local44 = local44 + 1 & 0xFFF;
											Static94.anIntArrayArray13[local63 + 1][local68] = local238;
											break;
										}
										if ((local49[local79 + arg7][local274 + local85] & 0x78E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local68 > 0 && Static199.anIntArrayArray20[local63][local68 - 1] == 0 && (local49[local79][local85 - 1] & 0x43A40000) == 0 && (local49[local79 + arg7 - 1][local85 - 1] & 0x60E40000) == 0) {
									local274 = 1;
									while (true) {
										if (arg7 - 1 <= local274) {
											Static19.anIntArray26[local44] = local5;
											Static491.anIntArray684[local44] = local7 - 1;
											Static199.anIntArrayArray20[local63][local68 - 1] = 1;
											local44 = local44 + 1 & 0xFFF;
											Static94.anIntArrayArray13[local63][local68 - 1] = local238;
											break;
										}
										if ((local49[local274 + local79][local85 - 1] & 0x63E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local68 < 128 - arg7 && Static199.anIntArrayArray20[local63][local68 + 1] == 0 && (local49[local79][local85 + arg7] & 0x4E240000) == 0 && (local49[local79 + arg7 - 1][arg7 + local85] & 0x78240000) == 0) {
									local274 = 1;
									while (true) {
										if (arg7 - 1 <= local274) {
											Static19.anIntArray26[local44] = local5;
											Static491.anIntArray684[local44] = local7 + 1;
											Static199.anIntArrayArray20[local63][local68 + 1] = 4;
											local44 = local44 + 1 & 0xFFF;
											Static94.anIntArrayArray13[local63][local68 + 1] = local238;
											break;
										}
										if ((local49[local79 + local274][arg7 + local85] & 0x7E240000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local63 > 0 && local68 > 0 && Static199.anIntArrayArray20[local63 - 1][local68 - 1] == 0 && (local49[local79 - 1][local85 - 1] & 0x43A40000) == 0) {
									local274 = 1;
									while (true) {
										if (local274 >= arg7) {
											Static19.anIntArray26[local44] = local5 - 1;
											Static491.anIntArray684[local44] = local7 - 1;
											local44 = local44 + 1 & 0xFFF;
											Static199.anIntArrayArray20[local63 - 1][local68 - 1] = 3;
											Static94.anIntArrayArray13[local63 - 1][local68 - 1] = local238;
											break;
										}
										if ((local49[local79 - 1][local85 + local274 - 1] & 0x4FA40000) != 0 || (local49[local79 + local274 - 1][local85 - 1] & 0x63E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local63 < 128 - arg7 && local68 > 0 && Static199.anIntArrayArray20[local63 + 1][local68 - 1] == 0 && (local49[arg7 + local79][local85 - 1] & 0x60E40000) == 0) {
									local274 = 1;
									while (true) {
										if (arg7 <= local274) {
											Static19.anIntArray26[local44] = local5 + 1;
											Static491.anIntArray684[local44] = local7 - 1;
											local44 = local44 + 1 & 0xFFF;
											Static199.anIntArrayArray20[local63 + 1][local68 - 1] = 9;
											Static94.anIntArrayArray13[local63 + 1][local68 - 1] = local238;
											break;
										}
										if ((local49[arg7 + local79][local274 + local85 - 1] & 0x78E40000) != 0 || (local49[local79 + local274][local85 - 1] & 0x63E40000) != 0) {
											break;
										}
										local274++;
									}
								}
								if (local63 > 0 && local68 < 128 - arg7 && Static199.anIntArrayArray20[local63 - 1][local68 + 1] == 0 && (local49[local79 - 1][local85 + arg7] & 0x4E240000) == 0) {
									for (local274 = 1; local274 < arg7; local274++) {
										if ((local49[local79 - 1][local274 + local85] & 0x4FA40000) != 0 || (local49[local274 + local79 - 1][local85 + arg7] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static19.anIntArray26[local44] = local5 - 1;
									Static491.anIntArray684[local44] = local7 + 1;
									local44 = local44 + 1 & 0xFFF;
									Static199.anIntArrayArray20[local63 - 1][local68 + 1] = 6;
									Static94.anIntArrayArray13[local63 - 1][local68 + 1] = local238;
								}
							} while (128 - arg7 <= local63);
						} while (128 - arg7 <= local68);
					} while (Static199.anIntArrayArray20[local63 + 1][local68 + 1] != 0);
				} while ((local49[arg7 + local79][local85 + arg7] & 0x78240000) != 0);
				for (local274 = 1; local274 < arg7; local274++) {
					if ((local49[local79 + local274][arg7 + local85] & 0x7E240000) != 0 || (local49[local79 + arg7][local274 + local85] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static19.anIntArray26[local44] = local5 + 1;
				Static491.anIntArray684[local44] = local7 + 1;
				Static199.anIntArrayArray20[local63 + 1][local68 + 1] = 12;
				local44 = local44 + 1 & 0xFFF;
				Static94.anIntArrayArray13[local63 + 1][local68 + 1] = local238;
			}
		}
	}
}
