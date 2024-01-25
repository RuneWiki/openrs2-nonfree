import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static690 {

	@OriginalMember(owner = "client!vla", name = "j", descriptor = "I")
	public static int anInt10754;

	@OriginalMember(owner = "client!vla", name = "N", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_183 = new Class397(13, -1);

	@OriginalMember(owner = "client!vla", name = "k", descriptor = "[I")
	public static int[] anIntArray771 = null;

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "()V")
	public static void method9130() {
		for (@Pc(1) int local1 = Static66.anInt1583; local1 < Static169.anInt2992; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static128.anInt2531; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static448.anInt6835; local7++) {
					@Pc(16) Class364 local16 = Static448.aClass364ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class9_Sub1_Sub2 local21 = local16.aClass9_Sub1_Sub2_2;
						@Pc(24) Class9_Sub1_Sub2 local24 = local16.aClass9_Sub1_Sub2_1;
						if (local21 != null && local21.method9077()) {
							Static667.method8690(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method9077()) {
								Static667.method8690(local24, local1, local4, local7, 1, 1);
								local24.method9091(local21, Static404.aClass22_6, 0, false, 0, 0);
								local24.method9086();
							}
							local21.method9086();
						}
						for (@Pc(76) Class181 local76 = local16.aClass181_3; local76 != null; local76 = local76.aClass181_2) {
							@Pc(80) Class9_Sub1_Sub1 local80 = local76.aClass9_Sub1_Sub1_1;
							if (local80 != null && local80.method9077()) {
								Static667.method8690(local80, local1, local4, local7, local80.aShort122 + 1 - local80.aShort123, local80.aShort121 - local80.aShort120 + 1);
								local80.method9086();
							}
						}
						@Pc(120) Class9_Sub1_Sub4 local120 = local16.aClass9_Sub1_Sub4_1;
						if (local120 != null && local120.method9077()) {
							Static530.method7067(local120, local1, local4, local7);
							local120.method9086();
						}
					}
				}
			}
		}
	}
}
