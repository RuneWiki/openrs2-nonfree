import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class293 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!un", name = "d", descriptor = "[I")
	private final int[] anIntArray661 = new int[2];

	@OriginalMember(owner = "client!un", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray14 = new int[2][2][4];

	@OriginalMember(owner = "client!un", name = "h", descriptor = "[I")
	public final int[] anIntArray662 = new int[2];

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!co;Lclient!gd;)V")
	public void method6880(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Class110 arg1) {
		@Pc(3) int local3 = arg0.method4220();
		this.anIntArray662[0] = local3 >> 4;
		this.anIntArray662[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray661[0] = this.anIntArray661[1] = 0;
			return;
		}
		this.anIntArray661[0] = arg0.method4227();
		this.anIntArray661[1] = arg0.method4227();
		@Pc(37) int local37 = arg0.method4220();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray662[local39]; local42++) {
				this.anIntArrayArrayArray14[local39][0][local42] = arg0.method4227();
				this.anIntArrayArrayArray13[local39][0][local42] = arg0.method4227();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray662[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray14[local42][1][local81] = this.anIntArrayArrayArray14[local42][0][local81];
					this.anIntArrayArrayArray13[local42][1][local81] = this.anIntArrayArrayArray13[local42][0][local81];
				} else {
					this.anIntArrayArrayArray14[local42][1][local81] = arg0.method4227();
					this.anIntArrayArrayArray13[local42][1][local81] = arg0.method4227();
				}
			}
		}
		if (local37 != 0 || this.anIntArray661[1] != this.anIntArray661[0]) {
			arg1.method2825(arg0);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIF)F")
	private float method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IIF)F")
	private float method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray14[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray14[arg0][1][arg1] - this.anIntArrayArrayArray14[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static498.method6881(local34);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IF)I")
	public int method6884(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray661[0] + (float) (this.anIntArray661[1] - this.anIntArray661[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static498.aFloat348 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static498.anInt8517 = (int) (Static498.aFloat348 * 65536.0F);
		}
		if (this.anIntArray662[arg0] == 0) {
			return 0;
		}
		local20 = this.method6882(arg0, 0, arg1);
		Static498.aFloatArrayArray12[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method6883(arg0, 0, arg1));
		Static498.aFloatArrayArray12[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray662[arg0]; local77++) {
			local20 = this.method6882(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method6883(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static498.aFloatArrayArray12[arg0][local77 * 2 + 1] = Static498.aFloatArrayArray12[arg0][local77 * 2 - 1] * local101;
			Static498.aFloatArrayArray12[arg0][local77 * 2] = Static498.aFloatArrayArray12[arg0][local77 * 2 - 1] * local97 + Static498.aFloatArrayArray12[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static498.aFloatArrayArray12[arg0][local157] += Static498.aFloatArrayArray12[arg0][local157 - 1] * local97 + Static498.aFloatArrayArray12[arg0][local157 - 2] * local101;
			}
			Static498.aFloatArrayArray12[arg0][1] += Static498.aFloatArrayArray12[arg0][0] * local97 + local101;
			Static498.aFloatArrayArray12[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray662[0] * 2; local226++) {
				Static498.aFloatArrayArray12[0][local226] *= Static498.aFloat348;
			}
		}
		for (local226 = 0; local226 < this.anIntArray662[arg0] * 2; local226++) {
			Static498.anIntArrayArray71[arg0][local226] = (int) (Static498.aFloatArrayArray12[arg0][local226] * 65536.0F);
		}
		return this.anIntArray662[arg0] * 2;
	}
}
