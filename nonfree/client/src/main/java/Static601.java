import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static601 {

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "[I")
	public static int[] anIntArray534;

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_254 = new Class160(48, 3);

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "[C")
	public static final char[] aCharArray10 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8504(@OriginalArg(1) String arg0) {
		Static434.aString85 = arg0;
		Static340.anInt5803 = Static434.aString85.length();
	}
}
