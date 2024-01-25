import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array13;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_42 = new Class70(66, -1);

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_126 = new Class235(98, -2);

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
	public static int anInt4305 = 0;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
	public static int anInt4306 = 0;

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_127 = new Class235(50, 3);

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI[S)[S")
	public static short[] method3477(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static598.method1172(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!paa;IILclient!et;IILclient!de;)V")
	public static void method3478(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub3_Sub3_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class95 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class8_Sub3_Sub3_Sub1_Sub1 arg6) {
		@Pc(7) Class1_Sub38 local7 = new Class1_Sub38();
		local7.anInt6099 = arg0 << 9;
		local7.anInt6104 = arg3 << 9;
		local7.anInt6108 = arg2;
		if (arg4 != null) {
			local7.aClass95_1 = arg4;
			@Pc(32) int local32 = arg4.anInt2403;
			@Pc(35) int local35 = arg4.anInt2387;
			if (arg5 == 1 || arg5 == 3) {
				local32 = arg4.anInt2387;
				local35 = arg4.anInt2403;
			}
			local7.anInt6103 = arg4.anInt2386;
			local7.aBoolean482 = arg4.aBoolean175;
			local7.anInt6097 = arg4.anInt2426;
			local7.anInt6105 = arg4.anInt2401;
			local7.anInt6100 = arg4.anInt2404 << 9;
			local7.anInt6110 = arg3 + local35 << 9;
			local7.aBoolean484 = arg4.aBoolean187;
			local7.anInt6101 = arg0 + local32 << 9;
			local7.anIntArray497 = arg4.anIntArray210;
			local7.anInt6095 = arg4.anInt2383;
			if (arg4.anIntArray208 != null) {
				local7.aBoolean483 = true;
				local7.method4951();
			}
			if (local7.anIntArray497 != null) {
				local7.anInt6102 = (int) (Math.random() * (double) (local7.anInt6095 - local7.anInt6105)) + local7.anInt6105;
			}
			Static356.aClass353_43.method7679(local7);
		} else if (arg1 != null) {
			local7.aClass8_Sub3_Sub3_Sub1_Sub2_1 = arg1;
			@Pc(138) Class20 local138 = arg1.aClass20_1;
			if (local138.anIntArray40 != null) {
				local7.aBoolean483 = true;
				local138 = local138.method284(Static430.aClass321_1);
			}
			if (local138 != null) {
				local7.anInt6101 = local138.anInt350 + arg0 << 9;
				local7.anInt6110 = local138.anInt350 + arg3 << 9;
				local7.anInt6097 = Static185.method2594(arg1);
				local7.aBoolean482 = local138.aBoolean37;
				local7.anInt6103 = local138.anInt325;
				local7.anInt6100 = local138.anInt319 << 9;
			}
			Static413.aClass353_56.method7679(local7);
		} else if (arg6 != null) {
			local7.aClass8_Sub3_Sub3_Sub1_Sub1_2 = arg6;
			local7.anInt6101 = arg6.method5434() + arg0 << 9;
			local7.anInt6110 = arg6.method5434() + arg3 << 9;
			local7.anInt6097 = Static449.method6211(arg6);
			local7.anInt6103 = arg6.anInt1755;
			local7.aBoolean482 = arg6.aBoolean136;
			local7.anInt6100 = arg6.anInt1747 << 9;
			Static478.aClass187_41.method3795(local7, (long) arg6.anInt6821);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLclient!de;IBI)V")
	public static void method3479(@OriginalArg(1) Class8_Sub3_Sub3_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(18) int local18 = arg0.anIntArray534[0];
		@Pc(23) int local23 = arg0.anIntArray533[0];
		if (local18 < 0 || local18 >= Static71.anInt1410 || local23 < 0 || local23 >= Static471.anInt8012 || (arg2 < 0 || Static71.anInt1410 <= arg2 || arg1 < 0 || Static471.anInt8012 <= arg1)) {
			return;
		}
		@Pc(89) int local89 = Static210.method3321(local18, 0, 0, local23, Static149.anIntArray231, Static478.aClass59Array2[arg0.aByte123], arg1, true, arg2, 0, -4, 0, Static546.anIntArray686, arg0.method5434());
		if (local89 >= 1 && local89 <= 3) {
			for (@Pc(103) int local103 = 0; local103 < local89 - 1; local103++) {
				arg0.method1445((byte) 2, Static149.anIntArray231[local103], Static546.anIntArray686[local103]);
			}
		}
	}
}
