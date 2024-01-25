import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public static int anInt2072 = 0;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
	public static int anInt2078 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIII)Lclient!jia;")
	public static Class68 method2026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 32147369L ^ (long) arg1 * 986053L ^ (long) arg3 * 475427L ^ (long) arg4 * 97549L ^ (long) arg0 * 67481L ^ (long) arg2 * 76724863L;
		@Pc(47) Class68 local47 = (Class68) Static245.aClass352_57.method7653(local33);
		if (local47 == null) {
			local47 = Static449.aClass33_11.method8112(arg0, arg4, arg3, arg1, arg5, arg2);
			Static245.aClass352_57.method7655(local33, local47);
			return local47;
		} else {
			return local47;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
	public static boolean method2027(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public static void method2028() {
		for (@Pc(11) Class4_Sub34 local11 = (Class4_Sub34) Static255.aClass66_18.method1992(); local11 != null; local11 = (Class4_Sub34) Static255.aClass66_18.method1984()) {
			if (local11.aBoolean432) {
				local11.aBoolean432 = false;
			} else {
				Static343.method4655(local11.anInt5684);
			}
		}
	}
}
