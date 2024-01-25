import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	public static int anInt3580;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	public static int anInt3581;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "Lclient!ft;")
	public static Class88 aClass88_32 = new Class88();

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
	public static int anInt3583 = 0;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
	public static int anInt3584 = 0;

	@OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
	public static int anInt3586 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[ILclient!bl;IZI)Lclient!js;")
	public static Class40_Sub3_Sub1 method3208(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class28_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean47 || Static220.method3379(arg2) && Static220.method3379(arg3)) {
			return new Class40_Sub3_Sub1(arg1, 3553, arg2, arg3, false, arg0);
		} else if (arg1.aBoolean40) {
			return new Class40_Sub3_Sub1(arg1, 34037, arg2, arg3, false, arg0);
		} else {
			return new Class40_Sub3_Sub1(arg1, arg2, arg3, Static420.method5696(arg2), Static420.method5696(arg3), arg0);
		}
	}

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)V")
	public static void method3210() {
		if (Static389.anInt6472 != -1) {
			Static96.method1661(Static389.anInt6472, false, -1, -1);
			Static389.anInt6472 = -1;
		}
	}
}
