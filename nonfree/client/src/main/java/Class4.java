import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class4 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
	public int[] anIntArray23 = new int[2];

	@OriginalMember(owner = "client!af", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
	private int[] anIntArray22 = new int[2];

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIF)F")
	private float method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static7.method156(local34);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IIF)F")
	private float method152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IF)I")
	public int method153(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray22[0] + (float) (this.anIntArray22[1] - this.anIntArray22[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static7.aFloat8 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static7.anInt205 = (int) (Static7.aFloat8 * 65536.0F);
		}
		if (this.anIntArray23[arg0] == 0) {
			return 0;
		}
		local20 = this.method152(arg0, 0, arg1);
		Static7.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method151(arg0, 0, arg1));
		Static7.aFloatArrayArray1[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray23[arg0]; local77++) {
			local20 = this.method152(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method151(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static7.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static7.aFloatArrayArray1[arg0][local77 * 2 - 1] * local106;
			Static7.aFloatArrayArray1[arg0][local77 * 2] = Static7.aFloatArrayArray1[arg0][local77 * 2 - 1] * local102 + Static7.aFloatArrayArray1[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static7.aFloatArrayArray1[arg0][local162] += Static7.aFloatArrayArray1[arg0][local162 - 1] * local102 + Static7.aFloatArrayArray1[arg0][local162 - 2] * local106;
			}
			Static7.aFloatArrayArray1[arg0][1] += Static7.aFloatArrayArray1[arg0][0] * local102 + local106;
			Static7.aFloatArrayArray1[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray23[0] * 2; local77++) {
				Static7.aFloatArrayArray1[0][local77] *= Static7.aFloat8;
			}
		}
		for (local77 = 0; local77 < this.anIntArray23[arg0] * 2; local77++) {
			Static7.anIntArrayArray2[arg0][local77] = (int) (Static7.aFloatArrayArray1[arg0][local77] * 65536.0F);
		}
		return this.anIntArray23[arg0] * 2;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!jj;Lclient!hd;)V")
	public void method154(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(1) Class68 arg1) {
		@Pc(3) int local3 = arg0.method3122();
		this.anIntArray23[0] = local3 >> 4;
		this.anIntArray23[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray22[0] = this.anIntArray22[1] = 0;
			return;
		}
		this.anIntArray22[0] = arg0.method3107();
		this.anIntArray22[1] = arg0.method3107();
		@Pc(37) int local37 = arg0.method3122();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray23[local39]; local44++) {
				this.anIntArrayArrayArray2[local39][0][local44] = arg0.method3107();
				this.anIntArrayArrayArray1[local39][0][local44] = arg0.method3107();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray23[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray2[local39][1][local44] = this.anIntArrayArrayArray2[local39][0][local44];
					this.anIntArrayArrayArray1[local39][1][local44] = this.anIntArrayArrayArray1[local39][0][local44];
				} else {
					this.anIntArrayArrayArray2[local39][1][local44] = arg0.method3107();
					this.anIntArrayArrayArray1[local39][1][local44] = arg0.method3107();
				}
			}
		}
		if (local37 != 0 || this.anIntArray22[1] != this.anIntArray22[0]) {
			arg1.method1598(arg0);
		}
	}
}
