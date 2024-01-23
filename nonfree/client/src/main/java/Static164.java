import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IC)Z")
	public static boolean method2590(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method2591() {
		Static287.aClass33_20.method843();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([BIILjava/lang/String;II)I")
	public static int method2592(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		@Pc(11) int local11 = arg1;
		for (@Pc(17) int local17 = 0; local17 < local11; local17++) {
			@Pc(30) char local30 = arg2.charAt(local17);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				arg0[arg3 + local17] = (byte) local30;
			} else if (local30 == '€') {
				arg0[arg3 + local17] = -128;
			} else if (local30 == '‚') {
				arg0[local17 + arg3] = -126;
			} else if (local30 == 'ƒ') {
				arg0[local17 + arg3] = -125;
			} else if (local30 == '„') {
				arg0[arg3 + local17] = -124;
			} else if (local30 == '…') {
				arg0[arg3 + local17] = -123;
			} else if (local30 == '†') {
				arg0[local17 + arg3] = -122;
			} else if (local30 == '‡') {
				arg0[arg3 + local17] = -121;
			} else if (local30 == 'ˆ') {
				arg0[local17 + arg3] = -120;
			} else if (local30 == '‰') {
				arg0[arg3 + local17] = -119;
			} else if (local30 == 'Š') {
				arg0[local17 + arg3] = -118;
			} else if (local30 == '‹') {
				arg0[arg3 + local17] = -117;
			} else if (local30 == 'Œ') {
				arg0[local17 + arg3] = -116;
			} else if (local30 == 'Ž') {
				arg0[local17 + arg3] = -114;
			} else if (local30 == '‘') {
				arg0[local17 + arg3] = -111;
			} else if (local30 == '’') {
				arg0[local17 + arg3] = -110;
			} else if (local30 == '“') {
				arg0[arg3 + local17] = -109;
			} else if (local30 == '”') {
				arg0[local17 + arg3] = -108;
			} else if (local30 == '•') {
				arg0[local17 + arg3] = -107;
			} else if (local30 == '–') {
				arg0[arg3 + local17] = -106;
			} else if (local30 == '—') {
				arg0[arg3 + local17] = -105;
			} else if (local30 == '˜') {
				arg0[local17 + arg3] = -104;
			} else if (local30 == '™') {
				arg0[local17 + arg3] = -103;
			} else if (local30 == 'š') {
				arg0[local17 + arg3] = -102;
			} else if (local30 == '›') {
				arg0[local17 + arg3] = -101;
			} else if (local30 == 'œ') {
				arg0[arg3 + local17] = -100;
			} else if (local30 == 'ž') {
				arg0[arg3 + local17] = -98;
			} else if (local30 == 'Ÿ') {
				arg0[arg3 + local17] = -97;
			} else {
				arg0[local17 + arg3] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 < 1 || arg0 < 1 || arg5 > 102 || arg0 > 102) {
			return;
		}
		@Pc(41) int local41;
		if (!Static62.method957() && (Static46.aByteArrayArrayArray2[0][arg5][arg0] & 0x2) == 0) {
			local41 = arg1;
			if ((Static46.aByteArrayArrayArray2[arg1][arg5][arg0] & 0x8) != 0) {
				local41 = 0;
			}
			if (local41 != Static168.anInt3342) {
				return;
			}
		}
		local41 = arg1;
		if (arg1 < 3 && (Static46.aByteArrayArrayArray2[1][arg5][arg0] & 0x2) == 2) {
			local41 = arg1 + 1;
		}
		Static95.method1524(arg1, local41, arg5, arg0, arg4, Static121.aClass63Array1[arg1]);
		if (arg6 >= 0) {
			@Pc(100) boolean local100 = Static114.aBoolean166;
			Static114.aBoolean166 = true;
			Static21.method3455(arg3, arg2, false, arg1, false, local41, Static121.aClass63Array1[arg1], arg5, arg6, arg0);
			Static114.aBoolean166 = local100;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)I")
	public static int method2597() {
		Static17.anInt367 = 0;
		return Static39.method4123();
	}
}
