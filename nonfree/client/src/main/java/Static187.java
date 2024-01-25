import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_104 = new Class194(75, -1);

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
	public static int anInt3550 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public static void method3047() {
		Static162.anInt3235 = -1;
		Static258.anInt5032 = -1;
		Static322.anInt6163 = 0;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	public static void method3048() {
		Static405.method6309();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()V")
	public static void method3050() {
		for (@Pc(1) int local1 = Static128.anInt1667; local1 < Static603.anInt9778; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static573.anInt6750; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static547.anInt9143; local7++) {
					@Pc(16) Class351 local16 = Static567.aClass351ArrayArrayArray4[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class9_Sub2_Sub3 local21 = local16.aClass9_Sub2_Sub3_2;
						@Pc(24) Class9_Sub2_Sub3 local24 = local16.aClass9_Sub2_Sub3_1;
						if (local21 != null && local21.method8610()) {
							Static244.method4103(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8610()) {
								Static244.method4103(local24, local1, local4, local7, 1, 1);
								local24.method8609(Static568.aClass82_14, false, 0, local21, 0, 0);
								local24.method8612();
							}
							local21.method8612();
						}
						for (@Pc(68) Class105 local68 = local16.aClass105_3; local68 != null; local68 = local68.aClass105_1) {
							@Pc(72) Class9_Sub2_Sub1 local72 = local68.aClass9_Sub2_Sub1_1;
							if (local72 != null && local72.method8610()) {
								Static244.method4103(local72, local1, local4, local7, local72.aShort127 + 1 - local72.aShort126, local72.aShort125 - local72.aShort124 + 1);
								local72.method8612();
							}
						}
						@Pc(108) Class9_Sub2_Sub4 local108 = local16.aClass9_Sub2_Sub4_1;
						if (local108 != null && local108.method8610()) {
							Static479.method6550(local108, local1, local4, local7);
							local108.method8612();
						}
					}
				}
			}
		}
	}
}
