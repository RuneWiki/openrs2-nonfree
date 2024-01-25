import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hv", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[32];

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)Lclient!hv;")
	public static Class26_Sub3 method3660(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Static478.anInt8049 == Static69.anInt1428) {
			return new Class26_Sub3(arg0, arg1);
		} else {
			@Pc(6) Class26_Sub3 local6 = Static181.aClass26_Sub3Array1[Static69.anInt1428];
			Static69.anInt1428 = Static69.anInt1428 + 1 & Static416.anIntArray597[Static400.anInt6962];
			local6.method3666(arg0, arg1);
			return local6;
		}
	}
}
