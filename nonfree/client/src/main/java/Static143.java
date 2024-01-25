import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!gt", name = "I", descriptor = "[I")
	public static final int[] anIntArray322 = new int[2];

	@OriginalMember(owner = "client!gt", name = "P", descriptor = "[I")
	public static final int[] anIntArray324 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;BLclient!ia;)I")
	public static int method2293(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		@Pc(11) int local11 = arg1.anInt1710;
		@Pc(17) byte[] local17 = Static181.method3035(arg0);
		arg1.method1169(local17.length);
		arg1.anInt1710 += Static68.aClass226_1.method5093(local17, 0, arg1.aByteArray14, arg1.anInt1710, local17.length);
		return arg1.anInt1710 - local11;
	}

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)V")
	public static void method2295() {
		if (Static30.aClass106_3 == null) {
			return;
		}
		Static43.aClass117_2.method2960();
		Static81.method1504();
		Static249.method3728();
		Static27.method561();
		Static82.method1510();
		Static397.method5474();
		if (Static311.aClass189_1 != null) {
			Static311.aClass189_1.method4276();
		}
		Static12.method141();
		Static312.method4476();
		Static83.method1514();
		Static347.method4917(false);
		Static67.method1306();
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(44) Class30_Sub1_Sub1_Sub2 local44 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local39];
			if (local44 != null) {
				local44.aClass1_Sub31_3 = null;
				for (@Pc(51) int local51 = 0; local51 < local44.aClass17Array3.length; local51++) {
					local44.aClass17Array3[local51] = null;
				}
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static127.anInt2832; local71++) {
			@Pc(77) Class30_Sub1_Sub1_Sub1 local77 = Static324.aClass1_Sub27Array2[local71].aClass30_Sub1_Sub1_Sub1_2;
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < local77.aClass17Array3.length; local81++) {
					local77.aClass17Array3[local81] = null;
				}
			}
		}
		Static97.aClass40_1 = null;
		Static343.aClass40_4 = null;
		Static30.aClass106_3.method5966();
		Static30.aClass106_3 = null;
	}
}
