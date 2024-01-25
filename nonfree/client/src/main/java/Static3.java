import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
	public static int anInt71;

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "Lclient!kn;")
	public static Class192 aClass192_1;

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_1 = new Class361();

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "()V")
	public static void method70() {
		for (@Pc(1) int local1 = Static195.anInt3996; local1 < Static101.anInt2104; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static446.anInt7725; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static218.anInt4229; local7++) {
					@Pc(16) Class293 local16 = Static118.aClass293ArrayArrayArray14[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class20_Sub2_Sub2 local21 = local16.aClass20_Sub2_Sub2_2;
						@Pc(24) Class20_Sub2_Sub2 local24 = local16.aClass20_Sub2_Sub2_1;
						if (local21 != null && local21.method7254()) {
							Static344.method5093(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7254()) {
								Static344.method5093(local24, local1, local4, local7, 1, 1);
								local24.method7257(0, local21, false, 0, Static63.aClass12_5, 0);
								local24.method7263();
							}
							local21.method7263();
						}
						for (@Pc(68) Class285 local68 = local16.aClass285_6; local68 != null; local68 = local68.aClass285_5) {
							@Pc(72) Class20_Sub2_Sub4 local72 = local68.aClass20_Sub2_Sub4_1;
							if (local72 != null && local72.method7254()) {
								Static344.method5093(local72, local1, local4, local7, local72.aShort98 + 1 - local72.aShort100, local72.aShort99 - local72.aShort97 + 1);
								local72.method7263();
							}
						}
						@Pc(108) Class20_Sub2_Sub3 local108 = local16.aClass20_Sub2_Sub3_1;
						if (local108 != null && local108.method7254()) {
							Static481.method6762(local108, local1, local4, local7);
							local108.method7263();
						}
					}
				}
			}
		}
	}
}
