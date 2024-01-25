import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!maa;")
	public static Class207 aClass207_1;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!ou;")
	public static Class250 aClass250_1;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Lclient!uga;")
	public static Class3_Sub14_Sub4 aClass3_Sub14_Sub4_3;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!ib;")
	public static Class153 aClass153_1 = new Class153(8);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII[I[I)V")
	public static void method8003(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(21) int local21 = (arg0 + arg1) / 2;
		@Pc(23) int local23 = arg0;
		@Pc(27) int local27 = arg2[local21];
		arg2[local21] = arg2[arg1];
		arg2[arg1] = local27;
		@Pc(41) int local41 = arg3[local21];
		arg3[local21] = arg3[arg1];
		arg3[arg1] = local41;
		@Pc(60) int local60 = ~local27 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg0; local62 < arg1; local62++) {
			if ((local62 & local60) + local27 > arg2[local62]) {
				@Pc(76) int local76 = arg2[local62];
				arg2[local62] = arg2[local23];
				arg2[local23] = local76;
				@Pc(90) int local90 = arg3[local62];
				arg3[local62] = arg3[local23];
				arg3[local23++] = local90;
			}
		}
		arg2[arg1] = arg2[local23];
		arg2[local23] = local27;
		arg3[arg1] = arg3[local23];
		arg3[local23] = local41;
		method8003(arg0, local23 - 1, arg2, arg3);
		method8003(local23 + 1, arg1, arg2, arg3);
	}
}
