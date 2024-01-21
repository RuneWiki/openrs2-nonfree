import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class56 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
	public final int[] anIntArray303 = new int[2];

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
	private final int[] anIntArray304 = new int[2];

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IF)I")
	public int method1679(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray304[0] + (float) (this.anIntArray304[1] - this.anIntArray304[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static92.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static92.anInt2517 = (int) (Static92.aFloat1 * 65536.0F);
		}
		if (this.anIntArray303[arg0] == 0) {
			return 0;
		}
		local20 = this.method1682(arg0, 0, arg1);
		Static92.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1680(arg0, 0, arg1));
		Static92.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray303[arg0]; local77++) {
			local20 = this.method1682(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1680(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static92.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static92.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static92.aFloatArrayArray1[arg0][local77 * 2] = Static92.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static92.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static92.aFloatArrayArray1[arg0][local157] += Static92.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static92.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static92.aFloatArrayArray1[arg0][1] += Static92.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static92.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray303[0] * 2; local226++) {
				Static92.aFloatArrayArray1[0][local226] *= Static92.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray303[arg0] * 2; local226++) {
			Static92.anIntArrayArray25[arg0][local226] = (int) (Static92.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray303[arg0] * 2;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIF)F")
	private float method1680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static92.method1681(local34);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIF)F")
	private float method1682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!m;Lclient!f;)V")
	public void method1683(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(3) int local3 = arg0.method981();
		this.anIntArray303[0] = local3 >> 4;
		this.anIntArray303[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray304[0] = this.anIntArray304[1] = 0;
			return;
		}
		this.anIntArray304[0] = arg0.method974();
		this.anIntArray304[1] = arg0.method974();
		@Pc(37) int local37 = arg0.method981();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray303[local39]; local42++) {
				this.anIntArrayArrayArray3[local39][0][local42] = arg0.method974();
				this.anIntArrayArrayArray2[local39][0][local42] = arg0.method974();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray303[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray3[local42][1][local81] = this.anIntArrayArrayArray3[local42][0][local81];
					this.anIntArrayArrayArray2[local42][1][local81] = this.anIntArrayArrayArray2[local42][0][local81];
				} else {
					this.anIntArrayArrayArray3[local42][1][local81] = arg0.method974();
					this.anIntArrayArrayArray2[local42][1][local81] = arg0.method974();
				}
			}
		}
		if (local37 != 0 || this.anIntArray304[1] != this.anIntArray304[0]) {
			arg1.method612(arg0);
		}
	}
}
