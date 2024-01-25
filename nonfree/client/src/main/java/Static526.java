import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public static int anInt8805;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!pw;")
	public static final Class261 aClass261_10 = new Class261("", 16);

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	public static int anInt8810 = 0;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "J")
	public static long aLong237 = 0L;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)Z")
	public static boolean method7213(@OriginalArg(0) boolean arg0) {
		@Pc(22) boolean local22 = Static240.aClass14_7.method6887();
		if (local22 == arg0) {
			return true;
		}
		if (!arg0) {
			Static240.aClass14_7.method6881();
		} else if (!Static240.aClass14_7.method6846()) {
			arg0 = false;
		}
		if (arg0 == local22) {
			return false;
		} else {
			Static140.aClass6_Sub48_Sub1_1.aBoolean682 = arg0;
			Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
			return true;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Z")
	public static boolean method7214() {
		if (Static301.aBoolean391) {
			try {
				if ((Boolean) Static608.method4639(Static249.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIILclient!ld;IIIBIII)Z")
	public static boolean method7215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class189 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg10;
		@Pc(23) int local23 = arg2 - 64;
		@Pc(28) int local28 = arg10 - 64;
		Static85.anIntArrayArray13[64][64] = 99;
		Static39.anIntArrayArray40[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static292.anIntArray406[0] = arg2;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static127.anIntArray174[0] = arg10;
		@Pc(56) int[][] local56 = arg4.anIntArrayArray43;
		while (true) {
			label282: while (true) {
				@Pc(75) int local75;
				@Pc(71) int local71;
				@Pc(86) int local86;
				@Pc(92) int local92;
				@Pc(241) int local241;
				@Pc(286) int local286;
				do {
					do {
						do {
							label259: do {
								if (local48 == local51) {
									Static362.anInt6349 = local7;
									Static524.anInt8784 = local9;
									return false;
								}
								local9 = Static127.anIntArray174[local48];
								local7 = Static292.anIntArray406[local48];
								local71 = local9 - local28;
								local75 = local7 - local23;
								local48 = local48 + 1 & 0xFFF;
								local86 = local7 - arg4.anInt5301;
								local92 = local9 - arg4.anInt5293;
								if (arg7 == -4) {
									if (arg8 == local7 && arg5 == local9) {
										Static524.anInt8784 = local9;
										Static362.anInt6349 = local7;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static395.method5805(arg9, arg8, arg1, local9, arg0, arg0, local7, arg5)) {
										Static362.anInt6349 = local7;
										Static524.anInt8784 = local9;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg4.method4596(arg0, arg3, arg0, arg5, arg9, arg8, local7, arg1, local9)) {
										Static362.anInt6349 = local7;
										Static524.anInt8784 = local9;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg4.method4590(local7, arg3, arg9, arg5, arg8, arg1, arg0, local9)) {
										Static524.anInt8784 = local9;
										Static362.anInt6349 = local7;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg4.method4591(local9, arg5, arg0, arg6, local7, arg8, arg7)) {
										Static524.anInt8784 = local9;
										Static362.anInt6349 = local7;
										return true;
									}
								} else if (arg4.method4592(local9, arg6, arg0, arg7, arg8, arg5, local7)) {
									Static524.anInt8784 = local9;
									Static362.anInt6349 = local7;
									return true;
								}
								local241 = Static39.anIntArrayArray40[local75][local71] + 1;
								if (local75 > 0 && Static85.anIntArrayArray13[local75 - 1][local71] == 0 && (local56[local86 - 1][local92] & 0x43A40000) == 0 && (local56[local86 - 1][arg0 + local92 - 1] & 0x4E240000) == 0) {
									local286 = 1;
									while (true) {
										if (arg0 - 1 <= local286) {
											Static292.anIntArray406[local51] = local7 - 1;
											Static127.anIntArray174[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static85.anIntArrayArray13[local75 - 1][local71] = 2;
											Static39.anIntArrayArray40[local75 - 1][local71] = local241;
											break;
										}
										if ((local56[local86 - 1][local92 + local286] & 0x4FA40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local75 < 128 - arg0 && Static85.anIntArrayArray13[local75 + 1][local71] == 0 && (local56[local86 + arg0][local92] & 0x60E40000) == 0 && (local56[local86 + arg0][arg0 + local92 - 1] & 0x78240000) == 0) {
									local286 = 1;
									while (true) {
										if (arg0 - 1 <= local286) {
											Static292.anIntArray406[local51] = local7 + 1;
											Static127.anIntArray174[local51] = local9;
											Static85.anIntArrayArray13[local75 + 1][local71] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static39.anIntArrayArray40[local75 + 1][local71] = local241;
											break;
										}
										if ((local56[arg0 + local86][local92 + local286] & 0x78E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local71 > 0 && Static85.anIntArrayArray13[local75][local71 - 1] == 0 && (local56[local86][local92 - 1] & 0x43A40000) == 0 && (local56[local86 + arg0 - 1][local92 - 1] & 0x60E40000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg0 - 1) {
											Static292.anIntArray406[local51] = local7;
											Static127.anIntArray174[local51] = local9 - 1;
											Static85.anIntArrayArray13[local75][local71 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static39.anIntArrayArray40[local75][local71 - 1] = local241;
											break;
										}
										if ((local56[local286 + local86][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local71 < 128 - arg0 && Static85.anIntArrayArray13[local75][local71 + 1] == 0 && (local56[local86][arg0 + local92] & 0x4E240000) == 0 && (local56[local86 + arg0 - 1][arg0 + local92] & 0x78240000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg0 - 1) {
											Static292.anIntArray406[local51] = local7;
											Static127.anIntArray174[local51] = local9 + 1;
											Static85.anIntArrayArray13[local75][local71 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static39.anIntArrayArray40[local75][local71 + 1] = local241;
											break;
										}
										if ((local56[local86 + local286][arg0 + local92] & 0x7E240000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local75 > 0 && local71 > 0 && Static85.anIntArrayArray13[local75 - 1][local71 - 1] == 0 && (local56[local86 - 1][local92 - 1] & 0x43A40000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg0) {
											Static292.anIntArray406[local51] = local7 - 1;
											Static127.anIntArray174[local51] = local9 - 1;
											Static85.anIntArrayArray13[local75 - 1][local71 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static39.anIntArrayArray40[local75 - 1][local71 - 1] = local241;
											break;
										}
										if ((local56[local86 - 1][local92 + local286 - 1] & 0x4FA40000) != 0 || (local56[local286 + local86 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (128 - arg0 > local75 && local71 > 0 && Static85.anIntArrayArray13[local75 + 1][local71 - 1] == 0 && (local56[local86 + arg0][local92 - 1] & 0x60E40000) == 0) {
									local286 = 1;
									while (true) {
										if (arg0 <= local286) {
											Static292.anIntArray406[local51] = local7 + 1;
											Static127.anIntArray174[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static85.anIntArrayArray13[local75 + 1][local71 - 1] = 9;
											Static39.anIntArrayArray40[local75 + 1][local71 - 1] = local241;
											break;
										}
										if ((local56[arg0 + local86][local92 + local286 - 1] & 0x78E40000) != 0 || (local56[local286 + local86][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local75 > 0 && local71 < 128 - arg0 && Static85.anIntArrayArray13[local75 - 1][local71 + 1] == 0 && (local56[local86 - 1][local92 + arg0] & 0x4E240000) == 0) {
									for (local286 = 1; local286 < arg0; local286++) {
										if ((local56[local86 - 1][local92 + local286] & 0x4FA40000) != 0 || (local56[local286 + local86 - 1][local92 + arg0] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static292.anIntArray406[local51] = local7 - 1;
									Static127.anIntArray174[local51] = local9 + 1;
									Static85.anIntArrayArray13[local75 - 1][local71 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static39.anIntArrayArray40[local75 - 1][local71 + 1] = local241;
								}
							} while (128 - arg0 <= local75);
						} while (128 - arg0 <= local71);
					} while (Static85.anIntArrayArray13[local75 + 1][local71 + 1] != 0);
				} while ((local56[arg0 + local86][local92 + arg0] & 0x78240000) != 0);
				for (local286 = 1; local286 < arg0; local286++) {
					if ((local56[local286 + local86][arg0 + local92] & 0x7E240000) != 0 || (local56[arg0 + local86][local286 + local92] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static292.anIntArray406[local51] = local7 + 1;
				Static127.anIntArray174[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static85.anIntArrayArray13[local75 + 1][local71 + 1] = 12;
				Static39.anIntArrayArray40[local75 + 1][local71 + 1] = local241;
			}
		}
	}
}
