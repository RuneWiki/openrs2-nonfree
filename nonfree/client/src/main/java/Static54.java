import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "Lclient!bc;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "Lclient!jj;")
	public static final Class108 aClass108_7 = new Class108(8);

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString43 = "Loaded config";

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([IIII[J)V")
	public static void method943(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg1 + arg2) / 2;
		@Pc(24) int local24 = arg2;
		@Pc(28) long local28 = arg3[local22];
		arg3[local22] = arg3[arg1];
		arg3[arg1] = local28;
		@Pc(42) int local42 = arg0[local22];
		arg0[local22] = arg0[arg1];
		arg0[arg1] = local42;
		for (@Pc(54) int local54 = arg2; local54 < arg1; local54++) {
			if (local28 + (long) (local54 & 0x1) > arg3[local54]) {
				@Pc(72) long local72 = arg3[local54];
				arg3[local54] = arg3[local24];
				arg3[local24] = local72;
				@Pc(86) int local86 = arg0[local54];
				arg0[local54] = arg0[local24];
				arg0[local24++] = local86;
			}
		}
		arg3[arg1] = arg3[local24];
		arg3[local24] = local28;
		arg0[arg1] = arg0[local24];
		arg0[local24] = local42;
		method943(arg0, local24 - 1, arg2, arg3);
		method943(arg0, arg1, local24 + 1, arg3);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIIII)V")
	public static void method944(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static76.aLong100 = 0L;
		@Pc(13) int local13 = Static137.method2629();
		if (arg2 == 3 || local13 == 3) {
			arg0 = true;
		}
		if (!Static289.aClass81_7.method2986()) {
			arg0 = true;
		}
		Static17.method5612(arg2, local13, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
	public static void method945() {
		@Pc(13) byte local13 = 0;
		if (Static194.aBoolean277) {
			local13 = 55;
		}
		Static346.method5702(local13);
		Static265.method4492(local13);
		Static217.method3879(local13);
		Static282.method4849(local13);
		Static203.method3668(local13);
		Static230.method4094(local13);
		Static215.method3841(local13);
		Static227.method4059(local13);
		Static302.method5196(local13);
		if (Static129.anInt2374 == 10) {
			Static290.method4952(28);
		} else if (Static129.anInt2374 == 30) {
			Static290.method4952(25);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ja;IIIILclient!c;B)V")
	public static void method947(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class27 arg6) {
		@Pc(5) Interface7 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface7) Static9.method161(arg5, arg4, arg2);
		}
		if (arg0 == 1) {
			local5 = (Interface7) Static105.method2135(arg5, arg4, arg2);
		}
		if (arg0 == 2) {
			local5 = (Interface7) Static162.method3236(arg5, arg4, arg2, sc.class);
		}
		if (arg0 == 3) {
			local5 = (Interface7) Static68.method4012(arg5, arg4, arg2);
		}
		if (local5 == null) {
			return;
		}
		@Pc(63) int local63 = local5.method5795();
		@Pc(67) int local67 = local5.method5793();
		@Pc(73) Class66 local73 = Static196.method3622(local5.method5799());
		if (local73.method1374()) {
			Static242.method4246(arg2, arg5, arg4, local73);
		}
		if (local5.method5798()) {
			local5.method5796(arg1);
		}
		if (arg0 == 0) {
			Static183.method3472(arg5, arg4, arg2);
			if (local73.anInt1486 != 0) {
				arg6.method525(local67, !local73.aBoolean106, arg4, arg2, local63, local73.aBoolean101);
				return;
			}
			return;
		}
		if (arg0 == 1) {
			Static185.method5766(arg5, arg4, arg2);
			return;
		}
		if (arg0 == 2) {
			Static299.method5136(arg5, arg4, arg2, sc.class);
			if (local73.anInt1486 != 0 && Static153.anInt2883 > arg4 + local73.anInt1489 && Static246.anInt4606 > arg2 + local73.anInt1489 && Static153.anInt2883 > arg4 + local73.lb && Static246.anInt4606 > arg2 + local73.lb) {
				arg6.method519(arg2, arg4, local67, local73.aBoolean101, local73.lb, local73.anInt1489, !local73.aBoolean106);
				return;
			}
			return;
		}
		if (arg0 != 3) {
			return;
		}
		Static215.method3842(arg5, arg4, arg2);
		if (local73.anInt1486 == 1) {
			arg6.method516(arg4, arg2);
			return;
		}
	}
}
