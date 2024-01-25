import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!em", name = "o", descriptor = "J")
	public static long aLong61 = 0L;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "I")
	public static int anInt2918 = -1;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIII)Lclient!dn;")
	public static Class75 method2680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg1 * 32147369L ^ (long) arg3 * 986053L ^ (long) arg5 * 67481L ^ (long) arg2 * 97549L ^ (long) arg4 * 475427L ^ (long) arg0 * 76724863L;
		@Pc(39) Class75 local39 = (Class75) Static5.aClass223_1.method4943(local33);
		if (local39 == null) {
			local39 = Static249.aClass66_9.method6810(arg5, arg2, arg4, arg3, arg1, arg0);
			Static5.aClass223_1.method4938(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}
