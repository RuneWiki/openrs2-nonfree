import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!uca", name = "t", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_117 = new Class179(69, 0);

	@OriginalMember(owner = "client!uca", name = "z", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_118 = new Class179(84, -1);

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLclient!vj;I)V")
	public static void method7770(@OriginalArg(1) Class2_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (Static363.aClass254_9 == null) {
			return;
		}
		try {
			Static363.aClass254_9.method5500(0L);
			Static363.aClass254_9.method5510(24, arg1, arg0.aByteArray115);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(FFFI)F")
	public static float method7771(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 * (arg2 - arg1) + arg1;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([[SB[[F)[[S")
	public static short[][] method7773(@OriginalArg(0) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < arg0[local12].length; local16++) {
				arg0[local12][local16] = (short) (arg1[local12][local16] * 16383.0F);
			}
		}
		return arg0;
	}
}
