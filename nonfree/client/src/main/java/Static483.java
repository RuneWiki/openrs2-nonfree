import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!uaa", name = "S", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_261 = new Class88("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!uaa", name = "V", descriptor = "[[I")
	public static final int[][] anIntArrayArray82 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!uaa", name = "X", descriptor = "[I")
	public static final int[] anIntArray654 = new int[25];

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method7236(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IBIIILclient!ld;IIIII)Z")
	public static boolean method7238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class184 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg6;
		@Pc(25) int local25 = arg5 - 64;
		Static315.anIntArrayArray56[64][64] = 99;
		@Pc(36) int local36 = arg6 - 64;
		Static412.anIntArrayArray71[64][64] = 0;
		@Pc(44) byte local44 = 0;
		Static449.anIntArray613[0] = arg5;
		@Pc(50) int local50 = 0;
		@Pc(53) int local53 = local44 + 1;
		Static97.anIntArray199[0] = arg6;
		@Pc(58) int[][] local58 = arg4.anIntArrayArray51;
		while (local53 != local50) {
			local9 = Static97.anIntArray199[local50];
			local7 = Static449.anIntArray613[local50];
			local50 = local50 + 1 & 0xFFF;
			@Pc(79) int local79 = local9 - local36;
			@Pc(84) int local84 = local7 - local25;
			@Pc(90) int local90 = local7 - arg4.anInt5439;
			@Pc(96) int local96 = local9 - arg4.anInt5440;
			if (arg8 == -4) {
				if (arg7 == local7 && local9 == arg2) {
					Static429.anInt7947 = local9;
					Static288.anInt5601 = local7;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static176.method3493(local7, arg0, local9, 2, arg7, arg9, 2, arg2)) {
					Static429.anInt7947 = local9;
					Static288.anInt5601 = local7;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg4.method4598(2, arg3, arg7, local7, local9, 2, arg2, arg0, arg9)) {
					Static429.anInt7947 = local9;
					Static288.anInt5601 = local7;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg4.method4594(arg2, local7, arg7, arg0, 2, arg9, arg3, local9)) {
					Static429.anInt7947 = local9;
					Static288.anInt5601 = local7;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg4.method4586(arg2, arg7, local7, arg1, arg8, local9, 2)) {
					Static288.anInt5601 = local7;
					Static429.anInt7947 = local9;
					return true;
				}
			} else if (arg4.method4592(local9, arg8, arg2, 2, arg1, local7, arg7)) {
				Static429.anInt7947 = local9;
				Static288.anInt5601 = local7;
				return true;
			}
			@Pc(248) int local248 = Static412.anIntArrayArray71[local84][local79] + 1;
			if (local84 > 0 && Static315.anIntArrayArray56[local84 - 1][local79] == 0 && (local58[local90 - 1][local96] & 0x43A40000) == 0 && (local58[local90 - 1][local96 + 1] & 0x4E240000) == 0) {
				Static449.anIntArray613[local53] = local7 - 1;
				Static97.anIntArray199[local53] = local9;
				Static315.anIntArrayArray56[local84 - 1][local79] = 2;
				local53 = local53 + 1 & 0xFFF;
				Static412.anIntArrayArray71[local84 - 1][local79] = local248;
			}
			if (local84 < 126 && Static315.anIntArrayArray56[local84 + 1][local79] == 0 && (local58[local90 + 2][local96] & 0x60E40000) == 0 && (local58[local90 + 2][local96 + 1] & 0x78240000) == 0) {
				Static449.anIntArray613[local53] = local7 + 1;
				Static97.anIntArray199[local53] = local9;
				local53 = local53 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local84 + 1][local79] = 8;
				Static412.anIntArrayArray71[local84 + 1][local79] = local248;
			}
			if (local79 > 0 && Static315.anIntArrayArray56[local84][local79 - 1] == 0 && (local58[local90][local96 - 1] & 0x43A40000) == 0 && (local58[local90 + 1][local96 - 1] & 0x60E40000) == 0) {
				Static449.anIntArray613[local53] = local7;
				Static97.anIntArray199[local53] = local9 - 1;
				Static315.anIntArrayArray56[local84][local79 - 1] = 1;
				local53 = local53 + 1 & 0xFFF;
				Static412.anIntArrayArray71[local84][local79 - 1] = local248;
			}
			if (local79 < 126 && Static315.anIntArrayArray56[local84][local79 + 1] == 0 && (local58[local90][local96 + 2] & 0x4E240000) == 0 && (local58[local90 + 1][local96 + 2] & 0x78240000) == 0) {
				Static449.anIntArray613[local53] = local7;
				Static97.anIntArray199[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local84][local79 + 1] = 4;
				Static412.anIntArrayArray71[local84][local79 + 1] = local248;
			}
			if (local84 > 0 && local79 > 0 && Static315.anIntArrayArray56[local84 - 1][local79 - 1] == 0 && (local58[local90 - 1][local96] & 0x4FA40000) == 0 && (local58[local90 - 1][local96 - 1] & 0x43A40000) == 0 && (local58[local90][local96 - 1] & 0x63E40000) == 0) {
				Static449.anIntArray613[local53] = local7 - 1;
				Static97.anIntArray199[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local84 - 1][local79 - 1] = 3;
				Static412.anIntArrayArray71[local84 - 1][local79 - 1] = local248;
			}
			if (local84 < 126 && local79 > 0 && Static315.anIntArrayArray56[local84 + 1][local79 - 1] == 0 && (local58[local90 + 1][local96 - 1] & 0x63E40000) == 0 && (local58[local90 + 2][local96 - 1] & 0x60E40000) == 0 && (local58[local90 + 2][local96] & 0x78E40000) == 0) {
				Static449.anIntArray613[local53] = local7 + 1;
				Static97.anIntArray199[local53] = local9 - 1;
				Static315.anIntArrayArray56[local84 + 1][local79 - 1] = 9;
				local53 = local53 + 1 & 0xFFF;
				Static412.anIntArrayArray71[local84 + 1][local79 - 1] = local248;
			}
			if (local84 > 0 && local79 < 126 && Static315.anIntArrayArray56[local84 - 1][local79 + 1] == 0 && (local58[local90 - 1][local96 + 1] & 0x4FA40000) == 0 && (local58[local90 - 1][local96 + 2] & 0x4E240000) == 0 && (local58[local90][local96 + 2] & 0x7E240000) == 0) {
				Static449.anIntArray613[local53] = local7 - 1;
				Static97.anIntArray199[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local84 - 1][local79 + 1] = 6;
				Static412.anIntArrayArray71[local84 - 1][local79 + 1] = local248;
			}
			if (local84 < 126 && local79 < 126 && Static315.anIntArrayArray56[local84 + 1][local79 + 1] == 0 && (local58[local90 + 1][local96 + 2] & 0x7E240000) == 0 && (local58[local90 + 2][local96 + 2] & 0x78240000) == 0 && (local58[local90 + 2][local96 + 1] & 0x78E40000) == 0) {
				Static449.anIntArray613[local53] = local7 + 1;
				Static97.anIntArray199[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local84 + 1][local79 + 1] = 12;
				Static412.anIntArrayArray71[local84 + 1][local79 + 1] = local248;
			}
		}
		Static429.anInt7947 = local9;
		Static288.anInt5601 = local7;
		return false;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)I")
	public static int method7240(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}
}
