import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class87 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8 = new int[2][2][4];

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "[I")
	public final int[] anIntArray149 = new int[2];

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "[I")
	private final int[] anIntArray150 = new int[2];

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIF)F")
	private float method1654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray8[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray8[arg0][1][arg1] - this.anIntArrayArrayArray8[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IF)I")
	public int method1655(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray150[0] + (float) (this.anIntArray150[1] - this.anIntArray150[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static109.aFloat13 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static109.anInt2046 = (int) (Static109.aFloat13 * 65536.0F);
		}
		if (this.anIntArray149[arg0] == 0) {
			return 0;
		}
		local20 = this.method1654(arg0, 0, arg1);
		Static109.aFloatArrayArray5[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1659(arg0, 0, arg1));
		Static109.aFloatArrayArray5[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray149[arg0]; local77++) {
			local20 = this.method1654(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1659(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static109.aFloatArrayArray5[arg0][local77 * 2 + 1] = Static109.aFloatArrayArray5[arg0][local77 * 2 - 1] * local101;
			Static109.aFloatArrayArray5[arg0][local77 * 2] = Static109.aFloatArrayArray5[arg0][local77 * 2 - 1] * local97 + Static109.aFloatArrayArray5[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static109.aFloatArrayArray5[arg0][local157] += Static109.aFloatArrayArray5[arg0][local157 - 1] * local97 + Static109.aFloatArrayArray5[arg0][local157 - 2] * local101;
			}
			Static109.aFloatArrayArray5[arg0][1] += Static109.aFloatArrayArray5[arg0][0] * local97 + local101;
			Static109.aFloatArrayArray5[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray149[0] * 2; local226++) {
				Static109.aFloatArrayArray5[0][local226] *= Static109.aFloat13;
			}
		}
		for (local226 = 0; local226 < this.anIntArray149[arg0] * 2; local226++) {
			Static109.anIntArrayArray17[arg0][local226] = (int) (Static109.aFloatArrayArray5[arg0][local226] * 65536.0F);
		}
		return this.anIntArray149[arg0] * 2;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!kh;Lclient!pd;)V")
	public void method1657(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(1) Class154 arg1) {
		@Pc(3) int local3 = arg0.method5185();
		this.anIntArray149[0] = local3 >> 4;
		this.anIntArray149[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray150[0] = this.anIntArray150[1] = 0;
			return;
		}
		this.anIntArray150[0] = arg0.method5187();
		this.anIntArray150[1] = arg0.method5187();
		@Pc(37) int local37 = arg0.method5185();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray149[local39]; local42++) {
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method5187();
				this.anIntArrayArrayArray8[local39][0][local42] = arg0.method5187();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray149[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
					this.anIntArrayArrayArray8[local42][1][local81] = this.anIntArrayArrayArray8[local42][0][local81];
				} else {
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method5187();
					this.anIntArrayArrayArray8[local42][1][local81] = arg0.method5187();
				}
			}
		}
		if (local37 != 0 || this.anIntArray150[1] != this.anIntArray150[0]) {
			arg1.method4179(arg0);
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(IIF)F")
	private float method1659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static109.method1656(local34);
	}
}
