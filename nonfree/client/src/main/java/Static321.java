import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIBIII)V")
	public static void method1016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static38.anInt553 || Static197.anInt4298 > arg3) {
			return;
		}
		@Pc(35) boolean local35;
		if (Static108.anInt2266 > arg2) {
			local35 = false;
			arg2 = Static108.anInt2266;
		} else if (Static205.anInt4504 >= arg2) {
			local35 = true;
		} else {
			local35 = false;
			arg2 = Static205.anInt4504;
		}
		@Pc(54) boolean local54;
		if (Static108.anInt2266 > arg1) {
			arg1 = Static108.anInt2266;
			local54 = false;
		} else if (arg1 > Static205.anInt4504) {
			arg1 = Static205.anInt4504;
			local54 = false;
		} else {
			local54 = true;
		}
		if (Static197.anInt4298 > arg0) {
			arg0 = Static197.anInt4298;
		} else {
			Static115.method2278(Static364.anIntArrayArray57[arg0++], arg1, arg4, arg2);
		}
		if (Static38.anInt553 < arg3) {
			arg3 = Static38.anInt553;
		} else {
			Static115.method2278(Static364.anIntArrayArray57[arg3--], arg1, arg4, arg2);
		}
		@Pc(109) int local109;
		if (local35 && local54) {
			for (local109 = arg0; local109 <= arg3; local109++) {
				@Pc(115) int[] local115 = Static364.anIntArrayArray57[local109];
				local115[arg2] = local115[arg1] = arg4;
			}
		} else if (local35) {
			for (local109 = arg0; local109 <= arg3; local109++) {
				Static364.anIntArrayArray57[local109][arg2] = arg4;
			}
		} else if (local54) {
			for (local109 = arg0; local109 <= arg3; local109++) {
				Static364.anIntArrayArray57[local109][arg1] = arg4;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!fh;II)I")
	public static int method1017(@OriginalArg(0) Class68 arg0, @OriginalArg(2) int arg1) {
		if (!Static46.method890(arg0).method5642(arg1) && arg0.anObjectArray18 == null) {
			return -1;
		} else if (arg0.anIntArray143 == null || arg0.anIntArray143.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray143[arg1];
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V")
	public static void method1018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg1;
		@Pc(10) int local10 = -arg1;
		@Pc(12) int local12 = -1;
		@Pc(20) int local20 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg1 + arg0);
		@Pc(30) int local30 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg0 - arg1);
		Static115.method2278(Static364.anIntArrayArray57[arg2], local20, arg3, local30);
		while (local5 < local7) {
			local12 += 2;
			local10 += local12;
			@Pc(63) int local63;
			@Pc(67) int local67;
			@Pc(89) int local89;
			@Pc(99) int local99;
			if (local10 > 0) {
				local7--;
				local10 -= local7 << 1;
				local63 = arg2 - local7;
				local67 = local7 + arg2;
				if (Static197.anInt4298 <= local67 && Static38.anInt553 >= local63) {
					local89 = Static12.method187(Static108.anInt2266, Static205.anInt4504, local5 + arg0);
					local99 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg0 - local5);
					if (local67 <= Static38.anInt553) {
						Static115.method2278(Static364.anIntArrayArray57[local67], local89, arg3, local99);
					}
					if (Static197.anInt4298 <= local63) {
						Static115.method2278(Static364.anIntArrayArray57[local63], local89, arg3, local99);
					}
				}
			}
			local5++;
			local63 = arg2 - local5;
			local67 = arg2 + local5;
			if (Static197.anInt4298 <= local67 && Static38.anInt553 >= local63) {
				local89 = Static12.method187(Static108.anInt2266, Static205.anInt4504, local7 + arg0);
				local99 = Static12.method187(Static108.anInt2266, Static205.anInt4504, arg0 - local7);
				if (Static38.anInt553 >= local67) {
					Static115.method2278(Static364.anIntArrayArray57[local67], local89, arg3, local99);
				}
				if (local63 >= Static197.anInt4298) {
					Static115.method2278(Static364.anIntArrayArray57[local63], local89, arg3, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILclient!a;Lclient!a;)V")
	public static void method1019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1 arg3, @OriginalArg(4) Class1_Sub1 arg4) {
		@Pc(4) Class51 local4 = Static261.method4461(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub1_2 = arg3;
			local4.aClass1_Sub1_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!ef;)V")
	public static void method1020(@OriginalArg(1) Class2_Sub12 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static109.anInt2285; local3++) {
			@Pc(9) int local9 = arg0.method3153();
			@Pc(13) int local13 = arg0.method3104();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static279.aClass120_Sub1Array5[local9] != null) {
				Static279.aClass120_Sub1Array5[local9].anInt5088 = local13;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIBLclient!dr;Lclient!sf;)V")
	public static void method1021(@OriginalArg(3) Class37 arg0, @OriginalArg(4) Class180 arg1) {
		Static284.aClass180_39.method4917();
		if (Static18.aBoolean24) {
			return;
		}
		for (@Pc(26) Class2_Sub8 local26 = (Class2_Sub8) arg1.method4919(); local26 != null; local26 = (Class2_Sub8) arg1.method4916()) {
			@Pc(35) Class66 local35 = Static312.method5209(local26.anInt1039);
			if (Static316.method5254(local35)) {
				@Pc(47) boolean local47 = Static30.method407(arg0, local35, local26);
				if (local47) {
					Static360.method5743(local35, local26, arg0);
				}
			}
		}
	}
}
