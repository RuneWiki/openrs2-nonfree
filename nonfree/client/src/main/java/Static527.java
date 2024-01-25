import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!ud", name = "Y", descriptor = "[Lclient!gg;")
	public static Class118[] aClass118Array1;

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
	public static int anInt8735 = -1;

	@OriginalMember(owner = "client!ud", name = "kb", descriptor = "Z")
	public static boolean aBoolean640 = false;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z")
	public static boolean method7212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V")
	public static void method7213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static487.anInt8210 <= arg0 && arg0 <= Static278.anInt5111) {
			@Pc(23) int local23 = Static468.method6610(arg2, Static126.anInt6658, Static494.anInt8295);
			@Pc(29) int local29 = Static468.method6610(arg1, Static126.anInt6658, Static494.anInt8295);
			Static503.method6992(arg0, local29, local23, arg3);
		}
	}
}
