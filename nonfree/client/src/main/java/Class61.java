import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class61 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
	public final int[] anIntArray388 = new int[2];

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
	private final int[] anIntArray389 = new int[2];

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIF)F")
	private float method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!wd;Lclient!oc;)V")
	public void method1810(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) Class46 arg1) {
		@Pc(3) int local3 = arg0.method1421();
		this.anIntArray388[0] = local3 >> 4;
		this.anIntArray388[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray389[0] = this.anIntArray389[1] = 0;
			return;
		}
		this.anIntArray389[0] = arg0.method1451();
		this.anIntArray389[1] = arg0.method1451();
		@Pc(37) int local37 = arg0.method1421();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray388[local39]; local42++) {
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method1451();
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method1451();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray388[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
				} else {
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method1451();
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method1451();
				}
			}
		}
		if (local37 != 0 || this.anIntArray389[1] != this.anIntArray389[0]) {
			arg1.method1486(arg0);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IF)I")
	public int method1811(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray389[0] + (float) (this.anIntArray389[1] - this.anIntArray389[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static100.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static100.anInt2624 = (int) (Static100.aFloat1 * 65536.0F);
		}
		if (this.anIntArray388[arg0] == 0) {
			return 0;
		}
		local20 = this.method1809(arg0, 0, arg1);
		Static100.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1812(arg0, 0, arg1));
		Static100.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray388[arg0]; local77++) {
			local20 = this.method1809(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1812(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static100.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static100.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static100.aFloatArrayArray1[arg0][local77 * 2] = Static100.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static100.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static100.aFloatArrayArray1[arg0][local157] += Static100.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static100.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static100.aFloatArrayArray1[arg0][1] += Static100.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static100.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray388[0] * 2; local226++) {
				Static100.aFloatArrayArray1[0][local226] *= Static100.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray388[arg0] * 2; local226++) {
			Static100.anIntArrayArray68[arg0][local226] = (int) (Static100.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray388[arg0] * 2;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIF)F")
	private float method1812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static100.method1813(local34);
	}
}
