import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class242 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray14 = new int[2][2][4];

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "[I")
	private final int[] anIntArray567 = new int[2];

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "[I")
	public final int[] anIntArray568 = new int[2];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIF)F")
	private float method5605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray14[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray14[arg0][1][arg1] - this.anIntArrayArrayArray14[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IF)I")
	public int method5606(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray567[0] + (float) (this.anIntArray567[1] - this.anIntArray567[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static397.aFloat91 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static397.anInt7029 = (int) (Static397.aFloat91 * 65536.0F);
		}
		if (this.anIntArray568[arg0] == 0) {
			return 0;
		}
		local20 = this.method5605(arg0, 0, arg1);
		Static397.aFloatArrayArray34[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5609(arg0, 0, arg1));
		Static397.aFloatArrayArray34[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray568[arg0]; local77++) {
			local20 = this.method5605(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5609(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static397.aFloatArrayArray34[arg0][local77 * 2 + 1] = Static397.aFloatArrayArray34[arg0][local77 * 2 - 1] * local101;
			Static397.aFloatArrayArray34[arg0][local77 * 2] = Static397.aFloatArrayArray34[arg0][local77 * 2 - 1] * local97 + Static397.aFloatArrayArray34[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static397.aFloatArrayArray34[arg0][local157] += Static397.aFloatArrayArray34[arg0][local157 - 1] * local97 + Static397.aFloatArrayArray34[arg0][local157 - 2] * local101;
			}
			Static397.aFloatArrayArray34[arg0][1] += Static397.aFloatArrayArray34[arg0][0] * local97 + local101;
			Static397.aFloatArrayArray34[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray568[0] * 2; local226++) {
				Static397.aFloatArrayArray34[0][local226] *= Static397.aFloat91;
			}
		}
		for (local226 = 0; local226 < this.anIntArray568[arg0] * 2; local226++) {
			Static397.anIntArrayArray53[arg0][local226] = (int) (Static397.aFloatArrayArray34[arg0][local226] * 65536.0F);
		}
		return this.anIntArray568[arg0] * 2;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!wn;Lclient!aw;)V")
	public void method5608(@OriginalArg(0) Class4_Sub20 arg0, @OriginalArg(1) Class17 arg1) {
		@Pc(3) int local3 = arg0.method4614();
		this.anIntArray568[0] = local3 >> 4;
		this.anIntArray568[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray567[0] = this.anIntArray567[1] = 0;
			return;
		}
		this.anIntArray567[0] = arg0.method4560();
		this.anIntArray567[1] = arg0.method4560();
		@Pc(37) int local37 = arg0.method4614();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray568[local39]; local42++) {
				this.anIntArrayArrayArray13[local39][0][local42] = arg0.method4560();
				this.anIntArrayArrayArray14[local39][0][local42] = arg0.method4560();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray568[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray13[local42][1][local81] = this.anIntArrayArrayArray13[local42][0][local81];
					this.anIntArrayArrayArray14[local42][1][local81] = this.anIntArrayArrayArray14[local42][0][local81];
				} else {
					this.anIntArrayArrayArray13[local42][1][local81] = arg0.method4560();
					this.anIntArrayArrayArray14[local42][1][local81] = arg0.method4560();
				}
			}
		}
		if (local37 != 0 || this.anIntArray567[1] != this.anIntArray567[0]) {
			arg1.method309(arg0);
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(IIF)F")
	private float method5609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static397.method5604(local34);
	}
}
