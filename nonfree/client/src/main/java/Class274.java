import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class274 {

	@OriginalMember(owner = "client!po", name = "c", descriptor = "[I")
	private final int[] anIntArray404 = new int[2];

	@OriginalMember(owner = "client!po", name = "b", descriptor = "[I")
	public final int[] anIntArray403 = new int[2];

	@OriginalMember(owner = "client!po", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!po", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIF)F")
	private float method6633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ofa;Lclient!sc;)V")
	public void method6634(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(1) Class312 arg1) {
		@Pc(3) int local3 = arg0.method5966();
		this.anIntArray403[0] = local3 >> 4;
		this.anIntArray403[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray404[0] = this.anIntArray404[1] = 0;
			return;
		}
		this.anIntArray404[0] = arg0.method5968();
		this.anIntArray404[1] = arg0.method5968();
		@Pc(37) int local37 = arg0.method5966();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray403[local39]; local42++) {
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method5968();
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method5968();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray403[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
				} else {
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method5968();
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method5968();
				}
			}
		}
		if (local37 != 0 || this.anIntArray404[1] != this.anIntArray404[0]) {
			arg1.method7537(arg0);
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(IIF)F")
	private float method6635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static434.method6631(local34);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IF)I")
	public int method6636(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray404[0] + (float) (this.anIntArray404[1] - this.anIntArray404[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static434.aFloat137 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static434.anInt7483 = (int) (Static434.aFloat137 * 65536.0F);
		}
		if (this.anIntArray403[arg0] == 0) {
			return 0;
		}
		local20 = this.method6633(arg0, 0, arg1);
		Static434.aFloatArrayArray12[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method6635(arg0, 0, arg1));
		Static434.aFloatArrayArray12[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray403[arg0]; local77++) {
			local20 = this.method6633(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method6635(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static434.aFloatArrayArray12[arg0][local77 * 2 + 1] = Static434.aFloatArrayArray12[arg0][local77 * 2 - 1] * local101;
			Static434.aFloatArrayArray12[arg0][local77 * 2] = Static434.aFloatArrayArray12[arg0][local77 * 2 - 1] * local97 + Static434.aFloatArrayArray12[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static434.aFloatArrayArray12[arg0][local157] += Static434.aFloatArrayArray12[arg0][local157 - 1] * local97 + Static434.aFloatArrayArray12[arg0][local157 - 2] * local101;
			}
			Static434.aFloatArrayArray12[arg0][1] += Static434.aFloatArrayArray12[arg0][0] * local97 + local101;
			Static434.aFloatArrayArray12[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray403[0] * 2; local226++) {
				Static434.aFloatArrayArray12[0][local226] *= Static434.aFloat137;
			}
		}
		for (local226 = 0; local226 < this.anIntArray403[arg0] * 2; local226++) {
			Static434.anIntArrayArray53[arg0][local226] = (int) (Static434.aFloatArrayArray12[arg0][local226] * 65536.0F);
		}
		return this.anIntArray403[arg0] * 2;
	}
}
