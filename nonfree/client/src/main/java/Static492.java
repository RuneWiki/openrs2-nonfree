import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!pj;")
	public static Class248 aClass248_95;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "I")
	public static int anInt8636;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!pj;")
	public static Class248 aClass248_96;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_12 = new Class179(0, 2, 2, 1);

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
	public static boolean aBoolean562 = false;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Z")
	public static boolean aBoolean563 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(CB)B")
	public static byte method6861(@OriginalArg(0) char arg0) {
		@Pc(29) byte local29;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local29 = (byte) arg0;
		} else if (arg0 == '€') {
			local29 = -128;
		} else if (arg0 == '‚') {
			local29 = -126;
		} else if (arg0 == 'ƒ') {
			local29 = -125;
		} else if (arg0 == '„') {
			local29 = -124;
		} else if (arg0 == '…') {
			local29 = -123;
		} else if (arg0 == '†') {
			local29 = -122;
		} else if (arg0 == '‡') {
			local29 = -121;
		} else if (arg0 == 'ˆ') {
			local29 = -120;
		} else if (arg0 == '‰') {
			local29 = -119;
		} else if (arg0 == 'Š') {
			local29 = -118;
		} else if (arg0 == '‹') {
			local29 = -117;
		} else if (arg0 == 'Œ') {
			local29 = -116;
		} else if (arg0 == 'Ž') {
			local29 = -114;
		} else if (arg0 == '‘') {
			local29 = -111;
		} else if (arg0 == '’') {
			local29 = -110;
		} else if (arg0 == '“') {
			local29 = -109;
		} else if (arg0 == '”') {
			local29 = -108;
		} else if (arg0 == '•') {
			local29 = -107;
		} else if (arg0 == '–') {
			local29 = -106;
		} else if (arg0 == '—') {
			local29 = -105;
		} else if (arg0 == '˜') {
			local29 = -104;
		} else if (arg0 == '™') {
			local29 = -103;
		} else if (arg0 == 'š') {
			local29 = -102;
		} else if (arg0 == '›') {
			local29 = -101;
		} else if (arg0 == 'œ') {
			local29 = -100;
		} else if (arg0 == 'ž') {
			local29 = -98;
		} else if (arg0 == 'Ÿ') {
			local29 = -97;
		} else {
			local29 = 63;
		}
		return local29;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method6862() {
		for (@Pc(15) Class6_Sub5_Sub17 local15 = (Class6_Sub5_Sub17) Static432.aClass298_162.method6809(); local15 != null; local15 = (Class6_Sub5_Sub17) Static432.aClass298_162.method6821()) {
			@Pc(20) Class15_Sub2_Sub6 local20 = local15.aClass15_Sub2_Sub6_1;
			if (local20.aBoolean509) {
				local15.method7948();
				local20.method6146();
			} else if (local20.anInt7718 <= Static363.anInt6671) {
				local20.method6143(Static415.anInt7409);
				if (local20.aBoolean509) {
					local15.method7948();
				} else {
					Static176.method7614(local20, true);
				}
			}
		}
	}
}
