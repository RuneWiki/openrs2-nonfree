import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
	public static int anInt5665;

	@OriginalMember(owner = "client!qj", name = "K", descriptor = "Lclient!rs;")
	public static Class207 aClass207_17;

	@OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
	public static int anInt5670;

	@OriginalMember(owner = "client!qj", name = "P", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_43 = new Class266();

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method4558(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(24) char local24 = arg0.charAt(local13);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local13] = (byte) local24;
			} else if (local24 == '€') {
				local11[local13] = -128;
			} else if (local24 == '‚') {
				local11[local13] = -126;
			} else if (local24 == 'ƒ') {
				local11[local13] = -125;
			} else if (local24 == '„') {
				local11[local13] = -124;
			} else if (local24 == '…') {
				local11[local13] = -123;
			} else if (local24 == '†') {
				local11[local13] = -122;
			} else if (local24 == '‡') {
				local11[local13] = -121;
			} else if (local24 == 'ˆ') {
				local11[local13] = -120;
			} else if (local24 == '‰') {
				local11[local13] = -119;
			} else if (local24 == 'Š') {
				local11[local13] = -118;
			} else if (local24 == '‹') {
				local11[local13] = -117;
			} else if (local24 == 'Œ') {
				local11[local13] = -116;
			} else if (local24 == 'Ž') {
				local11[local13] = -114;
			} else if (local24 == '‘') {
				local11[local13] = -111;
			} else if (local24 == '’') {
				local11[local13] = -110;
			} else if (local24 == '“') {
				local11[local13] = -109;
			} else if (local24 == '”') {
				local11[local13] = -108;
			} else if (local24 == '•') {
				local11[local13] = -107;
			} else if (local24 == '–') {
				local11[local13] = -106;
			} else if (local24 == '—') {
				local11[local13] = -105;
			} else if (local24 == '˜') {
				local11[local13] = -104;
			} else if (local24 == '™') {
				local11[local13] = -103;
			} else if (local24 == 'š') {
				local11[local13] = -102;
			} else if (local24 == '›') {
				local11[local13] = -101;
			} else if (local24 == 'œ') {
				local11[local13] = -100;
			} else if (local24 == 'ž') {
				local11[local13] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V")
	public static void method4559() {
		@Pc(13) Class1_Sub2_Sub1 local13 = Static258.method5559(0, 15);
		local13.method195();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)Lclient!tk;")
	public static Class225 method4560(@OriginalArg(0) int arg0) {
		@Pc(13) Class225[] local13 = Static386.method5276();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].anInt6765 == arg0) {
				return local13[local15];
			}
		}
		return null;
	}
}
