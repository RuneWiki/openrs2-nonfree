import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static565 {

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
	public static int anInt9605;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
	public static int anInt9609;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
	public static int anInt9608 = 0;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBIII)V")
	public static void method7952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static472.anInt6105 <= arg0 - arg2 && arg2 + arg0 <= Static202.anInt4720 && Static246.anInt5506 <= arg3 - arg2 && Static583.anInt9761 >= arg3 + arg2) {
			Static464.method6947(arg0, arg3, arg2, arg1);
		} else {
			Static474.method7018(arg3, arg0, arg2, arg1);
		}
	}
}
