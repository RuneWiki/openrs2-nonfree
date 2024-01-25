import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class289 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "[I")
	private final int[] anIntArray562 = new int[2];

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray12 = new int[2][2][4];

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "[I")
	public final int[] anIntArray563 = new int[2];

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ud;Lclient!df;)V")
	public void method6936(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(1) Class68 arg1) {
		@Pc(3) int local3 = arg0.method6904();
		this.anIntArray563[0] = local3 >> 4;
		this.anIntArray563[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray562[0] = this.anIntArray562[1] = 0;
			return;
		}
		this.anIntArray562[0] = arg0.method6884();
		this.anIntArray562[1] = arg0.method6884();
		@Pc(37) int local37 = arg0.method6904();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray563[local39]; local42++) {
				this.anIntArrayArrayArray11[local39][0][local42] = arg0.method6884();
				this.anIntArrayArrayArray12[local39][0][local42] = arg0.method6884();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray563[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray11[local42][1][local81] = this.anIntArrayArrayArray11[local42][0][local81];
					this.anIntArrayArrayArray12[local42][1][local81] = this.anIntArrayArrayArray12[local42][0][local81];
				} else {
					this.anIntArrayArrayArray11[local42][1][local81] = arg0.method6884();
					this.anIntArrayArrayArray12[local42][1][local81] = arg0.method6884();
				}
			}
		}
		if (local37 != 0 || this.anIntArray562[1] != this.anIntArray562[0]) {
			arg1.method1571(arg0);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIF)F")
	private float method6939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray12[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray12[arg0][1][arg1] - this.anIntArrayArrayArray12[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IF)I")
	public int method6940(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray562[0] + (float) (this.anIntArray562[1] - this.anIntArray562[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static482.aFloat210 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static482.anInt8265 = (int) (Static482.aFloat210 * 65536.0F);
		}
		if (this.anIntArray563[arg0] == 0) {
			return 0;
		}
		local20 = this.method6939(arg0, 0, arg1);
		Static482.aFloatArrayArray13[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method6941(arg0, 0, arg1));
		Static482.aFloatArrayArray13[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray563[arg0]; local77++) {
			local20 = this.method6939(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method6941(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static482.aFloatArrayArray13[arg0][local77 * 2 + 1] = Static482.aFloatArrayArray13[arg0][local77 * 2 - 1] * local101;
			Static482.aFloatArrayArray13[arg0][local77 * 2] = Static482.aFloatArrayArray13[arg0][local77 * 2 - 1] * local97 + Static482.aFloatArrayArray13[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static482.aFloatArrayArray13[arg0][local157] += Static482.aFloatArrayArray13[arg0][local157 - 1] * local97 + Static482.aFloatArrayArray13[arg0][local157 - 2] * local101;
			}
			Static482.aFloatArrayArray13[arg0][1] += Static482.aFloatArrayArray13[arg0][0] * local97 + local101;
			Static482.aFloatArrayArray13[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray563[0] * 2; local226++) {
				Static482.aFloatArrayArray13[0][local226] *= Static482.aFloat210;
			}
		}
		for (local226 = 0; local226 < this.anIntArray563[arg0] * 2; local226++) {
			Static482.anIntArrayArray74[arg0][local226] = (int) (Static482.aFloatArrayArray13[arg0][local226] * 65536.0F);
		}
		return this.anIntArray563[arg0] * 2;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IIF)F")
	private float method6941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static482.method6938(local34);
	}
}
