import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
	public static int anInt2786;

	@OriginalMember(owner = "client!gm", name = "O", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!gm", name = "L", descriptor = "Lclient!di;")
	public static final Class54 aClass54_42 = new Class54(32, 3);

	@OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
	public static final int anInt2791 = -1;

	@OriginalMember(owner = "client!gm", name = "P", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[5];

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "(II)V")
	public static void method2208(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub5_Sub13 local12 = Static208.method3306(arg0, 14);
		local12.method4545();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IC)B")
	public static byte method2210(@OriginalArg(1) char arg0) {
		@Pc(30) byte local30;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
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

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V")
	public static void method2211() {
		if (Static162.anInt3250 == 10) {
			Static365.method4986(28);
		}
		if (Static162.anInt3250 == 30) {
			Static365.method4986(25);
		}
	}
}
