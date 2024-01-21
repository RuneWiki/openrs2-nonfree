import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class69 {

	@OriginalMember(owner = "client!t", name = "b", descriptor = "[I")
	public final int[] anIntArray329 = new int[2];

	@OriginalMember(owner = "client!t", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray9 = new int[2][2][4];

	@OriginalMember(owner = "client!t", name = "h", descriptor = "[I")
	private final int[] anIntArray330 = new int[2];

	@OriginalMember(owner = "client!t", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray10 = new int[2][2][4];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!la;Lclient!aa;)V")
	public void method2058(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(1) Class2 arg1) {
		@Pc(3) int local3 = arg0.method1936();
		this.anIntArray329[0] = local3 >> 4;
		this.anIntArray329[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray330[0] = this.anIntArray330[1] = 0;
			return;
		}
		this.anIntArray330[0] = arg0.method1963();
		this.anIntArray330[1] = arg0.method1963();
		@Pc(37) int local37 = arg0.method1936();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray329[local39]; local42++) {
				this.anIntArrayArrayArray9[local39][0][local42] = arg0.method1963();
				this.anIntArrayArrayArray10[local39][0][local42] = arg0.method1963();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray329[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray9[local42][1][local81] = this.anIntArrayArrayArray9[local42][0][local81];
					this.anIntArrayArrayArray10[local42][1][local81] = this.anIntArrayArrayArray10[local42][0][local81];
				} else {
					this.anIntArrayArrayArray9[local42][1][local81] = arg0.method1963();
					this.anIntArrayArrayArray10[local42][1][local81] = arg0.method1963();
				}
			}
		}
		if (local37 != 0 || this.anIntArray330[1] != this.anIntArray330[0]) {
			arg1.method5(arg0);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IF)I")
	public int method2059(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray330[0] + (float) (this.anIntArray330[1] - this.anIntArray330[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static110.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static110.anInt3096 = (int) (Static110.aFloat1 * 65536.0F);
		}
		if (this.anIntArray329[arg0] == 0) {
			return 0;
		}
		local20 = this.method2060(arg0, 0, arg1);
		Static110.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method2063(arg0, 0, arg1));
		Static110.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray329[arg0]; local77++) {
			local20 = this.method2060(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method2063(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static110.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static110.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static110.aFloatArrayArray2[arg0][local77 * 2] = Static110.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static110.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static110.aFloatArrayArray2[arg0][local157] += Static110.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static110.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static110.aFloatArrayArray2[arg0][1] += Static110.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static110.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray329[0] * 2; local226++) {
				Static110.aFloatArrayArray2[0][local226] *= Static110.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray329[arg0] * 2; local226++) {
			Static110.anIntArrayArray76[arg0][local226] = (int) (Static110.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray329[arg0] * 2;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIF)F")
	private float method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray10[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray10[arg0][1][arg1] - this.anIntArrayArrayArray10[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IIF)F")
	private float method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray9[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray9[arg0][1][arg1] - this.anIntArrayArrayArray9[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static110.method2062(local34);
	}
}
