import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static492 {

	@OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
	public static int anInt8385 = -1;

	@OriginalMember(owner = "client!rl", name = "Q", descriptor = "[Lclient!lu;")
	public static Class208[] aClass208Array1 = new Class208[50];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!ka;IB)Lclient!tb;")
	public static Class316 method7054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) int arg3) {
		return arg2 == null ? null : new Class316(arg0, arg3, arg1, arg2.na(), arg2.V(), arg2.RA(), arg2.fa(), arg2.EA(), arg2.HA(), arg2.G());
	}
}
