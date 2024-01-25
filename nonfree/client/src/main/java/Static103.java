import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)Lclient!af;")
	public static Class6 method1622(@OriginalArg(1) int arg0) {
		@Pc(10) Class6 local10 = (Class6) Static313.aClass129_52.method3023((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static92.aClass188_30.method4283(0, arg0);
		local10 = new Class6();
		if (local20 != null) {
			local10.method147(new Class2_Sub20(local20));
		}
		local10.method148();
		Static313.aClass129_52.method3029(local10, (long) arg0);
		return local10;
	}
}
