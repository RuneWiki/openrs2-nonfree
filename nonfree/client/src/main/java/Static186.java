import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_115 = new Class263(51, 6);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)Lclient!ug;")
	public static Class86 method3804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 76724863L ^ (long) arg2 * 32147369L ^ (long) arg3 * 475427L ^ (long) arg0 * 97549L ^ (long) arg1 * 67481L ^ (long) arg4 * 986053L;
		@Pc(39) Class86 local39 = (Class86) Static4.aClass91_1.method1988(local33);
		if (local39 == null) {
			local39 = Static194.aClass106_7.method5929(arg1, arg0, arg3, arg4, arg2, arg5);
			Static4.aClass91_1.method1990(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}
}
