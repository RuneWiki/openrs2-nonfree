import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static195 {

	@OriginalMember(owner = "client!ld", name = "Kc", descriptor = "I")
	public static int anInt3565;

	@OriginalMember(owner = "client!ld", name = "Mc", descriptor = "I")
	public static int anInt3566;

	@OriginalMember(owner = "client!ld", name = "zc", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_25 = new Class154(4);

	@OriginalMember(owner = "client!ld", name = "Fc", descriptor = "I")
	public static int anInt3560 = 0;

	@OriginalMember(owner = "client!ld", name = "Lc", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_107 = new Class41(69, 4);

	@OriginalMember(owner = "client!ld", name = "Nc", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_108 = new Class41(47, 8);

	@OriginalMember(owner = "client!ld", name = "Oc", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!ld", name = "Pc", descriptor = "I")
	public static int anInt3567 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIII)V")
	public static void method3257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg1) {
			Static219.method3703(arg0, arg2, arg1, arg3);
		} else if (arg2 - arg1 >= Static332.anInt5823 && Static202.anInt3722 >= arg1 + arg2 && Static313.anInt5542 <= arg3 - arg4 && Static345.anInt6084 >= arg4 + arg3) {
			Static253.method4973(arg3, arg1, arg4, arg2, arg0);
		} else {
			Static7.method243(arg0, arg1, arg4, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "(I)I")
	public static int method3259() {
		return 6;
	}
}
