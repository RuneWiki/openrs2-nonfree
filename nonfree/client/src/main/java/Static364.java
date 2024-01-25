import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!np", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	public static int anInt6128 = 0;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!rg;B)V")
	public static void method5140(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub2_Sub1_Sub4 arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (Static532.anInt8757 < arg1.anInt8369) {
			Static177.method2286(arg1);
		} else if (arg1.anInt8412 >= Static532.anInt8757) {
			Static395.method7736(arg1);
		} else {
			Static70.method1161(arg1, false);
			local11 = Static138.anInt2256;
			local13 = Static142.anInt5305;
		}
		if (arg1.anInt9374 < 512 || arg1.anInt9375 < 512 || arg1.anInt9374 >= (Static281.anInt4822 - 1) * 512 || Static29.anInt491 * 512 - 512 <= arg1.anInt9375) {
			local11 = -1;
			local13 = 0;
			arg1.anInt8394 = -1;
			arg1.anInt8366 = -1;
			arg1.anIntArray558 = null;
			arg1.anInt8370 = -1;
			arg1.anInt8412 = 0;
			arg1.anInt8369 = 0;
			arg1.anInt9374 = arg1.anIntArray566[0] * 512 + arg1.method6777() * 256;
			arg1.anInt9375 = arg1.anIntArray565[0] * 512 + arg1.method6777() * 256;
			arg1.method6773();
		}
		if (arg1 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 && (arg1.anInt9374 < 6144 || arg1.anInt9375 < 6144 || arg1.anInt9374 >= (Static281.anInt4822 - 12) * 512 || (Static29.anInt491 - 12) * 512 <= arg1.anInt9375)) {
			local13 = 0;
			arg1.anIntArray558 = null;
			local11 = -1;
			arg1.anInt8394 = -1;
			arg1.anInt8412 = 0;
			arg1.anInt8369 = 0;
			arg1.anInt8366 = -1;
			arg1.anInt8370 = -1;
			arg1.anInt9374 = arg1.anIntArray566[0] * 512 + arg1.method6777() * 256;
			arg1.anInt9375 = arg1.anIntArray565[0] * 512 + arg1.method6777() * 256;
			arg1.method6773();
		}
		@Pc(218) int local218 = Static327.method4750(arg1);
		Static397.method5451(arg1);
		Static508.method6606(arg1, local11, local13, local218);
		Static245.method3481(local11, arg1);
		Static236.method3368(arg1);
	}
}
