import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static103 {

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	public static int anInt2070;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
	public static int anInt2066 = -1;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public static void method1813() {
		if (Static4.aClass19_34 != null) {
			Static4.aClass19_34.method4267();
			Static4.aClass19_34 = null;
			Static22.aClass46_4 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method1815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static354.anInt6186 <= arg0 - arg1 && Static208.anInt2656 >= arg1 + arg0 && Static376.anInt6287 <= arg3 - arg1 && Static168.anInt3256 >= arg1 + arg3) {
			Static306.method4134(arg4, arg1, arg0, arg5, arg2, arg3);
		} else {
			Static105.method1980(arg5, arg2, arg1, arg4, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public static void method1816() {
		Static407.anInt6710 = 0;
		Static206.aClass183_28.method4138();
		Static234.aBoolean411 = false;
	}
}
