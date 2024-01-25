import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class241 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "[I")
	private final int[] anIntArray573 = new int[2];

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
	public final int[] anIntArray574 = new int[2];

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray18 = new int[2][2][4];

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray17 = new int[2][2][4];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IF)I")
	public int method5766(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray573[0] + (float) (this.anIntArray573[1] - this.anIntArray573[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static407.aFloat136 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static407.anInt6473 = (int) (Static407.aFloat136 * 65536.0F);
		}
		if (this.anIntArray574[arg0] == 0) {
			return 0;
		}
		local20 = this.method5767(arg0, 0, arg1);
		Static407.aFloatArrayArray11[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5769(arg0, 0, arg1));
		Static407.aFloatArrayArray11[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray574[arg0]; local77++) {
			local20 = this.method5767(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5769(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static407.aFloatArrayArray11[arg0][local77 * 2 + 1] = Static407.aFloatArrayArray11[arg0][local77 * 2 - 1] * local101;
			Static407.aFloatArrayArray11[arg0][local77 * 2] = Static407.aFloatArrayArray11[arg0][local77 * 2 - 1] * local97 + Static407.aFloatArrayArray11[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static407.aFloatArrayArray11[arg0][local157] += Static407.aFloatArrayArray11[arg0][local157 - 1] * local97 + Static407.aFloatArrayArray11[arg0][local157 - 2] * local101;
			}
			Static407.aFloatArrayArray11[arg0][1] += Static407.aFloatArrayArray11[arg0][0] * local97 + local101;
			Static407.aFloatArrayArray11[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray574[0] * 2; local226++) {
				Static407.aFloatArrayArray11[0][local226] *= Static407.aFloat136;
			}
		}
		for (local226 = 0; local226 < this.anIntArray574[arg0] * 2; local226++) {
			Static407.anIntArrayArray43[arg0][local226] = (int) (Static407.aFloatArrayArray11[arg0][local226] * 65536.0F);
		}
		return this.anIntArray574[arg0] * 2;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIF)F")
	private float method5767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray17[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray17[arg0][1][arg1] - this.anIntArrayArrayArray17[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!jp;Lclient!vca;)V")
	public void method5768(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) Class362 arg1) {
		@Pc(3) int local3 = arg0.method8632();
		this.anIntArray574[0] = local3 >> 4;
		this.anIntArray574[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray573[0] = this.anIntArray573[1] = 0;
			return;
		}
		this.anIntArray573[0] = arg0.method8593();
		this.anIntArray573[1] = arg0.method8593();
		@Pc(37) int local37 = arg0.method8632();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray574[local39]; local42++) {
				this.anIntArrayArrayArray18[local39][0][local42] = arg0.method8593();
				this.anIntArrayArrayArray17[local39][0][local42] = arg0.method8593();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray574[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray18[local42][1][local81] = this.anIntArrayArrayArray18[local42][0][local81];
					this.anIntArrayArrayArray17[local42][1][local81] = this.anIntArrayArrayArray17[local42][0][local81];
				} else {
					this.anIntArrayArrayArray18[local42][1][local81] = arg0.method8593();
					this.anIntArrayArrayArray17[local42][1][local81] = arg0.method8593();
				}
			}
		}
		if (local37 != 0 || this.anIntArray573[1] != this.anIntArray573[0]) {
			arg1.method8781(arg0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(IIF)F")
	private float method5769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray18[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray18[arg0][1][arg1] - this.anIntArrayArrayArray18[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static407.method5770(local34);
	}
}
