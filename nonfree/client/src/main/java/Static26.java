import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "Lclient!kea;")
	public static Class161 aClass161_9;

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
	public static int anInt760 = 0;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!tu;IIB[I[I)Lclient!mk;")
	public static Class10_Sub2 method785(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(29) int local29;
		@Pc(39) int local39;
		@Pc(41) int local41;
		if (!arg0.method6310(Static212.aClass167_7, Static524.aClass310_16)) {
			@Pc(27) int[] local27 = new int[arg1 * arg2];
			for (local29 = 0; local29 < arg2; local29++) {
				local39 = arg1 * local29 + arg3[local29];
				for (local41 = 0; local41 < arg4[local29]; local41++) {
					local27[local39++] = -16777216;
				}
			}
			return new Class10_Sub2(arg0, arg1, arg2, local27);
		}
		@Pc(71) byte[] local71 = new byte[arg2 * arg1];
		for (local29 = 0; local29 < arg2; local29++) {
			local39 = arg1 * local29 + arg3[local29];
			for (local41 = 0; local41 < arg4[local29]; local41++) {
				local71[local39++] = -1;
			}
		}
		return new Class10_Sub2(arg0, arg1, arg2, local71);
	}
}
