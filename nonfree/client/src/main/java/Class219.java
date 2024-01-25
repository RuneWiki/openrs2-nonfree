import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class219 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray12 = new int[2][2][4];

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "[I")
	private final int[] anIntArray400 = new int[2];

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
	public final int[] anIntArray401 = new int[2];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!sl;Lclient!cq;)V")
	public void method5792(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) Class58 arg1) {
		@Pc(3) int local3 = arg0.method4225();
		this.anIntArray401[0] = local3 >> 4;
		this.anIntArray401[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray400[0] = this.anIntArray400[1] = 0;
			return;
		}
		this.anIntArray400[0] = arg0.method4221();
		this.anIntArray400[1] = arg0.method4221();
		@Pc(37) int local37 = arg0.method4225();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray401[local39]; local42++) {
				this.anIntArrayArrayArray13[local39][0][local42] = arg0.method4221();
				this.anIntArrayArrayArray12[local39][0][local42] = arg0.method4221();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray401[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray13[local42][1][local81] = this.anIntArrayArrayArray13[local42][0][local81];
					this.anIntArrayArrayArray12[local42][1][local81] = this.anIntArrayArrayArray12[local42][0][local81];
				} else {
					this.anIntArrayArrayArray13[local42][1][local81] = arg0.method4221();
					this.anIntArrayArrayArray12[local42][1][local81] = arg0.method4221();
				}
			}
		}
		if (local37 != 0 || this.anIntArray400[1] != this.anIntArray400[0]) {
			arg1.method1861(arg0);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIF)F")
	private float method5794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray12[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray12[arg0][1][arg1] - this.anIntArrayArrayArray12[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(IIF)F")
	private float method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static348.method5793(local34);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IF)I")
	public int method5796(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray400[0] + (float) (this.anIntArray400[1] - this.anIntArray400[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static348.aFloat158 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static348.anInt6738 = (int) (Static348.aFloat158 * 65536.0F);
		}
		if (this.anIntArray401[arg0] == 0) {
			return 0;
		}
		local20 = this.method5794(arg0, 0, arg1);
		Static348.aFloatArrayArray14[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5795(arg0, 0, arg1));
		Static348.aFloatArrayArray14[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray401[arg0]; local77++) {
			local20 = this.method5794(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5795(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static348.aFloatArrayArray14[arg0][local77 * 2 + 1] = Static348.aFloatArrayArray14[arg0][local77 * 2 - 1] * local101;
			Static348.aFloatArrayArray14[arg0][local77 * 2] = Static348.aFloatArrayArray14[arg0][local77 * 2 - 1] * local97 + Static348.aFloatArrayArray14[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static348.aFloatArrayArray14[arg0][local157] += Static348.aFloatArrayArray14[arg0][local157 - 1] * local97 + Static348.aFloatArrayArray14[arg0][local157 - 2] * local101;
			}
			Static348.aFloatArrayArray14[arg0][1] += Static348.aFloatArrayArray14[arg0][0] * local97 + local101;
			Static348.aFloatArrayArray14[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray401[0] * 2; local226++) {
				Static348.aFloatArrayArray14[0][local226] *= Static348.aFloat158;
			}
		}
		for (local226 = 0; local226 < this.anIntArray401[arg0] * 2; local226++) {
			Static348.anIntArrayArray49[arg0][local226] = (int) (Static348.aFloatArrayArray14[arg0][local226] * 65536.0F);
		}
		return this.anIntArray401[arg0] * 2;
	}
}
