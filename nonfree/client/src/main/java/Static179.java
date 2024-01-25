import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
	public static final boolean aBoolean322 = false;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static374.method7975(arg0, arg1) | (arg0 & 0x800) != 0 || Static290.method5003(arg1, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!lr;Z)V")
	public static void method3382(@OriginalArg(0) Class9_Sub4_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort115; local2 <= arg0.aShort117; local2++) {
			for (@Pc(6) int local6 = arg0.aShort114; local6 <= arg0.aShort116; local6++) {
				@Pc(16) Class186 local16 = Static26.aClass186ArrayArrayArray1[arg0.aByte135][local2][local6];
				if (local16 != null) {
					@Pc(21) Class168 local21 = local16.aClass168_3;
					@Pc(23) Class168 local23 = null;
					while (local21 != null) {
						if (local21.aClass9_Sub4_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass168_3 = local21.aClass168_2;
							} else {
								local23.aClass168_2 = local21.aClass168_2;
							}
							local21.method5024();
							break;
						}
						local23 = local21;
						local21 = local21.aClass168_2;
					}
				}
			}
		}
		if (!arg1) {
			Static248.method4430(arg0);
		}
	}
}
