import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class75 {

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "[I")
	private final int[] anIntArray148 = new int[2];

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8 = new int[2][2][4];

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray9 = new int[2][2][4];

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "[I")
	public final int[] anIntArray149 = new int[2];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIF)F")
	private float method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray8[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray8[arg0][1][arg1] - this.anIntArrayArrayArray8[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!os;Lclient!ir;)V")
	public void method1975(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) Class142 arg1) {
		@Pc(3) int local3 = arg0.method4487();
		this.anIntArray149[0] = local3 >> 4;
		this.anIntArray149[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray148[0] = this.anIntArray148[1] = 0;
			return;
		}
		this.anIntArray148[0] = arg0.method4494();
		this.anIntArray148[1] = arg0.method4494();
		@Pc(37) int local37 = arg0.method4487();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray149[local39]; local42++) {
				this.anIntArrayArrayArray9[local39][0][local42] = arg0.method4494();
				this.anIntArrayArrayArray8[local39][0][local42] = arg0.method4494();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray149[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray9[local42][1][local81] = this.anIntArrayArrayArray9[local42][0][local81];
					this.anIntArrayArrayArray8[local42][1][local81] = this.anIntArrayArrayArray8[local42][0][local81];
				} else {
					this.anIntArrayArrayArray9[local42][1][local81] = arg0.method4494();
					this.anIntArrayArrayArray8[local42][1][local81] = arg0.method4494();
				}
			}
		}
		if (local37 != 0 || this.anIntArray148[1] != this.anIntArray148[0]) {
			arg1.method3854(arg0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIF)F")
	private float method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray9[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray9[arg0][1][arg1] - this.anIntArrayArrayArray9[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static95.method1976(local34);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IF)I")
	public int method1979(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray148[0] + (float) (this.anIntArray148[1] - this.anIntArray148[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static95.aFloat44 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static95.anInt2058 = (int) (Static95.aFloat44 * 65536.0F);
		}
		if (this.anIntArray149[arg0] == 0) {
			return 0;
		}
		local20 = this.method1974(arg0, 0, arg1);
		Static95.aFloatArrayArray4[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1978(arg0, 0, arg1));
		Static95.aFloatArrayArray4[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray149[arg0]; local77++) {
			local20 = this.method1974(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1978(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static95.aFloatArrayArray4[arg0][local77 * 2 + 1] = Static95.aFloatArrayArray4[arg0][local77 * 2 - 1] * local101;
			Static95.aFloatArrayArray4[arg0][local77 * 2] = Static95.aFloatArrayArray4[arg0][local77 * 2 - 1] * local97 + Static95.aFloatArrayArray4[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static95.aFloatArrayArray4[arg0][local157] += Static95.aFloatArrayArray4[arg0][local157 - 1] * local97 + Static95.aFloatArrayArray4[arg0][local157 - 2] * local101;
			}
			Static95.aFloatArrayArray4[arg0][1] += Static95.aFloatArrayArray4[arg0][0] * local97 + local101;
			Static95.aFloatArrayArray4[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray149[0] * 2; local226++) {
				Static95.aFloatArrayArray4[0][local226] *= Static95.aFloat44;
			}
		}
		for (local226 = 0; local226 < this.anIntArray149[arg0] * 2; local226++) {
			Static95.anIntArrayArray21[arg0][local226] = (int) (Static95.aFloatArrayArray4[arg0][local226] * 65536.0F);
		}
		return this.anIntArray149[arg0] * 2;
	}
}
