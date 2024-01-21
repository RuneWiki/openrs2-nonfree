import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class16 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
	public final int[] anIntArray76 = new int[2];

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
	private final int[] anIntArray75 = new int[2];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!na;Lclient!cf;)V")
	public void method404(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(1) Class11 arg1) {
		@Pc(3) int local3 = arg0.method640();
		this.anIntArray76[0] = local3 >> 4;
		this.anIntArray76[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray75[0] = this.anIntArray75[1] = 0;
			return;
		}
		this.anIntArray75[0] = arg0.method632();
		this.anIntArray75[1] = arg0.method632();
		@Pc(37) int local37 = arg0.method640();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray76[local39]; local42++) {
				this.anIntArrayArrayArray1[local39][0][local42] = arg0.method632();
				this.anIntArrayArrayArray2[local39][0][local42] = arg0.method632();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray76[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray1[local42][1][local81] = this.anIntArrayArrayArray1[local42][0][local81];
					this.anIntArrayArrayArray2[local42][1][local81] = this.anIntArrayArrayArray2[local42][0][local81];
				} else {
					this.anIntArrayArrayArray1[local42][1][local81] = arg0.method632();
					this.anIntArrayArrayArray2[local42][1][local81] = arg0.method632();
				}
			}
		}
		if (local37 != 0 || this.anIntArray75[1] != this.anIntArray75[0]) {
			arg1.method253(arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IF)I")
	public int method405(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray75[0] + (float) (this.anIntArray75[1] - this.anIntArray75[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static22.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static22.anInt648 = (int) (Static22.aFloat1 * 65536.0F);
		}
		if (this.anIntArray76[arg0] == 0) {
			return 0;
		}
		local20 = this.method408(arg0, 0, arg1);
		Static22.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method406(arg0, 0, arg1));
		Static22.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray76[arg0]; local77++) {
			local20 = this.method408(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method406(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static22.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static22.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static22.aFloatArrayArray1[arg0][local77 * 2] = Static22.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static22.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static22.aFloatArrayArray1[arg0][local157] += Static22.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static22.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static22.aFloatArrayArray1[arg0][1] += Static22.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static22.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray76[0] * 2; local226++) {
				Static22.aFloatArrayArray1[0][local226] *= Static22.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray76[arg0] * 2; local226++) {
			Static22.anIntArrayArray7[arg0][local226] = (int) (Static22.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray76[arg0] * 2;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIF)F")
	private float method406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static22.method409(local34);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IIF)F")
	private float method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
