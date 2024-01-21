import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class36 {

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "[I")
	public final int[] anIntArray247 = new int[2];

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "[I")
	private final int[] anIntArray246 = new int[2];

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!dc;Lclient!ne;)V")
	public void method990(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) Class59 arg1) {
		@Pc(3) int local3 = arg0.method672();
		this.anIntArray247[0] = local3 >> 4;
		this.anIntArray247[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray246[0] = this.anIntArray246[1] = 0;
			return;
		}
		this.anIntArray246[0] = arg0.method651();
		this.anIntArray246[1] = arg0.method651();
		@Pc(37) int local37 = arg0.method672();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray247[local39]; local42++) {
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method651();
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method651();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray247[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
				} else {
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method651();
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method651();
				}
			}
		}
		if (local37 != 0 || this.anIntArray246[1] != this.anIntArray246[0]) {
			arg1.method1388(arg0);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIF)F")
	private float method991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IF)I")
	public int method992(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray246[0] + (float) (this.anIntArray246[1] - this.anIntArray246[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static51.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static51.anInt1242 = (int) (Static51.aFloat1 * 65536.0F);
		}
		if (this.anIntArray247[arg0] == 0) {
			return 0;
		}
		local20 = this.method991(arg0, 0, arg1);
		Static51.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method994(arg0, 0, arg1));
		Static51.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray247[arg0]; local77++) {
			local20 = this.method991(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method994(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static51.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static51.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static51.aFloatArrayArray1[arg0][local77 * 2] = Static51.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static51.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static51.aFloatArrayArray1[arg0][local157] += Static51.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static51.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static51.aFloatArrayArray1[arg0][1] += Static51.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static51.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray247[0] * 2; local226++) {
				Static51.aFloatArrayArray1[0][local226] *= Static51.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray247[arg0] * 2; local226++) {
			Static51.anIntArrayArray13[arg0][local226] = (int) (Static51.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray247[arg0] * 2;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIF)F")
	private float method994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static51.method989(local34);
	}
}
