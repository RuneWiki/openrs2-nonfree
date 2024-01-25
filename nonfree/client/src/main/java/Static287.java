import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array20;

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_226 = new Class200(10, -2);

	@OriginalMember(owner = "client!kca", name = "x", descriptor = "Lclient!bp;")
	public static final Class43 aClass43_8 = new Class43();

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)V")
	public static void method8820() {
		if (Static36.aBoolean72) {
			return;
		}
		Static352.method5272(Static313.aClass84ArrayArrayArray6);
		if (Static230.aClass84ArrayArrayArray4 != null) {
			Static352.method5272(Static230.aClass84ArrayArrayArray4);
		}
		Static36.aBoolean72 = true;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIIILclient!je;BIIII)Z")
	public static boolean method8827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class175 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg2;
		@Pc(7) int local7 = arg4;
		@Pc(16) int local16 = arg2 - 64;
		Static220.anIntArrayArray44[64][64] = 99;
		@Pc(27) int local27 = arg4 - 64;
		Static314.anIntArrayArray58[64][64] = 0;
		@Pc(35) byte local35 = 0;
		@Pc(37) int local37 = 0;
		Static55.anIntArray87[0] = arg2;
		@Pc(44) int local44 = local35 + 1;
		Static335.anIntArray379[0] = arg4;
		@Pc(49) int[][] local49 = arg5.anIntArrayArray48;
		while (local37 != local44) {
			local5 = Static55.anIntArray87[local37];
			local7 = Static335.anIntArray379[local37];
			@Pc(63) int local63 = local5 - local16;
			@Pc(68) int local68 = local7 - local27;
			local37 = local37 + 1 & 0xFFF;
			@Pc(80) int local80 = local5 - arg5.anInt4875;
			@Pc(85) int local85 = local7 - arg5.anInt4866;
			if (arg1 == -4) {
				if (arg8 == local5 && arg9 == local7) {
					Static166.anInt3402 = local5;
					Static530.anInt8535 = local7;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static175.method3006(2, local7, arg8, 2, arg6, arg9, local5, arg0)) {
					Static530.anInt8535 = local7;
					Static166.anInt3402 = local5;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg5.method4289(arg8, arg9, arg0, local5, 2, arg7, 2, local7, arg6)) {
					Static166.anInt3402 = local5;
					Static530.anInt8535 = local7;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg5.method4292(2, arg7, local7, arg8, local5, arg6, arg0, arg9)) {
					Static166.anInt3402 = local5;
					Static530.anInt8535 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg5.method4291(arg9, arg1, 2, arg8, arg3, local5, local7)) {
					Static530.anInt8535 = local7;
					Static166.anInt3402 = local5;
					return true;
				}
			} else if (arg5.method4287(arg1, local7, local5, arg8, 2, arg9, arg3)) {
				Static530.anInt8535 = local7;
				Static166.anInt3402 = local5;
				return true;
			}
			@Pc(235) int local235 = Static314.anIntArrayArray58[local63][local68] + 1;
			if (local63 > 0 && Static220.anIntArrayArray44[local63 - 1][local68] == 0 && (local49[local80 - 1][local85] & 0x43A40000) == 0 && (local49[local80 - 1][local85 + 1] & 0x4E240000) == 0) {
				Static55.anIntArray87[local44] = local5 - 1;
				Static335.anIntArray379[local44] = local7;
				local44 = local44 + 1 & 0xFFF;
				Static220.anIntArrayArray44[local63 - 1][local68] = 2;
				Static314.anIntArrayArray58[local63 - 1][local68] = local235;
			}
			if (local63 < 126 && Static220.anIntArrayArray44[local63 + 1][local68] == 0 && (local49[local80 + 2][local85] & 0x60E40000) == 0 && (local49[local80 + 2][local85 + 1] & 0x78240000) == 0) {
				Static55.anIntArray87[local44] = local5 + 1;
				Static335.anIntArray379[local44] = local7;
				local44 = local44 + 1 & 0xFFF;
				Static220.anIntArrayArray44[local63 + 1][local68] = 8;
				Static314.anIntArrayArray58[local63 + 1][local68] = local235;
			}
			if (local68 > 0 && Static220.anIntArrayArray44[local63][local68 - 1] == 0 && (local49[local80][local85 - 1] & 0x43A40000) == 0 && (local49[local80 + 1][local85 - 1] & 0x60E40000) == 0) {
				Static55.anIntArray87[local44] = local5;
				Static335.anIntArray379[local44] = local7 - 1;
				Static220.anIntArrayArray44[local63][local68 - 1] = 1;
				local44 = local44 + 1 & 0xFFF;
				Static314.anIntArrayArray58[local63][local68 - 1] = local235;
			}
			if (local68 < 126 && Static220.anIntArrayArray44[local63][local68 + 1] == 0 && (local49[local80][local85 + 2] & 0x4E240000) == 0 && (local49[local80 + 1][local85 + 2] & 0x78240000) == 0) {
				Static55.anIntArray87[local44] = local5;
				Static335.anIntArray379[local44] = local7 + 1;
				local44 = local44 + 1 & 0xFFF;
				Static220.anIntArrayArray44[local63][local68 + 1] = 4;
				Static314.anIntArrayArray58[local63][local68 + 1] = local235;
			}
			if (local63 > 0 && local68 > 0 && Static220.anIntArrayArray44[local63 - 1][local68 - 1] == 0 && (local49[local80 - 1][local85] & 0x4FA40000) == 0 && (local49[local80 - 1][local85 - 1] & 0x43A40000) == 0 && (local49[local80][local85 - 1] & 0x63E40000) == 0) {
				Static55.anIntArray87[local44] = local5 - 1;
				Static335.anIntArray379[local44] = local7 - 1;
				local44 = local44 + 1 & 0xFFF;
				Static220.anIntArrayArray44[local63 - 1][local68 - 1] = 3;
				Static314.anIntArrayArray58[local63 - 1][local68 - 1] = local235;
			}
			if (local63 < 126 && local68 > 0 && Static220.anIntArrayArray44[local63 + 1][local68 - 1] == 0 && (local49[local80 + 1][local85 - 1] & 0x63E40000) == 0 && (local49[local80 + 2][local85 - 1] & 0x60E40000) == 0 && (local49[local80 + 2][local85] & 0x78E40000) == 0) {
				Static55.anIntArray87[local44] = local5 + 1;
				Static335.anIntArray379[local44] = local7 - 1;
				Static220.anIntArrayArray44[local63 + 1][local68 - 1] = 9;
				local44 = local44 + 1 & 0xFFF;
				Static314.anIntArrayArray58[local63 + 1][local68 - 1] = local235;
			}
			if (local63 > 0 && local68 < 126 && Static220.anIntArrayArray44[local63 - 1][local68 + 1] == 0 && (local49[local80 - 1][local85 + 1] & 0x4FA40000) == 0 && (local49[local80 - 1][local85 + 2] & 0x4E240000) == 0 && (local49[local80][local85 + 2] & 0x7E240000) == 0) {
				Static55.anIntArray87[local44] = local5 - 1;
				Static335.anIntArray379[local44] = local7 + 1;
				Static220.anIntArrayArray44[local63 - 1][local68 + 1] = 6;
				local44 = local44 + 1 & 0xFFF;
				Static314.anIntArrayArray58[local63 - 1][local68 + 1] = local235;
			}
			if (local63 < 126 && local68 < 126 && Static220.anIntArrayArray44[local63 + 1][local68 + 1] == 0 && (local49[local80 + 1][local85 + 2] & 0x7E240000) == 0 && (local49[local80 + 2][local85 + 2] & 0x78240000) == 0 && (local49[local80 + 2][local85 + 1] & 0x78E40000) == 0) {
				Static55.anIntArray87[local44] = local5 + 1;
				Static335.anIntArray379[local44] = local7 + 1;
				local44 = local44 + 1 & 0xFFF;
				Static220.anIntArrayArray44[local63 + 1][local68 + 1] = 12;
				Static314.anIntArrayArray58[local63 + 1][local68 + 1] = local235;
			}
		}
		Static530.anInt8535 = local7;
		Static166.anInt3402 = local5;
		return false;
	}
}
