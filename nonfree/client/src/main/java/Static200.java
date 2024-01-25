import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "F")
	public static float aFloat83;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_19 = new Class130();

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "Z")
	public static boolean aBoolean316 = true;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(FB)F")
	public static float method3625(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBII)V")
	public static void method3626(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1004) {
			Static149.method2775(Static555.aClass318_8, arg0, arg1);
		} else if (arg2 == 1008) {
			Static149.method2775(Static488.aClass318_6, arg0, arg1);
		} else if (arg2 == 1003) {
			Static149.method2775(Static547.aClass318_7, arg0, arg1);
		} else if (arg2 == 1009) {
			Static149.method2775(Static578.aClass318_9, arg0, arg1);
		} else if (arg2 == 1002) {
			Static149.method2775(Static34.aClass318_2, arg0, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!vr;Z)V")
	public static void method3627(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort112; local2 <= arg0.aShort114; local2++) {
			for (@Pc(6) int local6 = arg0.aShort115; local6 <= arg0.aShort113; local6++) {
				@Pc(16) Class63 local16 = Static554.aClass63ArrayArrayArray4[arg0.aByte126][local2][local6];
				if (local16 != null) {
					@Pc(21) Class16 local21 = local16.aClass16_3;
					@Pc(23) Class16 local23 = null;
					while (local21 != null) {
						if (local21.aClass9_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass16_3 = local21.aClass16_1;
							} else {
								local23.aClass16_1 = local21.aClass16_1;
							}
							local21.method446();
							break;
						}
						local23 = local21;
						local21 = local21.aClass16_1;
					}
				}
			}
		}
		if (!arg1) {
			Static251.method4061(arg0);
		}
	}
}
