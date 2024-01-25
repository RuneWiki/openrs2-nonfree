import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class226 {

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "[I")
	private final int[] anIntArray439 = new int[2];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "[I")
	public final int[] anIntArray440 = new int[2];

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIF)F")
	private float method4489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IF)I")
	public int method4490(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray439[0] + (float) (this.anIntArray439[1] - this.anIntArray439[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static328.aFloat126 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static328.anInt5502 = (int) (Static328.aFloat126 * 65536.0F);
		}
		if (this.anIntArray440[arg0] == 0) {
			return 0;
		}
		local20 = this.method4489(arg0, 0, arg1);
		Static328.aFloatArrayArray4[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method4493(arg0, 0, arg1));
		Static328.aFloatArrayArray4[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray440[arg0]; local77++) {
			local20 = this.method4489(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method4493(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static328.aFloatArrayArray4[arg0][local77 * 2 + 1] = Static328.aFloatArrayArray4[arg0][local77 * 2 - 1] * local101;
			Static328.aFloatArrayArray4[arg0][local77 * 2] = Static328.aFloatArrayArray4[arg0][local77 * 2 - 1] * local97 + Static328.aFloatArrayArray4[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static328.aFloatArrayArray4[arg0][local157] += Static328.aFloatArrayArray4[arg0][local157 - 1] * local97 + Static328.aFloatArrayArray4[arg0][local157 - 2] * local101;
			}
			Static328.aFloatArrayArray4[arg0][1] += Static328.aFloatArrayArray4[arg0][0] * local97 + local101;
			Static328.aFloatArrayArray4[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray440[0] * 2; local226++) {
				Static328.aFloatArrayArray4[0][local226] *= Static328.aFloat126;
			}
		}
		for (local226 = 0; local226 < this.anIntArray440[arg0] * 2; local226++) {
			Static328.anIntArrayArray123[arg0][local226] = (int) (Static328.aFloatArrayArray4[arg0][local226] * 65536.0F);
		}
		return this.anIntArray440[arg0] * 2;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!mo;Lclient!baa;)V")
	public void method4491(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(1) Class24 arg1) {
		@Pc(3) int local3 = arg0.method5750();
		this.anIntArray440[0] = local3 >> 4;
		this.anIntArray440[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray439[0] = this.anIntArray439[1] = 0;
			return;
		}
		this.anIntArray439[0] = arg0.method5771();
		this.anIntArray439[1] = arg0.method5771();
		@Pc(37) int local37 = arg0.method5750();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray440[local39]; local42++) {
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method5771();
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method5771();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray440[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
				} else {
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method5771();
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method5771();
				}
			}
		}
		if (local37 != 0 || this.anIntArray439[1] != this.anIntArray439[0]) {
			arg1.method324(arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IIF)F")
	private float method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static328.method4492(local34);
	}
}
