import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
	public static int anInt5279 = -1;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
	public static int anInt5282 = -1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIBII)Lclient!ud;")
	public static Class59 method4215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg5 * 475427L ^ (long) arg0 * 97549L ^ (long) arg3 * 67481L ^ (long) arg2 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg1 * 76724863L;
		@Pc(44) Class59 local44 = (Class59) Static365.aClass77_47.method1387(local38);
		if (local44 == null) {
			local44 = Static424.aClass117_11.method5724(arg3, arg0, arg5, arg2, arg4, arg1);
			Static365.aClass77_47.method1396(local44, local38);
			return local44;
		} else {
			return local44;
		}
	}
}
