import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class267 {

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray17 = new int[2][2][4];

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
	public final int[] anIntArray497 = new int[2];

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	private final int[] anIntArray498 = new int[2];

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray18 = new int[2][2][4];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIF)F")
	private float method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray18[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray18[arg0][1][arg1] - this.anIntArrayArrayArray18[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static442.method6461(local34);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIF)F")
	private float method6458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray17[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray17[arg0][1][arg1] - this.anIntArrayArrayArray17[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IF)I")
	public int method6459(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray498[0] + (float) (this.anIntArray498[1] - this.anIntArray498[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static442.aFloat115 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static442.anInt7473 = (int) (Static442.aFloat115 * 65536.0F);
		}
		if (this.anIntArray497[arg0] == 0) {
			return 0;
		}
		local20 = this.method6458(arg0, 0, arg1);
		Static442.aFloatArrayArray14[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method6457(arg0, 0, arg1));
		Static442.aFloatArrayArray14[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray497[arg0]; local77++) {
			local20 = this.method6458(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method6457(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static442.aFloatArrayArray14[arg0][local77 * 2 + 1] = Static442.aFloatArrayArray14[arg0][local77 * 2 - 1] * local101;
			Static442.aFloatArrayArray14[arg0][local77 * 2] = Static442.aFloatArrayArray14[arg0][local77 * 2 - 1] * local97 + Static442.aFloatArrayArray14[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static442.aFloatArrayArray14[arg0][local157] += Static442.aFloatArrayArray14[arg0][local157 - 1] * local97 + Static442.aFloatArrayArray14[arg0][local157 - 2] * local101;
			}
			Static442.aFloatArrayArray14[arg0][1] += Static442.aFloatArrayArray14[arg0][0] * local97 + local101;
			Static442.aFloatArrayArray14[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray497[0] * 2; local226++) {
				Static442.aFloatArrayArray14[0][local226] *= Static442.aFloat115;
			}
		}
		for (local226 = 0; local226 < this.anIntArray497[arg0] * 2; local226++) {
			Static442.anIntArrayArray42[arg0][local226] = (int) (Static442.aFloatArrayArray14[arg0][local226] * 65536.0F);
		}
		return this.anIntArray497[arg0] * 2;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!gga;Lclient!mca;)V")
	public void method6462(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) Class219 arg1) {
		@Pc(3) int local3 = arg0.method8374();
		this.anIntArray497[0] = local3 >> 4;
		this.anIntArray497[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray498[0] = this.anIntArray498[1] = 0;
			return;
		}
		this.anIntArray498[0] = arg0.method8363();
		this.anIntArray498[1] = arg0.method8363();
		@Pc(37) int local37 = arg0.method8374();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray497[local39]; local42++) {
				this.anIntArrayArrayArray18[local39][0][local42] = arg0.method8363();
				this.anIntArrayArrayArray17[local39][0][local42] = arg0.method8363();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray497[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray18[local42][1][local81] = this.anIntArrayArrayArray18[local42][0][local81];
					this.anIntArrayArrayArray17[local42][1][local81] = this.anIntArrayArrayArray17[local42][0][local81];
				} else {
					this.anIntArrayArrayArray18[local42][1][local81] = arg0.method8363();
					this.anIntArrayArrayArray17[local42][1][local81] = arg0.method8363();
				}
			}
		}
		if (local37 != 0 || this.anIntArray498[1] != this.anIntArray498[0]) {
			arg1.method5208(arg0);
		}
	}
}
