import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!tq", name = "eb", descriptor = "I")
	public static int anInt9470;

	@OriginalMember(owner = "client!tq", name = "gb", descriptor = "I")
	public static int anInt9471;

	@OriginalMember(owner = "client!tq", name = "nb", descriptor = "Lclient!vd;")
	public static Class353 aClass353_115;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)V")
	public static void method8049() {
		Static55.aClass166_6.method4811();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(CB)B")
	public static byte method8051(@OriginalArg(0) char arg0) {
		@Pc(36) byte local36;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local36 = (byte) arg0;
		} else if (arg0 == '€') {
			local36 = -128;
		} else if (arg0 == '‚') {
			local36 = -126;
		} else if (arg0 == 'ƒ') {
			local36 = -125;
		} else if (arg0 == '„') {
			local36 = -124;
		} else if (arg0 == '…') {
			local36 = -123;
		} else if (arg0 == '†') {
			local36 = -122;
		} else if (arg0 == '‡') {
			local36 = -121;
		} else if (arg0 == 'ˆ') {
			local36 = -120;
		} else if (arg0 == '‰') {
			local36 = -119;
		} else if (arg0 == 'Š') {
			local36 = -118;
		} else if (arg0 == '‹') {
			local36 = -117;
		} else if (arg0 == 'Œ') {
			local36 = -116;
		} else if (arg0 == 'Ž') {
			local36 = -114;
		} else if (arg0 == '‘') {
			local36 = -111;
		} else if (arg0 == '’') {
			local36 = -110;
		} else if (arg0 == '“') {
			local36 = -109;
		} else if (arg0 == '”') {
			local36 = -108;
		} else if (arg0 == '•') {
			local36 = -107;
		} else if (arg0 == '–') {
			local36 = -106;
		} else if (arg0 == '—') {
			local36 = -105;
		} else if (arg0 == '˜') {
			local36 = -104;
		} else if (arg0 == '™') {
			local36 = -103;
		} else if (arg0 == 'š') {
			local36 = -102;
		} else if (arg0 == '›') {
			local36 = -101;
		} else if (arg0 == 'œ') {
			local36 = -100;
		} else if (arg0 == 'ž') {
			local36 = -98;
		} else if (arg0 == 'Ÿ') {
			local36 = -97;
		} else {
			local36 = 63;
		}
		return local36;
	}
}
