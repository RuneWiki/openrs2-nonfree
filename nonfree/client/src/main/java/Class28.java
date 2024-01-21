import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OKKLRABS")
public final class Class28 {

	@OriginalMember(owner = "client!OKKLRABS", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!OKKLRABS", name = "j", descriptor = "I")
	public static int anInt500;

	@OriginalMember(owner = "client!OKKLRABS", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!OKKLRABS", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[2][8];

	@OriginalMember(owner = "client!OKKLRABS", name = "a", descriptor = "B")
	private byte aByte20 = 75;

	@OriginalMember(owner = "client!OKKLRABS", name = "b", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!OKKLRABS", name = "c", descriptor = "[I")
	public int[] anIntArray138 = new int[2];

	@OriginalMember(owner = "client!OKKLRABS", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!OKKLRABS", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!OKKLRABS", name = "f", descriptor = "[I")
	private int[] anIntArray139 = new int[2];

	@OriginalMember(owner = "client!OKKLRABS", name = "a", descriptor = "(IBFI)F")
	private float method371(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray4[arg0][1][arg2] - this.anIntArrayArrayArray4[arg0][0][arg2]);
			@Pc(44) float local44 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local44 / 20.0F));
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("87188, " + arg0 + ", " + -8 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKKLRABS", name = "a", descriptor = "(ZF)F")
	private float method372(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("5508, " + false + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKKLRABS", name = "a", descriptor = "(IFBI)F")
	private float method373(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg0][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray3[arg0][1][arg2] - this.anIntArrayArrayArray3[arg0][0][arg2]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			if (this.aByte20 != 75) {
				this.aBoolean129 = !this.aBoolean129;
			}
			return this.method372(local34);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("5104, " + arg0 + ", " + arg1 + ", " + 75 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKKLRABS", name = "a", descriptor = "(ZFI)I")
	public int method374(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray139[0] + (float) (this.anIntArray139[1] - this.anIntArray139[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt500 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray138[arg1] == 0) {
				return 0;
			}
			local22 = this.method371(arg1, arg0, 0);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method373(arg1, arg0, 0));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(90) int local90 = 1; local90 < this.anIntArray138[arg1]; local90++) {
				local22 = this.method371(arg1, arg0, local90);
				@Pc(113) float local113 = -2.0F * local22 * (float) Math.cos((double) this.method373(arg1, arg0, local90));
				@Pc(117) float local117 = local22 * local22;
				aFloatArrayArray1[arg1][local90 * 2 + 1] = aFloatArrayArray1[arg1][local90 * 2 - 1] * local117;
				aFloatArrayArray1[arg1][local90 * 2] = aFloatArrayArray1[arg1][local90 * 2 - 1] * local113 + aFloatArrayArray1[arg1][local90 * 2 - 2] * local117;
				for (@Pc(173) int local173 = local90 * 2 - 1; local173 >= 2; local173--) {
					aFloatArrayArray1[arg1][local173] += aFloatArrayArray1[arg1][local173 - 1] * local113 + aFloatArrayArray1[arg1][local173 - 2] * local117;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local113 + local117;
				aFloatArrayArray1[arg1][0] += local113;
			}
			@Pc(243) int local243;
			if (arg1 == 0) {
				for (local243 = 0; local243 < this.anIntArray138[0] * 2; local243++) {
					aFloatArrayArray1[0][local243] *= aFloat1;
				}
			}
			for (local243 = 0; local243 < this.anIntArray138[arg1] * 2; local243++) {
				anIntArrayArray15[arg1][local243] = (int) (aFloatArrayArray1[arg1][local243] * 65536.0F);
			}
			return this.anIntArray138[arg1] * 2;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("61966, " + false + ", " + arg0 + ", " + arg1 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKKLRABS", name = "a", descriptor = "(Lclient!BJPWOXRJ;ILclient!XJOITHUI;)V")
	public void method375(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(2) Class45 arg1) {
		try {
			@Pc(13) int local13 = arg0.method22();
			this.anIntArray138[0] = local13 >> 4;
			this.anIntArray138[1] = local13 & 0xF;
			if (local13 == 0) {
				this.anIntArray139[0] = this.anIntArray139[1] = 0;
			} else {
				this.anIntArray139[0] = arg0.method24();
				this.anIntArray139[1] = arg0.method24();
				@Pc(44) int local44 = arg0.method22();
				@Pc(50) int local50;
				for (@Pc(46) int local46 = 0; local46 < 2; local46++) {
					for (local50 = 0; local50 < this.anIntArray138[local46]; local50++) {
						this.anIntArrayArrayArray3[local46][0][local50] = arg0.method24();
						this.anIntArrayArrayArray4[local46][0][local50] = arg0.method24();
					}
				}
				for (local50 = 0; local50 < 2; local50++) {
					for (@Pc(89) int local89 = 0; local89 < this.anIntArray138[local50]; local89++) {
						if ((local44 & 0x1 << local50 * 4 << local89) == 0) {
							this.anIntArrayArrayArray3[local50][1][local89] = this.anIntArrayArrayArray3[local50][0][local89];
							this.anIntArrayArrayArray4[local50][1][local89] = this.anIntArrayArrayArray4[local50][0][local89];
						} else {
							this.anIntArrayArrayArray3[local50][1][local89] = arg0.method24();
							this.anIntArrayArrayArray4[local50][1][local89] = arg0.method24();
						}
					}
				}
				if (local44 != 0 || this.anIntArray139[1] != this.anIntArray139[0]) {
					arg1.method497(arg0);
				}
			}
		} catch (@Pc(199) RuntimeException local199) {
			signlink.reporterror("3540, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local199.toString());
			throw new RuntimeException();
		}
	}
}
