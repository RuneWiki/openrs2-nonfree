import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class381 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "[I")
	public final int[] anIntArray677 = new int[2];

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray38 = new int[2][2][4];

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray39 = new int[2][2][4];

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "[I")
	private final int[] anIntArray678 = new int[2];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIF)F")
	private float method8646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray38[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray38[arg0][1][arg1] - this.anIntArrayArrayArray38[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(IIF)F")
	private float method8647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray39[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray39[arg0][1][arg1] - this.anIntArrayArrayArray39[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static643.method8650(local34);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!dc;Lclient!le;)V")
	public void method8648(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) Class202 arg1) {
		@Pc(3) int local3 = arg0.method5633();
		this.anIntArray677[0] = local3 >> 4;
		this.anIntArray677[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray678[0] = this.anIntArray678[1] = 0;
			return;
		}
		this.anIntArray678[0] = arg0.method5610();
		this.anIntArray678[1] = arg0.method5610();
		@Pc(37) int local37 = arg0.method5633();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray677[local39]; local42++) {
				this.anIntArrayArrayArray39[local39][0][local42] = arg0.method5610();
				this.anIntArrayArrayArray38[local39][0][local42] = arg0.method5610();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray677[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray39[local42][1][local81] = this.anIntArrayArrayArray39[local42][0][local81];
					this.anIntArrayArrayArray38[local42][1][local81] = this.anIntArrayArrayArray38[local42][0][local81];
				} else {
					this.anIntArrayArrayArray39[local42][1][local81] = arg0.method5610();
					this.anIntArrayArrayArray38[local42][1][local81] = arg0.method5610();
				}
			}
		}
		if (local37 != 0 || this.anIntArray678[1] != this.anIntArray678[0]) {
			arg1.method5287(arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IF)I")
	public int method8649(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray678[0] + (float) (this.anIntArray678[1] - this.anIntArray678[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static643.aFloat201 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static643.anInt10261 = (int) (Static643.aFloat201 * 65536.0F);
		}
		if (this.anIntArray677[arg0] == 0) {
			return 0;
		}
		local20 = this.method8646(arg0, 0, arg1);
		Static643.aFloatArrayArray20[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method8647(arg0, 0, arg1));
		Static643.aFloatArrayArray20[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray677[arg0]; local77++) {
			local20 = this.method8646(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method8647(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static643.aFloatArrayArray20[arg0][local77 * 2 + 1] = Static643.aFloatArrayArray20[arg0][local77 * 2 - 1] * local101;
			Static643.aFloatArrayArray20[arg0][local77 * 2] = Static643.aFloatArrayArray20[arg0][local77 * 2 - 1] * local97 + Static643.aFloatArrayArray20[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static643.aFloatArrayArray20[arg0][local157] += Static643.aFloatArrayArray20[arg0][local157 - 1] * local97 + Static643.aFloatArrayArray20[arg0][local157 - 2] * local101;
			}
			Static643.aFloatArrayArray20[arg0][1] += Static643.aFloatArrayArray20[arg0][0] * local97 + local101;
			Static643.aFloatArrayArray20[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray677[0] * 2; local226++) {
				Static643.aFloatArrayArray20[0][local226] *= Static643.aFloat201;
			}
		}
		for (local226 = 0; local226 < this.anIntArray677[arg0] * 2; local226++) {
			Static643.anIntArrayArray62[arg0][local226] = (int) (Static643.aFloatArrayArray20[arg0][local226] * 65536.0F);
		}
		return this.anIntArray677[arg0] * 2;
	}
}
