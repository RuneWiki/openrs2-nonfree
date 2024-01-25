import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!es", name = "d", descriptor = "[I")
	public static int[] anIntArray144;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "Lclient!ln;")
	public static final Class216 aClass216_5 = new Class216(1, 2, 2, 0);

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
	public static void method2007() {
		if (Static306.anInt5334 <= 1) {
			Static97.aClass5_Sub25_8.method3683(2, Static97.aClass5_Sub25_8.aClass6_Sub15_1);
		} else {
			Static97.aClass5_Sub25_8.method3683(4, Static97.aClass5_Sub25_8.aClass6_Sub15_1);
		}
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
	public static void method2008() {
		Static102.aClass87_57.method1796();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([[F[[SB)[[S")
	public static short[][] method2009(@OriginalArg(0) float[][] arg0, @OriginalArg(1) short[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			for (@Pc(16) int local16 = 0; local16 < arg1[local7].length; local16++) {
				arg1[local7][local16] = (short) (arg0[local7][local16] * 16383.0F);
			}
		}
		return arg1;
	}
}
