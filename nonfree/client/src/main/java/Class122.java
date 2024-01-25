import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class122 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!k", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
	private final int[] anIntArray274 = new int[2];

	@OriginalMember(owner = "client!k", name = "h", descriptor = "[I")
	public final int[] anIntArray275 = new int[2];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIF)F")
	private float method3074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray4[arg0][1][arg1] - this.anIntArrayArrayArray4[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!vt;Lclient!ng;)V")
	public void method3076(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) Class160 arg1) {
		@Pc(3) int local3 = arg0.method5732();
		this.anIntArray275[0] = local3 >> 4;
		this.anIntArray275[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray274[0] = this.anIntArray274[1] = 0;
			return;
		}
		this.anIntArray274[0] = arg0.method5753();
		this.anIntArray274[1] = arg0.method5753();
		@Pc(37) int local37 = arg0.method5732();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray275[local39]; local42++) {
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method5753();
				this.anIntArrayArrayArray4[local39][0][local42] = arg0.method5753();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray275[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
					this.anIntArrayArrayArray4[local42][1][local81] = this.anIntArrayArrayArray4[local42][0][local81];
				} else {
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method5753();
					this.anIntArrayArrayArray4[local42][1][local81] = arg0.method5753();
				}
			}
		}
		if (local37 != 0 || this.anIntArray274[1] != this.anIntArray274[0]) {
			arg1.method4093(arg0);
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(IIF)F")
	private float method3077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static173.method3073(local34);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IF)I")
	public int method3078(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray274[0] + (float) (this.anIntArray274[1] - this.anIntArray274[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static173.aFloat46 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static173.anInt3537 = (int) (Static173.aFloat46 * 65536.0F);
		}
		if (this.anIntArray275[arg0] == 0) {
			return 0;
		}
		local20 = this.method3074(arg0, 0, arg1);
		Static173.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method3077(arg0, 0, arg1));
		Static173.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray275[arg0]; local77++) {
			local20 = this.method3074(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method3077(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static173.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static173.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static173.aFloatArrayArray2[arg0][local77 * 2] = Static173.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static173.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static173.aFloatArrayArray2[arg0][local157] += Static173.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static173.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static173.aFloatArrayArray2[arg0][1] += Static173.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static173.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray275[0] * 2; local226++) {
				Static173.aFloatArrayArray2[0][local226] *= Static173.aFloat46;
			}
		}
		for (local226 = 0; local226 < this.anIntArray275[arg0] * 2; local226++) {
			Static173.anIntArrayArray18[arg0][local226] = (int) (Static173.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray275[arg0] * 2;
	}
}
