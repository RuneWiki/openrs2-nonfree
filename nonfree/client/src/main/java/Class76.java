import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class76 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "[I")
	public final int[] anIntArray364 = new int[2];

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "[I")
	private final int[] anIntArray365 = new int[2];

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!pa;Lclient!h;)V")
	public void method1909(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(1) Class31 arg1) {
		@Pc(3) int local3 = arg0.method1471();
		this.anIntArray364[0] = local3 >> 4;
		this.anIntArray364[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray365[0] = this.anIntArray365[1] = 0;
			return;
		}
		this.anIntArray365[0] = arg0.method1478();
		this.anIntArray365[1] = arg0.method1478();
		@Pc(37) int local37 = arg0.method1471();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray364[local39]; local42++) {
				this.anIntArrayArrayArray4[local39][0][local42] = arg0.method1478();
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method1478();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray364[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray4[local42][1][local81] = this.anIntArrayArrayArray4[local42][0][local81];
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
				} else {
					this.anIntArrayArrayArray4[local42][1][local81] = arg0.method1478();
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method1478();
				}
			}
		}
		if (local37 != 0 || this.anIntArray365[1] != this.anIntArray365[0]) {
			arg1.method782(arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IF)I")
	public int method1911(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray365[0] + (float) (this.anIntArray365[1] - this.anIntArray365[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static122.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static122.anInt3040 = (int) (Static122.aFloat1 * 65536.0F);
		}
		if (this.anIntArray364[arg0] == 0) {
			return 0;
		}
		local20 = this.method1913(arg0, 0, arg1);
		Static122.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1912(arg0, 0, arg1));
		Static122.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray364[arg0]; local77++) {
			local20 = this.method1913(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1912(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static122.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static122.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static122.aFloatArrayArray1[arg0][local77 * 2] = Static122.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static122.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static122.aFloatArrayArray1[arg0][local157] += Static122.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static122.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static122.aFloatArrayArray1[arg0][1] += Static122.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static122.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray364[0] * 2; local226++) {
				Static122.aFloatArrayArray1[0][local226] *= Static122.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray364[arg0] * 2; local226++) {
			Static122.anIntArrayArray23[arg0][local226] = (int) (Static122.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray364[arg0] * 2;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIF)F")
	private float method1912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray4[arg0][1][arg1] - this.anIntArrayArrayArray4[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static122.method1914(local34);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIF)F")
	private float method1913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
