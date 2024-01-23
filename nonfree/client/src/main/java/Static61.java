import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString47 = "green:";

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIZBLclient!oj;)Lclient!ho;")
	public static Class3_Sub4_Sub12 method975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class131 arg5) {
		@Pc(20) int local20 = (arg2 << 19) + arg1 + (arg4 ? 65536 : 0) + (arg3 << 17);
		@Pc(33) long local33 = (long) arg0 * 3147483667L + (long) local20 * 3849834839L;
		@Pc(39) Class3_Sub4_Sub12 local39 = (Class3_Sub4_Sub12) Static280.aClass98_36.method2570(local33);
		if (local39 != null) {
			return local39;
		}
		Static16.aBoolean27 = false;
		local39 = Static67.method1037(false, arg5, arg4, arg1, false, arg0, arg3, arg2);
		if (local39 != null && !Static16.aBoolean27) {
			Static280.aClass98_36.method2568(local39, local33);
		}
		return local39;
	}
}
