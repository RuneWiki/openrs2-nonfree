import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RMKIQWOG")
public final class Class34 {

	@OriginalMember(owner = "client!RMKIQWOG", name = "l", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!RMKIQWOG", name = "m", descriptor = "I")
	public static int anInt571;

	@OriginalMember(owner = "client!RMKIQWOG", name = "j", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!RMKIQWOG", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[2][8];

	@OriginalMember(owner = "client!RMKIQWOG", name = "a", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!RMKIQWOG", name = "b", descriptor = "B")
	private byte aByte20 = 73;

	@OriginalMember(owner = "client!RMKIQWOG", name = "c", descriptor = "B")
	private byte aByte21 = 73;

	@OriginalMember(owner = "client!RMKIQWOG", name = "d", descriptor = "I")
	private int anInt569 = 531;

	@OriginalMember(owner = "client!RMKIQWOG", name = "e", descriptor = "I")
	private int anInt570 = 531;

	@OriginalMember(owner = "client!RMKIQWOG", name = "f", descriptor = "[I")
	public int[] anIntArray133 = new int[2];

	@OriginalMember(owner = "client!RMKIQWOG", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!RMKIQWOG", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!RMKIQWOG", name = "i", descriptor = "[I")
	private int[] anIntArray134 = new int[2];

	@OriginalMember(owner = "client!RMKIQWOG", name = "a", descriptor = "(FIIB)F")
	private float method373(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray6[arg1][1][arg2] - this.anIntArrayArrayArray6[arg1][0][arg2]);
			if (arg3 != this.aByte21) {
				this.aBoolean148 = !this.aBoolean148;
			}
			local30 *= 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local30 / 20.0F));
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("77938, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMKIQWOG", name = "a", descriptor = "(FB)F")
	private float method374(@OriginalArg(0) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("35107, " + arg0 + ", " + -15 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMKIQWOG", name = "a", descriptor = "(IIFI)F")
	private float method375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray5[arg1][1][arg0] - this.anIntArrayArrayArray5[arg1][0][arg0]);
			@Pc(34) int local34 = 48 / arg3;
			@Pc(38) float local38 = local30 * 1.2207031E-4F;
			return this.method374(local38);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("92393, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMKIQWOG", name = "a", descriptor = "(BIF)I")
	public int method376(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray134[0] + (float) (this.anIntArray134[1] - this.anIntArray134[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt571 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray133[arg0] == 0) {
				return 0;
			}
			local22 = this.method373(arg1, arg0, 0, this.aByte20);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method375(0, arg0, arg1, this.anInt569));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(89) int local89 = 1; local89 < this.anIntArray133[arg0]; local89++) {
				local22 = this.method373(arg1, arg0, local89, this.aByte20);
				@Pc(114) float local114 = -2.0F * local22 * (float) Math.cos((double) this.method375(local89, arg0, arg1, this.anInt569));
				@Pc(118) float local118 = local22 * local22;
				aFloatArrayArray1[arg0][local89 * 2 + 1] = aFloatArrayArray1[arg0][local89 * 2 - 1] * local118;
				aFloatArrayArray1[arg0][local89 * 2] = aFloatArrayArray1[arg0][local89 * 2 - 1] * local114 + aFloatArrayArray1[arg0][local89 * 2 - 2] * local118;
				for (@Pc(174) int local174 = local89 * 2 - 1; local174 >= 2; local174--) {
					aFloatArrayArray1[arg0][local174] += aFloatArrayArray1[arg0][local174 - 1] * local114 + aFloatArrayArray1[arg0][local174 - 2] * local118;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local114 + local118;
				aFloatArrayArray1[arg0][0] += local114;
			}
			@Pc(244) int local244;
			if (arg0 == 0) {
				for (local244 = 0; local244 < this.anIntArray133[0] * 2; local244++) {
					aFloatArrayArray1[0][local244] *= aFloat1;
				}
			}
			for (local244 = 0; local244 < this.anIntArray133[arg0] * 2; local244++) {
				anIntArrayArray16[arg0][local244] = (int) (aFloatArrayArray1[arg0][local244] * 65536.0F);
			}
			return this.anIntArray133[arg0] * 2;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("80182, " + -98 + ", " + arg0 + ", " + arg1 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RMKIQWOG", name = "a", descriptor = "(Lclient!UAWAYCTK;ILclient!MMADHCLT;)V")
	public void method377(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) Class20 arg1) {
		try {
			@Pc(7) int local7 = arg0.method402();
			this.anIntArray133[0] = local7 >> 4;
			this.anIntArray133[1] = local7 & 0xF;
			if (local7 == 0) {
				this.anIntArray134[0] = this.anIntArray134[1] = 0;
			} else {
				this.anIntArray134[0] = arg0.method404();
				this.anIntArray134[1] = arg0.method404();
				@Pc(38) int local38 = arg0.method402();
				@Pc(44) int local44;
				for (@Pc(40) int local40 = 0; local40 < 2; local40++) {
					for (local44 = 0; local44 < this.anIntArray133[local40]; local44++) {
						this.anIntArrayArrayArray5[local40][0][local44] = arg0.method404();
						this.anIntArrayArrayArray6[local40][0][local44] = arg0.method404();
					}
				}
				for (local44 = 0; local44 < 2; local44++) {
					for (@Pc(83) int local83 = 0; local83 < this.anIntArray133[local44]; local83++) {
						if ((local38 & 0x1 << local44 * 4 << local83) == 0) {
							this.anIntArrayArrayArray5[local44][1][local83] = this.anIntArrayArrayArray5[local44][0][local83];
							this.anIntArrayArrayArray6[local44][1][local83] = this.anIntArrayArrayArray6[local44][0][local83];
						} else {
							this.anIntArrayArrayArray5[local44][1][local83] = arg0.method404();
							this.anIntArrayArrayArray6[local44][1][local83] = arg0.method404();
						}
					}
				}
				if (local38 != 0 || this.anIntArray134[1] != this.anIntArray134[0]) {
					arg1.method284(arg0);
				}
			}
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("3342, " + arg0 + ", " + 593 + ", " + arg1 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}
}
