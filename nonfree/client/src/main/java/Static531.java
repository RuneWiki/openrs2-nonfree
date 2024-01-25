import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIII)V")
	public static void method7295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static170.method2425(arg0);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 - arg3;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg0;
		@Pc(26) int local26 = -arg0;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(39) int[] local39 = Static171.anIntArrayArray79[arg1];
		@Pc(44) int local44 = arg5 - local14;
		@Pc(48) int local48 = local14 + arg5;
		Static433.method6039(arg4, local44, local39, arg5 - arg0);
		Static433.method6039(arg2, local48, local39, local44);
		Static433.method6039(arg4, arg0 + arg5, local39, local48);
		while (local10 < local23) {
			local33 += 2;
			local35 += 2;
			local26 += local33;
			local31 += local35;
			if (local31 >= 0 && local28 >= 1) {
				Static38.anIntArray77[local28] = local10;
				local28--;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(117) int[] local117;
			@Pc(124) int[] local124;
			@Pc(128) int local128;
			@Pc(132) int local132;
			@Pc(137) int local137;
			@Pc(141) int local141;
			@Pc(146) int local146;
			if (local26 >= 0) {
				local23--;
				if (local14 > local23) {
					local117 = Static171.anIntArrayArray79[local23 + arg1];
					local124 = Static171.anIntArrayArray79[arg1 - local23];
					local128 = Static38.anIntArray77[local23];
					local132 = local10 + arg5;
					local137 = arg5 - local10;
					local141 = local128 + arg5;
					local146 = arg5 - local128;
					Static433.method6039(arg4, local146, local117, local137);
					Static433.method6039(arg2, local141, local117, local146);
					Static433.method6039(arg4, local132, local117, local141);
					Static433.method6039(arg4, local146, local124, local137);
					Static433.method6039(arg2, local141, local124, local146);
					Static433.method6039(arg4, local132, local124, local141);
				} else {
					local117 = Static171.anIntArrayArray79[arg1 + local23];
					local124 = Static171.anIntArrayArray79[arg1 - local23];
					local128 = arg5 + local10;
					local132 = arg5 - local10;
					Static433.method6039(arg4, local128, local117, local132);
					Static433.method6039(arg4, local128, local124, local132);
				}
				local26 -= local23 << 1;
			}
			local117 = Static171.anIntArrayArray79[local10 + arg1];
			local124 = Static171.anIntArrayArray79[arg1 - local10];
			local128 = arg5 + local23;
			local132 = arg5 - local23;
			if (local14 <= local10) {
				Static433.method6039(arg4, local128, local117, local132);
				Static433.method6039(arg4, local128, local124, local132);
			} else {
				local137 = local28 < local10 ? Static38.anIntArray77[local10] : local28;
				local141 = local137 + arg5;
				local146 = arg5 - local137;
				Static433.method6039(arg4, local146, local117, local132);
				Static433.method6039(arg2, local141, local117, local146);
				Static433.method6039(arg4, local128, local117, local141);
				Static433.method6039(arg4, local146, local124, local132);
				Static433.method6039(arg2, local141, local124, local146);
				Static433.method6039(arg4, local128, local124, local141);
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!pu;)V")
	public static void method7296(@OriginalArg(1) Class270 arg0) {
		Static51.anInt962 = 0;
		Static301.anInt5192 = 0;
		Static293.aClass209_2 = new Class209();
		Static434.aClass8_Sub2_Sub1_Sub1Array2 = new Class8_Sub2_Sub1_Sub1[1024];
		Static341.aClass8_Sub7Array2 = new Class8_Sub7[Static571.anIntArray714[Static390.anInt6750] + 1];
		Static29.anInt423 = 0;
		Static269.anInt4736 = 0;
		Static364.method4921(arg0);
		Static269.method3829(arg0);
	}
}
