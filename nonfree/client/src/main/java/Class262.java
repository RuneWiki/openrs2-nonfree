import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class262 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "[I")
	public final int[] anIntArray621 = new int[2];

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray14 = new int[2][2][4];

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "[I")
	private final int[] anIntArray622 = new int[2];

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray15 = new int[2][2][4];

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ha;Lclient!pq;)V")
	public void method5901(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) Class203 arg1) {
		@Pc(3) int local3 = arg0.method3111();
		this.anIntArray621[0] = local3 >> 4;
		this.anIntArray621[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray622[0] = this.anIntArray622[1] = 0;
			return;
		}
		this.anIntArray622[0] = arg0.method3108();
		this.anIntArray622[1] = arg0.method3108();
		@Pc(37) int local37 = arg0.method3111();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray621[local39]; local42++) {
				this.anIntArrayArrayArray15[local39][0][local42] = arg0.method3108();
				this.anIntArrayArrayArray14[local39][0][local42] = arg0.method3108();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray621[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray15[local42][1][local81] = this.anIntArrayArrayArray15[local42][0][local81];
					this.anIntArrayArrayArray14[local42][1][local81] = this.anIntArrayArrayArray14[local42][0][local81];
				} else {
					this.anIntArrayArrayArray15[local42][1][local81] = arg0.method3108();
					this.anIntArrayArrayArray14[local42][1][local81] = arg0.method3108();
				}
			}
		}
		if (local37 != 0 || this.anIntArray622[1] != this.anIntArray622[0]) {
			arg1.method4481(arg0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IF)I")
	public int method5902(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray622[0] + (float) (this.anIntArray622[1] - this.anIntArray622[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static438.aFloat105 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static438.anInt7198 = (int) (Static438.aFloat105 * 65536.0F);
		}
		if (this.anIntArray621[arg0] == 0) {
			return 0;
		}
		local20 = this.method5905(arg0, 0, arg1);
		Static438.aFloatArrayArray9[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5904(arg0, 0, arg1));
		Static438.aFloatArrayArray9[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray621[arg0]; local77++) {
			local20 = this.method5905(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5904(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static438.aFloatArrayArray9[arg0][local77 * 2 + 1] = Static438.aFloatArrayArray9[arg0][local77 * 2 - 1] * local101;
			Static438.aFloatArrayArray9[arg0][local77 * 2] = Static438.aFloatArrayArray9[arg0][local77 * 2 - 1] * local97 + Static438.aFloatArrayArray9[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static438.aFloatArrayArray9[arg0][local157] += Static438.aFloatArrayArray9[arg0][local157 - 1] * local97 + Static438.aFloatArrayArray9[arg0][local157 - 2] * local101;
			}
			Static438.aFloatArrayArray9[arg0][1] += Static438.aFloatArrayArray9[arg0][0] * local97 + local101;
			Static438.aFloatArrayArray9[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray621[0] * 2; local226++) {
				Static438.aFloatArrayArray9[0][local226] *= Static438.aFloat105;
			}
		}
		for (local226 = 0; local226 < this.anIntArray621[arg0] * 2; local226++) {
			Static438.anIntArrayArray58[arg0][local226] = (int) (Static438.aFloatArrayArray9[arg0][local226] * 65536.0F);
		}
		return this.anIntArray621[arg0] * 2;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIF)F")
	private float method5904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray15[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray15[arg0][1][arg1] - this.anIntArrayArrayArray15[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static438.method5903(local34);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIF)F")
	private float method5905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray14[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray14[arg0][1][arg1] - this.anIntArrayArrayArray14[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
