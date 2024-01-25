import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class256 {

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "[I")
	public final int[] anIntArray484 = new int[2];

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8 = new int[2][2][4];

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "[I")
	private final int[] anIntArray485 = new int[2];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIF)F")
	private float method5355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray8[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray8[arg0][1][arg1] - this.anIntArrayArrayArray8[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IF)I")
	public int method5356(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray485[0] + (float) (this.anIntArray485[1] - this.anIntArray485[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static419.aFloat83 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static419.anInt6754 = (int) (Static419.aFloat83 * 65536.0F);
		}
		if (this.anIntArray484[arg0] == 0) {
			return 0;
		}
		local20 = this.method5355(arg0, 0, arg1);
		Static419.aFloatArrayArray6[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5360(arg0, 0, arg1));
		Static419.aFloatArrayArray6[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray484[arg0]; local77++) {
			local20 = this.method5355(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5360(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static419.aFloatArrayArray6[arg0][local77 * 2 + 1] = Static419.aFloatArrayArray6[arg0][local77 * 2 - 1] * local101;
			Static419.aFloatArrayArray6[arg0][local77 * 2] = Static419.aFloatArrayArray6[arg0][local77 * 2 - 1] * local97 + Static419.aFloatArrayArray6[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static419.aFloatArrayArray6[arg0][local157] += Static419.aFloatArrayArray6[arg0][local157 - 1] * local97 + Static419.aFloatArrayArray6[arg0][local157 - 2] * local101;
			}
			Static419.aFloatArrayArray6[arg0][1] += Static419.aFloatArrayArray6[arg0][0] * local97 + local101;
			Static419.aFloatArrayArray6[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray484[0] * 2; local226++) {
				Static419.aFloatArrayArray6[0][local226] *= Static419.aFloat83;
			}
		}
		for (local226 = 0; local226 < this.anIntArray484[arg0] * 2; local226++) {
			Static419.anIntArrayArray50[arg0][local226] = (int) (Static419.aFloatArrayArray6[arg0][local226] * 65536.0F);
		}
		return this.anIntArray484[arg0] * 2;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!wm;Lclient!jk;)V")
	public void method5359(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) Class130 arg1) {
		@Pc(3) int local3 = arg0.method2915();
		this.anIntArray484[0] = local3 >> 4;
		this.anIntArray484[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray485[0] = this.anIntArray485[1] = 0;
			return;
		}
		this.anIntArray485[0] = arg0.method2896();
		this.anIntArray485[1] = arg0.method2896();
		@Pc(37) int local37 = arg0.method2915();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray484[local39]; local42++) {
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method2896();
				this.anIntArrayArrayArray8[local39][0][local42] = arg0.method2896();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray484[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
					this.anIntArrayArrayArray8[local42][1][local81] = this.anIntArrayArrayArray8[local42][0][local81];
				} else {
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method2896();
					this.anIntArrayArrayArray8[local42][1][local81] = arg0.method2896();
				}
			}
		}
		if (local37 != 0 || this.anIntArray485[1] != this.anIntArray485[0]) {
			arg1.method2820(arg0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIF)F")
	private float method5360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static419.method5358(local34);
	}
}
