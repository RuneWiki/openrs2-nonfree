import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "Lclient!qs;")
	public static Class211 aClass211_11;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)Lclient!gn;")
	public static Class1_Sub1_Sub9 method719(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub9 local10 = (Class1_Sub1_Sub9) Static96.aClass215_2.method4926((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static10.aClass211_91.method4758(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static280.method4118(local20);
			Static96.aClass215_2.method4925(local10, (long) arg0);
			return local10;
		}
	}
}
