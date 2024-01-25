import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class211 {

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "[I")
	public final int[] anIntArray441 = new int[2];

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "[I")
	private final int[] anIntArray442 = new int[2];

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8 = new int[2][2][4];

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray9 = new int[2][2][4];

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIF)F")
	private float method5067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray9[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray9[arg0][1][arg1] - this.anIntArrayArrayArray9[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!jr;Lclient!tca;)V")
	public void method5068(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(1) Class302 arg1) {
		@Pc(3) int local3 = arg0.method6019();
		this.anIntArray441[0] = local3 >> 4;
		this.anIntArray441[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray442[0] = this.anIntArray442[1] = 0;
			return;
		}
		this.anIntArray442[0] = arg0.method6044();
		this.anIntArray442[1] = arg0.method6044();
		@Pc(37) int local37 = arg0.method6019();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray441[local39]; local42++) {
				this.anIntArrayArrayArray8[local39][0][local42] = arg0.method6044();
				this.anIntArrayArrayArray9[local39][0][local42] = arg0.method6044();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray441[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray8[local42][1][local81] = this.anIntArrayArrayArray8[local42][0][local81];
					this.anIntArrayArrayArray9[local42][1][local81] = this.anIntArrayArrayArray9[local42][0][local81];
				} else {
					this.anIntArrayArrayArray8[local42][1][local81] = arg0.method6044();
					this.anIntArrayArrayArray9[local42][1][local81] = arg0.method6044();
				}
			}
		}
		if (local37 != 0 || this.anIntArray442[1] != this.anIntArray442[0]) {
			arg1.method6856(arg0);
		}
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(IIF)F")
	private float method5069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray8[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray8[arg0][1][arg1] - this.anIntArrayArrayArray8[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static330.method5070(local34);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IF)I")
	public int method5072(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray442[0] + (float) (this.anIntArray442[1] - this.anIntArray442[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static330.aFloat153 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static330.anInt6255 = (int) (Static330.aFloat153 * 65536.0F);
		}
		if (this.anIntArray441[arg0] == 0) {
			return 0;
		}
		local20 = this.method5067(arg0, 0, arg1);
		Static330.aFloatArrayArray11[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5069(arg0, 0, arg1));
		Static330.aFloatArrayArray11[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray441[arg0]; local77++) {
			local20 = this.method5067(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5069(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static330.aFloatArrayArray11[arg0][local77 * 2 + 1] = Static330.aFloatArrayArray11[arg0][local77 * 2 - 1] * local101;
			Static330.aFloatArrayArray11[arg0][local77 * 2] = Static330.aFloatArrayArray11[arg0][local77 * 2 - 1] * local97 + Static330.aFloatArrayArray11[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static330.aFloatArrayArray11[arg0][local157] += Static330.aFloatArrayArray11[arg0][local157 - 1] * local97 + Static330.aFloatArrayArray11[arg0][local157 - 2] * local101;
			}
			Static330.aFloatArrayArray11[arg0][1] += Static330.aFloatArrayArray11[arg0][0] * local97 + local101;
			Static330.aFloatArrayArray11[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray441[0] * 2; local226++) {
				Static330.aFloatArrayArray11[0][local226] *= Static330.aFloat153;
			}
		}
		for (local226 = 0; local226 < this.anIntArray441[arg0] * 2; local226++) {
			Static330.anIntArrayArray49[arg0][local226] = (int) (Static330.aFloatArrayArray11[arg0][local226] * 65536.0F);
		}
		return this.anIntArray441[arg0] * 2;
	}
}
