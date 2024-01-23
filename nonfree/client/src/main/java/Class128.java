import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class128 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "[I")
	public int[] anIntArray383 = new int[2];

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
	private int[] anIntArray384 = new int[2];

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14 = new int[2][2][4];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIF)F")
	private float method3747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static234.method3751(local34);
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIF)F")
	private float method3748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray14[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray14[arg0][1][arg1] - this.anIntArrayArrayArray14[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IF)I")
	public int method3749(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray384[0] + (float) (this.anIntArray384[1] - this.anIntArray384[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static234.aFloat11 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static234.anInt5004 = (int) (Static234.aFloat11 * 65536.0F);
		}
		if (this.anIntArray383[arg0] == 0) {
			return 0;
		}
		local20 = this.method3748(arg0, 0, arg1);
		Static234.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method3747(arg0, 0, arg1));
		Static234.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray383[arg0]; local77++) {
			local20 = this.method3748(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method3747(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static234.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static234.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static234.aFloatArrayArray2[arg0][local77 * 2] = Static234.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static234.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static234.aFloatArrayArray2[arg0][local157] += Static234.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static234.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static234.aFloatArrayArray2[arg0][1] += Static234.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static234.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray383[0] * 2; local226++) {
				Static234.aFloatArrayArray2[0][local226] *= Static234.aFloat11;
			}
		}
		for (local226 = 0; local226 < this.anIntArray383[arg0] * 2; local226++) {
			Static234.anIntArrayArray45[arg0][local226] = (int) (Static234.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray383[arg0] * 2;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!vf;Lclient!q;)V")
	public void method3750(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) Class95 arg1) {
		@Pc(3) int local3 = arg0.method2945();
		this.anIntArray383[0] = local3 >> 4;
		this.anIntArray383[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray384[0] = this.anIntArray384[1] = 0;
			return;
		}
		this.anIntArray384[0] = arg0.method2964();
		this.anIntArray384[1] = arg0.method2964();
		@Pc(37) int local37 = arg0.method2945();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray383[local39]; local42++) {
				this.anIntArrayArrayArray13[local39][0][local42] = arg0.method2964();
				this.anIntArrayArrayArray14[local39][0][local42] = arg0.method2964();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray383[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray13[local42][1][local81] = this.anIntArrayArrayArray13[local42][0][local81];
					this.anIntArrayArrayArray14[local42][1][local81] = this.anIntArrayArrayArray14[local42][0][local81];
				} else {
					this.anIntArrayArrayArray13[local42][1][local81] = arg0.method2964();
					this.anIntArrayArrayArray14[local42][1][local81] = arg0.method2964();
				}
			}
		}
		if (local37 != 0 || this.anIntArray384[1] != this.anIntArray384[0]) {
			arg1.method2691(arg0);
		}
	}
}
