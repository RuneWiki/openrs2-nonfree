import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class74 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "[I")
	public final int[] anIntArray121 = new int[2];

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
	private final int[] anIntArray122 = new int[2];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIF)F")
	private float method2199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIF)F")
	private float method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray4[arg0][1][arg1] - this.anIntArrayArrayArray4[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static103.method2197(local34);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!fd;Lclient!ck;)V")
	public void method2201(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) Class49 arg1) {
		@Pc(3) int local3 = arg0.method6538();
		this.anIntArray121[0] = local3 >> 4;
		this.anIntArray121[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray122[0] = this.anIntArray122[1] = 0;
			return;
		}
		this.anIntArray122[0] = arg0.method6535();
		this.anIntArray122[1] = arg0.method6535();
		@Pc(37) int local37 = arg0.method6538();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray121[local39]; local42++) {
				this.anIntArrayArrayArray4[local39][0][local42] = arg0.method6535();
				this.anIntArrayArrayArray3[local39][0][local42] = arg0.method6535();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray121[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray4[local42][1][local81] = this.anIntArrayArrayArray4[local42][0][local81];
					this.anIntArrayArrayArray3[local42][1][local81] = this.anIntArrayArrayArray3[local42][0][local81];
				} else {
					this.anIntArrayArrayArray4[local42][1][local81] = arg0.method6535();
					this.anIntArrayArrayArray3[local42][1][local81] = arg0.method6535();
				}
			}
		}
		if (local37 != 0 || this.anIntArray122[1] != this.anIntArray122[0]) {
			arg1.method1653(arg0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IF)I")
	public int method2202(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray122[0] + (float) (this.anIntArray122[1] - this.anIntArray122[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static103.aFloat26 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static103.anInt2484 = (int) (Static103.aFloat26 * 65536.0F);
		}
		if (this.anIntArray121[arg0] == 0) {
			return 0;
		}
		local20 = this.method2199(arg0, 0, arg1);
		Static103.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method2200(arg0, 0, arg1));
		Static103.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray121[arg0]; local77++) {
			local20 = this.method2199(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method2200(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static103.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static103.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static103.aFloatArrayArray2[arg0][local77 * 2] = Static103.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static103.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static103.aFloatArrayArray2[arg0][local157] += Static103.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static103.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static103.aFloatArrayArray2[arg0][1] += Static103.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static103.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray121[0] * 2; local226++) {
				Static103.aFloatArrayArray2[0][local226] *= Static103.aFloat26;
			}
		}
		for (local226 = 0; local226 < this.anIntArray121[arg0] * 2; local226++) {
			Static103.anIntArrayArray21[arg0][local226] = (int) (Static103.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray121[arg0] * 2;
	}
}
