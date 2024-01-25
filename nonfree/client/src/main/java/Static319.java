import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "Lclient!la;")
	public static Class35 aClass35_8;

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "S")
	public static short aShort52 = 320;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)Z")
	public static boolean method4852(@OriginalArg(0) int arg0) {
		return arg0 == 0;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIII)V")
	public static void method4853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static126.anInt6658 <= arg1 && arg1 <= Static494.anInt8295) {
			@Pc(15) int local15 = Static468.method6610(arg2, Static487.anInt8210, Static278.anInt5111);
			@Pc(21) int local21 = Static468.method6610(arg0, Static487.anInt8210, Static278.anInt5111);
			Static58.method1374(arg3, local21, local15, arg1);
		}
	}
}
