import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!u", name = "v", descriptor = "I")
	public static int anInt3424;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "I")
	public static volatile int anInt3426 = -1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public static void method2951(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub4_Sub2 local17 = Static502.method7211(5, (long) arg0);
		local17.method627();
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()V")
	public static void method2952() {
		for (@Pc(1) int local1 = Static74.anInt1137; local1 < Static241.anInt4521; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static509.anInt8656; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static164.anInt3059; local7++) {
					@Pc(16) Class262 local16 = Static584.aClass262ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class19_Sub1_Sub2 local21 = local16.aClass19_Sub1_Sub2_2;
						@Pc(24) Class19_Sub1_Sub2 local24 = local16.aClass19_Sub1_Sub2_1;
						if (local21 != null && local21.method9368()) {
							Static39.method583(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method9368()) {
								Static39.method583(local24, local1, local4, local7, 1, 1);
								local24.method9373(false, 0, Static626.aClass67_16, 0, local21, 0);
								local24.method9367();
							}
							local21.method9367();
						}
						for (@Pc(76) Class343 local76 = local16.aClass343_2; local76 != null; local76 = local76.aClass343_4) {
							@Pc(80) Class19_Sub1_Sub3 local80 = local76.aClass19_Sub1_Sub3_1;
							if (local80 != null && local80.method9368()) {
								Static39.method583(local80, local1, local4, local7, local80.aShort123 + 1 - local80.aShort121, local80.aShort122 - local80.aShort124 + 1);
								local80.method9367();
							}
						}
						@Pc(120) Class19_Sub1_Sub5 local120 = local16.aClass19_Sub1_Sub5_1;
						if (local120 != null && local120.method9368()) {
							Static33.method506(local120, local1, local4, local7);
							local120.method9367();
						}
					}
				}
			}
		}
	}
}
