import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Lclient!da;")
	public static Class55 aClass55_9;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "Z")
	public static boolean aBoolean383 = false;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "[I")
	public static final int[] anIntArray278 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vp;Z)V")
	public static void method4632(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort107; local2 <= arg0.aShort109; local2++) {
			for (@Pc(6) int local6 = arg0.aShort108; local6 <= arg0.aShort110; local6++) {
				@Pc(16) Class217 local16 = Static421.aClass217ArrayArrayArray5[arg0.aByte132][local2][local6];
				if (local16 != null) {
					@Pc(21) Class290 local21 = local16.aClass290_2;
					@Pc(23) Class290 local23 = null;
					while (local21 != null) {
						if (local21.aClass4_Sub2_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass290_2 = local21.aClass290_3;
							} else {
								local23.aClass290_3 = local21.aClass290_3;
							}
							local21.method6826();
							break;
						}
						local23 = local21;
						local21 = local21.aClass290_3;
					}
				}
			}
		}
		if (!arg1) {
			Static397.method5885(arg0);
		}
	}
}
