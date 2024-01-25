import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_19 = new Class276(82, 6);

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	public static int anInt1342 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IFIFIFBI)[F")
	public static float[] method1331(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[3] = 0.0F;
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[2] = local25;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[7] = 0.0F;
		local6[6] = -local25;
		local6[5] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg2 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(83) float local83 = 1.0F - local77;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg6 * arg6 + arg4 * arg4));
		if (local106 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local72 = (float) -arg4 / local106;
				local79 = (float) arg6 / local106;
			}
			local70[7] = local94 * -local72;
			local70[2] = local79 * local72 * local83;
			local70[1] = local94 * local79;
			local70[4] = local77;
			local70[6] = local72 * local79 * local83;
			local70[3] = -local79 * local94;
			local70[8] = local83 * local79 * local79 + local77;
			local70[5] = local72 * local94;
			local70[0] = local77 + local72 * local72 * local83;
			local9[0] = local70[6] * local6[2] + local6[1] * local70[3] + local6[0] * local70[0];
			local9[1] = local70[7] * local6[2] + local70[4] * local6[1] + local70[1] * local6[0];
			local9[2] = local70[8] * local6[2] + local70[5] * local6[1] + local6[0] * local70[2];
			local9[3] = local6[4] * local70[3] + local70[0] * local6[3] + local70[6] * local6[5];
			local9[4] = local70[7] * local6[5] + local70[1] * local6[3] + local70[4] * local6[4];
			local9[5] = local6[5] * local70[8] + local6[3] * local70[2] + local6[4] * local70[5];
			local9[6] = local6[8] * local70[6] + local70[0] * local6[6] + local6[7] * local70[3];
			local9[7] = local70[7] * local6[8] + local70[4] * local6[7] + local6[6] * local70[1];
			local9[8] = local6[8] * local70[8] + local6[7] * local70[5] + local70[2] * local6[6];
		}
		local9[5] *= arg3;
		local9[7] *= arg1;
		local9[6] *= arg1;
		local9[3] *= arg3;
		local9[1] *= arg5;
		local9[2] *= arg5;
		local9[0] *= arg5;
		local9[4] *= arg3;
		local9[8] *= arg1;
		return local9;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZC)I")
	public static int method1332(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class3_Sub4_Sub2_Sub1.anIntArray63.length > arg0 ? Class3_Sub4_Sub2_Sub1.anIntArray63[arg0] : -1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lclient!xa;B)V")
	public static void method1334(@OriginalArg(0) Class37[] arg0) {
		Static347.anInt7042 = arg0.length;
		Static528.aClass37Array11 = new Class37[Static347.anInt7042 + 10];
		Static282.anIntArray362 = new int[Static347.anInt7042 + 10];
		Static602.method4664(arg0, 0, Static528.aClass37Array11, 0, Static347.anInt7042);
		for (@Pc(32) int local32 = 0; local32 < Static347.anInt7042; local32++) {
			Static282.anIntArray362[local32] = Static528.aClass37Array11[local32].a();
		}
		for (@Pc(46) int local46 = Static347.anInt7042; local46 < Static528.aClass37Array11.length; local46++) {
			Static282.anIntArray362[local46] = 12;
		}
	}
}
