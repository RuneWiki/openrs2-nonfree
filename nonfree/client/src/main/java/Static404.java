import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "Lclient!da;")
	public static Class72 aClass72_11;

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
	public static int anInt6945;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "Lclient!ab;")
	public static Class3 aClass3_6;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_217 = new Class196(57, 4);

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_66 = new Class187(27, 3);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BC)B")
	public static byte method5902(@OriginalArg(1) char arg0) {
		@Pc(24) byte local24;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local24 = (byte) arg0;
		} else if (arg0 == '€') {
			local24 = -128;
		} else if (arg0 == '‚') {
			local24 = -126;
		} else if (arg0 == 'ƒ') {
			local24 = -125;
		} else if (arg0 == '„') {
			local24 = -124;
		} else if (arg0 == '…') {
			local24 = -123;
		} else if (arg0 == '†') {
			local24 = -122;
		} else if (arg0 == '‡') {
			local24 = -121;
		} else if (arg0 == 'ˆ') {
			local24 = -120;
		} else if (arg0 == '‰') {
			local24 = -119;
		} else if (arg0 == 'Š') {
			local24 = -118;
		} else if (arg0 == '‹') {
			local24 = -117;
		} else if (arg0 == 'Œ') {
			local24 = -116;
		} else if (arg0 == 'Ž') {
			local24 = -114;
		} else if (arg0 == '‘') {
			local24 = -111;
		} else if (arg0 == '’') {
			local24 = -110;
		} else if (arg0 == '“') {
			local24 = -109;
		} else if (arg0 == '”') {
			local24 = -108;
		} else if (arg0 == '•') {
			local24 = -107;
		} else if (arg0 == '–') {
			local24 = -106;
		} else if (arg0 == '—') {
			local24 = -105;
		} else if (arg0 == '˜') {
			local24 = -104;
		} else if (arg0 == '™') {
			local24 = -103;
		} else if (arg0 == 'š') {
			local24 = -102;
		} else if (arg0 == '›') {
			local24 = -101;
		} else if (arg0 == 'œ') {
			local24 = -100;
		} else if (arg0 == 'ž') {
			local24 = -98;
		} else if (arg0 == 'Ÿ') {
			local24 = -97;
		} else {
			local24 = 63;
		}
		return local24;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
	public static void method5903() {
		Static421.method6414();
		Static305.aBoolean315 = false;
	}
}
