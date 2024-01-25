import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!av;")
	public static final Class27 aClass27_10 = new Class27(9, 8);

	@OriginalMember(owner = "client!me", name = "b", descriptor = "[I")
	public static final int[] anIntArray344 = new int[2];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "()V")
	public static void method5790() {
		for (@Pc(1) int local1 = Static60.anInt991; local1 < Static59.anInt987; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static654.anInt10715; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static180.anInt2928; local7++) {
					@Pc(16) Class89 local16 = Static63.aClass89ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class4_Sub3_Sub1 local21 = local16.aClass4_Sub3_Sub1_1;
						@Pc(24) Class4_Sub3_Sub1 local24 = local16.aClass4_Sub3_Sub1_2;
						if (local21 != null && local21.method9483()) {
							Static633.method9095(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method9483()) {
								Static633.method9095(local24, local1, local4, local7, 1, 1);
								local24.method9480(Static554.aClass144_12, 0, 0, false, local21, 0);
								local24.method9482();
							}
							local21.method9482();
						}
						for (@Pc(76) Class58 local76 = local16.aClass58_2; local76 != null; local76 = local76.aClass58_1) {
							@Pc(80) Class4_Sub3_Sub3 local80 = local76.aClass4_Sub3_Sub3_1;
							if (local80 != null && local80.method9483()) {
								Static633.method9095(local80, local1, local4, local7, local80.aShort107 + 1 - local80.aShort108, local80.aShort110 - local80.aShort109 + 1);
								local80.method9482();
							}
						}
						@Pc(120) Class4_Sub3_Sub2 local120 = local16.aClass4_Sub3_Sub2_1;
						if (local120 != null && local120.method9483()) {
							Static408.method6135(local120, local1, local4, local7);
							local120.method9482();
						}
					}
				}
			}
		}
	}
}
