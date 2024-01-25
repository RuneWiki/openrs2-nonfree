import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "Lclient!pa;")
	public static Class249 aClass249_18;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
	public static void method5532() {
		@Pc(7) int local7 = Static403.anInt6982;
		@Pc(9) int[] local9 = Static430.anIntArray447;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(24) Class41_Sub2_Sub1_Sub4_Sub2 local24 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local9[local11]];
			if (local24 != null && local24.anInt9494 > 0) {
				local24.anInt9494--;
				if (local24.anInt9494 == 0) {
					local24.aString94 = null;
				}
			}
		}
		for (@Pc(51) int local51 = 0; local51 < Static88.anInt1884; local51++) {
			@Pc(58) long local58 = (long) Static445.anIntArray470[local51];
			@Pc(64) Class3_Sub34 local64 = (Class3_Sub34) Static213.aClass354_37.method7689(local58);
			if (local64 != null) {
				@Pc(69) Class41_Sub2_Sub1_Sub4_Sub1 local69 = local64.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				if (local69.anInt9494 > 0) {
					local69.anInt9494--;
					if (local69.anInt9494 == 0) {
						local69.aString94 = null;
					}
				}
			}
		}
	}
}
