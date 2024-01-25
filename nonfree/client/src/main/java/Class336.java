import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class336 {

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "[I")
	public final int[] anIntArray602 = new int[2];

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray19 = new int[2][2][4];

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray20 = new int[2][2][4];

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "[I")
	private final int[] anIntArray603 = new int[2];

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIF)F")
	private float method7415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray20[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray20[arg0][1][arg1] - this.anIntArrayArrayArray20[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static547.method7418(local34);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IF)I")
	public int method7416(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray603[0] + (float) (this.anIntArray603[1] - this.anIntArray603[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static547.aFloat211 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static547.anInt8994 = (int) (Static547.aFloat211 * 65536.0F);
		}
		if (this.anIntArray602[arg0] == 0) {
			return 0;
		}
		local20 = this.method7417(arg0, 0, arg1);
		Static547.aFloatArrayArray12[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method7415(arg0, 0, arg1));
		Static547.aFloatArrayArray12[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray602[arg0]; local77++) {
			local20 = this.method7417(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method7415(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static547.aFloatArrayArray12[arg0][local77 * 2 + 1] = Static547.aFloatArrayArray12[arg0][local77 * 2 - 1] * local101;
			Static547.aFloatArrayArray12[arg0][local77 * 2] = Static547.aFloatArrayArray12[arg0][local77 * 2 - 1] * local97 + Static547.aFloatArrayArray12[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static547.aFloatArrayArray12[arg0][local157] += Static547.aFloatArrayArray12[arg0][local157 - 1] * local97 + Static547.aFloatArrayArray12[arg0][local157 - 2] * local101;
			}
			Static547.aFloatArrayArray12[arg0][1] += Static547.aFloatArrayArray12[arg0][0] * local97 + local101;
			Static547.aFloatArrayArray12[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray602[0] * 2; local226++) {
				Static547.aFloatArrayArray12[0][local226] *= Static547.aFloat211;
			}
		}
		for (local226 = 0; local226 < this.anIntArray602[arg0] * 2; local226++) {
			Static547.anIntArrayArray56[arg0][local226] = (int) (Static547.aFloatArrayArray12[arg0][local226] * 65536.0F);
		}
		return this.anIntArray602[arg0] * 2;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(IIF)F")
	private float method7417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray19[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray19[arg0][1][arg1] - this.anIntArrayArrayArray19[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!io;Lclient!vaa;)V")
	public void method7420(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) Class337 arg1) {
		@Pc(3) int local3 = arg0.method4393();
		this.anIntArray602[0] = local3 >> 4;
		this.anIntArray602[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray603[0] = this.anIntArray603[1] = 0;
			return;
		}
		this.anIntArray603[0] = arg0.method4426();
		this.anIntArray603[1] = arg0.method4426();
		@Pc(37) int local37 = arg0.method4393();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray602[local39]; local42++) {
				this.anIntArrayArrayArray20[local39][0][local42] = arg0.method4426();
				this.anIntArrayArrayArray19[local39][0][local42] = arg0.method4426();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray602[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray20[local42][1][local81] = this.anIntArrayArrayArray20[local42][0][local81];
					this.anIntArrayArrayArray19[local42][1][local81] = this.anIntArrayArrayArray19[local42][0][local81];
				} else {
					this.anIntArrayArrayArray20[local42][1][local81] = arg0.method4426();
					this.anIntArrayArrayArray19[local42][1][local81] = arg0.method4426();
				}
			}
		}
		if (local37 != 0 || this.anIntArray603[1] != this.anIntArray603[0]) {
			arg1.method7460(arg0);
		}
	}
}
