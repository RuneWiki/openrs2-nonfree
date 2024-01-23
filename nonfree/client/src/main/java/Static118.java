import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
	public static int anInt2383 = 0;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public static volatile int anInt2384 = 0;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
	public static int[] anIntArray192 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "[S")
	public static short[] aShortArray24 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	public static int anInt2385 = -1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method1919() {
		for (@Pc(7) int local7 = 0; local7 < Static291.anInt3609; local7++) {
			@Pc(14) int local14 = Static171.anIntArray259[local7];
			@Pc(18) Class36_Sub3_Sub1 local18 = Static230.aClass36_Sub3_Sub1Array1[local14];
			@Pc(22) int local22 = Static275.aClass8_Sub2_Sub1_6.method2334();
			if ((local22 & 0x4) != 0) {
				local22 += Static275.aClass8_Sub2_Sub1_6.method2334() << 8;
			}
			Static181.method2775(local22, local18, local14);
		}
	}
}
