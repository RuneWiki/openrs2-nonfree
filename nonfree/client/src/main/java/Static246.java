import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "Z")
	public static boolean aBoolean357;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "[I")
	public static int[] anIntArray290;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
	public static int anInt4756 = 0;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
	public static void method4164() {
		@Pc(7) int local7 = Static649.anInt10495;
		@Pc(9) int[] local9 = Static426.anIntArray476;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(24) Class16_Sub1_Sub1_Sub3_Sub2 local24 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local9[local11]];
			if (local24 != null && local24.anInt8125 > 0) {
				local24.anInt8125--;
				if (local24.anInt8125 == 0) {
					local24.aString81 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static317.anInt5602; local54++) {
			@Pc(61) long local61 = (long) Static363.anIntArray409[local54];
			@Pc(67) Class2_Sub32 local67 = (Class2_Sub32) Static514.aClass323_32.method7484(local61);
			if (local67 != null) {
				@Pc(72) Class16_Sub1_Sub1_Sub3_Sub1 local72 = local67.aClass16_Sub1_Sub1_Sub3_Sub1_2;
				if (local72.anInt8125 > 0) {
					local72.anInt8125--;
					if (local72.anInt8125 == 0) {
						local72.aString81 = null;
					}
				}
			}
		}
	}
}
