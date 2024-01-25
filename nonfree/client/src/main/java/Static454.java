import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "Lclient!hh;")
	public static Class109 aClass109_100;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_390 = new Class12(18, 7);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!ti;I)V")
	public static void method5993(@OriginalArg(0) Class1_Sub14 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static328.anInt5997; local7++) {
			@Pc(19) int local19 = arg0.method4521();
			@Pc(23) int local23 = arg0.method4498();
			if (local23 == 65535) {
				local23 = -1;
			}
			if (Static57.aClass48_Sub1Array3[local19] != null) {
				Static57.aClass48_Sub1Array3[local19].anInt1018 = local23;
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIZIIIIILclient!oe;II)Z")
	public static boolean method5998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class181 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg9;
		@Pc(34) int local34 = arg3 - 64;
		Static210.anIntArrayArray24[64][64] = 99;
		@Pc(44) int local44 = arg9 - 64;
		Static81.anIntArrayArray7[64][64] = 0;
		@Pc(52) byte local52 = 0;
		Static355.anIntArray476[0] = arg3;
		@Pc(58) int local58 = 0;
		@Pc(61) int local61 = local52 + 1;
		Static366.anIntArray494[0] = arg9;
		@Pc(66) int[][] local66 = arg8.anIntArrayArray29;
		while (true) {
			label282: while (true) {
				@Pc(91) int local91;
				@Pc(80) int local80;
				@Pc(97) int local97;
				@Pc(103) int local103;
				@Pc(254) int local254;
				@Pc(302) int local302;
				do {
					do {
						do {
							label259: do {
								if (local61 == local58) {
									Static135.anInt2444 = local9;
									Static148.anInt7258 = local7;
									return false;
								}
								local9 = Static366.anIntArray494[local58];
								local7 = Static355.anIntArray476[local58];
								local80 = local9 - local44;
								local58 = local58 + 1 & 0xFFF;
								local91 = local7 - local34;
								local97 = local7 - arg8.anInt4723;
								local103 = local9 - arg8.anInt4725;
								if (arg10 == -4) {
									if (arg6 == local7 && arg1 == local9) {
										Static148.anInt7258 = local7;
										Static135.anInt2444 = local9;
										return true;
									}
								} else if (arg10 == -3) {
									if (Static401.method5482(arg2, arg6, arg1, arg0, local9, local7, arg7, arg2)) {
										Static135.anInt2444 = local9;
										Static148.anInt7258 = local7;
										return true;
									}
								} else if (arg10 == -2) {
									if (arg8.method3867(arg1, arg2, arg7, arg6, arg0, local7, local9, arg4, arg2)) {
										Static135.anInt2444 = local9;
										Static148.anInt7258 = local7;
										return true;
									}
								} else if (arg10 == -1) {
									if (arg8.method3869(arg7, arg2, arg4, arg6, arg0, local9, local7, arg1)) {
										Static148.anInt7258 = local7;
										Static135.anInt2444 = local9;
										return true;
									}
								} else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
									if (arg8.method3874(local7, arg2, arg6, arg5, arg10, local9, arg1)) {
										Static148.anInt7258 = local7;
										Static135.anInt2444 = local9;
										return true;
									}
								} else if (arg8.method3866(arg5, local7, arg10, arg6, arg2, arg1, local9)) {
									Static135.anInt2444 = local9;
									Static148.anInt7258 = local7;
									return true;
								}
								local254 = Static81.anIntArrayArray7[local91][local80] + 1;
								if (local91 > 0 && Static210.anIntArrayArray24[local91 - 1][local80] == 0 && (local66[local97 - 1][local103] & 0x43A40000) == 0 && (local66[local97 - 1][local103 + arg2 - 1] & 0x4E240000) == 0) {
									local302 = 1;
									while (true) {
										if (arg2 - 1 <= local302) {
											Static355.anIntArray476[local61] = local7 - 1;
											Static366.anIntArray494[local61] = local9;
											local61 = local61 + 1 & 0xFFF;
											Static210.anIntArrayArray24[local91 - 1][local80] = 2;
											Static81.anIntArrayArray7[local91 - 1][local80] = local254;
											break;
										}
										if ((local66[local97 - 1][local302 + local103] & 0x4FA40000) != 0) {
											break;
										}
										local302++;
									}
								}
								if (local91 < 128 - arg2 && Static210.anIntArrayArray24[local91 + 1][local80] == 0 && (local66[local97 + arg2][local103] & 0x60E40000) == 0 && (local66[arg2 + local97][arg2 + local103 - 1] & 0x78240000) == 0) {
									local302 = 1;
									while (true) {
										if (local302 >= arg2 - 1) {
											Static355.anIntArray476[local61] = local7 + 1;
											Static366.anIntArray494[local61] = local9;
											Static210.anIntArrayArray24[local91 + 1][local80] = 8;
											local61 = local61 + 1 & 0xFFF;
											Static81.anIntArrayArray7[local91 + 1][local80] = local254;
											break;
										}
										if ((local66[local97 + arg2][local302 + local103] & 0x78E40000) != 0) {
											break;
										}
										local302++;
									}
								}
								if (local80 > 0 && Static210.anIntArrayArray24[local91][local80 - 1] == 0 && (local66[local97][local103 - 1] & 0x43A40000) == 0 && (local66[local97 + arg2 - 1][local103 - 1] & 0x60E40000) == 0) {
									local302 = 1;
									while (true) {
										if (local302 >= arg2 - 1) {
											Static355.anIntArray476[local61] = local7;
											Static366.anIntArray494[local61] = local9 - 1;
											local61 = local61 + 1 & 0xFFF;
											Static210.anIntArrayArray24[local91][local80 - 1] = 1;
											Static81.anIntArrayArray7[local91][local80 - 1] = local254;
											break;
										}
										if ((local66[local302 + local97][local103 - 1] & 0x63E40000) != 0) {
											break;
										}
										local302++;
									}
								}
								if (128 - arg2 > local80 && Static210.anIntArrayArray24[local91][local80 + 1] == 0 && (local66[local97][arg2 + local103] & 0x4E240000) == 0 && (local66[arg2 + local97 - 1][local103 + arg2] & 0x78240000) == 0) {
									local302 = 1;
									while (true) {
										if (arg2 - 1 <= local302) {
											Static355.anIntArray476[local61] = local7;
											Static366.anIntArray494[local61] = local9 + 1;
											Static210.anIntArrayArray24[local91][local80 + 1] = 4;
											local61 = local61 + 1 & 0xFFF;
											Static81.anIntArrayArray7[local91][local80 + 1] = local254;
											break;
										}
										if ((local66[local97 + local302][arg2 + local103] & 0x7E240000) != 0) {
											break;
										}
										local302++;
									}
								}
								if (local91 > 0 && local80 > 0 && Static210.anIntArrayArray24[local91 - 1][local80 - 1] == 0 && (local66[local97 - 1][local103 - 1] & 0x43A40000) == 0) {
									local302 = 1;
									while (true) {
										if (arg2 <= local302) {
											Static355.anIntArray476[local61] = local7 - 1;
											Static366.anIntArray494[local61] = local9 - 1;
											local61 = local61 + 1 & 0xFFF;
											Static210.anIntArrayArray24[local91 - 1][local80 - 1] = 3;
											Static81.anIntArrayArray7[local91 - 1][local80 - 1] = local254;
											break;
										}
										if ((local66[local97 - 1][local302 + local103 - 1] & 0x4FA40000) != 0 || (local66[local302 + local97 - 1][local103 - 1] & 0x63E40000) != 0) {
											break;
										}
										local302++;
									}
								}
								if (128 - arg2 > local91 && local80 > 0 && Static210.anIntArrayArray24[local91 + 1][local80 - 1] == 0 && (local66[local97 + arg2][local103 - 1] & 0x60E40000) == 0) {
									local302 = 1;
									while (true) {
										if (local302 >= arg2) {
											Static355.anIntArray476[local61] = local7 + 1;
											Static366.anIntArray494[local61] = local9 - 1;
											local61 = local61 + 1 & 0xFFF;
											Static210.anIntArrayArray24[local91 + 1][local80 - 1] = 9;
											Static81.anIntArrayArray7[local91 + 1][local80 - 1] = local254;
											break;
										}
										if ((local66[arg2 + local97][local302 + local103 - 1] & 0x78E40000) != 0 || (local66[local302 + local97][local103 - 1] & 0x63E40000) != 0) {
											break;
										}
										local302++;
									}
								}
								if (local91 > 0 && local80 < 128 - arg2 && Static210.anIntArrayArray24[local91 - 1][local80 + 1] == 0 && (local66[local97 - 1][arg2 + local103] & 0x4E240000) == 0) {
									for (local302 = 1; local302 < arg2; local302++) {
										if ((local66[local97 - 1][local103 + local302] & 0x4FA40000) != 0 || (local66[local302 + local97 - 1][arg2 + local103] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static355.anIntArray476[local61] = local7 - 1;
									Static366.anIntArray494[local61] = local9 + 1;
									local61 = local61 + 1 & 0xFFF;
									Static210.anIntArrayArray24[local91 - 1][local80 + 1] = 6;
									Static81.anIntArrayArray7[local91 - 1][local80 + 1] = local254;
								}
							} while (local91 >= 128 - arg2);
						} while (local80 >= 128 - arg2);
					} while (Static210.anIntArrayArray24[local91 + 1][local80 + 1] != 0);
				} while ((local66[local97 + arg2][local103 + arg2] & 0x78240000) != 0);
				for (local302 = 1; local302 < arg2; local302++) {
					if ((local66[local97 + local302][arg2 + local103] & 0x7E240000) != 0 || (local66[local97 + arg2][local103 + local302] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static355.anIntArray476[local61] = local7 + 1;
				Static366.anIntArray494[local61] = local9 + 1;
				local61 = local61 + 1 & 0xFFF;
				Static210.anIntArrayArray24[local91 + 1][local80 + 1] = 12;
				Static81.anIntArrayArray7[local91 + 1][local80 + 1] = local254;
			}
		}
	}
}
