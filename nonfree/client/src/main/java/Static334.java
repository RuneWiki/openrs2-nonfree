import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!raa;")
	public static Class295 aClass295_11;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BILjava/lang/String;II)I")
	public static int method5084(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		@Pc(15) int local15 = arg0;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg2.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg1[arg3 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg1[local17 + arg3] = -128;
			} else if (local25 == '‚') {
				arg1[local17 + arg3] = -126;
			} else if (local25 == 'ƒ') {
				arg1[arg3 + local17] = -125;
			} else if (local25 == '„') {
				arg1[local17 + arg3] = -124;
			} else if (local25 == '…') {
				arg1[local17 + arg3] = -123;
			} else if (local25 == '†') {
				arg1[local17 + arg3] = -122;
			} else if (local25 == '‡') {
				arg1[arg3 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg1[local17 + arg3] = -120;
			} else if (local25 == '‰') {
				arg1[local17 + arg3] = -119;
			} else if (local25 == 'Š') {
				arg1[local17 + arg3] = -118;
			} else if (local25 == '‹') {
				arg1[arg3 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg1[local17 + arg3] = -116;
			} else if (local25 == 'Ž') {
				arg1[local17 + arg3] = -114;
			} else if (local25 == '‘') {
				arg1[local17 + arg3] = -111;
			} else if (local25 == '’') {
				arg1[arg3 + local17] = -110;
			} else if (local25 == '“') {
				arg1[local17 + arg3] = -109;
			} else if (local25 == '”') {
				arg1[arg3 + local17] = -108;
			} else if (local25 == '•') {
				arg1[arg3 + local17] = -107;
			} else if (local25 == '–') {
				arg1[local17 + arg3] = -106;
			} else if (local25 == '—') {
				arg1[arg3 + local17] = -105;
			} else if (local25 == '˜') {
				arg1[arg3 + local17] = -104;
			} else if (local25 == '™') {
				arg1[local17 + arg3] = -103;
			} else if (local25 == 'š') {
				arg1[local17 + arg3] = -102;
			} else if (local25 == '›') {
				arg1[local17 + arg3] = -101;
			} else if (local25 == 'œ') {
				arg1[arg3 + local17] = -100;
			} else if (local25 == 'ž') {
				arg1[local17 + arg3] = -98;
			} else if (local25 == 'Ÿ') {
				arg1[local17 + arg3] = -97;
			} else {
				arg1[local17 + arg3] = 63;
			}
		}
		return local15;
	}
}
