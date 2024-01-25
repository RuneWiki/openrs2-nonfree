import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_109 = new Class27(47, 3);

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!os;")
	public static final Class182 aClass182_256 = new Class182("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)Z")
	public static boolean method5935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static166.method2767(arg1, arg0)) {
			return Static279.method3941(arg0, arg1) | (arg0 & 0xB000) != 0 | Static258.method3720(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static90.method1690(arg0, arg1) | Static389.method5181(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)Lclient!qg;")
	public static Class30 method5938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(41) long local41 = (long) arg2 * 76724863L ^ (long) arg1 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg4 * 67481L ^ (long) arg5 * 97549L ^ (long) arg3 * 986053L;
		@Pc(47) Class30 local47 = (Class30) Static349.aClass267_62.method6014(local41);
		if (local47 == null) {
			local47 = Static56.aClass50_1.method5851(arg4, arg5, arg0, arg3, arg1, arg2);
			Static349.aClass267_62.method6008(local47, local41);
			return local47;
		} else {
			return local47;
		}
	}
}
