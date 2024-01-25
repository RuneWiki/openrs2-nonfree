import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "Lclient!le;")
	public static Class186 aClass186_2;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "Lclient!an;")
	public static Class16 aClass16_23;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "[S")
	public static final short[] aShortArray37 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIBII)V")
	public static void method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static251.anInt5168 && Static341.anInt6481 >= arg4 && arg1 >= Static507.anInt9124 && arg2 <= Static234.anInt4897) {
			if (arg0 == 1) {
				Static205.method3828(arg4, arg3, arg5, arg2, arg1);
			} else {
				Static423.method209(arg4, arg3, arg2, arg5, arg0, arg1);
			}
		} else if (arg0 == 1) {
			Static370.method5737(arg4, arg5, arg2, arg1, arg3);
		} else {
			Static341.method5416(arg3, arg2, arg5, arg0, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public static void method2144() {
		Static497.aClass42_9.M(((float) Static208.aClass12_Sub10_Sub1_1.anInt2219 * 0.1F + 0.7F) * Static345.aFloat131);
		Static497.aClass42_9.m(Static9.anInt137, Static436.aFloat179, Static84.aFloat55, (float) (Static368.anInt6838 << 0), (float) (Static24.anInt394 << 0), (float) (Static466.anInt8503 << 0));
		Static497.aClass42_9.method5801(Static98.aClass124_1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BIIII)V")
	public static void method2146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		Static118.method2461(Static228.anIntArrayArray46[arg1], arg3 + arg2, arg0, arg2 - arg3);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(59) int[] local59 = Static228.anIntArrayArray46[arg1 + local9];
				@Pc(65) int[] local65 = Static228.anIntArrayArray46[arg1 - local9];
				@Pc(69) int local69 = local7 + arg2;
				@Pc(74) int local74 = arg2 - local7;
				Static118.method2461(local59, local69, arg0, local74);
				Static118.method2461(local65, local69, arg0, local74);
			}
			@Pc(90) int local90 = arg2 + local9;
			@Pc(95) int local95 = arg2 - local9;
			@Pc(101) int[] local101 = Static228.anIntArrayArray46[arg1 + local7];
			@Pc(108) int[] local108 = Static228.anIntArrayArray46[arg1 - local7];
			Static118.method2461(local101, local90, arg0, local95);
			Static118.method2461(local108, local90, arg0, local95);
		}
	}
}
