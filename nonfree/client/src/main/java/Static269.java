import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "Lclient!ir;")
	public static Class110 aClass110_5;

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "B")
	public static byte aByte48;

	@OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
	public static int anInt4657;

	@OriginalMember(owner = "client!pn", name = "M", descriptor = "Lclient!ue;")
	public static Class85 aClass85_2;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!pn", name = "C", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_71 = new Class32("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_73 = new Class11(4, 7);

	@OriginalMember(owner = "client!pn", name = "H", descriptor = "Z")
	public static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!pn", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIIIIILclient!pf;I)Z")
	public static boolean method4137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class188 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg0 - 64;
		Static381.anIntArrayArray59[64][64] = 99;
		@Pc(29) int local29 = arg3 - 64;
		Static135.anIntArrayArray28[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static189.anIntArray1355[0] = arg0;
		@Pc(46) int local46 = local37 + 1;
		Static275.anIntArray914[0] = arg3;
		@Pc(51) int[][] local51 = arg8.anIntArrayArray34;
		while (local46 != local39) {
			local7 = Static189.anIntArray1355[local39];
			local9 = Static275.anIntArray914[local39];
			@Pc(66) int local66 = local7 - local18;
			@Pc(71) int local71 = local7 - arg8.anInt4570;
			@Pc(77) int local77 = local9 - arg8.anInt4574;
			@Pc(82) int local82 = local9 - local29;
			local39 = local39 + 1 & 0xFFF;
			if (arg6 == -4) {
				if (arg4 == local7 && local9 == arg2) {
					Static60.anInt1160 = local7;
					Static197.anInt3647 = local9;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static323.method4787(1, 1, arg7, arg4, arg9, local9, arg2, local7)) {
					Static60.anInt1160 = local7;
					Static197.anInt3647 = local9;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg8.method4039(arg9, arg2, 1, 1, arg4, arg1, arg7, local7, local9)) {
					Static60.anInt1160 = local7;
					Static197.anInt3647 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg8.method4052(arg1, arg4, arg2, arg7, local7, local9, 1, arg9)) {
					Static197.anInt3647 = local9;
					Static60.anInt1160 = local7;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg8.method4046(arg4, 1, local9, arg6, local7, arg5, arg2)) {
					Static197.anInt3647 = local9;
					Static60.anInt1160 = local7;
					return true;
				}
			} else if (arg8.method4054(local7, 1, arg4, arg2, arg5, local9, arg6)) {
				Static60.anInt1160 = local7;
				Static197.anInt3647 = local9;
				return true;
			}
			@Pc(241) int local241 = Static135.anIntArrayArray28[local66][local82] + 1;
			if (local66 > 0 && Static381.anIntArrayArray59[local66 - 1][local82] == 0 && (local51[local71 - 1][local77] & 0x42240000) == 0) {
				Static189.anIntArray1355[local46] = local7 - 1;
				Static275.anIntArray914[local46] = local9;
				Static381.anIntArrayArray59[local66 - 1][local82] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static135.anIntArrayArray28[local66 - 1][local82] = local241;
			}
			if (local66 < 127 && Static381.anIntArrayArray59[local66 + 1][local82] == 0 && (local51[local71 + 1][local77] & 0x60240000) == 0) {
				Static189.anIntArray1355[local46] = local7 + 1;
				Static275.anIntArray914[local46] = local9;
				Static381.anIntArrayArray59[local66 + 1][local82] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static135.anIntArrayArray28[local66 + 1][local82] = local241;
			}
			if (local82 > 0 && Static381.anIntArrayArray59[local66][local82 - 1] == 0 && (local51[local71][local77 - 1] & 0x40A40000) == 0) {
				Static189.anIntArray1355[local46] = local7;
				Static275.anIntArray914[local46] = local9 - 1;
				Static381.anIntArrayArray59[local66][local82 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static135.anIntArrayArray28[local66][local82 - 1] = local241;
			}
			if (local82 < 127 && Static381.anIntArrayArray59[local66][local82 + 1] == 0 && (local51[local71][local77 + 1] & 0x48240000) == 0) {
				Static189.anIntArray1355[local46] = local7;
				Static275.anIntArray914[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static381.anIntArrayArray59[local66][local82 + 1] = 4;
				Static135.anIntArrayArray28[local66][local82 + 1] = local241;
			}
			if (local66 > 0 && local82 > 0 && Static381.anIntArrayArray59[local66 - 1][local82 - 1] == 0 && (local51[local71 - 1][local77 - 1] & 0x43A40000) == 0 && (local51[local71 - 1][local77] & 0x42240000) == 0 && (local51[local71][local77 - 1] & 0x40A40000) == 0) {
				Static189.anIntArray1355[local46] = local7 - 1;
				Static275.anIntArray914[local46] = local9 - 1;
				Static381.anIntArrayArray59[local66 - 1][local82 - 1] = 3;
				local46 = local46 + 1 & 0xFFF;
				Static135.anIntArrayArray28[local66 - 1][local82 - 1] = local241;
			}
			if (local66 < 127 && local82 > 0 && Static381.anIntArrayArray59[local66 + 1][local82 - 1] == 0 && (local51[local71 + 1][local77 - 1] & 0x60E40000) == 0 && (local51[local71 + 1][local77] & 0x60240000) == 0 && (local51[local71][local77 - 1] & 0x40A40000) == 0) {
				Static189.anIntArray1355[local46] = local7 + 1;
				Static275.anIntArray914[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static381.anIntArrayArray59[local66 + 1][local82 - 1] = 9;
				Static135.anIntArrayArray28[local66 + 1][local82 - 1] = local241;
			}
			if (local66 > 0 && local82 < 127 && Static381.anIntArrayArray59[local66 - 1][local82 + 1] == 0 && (local51[local71 - 1][local77 + 1] & 0x4E240000) == 0 && (local51[local71 - 1][local77] & 0x42240000) == 0 && (local51[local71][local77 + 1] & 0x48240000) == 0) {
				Static189.anIntArray1355[local46] = local7 - 1;
				Static275.anIntArray914[local46] = local9 + 1;
				Static381.anIntArrayArray59[local66 - 1][local82 + 1] = 6;
				local46 = local46 + 1 & 0xFFF;
				Static135.anIntArrayArray28[local66 - 1][local82 + 1] = local241;
			}
			if (local66 < 127 && local82 < 127 && Static381.anIntArrayArray59[local66 + 1][local82 + 1] == 0 && (local51[local71 + 1][local77 + 1] & 0x78240000) == 0 && (local51[local71 + 1][local77] & 0x60240000) == 0 && (local51[local71][local77 + 1] & 0x48240000) == 0) {
				Static189.anIntArray1355[local46] = local7 + 1;
				Static275.anIntArray914[local46] = local9 + 1;
				Static381.anIntArrayArray59[local66 + 1][local82 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static135.anIntArrayArray28[local66 + 1][local82 + 1] = local241;
			}
		}
		Static60.anInt1160 = local7;
		Static197.anInt3647 = local9;
		return false;
	}
}
