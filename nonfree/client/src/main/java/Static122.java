import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "Lclient!ep;")
	public static Class93 aClass93_7 = null;

	@OriginalMember(owner = "client!ek", name = "J", descriptor = "Lclient!tq;")
	public static final Class305 aClass305_17 = new Class305(512);

	@OriginalMember(owner = "client!ek", name = "M", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_53 = new Class254(82, -1);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V")
	public static void method2409(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg1; local3++) {
			Static115.method2332(arg0, arg4, arg2, Static183.anIntArrayArray26[local3]);
		}
	}
}
