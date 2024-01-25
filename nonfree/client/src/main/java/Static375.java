import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
	public static int anInt6323;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
	public static int anInt6324;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
	public static int anInt6326;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Lclient!raa;")
	public static Class6_Sub4_Sub16 method5342(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub4_Sub16 local10 = (Class6_Sub4_Sub16) Static459.aClass189_5.method4279((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static146.aClass8_75.method262(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static340.method4995(local20);
		} catch (@Pc(41) Exception local41) {
			throw new RuntimeException(local41.getMessage() + " S: " + arg0);
		}
		Static459.aClass189_5.method4278(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIILclient!sn;IIIIIIZ)Z")
	public static boolean method5343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class324 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg8 - 64;
		@Pc(23) int local23 = arg2 - 64;
		Static394.anIntArrayArray35[64][64] = 99;
		Static358.anIntArrayArray33[64][64] = 0;
		@Pc(43) byte local43 = 0;
		Static233.anIntArray251[0] = arg8;
		@Pc(49) int local49 = 0;
		@Pc(52) int local52 = local43 + 1;
		Static436.anIntArray495[0] = arg2;
		@Pc(57) int[][] local57 = arg3.anIntArrayArray51;
		while (local49 != local52) {
			local7 = Static233.anIntArray251[local49];
			local9 = Static436.anIntArray495[local49];
			@Pc(71) int local71 = local7 - local18;
			@Pc(77) int local77 = local7 - arg3.anInt9209;
			local49 = local49 + 1 & 0xFFF;
			@Pc(89) int local89 = local9 - arg3.anInt9227;
			@Pc(93) int local93 = local9 - local23;
			if (arg9 == -4) {
				if (arg6 == local7 && arg7 == local9) {
					Static51.anInt1061 = local9;
					Static520.anInt9403 = local7;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static219.method3187(1, local9, arg7, arg4, 1, arg6, arg0, local7)) {
					Static51.anInt1061 = local9;
					Static520.anInt9403 = local7;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg3.method7779(arg7, arg0, 1, local7, arg5, 1, arg6, arg4, local9)) {
					Static520.anInt9403 = local7;
					Static51.anInt1061 = local9;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg3.method7783(local9, local7, arg4, 1, arg7, arg0, arg5, arg6)) {
					Static51.anInt1061 = local9;
					Static520.anInt9403 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg3.method7776(arg7, local9, arg1, 1, arg9, local7, arg6)) {
					Static51.anInt1061 = local9;
					Static520.anInt9403 = local7;
					return true;
				}
			} else if (arg3.method7773(1, local7, arg9, arg6, local9, arg1, arg7)) {
				Static520.anInt9403 = local7;
				Static51.anInt1061 = local9;
				return true;
			}
			@Pc(243) int local243 = Static358.anIntArrayArray33[local71][local93] + 1;
			if (local71 > 0 && Static394.anIntArrayArray35[local71 - 1][local93] == 0 && (local57[local77 - 1][local89] & 0x42240000) == 0) {
				Static233.anIntArray251[local52] = local7 - 1;
				Static436.anIntArray495[local52] = local9;
				Static394.anIntArrayArray35[local71 - 1][local93] = 2;
				local52 = local52 + 1 & 0xFFF;
				Static358.anIntArrayArray33[local71 - 1][local93] = local243;
			}
			if (local71 < 127 && Static394.anIntArrayArray35[local71 + 1][local93] == 0 && (local57[local77 + 1][local89] & 0x60240000) == 0) {
				Static233.anIntArray251[local52] = local7 + 1;
				Static436.anIntArray495[local52] = local9;
				local52 = local52 + 1 & 0xFFF;
				Static394.anIntArrayArray35[local71 + 1][local93] = 8;
				Static358.anIntArrayArray33[local71 + 1][local93] = local243;
			}
			if (local93 > 0 && Static394.anIntArrayArray35[local71][local93 - 1] == 0 && (local57[local77][local89 - 1] & 0x40A40000) == 0) {
				Static233.anIntArray251[local52] = local7;
				Static436.anIntArray495[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static394.anIntArrayArray35[local71][local93 - 1] = 1;
				Static358.anIntArrayArray33[local71][local93 - 1] = local243;
			}
			if (local93 < 127 && Static394.anIntArrayArray35[local71][local93 + 1] == 0 && (local57[local77][local89 + 1] & 0x48240000) == 0) {
				Static233.anIntArray251[local52] = local7;
				Static436.anIntArray495[local52] = local9 + 1;
				Static394.anIntArrayArray35[local71][local93 + 1] = 4;
				local52 = local52 + 1 & 0xFFF;
				Static358.anIntArrayArray33[local71][local93 + 1] = local243;
			}
			if (local71 > 0 && local93 > 0 && Static394.anIntArrayArray35[local71 - 1][local93 - 1] == 0 && (local57[local77 - 1][local89 - 1] & 0x43A40000) == 0 && (local57[local77 - 1][local89] & 0x42240000) == 0 && (local57[local77][local89 - 1] & 0x40A40000) == 0) {
				Static233.anIntArray251[local52] = local7 - 1;
				Static436.anIntArray495[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static394.anIntArrayArray35[local71 - 1][local93 - 1] = 3;
				Static358.anIntArrayArray33[local71 - 1][local93 - 1] = local243;
			}
			if (local71 < 127 && local93 > 0 && Static394.anIntArrayArray35[local71 + 1][local93 - 1] == 0 && (local57[local77 + 1][local89 - 1] & 0x60E40000) == 0 && (local57[local77 + 1][local89] & 0x60240000) == 0 && (local57[local77][local89 - 1] & 0x40A40000) == 0) {
				Static233.anIntArray251[local52] = local7 + 1;
				Static436.anIntArray495[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static394.anIntArrayArray35[local71 + 1][local93 - 1] = 9;
				Static358.anIntArrayArray33[local71 + 1][local93 - 1] = local243;
			}
			if (local71 > 0 && local93 < 127 && Static394.anIntArrayArray35[local71 - 1][local93 + 1] == 0 && (local57[local77 - 1][local89 + 1] & 0x4E240000) == 0 && (local57[local77 - 1][local89] & 0x42240000) == 0 && (local57[local77][local89 + 1] & 0x48240000) == 0) {
				Static233.anIntArray251[local52] = local7 - 1;
				Static436.anIntArray495[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static394.anIntArrayArray35[local71 - 1][local93 + 1] = 6;
				Static358.anIntArrayArray33[local71 - 1][local93 + 1] = local243;
			}
			if (local71 < 127 && local93 < 127 && Static394.anIntArrayArray35[local71 + 1][local93 + 1] == 0 && (local57[local77 + 1][local89 + 1] & 0x78240000) == 0 && (local57[local77 + 1][local89] & 0x60240000) == 0 && (local57[local77][local89 + 1] & 0x48240000) == 0) {
				Static233.anIntArray251[local52] = local7 + 1;
				Static436.anIntArray495[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static394.anIntArrayArray35[local71 + 1][local93 + 1] = 12;
				Static358.anIntArrayArray33[local71 + 1][local93 + 1] = local243;
			}
		}
		Static51.anInt1061 = local9;
		Static520.anInt9403 = local7;
		return false;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public static void method5344() throws Exception_Sub1 {
		if (Static353.anInt6019 == 1) {
			Static367.aClass132_7.method7464(Static596.anInt9747, Static475.anInt8169);
		} else {
			Static367.aClass132_7.method7464(0, 0);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Lclient!iaa;")
	public static Class6_Sub26 method5345() {
		return Static469.anInt8087 == 0 ? new Class6_Sub26() : Static90.aClass6_Sub26Array1[--Static469.anInt8087];
	}
}
