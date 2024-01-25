import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!qc;")
	public static Class39 aClass39_7;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "F")
	public static float aFloat156 = 0.0F;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_123 = new Class306("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[B)[B")
	public static byte[] method6675(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub6 local13 = new Class1_Sub6(arg0);
		@Pc(17) int local17 = local13.method3922();
		@Pc(21) int local21 = local13.method3925();
		if (local21 < 0 || Static332.anInt6014 != 0 && local21 > Static332.anInt6014) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(101) byte[] local101 = new byte[local21];
			local13.method3963(local101, local21);
			return local101;
		} else {
			@Pc(47) int local47 = local13.method3925();
			if (local47 < 0 || Static332.anInt6014 != 0 && Static332.anInt6014 < local47) {
				throw new RuntimeException();
			}
			@Pc(68) byte[] local68 = new byte[local47];
			if (local17 == 1) {
				Static353.method5314(local68, local47, arg0, local21);
			} else {
				@Pc(83) Class76 local83 = Static194.aClass76_1;
				synchronized (Static194.aClass76_1) {
					Static194.aClass76_1.method1796(local68, local13);
				}
			}
			return local68;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z")
	public static boolean method6678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static51.method986(arg0, arg1) | (arg1 & 0x60000) != 0 || Static290.method6966(arg0, arg1) || Static206.method3558(arg0, arg1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FIIFIFII)[F")
	public static float[] method6681(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[5] = 0.0F;
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[3] = 0.0F;
		local6[8] = local17;
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		local6[2] = local25;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg2 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = 1.0F - local77;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg4 * arg4 + arg6 * arg6));
		if (local105 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local72 = (float) -arg4 / local105;
				local79 = (float) arg6 / local105;
			}
			local70[0] = local77 + local84 * local72 * local72;
			local70[5] = local72 * local94;
			local70[2] = local84 * local72 * local79;
			local70[3] = -local79 * local94;
			local70[1] = local79 * local94;
			local70[7] = local94 * -local72;
			local70[6] = local72 * local79 * local84;
			local70[8] = local77 + local84 * local79 * local79;
			local70[4] = local77;
			local9[0] = local70[6] * local6[2] + local70[3] * local6[1] + local70[0] * local6[0];
			local9[1] = local6[2] * local70[7] + local70[1] * local6[0] + local6[1] * local70[4];
			local9[2] = local6[0] * local70[2] + local6[1] * local70[5] + local6[2] * local70[8];
			local9[3] = local70[3] * local6[4] + local70[0] * local6[3] + local70[6] * local6[5];
			local9[4] = local6[5] * local70[7] + local70[4] * local6[4] + local70[1] * local6[3];
			local9[6] = local70[6] * local6[8] + local6[6] * local70[0] + local70[3] * local6[7];
			local9[5] = local6[5] * local70[8] + local6[4] * local70[5] + local70[2] * local6[3];
			local9[7] = local6[7] * local70[4] + local70[1] * local6[6] + local70[7] * local6[8];
			local9[8] = local70[8] * local6[8] + local6[7] * local70[5] + local70[2] * local6[6];
		}
		local9[3] *= arg5;
		local9[5] *= arg5;
		local9[1] *= arg0;
		local9[7] *= arg3;
		local9[2] *= arg0;
		local9[0] *= arg0;
		local9[6] *= arg3;
		local9[4] *= arg5;
		local9[8] *= arg3;
		return local9;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 512 || arg1 < 512 || Static459.anInt7799 * 512 - 1024 < arg0 || (Static482.anInt7990 - 2) * 512 < arg1) {
			Static393.anIntArray684[0] = Static393.anIntArray684[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static38.method884(arg2, arg0, arg1) - arg3;
		Static37.aClass118_3.TA(arg4, 0, 0);
		Static513.aClass122_10.method7250(Static37.aClass118_3);
		Static513.aClass122_10.IA(arg0, local49, arg1, Static393.anIntArray684);
		Static37.aClass118_3.TA(-arg4, 0, 0);
		Static513.aClass122_10.method7250(Static37.aClass118_3);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public static void method6685(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub11 local12 = Static541.method7520(11, arg0);
		local12.method4945();
	}
}
