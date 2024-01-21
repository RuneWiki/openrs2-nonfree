import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class43 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
	private final int[] anIntArray284 = new int[2];

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!le", name = "h", descriptor = "[I")
	public final int[] anIntArray285 = new int[2];

	@OriginalMember(owner = "client!le", name = "f", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIF)F")
	private float method1262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static65.method1267(local34);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IF)I")
	public int method1263(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray284[0] + (float) (this.anIntArray284[1] - this.anIntArray284[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static65.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static65.anInt1857 = (int) (Static65.aFloat1 * 65536.0F);
		}
		if (this.anIntArray285[arg0] == 0) {
			return 0;
		}
		local20 = this.method1264(arg0, 0, arg1);
		Static65.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1262(arg0, 0, arg1));
		Static65.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray285[arg0]; local77++) {
			local20 = this.method1264(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1262(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static65.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static65.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static65.aFloatArrayArray2[arg0][local77 * 2] = Static65.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static65.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static65.aFloatArrayArray2[arg0][local157] += Static65.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static65.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static65.aFloatArrayArray2[arg0][1] += Static65.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static65.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray285[0] * 2; local226++) {
				Static65.aFloatArrayArray2[0][local226] *= Static65.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray285[arg0] * 2; local226++) {
			Static65.anIntArrayArray20[arg0][local226] = (int) (Static65.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray285[arg0] * 2;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIF)F")
	private float method1264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!hb;Lclient!gb;)V")
	public void method1265(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(1) Class27 arg1) {
		@Pc(3) int local3 = arg0.method1408();
		this.anIntArray285[0] = local3 >> 4;
		this.anIntArray285[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray284[0] = this.anIntArray284[1] = 0;
			return;
		}
		this.anIntArray284[0] = arg0.method1418();
		this.anIntArray284[1] = arg0.method1418();
		@Pc(37) int local37 = arg0.method1408();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray285[local39]; local42++) {
				this.anIntArrayArrayArray6[local39][0][local42] = arg0.method1418();
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method1418();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray285[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray6[local42][1][local81] = this.anIntArrayArrayArray6[local42][0][local81];
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
				} else {
					this.anIntArrayArrayArray6[local42][1][local81] = arg0.method1418();
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method1418();
				}
			}
		}
		if (local37 != 0 || this.anIntArray284[1] != this.anIntArray284[0]) {
			arg1.method692(arg0);
		}
	}
}
