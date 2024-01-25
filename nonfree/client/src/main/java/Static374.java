import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!kg;")
	public static Class136 aClass136_9;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_92 = new Class11(45, 15);

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "[I")
	public static final int[] anIntArray1314 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
	public static void method5469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static24.anInt533 = arg0 - Static338.anInt3307;
		Static280.anInt4835 = arg1 - Static338.anInt3305;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!vc;IIZILclient!am;I)V")
	public static void method5470(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class9 arg5) {
		if (arg3) {
			Static290.aClass18_22.method4558((Static253.anInt4467 - Static290.aClass18_22.method4564()) / 2, (Static362.anInt6102 - Static290.aClass18_22.method4560()) / 2);
			Static242.aClass18_20.method4558((Static253.anInt4467 - Static242.aClass18_20.method4564()) / 2, 18);
		}
		arg5.method5054((Static195.aClass150_2 == Static275.aClass150_3 ? Static309.aClass32_83 : Static34.aClass32_17).method701(Static107.anInt2498), arg4, -1, Static362.anInt6102 / 2 - 26, Static253.anInt4467 / 2);
		@Pc(58) int local58 = Static362.anInt6102 / 2 - 18;
		arg0.method1955(Static253.anInt4467 / 2 - 152, local58, 304, 34, arg2, 0);
		arg0.method1955(Static253.anInt4467 / 2 - 151, local58 + 1, 302, 32, 0, 0);
		arg0.method1982(Static253.anInt4467 / 2 - 150, local58 + 2, Static30.anInt644 * 3, 30, arg1, 0);
		arg0.method1982(Static253.anInt4467 / 2 + Static30.anInt644 * 3 - 150, local58 - -2, 300 - Static30.anInt644 * 3, 30, 0, 0);
		arg5.method5054(Static243.aString50, arg4, -1, Static362.anInt6102 / 2 + 4, Static253.anInt4467 / 2);
	}
}
