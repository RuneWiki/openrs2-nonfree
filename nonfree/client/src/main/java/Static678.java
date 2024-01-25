import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static678 {

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "F")
	public static float aFloat175;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "Lclient!lba;")
	public static final Class218 aClass218_43 = new Class218(16);

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!kg;Z)V")
	public static void method9188(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort130; local2 <= arg0.aShort128; local2++) {
			for (@Pc(6) int local6 = arg0.aShort127; local6 <= arg0.aShort129; local6++) {
				@Pc(16) Class311 local16 = Static632.aClass311ArrayArrayArray3[arg0.aByte133][local2][local6];
				if (local16 != null) {
					@Pc(21) Class142 local21 = local16.aClass142_2;
					@Pc(23) Class142 local23 = null;
					while (local21 != null) {
						if (local21.aClass4_Sub2_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass142_2 = local21.aClass142_1;
							} else {
								local23.aClass142_1 = local21.aClass142_1;
							}
							local21.method2996();
							break;
						}
						local23 = local21;
						local21 = local21.aClass142_1;
					}
				}
			}
		}
		if (!arg1) {
			Static192.method2751(arg0);
		}
	}
}
