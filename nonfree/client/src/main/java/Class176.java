import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class176 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[[F")
	private static final float[][] aFloatArrayArray8 = new float[2][8];

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[2][8];

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
	private final int[] anIntArray331 = new int[2];

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray10 = new int[2][2][4];

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	public final int[] anIntArray332 = new int[2];

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!bt;Lclient!uf;)V", line = 4)
	public void method4469(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) Class232 arg1) {
		@Pc(3) int local3 = arg0.method4816();
		this.anIntArray332[0] = local3 >> 4;
		this.anIntArray332[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray331[0] = this.anIntArray331[1] = 0;
			return;
		}
		this.anIntArray331[0] = arg0.method4830();
		this.anIntArray331[1] = arg0.method4830();
		@Pc(37) int local37 = arg0.method4816();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray332[local39]; local42++) {
				this.anIntArrayArrayArray11[local39][0][local42] = arg0.method4830();
				this.anIntArrayArrayArray10[local39][0][local42] = arg0.method4830();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray332[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray11[local42][1][local81] = this.anIntArrayArrayArray11[local42][0][local81];
					this.anIntArrayArrayArray10[local42][1][local81] = this.anIntArrayArrayArray10[local42][0][local81];
				} else {
					this.anIntArrayArrayArray11[local42][1][local81] = arg0.method4830();
					this.anIntArrayArrayArray10[local42][1][local81] = arg0.method4830();
				}
			}
		}
		if (local37 != 0 || this.anIntArray331[1] != this.anIntArray331[0]) {
			arg1.method5844(arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IF)I", line = 90)
	public int method4471(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray331[0] + (float) (this.anIntArray331[1] - this.anIntArray331[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static243.aFloat65 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static243.anInt4829 = (int) (Static243.aFloat65 * 65536.0F);
		}
		if (this.anIntArray332[arg0] == 0) {
			return 0;
		}
		local20 = this.method4472(arg0, 0, arg1);
		aFloatArrayArray8[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method4474(arg0, 0, arg1));
		aFloatArrayArray8[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray332[arg0]; local77++) {
			local20 = this.method4472(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method4474(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			aFloatArrayArray8[arg0][local77 * 2 + 1] = aFloatArrayArray8[arg0][local77 * 2 - 1] * local101;
			aFloatArrayArray8[arg0][local77 * 2] = aFloatArrayArray8[arg0][local77 * 2 - 1] * local97 + aFloatArrayArray8[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				aFloatArrayArray8[arg0][local157] += aFloatArrayArray8[arg0][local157 - 1] * local97 + aFloatArrayArray8[arg0][local157 - 2] * local101;
			}
			aFloatArrayArray8[arg0][1] += aFloatArrayArray8[arg0][0] * local97 + local101;
			aFloatArrayArray8[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray332[0] * 2; local226++) {
				aFloatArrayArray8[0][local226] *= Static243.aFloat65;
			}
		}
		for (local226 = 0; local226 < this.anIntArray332[arg0] * 2; local226++) {
			anIntArrayArray40[arg0][local226] = (int) (aFloatArrayArray8[arg0][local226] * 65536.0F);
		}
		return this.anIntArray332[arg0] * 2;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIF)F", line = 154)
	private float method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray10[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray10[arg0][1][arg1] - this.anIntArrayArrayArray10[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIF)F", line = 174)
	private float method4474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static243.method4473(local34);
	}
}
