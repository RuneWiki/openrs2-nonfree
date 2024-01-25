import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "[I")
	public static int[] anIntArray471;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_80 = new Class187(75, 3);

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "Lclient!eo;")
	public static final Class102 aClass102_8 = new Class102();

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "Lclient!eb;")
	public static final Class89 aClass89_2 = new Class89(false);

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "Lclient!eb;")
	public static Class89 aClass89_1 = aClass89_2;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)V")
	public static void method7313(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static131.anInt2222 != -1) {
				Static46.method622(Static131.anInt2222);
			}
			for (@Pc(14) Class5_Sub4 local14 = (Class5_Sub4) Static131.aClass335_15.method7768(); local14 != null; local14 = (Class5_Sub4) Static131.aClass335_15.method7777()) {
				if (!local14.method8826()) {
					local14 = (Class5_Sub4) Static131.aClass335_15.method7768();
					if (local14 == null) {
						break;
					}
				}
				Static272.method3801(local14, false, true);
			}
			Static131.anInt2222 = -1;
			Static131.aClass335_15 = new Class335(8);
			Static535.method8699();
			Static131.anInt2222 = Static646.anInt10216;
			Static469.method6939(false);
			Static212.method3058();
			Static497.method7209(Static131.anInt2222);
		}
		Static159.aString25 = "";
		Static154.aString24 = "";
		Static598.aBoolean716 = false;
		Static220.method3126();
		Static54.anInt8558 = -1;
		Static52.method801(Static464.anInt8094);
		Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 = new Class41_Sub1_Sub1_Sub3_Sub2();
		Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 = Static64.anInt1015 * 512 / 2;
		Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0] = Static124.anInt2150 / 2;
		Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 = Static124.anInt2150 * 512 / 2;
		Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0] = Static64.anInt1015 / 2;
		Static105.anInt1868 = 0;
		Static570.anInt9347 = 0;
		if (Static133.anInt2254 == 2) {
			Static570.anInt9347 = Static514.anInt8683 << 9;
			Static105.anInt1868 = Static293.anInt4550 << 9;
		} else {
			Static362.method5336();
		}
		Static3.method39();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIIIILclient!mja;II)Z")
	public static boolean method7314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class234 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg4;
		@Pc(7) int local7 = arg3;
		@Pc(16) int local16 = arg4 - 64;
		Static435.anIntArrayArray55[64][64] = 99;
		@Pc(27) int local27 = arg3 - 64;
		Static507.anIntArrayArray69[64][64] = 0;
		@Pc(35) byte local35 = 0;
		@Pc(37) int local37 = 0;
		Static3.anIntArray1[0] = arg4;
		@Pc(44) int local44 = local35 + 1;
		Static110.anIntArray104[0] = arg3;
		@Pc(49) int[][] local49 = arg8.anIntArrayArray50;
		while (true) {
			label282: while (true) {
				@Pc(72) int local72;
				@Pc(68) int local68;
				@Pc(78) int local78;
				@Pc(84) int local84;
				@Pc(237) int local237;
				@Pc(277) int local277;
				do {
					do {
						do {
							label259: do {
								if (local37 == local44) {
									Static29.anInt404 = local5;
									Static498.anInt8492 = local7;
									return false;
								}
								local7 = Static110.anIntArray104[local37];
								local5 = Static3.anIntArray1[local37];
								local37 = local37 + 1 & 0xFFF;
								local68 = local7 - local27;
								local72 = local5 - local16;
								local78 = local5 - arg8.anInt6497;
								local84 = local7 - arg8.anInt6490;
								if (arg2 == -4) {
									if (local5 == arg7 && local7 == arg9) {
										Static29.anInt404 = local5;
										Static498.anInt8492 = local7;
										return true;
									}
								} else if (arg2 == -3) {
									if (Static329.method5103(arg1, arg1, arg5, local7, arg6, arg7, arg9, local5)) {
										Static498.anInt8492 = local7;
										Static29.anInt404 = local5;
										return true;
									}
								} else if (arg2 == -2) {
									if (arg8.method5442(arg7, arg5, arg1, local5, arg6, arg9, arg1, arg0, local7)) {
										Static29.anInt404 = local5;
										Static498.anInt8492 = local7;
										return true;
									}
								} else if (arg2 == -1) {
									if (arg8.method5457(arg9, arg5, local7, arg1, arg0, arg6, arg7, local5)) {
										Static498.anInt8492 = local7;
										Static29.anInt404 = local5;
										return true;
									}
								} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
									if (arg8.method5455(arg1, arg2, arg10, local5, local7, arg7, arg9)) {
										Static498.anInt8492 = local7;
										Static29.anInt404 = local5;
										return true;
									}
								} else if (arg8.method5446(arg10, arg2, arg9, arg7, arg1, local5, local7)) {
									Static29.anInt404 = local5;
									Static498.anInt8492 = local7;
									return true;
								}
								local237 = Static507.anIntArrayArray69[local72][local68] + 1;
								if (local72 > 0 && Static435.anIntArrayArray55[local72 - 1][local68] == 0 && (local49[local78 - 1][local84] & 0x43A40000) == 0 && (local49[local78 - 1][local84 + arg1 - 1] & 0x4E240000) == 0) {
									local277 = 1;
									while (true) {
										if (arg1 - 1 <= local277) {
											Static3.anIntArray1[local44] = local5 - 1;
											Static110.anIntArray104[local44] = local7;
											local44 = local44 + 1 & 0xFFF;
											Static435.anIntArrayArray55[local72 - 1][local68] = 2;
											Static507.anIntArrayArray69[local72 - 1][local68] = local237;
											break;
										}
										if ((local49[local78 - 1][local277 + local84] & 0x4FA40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local72 < 128 - arg1 && Static435.anIntArrayArray55[local72 + 1][local68] == 0 && (local49[local78 + arg1][local84] & 0x60E40000) == 0 && (local49[local78 + arg1][local84 + arg1 - 1] & 0x78240000) == 0) {
									local277 = 1;
									while (true) {
										if (local277 >= arg1 - 1) {
											Static3.anIntArray1[local44] = local5 + 1;
											Static110.anIntArray104[local44] = local7;
											Static435.anIntArrayArray55[local72 + 1][local68] = 8;
											local44 = local44 + 1 & 0xFFF;
											Static507.anIntArrayArray69[local72 + 1][local68] = local237;
											break;
										}
										if ((local49[local78 + arg1][local84 + local277] & 0x78E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local68 > 0 && Static435.anIntArrayArray55[local72][local68 - 1] == 0 && (local49[local78][local84 - 1] & 0x43A40000) == 0 && (local49[local78 + arg1 - 1][local84 - 1] & 0x60E40000) == 0) {
									local277 = 1;
									while (true) {
										if (local277 >= arg1 - 1) {
											Static3.anIntArray1[local44] = local5;
											Static110.anIntArray104[local44] = local7 - 1;
											Static435.anIntArrayArray55[local72][local68 - 1] = 1;
											local44 = local44 + 1 & 0xFFF;
											Static507.anIntArrayArray69[local72][local68 - 1] = local237;
											break;
										}
										if ((local49[local78 + local277][local84 - 1] & 0x63E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (128 - arg1 > local68 && Static435.anIntArrayArray55[local72][local68 + 1] == 0 && (local49[local78][local84 + arg1] & 0x4E240000) == 0 && (local49[arg1 + local78 - 1][local84 + arg1] & 0x78240000) == 0) {
									local277 = 1;
									while (true) {
										if (arg1 - 1 <= local277) {
											Static3.anIntArray1[local44] = local5;
											Static110.anIntArray104[local44] = local7 + 1;
											local44 = local44 + 1 & 0xFFF;
											Static435.anIntArrayArray55[local72][local68 + 1] = 4;
											Static507.anIntArrayArray69[local72][local68 + 1] = local237;
											break;
										}
										if ((local49[local78 + local277][arg1 + local84] & 0x7E240000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local72 > 0 && local68 > 0 && Static435.anIntArrayArray55[local72 - 1][local68 - 1] == 0 && (local49[local78 - 1][local84 - 1] & 0x43A40000) == 0) {
									local277 = 1;
									while (true) {
										if (arg1 <= local277) {
											Static3.anIntArray1[local44] = local5 - 1;
											Static110.anIntArray104[local44] = local7 - 1;
											Static435.anIntArrayArray55[local72 - 1][local68 - 1] = 3;
											local44 = local44 + 1 & 0xFFF;
											Static507.anIntArrayArray69[local72 - 1][local68 - 1] = local237;
											break;
										}
										if ((local49[local78 - 1][local277 + local84 - 1] & 0x4FA40000) != 0 || (local49[local277 + local78 - 1][local84 - 1] & 0x63E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (128 - arg1 > local72 && local68 > 0 && Static435.anIntArrayArray55[local72 + 1][local68 - 1] == 0 && (local49[arg1 + local78][local84 - 1] & 0x60E40000) == 0) {
									local277 = 1;
									while (true) {
										if (arg1 <= local277) {
											Static3.anIntArray1[local44] = local5 + 1;
											Static110.anIntArray104[local44] = local7 - 1;
											Static435.anIntArrayArray55[local72 + 1][local68 - 1] = 9;
											local44 = local44 + 1 & 0xFFF;
											Static507.anIntArrayArray69[local72 + 1][local68 - 1] = local237;
											break;
										}
										if ((local49[arg1 + local78][local277 + local84 - 1] & 0x78E40000) != 0 || (local49[local78 + local277][local84 - 1] & 0x63E40000) != 0) {
											break;
										}
										local277++;
									}
								}
								if (local72 > 0 && local68 < 128 - arg1 && Static435.anIntArrayArray55[local72 - 1][local68 + 1] == 0 && (local49[local78 - 1][arg1 + local84] & 0x4E240000) == 0) {
									for (local277 = 1; local277 < arg1; local277++) {
										if ((local49[local78 - 1][local84 + local277] & 0x4FA40000) != 0 || (local49[local78 + local277 - 1][arg1 + local84] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static3.anIntArray1[local44] = local5 - 1;
									Static110.anIntArray104[local44] = local7 + 1;
									local44 = local44 + 1 & 0xFFF;
									Static435.anIntArrayArray55[local72 - 1][local68 + 1] = 6;
									Static507.anIntArrayArray69[local72 - 1][local68 + 1] = local237;
								}
							} while (128 - arg1 <= local72);
						} while (local68 >= 128 - arg1);
					} while (Static435.anIntArrayArray55[local72 + 1][local68 + 1] != 0);
				} while ((local49[arg1 + local78][arg1 + local84] & 0x78240000) != 0);
				for (local277 = 1; local277 < arg1; local277++) {
					if ((local49[local277 + local78][arg1 + local84] & 0x7E240000) != 0 || (local49[local78 + arg1][local277 + local84] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static3.anIntArray1[local44] = local5 + 1;
				Static110.anIntArray104[local44] = local7 + 1;
				local44 = local44 + 1 & 0xFFF;
				Static435.anIntArrayArray55[local72 + 1][local68 + 1] = 12;
				Static507.anIntArrayArray69[local72 + 1][local68 + 1] = local237;
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)Lclient!ep;")
	public static Class103 method7315(@OriginalArg(1) int arg0) {
		@Pc(6) Class103[] local6 = Static423.method6422();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(13) Class103 local13 = local6[local8];
			if (local13.anInt2290 == arg0) {
				return local13;
			}
		}
		return null;
	}
}
