import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
	public static void method957() {
		@Pc(7) int local7 = Static235.anInt2721;
		@Pc(14) int[] local14 = Static130.anIntArray267;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class6_Sub1_Sub2_Sub1 local24 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local14[local16]];
			if (local24 != null && local24.anInt8567 > 0) {
				local24.anInt8567--;
				if (local24.anInt8567 == 0) {
					local24.aString80 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static221.anInt4798; local54++) {
			@Pc(61) long local61 = (long) Static3.anIntArray80[local54];
			@Pc(67) Class3_Sub3 local67 = (Class3_Sub3) Static240.aClass267_20.method6644(local61);
			if (local67 != null) {
				@Pc(72) Class6_Sub1_Sub2_Sub2 local72 = local67.aClass6_Sub1_Sub2_Sub2_1;
				if (local72.anInt8567 > 0) {
					local72.anInt8567--;
					if (local72.anInt8567 == 0) {
						local72.aString80 = null;
					}
				}
			}
		}
	}
}
