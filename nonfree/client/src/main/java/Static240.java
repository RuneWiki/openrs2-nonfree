import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
	public static int anInt4008;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "Lclient!dp;")
	public static Class53 aClass53_101;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "[Lclient!hs;")
	public static Class6_Sub17_Sub1[] aClass6_Sub17_Sub1Array4;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
	public static int anInt4010 = 0;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
	public static void method3872(@OriginalArg(0) int arg0) {
		if (Static197.anIntArray568 == null || Static197.anIntArray568.length < arg0) {
			Static197.anIntArray568 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V")
	public static void method3873() {
		Static297.aClass108_31.method2909();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)I")
	public static int method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
