import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!uha", name = "e", descriptor = "[I")
	public static final int[] anIntArray661 = new int[1000];

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIILclient!fe;IIIIIII)Z")
	public static boolean method8536(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class104 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg8 - 64;
		@Pc(23) int local23 = arg4 - 64;
		Static475.anIntArrayArray57[64][64] = 99;
		Static5.anIntArrayArray1[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static407.anIntArray495[0] = arg8;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static485.anIntArray581[0] = arg4;
		@Pc(56) int[][] local56 = arg2.anIntArrayArray17;
		while (local51 != local48) {
			local9 = Static485.anIntArray581[local48];
			local7 = Static407.anIntArray495[local48];
			local48 = local48 + 1 & 0xFFF;
			@Pc(76) int local76 = local7 - local18;
			@Pc(81) int local81 = local9 - local23;
			@Pc(87) int local87 = local7 - arg2.anInt3585;
			@Pc(93) int local93 = local9 - arg2.anInt3573;
			if (arg0 == -4) {
				if (arg3 == local7 && arg1 == local9) {
					Static604.anInt10625 = local7;
					Static359.anInt7117 = local9;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static164.method3541(arg5, arg1, 2, local7, local9, arg3, 2, arg6)) {
					Static359.anInt7117 = local9;
					Static604.anInt10625 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg2.method3252(arg3, arg7, 2, arg6, local7, 2, local9, arg1, arg5)) {
					Static604.anInt10625 = local7;
					Static359.anInt7117 = local9;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg2.method3258(local7, arg1, 2, arg6, arg5, arg7, local9, arg3)) {
					Static604.anInt10625 = local7;
					Static359.anInt7117 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg2.method3250(arg3, local9, 2, arg9, local7, arg1, arg0)) {
					Static604.anInt10625 = local7;
					Static359.anInt7117 = local9;
					return true;
				}
			} else if (arg2.method3259(arg1, local9, arg3, local7, arg0, arg9, 2)) {
				Static604.anInt10625 = local7;
				Static359.anInt7117 = local9;
				return true;
			}
			@Pc(246) int local246 = Static5.anIntArrayArray1[local76][local81] + 1;
			if (local76 > 0 && Static475.anIntArrayArray57[local76 - 1][local81] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static407.anIntArray495[local51] = local7 - 1;
				Static485.anIntArray581[local51] = local9;
				Static475.anIntArrayArray57[local76 - 1][local81] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static5.anIntArrayArray1[local76 - 1][local81] = local246;
			}
			if (local76 < 126 && Static475.anIntArrayArray57[local76 + 1][local81] == 0 && (local56[local87 + 2][local93] & 0x60E40000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static407.anIntArray495[local51] = local7 + 1;
				Static485.anIntArray581[local51] = local9;
				Static475.anIntArrayArray57[local76 + 1][local81] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static5.anIntArrayArray1[local76 + 1][local81] = local246;
			}
			if (local81 > 0 && Static475.anIntArrayArray57[local76][local81 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static407.anIntArray495[local51] = local7;
				Static485.anIntArray581[local51] = local9 - 1;
				Static475.anIntArrayArray57[local76][local81 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static5.anIntArrayArray1[local76][local81 - 1] = local246;
			}
			if (local81 < 126 && Static475.anIntArrayArray57[local76][local81 + 1] == 0 && (local56[local87][local93 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static407.anIntArray495[local51] = local7;
				Static485.anIntArray581[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static475.anIntArrayArray57[local76][local81 + 1] = 4;
				Static5.anIntArrayArray1[local76][local81 + 1] = local246;
			}
			if (local76 > 0 && local81 > 0 && Static475.anIntArrayArray57[local76 - 1][local81 - 1] == 0 && (local56[local87 - 1][local93] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local87][local93 - 1] & 0x63E40000) == 0) {
				Static407.anIntArray495[local51] = local7 - 1;
				Static485.anIntArray581[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static475.anIntArrayArray57[local76 - 1][local81 - 1] = 3;
				Static5.anIntArrayArray1[local76 - 1][local81 - 1] = local246;
			}
			if (local76 < 126 && local81 > 0 && Static475.anIntArrayArray57[local76 + 1][local81 - 1] == 0 && (local56[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local93] & 0x78E40000) == 0) {
				Static407.anIntArray495[local51] = local7 + 1;
				Static485.anIntArray581[local51] = local9 - 1;
				Static475.anIntArrayArray57[local76 + 1][local81 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static5.anIntArrayArray1[local76 + 1][local81 - 1] = local246;
			}
			if (local76 > 0 && local81 < 126 && Static475.anIntArrayArray57[local76 - 1][local81 + 1] == 0 && (local56[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local87][local93 + 2] & 0x7E240000) == 0) {
				Static407.anIntArray495[local51] = local7 - 1;
				Static485.anIntArray581[local51] = local9 + 1;
				Static475.anIntArrayArray57[local76 - 1][local81 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static5.anIntArrayArray1[local76 - 1][local81 + 1] = local246;
			}
			if (local76 < 126 && local81 < 126 && Static475.anIntArrayArray57[local76 + 1][local81 + 1] == 0 && (local56[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static407.anIntArray495[local51] = local7 + 1;
				Static485.anIntArray581[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static475.anIntArrayArray57[local76 + 1][local81 + 1] = 12;
				Static5.anIntArrayArray1[local76 + 1][local81 + 1] = local246;
			}
		}
		Static604.anInt10625 = local7;
		Static359.anInt7117 = local9;
		return false;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "([BB)V")
	public static void method8542(@OriginalArg(0) byte[] arg0) {
		@Pc(26) Class2_Sub11 local26 = new Class2_Sub11(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(30) int local30 = local26.method8383();
					if (local30 == 0) {
						return;
					}
					if (local30 == 1) {
						@Pc(124) int[] local124 = Static312.anIntArray389 = new int[6];
						local124[0] = local26.method8326();
						local124[1] = local26.method8326();
						local124[2] = local26.method8326();
						local124[3] = local26.method8326();
						local124[4] = local26.method8326();
						local124[5] = local26.method8326();
					} else {
						@Pc(53) int local53;
						@Pc(48) int local48;
						if (local30 == 4) {
							local48 = local26.method8383();
							Static291.anIntArray362 = new int[local48];
							for (local53 = 0; local53 < local48; local53++) {
								Static291.anIntArray362[local53] = local26.method8326();
								if (Static291.anIntArray362[local53] == 65535) {
									Static291.anIntArray362[local53] = -1;
								}
							}
						} else if (local30 == 5) {
							local48 = local26.method8383();
							Static543.anIntArray640 = new int[local48];
							for (local53 = 0; local53 < local48; local53++) {
								Static543.anIntArray640[local53] = local26.method8326();
								if (Static543.anIntArray640[local53] == 65535) {
									Static543.anIntArray640[local53] = -1;
								}
							}
						}
					}
				}
			}
		}
	}
}
