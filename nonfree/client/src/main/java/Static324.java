import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!js", name = "Y", descriptor = "I")
	public static int anInt5245 = 100;

	@OriginalMember(owner = "client!js", name = "X", descriptor = "I")
	public static int anInt5254 = 0;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!jca;I[I[IZ)Lclient!wm;")
	public static Class1_Sub3 method4711(@OriginalArg(0) int arg0, @OriginalArg(1) Class22_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(25) int local25;
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (!arg1.method8953(Static259.aClass167_7, Static702.aClass335_19)) {
			@Pc(83) int[] local83 = new int[arg2 * arg0];
			for (local25 = 0; local25 < arg2; local25++) {
				local36 = arg4[local25] + local25 * arg0;
				for (local38 = 0; local38 < arg3[local25]; local38++) {
					local83[local36++] = -16777216;
				}
			}
			return new Class1_Sub3(arg1, arg0, arg2, local83);
		}
		@Pc(23) byte[] local23 = new byte[arg0 * arg2];
		for (local25 = 0; local25 < arg2; local25++) {
			local36 = local25 * arg0 + arg4[local25];
			for (local38 = 0; local38 < arg3[local25]; local38++) {
				local23[local36++] = -1;
			}
		}
		return new Class1_Sub3(arg1, arg0, arg2, local23);
	}
}
