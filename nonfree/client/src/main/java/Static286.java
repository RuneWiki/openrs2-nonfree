import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!ok", name = "G", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!ok", name = "H", descriptor = "Lclient!l;")
	public static Class95 aClass95_12;

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
	public static int anInt4715;

	@OriginalMember(owner = "client!ok", name = "I", descriptor = "Lclient!hd;")
	public static Class110 aClass110_13 = null;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[JI[Ljava/lang/Object;)V")
	public static void method3748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(11) int local11 = (arg1 + arg0) / 2;
		@Pc(13) int local13 = arg1;
		@Pc(17) long local17 = arg2[local11];
		arg2[local11] = arg2[arg0];
		arg2[arg0] = local17;
		@Pc(31) Object local31 = arg3[local11];
		arg3[local11] = arg3[arg0];
		arg3[arg0] = local31;
		@Pc(51) int local51 = ~local17 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg1; local53 < arg0; local53++) {
			if (arg2[local53] < (long) (local51 & local53) + local17) {
				@Pc(74) long local74 = arg2[local53];
				arg2[local53] = arg2[local13];
				arg2[local13] = local74;
				@Pc(88) Object local88 = arg3[local53];
				arg3[local53] = arg3[local13];
				arg3[local13++] = local88;
			}
		}
		arg2[arg0] = arg2[local13];
		arg2[local13] = local17;
		arg3[arg0] = arg3[local13];
		arg3[local13] = local31;
		method3748(local13 - 1, arg1, arg2, arg3);
		method3748(arg0, local13 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZIII)V")
	public static void method3749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > arg3) {
			Static249.method6044(Static267.anIntArrayArray50[arg2], arg0, arg1, arg3);
		} else {
			Static249.method6044(Static267.anIntArrayArray50[arg2], arg0, arg3, arg1);
		}
	}
}
