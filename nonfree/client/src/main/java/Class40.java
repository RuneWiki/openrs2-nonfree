import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class40 {

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
	private final int[] anIntArray248 = new int[2];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
	public final int[] anIntArray249 = new int[2];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIF)F")
	private float method1916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIF)F")
	private float method1918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static87.method1915(local34);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IF)I")
	public int method1919(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray248[0] + (float) (this.anIntArray248[1] - this.anIntArray248[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static87.aFloat3 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static87.anInt2590 = (int) (Static87.aFloat3 * 65536.0F);
		}
		if (this.anIntArray249[arg0] == 0) {
			return 0;
		}
		local20 = this.method1916(arg0, 0, arg1);
		Static87.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1918(arg0, 0, arg1));
		Static87.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray249[arg0]; local77++) {
			local20 = this.method1916(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1918(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static87.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static87.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static87.aFloatArrayArray1[arg0][local77 * 2] = Static87.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static87.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static87.aFloatArrayArray1[arg0][local157] += Static87.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static87.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static87.aFloatArrayArray1[arg0][1] += Static87.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static87.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray249[0] * 2; local226++) {
				Static87.aFloatArrayArray1[0][local226] *= Static87.aFloat3;
			}
		}
		for (local226 = 0; local226 < this.anIntArray249[arg0] * 2; local226++) {
			Static87.anIntArrayArray23[arg0][local226] = (int) (Static87.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray249[arg0] * 2;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!fa;Lclient!sc;)V")
	public void method1920(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) Class72 arg1) {
		@Pc(3) int local3 = arg0.method1234();
		this.anIntArray249[0] = local3 >> 4;
		this.anIntArray249[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray248[0] = this.anIntArray248[1] = 0;
			return;
		}
		this.anIntArray248[0] = arg0.method1280();
		this.anIntArray248[1] = arg0.method1280();
		@Pc(37) int local37 = arg0.method1234();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray249[local39]; local42++) {
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method1280();
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method1280();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray249[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
				} else {
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method1280();
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method1280();
				}
			}
		}
		if (local37 != 0 || this.anIntArray248[1] != this.anIntArray248[0]) {
			arg1.method3075(arg0);
		}
	}
}
