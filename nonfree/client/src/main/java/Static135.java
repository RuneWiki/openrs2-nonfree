import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gk", name = "R", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_111 = new Class253(48, 0);

	@OriginalMember(owner = "client!gk", name = "mb", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!gk", name = "vb", descriptor = "I")
	public static int anInt5022 = 0;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method3962(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(19) char local19 = arg0.charAt(local13);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				local11[local13] = (byte) local19;
			} else if (local19 == '€') {
				local11[local13] = -128;
			} else if (local19 == '‚') {
				local11[local13] = -126;
			} else if (local19 == 'ƒ') {
				local11[local13] = -125;
			} else if (local19 == '„') {
				local11[local13] = -124;
			} else if (local19 == '…') {
				local11[local13] = -123;
			} else if (local19 == '†') {
				local11[local13] = -122;
			} else if (local19 == '‡') {
				local11[local13] = -121;
			} else if (local19 == 'ˆ') {
				local11[local13] = -120;
			} else if (local19 == '‰') {
				local11[local13] = -119;
			} else if (local19 == 'Š') {
				local11[local13] = -118;
			} else if (local19 == '‹') {
				local11[local13] = -117;
			} else if (local19 == 'Œ') {
				local11[local13] = -116;
			} else if (local19 == 'Ž') {
				local11[local13] = -114;
			} else if (local19 == '‘') {
				local11[local13] = -111;
			} else if (local19 == '’') {
				local11[local13] = -110;
			} else if (local19 == '“') {
				local11[local13] = -109;
			} else if (local19 == '”') {
				local11[local13] = -108;
			} else if (local19 == '•') {
				local11[local13] = -107;
			} else if (local19 == '–') {
				local11[local13] = -106;
			} else if (local19 == '—') {
				local11[local13] = -105;
			} else if (local19 == '˜') {
				local11[local13] = -104;
			} else if (local19 == '™') {
				local11[local13] = -103;
			} else if (local19 == 'š') {
				local11[local13] = -102;
			} else if (local19 == '›') {
				local11[local13] = -101;
			} else if (local19 == 'œ') {
				local11[local13] = -100;
			} else if (local19 == 'ž') {
				local11[local13] = -98;
			} else if (local19 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}
}
