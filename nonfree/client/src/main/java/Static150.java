import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!et", name = "b", descriptor = "I")
	public static int anInt2409;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!co;ILclient!ha;ILclient!hg;IIBLclient!sb;)V")
	public static void method2110(@OriginalArg(0) Class5_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class158 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class315 arg7) {
		@Pc(21) int local21 = arg5 - arg1 / 2 - 5;
		@Pc(25) int local25 = arg6 + 2;
		if (arg7.anInt8889 != 0) {
			arg2.method7731(arg7.anInt8889, local21, arg3 * arg4.method3128() + arg6 + 1 - local25, arg1 + 10, local25);
		}
		if (arg7.anInt8894 != 0) {
			arg2.method7723(local21, arg3 * arg4.method3128() + arg6 + 1 - local25, arg7.anInt8894, arg1 + 10, local25);
		}
		@Pc(82) int local82 = arg7.anInt8886;
		if (arg0.aBoolean141 && arg7.anInt8902 != -1) {
			local82 = arg7.anInt8902;
		}
		for (@Pc(97) int local97 = 0; local97 < arg3; local97++) {
			@Pc(103) String local103 = Static433.aStringArray51[local97];
			if (arg3 - 1 > local97) {
				local103 = local103.substring(0, local103.length() - 4);
			}
			arg4.method3131(arg2, local103, arg5, arg6, local82);
			arg6 += arg4.method3128();
		}
	}
}
