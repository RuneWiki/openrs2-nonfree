import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class221 {

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "[I")
	public final int[] anIntArray334 = new int[2];

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray16 = new int[2][2][4];

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "[I")
	private final int[] anIntArray335 = new int[2];

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray17 = new int[2][2][4];

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIF)F")
	private float method5134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray16[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray16[arg0][1][arg1] - this.anIntArrayArrayArray16[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static349.method5137(local34);
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(IIF)F")
	private float method5135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray17[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray17[arg0][1][arg1] - this.anIntArrayArrayArray17[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!np;Lclient!tb;)V")
	public void method5138(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) Class319 arg1) {
		@Pc(3) int local3 = arg0.method5175();
		this.anIntArray334[0] = local3 >> 4;
		this.anIntArray334[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray335[0] = this.anIntArray335[1] = 0;
			return;
		}
		this.anIntArray335[0] = arg0.method5198();
		this.anIntArray335[1] = arg0.method5198();
		@Pc(37) int local37 = arg0.method5175();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray334[local39]; local42++) {
				this.anIntArrayArrayArray16[local39][0][local42] = arg0.method5198();
				this.anIntArrayArrayArray17[local39][0][local42] = arg0.method5198();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray334[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray16[local42][1][local81] = this.anIntArrayArrayArray16[local42][0][local81];
					this.anIntArrayArrayArray17[local42][1][local81] = this.anIntArrayArrayArray17[local42][0][local81];
				} else {
					this.anIntArrayArrayArray16[local42][1][local81] = arg0.method5198();
					this.anIntArrayArrayArray17[local42][1][local81] = arg0.method5198();
				}
			}
		}
		if (local37 != 0 || this.anIntArray335[1] != this.anIntArray335[0]) {
			arg1.method6749(arg0);
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IF)I")
	public int method5139(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray335[0] + (float) (this.anIntArray335[1] - this.anIntArray335[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static349.aFloat138 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static349.anInt6076 = (int) (Static349.aFloat138 * 65536.0F);
		}
		if (this.anIntArray334[arg0] == 0) {
			return 0;
		}
		local20 = this.method5135(arg0, 0, arg1);
		Static349.aFloatArrayArray14[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5134(arg0, 0, arg1));
		Static349.aFloatArrayArray14[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray334[arg0]; local77++) {
			local20 = this.method5135(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5134(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static349.aFloatArrayArray14[arg0][local77 * 2 + 1] = Static349.aFloatArrayArray14[arg0][local77 * 2 - 1] * local101;
			Static349.aFloatArrayArray14[arg0][local77 * 2] = Static349.aFloatArrayArray14[arg0][local77 * 2 - 1] * local97 + Static349.aFloatArrayArray14[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static349.aFloatArrayArray14[arg0][local157] += Static349.aFloatArrayArray14[arg0][local157 - 1] * local97 + Static349.aFloatArrayArray14[arg0][local157 - 2] * local101;
			}
			Static349.aFloatArrayArray14[arg0][1] += Static349.aFloatArrayArray14[arg0][0] * local97 + local101;
			Static349.aFloatArrayArray14[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray334[0] * 2; local226++) {
				Static349.aFloatArrayArray14[0][local226] *= Static349.aFloat138;
			}
		}
		for (local226 = 0; local226 < this.anIntArray334[arg0] * 2; local226++) {
			Static349.anIntArrayArray135[arg0][local226] = (int) (Static349.aFloatArrayArray14[arg0][local226] * 65536.0F);
		}
		return this.anIntArray334[arg0] * 2;
	}
}
