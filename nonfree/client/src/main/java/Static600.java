import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!via", name = "d", descriptor = "Lclient!ha;")
	public static Class133 aClass133_15;

	@OriginalMember(owner = "client!via", name = "b", descriptor = "[I")
	public static final int[] anIntArray575 = new int[3];

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(III)Z")
	public static boolean method8610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static42.method751(arg1, arg0) || Static180.method2777(arg1, arg0);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!pj;[III[II)Lclient!sea;")
	public static Class1_Sub3 method8611(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(22) int local22;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (!arg0.method6263(Static20.aClass19_4, Static356.aClass223_12)) {
			@Pc(64) int[] local64 = new int[arg4 * arg2];
			for (local22 = 0; local22 < arg4; local22++) {
				local32 = local22 * arg2 + arg1[local22];
				for (local34 = 0; local34 < arg3[local22]; local34++) {
					local64[local32++] = -16777216;
				}
			}
			return new Class1_Sub3(arg0, arg2, arg4, local64);
		}
		@Pc(20) byte[] local20 = new byte[arg2 * arg4];
		for (local22 = 0; local22 < arg4; local22++) {
			local32 = arg1[local22] + local22 * arg2;
			for (local34 = 0; local34 < arg3[local22]; local34++) {
				local20[local32++] = -1;
			}
		}
		return new Class1_Sub3(arg0, arg2, arg4, local20);
	}
}
