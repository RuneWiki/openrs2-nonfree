import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_90 = new Class215(42, -1);

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "[I")
	public static final int[] anIntArray230 = new int[8];

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II[JI[I)V")
	public static void method3972(@OriginalArg(0) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg0) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) long local24 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local24;
		@Pc(38) int local38 = arg3[local18];
		arg3[local18] = arg3[arg2];
		arg3[arg2] = local38;
		@Pc(56) int local56 = local24 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg0; local58 < arg2; local58++) {
			if (arg1[local58] < local24 + (long) (local56 & local58)) {
				@Pc(80) long local80 = arg1[local58];
				arg1[local58] = arg1[local20];
				arg1[local20] = local80;
				@Pc(94) int local94 = arg3[local58];
				arg3[local58] = arg3[local20];
				arg3[local20++] = local94;
			}
		}
		arg1[arg2] = arg1[local20];
		arg1[local20] = local24;
		arg3[arg2] = arg3[local20];
		arg3[local20] = local38;
		method3972(arg0, arg1, local20 - 1, arg3);
		method3972(local20 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZIZI)V")
	public static void method3974(@OriginalArg(0) boolean arg0) {
		Static558.anInt9993 = 2;
		Static215.anInt4848 = 22050;
		Static600.aBoolean722 = arg0;
	}
}
