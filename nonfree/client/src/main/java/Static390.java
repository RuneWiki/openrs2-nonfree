import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V")
	public static void method6204() {
		if (Static43.aClass80_1 != null) {
			Static43.aClass80_1.method5601();
		}
		if (Static269.aClass80_3 != null) {
			Static269.aClass80_3.method5601();
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(FIFLclient!wfa;FIFII[BZIF)V")
	public static void method6205(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) float arg3, @OriginalArg(6) float arg4, @OriginalArg(8) int arg5, @OriginalArg(9) byte[] arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static342.method5570(arg7, arg3, arg4, arg2, arg0, arg5, arg6, local7, arg1);
			arg5 += 16384;
		}
	}
}
