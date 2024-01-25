import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!du", name = "m", descriptor = "I")
	public static int anInt2304;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "Lclient!gj;")
	public static Class124 aClass124_2;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIILclient!mb;IIIIII)Z")
	public static boolean method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class226 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg1;
		@Pc(18) int local18 = arg7 - 64;
		Static533.anIntArrayArray51[64][64] = 99;
		@Pc(34) int local34 = arg1 - 64;
		Static323.anIntArrayArray37[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static669.anIntArray823[0] = arg7;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static1.anIntArray748[0] = arg1;
		@Pc(56) int[][] local56 = arg4.anIntArrayArray39;
		while (local51 != local48) {
			local7 = Static669.anIntArray823[local48];
			local9 = Static1.anIntArray748[local48];
			local48 = local48 + 1 & 0xFFF;
			@Pc(76) int local76 = local7 - local18;
			@Pc(81) int local81 = local9 - local34;
			@Pc(87) int local87 = local7 - arg4.anInt6536;
			@Pc(93) int local93 = local9 - arg4.anInt6545;
			if (arg8 == -4) {
				if (arg3 == local7 && arg0 == local9) {
					Static71.anInt1587 = local9;
					Static437.anInt7796 = local7;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static89.method1687(local7, 2, arg0, local9, 2, arg3, arg2, arg5)) {
					Static437.anInt7796 = local7;
					Static71.anInt1587 = local9;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg4.method5375(local9, 2, arg5, arg3, arg9, local7, arg0, arg2, 2)) {
					Static437.anInt7796 = local7;
					Static71.anInt1587 = local9;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg4.method5367(arg0, arg5, 2, arg2, local7, local9, arg3, arg9)) {
					Static437.anInt7796 = local7;
					Static71.anInt1587 = local9;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg4.method5365(2, local9, arg0, local7, arg6, arg3, arg8)) {
					Static71.anInt1587 = local9;
					Static437.anInt7796 = local7;
					return true;
				}
			} else if (arg4.method5372(2, arg0, arg8, local9, local7, arg3, arg6)) {
				Static437.anInt7796 = local7;
				Static71.anInt1587 = local9;
				return true;
			}
			@Pc(236) int local236 = Static323.anIntArrayArray37[local76][local81] + 1;
			if (local76 > 0 && Static533.anIntArrayArray51[local76 - 1][local81] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static669.anIntArray823[local51] = local7 - 1;
				Static1.anIntArray748[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static533.anIntArrayArray51[local76 - 1][local81] = 2;
				Static323.anIntArrayArray37[local76 - 1][local81] = local236;
			}
			if (local76 < 126 && Static533.anIntArrayArray51[local76 + 1][local81] == 0 && (local56[local87 + 2][local93] & 0x60E40000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static669.anIntArray823[local51] = local7 + 1;
				Static1.anIntArray748[local51] = local9;
				Static533.anIntArrayArray51[local76 + 1][local81] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local76 + 1][local81] = local236;
			}
			if (local81 > 0 && Static533.anIntArrayArray51[local76][local81 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static669.anIntArray823[local51] = local7;
				Static1.anIntArray748[local51] = local9 - 1;
				Static533.anIntArrayArray51[local76][local81 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local76][local81 - 1] = local236;
			}
			if (local81 < 126 && Static533.anIntArrayArray51[local76][local81 + 1] == 0 && (local56[local87][local93 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static669.anIntArray823[local51] = local7;
				Static1.anIntArray748[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static533.anIntArrayArray51[local76][local81 + 1] = 4;
				Static323.anIntArrayArray37[local76][local81 + 1] = local236;
			}
			if (local76 > 0 && local81 > 0 && Static533.anIntArrayArray51[local76 - 1][local81 - 1] == 0 && (local56[local87 - 1][local93] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local87][local93 - 1] & 0x63E40000) == 0) {
				Static669.anIntArray823[local51] = local7 - 1;
				Static1.anIntArray748[local51] = local9 - 1;
				Static533.anIntArrayArray51[local76 - 1][local81 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local76 - 1][local81 - 1] = local236;
			}
			if (local76 < 126 && local81 > 0 && Static533.anIntArrayArray51[local76 + 1][local81 - 1] == 0 && (local56[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local93] & 0x78E40000) == 0) {
				Static669.anIntArray823[local51] = local7 + 1;
				Static1.anIntArray748[local51] = local9 - 1;
				Static533.anIntArrayArray51[local76 + 1][local81 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local76 + 1][local81 - 1] = local236;
			}
			if (local76 > 0 && local81 < 126 && Static533.anIntArrayArray51[local76 - 1][local81 + 1] == 0 && (local56[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local87][local93 + 2] & 0x7E240000) == 0) {
				Static669.anIntArray823[local51] = local7 - 1;
				Static1.anIntArray748[local51] = local9 + 1;
				Static533.anIntArrayArray51[local76 - 1][local81 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local76 - 1][local81 + 1] = local236;
			}
			if (local76 < 126 && local81 < 126 && Static533.anIntArrayArray51[local76 + 1][local81 + 1] == 0 && (local56[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static669.anIntArray823[local51] = local7 + 1;
				Static1.anIntArray748[local51] = local9 + 1;
				Static533.anIntArrayArray51[local76 + 1][local81 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static323.anIntArrayArray37[local76 + 1][local81 + 1] = local236;
			}
		}
		Static71.anInt1587 = local9;
		Static437.anInt7796 = local7;
		return false;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILjava/lang/String;CLjava/lang/String;)Ljava/lang/String;")
	public static String method1958(@OriginalArg(1) String arg0, @OriginalArg(3) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(21) int local21 = 0;
			while (true) {
				local21 = arg0.indexOf(13, local21);
				if (local21 < 0) {
					break;
				}
				local13 += local17;
				local21++;
			}
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(local13);
		@Pc(42) int local42 = 0;
		while (true) {
			@Pc(47) int local47 = arg0.indexOf(13, local42);
			if (local47 < 0) {
				local40.append(arg0.substring(local42));
				return local40.toString();
			}
			local40.append(arg0.substring(local42, local47));
			local42 = local47 + 1;
			local40.append(arg1);
		}
	}
}
