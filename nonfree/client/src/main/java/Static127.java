import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	public static int anInt2287;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Lclient!ew;")
	public static final Class72 aClass72_14 = new Class72(512);

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public static int anInt2292 = 0;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	public static void method1894() {
		Static233.method5398(Static2.aClass148_Sub1_1.aBoolean249);
		Static37.aClass2_Sub1_Sub2_6 = new Class2_Sub1_Sub2();
		Static37.aClass2_Sub1_Sub2_6.method585();
		Static356.aClass38_1 = Static209.method2803(Static286.aCanvas4, 22050, Static79.aClass183_2, 0);
		Static356.aClass38_1.method1487(Static37.aClass2_Sub1_Sub2_6);
		Static208.method2802(Static335.aClass54_92, Static217.aClass54_64, Static427.aClass54_115, Static37.aClass2_Sub1_Sub2_6);
		Static385.aClass38_2 = Static209.method2803(Static286.aCanvas4, 2048, Static79.aClass183_2, 1);
		Static421.aClass2_Sub1_Sub4_2 = new Class2_Sub1_Sub4();
		Static385.aClass38_2.method1487(Static421.aClass2_Sub1_Sub4_2);
		Static162.aClass243_1 = new Class243(22050, Static333.anInt5628);
		Static37.anInt6465 = Static120.aClass54_36.method1102("scape main");
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
	public static void method1895() {
		@Pc(9) int local9 = (int) ((double) Static166.anInt2852 * 34.46D);
		local9 <<= 0x0;
		if (Static82.aClass163_1.method5508()) {
			local9 += 128;
		}
		Static82.aClass163_1.d(50, local9);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!et;IIIIIIIII)Z")
	public static boolean method1897(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg8 - 64;
		Static238.anIntArrayArray28[64][64] = 99;
		@Pc(28) int local28 = arg5 - 64;
		Static284.anIntArrayArray34[64][64] = 0;
		@Pc(36) byte local36 = 0;
		@Pc(38) int local38 = 0;
		Static350.anIntArray518[0] = arg8;
		@Pc(45) int local45 = local36 + 1;
		Static18.anIntArray300[0] = arg5;
		@Pc(55) int[][] local55 = arg1.anIntArrayArray11;
		while (local45 != local38) {
			local7 = Static350.anIntArray518[local38];
			local9 = Static18.anIntArray300[local38];
			@Pc(70) int local70 = local9 - local28;
			@Pc(75) int local75 = local7 - local18;
			@Pc(81) int local81 = local7 - arg1.anInt1979;
			local38 = local38 + 1 & 0xFFF;
			@Pc(93) int local93 = local9 - arg1.anInt1973;
			if (arg2 == -4) {
				if (arg6 == local7 && local9 == arg7) {
					Static343.anInt5848 = local7;
					Static245.anInt3937 = local9;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static414.method5236(1, arg7, arg4, local7, 1, arg6, arg9, local9)) {
					Static245.anInt3937 = local9;
					Static343.anInt5848 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg1.method1613(local9, arg7, 1, local7, arg0, arg9, arg6, 1, arg4)) {
					Static343.anInt5848 = local7;
					Static245.anInt3937 = local9;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg1.method1620(arg6, local7, arg7, local9, arg0, arg4, 1, arg9)) {
					Static245.anInt3937 = local9;
					Static343.anInt5848 = local7;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg1.method1615(arg7, local9, arg3, 1, local7, arg2, arg6)) {
					Static343.anInt5848 = local7;
					Static245.anInt3937 = local9;
					return true;
				}
			} else if (arg1.method1612(arg7, arg3, arg2, local7, 1, arg6, local9)) {
				Static343.anInt5848 = local7;
				Static245.anInt3937 = local9;
				return true;
			}
			@Pc(246) int local246 = Static284.anIntArrayArray34[local75][local70] + 1;
			if (local75 > 0 && Static238.anIntArrayArray28[local75 - 1][local70] == 0 && (local55[local81 - 1][local93] & 0x42240000) == 0) {
				Static350.anIntArray518[local45] = local7 - 1;
				Static18.anIntArray300[local45] = local9;
				Static238.anIntArrayArray28[local75 - 1][local70] = 2;
				local45 = local45 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local75 - 1][local70] = local246;
			}
			if (local75 < 127 && Static238.anIntArrayArray28[local75 + 1][local70] == 0 && (local55[local81 + 1][local93] & 0x60240000) == 0) {
				Static350.anIntArray518[local45] = local7 + 1;
				Static18.anIntArray300[local45] = local9;
				Static238.anIntArrayArray28[local75 + 1][local70] = 8;
				local45 = local45 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local75 + 1][local70] = local246;
			}
			if (local70 > 0 && Static238.anIntArrayArray28[local75][local70 - 1] == 0 && (local55[local81][local93 - 1] & 0x40A40000) == 0) {
				Static350.anIntArray518[local45] = local7;
				Static18.anIntArray300[local45] = local9 - 1;
				Static238.anIntArrayArray28[local75][local70 - 1] = 1;
				local45 = local45 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local75][local70 - 1] = local246;
			}
			if (local70 < 127 && Static238.anIntArrayArray28[local75][local70 + 1] == 0 && (local55[local81][local93 + 1] & 0x48240000) == 0) {
				Static350.anIntArray518[local45] = local7;
				Static18.anIntArray300[local45] = local9 + 1;
				Static238.anIntArrayArray28[local75][local70 + 1] = 4;
				local45 = local45 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local75][local70 + 1] = local246;
			}
			if (local75 > 0 && local70 > 0 && Static238.anIntArrayArray28[local75 - 1][local70 - 1] == 0 && (local55[local81 - 1][local93 - 1] & 0x43A40000) == 0 && (local55[local81 - 1][local93] & 0x42240000) == 0 && (local55[local81][local93 - 1] & 0x40A40000) == 0) {
				Static350.anIntArray518[local45] = local7 - 1;
				Static18.anIntArray300[local45] = local9 - 1;
				Static238.anIntArrayArray28[local75 - 1][local70 - 1] = 3;
				local45 = local45 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local75 - 1][local70 - 1] = local246;
			}
			if (local75 < 127 && local70 > 0 && Static238.anIntArrayArray28[local75 + 1][local70 - 1] == 0 && (local55[local81 + 1][local93 - 1] & 0x60E40000) == 0 && (local55[local81 + 1][local93] & 0x60240000) == 0 && (local55[local81][local93 - 1] & 0x40A40000) == 0) {
				Static350.anIntArray518[local45] = local7 + 1;
				Static18.anIntArray300[local45] = local9 - 1;
				Static238.anIntArrayArray28[local75 + 1][local70 - 1] = 9;
				local45 = local45 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local75 + 1][local70 - 1] = local246;
			}
			if (local75 > 0 && local70 < 127 && Static238.anIntArrayArray28[local75 - 1][local70 + 1] == 0 && (local55[local81 - 1][local93 + 1] & 0x4E240000) == 0 && (local55[local81 - 1][local93] & 0x42240000) == 0 && (local55[local81][local93 + 1] & 0x48240000) == 0) {
				Static350.anIntArray518[local45] = local7 - 1;
				Static18.anIntArray300[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static238.anIntArrayArray28[local75 - 1][local70 + 1] = 6;
				Static284.anIntArrayArray34[local75 - 1][local70 + 1] = local246;
			}
			if (local75 < 127 && local70 < 127 && Static238.anIntArrayArray28[local75 + 1][local70 + 1] == 0 && (local55[local81 + 1][local93 + 1] & 0x78240000) == 0 && (local55[local81 + 1][local93] & 0x60240000) == 0 && (local55[local81][local93 + 1] & 0x48240000) == 0) {
				Static350.anIntArray518[local45] = local7 + 1;
				Static18.anIntArray300[local45] = local9 + 1;
				Static238.anIntArrayArray28[local75 + 1][local70 + 1] = 12;
				local45 = local45 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local75 + 1][local70 + 1] = local246;
			}
		}
		Static245.anInt3937 = local9;
		Static343.anInt5848 = local7;
		return false;
	}
}
