import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class59 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "[I")
	private final int[] anIntArray236 = new int[2];

	@OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
	public final int[] anIntArray237 = new int[2];

	@OriginalMember(owner = "client!p", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8 = new int[2][2][4];

	@OriginalMember(owner = "client!p", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray9 = new int[2][2][4];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIF)F")
	private float method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray8[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray8[arg0][1][arg1] - this.anIntArrayArrayArray8[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IF)I")
	public int method1615(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray236[0] + (float) (this.anIntArray236[1] - this.anIntArray236[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static89.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static89.anInt2206 = (int) (Static89.aFloat1 * 65536.0F);
		}
		if (this.anIntArray237[arg0] == 0) {
			return 0;
		}
		local20 = this.method1614(arg0, 0, arg1);
		Static89.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1618(arg0, 0, arg1));
		Static89.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray237[arg0]; local77++) {
			local20 = this.method1614(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1618(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static89.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static89.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static89.aFloatArrayArray1[arg0][local77 * 2] = Static89.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static89.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static89.aFloatArrayArray1[arg0][local157] += Static89.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static89.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static89.aFloatArrayArray1[arg0][1] += Static89.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static89.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray237[0] * 2; local226++) {
				Static89.aFloatArrayArray1[0][local226] *= Static89.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray237[arg0] * 2; local226++) {
			Static89.anIntArrayArray17[arg0][local226] = (int) (Static89.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray237[arg0] * 2;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!s;Lclient!ha;)V")
	public void method1617(@OriginalArg(0) Class4_Sub16 arg0, @OriginalArg(1) Class33 arg1) {
		@Pc(3) int local3 = arg0.method1474();
		this.anIntArray237[0] = local3 >> 4;
		this.anIntArray237[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray236[0] = this.anIntArray236[1] = 0;
			return;
		}
		this.anIntArray236[0] = arg0.method1490();
		this.anIntArray236[1] = arg0.method1490();
		@Pc(37) int local37 = arg0.method1474();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray237[local39]; local42++) {
				this.anIntArrayArrayArray9[local39][0][local42] = arg0.method1490();
				this.anIntArrayArrayArray8[local39][0][local42] = arg0.method1490();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray237[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray9[local42][1][local81] = this.anIntArrayArrayArray9[local42][0][local81];
					this.anIntArrayArrayArray8[local42][1][local81] = this.anIntArrayArrayArray8[local42][0][local81];
				} else {
					this.anIntArrayArrayArray9[local42][1][local81] = arg0.method1490();
					this.anIntArrayArrayArray8[local42][1][local81] = arg0.method1490();
				}
			}
		}
		if (local37 != 0 || this.anIntArray236[1] != this.anIntArray236[0]) {
			arg1.method742(arg0);
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(IIF)F")
	private float method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray9[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray9[arg0][1][arg1] - this.anIntArrayArrayArray9[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static89.method1613(local34);
	}
}
