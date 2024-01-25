import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static476 {

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
	public static int anInt8315;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ka;IIII)Lclient!ro;")
	public static Class297 method7143(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg0 == null ? null : new Class297(arg1, arg2, arg3, arg0.na(), arg0.V(), arg0.RA(), arg0.fa(), arg0.EA(), arg0.HA(), arg0.G());
	}
}
