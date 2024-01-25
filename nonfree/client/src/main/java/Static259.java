import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!ks", name = "ab", descriptor = "Z")
	public static boolean aBoolean198;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "Lclient!eu;")
	public static final Class2_Sub20 aClass2_Sub20_2 = new Class2_Sub20(0, 0);

	@OriginalMember(owner = "client!ks", name = "Y", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_68 = new Class202("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

	@OriginalMember(owner = "client!ks", name = "bb", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_29 = new Class243(35, 0);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIBIIILclient!gea;II)Z")
	public static boolean method2140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class99 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg6;
		@Pc(14) int local14 = arg8;
		@Pc(23) int local23 = arg6 - 64;
		@Pc(28) int local28 = arg8 - 64;
		Static198.anIntArrayArray43[64][64] = 99;
		Static78.anIntArrayArray8[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static541.anIntArray764[0] = arg6;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static523.anIntArray696[0] = arg8;
		@Pc(56) int[][] local56 = arg7.anIntArrayArray42;
		while (local48 != local51) {
			local12 = Static541.anIntArray764[local48];
			local14 = Static523.anIntArray696[local48];
			@Pc(72) int local72 = local14 - arg7.anInt2817;
			@Pc(78) int local78 = local12 - arg7.anInt2805;
			@Pc(83) int local83 = local14 - local28;
			local48 = local48 + 1 & 0xFFF;
			@Pc(94) int local94 = local12 - local23;
			if (arg1 == -4) {
				if (local12 == arg9 && arg5 == local14) {
					Static184.anInt3393 = local12;
					Static274.anInt4977 = local14;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static112.method2186(1, arg0, local14, arg9, arg5, local12, 1, arg4)) {
					Static184.anInt3393 = local12;
					Static274.anInt4977 = local14;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg7.method2640(arg9, 1, local12, arg4, 1, arg3, local14, arg0, arg5)) {
					Static274.anInt4977 = local14;
					Static184.anInt3393 = local12;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg7.method2647(1, arg4, local14, arg9, local12, arg3, arg0, arg5)) {
					Static184.anInt3393 = local12;
					Static274.anInt4977 = local14;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg7.method2635(local14, arg2, arg9, local12, 1, arg5, arg1)) {
					Static274.anInt4977 = local14;
					Static184.anInt3393 = local12;
					return true;
				}
			} else if (arg7.method2649(arg1, arg9, arg2, local12, arg5, 1, local14)) {
				Static274.anInt4977 = local14;
				Static184.anInt3393 = local12;
				return true;
			}
			@Pc(236) int local236 = Static78.anIntArrayArray8[local94][local83] + 1;
			if (local94 > 0 && Static198.anIntArrayArray43[local94 - 1][local83] == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0) {
				Static541.anIntArray764[local51] = local12 - 1;
				Static523.anIntArray696[local51] = local14;
				Static198.anIntArrayArray43[local94 - 1][local83] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static78.anIntArrayArray8[local94 - 1][local83] = local236;
			}
			if (local94 < 127 && Static198.anIntArrayArray43[local94 + 1][local83] == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0) {
				Static541.anIntArray764[local51] = local12 + 1;
				Static523.anIntArray696[local51] = local14;
				Static198.anIntArrayArray43[local94 + 1][local83] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static78.anIntArrayArray8[local94 + 1][local83] = local236;
			}
			if (local83 > 0 && Static198.anIntArrayArray43[local94][local83 - 1] == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static541.anIntArray764[local51] = local12;
				Static523.anIntArray696[local51] = local14 - 1;
				Static198.anIntArrayArray43[local94][local83 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static78.anIntArrayArray8[local94][local83 - 1] = local236;
			}
			if (local83 < 127 && Static198.anIntArrayArray43[local94][local83 + 1] == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static541.anIntArray764[local51] = local12;
				Static523.anIntArray696[local51] = local14 + 1;
				Static198.anIntArrayArray43[local94][local83 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static78.anIntArrayArray8[local94][local83 + 1] = local236;
			}
			if (local94 > 0 && local83 > 0 && Static198.anIntArrayArray43[local94 - 1][local83 - 1] == 0 && (local56[local78 - 1][local72 - 1] & 0x43A40000) == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static541.anIntArray764[local51] = local12 - 1;
				Static523.anIntArray696[local51] = local14 - 1;
				Static198.anIntArrayArray43[local94 - 1][local83 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static78.anIntArrayArray8[local94 - 1][local83 - 1] = local236;
			}
			if (local94 < 127 && local83 > 0 && Static198.anIntArrayArray43[local94 + 1][local83 - 1] == 0 && (local56[local78 + 1][local72 - 1] & 0x60E40000) == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static541.anIntArray764[local51] = local12 + 1;
				Static523.anIntArray696[local51] = local14 - 1;
				Static198.anIntArrayArray43[local94 + 1][local83 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static78.anIntArrayArray8[local94 + 1][local83 - 1] = local236;
			}
			if (local94 > 0 && local83 < 127 && Static198.anIntArrayArray43[local94 - 1][local83 + 1] == 0 && (local56[local78 - 1][local72 + 1] & 0x4E240000) == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static541.anIntArray764[local51] = local12 - 1;
				Static523.anIntArray696[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static198.anIntArrayArray43[local94 - 1][local83 + 1] = 6;
				Static78.anIntArrayArray8[local94 - 1][local83 + 1] = local236;
			}
			if (local94 < 127 && local83 < 127 && Static198.anIntArrayArray43[local94 + 1][local83 + 1] == 0 && (local56[local78 + 1][local72 + 1] & 0x78240000) == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static541.anIntArray764[local51] = local12 + 1;
				Static523.anIntArray696[local51] = local14 + 1;
				Static198.anIntArrayArray43[local94 + 1][local83 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static78.anIntArrayArray8[local94 + 1][local83 + 1] = local236;
			}
		}
		Static184.anInt3393 = local12;
		Static274.anInt4977 = local14;
		return false;
	}
}
