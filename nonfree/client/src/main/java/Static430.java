import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "[I")
	public static final int[] anIntArray447 = new int[2048];

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IILclient!jw;IIIIIIII)Z")
	public static boolean method6069(@OriginalArg(1) int arg0, @OriginalArg(2) Class169 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg6 - 64;
		Static285.anIntArrayArray111[64][64] = 99;
		@Pc(29) int local29 = arg4 - 64;
		Static427.anIntArrayArray161[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static305.anIntArray301[0] = arg6;
		@Pc(51) int local51 = local42 + 1;
		Static47.anIntArray608[0] = arg4;
		@Pc(56) int[][] local56 = arg1.anIntArrayArray105;
		while (local44 != local51) {
			local7 = Static305.anIntArray301[local44];
			local9 = Static47.anIntArray608[local44];
			local44 = local44 + 1 & 0xFFF;
			@Pc(78) int local78 = local7 - arg1.anInt4643;
			@Pc(83) int local83 = local9 - arg1.anInt4631;
			@Pc(88) int local88 = local9 - local29;
			@Pc(93) int local93 = local7 - local18;
			if (arg0 == -4) {
				if (local7 == arg5 && arg2 == local9) {
					Static505.anInt8221 = local7;
					Static439.anInt7337 = local9;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static551.method7301(arg3, 1, arg5, arg7, arg2, local9, 1, local7)) {
					Static505.anInt8221 = local7;
					Static439.anInt7337 = local9;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg1.method4033(arg5, local7, arg8, arg2, 1, arg3, arg7, local9, 1)) {
					Static439.anInt7337 = local9;
					Static505.anInt8221 = local7;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg1.method4036(arg7, arg3, local7, arg5, 1, arg8, local9, arg2)) {
					Static505.anInt8221 = local7;
					Static439.anInt7337 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg1.method4024(1, arg2, arg0, arg9, local7, arg5, local9)) {
					Static439.anInt7337 = local9;
					Static505.anInt8221 = local7;
					return true;
				}
			} else if (arg1.method4039(arg9, arg5, arg0, local7, 1, local9, arg2)) {
				Static505.anInt8221 = local7;
				Static439.anInt7337 = local9;
				return true;
			}
			@Pc(236) int local236 = Static427.anIntArrayArray161[local93][local88] + 1;
			if (local93 > 0 && Static285.anIntArrayArray111[local93 - 1][local88] == 0 && (local56[local78 - 1][local83] & 0x42240000) == 0) {
				Static305.anIntArray301[local51] = local7 - 1;
				Static47.anIntArray608[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static285.anIntArrayArray111[local93 - 1][local88] = 2;
				Static427.anIntArrayArray161[local93 - 1][local88] = local236;
			}
			if (local93 < 127 && Static285.anIntArrayArray111[local93 + 1][local88] == 0 && (local56[local78 + 1][local83] & 0x60240000) == 0) {
				Static305.anIntArray301[local51] = local7 + 1;
				Static47.anIntArray608[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static285.anIntArrayArray111[local93 + 1][local88] = 8;
				Static427.anIntArrayArray161[local93 + 1][local88] = local236;
			}
			if (local88 > 0 && Static285.anIntArrayArray111[local93][local88 - 1] == 0 && (local56[local78][local83 - 1] & 0x40A40000) == 0) {
				Static305.anIntArray301[local51] = local7;
				Static47.anIntArray608[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static285.anIntArrayArray111[local93][local88 - 1] = 1;
				Static427.anIntArrayArray161[local93][local88 - 1] = local236;
			}
			if (local88 < 127 && Static285.anIntArrayArray111[local93][local88 + 1] == 0 && (local56[local78][local83 + 1] & 0x48240000) == 0) {
				Static305.anIntArray301[local51] = local7;
				Static47.anIntArray608[local51] = local9 + 1;
				Static285.anIntArrayArray111[local93][local88 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static427.anIntArrayArray161[local93][local88 + 1] = local236;
			}
			if (local93 > 0 && local88 > 0 && Static285.anIntArrayArray111[local93 - 1][local88 - 1] == 0 && (local56[local78 - 1][local83 - 1] & 0x43A40000) == 0 && (local56[local78 - 1][local83] & 0x42240000) == 0 && (local56[local78][local83 - 1] & 0x40A40000) == 0) {
				Static305.anIntArray301[local51] = local7 - 1;
				Static47.anIntArray608[local51] = local9 - 1;
				Static285.anIntArrayArray111[local93 - 1][local88 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static427.anIntArrayArray161[local93 - 1][local88 - 1] = local236;
			}
			if (local93 < 127 && local88 > 0 && Static285.anIntArrayArray111[local93 + 1][local88 - 1] == 0 && (local56[local78 + 1][local83 - 1] & 0x60E40000) == 0 && (local56[local78 + 1][local83] & 0x60240000) == 0 && (local56[local78][local83 - 1] & 0x40A40000) == 0) {
				Static305.anIntArray301[local51] = local7 + 1;
				Static47.anIntArray608[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static285.anIntArrayArray111[local93 + 1][local88 - 1] = 9;
				Static427.anIntArrayArray161[local93 + 1][local88 - 1] = local236;
			}
			if (local93 > 0 && local88 < 127 && Static285.anIntArrayArray111[local93 - 1][local88 + 1] == 0 && (local56[local78 - 1][local83 + 1] & 0x4E240000) == 0 && (local56[local78 - 1][local83] & 0x42240000) == 0 && (local56[local78][local83 + 1] & 0x48240000) == 0) {
				Static305.anIntArray301[local51] = local7 - 1;
				Static47.anIntArray608[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static285.anIntArrayArray111[local93 - 1][local88 + 1] = 6;
				Static427.anIntArrayArray161[local93 - 1][local88 + 1] = local236;
			}
			if (local93 < 127 && local88 < 127 && Static285.anIntArrayArray111[local93 + 1][local88 + 1] == 0 && (local56[local78 + 1][local83 + 1] & 0x78240000) == 0 && (local56[local78 + 1][local83] & 0x60240000) == 0 && (local56[local78][local83 + 1] & 0x48240000) == 0) {
				Static305.anIntArray301[local51] = local7 + 1;
				Static47.anIntArray608[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static285.anIntArrayArray111[local93 + 1][local88 + 1] = 12;
				Static427.anIntArrayArray161[local93 + 1][local88 + 1] = local236;
			}
		}
		Static439.anInt7337 = local9;
		Static505.anInt8221 = local7;
		return false;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([[BILclient!uk;)V")
	public static void method6070(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class26_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt8536; local3++) {
			Static236.method3658();
			for (@Pc(9) int local9 = 0; local9 < Static54.anInt1038 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static140.anInt3026 >> 3; local13++) {
					@Pc(23) int local23 = Static358.anIntArrayArrayArray18[local3][local9][local13];
					if (local23 != -1) {
						@Pc(32) int local32 = local23 >> 24 & 0x3;
						if (!arg1.aBoolean662 || local32 == 0) {
							@Pc(43) int local43 = local23 >> 1 & 0x3;
							@Pc(49) int local49 = local23 >> 14 & 0x3FF;
							@Pc(55) int local55 = local23 >> 3 & 0x7FF;
							@Pc(65) int local65 = (local49 / 8 << 8) + local55 / 8;
							for (@Pc(67) int local67 = 0; local67 < Static403.anIntArray428.length; local67++) {
								if (Static403.anIntArray428[local67] == local65 && arg0[local67] != null) {
									arg1.method7118(local13 * 8, local32, arg0[local67], Static505.aClass45_11, Static460.aClass169Array3, local9 * 8, (local55 & 0x7) * 8, (local49 & 0x7) * 8, local43, local3);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)Lclient!vf;")
	public static Class3_Sub7_Sub18 method6072() {
		@Pc(8) Class3_Sub7_Sub18 local8 = (Class3_Sub7_Sub18) Static452.aClass325_9.method6859();
		if (local8 != null) {
			local8.method7825();
			local8.method7614();
			return local8;
		}
		do {
			local8 = (Class3_Sub7_Sub18) Static528.aClass325_11.method6859();
			if (local8 == null) {
				return null;
			}
			if (local8.method7327() > Static158.method2936()) {
				return null;
			}
			local8.method7825();
			local8.method7614();
		} while ((local8.aLong263 & Long.MIN_VALUE) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZ)I")
	public static int method6073(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
