import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
	private final int[] anIntArray15 = new int[2];

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
	public final int[] anIntArray16 = new int[2];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIF)F")
	private float method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!wd;Lclient!rd;)V")
	public void method141(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) Class59 arg1) {
		@Pc(3) int local3 = arg0.method1399();
		this.anIntArray16[0] = local3 >> 4;
		this.anIntArray16[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray15[0] = this.anIntArray15[1] = 0;
			return;
		}
		this.anIntArray15[0] = arg0.method1366();
		this.anIntArray15[1] = arg0.method1366();
		@Pc(37) int local37 = arg0.method1399();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray16[local39]; local42++) {
				this.anIntArrayArrayArray2[local39][0][local42] = arg0.method1366();
				this.anIntArrayArrayArray1[local39][0][local42] = arg0.method1366();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray16[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray2[local42][1][local81] = this.anIntArrayArrayArray2[local42][0][local81];
					this.anIntArrayArrayArray1[local42][1][local81] = this.anIntArrayArrayArray1[local42][0][local81];
				} else {
					this.anIntArrayArrayArray2[local42][1][local81] = arg0.method1366();
					this.anIntArrayArrayArray1[local42][1][local81] = arg0.method1366();
				}
			}
		}
		if (local37 != 0 || this.anIntArray15[1] != this.anIntArray15[0]) {
			arg1.method1651(arg0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IF)I")
	public int method143(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray15[0] + (float) (this.anIntArray15[1] - this.anIntArray15[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static5.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static5.anInt147 = (int) (Static5.aFloat1 * 65536.0F);
		}
		if (this.anIntArray16[arg0] == 0) {
			return 0;
		}
		local20 = this.method140(arg0, 0, arg1);
		Static5.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method144(arg0, 0, arg1));
		Static5.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray16[arg0]; local77++) {
			local20 = this.method140(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method144(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static5.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static5.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static5.aFloatArrayArray1[arg0][local77 * 2] = Static5.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static5.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static5.aFloatArrayArray1[arg0][local157] += Static5.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static5.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static5.aFloatArrayArray1[arg0][1] += Static5.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static5.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray16[0] * 2; local226++) {
				Static5.aFloatArrayArray1[0][local226] *= Static5.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray16[arg0] * 2; local226++) {
			Static5.anIntArrayArray4[arg0][local226] = (int) (Static5.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray16[arg0] * 2;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIF)F")
	private float method144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static5.method142(local34);
	}
}
