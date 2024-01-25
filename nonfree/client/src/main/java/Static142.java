import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public static int anInt5534;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	public static int anInt5535;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_158 = new Class107(76, 7);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_125 = new Class7("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!h", name = "d", descriptor = "[I")
	public static final int[] anIntArray514 = new int[100];

	@OriginalMember(owner = "client!h", name = "e", descriptor = "[I")
	public static final int[] anIntArray515 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!h", name = "g", descriptor = "F")
	public static float aFloat89 = 0.0F;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILclient!pd;IIII)Z")
	public static boolean method4625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class188 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg1;
		@Pc(7) int local7 = arg3;
		@Pc(15) int local15 = arg1 - 64;
		@Pc(20) int local20 = arg3 - 64;
		Static339.anIntArrayArray56[64][64] = 99;
		Static204.anIntArrayArray61[64][64] = 0;
		@Pc(34) byte local34 = 0;
		@Pc(36) int local36 = 0;
		Static286.anIntArray437[0] = arg1;
		@Pc(43) int local43 = local34 + 1;
		Static175.anIntArray289[0] = arg3;
		@Pc(48) int[][] local48 = arg5.anIntArrayArray51;
		while (local36 != local43) {
			local7 = Static175.anIntArray289[local36];
			local5 = Static286.anIntArray437[local36];
			local36 = local36 + 1 & 0xFFF;
			@Pc(73) int local73 = local5 - arg5.anInt5211;
			@Pc(78) int local78 = local7 - local20;
			@Pc(84) int local84 = local7 - arg5.anInt5216;
			@Pc(88) int local88 = local5 - local15;
			if (arg9 == -4) {
				if (local5 == arg0 && arg8 == local7) {
					Static82.anInt1809 = local7;
					Static130.anInt2613 = local5;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static205.method3298(local7, 1, arg7, local5, 1, arg2, arg0, arg8)) {
					Static130.anInt2613 = local5;
					Static82.anInt1809 = local7;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg5.method4321(local7, arg2, 1, arg0, arg8, arg7, local5, arg4, 1)) {
					Static82.anInt1809 = local7;
					Static130.anInt2613 = local5;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg5.method4313(local5, arg4, arg2, 1, arg0, arg8, local7, arg7)) {
					Static130.anInt2613 = local5;
					Static82.anInt1809 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg5.method4315(arg6, local5, arg0, 1, arg9, arg8, local7)) {
					Static130.anInt2613 = local5;
					Static82.anInt1809 = local7;
					return true;
				}
			} else if (arg5.method4319(1, local5, local7, arg6, arg0, arg8, arg9)) {
				Static130.anInt2613 = local5;
				Static82.anInt1809 = local7;
				return true;
			}
			@Pc(237) int local237 = Static204.anIntArrayArray61[local88][local78] + 1;
			if (local88 > 0 && Static339.anIntArrayArray56[local88 - 1][local78] == 0 && (local48[local73 - 1][local84] & 0x42240000) == 0) {
				Static286.anIntArray437[local43] = local5 - 1;
				Static175.anIntArray289[local43] = local7;
				local43 = local43 + 1 & 0xFFF;
				Static339.anIntArrayArray56[local88 - 1][local78] = 2;
				Static204.anIntArrayArray61[local88 - 1][local78] = local237;
			}
			if (local88 < 127 && Static339.anIntArrayArray56[local88 + 1][local78] == 0 && (local48[local73 + 1][local84] & 0x60240000) == 0) {
				Static286.anIntArray437[local43] = local5 + 1;
				Static175.anIntArray289[local43] = local7;
				Static339.anIntArrayArray56[local88 + 1][local78] = 8;
				local43 = local43 + 1 & 0xFFF;
				Static204.anIntArrayArray61[local88 + 1][local78] = local237;
			}
			if (local78 > 0 && Static339.anIntArrayArray56[local88][local78 - 1] == 0 && (local48[local73][local84 - 1] & 0x40A40000) == 0) {
				Static286.anIntArray437[local43] = local5;
				Static175.anIntArray289[local43] = local7 - 1;
				local43 = local43 + 1 & 0xFFF;
				Static339.anIntArrayArray56[local88][local78 - 1] = 1;
				Static204.anIntArrayArray61[local88][local78 - 1] = local237;
			}
			if (local78 < 127 && Static339.anIntArrayArray56[local88][local78 + 1] == 0 && (local48[local73][local84 + 1] & 0x48240000) == 0) {
				Static286.anIntArray437[local43] = local5;
				Static175.anIntArray289[local43] = local7 + 1;
				local43 = local43 + 1 & 0xFFF;
				Static339.anIntArrayArray56[local88][local78 + 1] = 4;
				Static204.anIntArrayArray61[local88][local78 + 1] = local237;
			}
			if (local88 > 0 && local78 > 0 && Static339.anIntArrayArray56[local88 - 1][local78 - 1] == 0 && (local48[local73 - 1][local84 - 1] & 0x43A40000) == 0 && (local48[local73 - 1][local84] & 0x42240000) == 0 && (local48[local73][local84 - 1] & 0x40A40000) == 0) {
				Static286.anIntArray437[local43] = local5 - 1;
				Static175.anIntArray289[local43] = local7 - 1;
				local43 = local43 + 1 & 0xFFF;
				Static339.anIntArrayArray56[local88 - 1][local78 - 1] = 3;
				Static204.anIntArrayArray61[local88 - 1][local78 - 1] = local237;
			}
			if (local88 < 127 && local78 > 0 && Static339.anIntArrayArray56[local88 + 1][local78 - 1] == 0 && (local48[local73 + 1][local84 - 1] & 0x60E40000) == 0 && (local48[local73 + 1][local84] & 0x60240000) == 0 && (local48[local73][local84 - 1] & 0x40A40000) == 0) {
				Static286.anIntArray437[local43] = local5 + 1;
				Static175.anIntArray289[local43] = local7 - 1;
				local43 = local43 + 1 & 0xFFF;
				Static339.anIntArrayArray56[local88 + 1][local78 - 1] = 9;
				Static204.anIntArrayArray61[local88 + 1][local78 - 1] = local237;
			}
			if (local88 > 0 && local78 < 127 && Static339.anIntArrayArray56[local88 - 1][local78 + 1] == 0 && (local48[local73 - 1][local84 + 1] & 0x4E240000) == 0 && (local48[local73 - 1][local84] & 0x42240000) == 0 && (local48[local73][local84 + 1] & 0x48240000) == 0) {
				Static286.anIntArray437[local43] = local5 - 1;
				Static175.anIntArray289[local43] = local7 + 1;
				Static339.anIntArrayArray56[local88 - 1][local78 + 1] = 6;
				local43 = local43 + 1 & 0xFFF;
				Static204.anIntArrayArray61[local88 - 1][local78 + 1] = local237;
			}
			if (local88 < 127 && local78 < 127 && Static339.anIntArrayArray56[local88 + 1][local78 + 1] == 0 && (local48[local73 + 1][local84 + 1] & 0x78240000) == 0 && (local48[local73 + 1][local84] & 0x60240000) == 0 && (local48[local73][local84 + 1] & 0x48240000) == 0) {
				Static286.anIntArray437[local43] = local5 + 1;
				Static175.anIntArray289[local43] = local7 + 1;
				Static339.anIntArrayArray56[local88 + 1][local78 + 1] = 12;
				local43 = local43 + 1 & 0xFFF;
				Static204.anIntArrayArray61[local88 + 1][local78 + 1] = local237;
			}
		}
		Static130.anInt2613 = local5;
		Static82.anInt1809 = local7;
		return false;
	}
}
