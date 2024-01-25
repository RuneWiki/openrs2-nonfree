import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "Lclient!ac;")
	public static Class3 aClass3_4;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "Lclient!oq;")
	public static Class20_Sub3_Sub3_Sub1 aClass20_Sub3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_61 = new Class167(4);

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "[I")
	public static final int[] anIntArray204 = new int[14];

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
	public static int anInt3852 = 0;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
	public static int anInt3853 = 0;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZZ)V")
	public static void method3125(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static169.anInt2522 != -1) {
				Static199.method2715(Static169.anInt2522);
			}
			for (@Pc(19) Class1_Sub26 local19 = (Class1_Sub26) Static304.aClass257_21.method5506(); local19 != null; local19 = (Class1_Sub26) Static304.aClass257_21.method5501()) {
				if (!local19.method5618()) {
					local19 = (Class1_Sub26) Static304.aClass257_21.method5506();
					if (local19 == null) {
						break;
					}
				}
				Static454.method5610(false, true, local19);
			}
			Static169.anInt2522 = -1;
			Static304.aClass257_21 = new Class257(8);
			Static347.method4405();
			Static169.anInt2522 = Static445.anInt7372;
			Static28.method503(false);
			Static183.method4174();
			Static267.method3403(Static169.anInt2522);
		}
		Static327.method4188();
		Static258.anInt4103 = -1;
		Static425.method5304(Static453.anInt7417);
		aClass20_Sub3_Sub3_Sub1_1 = new Class20_Sub3_Sub3_Sub1();
		aClass20_Sub3_Sub3_Sub1_1.anInt6613 = Static425.anInt6922 * 128 / 2;
		aClass20_Sub3_Sub3_Sub1_1.anInt6616 = Static251.anInt4072 * 128 / 2;
		aClass20_Sub3_Sub3_Sub1_1.anIntArray370[0] = Static425.anInt6922 / 2;
		Static8.anInt7337 = 0;
		Static278.anInt4391 = 0;
		aClass20_Sub3_Sub3_Sub1_1.anIntArray369[0] = Static251.anInt4072 / 2;
		if (Static100.anInt1781 == 2) {
			Static8.anInt7337 = Static65.anInt1146 << 7;
			Static278.anInt4391 = Static253.anInt4091 << 7;
		} else {
			Static297.method3890();
		}
		Static421.method5243();
		if (Static278.anInt4391 == 0 || Static8.anInt7337 == 0) {
			Static430.method5422(10);
		} else {
			Static209.method2810();
			Static430.method5422(28);
		}
	}
}
