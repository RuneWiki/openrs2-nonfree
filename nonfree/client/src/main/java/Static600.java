import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static600 {

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "F")
	public static float aFloat222;

	@OriginalMember(owner = "client!vfa", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ILclient!ufa;ILclient!ka;BI)V")
	public static void method6708(@OriginalArg(0) int arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class128 arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			arg1.method7990(arg3.EA(), arg3.G(), arg3.HA(), arg2, arg3.RA(), arg3.na(), arg4, arg0, arg3.V(), arg3.fa());
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZZ)V")
	public static void method6709(@OriginalArg(1) boolean arg0) {
		if (Static99.aClass348_1 == null) {
			Static573.method8006();
		}
		if (arg0) {
			Static99.aClass348_1.method8108();
		}
	}
}
