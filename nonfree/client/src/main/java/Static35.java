import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "J")
	public static long aLong24;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Lclient!kea;")
	public static Class187 method465(@OriginalArg(0) int arg0) {
		@Pc(10) Class187 local10 = (Class187) Static366.aClass223_59.method5388((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static296.aClass176_75.method3994(arg0, 0);
		local10 = new Class187();
		if (local20 != null) {
			local10.method4460(new Class4_Sub11(local20));
		}
		local10.method4457();
		Static366.aClass223_59.method5394(local10, (long) arg0);
		return local10;
	}
}
