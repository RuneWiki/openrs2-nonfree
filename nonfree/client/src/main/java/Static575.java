import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static575 {

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
	public static int anInt9390;

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
	public static int anInt9387 = 0;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
	public static int anInt9389 = -1;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIII)V")
	public static void method7933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static106.anInt2266 && Static669.anInt10712 >= arg0 && Static639.anInt10384 <= arg2 && Static496.anInt8305 >= arg3) {
			Static669.method8904(arg1, arg3, arg4, arg0, arg2);
		} else {
			Static309.method4868(arg1, arg0, arg2, arg3, arg4);
		}
	}
}
