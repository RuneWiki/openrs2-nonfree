import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!em;")
	public static final Class83 aClass83_65 = new Class83(78, 12);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
	public static int method2475() {
		if (Static180.aFrame5 == null) {
			return Static290.aBoolean405 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[JZ[II)V")
	public static void method2476(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg3) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) long local24 = arg1[local18];
		arg1[local18] = arg1[arg3];
		arg1[arg3] = local24;
		@Pc(38) int local38 = arg2[local18];
		arg2[local18] = arg2[arg3];
		arg2[arg3] = local38;
		@Pc(56) int local56 = local24 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg0; local58 < arg3; local58++) {
			if (local24 + (long) (local58 & local56) > arg1[local58]) {
				@Pc(79) long local79 = arg1[local58];
				arg1[local58] = arg1[local20];
				arg1[local20] = local79;
				@Pc(93) int local93 = arg2[local58];
				arg2[local58] = arg2[local20];
				arg2[local20++] = local93;
			}
		}
		arg1[arg3] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg3] = arg2[local20];
		arg2[local20] = local38;
		method2476(arg0, arg1, arg2, local20 - 1);
		method2476(local20 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
	public static void method2478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static497.method4591(arg1, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!r;I)V")
	public static void method2480(@OriginalArg(1) int arg0, @OriginalArg(2) Class78 arg1, @OriginalArg(3) int arg2) {
		Static366.aClass130ArrayArray1 = new Class130[arg2][arg0];
		Static432.aClass78_112 = arg1;
		if (Static193.anIntArray183 != null) {
			Static504.aClass209_6 = Static225.method3349(Static193.anIntArray183[3], Static193.anIntArray183[0], Static193.anIntArray183[1], Static193.anIntArray183[2], Static193.anIntArray183[5], Static193.anIntArray183[4]);
		}
		Static485.aClass130_1 = new Class130();
		Static142.method2416();
	}
}
