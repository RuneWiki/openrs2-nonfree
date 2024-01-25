import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gga", name = "F", descriptor = "Lclient!via;")
	public static Class358 aClass358_1;

	@OriginalMember(owner = "client!gga", name = "L", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!gga", name = "S", descriptor = "Lclient!mv;")
	public static Class213 aClass213_5;

	@OriginalMember(owner = "client!gga", name = "U", descriptor = "I")
	public static int anInt4048;

	@OriginalMember(owner = "client!gga", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!gga", name = "R", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_22 = new Class163();

	@OriginalMember(owner = "client!gga", name = "X", descriptor = "I")
	public static int anInt4050 = 0;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIZIIIIII)V")
	public static void method3436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static455.aClass169Array4[Static593.anInt10029++] = new Class169(4, arg2, arg0, arg3, arg3, arg0, arg4, arg6, arg6, arg4, arg5, arg5, arg1, arg1);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "([JIBI[Ljava/lang/Object;)V")
	public static void method3437(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(21) int local21 = (arg2 + arg1) / 2;
		@Pc(23) int local23 = arg1;
		@Pc(27) long local27 = arg0[local21];
		arg0[local21] = arg0[arg2];
		arg0[arg2] = local27;
		@Pc(41) Object local41 = arg3[local21];
		arg3[local21] = arg3[arg2];
		arg3[arg2] = local41;
		@Pc(61) int local61 = ~local27 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg1; local63 < arg2; local63++) {
			if (arg0[local63] < local27 + (long) (local63 & local61)) {
				@Pc(81) long local81 = arg0[local63];
				arg0[local63] = arg0[local23];
				arg0[local23] = local81;
				@Pc(95) Object local95 = arg3[local63];
				arg3[local63] = arg3[local23];
				arg3[local23++] = local95;
			}
		}
		arg0[arg2] = arg0[local23];
		arg0[local23] = local27;
		arg3[arg2] = arg3[local23];
		arg3[local23] = local41;
		method3437(arg0, arg1, local23 - 1, arg3);
		method3437(arg0, local23 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIIIIBIIIIILclient!pfa;)Z")
	public static boolean method3439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class258 arg10) {
		@Pc(12) int local12 = arg2;
		@Pc(14) int local14 = arg4;
		@Pc(23) int local23 = arg2 - 64;
		@Pc(28) int local28 = arg4 - 64;
		Static131.anIntArrayArray7[64][64] = 99;
		Static577.anIntArrayArray30[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static611.anIntArray552[0] = arg2;
		@Pc(51) int local51 = local42 + 1;
		Static140.anIntArray125[0] = arg4;
		@Pc(56) int[][] local56 = arg10.anIntArrayArray38;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(243) int local243;
				@Pc(285) int local285;
				do {
					do {
						do {
							label259: do {
								if (local44 == local51) {
									Static365.anInt7041 = local12;
									Static47.anInt1658 = local14;
									return false;
								}
								local12 = Static611.anIntArray552[local44];
								local14 = Static140.anIntArray125[local44];
								local71 = local12 - local23;
								local76 = local14 - local28;
								local44 = local44 + 1 & 0xFFF;
								local88 = local12 - arg10.anInt7870;
								local94 = local14 - arg10.anInt7874;
								if (arg5 == -4) {
									if (local12 == arg8 && local14 == arg9) {
										Static47.anInt1658 = local14;
										Static365.anInt7041 = local12;
										return true;
									}
								} else if (arg5 == -3) {
									if (Static60.method5318(arg8, arg7, local14, arg1, local12, arg9, arg0, arg0)) {
										Static365.anInt7041 = local12;
										Static47.anInt1658 = local14;
										return true;
									}
								} else if (arg5 == -2) {
									if (arg10.method6631(arg8, arg1, arg9, local14, arg7, arg0, local12, arg0, arg6)) {
										Static47.anInt1658 = local14;
										Static365.anInt7041 = local12;
										return true;
									}
								} else if (arg5 == -1) {
									if (arg10.method6634(arg7, arg8, local14, arg0, arg9, arg6, local12, arg1)) {
										Static47.anInt1658 = local14;
										Static365.anInt7041 = local12;
										return true;
									}
								} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
									if (arg10.method6647(arg9, local12, arg0, local14, arg3, arg8, arg5)) {
										Static47.anInt1658 = local14;
										Static365.anInt7041 = local12;
										return true;
									}
								} else if (arg10.method6633(arg8, arg3, local14, arg9, arg5, arg0, local12)) {
									Static47.anInt1658 = local14;
									Static365.anInt7041 = local12;
									return true;
								}
								local243 = Static577.anIntArrayArray30[local71][local76] + 1;
								if (local71 > 0 && Static131.anIntArrayArray7[local71 - 1][local76] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + arg0 - 1] & 0x4E240000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg0 - 1) {
											Static611.anIntArray552[local51] = local12 - 1;
											Static140.anIntArray125[local51] = local14;
											local51 = local51 + 1 & 0xFFF;
											Static131.anIntArrayArray7[local71 - 1][local76] = 2;
											Static577.anIntArrayArray30[local71 - 1][local76] = local243;
											break;
										}
										if ((local56[local88 - 1][local94 + local285] & 0x4FA40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local71 < 128 - arg0 && Static131.anIntArrayArray7[local71 + 1][local76] == 0 && (local56[local88 + arg0][local94] & 0x60E40000) == 0 && (local56[local88 + arg0][arg0 + local94 - 1] & 0x78240000) == 0) {
									local285 = 1;
									while (true) {
										if (arg0 - 1 <= local285) {
											Static611.anIntArray552[local51] = local12 + 1;
											Static140.anIntArray125[local51] = local14;
											Static131.anIntArrayArray7[local71 + 1][local76] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static577.anIntArrayArray30[local71 + 1][local76] = local243;
											break;
										}
										if ((local56[local88 + arg0][local285 + local94] & 0x78E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local76 > 0 && Static131.anIntArrayArray7[local71][local76 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + arg0 - 1][local94 - 1] & 0x60E40000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg0 - 1) {
											Static611.anIntArray552[local51] = local12;
											Static140.anIntArray125[local51] = local14 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static131.anIntArrayArray7[local71][local76 - 1] = 1;
											Static577.anIntArrayArray30[local71][local76 - 1] = local243;
											break;
										}
										if ((local56[local88 + local285][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local76 < 128 - arg0 && Static131.anIntArrayArray7[local71][local76 + 1] == 0 && (local56[local88][local94 + arg0] & 0x4E240000) == 0 && (local56[local88 + arg0 - 1][local94 + arg0] & 0x78240000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg0 - 1) {
											Static611.anIntArray552[local51] = local12;
											Static140.anIntArray125[local51] = local14 + 1;
											Static131.anIntArrayArray7[local71][local76 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static577.anIntArrayArray30[local71][local76 + 1] = local243;
											break;
										}
										if ((local56[local88 + local285][local94 + arg0] & 0x7E240000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local71 > 0 && local76 > 0 && Static131.anIntArrayArray7[local71 - 1][local76 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg0) {
											Static611.anIntArray552[local51] = local12 - 1;
											Static140.anIntArray125[local51] = local14 - 1;
											Static131.anIntArrayArray7[local71 - 1][local76 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static577.anIntArrayArray30[local71 - 1][local76 - 1] = local243;
											break;
										}
										if ((local56[local88 - 1][local94 + local285 - 1] & 0x4FA40000) != 0 || (local56[local88 + local285 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local71 < 128 - arg0 && local76 > 0 && Static131.anIntArrayArray7[local71 + 1][local76 - 1] == 0 && (local56[local88 + arg0][local94 - 1] & 0x60E40000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg0) {
											Static611.anIntArray552[local51] = local12 + 1;
											Static140.anIntArray125[local51] = local14 - 1;
											Static131.anIntArrayArray7[local71 + 1][local76 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static577.anIntArrayArray30[local71 + 1][local76 - 1] = local243;
											break;
										}
										if ((local56[local88 + arg0][local285 + local94 - 1] & 0x78E40000) != 0 || (local56[local88 + local285][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local71 > 0 && 128 - arg0 > local76 && Static131.anIntArrayArray7[local71 - 1][local76 + 1] == 0 && (local56[local88 - 1][arg0 + local94] & 0x4E240000) == 0) {
									for (local285 = 1; local285 < arg0; local285++) {
										if ((local56[local88 - 1][local94 + local285] & 0x4FA40000) != 0 || (local56[local88 + local285 - 1][arg0 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static611.anIntArray552[local51] = local12 - 1;
									Static140.anIntArray125[local51] = local14 + 1;
									local51 = local51 + 1 & 0xFFF;
									Static131.anIntArrayArray7[local71 - 1][local76 + 1] = 6;
									Static577.anIntArrayArray30[local71 - 1][local76 + 1] = local243;
								}
							} while (128 - arg0 <= local71);
						} while (local76 >= 128 - arg0);
					} while (Static131.anIntArrayArray7[local71 + 1][local76 + 1] != 0);
				} while ((local56[arg0 + local88][arg0 + local94] & 0x78240000) != 0);
				for (local285 = 1; local285 < arg0; local285++) {
					if ((local56[local88 + local285][arg0 + local94] & 0x7E240000) != 0 || (local56[local88 + arg0][local285 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static611.anIntArray552[local51] = local12 + 1;
				Static140.anIntArray125[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static131.anIntArrayArray7[local71 + 1][local76 + 1] = 12;
				Static577.anIntArrayArray30[local71 + 1][local76 + 1] = local243;
			}
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "([BB)[B")
	public static byte[] method3442(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class6_Sub8 local13 = new Class6_Sub8(arg0);
		@Pc(17) int local17 = local13.method8246();
		@Pc(21) int local21 = local13.method8236();
		if (local21 < 0 || Static571.anInt9791 != 0 && local21 > Static571.anInt9791) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(40) byte[] local40 = new byte[local21];
			local13.method8207(local40, local21, 0);
			return local40;
		} else {
			@Pc(52) int local52 = local13.method8236();
			if (local52 < 0 || Static571.anInt9791 != 0 && local52 > Static571.anInt9791) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local52];
			if (local17 == 1) {
				Static567.method7966(local72, local52, arg0, local21);
			} else {
				@Pc(79) Class277 local79 = Static121.aClass277_1;
				synchronized (Static121.aClass277_1) {
					Static121.aClass277_1.method6956(local72, local13);
				}
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(III)V")
	public static void method3443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub5_Sub19 local12 = Static348.method5721(arg0, 16);
		local12.method5179();
		local12.anInt6198 = arg1;
	}
}
