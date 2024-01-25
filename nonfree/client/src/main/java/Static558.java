import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_222 = new Class362(106, 8);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(CZ)B")
	public static byte method8030(@OriginalArg(0) char arg0) {
		@Pc(26) byte local26;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local26 = (byte) arg0;
		} else if (arg0 == '€') {
			local26 = -128;
		} else if (arg0 == '‚') {
			local26 = -126;
		} else if (arg0 == 'ƒ') {
			local26 = -125;
		} else if (arg0 == '„') {
			local26 = -124;
		} else if (arg0 == '…') {
			local26 = -123;
		} else if (arg0 == '†') {
			local26 = -122;
		} else if (arg0 == '‡') {
			local26 = -121;
		} else if (arg0 == 'ˆ') {
			local26 = -120;
		} else if (arg0 == '‰') {
			local26 = -119;
		} else if (arg0 == 'Š') {
			local26 = -118;
		} else if (arg0 == '‹') {
			local26 = -117;
		} else if (arg0 == 'Œ') {
			local26 = -116;
		} else if (arg0 == 'Ž') {
			local26 = -114;
		} else if (arg0 == '‘') {
			local26 = -111;
		} else if (arg0 == '’') {
			local26 = -110;
		} else if (arg0 == '“') {
			local26 = -109;
		} else if (arg0 == '”') {
			local26 = -108;
		} else if (arg0 == '•') {
			local26 = -107;
		} else if (arg0 == '–') {
			local26 = -106;
		} else if (arg0 == '—') {
			local26 = -105;
		} else if (arg0 == '˜') {
			local26 = -104;
		} else if (arg0 == '™') {
			local26 = -103;
		} else if (arg0 == 'š') {
			local26 = -102;
		} else if (arg0 == '›') {
			local26 = -101;
		} else if (arg0 == 'œ') {
			local26 = -100;
		} else if (arg0 == 'ž') {
			local26 = -98;
		} else if (arg0 == 'Ÿ') {
			local26 = -97;
		} else {
			local26 = 63;
		}
		return local26;
	}
}
