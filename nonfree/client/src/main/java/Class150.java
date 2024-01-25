import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class150 {

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "[I")
	private final int[] anIntArray419 = new int[2];

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "[I")
	public final int[] anIntArray420 = new int[2];

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIF)F")
	private float method3367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static224.method3370(local34);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(IIF)F")
	private float method3368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!nn;Lclient!cs;)V")
	public void method3371(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(1) Class45 arg1) {
		@Pc(3) int local3 = arg0.method2502();
		this.anIntArray420[0] = local3 >> 4;
		this.anIntArray420[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray419[0] = this.anIntArray419[1] = 0;
			return;
		}
		this.anIntArray419[0] = arg0.method2485();
		this.anIntArray419[1] = arg0.method2485();
		@Pc(37) int local37 = arg0.method2502();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray420[local39]; local42++) {
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method2485();
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method2485();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray420[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
				} else {
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method2485();
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method2485();
				}
			}
		}
		if (local37 != 0 || this.anIntArray419[1] != this.anIntArray419[0]) {
			arg1.method1051(arg0);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IF)I")
	public int method3372(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray419[0] + (float) (this.anIntArray419[1] - this.anIntArray419[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static224.aFloat68 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static224.anInt4211 = (int) (Static224.aFloat68 * 65536.0F);
		}
		if (this.anIntArray420[arg0] == 0) {
			return 0;
		}
		local20 = this.method3368(arg0, 0, arg1);
		Static224.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method3367(arg0, 0, arg1));
		Static224.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray420[arg0]; local77++) {
			local20 = this.method3368(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method3367(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static224.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static224.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static224.aFloatArrayArray2[arg0][local77 * 2] = Static224.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static224.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static224.aFloatArrayArray2[arg0][local157] += Static224.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static224.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static224.aFloatArrayArray2[arg0][1] += Static224.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static224.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray420[0] * 2; local226++) {
				Static224.aFloatArrayArray2[0][local226] *= Static224.aFloat68;
			}
		}
		for (local226 = 0; local226 < this.anIntArray420[arg0] * 2; local226++) {
			Static224.anIntArrayArray40[arg0][local226] = (int) (Static224.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray420[arg0] * 2;
	}
}
