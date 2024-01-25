import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!je", name = "e", descriptor = "I")
	public static int anInt4334;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	public static int anInt4333 = 765;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
	public static void method3786() {
		for (@Pc(1) int local1 = Static164.anInt3319; local1 < Static459.anInt7698; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static155.anInt3254; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static39.anInt747; local7++) {
					@Pc(16) Class299 local16 = Static309.aClass299ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class41_Sub2_Sub3 local21 = local16.aClass41_Sub2_Sub3_1;
						@Pc(24) Class41_Sub2_Sub3 local24 = local16.aClass41_Sub2_Sub3_2;
						if (local21 != null && local21.method7839()) {
							Static468.method6474(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7839()) {
								Static468.method6474(local24, local1, local4, local7, 1, 1);
								local24.method7840(0, 0, 0, local21, Static511.aClass45_12, false);
								local24.method7852();
							}
							local21.method7852();
						}
						for (@Pc(68) Class38 local68 = local16.aClass38_2; local68 != null; local68 = local68.aClass38_1) {
							@Pc(72) Class41_Sub2_Sub1 local72 = local68.aClass41_Sub2_Sub1_1;
							if (local72 != null && local72.method7839()) {
								Static468.method6474(local72, local1, local4, local7, local72.aShort146 + 1 - local72.aShort147, local72.aShort145 - local72.aShort144 + 1);
								local72.method7852();
							}
						}
						@Pc(108) Class41_Sub2_Sub5 local108 = local16.aClass41_Sub2_Sub5_1;
						if (local108 != null && local108.method7839()) {
							Static402.method5826(local108, local1, local4, local7);
							local108.method7852();
						}
					}
				}
			}
		}
	}
}
