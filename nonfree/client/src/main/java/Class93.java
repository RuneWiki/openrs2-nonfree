import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class93 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray10 = new int[2][2][4];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "[I")
	public final int[] anIntArray502 = new int[2];

	@OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
	private final int[] anIntArray503 = new int[2];

	@OriginalMember(owner = "client!we", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray9 = new int[2][2][4];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIF)F")
	private float method3542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray10[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray10[arg0][1][arg1] - this.anIntArrayArrayArray10[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static195.method3543(local34);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IF)I")
	public int method3544(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray503[0] + (float) (this.anIntArray503[1] - this.anIntArray503[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static195.aFloat3 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static195.anInt4623 = (int) (Static195.aFloat3 * 65536.0F);
		}
		if (this.anIntArray502[arg0] == 0) {
			return 0;
		}
		local20 = this.method3547(arg0, 0, arg1);
		Static195.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method3542(arg0, 0, arg1));
		Static195.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray502[arg0]; local77++) {
			local20 = this.method3547(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method3542(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static195.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static195.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static195.aFloatArrayArray2[arg0][local77 * 2] = Static195.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static195.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static195.aFloatArrayArray2[arg0][local157] += Static195.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static195.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static195.aFloatArrayArray2[arg0][1] += Static195.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static195.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray502[0] * 2; local226++) {
				Static195.aFloatArrayArray2[0][local226] *= Static195.aFloat3;
			}
		}
		for (local226 = 0; local226 < this.anIntArray502[arg0] * 2; local226++) {
			Static195.anIntArrayArray34[arg0][local226] = (int) (Static195.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray502[arg0] * 2;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!og;Lclient!j;)V")
	public void method3546(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) Class39 arg1) {
		@Pc(3) int local3 = arg0.method218();
		this.anIntArray502[0] = local3 >> 4;
		this.anIntArray502[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray503[0] = this.anIntArray503[1] = 0;
			return;
		}
		this.anIntArray503[0] = arg0.method234();
		this.anIntArray503[1] = arg0.method234();
		@Pc(37) int local37 = arg0.method218();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray502[local39]; local42++) {
				this.anIntArrayArrayArray10[local39][0][local42] = arg0.method234();
				this.anIntArrayArrayArray9[local39][0][local42] = arg0.method234();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray502[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray10[local42][1][local81] = this.anIntArrayArrayArray10[local42][0][local81];
					this.anIntArrayArrayArray9[local42][1][local81] = this.anIntArrayArrayArray9[local42][0][local81];
				} else {
					this.anIntArrayArrayArray10[local42][1][local81] = arg0.method234();
					this.anIntArrayArrayArray9[local42][1][local81] = arg0.method234();
				}
			}
		}
		if (local37 != 0 || this.anIntArray503[1] != this.anIntArray503[0]) {
			arg1.method1915(arg0);
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IIF)F")
	private float method3547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray9[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray9[arg0][1][arg1] - this.anIntArrayArrayArray9[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
