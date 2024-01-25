import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!on", name = "d", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "I")
	public static int anInt6630 = 0;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "J")
	public static long aLong188 = 0L;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V")
	public static void method5693() {
		@Pc(9) int local9 = 0;
		if (Static278.aClass3_Sub13_Sub1_1.method4457(Static260.anInt4932)) {
			local9 = 55;
		}
		if (!Static278.aClass3_Sub13_Sub1_1.aBoolean410) {
			local9 |= 0x40;
		}
		Static429.method6075(local9);
		Static476.aClass69_5.method2184(local9);
		Static517.aClass145_1.method3790(local9);
		Static510.aClass284_2.method6279(local9);
		Static547.aClass248_2.method5704(local9);
		Static69.method1652(local9);
		Static377.method5579(local9);
		Static218.method3791(local9);
		Static472.method6499(local9);
		Static447.method6262();
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(III)I")
	public static int method5696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static485.anIntArray605[arg1 & 0x3] : Static477.anIntArray600[arg1 & 0x3];
	}
}
