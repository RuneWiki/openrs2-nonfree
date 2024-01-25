import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!pc;")
	public static Class188 aClass188_1;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_1 = new Class44(16, 8);

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_2 = new Class44(52, 6);

	@OriginalMember(owner = "client!a", name = "u", descriptor = "[I")
	public static int[] anIntArray1 = new int[1];

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	public static int anInt20 = -1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 128 || arg0 < 128 || Static81.anInt1950 * 128 - 256 < arg4 || arg0 > (Static171.anInt3288 - 2) * 128) {
			Static413.anIntArray483[0] = Static413.anIntArray483[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static66.method1200(arg3, arg4, arg0) - arg2;
		Static416.aClass102_5.ZA(arg5, 0, 0);
		Static387.aClass26_9.m(Static416.aClass102_5);
		Static387.aClass26_9.ia(arg4, local49, arg0, Static413.anIntArray483);
		Static416.aClass102_5.ZA(-arg5, 0, 0);
		Static387.aClass26_9.m(Static416.aClass102_5);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!pc;Z)V")
	public static void method3(@OriginalArg(0) Class188 arg0) {
		Static36.anInt846 = 0;
		Static352.anInt7236 = 0;
		Static384.aClass184_7 = new Class184();
		Static347.aClass38_Sub2_Sub1_Sub1Array2 = new Class38_Sub2_Sub1_Sub1[1024];
		Static435.method5888(arg0);
		Static397.method5450(arg0);
	}
}
