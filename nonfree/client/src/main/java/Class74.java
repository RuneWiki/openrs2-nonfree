import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class74 {

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
	public int[] anIntArray252 = new int[2];

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12 = new int[2][2][4];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "[I")
	private int[] anIntArray251 = new int[2];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IF)I")
	public int method1925(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray251[0] + (float) (this.anIntArray251[1] - this.anIntArray251[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static118.aFloat91 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static118.anInt2579 = (int) (Static118.aFloat91 * 65536.0F);
		}
		if (this.anIntArray252[arg0] == 0) {
			return 0;
		}
		local20 = this.method1930(arg0, 0, arg1);
		Static118.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1926(arg0, 0, arg1));
		Static118.aFloatArrayArray1[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray252[arg0]; local77++) {
			local20 = this.method1930(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method1926(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static118.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static118.aFloatArrayArray1[arg0][local77 * 2 - 1] * local106;
			Static118.aFloatArrayArray1[arg0][local77 * 2] = Static118.aFloatArrayArray1[arg0][local77 * 2 - 1] * local102 + Static118.aFloatArrayArray1[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static118.aFloatArrayArray1[arg0][local162] += Static118.aFloatArrayArray1[arg0][local162 - 1] * local102 + Static118.aFloatArrayArray1[arg0][local162 - 2] * local106;
			}
			Static118.aFloatArrayArray1[arg0][1] += Static118.aFloatArrayArray1[arg0][0] * local102 + local106;
			Static118.aFloatArrayArray1[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray252[0] * 2; local77++) {
				Static118.aFloatArrayArray1[0][local77] *= Static118.aFloat91;
			}
		}
		for (local77 = 0; local77 < this.anIntArray252[arg0] * 2; local77++) {
			Static118.anIntArrayArray17[arg0][local77] = (int) (Static118.aFloatArrayArray1[arg0][local77] * 65536.0F);
		}
		return this.anIntArray252[arg0] * 2;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIF)F")
	private float method1926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray12[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray12[arg0][1][arg1] - this.anIntArrayArrayArray12[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static118.method1928(local34);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!im;Lclient!wb;)V")
	public void method1929(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) Class175 arg1) {
		@Pc(3) int local3 = arg0.method2655();
		this.anIntArray252[0] = local3 >> 4;
		this.anIntArray252[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray251[0] = this.anIntArray251[1] = 0;
			return;
		}
		this.anIntArray251[0] = arg0.method2652();
		this.anIntArray251[1] = arg0.method2652();
		@Pc(37) int local37 = arg0.method2655();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray252[local39]; local44++) {
				this.anIntArrayArrayArray12[local39][0][local44] = arg0.method2652();
				this.anIntArrayArrayArray11[local39][0][local44] = arg0.method2652();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray252[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray12[local39][1][local44] = this.anIntArrayArrayArray12[local39][0][local44];
					this.anIntArrayArrayArray11[local39][1][local44] = this.anIntArrayArrayArray11[local39][0][local44];
				} else {
					this.anIntArrayArrayArray12[local39][1][local44] = arg0.method2652();
					this.anIntArrayArrayArray11[local39][1][local44] = arg0.method2652();
				}
			}
		}
		if (local37 != 0 || this.anIntArray251[1] != this.anIntArray251[0]) {
			arg1.method4735(arg0);
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIF)F")
	private float method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
