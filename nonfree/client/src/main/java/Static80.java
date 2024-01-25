import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	public static void method1869() {
		if (!Static613.aBoolean716) {
			Static613.aBoolean716 = true;
			Static83.aFloat69 += (12.0F - Static83.aFloat69) / 2.0F;
			Static395.aBoolean521 = true;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIII)V")
	public static void method1870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg4) {
			Static562.method8099(arg0, arg4, arg1, arg3);
		} else if (Static630.anInt10099 <= arg0 - arg4 && arg4 + arg0 <= Static16.anInt4339 && Static11.anInt9803 <= arg3 - arg2 && arg3 + arg2 <= Static149.anInt2949) {
			Static410.method6505(arg1, arg4, arg2, arg0, arg3);
		} else {
			Static144.method2652(arg0, arg3, arg4, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public static void method1871() {
		@Pc(5) Class102 local5 = Static236.aClass102_26;
		synchronized (Static236.aClass102_26) {
			Static236.aClass102_26.method2680();
		}
	}
}
