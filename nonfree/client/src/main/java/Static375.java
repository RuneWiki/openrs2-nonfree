import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Lclient!fea;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	public static int anInt6609 = -1;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString68 = "";

	@OriginalMember(owner = "client!od", name = "y", descriptor = "S")
	public static short aShort67 = 1;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I[BIILjava/lang/String;I)I")
	public static int method5451(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(15) int local15 = arg3;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg2.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg1[local17 + arg0] = (byte) local25;
			} else if (local25 == '€') {
				arg1[local17 + arg0] = -128;
			} else if (local25 == '‚') {
				arg1[local17 + arg0] = -126;
			} else if (local25 == 'ƒ') {
				arg1[local17 + arg0] = -125;
			} else if (local25 == '„') {
				arg1[local17 + arg0] = -124;
			} else if (local25 == '…') {
				arg1[arg0 + local17] = -123;
			} else if (local25 == '†') {
				arg1[local17 + arg0] = -122;
			} else if (local25 == '‡') {
				arg1[local17 + arg0] = -121;
			} else if (local25 == 'ˆ') {
				arg1[local17 + arg0] = -120;
			} else if (local25 == '‰') {
				arg1[arg0 + local17] = -119;
			} else if (local25 == 'Š') {
				arg1[local17 + arg0] = -118;
			} else if (local25 == '‹') {
				arg1[local17 + arg0] = -117;
			} else if (local25 == 'Œ') {
				arg1[local17 + arg0] = -116;
			} else if (local25 == 'Ž') {
				arg1[arg0 + local17] = -114;
			} else if (local25 == '‘') {
				arg1[local17 + arg0] = -111;
			} else if (local25 == '’') {
				arg1[local17 + arg0] = -110;
			} else if (local25 == '“') {
				arg1[local17 + arg0] = -109;
			} else if (local25 == '”') {
				arg1[local17 + arg0] = -108;
			} else if (local25 == '•') {
				arg1[local17 + arg0] = -107;
			} else if (local25 == '–') {
				arg1[local17 + arg0] = -106;
			} else if (local25 == '—') {
				arg1[local17 + arg0] = -105;
			} else if (local25 == '˜') {
				arg1[arg0 + local17] = -104;
			} else if (local25 == '™') {
				arg1[arg0 + local17] = -103;
			} else if (local25 == 'š') {
				arg1[local17 + arg0] = -102;
			} else if (local25 == '›') {
				arg1[local17 + arg0] = -101;
			} else if (local25 == 'œ') {
				arg1[local17 + arg0] = -100;
			} else if (local25 == 'ž') {
				arg1[arg0 + local17] = -98;
			} else if (local25 == 'Ÿ') {
				arg1[arg0 + local17] = -97;
			} else {
				arg1[local17 + arg0] = 63;
			}
		}
		return local15;
	}
}
