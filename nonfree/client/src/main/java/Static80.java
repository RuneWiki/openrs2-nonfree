import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!er", name = "k", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!vg;IIB)V")
	public static void method1434(@OriginalArg(0) Class201 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static349.aClass201_14 = arg0;
		Static163.anInt3237 = arg2;
		Static10.anInt201 = arg1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V")
	public static void method1435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg1, 7);
		local8.method850();
		local8.anInt996 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1438(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIBIIII)V")
	public static void method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static226.method4085(arg4);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4 - arg0;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg4;
		@Pc(23) int local23 = -arg4;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(36) int[] local36 = Static129.anIntArrayArray46[arg5];
		@Pc(41) int local41 = arg3 - local14;
		Static160.method2840(arg1, local41, arg3 - arg4, local36);
		@Pc(53) int local53 = local14 + arg3;
		Static160.method2840(arg2, local53, local41, local36);
		Static160.method2840(arg1, arg4 + arg3, local53, local36);
		while (local20 > local10) {
			local30 += 2;
			local32 += 2;
			local23 += local30;
			local28 += local32;
			if (local28 >= 0 && local25 >= 1) {
				Static349.anIntArray633[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(117) int[] local117;
			@Pc(124) int[] local124;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(174) int local174;
			@Pc(178) int local178;
			@Pc(183) int local183;
			if (local23 >= 0) {
				local20--;
				if (local20 >= local14) {
					local117 = Static129.anIntArrayArray46[arg5 + local20];
					local124 = Static129.anIntArrayArray46[arg5 - local20];
					local128 = local10 + arg3;
					local133 = arg3 - local10;
					Static160.method2840(arg1, local128, local133, local117);
					Static160.method2840(arg1, local128, local133, local124);
				} else {
					local117 = Static129.anIntArrayArray46[local20 + arg5];
					local124 = Static129.anIntArrayArray46[arg5 - local20];
					local128 = Static349.anIntArray633[local20];
					local133 = arg3 + local10;
					local174 = arg3 - local10;
					local178 = arg3 + local128;
					local183 = arg3 - local128;
					Static160.method2840(arg1, local183, local174, local117);
					Static160.method2840(arg2, local178, local183, local117);
					Static160.method2840(arg1, local133, local178, local117);
					Static160.method2840(arg1, local183, local174, local124);
					Static160.method2840(arg2, local178, local183, local124);
					Static160.method2840(arg1, local133, local178, local124);
				}
				local23 -= local20 << 1;
			}
			local117 = Static129.anIntArrayArray46[arg5 + local10];
			local124 = Static129.anIntArrayArray46[arg5 - local10];
			local128 = local20 + arg3;
			local133 = arg3 - local20;
			if (local14 <= local10) {
				Static160.method2840(arg1, local128, local133, local117);
				Static160.method2840(arg1, local128, local133, local124);
			} else {
				local174 = local10 <= local25 ? local25 : Static349.anIntArray633[local10];
				local178 = arg3 + local174;
				local183 = arg3 - local174;
				Static160.method2840(arg1, local183, local133, local117);
				Static160.method2840(arg2, local178, local183, local117);
				Static160.method2840(arg1, local128, local178, local117);
				Static160.method2840(arg1, local183, local133, local124);
				Static160.method2840(arg2, local178, local183, local124);
				Static160.method2840(arg1, local128, local178, local124);
			}
		}
	}
}
