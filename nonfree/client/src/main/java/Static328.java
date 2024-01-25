import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
	public static int anInt9771;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
	public static int anInt9773;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "D")
	public static double aDouble25;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "Lclient!mf;")
	public static Class203 aClass203_5;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
	public static int anInt9768 = 765;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_109 = new Class257(38, 7);

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "[I")
	public static final int[] anIntArray541 = new int[64];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method7891() {
		Static272.aClass236_51.method6253();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([[F[[SI)[[S")
	public static short[][] method7892(@OriginalArg(0) float[][] arg0, @OriginalArg(1) short[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < arg1[local7].length; local11++) {
				arg1[local7][local11] = (short) (arg0[local7][local11] * 16383.0F);
			}
		}
		return arg1;
	}
}
