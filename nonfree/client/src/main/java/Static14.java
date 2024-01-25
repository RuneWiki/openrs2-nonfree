import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_6 = new Class57("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!an", name = "c", descriptor = "Lclient!us;")
	public static final Class234 aClass234_8 = new Class234(57, -1);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIILclient!ee;IIIIII)Z")
	public static boolean method185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg8;
		@Pc(17) int local17 = arg4 - 64;
		Static221.anIntArrayArray38[64][64] = 99;
		@Pc(44) int local44 = arg8 - 64;
		Static389.anIntArrayArray60[64][64] = 0;
		@Pc(52) byte local52 = 0;
		Static136.anIntArray274[0] = arg4;
		@Pc(58) int local58 = 0;
		@Pc(61) int local61 = local52 + 1;
		Static269.anIntArray524[0] = arg8;
		@Pc(66) int[][] local66 = arg3.anIntArrayArray19;
		while (local61 != local58) {
			local9 = Static269.anIntArray524[local58];
			local7 = Static136.anIntArray274[local58];
			@Pc(81) int local81 = local7 - local17;
			local58 = local58 + 1 & 0xFFF;
			@Pc(91) int local91 = local9 - local44;
			@Pc(97) int local97 = local7 - arg3.anInt1637;
			@Pc(103) int local103 = local9 - arg3.anInt1639;
			if (arg9 == -4) {
				if (arg1 == local7 && local9 == arg5) {
					Static274.anInt4765 = local7;
					Static319.anInt5443 = local9;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static252.method4104(arg7, arg6, 2, arg1, local7, arg5, local9, 2)) {
					Static274.anInt4765 = local7;
					Static319.anInt5443 = local9;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg3.method1323(arg5, arg1, arg6, 2, local7, arg7, local9, 2, arg2)) {
					Static319.anInt5443 = local9;
					Static274.anInt4765 = local7;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg3.method1339(local7, arg5, 2, local9, arg7, arg6, arg1, arg2)) {
					Static319.anInt5443 = local9;
					Static274.anInt4765 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg3.method1331(arg0, local9, arg5, local7, arg1, 2, arg9)) {
					Static274.anInt4765 = local7;
					Static319.anInt5443 = local9;
					return true;
				}
			} else if (arg3.method1326(arg9, local7, local9, arg0, 2, arg1, arg5)) {
				Static274.anInt4765 = local7;
				Static319.anInt5443 = local9;
				return true;
			}
			@Pc(261) int local261 = Static389.anIntArrayArray60[local81][local91] + 1;
			if (local81 > 0 && Static221.anIntArrayArray38[local81 - 1][local91] == 0 && (local66[local97 - 1][local103] & 0x43A40000) == 0 && (local66[local97 - 1][local103 + 1] & 0x4E240000) == 0) {
				Static136.anIntArray274[local61] = local7 - 1;
				Static269.anIntArray524[local61] = local9;
				Static221.anIntArrayArray38[local81 - 1][local91] = 2;
				local61 = local61 + 1 & 0xFFF;
				Static389.anIntArrayArray60[local81 - 1][local91] = local261;
			}
			if (local81 < 126 && Static221.anIntArrayArray38[local81 + 1][local91] == 0 && (local66[local97 + 2][local103] & 0x60E40000) == 0 && (local66[local97 + 2][local103 + 1] & 0x78240000) == 0) {
				Static136.anIntArray274[local61] = local7 + 1;
				Static269.anIntArray524[local61] = local9;
				local61 = local61 + 1 & 0xFFF;
				Static221.anIntArrayArray38[local81 + 1][local91] = 8;
				Static389.anIntArrayArray60[local81 + 1][local91] = local261;
			}
			if (local91 > 0 && Static221.anIntArrayArray38[local81][local91 - 1] == 0 && (local66[local97][local103 - 1] & 0x43A40000) == 0 && (local66[local97 + 1][local103 - 1] & 0x60E40000) == 0) {
				Static136.anIntArray274[local61] = local7;
				Static269.anIntArray524[local61] = local9 - 1;
				Static221.anIntArrayArray38[local81][local91 - 1] = 1;
				local61 = local61 + 1 & 0xFFF;
				Static389.anIntArrayArray60[local81][local91 - 1] = local261;
			}
			if (local91 < 126 && Static221.anIntArrayArray38[local81][local91 + 1] == 0 && (local66[local97][local103 + 2] & 0x4E240000) == 0 && (local66[local97 + 1][local103 + 2] & 0x78240000) == 0) {
				Static136.anIntArray274[local61] = local7;
				Static269.anIntArray524[local61] = local9 + 1;
				Static221.anIntArrayArray38[local81][local91 + 1] = 4;
				local61 = local61 + 1 & 0xFFF;
				Static389.anIntArrayArray60[local81][local91 + 1] = local261;
			}
			if (local81 > 0 && local91 > 0 && Static221.anIntArrayArray38[local81 - 1][local91 - 1] == 0 && (local66[local97 - 1][local103] & 0x4FA40000) == 0 && (local66[local97 - 1][local103 - 1] & 0x43A40000) == 0 && (local66[local97][local103 - 1] & 0x63E40000) == 0) {
				Static136.anIntArray274[local61] = local7 - 1;
				Static269.anIntArray524[local61] = local9 - 1;
				Static221.anIntArrayArray38[local81 - 1][local91 - 1] = 3;
				local61 = local61 + 1 & 0xFFF;
				Static389.anIntArrayArray60[local81 - 1][local91 - 1] = local261;
			}
			if (local81 < 126 && local91 > 0 && Static221.anIntArrayArray38[local81 + 1][local91 - 1] == 0 && (local66[local97 + 1][local103 - 1] & 0x63E40000) == 0 && (local66[local97 + 2][local103 - 1] & 0x60E40000) == 0 && (local66[local97 + 2][local103] & 0x78E40000) == 0) {
				Static136.anIntArray274[local61] = local7 + 1;
				Static269.anIntArray524[local61] = local9 - 1;
				local61 = local61 + 1 & 0xFFF;
				Static221.anIntArrayArray38[local81 + 1][local91 - 1] = 9;
				Static389.anIntArrayArray60[local81 + 1][local91 - 1] = local261;
			}
			if (local81 > 0 && local91 < 126 && Static221.anIntArrayArray38[local81 - 1][local91 + 1] == 0 && (local66[local97 - 1][local103 + 1] & 0x4FA40000) == 0 && (local66[local97 - 1][local103 + 2] & 0x4E240000) == 0 && (local66[local97][local103 + 2] & 0x7E240000) == 0) {
				Static136.anIntArray274[local61] = local7 - 1;
				Static269.anIntArray524[local61] = local9 + 1;
				local61 = local61 + 1 & 0xFFF;
				Static221.anIntArrayArray38[local81 - 1][local91 + 1] = 6;
				Static389.anIntArrayArray60[local81 - 1][local91 + 1] = local261;
			}
			if (local81 < 126 && local91 < 126 && Static221.anIntArrayArray38[local81 + 1][local91 + 1] == 0 && (local66[local97 + 1][local103 + 2] & 0x7E240000) == 0 && (local66[local97 + 2][local103 + 2] & 0x78240000) == 0 && (local66[local97 + 2][local103 + 1] & 0x78E40000) == 0) {
				Static136.anIntArray274[local61] = local7 + 1;
				Static269.anIntArray524[local61] = local9 + 1;
				Static221.anIntArrayArray38[local81 + 1][local91 + 1] = 12;
				local61 = local61 + 1 & 0xFFF;
				Static389.anIntArrayArray60[local81 + 1][local91 + 1] = local261;
			}
		}
		Static274.anInt4765 = local7;
		Static319.anInt5443 = local9;
		return false;
	}
}
