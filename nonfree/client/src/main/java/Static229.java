import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
	public static int anInt4405;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "Lclient!lk;")
	public static Class203 aClass203_76;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "[I")
	public static final int[] anIntArray355 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[[[Lclient!df;)V")
	public static void method3895(@OriginalArg(1) Class63[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class63[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class63 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass9_Sub1_Sub3_1 instanceof Interface22) {
							((Interface22) local27.aClass9_Sub1_Sub3_1).method7090();
						}
						if (local27.aClass9_Sub1_Sub2_1 instanceof Interface22) {
							((Interface22) local27.aClass9_Sub1_Sub2_1).method7090();
						}
						if (local27.aClass9_Sub1_Sub2_2 instanceof Interface22) {
							((Interface22) local27.aClass9_Sub1_Sub2_2).method7090();
						}
						if (local27.aClass9_Sub1_Sub4_1 instanceof Interface22) {
							((Interface22) local27.aClass9_Sub1_Sub4_1).method7090();
						}
						if (local27.aClass9_Sub1_Sub4_2 instanceof Interface22) {
							((Interface22) local27.aClass9_Sub1_Sub4_2).method7090();
						}
						for (@Pc(77) Class16 local77 = local27.aClass16_3; local77 != null; local77 = local77.aClass16_1) {
							@Pc(82) Class9_Sub1_Sub1 local82 = local77.aClass9_Sub1_Sub1_1;
							if (local82 instanceof Interface22) {
								((Interface22) local82).method7090();
							}
						}
					}
				}
			}
		}
	}
}
