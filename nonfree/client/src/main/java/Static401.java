import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
	public static int anInt6673;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public static void method5278(@OriginalArg(1) int arg0) {
		Static358.anInt6073 = arg0;
		Static342.aClass171_47.method3936();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!od;[[B)V")
	public static void method5279(@OriginalArg(1) Class23_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		@Pc(42) int local42;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class2_Sub23 local30 = new Class2_Sub23(local23);
				local36 = Static334.anIntArray494[local17] >> 8;
				local42 = Static334.anIntArray494[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static48.anInt962;
				@Pc(56) int local56 = local42 * 64 - Static324.anInt5624;
				Static112.method2026();
				arg0.method4072(Static48.anInt962, Static324.anInt5624, local30, Static194.aClass70Array1, local49, local56);
				arg0.method4085(Static33.aClass49_1, local30, local49, local56, local12);
				if (!arg0.aBoolean378 && Static455.anInt5548 / 8 == local36 && Static376.anInt6396 / 8 == local42 && local12[0] != -1) {
					Static441.aClass242_2 = Static154.aClass252_1.method5608(local12[1], local12[3], Static318.aClass131_5, local12[0], local12[2]);
					Static383.anInt6435 = local12[4];
				}
			}
		}
		for (@Pc(133) int local133 = 0; local133 < local15; local133++) {
			local36 = (Static334.anIntArray494[local133] >> 8) * 64 - Static48.anInt962;
			local42 = (Static334.anIntArray494[local133] & 0xFF) * 64 - Static324.anInt5624;
			@Pc(160) byte[] local160 = arg1[local133];
			if (local160 == null && Static376.anInt6396 < 800) {
				Static112.method2026();
				arg0.method4081(local42, local36);
			}
		}
	}
}
