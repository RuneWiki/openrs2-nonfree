import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "[Lclient!vs;")
	public static Class20_Sub2[] aClass20_Sub2Array7;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(III)Z")
	public static boolean method2997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static605.method8489(arg1, arg0) || Static420.method6612(arg0, arg1);
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(III)Lclient!ng;")
	public static Class20_Sub2_Sub5 method2999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass20_Sub2_Sub5_1 == null ? null : local7.aClass20_Sub2_Sub5_1;
	}

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "(III)I")
	public static int method3000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}
}
