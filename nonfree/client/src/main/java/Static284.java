import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Lclient!fs;")
	public static Class76 aClass76_55;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method3967(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(22) char local22 = arg0.charAt(local13);
			if (local22 > '\u0000' && local22 < '\u0080' || !(local22 < ' ' || local22 > 'ÿ')) {
				local11[local13] = (byte) local22;
			} else if (local22 == '€') {
				local11[local13] = -128;
			} else if (local22 == '‚') {
				local11[local13] = -126;
			} else if (local22 == 'ƒ') {
				local11[local13] = -125;
			} else if (local22 == '„') {
				local11[local13] = -124;
			} else if (local22 == '…') {
				local11[local13] = -123;
			} else if (local22 == '†') {
				local11[local13] = -122;
			} else if (local22 == '‡') {
				local11[local13] = -121;
			} else if (local22 == 'ˆ') {
				local11[local13] = -120;
			} else if (local22 == '‰') {
				local11[local13] = -119;
			} else if (local22 == 'Š') {
				local11[local13] = -118;
			} else if (local22 == '‹') {
				local11[local13] = -117;
			} else if (local22 == 'Œ') {
				local11[local13] = -116;
			} else if (local22 == 'Ž') {
				local11[local13] = -114;
			} else if (local22 == '‘') {
				local11[local13] = -111;
			} else if (local22 == '’') {
				local11[local13] = -110;
			} else if (local22 == '“') {
				local11[local13] = -109;
			} else if (local22 == '”') {
				local11[local13] = -108;
			} else if (local22 == '•') {
				local11[local13] = -107;
			} else if (local22 == '–') {
				local11[local13] = -106;
			} else if (local22 == '—') {
				local11[local13] = -105;
			} else if (local22 == '˜') {
				local11[local13] = -104;
			} else if (local22 == '™') {
				local11[local13] = -103;
			} else if (local22 == 'š') {
				local11[local13] = -102;
			} else if (local22 == '›') {
				local11[local13] = -101;
			} else if (local22 == 'œ') {
				local11[local13] = -100;
			} else if (local22 == 'ž') {
				local11[local13] = -98;
			} else if (local22 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}
}
