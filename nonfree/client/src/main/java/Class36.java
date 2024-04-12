import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class36 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!md", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[2][8];

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!md", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!md", name = "h", descriptor = "[I")
	public final int[] anIntArray335 = new int[2];

	@OriginalMember(owner = "client!md", name = "g", descriptor = "[I")
	private final int[] anIntArray334 = new int[2];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIF)F", line = 8)
	private float method1065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray4[arg0][1][arg1] - this.anIntArrayArrayArray4[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static59.method1067(local34);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!eb;Lclient!ie;)V", line = 27)
	public void method1066(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) Class26 arg1) {
		@Pc(3) int local3 = arg0.method1708();
		this.anIntArray335[0] = local3 >> 4;
		this.anIntArray335[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray334[0] = this.anIntArray334[1] = 0;
			return;
		}
		this.anIntArray334[0] = arg0.method1704();
		this.anIntArray334[1] = arg0.method1704();
		@Pc(37) int local37 = arg0.method1708();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray335[local39]; local42++) {
				this.anIntArrayArrayArray4[local39][0][local42] = arg0.method1704();
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method1704();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray335[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray4[local42][1][local81] = this.anIntArrayArrayArray4[local42][0][local81];
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
				} else {
					this.anIntArrayArrayArray4[local42][1][local81] = arg0.method1704();
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method1704();
				}
			}
		}
		if (local37 != 0 || this.anIntArray334[1] != this.anIntArray334[0]) {
			arg1.method798(arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IIF)F", line = 100)
	private float method1068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IF)I", line = 112)
	public int method1069(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray334[0] + (float) (this.anIntArray334[1] - this.anIntArray334[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static59.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static59.anInt1619 = (int) (Static59.aFloat1 * 65536.0F);
		}
		if (this.anIntArray335[arg0] == 0) {
			return 0;
		}
		local20 = this.method1068(arg0, 0, arg1);
		aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1065(arg0, 0, arg1));
		aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray335[arg0]; local77++) {
			local20 = this.method1068(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1065(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			aFloatArrayArray1[arg0][local77 * 2 + 1] = aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			aFloatArrayArray1[arg0][local77 * 2] = aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				aFloatArrayArray1[arg0][local157] += aFloatArrayArray1[arg0][local157 - 1] * local97 + aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local97 + local101;
			aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray335[0] * 2; local226++) {
				aFloatArrayArray1[0][local226] *= Static59.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray335[arg0] * 2; local226++) {
			anIntArrayArray12[arg0][local226] = (int) (aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray335[arg0] * 2;
	}
}
