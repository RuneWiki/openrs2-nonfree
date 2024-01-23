import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "[I")
	public static int[] anIntArray534;

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	public static int anInt4695;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
	public static int anInt4696 = 0;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "[I")
	public static int[] anIntArray535 = new int[2500];

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
	public static int anInt4699 = 0;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
	public static int anInt4700 = 0;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	public static int anInt4701 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIII)V")
	public static void method3589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg3;
		@Pc(14) int local14 = arg2 - arg0;
		if (local14 == 0) {
			if (local10 != 0) {
				Static48.method844(arg0, arg3, arg1, arg4);
			}
		} else if (local10 == 0) {
			Static155.method2389(arg2, arg4, arg3, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(69) boolean local69 = local14 < local10;
			@Pc(73) int local73;
			@Pc(75) int local75;
			if (local69) {
				local73 = arg0;
				local75 = arg2;
				arg2 = arg1;
				arg0 = arg3;
				arg3 = local73;
				arg1 = local75;
			}
			if (arg0 > arg2) {
				local73 = arg0;
				arg0 = arg2;
				arg2 = local73;
				local75 = arg3;
				arg3 = arg1;
				arg1 = local75;
			}
			local73 = arg3;
			@Pc(111) int local111 = arg1 - arg3;
			if (local111 < 0) {
				local111 = -local111;
			}
			local75 = arg2 - arg0;
			@Pc(126) int local126 = -(local75 >> 1);
			@Pc(137) int local137 = arg3 >= arg1 ? -1 : 1;
			@Pc(141) int local141;
			if (local69) {
				for (local141 = arg0; local141 <= arg2; local141++) {
					local126 += local111;
					Static151.anIntArrayArray26[local141][local73] = arg4;
					if (local126 > 0) {
						local73 += local137;
						local126 -= local75;
					}
				}
			} else {
				for (local141 = arg0; local141 <= arg2; local141++) {
					local126 += local111;
					Static151.anIntArrayArray26[local73][local141] = arg4;
					if (local126 > 0) {
						local73 += local137;
						local126 -= local75;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILclient!qi;Z)V")
	public static void method3590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub6_Sub1 arg2) {
		if (arg1 == arg2.anInt4572 && arg1 != -1) {
			@Pc(27) Class133 local27 = Static262.method4031(arg1);
			@Pc(30) int local30 = local27.anInt4021;
			if (local30 == 1) {
				arg2.anInt4557 = 0;
				arg2.anInt4570 = 0;
				arg2.anInt4506 = arg0;
				arg2.anInt4549 = 1;
				arg2.anInt4516 = 0;
				Static128.method1976(false, local27, arg2.anInt4569, arg2.anInt4570, arg2.anInt4562);
			}
			if (local30 == 2) {
				arg2.anInt4557 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt4572 == -1 || Static262.method4031(arg1).anInt4013 >= Static262.method4031(arg2.anInt4572).anInt4013) {
			arg2.anInt4549 = 1;
			arg2.anInt4516 = 0;
			arg2.anInt4581 = arg2.anInt4558;
			arg2.anInt4557 = 0;
			arg2.anInt4506 = arg0;
			arg2.anInt4570 = 0;
			arg2.anInt4572 = arg1;
			if (arg2.anInt4572 != -1) {
				Static128.method1976(false, Static262.method4031(arg2.anInt4572), arg2.anInt4569, arg2.anInt4570, arg2.anInt4562);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)I")
	public static int method3591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local13 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local13;
		} else {
			return local13;
		}
	}
}
