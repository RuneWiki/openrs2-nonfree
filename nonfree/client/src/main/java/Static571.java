import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "[I")
	public static final int[] anIntArray518 = new int[3];

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "Lclient!hd;")
	public static final Class146 aClass146_7 = new Class146();

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "Z")
	public static boolean aBoolean596 = false;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BC)B")
	public static byte method7687(@OriginalArg(1) char arg0) {
		@Pc(37) byte local37;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local37 = (byte) arg0;
		} else if (arg0 == '€') {
			local37 = -128;
		} else if (arg0 == '‚') {
			local37 = -126;
		} else if (arg0 == 'ƒ') {
			local37 = -125;
		} else if (arg0 == '„') {
			local37 = -124;
		} else if (arg0 == '…') {
			local37 = -123;
		} else if (arg0 == '†') {
			local37 = -122;
		} else if (arg0 == '‡') {
			local37 = -121;
		} else if (arg0 == 'ˆ') {
			local37 = -120;
		} else if (arg0 == '‰') {
			local37 = -119;
		} else if (arg0 == 'Š') {
			local37 = -118;
		} else if (arg0 == '‹') {
			local37 = -117;
		} else if (arg0 == 'Œ') {
			local37 = -116;
		} else if (arg0 == 'Ž') {
			local37 = -114;
		} else if (arg0 == '‘') {
			local37 = -111;
		} else if (arg0 == '’') {
			local37 = -110;
		} else if (arg0 == '“') {
			local37 = -109;
		} else if (arg0 == '”') {
			local37 = -108;
		} else if (arg0 == '•') {
			local37 = -107;
		} else if (arg0 == '–') {
			local37 = -106;
		} else if (arg0 == '—') {
			local37 = -105;
		} else if (arg0 == '˜') {
			local37 = -104;
		} else if (arg0 == '™') {
			local37 = -103;
		} else if (arg0 == 'š') {
			local37 = -102;
		} else if (arg0 == '›') {
			local37 = -101;
		} else if (arg0 == 'œ') {
			local37 = -100;
		} else if (arg0 == 'ž') {
			local37 = -98;
		} else if (arg0 == 'Ÿ') {
			local37 = -97;
		} else {
			local37 = 63;
		}
		return local37;
	}
}
