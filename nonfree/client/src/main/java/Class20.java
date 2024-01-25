import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class20 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "[I")
	private final int[] anIntArray27 = new int[2];

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "[I")
	public final int[] anIntArray28 = new int[2];

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIF)F")
	private float method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static25.method500(local34);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!iv;Lclient!ej;)V")
	public void method497(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) Class61 arg1) {
		@Pc(3) int local3 = arg0.method2490();
		this.anIntArray28[0] = local3 >> 4;
		this.anIntArray28[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray27[0] = this.anIntArray27[1] = 0;
			return;
		}
		this.anIntArray27[0] = arg0.method2536();
		this.anIntArray27[1] = arg0.method2536();
		@Pc(37) int local37 = arg0.method2490();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray28[local39]; local42++) {
				this.anIntArrayArrayArray2[local39][0][local42] = arg0.method2536();
				this.anIntArrayArrayArray1[local39][0][local42] = arg0.method2536();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray28[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray2[local42][1][local81] = this.anIntArrayArrayArray2[local42][0][local81];
					this.anIntArrayArrayArray1[local42][1][local81] = this.anIntArrayArrayArray1[local42][0][local81];
				} else {
					this.anIntArrayArrayArray2[local42][1][local81] = arg0.method2536();
					this.anIntArrayArrayArray1[local42][1][local81] = arg0.method2536();
				}
			}
		}
		if (local37 != 0 || this.anIntArray27[1] != this.anIntArray27[0]) {
			arg1.method1605(arg0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IF)I")
	public int method498(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray27[0] + (float) (this.anIntArray27[1] - this.anIntArray27[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static25.aFloat14 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static25.anInt432 = (int) (Static25.aFloat14 * 65536.0F);
		}
		if (this.anIntArray28[arg0] == 0) {
			return 0;
		}
		local20 = this.method499(arg0, 0, arg1);
		Static25.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method496(arg0, 0, arg1));
		Static25.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray28[arg0]; local77++) {
			local20 = this.method499(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method496(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static25.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static25.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static25.aFloatArrayArray1[arg0][local77 * 2] = Static25.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static25.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static25.aFloatArrayArray1[arg0][local157] += Static25.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static25.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static25.aFloatArrayArray1[arg0][1] += Static25.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static25.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray28[0] * 2; local226++) {
				Static25.aFloatArrayArray1[0][local226] *= Static25.aFloat14;
			}
		}
		for (local226 = 0; local226 < this.anIntArray28[arg0] * 2; local226++) {
			Static25.anIntArrayArray3[arg0][local226] = (int) (Static25.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray28[arg0] * 2;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(IIF)F")
	private float method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
