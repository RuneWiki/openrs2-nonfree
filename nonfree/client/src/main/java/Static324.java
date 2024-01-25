import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "Lclient!uu;")
	public static Class250 aClass250_80;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
	public static int anInt5432;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!la;")
	public static final Class136 aClass136_150 = new Class136(34, -1);

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
	public static int anInt5429 = 0;

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_131 = new Class163(79, -1);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method4493(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static307.method4633(Static16.aClass163_15);
			Static243.aClass3_Sub25_Sub1_7.method4081(Static47.method891(arg0));
			Static243.aClass3_Sub25_Sub1_7.method4080(arg0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLclient!uu;)I")
	public static int method4494(@OriginalArg(1) Class250 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5813(Static195.anInt3530)) {
			local5++;
		}
		if (arg0.method5813(Static311.anInt5308)) {
			local5++;
		}
		if (arg0.method5813(Static145.anInt2647)) {
			local5++;
		}
		if (arg0.method5813(Static345.anInt5819)) {
			local5++;
		}
		if (arg0.method5813(Static362.anInt6170)) {
			local5++;
		}
		if (arg0.method5813(Static51.anInt930)) {
			local5++;
		}
		if (arg0.method5813(Static205.anInt5935)) {
			local5++;
		}
		if (arg0.method5813(Static331.anInt7371)) {
			local5++;
		}
		if (arg0.method5813(Static105.anInt1900)) {
			local5++;
		}
		if (arg0.method5813(Static90.anInt1611)) {
			local5++;
		}
		if (arg0.method5813(Static314.anInt5328)) {
			local5++;
		}
		if (arg0.method5813(Static170.anInt3086)) {
			local5++;
		}
		if (arg0.method5813(Static45.anInt763)) {
			local5++;
		}
		if (arg0.method5813(Static126.anInt2305)) {
			local5++;
		}
		if (arg0.method5813(Static426.anInt7184)) {
			local5++;
		}
		if (arg0.method5813(Static6.anInt41)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB[I[Ljava/lang/Object;I)V")
	public static void method4495(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local20;
		@Pc(34) Object local34 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg3; local55 < arg0; local55++) {
			if (arg1[local55] < local20 + (local53 & local55)) {
				@Pc(71) int local71 = arg1[local55];
				arg1[local55] = arg1[local16];
				arg1[local16] = local71;
				@Pc(85) Object local85 = arg2[local55];
				arg2[local55] = arg2[local16];
				arg2[local16++] = local85;
			}
		}
		arg1[arg0] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg0] = arg2[local16];
		arg2[local16] = local34;
		method4495(local16 - 1, arg1, arg2, arg3);
		method4495(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BZIZI)I")
	public static int method4496(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class3_Sub32 local10 = Static457.method6232(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray274.length; local23++) {
			if (local10.anIntArray274[local23] >= 0 && local10.anIntArray274[local23] < Static158.aClass272_1.anInt7762) {
				@Pc(52) Class209 local52 = Static158.aClass272_1.method6283(local10.anIntArray274[local23]);
				@Pc(62) int local62 = local52.method4987(arg0, Static70.aClass15_1.method323(arg0).anInt813);
				if (arg1) {
					local16 += local10.anIntArray275[local23] * local62;
				} else {
					local16 += local62;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V")
	public static void method4497() {
		if (Static155.aBoolean216) {
			return;
		}
		Static155.aBoolean216 = true;
		if (Static39.aClass79_Sub1_1.aBoolean160) {
			Static19.aFloat6 = (int) Static19.aFloat6 - 65 & 0xFFFFFF80;
		} else {
			Static292.aFloat84 += (-Static292.aFloat84 - 24.0F) / 2.0F;
		}
		Static179.aBoolean252 = true;
	}
}
