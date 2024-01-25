import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class259 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray17 = new int[2][2][4];

	@OriginalMember(owner = "client!po", name = "e", descriptor = "[I")
	private final int[] anIntArray484 = new int[2];

	@OriginalMember(owner = "client!po", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray18 = new int[2][2][4];

	@OriginalMember(owner = "client!po", name = "f", descriptor = "[I")
	public final int[] anIntArray485 = new int[2];

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIF)F")
	private float method6814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray17[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray17[arg0][1][arg1] - this.anIntArrayArrayArray17[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!rg;Lclient!oea;)V")
	public void method6816(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(1) Class235 arg1) {
		@Pc(3) int local3 = arg0.method8604();
		this.anIntArray485[0] = local3 >> 4;
		this.anIntArray485[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray484[0] = this.anIntArray484[1] = 0;
			return;
		}
		this.anIntArray484[0] = arg0.method8571();
		this.anIntArray484[1] = arg0.method8571();
		@Pc(37) int local37 = arg0.method8604();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray485[local39]; local42++) {
				this.anIntArrayArrayArray18[local39][0][local42] = arg0.method8571();
				this.anIntArrayArrayArray17[local39][0][local42] = arg0.method8571();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray485[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray18[local42][1][local81] = this.anIntArrayArrayArray18[local42][0][local81];
					this.anIntArrayArrayArray17[local42][1][local81] = this.anIntArrayArrayArray17[local42][0][local81];
				} else {
					this.anIntArrayArrayArray18[local42][1][local81] = arg0.method8571();
					this.anIntArrayArrayArray17[local42][1][local81] = arg0.method8571();
				}
			}
		}
		if (local37 != 0 || this.anIntArray484[1] != this.anIntArray484[0]) {
			arg1.method6449(arg0);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IF)I")
	public int method6817(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray484[0] + (float) (this.anIntArray484[1] - this.anIntArray484[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static440.aFloat165 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static440.anInt7951 = (int) (Static440.aFloat165 * 65536.0F);
		}
		if (this.anIntArray485[arg0] == 0) {
			return 0;
		}
		local20 = this.method6814(arg0, 0, arg1);
		Static440.aFloatArrayArray12[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method6818(arg0, 0, arg1));
		Static440.aFloatArrayArray12[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray485[arg0]; local77++) {
			local20 = this.method6814(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method6818(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static440.aFloatArrayArray12[arg0][local77 * 2 + 1] = Static440.aFloatArrayArray12[arg0][local77 * 2 - 1] * local101;
			Static440.aFloatArrayArray12[arg0][local77 * 2] = Static440.aFloatArrayArray12[arg0][local77 * 2 - 1] * local97 + Static440.aFloatArrayArray12[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static440.aFloatArrayArray12[arg0][local157] += Static440.aFloatArrayArray12[arg0][local157 - 1] * local97 + Static440.aFloatArrayArray12[arg0][local157 - 2] * local101;
			}
			Static440.aFloatArrayArray12[arg0][1] += Static440.aFloatArrayArray12[arg0][0] * local97 + local101;
			Static440.aFloatArrayArray12[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray485[0] * 2; local226++) {
				Static440.aFloatArrayArray12[0][local226] *= Static440.aFloat165;
			}
		}
		for (local226 = 0; local226 < this.anIntArray485[arg0] * 2; local226++) {
			Static440.anIntArrayArray36[arg0][local226] = (int) (Static440.aFloatArrayArray12[arg0][local226] * 65536.0F);
		}
		return this.anIntArray485[arg0] * 2;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(IIF)F")
	private float method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray18[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray18[arg0][1][arg1] - this.anIntArrayArrayArray18[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static440.method6815(local34);
	}
}
