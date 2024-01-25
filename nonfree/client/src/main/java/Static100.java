import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "J")
	public static long aLong63 = 0L;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!ii;IIIIIIIIIII)Z")
	public static boolean method1535(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(7) int local7 = arg10;
		@Pc(9) int local9 = arg2;
		@Pc(24) int local24 = arg10 - 64;
		Static238.anIntArrayArray33[64][64] = 99;
		@Pc(35) int local35 = arg2 - 64;
		Static617.anIntArrayArray59[64][64] = 0;
		@Pc(43) byte local43 = 0;
		Static272.anIntArray266[0] = arg10;
		@Pc(49) int local49 = 0;
		@Pc(52) int local52 = local43 + 1;
		Static403.anIntArray393[0] = arg2;
		@Pc(57) int[][] local57 = arg0.anIntArrayArray34;
		while (true) {
			label282: while (true) {
				@Pc(78) int local78;
				@Pc(82) int local82;
				@Pc(87) int local87;
				@Pc(92) int local92;
				@Pc(265) int local265;
				@Pc(313) int local313;
				do {
					do {
						do {
							label259: do {
								if (local49 == local52) {
									Static458.anInt7397 = local7;
									Static388.anInt6572 = local9;
									return false;
								}
								local7 = Static272.anIntArray266[local49];
								local9 = Static403.anIntArray393[local49];
								local49 = local49 + 1 & 0xFFF;
								local78 = local7 - local24;
								local82 = local9 - local35;
								local87 = local7 - arg0.anInt4219;
								local92 = local9 - arg0.anInt4229;
								if (arg1 == -4) {
									if (arg8 == local7 && arg5 == local9) {
										Static388.anInt6572 = local9;
										Static458.anInt7397 = local7;
										return true;
									}
								} else if (arg1 == -3) {
									if (Static570.method7683(local7, arg6, arg4, arg4, local9, arg5, arg8, arg7)) {
										Static458.anInt7397 = local7;
										Static388.anInt6572 = local9;
										return true;
									}
								} else if (arg1 == -2) {
									if (arg0.method3866(arg7, arg3, local7, arg4, local9, arg8, arg6, arg4, arg5)) {
										Static388.anInt6572 = local9;
										Static458.anInt7397 = local7;
										return true;
									}
								} else if (arg1 == -1) {
									if (arg0.method3868(arg7, arg6, local7, local9, arg5, arg3, arg8, arg4)) {
										Static458.anInt7397 = local7;
										Static388.anInt6572 = local9;
										return true;
									}
								} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
									if (arg0.method3873(arg8, arg5, arg1, arg9, local7, arg4, local9)) {
										Static458.anInt7397 = local7;
										Static388.anInt6572 = local9;
										return true;
									}
								} else if (arg0.method3863(arg8, local7, arg9, arg5, arg1, arg4, local9)) {
									Static458.anInt7397 = local7;
									Static388.anInt6572 = local9;
									return true;
								}
								local265 = Static617.anIntArrayArray59[local78][local82] + 1;
								if (local78 > 0 && Static238.anIntArrayArray33[local78 - 1][local82] == 0 && (local57[local87 - 1][local92] & 0x43A40000) == 0 && (local57[local87 - 1][arg4 + local92 - 1] & 0x4E240000) == 0) {
									local313 = 1;
									while (true) {
										if (local313 >= arg4 - 1) {
											Static272.anIntArray266[local52] = local7 - 1;
											Static403.anIntArray393[local52] = local9;
											local52 = local52 + 1 & 0xFFF;
											Static238.anIntArrayArray33[local78 - 1][local82] = 2;
											Static617.anIntArrayArray59[local78 - 1][local82] = local265;
											break;
										}
										if ((local57[local87 - 1][local313 + local92] & 0x4FA40000) != 0) {
											break;
										}
										local313++;
									}
								}
								if (local78 < 128 - arg4 && Static238.anIntArrayArray33[local78 + 1][local82] == 0 && (local57[local87 + arg4][local92] & 0x60E40000) == 0 && (local57[local87 + arg4][local92 + arg4 - 1] & 0x78240000) == 0) {
									local313 = 1;
									while (true) {
										if (arg4 - 1 <= local313) {
											Static272.anIntArray266[local52] = local7 + 1;
											Static403.anIntArray393[local52] = local9;
											Static238.anIntArrayArray33[local78 + 1][local82] = 8;
											local52 = local52 + 1 & 0xFFF;
											Static617.anIntArrayArray59[local78 + 1][local82] = local265;
											break;
										}
										if ((local57[local87 + arg4][local92 + local313] & 0x78E40000) != 0) {
											break;
										}
										local313++;
									}
								}
								if (local82 > 0 && Static238.anIntArrayArray33[local78][local82 - 1] == 0 && (local57[local87][local92 - 1] & 0x43A40000) == 0 && (local57[local87 + arg4 - 1][local92 - 1] & 0x60E40000) == 0) {
									local313 = 1;
									while (true) {
										if (arg4 - 1 <= local313) {
											Static272.anIntArray266[local52] = local7;
											Static403.anIntArray393[local52] = local9 - 1;
											Static238.anIntArrayArray33[local78][local82 - 1] = 1;
											local52 = local52 + 1 & 0xFFF;
											Static617.anIntArrayArray59[local78][local82 - 1] = local265;
											break;
										}
										if ((local57[local313 + local87][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local313++;
									}
								}
								if (local82 < 128 - arg4 && Static238.anIntArrayArray33[local78][local82 + 1] == 0 && (local57[local87][arg4 + local92] & 0x4E240000) == 0 && (local57[local87 + arg4 - 1][local92 + arg4] & 0x78240000) == 0) {
									local313 = 1;
									while (true) {
										if (arg4 - 1 <= local313) {
											Static272.anIntArray266[local52] = local7;
											Static403.anIntArray393[local52] = local9 + 1;
											Static238.anIntArrayArray33[local78][local82 + 1] = 4;
											local52 = local52 + 1 & 0xFFF;
											Static617.anIntArrayArray59[local78][local82 + 1] = local265;
											break;
										}
										if ((local57[local313 + local87][local92 + arg4] & 0x7E240000) != 0) {
											break;
										}
										local313++;
									}
								}
								if (local78 > 0 && local82 > 0 && Static238.anIntArrayArray33[local78 - 1][local82 - 1] == 0 && (local57[local87 - 1][local92 - 1] & 0x43A40000) == 0) {
									local313 = 1;
									while (true) {
										if (local313 >= arg4) {
											Static272.anIntArray266[local52] = local7 - 1;
											Static403.anIntArray393[local52] = local9 - 1;
											Static238.anIntArrayArray33[local78 - 1][local82 - 1] = 3;
											local52 = local52 + 1 & 0xFFF;
											Static617.anIntArrayArray59[local78 - 1][local82 - 1] = local265;
											break;
										}
										if ((local57[local87 - 1][local92 + local313 - 1] & 0x4FA40000) != 0 || (local57[local313 + local87 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local313++;
									}
								}
								if (128 - arg4 > local78 && local82 > 0 && Static238.anIntArrayArray33[local78 + 1][local82 - 1] == 0 && (local57[arg4 + local87][local92 - 1] & 0x60E40000) == 0) {
									local313 = 1;
									while (true) {
										if (arg4 <= local313) {
											Static272.anIntArray266[local52] = local7 + 1;
											Static403.anIntArray393[local52] = local9 - 1;
											Static238.anIntArrayArray33[local78 + 1][local82 - 1] = 9;
											local52 = local52 + 1 & 0xFFF;
											Static617.anIntArrayArray59[local78 + 1][local82 - 1] = local265;
											break;
										}
										if ((local57[local87 + arg4][local313 + local92 - 1] & 0x78E40000) != 0 || (local57[local313 + local87][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local313++;
									}
								}
								if (local78 > 0 && 128 - arg4 > local82 && Static238.anIntArrayArray33[local78 - 1][local82 + 1] == 0 && (local57[local87 - 1][arg4 + local92] & 0x4E240000) == 0) {
									for (local313 = 1; local313 < arg4; local313++) {
										if ((local57[local87 - 1][local313 + local92] & 0x4FA40000) != 0 || (local57[local313 + local87 - 1][local92 + arg4] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static272.anIntArray266[local52] = local7 - 1;
									Static403.anIntArray393[local52] = local9 + 1;
									local52 = local52 + 1 & 0xFFF;
									Static238.anIntArrayArray33[local78 - 1][local82 + 1] = 6;
									Static617.anIntArrayArray59[local78 - 1][local82 + 1] = local265;
								}
							} while (128 - arg4 <= local78);
						} while (128 - arg4 <= local82);
					} while (Static238.anIntArrayArray33[local78 + 1][local82 + 1] != 0);
				} while ((local57[arg4 + local87][arg4 + local92] & 0x78240000) != 0);
				for (local313 = 1; local313 < arg4; local313++) {
					if ((local57[local313 + local87][local92 + arg4] & 0x7E240000) != 0 || (local57[local87 + arg4][local92 + local313] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static272.anIntArray266[local52] = local7 + 1;
				Static403.anIntArray393[local52] = local9 + 1;
				Static238.anIntArrayArray33[local78 + 1][local82 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static617.anIntArrayArray59[local78 + 1][local82 + 1] = local265;
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!mj;Z)V")
	public static void method1536(@OriginalArg(0) Class238 arg0) {
		if (arg0.anInt5976 == 5 && arg0.anInt5990 != -1) {
			Static204.method3364(arg0, Static273.aClass100_6);
		}
	}
}
