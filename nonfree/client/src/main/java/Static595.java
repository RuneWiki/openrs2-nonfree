import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_181 = new Class298(28, 0);

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_273 = new Class272(64, 2);

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "Lclient!ph;")
	public static final Class260 aClass260_14 = new Class260(3, 2);

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "[C")
	public static final char[] aCharArray12 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray49 = new String[200];

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "[I")
	public static final int[] anIntArray702 = new int[3];

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIII)V")
	public static void method7810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static363.method5457(arg2, 11);
		local13.method839();
		local13.anInt1091 = arg1;
		local13.anInt1088 = arg0;
	}
}
