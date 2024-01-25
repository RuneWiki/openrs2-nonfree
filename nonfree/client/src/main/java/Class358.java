import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class358 {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "[I")
	private final int[] anIntArray559 = new int[2];

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "[I")
	public final int[] anIntArray560 = new int[2];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray19 = new int[2][2][4];

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray20 = new int[2][2][4];

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIF)F")
	private float method8711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray20[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray20[arg0][1][arg1] - this.anIntArrayArrayArray20[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IF)I")
	public int method8713(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray559[0] + (float) (this.anIntArray559[1] - this.anIntArray559[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static614.aFloat205 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static614.anInt10138 = (int) (Static614.aFloat205 * 65536.0F);
		}
		if (this.anIntArray560[arg0] == 0) {
			return 0;
		}
		local20 = this.method8711(arg0, 0, arg1);
		Static614.aFloatArrayArray16[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method8714(arg0, 0, arg1));
		Static614.aFloatArrayArray16[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray560[arg0]; local77++) {
			local20 = this.method8711(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method8714(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static614.aFloatArrayArray16[arg0][local77 * 2 + 1] = Static614.aFloatArrayArray16[arg0][local77 * 2 - 1] * local101;
			Static614.aFloatArrayArray16[arg0][local77 * 2] = Static614.aFloatArrayArray16[arg0][local77 * 2 - 1] * local97 + Static614.aFloatArrayArray16[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static614.aFloatArrayArray16[arg0][local157] += Static614.aFloatArrayArray16[arg0][local157 - 1] * local97 + Static614.aFloatArrayArray16[arg0][local157 - 2] * local101;
			}
			Static614.aFloatArrayArray16[arg0][1] += Static614.aFloatArrayArray16[arg0][0] * local97 + local101;
			Static614.aFloatArrayArray16[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray560[0] * 2; local226++) {
				Static614.aFloatArrayArray16[0][local226] *= Static614.aFloat205;
			}
		}
		for (local226 = 0; local226 < this.anIntArray560[arg0] * 2; local226++) {
			Static614.anIntArrayArray55[arg0][local226] = (int) (Static614.aFloatArrayArray16[arg0][local226] * 65536.0F);
		}
		return this.anIntArray560[arg0] * 2;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIF)F")
	private float method8714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray19[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray19[arg0][1][arg1] - this.anIntArrayArrayArray19[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static614.method8710(local34);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ib;Lclient!vk;)V")
	public void method8715(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(1) Class372 arg1) {
		@Pc(3) int local3 = arg0.method8529();
		this.anIntArray560[0] = local3 >> 4;
		this.anIntArray560[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray559[0] = this.anIntArray559[1] = 0;
			return;
		}
		this.anIntArray559[0] = arg0.method8519();
		this.anIntArray559[1] = arg0.method8519();
		@Pc(37) int local37 = arg0.method8529();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray560[local39]; local42++) {
				this.anIntArrayArrayArray19[local39][0][local42] = arg0.method8519();
				this.anIntArrayArrayArray20[local39][0][local42] = arg0.method8519();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray560[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray19[local42][1][local81] = this.anIntArrayArrayArray19[local42][0][local81];
					this.anIntArrayArrayArray20[local42][1][local81] = this.anIntArrayArrayArray20[local42][0][local81];
				} else {
					this.anIntArrayArrayArray19[local42][1][local81] = arg0.method8519();
					this.anIntArrayArrayArray20[local42][1][local81] = arg0.method8519();
				}
			}
		}
		if (local37 != 0 || this.anIntArray559[1] != this.anIntArray559[0]) {
			arg1.method8922(arg0);
		}
	}
}
