import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class85 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "[I")
	public final int[] anIntArray348 = new int[2];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray37 = new int[2][2][4];

	@OriginalMember(owner = "client!te", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray38 = new int[2][2][4];

	@OriginalMember(owner = "client!te", name = "h", descriptor = "[I")
	private final int[] anIntArray349 = new int[2];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIF)F")
	private float method2725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray37[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray37[arg0][1][arg1] - this.anIntArrayArrayArray37[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIF)F")
	private float method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray38[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray38[arg0][1][arg1] - this.anIntArrayArrayArray38[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static161.method2730(local34);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!h;Lclient!df;)V")
	public void method2727(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) Class21 arg1) {
		@Pc(3) int local3 = arg0.method1253();
		this.anIntArray348[0] = local3 >> 4;
		this.anIntArray348[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray349[0] = this.anIntArray349[1] = 0;
			return;
		}
		this.anIntArray349[0] = arg0.method1252();
		this.anIntArray349[1] = arg0.method1252();
		@Pc(37) int local37 = arg0.method1253();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray348[local39]; local42++) {
				this.anIntArrayArrayArray38[local39][0][local42] = arg0.method1252();
				this.anIntArrayArrayArray37[local39][0][local42] = arg0.method1252();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray348[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray38[local42][1][local81] = this.anIntArrayArrayArray38[local42][0][local81];
					this.anIntArrayArrayArray37[local42][1][local81] = this.anIntArrayArrayArray37[local42][0][local81];
				} else {
					this.anIntArrayArrayArray38[local42][1][local81] = arg0.method1252();
					this.anIntArrayArrayArray37[local42][1][local81] = arg0.method1252();
				}
			}
		}
		if (local37 != 0 || this.anIntArray349[1] != this.anIntArray349[0]) {
			arg1.method572(arg0);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IF)I")
	public int method2728(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray349[0] + (float) (this.anIntArray349[1] - this.anIntArray349[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static161.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static161.anInt3580 = (int) (Static161.aFloat1 * 65536.0F);
		}
		if (this.anIntArray348[arg0] == 0) {
			return 0;
		}
		local20 = this.method2725(arg0, 0, arg1);
		Static161.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method2726(arg0, 0, arg1));
		Static161.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray348[arg0]; local77++) {
			local20 = this.method2725(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method2726(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static161.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static161.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static161.aFloatArrayArray2[arg0][local77 * 2] = Static161.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static161.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static161.aFloatArrayArray2[arg0][local157] += Static161.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static161.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static161.aFloatArrayArray2[arg0][1] += Static161.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static161.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray348[0] * 2; local226++) {
				Static161.aFloatArrayArray2[0][local226] *= Static161.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray348[arg0] * 2; local226++) {
			Static161.anIntArrayArray29[arg0][local226] = (int) (Static161.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray348[arg0] * 2;
	}
}
