import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "[Lclient!jd;")
	public static Class20[] aClass20Array1;

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
	public static int anInt964 = -1;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)Lclient!lu;")
	public static Class223 method825(@OriginalArg(1) int arg0) {
		@Pc(10) Class223 local10 = (Class223) Static12.aClass264_2.method6367((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static607.aClass386_51.method9196(arg0, 0);
		local10 = new Class223();
		if (local20 != null) {
			local10.method5323(new Class14_Sub29(local20));
		}
		local10.method5320();
		Static12.aClass264_2.method6364((long) arg0, local10);
		return local10;
	}
}
