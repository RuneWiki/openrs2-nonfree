import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray20 = new int[2][][];

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[FIIIIFIII)V")
	public static void method6966(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg0 - arg2;
		@Pc(9) int local9 = arg4 - arg8;
		@Pc(17) int local17 = arg6 - arg7;
		@Pc(38) float local38 = (float) local5 * arg1[0] + (float) local9 * arg1[1] + arg1[2] * (float) local17;
		@Pc(64) float local64 = arg1[4] * (float) local9 + arg1[3] * (float) local5 + arg1[5] * (float) local17;
		@Pc(85) float local85 = arg1[8] * (float) local17 + (float) local5 * arg1[6] + arg1[7] * (float) local9;
		@Pc(100) float local100 = (float) Math.sqrt((double) (local64 * local64 + local38 * local38 + local85 * local85));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg5 + (float) Math.asin((double) (local64 / local100)) / 3.1415927F + 0.5F;
		@Pc(135) float local135;
		if (arg3 == 1) {
			local135 = local111;
			local111 = -local124;
			local124 = local135;
		} else if (arg3 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg3 == 3) {
			local135 = local111;
			local111 = local124;
			local124 = -local135;
		}
		Static375.aFloat130 = local124;
		Static101.aFloat76 = local111;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!kda;ZLclient!kda;)V")
	public static void method6968(@OriginalArg(0) Class160 arg0, @OriginalArg(2) Class160 arg1) {
		Static168.aClass160_40 = arg0;
		Static304.aClass160_66 = arg1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!vp;)V")
	public static void method6971(@OriginalArg(1) Class309 arg0) {
		if (!Static382.aBoolean440) {
			return;
		}
		if (arg0.anObjectArray35 != null) {
			@Pc(14) Class309 local14 = Static210.method3818(Static323.anInt6116, Static423.anInt8970);
			if (local14 != null) {
				@Pc(20) Class1_Sub40 local20 = new Class1_Sub40();
				local20.aClass309_11 = local14;
				local20.anObjectArray5 = arg0.anObjectArray35;
				local20.aClass309_10 = arg0;
				Static387.method5838(local20);
			}
		}
		Static444.method6416(Static423.aClass186_115);
		Static192.aClass1_Sub13_Sub2_1.method3069(arg0.anInt8750);
		Static192.aClass1_Sub13_Sub2_1.method3023(Static423.anInt8970);
		Static192.aClass1_Sub13_Sub2_1.method3080(Static323.anInt6116);
		Static192.aClass1_Sub13_Sub2_1.method3028(Static368.anInt6563);
		Static192.aClass1_Sub13_Sub2_1.method3028(arg0.anInt8735);
		Static192.aClass1_Sub13_Sub2_1.method3023(arg0.anInt8726);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBZ)V")
	public static void method6973(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class1_Sub49 local8 = Static393.method5919(arg1, arg0);
		if (local8 != null) {
			for (@Pc(21) int local21 = 0; local21 < local8.anIntArray747.length; local21++) {
				local8.anIntArray747[local21] = -1;
				local8.anIntArray746[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLclient!kda;)V")
	public static void method6974(@OriginalArg(1) Class160 arg0) {
		Static491.aClass160_94 = arg0;
	}
}
