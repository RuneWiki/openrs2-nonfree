import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!gea", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_37 = new Class243(46, 15);

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!dda;I)I")
	public static int method2636(@OriginalArg(0) Class53 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method1621(Static277.anInt5010)) {
			local10++;
		}
		if (arg0.method1621(Static424.anInt7847)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIILclient!gea;III)Z")
	public static boolean method2638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class99 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg0;
		@Pc(17) int local17 = arg8 - 64;
		@Pc(22) int local22 = arg0 - 64;
		Static198.anIntArrayArray43[64][64] = 99;
		Static78.anIntArrayArray8[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static541.anIntArray764[0] = arg8;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static523.anIntArray696[0] = arg0;
		@Pc(50) int[][] local50 = arg6.anIntArrayArray42;
		while (local45 != local42) {
			local9 = Static523.anIntArray696[local42];
			local7 = Static541.anIntArray764[local42];
			@Pc(65) int local65 = local9 - local22;
			@Pc(70) int local70 = local7 - local17;
			local42 = local42 + 1 & 0xFFF;
			@Pc(81) int local81 = local7 - arg6.anInt2805;
			@Pc(87) int local87 = local9 - arg6.anInt2817;
			if (arg9 == -4) {
				if (local7 == arg2 && local9 == arg7) {
					Static274.anInt4977 = local9;
					Static184.anInt3393 = local7;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static112.method2186(2, arg3, local9, arg2, arg7, local7, 2, arg5)) {
					Static184.anInt3393 = local7;
					Static274.anInt4977 = local9;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg6.method2640(arg2, 2, local7, arg5, 2, arg4, local9, arg3, arg7)) {
					Static274.anInt4977 = local9;
					Static184.anInt3393 = local7;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg6.method2647(2, arg5, local9, arg2, local7, arg4, arg3, arg7)) {
					Static274.anInt4977 = local9;
					Static184.anInt3393 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg6.method2635(local9, arg1, arg2, local7, 2, arg7, arg9)) {
					Static184.anInt3393 = local7;
					Static274.anInt4977 = local9;
					return true;
				}
			} else if (arg6.method2649(arg9, arg2, arg1, local7, arg7, 2, local9)) {
				Static274.anInt4977 = local9;
				Static184.anInt3393 = local7;
				return true;
			}
			@Pc(234) int local234 = Static78.anIntArrayArray8[local70][local65] + 1;
			if (local70 > 0 && Static198.anIntArrayArray43[local70 - 1][local65] == 0 && (local50[local81 - 1][local87] & 0x43A40000) == 0 && (local50[local81 - 1][local87 + 1] & 0x4E240000) == 0) {
				Static541.anIntArray764[local45] = local7 - 1;
				Static523.anIntArray696[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static198.anIntArrayArray43[local70 - 1][local65] = 2;
				Static78.anIntArrayArray8[local70 - 1][local65] = local234;
			}
			if (local70 < 126 && Static198.anIntArrayArray43[local70 + 1][local65] == 0 && (local50[local81 + 2][local87] & 0x60E40000) == 0 && (local50[local81 + 2][local87 + 1] & 0x78240000) == 0) {
				Static541.anIntArray764[local45] = local7 + 1;
				Static523.anIntArray696[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static198.anIntArrayArray43[local70 + 1][local65] = 8;
				Static78.anIntArrayArray8[local70 + 1][local65] = local234;
			}
			if (local65 > 0 && Static198.anIntArrayArray43[local70][local65 - 1] == 0 && (local50[local81][local87 - 1] & 0x43A40000) == 0 && (local50[local81 + 1][local87 - 1] & 0x60E40000) == 0) {
				Static541.anIntArray764[local45] = local7;
				Static523.anIntArray696[local45] = local9 - 1;
				Static198.anIntArrayArray43[local70][local65 - 1] = 1;
				local45 = local45 + 1 & 0xFFF;
				Static78.anIntArrayArray8[local70][local65 - 1] = local234;
			}
			if (local65 < 126 && Static198.anIntArrayArray43[local70][local65 + 1] == 0 && (local50[local81][local87 + 2] & 0x4E240000) == 0 && (local50[local81 + 1][local87 + 2] & 0x78240000) == 0) {
				Static541.anIntArray764[local45] = local7;
				Static523.anIntArray696[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static198.anIntArrayArray43[local70][local65 + 1] = 4;
				Static78.anIntArrayArray8[local70][local65 + 1] = local234;
			}
			if (local70 > 0 && local65 > 0 && Static198.anIntArrayArray43[local70 - 1][local65 - 1] == 0 && (local50[local81 - 1][local87] & 0x4FA40000) == 0 && (local50[local81 - 1][local87 - 1] & 0x43A40000) == 0 && (local50[local81][local87 - 1] & 0x63E40000) == 0) {
				Static541.anIntArray764[local45] = local7 - 1;
				Static523.anIntArray696[local45] = local9 - 1;
				Static198.anIntArrayArray43[local70 - 1][local65 - 1] = 3;
				local45 = local45 + 1 & 0xFFF;
				Static78.anIntArrayArray8[local70 - 1][local65 - 1] = local234;
			}
			if (local70 < 126 && local65 > 0 && Static198.anIntArrayArray43[local70 + 1][local65 - 1] == 0 && (local50[local81 + 1][local87 - 1] & 0x63E40000) == 0 && (local50[local81 + 2][local87 - 1] & 0x60E40000) == 0 && (local50[local81 + 2][local87] & 0x78E40000) == 0) {
				Static541.anIntArray764[local45] = local7 + 1;
				Static523.anIntArray696[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static198.anIntArrayArray43[local70 + 1][local65 - 1] = 9;
				Static78.anIntArrayArray8[local70 + 1][local65 - 1] = local234;
			}
			if (local70 > 0 && local65 < 126 && Static198.anIntArrayArray43[local70 - 1][local65 + 1] == 0 && (local50[local81 - 1][local87 + 1] & 0x4FA40000) == 0 && (local50[local81 - 1][local87 + 2] & 0x4E240000) == 0 && (local50[local81][local87 + 2] & 0x7E240000) == 0) {
				Static541.anIntArray764[local45] = local7 - 1;
				Static523.anIntArray696[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static198.anIntArrayArray43[local70 - 1][local65 + 1] = 6;
				Static78.anIntArrayArray8[local70 - 1][local65 + 1] = local234;
			}
			if (local70 < 126 && local65 < 126 && Static198.anIntArrayArray43[local70 + 1][local65 + 1] == 0 && (local50[local81 + 1][local87 + 2] & 0x7E240000) == 0 && (local50[local81 + 2][local87 + 2] & 0x78240000) == 0 && (local50[local81 + 2][local87 + 1] & 0x78E40000) == 0) {
				Static541.anIntArray764[local45] = local7 + 1;
				Static523.anIntArray696[local45] = local9 + 1;
				Static198.anIntArrayArray43[local70 + 1][local65 + 1] = 12;
				local45 = local45 + 1 & 0xFFF;
				Static78.anIntArrayArray8[local70 + 1][local65 + 1] = local234;
			}
		}
		Static274.anInt4977 = local9;
		Static184.anInt3393 = local7;
		return false;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BII)Z")
	public static boolean method2639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(IIB)Z")
	public static boolean method2641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method2639(arg0, arg1)) {
			return Static311.method4814(arg1, arg0) | (arg0 & 0x9000) != 0 | Static439.method6710(arg1, arg0) ? true : (Static262.method6141(arg1, arg0) | (arg0 & 0x2000) != 0 | Static255.method3999(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
