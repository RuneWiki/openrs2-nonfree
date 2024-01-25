import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "J")
	public static long aLong138;

	// $FF: synthetic field
	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Ljava/lang/Class;")
	private static Class aClass12;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIZ)Z")
	public static boolean method4150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Interface23 local9 = (Interface23) Static593.method8225(arg1, arg2, arg0);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static532.method7633(local9) & true;
		}
		local9 = (Interface23) Static122.method2204(arg1, arg2, arg0, aClass12 == null ? (aClass12 = Class164.a("rt")) : aClass12);
		if (local9 != null) {
			local11 &= Static532.method7633(local9);
		}
		local9 = (Interface23) Static64.method787(arg1, arg2, arg0);
		if (local9 != null) {
			local11 &= Static532.method7633(local9);
		}
		return local11;
	}
}
