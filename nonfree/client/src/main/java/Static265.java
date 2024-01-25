import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Lclient!um;")
	public static Class243 aClass243_144;

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
	public static int anInt4221;

	@OriginalMember(owner = "client!mq", name = "D", descriptor = "I")
	public static int anInt4230;

	@OriginalMember(owner = "client!mq", name = "E", descriptor = "Lclient!um;")
	public static Class243 aClass243_145;

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIIII)V")
	public static void method3371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static3.anInt45 && arg0 <= Static112.anInt1900) {
			@Pc(18) int local18 = Static391.method5106(Static356.anInt5817, arg2, Static3.anInt46);
			@Pc(24) int local24 = Static391.method5106(Static356.anInt5817, arg1, Static3.anInt46);
			Static111.method1531(local24, arg3, arg0, local18);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(FBFF)F")
	public static float method3372(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 * (arg2 - arg0) + arg0;
	}
}
