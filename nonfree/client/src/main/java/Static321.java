import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "Lclient!al;")
	public static final Class11 aClass11_136 = new Class11(4);

	@OriginalMember(owner = "client!uj", name = "nb", descriptor = "I")
	public static int anInt6195 = 0;

	@OriginalMember(owner = "client!uj", name = "Db", descriptor = "[[I")
	public static final int[][] anIntArrayArray88 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIILclient!op;)V")
	public static void method5513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10_Sub1 arg4) {
		arg4.anInt179 = (arg1 << 7) + 64;
		arg4.anInt176 = arg3;
		arg4.anInt173 = (arg2 << 7) + 64;
		@Pc(24) Class213 local24 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class81 local31 = local24.aClass81_4; local31 != null; local31 = local31.aClass81_3) {
				if (local31.aClass10_Sub3_1.aBoolean412) {
					@Pc(41) int local41 = local31.aClass10_Sub3_1.method5345();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt176 += local28;
				arg4.aBoolean7 = true;
			}
		}
		if (Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static243.method4280(arg0, arg1, arg2);
		}
		Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2].aClass10_Sub1_1 = arg4;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIILclient!fn;II)Z")
	public static boolean method5525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class65 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg4 - 64;
		@Pc(22) int local22 = arg6 - 64;
		Static114.anIntArrayArray36[64][64] = 99;
		Static216.anIntArrayArray73[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static34.anIntArray392[0] = arg4;
		@Pc(42) int local42 = 0;
		@Pc(50) int local50 = local36 + 1;
		Static161.anIntArray298[0] = arg6;
		@Pc(55) int[][] local55 = arg8.anIntArrayArray29;
		while (true) {
			label282: while (true) {
				@Pc(74) int local74;
				@Pc(69) int local69;
				@Pc(86) int local86;
				@Pc(92) int local92;
				@Pc(253) int local253;
				@Pc(295) int local295;
				do {
					do {
						do {
							label259: do {
								if (local50 == local42) {
									Static4.anInt124 = local9;
									Static7.anInt190 = local7;
									return false;
								}
								local9 = Static161.anIntArray298[local42];
								local7 = Static34.anIntArray392[local42];
								local69 = local9 - local22;
								local74 = local7 - local18;
								local42 = local42 + 1 & 0xFFF;
								local86 = local7 - arg8.anInt2120;
								local92 = local9 - arg8.anInt2134;
								if (arg1 == -4) {
									if (local7 == arg5 && local9 == arg0) {
										Static7.anInt190 = local7;
										Static4.anInt124 = local9;
										return true;
									}
								} else if (arg1 == -3) {
									if (Static71.method5022(arg9, arg9, local9, arg0, local7, arg10, arg2, arg5)) {
										Static7.anInt190 = local7;
										Static4.anInt124 = local9;
										return true;
									}
								} else if (arg1 == -2) {
									if (arg8.method2124(arg3, arg2, arg10, arg0, local7, arg9, arg5, local9, arg9)) {
										Static7.anInt190 = local7;
										Static4.anInt124 = local9;
										return true;
									}
								} else if (arg1 == -1) {
									if (arg8.method2126(local7, arg2, arg9, arg3, local9, arg0, arg5, arg10)) {
										Static4.anInt124 = local9;
										Static7.anInt190 = local7;
										return true;
									}
								} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
									if (arg8.method2131(arg1, local9, arg9, arg7, arg5, local7, arg0)) {
										Static4.anInt124 = local9;
										Static7.anInt190 = local7;
										return true;
									}
								} else if (arg8.method2132(arg5, arg9, arg1, arg7, local7, local9, arg0)) {
									Static7.anInt190 = local7;
									Static4.anInt124 = local9;
									return true;
								}
								local253 = Static216.anIntArrayArray73[local74][local69] + 1;
								if (local74 > 0 && Static114.anIntArrayArray36[local74 - 1][local69] == 0 && (local55[local86 - 1][local92] & 0x43A40000) == 0 && (local55[local86 - 1][arg9 + local92 - 1] & 0x4E240000) == 0) {
									local295 = 1;
									while (true) {
										if (local295 >= arg9 - 1) {
											Static34.anIntArray392[local50] = local7 - 1;
											Static161.anIntArray298[local50] = local9;
											Static114.anIntArrayArray36[local74 - 1][local69] = 2;
											local50 = local50 + 1 & 0xFFF;
											Static216.anIntArrayArray73[local74 - 1][local69] = local253;
											break;
										}
										if ((local55[local86 - 1][local92 + local295] & 0x4FA40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (128 - arg9 > local74 && Static114.anIntArrayArray36[local74 + 1][local69] == 0 && (local55[arg9 + local86][local92] & 0x60E40000) == 0 && (local55[local86 + arg9][arg9 + local92 - 1] & 0x78240000) == 0) {
									local295 = 1;
									while (true) {
										if (arg9 - 1 <= local295) {
											Static34.anIntArray392[local50] = local7 + 1;
											Static161.anIntArray298[local50] = local9;
											Static114.anIntArrayArray36[local74 + 1][local69] = 8;
											local50 = local50 + 1 & 0xFFF;
											Static216.anIntArrayArray73[local74 + 1][local69] = local253;
											break;
										}
										if ((local55[arg9 + local86][local295 + local92] & 0x78E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local69 > 0 && Static114.anIntArrayArray36[local74][local69 - 1] == 0 && (local55[local86][local92 - 1] & 0x43A40000) == 0 && (local55[local86 + arg9 - 1][local92 - 1] & 0x60E40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg9 - 1 <= local295) {
											Static34.anIntArray392[local50] = local7;
											Static161.anIntArray298[local50] = local9 - 1;
											Static114.anIntArrayArray36[local74][local69 - 1] = 1;
											local50 = local50 + 1 & 0xFFF;
											Static216.anIntArrayArray73[local74][local69 - 1] = local253;
											break;
										}
										if ((local55[local86 + local295][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (128 - arg9 > local69 && Static114.anIntArrayArray36[local74][local69 + 1] == 0 && (local55[local86][arg9 + local92] & 0x4E240000) == 0 && (local55[local86 + arg9 - 1][local92 + arg9] & 0x78240000) == 0) {
									local295 = 1;
									while (true) {
										if (local295 >= arg9 - 1) {
											Static34.anIntArray392[local50] = local7;
											Static161.anIntArray298[local50] = local9 + 1;
											Static114.anIntArrayArray36[local74][local69 + 1] = 4;
											local50 = local50 + 1 & 0xFFF;
											Static216.anIntArrayArray73[local74][local69 + 1] = local253;
											break;
										}
										if ((local55[local295 + local86][arg9 + local92] & 0x7E240000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local74 > 0 && local69 > 0 && Static114.anIntArrayArray36[local74 - 1][local69 - 1] == 0 && (local55[local86 - 1][local92 - 1] & 0x43A40000) == 0) {
									local295 = 1;
									while (true) {
										if (local295 >= arg9) {
											Static34.anIntArray392[local50] = local7 - 1;
											Static161.anIntArray298[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static114.anIntArrayArray36[local74 - 1][local69 - 1] = 3;
											Static216.anIntArrayArray73[local74 - 1][local69 - 1] = local253;
											break;
										}
										if ((local55[local86 - 1][local295 + local92 - 1] & 0x4FA40000) != 0 || (local55[local295 + local86 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local74 < 128 - arg9 && local69 > 0 && Static114.anIntArrayArray36[local74 + 1][local69 - 1] == 0 && (local55[local86 + arg9][local92 - 1] & 0x60E40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg9 <= local295) {
											Static34.anIntArray392[local50] = local7 + 1;
											Static161.anIntArray298[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static114.anIntArrayArray36[local74 + 1][local69 - 1] = 9;
											Static216.anIntArrayArray73[local74 + 1][local69 - 1] = local253;
											break;
										}
										if ((local55[local86 + arg9][local295 + local92 - 1] & 0x78E40000) != 0 || (local55[local86 + local295][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local74 > 0 && local69 < 128 - arg9 && Static114.anIntArrayArray36[local74 - 1][local69 + 1] == 0 && (local55[local86 - 1][arg9 + local92] & 0x4E240000) == 0) {
									for (local295 = 1; local295 < arg9; local295++) {
										if ((local55[local86 - 1][local92 + local295] & 0x4FA40000) != 0 || (local55[local86 + local295 - 1][local92 + arg9] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static34.anIntArray392[local50] = local7 - 1;
									Static161.anIntArray298[local50] = local9 + 1;
									Static114.anIntArrayArray36[local74 - 1][local69 + 1] = 6;
									local50 = local50 + 1 & 0xFFF;
									Static216.anIntArrayArray73[local74 - 1][local69 + 1] = local253;
								}
							} while (local74 >= 128 - arg9);
						} while (local69 >= 128 - arg9);
					} while (Static114.anIntArrayArray36[local74 + 1][local69 + 1] != 0);
				} while ((local55[local86 + arg9][arg9 + local92] & 0x78240000) != 0);
				for (local295 = 1; local295 < arg9; local295++) {
					if ((local55[local86 + local295][arg9 + local92] & 0x7E240000) != 0 || (local55[arg9 + local86][local92 + local295] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static34.anIntArray392[local50] = local7 + 1;
				Static161.anIntArray298[local50] = local9 + 1;
				Static114.anIntArrayArray36[local74 + 1][local69 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static216.anIntArrayArray73[local74 + 1][local69 + 1] = local253;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BII)I")
	public static int method5532(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIB)V")
	public static void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static327.anInt6304 == 1) {
			Static14.aClass2Array2[Static27.anInt614 / 100].method2642(Static244.anInt4754 - 8, Static349.anInt6630 + -8);
		}
		if (Static327.anInt6304 == 2) {
			Static14.aClass2Array2[Static27.anInt614 / 100 + 4].method2642(Static244.anInt4754 - 8, Static349.anInt6630 + -8);
		}
		Static88.method2113();
	}
}
