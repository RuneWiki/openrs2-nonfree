import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "[S")
	public static short[] aShortArray45 = new short[256];

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_64 = new Class173(70, 16);

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
	public static int anInt3921 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;IIZ[BI)I")
	public static int method3510(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		@Pc(20) int local20 = arg3;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(30) char local30 = arg0.charAt(local22);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				arg2[arg1 + local22] = (byte) local30;
			} else if (local30 == '€') {
				arg2[local22 + arg1] = -128;
			} else if (local30 == '‚') {
				arg2[local22 + arg1] = -126;
			} else if (local30 == 'ƒ') {
				arg2[arg1 + local22] = -125;
			} else if (local30 == '„') {
				arg2[local22 + arg1] = -124;
			} else if (local30 == '…') {
				arg2[local22 + arg1] = -123;
			} else if (local30 == '†') {
				arg2[local22 + arg1] = -122;
			} else if (local30 == '‡') {
				arg2[local22 + arg1] = -121;
			} else if (local30 == 'ˆ') {
				arg2[arg1 + local22] = -120;
			} else if (local30 == '‰') {
				arg2[local22 + arg1] = -119;
			} else if (local30 == 'Š') {
				arg2[local22 + arg1] = -118;
			} else if (local30 == '‹') {
				arg2[local22 + arg1] = -117;
			} else if (local30 == 'Œ') {
				arg2[arg1 + local22] = -116;
			} else if (local30 == 'Ž') {
				arg2[local22 + arg1] = -114;
			} else if (local30 == '‘') {
				arg2[arg1 + local22] = -111;
			} else if (local30 == '’') {
				arg2[arg1 + local22] = -110;
			} else if (local30 == '“') {
				arg2[local22 + arg1] = -109;
			} else if (local30 == '”') {
				arg2[arg1 + local22] = -108;
			} else if (local30 == '•') {
				arg2[arg1 + local22] = -107;
			} else if (local30 == '–') {
				arg2[arg1 + local22] = -106;
			} else if (local30 == '—') {
				arg2[arg1 + local22] = -105;
			} else if (local30 == '˜') {
				arg2[arg1 + local22] = -104;
			} else if (local30 == '™') {
				arg2[arg1 + local22] = -103;
			} else if (local30 == 'š') {
				arg2[local22 + arg1] = -102;
			} else if (local30 == '›') {
				arg2[local22 + arg1] = -101;
			} else if (local30 == 'œ') {
				arg2[arg1 + local22] = -100;
			} else if (local30 == 'ž') {
				arg2[local22 + arg1] = -98;
			} else if (local30 == 'Ÿ') {
				arg2[arg1 + local22] = -97;
			} else {
				arg2[local22 + arg1] = 63;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V")
	public static void method3513(@OriginalArg(1) int arg0) {
		Static423.anInt7945 = arg0;
		Static577.aClass223_67.method5398();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIBI)Z")
	public static boolean method3515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg3; local7++) {
			for (@Pc(16) int local16 = arg1; local16 <= arg4; local16++) {
				if (Static241.anIntArrayArray28[local7][local16] == arg0 && Static51.anIntArrayArray6[local7][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)I")
	public static int method3516(@OriginalArg(1) int arg0) {
		@Pc(21) int local21 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (local27 * arg0 >> 12) + 40960;
		return local35 * local21 >> 12;
	}
}
