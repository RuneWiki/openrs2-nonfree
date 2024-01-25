import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
	public static int anInt7256 = 13156520;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZI)V")
	public static void method5668(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static336.aClass1_Sub28_Sub1_2.method3080(Static245.anInt4432) >= 15) {
				@Pc(17) int local17 = Static336.aClass1_Sub28_Sub1_2.method3084(15);
				if (local17 != 32767) {
					@Pc(24) boolean local24 = false;
					if (Static87.aClass25_Sub5_Sub1_Sub1Array6[local17] == null) {
						Static87.aClass25_Sub5_Sub1_Sub1Array6[local17] = new Class25_Sub5_Sub1_Sub1();
						Static87.aClass25_Sub5_Sub1_Sub1Array6[local17].anInt4284 = local17;
						local24 = true;
					}
					@Pc(45) Class25_Sub5_Sub1_Sub1 local45 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local17];
					Static31.anIntArray30[Static328.anInt5608++] = local17;
					local45.anInt4298 = Static236.anInt4213;
					if (local45.aClass54_1 != null && local45.aClass54_1.method1155()) {
						Static329.method4419(local45);
					}
					local45.method2590(Static161.aClass231_2.method5022(Static336.aClass1_Sub28_Sub1_2.method3084(14)));
					@Pc(82) int local82 = Static336.aClass1_Sub28_Sub1_2.method3084(2);
					@Pc(87) int local87 = Static336.aClass1_Sub28_Sub1_2.method3084(1);
					@Pc(98) int local98 = Static336.aClass1_Sub28_Sub1_2.method3084(3) + 4 << 11 & 0x3C6A;
					@Pc(103) int local103 = Static336.aClass1_Sub28_Sub1_2.method3084(1);
					if (local103 == 1) {
						Static377.anIntArray423[Static383.anInt6392++] = local17;
					}
					@Pc(125) int local125;
					if (arg0) {
						local125 = Static336.aClass1_Sub28_Sub1_2.method3084(8);
						if (local125 > 127) {
							local125 -= 256;
						}
					} else {
						local125 = Static336.aClass1_Sub28_Sub1_2.method3084(5);
						if (local125 > 15) {
							local125 -= 32;
						}
					}
					@Pc(151) int local151;
					if (arg0) {
						local151 = Static336.aClass1_Sub28_Sub1_2.method3084(8);
						if (local151 > 127) {
							local151 -= 256;
						}
					} else {
						local151 = Static336.aClass1_Sub28_Sub1_2.method3084(5);
						if (local151 > 15) {
							local151 -= 32;
						}
					}
					local45.method3431(local45.aClass54_1.anInt1348);
					local45.anInt4274 = local45.aClass54_1.anInt1325 << 3;
					if (local45.anInt4274 == 0) {
						local45.method3435(0);
					} else if (local24) {
						local45.method3435(local98);
					}
					local45.method2591(local45.method3427(), local87 == 1, Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray284[0] + local125, local82, Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray283[0] + local151);
					if (local45.aClass54_1.method1155()) {
						Static81.method1356(local45.aByte94, 0, local45.anIntArray284[0], null, local45, local45.anIntArray283[0], null);
					}
					continue;
				}
			}
			Static336.aClass1_Sub28_Sub1_2.method3083();
			return;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5671(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static52.method867(Static18.aClass103_11);
			Static18.aClass1_Sub28_Sub1_1.method5398(Static349.method4734(arg0));
			Static18.aClass1_Sub28_Sub1_1.method5364(arg0);
		}
	}
}
