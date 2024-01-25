import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static555 {

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	public static int anInt8748;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public static int anInt8749;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "[I")
	public static int[] anIntArray633;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBII)V")
	public static void method7745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1003) {
			Static484.method6918(Static269.aClass286_6, arg0, arg1);
		} else if (arg2 == 1011) {
			Static484.method6918(Static481.aClass286_10, arg0, arg1);
		} else if (arg2 == 1004) {
			Static484.method6918(Static447.aClass286_8, arg0, arg1);
		} else if (arg2 == 1008) {
			Static484.method6918(Static184.aClass286_4, arg0, arg1);
		} else if (arg2 == 1006) {
			Static484.method6918(Static549.aClass286_12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!caa;)V")
	public static void method7748(@OriginalArg(0) Class52 arg0) {
		Static655.aClass52_3 = arg0;
	}
}
