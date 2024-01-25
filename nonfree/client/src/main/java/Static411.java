import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
	public static int[] anIntArray438;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
	public static int anInt7040;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	public static int anInt7039 = 2;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!et;Z)V")
	public static void method5913(@OriginalArg(0) Class41_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort147; local2 <= arg0.aShort146; local2++) {
			for (@Pc(6) int local6 = arg0.aShort144; local6 <= arg0.aShort145; local6++) {
				@Pc(16) Class299 local16 = Static309.aClass299ArrayArrayArray3[arg0.aByte117][local2][local6];
				if (local16 != null) {
					@Pc(21) Class38 local21 = local16.aClass38_2;
					@Pc(23) Class38 local23 = null;
					while (local21 != null) {
						if (local21.aClass41_Sub2_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass38_2 = local21.aClass38_1;
							} else {
								local23.aClass38_1 = local21.aClass38_1;
							}
							local21.method758();
							break;
						}
						local23 = local21;
						local21 = local21.aClass38_1;
					}
				}
			}
		}
		if (!arg1) {
			Static67.method1444(arg0);
		}
	}
}
