import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static287 {

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
	public static int anInt5059 = 0;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "Z")
	public static boolean aBoolean389 = false;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
	public static int anInt5060 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)Z")
	public static boolean method4313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIII)V")
	public static void method4314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1012) {
			Static173.method2509(Static443.aClass354_17, arg0, arg1);
		} else if (arg2 == 1001) {
			Static173.method2509(Static401.aClass354_14, arg0, arg1);
		} else if (arg2 == 1011) {
			Static173.method2509(Static416.aClass354_22, arg0, arg1);
		} else if (arg2 == 1010) {
			Static173.method2509(Static554.aClass354_20, arg0, arg1);
		} else if (arg2 == 1006) {
			Static173.method2509(Static26.aClass354_4, arg0, arg1);
		}
	}
}
