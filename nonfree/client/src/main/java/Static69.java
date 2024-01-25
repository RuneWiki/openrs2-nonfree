import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_24 = new Class231("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIBIILclient!sj;II)Z")
	public static boolean method1077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class225 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg3;
		@Pc(15) int local15 = arg0 - 64;
		@Pc(20) int local20 = arg3 - 64;
		Static320.anIntArrayArray138[64][64] = 99;
		Static397.anIntArrayArray168[64][64] = 0;
		@Pc(44) byte local44 = 0;
		Static311.anIntArray475[0] = arg0;
		@Pc(50) int local50 = 0;
		@Pc(53) int local53 = local44 + 1;
		Static228.anIntArray515[0] = arg3;
		@Pc(58) int[][] local58 = arg7.anIntArrayArray159;
		while (local50 != local53) {
			local7 = Static228.anIntArray515[local50];
			local5 = Static311.anIntArray475[local50];
			local50 = local50 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - local20;
			@Pc(81) int local81 = local5 - local15;
			@Pc(87) int local87 = local5 - arg7.anInt6535;
			@Pc(93) int local93 = local7 - arg7.anInt6523;
			if (arg4 == -4) {
				if (local5 == arg1 && arg8 == local7) {
					Static379.anInt3836 = local7;
					Static199.anInt3421 = local5;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static233.method3186(local5, 2, arg5, arg8, arg1, 2, local7, arg6)) {
					Static379.anInt3836 = local7;
					Static199.anInt3421 = local5;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg7.method5189(local7, arg5, arg1, 2, arg8, arg6, local5, 2, arg9)) {
					Static199.anInt3421 = local5;
					Static379.anInt3836 = local7;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg7.method5190(arg5, local5, local7, arg1, arg6, arg8, arg9, 2)) {
					Static199.anInt3421 = local5;
					Static379.anInt3836 = local7;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg7.method5199(2, local7, arg8, arg1, arg2, local5, arg4)) {
					Static379.anInt3836 = local7;
					Static199.anInt3421 = local5;
					return true;
				}
			} else if (arg7.method5196(local5, arg8, 2, arg1, arg2, arg4, local7)) {
				Static379.anInt3836 = local7;
				Static199.anInt3421 = local5;
				return true;
			}
			@Pc(243) int local243 = Static397.anIntArrayArray168[local81][local77] + 1;
			if (local81 > 0 && Static320.anIntArrayArray138[local81 - 1][local77] == 0 && (local58[local87 - 1][local93] & 0x43A40000) == 0 && (local58[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static311.anIntArray475[local53] = local5 - 1;
				Static228.anIntArray515[local53] = local7;
				local53 = local53 + 1 & 0xFFF;
				Static320.anIntArrayArray138[local81 - 1][local77] = 2;
				Static397.anIntArrayArray168[local81 - 1][local77] = local243;
			}
			if (local81 < 126 && Static320.anIntArrayArray138[local81 + 1][local77] == 0 && (local58[local87 + 2][local93] & 0x60E40000) == 0 && (local58[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static311.anIntArray475[local53] = local5 + 1;
				Static228.anIntArray515[local53] = local7;
				local53 = local53 + 1 & 0xFFF;
				Static320.anIntArrayArray138[local81 + 1][local77] = 8;
				Static397.anIntArrayArray168[local81 + 1][local77] = local243;
			}
			if (local77 > 0 && Static320.anIntArrayArray138[local81][local77 - 1] == 0 && (local58[local87][local93 - 1] & 0x43A40000) == 0 && (local58[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static311.anIntArray475[local53] = local5;
				Static228.anIntArray515[local53] = local7 - 1;
				Static320.anIntArrayArray138[local81][local77 - 1] = 1;
				local53 = local53 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local81][local77 - 1] = local243;
			}
			if (local77 < 126 && Static320.anIntArrayArray138[local81][local77 + 1] == 0 && (local58[local87][local93 + 2] & 0x4E240000) == 0 && (local58[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static311.anIntArray475[local53] = local5;
				Static228.anIntArray515[local53] = local7 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static320.anIntArrayArray138[local81][local77 + 1] = 4;
				Static397.anIntArrayArray168[local81][local77 + 1] = local243;
			}
			if (local81 > 0 && local77 > 0 && Static320.anIntArrayArray138[local81 - 1][local77 - 1] == 0 && (local58[local87 - 1][local93] & 0x4FA40000) == 0 && (local58[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local58[local87][local93 - 1] & 0x63E40000) == 0) {
				Static311.anIntArray475[local53] = local5 - 1;
				Static228.anIntArray515[local53] = local7 - 1;
				Static320.anIntArrayArray138[local81 - 1][local77 - 1] = 3;
				local53 = local53 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local81 - 1][local77 - 1] = local243;
			}
			if (local81 < 126 && local77 > 0 && Static320.anIntArrayArray138[local81 + 1][local77 - 1] == 0 && (local58[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local58[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local58[local87 + 2][local93] & 0x78E40000) == 0) {
				Static311.anIntArray475[local53] = local5 + 1;
				Static228.anIntArray515[local53] = local7 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static320.anIntArrayArray138[local81 + 1][local77 - 1] = 9;
				Static397.anIntArrayArray168[local81 + 1][local77 - 1] = local243;
			}
			if (local81 > 0 && local77 < 126 && Static320.anIntArrayArray138[local81 - 1][local77 + 1] == 0 && (local58[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local58[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local58[local87][local93 + 2] & 0x7E240000) == 0) {
				Static311.anIntArray475[local53] = local5 - 1;
				Static228.anIntArray515[local53] = local7 + 1;
				Static320.anIntArrayArray138[local81 - 1][local77 + 1] = 6;
				local53 = local53 + 1 & 0xFFF;
				Static397.anIntArrayArray168[local81 - 1][local77 + 1] = local243;
			}
			if (local81 < 126 && local77 < 126 && Static320.anIntArrayArray138[local81 + 1][local77 + 1] == 0 && (local58[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local58[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local58[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static311.anIntArray475[local53] = local5 + 1;
				Static228.anIntArray515[local53] = local7 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static320.anIntArrayArray138[local81 + 1][local77 + 1] = 12;
				Static397.anIntArrayArray168[local81 + 1][local77 + 1] = local243;
			}
		}
		Static379.anInt3836 = local7;
		Static199.anInt3421 = local5;
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[J[III)V")
	public static void method1079(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) long local16 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local16;
		@Pc(30) int local30 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local30;
		@Pc(48) int local48 = local16 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg2; local50 < arg3; local50++) {
			if (arg0[local50] < local16 + (long) (local48 & local50)) {
				@Pc(71) long local71 = arg0[local50];
				arg0[local50] = arg0[local12];
				arg0[local12] = local71;
				@Pc(85) int local85 = arg1[local50];
				arg1[local50] = arg1[local12];
				arg1[local12++] = local85;
			}
		}
		arg0[arg3] = arg0[local12];
		arg0[local12] = local16;
		arg1[arg3] = arg1[local12];
		arg1[local12] = local30;
		method1079(arg0, arg1, arg2, local12 - 1);
		method1079(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!za;Lclient!md;)I")
	public static int method1086(@OriginalArg(1) Class75 arg0, @OriginalArg(2) Class168 arg1) {
		if (arg1.anInt4344 != -1) {
			return arg1.anInt4344;
		}
		if (arg1.anInt4349 != -1) {
			@Pc(33) Class257 local33 = arg0.anInterface7_8.method1170(arg0.method6002() ? arg1.anInt4349 : arg1.anInt4353);
			if (!local33.aBoolean485) {
				return local33.aShort101;
			}
		}
		return arg1.anInt4338;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)V")
	public static void method1090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = Static301.method3387(Static123.anInt2069, Static118.anInt2005, arg1);
		@Pc(15) int local15 = Static301.method3387(Static123.anInt2069, Static118.anInt2005, arg4);
		@Pc(21) int local21 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg3);
		@Pc(27) int local27 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg2);
		for (@Pc(37) int local37 = local9; local37 <= local15; local37++) {
			Static215.method3035(local21, local27, Static46.anIntArrayArray24[local37], arg0);
		}
	}
}
