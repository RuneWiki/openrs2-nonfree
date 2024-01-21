import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class68 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!re", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!re", name = "e", descriptor = "[I")
	private final int[] anIntArray322 = new int[2];

	@OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
	public final int[] anIntArray323 = new int[2];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!of;Lclient!de;)V")
	public void method1713(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) Class16 arg1) {
		@Pc(3) int local3 = arg0.method2072();
		this.anIntArray323[0] = local3 >> 4;
		this.anIntArray323[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray322[0] = this.anIntArray322[1] = 0;
			return;
		}
		this.anIntArray322[0] = arg0.method2051();
		this.anIntArray322[1] = arg0.method2051();
		@Pc(37) int local37 = arg0.method2072();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray323[local39]; local42++) {
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method2051();
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method2051();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray323[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
				} else {
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method2051();
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method2051();
				}
			}
		}
		if (local37 != 0 || this.anIntArray322[1] != this.anIntArray322[0]) {
			arg1.method494(arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IF)I")
	public int method1715(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray322[0] + (float) (this.anIntArray322[1] - this.anIntArray322[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static104.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static104.anInt2588 = (int) (Static104.aFloat1 * 65536.0F);
		}
		if (this.anIntArray323[arg0] == 0) {
			return 0;
		}
		local20 = this.method1716(arg0, 0, arg1);
		Static104.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1717(arg0, 0, arg1));
		Static104.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray323[arg0]; local77++) {
			local20 = this.method1716(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1717(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static104.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static104.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static104.aFloatArrayArray2[arg0][local77 * 2] = Static104.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static104.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static104.aFloatArrayArray2[arg0][local157] += Static104.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static104.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static104.aFloatArrayArray2[arg0][1] += Static104.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static104.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray323[0] * 2; local226++) {
				Static104.aFloatArrayArray2[0][local226] *= Static104.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray323[arg0] * 2; local226++) {
			Static104.anIntArrayArray27[arg0][local226] = (int) (Static104.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray323[arg0] * 2;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIF)F")
	private float method1716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIF)F")
	private float method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static104.method1718(local34);
	}
}
