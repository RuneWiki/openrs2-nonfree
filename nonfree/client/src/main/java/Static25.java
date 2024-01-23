import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!c", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString37 = "level: ";

	@OriginalMember(owner = "client!c", name = "I", descriptor = "I")
	public static int anInt620 = 2;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "I")
	public static int anInt621 = 5063219;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	public static void method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static283.aClass1_Sub11_Sub1_3.method2697(117);
			Static283.aClass1_Sub11_Sub1_3.method2655(5);
		}
		if (arg2 == 1) {
			Static283.aClass1_Sub11_Sub1_3.method2697(235);
			Static283.aClass1_Sub11_Sub1_3.method2655(19);
		}
		Static283.aClass1_Sub11_Sub1_3.method2645(Static175.aBooleanArray34[82] ? 1 : 0);
		Static283.aClass1_Sub11_Sub1_3.method2640(Static53.anInt5288 + arg1);
		Static283.aClass1_Sub11_Sub1_3.method2677(Static83.anInt1875 + arg0);
		Static45.anInt1101 = arg1;
		Static44.anInt1074 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(B)V")
	public static void method524() {
		Static146.method2566();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static88.aClass92Array1[local8].method2576();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIBI)V")
	public static void method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(17) int local17 = arg3; local17 <= arg4; local17++) {
			Static126.method1523(Static22.anIntArrayArray3[local17], arg1, arg0, arg2);
		}
	}
}
