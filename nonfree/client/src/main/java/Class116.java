import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class116 {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!n", name = "c", descriptor = "[I")
	public int[] anIntArray283 = new int[2];

	@OriginalMember(owner = "client!n", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!n", name = "g", descriptor = "[I")
	private int[] anIntArray284 = new int[2];

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIF)F")
	private float method2871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static167.method2870(local34);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!wm;Lclient!kd;)V")
	public void method2872(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) Class94 arg1) {
		@Pc(3) int local3 = arg0.method4261();
		this.anIntArray283[0] = local3 >> 4;
		this.anIntArray283[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray284[0] = this.anIntArray284[1] = 0;
			return;
		}
		this.anIntArray284[0] = arg0.method4242();
		this.anIntArray284[1] = arg0.method4242();
		@Pc(37) int local37 = arg0.method4261();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray283[local39]; local44++) {
				this.anIntArrayArrayArray6[local39][0][local44] = arg0.method4242();
				this.anIntArrayArrayArray7[local39][0][local44] = arg0.method4242();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray283[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray6[local39][1][local44] = this.anIntArrayArrayArray6[local39][0][local44];
					this.anIntArrayArrayArray7[local39][1][local44] = this.anIntArrayArrayArray7[local39][0][local44];
				} else {
					this.anIntArrayArrayArray6[local39][1][local44] = arg0.method4242();
					this.anIntArrayArrayArray7[local39][1][local44] = arg0.method4242();
				}
			}
		}
		if (local37 != 0 || this.anIntArray284[1] != this.anIntArray284[0]) {
			arg1.method2284(arg0);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IF)I")
	public int method2873(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray284[0] + (float) (this.anIntArray284[1] - this.anIntArray284[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static167.aFloat35 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static167.anInt3561 = (int) (Static167.aFloat35 * 65536.0F);
		}
		if (this.anIntArray283[arg0] == 0) {
			return 0;
		}
		local20 = this.method2874(arg0, 0, arg1);
		Static167.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method2871(arg0, 0, arg1));
		Static167.aFloatArrayArray2[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray283[arg0]; local77++) {
			local20 = this.method2874(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method2871(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static167.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static167.aFloatArrayArray2[arg0][local77 * 2 - 1] * local106;
			Static167.aFloatArrayArray2[arg0][local77 * 2] = Static167.aFloatArrayArray2[arg0][local77 * 2 - 1] * local102 + Static167.aFloatArrayArray2[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static167.aFloatArrayArray2[arg0][local162] += Static167.aFloatArrayArray2[arg0][local162 - 1] * local102 + Static167.aFloatArrayArray2[arg0][local162 - 2] * local106;
			}
			Static167.aFloatArrayArray2[arg0][1] += Static167.aFloatArrayArray2[arg0][0] * local102 + local106;
			Static167.aFloatArrayArray2[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray283[0] * 2; local77++) {
				Static167.aFloatArrayArray2[0][local77] *= Static167.aFloat35;
			}
		}
		for (local77 = 0; local77 < this.anIntArray283[arg0] * 2; local77++) {
			Static167.anIntArrayArray30[arg0][local77] = (int) (Static167.aFloatArrayArray2[arg0][local77] * 65536.0F);
		}
		return this.anIntArray283[arg0] * 2;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IIF)F")
	private float method2874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
