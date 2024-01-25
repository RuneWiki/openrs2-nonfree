import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class262 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "[I")
	private final int[] anIntArray573 = new int[2];

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray14 = new int[2][2][4];

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "[I")
	public final int[] anIntArray574 = new int[2];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IF)I")
	public int method5907(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray573[0] + (float) (this.anIntArray573[1] - this.anIntArray573[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static443.aFloat100 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static443.anInt7525 = (int) (Static443.aFloat100 * 65536.0F);
		}
		if (this.anIntArray574[arg0] == 0) {
			return 0;
		}
		local20 = this.method5910(arg0, 0, arg1);
		Static443.aFloatArrayArray9[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5911(arg0, 0, arg1));
		Static443.aFloatArrayArray9[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray574[arg0]; local77++) {
			local20 = this.method5910(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5911(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static443.aFloatArrayArray9[arg0][local77 * 2 + 1] = Static443.aFloatArrayArray9[arg0][local77 * 2 - 1] * local101;
			Static443.aFloatArrayArray9[arg0][local77 * 2] = Static443.aFloatArrayArray9[arg0][local77 * 2 - 1] * local97 + Static443.aFloatArrayArray9[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static443.aFloatArrayArray9[arg0][local157] += Static443.aFloatArrayArray9[arg0][local157 - 1] * local97 + Static443.aFloatArrayArray9[arg0][local157 - 2] * local101;
			}
			Static443.aFloatArrayArray9[arg0][1] += Static443.aFloatArrayArray9[arg0][0] * local97 + local101;
			Static443.aFloatArrayArray9[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray574[0] * 2; local226++) {
				Static443.aFloatArrayArray9[0][local226] *= Static443.aFloat100;
			}
		}
		for (local226 = 0; local226 < this.anIntArray574[arg0] * 2; local226++) {
			Static443.anIntArrayArray66[arg0][local226] = (int) (Static443.aFloatArrayArray9[arg0][local226] * 65536.0F);
		}
		return this.anIntArray574[arg0] * 2;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!bt;Lclient!dk;)V")
	public void method5908(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) Class53 arg1) {
		@Pc(3) int local3 = arg0.method6053();
		this.anIntArray574[0] = local3 >> 4;
		this.anIntArray574[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray573[0] = this.anIntArray573[1] = 0;
			return;
		}
		this.anIntArray573[0] = arg0.method6004();
		this.anIntArray573[1] = arg0.method6004();
		@Pc(37) int local37 = arg0.method6053();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray574[local39]; local42++) {
				this.anIntArrayArrayArray14[local39][0][local42] = arg0.method6004();
				this.anIntArrayArrayArray13[local39][0][local42] = arg0.method6004();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray574[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray14[local42][1][local81] = this.anIntArrayArrayArray14[local42][0][local81];
					this.anIntArrayArrayArray13[local42][1][local81] = this.anIntArrayArrayArray13[local42][0][local81];
				} else {
					this.anIntArrayArrayArray14[local42][1][local81] = arg0.method6004();
					this.anIntArrayArrayArray13[local42][1][local81] = arg0.method6004();
				}
			}
		}
		if (local37 != 0 || this.anIntArray573[1] != this.anIntArray573[0]) {
			arg1.method1349(arg0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIF)F")
	private float method5910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(IIF)F")
	private float method5911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray14[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray14[arg0][1][arg1] - this.anIntArrayArrayArray14[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static443.method5912(local34);
	}
}
