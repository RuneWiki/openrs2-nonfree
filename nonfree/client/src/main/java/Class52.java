import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class52 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "[I")
	private int[] anIntArray166 = new int[2];

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
	public int[] anIntArray167 = new int[2];

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!pg;Lclient!ji;)V")
	public void method1426(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) Class58 arg1) {
		@Pc(3) int local3 = arg0.method2142();
		this.anIntArray167[0] = local3 >> 4;
		this.anIntArray167[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray166[0] = this.anIntArray166[1] = 0;
			return;
		}
		this.anIntArray166[0] = arg0.method2178();
		this.anIntArray166[1] = arg0.method2178();
		@Pc(37) int local37 = arg0.method2142();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray167[local39]; local42++) {
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method2178();
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method2178();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray167[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
				} else {
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method2178();
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method2178();
				}
			}
		}
		if (local37 != 0 || this.anIntArray166[1] != this.anIntArray166[0]) {
			arg1.method1582(arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IF)I")
	public int method1427(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray166[0] + (float) (this.anIntArray166[1] - this.anIntArray166[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static90.aFloat3 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static90.anInt1864 = (int) (Static90.aFloat3 * 65536.0F);
		}
		if (this.anIntArray167[arg0] == 0) {
			return 0;
		}
		local20 = this.method1431(arg0, 0, arg1);
		Static90.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1430(arg0, 0, arg1));
		Static90.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray167[arg0]; local77++) {
			local20 = this.method1431(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1430(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static90.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static90.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static90.aFloatArrayArray1[arg0][local77 * 2] = Static90.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static90.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static90.aFloatArrayArray1[arg0][local157] += Static90.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static90.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static90.aFloatArrayArray1[arg0][1] += Static90.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static90.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray167[0] * 2; local226++) {
				Static90.aFloatArrayArray1[0][local226] *= Static90.aFloat3;
			}
		}
		for (local226 = 0; local226 < this.anIntArray167[arg0] * 2; local226++) {
			Static90.anIntArrayArray10[arg0][local226] = (int) (Static90.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray167[arg0] * 2;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIF)F")
	private float method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static90.method1428(local34);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIF)F")
	private float method1431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
