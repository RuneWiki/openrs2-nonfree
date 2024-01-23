import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class74 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "[I")
	public int[] anIntArray221 = new int[2];

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "[I")
	private int[] anIntArray222 = new int[2];

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIF)F")
	private float method1898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!oe;Lclient!kl;)V")
	public void method1899(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) Class98 arg1) {
		@Pc(3) int local3 = arg0.method2146();
		this.anIntArray221[0] = local3 >> 4;
		this.anIntArray221[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray222[0] = this.anIntArray222[1] = 0;
			return;
		}
		this.anIntArray222[0] = arg0.method2130();
		this.anIntArray222[1] = arg0.method2130();
		@Pc(37) int local37 = arg0.method2146();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray221[local39]; local44++) {
				this.anIntArrayArrayArray5[local39][0][local44] = arg0.method2130();
				this.anIntArrayArrayArray6[local39][0][local44] = arg0.method2130();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray221[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray5[local39][1][local44] = this.anIntArrayArrayArray5[local39][0][local44];
					this.anIntArrayArrayArray6[local39][1][local44] = this.anIntArrayArrayArray6[local39][0][local44];
				} else {
					this.anIntArrayArrayArray5[local39][1][local44] = arg0.method2130();
					this.anIntArrayArrayArray6[local39][1][local44] = arg0.method2130();
				}
			}
		}
		if (local37 != 0 || this.anIntArray222[1] != this.anIntArray222[0]) {
			arg1.method2817(arg0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IF)I")
	public int method1901(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray222[0] + (float) (this.anIntArray222[1] - this.anIntArray222[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static112.aFloat12 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static112.anInt2525 = (int) (Static112.aFloat12 * 65536.0F);
		}
		if (this.anIntArray221[arg0] == 0) {
			return 0;
		}
		local20 = this.method1898(arg0, 0, arg1);
		Static112.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1902(arg0, 0, arg1));
		Static112.aFloatArrayArray1[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray221[arg0]; local77++) {
			local20 = this.method1898(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method1902(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static112.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static112.aFloatArrayArray1[arg0][local77 * 2 - 1] * local106;
			Static112.aFloatArrayArray1[arg0][local77 * 2] = Static112.aFloatArrayArray1[arg0][local77 * 2 - 1] * local102 + Static112.aFloatArrayArray1[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static112.aFloatArrayArray1[arg0][local162] += Static112.aFloatArrayArray1[arg0][local162 - 1] * local102 + Static112.aFloatArrayArray1[arg0][local162 - 2] * local106;
			}
			Static112.aFloatArrayArray1[arg0][1] += Static112.aFloatArrayArray1[arg0][0] * local102 + local106;
			Static112.aFloatArrayArray1[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray221[0] * 2; local77++) {
				Static112.aFloatArrayArray1[0][local77] *= Static112.aFloat12;
			}
		}
		for (local77 = 0; local77 < this.anIntArray221[arg0] * 2; local77++) {
			Static112.anIntArrayArray8[arg0][local77] = (int) (Static112.aFloatArrayArray1[arg0][local77] * 65536.0F);
		}
		return this.anIntArray221[arg0] * 2;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIF)F")
	private float method1902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static112.method1900(local34);
	}
}
