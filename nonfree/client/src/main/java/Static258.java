import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "Lclient!ic;")
	public static Class113 aClass113_80;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "[I")
	public static final int[] anIntArray221 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
	public static int anInt4103 = -1;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	public static void method3270() {
		if (Static213.aClass128_22.method3594()) {
			Static213.aClass128_22.method3578(Static226.aCanvas9);
			Static283.method3696();
			Static213.aClass128_22.method3567(Static226.aCanvas9);
			Static213.aClass128_22.method3563(Static226.aCanvas9);
		} else {
			Static330.method4211(Static410.anInt6680);
		}
		Static183.method4174();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!wp;)Ljava/lang/String;")
	public static String method3272(@OriginalArg(1) Class1_Sub45 arg0) {
		return arg0.aString69 == null || arg0.aString69.length() <= 0 ? arg0.aString70 : arg0.aString70 + Static9.aClass151_11.method3122(Static188.anInt3028) + arg0.aString69;
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
	public static void method3273() {
		for (@Pc(8) int local8 = 0; local8 < Static353.anInt5858; local8++) {
			@Pc(14) Class98 local14 = Static104.aClass98Array2[local8];
			if (local14.aByte28 == 2) {
				if (local14.aClass1_Sub9_Sub1_1 == null) {
					local14.anInt2410 = Integer.MIN_VALUE;
				} else {
					Static155.aClass1_Sub9_Sub2_1.method1038(local14.aClass1_Sub9_Sub1_1);
				}
			}
		}
	}
}
