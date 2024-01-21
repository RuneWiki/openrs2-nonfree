import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!ai;")
	public static Interface1 anInterface1_2;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public static int anInt3417;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "[Lclient!ig;")
	public static Class30_Sub1[] aClass30_Sub1Array1 = new Class30_Sub1[256];

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
	public static int anInt3418 = -1;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1276 = Static169.method2903("::fps ");

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1277 = Static169.method2903("Loading fonts )2 ");

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1278 = aClass23_1277;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
	public static void method2315() {
		aClass23_1277 = null;
		anInterface1_2 = null;
		aClass23_1276 = null;
		aClass30_Sub1Array1 = null;
		aClass23_1278 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method2316() {
		Static35.aClass1_Sub8_Sub1_2.method915();
		@Pc(15) int local15 = Static35.aClass1_Sub8_Sub1_2.method911(8);
		@Pc(24) int local24;
		if (Static86.anInt2307 > local15) {
			for (local24 = local15; local24 < Static86.anInt2307; local24++) {
				Static42.anIntArray140[Static14.anInt465++] = Static141.anIntArray476[local24];
			}
		}
		if (local15 > Static86.anInt2307) {
			throw new RuntimeException("gnpov1");
		}
		Static86.anInt2307 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(66) int local66 = Static141.anIntArray476[local24];
			@Pc(70) Class1_Sub1_Sub1_Sub1_Sub2 local70 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local66];
			@Pc(75) int local75 = Static35.aClass1_Sub8_Sub1_2.method911(1);
			if (local75 == 0) {
				Static141.anIntArray476[Static86.anInt2307++] = local66;
				local70.anInt1834 = Static26.anInt845;
			} else {
				@Pc(95) int local95 = Static35.aClass1_Sub8_Sub1_2.method911(2);
				if (local95 == 0) {
					Static141.anIntArray476[Static86.anInt2307++] = local66;
					local70.anInt1834 = Static26.anInt845;
					Static60.anIntArray611[Static104.anInt2660++] = local66;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local95 == 1) {
						Static141.anIntArray476[Static86.anInt2307++] = local66;
						local70.anInt1834 = Static26.anInt845;
						local142 = Static35.aClass1_Sub8_Sub1_2.method911(3);
						local70.method1224(false, local142);
						local152 = Static35.aClass1_Sub8_Sub1_2.method911(1);
						if (local152 == 1) {
							Static60.anIntArray611[Static104.anInt2660++] = local66;
						}
					} else if (local95 == 2) {
						Static141.anIntArray476[Static86.anInt2307++] = local66;
						local70.anInt1834 = Static26.anInt845;
						local142 = Static35.aClass1_Sub8_Sub1_2.method911(3);
						local70.method1224(true, local142);
						local152 = Static35.aClass1_Sub8_Sub1_2.method911(3);
						local70.method1224(true, local152);
						@Pc(208) int local208 = Static35.aClass1_Sub8_Sub1_2.method911(1);
						if (local208 == 1) {
							Static60.anIntArray611[Static104.anInt2660++] = local66;
						}
					} else if (local95 == 3) {
						Static42.anIntArray140[Static14.anInt465++] = local66;
					}
				}
			}
		}
	}
}
