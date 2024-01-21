import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
	public final int[] anIntArray10 = new int[2];

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "[I")
	private final int[] anIntArray11 = new int[2];

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIF)F")
	private float method67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static3.method71(local34);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IF)I")
	public int method68(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray11[0] + (float) (this.anIntArray11[1] - this.anIntArray11[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static3.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static3.anInt92 = (int) (Static3.aFloat1 * 65536.0F);
		}
		if (this.anIntArray10[arg0] == 0) {
			return 0;
		}
		local20 = this.method72(arg0, 0, arg1);
		Static3.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method67(arg0, 0, arg1));
		Static3.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray10[arg0]; local77++) {
			local20 = this.method72(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method67(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static3.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static3.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static3.aFloatArrayArray1[arg0][local77 * 2] = Static3.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static3.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static3.aFloatArrayArray1[arg0][local157] += Static3.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static3.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static3.aFloatArrayArray1[arg0][1] += Static3.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static3.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray10[0] * 2; local226++) {
				Static3.aFloatArrayArray1[0][local226] *= Static3.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray10[arg0] * 2; local226++) {
			Static3.anIntArrayArray1[arg0][local226] = (int) (Static3.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray10[arg0] * 2;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!g;Lclient!ce;)V")
	public void method69(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) Class13 arg1) {
		@Pc(3) int local3 = arg0.method1281();
		this.anIntArray10[0] = local3 >> 4;
		this.anIntArray10[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray11[0] = this.anIntArray11[1] = 0;
			return;
		}
		this.anIntArray11[0] = arg0.method1273();
		this.anIntArray11[1] = arg0.method1273();
		@Pc(37) int local37 = arg0.method1281();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray10[local39]; local42++) {
				this.anIntArrayArrayArray2[local39][0][local42] = arg0.method1273();
				this.anIntArrayArrayArray1[local39][0][local42] = arg0.method1273();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray10[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray2[local42][1][local81] = this.anIntArrayArrayArray2[local42][0][local81];
					this.anIntArrayArrayArray1[local42][1][local81] = this.anIntArrayArrayArray1[local42][0][local81];
				} else {
					this.anIntArrayArrayArray2[local42][1][local81] = arg0.method1273();
					this.anIntArrayArrayArray1[local42][1][local81] = arg0.method1273();
				}
			}
		}
		if (local37 != 0 || this.anIntArray11[1] != this.anIntArray11[0]) {
			arg1.method336(arg0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIF)F")
	private float method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
