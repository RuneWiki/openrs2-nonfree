import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mt", name = "N", descriptor = "Z")
	public static volatile boolean aBoolean339 = false;

	@OriginalMember(owner = "client!mt", name = "O", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_153 = new Class186(82, 0);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method3511(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(19) byte[] local19 = new byte[local16];
		for (@Pc(21) int local21 = 0; local21 < local16; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local19[local21] = (byte) local27;
			} else if (local27 == '€') {
				local19[local21] = -128;
			} else if (local27 == '‚') {
				local19[local21] = -126;
			} else if (local27 == 'ƒ') {
				local19[local21] = -125;
			} else if (local27 == '„') {
				local19[local21] = -124;
			} else if (local27 == '…') {
				local19[local21] = -123;
			} else if (local27 == '†') {
				local19[local21] = -122;
			} else if (local27 == '‡') {
				local19[local21] = -121;
			} else if (local27 == 'ˆ') {
				local19[local21] = -120;
			} else if (local27 == '‰') {
				local19[local21] = -119;
			} else if (local27 == 'Š') {
				local19[local21] = -118;
			} else if (local27 == '‹') {
				local19[local21] = -117;
			} else if (local27 == 'Œ') {
				local19[local21] = -116;
			} else if (local27 == 'Ž') {
				local19[local21] = -114;
			} else if (local27 == '‘') {
				local19[local21] = -111;
			} else if (local27 == '’') {
				local19[local21] = -110;
			} else if (local27 == '“') {
				local19[local21] = -109;
			} else if (local27 == '”') {
				local19[local21] = -108;
			} else if (local27 == '•') {
				local19[local21] = -107;
			} else if (local27 == '–') {
				local19[local21] = -106;
			} else if (local27 == '—') {
				local19[local21] = -105;
			} else if (local27 == '˜') {
				local19[local21] = -104;
			} else if (local27 == '™') {
				local19[local21] = -103;
			} else if (local27 == 'š') {
				local19[local21] = -102;
			} else if (local27 == '›') {
				local19[local21] = -101;
			} else if (local27 == 'œ') {
				local19[local21] = -100;
			} else if (local27 == 'ž') {
				local19[local21] = -98;
			} else if (local27 == 'Ÿ') {
				local19[local21] = -97;
			} else {
				local19[local21] = 63;
			}
		}
		return local19;
	}
}
