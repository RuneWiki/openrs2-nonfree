import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!maa", name = "j", descriptor = "J")
	public static long aLong165 = 0L;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)I")
	public static int method4828(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "([BIIIILjava/lang/String;)I")
	public static int method4829(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(9) int local9 = arg2;
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			@Pc(19) char local19 = arg3.charAt(local11);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				arg0[arg1 + local11] = (byte) local19;
			} else if (local19 == '€') {
				arg0[arg1 + local11] = -128;
			} else if (local19 == '‚') {
				arg0[arg1 + local11] = -126;
			} else if (local19 == 'ƒ') {
				arg0[local11 + arg1] = -125;
			} else if (local19 == '„') {
				arg0[arg1 + local11] = -124;
			} else if (local19 == '…') {
				arg0[arg1 + local11] = -123;
			} else if (local19 == '†') {
				arg0[arg1 + local11] = -122;
			} else if (local19 == '‡') {
				arg0[local11 + arg1] = -121;
			} else if (local19 == 'ˆ') {
				arg0[local11 + arg1] = -120;
			} else if (local19 == '‰') {
				arg0[local11 + arg1] = -119;
			} else if (local19 == 'Š') {
				arg0[local11 + arg1] = -118;
			} else if (local19 == '‹') {
				arg0[arg1 + local11] = -117;
			} else if (local19 == 'Œ') {
				arg0[arg1 + local11] = -116;
			} else if (local19 == 'Ž') {
				arg0[arg1 + local11] = -114;
			} else if (local19 == '‘') {
				arg0[arg1 + local11] = -111;
			} else if (local19 == '’') {
				arg0[local11 + arg1] = -110;
			} else if (local19 == '“') {
				arg0[local11 + arg1] = -109;
			} else if (local19 == '”') {
				arg0[local11 + arg1] = -108;
			} else if (local19 == '•') {
				arg0[local11 + arg1] = -107;
			} else if (local19 == '–') {
				arg0[arg1 + local11] = -106;
			} else if (local19 == '—') {
				arg0[local11 + arg1] = -105;
			} else if (local19 == '˜') {
				arg0[arg1 + local11] = -104;
			} else if (local19 == '™') {
				arg0[local11 + arg1] = -103;
			} else if (local19 == 'š') {
				arg0[arg1 + local11] = -102;
			} else if (local19 == '›') {
				arg0[local11 + arg1] = -101;
			} else if (local19 == 'œ') {
				arg0[local11 + arg1] = -100;
			} else if (local19 == 'ž') {
				arg0[arg1 + local11] = -98;
			} else if (local19 == 'Ÿ') {
				arg0[arg1 + local11] = -97;
			} else {
				arg0[local11 + arg1] = 63;
			}
		}
		return local9;
	}
}
