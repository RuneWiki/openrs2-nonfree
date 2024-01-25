import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!maa", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject11;

	@OriginalMember(owner = "client!maa", name = "L", descriptor = "Lclient!dda;")
	public static Class53 aClass53_83;

	@OriginalMember(owner = "client!maa", name = "O", descriptor = "Lclient!ib;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!maa", name = "w", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!maa", name = "x", descriptor = "I")
	public static final int anInt5335 = 2;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method4599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static106.method1964(arg4)) {
			if (Static196.aClass310ArrayArray1[arg4] == null) {
				Static218.method3455(arg3, arg2, arg1, arg6, arg0, Static235.aClass310ArrayArray2[arg4], arg7, -1, arg5);
			} else {
				Static218.method3455(arg3, arg2, arg1, arg6, arg0, Static196.aClass310ArrayArray1[arg4], arg7, -1, arg5);
			}
		} else if (arg6 == -1) {
			for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
				Static368.aBooleanArray32[local18] = true;
			}
		} else {
			Static368.aBooleanArray32[arg6] = true;
		}
	}
}
