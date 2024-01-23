import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class92 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
	private int[] anIntArray278 = new int[2];

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9 = new int[2][2][4];

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "[I")
	public int[] anIntArray279 = new int[2];

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10 = new int[2][2][4];

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IF)I")
	public int method2806(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray278[0] + (float) (this.anIntArray278[1] - this.anIntArray278[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static159.aFloat33 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static159.anInt3788 = (int) (Static159.aFloat33 * 65536.0F);
		}
		if (this.anIntArray279[arg0] == 0) {
			return 0;
		}
		local20 = this.method2810(arg0, 0, arg1);
		Static159.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method2807(arg0, 0, arg1));
		Static159.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray279[arg0]; local77++) {
			local20 = this.method2810(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method2807(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static159.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static159.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static159.aFloatArrayArray1[arg0][local77 * 2] = Static159.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static159.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static159.aFloatArrayArray1[arg0][local157] += Static159.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static159.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static159.aFloatArrayArray1[arg0][1] += Static159.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static159.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray279[0] * 2; local226++) {
				Static159.aFloatArrayArray1[0][local226] *= Static159.aFloat33;
			}
		}
		for (local226 = 0; local226 < this.anIntArray279[arg0] * 2; local226++) {
			Static159.anIntArrayArray25[arg0][local226] = (int) (Static159.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray279[arg0] * 2;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIF)F")
	private float method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray9[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray9[arg0][1][arg1] - this.anIntArrayArrayArray9[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static159.method2808(local34);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ql;Lclient!mb;)V")
	public void method2809(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) Class84 arg1) {
		@Pc(3) int local3 = arg0.method1772();
		this.anIntArray279[0] = local3 >> 4;
		this.anIntArray279[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray278[0] = this.anIntArray278[1] = 0;
			return;
		}
		this.anIntArray278[0] = arg0.method1764();
		this.anIntArray278[1] = arg0.method1764();
		@Pc(37) int local37 = arg0.method1772();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray279[local39]; local42++) {
				this.anIntArrayArrayArray9[local39][0][local42] = arg0.method1764();
				this.anIntArrayArrayArray10[local39][0][local42] = arg0.method1764();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray279[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray9[local42][1][local81] = this.anIntArrayArrayArray9[local42][0][local81];
					this.anIntArrayArrayArray10[local42][1][local81] = this.anIntArrayArrayArray10[local42][0][local81];
				} else {
					this.anIntArrayArrayArray9[local42][1][local81] = arg0.method1764();
					this.anIntArrayArrayArray10[local42][1][local81] = arg0.method1764();
				}
			}
		}
		if (local37 != 0 || this.anIntArray278[1] != this.anIntArray278[0]) {
			arg1.method2579(arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIF)F")
	private float method2810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray10[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray10[arg0][1][arg1] - this.anIntArrayArrayArray10[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
