import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!en", name = "l", descriptor = "I")
	public static int anInt1505;

	@OriginalMember(owner = "client!en", name = "M", descriptor = "[B")
	public static final byte[] aByteArray9 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!en", name = "jb", descriptor = "[I")
	public static final int[] anIntArray113 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBILclient!ii;II)V")
	public static void method1265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class105 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.method4268(arg0, arg4, arg0 + arg1, arg4 + arg3);
		arg2.method4225(arg3, -16777216, arg1, arg0, arg4);
		if (Static132.anInt6774 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static150.anInt2636 / (float) Static150.anInt2639;
		@Pc(36) int local36 = arg1;
		@Pc(38) int local38 = arg3;
		if (local34 < 1.0F) {
			local38 = (int) ((float) arg1 * local34);
		} else {
			local36 = (int) ((float) arg3 / local34);
		}
		@Pc(65) int local65 = arg4 + (arg3 - local38) / 2;
		@Pc(74) int local74 = arg0 + (arg1 - local36) / 2;
		if (Static8.aClass8_1 == null || arg1 != Static8.aClass8_1.method4383() || Static8.aClass8_1.method4382() != arg3) {
			Static150.method2264(Static150.anInt2643, Static150.anInt2636 + Static150.anInt2638, Static150.anInt2639 + Static150.anInt2643, Static150.anInt2638, local74, local65, local74 + local36, local65 - -local38);
			Static150.method2254(arg2);
			Static8.aClass8_1 = arg2.method4228(local74, local65, local36, local38, false);
		}
		Static8.aClass8_1.method4393(local74, local65);
		@Pc(126) int local126 = local36 * Static136.anInt2697 / Static150.anInt2639;
		@Pc(132) int local132 = local38 * Static130.anInt4850 / Static150.anInt2636;
		@Pc(141) int local141 = local74 + Static260.anInt5344 * local36 / Static150.anInt2639;
		@Pc(156) int local156 = local65 + local38 - local38 * Static310.anInt6180 / Static150.anInt2636 - local132;
		@Pc(158) int local158 = -1996554240;
		if (Class10_Sub1_Sub1.lb == 1) {
			local158 = -1996488705;
		}
		arg2.method4249(local141, local156, local126, local132, local158, 1);
		arg2.method4275(local141, local156, local126, local132, local158, 0);
		if (Static284.anInt5720 <= 0) {
			return;
		}
		@Pc(203) int local203;
		if (anInt1505 <= 50) {
			local203 = anInt1505 * 5;
		} else {
			local203 = (100 - anInt1505) * 5;
		}
		for (@Pc(217) Class1_Sub29 local217 = (Class1_Sub29) Static150.aClass14_10.method302(); local217 != null; local217 = (Class1_Sub29) Static150.aClass14_10.method313()) {
			@Pc(224) Class74 local224 = Static298.method5215(local217.anInt4242);
			if (Static186.method3284(local224)) {
				@Pc(257) int local257;
				@Pc(268) int local268;
				if (local217.anInt4242 == Static289.anInt5793) {
					local257 = local36 * local217.anInt4238 / Static150.anInt2639 + local74;
					local268 = local65 + (Static150.anInt2636 - local217.anInt4245) * local38 / Static150.anInt2636;
					arg2.method4225(4, local203 << 24 | 0xFFFF00, 4, local257 - 2, local268 + -2);
				} else if (Static101.anInt1939 != -1 && Static101.anInt1939 == local224.anInt1727) {
					local257 = local36 * local217.anInt4238 / Static150.anInt2639 + local74;
					local268 = (Static150.anInt2636 - local217.anInt4245) * local38 / Static150.anInt2636 + local65;
					arg2.method4225(4, local203 << 24 | 0xFFFF00, 4, local257 - 2, local268 + -2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!lm;ILclient!lm;Lclient!lm;Lclient!lm;)V")
	public static void method1267(@OriginalArg(0) Class134 arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) Class134 arg2, @OriginalArg(4) Class134 arg3) {
		Static204.aClass134_154 = arg2;
		Static230.aClass134_110 = arg0;
		Static126.aClass134_56 = arg1;
		Static237.aClass134_112 = arg3;
		Static313.aClass163ArrayArray1 = new Class163[Static237.aClass134_112.method3016()][];
		Static168.aBooleanArray17 = new boolean[Static237.aClass134_112.method3016()];
	}
}
