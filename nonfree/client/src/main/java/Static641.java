import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_97 = new Class181(78, -1);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIILclient!kb;IIIBI)Z")
	public static boolean method8812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class182 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(25) int local25 = arg4;
		@Pc(34) int local34 = arg8 - 64;
		@Pc(38) int local38 = arg4 - 64;
		Static608.anIntArrayArray61[64][64] = 99;
		Static151.anIntArrayArray14[64][64] = 0;
		@Pc(52) byte local52 = 0;
		Static9.anIntArray13[0] = arg8;
		@Pc(58) int local58 = 0;
		@Pc(61) int local61 = local52 + 1;
		Static84.anIntArray110[0] = arg4;
		@Pc(66) int[][] local66 = arg5.anIntArrayArray21;
		while (local58 != local61) {
			local25 = Static84.anIntArray110[local58];
			local7 = Static9.anIntArray13[local58];
			@Pc(81) int local81 = local7 - local34;
			@Pc(86) int local86 = local25 - local38;
			local58 = local58 + 1 & 0xFFF;
			@Pc(98) int local98 = local7 - arg5.anInt4545;
			@Pc(103) int local103 = local25 - arg5.anInt4560;
			if (arg0 == -4) {
				if (arg1 == local7 && arg7 == local25) {
					Static30.anInt607 = local25;
					Static142.anInt8583 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static409.method6259(2, arg3, local25, arg7, 2, arg2, arg1, local7)) {
					Static30.anInt607 = local25;
					Static142.anInt8583 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg5.method4173(2, arg2, arg3, arg7, local7, arg1, arg9, 2, local25)) {
					Static30.anInt607 = local25;
					Static142.anInt8583 = local7;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg5.method4168(arg1, arg2, 2, arg7, local25, arg3, local7, arg9)) {
					Static142.anInt8583 = local7;
					Static30.anInt607 = local25;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg5.method4175(arg6, local25, arg0, 2, arg1, local7, arg7)) {
					Static142.anInt8583 = local7;
					Static30.anInt607 = local25;
					return true;
				}
			} else if (arg5.method4167(2, arg6, arg0, local7, arg7, arg1, local25)) {
				Static30.anInt607 = local25;
				Static142.anInt8583 = local7;
				return true;
			}
			@Pc(256) int local256 = Static151.anIntArrayArray14[local81][local86] + 1;
			if (local81 > 0 && Static608.anIntArrayArray61[local81 - 1][local86] == 0 && (local66[local98 - 1][local103] & 0x43A40000) == 0 && (local66[local98 - 1][local103 + 1] & 0x4E240000) == 0) {
				Static9.anIntArray13[local61] = local7 - 1;
				Static84.anIntArray110[local61] = local25;
				Static608.anIntArrayArray61[local81 - 1][local86] = 2;
				local61 = local61 + 1 & 0xFFF;
				Static151.anIntArrayArray14[local81 - 1][local86] = local256;
			}
			if (local81 < 126 && Static608.anIntArrayArray61[local81 + 1][local86] == 0 && (local66[local98 + 2][local103] & 0x60E40000) == 0 && (local66[local98 + 2][local103 + 1] & 0x78240000) == 0) {
				Static9.anIntArray13[local61] = local7 + 1;
				Static84.anIntArray110[local61] = local25;
				Static608.anIntArrayArray61[local81 + 1][local86] = 8;
				local61 = local61 + 1 & 0xFFF;
				Static151.anIntArrayArray14[local81 + 1][local86] = local256;
			}
			if (local86 > 0 && Static608.anIntArrayArray61[local81][local86 - 1] == 0 && (local66[local98][local103 - 1] & 0x43A40000) == 0 && (local66[local98 + 1][local103 - 1] & 0x60E40000) == 0) {
				Static9.anIntArray13[local61] = local7;
				Static84.anIntArray110[local61] = local25 - 1;
				local61 = local61 + 1 & 0xFFF;
				Static608.anIntArrayArray61[local81][local86 - 1] = 1;
				Static151.anIntArrayArray14[local81][local86 - 1] = local256;
			}
			if (local86 < 126 && Static608.anIntArrayArray61[local81][local86 + 1] == 0 && (local66[local98][local103 + 2] & 0x4E240000) == 0 && (local66[local98 + 1][local103 + 2] & 0x78240000) == 0) {
				Static9.anIntArray13[local61] = local7;
				Static84.anIntArray110[local61] = local25 + 1;
				local61 = local61 + 1 & 0xFFF;
				Static608.anIntArrayArray61[local81][local86 + 1] = 4;
				Static151.anIntArrayArray14[local81][local86 + 1] = local256;
			}
			if (local81 > 0 && local86 > 0 && Static608.anIntArrayArray61[local81 - 1][local86 - 1] == 0 && (local66[local98 - 1][local103] & 0x4FA40000) == 0 && (local66[local98 - 1][local103 - 1] & 0x43A40000) == 0 && (local66[local98][local103 - 1] & 0x63E40000) == 0) {
				Static9.anIntArray13[local61] = local7 - 1;
				Static84.anIntArray110[local61] = local25 - 1;
				Static608.anIntArrayArray61[local81 - 1][local86 - 1] = 3;
				local61 = local61 + 1 & 0xFFF;
				Static151.anIntArrayArray14[local81 - 1][local86 - 1] = local256;
			}
			if (local81 < 126 && local86 > 0 && Static608.anIntArrayArray61[local81 + 1][local86 - 1] == 0 && (local66[local98 + 1][local103 - 1] & 0x63E40000) == 0 && (local66[local98 + 2][local103 - 1] & 0x60E40000) == 0 && (local66[local98 + 2][local103] & 0x78E40000) == 0) {
				Static9.anIntArray13[local61] = local7 + 1;
				Static84.anIntArray110[local61] = local25 - 1;
				Static608.anIntArrayArray61[local81 + 1][local86 - 1] = 9;
				local61 = local61 + 1 & 0xFFF;
				Static151.anIntArrayArray14[local81 + 1][local86 - 1] = local256;
			}
			if (local81 > 0 && local86 < 126 && Static608.anIntArrayArray61[local81 - 1][local86 + 1] == 0 && (local66[local98 - 1][local103 + 1] & 0x4FA40000) == 0 && (local66[local98 - 1][local103 + 2] & 0x4E240000) == 0 && (local66[local98][local103 + 2] & 0x7E240000) == 0) {
				Static9.anIntArray13[local61] = local7 - 1;
				Static84.anIntArray110[local61] = local25 + 1;
				Static608.anIntArrayArray61[local81 - 1][local86 + 1] = 6;
				local61 = local61 + 1 & 0xFFF;
				Static151.anIntArrayArray14[local81 - 1][local86 + 1] = local256;
			}
			if (local81 < 126 && local86 < 126 && Static608.anIntArrayArray61[local81 + 1][local86 + 1] == 0 && (local66[local98 + 1][local103 + 2] & 0x7E240000) == 0 && (local66[local98 + 2][local103 + 2] & 0x78240000) == 0 && (local66[local98 + 2][local103 + 1] & 0x78E40000) == 0) {
				Static9.anIntArray13[local61] = local7 + 1;
				Static84.anIntArray110[local61] = local25 + 1;
				Static608.anIntArrayArray61[local81 + 1][local86 + 1] = 12;
				local61 = local61 + 1 & 0xFFF;
				Static151.anIntArrayArray14[local81 + 1][local86 + 1] = local256;
			}
		}
		Static30.anInt607 = local25;
		Static142.anInt8583 = local7;
		return false;
	}
}
