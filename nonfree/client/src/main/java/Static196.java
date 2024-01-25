import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gr", name = "N", descriptor = "Lclient!sj;")
	public static Class10 aClass10_3;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "Lclient!hk;")
	public static Class155 aClass155_10;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "Lclient!da;")
	public static Class70 aClass70_3;

	@OriginalMember(owner = "client!gr", name = "B", descriptor = "Lclient!at;")
	public static final Class20 aClass20_11 = new Class20();

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3289(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub11 local10 = (Class5_Sub11) Static3.aClass306_1.method6943((long) arg0);
		if (local10 != null) {
			@Pc(17) Class5_Sub14_Sub1 local17 = local10.aClass275_Sub1_1.method6315();
			if (local17 != null) {
				@Pc(24) double local24 = local10.aClass275_Sub1_1.method6326();
				if ((double) local17.method1951() <= local24 && local24 <= (double) local17.method1956()) {
					return local17.method1954();
				}
			}
		}
		return null;
	}
}
