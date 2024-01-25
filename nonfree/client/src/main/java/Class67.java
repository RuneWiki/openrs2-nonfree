import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class67 {

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "[I")
	private final int[] anIntArray74 = new int[2];

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "[I")
	public final int[] anIntArray73 = new int[2];

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIF)F")
	private float method1829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static85.method1833(local34);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IF)I")
	public int method1831(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray74[0] + (float) (this.anIntArray74[1] - this.anIntArray74[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static85.aFloat65 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static85.anInt2025 = (int) (Static85.aFloat65 * 65536.0F);
		}
		if (this.anIntArray73[arg0] == 0) {
			return 0;
		}
		local20 = this.method1834(arg0, 0, arg1);
		Static85.aFloatArrayArray4[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1829(arg0, 0, arg1));
		Static85.aFloatArrayArray4[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray73[arg0]; local77++) {
			local20 = this.method1834(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1829(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static85.aFloatArrayArray4[arg0][local77 * 2 + 1] = Static85.aFloatArrayArray4[arg0][local77 * 2 - 1] * local101;
			Static85.aFloatArrayArray4[arg0][local77 * 2] = Static85.aFloatArrayArray4[arg0][local77 * 2 - 1] * local97 + Static85.aFloatArrayArray4[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static85.aFloatArrayArray4[arg0][local157] += Static85.aFloatArrayArray4[arg0][local157 - 1] * local97 + Static85.aFloatArrayArray4[arg0][local157 - 2] * local101;
			}
			Static85.aFloatArrayArray4[arg0][1] += Static85.aFloatArrayArray4[arg0][0] * local97 + local101;
			Static85.aFloatArrayArray4[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray73[0] * 2; local226++) {
				Static85.aFloatArrayArray4[0][local226] *= Static85.aFloat65;
			}
		}
		for (local226 = 0; local226 < this.anIntArray73[arg0] * 2; local226++) {
			Static85.anIntArrayArray4[arg0][local226] = (int) (Static85.aFloatArrayArray4[arg0][local226] * 65536.0F);
		}
		return this.anIntArray73[arg0] * 2;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!mc;Lclient!nj;)V")
	public void method1832(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) Class251 arg1) {
		@Pc(3) int local3 = arg0.method7816();
		this.anIntArray73[0] = local3 >> 4;
		this.anIntArray73[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray74[0] = this.anIntArray74[1] = 0;
			return;
		}
		this.anIntArray74[0] = arg0.method7860();
		this.anIntArray74[1] = arg0.method7860();
		@Pc(37) int local37 = arg0.method7816();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray73[local39]; local42++) {
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method7860();
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method7860();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray73[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
				} else {
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method7860();
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method7860();
				}
			}
		}
		if (local37 != 0 || this.anIntArray74[1] != this.anIntArray74[0]) {
			arg1.method5861(arg0);
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IIF)F")
	private float method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
