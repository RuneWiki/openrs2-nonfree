import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_14 = new Class61(15, 0, 1, 0);

	@OriginalMember(owner = "client!vk", name = "r", descriptor = "[F")
	public static final float[] aFloatArray31 = new float[16];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BZ)V")
	public static void method5642(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static237.aClass3_Sub7_Sub1_1.method1059(Static139.anInt7585) >= 15) {
				@Pc(10) int local10 = Static237.aClass3_Sub7_Sub1_1.method1063(15);
				if (local10 != 32767) {
					@Pc(17) boolean local17 = false;
					if (Static139.aClass7_Sub2_Sub3_Sub1Array11[local10] == null) {
						Static139.aClass7_Sub2_Sub3_Sub1Array11[local10] = new Class7_Sub2_Sub3_Sub1();
						local17 = true;
						Static139.aClass7_Sub2_Sub3_Sub1Array11[local10].anInt4391 = local10;
					}
					@Pc(38) Class7_Sub2_Sub3_Sub1 local38 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local10];
					Static319.anIntArray114[Static54.anInt1472++] = local10;
					local38.anInt4357 = Static253.anInt4787;
					if (local38.aClass47_1 != null && local38.aClass47_1.method1240()) {
						Static152.method2472(local38);
					}
					@Pc(69) int local69;
					if (arg0) {
						local69 = Static237.aClass3_Sub7_Sub1_1.method1063(8);
						if (local69 > 127) {
							local69 -= 256;
						}
					} else {
						local69 = Static237.aClass3_Sub7_Sub1_1.method1063(5);
						if (local69 > 15) {
							local69 -= 32;
						}
					}
					@Pc(92) int local92 = Static237.aClass3_Sub7_Sub1_1.method1063(1);
					if (local92 == 1) {
						Static444.anIntArray524[Static51.anInt1367++] = local10;
					}
					local38.method454(Static364.aClass96_2.method2199(Static237.aClass3_Sub7_Sub1_1.method1063(14)));
					@Pc(126) int local126 = Static237.aClass3_Sub7_Sub1_1.method1063(3) + 4 << 11 & 0x3D62;
					@Pc(131) int local131 = Static237.aClass3_Sub7_Sub1_1.method1063(1);
					@Pc(138) int local138;
					if (arg0) {
						local138 = Static237.aClass3_Sub7_Sub1_1.method1063(8);
						if (local138 > 127) {
							local138 -= 256;
						}
					} else {
						local138 = Static237.aClass3_Sub7_Sub1_1.method1063(5);
						if (local138 > 15) {
							local138 -= 32;
						}
					}
					@Pc(157) int local157 = Static237.aClass3_Sub7_Sub1_1.method1063(2);
					local38.method3515(local38.aClass47_1.anInt1616);
					local38.anInt4363 = local38.aClass47_1.anInt1592 << 3;
					if (local38.anInt4363 == 0) {
						local38.method3503(0);
					} else if (local17) {
						local38.method3503(local126);
					}
					local38.method458(local38.method3499(), local157, local131 == 1, local138 + Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray288[0], Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray287[0] + local69);
					if (local38.aClass47_1.method1240()) {
						Static387.method5032(local38.aByte77, 0, null, local38.anIntArray288[0], null, local38, local38.anIntArray287[0]);
					}
					continue;
				}
			}
			Static237.aClass3_Sub7_Sub1_1.method1065();
			return;
		}
	}
}
