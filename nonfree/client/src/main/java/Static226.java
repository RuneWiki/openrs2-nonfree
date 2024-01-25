import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas9;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[200];

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
	public static int anInt5821 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILjava/lang/String;[BI)I")
	public static int method4534(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		@Pc(10) int local10 = arg0;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg1.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg2[arg3 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg2[local17 + arg3] = -128;
			} else if (local25 == '‚') {
				arg2[local17 + arg3] = -126;
			} else if (local25 == 'ƒ') {
				arg2[arg3 + local17] = -125;
			} else if (local25 == '„') {
				arg2[local17 + arg3] = -124;
			} else if (local25 == '…') {
				arg2[local17 + arg3] = -123;
			} else if (local25 == '†') {
				arg2[local17 + arg3] = -122;
			} else if (local25 == '‡') {
				arg2[arg3 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg2[arg3 + local17] = -120;
			} else if (local25 == '‰') {
				arg2[local17 + arg3] = -119;
			} else if (local25 == 'Š') {
				arg2[arg3 + local17] = -118;
			} else if (local25 == '‹') {
				arg2[local17 + arg3] = -117;
			} else if (local25 == 'Œ') {
				arg2[local17 + arg3] = -116;
			} else if (local25 == 'Ž') {
				arg2[local17 + arg3] = -114;
			} else if (local25 == '‘') {
				arg2[arg3 + local17] = -111;
			} else if (local25 == '’') {
				arg2[arg3 + local17] = -110;
			} else if (local25 == '“') {
				arg2[arg3 + local17] = -109;
			} else if (local25 == '”') {
				arg2[local17 + arg3] = -108;
			} else if (local25 == '•') {
				arg2[arg3 + local17] = -107;
			} else if (local25 == '–') {
				arg2[arg3 + local17] = -106;
			} else if (local25 == '—') {
				arg2[arg3 + local17] = -105;
			} else if (local25 == '˜') {
				arg2[arg3 + local17] = -104;
			} else if (local25 == '™') {
				arg2[arg3 + local17] = -103;
			} else if (local25 == 'š') {
				arg2[arg3 + local17] = -102;
			} else if (local25 == '›') {
				arg2[local17 + arg3] = -101;
			} else if (local25 == 'œ') {
				arg2[local17 + arg3] = -100;
			} else if (local25 == 'ž') {
				arg2[arg3 + local17] = -98;
			} else if (local25 == 'Ÿ') {
				arg2[local17 + arg3] = -97;
			} else {
				arg2[local17 + arg3] = 63;
			}
		}
		return local10;
	}
}
