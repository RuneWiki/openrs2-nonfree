import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class263 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray14 = new int[2][2][4];

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
	public final int[] anIntArray498 = new int[2];

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
	private final int[] anIntArray497 = new int[2];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!nj;Lclient!go;)V")
	public void method6080(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) Class90 arg1) {
		@Pc(3) int local3 = arg0.method4096();
		this.anIntArray498[0] = local3 >> 4;
		this.anIntArray498[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray497[0] = this.anIntArray497[1] = 0;
			return;
		}
		this.anIntArray497[0] = arg0.method4083();
		this.anIntArray497[1] = arg0.method4083();
		@Pc(37) int local37 = arg0.method4096();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray498[local39]; local42++) {
				this.anIntArrayArrayArray13[local39][0][local42] = arg0.method4083();
				this.anIntArrayArrayArray14[local39][0][local42] = arg0.method4083();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray498[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray13[local42][1][local81] = this.anIntArrayArrayArray13[local42][0][local81];
					this.anIntArrayArrayArray14[local42][1][local81] = this.anIntArrayArrayArray14[local42][0][local81];
				} else {
					this.anIntArrayArrayArray13[local42][1][local81] = arg0.method4083();
					this.anIntArrayArrayArray14[local42][1][local81] = arg0.method4083();
				}
			}
		}
		if (local37 != 0 || this.anIntArray497[1] != this.anIntArray497[0]) {
			arg1.method2088(arg0);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIF)F")
	private float method6081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray14[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray14[arg0][1][arg1] - this.anIntArrayArrayArray14[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IF)I")
	public int method6084(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray497[0] + (float) (this.anIntArray497[1] - this.anIntArray497[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static446.aFloat105 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static446.anInt7455 = (int) (Static446.aFloat105 * 65536.0F);
		}
		if (this.anIntArray498[arg0] == 0) {
			return 0;
		}
		local20 = this.method6081(arg0, 0, arg1);
		Static446.aFloatArrayArray9[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method6085(arg0, 0, arg1));
		Static446.aFloatArrayArray9[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray498[arg0]; local77++) {
			local20 = this.method6081(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method6085(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static446.aFloatArrayArray9[arg0][local77 * 2 + 1] = Static446.aFloatArrayArray9[arg0][local77 * 2 - 1] * local101;
			Static446.aFloatArrayArray9[arg0][local77 * 2] = Static446.aFloatArrayArray9[arg0][local77 * 2 - 1] * local97 + Static446.aFloatArrayArray9[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static446.aFloatArrayArray9[arg0][local157] += Static446.aFloatArrayArray9[arg0][local157 - 1] * local97 + Static446.aFloatArrayArray9[arg0][local157 - 2] * local101;
			}
			Static446.aFloatArrayArray9[arg0][1] += Static446.aFloatArrayArray9[arg0][0] * local97 + local101;
			Static446.aFloatArrayArray9[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray498[0] * 2; local226++) {
				Static446.aFloatArrayArray9[0][local226] *= Static446.aFloat105;
			}
		}
		for (local226 = 0; local226 < this.anIntArray498[arg0] * 2; local226++) {
			Static446.anIntArrayArray63[arg0][local226] = (int) (Static446.aFloatArrayArray9[arg0][local226] * 65536.0F);
		}
		return this.anIntArray498[arg0] * 2;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIF)F")
	private float method6085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static446.method6082(local34);
	}
}
