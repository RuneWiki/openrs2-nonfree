import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
	public static int anInt10042;

	@OriginalMember(owner = "client!vfa", name = "m", descriptor = "[Lclient!rv;")
	public static final Class5_Sub15[] aClass5_Sub15Array1 = new Class5_Sub15[2048];

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "([Ljava/lang/Object;IB[II)V")
	public static void method8367(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(17) int local17 = (arg3 + arg1) / 2;
		@Pc(19) int local19 = arg3;
		@Pc(23) int local23 = arg2[local17];
		arg2[local17] = arg2[arg1];
		arg2[arg1] = local23;
		@Pc(37) Object local37 = arg0[local17];
		arg0[local17] = arg0[arg1];
		arg0[arg1] = local37;
		@Pc(56) int local56 = ~local23 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg3; local58 < arg1; local58++) {
			if (arg2[local58] < local23 + (local58 & local56)) {
				@Pc(72) int local72 = arg2[local58];
				arg2[local58] = arg2[local19];
				arg2[local19] = local72;
				@Pc(86) Object local86 = arg0[local58];
				arg0[local58] = arg0[local19];
				arg0[local19++] = local86;
			}
		}
		arg2[arg1] = arg2[local19];
		arg2[local19] = local23;
		arg0[arg1] = arg0[local19];
		arg0[local19] = local37;
		method8367(arg0, local19 - 1, arg2, arg3);
		method8367(arg0, arg1, arg2, local19 + 1);
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V")
	public static void method8370() {
		Static365.aClass335_28.method7773();
		Static428.aClass150_8.method3097();
		Static524.aClass150_9.method3097();
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)I")
	public static int method8371(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
