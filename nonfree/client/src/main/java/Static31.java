import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!da", name = "w", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "I")
	public static int anInt733 = 99;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "I")
	public static int anInt741 = -2;

	@OriginalMember(owner = "client!da", name = "B", descriptor = "I")
	public static int anInt742 = 0;

	@OriginalMember(owner = "client!da", name = "I", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_335 = Static187.method3089("(U5");

	@OriginalMember(owner = "client!da", name = "K", descriptor = "I")
	public static int anInt748 = 0;

	@OriginalMember(owner = "client!da", name = "S", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_4 = new Class47(200);

	@OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
	public static int anInt759 = -1;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	public static void method572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static102.anInt2207 <= arg3 - arg2 && arg2 + arg3 <= Static116.anInt2488 && arg1 - arg2 >= Static118.anInt2521 && Static204.anInt2389 >= arg1 + arg2) {
			Static52.method904(arg5, arg4, arg0, arg1, arg3, arg2);
		} else {
			Static16.method742(arg2, arg0, arg5, arg3, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!ab;ZI)Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5 method573(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1) {
		return Static42.method736(arg1, 0, arg0) ? Static10.method192() : null;
	}
}
