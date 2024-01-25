import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Lclient!bf;")
	public static final Class30 aClass30_3 = new Class30();

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method3532(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(18) byte[] local18 = new byte[local15];
		for (@Pc(20) int local20 = 0; local20 < local15; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local26 > '\u0000' && local26 < '\u0080' || !(local26 < ' ' || local26 > 'ÿ')) {
				local18[local20] = (byte) local26;
			} else if (local26 == '€') {
				local18[local20] = -128;
			} else if (local26 == '‚') {
				local18[local20] = -126;
			} else if (local26 == 'ƒ') {
				local18[local20] = -125;
			} else if (local26 == '„') {
				local18[local20] = -124;
			} else if (local26 == '…') {
				local18[local20] = -123;
			} else if (local26 == '†') {
				local18[local20] = -122;
			} else if (local26 == '‡') {
				local18[local20] = -121;
			} else if (local26 == 'ˆ') {
				local18[local20] = -120;
			} else if (local26 == '‰') {
				local18[local20] = -119;
			} else if (local26 == 'Š') {
				local18[local20] = -118;
			} else if (local26 == '‹') {
				local18[local20] = -117;
			} else if (local26 == 'Œ') {
				local18[local20] = -116;
			} else if (local26 == 'Ž') {
				local18[local20] = -114;
			} else if (local26 == '‘') {
				local18[local20] = -111;
			} else if (local26 == '’') {
				local18[local20] = -110;
			} else if (local26 == '“') {
				local18[local20] = -109;
			} else if (local26 == '”') {
				local18[local20] = -108;
			} else if (local26 == '•') {
				local18[local20] = -107;
			} else if (local26 == '–') {
				local18[local20] = -106;
			} else if (local26 == '—') {
				local18[local20] = -105;
			} else if (local26 == '˜') {
				local18[local20] = -104;
			} else if (local26 == '™') {
				local18[local20] = -103;
			} else if (local26 == 'š') {
				local18[local20] = -102;
			} else if (local26 == '›') {
				local18[local20] = -101;
			} else if (local26 == 'œ') {
				local18[local20] = -100;
			} else if (local26 == 'ž') {
				local18[local20] = -98;
			} else if (local26 == 'Ÿ') {
				local18[local20] = -97;
			} else {
				local18[local20] = 63;
			}
		}
		return local18;
	}
}
