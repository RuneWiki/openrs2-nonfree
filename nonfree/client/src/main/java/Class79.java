import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class79 {

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7 = new int[2][2][4];

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "[I")
	private final int[] anIntArray541 = new int[2];

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8 = new int[2][2][4];

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
	public final int[] anIntArray540 = new int[2];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIF)F")
	private float method2569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray8[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray8[arg0][1][arg1] - this.anIntArrayArrayArray8[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 1.2207031E-4F;
		return Static151.method2573(local34);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!oa;Lclient!me;)V")
	public void method2570(@OriginalArg(0) Class2_Sub18 arg0, @OriginalArg(1) Class53 arg1) {
		@Pc(3) int local3 = arg0.method2387();
		this.anIntArray540[0] = local3 >> 4;
		this.anIntArray540[1] = local3 & 0xF;
		if (local3 == 0) {
			this.anIntArray541[0] = this.anIntArray541[1] = 0;
			return;
		}
		this.anIntArray541[0] = arg0.method2353();
		this.anIntArray541[1] = arg0.method2353();
		@Pc(37) int local37 = arg0.method2387();
		@Pc(42) int local42;
		for (@Pc(39) int local39 = 0; local39 < 2; local39++) {
			for (local42 = 0; local42 < this.anIntArray540[local39]; local42++) {
				this.anIntArrayArrayArray8[local39][0][local42] = arg0.method2353();
				this.anIntArrayArrayArray7[local39][0][local42] = arg0.method2353();
			}
		}
		for (local42 = 0; local42 < 2; local42++) {
			for (@Pc(81) int local81 = 0; local81 < this.anIntArray540[local42]; local81++) {
				if ((local37 & 0x1 << local42 * 4 << local81) == 0) {
					this.anIntArrayArrayArray8[local42][1][local81] = this.anIntArrayArrayArray8[local42][0][local81];
					this.anIntArrayArrayArray7[local42][1][local81] = this.anIntArrayArrayArray7[local42][0][local81];
				} else {
					this.anIntArrayArrayArray8[local42][1][local81] = arg0.method2353();
					this.anIntArrayArrayArray7[local42][1][local81] = arg0.method2353();
				}
			}
		}
		if (local37 != 0 || this.anIntArray541[1] != this.anIntArray541[0]) {
			arg1.method1787(arg0);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IF)I")
	public int method2571(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(20) float local20;
		if (arg0 == 0) {
			local20 = (float) this.anIntArray541[0] + (float) (this.anIntArray541[1] - this.anIntArray541[0]) * arg1;
			@Pc(24) float local24 = local20 * 0.0030517578F;
			Static151.aFloat3 = (float) Math.pow(0.1D, (double) (local24 / 20.0F));
			Static151.anInt3706 = (int) (Static151.aFloat3 * 65536.0F);
		}
		if (this.anIntArray540[arg0] == 0) {
			return 0;
		}
		local20 = this.method2572(arg0, 0, arg1);
		Static151.aFloatArrayArray2[arg0][0] = -2.0F * local20 * (float) Math.cos((double) this.method2569(arg0, 0, arg1));
		Static151.aFloatArrayArray2[arg0][1] = local20 * local20;
		for (@Pc(77) int local77 = 1; local77 < this.anIntArray540[arg0]; local77++) {
			local20 = this.method2572(arg0, local77, arg1);
			@Pc(97) float local97 = -2.0F * local20 * (float) Math.cos((double) this.method2569(arg0, local77, arg1));
			@Pc(101) float local101 = local20 * local20;
			Static151.aFloatArrayArray2[arg0][local77 * 2 + 1] = Static151.aFloatArrayArray2[arg0][local77 * 2 - 1] * local101;
			Static151.aFloatArrayArray2[arg0][local77 * 2] = Static151.aFloatArrayArray2[arg0][local77 * 2 - 1] * local97 + Static151.aFloatArrayArray2[arg0][local77 * 2 - 2] * local101;
			for (@Pc(157) int local157 = local77 * 2 - 1; local157 >= 2; local157--) {
				Static151.aFloatArrayArray2[arg0][local157] += Static151.aFloatArrayArray2[arg0][local157 - 1] * local97 + Static151.aFloatArrayArray2[arg0][local157 - 2] * local101;
			}
			Static151.aFloatArrayArray2[arg0][1] += Static151.aFloatArrayArray2[arg0][0] * local97 + local101;
			Static151.aFloatArrayArray2[arg0][0] += local97;
		}
		@Pc(226) int local226;
		if (arg0 == 0) {
			for (local226 = 0; local226 < this.anIntArray540[0] * 2; local226++) {
				Static151.aFloatArrayArray2[0][local226] *= Static151.aFloat3;
			}
		}
		for (local226 = 0; local226 < this.anIntArray540[arg0] * 2; local226++) {
			Static151.anIntArrayArray35[arg0][local226] = (int) (Static151.aFloatArrayArray2[arg0][local226] * 65536.0F);
		}
		return this.anIntArray540[arg0] * 2;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIF)F")
	private float method2572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		@Pc(30) float local30 = (float) this.anIntArrayArrayArray7[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray7[arg0][1][arg1] - this.anIntArrayArrayArray7[arg0][0][arg1]);
		@Pc(34) float local34 = local30 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
	}
}
