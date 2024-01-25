import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class232 {

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray124 = new int[2][2][4];

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "[I")
	private final int[] anIntArray519 = new int[2];

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray123 = new int[2][2][4];

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "[I")
	public final int[] anIntArray520 = new int[2];

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IF)I")
	public int method5403(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray519[0] + (float) (this.anIntArray519[1] - this.anIntArray519[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static391.aFloat114 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static391.anInt7015 = (int) (Static391.aFloat114 * 65536.0F);
		}
		if (this.anIntArray520[arg0] == 0) {
			return 0;
		}
		local20 = this.method5408(arg0, 0, arg1);
		Static391.aFloatArrayArray9[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5406(arg0, 0, arg1));
		Static391.aFloatArrayArray9[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray520[arg0]; local77++) {
			local20 = this.method5408(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5406(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static391.aFloatArrayArray9[arg0][local77 * 2 + 1] = Static391.aFloatArrayArray9[arg0][local77 * 2 - 1] * local101;
			Static391.aFloatArrayArray9[arg0][local77 * 2] = Static391.aFloatArrayArray9[arg0][local77 * 2 - 1] * local97 + Static391.aFloatArrayArray9[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static391.aFloatArrayArray9[arg0][local157] += Static391.aFloatArrayArray9[arg0][local157 - 1] * local97 + Static391.aFloatArrayArray9[arg0][local157 - 2] * local101;
			}
			Static391.aFloatArrayArray9[arg0][1] += Static391.aFloatArrayArray9[arg0][0] * local97 + local101;
			Static391.aFloatArrayArray9[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray520[0] * 2; local226++) {
				Static391.aFloatArrayArray9[0][local226] *= Static391.aFloat114;
			}
		}
		for (local226 = 0; local226 < this.anIntArray520[arg0] * 2; local226++) {
			Static391.anIntArrayArray52[arg0][local226] = (int) (Static391.aFloatArrayArray9[arg0][local226] * 65536.0F);
		}
		return this.anIntArray520[arg0] * 2;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ti;Lclient!de;)V")
	public void method5405(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) Class54 arg1) {
		@Pc(3) int local3 = arg0.method4548();
		this.anIntArray520[0] = local3 >> 4;
		this.anIntArray520[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray519[0] = this.anIntArray519[1] = 0;
			return;
		}
		this.anIntArray519[0] = arg0.method4498();
		this.anIntArray519[1] = arg0.method4498();
		@Pc(37) int local37 = arg0.method4548();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray520[local39]; local42++) {
				this.anIntArrayArrayArray123[local39][0][local42] = arg0.method4498();
				this.anIntArrayArrayArray124[local39][0][local42] = arg0.method4498();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray520[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray123[local42][1][local81] = this.anIntArrayArrayArray123[local42][0][local81];
					this.anIntArrayArrayArray124[local42][1][local81] = this.anIntArrayArrayArray124[local42][0][local81];
				} else {
					this.anIntArrayArrayArray123[local42][1][local81] = arg0.method4498();
					this.anIntArrayArrayArray124[local42][1][local81] = arg0.method4498();
				}
			}
		}
		if (local37 != 0 || this.anIntArray519[1] != this.anIntArray519[0]) {
			arg1.method1002(arg0);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIF)F")
	private float method5406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray123[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray123[arg0][1][arg1] - this.anIntArrayArrayArray123[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static391.method5404(local34);
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(IIF)F")
	private float method5408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray124[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray124[arg0][1][arg1] - this.anIntArrayArrayArray124[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
