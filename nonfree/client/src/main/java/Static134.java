import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
	public static int anInt2495;

	@OriginalMember(owner = "client!eba", name = "m", descriptor = "[Lclient!bka;")
	public static Class9[] aClass9Array8;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "S")
	public static short aShort20 = 1;

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
	public static int anInt2496 = 0;

	@OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
	public static int anInt2499 = 0;

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
	public static int anInt2500 = 255;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IFIIFFII)[F")
	public static float[] method2212(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) float[] local12 = new float[9];
		@Pc(15) float[] local15 = new float[9];
		@Pc(23) float local23 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(31) float local31 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local12[6] = -local31;
		local12[3] = 0.0F;
		local12[5] = 0.0F;
		local12[8] = local23;
		local12[7] = 0.0F;
		local12[2] = local31;
		local12[1] = 0.0F;
		local12[4] = 1.0F;
		local12[0] = local23;
		@Pc(76) float[] local76 = new float[9];
		@Pc(78) float local78 = 1.0F;
		@Pc(80) float local80 = 0.0F;
		@Pc(85) float local85 = (float) arg2 / 32767.0F;
		@Pc(95) float local95 = -((float) Math.sqrt((double) (1.0F - local85 * local85)));
		@Pc(99) float local99 = 1.0F - local85;
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg0 * arg0 + arg6 * arg6));
		if (local110 == 0.0F && local85 == 0.0F) {
			local15 = local12;
		} else {
			if (local110 != 0.0F) {
				local78 = (float) -arg6 / local110;
				local80 = (float) arg0 / local110;
			}
			local76[0] = local85 + local99 * local78 * local78;
			local76[5] = local78 * local95;
			local76[8] = local85 + local80 * local80 * local99;
			local76[4] = local85;
			local76[3] = -local80 * local95;
			local76[6] = local99 * local78 * local80;
			local76[7] = local95 * -local78;
			local76[1] = local80 * local95;
			local76[2] = local99 * local78 * local80;
			local15[0] = local76[3] * local12[1] + local12[0] * local76[0] + local76[6] * local12[2];
			local15[1] = local12[1] * local76[4] + local12[0] * local76[1] + local76[7] * local12[2];
			local15[2] = local76[8] * local12[2] + local76[2] * local12[0] + local76[5] * local12[1];
			local15[3] = local12[3] * local76[0] + local76[3] * local12[4] + local12[5] * local76[6];
			local15[4] = local76[1] * local12[3] + local76[4] * local12[4] + local12[5] * local76[7];
			local15[5] = local12[3] * local76[2] + local12[4] * local76[5] + local12[5] * local76[8];
			local15[6] = local76[0] * local12[6] + local12[7] * local76[3] + local12[8] * local76[6];
			local15[7] = local76[4] * local12[7] + local76[1] * local12[6] + local76[7] * local12[8];
			local15[8] = local76[5] * local12[7] + local76[2] * local12[6] + local76[8] * local12[8];
		}
		local15[0] *= arg4;
		local15[7] *= arg1;
		local15[1] *= arg4;
		local15[6] *= arg1;
		local15[8] *= arg1;
		local15[2] *= arg4;
		local15[4] *= arg3;
		local15[5] *= arg3;
		local15[3] *= arg3;
		return local15;
	}
}
