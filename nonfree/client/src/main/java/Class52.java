import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class52 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	private final int[] anIntArray101 = new int[2];

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
	public final int[] anIntArray102 = new int[2];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IF)I")
	public int method1195(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray101[0] + (float) (this.anIntArray101[1] - this.anIntArray101[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static65.aFloat7 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static65.anInt1444 = (int) (Static65.aFloat7 * 65536.0F);
		}
		if (this.anIntArray102[arg0] == 0) {
			return 0;
		}
		local20 = this.method1199(arg0, 0, arg1);
		Static65.aFloatArrayArray1[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method1196(arg0, 0, arg1));
		Static65.aFloatArrayArray1[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray102[arg0]; local77++) {
			local20 = this.method1199(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method1196(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static65.aFloatArrayArray1[arg0][local77 * 2 + 1] = Static65.aFloatArrayArray1[arg0][local77 * 2 - 1] * local101;
			Static65.aFloatArrayArray1[arg0][local77 * 2] = Static65.aFloatArrayArray1[arg0][local77 * 2 - 1] * local97 + Static65.aFloatArrayArray1[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static65.aFloatArrayArray1[arg0][local157] += Static65.aFloatArrayArray1[arg0][local157 - 1] * local97 + Static65.aFloatArrayArray1[arg0][local157 - 2] * local101;
			}
			Static65.aFloatArrayArray1[arg0][1] += Static65.aFloatArrayArray1[arg0][0] * local97 + local101;
			Static65.aFloatArrayArray1[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray102[0] * 2; local226++) {
				Static65.aFloatArrayArray1[0][local226] *= Static65.aFloat7;
			}
		}
		for (local226 = 0; local226 < this.anIntArray102[arg0] * 2; local226++) {
			Static65.anIntArrayArray9[arg0][local226] = (int) (Static65.aFloatArrayArray1[arg0][local226] * 65536.0F);
		}
		return this.anIntArray102[arg0] * 2;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIF)F")
	private float method1196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static65.method1198(local34);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!nj;Lclient!rs;)V")
	public void method1197(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) Class179 arg1) {
		@Pc(3) int local3 = arg0.method5720();
		this.anIntArray102[0] = local3 >> 4;
		this.anIntArray102[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray101[0] = this.anIntArray101[1] = 0;
			return;
		}
		this.anIntArray101[0] = arg0.method5715();
		this.anIntArray101[1] = arg0.method5715();
		@Pc(37) int local37 = arg0.method5720();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray102[local39]; local42++) {
				this.anIntArrayArrayArray2[local39][0][local42] = arg0.method5715();
				this.anIntArrayArrayArray1[local39][0][local42] = arg0.method5715();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray102[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray2[local42][1][local81] = this.anIntArrayArrayArray2[local42][0][local81];
					this.anIntArrayArrayArray1[local42][1][local81] = this.anIntArrayArrayArray1[local42][0][local81];
				} else {
					this.anIntArrayArrayArray2[local42][1][local81] = arg0.method5715();
					this.anIntArrayArrayArray1[local42][1][local81] = arg0.method5715();
				}
			}
		}
		if (local37 != 0 || this.anIntArray101[1] != this.anIntArray101[0]) {
			arg1.method4883(arg0);
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIF)F")
	private float method1199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
