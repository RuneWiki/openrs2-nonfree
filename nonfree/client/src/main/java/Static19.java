import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_4 = new Class142("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!au", name = "e", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_1 = new Class242(50, -1);

	@OriginalMember(owner = "client!au", name = "f", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_2 = new Class242(34, 8);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)I")
	public static int method304(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIBIIILclient!mk;III)Z")
	public static boolean method305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class158 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg9;
		@Pc(18) int local18 = arg4 - 64;
		@Pc(23) int local23 = arg9 - 64;
		Static410.anIntArrayArray48[64][64] = 99;
		Static381.anIntArrayArray47[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static99.anIntArray134[0] = arg4;
		@Pc(51) int local51 = local42 + 1;
		Static89.anIntArray129[0] = arg9;
		@Pc(56) int[][] local56 = arg6.anIntArrayArray39;
		while (local51 != local44) {
			local7 = Static99.anIntArray134[local44];
			local9 = Static89.anIntArray129[local44];
			local44 = local44 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - arg6.anInt4542;
			@Pc(81) int local81 = local7 - local18;
			@Pc(86) int local86 = local9 - local23;
			@Pc(92) int local92 = local9 - arg6.anInt4550;
			if (arg7 == -4) {
				if (arg3 == local7 && arg5 == local9) {
					Static44.anInt641 = local9;
					Static103.anInt6432 = local7;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static132.method5178(arg8, 1, arg5, local7, arg3, arg2, 1, local9)) {
					Static103.anInt6432 = local7;
					Static44.anInt641 = local9;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg6.method3625(local7, 1, arg3, arg5, arg2, local9, 1, arg8, arg1)) {
					Static103.anInt6432 = local7;
					Static44.anInt641 = local9;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg6.method3618(arg2, 1, arg3, arg5, local9, arg1, local7, arg8)) {
					Static44.anInt641 = local9;
					Static103.anInt6432 = local7;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg6.method3613(local9, 1, arg7, arg0, arg5, arg3, local7)) {
					Static44.anInt641 = local9;
					Static103.anInt6432 = local7;
					return true;
				}
			} else if (arg6.method3615(arg0, arg5, arg3, arg7, 1, local7, local9)) {
				Static44.anInt641 = local9;
				Static103.anInt6432 = local7;
				return true;
			}
			@Pc(243) int local243 = Static381.anIntArrayArray47[local81][local86] + 1;
			if (local81 > 0 && Static410.anIntArrayArray48[local81 - 1][local86] == 0 && (local56[local77 - 1][local92] & 0x42240000) == 0) {
				Static99.anIntArray134[local51] = local7 - 1;
				Static89.anIntArray129[local51] = local9;
				Static410.anIntArrayArray48[local81 - 1][local86] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray47[local81 - 1][local86] = local243;
			}
			if (local81 < 127 && Static410.anIntArrayArray48[local81 + 1][local86] == 0 && (local56[local77 + 1][local92] & 0x60240000) == 0) {
				Static99.anIntArray134[local51] = local7 + 1;
				Static89.anIntArray129[local51] = local9;
				Static410.anIntArrayArray48[local81 + 1][local86] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray47[local81 + 1][local86] = local243;
			}
			if (local86 > 0 && Static410.anIntArrayArray48[local81][local86 - 1] == 0 && (local56[local77][local92 - 1] & 0x40A40000) == 0) {
				Static99.anIntArray134[local51] = local7;
				Static89.anIntArray129[local51] = local9 - 1;
				Static410.anIntArrayArray48[local81][local86 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray47[local81][local86 - 1] = local243;
			}
			if (local86 < 127 && Static410.anIntArrayArray48[local81][local86 + 1] == 0 && (local56[local77][local92 + 1] & 0x48240000) == 0) {
				Static99.anIntArray134[local51] = local7;
				Static89.anIntArray129[local51] = local9 + 1;
				Static410.anIntArrayArray48[local81][local86 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray47[local81][local86 + 1] = local243;
			}
			if (local81 > 0 && local86 > 0 && Static410.anIntArrayArray48[local81 - 1][local86 - 1] == 0 && (local56[local77 - 1][local92 - 1] & 0x43A40000) == 0 && (local56[local77 - 1][local92] & 0x42240000) == 0 && (local56[local77][local92 - 1] & 0x40A40000) == 0) {
				Static99.anIntArray134[local51] = local7 - 1;
				Static89.anIntArray129[local51] = local9 - 1;
				Static410.anIntArrayArray48[local81 - 1][local86 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray47[local81 - 1][local86 - 1] = local243;
			}
			if (local81 < 127 && local86 > 0 && Static410.anIntArrayArray48[local81 + 1][local86 - 1] == 0 && (local56[local77 + 1][local92 - 1] & 0x60E40000) == 0 && (local56[local77 + 1][local92] & 0x60240000) == 0 && (local56[local77][local92 - 1] & 0x40A40000) == 0) {
				Static99.anIntArray134[local51] = local7 + 1;
				Static89.anIntArray129[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static410.anIntArrayArray48[local81 + 1][local86 - 1] = 9;
				Static381.anIntArrayArray47[local81 + 1][local86 - 1] = local243;
			}
			if (local81 > 0 && local86 < 127 && Static410.anIntArrayArray48[local81 - 1][local86 + 1] == 0 && (local56[local77 - 1][local92 + 1] & 0x4E240000) == 0 && (local56[local77 - 1][local92] & 0x42240000) == 0 && (local56[local77][local92 + 1] & 0x48240000) == 0) {
				Static99.anIntArray134[local51] = local7 - 1;
				Static89.anIntArray129[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static410.anIntArrayArray48[local81 - 1][local86 + 1] = 6;
				Static381.anIntArrayArray47[local81 - 1][local86 + 1] = local243;
			}
			if (local81 < 127 && local86 < 127 && Static410.anIntArrayArray48[local81 + 1][local86 + 1] == 0 && (local56[local77 + 1][local92 + 1] & 0x78240000) == 0 && (local56[local77 + 1][local92] & 0x60240000) == 0 && (local56[local77][local92 + 1] & 0x48240000) == 0) {
				Static99.anIntArray134[local51] = local7 + 1;
				Static89.anIntArray129[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static410.anIntArrayArray48[local81 + 1][local86 + 1] = 12;
				Static381.anIntArrayArray47[local81 + 1][local86 + 1] = local243;
			}
		}
		Static44.anInt641 = local9;
		Static103.anInt6432 = local7;
		return false;
	}
}
