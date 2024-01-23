import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class71 {

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
	private int[] anIntArray197 = new int[2];

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8 = new int[2][2][4];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "[I")
	public int[] anIntArray196 = new int[2];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ug;Lclient!dn;)V")
	public void method1692(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) Class38 arg1) {
		@Pc(3) int local3 = arg0.method3915();
		this.anIntArray196[0] = local3 >> 4;
		this.anIntArray196[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray197[0] = this.anIntArray197[1] = 0;
			return;
		}
		this.anIntArray197[0] = arg0.method3948();
		this.anIntArray197[1] = arg0.method3948();
		@Pc(37) int local37 = arg0.method3915();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray196[local39]; local44++) {
				this.anIntArrayArrayArray7[local39][0][local44] = arg0.method3948();
				this.anIntArrayArrayArray8[local39][0][local44] = arg0.method3948();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray196[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray7[local39][1][local44] = this.anIntArrayArrayArray7[local39][0][local44];
					this.anIntArrayArrayArray8[local39][1][local44] = this.anIntArrayArrayArray8[local39][0][local44];
				} else {
					this.anIntArrayArrayArray7[local39][1][local44] = arg0.method3948();
					this.anIntArrayArrayArray8[local39][1][local44] = arg0.method3948();
				}
			}
		}
		if (local37 != 0 || this.anIntArray197[1] != this.anIntArray197[0]) {
			arg1.method949(arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIF)F")
	private float method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static106.method1693(local34);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIF)F")
	private float method1696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray8[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray8[arg0][1][arg1] - this.anIntArrayArrayArray8[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IF)I")
	public int method1697(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray197[0] + (float) (this.anIntArray197[1] - this.anIntArray197[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static106.aFloat33 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static106.anInt1948 = (int) (Static106.aFloat33 * 65536.0F);
		}
		if (this.anIntArray196[arg0] == 0) {
			return 0;
		}
		local20 = this.method1696(arg0, 0, arg1);
		Static106.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1694(arg0, 0, arg1));
		Static106.aFloatArrayArray1[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray196[arg0]; local77++) {
			local20 = this.method1696(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method1694(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static106.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static106.aFloatArrayArray1[arg0][local77 * 2 - 1] * local106;
			Static106.aFloatArrayArray1[arg0][local77 * 2] = Static106.aFloatArrayArray1[arg0][local77 * 2 - 1] * local102 + Static106.aFloatArrayArray1[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static106.aFloatArrayArray1[arg0][local162] += Static106.aFloatArrayArray1[arg0][local162 - 1] * local102 + Static106.aFloatArrayArray1[arg0][local162 - 2] * local106;
			}
			Static106.aFloatArrayArray1[arg0][1] += Static106.aFloatArrayArray1[arg0][0] * local102 + local106;
			Static106.aFloatArrayArray1[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray196[0] * 2; local77++) {
				Static106.aFloatArrayArray1[0][local77] *= Static106.aFloat33;
			}
		}
		for (local77 = 0; local77 < this.anIntArray196[arg0] * 2; local77++) {
			Static106.anIntArrayArray25[arg0][local77] = (int) (Static106.aFloatArrayArray1[arg0][local77] * 65536.0F);
		}
		return this.anIntArray196[arg0] * 2;
	}
}
