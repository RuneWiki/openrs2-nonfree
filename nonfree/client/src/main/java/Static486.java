import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	public static int anInt8160;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
	public static int anInt8161 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!vv;Z)V")
	public static void method7027(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort109; local2 <= arg0.aShort110; local2++) {
			for (@Pc(6) int local6 = arg0.aShort108; local6 <= arg0.aShort107; local6++) {
				@Pc(16) Class174 local16 = Static260.aClass174ArrayArrayArray2[arg0.aByte145][local2][local6];
				if (local16 != null) {
					@Pc(21) Class273 local21 = local16.aClass273_67;
					@Pc(23) Class273 local23 = null;
					while (local21 != null) {
						if (local21.aClass8_Sub1_Sub3_1 == arg0) {
							if (local23 == null) {
								local16.aClass273_67 = local21.aClass273_114;
							} else {
								local23.aClass273_114 = local21.aClass273_114;
							}
							local21.method6495();
							break;
						}
						local23 = local21;
						local21 = local21.aClass273_114;
					}
				}
			}
		}
		if (!arg1) {
			Static577.method8285(arg0);
		}
	}
}
