import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "Z")
	public static boolean aBoolean270;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "[I")
	public static int[] anIntArray498;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static223.method941(arg5, Static223.anInt1245, Static152.anInt3532);
		@Pc(17) int local17 = Static223.method941(arg2, Static223.anInt1245, Static152.anInt3532);
		@Pc(23) int local23 = Static223.method941(arg1, Static88.anInt2052, Static102.anInt2239);
		@Pc(29) int local29 = Static223.method941(arg6, Static88.anInt2052, Static102.anInt2239);
		@Pc(37) int local37 = Static223.method941(arg4 + arg5, Static223.anInt1245, Static152.anInt3532);
		@Pc(46) int local46 = Static223.method941(arg2 - arg4, Static223.anInt1245, Static152.anInt3532);
		@Pc(52) int local52;
		for (local52 = local11; local52 < local37; local52++) {
			Static89.method1538(Static57.anIntArrayArray9[local52], local29, local23, arg3);
		}
		for (local52 = local17; local52 > local46; local52--) {
			Static89.method1538(Static57.anIntArrayArray9[local52], local29, local23, arg3);
		}
		@Pc(98) int local98 = Static223.method941(arg4 + arg1, Static88.anInt2052, Static102.anInt2239);
		@Pc(107) int local107 = Static223.method941(arg6 - arg4, Static88.anInt2052, Static102.anInt2239);
		for (local52 = local37; local52 <= local46; local52++) {
			@Pc(120) int[] local120 = Static57.anIntArrayArray9[local52];
			Static89.method1538(local120, local98, local23, arg3);
			Static89.method1538(local120, local107, local98, arg0);
			Static89.method1538(local120, local29, local107, arg3);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIII)I")
	public static int method3905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static287.anIntArrayArrayArray18 == null) {
			return 0;
		}
		@Pc(12) int local12 = arg0 >> 7;
		@Pc(16) int local16 = arg1 >> 7;
		if (local12 < 0 || local16 < 0 || local12 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(41) int local41 = arg2;
		@Pc(45) int local45 = arg0 & 0x7F;
		if (arg2 < 3 && (Static126.aByteArrayArrayArray24[1][local12][local16] & 0x2) == 2) {
			local41 = arg2 + 1;
		}
		@Pc(96) int local96 = Static287.anIntArrayArrayArray18[local41][local12][local16 + 1] * (128 - local45) + local45 * Static287.anIntArrayArrayArray18[local41][local12 + 1][local16 + 1] >> 7;
		@Pc(123) int local123 = Static287.anIntArrayArrayArray18[local41][local12 + 1][local16] * local45 + Static287.anIntArrayArrayArray18[local41][local12][local16] * (128 - local45) >> 7;
		@Pc(132) int local132 = arg1 & 0x7F;
		return (128 - local132) * local123 + local96 * local132 >> 7;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method3907(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(26) char local26 = arg0.charAt(local13);
			if (local26 > '\u0000' && local26 < '\u0080' || !(local26 < ' ' || local26 > 'ÿ')) {
				local11[local13] = (byte) local26;
			} else if (local26 == '€') {
				local11[local13] = -128;
			} else if (local26 == '‚') {
				local11[local13] = -126;
			} else if (local26 == 'ƒ') {
				local11[local13] = -125;
			} else if (local26 == '„') {
				local11[local13] = -124;
			} else if (local26 == '…') {
				local11[local13] = -123;
			} else if (local26 == '†') {
				local11[local13] = -122;
			} else if (local26 == '‡') {
				local11[local13] = -121;
			} else if (local26 == 'ˆ') {
				local11[local13] = -120;
			} else if (local26 == '‰') {
				local11[local13] = -119;
			} else if (local26 == 'Š') {
				local11[local13] = -118;
			} else if (local26 == '‹') {
				local11[local13] = -117;
			} else if (local26 == 'Œ') {
				local11[local13] = -116;
			} else if (local26 == 'Ž') {
				local11[local13] = -114;
			} else if (local26 == '‘') {
				local11[local13] = -111;
			} else if (local26 == '’') {
				local11[local13] = -110;
			} else if (local26 == '“') {
				local11[local13] = -109;
			} else if (local26 == '”') {
				local11[local13] = -108;
			} else if (local26 == '•') {
				local11[local13] = -107;
			} else if (local26 == '–') {
				local11[local13] = -106;
			} else if (local26 == '—') {
				local11[local13] = -105;
			} else if (local26 == '˜') {
				local11[local13] = -104;
			} else if (local26 == '™') {
				local11[local13] = -103;
			} else if (local26 == 'š') {
				local11[local13] = -102;
			} else if (local26 == '›') {
				local11[local13] = -101;
			} else if (local26 == 'œ') {
				local11[local13] = -100;
			} else if (local26 == 'ž') {
				local11[local13] = -98;
			} else if (local26 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
	public static void method3908() {
		Static209.anInt4636 = 1;
		Static158.anInt3656 = 0;
		Static81.anInt1946 = 0;
		Static213.anInt4718 = -1;
		Static275.anInt5910 = -3;
		Static208.aBoolean245 = false;
		Static54.anInt1455 = 0;
	}
}
