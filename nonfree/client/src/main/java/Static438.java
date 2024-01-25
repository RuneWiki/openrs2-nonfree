import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
	public static int anInt7455;

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "Z")
	public static boolean aBoolean554;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(CB)B")
	public static byte method6628(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BIII)I")
	public static int method6630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}
}
