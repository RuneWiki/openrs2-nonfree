import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
	public static int anInt7888;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
	public static int anInt7889;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(JJ)J")
	public static long method7040(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method7041(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(26) char local26 = arg0.charAt(local13);
			if (local26 > '\u0000' && local26 < '\u0080' || !(local26 < ' ' || local26 > 'ÿ')) {
				local11[local13] = (byte) local26;
			} else if (local26 == '€') {
				local11[local13] = -128;
			} else if (local26 == '‚') {
				local11[local13] = -126;
			} else if (local26 == 'ƒ') {
				local11[local13] = -125;
			} else if (local26 == '„') {
				local11[local13] = -124;
			} else if (local26 == '…') {
				local11[local13] = -123;
			} else if (local26 == '†') {
				local11[local13] = -122;
			} else if (local26 == '‡') {
				local11[local13] = -121;
			} else if (local26 == 'ˆ') {
				local11[local13] = -120;
			} else if (local26 == '‰') {
				local11[local13] = -119;
			} else if (local26 == 'Š') {
				local11[local13] = -118;
			} else if (local26 == '‹') {
				local11[local13] = -117;
			} else if (local26 == 'Œ') {
				local11[local13] = -116;
			} else if (local26 == 'Ž') {
				local11[local13] = -114;
			} else if (local26 == '‘') {
				local11[local13] = -111;
			} else if (local26 == '’') {
				local11[local13] = -110;
			} else if (local26 == '“') {
				local11[local13] = -109;
			} else if (local26 == '”') {
				local11[local13] = -108;
			} else if (local26 == '•') {
				local11[local13] = -107;
			} else if (local26 == '–') {
				local11[local13] = -106;
			} else if (local26 == '—') {
				local11[local13] = -105;
			} else if (local26 == '˜') {
				local11[local13] = -104;
			} else if (local26 == '™') {
				local11[local13] = -103;
			} else if (local26 == 'š') {
				local11[local13] = -102;
			} else if (local26 == '›') {
				local11[local13] = -101;
			} else if (local26 == 'œ') {
				local11[local13] = -100;
			} else if (local26 == 'ž') {
				local11[local13] = -98;
			} else if (local26 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}
}
