import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
	public static int anInt1356;

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
	public static int anInt1355 = 0;

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "Z")
	public static boolean aBoolean88 = true;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ar;Z)V")
	public static void method1388(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort124; local2 <= arg0.aShort123; local2++) {
			for (@Pc(6) int local6 = arg0.aShort125; local6 <= arg0.aShort122; local6++) {
				@Pc(16) Class73 local16 = Static267.aClass73ArrayArrayArray2[arg0.aByte141][local2][local6];
				if (local16 != null) {
					@Pc(21) Class144 local21 = local16.aClass144_1;
					@Pc(23) Class144 local23 = null;
					while (local21 != null) {
						if (local21.aClass3_Sub1_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass144_1 = local21.aClass144_2;
							} else {
								local23.aClass144_2 = local21.aClass144_2;
							}
							local21.method3125();
							break;
						}
						local23 = local21;
						local21 = local21.aClass144_2;
					}
				}
			}
		}
		if (!arg1) {
			Static499.method6774(arg0);
		}
	}
}
