import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class55 {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
	private final int[] anIntArray243 = new int[2];

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "[I")
	public final int[] anIntArray244 = new int[2];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IF)I")
	public int method1371(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray243[0] + (float) (this.anIntArray243[1] - this.anIntArray243[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static84.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static84.anInt2239 = (int) (Static84.aFloat1 * 65536.0F);
		}
		if (this.anIntArray244[arg0] == 0) {
			return 0;
		}
		local20 = this.method1372(arg0, 0, arg1);
		Static84.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1376(arg0, 0, arg1));
		Static84.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray244[arg0]; local77++) {
			local20 = this.method1372(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1376(arg0, local77, arg1));
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
			for (local226 = 0; local226 < this.anIntArray244[0] * 2; local226++) {
				Static84.aFloatArrayArray1[0][local226] *= Static84.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray244[arg0] * 2; local226++) {
			Static84.anIntArrayArray22[arg0][local226] = (int) (Static84.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray244[arg0] * 2;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIF)F")
	private float method1372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!kd;Lclient!oa;)V")
	public void method1374(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) Class48 arg1) {
		@Pc(3) int local3 = arg0.method1803();
		this.anIntArray244[0] = local3 >> 4;
		this.anIntArray244[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray243[0] = this.anIntArray243[1] = 0;
			return;
		}
		this.anIntArray243[0] = arg0.method1789();
		this.anIntArray243[1] = arg0.method1789();
		@Pc(37) int local37 = arg0.method1803();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray244[local39]; local42++) {
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method1789();
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method1789();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray244[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
				} else {
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method1789();
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method1789();
				}
			}
		}
		if (local37 != 0 || this.anIntArray243[1] != this.anIntArray243[0]) {
			arg1.method1185(arg0);
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIF)F")
	private float method1376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static84.method1375(local34);
	}
}
