import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "Lclient!pu;")
	public static final Class2_Sub37 aClass2_Sub37_1 = new Class2_Sub37(0, 0);

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_179 = new Class363(101, 16);

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	public static void method5426() {
		@Pc(12) int local12 = Static376.anInt6647;
		@Pc(14) int[] local14 = Static557.anIntArray665;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class6_Sub1_Sub1_Sub1_Sub2 local24 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local14[local16]];
			if (local24 != null && local24.anInt7344 > 0) {
				local24.anInt7344--;
				if (local24.anInt7344 == 0) {
					local24.aString65 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static416.anInt7186; local54++) {
			@Pc(61) long local61 = (long) Static169.anIntArray198[local54];
			@Pc(67) Class2_Sub32 local67 = (Class2_Sub32) Static544.aClass162_40.method3519(local61);
			if (local67 != null) {
				@Pc(72) Class6_Sub1_Sub1_Sub1_Sub1 local72 = local67.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				if (local72.anInt7344 > 0) {
					local72.anInt7344--;
					if (local72.anInt7344 == 0) {
						local72.aString65 = null;
					}
				}
			}
		}
	}
}
