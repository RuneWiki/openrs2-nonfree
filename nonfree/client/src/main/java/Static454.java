import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static454 {

	@OriginalMember(owner = "client!rw", name = "K", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!rw", name = "L", descriptor = "I")
	public static int anInt8396 = 0;

	@OriginalMember(owner = "client!rw", name = "Q", descriptor = "I")
	public static int anInt8400 = 0;

	@OriginalMember(owner = "client!rw", name = "T", descriptor = "Z")
	public static boolean aBoolean623 = false;

	@OriginalMember(owner = "client!rw", name = "U", descriptor = "I")
	public static int anInt8403 = -1;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!rt;I)V")
	public static void method7033(@OriginalArg(0) Class6_Sub42 arg0) {
		if (!Static218.aBoolean366) {
			arg0.method8151();
			Static205.anInt4369--;
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(IIB)V")
	public static void method7036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static303.aClass162_2 == Static38.aClass162_1) {
			if (!Static21.method864(1, 1, arg0, 0, 0, -2, arg1, false)) {
				Static21.method864(1, 1, arg0, 0, 0, -3, arg1, false);
			}
		} else if (!Static21.method864(1, 1, arg0, 0, 0, -3, arg1, false)) {
			Static21.method864(1, 1, arg0, 0, 0, -2, arg1, false);
		}
	}
}
