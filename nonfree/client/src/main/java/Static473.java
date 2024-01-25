import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "F")
	public static float aFloat178;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "[I")
	public static final int[] anIntArray522 = new int[4];

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "([[[Lclient!ffa;I)V")
	public static void method7148(@OriginalArg(0) Class97[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(19) Class97[][] local19 = arg0[local7];
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				for (@Pc(25) int local25 = 0; local25 < local19[local21].length; local25++) {
					@Pc(33) Class97 local33 = local19[local21][local25];
					if (local33 != null) {
						if (local33.aClass20_Sub2_Sub5_1 instanceof Interface12) {
							((Interface12) local33.aClass20_Sub2_Sub5_1).method9031();
						}
						if (local33.aClass20_Sub2_Sub3_2 instanceof Interface12) {
							((Interface12) local33.aClass20_Sub2_Sub3_2).method9031();
						}
						if (local33.aClass20_Sub2_Sub3_1 instanceof Interface12) {
							((Interface12) local33.aClass20_Sub2_Sub3_1).method9031();
						}
						if (local33.aClass20_Sub2_Sub1_1 instanceof Interface12) {
							((Interface12) local33.aClass20_Sub2_Sub1_1).method9031();
						}
						if (local33.aClass20_Sub2_Sub1_2 instanceof Interface12) {
							((Interface12) local33.aClass20_Sub2_Sub1_2).method9031();
						}
						for (@Pc(83) Class196 local83 = local33.aClass196_2; local83 != null; local83 = local83.aClass196_3) {
							@Pc(88) Class20_Sub2_Sub2 local88 = local83.aClass20_Sub2_Sub2_1;
							if (local88 instanceof Interface12) {
								((Interface12) local88).method9031();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method7152(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
