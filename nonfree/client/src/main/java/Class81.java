import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class81 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10 = new int[2][2][4];

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
	public int[] anIntArray654 = new int[2];

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11 = new int[2][2][4];

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
	private int[] anIntArray655 = new int[2];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!nh;Lclient!ff;)V")
	public void method3144(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) Class38 arg1) {
		@Pc(3) int local3 = arg0.method2122();
		this.anIntArray654[0] = local3 >> 4;
		this.anIntArray654[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray655[0] = this.anIntArray655[1] = 0;
			return;
		}
		this.anIntArray655[0] = arg0.method2095();
		this.anIntArray655[1] = arg0.method2095();
		@Pc(37) int local37 = arg0.method2122();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray654[local39]; local42++) {
				this.anIntArrayArrayArray10[local39][0][local42] = arg0.method2095();
				this.anIntArrayArrayArray11[local39][0][local42] = arg0.method2095();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray654[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray10[local42][1][local81] = this.anIntArrayArrayArray10[local42][0][local81];
					this.anIntArrayArrayArray11[local42][1][local81] = this.anIntArrayArrayArray11[local42][0][local81];
				} else {
					this.anIntArrayArrayArray10[local42][1][local81] = arg0.method2095();
					this.anIntArrayArrayArray11[local42][1][local81] = arg0.method2095();
				}
			}
		}
		if (local37 != 0 || this.anIntArray655[1] != this.anIntArray655[0]) {
			arg1.method976(arg0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IF)I")
	public int method3147(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray655[0] + (float) (this.anIntArray655[1] - this.anIntArray655[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static172.aFloat5 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static172.anInt3978 = (int) (Static172.aFloat5 * 65536.0F);
		}
		if (this.anIntArray654[arg0] == 0) {
			return 0;
		}
		local20 = this.method3148(arg0, 0, arg1);
		Static172.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method3149(arg0, 0, arg1));
		Static172.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray654[arg0]; local77++) {
			local20 = this.method3148(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method3149(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static172.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static172.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static172.aFloatArrayArray2[arg0][local77 * 2] = Static172.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static172.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static172.aFloatArrayArray2[arg0][local157] += Static172.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static172.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static172.aFloatArrayArray2[arg0][1] += Static172.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static172.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray654[0] * 2; local226++) {
				Static172.aFloatArrayArray2[0][local226] *= Static172.aFloat5;
			}
		}
		for (local226 = 0; local226 < this.anIntArray654[arg0] * 2; local226++) {
			Static172.anIntArrayArray37[arg0][local226] = (int) (Static172.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray654[arg0] * 2;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIF)F")
	private float method3148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray11[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray11[arg0][1][arg1] - this.anIntArrayArrayArray11[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IIF)F")
	private float method3149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray10[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray10[arg0][1][arg1] - this.anIntArrayArrayArray10[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static172.method3146(local34);
	}
}
