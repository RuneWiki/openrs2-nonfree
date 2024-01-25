import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
	public static int anInt7840;

	@OriginalMember(owner = "client!qr", name = "F", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_27 = new Class27(2, 4, 4, 0);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method6804(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}
}
