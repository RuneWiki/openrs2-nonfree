import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class176 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
	public int[] anIntArray544 = new int[2];

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13 = new int[2][2][4];

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14 = new int[2][2][4];

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
	private int[] anIntArray545 = new int[2];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIF)F")
	private float method4358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray13[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray13[arg0][1][arg1] - this.anIntArrayArrayArray13[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static290.method4361(local34);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!cg;Lclient!qa;)V")
	public void method4360(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) Class133 arg1) {
		@Pc(3) int local3 = arg0.method2690();
		this.anIntArray544[0] = local3 >> 4;
		this.anIntArray544[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray545[0] = this.anIntArray545[1] = 0;
			return;
		}
		this.anIntArray545[0] = arg0.method2691();
		this.anIntArray545[1] = arg0.method2691();
		@Pc(37) int local37 = arg0.method2690();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray544[local39]; local44++) {
				this.anIntArrayArrayArray13[local39][0][local44] = arg0.method2691();
				this.anIntArrayArrayArray14[local39][0][local44] = arg0.method2691();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray544[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray13[local39][1][local44] = this.anIntArrayArrayArray13[local39][0][local44];
					this.anIntArrayArrayArray14[local39][1][local44] = this.anIntArrayArrayArray14[local39][0][local44];
				} else {
					this.anIntArrayArrayArray13[local39][1][local44] = arg0.method2691();
					this.anIntArrayArrayArray14[local39][1][local44] = arg0.method2691();
				}
			}
		}
		if (local37 != 0 || this.anIntArray545[1] != this.anIntArray545[0]) {
			arg1.method3313(arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IF)I")
	public int method4362(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray545[0] + (float) (this.anIntArray545[1] - this.anIntArray545[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static290.aFloat55 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static290.anInt5503 = (int) (Static290.aFloat55 * 65536.0F);
		}
		if (this.anIntArray544[arg0] == 0) {
			return 0;
		}
		local20 = this.method4363(arg0, 0, arg1);
		Static290.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method4358(arg0, 0, arg1));
		Static290.aFloatArrayArray2[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray544[arg0]; local77++) {
			local20 = this.method4363(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method4358(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static290.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static290.aFloatArrayArray2[arg0][local77 * 2 - 1] * local106;
			Static290.aFloatArrayArray2[arg0][local77 * 2] = Static290.aFloatArrayArray2[arg0][local77 * 2 - 1] * local102 + Static290.aFloatArrayArray2[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static290.aFloatArrayArray2[arg0][local162] += Static290.aFloatArrayArray2[arg0][local162 - 1] * local102 + Static290.aFloatArrayArray2[arg0][local162 - 2] * local106;
			}
			Static290.aFloatArrayArray2[arg0][1] += Static290.aFloatArrayArray2[arg0][0] * local102 + local106;
			Static290.aFloatArrayArray2[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray544[0] * 2; local77++) {
				Static290.aFloatArrayArray2[0][local77] *= Static290.aFloat55;
			}
		}
		for (local77 = 0; local77 < this.anIntArray544[arg0] * 2; local77++) {
			Static290.anIntArrayArray44[arg0][local77] = (int) (Static290.aFloatArrayArray2[arg0][local77] * 65536.0F);
		}
		return this.anIntArray544[arg0] * 2;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIF)F")
	private float method4363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray14[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray14[arg0][1][arg1] - this.anIntArrayArrayArray14[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
