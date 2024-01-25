import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "Lclient!ch;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_55 = new Class40("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!gp;B)Lclient!dba;")
	public static Class5_Sub9 method3048(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1) {
		@Pc(8) byte[] local8 = arg1.method2964(arg0);
		return local8 == null ? null : new Class5_Sub9(local8);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II[I[JI)V")
	public static void method3051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) long[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg1) / 2;
		@Pc(25) int local25 = arg0;
		@Pc(29) long local29 = arg3[local23];
		arg3[local23] = arg3[arg1];
		arg3[arg1] = local29;
		@Pc(43) int local43 = arg2[local23];
		arg2[local23] = arg2[arg1];
		arg2[arg1] = local43;
		@Pc(61) int local61 = local29 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg0; local63 < arg1; local63++) {
			if ((long) (local61 & local63) + local29 > arg3[local63]) {
				@Pc(80) long local80 = arg3[local63];
				arg3[local63] = arg3[local25];
				arg3[local25] = local80;
				@Pc(94) int local94 = arg2[local63];
				arg2[local63] = arg2[local25];
				arg2[local25++] = local94;
			}
		}
		arg3[arg1] = arg3[local25];
		arg3[local25] = local29;
		arg2[arg1] = arg2[local25];
		arg2[local25] = local43;
		method3051(arg0, local25 - 1, arg2, arg3);
		method3051(local25 + 1, arg1, arg2, arg3);
	}
}
