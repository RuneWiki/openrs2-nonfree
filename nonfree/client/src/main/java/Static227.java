import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static227 {

	@OriginalMember(owner = "client!gw", name = "m", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIILclient!ka;)Lclient!dfa;")
	public static Class68 method3546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class157 arg3) {
		return arg3 == null ? null : new Class68(arg1, arg2, arg0, arg3.na(), arg3.V(), arg3.RA(), arg3.fa(), arg3.EA(), arg3.HA(), arg3.G());
	}
}
