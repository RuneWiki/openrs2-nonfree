import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIBII)V")
	public static void method6497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Static642.anInt10429 && Static456.anInt7806 >= arg1 && arg2 >= Static456.anInt7815 && Static604.anInt10083 >= arg3) {
			Static85.method1306(arg0, arg4, arg1, arg3, arg2);
		} else {
			Static371.method5448(arg3, arg4, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IILclient!la;)Lclient!lq;")
	public static Class224 method6500(@OriginalArg(1) int arg0, @OriginalArg(2) Class208 arg1) {
		@Pc(14) byte[] local14 = arg1.method4997(arg0);
		return local14 == null ? null : new Class224(local14);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZIIIFFFI)[F")
	public static float[] method6501(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[8] = local17;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[4] = 1.0F;
		local6[6] = -local25;
		@Pc(80) float[] local80 = new float[9];
		@Pc(82) float local82 = 1.0F;
		@Pc(84) float local84 = 0.0F;
		@Pc(89) float local89 = (float) arg0 / 32767.0F;
		@Pc(99) float local99 = -((float) Math.sqrt((double) (1.0F - local89 * local89)));
		@Pc(104) float local104 = 1.0F - local89;
		@Pc(115) float local115 = (float) Math.sqrt((double) (arg2 * arg2 + arg1 * arg1));
		if (local115 == 0.0F && local89 == 0.0F) {
			local9 = local6;
		} else {
			if (local115 != 0.0F) {
				local82 = (float) -arg1 / local115;
				local84 = (float) arg2 / local115;
			}
			local80[5] = local82 * local99;
			local80[3] = local99 * -local84;
			local80[4] = local89;
			local80[1] = local84 * local99;
			local80[2] = local84 * local82 * local104;
			local80[6] = local104 * local82 * local84;
			local80[7] = -local82 * local99;
			local80[0] = local104 * local82 * local82 + local89;
			local80[8] = local89 + local84 * local84 * local104;
			local9[0] = local80[0] * local6[0] + local80[3] * local6[1] + local6[2] * local80[6];
			local9[1] = local80[1] * local6[0] + local6[1] * local80[4] + local80[7] * local6[2];
			local9[2] = local6[1] * local80[5] + local80[2] * local6[0] + local6[2] * local80[8];
			local9[3] = local80[6] * local6[5] + local6[3] * local80[0] + local6[4] * local80[3];
			local9[4] = local80[1] * local6[3] + local80[4] * local6[4] + local6[5] * local80[7];
			local9[6] = local80[3] * local6[7] + local6[6] * local80[0] + local6[8] * local80[6];
			local9[5] = local80[2] * local6[3] + local80[5] * local6[4] + local6[5] * local80[8];
			local9[7] = local80[4] * local6[7] + local6[6] * local80[1] + local80[7] * local6[8];
			local9[8] = local6[6] * local80[2] + local80[5] * local6[7] + local80[8] * local6[8];
		}
		local9[1] *= arg4;
		local9[5] *= arg3;
		local9[4] *= arg3;
		local9[8] *= arg5;
		local9[6] *= arg5;
		local9[3] *= arg3;
		local9[7] *= arg5;
		local9[2] *= arg4;
		local9[0] *= arg4;
		return local9;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ljava/lang/String;CB)[Ljava/lang/String;")
	public static String[] method6502(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(20) int local20 = Static190.method2759(arg1, arg0);
		@Pc(25) String[] local25 = new String[local20 + 1];
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local20; local31++) {
			@Pc(35) int local35;
			for (local35 = local29; arg1 != arg0.charAt(local35); local35++) {
			}
			local25[local27++] = arg0.substring(local29, local35);
			local29 = local35 + 1;
		}
		local25[local20] = arg0.substring(local29);
		return local25;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BII)Z")
	public static boolean method6503(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) boolean local20 = (arg0 & 0x37) == 0 ? Static552.method7996(arg1, arg0) : Static25.method377(arg1, arg0);
		return local20 | Static402.method5909(arg0, arg1) | (arg1 & 0x10000) != 0;
	}
}
