import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Lclient!nq;")
	public static Class144 aClass144_82;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "[Lclient!po;")
	public static Class158[] aClass158Array1;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "Lclient!ms;")
	public static Class137 aClass137_14;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ms;B)V")
	public static void method4217(@OriginalArg(0) Class137 arg0) {
		@Pc(9) Class137 local9 = Static34.method509(arg0);
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (local9 == null) {
			local20 = Static79.anInt5259;
			local23 = Static164.anInt3090;
		} else {
			local20 = local9.anInt4110;
			local23 = local9.anInt4060;
		}
		Static335.method5472(false, local20, local23, arg0);
		Static275.method4658(local20, arg0, local23);
	}
}
