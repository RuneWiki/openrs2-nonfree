import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
	public static int anInt5938;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method5079(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(23) char local23 = arg0.charAt(local18);
			if (local23 > '\u0000' && local23 < '\u0080' || !(local23 < ' ' || local23 > 'ÿ')) {
				local16[local18] = (byte) local23;
			} else if (local23 == '€') {
				local16[local18] = -128;
			} else if (local23 == '‚') {
				local16[local18] = -126;
			} else if (local23 == 'ƒ') {
				local16[local18] = -125;
			} else if (local23 == '„') {
				local16[local18] = -124;
			} else if (local23 == '…') {
				local16[local18] = -123;
			} else if (local23 == '†') {
				local16[local18] = -122;
			} else if (local23 == '‡') {
				local16[local18] = -121;
			} else if (local23 == 'ˆ') {
				local16[local18] = -120;
			} else if (local23 == '‰') {
				local16[local18] = -119;
			} else if (local23 == 'Š') {
				local16[local18] = -118;
			} else if (local23 == '‹') {
				local16[local18] = -117;
			} else if (local23 == 'Œ') {
				local16[local18] = -116;
			} else if (local23 == 'Ž') {
				local16[local18] = -114;
			} else if (local23 == '‘') {
				local16[local18] = -111;
			} else if (local23 == '’') {
				local16[local18] = -110;
			} else if (local23 == '“') {
				local16[local18] = -109;
			} else if (local23 == '”') {
				local16[local18] = -108;
			} else if (local23 == '•') {
				local16[local18] = -107;
			} else if (local23 == '–') {
				local16[local18] = -106;
			} else if (local23 == '—') {
				local16[local18] = -105;
			} else if (local23 == '˜') {
				local16[local18] = -104;
			} else if (local23 == '™') {
				local16[local18] = -103;
			} else if (local23 == 'š') {
				local16[local18] = -102;
			} else if (local23 == '›') {
				local16[local18] = -101;
			} else if (local23 == 'œ') {
				local16[local18] = -100;
			} else if (local23 == 'ž') {
				local16[local18] = -98;
			} else if (local23 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)I")
	public static int method5080(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
