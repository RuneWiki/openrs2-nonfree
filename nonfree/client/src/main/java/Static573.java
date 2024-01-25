import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!wba", name = "n", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_101 = new Class303(81, -1);

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
	public static void method7702() {
		Static532.aClass3_Sub11_Sub1_2.method1384();
		@Pc(13) int local13 = Static532.aClass3_Sub11_Sub1_2.method1383(8);
		@Pc(18) int local18;
		if (Static88.anInt1884 > local13) {
			for (local18 = local13; local18 < Static88.anInt1884; local18++) {
				Static471.anIntArray498[Static212.anInt3826++] = Static445.anIntArray470[local18];
			}
		}
		if (Static88.anInt1884 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static88.anInt1884 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(56) int local56 = Static445.anIntArray470[local18];
			@Pc(66) Class41_Sub2_Sub1_Sub4_Sub1 local66 = ((Class3_Sub34) Static213.aClass354_37.method7689((long) local56)).aClass41_Sub2_Sub1_Sub4_Sub1_2;
			@Pc(71) int local71 = Static532.aClass3_Sub11_Sub1_2.method1383(1);
			if (local71 == 0) {
				Static445.anIntArray470[Static88.anInt1884++] = local56;
				local66.anInt9487 = Static506.anInt8251;
			} else {
				@Pc(91) int local91 = Static532.aClass3_Sub11_Sub1_2.method1383(2);
				if (local91 == 0) {
					Static445.anIntArray470[Static88.anInt1884++] = local56;
					local66.anInt9487 = Static506.anInt8251;
					Static70.anIntArray70[Static596.anInt9773++] = local56;
				} else {
					@Pc(135) int local135;
					@Pc(147) int local147;
					if (local91 == 1) {
						Static445.anIntArray470[Static88.anInt1884++] = local56;
						local66.anInt9487 = Static506.anInt8251;
						local135 = Static532.aClass3_Sub11_Sub1_2.method1383(3);
						local66.method5655(local135, 1);
						local147 = Static532.aClass3_Sub11_Sub1_2.method1383(1);
						if (local147 == 1) {
							Static70.anIntArray70[Static596.anInt9773++] = local56;
						}
					} else if (local91 == 2) {
						Static445.anIntArray470[Static88.anInt1884++] = local56;
						local66.anInt9487 = Static506.anInt8251;
						if (Static532.aClass3_Sub11_Sub1_2.method1383(1) == 1) {
							local135 = Static532.aClass3_Sub11_Sub1_2.method1383(3);
							local66.method5655(local135, 2);
							local147 = Static532.aClass3_Sub11_Sub1_2.method1383(3);
							local66.method5655(local147, 2);
						} else {
							local135 = Static532.aClass3_Sub11_Sub1_2.method1383(3);
							local66.method5655(local135, 0);
						}
						local135 = Static532.aClass3_Sub11_Sub1_2.method1383(1);
						if (local135 == 1) {
							Static70.anIntArray70[Static596.anInt9773++] = local56;
						}
					} else if (local91 == 3) {
						Static471.anIntArray498[Static212.anInt3826++] = local56;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I[Ljava/lang/Object;II[J)V")
	public static void method7706(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg1) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) long local25 = arg3[local19];
		arg3[local19] = arg3[arg1];
		arg3[arg1] = local25;
		@Pc(39) Object local39 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local39;
		@Pc(59) int local59 = ~local25 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg2; local61 < arg1; local61++) {
			if (arg3[local61] < (long) (local59 & local61) + local25) {
				@Pc(82) long local82 = arg3[local61];
				arg3[local61] = arg3[local21];
				arg3[local21] = local82;
				@Pc(96) Object local96 = arg0[local61];
				arg0[local61] = arg0[local21];
				arg0[local21++] = local96;
			}
		}
		arg3[arg1] = arg3[local21];
		arg3[local21] = local25;
		arg0[arg1] = arg0[local21];
		arg0[local21] = local39;
		method7706(arg0, local21 - 1, arg2, arg3);
		method7706(arg0, arg1, local21 + 1, arg3);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BZIIZ)I")
	public static int method7707(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class3_Sub45 local10 = Static162.method826(arg1, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray511.length; local23++) {
			if (local10.anIntArray511[local23] >= 0 && local10.anIntArray511[local23] < Static6.aClass92_1.anInt2968) {
				@Pc(48) Class197 local48 = Static6.aClass92_1.method2673(local10.anIntArray511[local23]);
				@Pc(58) int local58 = local48.method4527(Static137.aClass124_1.method3255(arg2).anInt193, arg2);
				if (arg0) {
					local16 += local10.anIntArray510[local23] * local58;
				} else {
					local16 += local58;
				}
			}
		}
		return local16;
	}
}
