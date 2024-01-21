import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class16 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "[I")
	private final int[] anIntArray30 = new int[2];

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "[I")
	public final int[] anIntArray31 = new int[2];

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIF)F")
	private float method320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ce;Lclient!ne;)V")
	public void method321(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) Class66 arg1) {
		@Pc(3) int local3 = arg0.method1278();
		this.anIntArray31[0] = local3 >> 4;
		this.anIntArray31[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray30[0] = this.anIntArray30[1] = 0;
			return;
		}
		this.anIntArray30[0] = arg0.method1270();
		this.anIntArray30[1] = arg0.method1270();
		@Pc(37) int local37 = arg0.method1278();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray31[local39]; local42++) {
				this.anIntArrayArrayArray3[local39][0][local42] = arg0.method1270();
				this.anIntArrayArrayArray2[local39][0][local42] = arg0.method1270();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray31[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray3[local42][1][local81] = this.anIntArrayArrayArray3[local42][0][local81];
					this.anIntArrayArrayArray2[local42][1][local81] = this.anIntArrayArrayArray2[local42][0][local81];
				} else {
					this.anIntArrayArrayArray3[local42][1][local81] = arg0.method1270();
					this.anIntArrayArrayArray2[local42][1][local81] = arg0.method1270();
				}
			}
		}
		if (local37 != 0 || this.anIntArray30[1] != this.anIntArray30[0]) {
			arg1.method1936(arg0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IF)I")
	public int method324(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray30[0] + (float) (this.anIntArray30[1] - this.anIntArray30[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static20.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static20.anInt381 = (int) (Static20.aFloat1 * 65536.0F);
		}
		if (this.anIntArray31[arg0] == 0) {
			return 0;
		}
		local20 = this.method320(arg0, 0, arg1);
		Static20.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method325(arg0, 0, arg1));
		Static20.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray31[arg0]; local77++) {
			local20 = this.method320(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method325(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static20.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static20.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static20.aFloatArrayArray1[arg0][local77 * 2] = Static20.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static20.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static20.aFloatArrayArray1[arg0][local157] += Static20.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static20.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static20.aFloatArrayArray1[arg0][1] += Static20.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static20.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray31[0] * 2; local226++) {
				Static20.aFloatArrayArray1[0][local226] *= Static20.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray31[arg0] * 2; local226++) {
			Static20.anIntArrayArray5[arg0][local226] = (int) (Static20.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray31[arg0] * 2;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIF)F")
	private float method325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static20.method322(local34);
	}
}
