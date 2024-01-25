import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_316 = new Class12(11, -1);

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	public static int anInt6553 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(CI)B")
	public static byte method5126(@OriginalArg(0) char arg0) {
		@Pc(21) byte local21;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local21 = (byte) arg0;
		} else if (arg0 == '€') {
			local21 = -128;
		} else if (arg0 == '‚') {
			local21 = -126;
		} else if (arg0 == 'ƒ') {
			local21 = -125;
		} else if (arg0 == '„') {
			local21 = -124;
		} else if (arg0 == '…') {
			local21 = -123;
		} else if (arg0 == '†') {
			local21 = -122;
		} else if (arg0 == '‡') {
			local21 = -121;
		} else if (arg0 == 'ˆ') {
			local21 = -120;
		} else if (arg0 == '‰') {
			local21 = -119;
		} else if (arg0 == 'Š') {
			local21 = -118;
		} else if (arg0 == '‹') {
			local21 = -117;
		} else if (arg0 == 'Œ') {
			local21 = -116;
		} else if (arg0 == 'Ž') {
			local21 = -114;
		} else if (arg0 == '‘') {
			local21 = -111;
		} else if (arg0 == '’') {
			local21 = -110;
		} else if (arg0 == '“') {
			local21 = -109;
		} else if (arg0 == '”') {
			local21 = -108;
		} else if (arg0 == '•') {
			local21 = -107;
		} else if (arg0 == '–') {
			local21 = -106;
		} else if (arg0 == '—') {
			local21 = -105;
		} else if (arg0 == '˜') {
			local21 = -104;
		} else if (arg0 == '™') {
			local21 = -103;
		} else if (arg0 == 'š') {
			local21 = -102;
		} else if (arg0 == '›') {
			local21 = -101;
		} else if (arg0 == 'œ') {
			local21 = -100;
		} else if (arg0 == 'ž') {
			local21 = -98;
		} else if (arg0 == 'Ÿ') {
			local21 = -97;
		} else {
			local21 = 63;
		}
		return local21;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IBI)Z")
	public static boolean method5128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
