import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZI)I")
	public static int method1661(@OriginalArg(0) boolean arg0) {
		@Pc(13) int local13 = Static353.anInt6019;
		if (local13 == 0) {
			return arg0 ? 0 : Static596.anInt9747;
		} else if (local13 == 1) {
			return Static596.anInt9747;
		} else if (local13 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIII[BLjava/lang/String;)I")
	public static int method1663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg0;
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			@Pc(28) char local28 = arg3.charAt(local20);
			if (local28 > '\u0000' && local28 < '\u0080' || !(local28 < ' ' || local28 > 'ÿ')) {
				arg2[arg1 + local20] = (byte) local28;
			} else if (local28 == '€') {
				arg2[local20 + arg1] = -128;
			} else if (local28 == '‚') {
				arg2[local20 + arg1] = -126;
			} else if (local28 == 'ƒ') {
				arg2[local20 + arg1] = -125;
			} else if (local28 == '„') {
				arg2[local20 + arg1] = -124;
			} else if (local28 == '…') {
				arg2[local20 + arg1] = -123;
			} else if (local28 == '†') {
				arg2[arg1 + local20] = -122;
			} else if (local28 == '‡') {
				arg2[arg1 + local20] = -121;
			} else if (local28 == 'ˆ') {
				arg2[local20 + arg1] = -120;
			} else if (local28 == '‰') {
				arg2[arg1 + local20] = -119;
			} else if (local28 == 'Š') {
				arg2[arg1 + local20] = -118;
			} else if (local28 == '‹') {
				arg2[arg1 + local20] = -117;
			} else if (local28 == 'Œ') {
				arg2[local20 + arg1] = -116;
			} else if (local28 == 'Ž') {
				arg2[arg1 + local20] = -114;
			} else if (local28 == '‘') {
				arg2[local20 + arg1] = -111;
			} else if (local28 == '’') {
				arg2[local20 + arg1] = -110;
			} else if (local28 == '“') {
				arg2[arg1 + local20] = -109;
			} else if (local28 == '”') {
				arg2[arg1 + local20] = -108;
			} else if (local28 == '•') {
				arg2[local20 + arg1] = -107;
			} else if (local28 == '–') {
				arg2[arg1 + local20] = -106;
			} else if (local28 == '—') {
				arg2[local20 + arg1] = -105;
			} else if (local28 == '˜') {
				arg2[arg1 + local20] = -104;
			} else if (local28 == '™') {
				arg2[local20 + arg1] = -103;
			} else if (local28 == 'š') {
				arg2[arg1 + local20] = -102;
			} else if (local28 == '›') {
				arg2[local20 + arg1] = -101;
			} else if (local28 == 'œ') {
				arg2[local20 + arg1] = -100;
			} else if (local28 == 'ž') {
				arg2[local20 + arg1] = -98;
			} else if (local28 == 'Ÿ') {
				arg2[arg1 + local20] = -97;
			} else {
				arg2[arg1 + local20] = 63;
			}
		}
		return local10;
	}
}
