import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	public static int anInt561 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIFFF)[F")
	public static float[] method485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[4] = 1.0F;
		local6[8] = local17;
		local6[2] = local25;
		local6[5] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg0 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(95) float local95 = 1.0F - local77;
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg1 * arg1 + arg2 * arg2));
		if (local106 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local79 = (float) arg2 / local106;
				local72 = (float) -arg1 / local106;
			}
			local70[4] = local77;
			local70[0] = local77 + local72 * local72 * local95;
			local70[2] = local95 * local72 * local79;
			local70[8] = local95 * local79 * local79 + local77;
			local70[1] = local90 * local79;
			local70[5] = local72 * local90;
			local70[7] = local90 * -local72;
			local70[6] = local72 * local79 * local95;
			local70[3] = local90 * -local79;
			local9[0] = local6[2] * local70[6] + local70[0] * local6[0] + local6[1] * local70[3];
			local9[1] = local6[0] * local70[1] + local6[1] * local70[4] + local70[7] * local6[2];
			local9[2] = local6[2] * local70[8] + local70[2] * local6[0] + local6[1] * local70[5];
			local9[3] = local70[6] * local6[5] + local6[4] * local70[3] + local70[0] * local6[3];
			local9[4] = local6[5] * local70[7] + local6[4] * local70[4] + local6[3] * local70[1];
			local9[5] = local6[5] * local70[8] + local6[4] * local70[5] + local70[2] * local6[3];
			local9[6] = local6[8] * local70[6] + local6[6] * local70[0] + local6[7] * local70[3];
			local9[7] = local70[4] * local6[7] + local70[1] * local6[6] + local6[8] * local70[7];
			local9[8] = local6[7] * local70[5] + local6[6] * local70[2] + local6[8] * local70[8];
		}
		local9[8] *= arg4;
		local9[0] *= arg6;
		local9[7] *= arg4;
		local9[2] *= arg6;
		local9[5] *= arg5;
		local9[1] *= arg6;
		local9[6] *= arg4;
		local9[3] *= arg5;
		local9[4] *= arg5;
		return local9;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method486(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static409.anIntArray591[local3] = Static409.anIntArray591[local3 - 1];
			Static4.anIntArray4[local3] = Static4.anIntArray4[local3 - 1];
			Static15.aStringArray33[local3] = Static15.aStringArray33[local3 - 1];
			Static261.aStringArray54[local3] = Static261.aStringArray54[local3 - 1];
			Static86.aStringArray16[local3] = Static86.aStringArray16[local3 - 1];
			Static224.aStringArray37[local3] = Static224.aStringArray37[local3 - 1];
			Static233.anIntArray338[local3] = Static233.anIntArray338[local3 - 1];
		}
		Static409.anIntArray591[0] = arg6;
		Static15.aStringArray33[0] = arg2;
		Static4.anIntArray4[0] = arg0;
		Static261.aStringArray54[0] = arg1;
		Static86.aStringArray16[0] = arg5;
		Static48.anInt908++;
		Static233.anIntArray338[0] = arg4;
		Static224.aStringArray37[0] = arg3;
		Static9.anInt246 = Static337.anInt7419;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	public static void method487() {
		@Pc(7) int local7 = Static187.anInt4913;
		@Pc(13) int[] local13 = Static256.anIntArray370;
		for (@Pc(15) int local15 = 0; local15 < local7; local15++) {
			@Pc(23) Class26_Sub2_Sub2_Sub1 local23 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local13[local15]];
			if (local23 != null && local23.anInt7114 > 0) {
				local23.anInt7114--;
				if (local23.anInt7114 == 0) {
					local23.aString55 = null;
				}
			}
		}
		for (@Pc(50) int local50 = 0; local50 < Static288.anInt5039; local50++) {
			@Pc(56) int local56 = Static212.anIntArray28[local50];
			@Pc(60) Class26_Sub2_Sub2_Sub2 local60 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local56];
			if (local60 != null && local60.anInt7114 > 0) {
				local60.anInt7114--;
				if (local60.anInt7114 == 0) {
					local60.aString55 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([JI[Ljava/lang/Object;BI)V")
	public static void method488(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg3) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) long local21 = arg0[local15];
		arg0[local15] = arg0[arg3];
		arg0[arg3] = local21;
		@Pc(35) Object local35 = arg2[local15];
		arg2[local15] = arg2[arg3];
		arg2[arg3] = local35;
		@Pc(53) int local53 = local21 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg1; local55 < arg3; local55++) {
			if (arg0[local55] < (long) (local53 & local55) + local21) {
				@Pc(76) long local76 = arg0[local55];
				arg0[local55] = arg0[local17];
				arg0[local17] = local76;
				@Pc(90) Object local90 = arg2[local55];
				arg2[local55] = arg2[local17];
				arg2[local17++] = local90;
			}
		}
		arg0[arg3] = arg0[local17];
		arg0[local17] = local21;
		arg2[arg3] = arg2[local17];
		arg2[local17] = local35;
		method488(arg0, arg1, arg2, local17 - 1);
		method488(arg0, local17 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZII)I")
	public static int method489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class4.anIntArray6[arg0 * 8192 / arg1] >> 1;
		return (local21 * arg2 >> 16) + (arg3 * (65536 - local21) >> 16);
	}
}
