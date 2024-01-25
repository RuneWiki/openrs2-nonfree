import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!ae;")
	public static Class8 aClass8_56;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "D")
	public static double aDouble60;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	public static int anInt3188 = -1;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!lk;")
	public static final Class209 aClass209_13 = new Class209(8);

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "[I")
	public static final int[] anIntArray180 = new int[14];

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public static void method2662() {
		Static402.aClass9_27 = null;
		Static552.anInt9275 = -1;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method2664(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static289.aClass12Array3 == Static68.aClass12Array2) {
			return;
		}
		@Pc(10) int local10 = Static64.aClass12Array1[arg1].method7854(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class12 local23 = Static64.aClass12Array1[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7854(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}
}
