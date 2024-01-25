import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "I")
	public static int anInt524 = 0;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!za;I)V")
	public static void method423(@OriginalArg(0) Class106 arg0) {
		if (Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 != Static348.anInt6432 && (Static67.aClass252ArrayArrayArray2 != null && Static260.method3873(Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102, arg0))) {
			Static348.anInt6432 = Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I[B[BIBIIII)V")
	public static void method424(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg3++;
				arg1[local28] += arg2[arg5++];
				@Pc(40) int local40 = arg3++;
				arg1[local40] += arg2[arg5++];
				@Pc(52) int local52 = arg3++;
				arg1[local52] += arg2[arg5++];
				@Pc(64) int local64 = arg3++;
				arg1[local64] += arg2[arg5++];
			}
			for (@Pc(79) int local79 = local15; local79 < 0; local79++) {
				local28 = arg3++;
				arg1[local28] += arg2[arg5++];
			}
			arg3 += arg0;
			arg5 += arg6;
		}
	}
}
