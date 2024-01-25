import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array11;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array12;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "[I")
	public static int[] anIntArray552;

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "Lclient!wt;")
	public static Class270 aClass270_2;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!go;)Lclient!go;")
	public static Class95 method4849(@OriginalArg(1) Class95 arg0) {
		@Pc(6) Class95 local6 = Static52.method738(arg0);
		if (local6 == null) {
			local6 = arg0.aClass95_6;
		}
		return local6;
	}
}
