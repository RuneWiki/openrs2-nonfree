import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class199 {

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "[I")
	private final int[] anIntArray598 = new int[2];

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray12 = new int[2][2][4];

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "[I")
	public final int[] anIntArray599 = new int[2];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!rg;Lclient!rq;)V")
	public void method5669(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) Class181 arg1) {
		@Pc(3) int local3 = arg0.method5115();
		this.anIntArray599[0] = local3 >> 4;
		this.anIntArray599[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray598[0] = this.anIntArray598[1] = 0;
			return;
		}
		this.anIntArray598[0] = arg0.method5106();
		this.anIntArray598[1] = arg0.method5106();
		@Pc(37) int local37 = arg0.method5115();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray599[local39]; local42++) {
				this.anIntArrayArrayArray11[local39][0][local42] = arg0.method5106();
				this.anIntArrayArrayArray12[local39][0][local42] = arg0.method5106();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray599[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray11[local42][1][local81] = this.anIntArrayArrayArray11[local42][0][local81];
					this.anIntArrayArrayArray12[local42][1][local81] = this.anIntArrayArrayArray12[local42][0][local81];
				} else {
					this.anIntArrayArrayArray11[local42][1][local81] = arg0.method5106();
					this.anIntArrayArrayArray12[local42][1][local81] = arg0.method5106();
				}
			}
		}
		if (local37 != 0 || this.anIntArray598[1] != this.anIntArray598[0]) {
			arg1.method4931(arg0);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIF)F")
	private float method5670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray12[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray12[arg0][1][arg1] - this.anIntArrayArrayArray12[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IF)I")
	public int method5671(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray598[0] + (float) (this.anIntArray598[1] - this.anIntArray598[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static328.aFloat65 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static328.anInt6344 = (int) (Static328.aFloat65 * 65536.0F);
		}
		if (this.anIntArray599[arg0] == 0) {
			return 0;
		}
		local20 = this.method5670(arg0, 0, arg1);
		Static328.aFloatArrayArray7[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5672(arg0, 0, arg1));
		Static328.aFloatArrayArray7[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray599[arg0]; local77++) {
			local20 = this.method5670(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5672(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static328.aFloatArrayArray7[arg0][local77 * 2 + 1] = Static328.aFloatArrayArray7[arg0][local77 * 2 - 1] * local101;
			Static328.aFloatArrayArray7[arg0][local77 * 2] = Static328.aFloatArrayArray7[arg0][local77 * 2 - 1] * local97 + Static328.aFloatArrayArray7[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static328.aFloatArrayArray7[arg0][local157] += Static328.aFloatArrayArray7[arg0][local157 - 1] * local97 + Static328.aFloatArrayArray7[arg0][local157 - 2] * local101;
			}
			Static328.aFloatArrayArray7[arg0][1] += Static328.aFloatArrayArray7[arg0][0] * local97 + local101;
			Static328.aFloatArrayArray7[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray599[0] * 2; local226++) {
				Static328.aFloatArrayArray7[0][local226] *= Static328.aFloat65;
			}
		}
		for (local226 = 0; local226 < this.anIntArray599[arg0] * 2; local226++) {
			Static328.anIntArrayArray96[arg0][local226] = (int) (Static328.aFloatArrayArray7[arg0][local226] * 65536.0F);
		}
		return this.anIntArray599[arg0] * 2;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(IIF)F")
	private float method5672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static328.method5667(local34);
	}
}
