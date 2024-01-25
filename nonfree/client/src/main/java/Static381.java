import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "[B")
	public static final byte[] aByteArray75 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZII)V")
	public static void method4864(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static410.anInt6680 == 0) {
			Static240.method3130(false);
		} else {
			Static120.anInt4988 = Static410.anInt6680;
			Static330.method4211(0);
		}
		Static274.anInt4341 = arg2;
		Static43.anInt5197 = arg0;
		Static351.aBoolean482 = arg1;
		Static114.method5228(arg3);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
	public static void method4865(@OriginalArg(1) int arg0) {
		if (arg0 == Static263.anInt4190) {
			return;
		}
		Static425.anInt6922 = Static251.anInt4072 = Static259.anIntArray222[arg0];
		Static289.method3780();
		Static328.anIntArrayArray136 = new int[Static425.anInt6922][Static251.anInt4072];
		Static303.anIntArrayArrayArray13 = new int[4][Static425.anInt6922 >> 3][Static251.anInt4072 >> 3];
		Static378.anIntArrayArray155 = new int[Static425.anInt6922][Static251.anInt4072];
		for (@Pc(45) int local45 = 0; local45 < 4; local45++) {
			Static383.aClass247Array1[local45] = Static430.method5417(Static425.anInt6922, Static251.anInt4072);
		}
		Static417.aByteArrayArrayArray3 = new byte[4][Static425.anInt6922][Static251.anInt4072];
		Static154.method4421(Static425.anInt6922, Static251.anInt4072);
		Static188.method2488(Static213.aClass128_22, Static251.anInt4072 >> 3, Static425.anInt6922 >> 3);
		Static263.anInt4190 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!od;B)V")
	public static void method4867(@OriginalArg(0) Class128_Sub2 arg0) {
		@Pc(18) byte[] local18;
		if (Static287.anObject7 == null) {
			@Pc(9) Class69_Sub2_Sub1 local9 = new Class69_Sub2_Sub1();
			local18 = local9.method4746();
			Static287.anObject7 = Static125.method1725(local18);
		}
		if (Static122.anObject3 == null) {
			@Pc(29) Class69_Sub1_Sub1 local29 = new Class69_Sub1_Sub1();
			local18 = local29.method1437();
			Static122.anObject3 = Static125.method1725(local18);
		}
		@Pc(44) Class161 local44 = arg0.aClass161_1;
		if (local44.method3266() && Static56.anObject2 == null) {
			local18 = Static338.method4299(0.5F, 16.0F, 0.6F, 4.0F, 4.0F, new Class10_Sub1(419684));
			Static56.anObject2 = Static125.method1725(local18);
		}
	}
}
