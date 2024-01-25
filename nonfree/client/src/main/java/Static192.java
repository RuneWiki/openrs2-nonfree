import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "[I")
	public static int[] anIntArray381;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
	public static int anInt3987;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "Lclient!lm;")
	public static Class134 aClass134_91;

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
	public static int anInt3988;

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "Lclient!lm;")
	public static Class134 aClass134_92;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)I")
	public static int method3377() {
		return 15;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIILclient!wm;BI)V")
	public static void method3378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class10_Sub1_Sub2 arg2, @OriginalArg(6) int arg3) {
		Static124.method1975(arg3, arg2.anInt6728, arg1, 0, arg2.anInt6726, arg0);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method3380(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}
}
