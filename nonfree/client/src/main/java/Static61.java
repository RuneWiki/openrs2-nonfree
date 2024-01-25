import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	public static int anInt1278 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[BBIILjava/lang/String;)I")
	public static int method1261(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(9) int local9 = arg1;
		for (@Pc(22) int local22 = 0; local22 < local9; local22++) {
			@Pc(30) char local30 = arg3.charAt(local22);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				arg0[arg2 + local22] = (byte) local30;
			} else if (local30 == '€') {
				arg0[arg2 + local22] = -128;
			} else if (local30 == '‚') {
				arg0[local22 + arg2] = -126;
			} else if (local30 == 'ƒ') {
				arg0[arg2 + local22] = -125;
			} else if (local30 == '„') {
				arg0[arg2 + local22] = -124;
			} else if (local30 == '…') {
				arg0[arg2 + local22] = -123;
			} else if (local30 == '†') {
				arg0[local22 + arg2] = -122;
			} else if (local30 == '‡') {
				arg0[arg2 + local22] = -121;
			} else if (local30 == 'ˆ') {
				arg0[arg2 + local22] = -120;
			} else if (local30 == '‰') {
				arg0[local22 + arg2] = -119;
			} else if (local30 == 'Š') {
				arg0[arg2 + local22] = -118;
			} else if (local30 == '‹') {
				arg0[local22 + arg2] = -117;
			} else if (local30 == 'Œ') {
				arg0[arg2 + local22] = -116;
			} else if (local30 == 'Ž') {
				arg0[local22 + arg2] = -114;
			} else if (local30 == '‘') {
				arg0[local22 + arg2] = -111;
			} else if (local30 == '’') {
				arg0[local22 + arg2] = -110;
			} else if (local30 == '“') {
				arg0[arg2 + local22] = -109;
			} else if (local30 == '”') {
				arg0[arg2 + local22] = -108;
			} else if (local30 == '•') {
				arg0[arg2 + local22] = -107;
			} else if (local30 == '–') {
				arg0[local22 + arg2] = -106;
			} else if (local30 == '—') {
				arg0[arg2 + local22] = -105;
			} else if (local30 == '˜') {
				arg0[arg2 + local22] = -104;
			} else if (local30 == '™') {
				arg0[local22 + arg2] = -103;
			} else if (local30 == 'š') {
				arg0[local22 + arg2] = -102;
			} else if (local30 == '›') {
				arg0[local22 + arg2] = -101;
			} else if (local30 == 'œ') {
				arg0[local22 + arg2] = -100;
			} else if (local30 == 'ž') {
				arg0[local22 + arg2] = -98;
			} else if (local30 == 'Ÿ') {
				arg0[arg2 + local22] = -97;
			} else {
				arg0[local22 + arg2] = 63;
			}
		}
		return local9;
	}
}
