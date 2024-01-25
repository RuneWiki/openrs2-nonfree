import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
	public static int anInt4705;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_80 = new Class237(9, 6);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[II[I)V")
	public static void method3819(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg2) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) int local25 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local25;
		@Pc(39) int local39 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local39;
		@Pc(58) int local58 = ~local25 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg0; local60 < arg2; local60++) {
			if ((local60 & local58) + local25 > arg1[local60]) {
				@Pc(79) int local79 = arg1[local60];
				arg1[local60] = arg1[local21];
				arg1[local21] = local79;
				@Pc(93) int local93 = arg3[local60];
				arg3[local60] = arg3[local21];
				arg3[local21++] = local93;
			}
		}
		arg1[arg2] = arg1[local21];
		arg1[local21] = local25;
		arg3[arg2] = arg3[local21];
		arg3[local21] = local39;
		method3819(arg0, arg1, local21 - 1, arg3);
		method3819(local21 + 1, arg1, arg2, arg3);
	}
}
