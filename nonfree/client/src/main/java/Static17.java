import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!c", name = "nc", descriptor = "I")
	public static int anInt3606;

	@OriginalMember(owner = "client!c", name = "pc", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!c", name = "ob", descriptor = "Lclient!ea;")
	public static Class18 aClass18_898 = Static8.method128(":chalreq:");

	@OriginalMember(owner = "client!c", name = "Jb", descriptor = "Lclient!da;")
	public static Class14 aClass14_8 = new Class14(32);

	@OriginalMember(owner = "client!c", name = "mc", descriptor = "[Lclient!md;")
	public static Class44[] aClass44Array3 = new Class44[16];

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(Z)V")
	public static void method2480() {
		while (true) {
			if (Static167.aClass1_Sub6_Sub1_3.method557(Static12.anInt4661) >= 11) {
				@Pc(12) int local12 = Static167.aClass1_Sub6_Sub1_3.method562(11);
				if (local12 != 2047) {
					@Pc(19) boolean local19 = false;
					if (Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local12] == null) {
						local19 = true;
						Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub5_Sub1_Sub2();
						if (Static85.aClass1_Sub6Array1[local12] != null) {
							Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local12].method2487(Static85.aClass1_Sub6Array1[local12]);
						}
					}
					Static58.anIntArray140[Static45.anInt1553++] = local12;
					@Pc(55) Class1_Sub1_Sub5_Sub1_Sub2 local55 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local12];
					local55.anInt3557 = Static41.anInt1322;
					@Pc(63) int local63 = Static167.aClass1_Sub6_Sub1_3.method562(1);
					if (local63 == 1) {
						Static82.anIntArray220[Static76.anInt2355++] = local12;
					}
					@Pc(81) int local81 = Static105.anIntArray275[Static167.aClass1_Sub6_Sub1_3.method562(3)];
					if (local19) {
						local55.anInt3590 = local55.anInt3576 = local81;
					}
					@Pc(94) int local94 = Static167.aClass1_Sub6_Sub1_3.method562(5);
					if (local94 > 15) {
						local94 -= 32;
					}
					@Pc(103) int local103 = Static167.aClass1_Sub6_Sub1_3.method562(1);
					@Pc(108) int local108 = Static167.aClass1_Sub6_Sub1_3.method562(5);
					if (local108 > 15) {
						local108 -= 32;
					}
					local55.method2481(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray315[0] + local108, local94 + Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray314[0], local103 == 1);
					continue;
				}
			}
			Static167.aClass1_Sub6_Sub1_3.method554();
			return;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public static void method2482() {
		aClass14_8 = null;
		aShortArrayArray7 = null;
		aClass18_898 = null;
		aClass44Array3 = null;
	}
}
