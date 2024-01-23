import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class175 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[I")
	private int[] anIntArray495 = new int[2];

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14 = new int[2][2][4];

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
	public int[] anIntArray496 = new int[2];

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15 = new int[2][2][4];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!sb;Lclient!gn;)V")
	public void method4227(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) Class67 arg1) {
		@Pc(3) int local3 = arg0.method2595();
		this.anIntArray496[0] = local3 >> 4;
		this.anIntArray496[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray495[0] = this.anIntArray495[1] = 0;
			return;
		}
		this.anIntArray495[0] = arg0.method2593();
		this.anIntArray495[1] = arg0.method2593();
		@Pc(37) int local37 = arg0.method2595();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray496[local39]; local44++) {
				this.anIntArrayArrayArray14[local39][0][local44] = arg0.method2593();
				this.anIntArrayArrayArray15[local39][0][local44] = arg0.method2593();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray496[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray14[local39][1][local44] = this.anIntArrayArrayArray14[local39][0][local44];
					this.anIntArrayArrayArray15[local39][1][local44] = this.anIntArrayArrayArray15[local39][0][local44];
				} else {
					this.anIntArrayArrayArray14[local39][1][local44] = arg0.method2593();
					this.anIntArrayArrayArray15[local39][1][local44] = arg0.method2593();
				}
			}
		}
		if (local37 != 0 || this.anIntArray495[1] != this.anIntArray495[0]) {
			arg1.method1383(arg0);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IF)I")
	public int method4228(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray495[0] + (float) (this.anIntArray495[1] - this.anIntArray495[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static284.aFloat53 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static284.anInt5410 = (int) (Static284.aFloat53 * 65536.0F);
		}
		if (this.anIntArray496[arg0] == 0) {
			return 0;
		}
		local20 = this.method4229(arg0, 0, arg1);
		Static284.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method4230(arg0, 0, arg1));
		Static284.aFloatArrayArray2[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray496[arg0]; local77++) {
			local20 = this.method4229(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method4230(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static284.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static284.aFloatArrayArray2[arg0][local77 * 2 - 1] * local106;
			Static284.aFloatArrayArray2[arg0][local77 * 2] = Static284.aFloatArrayArray2[arg0][local77 * 2 - 1] * local102 + Static284.aFloatArrayArray2[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static284.aFloatArrayArray2[arg0][local162] += Static284.aFloatArrayArray2[arg0][local162 - 1] * local102 + Static284.aFloatArrayArray2[arg0][local162 - 2] * local106;
			}
			Static284.aFloatArrayArray2[arg0][1] += Static284.aFloatArrayArray2[arg0][0] * local102 + local106;
			Static284.aFloatArrayArray2[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray496[0] * 2; local77++) {
				Static284.aFloatArrayArray2[0][local77] *= Static284.aFloat53;
			}
		}
		for (local77 = 0; local77 < this.anIntArray496[arg0] * 2; local77++) {
			Static284.anIntArrayArray44[arg0][local77] = (int) (Static284.aFloatArrayArray2[arg0][local77] * 65536.0F);
		}
		return this.anIntArray496[arg0] * 2;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIF)F")
	private float method4229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray15[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray15[arg0][1][arg1] - this.anIntArrayArrayArray15[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(IIF)F")
	private float method4230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray14[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray14[arg0][1][arg1] - this.anIntArrayArrayArray14[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static284.method4226(local34);
	}
}
