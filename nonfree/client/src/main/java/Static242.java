import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static242 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_70 = new Class183(36, 7);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!mi;)V")
	public static void method4282(@OriginalArg(0) int arg0, @OriginalArg(1) Class149 arg1) {
		Static128.aClass149Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)I")
	public static int method4284(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
