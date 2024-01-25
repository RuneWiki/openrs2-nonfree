import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class197 {

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "[I")
	private final int[] anIntArray445 = new int[2];

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "[I")
	public final int[] anIntArray446 = new int[2];

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray10 = new int[2][2][4];

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIF)F")
	private float method4377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray10[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray10[arg0][1][arg1] - this.anIntArrayArrayArray10[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!si;Lclient!bs;)V")
	public void method4378(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) Class31 arg1) {
		@Pc(3) int local3 = arg0.method5495();
		this.anIntArray446[0] = local3 >> 4;
		this.anIntArray446[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray445[0] = this.anIntArray445[1] = 0;
			return;
		}
		this.anIntArray445[0] = arg0.method5500();
		this.anIntArray445[1] = arg0.method5500();
		@Pc(37) int local37 = arg0.method5495();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray446[local39]; local42++) {
				this.anIntArrayArrayArray11[local39][0][local42] = arg0.method5500();
				this.anIntArrayArrayArray10[local39][0][local42] = arg0.method5500();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray446[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray11[local42][1][local81] = this.anIntArrayArrayArray11[local42][0][local81];
					this.anIntArrayArrayArray10[local42][1][local81] = this.anIntArrayArrayArray10[local42][0][local81];
				} else {
					this.anIntArrayArrayArray11[local42][1][local81] = arg0.method5500();
					this.anIntArrayArrayArray10[local42][1][local81] = arg0.method5500();
				}
			}
		}
		if (local37 != 0 || this.anIntArray445[1] != this.anIntArray445[0]) {
			arg1.method578(arg0);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IF)I")
	public int method4381(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray445[0] + (float) (this.anIntArray445[1] - this.anIntArray445[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static310.aFloat78 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static310.anInt5486 = (int) (Static310.aFloat78 * 65536.0F);
		}
		if (this.anIntArray446[arg0] == 0) {
			return 0;
		}
		local20 = this.method4377(arg0, 0, arg1);
		Static310.aFloatArrayArray9[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method4382(arg0, 0, arg1));
		Static310.aFloatArrayArray9[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray446[arg0]; local77++) {
			local20 = this.method4377(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method4382(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static310.aFloatArrayArray9[arg0][local77 * 2 + 1] = Static310.aFloatArrayArray9[arg0][local77 * 2 - 1] * local101;
			Static310.aFloatArrayArray9[arg0][local77 * 2] = Static310.aFloatArrayArray9[arg0][local77 * 2 - 1] * local97 + Static310.aFloatArrayArray9[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static310.aFloatArrayArray9[arg0][local157] += Static310.aFloatArrayArray9[arg0][local157 - 1] * local97 + Static310.aFloatArrayArray9[arg0][local157 - 2] * local101;
			}
			Static310.aFloatArrayArray9[arg0][1] += Static310.aFloatArrayArray9[arg0][0] * local97 + local101;
			Static310.aFloatArrayArray9[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray446[0] * 2; local226++) {
				Static310.aFloatArrayArray9[0][local226] *= Static310.aFloat78;
			}
		}
		for (local226 = 0; local226 < this.anIntArray446[arg0] * 2; local226++) {
			Static310.anIntArrayArray54[arg0][local226] = (int) (Static310.aFloatArrayArray9[arg0][local226] * 65536.0F);
		}
		return this.anIntArray446[arg0] * 2;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(IIF)F")
	private float method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static310.method4380(local34);
	}
}
