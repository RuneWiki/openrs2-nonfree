import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class108 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "[I")
	public int[] anIntArray278 = new int[2];

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "[I")
	private int[] anIntArray279 = new int[2];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIF)F")
	private float method2637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!pi;Lclient!i;)V")
	public void method2638(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) Class71 arg1) {
		@Pc(3) int local3 = arg0.method3110();
		this.anIntArray278[0] = local3 >> 4;
		this.anIntArray278[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray279[0] = this.anIntArray279[1] = 0;
			return;
		}
		this.anIntArray279[0] = arg0.method3085();
		this.anIntArray279[1] = arg0.method3085();
		@Pc(37) int local37 = arg0.method3110();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray278[local39]; local44++) {
				this.anIntArrayArrayArray7[local39][0][local44] = arg0.method3085();
				this.anIntArrayArrayArray6[local39][0][local44] = arg0.method3085();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray278[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray7[local39][1][local44] = this.anIntArrayArrayArray7[local39][0][local44];
					this.anIntArrayArrayArray6[local39][1][local44] = this.anIntArrayArrayArray6[local39][0][local44];
				} else {
					this.anIntArrayArrayArray7[local39][1][local44] = arg0.method3085();
					this.anIntArrayArrayArray6[local39][1][local44] = arg0.method3085();
				}
			}
		}
		if (local37 != 0 || this.anIntArray279[1] != this.anIntArray279[0]) {
			arg1.method1850(arg0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(IIF)F")
	private float method2639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static166.method2641(local34);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IF)I")
	public int method2640(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray279[0] + (float) (this.anIntArray279[1] - this.anIntArray279[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static166.aFloat93 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static166.anInt3327 = (int) (Static166.aFloat93 * 65536.0F);
		}
		if (this.anIntArray278[arg0] == 0) {
			return 0;
		}
		local20 = this.method2637(arg0, 0, arg1);
		Static166.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method2639(arg0, 0, arg1));
		Static166.aFloatArrayArray2[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray278[arg0]; local77++) {
			local20 = this.method2637(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method2639(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static166.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static166.aFloatArrayArray2[arg0][local77 * 2 - 1] * local106;
			Static166.aFloatArrayArray2[arg0][local77 * 2] = Static166.aFloatArrayArray2[arg0][local77 * 2 - 1] * local102 + Static166.aFloatArrayArray2[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static166.aFloatArrayArray2[arg0][local162] += Static166.aFloatArrayArray2[arg0][local162 - 1] * local102 + Static166.aFloatArrayArray2[arg0][local162 - 2] * local106;
			}
			Static166.aFloatArrayArray2[arg0][1] += Static166.aFloatArrayArray2[arg0][0] * local102 + local106;
			Static166.aFloatArrayArray2[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray278[0] * 2; local77++) {
				Static166.aFloatArrayArray2[0][local77] *= Static166.aFloat93;
			}
		}
		for (local77 = 0; local77 < this.anIntArray278[arg0] * 2; local77++) {
			Static166.anIntArrayArray19[arg0][local77] = (int) (Static166.aFloatArrayArray2[arg0][local77] * 65536.0F);
		}
		return this.anIntArray278[arg0] * 2;
	}
}
