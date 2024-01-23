import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
	public static int anInt1766;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "[I")
	public static int[] anIntArray187 = new int[200];

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	public static int anInt1763 = 0;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
	public static int anInt1764 = 0;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Lclient!wf;")
	public static Class191 aClass191_5 = null;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public static void method1320() {
		Static206.aClass1_Sub3_Sub24_7 = null;
		Static244.aClass1_Sub3_Sub24_6 = null;
		Static280.aClass1_Sub3_Sub24_8 = null;
		Static86.aClass1_Sub3_Sub24_4 = null;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(CI)B")
	public static byte method1321(@OriginalArg(0) char arg0) {
		@Pc(27) byte local27;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local27 = (byte) arg0;
		} else if (arg0 == '€') {
			local27 = -128;
		} else if (arg0 == '‚') {
			local27 = -126;
		} else if (arg0 == 'ƒ') {
			local27 = -125;
		} else if (arg0 == '„') {
			local27 = -124;
		} else if (arg0 == '…') {
			local27 = -123;
		} else if (arg0 == '†') {
			local27 = -122;
		} else if (arg0 == '‡') {
			local27 = -121;
		} else if (arg0 == 'ˆ') {
			local27 = -120;
		} else if (arg0 == '‰') {
			local27 = -119;
		} else if (arg0 == 'Š') {
			local27 = -118;
		} else if (arg0 == '‹') {
			local27 = -117;
		} else if (arg0 == 'Œ') {
			local27 = -116;
		} else if (arg0 == 'Ž') {
			local27 = -114;
		} else if (arg0 == '‘') {
			local27 = -111;
		} else if (arg0 == '’') {
			local27 = -110;
		} else if (arg0 == '“') {
			local27 = -109;
		} else if (arg0 == '”') {
			local27 = -108;
		} else if (arg0 == '•') {
			local27 = -107;
		} else if (arg0 == '–') {
			local27 = -106;
		} else if (arg0 == '—') {
			local27 = -105;
		} else if (arg0 == '˜') {
			local27 = -104;
		} else if (arg0 == '™') {
			local27 = -103;
		} else if (arg0 == 'š') {
			local27 = -102;
		} else if (arg0 == '›') {
			local27 = -101;
		} else if (arg0 == 'œ') {
			local27 = -100;
		} else if (arg0 == 'ž') {
			local27 = -98;
		} else if (arg0 == 'Ÿ') {
			local27 = -97;
		} else {
			local27 = 63;
		}
		return local27;
	}
}
