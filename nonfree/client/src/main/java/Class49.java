import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class49 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "[I")
	public int[] anIntArray163 = new int[2];

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "[I")
	private int[] anIntArray164 = new int[2];

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIF)F")
	private float method1210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!p;Lclient!pj;)V")
	public void method1211(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) Class133 arg1) {
		@Pc(3) int local3 = arg0.method1874();
		this.anIntArray163[0] = local3 >> 4;
		this.anIntArray163[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray164[0] = this.anIntArray164[1] = 0;
			return;
		}
		this.anIntArray164[0] = arg0.method1837();
		this.anIntArray164[1] = arg0.method1837();
		@Pc(37) int local37 = arg0.method1874();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray163[local39]; local44++) {
				this.anIntArrayArrayArray4[local39][0][local44] = arg0.method1837();
				this.anIntArrayArrayArray5[local39][0][local44] = arg0.method1837();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray163[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray4[local39][1][local44] = this.anIntArrayArrayArray4[local39][0][local44];
					this.anIntArrayArrayArray5[local39][1][local44] = this.anIntArrayArrayArray5[local39][0][local44];
				} else {
					this.anIntArrayArrayArray4[local39][1][local44] = arg0.method1837();
					this.anIntArrayArrayArray5[local39][1][local44] = arg0.method1837();
				}
			}
		}
		if (local37 != 0 || this.anIntArray164[1] != this.anIntArray164[0]) {
			arg1.method3264(arg0);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IF)I")
	public int method1212(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray164[0] + (float) (this.anIntArray164[1] - this.anIntArray164[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static78.aFloat12 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static78.anInt1507 = (int) (Static78.aFloat12 * 65536.0F);
		}
		if (this.anIntArray163[arg0] == 0) {
			return 0;
		}
		local20 = this.method1210(arg0, 0, arg1);
		Static78.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1213(arg0, 0, arg1));
		Static78.aFloatArrayArray1[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray163[arg0]; local77++) {
			local20 = this.method1210(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method1213(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static78.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static78.aFloatArrayArray1[arg0][local77 * 2 - 1] * local106;
			Static78.aFloatArrayArray1[arg0][local77 * 2] = Static78.aFloatArrayArray1[arg0][local77 * 2 - 1] * local102 + Static78.aFloatArrayArray1[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static78.aFloatArrayArray1[arg0][local162] += Static78.aFloatArrayArray1[arg0][local162 - 1] * local102 + Static78.aFloatArrayArray1[arg0][local162 - 2] * local106;
			}
			Static78.aFloatArrayArray1[arg0][1] += Static78.aFloatArrayArray1[arg0][0] * local102 + local106;
			Static78.aFloatArrayArray1[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray163[0] * 2; local77++) {
				Static78.aFloatArrayArray1[0][local77] *= Static78.aFloat12;
			}
		}
		for (local77 = 0; local77 < this.anIntArray163[arg0] * 2; local77++) {
			Static78.anIntArrayArray17[arg0][local77] = (int) (Static78.aFloatArrayArray1[arg0][local77] * 65536.0F);
		}
		return this.anIntArray163[arg0] * 2;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIF)F")
	private float method1213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray4[arg0][1][arg1] - this.anIntArrayArrayArray4[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static78.method1214(local34);
	}
}
