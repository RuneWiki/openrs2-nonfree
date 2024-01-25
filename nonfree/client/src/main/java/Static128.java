import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
	public static int anInt7338;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_131 = new Class15("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "[I")
	public static final int[] anIntArray555 = new int[100];

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_24 = new CRC32();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([[BBLclient!ft;)V")
	public static void method5872(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class26_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt2142; local3++) {
			Static150.method2112();
			for (@Pc(9) int local9 = 0; local9 < Static337.anInt5497 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static282.anInt4644 >> 3; local13++) {
					@Pc(23) int local23 = Static184.anIntArrayArrayArray3[local3][local9][local13];
					if (local23 != -1) {
						@Pc(32) int local32 = local23 >> 24 & 0x3;
						if (!arg1.aBoolean148 || local32 == 0) {
							@Pc(46) int local46 = local23 >> 1 & 0x3;
							@Pc(52) int local52 = local23 >> 14 & 0x3FF;
							@Pc(58) int local58 = local23 >> 3 & 0x7FF;
							@Pc(68) int local68 = local58 / 8 + (local52 / 8 << 8);
							for (@Pc(70) int local70 = 0; local70 < Static91.anIntArray131.length; local70++) {
								if (Static91.anIntArray131[local70] == local68 && arg0[local70] != null) {
									arg1.method1715((local58 & 0x7) * 8, (local52 & 0x7) * 8, Static409.aClass128Array1, Static39.aClass135_1, local46, local32, arg0[local70], local9 * 8, local13 * 8, local3);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5874(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static284.anInt4659; local19++) {
			if (arg0.equalsIgnoreCase(Static322.aStringArray36[local19])) {
				return local19;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!is;IIIIIIIII)Z")
	public static boolean method5876(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg3 - 64;
		Static47.anIntArrayArray10[64][64] = 99;
		@Pc(36) int local36 = arg5 - 64;
		Static51.anIntArrayArray12[64][64] = 0;
		@Pc(44) byte local44 = 0;
		Static13.anIntArray10[0] = arg3;
		@Pc(50) int local50 = 0;
		@Pc(53) int local53 = local44 + 1;
		Static149.anIntArray226[0] = arg5;
		@Pc(58) int[][] local58 = arg1.anIntArrayArray38;
		while (local50 != local53) {
			local7 = Static13.anIntArray10[local50];
			local9 = Static149.anIntArray226[local50];
			local50 = local50 + 1 & 0xFFF;
			@Pc(79) int local79 = local7 - local18;
			@Pc(84) int local84 = local9 - local36;
			@Pc(90) int local90 = local7 - arg1.anInt3180;
			@Pc(96) int local96 = local9 - arg1.anInt3167;
			if (arg6 == -4) {
				if (arg0 == local7 && local9 == arg2) {
					Static228.anInt3904 = local7;
					Static110.anInt2053 = local9;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static248.method3584(2, local9, local7, arg4, arg2, arg9, 2, arg0)) {
					Static110.anInt2053 = local9;
					Static228.anInt3904 = local7;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg1.method2456(arg9, local9, 2, arg4, arg0, arg2, arg7, 2, local7)) {
					Static228.anInt3904 = local7;
					Static110.anInt2053 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg1.method2459(local7, 2, arg7, arg4, arg9, local9, arg0, arg2)) {
					Static228.anInt3904 = local7;
					Static110.anInt2053 = local9;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg1.method2463(arg0, arg8, arg2, arg6, local9, 2, local7)) {
					Static228.anInt3904 = local7;
					Static110.anInt2053 = local9;
					return true;
				}
			} else if (arg1.method2449(2, local9, local7, arg0, arg8, arg6, arg2)) {
				Static110.anInt2053 = local9;
				Static228.anInt3904 = local7;
				return true;
			}
			@Pc(250) int local250 = Static51.anIntArrayArray12[local79][local84] + 1;
			if (local79 > 0 && Static47.anIntArrayArray10[local79 - 1][local84] == 0 && (local58[local90 - 1][local96] & 0x43A40000) == 0 && (local58[local90 - 1][local96 + 1] & 0x4E240000) == 0) {
				Static13.anIntArray10[local53] = local7 - 1;
				Static149.anIntArray226[local53] = local9;
				Static47.anIntArrayArray10[local79 - 1][local84] = 2;
				local53 = local53 + 1 & 0xFFF;
				Static51.anIntArrayArray12[local79 - 1][local84] = local250;
			}
			if (local79 < 126 && Static47.anIntArrayArray10[local79 + 1][local84] == 0 && (local58[local90 + 2][local96] & 0x60E40000) == 0 && (local58[local90 + 2][local96 + 1] & 0x78240000) == 0) {
				Static13.anIntArray10[local53] = local7 + 1;
				Static149.anIntArray226[local53] = local9;
				Static47.anIntArrayArray10[local79 + 1][local84] = 8;
				local53 = local53 + 1 & 0xFFF;
				Static51.anIntArrayArray12[local79 + 1][local84] = local250;
			}
			if (local84 > 0 && Static47.anIntArrayArray10[local79][local84 - 1] == 0 && (local58[local90][local96 - 1] & 0x43A40000) == 0 && (local58[local90 + 1][local96 - 1] & 0x60E40000) == 0) {
				Static13.anIntArray10[local53] = local7;
				Static149.anIntArray226[local53] = local9 - 1;
				Static47.anIntArrayArray10[local79][local84 - 1] = 1;
				local53 = local53 + 1 & 0xFFF;
				Static51.anIntArrayArray12[local79][local84 - 1] = local250;
			}
			if (local84 < 126 && Static47.anIntArrayArray10[local79][local84 + 1] == 0 && (local58[local90][local96 + 2] & 0x4E240000) == 0 && (local58[local90 + 1][local96 + 2] & 0x78240000) == 0) {
				Static13.anIntArray10[local53] = local7;
				Static149.anIntArray226[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static47.anIntArrayArray10[local79][local84 + 1] = 4;
				Static51.anIntArrayArray12[local79][local84 + 1] = local250;
			}
			if (local79 > 0 && local84 > 0 && Static47.anIntArrayArray10[local79 - 1][local84 - 1] == 0 && (local58[local90 - 1][local96] & 0x4FA40000) == 0 && (local58[local90 - 1][local96 - 1] & 0x43A40000) == 0 && (local58[local90][local96 - 1] & 0x63E40000) == 0) {
				Static13.anIntArray10[local53] = local7 - 1;
				Static149.anIntArray226[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static47.anIntArrayArray10[local79 - 1][local84 - 1] = 3;
				Static51.anIntArrayArray12[local79 - 1][local84 - 1] = local250;
			}
			if (local79 < 126 && local84 > 0 && Static47.anIntArrayArray10[local79 + 1][local84 - 1] == 0 && (local58[local90 + 1][local96 - 1] & 0x63E40000) == 0 && (local58[local90 + 2][local96 - 1] & 0x60E40000) == 0 && (local58[local90 + 2][local96] & 0x78E40000) == 0) {
				Static13.anIntArray10[local53] = local7 + 1;
				Static149.anIntArray226[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static47.anIntArrayArray10[local79 + 1][local84 - 1] = 9;
				Static51.anIntArrayArray12[local79 + 1][local84 - 1] = local250;
			}
			if (local79 > 0 && local84 < 126 && Static47.anIntArrayArray10[local79 - 1][local84 + 1] == 0 && (local58[local90 - 1][local96 + 1] & 0x4FA40000) == 0 && (local58[local90 - 1][local96 + 2] & 0x4E240000) == 0 && (local58[local90][local96 + 2] & 0x7E240000) == 0) {
				Static13.anIntArray10[local53] = local7 - 1;
				Static149.anIntArray226[local53] = local9 + 1;
				Static47.anIntArrayArray10[local79 - 1][local84 + 1] = 6;
				local53 = local53 + 1 & 0xFFF;
				Static51.anIntArrayArray12[local79 - 1][local84 + 1] = local250;
			}
			if (local79 < 126 && local84 < 126 && Static47.anIntArrayArray10[local79 + 1][local84 + 1] == 0 && (local58[local90 + 1][local96 + 2] & 0x7E240000) == 0 && (local58[local90 + 2][local96 + 2] & 0x78240000) == 0 && (local58[local90 + 2][local96 + 1] & 0x78E40000) == 0) {
				Static13.anIntArray10[local53] = local7 + 1;
				Static149.anIntArray226[local53] = local9 + 1;
				Static47.anIntArrayArray10[local79 + 1][local84 + 1] = 12;
				local53 = local53 + 1 & 0xFFF;
				Static51.anIntArrayArray12[local79 + 1][local84 + 1] = local250;
			}
		}
		Static228.anInt3904 = local7;
		Static110.anInt2053 = local9;
		return false;
	}
}
