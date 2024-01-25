import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	public static int anInt7360;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_219 = new Class214(84, 6);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method5922(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static337.aString51 = arg1;
		Static410.aString67 = arg0;
		if (Static147.anInt3063 != 3 && (Static337.aString51.equals("") || Static410.aString67.equals(""))) {
			Static455.method6191(3);
			return;
		}
		if (Static147.anInt3063 != 1) {
			Static353.anInt6235 = -1;
			Static388.anInt4888 = 0;
		}
		Static82.aBoolean140 = false;
		Static455.method6191(-3);
		Static164.anInt3259 = 0;
		Static427.anInt7334 = 1;
		Static179.anInt3678 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lclient!su;")
	public static Class89 method5923() {
		try {
			return new Class89_Sub1();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class89) Class.forName("Class89_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class89_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIILclient!ue;IIIII)Z")
	public static boolean method5924(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class253 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg3;
		@Pc(25) int local25 = arg0 - 64;
		@Pc(30) int local30 = arg3 - 64;
		Static227.anIntArrayArray33[64][64] = 99;
		Static459.anIntArrayArray58[64][64] = 0;
		@Pc(44) byte local44 = 0;
		@Pc(46) int local46 = 0;
		Static405.anIntArray576[0] = arg0;
		@Pc(53) int local53 = local44 + 1;
		Static336.anIntArray488[0] = arg3;
		@Pc(58) int[][] local58 = arg5.anIntArrayArray55;
		while (true) {
			label282: while (true) {
				@Pc(72) int local72;
				@Pc(77) int local77;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(237) int local237;
				@Pc(277) int local277;
				do {
					do {
						do {
							label259: do {
								if (local53 == local46) {
									Static240.anInt4706 = local7;
									Static257.anInt4975 = local9;
									return false;
								}
								local9 = Static336.anIntArray488[local46];
								local7 = Static405.anIntArray576[local46];
								local72 = local7 - local25;
								local77 = local9 - local30;
								local46 = local46 + 1 & 0xFFF;
								local88 = local7 - arg5.anInt7191;
								local94 = local9 - arg5.anInt7189;
								if (arg1 == -4) {
									if (arg4 == local7 && local9 == arg10) {
										Static257.anInt4975 = local9;
										Static240.anInt4706 = local7;
										return true;
									}
								} else if (arg1 == -3) {
									if (Static323.method2066(arg6, arg7, arg4, local9, local7, arg8, arg10, arg8)) {
										Static257.anInt4975 = local9;
										Static240.anInt4706 = local7;
										return true;
									}
								} else if (arg1 == -2) {
									if (arg5.method5727(arg4, arg8, arg10, local7, arg7, arg8, arg6, local9, arg2)) {
										Static240.anInt4706 = local7;
										Static257.anInt4975 = local9;
										return true;
									}
								} else if (arg1 == -1) {
									if (arg5.method5734(arg10, arg2, arg8, arg7, arg4, local7, arg6, local9)) {
										Static257.anInt4975 = local9;
										Static240.anInt4706 = local7;
										return true;
									}
								} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
									if (arg5.method5738(arg1, arg4, arg10, local7, local9, arg8, arg9)) {
										Static240.anInt4706 = local7;
										Static257.anInt4975 = local9;
										return true;
									}
								} else if (arg5.method5735(arg4, arg10, arg9, local9, arg8, local7, arg1)) {
									Static240.anInt4706 = local7;
									Static257.anInt4975 = local9;
									return true;
								}
								local237 = Static459.anIntArrayArray58[local72][local77] + 1;
								if (local72 > 0 && Static227.anIntArrayArray33[local72 - 1][local77] == 0 && (local58[local88 - 1][local94] & 0x43A40000) == 0 && (local58[local88 - 1][local94 + arg8 - 1] & 0x4E240000) == 0) {
									local277 = 1;
									while (true) {
										if (arg8 - 1 <= local277) {
											Static405.anIntArray576[local53] = local7 - 1;
											Static336.anIntArray488[local53] = local9;
											local53 = local53 + 1 & 0xFFF;
											Static227.anIntArrayArray33[local72 - 1][local77] = 2;
											Static459.anIntArrayArray58[local72 - 1][local77] = local237;
											break;
										}
										if ((local58[local88 - 1][local277 + local94] & 0x4FA40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local72 < 128 - arg8 && Static227.anIntArrayArray33[local72 + 1][local77] == 0 && (local58[arg8 + local88][local94] & 0x60E40000) == 0 && (local58[arg8 + local88][local94 + arg8 - 1] & 0x78240000) == 0) {
									local277 = 1;
									while (true) {
										if (local277 >= arg8 - 1) {
											Static405.anIntArray576[local53] = local7 + 1;
											Static336.anIntArray488[local53] = local9;
											local53 = local53 + 1 & 0xFFF;
											Static227.anIntArrayArray33[local72 + 1][local77] = 8;
											Static459.anIntArrayArray58[local72 + 1][local77] = local237;
											break;
										}
										if ((local58[local88 + arg8][local277 + local94] & 0x78E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local77 > 0 && Static227.anIntArrayArray33[local72][local77 - 1] == 0 && (local58[local88][local94 - 1] & 0x43A40000) == 0 && (local58[local88 + arg8 - 1][local94 - 1] & 0x60E40000) == 0) {
									local277 = 1;
									while (true) {
										if (arg8 - 1 <= local277) {
											Static405.anIntArray576[local53] = local7;
											Static336.anIntArray488[local53] = local9 - 1;
											local53 = local53 + 1 & 0xFFF;
											Static227.anIntArrayArray33[local72][local77 - 1] = 1;
											Static459.anIntArrayArray58[local72][local77 - 1] = local237;
											break;
										}
										if ((local58[local88 + local277][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (128 - arg8 > local77 && Static227.anIntArrayArray33[local72][local77 + 1] == 0 && (local58[local88][arg8 + local94] & 0x4E240000) == 0 && (local58[arg8 + local88 - 1][local94 + arg8] & 0x78240000) == 0) {
									local277 = 1;
									while (true) {
										if (arg8 - 1 <= local277) {
											Static405.anIntArray576[local53] = local7;
											Static336.anIntArray488[local53] = local9 + 1;
											local53 = local53 + 1 & 0xFFF;
											Static227.anIntArrayArray33[local72][local77 + 1] = 4;
											Static459.anIntArrayArray58[local72][local77 + 1] = local237;
											break;
										}
										if ((local58[local88 + local277][arg8 + local94] & 0x7E240000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local72 > 0 && local77 > 0 && Static227.anIntArrayArray33[local72 - 1][local77 - 1] == 0 && (local58[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local277 = 1;
									while (true) {
										if (local277 >= arg8) {
											Static405.anIntArray576[local53] = local7 - 1;
											Static336.anIntArray488[local53] = local9 - 1;
											Static227.anIntArrayArray33[local72 - 1][local77 - 1] = 3;
											local53 = local53 + 1 & 0xFFF;
											Static459.anIntArrayArray58[local72 - 1][local77 - 1] = local237;
											break;
										}
										if ((local58[local88 - 1][local94 + local277 - 1] & 0x4FA40000) != 0 || (local58[local88 + local277 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (128 - arg8 > local72 && local77 > 0 && Static227.anIntArrayArray33[local72 + 1][local77 - 1] == 0 && (local58[arg8 + local88][local94 - 1] & 0x60E40000) == 0) {
									local277 = 1;
									while (true) {
										if (local277 >= arg8) {
											Static405.anIntArray576[local53] = local7 + 1;
											Static336.anIntArray488[local53] = local9 - 1;
											Static227.anIntArrayArray33[local72 + 1][local77 - 1] = 9;
											local53 = local53 + 1 & 0xFFF;
											Static459.anIntArrayArray58[local72 + 1][local77 - 1] = local237;
											break;
										}
										if ((local58[arg8 + local88][local277 + local94 - 1] & 0x78E40000) != 0 || (local58[local277 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local72 > 0 && 128 - arg8 > local77 && Static227.anIntArrayArray33[local72 - 1][local77 + 1] == 0 && (local58[local88 - 1][local94 + arg8] & 0x4E240000) == 0) {
									for (local277 = 1; local277 < arg8; local277++) {
										if ((local58[local88 - 1][local277 + local94] & 0x4FA40000) != 0 || (local58[local277 + local88 - 1][arg8 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static405.anIntArray576[local53] = local7 - 1;
									Static336.anIntArray488[local53] = local9 + 1;
									local53 = local53 + 1 & 0xFFF;
									Static227.anIntArrayArray33[local72 - 1][local77 + 1] = 6;
									Static459.anIntArrayArray58[local72 - 1][local77 + 1] = local237;
								}
							} while (local72 >= 128 - arg8);
						} while (local77 >= 128 - arg8);
					} while (Static227.anIntArrayArray33[local72 + 1][local77 + 1] != 0);
				} while ((local58[local88 + arg8][local94 + arg8] & 0x78240000) != 0);
				for (local277 = 1; local277 < arg8; local277++) {
					if ((local58[local277 + local88][arg8 + local94] & 0x7E240000) != 0 || (local58[arg8 + local88][local94 + local277] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static405.anIntArray576[local53] = local7 + 1;
				Static336.anIntArray488[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local72 + 1][local77 + 1] = 12;
				Static459.anIntArrayArray58[local72 + 1][local77 + 1] = local237;
			}
		}
	}
}
