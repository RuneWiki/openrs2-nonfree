import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_68 = new Class133(13, -1);

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_52 = new Class67("K", "T", "K", "K");

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!qf;B)Lclient!qf;")
	public static Class245 method3128(@OriginalArg(0) Class245 arg0) {
		@Pc(6) Class245 local6 = Static63.method1280(arg0);
		if (local6 == null) {
			local6 = arg0.aClass245_13;
		}
		return local6;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)Z")
	public static boolean method3129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
