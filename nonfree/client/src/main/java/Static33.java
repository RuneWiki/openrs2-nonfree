import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "[I")
	public static int[] anIntArray23;

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "Lclient!ri;")
	public static Class284 aClass284_13;

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "[Lclient!oj;")
	public static final Class3_Sub39[] aClass3_Sub39Array1 = new Class3_Sub39[1024];

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BILclient!ri;I)Lclient!ufa;")
	public static Class328 method484(@OriginalArg(2) Class284 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method6331(arg1, 0);
		return local9 == null ? null : new Class328(local9);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIII)Z")
	public static boolean method485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface14 local11 = (Interface14) Static597.method8185(arg2, arg1, arg0);
		if (local11 != null) {
			local5 = Static508.method6863(local11) & true;
		}
		local11 = (Interface14) Static13.method122(arg2, arg1, arg0, ofa.class);
		if (local11 != null) {
			local5 &= Static508.method6863(local11);
		}
		local11 = (Interface14) Static134.method2611(arg2, arg1, arg0);
		if (local11 != null) {
			local5 &= Static508.method6863(local11);
		}
		return local5;
	}
}
