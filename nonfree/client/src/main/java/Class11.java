import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class11 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
	public final int[] anIntArray38 = new int[2];

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "[I")
	private final int[] anIntArray39 = new int[2];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!va;Lclient!jg;)V")
	public void method371(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) Class43 arg1) {
		@Pc(3) int local3 = arg0.method1461();
		this.anIntArray38[0] = local3 >> 4;
		this.anIntArray38[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray39[0] = this.anIntArray39[1] = 0;
			return;
		}
		this.anIntArray39[0] = arg0.method1456();
		this.anIntArray39[1] = arg0.method1456();
		@Pc(37) int local37 = arg0.method1461();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray38[local39]; local42++) {
				this.anIntArrayArrayArray2[local39][0][local42] = arg0.method1456();
				this.anIntArrayArrayArray1[local39][0][local42] = arg0.method1456();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray38[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray2[local42][1][local81] = this.anIntArrayArrayArray2[local42][0][local81];
					this.anIntArrayArrayArray1[local42][1][local81] = this.anIntArrayArrayArray1[local42][0][local81];
				} else {
					this.anIntArrayArrayArray2[local42][1][local81] = arg0.method1456();
					this.anIntArrayArrayArray1[local42][1][local81] = arg0.method1456();
				}
			}
		}
		if (local37 != 0 || this.anIntArray39[1] != this.anIntArray39[0]) {
			arg1.method1289(arg0);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIF)F")
	private float method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static23.method370(local34);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IIF)F")
	private float method374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IF)I")
	public int method375(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray39[0] + (float) (this.anIntArray39[1] - this.anIntArray39[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static23.aFloat1 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static23.anInt551 = (int) (Static23.aFloat1 * 65536.0F);
		}
		if (this.anIntArray38[arg0] == 0) {
			return 0;
		}
		local20 = this.method374(arg0, 0, arg1);
		Static23.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method373(arg0, 0, arg1));
		Static23.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray38[arg0]; local77++) {
			local20 = this.method374(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method373(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static23.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static23.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static23.aFloatArrayArray1[arg0][local77 * 2] = Static23.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static23.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static23.aFloatArrayArray1[arg0][local157] += Static23.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static23.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static23.aFloatArrayArray1[arg0][1] += Static23.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static23.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray38[0] * 2; local226++) {
				Static23.aFloatArrayArray1[0][local226] *= Static23.aFloat1;
			}
		}
		for (local226 = 0; local226 < this.anIntArray38[arg0] * 2; local226++) {
			Static23.anIntArrayArray6[arg0][local226] = (int) (Static23.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray38[arg0] * 2;
	}
}
