import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_136 = new Class376(90, -1);

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "Z")
	public static boolean aBoolean703 = false;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IC)C")
	public static char method7940(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIIIII)V")
	public static void method7942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static177.method2932(arg4);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg4;
		@Pc(26) int local26 = -arg4;
		@Pc(28) int local28 = local14;
		@Pc(35) int local35 = -local14;
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = -1;
		@Pc(43) int[] local43 = Static299.anIntArrayArray58[arg5];
		@Pc(48) int local48 = arg3 - local14;
		Static526.method7369(local43, local48, arg3 - arg4, arg0);
		@Pc(60) int local60 = local14 + arg3;
		Static526.method7369(local43, local60, local48, arg1);
		Static526.method7369(local43, arg4 + arg3, local60, arg0);
		while (local23 > local10) {
			local37 += 2;
			local39 += 2;
			local26 += local37;
			local35 += local39;
			if (local35 >= 0 && local28 >= 1) {
				Static608.anIntArray621[local28] = local10;
				local28--;
				local35 -= local28 << 1;
			}
			local10++;
			@Pc(118) int[] local118;
			@Pc(124) int[] local124;
			@Pc(128) int local128;
			@Pc(132) int local132;
			@Pc(137) int local137;
			@Pc(142) int local142;
			@Pc(147) int local147;
			if (local26 >= 0) {
				local23--;
				if (local14 > local23) {
					local118 = Static299.anIntArrayArray58[arg5 + local23];
					local124 = Static299.anIntArrayArray58[arg5 - local23];
					local128 = Static608.anIntArray621[local23];
					local132 = local10 + arg3;
					local137 = arg3 - local10;
					local142 = arg3 + local128;
					local147 = arg3 - local128;
					Static526.method7369(local118, local147, local137, arg0);
					Static526.method7369(local118, local142, local147, arg1);
					Static526.method7369(local118, local132, local142, arg0);
					Static526.method7369(local124, local147, local137, arg0);
					Static526.method7369(local124, local142, local147, arg1);
					Static526.method7369(local124, local132, local142, arg0);
				} else {
					local118 = Static299.anIntArrayArray58[local23 + arg5];
					local124 = Static299.anIntArrayArray58[arg5 - local23];
					local128 = local10 + arg3;
					local132 = arg3 - local10;
					Static526.method7369(local118, local128, local132, arg0);
					Static526.method7369(local124, local128, local132, arg0);
				}
				local26 -= local23 << 1;
			}
			local118 = Static299.anIntArrayArray58[local10 + arg5];
			local124 = Static299.anIntArrayArray58[arg5 - local10];
			local128 = local23 + arg3;
			local132 = arg3 - local23;
			if (local10 >= local14) {
				Static526.method7369(local118, local128, local132, arg0);
				Static526.method7369(local124, local128, local132, arg0);
			} else {
				local137 = local10 > local28 ? Static608.anIntArray621[local10] : local28;
				local142 = local137 + arg3;
				local147 = arg3 - local137;
				Static526.method7369(local118, local147, local132, arg0);
				Static526.method7369(local118, local142, local147, arg1);
				Static526.method7369(local118, local128, local142, arg0);
				Static526.method7369(local124, local147, local132, arg0);
				Static526.method7369(local124, local142, local147, arg1);
				Static526.method7369(local124, local128, local142, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
	public static void method7943() {
		@Pc(19) Class3_Sub21 local19 = (Class3_Sub21) Static565.aClass193_55.method4457();
		@Pc(30) boolean local30 = Static503.aClass208_9 != null || Static523.anInt5720 > 0;
		@Pc(34) int local34 = local19.method7977();
		@Pc(38) int local38 = local19.method7981();
		if (local30) {
			Static545.anInt8892 = 1;
		}
		if (local30) {
			Static32.aClass3_Sub6_Sub16_1 = Static614.aClass3_Sub6_Sub16_4;
		} else {
			Static182.method2995(Static614.aClass3_Sub6_Sub16_4, local34, local38);
		}
	}
}
