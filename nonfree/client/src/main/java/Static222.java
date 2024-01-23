import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!r", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString150 = null;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BZ)V")
	public static void method3548(@OriginalArg(1) boolean arg0) {
		if (Static98.aBoolean137 != arg0) {
			Static98.aBoolean137 = arg0;
			Static77.method1327();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ak;I)V")
	public static void method3549(@OriginalArg(0) Class7 arg0) {
		Static159.aClass1_Sub2_Sub2_Sub1Array2 = Static97.method1593(arg0, Static173.anInt3185);
		Static156.aClass1_Sub2_Sub2Array4 = Static237.method2439(Static197.anInt3815, arg0);
		Static216.aClass1_Sub2_Sub2Array11 = Static237.method2439(Static44.anInt992, arg0);
		Static17.aClass1_Sub2_Sub2Array1 = Static237.method2439(Static49.anInt1061, arg0);
		Static105.aClass1_Sub2_Sub2Array5 = Static237.method2439(Static196.anInt3779, arg0);
		Static121.aClass1_Sub2_Sub2Array6 = Static237.method2439(Static126.anInt2417, arg0);
		Static51.aClass1_Sub2_Sub2Array2 = Static237.method2439(Static273.anInt5454, arg0);
		Static284.aClass1_Sub2_Sub2_12 = Static117.method1824(arg0, Static244.anInt5022);
		Static244.aClass1_Sub2_Sub2Array13 = Static259.method4019(Static36.anInt4786, arg0);
		Static228.aClass1_Sub2_Sub2Array12 = Static259.method4019(Static14.anInt370, arg0);
		Static123.aClass48Array3 = Static279.method4291(Static291.anInt5792, arg0);
		Static211.aClass48Array2 = Static279.method4291(Static174.anInt3208, arg0);
		Static169.aClass1_Sub2_Sub12_3.method4392(Static211.aClass48Array2, null);
		Static84.aClass1_Sub2_Sub12_2.method4392(Static211.aClass48Array2, null);
		Static10.aClass1_Sub2_Sub12_1.method4392(Static211.aClass48Array2, null);
		if (Static240.aBoolean369) {
			Static78.aClass48_Sub2Array2 = Static187.method2832(Static289.anInt5741, arg0);
			for (@Pc(99) int local99 = 0; local99 < Static78.aClass48_Sub2Array2.length; local99++) {
				Static78.aClass48_Sub2Array2[local99].method3629();
			}
		}
		@Pc(120) Class1_Sub2_Sub2_Sub1 local120 = Static62.method1042(Static119.anInt4991, arg0, 0);
		local120.method3929();
		if (Static240.aBoolean369) {
			Static145.aClass1_Sub2_Sub2_6 = new Class1_Sub2_Sub2_Sub2(local120);
		} else {
			Static145.aClass1_Sub2_Sub2_6 = local120;
		}
		@Pc(139) Class1_Sub2_Sub2_Sub1[] local139 = Static97.method1593(arg0, Static81.anInt1617);
		@Pc(141) int local141;
		for (local141 = 0; local141 < local139.length; local141++) {
			local139[local141].method3929();
		}
		if (Static240.aBoolean369) {
			Static136.aClass1_Sub2_Sub2Array7 = new Class1_Sub2_Sub2[local139.length];
			for (local141 = 0; local141 < local139.length; local141++) {
				Static136.aClass1_Sub2_Sub2Array7[local141] = new Class1_Sub2_Sub2_Sub2(local139[local141]);
			}
		} else {
			Static136.aClass1_Sub2_Sub2Array7 = local139;
		}
		@Pc(191) int local191 = (int) (Math.random() * 21.0D) - 10;
		local141 = (int) (Math.random() * 21.0D) - 10;
		@Pc(205) int local205 = (int) (Math.random() * 21.0D) - 10;
		@Pc(212) int local212 = (int) (Math.random() * 41.0D) - 20;
		@Pc(214) int local214;
		for (local214 = 0; local214 < Static159.aClass1_Sub2_Sub2_Sub1Array2.length; local214++) {
			Static159.aClass1_Sub2_Sub2_Sub1Array2[local214].method3931(local141 + local212, local191 + local212, local212 + local205);
		}
		if (Static240.aBoolean369) {
			Static155.aClass1_Sub2_Sub2Array8 = new Class1_Sub2_Sub2[Static159.aClass1_Sub2_Sub2_Sub1Array2.length];
			for (local214 = 0; local214 < Static159.aClass1_Sub2_Sub2_Sub1Array2.length; local214++) {
				Static155.aClass1_Sub2_Sub2Array8[local214] = new Class1_Sub2_Sub2_Sub2(Static159.aClass1_Sub2_Sub2_Sub1Array2[local214]);
			}
		} else {
			Static155.aClass1_Sub2_Sub2Array8 = Static159.aClass1_Sub2_Sub2_Sub1Array2;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
	public static void method3551(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static274.anInt5464 = Static77.anInt1559 + Static198.anInt3851 - arg0 - 1;
		Static269.anInt5391 = arg1 - Static219.anInt4487;
	}
}
