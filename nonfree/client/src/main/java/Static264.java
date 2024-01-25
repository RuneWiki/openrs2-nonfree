import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ng", name = "F", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!ts;)Z")
	public static boolean method4047(@OriginalArg(1) Class239 arg0) {
		if (Static420.anInt7506 == arg0.anInt6911) {
			Static31.anInt889 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZB)V")
	public static void method4048(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static232.aClass6_Sub1_Sub1_4.method3797(Static334.anInt5833) >= 15) {
				@Pc(16) int local16 = Static232.aClass6_Sub1_Sub1_4.method3803(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					if (Static308.aClass3_Sub2_Sub1_Sub1Array1[local16] == null) {
						Static308.aClass3_Sub2_Sub1_Sub1Array1[local16] = new Class3_Sub2_Sub1_Sub1();
						local21 = true;
						Static308.aClass3_Sub2_Sub1_Sub1Array1[local16].anInt6602 = local16;
					}
					@Pc(42) Class3_Sub2_Sub1_Sub1 local42 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local16];
					Static66.anIntArray102[Static136.anInt2887++] = local16;
					local42.anInt6586 = Static66.anInt1741;
					if (local42.aClass48_1 != null && local42.aClass48_1.method1384()) {
						Static5.method202(local42);
					}
					@Pc(71) int local71 = Static232.aClass6_Sub1_Sub1_4.method3803(1);
					@Pc(78) int local78 = Static232.aClass6_Sub1_Sub1_4.method3803(2);
					@Pc(85) int local85;
					if (arg0) {
						local85 = Static232.aClass6_Sub1_Sub1_4.method3803(8);
						if (local85 > 127) {
							local85 -= 256;
						}
					} else {
						local85 = Static232.aClass6_Sub1_Sub1_4.method3803(5);
						if (local85 > 15) {
							local85 -= 32;
						}
					}
					local42.method1318(Static235.aClass263_2.method6416(Static232.aClass6_Sub1_Sub1_4.method3803(14)));
					@Pc(117) int local117 = Static232.aClass6_Sub1_Sub1_4.method3803(1);
					if (local117 == 1) {
						Static58.anIntArray193[Static263.anInt4750++] = local16;
					}
					@Pc(135) int local135;
					if (arg0) {
						local135 = Static232.aClass6_Sub1_Sub1_4.method3803(8);
						if (local135 > 127) {
							local135 -= 256;
						}
					} else {
						local135 = Static232.aClass6_Sub1_Sub1_4.method3803(5);
						if (local135 > 15) {
							local135 -= 32;
						}
					}
					@Pc(165) int local165 = (Static232.aClass6_Sub1_Sub1_4.method3803(3) + 4 & 0x4A800007) << 11;
					local42.method5515(local42.aClass48_1.anInt1752);
					local42.anInt6571 = local42.aClass48_1.anInt1744 << 3;
					if (local42.anInt6571 == 0) {
						local42.method5517(0);
					} else if (local21) {
						local42.method5517(local165);
					}
					local42.method1322(local85 + Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray458[0], local78, local71 == 1, local135 + Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray459[0], local42.method5521());
					if (local42.aClass48_1.method1384()) {
						Static160.method2662(local42.aByte103, 0, null, local42, local42.anIntArray458[0], null, local42.anIntArray459[0]);
					}
					continue;
				}
			}
			Static232.aClass6_Sub1_Sub1_4.method3801();
			return;
		}
	}
}
