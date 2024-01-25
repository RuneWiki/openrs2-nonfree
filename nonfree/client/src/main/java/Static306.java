import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!l", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_42 = new Class276();

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(CB)B")
	public static byte method5197(@OriginalArg(0) char arg0) {
		@Pc(30) byte local30;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local30 = (byte) arg0;
		} else if (arg0 == '€') {
			local30 = -128;
		} else if (arg0 == '‚') {
			local30 = -126;
		} else if (arg0 == 'ƒ') {
			local30 = -125;
		} else if (arg0 == '„') {
			local30 = -124;
		} else if (arg0 == '…') {
			local30 = -123;
		} else if (arg0 == '†') {
			local30 = -122;
		} else if (arg0 == '‡') {
			local30 = -121;
		} else if (arg0 == 'ˆ') {
			local30 = -120;
		} else if (arg0 == '‰') {
			local30 = -119;
		} else if (arg0 == 'Š') {
			local30 = -118;
		} else if (arg0 == '‹') {
			local30 = -117;
		} else if (arg0 == 'Œ') {
			local30 = -116;
		} else if (arg0 == 'Ž') {
			local30 = -114;
		} else if (arg0 == '‘') {
			local30 = -111;
		} else if (arg0 == '’') {
			local30 = -110;
		} else if (arg0 == '“') {
			local30 = -109;
		} else if (arg0 == '”') {
			local30 = -108;
		} else if (arg0 == '•') {
			local30 = -107;
		} else if (arg0 == '–') {
			local30 = -106;
		} else if (arg0 == '—') {
			local30 = -105;
		} else if (arg0 == '˜') {
			local30 = -104;
		} else if (arg0 == '™') {
			local30 = -103;
		} else if (arg0 == 'š') {
			local30 = -102;
		} else if (arg0 == '›') {
			local30 = -101;
		} else if (arg0 == 'œ') {
			local30 = -100;
		} else if (arg0 == 'ž') {
			local30 = -98;
		} else if (arg0 == 'Ÿ') {
			local30 = -97;
		} else {
			local30 = 63;
		}
		return local30;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)V")
	public static void method5198(@OriginalArg(0) int arg0) {
		Static170.anIntArray225 = new int[arg0];
		Static454.anIntArray521 = new int[arg0];
		Static99.anIntArray103 = new int[arg0];
		Static394.anIntArray471 = new int[arg0];
		Static286.anIntArray346 = new int[arg0];
	}
}
