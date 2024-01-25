import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static529 {

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "[S")
	public static short[] aShortArray141 = new short[256];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIILclient!dfa;Lclient!ka;I)V")
	public static void method7487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class68 arg3, @OriginalArg(4) Class157 arg4) {
		if (arg4 != null) {
			arg3.method1956(arg2, arg4.V(), arg0, arg4.fa(), arg4.HA(), arg1, arg4.G(), arg4.RA(), arg4.EA(), arg4.na());
		}
	}
}
