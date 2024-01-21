import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class53 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8 = new int[2][2][4];

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[I")
	public final int[] anIntArray249 = new int[2];

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	private final int[] anIntArray250 = new int[2];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIF)F")
	private float method1365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray8[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray8[arg0][1][arg1] - this.anIntArrayArrayArray8[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IF)I")
	public int method1367(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray250[0] + (float) (this.anIntArray250[1] - this.anIntArray250[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static84.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static84.anInt2018 = (int) (Static84.aFloat1 * 65536.0F);
		}
		if (this.anIntArray249[arg0] == 0) {
			return 0;
		}
		local20 = this.method1365(arg0, 0, arg1);
		Static84.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1369(arg0, 0, arg1));
		Static84.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray249[arg0]; local77++) {
			local20 = this.method1365(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1369(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static84.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static84.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static84.aFloatArrayArray1[arg0][local77 * 2] = Static84.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static84.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static84.aFloatArrayArray1[arg0][local157] += Static84.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static84.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static84.aFloatArrayArray1[arg0][1] += Static84.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static84.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray249[0] * 2; local226++) {
				Static84.aFloatArrayArray1[0][local226] *= Static84.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray249[arg0] * 2; local226++) {
			Static84.anIntArrayArray26[arg0][local226] = (int) (Static84.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray249[arg0] * 2;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIF)F")
	private float method1369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static84.method1366(local34);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!qe;Lclient!cc;)V")
	public void method1370(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(1) Class12 arg1) {
		@Pc(3) int local3 = arg0.method1546();
		this.anIntArray249[0] = local3 >> 4;
		this.anIntArray249[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray250[0] = this.anIntArray250[1] = 0;
			return;
		}
		this.anIntArray250[0] = arg0.method1543();
		this.anIntArray250[1] = arg0.method1543();
		@Pc(37) int local37 = arg0.method1546();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray249[local39]; local42++) {
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method1543();
				this.anIntArrayArrayArray8[local39][0][local42] = arg0.method1543();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray249[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
					this.anIntArrayArrayArray8[local42][1][local81] = this.anIntArrayArrayArray8[local42][0][local81];
				} else {
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method1543();
					this.anIntArrayArrayArray8[local42][1][local81] = arg0.method1543();
				}
			}
		}
		if (local37 != 0 || this.anIntArray250[1] != this.anIntArray250[0]) {
			arg1.method404(arg0);
		}
	}
}
