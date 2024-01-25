import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
	public static int anInt4709;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	public static int anInt4716;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_83 = new Class198("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(FIIFIIFI)[F")
	public static float[] method3742(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[1] = 0.0F;
		local6[5] = 0.0F;
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[2] = local25;
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[6] = -local25;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg6 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(83) float local83 = 1.0F - local77;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4));
		if (local105 == (float) 0 && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local72 = (float) -arg2 / local105;
				local79 = (float) arg4 / local105;
			}
			local70[4] = local77;
			local70[0] = local72 * local72 * local83 + local77;
			local70[2] = local72 * local79 * local83;
			local70[6] = local79 * local72 * local83;
			local70[8] = local77 + local83 * local79 * local79;
			local70[3] = local94 * -local79;
			local70[7] = local94 * -local72;
			local70[5] = local72 * local94;
			local70[1] = local79 * local94;
			local9[0] = local6[0] * local70[0] + local6[1] * local70[3] + local6[2] * local70[6];
			local9[1] = local70[4] * local6[1] + local70[1] * local6[0] + local6[2] * local70[7];
			local9[2] = local70[5] * local6[1] + local70[2] * local6[0] + local6[2] * local70[8];
			local9[3] = local6[3] * local70[0] + local70[3] * local6[4] + local70[6] * local6[5];
			local9[4] = local6[3] * local70[1] + local70[4] * local6[4] + local6[5] * local70[7];
			local9[5] = local6[5] * local70[8] + local6[3] * local70[2] + local6[4] * local70[5];
			local9[6] = local70[6] * local6[8] + local70[3] * local6[7] + local6[6] * local70[0];
			local9[7] = local6[7] * local70[4] + local70[1] * local6[6] + local6[8] * local70[7];
			local9[8] = local70[8] * local6[8] + local70[5] * local6[7] + local70[2] * local6[6];
		}
		local9[6] *= arg0;
		local9[8] *= arg0;
		local9[1] *= arg5;
		local9[0] *= arg5;
		local9[3] *= arg3;
		local9[7] *= arg0;
		local9[4] *= arg3;
		local9[2] *= arg5;
		local9[5] *= arg3;
		return local9;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public static void method3743() {
		@Pc(22) int[] local22 = new int[Static306.aClass67_3.anInt1775];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < Static306.aClass67_3.anInt1775; local26++) {
			@Pc(33) Class40 local33 = Static306.aClass67_3.method1452(local26);
			if (local33.anInt1129 >= 0 || local33.anInt1149 >= 0) {
				local22[local24++] = local26;
			}
		}
		Static97.anIntArray77 = new int[local24];
		for (@Pc(54) int local54 = 0; local54 < local24; local54++) {
			Static97.anIntArray77[local54] = local22[local54];
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public static void method3744() {
		anInt4716 = Static51.aClass14_4.anInt363 + Static51.aClass14_4.anInt360 + 2;
		Static286.anInt4444 = Static21.aClass14_1.anInt363 + Static21.aClass14_1.anInt360 + 2;
		Static286.aStringArray33 = new String[500];
		for (@Pc(39) int local39 = 0; local39 < Static286.aStringArray33.length; local39++) {
			Static286.aStringArray33[local39] = "";
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
	public static void method3746(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub2_Sub9 local13 = Static72.method1073(9, arg0);
		local13.method3024();
	}
}
