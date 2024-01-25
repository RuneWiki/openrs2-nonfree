import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!md", name = "Rb", descriptor = "I")
	public static int anInt4488;

	@OriginalMember(owner = "client!md", name = "Sb", descriptor = "I")
	public static int anInt4489;

	@OriginalMember(owner = "client!md", name = "Tb", descriptor = "I")
	public static int anInt4490;

	@OriginalMember(owner = "client!md", name = "Mb", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_33 = new Class44(64);

	@OriginalMember(owner = "client!md", name = "Vb", descriptor = "I")
	public static int anInt4492 = 0;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(III)V")
	public static void method3798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static24.aClass36_2 == Static4.aClass36_5) {
			if (!Static292.method4382(false, arg0, 0, arg1, 1, 0, 1, -2)) {
				Static292.method4382(false, arg0, 0, arg1, 1, 0, 1, -3);
			}
		} else if (!Static292.method4382(false, arg0, 0, arg1, 1, 0, 1, -3)) {
			Static292.method4382(false, arg0, 0, arg1, 1, 0, 1, -2);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!qo;IIIIIIIIII)Z")
	public static boolean method3799(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg9;
		@Pc(17) int local17 = arg7 - 64;
		@Pc(21) int local21 = arg9 - 64;
		Static336.anIntArrayArray37[64][64] = 99;
		Static203.anIntArrayArray25[64][64] = 0;
		@Pc(43) byte local43 = 0;
		Static146.anIntArray183[0] = arg7;
		@Pc(49) int local49 = 0;
		@Pc(52) int local52 = local43 + 1;
		Static190.anIntArray25[0] = arg9;
		@Pc(57) int[][] local57 = arg0.anIntArrayArray34;
		while (local52 != local49) {
			local7 = Static146.anIntArray183[local49];
			local9 = Static190.anIntArray25[local49];
			@Pc(71) int local71 = local7 - local17;
			@Pc(76) int local76 = local7 - arg0.anInt5599;
			@Pc(81) int local81 = local9 - local21;
			local49 = local49 + 1 & 0xFFF;
			@Pc(93) int local93 = local9 - arg0.anInt5598;
			if (arg5 == -4) {
				if (local7 == arg4 && arg1 == local9) {
					Static219.anInt3951 = local7;
					Static446.anInt8003 = local9;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static9.method304(arg8, arg1, arg4, local9, 1, local7, arg2, 1)) {
					Static219.anInt3951 = local7;
					Static446.anInt8003 = local9;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg0.method4711(local7, arg8, arg2, 1, arg6, local9, arg4, arg1, 1)) {
					Static219.anInt3951 = local7;
					Static446.anInt8003 = local9;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg0.method4703(1, arg4, arg8, arg1, local9, arg2, arg6, local7)) {
					Static446.anInt8003 = local9;
					Static219.anInt3951 = local7;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg0.method4704(local7, arg3, 1, arg5, arg4, arg1, local9)) {
					Static446.anInt8003 = local9;
					Static219.anInt3951 = local7;
					return true;
				}
			} else if (arg0.method4712(arg5, 1, arg4, arg3, arg1, local9, local7)) {
				Static219.anInt3951 = local7;
				Static446.anInt8003 = local9;
				return true;
			}
			@Pc(245) int local245 = Static203.anIntArrayArray25[local71][local81] + 1;
			if (local71 > 0 && Static336.anIntArrayArray37[local71 - 1][local81] == 0 && (local57[local76 - 1][local93] & 0x42240000) == 0) {
				Static146.anIntArray183[local52] = local7 - 1;
				Static190.anIntArray25[local52] = local9;
				Static336.anIntArrayArray37[local71 - 1][local81] = 2;
				local52 = local52 + 1 & 0xFFF;
				Static203.anIntArrayArray25[local71 - 1][local81] = local245;
			}
			if (local71 < 127 && Static336.anIntArrayArray37[local71 + 1][local81] == 0 && (local57[local76 + 1][local93] & 0x60240000) == 0) {
				Static146.anIntArray183[local52] = local7 + 1;
				Static190.anIntArray25[local52] = local9;
				local52 = local52 + 1 & 0xFFF;
				Static336.anIntArrayArray37[local71 + 1][local81] = 8;
				Static203.anIntArrayArray25[local71 + 1][local81] = local245;
			}
			if (local81 > 0 && Static336.anIntArrayArray37[local71][local81 - 1] == 0 && (local57[local76][local93 - 1] & 0x40A40000) == 0) {
				Static146.anIntArray183[local52] = local7;
				Static190.anIntArray25[local52] = local9 - 1;
				Static336.anIntArrayArray37[local71][local81 - 1] = 1;
				local52 = local52 + 1 & 0xFFF;
				Static203.anIntArrayArray25[local71][local81 - 1] = local245;
			}
			if (local81 < 127 && Static336.anIntArrayArray37[local71][local81 + 1] == 0 && (local57[local76][local93 + 1] & 0x48240000) == 0) {
				Static146.anIntArray183[local52] = local7;
				Static190.anIntArray25[local52] = local9 + 1;
				Static336.anIntArrayArray37[local71][local81 + 1] = 4;
				local52 = local52 + 1 & 0xFFF;
				Static203.anIntArrayArray25[local71][local81 + 1] = local245;
			}
			if (local71 > 0 && local81 > 0 && Static336.anIntArrayArray37[local71 - 1][local81 - 1] == 0 && (local57[local76 - 1][local93 - 1] & 0x43A40000) == 0 && (local57[local76 - 1][local93] & 0x42240000) == 0 && (local57[local76][local93 - 1] & 0x40A40000) == 0) {
				Static146.anIntArray183[local52] = local7 - 1;
				Static190.anIntArray25[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static336.anIntArrayArray37[local71 - 1][local81 - 1] = 3;
				Static203.anIntArrayArray25[local71 - 1][local81 - 1] = local245;
			}
			if (local71 < 127 && local81 > 0 && Static336.anIntArrayArray37[local71 + 1][local81 - 1] == 0 && (local57[local76 + 1][local93 - 1] & 0x60E40000) == 0 && (local57[local76 + 1][local93] & 0x60240000) == 0 && (local57[local76][local93 - 1] & 0x40A40000) == 0) {
				Static146.anIntArray183[local52] = local7 + 1;
				Static190.anIntArray25[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static336.anIntArrayArray37[local71 + 1][local81 - 1] = 9;
				Static203.anIntArrayArray25[local71 + 1][local81 - 1] = local245;
			}
			if (local71 > 0 && local81 < 127 && Static336.anIntArrayArray37[local71 - 1][local81 + 1] == 0 && (local57[local76 - 1][local93 + 1] & 0x4E240000) == 0 && (local57[local76 - 1][local93] & 0x42240000) == 0 && (local57[local76][local93 + 1] & 0x48240000) == 0) {
				Static146.anIntArray183[local52] = local7 - 1;
				Static190.anIntArray25[local52] = local9 + 1;
				Static336.anIntArrayArray37[local71 - 1][local81 + 1] = 6;
				local52 = local52 + 1 & 0xFFF;
				Static203.anIntArrayArray25[local71 - 1][local81 + 1] = local245;
			}
			if (local71 < 127 && local81 < 127 && Static336.anIntArrayArray37[local71 + 1][local81 + 1] == 0 && (local57[local76 + 1][local93 + 1] & 0x78240000) == 0 && (local57[local76 + 1][local93] & 0x60240000) == 0 && (local57[local76][local93 + 1] & 0x48240000) == 0) {
				Static146.anIntArray183[local52] = local7 + 1;
				Static190.anIntArray25[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static336.anIntArrayArray37[local71 + 1][local81 + 1] = 12;
				Static203.anIntArrayArray25[local71 + 1][local81 + 1] = local245;
			}
		}
		Static219.anInt3951 = local7;
		Static446.anInt8003 = local9;
		return false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method3800(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(22) char local22 = arg0.charAt(local13);
			if (local22 > '\u0000' && local22 < '\u0080' || !(local22 < ' ' || local22 > 'ÿ')) {
				local11[local13] = (byte) local22;
			} else if (local22 == '€') {
				local11[local13] = -128;
			} else if (local22 == '‚') {
				local11[local13] = -126;
			} else if (local22 == 'ƒ') {
				local11[local13] = -125;
			} else if (local22 == '„') {
				local11[local13] = -124;
			} else if (local22 == '…') {
				local11[local13] = -123;
			} else if (local22 == '†') {
				local11[local13] = -122;
			} else if (local22 == '‡') {
				local11[local13] = -121;
			} else if (local22 == 'ˆ') {
				local11[local13] = -120;
			} else if (local22 == '‰') {
				local11[local13] = -119;
			} else if (local22 == 'Š') {
				local11[local13] = -118;
			} else if (local22 == '‹') {
				local11[local13] = -117;
			} else if (local22 == 'Œ') {
				local11[local13] = -116;
			} else if (local22 == 'Ž') {
				local11[local13] = -114;
			} else if (local22 == '‘') {
				local11[local13] = -111;
			} else if (local22 == '’') {
				local11[local13] = -110;
			} else if (local22 == '“') {
				local11[local13] = -109;
			} else if (local22 == '”') {
				local11[local13] = -108;
			} else if (local22 == '•') {
				local11[local13] = -107;
			} else if (local22 == '–') {
				local11[local13] = -106;
			} else if (local22 == '—') {
				local11[local13] = -105;
			} else if (local22 == '˜') {
				local11[local13] = -104;
			} else if (local22 == '™') {
				local11[local13] = -103;
			} else if (local22 == 'š') {
				local11[local13] = -102;
			} else if (local22 == '›') {
				local11[local13] = -101;
			} else if (local22 == 'œ') {
				local11[local13] = -100;
			} else if (local22 == 'ž') {
				local11[local13] = -98;
			} else if (local22 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(III)V")
	public static void method3802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass3_Sub1_2 != null) {
			local7.aClass3_Sub1_2 = null;
		}
		if (local7.aClass3_Sub1_3 != null) {
			local7.aClass3_Sub1_3 = null;
		}
	}
}
