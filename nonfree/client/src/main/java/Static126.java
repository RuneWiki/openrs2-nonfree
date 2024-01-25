import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!an;")
	public static Class16 aClass16_114;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray46;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III[BLjava/lang/String;I)I")
	public static int method7324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) String arg3) {
		@Pc(10) int local10 = arg0;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg3.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg2[local17 + arg1] = (byte) local25;
			} else if (local25 == '€') {
				arg2[local17 + arg1] = -128;
			} else if (local25 == '‚') {
				arg2[local17 + arg1] = -126;
			} else if (local25 == 'ƒ') {
				arg2[arg1 + local17] = -125;
			} else if (local25 == '„') {
				arg2[local17 + arg1] = -124;
			} else if (local25 == '…') {
				arg2[local17 + arg1] = -123;
			} else if (local25 == '†') {
				arg2[arg1 + local17] = -122;
			} else if (local25 == '‡') {
				arg2[local17 + arg1] = -121;
			} else if (local25 == 'ˆ') {
				arg2[arg1 + local17] = -120;
			} else if (local25 == '‰') {
				arg2[local17 + arg1] = -119;
			} else if (local25 == 'Š') {
				arg2[arg1 + local17] = -118;
			} else if (local25 == '‹') {
				arg2[arg1 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg2[local17 + arg1] = -116;
			} else if (local25 == 'Ž') {
				arg2[arg1 + local17] = -114;
			} else if (local25 == '‘') {
				arg2[local17 + arg1] = -111;
			} else if (local25 == '’') {
				arg2[arg1 + local17] = -110;
			} else if (local25 == '“') {
				arg2[arg1 + local17] = -109;
			} else if (local25 == '”') {
				arg2[local17 + arg1] = -108;
			} else if (local25 == '•') {
				arg2[local17 + arg1] = -107;
			} else if (local25 == '–') {
				arg2[arg1 + local17] = -106;
			} else if (local25 == '—') {
				arg2[local17 + arg1] = -105;
			} else if (local25 == '˜') {
				arg2[local17 + arg1] = -104;
			} else if (local25 == '™') {
				arg2[arg1 + local17] = -103;
			} else if (local25 == 'š') {
				arg2[local17 + arg1] = -102;
			} else if (local25 == '›') {
				arg2[local17 + arg1] = -101;
			} else if (local25 == 'œ') {
				arg2[arg1 + local17] = -100;
			} else if (local25 == 'ž') {
				arg2[local17 + arg1] = -98;
			} else if (local25 == 'Ÿ') {
				arg2[local17 + arg1] = -97;
			} else {
				arg2[arg1 + local17] = 63;
			}
		}
		return local10;
	}
}
