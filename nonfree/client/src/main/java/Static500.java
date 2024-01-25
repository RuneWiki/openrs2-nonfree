import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public static int anInt7956;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!om;")
	public static Class246 aClass246_235;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_244 = new Class272(82, 6);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[BLjava/lang/String;I)I")
	public static int method6740(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(15) int local15 = arg3;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg2.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg1[arg0 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg1[local17 + arg0] = -128;
			} else if (local25 == '‚') {
				arg1[local17 + arg0] = -126;
			} else if (local25 == 'ƒ') {
				arg1[local17 + arg0] = -125;
			} else if (local25 == '„') {
				arg1[arg0 + local17] = -124;
			} else if (local25 == '…') {
				arg1[local17 + arg0] = -123;
			} else if (local25 == '†') {
				arg1[local17 + arg0] = -122;
			} else if (local25 == '‡') {
				arg1[local17 + arg0] = -121;
			} else if (local25 == 'ˆ') {
				arg1[arg0 + local17] = -120;
			} else if (local25 == '‰') {
				arg1[arg0 + local17] = -119;
			} else if (local25 == 'Š') {
				arg1[local17 + arg0] = -118;
			} else if (local25 == '‹') {
				arg1[arg0 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg1[arg0 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg1[arg0 + local17] = -114;
			} else if (local25 == '‘') {
				arg1[local17 + arg0] = -111;
			} else if (local25 == '’') {
				arg1[arg0 + local17] = -110;
			} else if (local25 == '“') {
				arg1[arg0 + local17] = -109;
			} else if (local25 == '”') {
				arg1[arg0 + local17] = -108;
			} else if (local25 == '•') {
				arg1[arg0 + local17] = -107;
			} else if (local25 == '–') {
				arg1[local17 + arg0] = -106;
			} else if (local25 == '—') {
				arg1[arg0 + local17] = -105;
			} else if (local25 == '˜') {
				arg1[local17 + arg0] = -104;
			} else if (local25 == '™') {
				arg1[arg0 + local17] = -103;
			} else if (local25 == 'š') {
				arg1[arg0 + local17] = -102;
			} else if (local25 == '›') {
				arg1[arg0 + local17] = -101;
			} else if (local25 == 'œ') {
				arg1[local17 + arg0] = -100;
			} else if (local25 == 'ž') {
				arg1[arg0 + local17] = -98;
			} else if (local25 == 'Ÿ') {
				arg1[local17 + arg0] = -97;
			} else {
				arg1[local17 + arg0] = 63;
			}
		}
		return local15;
	}
}
