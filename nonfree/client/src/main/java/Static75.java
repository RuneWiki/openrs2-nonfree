import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dq", name = "X", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!dq", name = "Z", descriptor = "Lclient!oj;")
	public static Class48 aClass48_3;

	@OriginalMember(owner = "client!dq", name = "ab", descriptor = "Lclient!rg;")
	public static Class27 aClass27_8;

	@OriginalMember(owner = "client!dq", name = "U", descriptor = "S")
	public static short aShort31 = 205;

	@OriginalMember(owner = "client!dq", name = "Y", descriptor = "[I")
	public static final int[] anIntArray125 = new int[5];

	@OriginalMember(owner = "client!dq", name = "bb", descriptor = "[I")
	public static final int[] anIntArray126 = new int[32];

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
	public static void method1312() {
		if (Static220.anInt4431 == 0) {
			return;
		}
		try {
			if (++Static22.anInt338 > 1500) {
				if (Static386.aClass226_4 != null) {
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
				}
				if (Static193.anInt4024 >= 1) {
					Static220.anInt4431 = 0;
					Static228.anInt4595 = -5;
					return;
				}
				Static220.anInt4431 = 1;
				if (Static292.anInt5460 == Static327.anInt6033) {
					Static292.anInt5460 = Static236.anInt4682;
				} else {
					Static292.anInt5460 = Static327.anInt6033;
				}
				Static193.anInt4024++;
				Static22.anInt338 = 0;
			}
			if (Static220.anInt4431 == 1) {
				Static228.aClass86_7 = Static154.aClass123_2.method3269(Static292.anInt5460, Static79.aString18);
				Static220.anInt4431 = 2;
			}
			@Pc(120) int local120;
			if (Static220.anInt4431 == 2) {
				if (Static228.aClass86_7.anInt2590 == 2) {
					throw new IOException();
				}
				if (Static228.aClass86_7.anInt2590 != 1) {
					return;
				}
				Static386.aClass226_4 = new Class226((Socket) Static228.aClass86_7.anObject2, Static154.aClass123_2);
				Static228.aClass86_7 = null;
				Static386.aClass226_4.method5549(Static76.aClass2_Sub24_Sub2_7.anInt6669, Static76.aClass2_Sub24_Sub2_7.aByteArray100);
				if (Static42.aClass89_1 != null) {
					Static42.aClass89_1.method5867();
				}
				if (Static157.aClass89_2 != null) {
					Static157.aClass89_2.method5867();
				}
				local120 = Static386.aClass226_4.method5547();
				if (Static42.aClass89_1 != null) {
					Static42.aClass89_1.method5867();
				}
				if (Static157.aClass89_2 != null) {
					Static157.aClass89_2.method5867();
				}
				if (local120 != 101) {
					Static220.anInt4431 = 0;
					Static228.anInt4595 = local120;
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
					return;
				}
				Static220.anInt4431 = 3;
			}
			if (Static220.anInt4431 == 3 && Static386.aClass226_4.method5550() >= 2) {
				local120 = Static386.aClass226_4.method5547() << 8 | Static386.aClass226_4.method5547();
				Static140.method2410(local120);
				if (Static4.anInt134 == -1) {
					Static220.anInt4431 = 0;
					Static228.anInt4595 = 6;
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
				} else {
					Static220.anInt4431 = 0;
					Static386.aClass226_4.method5543();
					Static386.aClass226_4 = null;
					Static343.method5493();
				}
			}
		} catch (@Pc(207) IOException local207) {
			if (Static386.aClass226_4 != null) {
				Static386.aClass226_4.method5543();
				Static386.aClass226_4 = null;
			}
			if (Static193.anInt4024 >= 1) {
				Static228.anInt4595 = -4;
				Static220.anInt4431 = 0;
			} else {
				if (Static292.anInt5460 == Static327.anInt6033) {
					Static292.anInt5460 = Static236.anInt4682;
				} else {
					Static292.anInt5460 = Static327.anInt6033;
				}
				Static220.anInt4431 = 1;
				Static22.anInt338 = 0;
				Static193.anInt4024++;
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)I")
	public static int method1313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = (arg1 * (arg2 & 0xFF00FF) & 0xFF00FF00 | (arg2 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
		@Pc(31) int local31 = 255 - arg1;
		return (((arg0 & 0xFF00FF) * local31 & 0xFF00FF00 | (arg0 & 0xFF00) * local31 & 0xFF0000) >>> 8) + local26;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIIILclient!pe;IIII)Z")
	public static boolean method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class178 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(12) int local12 = arg5;
		@Pc(14) int local14 = arg0;
		@Pc(23) int local23 = arg5 - 64;
		Static233.anIntArrayArray31[64][64] = 99;
		@Pc(34) int local34 = arg0 - 64;
		Static39.anIntArrayArray5[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static326.anIntArray523[0] = arg5;
		@Pc(51) int local51 = local42 + 1;
		Static313.anIntArray503[0] = arg0;
		@Pc(56) int[][] local56 = arg7.anIntArrayArray34;
		while (true) {
			label282: while (true) {
				@Pc(81) int local81;
				@Pc(76) int local76;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(240) int local240;
				@Pc(280) int local280;
				do {
					do {
						do {
							label259: do {
								if (local51 == local44) {
									Static123.anInt5934 = local14;
									Static15.anInt269 = local12;
									return false;
								}
								local14 = Static313.anIntArray503[local44];
								local12 = Static326.anIntArray523[local44];
								local44 = local44 + 1 & 0xFFF;
								local76 = local14 - local34;
								local81 = local12 - local23;
								local87 = local12 - arg7.anInt4991;
								local93 = local14 - arg7.anInt4995;
								if (arg8 == -4) {
									if (arg2 == local12 && local14 == arg1) {
										Static123.anInt5934 = local14;
										Static15.anInt269 = local12;
										return true;
									}
								} else if (arg8 == -3) {
									if (Static207.method3777(arg4, arg2, local12, arg1, local14, arg10, arg3, arg3)) {
										Static123.anInt5934 = local14;
										Static15.anInt269 = local12;
										return true;
									}
								} else if (arg8 == -2) {
									if (arg7.method4477(arg10, arg3, arg9, arg1, local14, arg4, local12, arg2, arg3)) {
										Static15.anInt269 = local12;
										Static123.anInt5934 = local14;
										return true;
									}
								} else if (arg8 == -1) {
									if (arg7.method4478(local12, arg1, arg3, local14, arg9, arg2, arg10, arg4)) {
										Static123.anInt5934 = local14;
										Static15.anInt269 = local12;
										return true;
									}
								} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
									if (arg7.method4474(arg6, local14, arg1, arg8, arg2, arg3, local12)) {
										Static15.anInt269 = local12;
										Static123.anInt5934 = local14;
										return true;
									}
								} else if (arg7.method4475(local12, arg1, arg6, arg2, local14, arg3, arg8)) {
									Static123.anInt5934 = local14;
									Static15.anInt269 = local12;
									return true;
								}
								local240 = Static39.anIntArrayArray5[local81][local76] + 1;
								if (local81 > 0 && Static233.anIntArrayArray31[local81 - 1][local76] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + arg3 - 1] & 0x4E240000) == 0) {
									local280 = 1;
									while (true) {
										if (local280 >= arg3 - 1) {
											Static326.anIntArray523[local51] = local12 - 1;
											Static313.anIntArray503[local51] = local14;
											Static233.anIntArrayArray31[local81 - 1][local76] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static39.anIntArrayArray5[local81 - 1][local76] = local240;
											break;
										}
										if ((local56[local87 - 1][local93 + local280] & 0x4FA40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (128 - arg3 > local81 && Static233.anIntArrayArray31[local81 + 1][local76] == 0 && (local56[arg3 + local87][local93] & 0x60E40000) == 0 && (local56[local87 + arg3][arg3 + local93 - 1] & 0x78240000) == 0) {
									local280 = 1;
									while (true) {
										if (local280 >= arg3 - 1) {
											Static326.anIntArray523[local51] = local12 + 1;
											Static313.anIntArray503[local51] = local14;
											local51 = local51 + 1 & 0xFFF;
											Static233.anIntArrayArray31[local81 + 1][local76] = 8;
											Static39.anIntArrayArray5[local81 + 1][local76] = local240;
											break;
										}
										if ((local56[arg3 + local87][local280 + local93] & 0x78E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local76 > 0 && Static233.anIntArrayArray31[local81][local76 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[arg3 + local87 - 1][local93 - 1] & 0x60E40000) == 0) {
									local280 = 1;
									while (true) {
										if (local280 >= arg3 - 1) {
											Static326.anIntArray523[local51] = local12;
											Static313.anIntArray503[local51] = local14 - 1;
											Static233.anIntArrayArray31[local81][local76 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static39.anIntArrayArray5[local81][local76 - 1] = local240;
											break;
										}
										if ((local56[local87 + local280][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local76 < 128 - arg3 && Static233.anIntArrayArray31[local81][local76 + 1] == 0 && (local56[local87][arg3 + local93] & 0x4E240000) == 0 && (local56[local87 + arg3 - 1][local93 + arg3] & 0x78240000) == 0) {
									local280 = 1;
									while (true) {
										if (arg3 - 1 <= local280) {
											Static326.anIntArray523[local51] = local12;
											Static313.anIntArray503[local51] = local14 + 1;
											local51 = local51 + 1 & 0xFFF;
											Static233.anIntArrayArray31[local81][local76 + 1] = 4;
											Static39.anIntArrayArray5[local81][local76 + 1] = local240;
											break;
										}
										if ((local56[local87 + local280][local93 + arg3] & 0x7E240000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local81 > 0 && local76 > 0 && Static233.anIntArrayArray31[local81 - 1][local76 - 1] == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local280 = 1;
									while (true) {
										if (arg3 <= local280) {
											Static326.anIntArray523[local51] = local12 - 1;
											Static313.anIntArray503[local51] = local14 - 1;
											Static233.anIntArrayArray31[local81 - 1][local76 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static39.anIntArrayArray5[local81 - 1][local76 - 1] = local240;
											break;
										}
										if ((local56[local87 - 1][local93 + local280 - 1] & 0x4FA40000) != 0 || (local56[local87 + local280 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (128 - arg3 > local81 && local76 > 0 && Static233.anIntArrayArray31[local81 + 1][local76 - 1] == 0 && (local56[local87 + arg3][local93 - 1] & 0x60E40000) == 0) {
									local280 = 1;
									while (true) {
										if (local280 >= arg3) {
											Static326.anIntArray523[local51] = local12 + 1;
											Static313.anIntArray503[local51] = local14 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static233.anIntArrayArray31[local81 + 1][local76 - 1] = 9;
											Static39.anIntArrayArray5[local81 + 1][local76 - 1] = local240;
											break;
										}
										if ((local56[local87 + arg3][local93 + local280 - 1] & 0x78E40000) != 0 || (local56[local280 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local280++;
									}
								}
								if (local81 > 0 && 128 - arg3 > local76 && Static233.anIntArrayArray31[local81 - 1][local76 + 1] == 0 && (local56[local87 - 1][local93 + arg3] & 0x4E240000) == 0) {
									for (local280 = 1; local280 < arg3; local280++) {
										if ((local56[local87 - 1][local93 + local280] & 0x4FA40000) != 0 || (local56[local87 + local280 - 1][local93 + arg3] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static326.anIntArray523[local51] = local12 - 1;
									Static313.anIntArray503[local51] = local14 + 1;
									Static233.anIntArrayArray31[local81 - 1][local76 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static39.anIntArrayArray5[local81 - 1][local76 + 1] = local240;
								}
							} while (local81 >= 128 - arg3);
						} while (128 - arg3 <= local76);
					} while (Static233.anIntArrayArray31[local81 + 1][local76 + 1] != 0);
				} while ((local56[local87 + arg3][local93 + arg3] & 0x78240000) != 0);
				for (local280 = 1; local280 < arg3; local280++) {
					if ((local56[local280 + local87][arg3 + local93] & 0x7E240000) != 0 || (local56[arg3 + local87][local93 + local280] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static326.anIntArray523[local51] = local12 + 1;
				Static313.anIntArray503[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray31[local81 + 1][local76 + 1] = 12;
				Static39.anIntArrayArray5[local81 + 1][local76 + 1] = local240;
			}
		}
	}
}
