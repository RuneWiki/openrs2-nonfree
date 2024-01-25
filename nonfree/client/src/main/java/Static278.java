import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Lclient!ik;")
	public static Class95 aClass95_1;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "Z")
	public static boolean aBoolean547 = false;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_157 = new Class34("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
	public static int anInt5664 = 0;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Z")
	public static boolean aBoolean548 = false;

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "[I")
	public static final int[] anIntArray474 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public static void method4852() {
		Static198.aClass87_10.method2477();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V")
	public static void method4853() {
		Static311.aClass1_Sub8_Sub1_8.method3234();
		@Pc(18) int local18 = Static311.aClass1_Sub8_Sub1_8.method3238(8);
		@Pc(23) int local23;
		if (Static5.anInt200 > local18) {
			for (local23 = local18; local23 < Static5.anInt200; local23++) {
				Static87.anIntArray210[Static113.anInt2650++] = Static171.anIntArray333[local23];
			}
		}
		if (local18 > Static5.anInt200) {
			throw new RuntimeException("gnpov1");
		}
		Static5.anInt200 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(57) int local57 = Static171.anIntArray333[local23];
			@Pc(61) Class17_Sub1_Sub1_Sub2 local61 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local57];
			@Pc(66) int local66 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
			if (local66 == 0) {
				Static171.anIntArray333[Static5.anInt200++] = local57;
				local61.anInt4852 = Static5.anInt208;
			} else {
				@Pc(89) int local89 = Static311.aClass1_Sub8_Sub1_8.method3238(2);
				if (local89 == 0) {
					Static171.anIntArray333[Static5.anInt200++] = local57;
					local61.anInt4852 = Static5.anInt208;
					Static191.anIntArray373[Static125.anInt2818++] = local57;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local89 == 1) {
						Static171.anIntArray333[Static5.anInt200++] = local57;
						local61.anInt4852 = Static5.anInt208;
						local134 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
						local61.method4331(local134, 1);
						local144 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
						if (local144 == 1) {
							Static191.anIntArray373[Static125.anInt2818++] = local57;
						}
					} else if (local89 == 2) {
						Static171.anIntArray333[Static5.anInt200++] = local57;
						local61.anInt4852 = Static5.anInt208;
						if (Static311.aClass1_Sub8_Sub1_8.method3238(1) == 1) {
							local134 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
							local61.method4331(local134, 2);
							local144 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
							local61.method4331(local144, 2);
						} else {
							local134 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
							local61.method4331(local134, 0);
						}
						local134 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
						if (local134 == 1) {
							Static191.anIntArray373[Static125.anInt2818++] = local57;
						}
					} else if (local89 == 3) {
						Static87.anIntArray210[Static113.anInt2650++] = local57;
					}
				}
			}
		}
	}
}
