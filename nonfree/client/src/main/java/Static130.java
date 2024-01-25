import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array20;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "F")
	public static float aFloat206;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "[I")
	public static final int[] anIntArray520 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
	public static void method6495() {
		if (!Static22.aBoolean43) {
			return;
		}
		@Pc(11) Class365 local11 = Static583.method7803(Static365.anInt6484, Static39.anInt1026);
		if (local11 != null && local11.anObjectArray19 != null) {
			@Pc(20) Class1_Sub2 local20 = new Class1_Sub2();
			local20.aClass365_1 = local11;
			local20.anObjectArray1 = local11.anObjectArray19;
			Static145.method2353(local20);
		}
		Static325.anInt9473 = -1;
		Static22.aBoolean43 = false;
		Static141.anInt2722 = -1;
		if (local11 != null) {
			Static201.method5537(local11);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)Lclient!pfa;")
	public static Class254 method6496(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static498.aClass254Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "([Ljava/lang/Object;III[J)V")
	public static void method6499(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg2) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) long local24 = arg3[local18];
		arg3[local18] = arg3[arg1];
		arg3[arg1] = local24;
		@Pc(38) Object local38 = arg0[local18];
		arg0[local18] = arg0[arg1];
		arg0[arg1] = local38;
		@Pc(56) int local56 = local24 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg2; local58 < arg1; local58++) {
			if (arg3[local58] < (long) (local58 & local56) + local24) {
				@Pc(79) long local79 = arg3[local58];
				arg3[local58] = arg3[local20];
				arg3[local20] = local79;
				@Pc(93) Object local93 = arg0[local58];
				arg0[local58] = arg0[local20];
				arg0[local20++] = local93;
			}
		}
		arg3[arg1] = arg3[local20];
		arg3[local20] = local24;
		arg0[arg1] = arg0[local20];
		arg0[local20] = local38;
		method6499(arg0, local20 - 1, arg2, arg3);
		method6499(arg0, arg1, local20 + 1, arg3);
	}
}
