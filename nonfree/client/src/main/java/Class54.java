import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class54 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
	private final int[] anIntArray113 = new int[2];

	@OriginalMember(owner = "client!de", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!de", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8 = new int[2][2][4];

	@OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
	public final int[] anIntArray112 = new int[2];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!rp;Lclient!ub;)V")
	public void method1071(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) Class228 arg1) {
		@Pc(3) int local3 = arg0.method2739();
		this.anIntArray112[0] = local3 >> 4;
		this.anIntArray112[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray113[0] = this.anIntArray113[1] = 0;
			return;
		}
		this.anIntArray113[0] = arg0.method2767();
		this.anIntArray113[1] = arg0.method2767();
		@Pc(37) int local37 = arg0.method2739();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray112[local39]; local42++) {
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method2767();
				this.anIntArrayArrayArray8[local39][0][local42] = arg0.method2767();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray112[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
					this.anIntArrayArrayArray8[local42][1][local81] = this.anIntArrayArrayArray8[local42][0][local81];
				} else {
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method2767();
					this.anIntArrayArrayArray8[local42][1][local81] = arg0.method2767();
				}
			}
		}
		if (local37 != 0 || this.anIntArray113[1] != this.anIntArray113[0]) {
			arg1.method5216(arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIF)F")
	private float method1073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static60.method1072(local34);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IIF)F")
	private float method1074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray8[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray8[arg0][1][arg1] - this.anIntArrayArrayArray8[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IF)I")
	public int method1075(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray113[0] + (float) (this.anIntArray113[1] - this.anIntArray113[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static60.aFloat9 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static60.anInt1247 = (int) (Static60.aFloat9 * 65536.0F);
		}
		if (this.anIntArray112[arg0] == 0) {
			return 0;
		}
		local20 = this.method1074(arg0, 0, arg1);
		Static60.aFloatArrayArray4[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1073(arg0, 0, arg1));
		Static60.aFloatArrayArray4[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray112[arg0]; local77++) {
			local20 = this.method1074(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1073(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static60.aFloatArrayArray4[arg0][local77 * 2 + 1] = Static60.aFloatArrayArray4[arg0][local77 * 2 - 1] * local101;
			Static60.aFloatArrayArray4[arg0][local77 * 2] = Static60.aFloatArrayArray4[arg0][local77 * 2 - 1] * local97 + Static60.aFloatArrayArray4[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static60.aFloatArrayArray4[arg0][local157] += Static60.aFloatArrayArray4[arg0][local157 - 1] * local97 + Static60.aFloatArrayArray4[arg0][local157 - 2] * local101;
			}
			Static60.aFloatArrayArray4[arg0][1] += Static60.aFloatArrayArray4[arg0][0] * local97 + local101;
			Static60.aFloatArrayArray4[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray112[0] * 2; local226++) {
				Static60.aFloatArrayArray4[0][local226] *= Static60.aFloat9;
			}
		}
		for (local226 = 0; local226 < this.anIntArray112[arg0] * 2; local226++) {
			Static60.anIntArrayArray11[arg0][local226] = (int) (Static60.aFloatArrayArray4[arg0][local226] * 65536.0F);
		}
		return this.anIntArray112[arg0] * 2;
	}
}
