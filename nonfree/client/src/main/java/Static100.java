import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!df", name = "G", descriptor = "I")
	public static int anInt1840;

	@OriginalMember(owner = "client!df", name = "I", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(B)V")
	public static void method1769() {
		while (true) {
			if (Static210.aClass3_Sub25_Sub1_3.method3395(Static467.anInt7682) >= 15) {
				@Pc(14) int local14 = Static210.aClass3_Sub25_Sub1_3.method3402(15);
				if (local14 != 32767) {
					@Pc(21) boolean local21 = false;
					@Pc(28) Class3_Sub3 local28 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local14);
					@Pc(34) Class28_Sub1_Sub1_Sub1_Sub2 local34;
					if (local28 == null) {
						local34 = new Class28_Sub1_Sub1_Sub1_Sub2();
						local34.anInt10762 = local14;
						local28 = new Class3_Sub3(local34);
						Static522.aClass83_34.method2377((long) local14, local28);
						Static84.aClass3_Sub3Array1[Static567.anInt5909++] = local28;
						local21 = true;
					}
					local34 = local28.aClass28_Sub1_Sub1_Sub1_Sub2_1;
					Static131.anIntArray226[Static561.anInt9114++] = local14;
					local34.anInt10786 = Static360.anInt5808;
					if (local34.aClass300_1 != null && local34.aClass300_1.method7268()) {
						Static666.method9184(local34);
					}
					@Pc(88) int local88 = Static210.aClass3_Sub25_Sub1_3.method3402(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(97) int local97 = Static210.aClass3_Sub25_Sub1_3.method3402(1);
					@Pc(102) int local102 = Static210.aClass3_Sub25_Sub1_3.method3402(2);
					@Pc(107) int local107 = Static210.aClass3_Sub25_Sub1_3.method3402(1);
					if (local107 == 1) {
						Static394.anIntArray548[Static28.anInt551++] = local14;
					}
					local34.method9335(Static580.aClass36_2.method1057(Static210.aClass3_Sub25_Sub1_3.method3402(14)));
					@Pc(141) int local141 = Static210.aClass3_Sub25_Sub1_3.method3402(3) + 4 << 11 & 0x3F59;
					@Pc(146) int local146 = Static210.aClass3_Sub25_Sub1_3.method3402(5);
					if (local146 > 15) {
						local146 -= 32;
					}
					local34.method9322(local34.aClass300_1.anInt8313);
					local34.anInt10745 = local34.aClass300_1.anInt8314 << 3;
					if (local21) {
						local34.method9324(true, local141);
					}
					local34.method9334(local102, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0] + local146, local88 + Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0], local34.method9314(), local97 == 1);
					if (local34.aClass300_1.method7268()) {
						Static581.method7253(local34.anIntArray956[0], local34.anIntArray955[0], local34, (Class277) null, (Class28_Sub1_Sub1_Sub1_Sub1) null, 0, local34.aByte174);
					}
					continue;
				}
			}
			Static210.aClass3_Sub25_Sub1_3.method3393();
			return;
		}
	}
}
