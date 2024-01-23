import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class84 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18 = new int[2][2][4];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17 = new int[2][2][4];

	@OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
	private int[] anIntArray403 = new int[2];

	@OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
	public int[] anIntArray404 = new int[2];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIF)F")
	private float method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray17[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray17[arg0][1][arg1] - this.anIntArrayArrayArray17[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static164.method2662(local34);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIF)F")
	private float method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray18[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray18[arg0][1][arg1] - this.anIntArrayArrayArray18[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IF)I")
	public int method2664(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray403[0] + (float) (this.anIntArray403[1] - this.anIntArray403[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static164.aFloat2 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static164.anInt3828 = (int) (Static164.aFloat2 * 65536.0F);
		}
		if (this.anIntArray404[arg0] == 0) {
			return 0;
		}
		local20 = this.method2663(arg0, 0, arg1);
		Static164.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method2661(arg0, 0, arg1));
		Static164.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray404[arg0]; local77++) {
			local20 = this.method2663(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method2661(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static164.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static164.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static164.aFloatArrayArray2[arg0][local77 * 2] = Static164.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static164.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static164.aFloatArrayArray2[arg0][local157] += Static164.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static164.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static164.aFloatArrayArray2[arg0][1] += Static164.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static164.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray404[0] * 2; local226++) {
				Static164.aFloatArrayArray2[0][local226] *= Static164.aFloat2;
			}
		}
		for (local226 = 0; local226 < this.anIntArray404[arg0] * 2; local226++) {
			Static164.anIntArrayArray34[arg0][local226] = (int) (Static164.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray404[arg0] * 2;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ea;Lclient!vf;)V")
	public void method2666(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) Class101 arg1) {
		@Pc(3) int local3 = arg0.method209();
		this.anIntArray404[0] = local3 >> 4;
		this.anIntArray404[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray403[0] = this.anIntArray403[1] = 0;
			return;
		}
		this.anIntArray403[0] = arg0.method163();
		this.anIntArray403[1] = arg0.method163();
		@Pc(37) int local37 = arg0.method209();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray404[local39]; local42++) {
				this.anIntArrayArrayArray17[local39][0][local42] = arg0.method163();
				this.anIntArrayArrayArray18[local39][0][local42] = arg0.method163();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray404[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray17[local42][1][local81] = this.anIntArrayArrayArray17[local42][0][local81];
					this.anIntArrayArrayArray18[local42][1][local81] = this.anIntArrayArrayArray18[local42][0][local81];
				} else {
					this.anIntArrayArrayArray17[local42][1][local81] = arg0.method163();
					this.anIntArrayArrayArray18[local42][1][local81] = arg0.method163();
				}
			}
		}
		if (local37 != 0 || this.anIntArray403[1] != this.anIntArray403[0]) {
			arg1.method3223(arg0);
		}
	}
}
