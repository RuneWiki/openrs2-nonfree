import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
	public static int anInt497;

	@OriginalMember(owner = "client!bea", name = "u", descriptor = "[I")
	public static int[] anIntArray36;

	@OriginalMember(owner = "client!bea", name = "p", descriptor = "[I")
	public static final int[] anIntArray35 = new int[1];

	@OriginalMember(owner = "client!bea", name = "s", descriptor = "I")
	public static int anInt498 = 0;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "()V")
	public static void method485() {
		for (@Pc(1) int local1 = Static265.anInt5019; local1 < Static66.anInt802; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static230.anInt4470; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static63.anInt777; local7++) {
					@Pc(16) Class243 local16 = Static334.aClass243ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class60_Sub1_Sub3 local21 = local16.aClass60_Sub1_Sub3_1;
						@Pc(24) Class60_Sub1_Sub3 local24 = local16.aClass60_Sub1_Sub3_2;
						if (local21 != null && local21.method7914()) {
							Static687.method8625(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7914()) {
								Static687.method8625(local24, local1, local4, local7, 1, 1);
								local24.method7915(0, 0, local21, false, 0, Static277.aClass75_7);
								local24.method7917();
							}
							local21.method7917();
						}
						for (@Pc(76) Class123 local76 = local16.aClass123_5; local76 != null; local76 = local76.aClass123_1) {
							@Pc(80) Class60_Sub1_Sub1 local80 = local76.aClass60_Sub1_Sub1_1;
							if (local80 != null && local80.method7914()) {
								Static687.method8625(local80, local1, local4, local7, local80.aShort101 + 1 - local80.aShort100, local80.aShort99 - local80.aShort102 + 1);
								local80.method7917();
							}
						}
						@Pc(120) Class60_Sub1_Sub2 local120 = local16.aClass60_Sub1_Sub2_1;
						if (local120 != null && local120.method7914()) {
							Static558.method7887(local120, local1, local4, local7);
							local120.method7917();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Z")
	public static boolean method486(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(Z)Z")
	public static boolean method488() {
		return Static539.anInt8776 > 0;
	}
}
