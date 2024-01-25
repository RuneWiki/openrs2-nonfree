import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
	public static int anInt5618;

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
	public static int anInt5620;

	@OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
	public static int anInt5622;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
	public static int anInt5614 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	public static void method4368() {
		for (@Pc(15) Class1_Sub3_Sub4 local15 = (Class1_Sub3_Sub4) Static264.aClass254_25.method5437(); local15 != null; local15 = (Class1_Sub3_Sub4) Static264.aClass254_25.method5433()) {
			@Pc(20) Class20_Sub3_Sub2 local20 = local15.aClass20_Sub3_Sub2_1;
			if (local20.aByte89 != Static138.anInt3548 || local20.anInt2377 < Static368.anInt6250) {
				local15.method5617();
				local20.method1873();
			} else if (Static368.anInt6250 >= local20.anInt2379) {
				if (local20.anInt2385 > 0) {
					@Pc(50) Class20_Sub3_Sub3_Sub2 local50 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local20.anInt2385 - 1];
					if (local50 != null && local50.anInt6613 >= 0 && local50.anInt6613 < Static425.anInt6922 * 128 && local50.anInt6616 >= 0 && Static251.anInt4072 * 128 > local50.anInt6616) {
						local20.method1880(local50.anInt6613, local50.anInt6616, Static183.method4175(local50.anInt6616, local50.anInt6613, local20.aByte89) - local20.anInt2394, Static368.anInt6250);
					}
				}
				if (local20.anInt2385 < 0) {
					@Pc(105) int local105 = -local20.anInt2385 - 1;
					@Pc(110) Class20_Sub3_Sub3_Sub1 local110;
					if (Static348.anInt5668 == local105) {
						local110 = Static239.aClass20_Sub3_Sub3_Sub1_1;
					} else {
						local110 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local105];
					}
					if (local110 != null && local110.anInt6613 >= 0 && local110.anInt6613 < Static425.anInt6922 * 128 && local110.anInt6616 >= 0 && Static251.anInt4072 * 128 > local110.anInt6616) {
						local20.method1880(local110.anInt6613, local110.anInt6616, Static183.method4175(local110.anInt6616, local110.anInt6613, local20.aByte89) - local20.anInt2394, Static368.anInt6250);
					}
				}
				local20.method1876(Static239.anInt3853);
				Static222.method2947(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)I")
	public static int method4375() {
		return Static130.anInt2246;
	}

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "(I)V")
	public static void method4377() {
		if (Static260.aClass77_5 != null) {
			Static260.aClass77_5.method4267();
		}
		if (Static343.aClass77_4 != null) {
			Static343.aClass77_4.method4267();
		}
	}
}
