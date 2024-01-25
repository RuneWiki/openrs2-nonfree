import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public static int anInt7488;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_367 = new Class12(70, 6);

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_143 = new Class254(59, 7);

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
	public static int anInt7497 = 0;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method5775() {
		@Pc(7) Class242[] local7 = Class1_Sub2_Sub10.aClass242Array1;
		synchronized (Class1_Sub2_Sub10.aClass242Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class1_Sub2_Sub10.aClass242Array1.length; local11++) {
				Class1_Sub2_Sub10.aClass242Array1[local11] = new Class242();
				Static10.anIntArray553[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public static void method5776() {
		for (@Pc(10) Class1_Sub1_Sub12 local10 = (Class1_Sub1_Sub12) Static152.aClass142_19.method3199(); local10 != null; local10 = (Class1_Sub1_Sub12) Static152.aClass142_19.method3198()) {
			@Pc(23) Class47_Sub1_Sub1 local23 = local10.aClass47_Sub1_Sub1_1;
			if (local23.aByte97 != Static1.anInt41 || Static123.anInt2333 > local23.anInt992) {
				local10.method5965();
				local23.method832();
			} else if (local23.anInt978 <= Static123.anInt2333) {
				if (local23.anInt995 > 0) {
					@Pc(60) Class47_Sub1_Sub5_Sub1 local60 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local23.anInt995 - 1];
					if (local60 != null && local60.anInt7060 >= 0 && local60.anInt7060 < Static80.anInt6558 * 128 && local60.anInt7066 >= 0 && Static104.anInt2048 * 128 > local60.anInt7066) {
						local23.method827(Static405.method5510(local60.anInt7066, local60.anInt7060, local23.aByte97) - local23.anInt980, Static123.anInt2333, local60.anInt7060, local60.anInt7066);
					}
				}
				if (local23.anInt995 < 0) {
					@Pc(111) int local111 = -local23.anInt995 - 1;
					@Pc(116) Class47_Sub1_Sub5_Sub2 local116;
					if (local111 == Static179.anInt3373) {
						local116 = Static255.aClass47_Sub1_Sub5_Sub2_2;
					} else {
						local116 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local111];
					}
					if (local116 != null && local116.anInt7060 >= 0 && Static80.anInt6558 * 128 > local116.anInt7060 && local116.anInt7066 >= 0 && local116.anInt7066 < Static104.anInt2048 * 128) {
						local23.method827(Static405.method5510(local116.anInt7066, local116.anInt7060, local23.aByte97) - local23.anInt980, Static123.anInt2333, local116.anInt7060, local116.anInt7066);
					}
				}
				local23.method833(Static384.anInt6843);
				Static97.method1543(local23, true);
			}
		}
	}
}
