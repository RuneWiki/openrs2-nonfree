import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
	public static int anInt5438;

	@OriginalMember(owner = "client!lfa", name = "r", descriptor = "I")
	public static int anInt5446;

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray92 = new String[200];

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)I")
	public static int method4563(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(B)V")
	public static void method4565() {
		@Pc(10) int local10 = 0;
		if (Static72.aClass2_Sub12_Sub1_1 != null) {
			local10 = Static72.aClass2_Sub12_Sub1_1.method1423(Static391.anInt6846);
		}
		@Pc(41) int local41;
		@Pc(57) int local57;
		if (local10 == 2) {
			local41 = Static455.anInt7877 > 800 ? 800 : Static455.anInt7877;
			Static212.anInt4095 = (Static455.anInt7877 - local41) / 2;
			local57 = Static248.anInt4654 <= 600 ? Static248.anInt4654 : 600;
			Static140.anInt2937 = local41;
			Static561.anInt9195 = 0;
			Static120.anInt2371 = local57;
		} else if (local10 == 1) {
			local41 = Static455.anInt7877 > 1024 ? 1024 : Static455.anInt7877;
			Static140.anInt2937 = local41;
			Static212.anInt4095 = (Static455.anInt7877 - local41) / 2;
			local57 = Static248.anInt4654 > 768 ? 768 : Static248.anInt4654;
			Static120.anInt2371 = local57;
			Static561.anInt9195 = 0;
		} else {
			Static561.anInt9195 = 0;
			Static212.anInt4095 = 0;
			Static140.anInt2937 = Static455.anInt7877;
			Static120.anInt2371 = Static248.anInt4654;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
	public static void method4567() {
		Static133.aClass2_Sub15_Sub2_1.method4362();
		@Pc(13) int local13 = Static133.aClass2_Sub15_Sub2_1.method4355(8);
		@Pc(22) int local22;
		if (Static416.anInt7186 > local13) {
			for (local22 = local13; local22 < Static416.anInt7186; local22++) {
				Static25.anIntArray38[Static230.anInt4315++] = Static169.anIntArray198[local22];
			}
		}
		if (local13 > Static416.anInt7186) {
			throw new RuntimeException("gnpov1");
		}
		Static416.anInt7186 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(64) int local64 = Static169.anIntArray198[local22];
			@Pc(72) Class6_Sub1_Sub1_Sub1_Sub1 local72 = ((Class2_Sub32) Static544.aClass162_40.method3519((long) local64)).aClass6_Sub1_Sub1_Sub1_Sub1_1;
			@Pc(77) int local77 = Static133.aClass2_Sub15_Sub2_1.method4355(1);
			if (local77 == 0) {
				Static169.anIntArray198[Static416.anInt7186++] = local64;
				local72.anInt7348 = Static412.anInt575;
			} else {
				@Pc(100) int local100 = Static133.aClass2_Sub15_Sub2_1.method4355(2);
				if (local100 == 0) {
					Static169.anIntArray198[Static416.anInt7186++] = local64;
					local72.anInt7348 = Static412.anInt575;
					Static488.anIntArray591[Static405.anInt7060++] = local64;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local100 == 1) {
						Static169.anIntArray198[Static416.anInt7186++] = local64;
						local72.anInt7348 = Static412.anInt575;
						local142 = Static133.aClass2_Sub15_Sub2_1.method4355(3);
						local72.method156(local142, 1);
						local152 = Static133.aClass2_Sub15_Sub2_1.method4355(1);
						if (local152 == 1) {
							Static488.anIntArray591[Static405.anInt7060++] = local64;
						}
					} else if (local100 == 2) {
						Static169.anIntArray198[Static416.anInt7186++] = local64;
						local72.anInt7348 = Static412.anInt575;
						if (Static133.aClass2_Sub15_Sub2_1.method4355(1) == 1) {
							local142 = Static133.aClass2_Sub15_Sub2_1.method4355(3);
							local72.method156(local142, 2);
							local152 = Static133.aClass2_Sub15_Sub2_1.method4355(3);
							local72.method156(local152, 2);
						} else {
							local142 = Static133.aClass2_Sub15_Sub2_1.method4355(3);
							local72.method156(local142, 0);
						}
						local142 = Static133.aClass2_Sub15_Sub2_1.method4355(1);
						if (local142 == 1) {
							Static488.anIntArray591[Static405.anInt7060++] = local64;
						}
					} else if (local100 == 3) {
						Static25.anIntArray38[Static230.anInt4315++] = local64;
					}
				}
			}
		}
	}
}
