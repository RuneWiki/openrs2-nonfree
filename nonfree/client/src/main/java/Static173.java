import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fea", name = "q", descriptor = "I")
	public static int anInt3144;

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "F")
	public static float aFloat59 = 0.25F;

	@OriginalMember(owner = "client!fea", name = "n", descriptor = "I")
	public static int anInt3140 = 0;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIIII)J")
	public static long method2692(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static321.aCalendar11.clear();
		Static321.aCalendar11.set(arg0, arg1, arg2, 12, 0, 0);
		return Static321.aCalendar11.getTime().getTime();
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(III)I")
	public static int method2693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(39) int local39 = Static95.method1282(arg1 - 1, arg0 - 1) + Static95.method1282(arg1 - 1, arg0 + 1) + Static95.method1282(arg1 + 1, arg0 + -1) + Static95.method1282(arg1 - -1, arg0 + 1);
		@Pc(68) int local68 = Static95.method1282(arg1, arg0 - 1) + Static95.method1282(arg1, arg0 + 1) + Static95.method1282(arg1 - 1, arg0) + Static95.method1282(arg1 + 1, arg0);
		@Pc(80) int local80 = Static95.method1282(arg1, arg0);
		return local39 / 16 + local68 / 8 + local80 / 4;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "([FII)[F")
	public static float[] method2694(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static735.method9187(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IZ)V")
	public static void method2695(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static269.anInt4883 - Static246.anInt4582;
		if (local16 >= 100) {
			Static573.anInt9429 = -1;
			Static283.anInt5140 = -1;
			Static175.anInt10579 = 1;
			return;
		}
		@Pc(32) int local32 = (int) Static27.aFloat4;
		if (local32 < Static678.anInt11088 >> 8) {
			local32 = Static678.anInt11088 >> 8;
		}
		if (Static197.aBooleanArray10[4] && Static175.anIntArray593[4] + 128 > local32) {
			local32 = Static175.anIntArray593[4] + 128;
		}
		@Pc(75) int local75 = Static344.anInt5903 + (int) Static658.aFloat196 & 0x3FFF;
		Static327.method4881(Static680.anInt10754, local32, local75, arg0, Static505.method7237(Static712.anInt11117, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204) - 200, Static270.anInt4887, (local32 >> 3) * 3 + 600 << 2);
		@Pc(120) float local120 = 1.0F - (float) ((100 - local16) * (-local16 + 100) * (100 - local16)) / 1000000.0F;
		anInt3144 = (int) ((float) Static407.anInt7264 + local120 * (float) (anInt3144 - Static407.anInt7264));
		Static235.anInt4471 = (int) ((float) Static202.anInt3525 + local120 * (float) (Static235.anInt4471 - Static202.anInt3525));
		Static376.anInt6408 = (int) (local120 * (float) (Static376.anInt6408 - Static369.anInt6293) + (float) Static369.anInt6293);
		Static228.anInt9136 = (int) (local120 * (float) (Static228.anInt9136 - Static650.anInt10441) + (float) Static650.anInt10441);
		@Pc(173) int local173 = Static703.anInt10997 - Static237.anInt11069;
		if (local173 > 8192) {
			local173 -= 16384;
		} else if (local173 < -8192) {
			local173 += 16384;
		}
		Static703.anInt10997 = (int) ((float) Static237.anInt11069 + local120 * (float) local173);
		Static703.anInt10997 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZII)I")
	public static int method2696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static216.method3470(4, arg1 + 91923, arg0 + 45365) + (Static216.method3470(2, arg1 + 37821, arg0 + 10294) + -128 >> 1) + (Static216.method3470(1, arg1, arg0) + -128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}
}
