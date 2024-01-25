import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
	public static int anInt5456;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!caa;)V")
	public static void method4715(@OriginalArg(0) Class12_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static313.anIntArray359[local4]; local7++) {
				if (Static146.aClass12_Sub2ArrayArray1[local4][local7] == arg0) {
					Static598.method4266(Static146.aClass12_Sub2ArrayArray1[local4], local7 + 1, Static146.aClass12_Sub2ArrayArray1[local4], local7, Static313.anIntArray359[local4] - local7 - 1);
					local37 = Static313.anIntArray359[local4]--;
					return;
				}
			}
			for (@Pc(49) int local49 = 0; local49 < Static503.anIntArray540[local4]; local49++) {
				if (Static310.aClass12_Sub2ArrayArray2[local4][local49] == arg0) {
					Static598.method4266(Static310.aClass12_Sub2ArrayArray2[local4], local49 + 1, Static310.aClass12_Sub2ArrayArray2[local4], local49, Static503.anIntArray540[local4] - local49 - 1);
					local37 = Static503.anIntArray540[local4]--;
					return;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < Static535.anIntArray577[local4]; local91++) {
				if (Static585.aClass12_Sub2ArrayArray3[local4][local91] == arg0) {
					Static598.method4266(Static585.aClass12_Sub2ArrayArray3[local4], local91 + 1, Static585.aClass12_Sub2ArrayArray3[local4], local91, Static535.anIntArray577[local4] - local91 - 1);
					local37 = Static535.anIntArray577[local4]--;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V")
	public static void method4716() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static281.anInt4822; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static29.anInt491; local13++) {
				if (Static145.method1995(true, local7, local13, local9, Static469.aClass228ArrayArrayArray6)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
