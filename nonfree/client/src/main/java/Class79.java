import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class79 {

	@OriginalMember(owner = "client!va", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!va", name = "f", descriptor = "[I")
	public final int[] anIntArray388 = new int[2];

	@OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
	private final int[] anIntArray389 = new int[2];

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIF)F")
	private float method1821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(IIF)F")
	private float method1822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static122.method1819(local34);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ic;Lclient!gb;)V")
	public void method1823(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(1) Class27 arg1) {
		@Pc(3) int local3 = arg0.method1514();
		this.anIntArray388[0] = local3 >> 4;
		this.anIntArray388[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray389[0] = this.anIntArray389[1] = 0;
			return;
		}
		this.anIntArray389[0] = arg0.method1517();
		this.anIntArray389[1] = arg0.method1517();
		@Pc(37) int local37 = arg0.method1514();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray388[local39]; local42++) {
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method1517();
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method1517();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray388[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
				} else {
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method1517();
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method1517();
				}
			}
		}
		if (local37 != 0 || this.anIntArray389[1] != this.anIntArray389[0]) {
			arg1.method659(arg0);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IF)I")
	public int method1824(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray389[0] + (float) (this.anIntArray389[1] - this.anIntArray389[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static122.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static122.anInt2628 = (int) (Static122.aFloat1 * 65536.0F);
		}
		if (this.anIntArray388[arg0] == 0) {
			return 0;
		}
		local20 = this.method1821(arg0, 0, arg1);
		Static122.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1822(arg0, 0, arg1));
		Static122.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray388[arg0]; local77++) {
			local20 = this.method1821(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1822(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static122.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static122.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static122.aFloatArrayArray2[arg0][local77 * 2] = Static122.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static122.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static122.aFloatArrayArray2[arg0][local157] += Static122.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static122.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static122.aFloatArrayArray2[arg0][1] += Static122.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static122.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray388[0] * 2; local226++) {
				Static122.aFloatArrayArray2[0][local226] *= Static122.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray388[arg0] * 2; local226++) {
			Static122.anIntArrayArray29[arg0][local226] = (int) (Static122.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray388[arg0] * 2;
	}
}
