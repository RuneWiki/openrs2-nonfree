import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public static int anInt5972;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "[I")
	public static int[] anIntArray437;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	public static int anInt5974 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	public static int anInt5975 = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!aq;IIIII)Lclient!vt;")
	public static Class125_Sub1_Sub1 method5209(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean76 || Static88.method1890(arg3) && Static88.method1890(arg4)) {
			return new Class125_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3, arg4, true);
		} else if (arg0.aBoolean70) {
			return new Class125_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3, arg4, true);
		} else {
			return new Class125_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, Static92.method1941(arg3), Static92.method1941(arg4), true);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5210(@OriginalArg(1) Class22 arg0) {
		Static169.aClass196Array1 = new Class196[Static690.anIntArray771.length];
		for (@Pc(11) int local11 = 0; local11 < Static690.anIntArray771.length; local11++) {
			@Pc(19) int local19 = Static690.anIntArray771[local11];
			@Pc(26) Class169 local26 = Static462.method6278(local19, Static725.aClass182_131);
			@Pc(34) Class57 local34 = arg0.method9353(local26, Static735.method8275(Static175.aClass182_46, local19), true);
			Static169.aClass196Array1[local11] = new Class196(local34, local26);
		}
		if (-1 != -1) {
			anInt5974 = 105;
		}
	}
}
