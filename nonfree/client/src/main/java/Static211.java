import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "Lclient!la;")
	public static Class92 aClass92_4;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_115 = new Class102(24, -1);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!et;IIBIIIIIII)Z")
	public static boolean method2821(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		@Pc(23) int local23 = arg2 - 64;
		Static238.anIntArrayArray28[64][64] = 99;
		@Pc(34) int local34 = arg3 - 64;
		Static284.anIntArrayArray34[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static350.anIntArray518[0] = arg2;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static18.anIntArray300[0] = arg3;
		@Pc(56) int[][] local56 = arg0.anIntArrayArray11;
		while (local51 != local48) {
			local7 = Static350.anIntArray518[local48];
			local9 = Static18.anIntArray300[local48];
			@Pc(71) int local71 = local7 - local23;
			@Pc(76) int local76 = local9 - local34;
			local48 = local48 + 1 & 0xFFF;
			@Pc(88) int local88 = local7 - arg0.anInt1979;
			@Pc(94) int local94 = local9 - arg0.anInt1973;
			if (arg8 == -4) {
				if (arg5 == local7 && local9 == arg6) {
					Static343.anInt5848 = local7;
					Static245.anInt3937 = local9;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static414.method5236(2, arg6, arg4, local7, 2, arg5, arg7, local9)) {
					Static245.anInt3937 = local9;
					Static343.anInt5848 = local7;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg0.method1613(local9, arg6, 2, local7, arg9, arg7, arg5, 2, arg4)) {
					Static343.anInt5848 = local7;
					Static245.anInt3937 = local9;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg0.method1620(arg5, local7, arg6, local9, arg9, arg4, 2, arg7)) {
					Static343.anInt5848 = local7;
					Static245.anInt3937 = local9;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg0.method1615(arg6, local9, arg1, 2, local7, arg8, arg5)) {
					Static245.anInt3937 = local9;
					Static343.anInt5848 = local7;
					return true;
				}
			} else if (arg0.method1612(arg6, arg1, arg8, local7, 2, arg5, local9)) {
				Static343.anInt5848 = local7;
				Static245.anInt3937 = local9;
				return true;
			}
			@Pc(254) int local254 = Static284.anIntArrayArray34[local71][local76] + 1;
			if (local71 > 0 && Static238.anIntArrayArray28[local71 - 1][local76] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static350.anIntArray518[local51] = local7 - 1;
				Static18.anIntArray300[local51] = local9;
				Static238.anIntArrayArray28[local71 - 1][local76] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local71 - 1][local76] = local254;
			}
			if (local71 < 126 && Static238.anIntArrayArray28[local71 + 1][local76] == 0 && (local56[local88 + 2][local94] & 0x60E40000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78240000) == 0) {
				Static350.anIntArray518[local51] = local7 + 1;
				Static18.anIntArray300[local51] = local9;
				Static238.anIntArrayArray28[local71 + 1][local76] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local71 + 1][local76] = local254;
			}
			if (local76 > 0 && Static238.anIntArrayArray28[local71][local76 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static350.anIntArray518[local51] = local7;
				Static18.anIntArray300[local51] = local9 - 1;
				Static238.anIntArrayArray28[local71][local76 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local71][local76 - 1] = local254;
			}
			if (local76 < 126 && Static238.anIntArrayArray28[local71][local76 + 1] == 0 && (local56[local88][local94 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local94 + 2] & 0x78240000) == 0) {
				Static350.anIntArray518[local51] = local7;
				Static18.anIntArray300[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static238.anIntArrayArray28[local71][local76 + 1] = 4;
				Static284.anIntArrayArray34[local71][local76 + 1] = local254;
			}
			if (local71 > 0 && local76 > 0 && Static238.anIntArrayArray28[local71 - 1][local76 - 1] == 0 && (local56[local88 - 1][local94] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local56[local88][local94 - 1] & 0x63E40000) == 0) {
				Static350.anIntArray518[local51] = local7 - 1;
				Static18.anIntArray300[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static238.anIntArrayArray28[local71 - 1][local76 - 1] = 3;
				Static284.anIntArrayArray34[local71 - 1][local76 - 1] = local254;
			}
			if (local71 < 126 && local76 > 0 && Static238.anIntArrayArray28[local71 + 1][local76 - 1] == 0 && (local56[local88 + 1][local94 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local94 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local94] & 0x78E40000) == 0) {
				Static350.anIntArray518[local51] = local7 + 1;
				Static18.anIntArray300[local51] = local9 - 1;
				Static238.anIntArrayArray28[local71 + 1][local76 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local71 + 1][local76 - 1] = local254;
			}
			if (local71 > 0 && local76 < 126 && Static238.anIntArrayArray28[local71 - 1][local76 + 1] == 0 && (local56[local88 - 1][local94 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 + 2] & 0x4E240000) == 0 && (local56[local88][local94 + 2] & 0x7E240000) == 0) {
				Static350.anIntArray518[local51] = local7 - 1;
				Static18.anIntArray300[local51] = local9 + 1;
				Static238.anIntArrayArray28[local71 - 1][local76 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local71 - 1][local76 + 1] = local254;
			}
			if (local71 < 126 && local76 < 126 && Static238.anIntArrayArray28[local71 + 1][local76 + 1] == 0 && (local56[local88 + 1][local94 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local94 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static350.anIntArray518[local51] = local7 + 1;
				Static18.anIntArray300[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static238.anIntArrayArray28[local71 + 1][local76 + 1] = 12;
				Static284.anIntArrayArray34[local71 + 1][local76 + 1] = local254;
			}
		}
		Static245.anInt3937 = local9;
		Static343.anInt5848 = local7;
		return false;
	}
}
