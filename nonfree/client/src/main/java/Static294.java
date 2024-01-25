import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!t", name = "x", descriptor = "I")
	public static int anInt6361 = 2;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "I")
	public static int anInt6362 = 0;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
	public static void method5391() {
		@Pc(7) Class65[] local7 = Class13.aClass65Array1;
		synchronized (Class13.aClass65Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class13.aClass65Array1.length; local11++) {
				Class13.aClass65Array1[local11] = new Class65();
				Static329.anIntArray528[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII)Lclient!ke;")
	public static Class113 method5392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 32147369L ^ (long) arg3 * 475427L ^ (long) arg1 * 67481L ^ (long) arg5 * 97549L ^ (long) arg2 * 986053L ^ (long) arg0 * 76724863L;
		@Pc(43) Class113 local43 = (Class113) Static19.aClass198_8.method5242(local33);
		if (local43 == null) {
			local43 = Static235.aClass122_9.method4714(arg1, arg5, arg3, arg2, arg4, arg0);
			Static19.aClass198_8.method5231(local33, local43);
			return local43;
		} else {
			return local43;
		}
	}
}
