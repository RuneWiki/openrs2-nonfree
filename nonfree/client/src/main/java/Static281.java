import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!ic;")
	public static Class113 aClass113_86;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!wt;")
	public static final Class268 aClass268_94 = new Class268("", 16);

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray111 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	public static int anInt4403 = -1;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method3531() {
		Static2.aClass28_4.method617();
		Static139.aClass18_2.method391();
		Static221.aClass129_2.method2714();
		Static259.aClass95_3.method1826();
		Static304.aClass27_1.method591();
		Static227.aClass65_2.method1329();
		Static152.aClass213_1.method4413();
		Static44.aClass190_2.method4002();
		Static182.aClass205_1.method4219();
		Static183.aClass269_3.method5611();
		Static332.aClass174_1.method3495();
		Static330.aClass101_3.method2105();
		Static346.aClass135_3.method2793();
		Static85.aClass132_5.method2770();
		Static100.aClass108_1.method2213();
		Static128.aClass66_1.method1364();
		Static331.aClass238_1.method5004();
		Static337.aClass120_2.method2408();
		Static455.aClass52_2.method1181();
		Static120.aClass267_2.method5600();
		Static284.method3703();
		Static194.method2563();
		Static93.method1330();
		Static257.method5310();
		Static104.aClass167_99.method3384(5);
		Static322.aClass167_103.method3384(5);
		Static22.aClass167_5.method3384(5);
		Static390.aClass167_88.method3384(5);
		Static267.aClass167_64.method3384(5);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3533(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static360.anInt5990; local19++) {
			if (arg0.equalsIgnoreCase(Static43.aStringArray44[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static272.aStringArray37[local19])) {
				return true;
			}
		}
		return false;
	}
}
