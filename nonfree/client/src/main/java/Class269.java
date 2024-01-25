import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class269 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray12 = new int[2][2][4];

	@OriginalMember(owner = "client!os", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!os", name = "h", descriptor = "[I")
	private final int[] anIntArray461 = new int[2];

	@OriginalMember(owner = "client!os", name = "b", descriptor = "[I")
	public final int[] anIntArray460 = new int[2];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!fca;Lclient!mt;)V")
	public void method6403(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) Class240 arg1) {
		@Pc(3) int local3 = arg0.method4888();
		this.anIntArray460[0] = local3 >> 4;
		this.anIntArray460[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray461[0] = this.anIntArray461[1] = 0;
			return;
		}
		this.anIntArray461[0] = arg0.method4858();
		this.anIntArray461[1] = arg0.method4858();
		@Pc(37) int local37 = arg0.method4888();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray460[local39]; local42++) {
				this.anIntArrayArrayArray13[local39][0][local42] = arg0.method4858();
				this.anIntArrayArrayArray12[local39][0][local42] = arg0.method4858();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray460[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray13[local42][1][local81] = this.anIntArrayArrayArray13[local42][0][local81];
					this.anIntArrayArrayArray12[local42][1][local81] = this.anIntArrayArrayArray12[local42][0][local81];
				} else {
					this.anIntArrayArrayArray13[local42][1][local81] = arg0.method4858();
					this.anIntArrayArrayArray12[local42][1][local81] = arg0.method4858();
				}
			}
		}
		if (local37 != 0 || this.anIntArray461[1] != this.anIntArray461[0]) {
			arg1.method5572(arg0);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIF)F")
	private float method6404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray12[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray12[arg0][1][arg1] - this.anIntArrayArrayArray12[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(IIF)F")
	private float method6406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static439.method6407(local34);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IF)I")
	public int method6408(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray461[0] + (float) (this.anIntArray461[1] - this.anIntArray461[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static439.aFloat175 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static439.anInt7651 = (int) (Static439.aFloat175 * 65536.0F);
		}
		if (this.anIntArray460[arg0] == 0) {
			return 0;
		}
		local20 = this.method6404(arg0, 0, arg1);
		Static439.aFloatArrayArray11[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method6406(arg0, 0, arg1));
		Static439.aFloatArrayArray11[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray460[arg0]; local77++) {
			local20 = this.method6404(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method6406(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static439.aFloatArrayArray11[arg0][local77 * 2 + 1] = Static439.aFloatArrayArray11[arg0][local77 * 2 - 1] * local101;
			Static439.aFloatArrayArray11[arg0][local77 * 2] = Static439.aFloatArrayArray11[arg0][local77 * 2 - 1] * local97 + Static439.aFloatArrayArray11[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static439.aFloatArrayArray11[arg0][local157] += Static439.aFloatArrayArray11[arg0][local157 - 1] * local97 + Static439.aFloatArrayArray11[arg0][local157 - 2] * local101;
			}
			Static439.aFloatArrayArray11[arg0][1] += Static439.aFloatArrayArray11[arg0][0] * local97 + local101;
			Static439.aFloatArrayArray11[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray460[0] * 2; local226++) {
				Static439.aFloatArrayArray11[0][local226] *= Static439.aFloat175;
			}
		}
		for (local226 = 0; local226 < this.anIntArray460[arg0] * 2; local226++) {
			Static439.anIntArrayArray77[arg0][local226] = (int) (Static439.aFloatArrayArray11[arg0][local226] * 65536.0F);
		}
		return this.anIntArray460[arg0] * 2;
	}
}
