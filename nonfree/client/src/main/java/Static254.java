import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static254 {

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "[I")
	public static final int[] anIntArray243 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIILclient!ha;II)V")
	public static void method4161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class5 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		arg2.method7528(arg3, arg0, arg4, arg1, -10660793);
		arg2.method7528(arg3 + 1, 16, arg4 - 2, arg1 - -1, -16777216);
		arg2.method7513(arg3 + 1, arg1 + 18, arg0 - 19, arg4 + -2, -16777216);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!ka;IILclient!ro;)V")
	public static void method4162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class297 arg4) {
		if (arg2 != null) {
			arg4.method7396(arg2.RA(), arg2.V(), arg2.EA(), arg2.na(), arg2.HA(), arg2.G(), arg0, arg2.fa(), arg3, arg1);
		}
	}
}
