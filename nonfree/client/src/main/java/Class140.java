import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class140 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[I")
	private final int[] anIntArray383 = new int[2];

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
	public final int[] anIntArray384 = new int[2];

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray12 = new int[2][2][4];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIF)F")
	private float method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray12[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray12[arg0][1][arg1] - this.anIntArrayArrayArray12[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static201.method3821(local34);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIF)F")
	private float method3823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IF)I")
	public int method3824(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray383[0] + (float) (this.anIntArray383[1] - this.anIntArray383[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static201.aFloat51 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static201.anInt4248 = (int) (Static201.aFloat51 * 65536.0F);
		}
		if (this.anIntArray384[arg0] == 0) {
			return 0;
		}
		local20 = this.method3823(arg0, 0, arg1);
		Static201.aFloatArrayArray5[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method3820(arg0, 0, arg1));
		Static201.aFloatArrayArray5[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray384[arg0]; local77++) {
			local20 = this.method3823(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method3820(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static201.aFloatArrayArray5[arg0][local77 * 2 + 1] = Static201.aFloatArrayArray5[arg0][local77 * 2 - 1] * local101;
			Static201.aFloatArrayArray5[arg0][local77 * 2] = Static201.aFloatArrayArray5[arg0][local77 * 2 - 1] * local97 + Static201.aFloatArrayArray5[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static201.aFloatArrayArray5[arg0][local157] += Static201.aFloatArrayArray5[arg0][local157 - 1] * local97 + Static201.aFloatArrayArray5[arg0][local157 - 2] * local101;
			}
			Static201.aFloatArrayArray5[arg0][1] += Static201.aFloatArrayArray5[arg0][0] * local97 + local101;
			Static201.aFloatArrayArray5[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray384[0] * 2; local226++) {
				Static201.aFloatArrayArray5[0][local226] *= Static201.aFloat51;
			}
		}
		for (local226 = 0; local226 < this.anIntArray384[arg0] * 2; local226++) {
			Static201.anIntArrayArray47[arg0][local226] = (int) (Static201.aFloatArrayArray5[arg0][local226] * 65536.0F);
		}
		return this.anIntArray384[arg0] * 2;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!bg;Lclient!qs;)V")
	public void method3825(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) Class175 arg1) {
		@Pc(3) int local3 = arg0.method4532();
		this.anIntArray384[0] = local3 >> 4;
		this.anIntArray384[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray383[0] = this.anIntArray383[1] = 0;
			return;
		}
		this.anIntArray383[0] = arg0.method4556();
		this.anIntArray383[1] = arg0.method4556();
		@Pc(37) int local37 = arg0.method4532();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray384[local39]; local42++) {
				this.anIntArrayArrayArray12[local39][0][local42] = arg0.method4556();
				this.anIntArrayArrayArray13[local39][0][local42] = arg0.method4556();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray384[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray12[local42][1][local81] = this.anIntArrayArrayArray12[local42][0][local81];
					this.anIntArrayArrayArray13[local42][1][local81] = this.anIntArrayArrayArray13[local42][0][local81];
				} else {
					this.anIntArrayArrayArray12[local42][1][local81] = arg0.method4556();
					this.anIntArrayArrayArray13[local42][1][local81] = arg0.method4556();
				}
			}
		}
		if (local37 != 0 || this.anIntArray383[1] != this.anIntArray383[0]) {
			arg1.method4663(arg0);
		}
	}
}
