import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class231 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray14 = new int[2][2][4];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "[I")
	public final int[] anIntArray1181 = new int[2];

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray15 = new int[2][2][4];

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "[I")
	private final int[] anIntArray1182 = new int[2];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIF)F")
	private float method5022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray14[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray14[arg0][1][arg1] - this.anIntArrayArrayArray14[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!kk;Lclient!jh;)V")
	public void method5023(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) Class121 arg1) {
		@Pc(3) int local3 = arg0.method5350();
		this.anIntArray1181[0] = local3 >> 4;
		this.anIntArray1181[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray1182[0] = this.anIntArray1182[1] = 0;
			return;
		}
		this.anIntArray1182[0] = arg0.method5312();
		this.anIntArray1182[1] = arg0.method5312();
		@Pc(37) int local37 = arg0.method5350();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray1181[local39]; local42++) {
				this.anIntArrayArrayArray15[local39][0][local42] = arg0.method5312();
				this.anIntArrayArrayArray14[local39][0][local42] = arg0.method5312();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray1181[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray15[local42][1][local81] = this.anIntArrayArrayArray15[local42][0][local81];
					this.anIntArrayArrayArray14[local42][1][local81] = this.anIntArrayArrayArray14[local42][0][local81];
				} else {
					this.anIntArrayArrayArray15[local42][1][local81] = arg0.method5312();
					this.anIntArrayArrayArray14[local42][1][local81] = arg0.method5312();
				}
			}
		}
		if (local37 != 0 || this.anIntArray1182[1] != this.anIntArray1182[0]) {
			arg1.method2874(arg0);
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(IIF)F")
	private float method5025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray15[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray15[arg0][1][arg1] - this.anIntArrayArrayArray15[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static346.method5024(local34);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IF)I")
	public int method5026(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray1182[0] + (float) (this.anIntArray1182[1] - this.anIntArray1182[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static346.aFloat75 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static346.anInt5846 = (int) (Static346.aFloat75 * 65536.0F);
		}
		if (this.anIntArray1181[arg0] == 0) {
			return 0;
		}
		local20 = this.method5022(arg0, 0, arg1);
		Static346.aFloatArrayArray8[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method5025(arg0, 0, arg1));
		Static346.aFloatArrayArray8[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray1181[arg0]; local77++) {
			local20 = this.method5022(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method5025(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static346.aFloatArrayArray8[arg0][local77 * 2 + 1] = Static346.aFloatArrayArray8[arg0][local77 * 2 - 1] * local101;
			Static346.aFloatArrayArray8[arg0][local77 * 2] = Static346.aFloatArrayArray8[arg0][local77 * 2 - 1] * local97 + Static346.aFloatArrayArray8[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static346.aFloatArrayArray8[arg0][local157] += Static346.aFloatArrayArray8[arg0][local157 - 1] * local97 + Static346.aFloatArrayArray8[arg0][local157 - 2] * local101;
			}
			Static346.aFloatArrayArray8[arg0][1] += Static346.aFloatArrayArray8[arg0][0] * local97 + local101;
			Static346.aFloatArrayArray8[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray1181[0] * 2; local226++) {
				Static346.aFloatArrayArray8[0][local226] *= Static346.aFloat75;
			}
		}
		for (local226 = 0; local226 < this.anIntArray1181[arg0] * 2; local226++) {
			Static346.anIntArrayArray50[arg0][local226] = (int) (Static346.aFloatArrayArray8[arg0][local226] * 65536.0F);
		}
		return this.anIntArray1181[arg0] * 2;
	}
}
