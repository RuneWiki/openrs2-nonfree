import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class118 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
	public int[] anIntArray344 = new int[2];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
	private int[] anIntArray343 = new int[2];

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12 = new int[2][2][4];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIF)F")
	private float method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray12[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray12[arg0][1][arg1] - this.anIntArrayArrayArray12[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIF)F")
	private float method3551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static214.method3555(local34);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IF)I")
	public int method3552(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray343[0] + (float) (this.anIntArray343[1] - this.anIntArray343[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static214.aFloat5 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static214.anInt4568 = (int) (Static214.aFloat5 * 65536.0F);
		}
		if (this.anIntArray344[arg0] == 0) {
			return 0;
		}
		local20 = this.method3550(arg0, 0, arg1);
		Static214.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method3551(arg0, 0, arg1));
		Static214.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray344[arg0]; local77++) {
			local20 = this.method3550(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method3551(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static214.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static214.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static214.aFloatArrayArray1[arg0][local77 * 2] = Static214.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static214.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static214.aFloatArrayArray1[arg0][local157] += Static214.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static214.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static214.aFloatArrayArray1[arg0][1] += Static214.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static214.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray344[0] * 2; local226++) {
				Static214.aFloatArrayArray1[0][local226] *= Static214.aFloat5;
			}
		}
		for (local226 = 0; local226 < this.anIntArray344[arg0] * 2; local226++) {
			Static214.anIntArrayArray37[arg0][local226] = (int) (Static214.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray344[arg0] * 2;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!k;Lclient!jd;)V")
	public void method3554(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(3) int local3 = arg0.method3793();
		this.anIntArray344[0] = local3 >> 4;
		this.anIntArray344[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray343[0] = this.anIntArray343[1] = 0;
			return;
		}
		this.anIntArray343[0] = arg0.method3805();
		this.anIntArray343[1] = arg0.method3805();
		@Pc(37) int local37 = arg0.method3793();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray344[local39]; local42++) {
				this.anIntArrayArrayArray11[local39][0][local42] = arg0.method3805();
				this.anIntArrayArrayArray12[local39][0][local42] = arg0.method3805();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray344[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray11[local42][1][local81] = this.anIntArrayArrayArray11[local42][0][local81];
					this.anIntArrayArrayArray12[local42][1][local81] = this.anIntArrayArrayArray12[local42][0][local81];
				} else {
					this.anIntArrayArrayArray11[local42][1][local81] = arg0.method3805();
					this.anIntArrayArrayArray12[local42][1][local81] = arg0.method3805();
				}
			}
		}
		if (local37 != 0 || this.anIntArray343[1] != this.anIntArray343[0]) {
			arg1.method1609(arg0);
		}
	}
}
