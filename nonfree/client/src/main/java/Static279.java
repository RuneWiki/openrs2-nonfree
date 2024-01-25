import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
	public static int anInt4790;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
	public static int anInt4791;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
	public static int anInt4788 = -50;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "[S")
	public static final short[] aShortArray93 = new short[] { 60, 12, 44, 20, 49, 30, 19, 6 };

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZI)I")
	public static int method4023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static66.method1100(arg1 - 1, arg0 + -1) + Static66.method1100(arg1 - 1, arg0 + 1) + Static66.method1100(arg1 - -1, arg0 + -1) + Static66.method1100(arg1 + 1, arg0 - -1);
		@Pc(73) int local73 = Static66.method1100(arg1, arg0 - 1) + Static66.method1100(arg1, arg0 + 1) + Static66.method1100(arg1 + -1, arg0) + Static66.method1100(arg1 + 1, arg0);
		@Pc(78) int local78 = Static66.method1100(arg1, arg0);
		return local73 / 8 + local39 / 16 + local78 / 4;
	}
}
