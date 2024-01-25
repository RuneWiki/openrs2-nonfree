import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "Lclient!hv;")
	public static Class156 aClass156_3;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "Lclient!vi;")
	public static Class369 aClass369_1;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public static int anInt5619 = 0;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "Z")
	public static boolean aBoolean485 = true;

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "Z")
	public static boolean aBoolean486 = false;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "J")
	public static long aLong136 = 0L;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(FI)F")
	public static float method4655(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIFFIIFI)[F")
	public static float[] method4657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[6] = -local25;
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(81) float local81 = (float) arg5 / 32767.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(87) float local87 = 1.0F - local81;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local81 * local81)));
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg4 * arg4 + arg0 * arg0));
		if (local109 == 0.0F && local81 == 0.0F) {
			local9 = local6;
		} else {
			if (local109 != 0.0F) {
				local83 = (float) arg0 / local109;
				local76 = (float) -arg4 / local109;
			}
			local69[7] = local98 * -local76;
			local69[4] = local81;
			local69[6] = local87 * local83 * local76;
			local69[2] = local76 * local83 * local87;
			local69[0] = local76 * local76 * local87 + local81;
			local69[8] = local81 + local83 * local83 * local87;
			local69[3] = -local83 * local98;
			local69[5] = local98 * local76;
			local69[1] = local98 * local83;
			local9[0] = local6[2] * local69[6] + local69[0] * local6[0] + local6[1] * local69[3];
			local9[1] = local6[2] * local69[7] + local69[1] * local6[0] + local6[1] * local69[4];
			local9[3] = local6[5] * local69[6] + local6[3] * local69[0] + local6[4] * local69[3];
			local9[2] = local69[8] * local6[2] + local6[1] * local69[5] + local69[2] * local6[0];
			local9[4] = local6[3] * local69[1] + local69[4] * local6[4] + local69[7] * local6[5];
			local9[6] = local69[6] * local6[8] + local6[6] * local69[0] + local6[7] * local69[3];
			local9[5] = local6[3] * local69[2] + local69[5] * local6[4] + local69[8] * local6[5];
			local9[7] = local6[7] * local69[4] + local6[6] * local69[1] + local69[7] * local6[8];
			local9[8] = local6[8] * local69[8] + local6[6] * local69[2] + local6[7] * local69[5];
		}
		local9[0] *= arg3;
		local9[4] *= arg2;
		local9[7] *= arg6;
		local9[8] *= arg6;
		local9[3] *= arg2;
		local9[5] *= arg2;
		local9[6] *= arg6;
		local9[1] *= arg3;
		local9[2] *= arg3;
		return local9;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZII)I")
	public static int method4658(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(35) int local35 = (arg0 & 0x7F) * 96 >> 7;
			if (local35 < 2) {
				local35 = 2;
			} else if (local35 > 126) {
				local35 = 126;
			}
			return local35 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)Lclient!mf;")
	public static Class226 method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static635.aClass226ArrayArrayArray3[0][arg1][arg2] != null && Static635.aClass226ArrayArrayArray3[0][arg1][arg2].aClass226_1 != null;
			if (local28 && arg0 >= Static219.anInt4088 - 1) {
				return null;
			}
			Static203.method3288(arg0, arg1, arg2);
		}
		return Static635.aClass226ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)Z")
	public static boolean method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static169.method2949(arg0, arg1) | (arg0 & 0x70000) != 0 || Static399.method5900(arg0, arg1);
	}
}
