import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	public static int anInt1239;

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public static void method1134() {
		for (@Pc(12) int local12 = 0; local12 < Static113.anInt2286; local12++) {
			@Pc(18) Class177 local18 = Static450.aClass177Array1[local12];
			@Pc(20) boolean local20 = false;
			@Pc(247) int local247;
			if (local18.aClass1_Sub8_Sub1_1 == null) {
				local18.anInt4726--;
				if (local18.anInt4726 < (local18.method4029() ? -1500 : -10)) {
					local20 = true;
				} else {
					if (local18.aByte67 == 1 && local18.aClass176_1 == null) {
						local18.aClass176_1 = Static601.method4024(Static546.aClass111_117, local18.anInt4725, 0);
						if (local18.aClass176_1 == null) {
							continue;
						}
						local18.anInt4726 += local18.aClass176_1.method4027();
					} else if (local18.method4029() && (local18.aClass1_Sub38_1 == null || local18.aClass1_Sub40_Sub1_1 == null)) {
						if (local18.aClass1_Sub38_1 == null) {
							local18.aClass1_Sub38_1 = Static405.method5716(Static144.aClass111_33, local18.anInt4725);
						}
						if (local18.aClass1_Sub38_1 == null) {
							continue;
						}
						if (local18.aClass1_Sub40_Sub1_1 == null) {
							local18.aClass1_Sub40_Sub1_1 = local18.aClass1_Sub38_1.method5719(new int[] { 22050 });
							if (local18.aClass1_Sub40_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local18.anInt4726 < 0) {
						if (local18.anInt4722 == 0) {
							local247 = local18.anInt4727 * (local18.aByte67 == 3 ? Static479.aClass1_Sub7_Sub1_1.anInt3102 : Static479.aClass1_Sub7_Sub1_1.anInt3096) >> 8;
						} else {
							@Pc(147) int local147 = local18.anInt4722 >> 24 & 0x3;
							if (local147 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116) {
								@Pc(162) int local162 = (local18.anInt4722 & 0xFF) << 9;
								@Pc(169) int local169 = local18.anInt4722 >> 16 & 0xFF;
								@Pc(179) int local179 = (local169 << 9) + 256 - Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796;
								if (local179 < 0) {
									local179 = -local179;
								}
								@Pc(194) int local194 = local18.anInt4722 >> 8 & 0xFF;
								@Pc(203) int local203 = (local194 << 9) + 256 - Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795;
								if (local203 < 0) {
									local203 = -local203;
								}
								@Pc(218) int local218 = local179 + local203 - 512;
								if (local162 < local218) {
									local18.anInt4726 = -99999;
									continue;
								}
								if (local218 < 0) {
									local218 = 0;
								}
								local247 = local18.anInt4727 * (local162 - local218) * Static479.aClass1_Sub7_Sub1_1.anInt3107 / local162 >> 8;
							} else {
								local247 = 0;
							}
						}
						if (local247 > 0) {
							@Pc(272) Class1_Sub40_Sub1 local272 = null;
							if (local18.aByte67 == 1) {
								local272 = local18.aClass176_1.method4025().method6314(Static154.aClass229_1);
							} else if (local18.method4029()) {
								local272 = local18.aClass1_Sub40_Sub1_1;
							}
							@Pc(300) Class1_Sub8_Sub1 local300 = local18.aClass1_Sub8_Sub1_1 = Static597.method951(local272, local247);
							local300.method956(local18.anInt4724 - 1);
							Static298.aClass1_Sub8_Sub4_2.method6029(local300);
						}
					}
				}
			} else if (!local18.aClass1_Sub8_Sub1_1.method7877()) {
				local20 = true;
			}
			if (local20) {
				Static113.anInt2286--;
				for (local247 = local12; local247 < Static113.anInt2286; local247++) {
					Static450.aClass177Array1[local247] = Static450.aClass177Array1[local247 + 1];
				}
				local12--;
			}
		}
		if (Static571.aBoolean680 && !Static420.method6363()) {
			if (Static479.aClass1_Sub7_Sub1_1.anInt3103 != 0 && Static525.anInt8671 != -1) {
				Static151.method2397(Static153.aClass111_34, Static479.aClass1_Sub7_Sub1_1.anInt3103, Static525.anInt8671);
			}
			Static571.aBoolean680 = false;
		} else if (Static479.aClass1_Sub7_Sub1_1.anInt3103 != 0 && Static525.anInt8671 != -1 && !Static420.method6363()) {
			@Pc(363) Class1_Sub48 local363 = Static320.method4867(Static442.aClass170_2, Static290.aClass319_97);
			local363.aClass1_Sub20_Sub1_2.method4421(Static525.anInt8671);
			Static34.method813(local363);
			Static525.anInt8671 = -1;
		}
	}
}
