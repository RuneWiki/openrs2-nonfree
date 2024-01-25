import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class128 {

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
	private final int[] anIntArray385 = new int[2];

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
	public final int[] anIntArray386 = new int[2];

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IF)I")
	public int method2653(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray385[0] + (float) (this.anIntArray385[1] - this.anIntArray385[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static184.aFloat20 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static184.anInt3255 = (int) (Static184.aFloat20 * 65536.0F);
		}
		if (this.anIntArray386[arg0] == 0) {
			return 0;
		}
		local20 = this.method2657(arg0, 0, arg1);
		Static184.aFloatArrayArray4[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method2654(arg0, 0, arg1));
		Static184.aFloatArrayArray4[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray386[arg0]; local77++) {
			local20 = this.method2657(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method2654(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static184.aFloatArrayArray4[arg0][local77 * 2 + 1] = Static184.aFloatArrayArray4[arg0][local77 * 2 - 1] * local101;
			Static184.aFloatArrayArray4[arg0][local77 * 2] = Static184.aFloatArrayArray4[arg0][local77 * 2 - 1] * local97 + Static184.aFloatArrayArray4[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static184.aFloatArrayArray4[arg0][local157] += Static184.aFloatArrayArray4[arg0][local157 - 1] * local97 + Static184.aFloatArrayArray4[arg0][local157 - 2] * local101;
			}
			Static184.aFloatArrayArray4[arg0][1] += Static184.aFloatArrayArray4[arg0][0] * local97 + local101;
			Static184.aFloatArrayArray4[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray386[0] * 2; local226++) {
				Static184.aFloatArrayArray4[0][local226] *= Static184.aFloat20;
			}
		}
		for (local226 = 0; local226 < this.anIntArray386[arg0] * 2; local226++) {
			Static184.anIntArrayArray36[arg0][local226] = (int) (Static184.aFloatArrayArray4[arg0][local226] * 65536.0F);
		}
		return this.anIntArray386[arg0] * 2;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIF)F")
	private float method2654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static184.method2658(local34);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!re;Lclient!sr;)V")
	public void method2656(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(1) Class217 arg1) {
		@Pc(3) int local3 = arg0.method5174();
		this.anIntArray386[0] = local3 >> 4;
		this.anIntArray386[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray385[0] = this.anIntArray385[1] = 0;
			return;
		}
		this.anIntArray385[0] = arg0.method5177();
		this.anIntArray385[1] = arg0.method5177();
		@Pc(37) int local37 = arg0.method5174();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray386[local39]; local42++) {
				this.anIntArrayArrayArray3[local39][0][local42] = arg0.method5177();
				this.anIntArrayArrayArray4[local39][0][local42] = arg0.method5177();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray386[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray3[local42][1][local81] = this.anIntArrayArrayArray3[local42][0][local81];
					this.anIntArrayArrayArray4[local42][1][local81] = this.anIntArrayArrayArray4[local42][0][local81];
				} else {
					this.anIntArrayArrayArray3[local42][1][local81] = arg0.method5177();
					this.anIntArrayArrayArray4[local42][1][local81] = arg0.method5177();
				}
			}
		}
		if (local37 != 0 || this.anIntArray385[1] != this.anIntArray385[0]) {
			arg1.method4765(arg0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIF)F")
	private float method2657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray4[arg0][1][arg1] - this.anIntArrayArrayArray4[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
