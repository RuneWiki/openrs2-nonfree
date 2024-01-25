import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "[[[Lclient!bo;")
	public static Class37[][][] aClass37ArrayArrayArray1;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V")
	public static void method2479() {
		@Pc(7) Class125 local7 = Static218.aClass125_30;
		synchronized (Static218.aClass125_30) {
			Static218.aClass125_30.method3447(5);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIB)Z")
	public static boolean method2483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
