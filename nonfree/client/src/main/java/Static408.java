import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([I[IIBILclient!nm;)Lclient!vi;")
	public static Class34_Sub2 method5206(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class164_Sub1 arg4) {
		@Pc(4) byte[] local4 = new byte[arg3 * arg2];
		for (@Pc(14) int local14 = 0; local14 < arg3; local14++) {
			@Pc(26) int local26 = local14 * arg2 + arg1[local14];
			for (@Pc(28) int local28 = 0; local28 < arg0[local14]; local28++) {
				local4[local26++] = -1;
			}
		}
		return new Class34_Sub2(arg4, arg2, arg3, local4);
	}
}
