import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "J")
	public static long aLong205;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!xa;")
	public static Class13 aClass13_29;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	public static int anInt6953 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method5795() {
		@Pc(9) int local9 = Static487.aClass4_Sub9_Sub1_2.method5977();
		@Pc(13) int local13 = Static487.aClass4_Sub9_Sub1_2.method5977();
		@Pc(17) int local17 = Static487.aClass4_Sub9_Sub1_2.method6015();
		@Pc(28) boolean local28 = Static487.aClass4_Sub9_Sub1_2.method6009() == 1;
		Static236.anInt4754 = Static487.aClass4_Sub9_Sub1_2.method6027();
		Static288.method4549();
		Static274.method4405(local17);
		Static487.aClass4_Sub9_Sub1_2.method1039();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static38.anInt740 >> 3; local46++) {
				for (local50 = 0; local50 < Static38.anInt741 >> 3; local50++) {
					local57 = Static487.aClass4_Sub9_Sub1_2.method1046(1);
					if (local57 == 1) {
						Static536.anIntArrayArrayArray22[local42][local46][local50] = Static487.aClass4_Sub9_Sub1_2.method1046(26);
					} else {
						Static536.anIntArrayArrayArray22[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static487.aClass4_Sub9_Sub1_2.method1036();
		local46 = (Static474.anInt4412 - Static487.aClass4_Sub9_Sub1_2.anInt7219) / 16;
		Static376.anIntArrayArray61 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static376.anIntArrayArray61[local50][local57] = Static487.aClass4_Sub9_Sub1_2.method6026();
			}
		}
		Static240.anIntArray424 = new int[local46];
		Static206.anIntArray400 = new int[local46];
		Static380.anIntArray543 = new int[local46];
		Static434.aByteArrayArray31 = new byte[local46][];
		Static197.anIntArray391 = null;
		Static293.anIntArray459 = new int[local46];
		Static238.aByteArrayArray38 = new byte[local46][];
		Static101.anIntArray236 = new int[local46];
		Static34.aByteArrayArray40 = new byte[local46][];
		Static220.aByteArrayArray18 = new byte[local46][];
		Static475.aByteArrayArray33 = null;
		local46 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (@Pc(194) int local194 = 0; local194 < Static38.anInt740 >> 3; local194++) {
				for (@Pc(198) int local198 = 0; local198 < Static38.anInt741 >> 3; local198++) {
					@Pc(208) int local208 = Static536.anIntArrayArrayArray22[local57][local194][local198];
					if (local208 != -1) {
						@Pc(218) int local218 = local208 >> 14 & 0x3FF;
						@Pc(224) int local224 = local208 >> 3 & 0x7FF;
						@Pc(235) int local235 = (local218 / 8 << 8) + (local224 / 8);
						for (@Pc(237) int local237 = 0; local237 < local46; local237++) {
							if (local235 == Static380.anIntArray543[local237]) {
								local235 = -1;
								break;
							}
						}
						if (local235 != -1) {
							Static380.anIntArray543[local46] = local235;
							@Pc(270) int local270 = local235 >> 8 & 0xFF;
							@Pc(274) int local274 = local235 & 0xFF;
							Static240.anIntArray424[local46] = Static370.aClass31_81.method653("m" + local270 + "_" + local274);
							Static206.anIntArray400[local46] = Static370.aClass31_81.method653("l" + local270 + "_" + local274);
							Static101.anIntArray236[local46] = Static370.aClass31_81.method653("um" + local270 + "_" + local274);
							Static293.anIntArray459[local46] = Static370.aClass31_81.method653("ul" + local270 + "_" + local274);
							local46++;
						}
					}
				}
			}
		}
		Static575.method7834(11, local9, local13, local28);
	}
}
