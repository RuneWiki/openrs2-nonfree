import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(CB)B")
	public static byte method2555(@OriginalArg(0) char arg0) {
		@Pc(25) byte local25;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local25 = (byte) arg0;
		} else if (arg0 == '€') {
			local25 = -128;
		} else if (arg0 == '‚') {
			local25 = -126;
		} else if (arg0 == 'ƒ') {
			local25 = -125;
		} else if (arg0 == '„') {
			local25 = -124;
		} else if (arg0 == '…') {
			local25 = -123;
		} else if (arg0 == '†') {
			local25 = -122;
		} else if (arg0 == '‡') {
			local25 = -121;
		} else if (arg0 == 'ˆ') {
			local25 = -120;
		} else if (arg0 == '‰') {
			local25 = -119;
		} else if (arg0 == 'Š') {
			local25 = -118;
		} else if (arg0 == '‹') {
			local25 = -117;
		} else if (arg0 == 'Œ') {
			local25 = -116;
		} else if (arg0 == 'Ž') {
			local25 = -114;
		} else if (arg0 == '‘') {
			local25 = -111;
		} else if (arg0 == '’') {
			local25 = -110;
		} else if (arg0 == '“') {
			local25 = -109;
		} else if (arg0 == '”') {
			local25 = -108;
		} else if (arg0 == '•') {
			local25 = -107;
		} else if (arg0 == '–') {
			local25 = -106;
		} else if (arg0 == '—') {
			local25 = -105;
		} else if (arg0 == '˜') {
			local25 = -104;
		} else if (arg0 == '™') {
			local25 = -103;
		} else if (arg0 == 'š') {
			local25 = -102;
		} else if (arg0 == '›') {
			local25 = -101;
		} else if (arg0 == 'œ') {
			local25 = -100;
		} else if (arg0 == 'ž') {
			local25 = -98;
		} else if (arg0 == 'Ÿ') {
			local25 = -97;
		} else {
			local25 = 63;
		}
		return local25;
	}
}
