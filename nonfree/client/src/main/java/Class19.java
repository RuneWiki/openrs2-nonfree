import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class19 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "[I")
	public final int[] anIntArray112 = new int[2];

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
	private final int[] anIntArray111 = new int[2];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ba;Lclient!c;)V")
	public void method719(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) Class9 arg1) {
		@Pc(3) int local3 = arg0.method791();
		this.anIntArray112[0] = local3 >> 4;
		this.anIntArray112[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray111[0] = this.anIntArray111[1] = 0;
			return;
		}
		this.anIntArray111[0] = arg0.method792();
		this.anIntArray111[1] = arg0.method792();
		@Pc(37) int local37 = arg0.method791();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray112[local39]; local42++) {
				this.anIntArrayArrayArray4[local39][0][local42] = arg0.method792();
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method792();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray112[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray4[local42][1][local81] = this.anIntArrayArrayArray4[local42][0][local81];
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
				} else {
					this.anIntArrayArrayArray4[local42][1][local81] = arg0.method792();
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method792();
				}
			}
		}
		if (local37 != 0 || this.anIntArray111[1] != this.anIntArray111[0]) {
			arg1.method418(arg0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIF)F")
	private float method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IF)I")
	public int method722(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray111[0] + (float) (this.anIntArray111[1] - this.anIntArray111[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static26.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static26.anInt1029 = (int) (Static26.aFloat1 * 65536.0F);
		}
		if (this.anIntArray112[arg0] == 0) {
			return 0;
		}
		local20 = this.method721(arg0, 0, arg1);
		Static26.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method723(arg0, 0, arg1));
		Static26.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray112[arg0]; local77++) {
			local20 = this.method721(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method723(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static26.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static26.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static26.aFloatArrayArray1[arg0][local77 * 2] = Static26.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static26.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static26.aFloatArrayArray1[arg0][local157] += Static26.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static26.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static26.aFloatArrayArray1[arg0][1] += Static26.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static26.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray112[0] * 2; local226++) {
				Static26.aFloatArrayArray1[0][local226] *= Static26.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray112[arg0] * 2; local226++) {
			Static26.anIntArrayArray8[arg0][local226] = (int) (Static26.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray112[arg0] * 2;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(IIF)F")
	private float method723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray4[arg0][1][arg1] - this.anIntArrayArrayArray4[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static26.method724(local34);
	}
}
