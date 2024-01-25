import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
	public static final int[] anIntArray61 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	public static int anInt1411 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)V")
	public static void method1374() {
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub19_2, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub19_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub11_2, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub11_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub23_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub27_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub22_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub24_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub10_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub29_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub21_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub12_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub2_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub5_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub17_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub17_2, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub1_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub14_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub28_1, 0);
		Static270.method4313();
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub8_1, 2);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub13_1, 1);
		Static260.method4105();
		Static225.method3512();
		Static515.aBoolean646 = true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1375(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) - (local10 - Static560.method7658(arg0.charAt(local17)));
		}
		return local10;
	}
}
