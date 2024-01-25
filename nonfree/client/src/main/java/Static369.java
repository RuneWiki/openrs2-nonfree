import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_75 = new Class211(66, 8);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method2449() {
		if (Static237.aString49.toLowerCase().indexOf("microsoft") != -1) {
			Static128.anIntArray288[188] = 71;
			Static128.anIntArray288[189] = 26;
			Static128.anIntArray288[190] = 72;
			Static128.anIntArray288[221] = 43;
			Static128.anIntArray288[220] = 74;
			Static128.anIntArray288[223] = 28;
			Static128.anIntArray288[192] = 58;
			Static128.anIntArray288[222] = 59;
			Static128.anIntArray288[219] = 42;
			Static128.anIntArray288[186] = 57;
			Static128.anIntArray288[187] = 27;
			Static128.anIntArray288[191] = 73;
			return;
		}
		Static128.anIntArray288[44] = 71;
		Static128.anIntArray288[59] = 57;
		Static128.anIntArray288[45] = 26;
		Static128.anIntArray288[92] = 74;
		Static128.anIntArray288[47] = 73;
		Static128.anIntArray288[93] = 43;
		Static128.anIntArray288[46] = 72;
		Static128.anIntArray288[91] = 42;
		if (Static237.aMethod1 == null) {
			Static128.anIntArray288[192] = 58;
			Static128.anIntArray288[222] = 59;
		} else {
			Static128.anIntArray288[222] = 58;
			Static128.anIntArray288[520] = 59;
			Static128.anIntArray288[192] = 28;
		}
		Static128.anIntArray288[61] = 27;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILjava/lang/String;[BII)I")
	public static int method2450(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3) {
		@Pc(14) int local14 = arg0;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(24) char local24 = arg1.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg2[arg3 + local16] = (byte) local24;
			} else if (local24 == '€') {
				arg2[arg3 + local16] = -128;
			} else if (local24 == '‚') {
				arg2[local16 + arg3] = -126;
			} else if (local24 == 'ƒ') {
				arg2[arg3 + local16] = -125;
			} else if (local24 == '„') {
				arg2[arg3 + local16] = -124;
			} else if (local24 == '…') {
				arg2[local16 + arg3] = -123;
			} else if (local24 == '†') {
				arg2[local16 + arg3] = -122;
			} else if (local24 == '‡') {
				arg2[arg3 + local16] = -121;
			} else if (local24 == 'ˆ') {
				arg2[local16 + arg3] = -120;
			} else if (local24 == '‰') {
				arg2[local16 + arg3] = -119;
			} else if (local24 == 'Š') {
				arg2[arg3 + local16] = -118;
			} else if (local24 == '‹') {
				arg2[local16 + arg3] = -117;
			} else if (local24 == 'Œ') {
				arg2[local16 + arg3] = -116;
			} else if (local24 == 'Ž') {
				arg2[arg3 + local16] = -114;
			} else if (local24 == '‘') {
				arg2[arg3 + local16] = -111;
			} else if (local24 == '’') {
				arg2[arg3 + local16] = -110;
			} else if (local24 == '“') {
				arg2[arg3 + local16] = -109;
			} else if (local24 == '”') {
				arg2[local16 + arg3] = -108;
			} else if (local24 == '•') {
				arg2[local16 + arg3] = -107;
			} else if (local24 == '–') {
				arg2[local16 + arg3] = -106;
			} else if (local24 == '—') {
				arg2[local16 + arg3] = -105;
			} else if (local24 == '˜') {
				arg2[arg3 + local16] = -104;
			} else if (local24 == '™') {
				arg2[arg3 + local16] = -103;
			} else if (local24 == 'š') {
				arg2[local16 + arg3] = -102;
			} else if (local24 == '›') {
				arg2[arg3 + local16] = -101;
			} else if (local24 == 'œ') {
				arg2[local16 + arg3] = -100;
			} else if (local24 == 'ž') {
				arg2[local16 + arg3] = -98;
			} else if (local24 == 'Ÿ') {
				arg2[arg3 + local16] = -97;
			} else {
				arg2[arg3 + local16] = 63;
			}
		}
		return local14;
	}
}
