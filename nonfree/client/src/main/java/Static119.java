import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "Lclient!pi;")
	public static Class184 aClass184_92;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "Lclient!uq;")
	public static Class3_Sub43 aClass3_Sub43_1 = null;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "J")
	public static long aLong79 = 0L;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method2156(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(14) byte[] local14 = new byte[local6];
		for (@Pc(16) int local16 = 0; local16 < local6; local16++) {
			@Pc(21) char local21 = arg0.charAt(local16);
			if (local21 > '\u0000' && local21 < '\u0080' || !(local21 < ' ' || local21 > 'ÿ')) {
				local14[local16] = (byte) local21;
			} else if (local21 == '€') {
				local14[local16] = -128;
			} else if (local21 == '‚') {
				local14[local16] = -126;
			} else if (local21 == 'ƒ') {
				local14[local16] = -125;
			} else if (local21 == '„') {
				local14[local16] = -124;
			} else if (local21 == '…') {
				local14[local16] = -123;
			} else if (local21 == '†') {
				local14[local16] = -122;
			} else if (local21 == '‡') {
				local14[local16] = -121;
			} else if (local21 == 'ˆ') {
				local14[local16] = -120;
			} else if (local21 == '‰') {
				local14[local16] = -119;
			} else if (local21 == 'Š') {
				local14[local16] = -118;
			} else if (local21 == '‹') {
				local14[local16] = -117;
			} else if (local21 == 'Œ') {
				local14[local16] = -116;
			} else if (local21 == 'Ž') {
				local14[local16] = -114;
			} else if (local21 == '‘') {
				local14[local16] = -111;
			} else if (local21 == '’') {
				local14[local16] = -110;
			} else if (local21 == '“') {
				local14[local16] = -109;
			} else if (local21 == '”') {
				local14[local16] = -108;
			} else if (local21 == '•') {
				local14[local16] = -107;
			} else if (local21 == '–') {
				local14[local16] = -106;
			} else if (local21 == '—') {
				local14[local16] = -105;
			} else if (local21 == '˜') {
				local14[local16] = -104;
			} else if (local21 == '™') {
				local14[local16] = -103;
			} else if (local21 == 'š') {
				local14[local16] = -102;
			} else if (local21 == '›') {
				local14[local16] = -101;
			} else if (local21 == 'œ') {
				local14[local16] = -100;
			} else if (local21 == 'ž') {
				local14[local16] = -98;
			} else if (local21 == 'Ÿ') {
				local14[local16] = -97;
			} else {
				local14[local16] = 63;
			}
		}
		return local14;
	}
}
