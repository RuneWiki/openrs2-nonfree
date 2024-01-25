import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!gja", name = "n", descriptor = "Lclient!uq;")
	public static Class362 aClass362_43;

	@OriginalMember(owner = "client!gja", name = "m", descriptor = "I")
	public static int anInt3562 = 0;

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIIII)V")
	public static void method3043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static300.anInt5091 && Static629.anInt10412 >= arg1) {
			@Pc(15) int local15 = Static166.method2620(arg0, Static229.anInt4089, Static617.anInt6260);
			@Pc(21) int local21 = Static166.method2620(arg2, Static229.anInt4089, Static617.anInt6260);
			Static470.method6243(arg3, local15, local21, arg1);
		}
	}
}
