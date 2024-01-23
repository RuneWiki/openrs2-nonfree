import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class134 {

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "[I")
	public int[] anIntArray427 = new int[2];

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "[I")
	private int[] anIntArray428 = new int[2];

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10 = new int[2][2][4];

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIF)F")
	private float method3460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray10[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray10[arg0][1][arg1] - this.anIntArrayArrayArray10[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIF)F")
	private float method3463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static218.method3462(local34);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!qm;Lclient!cb;)V")
	public void method3464(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) Class23 arg1) {
		@Pc(3) int local3 = arg0.method2199();
		this.anIntArray427[0] = local3 >> 4;
		this.anIntArray427[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray428[0] = this.anIntArray428[1] = 0;
			return;
		}
		this.anIntArray428[0] = arg0.method2244();
		this.anIntArray428[1] = arg0.method2244();
		@Pc(37) int local37 = arg0.method2199();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray427[local39]; local44++) {
				this.anIntArrayArrayArray11[local39][0][local44] = arg0.method2244();
				this.anIntArrayArrayArray10[local39][0][local44] = arg0.method2244();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray427[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray11[local39][1][local44] = this.anIntArrayArrayArray11[local39][0][local44];
					this.anIntArrayArrayArray10[local39][1][local44] = this.anIntArrayArrayArray10[local39][0][local44];
				} else {
					this.anIntArrayArrayArray11[local39][1][local44] = arg0.method2244();
					this.anIntArrayArrayArray10[local39][1][local44] = arg0.method2244();
				}
			}
		}
		if (local37 != 0 || this.anIntArray428[1] != this.anIntArray428[0]) {
			arg1.method592(arg0);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IF)I")
	public int method3465(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray428[0] + (float) (this.anIntArray428[1] - this.anIntArray428[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static218.aFloat46 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static218.anInt4678 = (int) (Static218.aFloat46 * 65536.0F);
		}
		if (this.anIntArray427[arg0] == 0) {
			return 0;
		}
		local20 = this.method3460(arg0, 0, arg1);
		Static218.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method3463(arg0, 0, arg1));
		Static218.aFloatArrayArray2[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray427[arg0]; local77++) {
			local20 = this.method3460(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method3463(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static218.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static218.aFloatArrayArray2[arg0][local77 * 2 - 1] * local106;
			Static218.aFloatArrayArray2[arg0][local77 * 2] = Static218.aFloatArrayArray2[arg0][local77 * 2 - 1] * local102 + Static218.aFloatArrayArray2[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static218.aFloatArrayArray2[arg0][local162] += Static218.aFloatArrayArray2[arg0][local162 - 1] * local102 + Static218.aFloatArrayArray2[arg0][local162 - 2] * local106;
			}
			Static218.aFloatArrayArray2[arg0][1] += Static218.aFloatArrayArray2[arg0][0] * local102 + local106;
			Static218.aFloatArrayArray2[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray427[0] * 2; local77++) {
				Static218.aFloatArrayArray2[0][local77] *= Static218.aFloat46;
			}
		}
		for (local77 = 0; local77 < this.anIntArray427[arg0] * 2; local77++) {
			Static218.anIntArrayArray60[arg0][local77] = (int) (Static218.aFloatArrayArray2[arg0][local77] * 65536.0F);
		}
		return this.anIntArray427[arg0] * 2;
	}
}
