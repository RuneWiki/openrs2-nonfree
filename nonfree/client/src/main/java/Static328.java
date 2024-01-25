import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
	public static int anInt5870;

	@OriginalMember(owner = "client!laa", name = "s", descriptor = "Lclient!la;")
	public static Class208 aClass208_72;

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
	public static int anInt5869 = 0;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIILclient!dja;BIIIIII)Z")
	public static boolean method5013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg4;
		@Pc(17) int local17 = arg1 - 64;
		@Pc(22) int local22 = arg4 - 64;
		Static568.anIntArrayArray53[64][64] = 99;
		Static514.anIntArrayArray48[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static516.anIntArray504[0] = arg1;
		@Pc(51) int local51 = local42 + 1;
		Static385.anIntArray377[0] = arg4;
		@Pc(56) int[][] local56 = arg3.anIntArrayArray12;
		while (local51 != local44) {
			local9 = Static385.anIntArray377[local44];
			local7 = Static516.anIntArray504[local44];
			local44 = local44 + 1 & 0xFFF;
			@Pc(76) int local76 = local7 - local17;
			@Pc(81) int local81 = local9 - local22;
			@Pc(86) int local86 = local7 - arg3.anInt1778;
			@Pc(91) int local91 = local9 - arg3.anInt1763;
			if (arg7 == -4) {
				if (arg8 == local7 && arg5 == local9) {
					Static340.anInt6055 = local7;
					Static377.anInt6461 = local9;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static593.method8592(arg8, arg5, 2, local7, arg9, arg0, 2, local9)) {
					Static377.anInt6461 = local9;
					Static340.anInt6055 = local7;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg3.method1587(2, arg5, local9, arg8, arg6, arg0, local7, arg9, 2)) {
					Static340.anInt6055 = local7;
					Static377.anInt6461 = local9;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg3.method1575(2, arg8, arg9, arg0, local9, arg5, arg6, local7)) {
					Static377.anInt6461 = local9;
					Static340.anInt6055 = local7;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg3.method1590(local9, 2, -97, local7, arg8, arg2, arg5, arg7)) {
					Static377.anInt6461 = local9;
					Static340.anInt6055 = local7;
					return true;
				}
			} else if (arg3.method1588(arg2, local7, arg7, arg8, local9, arg5, 2)) {
				Static340.anInt6055 = local7;
				Static377.anInt6461 = local9;
				return true;
			}
			@Pc(261) int local261 = Static514.anIntArrayArray48[local76][local81] + 1;
			if (local76 > 0 && Static568.anIntArrayArray53[local76 - 1][local81] == 0 && (local56[local86 - 1][local91] & 0x43A40000) == 0 && (local56[local86 - 1][local91 + 1] & 0x4E240000) == 0) {
				Static516.anIntArray504[local51] = local7 - 1;
				Static385.anIntArray377[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static568.anIntArrayArray53[local76 - 1][local81] = 2;
				Static514.anIntArrayArray48[local76 - 1][local81] = local261;
			}
			if (local76 < 126 && Static568.anIntArrayArray53[local76 + 1][local81] == 0 && (local56[local86 + 2][local91] & 0x60E40000) == 0 && (local56[local86 + 2][local91 + 1] & 0x78240000) == 0) {
				Static516.anIntArray504[local51] = local7 + 1;
				Static385.anIntArray377[local51] = local9;
				Static568.anIntArrayArray53[local76 + 1][local81] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static514.anIntArrayArray48[local76 + 1][local81] = local261;
			}
			if (local81 > 0 && Static568.anIntArrayArray53[local76][local81 - 1] == 0 && (local56[local86][local91 - 1] & 0x43A40000) == 0 && (local56[local86 + 1][local91 - 1] & 0x60E40000) == 0) {
				Static516.anIntArray504[local51] = local7;
				Static385.anIntArray377[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static568.anIntArrayArray53[local76][local81 - 1] = 1;
				Static514.anIntArrayArray48[local76][local81 - 1] = local261;
			}
			if (local81 < 126 && Static568.anIntArrayArray53[local76][local81 + 1] == 0 && (local56[local86][local91 + 2] & 0x4E240000) == 0 && (local56[local86 + 1][local91 + 2] & 0x78240000) == 0) {
				Static516.anIntArray504[local51] = local7;
				Static385.anIntArray377[local51] = local9 + 1;
				Static568.anIntArrayArray53[local76][local81 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static514.anIntArrayArray48[local76][local81 + 1] = local261;
			}
			if (local76 > 0 && local81 > 0 && Static568.anIntArrayArray53[local76 - 1][local81 - 1] == 0 && (local56[local86 - 1][local91] & 0x4FA40000) == 0 && (local56[local86 - 1][local91 - 1] & 0x43A40000) == 0 && (local56[local86][local91 - 1] & 0x63E40000) == 0) {
				Static516.anIntArray504[local51] = local7 - 1;
				Static385.anIntArray377[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static568.anIntArrayArray53[local76 - 1][local81 - 1] = 3;
				Static514.anIntArrayArray48[local76 - 1][local81 - 1] = local261;
			}
			if (local76 < 126 && local81 > 0 && Static568.anIntArrayArray53[local76 + 1][local81 - 1] == 0 && (local56[local86 + 1][local91 - 1] & 0x63E40000) == 0 && (local56[local86 + 2][local91 - 1] & 0x60E40000) == 0 && (local56[local86 + 2][local91] & 0x78E40000) == 0) {
				Static516.anIntArray504[local51] = local7 + 1;
				Static385.anIntArray377[local51] = local9 - 1;
				Static568.anIntArrayArray53[local76 + 1][local81 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static514.anIntArrayArray48[local76 + 1][local81 - 1] = local261;
			}
			if (local76 > 0 && local81 < 126 && Static568.anIntArrayArray53[local76 - 1][local81 + 1] == 0 && (local56[local86 - 1][local91 + 1] & 0x4FA40000) == 0 && (local56[local86 - 1][local91 + 2] & 0x4E240000) == 0 && (local56[local86][local91 + 2] & 0x7E240000) == 0) {
				Static516.anIntArray504[local51] = local7 - 1;
				Static385.anIntArray377[local51] = local9 + 1;
				Static568.anIntArrayArray53[local76 - 1][local81 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static514.anIntArrayArray48[local76 - 1][local81 + 1] = local261;
			}
			if (local76 < 126 && local81 < 126 && Static568.anIntArrayArray53[local76 + 1][local81 + 1] == 0 && (local56[local86 + 1][local91 + 2] & 0x7E240000) == 0 && (local56[local86 + 2][local91 + 2] & 0x78240000) == 0 && (local56[local86 + 2][local91 + 1] & 0x78E40000) == 0) {
				Static516.anIntArray504[local51] = local7 + 1;
				Static385.anIntArray377[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static568.anIntArrayArray53[local76 + 1][local81 + 1] = 12;
				Static514.anIntArrayArray48[local76 + 1][local81 + 1] = local261;
			}
		}
		Static340.anInt6055 = local7;
		Static377.anInt6461 = local9;
		return false;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!dja;IIIIIIIIII)Z")
	public static boolean method5014(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg5 - 64;
		Static568.anIntArrayArray53[64][64] = 99;
		@Pc(28) int local28 = arg8 - 64;
		Static514.anIntArrayArray48[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static516.anIntArray504[0] = arg5;
		@Pc(42) int local42 = 0;
		@Pc(52) int local52 = local36 + 1;
		Static385.anIntArray377[0] = arg8;
		@Pc(57) int[][] local57 = arg0.anIntArrayArray12;
		while (local52 != local42) {
			local7 = Static516.anIntArray504[local42];
			local9 = Static385.anIntArray377[local42];
			@Pc(73) int local73 = local7 - arg0.anInt1778;
			@Pc(78) int local78 = local7 - local18;
			local42 = local42 + 1 & 0xFFF;
			@Pc(90) int local90 = local9 - arg0.anInt1763;
			@Pc(94) int local94 = local9 - local28;
			if (arg4 == -4) {
				if (arg1 == local7 && arg3 == local9) {
					Static340.anInt6055 = local7;
					Static377.anInt6461 = local9;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static593.method8592(arg1, arg3, 1, local7, arg6, arg7, 1, local9)) {
					Static377.anInt6461 = local9;
					Static340.anInt6055 = local7;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg0.method1587(1, arg3, local9, arg1, arg2, arg7, local7, arg6, 1)) {
					Static377.anInt6461 = local9;
					Static340.anInt6055 = local7;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg0.method1575(1, arg1, arg6, arg7, local9, arg3, arg2, local7)) {
					Static377.anInt6461 = local9;
					Static340.anInt6055 = local7;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg0.method1590(local9, 1, -77, local7, arg1, arg9, arg3, arg4)) {
					Static377.anInt6461 = local9;
					Static340.anInt6055 = local7;
					return true;
				}
			} else if (arg0.method1588(arg9, local7, arg4, arg1, local9, arg3, 1)) {
				Static340.anInt6055 = local7;
				Static377.anInt6461 = local9;
				return true;
			}
			@Pc(266) int local266 = Static514.anIntArrayArray48[local78][local94] + 1;
			if (local78 > 0 && Static568.anIntArrayArray53[local78 - 1][local94] == 0 && (local57[local73 - 1][local90] & 0x42240000) == 0) {
				Static516.anIntArray504[local52] = local7 - 1;
				Static385.anIntArray377[local52] = local9;
				Static568.anIntArrayArray53[local78 - 1][local94] = 2;
				local52 = local52 + 1 & 0xFFF;
				Static514.anIntArrayArray48[local78 - 1][local94] = local266;
			}
			if (local78 < 127 && Static568.anIntArrayArray53[local78 + 1][local94] == 0 && (local57[local73 + 1][local90] & 0x60240000) == 0) {
				Static516.anIntArray504[local52] = local7 + 1;
				Static385.anIntArray377[local52] = local9;
				local52 = local52 + 1 & 0xFFF;
				Static568.anIntArrayArray53[local78 + 1][local94] = 8;
				Static514.anIntArrayArray48[local78 + 1][local94] = local266;
			}
			if (local94 > 0 && Static568.anIntArrayArray53[local78][local94 - 1] == 0 && (local57[local73][local90 - 1] & 0x40A40000) == 0) {
				Static516.anIntArray504[local52] = local7;
				Static385.anIntArray377[local52] = local9 - 1;
				Static568.anIntArrayArray53[local78][local94 - 1] = 1;
				local52 = local52 + 1 & 0xFFF;
				Static514.anIntArrayArray48[local78][local94 - 1] = local266;
			}
			if (local94 < 127 && Static568.anIntArrayArray53[local78][local94 + 1] == 0 && (local57[local73][local90 + 1] & 0x48240000) == 0) {
				Static516.anIntArray504[local52] = local7;
				Static385.anIntArray377[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static568.anIntArrayArray53[local78][local94 + 1] = 4;
				Static514.anIntArrayArray48[local78][local94 + 1] = local266;
			}
			if (local78 > 0 && local94 > 0 && Static568.anIntArrayArray53[local78 - 1][local94 - 1] == 0 && (local57[local73 - 1][local90 - 1] & 0x43A40000) == 0 && (local57[local73 - 1][local90] & 0x42240000) == 0 && (local57[local73][local90 - 1] & 0x40A40000) == 0) {
				Static516.anIntArray504[local52] = local7 - 1;
				Static385.anIntArray377[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static568.anIntArrayArray53[local78 - 1][local94 - 1] = 3;
				Static514.anIntArrayArray48[local78 - 1][local94 - 1] = local266;
			}
			if (local78 < 127 && local94 > 0 && Static568.anIntArrayArray53[local78 + 1][local94 - 1] == 0 && (local57[local73 + 1][local90 - 1] & 0x60E40000) == 0 && (local57[local73 + 1][local90] & 0x60240000) == 0 && (local57[local73][local90 - 1] & 0x40A40000) == 0) {
				Static516.anIntArray504[local52] = local7 + 1;
				Static385.anIntArray377[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static568.anIntArrayArray53[local78 + 1][local94 - 1] = 9;
				Static514.anIntArrayArray48[local78 + 1][local94 - 1] = local266;
			}
			if (local78 > 0 && local94 < 127 && Static568.anIntArrayArray53[local78 - 1][local94 + 1] == 0 && (local57[local73 - 1][local90 + 1] & 0x4E240000) == 0 && (local57[local73 - 1][local90] & 0x42240000) == 0 && (local57[local73][local90 + 1] & 0x48240000) == 0) {
				Static516.anIntArray504[local52] = local7 - 1;
				Static385.anIntArray377[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static568.anIntArrayArray53[local78 - 1][local94 + 1] = 6;
				Static514.anIntArrayArray48[local78 - 1][local94 + 1] = local266;
			}
			if (local78 < 127 && local94 < 127 && Static568.anIntArrayArray53[local78 + 1][local94 + 1] == 0 && (local57[local73 + 1][local90 + 1] & 0x78240000) == 0 && (local57[local73 + 1][local90] & 0x60240000) == 0 && (local57[local73][local90 + 1] & 0x48240000) == 0) {
				Static516.anIntArray504[local52] = local7 + 1;
				Static385.anIntArray377[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static568.anIntArrayArray53[local78 + 1][local94 + 1] = 12;
				Static514.anIntArrayArray48[local78 + 1][local94 + 1] = local266;
			}
		}
		Static377.anInt6461 = local9;
		Static340.anInt6055 = local7;
		return false;
	}
}
