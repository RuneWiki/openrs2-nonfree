import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class355 {

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "[I")
	public final int[] anIntArray596 = new int[2];

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "[I")
	private final int[] anIntArray597 = new int[2];

	@OriginalMember(owner = "client!vfa", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray19 = new int[2][2][4];

	@OriginalMember(owner = "client!vfa", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray20 = new int[2][2][4];

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!ig;Lclient!wda;)V")
	public void method8233(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(1) Class367 arg1) {
		@Pc(3) int local3 = arg0.method8525();
		this.anIntArray596[0] = local3 >> 4;
		this.anIntArray596[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray597[0] = this.anIntArray597[1] = 0;
			return;
		}
		this.anIntArray597[0] = arg0.method8578();
		this.anIntArray597[1] = arg0.method8578();
		@Pc(37) int local37 = arg0.method8525();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray596[local39]; local42++) {
				this.anIntArrayArrayArray20[local39][0][local42] = arg0.method8578();
				this.anIntArrayArrayArray19[local39][0][local42] = arg0.method8578();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray596[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray20[local42][1][local81] = this.anIntArrayArrayArray20[local42][0][local81];
					this.anIntArrayArrayArray19[local42][1][local81] = this.anIntArrayArrayArray19[local42][0][local81];
				} else {
					this.anIntArrayArrayArray20[local42][1][local81] = arg0.method8578();
					this.anIntArrayArrayArray19[local42][1][local81] = arg0.method8578();
				}
			}
		}
		if (local37 != 0 || this.anIntArray597[1] != this.anIntArray597[0]) {
			arg1.method8398(arg0);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIF)F")
	private float method8234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray19[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray19[arg0][1][arg1] - this.anIntArrayArrayArray19[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(IIF)F")
	private float method8235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray20[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray20[arg0][1][arg1] - this.anIntArrayArrayArray20[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static597.method8237(local34);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IF)I")
	public int method8236(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray597[0] + (float) (this.anIntArray597[1] - this.anIntArray597[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static597.aFloat196 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static597.anInt10198 = (int) (Static597.aFloat196 * 65536.0F);
		}
		if (this.anIntArray596[arg0] == 0) {
			return 0;
		}
		local20 = this.method8234(arg0, 0, arg1);
		Static597.aFloatArrayArray22[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method8235(arg0, 0, arg1));
		Static597.aFloatArrayArray22[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray596[arg0]; local77++) {
			local20 = this.method8234(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method8235(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static597.aFloatArrayArray22[arg0][local77 * 2 + 1] = Static597.aFloatArrayArray22[arg0][local77 * 2 - 1] * local101;
			Static597.aFloatArrayArray22[arg0][local77 * 2] = Static597.aFloatArrayArray22[arg0][local77 * 2 - 1] * local97 + Static597.aFloatArrayArray22[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static597.aFloatArrayArray22[arg0][local157] += Static597.aFloatArrayArray22[arg0][local157 - 1] * local97 + Static597.aFloatArrayArray22[arg0][local157 - 2] * local101;
			}
			Static597.aFloatArrayArray22[arg0][1] += Static597.aFloatArrayArray22[arg0][0] * local97 + local101;
			Static597.aFloatArrayArray22[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray596[0] * 2; local226++) {
				Static597.aFloatArrayArray22[0][local226] *= Static597.aFloat196;
			}
		}
		for (local226 = 0; local226 < this.anIntArray596[arg0] * 2; local226++) {
			Static597.anIntArrayArray63[arg0][local226] = (int) (Static597.aFloatArrayArray22[arg0][local226] * 65536.0F);
		}
		return this.anIntArray596[arg0] * 2;
	}
}
