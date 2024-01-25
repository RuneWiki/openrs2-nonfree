import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
	public static int anInt6211 = -1;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!qda;Z)V")
	public static void method5157(@OriginalArg(0) Class6_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort85; local2 <= arg0.aShort86; local2++) {
			for (@Pc(6) int local6 = arg0.aShort83; local6 <= arg0.aShort84; local6++) {
				@Pc(16) Class346 local16 = Static389.aClass346ArrayArrayArray2[arg0.aByte112][local2][local6];
				if (local16 != null) {
					@Pc(21) Class153 local21 = local16.aClass153_3;
					@Pc(23) Class153 local23 = null;
					while (local21 != null) {
						if (local21.aClass6_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass153_3 = local21.aClass153_1;
							} else {
								local23.aClass153_1 = local21.aClass153_1;
							}
							local21.method3484();
							break;
						}
						local23 = local21;
						local21 = local21.aClass153_1;
					}
				}
			}
		}
		if (!arg1) {
			Static451.method310(arg0);
		}
	}
}
