import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
	public static int[] anIntArray333;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "[Lclient!nf;")
	public static Class102[] aClass102Array12;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public static int anInt5052;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_93 = new Class126(63, 5);

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
	public static final int[] anIntArray335 = new int[1];

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "F")
	public static float aFloat119 = 1.0F;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!fl;BBII)V")
	public static void method4282(@OriginalArg(0) Class23_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray659[0];
		@Pc(15) int local15 = arg0.anIntArray660[0];
		if (local10 < 0 || local10 >= Static251.anInt4680 || local15 < 0 || local15 >= Static406.anInt6924 || (arg2 < 0 || arg2 >= Static251.anInt4680 || arg1 < 0 || Static406.anInt6924 <= arg1)) {
			return;
		}
		@Pc(77) int local77 = Static398.method5728(0, arg0.method8625(), -4, arg1, local15, Static27.aClass198Array1[arg0.aByte142], true, arg2, Static437.anIntArray458, 0, Static207.anIntArray259, 0, local10, 0);
		if (local77 >= 1 && local77 <= 3) {
			for (@Pc(97) int local97 = 0; local97 < local77 - 1; local97++) {
				arg0.method2912((byte) 2, Static437.anIntArray458[local97], Static207.anIntArray259[local97]);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z[[F[[S)[[S")
	public static short[][] method4283(@OriginalArg(1) float[][] arg0, @OriginalArg(2) short[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			for (@Pc(14) int local14 = 0; local14 < arg1[local7].length; local14++) {
				arg1[local7][local14] = (short) (int) (arg0[local7][local14] * 16383.0F);
			}
		}
		return arg1;
	}
}
