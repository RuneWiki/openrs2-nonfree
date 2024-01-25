import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class138 {

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "[I")
	private final int[] anIntArray237 = new int[2];

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "[I")
	public final int[] anIntArray236 = new int[2];

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!gk;Lclient!iea;)V")
	public void method2419(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) Class156 arg1) {
		@Pc(3) int local3 = arg0.method4464();
		this.anIntArray236[0] = local3 >> 4;
		this.anIntArray236[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray237[0] = this.anIntArray237[1] = 0;
			return;
		}
		this.anIntArray237[0] = arg0.method4518();
		this.anIntArray237[1] = arg0.method4518();
		@Pc(37) int local37 = arg0.method4464();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray236[local39]; local42++) {
				this.anIntArrayArrayArray4[local39][0][local42] = arg0.method4518();
				this.anIntArrayArrayArray5[local39][0][local42] = arg0.method4518();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray236[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray4[local42][1][local81] = this.anIntArrayArrayArray4[local42][0][local81];
					this.anIntArrayArrayArray5[local42][1][local81] = this.anIntArrayArrayArray5[local42][0][local81];
				} else {
					this.anIntArrayArrayArray4[local42][1][local81] = arg0.method4518();
					this.anIntArrayArrayArray5[local42][1][local81] = arg0.method4518();
				}
			}
		}
		if (local37 != 0 || this.anIntArray237[1] != this.anIntArray237[0]) {
			arg1.method2751(arg0);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIF)F")
	private float method2420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IF)I")
	public int method2421(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray237[0] + (float) (this.anIntArray237[1] - this.anIntArray237[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static192.aFloat65 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static192.anInt2810 = (int) (Static192.aFloat65 * 65536.0F);
		}
		if (this.anIntArray236[arg0] == 0) {
			return 0;
		}
		local20 = this.method2420(arg0, 0, arg1);
		Static192.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method2422(arg0, 0, arg1));
		Static192.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray236[arg0]; local77++) {
			local20 = this.method2420(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method2422(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static192.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static192.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static192.aFloatArrayArray1[arg0][local77 * 2] = Static192.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static192.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static192.aFloatArrayArray1[arg0][local157] += Static192.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static192.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static192.aFloatArrayArray1[arg0][1] += Static192.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static192.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray236[0] * 2; local226++) {
				Static192.aFloatArrayArray1[0][local226] *= Static192.aFloat65;
			}
		}
		for (local226 = 0; local226 < this.anIntArray236[arg0] * 2; local226++) {
			Static192.anIntArrayArray33[arg0][local226] = (int) (Static192.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray236[arg0] * 2;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(IIF)F")
	private float method2422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray4[arg0][1][arg1] - this.anIntArrayArrayArray4[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static192.method2418(local34);
	}
}
