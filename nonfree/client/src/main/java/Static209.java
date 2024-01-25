import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
	public static int anInt4161;

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "Ljava/lang/String;")
	public static final String aString168 = "red:";

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "J")
	public static long aLong143 = 0L;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIILclient!ie;III)Z")
	public static boolean method3837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class91 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg8 - 64;
		Static259.anIntArrayArray52[64][64] = 99;
		@Pc(29) int local29 = arg2 - 64;
		Static162.anIntArrayArray29[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static10.anIntArray30[0] = arg8;
		@Pc(54) int local54 = local37 + 1;
		Static54.anIntArray415[0] = arg2;
		@Pc(59) int[][] local59 = arg7.anIntArrayArray27;
		while (local54 != local39) {
			local7 = Static10.anIntArray30[local39];
			local9 = Static54.anIntArray415[local39];
			@Pc(75) int local75 = local9 - arg7.anInt2685;
			@Pc(80) int local80 = local7 - local18;
			@Pc(86) int local86 = local7 - arg7.anInt2692;
			@Pc(91) int local91 = local9 - local29;
			local39 = local39 + 1 & 0xFFF;
			if (arg3 == -4) {
				if (local7 == arg6 && arg9 == local9) {
					Static4.anInt86 = local7;
					Static115.anInt2302 = local9;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static69.method1393(arg4, local7, arg9, 1, arg1, arg6, local9, 1)) {
					Static115.anInt2302 = local9;
					Static4.anInt86 = local7;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg7.method2596(local7, arg6, 1, arg1, local9, 1, arg0, arg4, arg9)) {
					Static4.anInt86 = local7;
					Static115.anInt2302 = local9;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg7.method2595(local7, arg1, local9, arg4, arg0, 1, arg6, arg9)) {
					Static115.anInt2302 = local9;
					Static4.anInt86 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg7.method2607(local9, arg3, arg9, local7, arg5, 1, arg6)) {
					Static4.anInt86 = local7;
					Static115.anInt2302 = local9;
					return true;
				}
			} else if (arg7.method2604(1, local9, arg3, arg6, arg9, arg5, local7)) {
				Static4.anInt86 = local7;
				Static115.anInt2302 = local9;
				return true;
			}
			@Pc(243) int local243 = Static162.anIntArrayArray29[local80][local91] + 1;
			if (local80 > 0 && Static259.anIntArrayArray52[local80 - 1][local91] == 0 && (local59[local86 - 1][local75] & 0x42240000) == 0) {
				Static10.anIntArray30[local54] = local7 - 1;
				Static54.anIntArray415[local54] = local9;
				Static259.anIntArrayArray52[local80 - 1][local91] = 2;
				local54 = local54 + 1 & 0xFFF;
				Static162.anIntArrayArray29[local80 - 1][local91] = local243;
			}
			if (local80 < 127 && Static259.anIntArrayArray52[local80 + 1][local91] == 0 && (local59[local86 + 1][local75] & 0x60240000) == 0) {
				Static10.anIntArray30[local54] = local7 + 1;
				Static54.anIntArray415[local54] = local9;
				Static259.anIntArrayArray52[local80 + 1][local91] = 8;
				local54 = local54 + 1 & 0xFFF;
				Static162.anIntArrayArray29[local80 + 1][local91] = local243;
			}
			if (local91 > 0 && Static259.anIntArrayArray52[local80][local91 - 1] == 0 && (local59[local86][local75 - 1] & 0x40A40000) == 0) {
				Static10.anIntArray30[local54] = local7;
				Static54.anIntArray415[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static259.anIntArrayArray52[local80][local91 - 1] = 1;
				Static162.anIntArrayArray29[local80][local91 - 1] = local243;
			}
			if (local91 < 127 && Static259.anIntArrayArray52[local80][local91 + 1] == 0 && (local59[local86][local75 + 1] & 0x48240000) == 0) {
				Static10.anIntArray30[local54] = local7;
				Static54.anIntArray415[local54] = local9 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static259.anIntArrayArray52[local80][local91 + 1] = 4;
				Static162.anIntArrayArray29[local80][local91 + 1] = local243;
			}
			if (local80 > 0 && local91 > 0 && Static259.anIntArrayArray52[local80 - 1][local91 - 1] == 0 && (local59[local86 - 1][local75 - 1] & 0x43A40000) == 0 && (local59[local86 - 1][local75] & 0x42240000) == 0 && (local59[local86][local75 - 1] & 0x40A40000) == 0) {
				Static10.anIntArray30[local54] = local7 - 1;
				Static54.anIntArray415[local54] = local9 - 1;
				Static259.anIntArrayArray52[local80 - 1][local91 - 1] = 3;
				local54 = local54 + 1 & 0xFFF;
				Static162.anIntArrayArray29[local80 - 1][local91 - 1] = local243;
			}
			if (local80 < 127 && local91 > 0 && Static259.anIntArrayArray52[local80 + 1][local91 - 1] == 0 && (local59[local86 + 1][local75 - 1] & 0x60E40000) == 0 && (local59[local86 + 1][local75] & 0x60240000) == 0 && (local59[local86][local75 - 1] & 0x40A40000) == 0) {
				Static10.anIntArray30[local54] = local7 + 1;
				Static54.anIntArray415[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static259.anIntArrayArray52[local80 + 1][local91 - 1] = 9;
				Static162.anIntArrayArray29[local80 + 1][local91 - 1] = local243;
			}
			if (local80 > 0 && local91 < 127 && Static259.anIntArrayArray52[local80 - 1][local91 + 1] == 0 && (local59[local86 - 1][local75 + 1] & 0x4E240000) == 0 && (local59[local86 - 1][local75] & 0x42240000) == 0 && (local59[local86][local75 + 1] & 0x48240000) == 0) {
				Static10.anIntArray30[local54] = local7 - 1;
				Static54.anIntArray415[local54] = local9 + 1;
				Static259.anIntArrayArray52[local80 - 1][local91 + 1] = 6;
				local54 = local54 + 1 & 0xFFF;
				Static162.anIntArrayArray29[local80 - 1][local91 + 1] = local243;
			}
			if (local80 < 127 && local91 < 127 && Static259.anIntArrayArray52[local80 + 1][local91 + 1] == 0 && (local59[local86 + 1][local75 + 1] & 0x78240000) == 0 && (local59[local86 + 1][local75] & 0x60240000) == 0 && (local59[local86][local75 + 1] & 0x48240000) == 0) {
				Static10.anIntArray30[local54] = local7 + 1;
				Static54.anIntArray415[local54] = local9 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static259.anIntArrayArray52[local80 + 1][local91 + 1] = 12;
				Static162.anIntArrayArray29[local80 + 1][local91 + 1] = local243;
			}
		}
		Static4.anInt86 = local7;
		Static115.anInt2302 = local9;
		return false;
	}
}
