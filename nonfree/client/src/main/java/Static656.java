import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static656 {

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "Lclient!sga;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "Z")
	public static boolean aBoolean741 = false;

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "[I")
	public static final int[] anIntArray575 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([BIIIILjava/lang/String;)I")
	public static int method9164(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) String arg3) {
		@Pc(7) int local7 = arg1;
		for (@Pc(22) int local22 = 0; local22 < local7; local22++) {
			@Pc(29) char local29 = arg3.charAt(local22);
			if (local29 > '\u0000' && local29 < '\u0080' || !(local29 < ' ' || local29 > 'ÿ')) {
				arg0[local22 + arg2] = (byte) local29;
			} else if (local29 == '€') {
				arg0[arg2 + local22] = -128;
			} else if (local29 == '‚') {
				arg0[local22 + arg2] = -126;
			} else if (local29 == 'ƒ') {
				arg0[local22 + arg2] = -125;
			} else if (local29 == '„') {
				arg0[arg2 + local22] = -124;
			} else if (local29 == '…') {
				arg0[arg2 + local22] = -123;
			} else if (local29 == '†') {
				arg0[arg2 + local22] = -122;
			} else if (local29 == '‡') {
				arg0[arg2 + local22] = -121;
			} else if (local29 == 'ˆ') {
				arg0[local22 + arg2] = -120;
			} else if (local29 == '‰') {
				arg0[local22 + arg2] = -119;
			} else if (local29 == 'Š') {
				arg0[arg2 + local22] = -118;
			} else if (local29 == '‹') {
				arg0[local22 + arg2] = -117;
			} else if (local29 == 'Œ') {
				arg0[local22 + arg2] = -116;
			} else if (local29 == 'Ž') {
				arg0[arg2 + local22] = -114;
			} else if (local29 == '‘') {
				arg0[local22 + arg2] = -111;
			} else if (local29 == '’') {
				arg0[local22 + arg2] = -110;
			} else if (local29 == '“') {
				arg0[local22 + arg2] = -109;
			} else if (local29 == '”') {
				arg0[local22 + arg2] = -108;
			} else if (local29 == '•') {
				arg0[local22 + arg2] = -107;
			} else if (local29 == '–') {
				arg0[local22 + arg2] = -106;
			} else if (local29 == '—') {
				arg0[local22 + arg2] = -105;
			} else if (local29 == '˜') {
				arg0[local22 + arg2] = -104;
			} else if (local29 == '™') {
				arg0[local22 + arg2] = -103;
			} else if (local29 == 'š') {
				arg0[local22 + arg2] = -102;
			} else if (local29 == '›') {
				arg0[arg2 + local22] = -101;
			} else if (local29 == 'œ') {
				arg0[arg2 + local22] = -100;
			} else if (local29 == 'ž') {
				arg0[local22 + arg2] = -98;
			} else if (local29 == 'Ÿ') {
				arg0[arg2 + local22] = -97;
			} else {
				arg0[local22 + arg2] = 63;
			}
		}
		return local7;
	}
}
