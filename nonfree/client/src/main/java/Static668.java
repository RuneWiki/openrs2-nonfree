import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method8852(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(21) char local21 = arg0.charAt(local13);
			if (local21 > '\u0000' && local21 < '\u0080' || local21 >= ' ' && local21 <= 'ÿ') {
				local11[local13] = (byte) local21;
			} else if (local21 == '€') {
				local11[local13] = -128;
			} else if (local21 == '‚') {
				local11[local13] = -126;
			} else if (local21 == 'ƒ') {
				local11[local13] = -125;
			} else if (local21 == '„') {
				local11[local13] = -124;
			} else if (local21 == '…') {
				local11[local13] = -123;
			} else if (local21 == '†') {
				local11[local13] = -122;
			} else if (local21 == '‡') {
				local11[local13] = -121;
			} else if (local21 == 'ˆ') {
				local11[local13] = -120;
			} else if (local21 == '‰') {
				local11[local13] = -119;
			} else if (local21 == 'Š') {
				local11[local13] = -118;
			} else if (local21 == '‹') {
				local11[local13] = -117;
			} else if (local21 == 'Œ') {
				local11[local13] = -116;
			} else if (local21 == 'Ž') {
				local11[local13] = -114;
			} else if (local21 == '‘') {
				local11[local13] = -111;
			} else if (local21 == '’') {
				local11[local13] = -110;
			} else if (local21 == '“') {
				local11[local13] = -109;
			} else if (local21 == '”') {
				local11[local13] = -108;
			} else if (local21 == '•') {
				local11[local13] = -107;
			} else if (local21 == '–') {
				local11[local13] = -106;
			} else if (local21 == '—') {
				local11[local13] = -105;
			} else if (local21 == '˜') {
				local11[local13] = -104;
			} else if (local21 == '™') {
				local11[local13] = -103;
			} else if (local21 == 'š') {
				local11[local13] = -102;
			} else if (local21 == '›') {
				local11[local13] = -101;
			} else if (local21 == 'œ') {
				local11[local13] = -100;
			} else if (local21 == 'ž') {
				local11[local13] = -98;
			} else if (local21 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		if (5779 == 5779) {
			return local11;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method8853(@OriginalArg(1) String arg0) {
		return Static326.aHashtable5.containsKey(arg0);
	}
}
