import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_60 = new Class221(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public static int anInt1491 = 0;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!dk;")
	public static final Class48 aClass48_1 = new Class48("stellardawn", 1);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIIILclient!vk;I)Z")
	public static boolean method1393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class239 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg5;
		@Pc(22) int local22 = arg6 - 64;
		Static287.anIntArrayArray44[64][64] = 99;
		@Pc(33) int local33 = arg5 - 64;
		Static203.anIntArrayArray22[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static5.anIntArray808[0] = arg6;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static327.anIntArray702[0] = arg5;
		@Pc(55) int[][] local55 = arg8.anIntArrayArray54;
		while (local47 != local50) {
			local9 = Static327.anIntArray702[local47];
			local7 = Static5.anIntArray808[local47];
			local47 = local47 + 1 & 0xFFF;
			@Pc(76) int local76 = local7 - local22;
			@Pc(82) int local82 = local7 - arg8.anInt6436;
			@Pc(88) int local88 = local9 - arg8.anInt6445;
			@Pc(93) int local93 = local9 - local33;
			if (arg4 == -4) {
				if (arg7 == local7 && local9 == arg9) {
					Static168.anInt2996 = local9;
					Static58.anInt5539 = local7;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static159.method2669(1, 1, arg3, arg9, local7, arg7, local9, arg2)) {
					Static168.anInt2996 = local9;
					Static58.anInt5539 = local7;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg8.method5556(1, 1, arg2, arg9, arg3, arg0, arg7, local9, local7)) {
					Static58.anInt5539 = local7;
					Static168.anInt2996 = local9;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg8.method5550(arg7, arg2, local7, arg3, local9, arg0, arg9, 1)) {
					Static168.anInt2996 = local9;
					Static58.anInt5539 = local7;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg8.method5564(local9, arg1, 1, arg9, arg4, arg7, local7)) {
					Static58.anInt5539 = local7;
					Static168.anInt2996 = local9;
					return true;
				}
			} else if (arg8.method5548(arg9, arg7, local7, arg4, local9, arg1, 1)) {
				Static58.anInt5539 = local7;
				Static168.anInt2996 = local9;
				return true;
			}
			@Pc(250) int local250 = Static203.anIntArrayArray22[local76][local93] + 1;
			if (local76 > 0 && Static287.anIntArrayArray44[local76 - 1][local93] == 0 && (local55[local82 - 1][local88] & 0x42240000) == 0) {
				Static5.anIntArray808[local50] = local7 - 1;
				Static327.anIntArray702[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static287.anIntArrayArray44[local76 - 1][local93] = 2;
				Static203.anIntArrayArray22[local76 - 1][local93] = local250;
			}
			if (local76 < 127 && Static287.anIntArrayArray44[local76 + 1][local93] == 0 && (local55[local82 + 1][local88] & 0x60240000) == 0) {
				Static5.anIntArray808[local50] = local7 + 1;
				Static327.anIntArray702[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static287.anIntArrayArray44[local76 + 1][local93] = 8;
				Static203.anIntArrayArray22[local76 + 1][local93] = local250;
			}
			if (local93 > 0 && Static287.anIntArrayArray44[local76][local93 - 1] == 0 && (local55[local82][local88 - 1] & 0x40A40000) == 0) {
				Static5.anIntArray808[local50] = local7;
				Static327.anIntArray702[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static287.anIntArrayArray44[local76][local93 - 1] = 1;
				Static203.anIntArrayArray22[local76][local93 - 1] = local250;
			}
			if (local93 < 127 && Static287.anIntArrayArray44[local76][local93 + 1] == 0 && (local55[local82][local88 + 1] & 0x48240000) == 0) {
				Static5.anIntArray808[local50] = local7;
				Static327.anIntArray702[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static287.anIntArrayArray44[local76][local93 + 1] = 4;
				Static203.anIntArrayArray22[local76][local93 + 1] = local250;
			}
			if (local76 > 0 && local93 > 0 && Static287.anIntArrayArray44[local76 - 1][local93 - 1] == 0 && (local55[local82 - 1][local88 - 1] & 0x43A40000) == 0 && (local55[local82 - 1][local88] & 0x42240000) == 0 && (local55[local82][local88 - 1] & 0x40A40000) == 0) {
				Static5.anIntArray808[local50] = local7 - 1;
				Static327.anIntArray702[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static287.anIntArrayArray44[local76 - 1][local93 - 1] = 3;
				Static203.anIntArrayArray22[local76 - 1][local93 - 1] = local250;
			}
			if (local76 < 127 && local93 > 0 && Static287.anIntArrayArray44[local76 + 1][local93 - 1] == 0 && (local55[local82 + 1][local88 - 1] & 0x60E40000) == 0 && (local55[local82 + 1][local88] & 0x60240000) == 0 && (local55[local82][local88 - 1] & 0x40A40000) == 0) {
				Static5.anIntArray808[local50] = local7 + 1;
				Static327.anIntArray702[local50] = local9 - 1;
				Static287.anIntArrayArray44[local76 + 1][local93 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static203.anIntArrayArray22[local76 + 1][local93 - 1] = local250;
			}
			if (local76 > 0 && local93 < 127 && Static287.anIntArrayArray44[local76 - 1][local93 + 1] == 0 && (local55[local82 - 1][local88 + 1] & 0x4E240000) == 0 && (local55[local82 - 1][local88] & 0x42240000) == 0 && (local55[local82][local88 + 1] & 0x48240000) == 0) {
				Static5.anIntArray808[local50] = local7 - 1;
				Static327.anIntArray702[local50] = local9 + 1;
				Static287.anIntArrayArray44[local76 - 1][local93 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static203.anIntArrayArray22[local76 - 1][local93 + 1] = local250;
			}
			if (local76 < 127 && local93 < 127 && Static287.anIntArrayArray44[local76 + 1][local93 + 1] == 0 && (local55[local82 + 1][local88 + 1] & 0x78240000) == 0 && (local55[local82 + 1][local88] & 0x60240000) == 0 && (local55[local82][local88 + 1] & 0x48240000) == 0) {
				Static5.anIntArray808[local50] = local7 + 1;
				Static327.anIntArray702[local50] = local9 + 1;
				Static287.anIntArrayArray44[local76 + 1][local93 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static203.anIntArrayArray22[local76 + 1][local93 + 1] = local250;
			}
		}
		Static58.anInt5539 = local7;
		Static168.anInt2996 = local9;
		return false;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class2_Sub22 local7 = null;
		for (@Pc(12) Class2_Sub22 local12 = (Class2_Sub22) Static230.aClass210_30.method5035(); local12 != null; local12 = (Class2_Sub22) Static230.aClass210_30.method5037()) {
			if (arg1 == local12.anInt3088 && arg2 == local12.anInt3082 && local12.anInt3087 == arg6 && local12.anInt3089 == arg3) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub22();
			local7.anInt3088 = arg1;
			local7.anInt3089 = arg3;
			local7.anInt3087 = arg6;
			local7.anInt3082 = arg2;
			Static228.method3796(local7);
			Static230.aClass210_30.method5044(local7);
		}
		local7.anInt3085 = arg4;
		local7.anInt3077 = 0;
		local7.anInt3093 = arg0;
		local7.anInt3083 = -1;
		local7.anInt3078 = arg5;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	public static void method1395() {
		if (!Static165.aBoolean219) {
			return;
		}
		while (true) {
			while (Static28.anInt628 < Static197.aClass141_Sub1Array2.length) {
				@Pc(21) Class141_Sub1 local21 = Static197.aClass141_Sub1Array2[Static28.anInt628];
				if (local21 != null && local21.anInt6673 == -1) {
					if (Static55.aClass2_Sub18_1 == null) {
						Static55.aClass2_Sub18_1 = Static237.aClass193_1.method4677(local21.aString63);
					}
					@Pc(45) int local45 = Static55.aClass2_Sub18_1.anInt2669;
					if (local45 == -1) {
						return;
					}
					local21.anInt6673 = local45;
					Static28.anInt628++;
					Static55.aClass2_Sub18_1 = null;
				} else {
					Static28.anInt628++;
				}
			}
			return;
		}
	}
}
