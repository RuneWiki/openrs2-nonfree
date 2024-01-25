import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static520 {

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
	public static int anInt8959;

	@OriginalMember(owner = "client!sp", name = "F", descriptor = "J")
	public static long aLong224 = -1L;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIII)V")
	public static void method7714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static275.anInt4919 <= arg1 && arg4 <= Static529.anInt9089 && Static554.anInt9362 <= arg2 && arg3 <= Static62.anInt1300) {
			if (arg0 == 1) {
				Static551.method8047(arg5, arg1, arg2, arg4, arg3);
			} else {
				Static147.method2184(arg3, arg4, arg2, arg5, arg1, arg0);
			}
		} else if (arg0 == 1) {
			Static459.method6833(arg1, arg2, arg4, arg5, arg3);
		} else {
			Static100.method1625(arg0, arg5, arg4, arg2, arg1, arg3);
		}
	}
}
