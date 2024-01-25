import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!ga;")
	public static Class111 aClass111_76;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_33 = new Class201(6, 0, 4, 2);

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_138 = new Class81(96, 12);

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)V")
	public static void method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static118.aClass293ArrayArrayArray14[0][arg1][arg2] != null && Static118.aClass293ArrayArrayArray14[0][arg1][arg2].aClass293_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static118.aClass293ArrayArrayArray14[local22][arg1][arg2] == null) {
				@Pc(44) Class293 local44 = Static118.aClass293ArrayArrayArray14[local22][arg1][arg2] = new Class293(local22);
				if (local20) {
					local44.aByte100++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIFFFZII)[F")
	public static float[] method4979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[5] = 0.0F;
		local6[8] = local17;
		local6[2] = local25;
		local6[1] = 0.0F;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[6] = -local25;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(81) float local81 = (float) arg5 / 32767.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(88) float local88 = 1.0F - local81;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local81 * local81)));
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg0 * arg0 + arg6 * arg6));
		if (local110 == 0.0F && local81 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local71 = (float) -arg6 / local110;
				local83 = (float) arg0 / local110;
			}
			local69[6] = local71 * local83 * local88;
			local69[5] = local98 * local71;
			local69[4] = local81;
			local69[2] = local83 * local71 * local88;
			local69[1] = local83 * local98;
			local69[0] = local81 + local71 * local71 * local88;
			local69[8] = local81 + local83 * local83 * local88;
			local69[3] = -local83 * local98;
			local69[7] = -local71 * local98;
			local9[0] = local69[6] * local6[2] + local6[0] * local69[0] + local69[3] * local6[1];
			local9[1] = local6[0] * local69[1] + local6[1] * local69[4] + local6[2] * local69[7];
			local9[3] = local6[5] * local69[6] + local6[3] * local69[0] + local6[4] * local69[3];
			local9[2] = local6[0] * local69[2] + local69[5] * local6[1] + local69[8] * local6[2];
			local9[4] = local6[4] * local69[4] + local6[3] * local69[1] + local6[5] * local69[7];
			local9[6] = local69[3] * local6[7] + local69[0] * local6[6] + local69[6] * local6[8];
			local9[5] = local69[8] * local6[5] + local6[4] * local69[5] + local69[2] * local6[3];
			local9[7] = local69[7] * local6[8] + local69[4] * local6[7] + local69[1] * local6[6];
			local9[8] = local6[8] * local69[8] + local69[5] * local6[7] + local6[6] * local69[2];
		}
		local9[3] *= arg2;
		local9[7] *= arg4;
		local9[2] *= arg3;
		local9[4] *= arg2;
		local9[8] *= arg4;
		local9[1] *= arg3;
		local9[0] *= arg3;
		local9[5] *= arg2;
		local9[6] *= arg4;
		return local9;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public static void method4980() {
		if (Static246.aClass114_10.aBoolean212 && Static159.aClass174_2.anInt4666 != -1) {
			Static473.method6674(Static159.aClass174_2.aString46, Static159.aClass174_2.anInt4666);
		}
	}
}
