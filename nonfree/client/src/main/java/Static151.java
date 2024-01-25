import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "[Lclient!f;")
	public static Class39[] aClass39Array5;

	@OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
	public static int anInt3037;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
	public static int anInt3033 = 2;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
	public static int anInt3036 = -1;

	@OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
	public static int anInt3043 = 500;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([[[Lclient!vf;I)V")
	public static void method2469(@OriginalArg(0) Class346[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class346[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class346 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass6_Sub1_Sub2_1 instanceof Interface24) {
							((Interface24) local27.aClass6_Sub1_Sub2_1).method7334();
						}
						if (local27.aClass6_Sub1_Sub5_1 instanceof Interface24) {
							((Interface24) local27.aClass6_Sub1_Sub5_1).method7334();
						}
						if (local27.aClass6_Sub1_Sub5_2 instanceof Interface24) {
							((Interface24) local27.aClass6_Sub1_Sub5_2).method7334();
						}
						if (local27.aClass6_Sub1_Sub3_2 instanceof Interface24) {
							((Interface24) local27.aClass6_Sub1_Sub3_2).method7334();
						}
						if (local27.aClass6_Sub1_Sub3_1 instanceof Interface24) {
							((Interface24) local27.aClass6_Sub1_Sub3_1).method7334();
						}
						for (@Pc(77) Class153 local77 = local27.aClass153_3; local77 != null; local77 = local77.aClass153_1) {
							@Pc(82) Class6_Sub1_Sub1 local82 = local77.aClass6_Sub1_Sub1_1;
							if (local82 instanceof Interface24) {
								((Interface24) local82).method7334();
							}
						}
					}
				}
			}
		}
	}
}
