import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!qo;")
	public static Class44_Sub4_Sub4_Sub1 aClass44_Sub4_Sub4_Sub1_1;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	public static int anInt4714;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	public static int anInt4716;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Lclient!of;")
	public static Class40 aClass40_14;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Lclient!bm;")
	public static final Class6_Sub6 aClass6_Sub6_1 = new Class6_Sub6(0, 0);

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
	public static int anInt4718 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILclient!c;BIIIIII)Z")
	public static boolean method4340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class27 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg6;
		@Pc(23) int local23 = arg7 - 64;
		Static27.anIntArrayArray28[64][64] = 99;
		@Pc(34) int local34 = arg6 - 64;
		Static339.anIntArrayArray215[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static52.anIntArray112[0] = arg7;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static101.anIntArray258[0] = arg6;
		@Pc(56) int[][] local56 = arg3.anIntArrayArray31;
		while (local51 != local48) {
			local7 = Static52.anIntArray112[local48];
			local9 = Static101.anIntArray258[local48];
			local48 = local48 + 1 & 0xFFF;
			@Pc(77) int local77 = local9 - local34;
			@Pc(82) int local82 = local7 - local23;
			@Pc(87) int local87 = local7 - arg3.anInt632;
			@Pc(93) int local93 = local9 - arg3.anInt621;
			if (arg9 == -4) {
				if (arg0 == local7 && local9 == arg4) {
					Static78.anInt1445 = local9;
					Static151.anInt2862 = local7;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static102.method4781(arg0, arg4, arg5, 2, local9, arg8, 2, local7)) {
					Static78.anInt1445 = local9;
					Static151.anInt2862 = local7;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg3.method517(local7, arg8, local9, 2, arg5, arg2, 2, arg4, arg0)) {
					Static78.anInt1445 = local9;
					Static151.anInt2862 = local7;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg3.method511(local7, arg0, arg2, arg8, 2, arg5, local9, arg4)) {
					Static78.anInt1445 = local9;
					Static151.anInt2862 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg3.method515(local7, arg4, local9, 2, arg1, arg0, arg9)) {
					Static78.anInt1445 = local9;
					Static151.anInt2862 = local7;
					return true;
				}
			} else if (arg3.method524(arg4, local9, arg0, 2, arg9, local7, arg1)) {
				Static151.anInt2862 = local7;
				Static78.anInt1445 = local9;
				return true;
			}
			@Pc(239) int local239 = Static339.anIntArrayArray215[local82][local77] + 1;
			if (local82 > 0 && Static27.anIntArrayArray28[local82 - 1][local77] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static52.anIntArray112[local51] = local7 - 1;
				Static101.anIntArray258[local51] = local9;
				Static27.anIntArrayArray28[local82 - 1][local77] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static339.anIntArrayArray215[local82 - 1][local77] = local239;
			}
			if (local82 < 126 && Static27.anIntArrayArray28[local82 + 1][local77] == 0 && (local56[local87 + 2][local93] & 0x60E40000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static52.anIntArray112[local51] = local7 + 1;
				Static101.anIntArray258[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static27.anIntArrayArray28[local82 + 1][local77] = 8;
				Static339.anIntArrayArray215[local82 + 1][local77] = local239;
			}
			if (local77 > 0 && Static27.anIntArrayArray28[local82][local77 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static52.anIntArray112[local51] = local7;
				Static101.anIntArray258[local51] = local9 - 1;
				Static27.anIntArrayArray28[local82][local77 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static339.anIntArrayArray215[local82][local77 - 1] = local239;
			}
			if (local77 < 126 && Static27.anIntArrayArray28[local82][local77 + 1] == 0 && (local56[local87][local93 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static52.anIntArray112[local51] = local7;
				Static101.anIntArray258[local51] = local9 + 1;
				Static27.anIntArrayArray28[local82][local77 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static339.anIntArrayArray215[local82][local77 + 1] = local239;
			}
			if (local82 > 0 && local77 > 0 && Static27.anIntArrayArray28[local82 - 1][local77 - 1] == 0 && (local56[local87 - 1][local93] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local87][local93 - 1] & 0x63E40000) == 0) {
				Static52.anIntArray112[local51] = local7 - 1;
				Static101.anIntArray258[local51] = local9 - 1;
				Static27.anIntArrayArray28[local82 - 1][local77 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static339.anIntArrayArray215[local82 - 1][local77 - 1] = local239;
			}
			if (local82 < 126 && local77 > 0 && Static27.anIntArrayArray28[local82 + 1][local77 - 1] == 0 && (local56[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local93] & 0x78E40000) == 0) {
				Static52.anIntArray112[local51] = local7 + 1;
				Static101.anIntArray258[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static27.anIntArrayArray28[local82 + 1][local77 - 1] = 9;
				Static339.anIntArrayArray215[local82 + 1][local77 - 1] = local239;
			}
			if (local82 > 0 && local77 < 126 && Static27.anIntArrayArray28[local82 - 1][local77 + 1] == 0 && (local56[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local87][local93 + 2] & 0x7E240000) == 0) {
				Static52.anIntArray112[local51] = local7 - 1;
				Static101.anIntArray258[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static27.anIntArrayArray28[local82 - 1][local77 + 1] = 6;
				Static339.anIntArrayArray215[local82 - 1][local77 + 1] = local239;
			}
			if (local82 < 126 && local77 < 126 && Static27.anIntArrayArray28[local82 + 1][local77 + 1] == 0 && (local56[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static52.anIntArray112[local51] = local7 + 1;
				Static101.anIntArray258[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static27.anIntArrayArray28[local82 + 1][local77 + 1] = 12;
				Static339.anIntArrayArray215[local82 + 1][local77 + 1] = local239;
			}
		}
		Static78.anInt1445 = local9;
		Static151.anInt2862 = local7;
		return false;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public static void method4341() {
		Static176.aClass70_59.method1399();
	}
}
