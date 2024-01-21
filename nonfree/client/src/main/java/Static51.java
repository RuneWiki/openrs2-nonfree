import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1 aClass4_Sub2_Sub3_Sub1_5;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_15;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	public static int anInt2470;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public static int anInt2475;

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "Lclient!pd;")
	public static Class20 aClass20_49;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	public static int anInt2458 = 0;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1283 = Static28.method504("Connecting to update server");

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1282 = aClass39_1283;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
	public static int anInt2466 = -1;

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
	public static final int anInt2483 = 0;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public static void method1807() {
		@Pc(10) int local10 = Static35.aClass4_Sub16_Sub1_1.method1500(8);
		@Pc(15) int local15;
		if (local10 < Static122.anInt3021) {
			for (local15 = local10; local15 < Static122.anInt3021; local15++) {
				Static38.anIntArray103[Static113.anInt2837++] = Static116.anIntArray312[local15];
			}
		}
		if (local10 > Static122.anInt3021) {
			throw new RuntimeException("gppov1");
		}
		Static122.anInt3021 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(53) int local53 = Static116.anIntArray312[local15];
			@Pc(57) Class4_Sub2_Sub1_Sub1_Sub1 local57 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local53];
			@Pc(64) int local64 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
			if (local64 == 0) {
				Static116.anIntArray312[Static122.anInt3021++] = local53;
				local57.anInt2681 = Static71.anInt1738;
			} else {
				@Pc(89) int local89 = Static35.aClass4_Sub16_Sub1_1.method1500(2);
				if (local89 == 0) {
					Static116.anIntArray312[Static122.anInt3021++] = local53;
					local57.anInt2681 = Static71.anInt1738;
					Static35.anIntArray101[Static30.anInt785++] = local53;
				} else {
					@Pc(135) int local135;
					@Pc(147) int local147;
					if (local89 == 1) {
						Static116.anIntArray312[Static122.anInt3021++] = local53;
						local57.anInt2681 = Static71.anInt1738;
						local135 = Static35.aClass4_Sub16_Sub1_1.method1500(3);
						local57.method1909(false, local135);
						local147 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
						if (local147 == 1) {
							Static35.anIntArray101[Static30.anInt785++] = local53;
						}
					} else if (local89 == 2) {
						Static116.anIntArray312[Static122.anInt3021++] = local53;
						local57.anInt2681 = Static71.anInt1738;
						local135 = Static35.aClass4_Sub16_Sub1_1.method1500(3);
						local57.method1909(true, local135);
						local147 = Static35.aClass4_Sub16_Sub1_1.method1500(3);
						local57.method1909(true, local147);
						@Pc(203) int local203 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
						if (local203 == 1) {
							Static35.anIntArray101[Static30.anInt785++] = local53;
						}
					} else if (local89 == 3) {
						Static38.anIntArray103[Static113.anInt2837++] = local53;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	public static void method1810() {
		aClass20_Sub1_15 = null;
		aClass39_1283 = null;
		aClass20_49 = null;
		anIntArray277 = null;
		aClass4_Sub2_Sub3_Sub1_5 = null;
		aClass39_1282 = null;
	}
}
