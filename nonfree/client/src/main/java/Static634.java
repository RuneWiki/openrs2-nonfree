import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_97 = new Class269(74, 4);

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "Lclient!mp;")
	public static final Class222 aClass222_44 = new Class222(16);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([IIII[I)V")
	public static void method8501(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(17) int local17 = (arg2 + arg1) / 2;
		@Pc(19) int local19 = arg1;
		@Pc(23) int local23 = arg3[local17];
		arg3[local17] = arg3[arg2];
		arg3[arg2] = local23;
		@Pc(37) int local37 = arg0[local17];
		arg0[local17] = arg0[arg2];
		arg0[arg2] = local37;
		@Pc(56) int local56 = ~local23 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg1; local58 < arg2; local58++) {
			if (arg3[local58] < (local56 & local58) + local23) {
				@Pc(76) int local76 = arg3[local58];
				arg3[local58] = arg3[local19];
				arg3[local19] = local76;
				@Pc(90) int local90 = arg0[local58];
				arg0[local58] = arg0[local19];
				arg0[local19++] = local90;
			}
		}
		arg3[arg2] = arg3[local19];
		arg3[local19] = local23;
		arg0[arg2] = arg0[local19];
		arg0[local19] = local37;
		method8501(arg0, arg1, local19 - 1, arg3);
		method8501(arg0, local19 + 1, arg2, arg3);
	}
}
