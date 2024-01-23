import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class149 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "[I")
	public int[] anIntArray357 = new int[2];

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
	private int[] anIntArray358 = new int[2];

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12 = new int[2][2][4];

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIF)F")
	private float method3594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIF)F")
	private float method3595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray12[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray12[arg0][1][arg1] - this.anIntArrayArrayArray12[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static237.method3596(local34);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!aj;Lclient!qe;)V")
	public void method3597(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) Class136 arg1) {
		@Pc(3) int local3 = arg0.method2334();
		this.anIntArray357[0] = local3 >> 4;
		this.anIntArray357[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray358[0] = this.anIntArray358[1] = 0;
			return;
		}
		this.anIntArray358[0] = arg0.method2375();
		this.anIntArray358[1] = arg0.method2375();
		@Pc(37) int local37 = arg0.method2334();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray357[local39]; local44++) {
				this.anIntArrayArrayArray12[local39][0][local44] = arg0.method2375();
				this.anIntArrayArrayArray13[local39][0][local44] = arg0.method2375();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray357[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray12[local39][1][local44] = this.anIntArrayArrayArray12[local39][0][local44];
					this.anIntArrayArrayArray13[local39][1][local44] = this.anIntArrayArrayArray13[local39][0][local44];
				} else {
					this.anIntArrayArrayArray12[local39][1][local44] = arg0.method2375();
					this.anIntArrayArrayArray13[local39][1][local44] = arg0.method2375();
				}
			}
		}
		if (local37 != 0 || this.anIntArray358[1] != this.anIntArray358[0]) {
			arg1.method3337(arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IF)I")
	public int method3598(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray358[0] + (float) (this.anIntArray358[1] - this.anIntArray358[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static237.aFloat55 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static237.anInt4779 = (int) (Static237.aFloat55 * 65536.0F);
		}
		if (this.anIntArray357[arg0] == 0) {
			return 0;
		}
		local20 = this.method3594(arg0, 0, arg1);
		Static237.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method3595(arg0, 0, arg1));
		Static237.aFloatArrayArray2[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray357[arg0]; local77++) {
			local20 = this.method3594(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method3595(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static237.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static237.aFloatArrayArray2[arg0][local77 * 2 - 1] * local106;
			Static237.aFloatArrayArray2[arg0][local77 * 2] = Static237.aFloatArrayArray2[arg0][local77 * 2 - 1] * local102 + Static237.aFloatArrayArray2[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static237.aFloatArrayArray2[arg0][local162] += Static237.aFloatArrayArray2[arg0][local162 - 1] * local102 + Static237.aFloatArrayArray2[arg0][local162 - 2] * local106;
			}
			Static237.aFloatArrayArray2[arg0][1] += Static237.aFloatArrayArray2[arg0][0] * local102 + local106;
			Static237.aFloatArrayArray2[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray357[0] * 2; local77++) {
				Static237.aFloatArrayArray2[0][local77] *= Static237.aFloat55;
			}
		}
		for (local77 = 0; local77 < this.anIntArray357[arg0] * 2; local77++) {
			Static237.anIntArrayArray30[arg0][local77] = (int) (Static237.aFloatArrayArray2[arg0][local77] * 65536.0F);
		}
		return this.anIntArray357[arg0] * 2;
	}
}
