import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	public static int anInt10017;

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "Z")
	public static boolean aBoolean739 = false;

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "[I")
	public static final int[] anIntArray643 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!kh;IZ)V")
	public static void method8523(@OriginalArg(0) Class208 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(19) int local19 = arg0.anInt5604 == 0 ? arg0.anInt5639 : arg0.anInt5604;
		@Pc(31) int local31 = arg0.anInt5649 == 0 ? arg0.anInt5630 : arg0.anInt5649;
		Static388.method5652(arg0.anInt5653, local19, local31, Static562.aClass208ArrayArray3[arg0.anInt5653 >> 16], arg1);
		if (arg0.aClass208Array20 != null) {
			Static388.method5652(arg0.anInt5653, local19, local31, arg0.aClass208Array20, arg1);
		}
		@Pc(64) Class3_Sub28 local64 = (Class3_Sub28) Static222.aClass62_21.method1682((long) arg0.anInt5653);
		if (local64 != null) {
			Static194.method5131(local64.anInt5252, local31, arg1, local19);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public static void method8525() {
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub19_2, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub19_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub11_2, 2);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub11_1, 2);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub23_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub22_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub24_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub10_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub29_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub12_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub21_1, 2);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub2_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub5_1, 2);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub27_1, 1);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub17_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub17_2, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub1_1, 2);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub14_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub28_1, 0);
		Static270.method4313();
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub8_1, 0);
		Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub13_1, 4);
		Static260.method4105();
		Static225.method3512();
		Static515.aBoolean646 = true;
	}
}
