import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!ci", name = "G", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
	public static int anInt1256 = 0;

	@OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
	public static int anInt1259 = -1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIBIIIIIILclient!bm;)Z")
	public static boolean method1078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class23 arg10) {
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg4;
		@Pc(16) int local16 = arg0 - 64;
		Static184.anIntArrayArray30[64][64] = 99;
		@Pc(27) int local27 = arg4 - 64;
		Static438.anIntArrayArray65[64][64] = 0;
		@Pc(43) byte local43 = 0;
		Static342.anIntArray456[0] = arg0;
		@Pc(49) int local49 = 0;
		@Pc(52) int local52 = local43 + 1;
		Static209.anIntArray314[0] = arg4;
		@Pc(57) int[][] local57 = arg10.anIntArrayArray4;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(75) int local75;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(247) int local247;
				@Pc(289) int local289;
				do {
					do {
						do {
							label259: do {
								if (local49 == local52) {
									Static402.anInt7002 = local7;
									Static304.anInt5567 = local5;
									return false;
								}
								local7 = Static209.anIntArray314[local49];
								local5 = Static342.anIntArray456[local49];
								local71 = local5 - local16;
								local75 = local7 - local27;
								local49 = local49 + 1 & 0xFFF;
								local87 = local5 - arg10.anInt923;
								local93 = local7 - arg10.anInt926;
								if (arg5 == -4) {
									if (arg2 == local5 && local7 == arg7) {
										Static304.anInt5567 = local5;
										Static402.anInt7002 = local7;
										return true;
									}
								} else if (arg5 == -3) {
									if (Static79.method1399(arg2, arg7, arg9, arg1, arg8, local5, arg8, local7)) {
										Static402.anInt7002 = local7;
										Static304.anInt5567 = local5;
										return true;
									}
								} else if (arg5 == -2) {
									if (arg10.method817(arg2, local5, arg6, arg8, arg8, arg9, arg7, local7, arg1)) {
										Static402.anInt7002 = local7;
										Static304.anInt5567 = local5;
										return true;
									}
								} else if (arg5 == -1) {
									if (arg10.method823(arg7, arg6, local5, local7, arg2, arg9, arg8, arg1)) {
										Static402.anInt7002 = local7;
										Static304.anInt5567 = local5;
										return true;
									}
								} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
									if (arg10.method831(arg5, arg2, arg3, local7, arg8, local5, arg7)) {
										Static402.anInt7002 = local7;
										Static304.anInt5567 = local5;
										return true;
									}
								} else if (arg10.method819(arg8, arg7, arg3, local7, arg2, local5, arg5)) {
									Static304.anInt5567 = local5;
									Static402.anInt7002 = local7;
									return true;
								}
								local247 = Static438.anIntArrayArray65[local71][local75] + 1;
								if (local71 > 0 && Static184.anIntArrayArray30[local71 - 1][local75] == 0 && (local57[local87 - 1][local93] & 0x43A40000) == 0 && (local57[local87 - 1][arg8 + local93 - 1] & 0x4E240000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg8 - 1) {
											Static342.anIntArray456[local52] = local5 - 1;
											Static209.anIntArray314[local52] = local7;
											Static184.anIntArrayArray30[local71 - 1][local75] = 2;
											local52 = local52 + 1 & 0xFFF;
											Static438.anIntArrayArray65[local71 - 1][local75] = local247;
											break;
										}
										if ((local57[local87 - 1][local289 + local93] & 0x4FA40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local71 < 128 - arg8 && Static184.anIntArrayArray30[local71 + 1][local75] == 0 && (local57[local87 + arg8][local93] & 0x60E40000) == 0 && (local57[local87 + arg8][local93 + arg8 - 1] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (arg8 - 1 <= local289) {
											Static342.anIntArray456[local52] = local5 + 1;
											Static209.anIntArray314[local52] = local7;
											local52 = local52 + 1 & 0xFFF;
											Static184.anIntArrayArray30[local71 + 1][local75] = 8;
											Static438.anIntArrayArray65[local71 + 1][local75] = local247;
											break;
										}
										if ((local57[local87 + arg8][local289 + local93] & 0x78E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local75 > 0 && Static184.anIntArrayArray30[local71][local75 - 1] == 0 && (local57[local87][local93 - 1] & 0x43A40000) == 0 && (local57[arg8 + local87 - 1][local93 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg8 - 1) {
											Static342.anIntArray456[local52] = local5;
											Static209.anIntArray314[local52] = local7 - 1;
											Static184.anIntArrayArray30[local71][local75 - 1] = 1;
											local52 = local52 + 1 & 0xFFF;
											Static438.anIntArrayArray65[local71][local75 - 1] = local247;
											break;
										}
										if ((local57[local289 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local75 < 128 - arg8 && Static184.anIntArrayArray30[local71][local75 + 1] == 0 && (local57[local87][arg8 + local93] & 0x4E240000) == 0 && (local57[arg8 + local87 - 1][local93 + arg8] & 0x78240000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg8 - 1) {
											Static342.anIntArray456[local52] = local5;
											Static209.anIntArray314[local52] = local7 + 1;
											local52 = local52 + 1 & 0xFFF;
											Static184.anIntArrayArray30[local71][local75 + 1] = 4;
											Static438.anIntArrayArray65[local71][local75 + 1] = local247;
											break;
										}
										if ((local57[local289 + local87][arg8 + local93] & 0x7E240000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local71 > 0 && local75 > 0 && Static184.anIntArrayArray30[local71 - 1][local75 - 1] == 0 && (local57[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local289 = 1;
									while (true) {
										if (arg8 <= local289) {
											Static342.anIntArray456[local52] = local5 - 1;
											Static209.anIntArray314[local52] = local7 - 1;
											local52 = local52 + 1 & 0xFFF;
											Static184.anIntArrayArray30[local71 - 1][local75 - 1] = 3;
											Static438.anIntArrayArray65[local71 - 1][local75 - 1] = local247;
											break;
										}
										if ((local57[local87 - 1][local93 + local289 - 1] & 0x4FA40000) != 0 || (local57[local87 + local289 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local71 < 128 - arg8 && local75 > 0 && Static184.anIntArrayArray30[local71 + 1][local75 - 1] == 0 && (local57[arg8 + local87][local93 - 1] & 0x60E40000) == 0) {
									local289 = 1;
									while (true) {
										if (local289 >= arg8) {
											Static342.anIntArray456[local52] = local5 + 1;
											Static209.anIntArray314[local52] = local7 - 1;
											local52 = local52 + 1 & 0xFFF;
											Static184.anIntArrayArray30[local71 + 1][local75 - 1] = 9;
											Static438.anIntArrayArray65[local71 + 1][local75 - 1] = local247;
											break;
										}
										if ((local57[local87 + arg8][local93 + local289 - 1] & 0x78E40000) != 0 || (local57[local87 + local289][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local289++;
									}
								}
								if (local71 > 0 && 128 - arg8 > local75 && Static184.anIntArrayArray30[local71 - 1][local75 + 1] == 0 && (local57[local87 - 1][arg8 + local93] & 0x4E240000) == 0) {
									for (local289 = 1; local289 < arg8; local289++) {
										if ((local57[local87 - 1][local289 + local93] & 0x4FA40000) != 0 || (local57[local289 + local87 - 1][arg8 + local93] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static342.anIntArray456[local52] = local5 - 1;
									Static209.anIntArray314[local52] = local7 + 1;
									Static184.anIntArrayArray30[local71 - 1][local75 + 1] = 6;
									local52 = local52 + 1 & 0xFFF;
									Static438.anIntArrayArray65[local71 - 1][local75 + 1] = local247;
								}
							} while (128 - arg8 <= local71);
						} while (128 - arg8 <= local75);
					} while (Static184.anIntArrayArray30[local71 + 1][local75 + 1] != 0);
				} while ((local57[arg8 + local87][local93 + arg8] & 0x78240000) != 0);
				for (local289 = 1; local289 < arg8; local289++) {
					if ((local57[local289 + local87][arg8 + local93] & 0x7E240000) != 0 || (local57[arg8 + local87][local289 + local93] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static342.anIntArray456[local52] = local5 + 1;
				Static209.anIntArray314[local52] = local7 + 1;
				Static184.anIntArrayArray30[local71 + 1][local75 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static438.anIntArrayArray65[local71 + 1][local75 + 1] = local247;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)[Lclient!dg;")
	public static Class49[] method1080() {
		return new Class49[] { Static410.aClass49_1, Static410.aClass49_2, Static410.aClass49_3, Static410.aClass49_4, Static410.aClass49_5, Static410.aClass49_6, Static410.aClass49_7, Static410.aClass49_8, Static410.aClass49_9, Static410.aClass49_10 };
	}
}
