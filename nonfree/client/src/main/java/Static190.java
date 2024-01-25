import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array9;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "[Lclient!vk;")
	public static final Class239[] aClass239Array1 = new Class239[4];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZILclient!es;)V")
	public static void method3040(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub1_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(14) int local14 = 0;
		if (Static295.anInt5281 < arg1.anInt5372) {
			Static242.method3897(arg1);
		} else if (arg1.anInt5374 < Static295.anInt5281) {
			Static54.method1044(arg1, false);
			local7 = Static253.anInt5659;
			local14 = Static106.anInt2066;
		} else {
			Static28.method684(arg1);
		}
		if (arg1.anInt6328 < 128 || arg1.anInt6317 < 128 || arg1.anInt6328 >= Static392.anInt6751 * 128 - 128 || arg1.anInt6317 >= (Static307.anInt5484 - 1) * 128) {
			arg1.anInt5374 = 0;
			arg1.anInt5371 = -1;
			local14 = 0;
			local7 = -1;
			arg1.anInt5330 = -1;
			arg1.anInt5372 = 0;
			arg1.anInt6328 = arg1.anIntArray659[0] * 128 + arg1.method4706() * 64;
			arg1.anInt6317 = arg1.anIntArray658[0] * 128 + arg1.method4706() * 64;
			arg1.method4702();
		}
		if (arg1 == Static267.aClass12_Sub1_Sub2_Sub2_1 && (arg1.anInt6328 < 1536 || arg1.anInt6317 < 1536 || Static392.anInt6751 * 128 - 1536 <= arg1.anInt6328 || Static307.anInt5484 * 128 - 1536 <= arg1.anInt6317)) {
			arg1.anInt5371 = -1;
			arg1.anInt5330 = -1;
			arg1.anInt5372 = 0;
			local7 = -1;
			arg1.anInt5374 = 0;
			local14 = 0;
			arg1.anInt6328 = arg1.anIntArray659[0] * 128 + arg1.method4706() * 64;
			arg1.anInt6317 = arg1.anIntArray658[0] * 128 + arg1.method4706() * 64;
			arg1.method4702();
		}
		@Pc(204) int local204 = Static153.method2579(arg1);
		Static211.method3583(local14, local7, local204, arg1);
		Static351.method1595(arg1);
	}
}
