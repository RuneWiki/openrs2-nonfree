import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class213 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray19 = new int[2][2][4];

	@OriginalMember(owner = "client!og", name = "b", descriptor = "[I")
	public final int[] anIntArray509 = new int[2];

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
	private final int[] anIntArray510 = new int[2];

	@OriginalMember(owner = "client!og", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray20 = new int[2][2][4];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIF)F")
	private float method5418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray20[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray20[arg0][1][arg1] - this.anIntArrayArrayArray20[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IF)I")
	public int method5419(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray510[0] + (float) (this.anIntArray510[1] - this.anIntArray510[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static345.aFloat141 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static345.anInt6363 = (int) (Static345.aFloat141 * 65536.0F);
		}
		if (this.anIntArray509[arg0] == 0) {
			return 0;
		}
		local20 = this.method5418(arg0, 0, arg1);
		Static345.aFloatArrayArray10[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5423(arg0, 0, arg1));
		Static345.aFloatArrayArray10[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray509[arg0]; local77++) {
			local20 = this.method5418(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5423(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static345.aFloatArrayArray10[arg0][local77 * 2 + 1] = Static345.aFloatArrayArray10[arg0][local77 * 2 - 1] * local101;
			Static345.aFloatArrayArray10[arg0][local77 * 2] = Static345.aFloatArrayArray10[arg0][local77 * 2 - 1] * local97 + Static345.aFloatArrayArray10[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static345.aFloatArrayArray10[arg0][local157] += Static345.aFloatArrayArray10[arg0][local157 - 1] * local97 + Static345.aFloatArrayArray10[arg0][local157 - 2] * local101;
			}
			Static345.aFloatArrayArray10[arg0][1] += Static345.aFloatArrayArray10[arg0][0] * local97 + local101;
			Static345.aFloatArrayArray10[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray509[0] * 2; local226++) {
				Static345.aFloatArrayArray10[0][local226] *= Static345.aFloat141;
			}
		}
		for (local226 = 0; local226 < this.anIntArray509[arg0] * 2; local226++) {
			Static345.anIntArrayArray57[arg0][local226] = (int) (Static345.aFloatArrayArray10[arg0][local226] * 65536.0F);
		}
		return this.anIntArray509[arg0] * 2;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ps;Lclient!raa;)V")
	public void method5421(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) Class244 arg1) {
		@Pc(3) int local3 = arg0.method5170();
		this.anIntArray509[0] = local3 >> 4;
		this.anIntArray509[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray510[0] = this.anIntArray510[1] = 0;
			return;
		}
		this.anIntArray510[0] = arg0.method5229();
		this.anIntArray510[1] = arg0.method5229();
		@Pc(37) int local37 = arg0.method5170();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray509[local39]; local42++) {
				this.anIntArrayArrayArray19[local39][0][local42] = arg0.method5229();
				this.anIntArrayArrayArray20[local39][0][local42] = arg0.method5229();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray509[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray19[local42][1][local81] = this.anIntArrayArrayArray19[local42][0][local81];
					this.anIntArrayArrayArray20[local42][1][local81] = this.anIntArrayArrayArray20[local42][0][local81];
				} else {
					this.anIntArrayArrayArray19[local42][1][local81] = arg0.method5229();
					this.anIntArrayArrayArray20[local42][1][local81] = arg0.method5229();
				}
			}
		}
		if (local37 != 0 || this.anIntArray510[1] != this.anIntArray510[0]) {
			arg1.method6408(arg0);
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IIF)F")
	private float method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray19[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray19[arg0][1][arg1] - this.anIntArrayArrayArray19[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static345.method5420(local34);
	}
}
