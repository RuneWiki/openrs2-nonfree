import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "[I")
	public static int[] anIntArray564;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!qc;")
	public static Class143 aClass143_1;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString195 = "Allocating memory";

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Lclient!ti;")
	public static Class172 method4409(@OriginalArg(0) int arg0) {
		@Pc(10) Class172 local10 = (Class172) Static137.aClass98_18.method2570((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32 = Static277.aClass155_115.method4121(Static45.method686(arg0), Static274.method4501(arg0));
		local10 = new Class172();
		if (local32 != null) {
			local10.method4419(new Class3_Sub26(local32));
		}
		Static137.aClass98_18.method2568(local10, (long) arg0);
		return local10;
	}
}
