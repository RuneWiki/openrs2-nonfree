import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class235 {

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "[I")
	private final int[] anIntArray430 = new int[2];

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "[I")
	public final int[] anIntArray431 = new int[2];

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray14 = new int[2][2][4];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IF)I")
	public int method5056(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray430[0] + (float) (this.anIntArray430[1] - this.anIntArray430[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static386.aFloat74 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static386.anInt6424 = (int) (Static386.aFloat74 * 65536.0F);
		}
		if (this.anIntArray431[arg0] == 0) {
			return 0;
		}
		local20 = this.method5059(arg0, 0, arg1);
		Static386.aFloatArrayArray8[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5061(arg0, 0, arg1));
		Static386.aFloatArrayArray8[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray431[arg0]; local77++) {
			local20 = this.method5059(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5061(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static386.aFloatArrayArray8[arg0][local77 * 2 + 1] = Static386.aFloatArrayArray8[arg0][local77 * 2 - 1] * local101;
			Static386.aFloatArrayArray8[arg0][local77 * 2] = Static386.aFloatArrayArray8[arg0][local77 * 2 - 1] * local97 + Static386.aFloatArrayArray8[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static386.aFloatArrayArray8[arg0][local157] += Static386.aFloatArrayArray8[arg0][local157 - 1] * local97 + Static386.aFloatArrayArray8[arg0][local157 - 2] * local101;
			}
			Static386.aFloatArrayArray8[arg0][1] += Static386.aFloatArrayArray8[arg0][0] * local97 + local101;
			Static386.aFloatArrayArray8[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray431[0] * 2; local226++) {
				Static386.aFloatArrayArray8[0][local226] *= Static386.aFloat74;
			}
		}
		for (local226 = 0; local226 < this.anIntArray431[arg0] * 2; local226++) {
			Static386.anIntArrayArray59[arg0][local226] = (int) (Static386.aFloatArrayArray8[arg0][local226] * 65536.0F);
		}
		return this.anIntArray431[arg0] * 2;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ug;Lclient!mi;)V")
	public void method5057(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(1) Class153 arg1) {
		@Pc(3) int local3 = arg0.method5337();
		this.anIntArray431[0] = local3 >> 4;
		this.anIntArray431[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray430[0] = this.anIntArray430[1] = 0;
			return;
		}
		this.anIntArray430[0] = arg0.method5335();
		this.anIntArray430[1] = arg0.method5335();
		@Pc(37) int local37 = arg0.method5337();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray431[local39]; local42++) {
				this.anIntArrayArrayArray13[local39][0][local42] = arg0.method5335();
				this.anIntArrayArrayArray14[local39][0][local42] = arg0.method5335();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray431[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray13[local42][1][local81] = this.anIntArrayArrayArray13[local42][0][local81];
					this.anIntArrayArrayArray14[local42][1][local81] = this.anIntArrayArrayArray14[local42][0][local81];
				} else {
					this.anIntArrayArrayArray13[local42][1][local81] = arg0.method5335();
					this.anIntArrayArrayArray14[local42][1][local81] = arg0.method5335();
				}
			}
		}
		if (local37 != 0 || this.anIntArray430[1] != this.anIntArray430[0]) {
			arg1.method3531(arg0);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIF)F")
	private float method5059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray14[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray14[arg0][1][arg1] - this.anIntArrayArrayArray14[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIF)F")
	private float method5061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static386.method5060(local34);
	}
}
