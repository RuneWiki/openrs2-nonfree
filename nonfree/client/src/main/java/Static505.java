import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!r;")
	public static Class45 aClass45_11;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "[I")
	public static int[] anIntArray524;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
	public static int anInt8213;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
	public static int anInt8220;

	@OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
	public static int anInt8221;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "Z")
	public static boolean aBoolean625 = false;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)V")
	public static void method6817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class299 local28 = Static309.aClass299ArrayArrayArray3[local9][arg0][arg1] = Static309.aClass299ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class38 local33 = local28.aClass38_2; local33 != null; local33 = local33.aClass38_1) {
					@Pc(37) Class41_Sub2_Sub1 local37 = local33.aClass41_Sub2_Sub1_1;
					if (local37.aShort147 == arg0 && local37.aShort144 == arg1) {
						local37.aByte117--;
					}
				}
				if (local28.aClass41_Sub2_Sub5_1 != null) {
					local28.aClass41_Sub2_Sub5_1.aByte117--;
				}
				if (local28.aClass41_Sub2_Sub3_1 != null) {
					local28.aClass41_Sub2_Sub3_1.aByte117--;
				}
				if (local28.aClass41_Sub2_Sub3_2 != null) {
					local28.aClass41_Sub2_Sub3_2.aByte117--;
				}
				if (local28.aClass41_Sub2_Sub2_2 != null) {
					local28.aClass41_Sub2_Sub2_2.aByte117--;
				}
				if (local28.aClass41_Sub2_Sub2_1 != null) {
					local28.aClass41_Sub2_Sub2_1.aByte117--;
				}
			}
		}
		if (Static309.aClass299ArrayArrayArray3[0][arg0][arg1] == null) {
			Static309.aClass299ArrayArrayArray3[0][arg0][arg1] = new Class299(0);
			Static309.aClass299ArrayArrayArray3[0][arg0][arg1].aByte101 = 1;
		}
		Static309.aClass299ArrayArrayArray3[0][arg0][arg1].aClass299_1 = local7;
		Static309.aClass299ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I")
	public static int method6820() {
		return Static143.aClass275_1.method6102();
	}
}
