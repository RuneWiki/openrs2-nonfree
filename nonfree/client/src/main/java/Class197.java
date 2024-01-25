import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class197 {

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray10 = new int[2][2][4];

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "[I")
	public final int[] anIntArray510 = new int[2];

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "[I")
	private final int[] anIntArray511 = new int[2];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIF)F")
	private float method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray10[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray10[arg0][1][arg1] - this.anIntArrayArrayArray10[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IF)I")
	public int method4484(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray511[0] + (float) (this.anIntArray511[1] - this.anIntArray511[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static330.aFloat162 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static330.anInt5811 = (int) (Static330.aFloat162 * 65536.0F);
		}
		if (this.anIntArray510[arg0] == 0) {
			return 0;
		}
		local20 = this.method4483(arg0, 0, arg1);
		Static330.aFloatArrayArray9[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method4487(arg0, 0, arg1));
		Static330.aFloatArrayArray9[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray510[arg0]; local77++) {
			local20 = this.method4483(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method4487(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static330.aFloatArrayArray9[arg0][local77 * 2 + 1] = Static330.aFloatArrayArray9[arg0][local77 * 2 - 1] * local101;
			Static330.aFloatArrayArray9[arg0][local77 * 2] = Static330.aFloatArrayArray9[arg0][local77 * 2 - 1] * local97 + Static330.aFloatArrayArray9[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static330.aFloatArrayArray9[arg0][local157] += Static330.aFloatArrayArray9[arg0][local157 - 1] * local97 + Static330.aFloatArrayArray9[arg0][local157 - 2] * local101;
			}
			Static330.aFloatArrayArray9[arg0][1] += Static330.aFloatArrayArray9[arg0][0] * local97 + local101;
			Static330.aFloatArrayArray9[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray510[0] * 2; local226++) {
				Static330.aFloatArrayArray9[0][local226] *= Static330.aFloat162;
			}
		}
		for (local226 = 0; local226 < this.anIntArray510[arg0] * 2; local226++) {
			Static330.anIntArrayArray52[arg0][local226] = (int) (Static330.aFloatArrayArray9[arg0][local226] * 65536.0F);
		}
		return this.anIntArray510[arg0] * 2;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!tl;Lclient!ov;)V")
	public void method4486(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(1) Class181 arg1) {
		@Pc(3) int local3 = arg0.method4864();
		this.anIntArray510[0] = local3 >> 4;
		this.anIntArray510[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray511[0] = this.anIntArray511[1] = 0;
			return;
		}
		this.anIntArray511[0] = arg0.method4877();
		this.anIntArray511[1] = arg0.method4877();
		@Pc(37) int local37 = arg0.method4864();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray510[local39]; local42++) {
				this.anIntArrayArrayArray11[local39][0][local42] = arg0.method4877();
				this.anIntArrayArrayArray10[local39][0][local42] = arg0.method4877();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray510[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray11[local42][1][local81] = this.anIntArrayArrayArray11[local42][0][local81];
					this.anIntArrayArrayArray10[local42][1][local81] = this.anIntArrayArrayArray10[local42][0][local81];
				} else {
					this.anIntArrayArrayArray11[local42][1][local81] = arg0.method4877();
					this.anIntArrayArrayArray10[local42][1][local81] = arg0.method4877();
				}
			}
		}
		if (local37 != 0 || this.anIntArray511[1] != this.anIntArray511[0]) {
			arg1.method4074(arg0);
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(IIF)F")
	private float method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static330.method4488(local34);
	}
}
