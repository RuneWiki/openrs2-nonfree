import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class55 {

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
	public int[] anIntArray156 = new int[2];

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "[I")
	private int[] anIntArray157 = new int[2];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIF)F")
	private float method1628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static89.method1630(local34);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IF)I")
	public int method1629(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray157[0] + (float) (this.anIntArray157[1] - this.anIntArray157[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static89.aFloat58 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static89.anInt1730 = (int) (Static89.aFloat58 * 65536.0F);
		}
		if (this.anIntArray156[arg0] == 0) {
			return 0;
		}
		local20 = this.method1633(arg0, 0, arg1);
		Static89.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1628(arg0, 0, arg1));
		Static89.aFloatArrayArray1[arg0][1] = local20 * local20;
		@Pc(77) int local77;
		for (local77 = 1; local77 < this.anIntArray156[arg0]; local77++) {
			local20 = this.method1633(arg0, local77, arg1);
			@Pc(102) float local102 = -2.0F * local20 * (float) Math.cos((double) this.method1628(arg0, local77, arg1));
			@Pc(106) float local106 = local20 * local20;
			Static89.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static89.aFloatArrayArray1[arg0][local77 * 2 - 1] * local106;
			Static89.aFloatArrayArray1[arg0][local77 * 2] = Static89.aFloatArrayArray1[arg0][local77 * 2 - 1] * local102 + Static89.aFloatArrayArray1[arg0][local77 * 2 - 2] * local106;
			for (@Pc(162) int local162 = local77 * 2 - 1; local162 >= 2; local162--) {
				Static89.aFloatArrayArray1[arg0][local162] += Static89.aFloatArrayArray1[arg0][local162 - 1] * local102 + Static89.aFloatArrayArray1[arg0][local162 - 2] * local106;
			}
			Static89.aFloatArrayArray1[arg0][1] += Static89.aFloatArrayArray1[arg0][0] * local102 + local106;
			Static89.aFloatArrayArray1[arg0][0] += local102;
		}
		if (arg0 == 0) {
			for (local77 = 0; local77 < this.anIntArray156[0] * 2; local77++) {
				Static89.aFloatArrayArray1[0][local77] *= Static89.aFloat58;
			}
		}
		for (local77 = 0; local77 < this.anIntArray156[arg0] * 2; local77++) {
			Static89.anIntArrayArray16[arg0][local77] = (int) (Static89.aFloatArrayArray1[arg0][local77] * 65536.0F);
		}
		return this.anIntArray156[arg0] * 2;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!lf;Lclient!sh;)V")
	public void method1631(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) Class162 arg1) {
		@Pc(3) int local3 = arg0.method1378();
		this.anIntArray156[0] = local3 >> 4;
		this.anIntArray156[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray157[0] = this.anIntArray157[1] = 0;
			return;
		}
		this.anIntArray157[0] = arg0.method1386();
		this.anIntArray157[1] = arg0.method1386();
		@Pc(37) int local37 = arg0.method1378();
		@Pc(39) int local39;
		@Pc(44) int local44;
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray156[local39]; local44++) {
				this.anIntArrayArrayArray3[local39][0][local44] = arg0.method1386();
				this.anIntArrayArrayArray4[local39][0][local44] = arg0.method1386();
			}
		}
		for (local39 = 0; local39 < 2; local39++) {
			for (local44 = 0; local44 < this.anIntArray156[local39]; local44++) {
				if ((local37 & 0x1 << local39 * 4 << local44) == 0) {
					this.anIntArrayArrayArray3[local39][1][local44] = this.anIntArrayArrayArray3[local39][0][local44];
					this.anIntArrayArrayArray4[local39][1][local44] = this.anIntArrayArrayArray4[local39][0][local44];
				} else {
					this.anIntArrayArrayArray3[local39][1][local44] = arg0.method1386();
					this.anIntArrayArrayArray4[local39][1][local44] = arg0.method1386();
				}
			}
		}
		if (local37 != 0 || this.anIntArray157[1] != this.anIntArray157[0]) {
			arg1.method4058(arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIF)F")
	private float method1633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray4[arg0][1][arg1] - this.anIntArrayArrayArray4[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
