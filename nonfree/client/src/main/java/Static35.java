import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bu", name = "x", descriptor = "I")
	public static int anInt697;

	@OriginalMember(owner = "client!bu", name = "z", descriptor = "Lclient!l;")
	public static Class17 aClass17_5;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IILclient!mg;)Lclient!dq;")
	public static Class58 method593(@OriginalArg(1) int arg0, @OriginalArg(2) Class160 arg1) {
		@Pc(13) byte[] local13 = arg1.method3711(arg0);
		return local13 == null ? null : new Class58(local13);
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(II)V")
	public static void method594(@OriginalArg(0) int arg0) {
		Static41.anInt763 = arg0;
		@Pc(7) Class171 local7 = Static387.aClass171_52;
		synchronized (Static387.aClass171_52) {
			Static387.aClass171_52.method3936();
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIBIIII)V")
	public static void method595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static135.method2307(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg3;
		@Pc(24) int local24 = -arg3;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(37) int[] local37 = Static280.anIntArrayArray51[arg5];
		@Pc(46) int local46 = arg2 - local15;
		@Pc(50) int local50 = local15 + arg2;
		Static64.method1247(arg2 - arg3, local37, local46, arg1);
		Static64.method1247(local46, local37, local50, arg4);
		Static64.method1247(local50, local37, arg2 + arg3, arg1);
		while (local21 > local10) {
			local31 += 2;
			local33 += 2;
			local24 += local31;
			local29 += local33;
			if (local29 >= 0 && local26 >= 1) {
				Static195.anIntArray332[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(121) int[] local121;
			@Pc(128) int[] local128;
			@Pc(132) int local132;
			@Pc(136) int local136;
			@Pc(141) int local141;
			@Pc(145) int local145;
			@Pc(150) int local150;
			if (local24 >= 0) {
				local21--;
				if (local15 > local21) {
					local121 = Static280.anIntArrayArray51[arg5 + local21];
					local128 = Static280.anIntArrayArray51[arg5 - local21];
					local132 = Static195.anIntArray332[local21];
					local136 = local10 + arg2;
					local141 = arg2 - local10;
					local145 = local132 + arg2;
					local150 = arg2 - local132;
					Static64.method1247(local141, local121, local150, arg1);
					Static64.method1247(local150, local121, local145, arg4);
					Static64.method1247(local145, local121, local136, arg1);
					Static64.method1247(local141, local128, local150, arg1);
					Static64.method1247(local150, local128, local145, arg4);
					Static64.method1247(local145, local128, local136, arg1);
				} else {
					local121 = Static280.anIntArrayArray51[local21 + arg5];
					local128 = Static280.anIntArrayArray51[arg5 - local21];
					local132 = local10 + arg2;
					local136 = arg2 - local10;
					Static64.method1247(local136, local121, local132, arg1);
					Static64.method1247(local136, local128, local132, arg1);
				}
				local24 -= local21 << 1;
			}
			local121 = Static280.anIntArrayArray51[arg5 + local10];
			local128 = Static280.anIntArrayArray51[arg5 - local10];
			local132 = arg2 + local21;
			local136 = arg2 - local21;
			if (local10 < local15) {
				local141 = local26 >= local10 ? local26 : Static195.anIntArray332[local10];
				local145 = arg2 + local141;
				local150 = arg2 - local141;
				Static64.method1247(local136, local121, local150, arg1);
				Static64.method1247(local150, local121, local145, arg4);
				Static64.method1247(local145, local121, local132, arg1);
				Static64.method1247(local136, local128, local150, arg1);
				Static64.method1247(local150, local128, local145, arg4);
				Static64.method1247(local145, local128, local132, arg1);
			} else {
				Static64.method1247(local136, local121, local132, arg1);
				Static64.method1247(local136, local128, local132, arg1);
			}
		}
	}
}
