import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "[I")
	public static final int[] anIntArray774 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_131 = new Class252(58, 3);

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "Lclient!sc;")
	public static final Class263 aClass263_7 = new Class263();

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "Lclient!g;")
	public static final Class110 aClass110_22 = new Class110(1);

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IB)V")
	public static void method7717(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub16 local12 = Static422.method6588(1, arg0);
		local12.method6700();
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)V")
	public static void method7719() {
		Static216.method3997(Static427.aClass252_112);
		Static259.aClass1_Sub17_Sub2_1.method4451(Static226.method4065());
		Static259.aClass1_Sub17_Sub2_1.method4473(Static70.anInt1753);
		Static259.aClass1_Sub17_Sub2_1.method4473(Static508.anInt8910);
		Static259.aClass1_Sub17_Sub2_1.method4451(Static286.aClass1_Sub15_Sub1_1.anInt7032);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLclient!oj;)V")
	public static void method7720(@OriginalArg(1) Class46_Sub6 arg0) {
		arg0.aClass20_1 = null;
		@Pc(12) int local12 = arg0.aClass46_Sub1Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass46_Sub1Array1[local14].aBoolean109 = false;
		}
		@Pc(28) Class184[] local28 = Class20_Sub1_Sub1.aClass184Array3;
		synchronized (Class20_Sub1_Sub1.aClass184Array3) {
			if (Class20_Sub1_Sub1.aClass184Array3.length > local12 && Static117.anIntArray191[local12] < 200) {
				Class20_Sub1_Sub1.aClass184Array3[local12].method5142(arg0);
				@Pc(53) int local53 = Static117.anIntArray191[local12]++;
			}
		}
	}
}
