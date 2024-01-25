import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!up", name = "t", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!up", name = "N", descriptor = "I")
	public static int anInt9543;

	@OriginalMember(owner = "client!up", name = "Z", descriptor = "F")
	public static float aFloat197;

	@OriginalMember(owner = "client!up", name = "L", descriptor = "Z")
	public static boolean aBoolean769 = false;

	@OriginalMember(owner = "client!up", name = "db", descriptor = "[I")
	public static final int[] anIntArray756 = new int[32];

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Lclient!se;")
	public static Class313 method8185(@OriginalArg(1) int arg0) {
		@Pc(10) Class313 local10 = (Class313) Static193.aClass293_21.method6921((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static141.aClass384_38.method8885(1, arg0);
		local10 = new Class313();
		local10.anInt8623 = arg0;
		if (local20 != null) {
			local10.method7418(new Class5_Sub12(local20));
		}
		local10.method7419();
		if (local10.anInt8618 == 2 && Static242.aClass81_37.method1599((long) arg0) == null) {
			Static242.aClass81_37.method1607(new Class5_Sub41(Static480.anInt3807), (long) arg0);
			Static36.aClass313Array1[Static480.anInt3807++] = local10;
		}
		Static193.aClass293_21.method6925((long) arg0, local10);
		return local10;
	}
}
