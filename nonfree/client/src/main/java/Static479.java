import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Z")
	public static final boolean aBoolean588 = false;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()V")
	public static void method7067() {
		for (@Pc(1) int local1 = Static37.anInt600; local1 < Static68.anInt1380; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static357.anInt5961; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static429.anInt7422; local7++) {
					@Pc(16) Class217 local16 = Static421.aClass217ArrayArrayArray5[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class4_Sub2_Sub4 local21 = local16.aClass4_Sub2_Sub4_1;
						@Pc(24) Class4_Sub2_Sub4 local24 = local16.aClass4_Sub2_Sub4_2;
						if (local21 != null && local21.method8722()) {
							Static57.method956(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8722()) {
								Static57.method956(local24, local1, local4, local7, 1, 1);
								local24.method8715(0, Static517.aClass133_13, local21, 0, 0, false);
								local24.method8726();
							}
							local21.method8726();
						}
						for (@Pc(68) Class290 local68 = local16.aClass290_2; local68 != null; local68 = local68.aClass290_3) {
							@Pc(72) Class4_Sub2_Sub1 local72 = local68.aClass4_Sub2_Sub1_1;
							if (local72 != null && local72.method8722()) {
								Static57.method956(local72, local1, local4, local7, local72.aShort109 + 1 - local72.aShort107, local72.aShort110 - local72.aShort108 + 1);
								local72.method8726();
							}
						}
						@Pc(108) Class4_Sub2_Sub2 local108 = local16.aClass4_Sub2_Sub2_1;
						if (local108 != null && local108.method8722()) {
							Static417.method6376(local108, local1, local4, local7);
							local108.method8726();
						}
					}
				}
			}
		}
	}
}
