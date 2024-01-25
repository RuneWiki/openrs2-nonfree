import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "J")
	public static long aLong224 = 0L;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([BB)Ljava/lang/String;")
	public static String method6184(@OriginalArg(0) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(23) int local23 = arg0[local15] & 0xFF;
			if (local23 >= 128) {
				if (local23 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local23);
				}
				@Pc(55) int local55;
				if (local23 < 224) {
					if (local15 + 1 >= local8) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local55 = arg0[local15] & 0xFF;
					if (local55 < 128 || local55 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local23 & 0xFFFFFF3F) << 6 | local55 & 0xFFFFFF7F);
				} else if (local23 < 240) {
					if (local8 <= local15 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local55 = arg0[local15] & 0xFF;
					if (local55 < 128 || local55 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(122) int local122 = arg0[local15] & 0xFF;
					if (local122 < 128 || local122 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local55 & 0x3FFFF7F) << 6 | local23 << 12 & 0xFFF1F000 | local122 & 0xFFFFFF7F);
				} else if (local23 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local23);
				}
			} else {
				local11[local13++] = (char) local23;
			}
		}
		return new String(local11, 0, local13);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public static void method6185() {
		if (Static157.aClass185_Sub1_1.method4639(Static192.anInt3828) || Static238.anInt4697 == Static59.anInt1472) {
			Static305.method4695(Static30.aClass30_3);
			if (Static57.anInt1361 != Static59.anInt1472) {
				Static396.method5596();
			}
		} else {
			Static181.method3319(Static245.anInt4783, Static462.anInt7854, 10, false);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIILclient!ue;IIIII)Z")
	public static boolean method6186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class253 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg8 - 64;
		Static227.anIntArrayArray33[64][64] = 99;
		@Pc(29) int local29 = arg2 - 64;
		Static459.anIntArrayArray58[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static405.anIntArray576[0] = arg8;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static336.anIntArray488[0] = arg2;
		@Pc(51) int[][] local51 = arg5.anIntArrayArray55;
		while (local46 != local43) {
			local9 = Static336.anIntArray488[local43];
			local7 = Static405.anIntArray576[local43];
			@Pc(66) int local66 = local7 - local18;
			@Pc(71) int local71 = local9 - local29;
			local43 = local43 + 1 & 0xFFF;
			@Pc(83) int local83 = local7 - arg5.anInt7191;
			@Pc(88) int local88 = local9 - arg5.anInt7189;
			if (arg0 == -4) {
				if (local7 == arg1 && local9 == arg4) {
					Static257.anInt4975 = local9;
					Static240.anInt4706 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static323.method2066(arg9, arg3, arg1, local9, local7, 2, arg4, 2)) {
					Static257.anInt4975 = local9;
					Static240.anInt4706 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg5.method5727(arg1, 2, arg4, local7, arg3, 2, arg9, local9, arg7)) {
					Static240.anInt4706 = local7;
					Static257.anInt4975 = local9;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg5.method5734(arg4, arg7, 2, arg3, arg1, local7, arg9, local9)) {
					Static257.anInt4975 = local9;
					Static240.anInt4706 = local7;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg5.method5738(arg0, arg1, arg4, local7, local9, 2, arg6)) {
					Static240.anInt4706 = local7;
					Static257.anInt4975 = local9;
					return true;
				}
			} else if (arg5.method5735(arg1, arg4, arg6, local9, 2, local7, arg0)) {
				Static240.anInt4706 = local7;
				Static257.anInt4975 = local9;
				return true;
			}
			@Pc(238) int local238 = Static459.anIntArrayArray58[local66][local71] + 1;
			if (local66 > 0 && Static227.anIntArrayArray33[local66 - 1][local71] == 0 && (local51[local83 - 1][local88] & 0x43A40000) == 0 && (local51[local83 - 1][local88 + 1] & 0x4E240000) == 0) {
				Static405.anIntArray576[local46] = local7 - 1;
				Static336.anIntArray488[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local66 - 1][local71] = 2;
				Static459.anIntArrayArray58[local66 - 1][local71] = local238;
			}
			if (local66 < 126 && Static227.anIntArrayArray33[local66 + 1][local71] == 0 && (local51[local83 + 2][local88] & 0x60E40000) == 0 && (local51[local83 + 2][local88 + 1] & 0x78240000) == 0) {
				Static405.anIntArray576[local46] = local7 + 1;
				Static336.anIntArray488[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local66 + 1][local71] = 8;
				Static459.anIntArrayArray58[local66 + 1][local71] = local238;
			}
			if (local71 > 0 && Static227.anIntArrayArray33[local66][local71 - 1] == 0 && (local51[local83][local88 - 1] & 0x43A40000) == 0 && (local51[local83 + 1][local88 - 1] & 0x60E40000) == 0) {
				Static405.anIntArray576[local46] = local7;
				Static336.anIntArray488[local46] = local9 - 1;
				Static227.anIntArrayArray33[local66][local71 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static459.anIntArrayArray58[local66][local71 - 1] = local238;
			}
			if (local71 < 126 && Static227.anIntArrayArray33[local66][local71 + 1] == 0 && (local51[local83][local88 + 2] & 0x4E240000) == 0 && (local51[local83 + 1][local88 + 2] & 0x78240000) == 0) {
				Static405.anIntArray576[local46] = local7;
				Static336.anIntArray488[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local66][local71 + 1] = 4;
				Static459.anIntArrayArray58[local66][local71 + 1] = local238;
			}
			if (local66 > 0 && local71 > 0 && Static227.anIntArrayArray33[local66 - 1][local71 - 1] == 0 && (local51[local83 - 1][local88] & 0x4FA40000) == 0 && (local51[local83 - 1][local88 - 1] & 0x43A40000) == 0 && (local51[local83][local88 - 1] & 0x63E40000) == 0) {
				Static405.anIntArray576[local46] = local7 - 1;
				Static336.anIntArray488[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local66 - 1][local71 - 1] = 3;
				Static459.anIntArrayArray58[local66 - 1][local71 - 1] = local238;
			}
			if (local66 < 126 && local71 > 0 && Static227.anIntArrayArray33[local66 + 1][local71 - 1] == 0 && (local51[local83 + 1][local88 - 1] & 0x63E40000) == 0 && (local51[local83 + 2][local88 - 1] & 0x60E40000) == 0 && (local51[local83 + 2][local88] & 0x78E40000) == 0) {
				Static405.anIntArray576[local46] = local7 + 1;
				Static336.anIntArray488[local46] = local9 - 1;
				Static227.anIntArrayArray33[local66 + 1][local71 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static459.anIntArrayArray58[local66 + 1][local71 - 1] = local238;
			}
			if (local66 > 0 && local71 < 126 && Static227.anIntArrayArray33[local66 - 1][local71 + 1] == 0 && (local51[local83 - 1][local88 + 1] & 0x4FA40000) == 0 && (local51[local83 - 1][local88 + 2] & 0x4E240000) == 0 && (local51[local83][local88 + 2] & 0x7E240000) == 0) {
				Static405.anIntArray576[local46] = local7 - 1;
				Static336.anIntArray488[local46] = local9 + 1;
				Static227.anIntArrayArray33[local66 - 1][local71 + 1] = 6;
				local46 = local46 + 1 & 0xFFF;
				Static459.anIntArrayArray58[local66 - 1][local71 + 1] = local238;
			}
			if (local66 < 126 && local71 < 126 && Static227.anIntArrayArray33[local66 + 1][local71 + 1] == 0 && (local51[local83 + 1][local88 + 2] & 0x7E240000) == 0 && (local51[local83 + 2][local88 + 2] & 0x78240000) == 0 && (local51[local83 + 2][local88 + 1] & 0x78E40000) == 0) {
				Static405.anIntArray576[local46] = local7 + 1;
				Static336.anIntArray488[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local66 + 1][local71 + 1] = 12;
				Static459.anIntArrayArray58[local66 + 1][local71 + 1] = local238;
			}
		}
		Static240.anInt4706 = local7;
		Static257.anInt4975 = local9;
		return false;
	}
}
