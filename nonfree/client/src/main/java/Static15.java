import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
	public static int anInt5890;

	@OriginalMember(owner = "client!aha", name = "m", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!aha", name = "i", descriptor = "Lclient!he;")
	public static final Class128 aClass128_18 = new Class128(8);

	@OriginalMember(owner = "client!aha", name = "j", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_103 = new Class268(45, -1);

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(IZ)V")
	public static void method5156(@OriginalArg(0) int arg0) {
		Static265.anInt3619 = arg0;
		Static292.aClass166_29.method4811();
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)V")
	public static void method5158(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub2_Sub9 local16 = Static144.method2332(9, arg0);
		local16.method3722();
	}
}
