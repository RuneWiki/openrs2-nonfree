import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "j", descriptor = "[S")
	public static short[] aShortArray1;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "I")
	public static int anInt160 = 10;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_56 = Static60.method1113(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!b", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_57 = Static60.method1113("VOLL");

	@OriginalMember(owner = "client!b", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_58 = Static60.method1113("AUS");

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Lclient!ec;")
	private static Class22 aClass22_59 = Static60.method1113("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!b", name = "x", descriptor = "Lclient!ec;")
	public static Class22 aClass22_60 = aClass22_59;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method129() {
		while (true) {
			if (Static133.aClass4_Sub11_Sub1_3.method750(Static96.anInt2463) >= 11) {
				@Pc(12) int local12 = Static133.aClass4_Sub11_Sub1_3.method748(11);
				if (local12 != 2047) {
					@Pc(17) boolean local17 = false;
					if (Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local12] == null) {
						Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local12] = new Class4_Sub1_Sub3_Sub2_Sub1();
						if (Static120.aClass4_Sub11Array1[local12] != null) {
							Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local12].method1092(Static120.aClass4_Sub11Array1[local12]);
						}
						local17 = true;
					}
					Static115.anIntArray310[Static51.anInt1461++] = local12;
					@Pc(53) Class4_Sub1_Sub3_Sub2_Sub1 local53 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local12];
					local53.anInt2475 = Static117.anInt2877;
					@Pc(61) int local61 = Static133.aClass4_Sub11_Sub1_3.method748(5);
					if (local61 > 15) {
						local61 -= 32;
					}
					@Pc(72) int local72 = Static133.aClass4_Sub11_Sub1_3.method748(5);
					if (local72 > 15) {
						local72 -= 32;
					}
					@Pc(83) int local83 = Static27.anIntArray74[Static133.aClass4_Sub11_Sub1_3.method748(3)];
					if (local17) {
						local53.anInt2496 = local53.anInt2499 = local83;
					}
					@Pc(96) int local96 = Static133.aClass4_Sub11_Sub1_3.method748(1);
					@Pc(101) int local101 = Static133.aClass4_Sub11_Sub1_3.method748(1);
					if (local101 == 1) {
						Static51.anIntArray146[Static50.anInt1405++] = local12;
					}
					local53.method1610(Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0] + local72, local96 == 1, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0] + local61);
					continue;
				}
			}
			Static133.aClass4_Sub11_Sub1_3.method751();
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method131() {
		aClass22_57 = null;
		aClass22_56 = null;
		aClass22_58 = null;
		aClass22_59 = null;
		aClass22_60 = null;
		aShortArray1 = null;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	public static void method132() {
		Static71.aClass33_24.method1003();
		Static105.aClass33_30.method1003();
		Static39.aClass33_15.method1003();
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)Z")
	public static boolean method137() {
		try {
			if (Static80.anInt2197 == 2) {
				if (Static107.aClass4_Sub2_1 == null) {
					Static107.aClass4_Sub2_1 = Static135.method53(Static30.aClass20_17, Static132.anInt3135, Static105.anInt2640);
					if (Static107.aClass4_Sub2_1 == null) {
						return false;
					}
				}
				if (Static134.aClass35_1 == null) {
					Static134.aClass35_1 = new Class35(Static87.aClass20_44, Static80.aClass20_41);
				}
				if (Static69.aClass4_Sub4_Sub1_2.method212(Static79.aClass20_40, Static134.aClass35_1, Static107.aClass4_Sub2_1)) {
					Static69.aClass4_Sub4_Sub1_2.method233();
					Static69.aClass4_Sub4_Sub1_2.method205(Static49.anInt1330);
					Static69.aClass4_Sub4_Sub1_2.method201(Static101.aBoolean232, Static107.aClass4_Sub2_1);
					Static134.aClass35_1 = null;
					Static80.anInt2197 = 0;
					Static107.aClass4_Sub2_1 = null;
					Static30.aClass20_17 = null;
					return true;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static69.aClass4_Sub4_Sub1_2.method228();
			Static107.aClass4_Sub2_1 = null;
			Static30.aClass20_17 = null;
			Static134.aClass35_1 = null;
			Static80.anInt2197 = 0;
		}
		return false;
	}
}
