import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "Lclient!el;")
	public static final Class109 aClass109_213 = new Class109(97, 6);

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIII)V")
	public static void method8764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg0) {
			Static646.method7025(Static569.anIntArrayArray54[arg3], arg1, arg0, arg2);
		} else {
			Static646.method7025(Static569.anIntArrayArray54[arg3], arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)I")
	public static int method8770() {
		@Pc(7) int local7 = Static279.aClass146_22.method2859();
		if (Static297.aClass146Array1.length - 1 > local7) {
			Static279.aClass146_22 = Static297.aClass146Array1[local7 + 1];
		}
		return 100;
	}
}
