import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LNMFPXZK")
public final class Class24 {

	@OriginalMember(owner = "client!LNMFPXZK", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!LNMFPXZK", name = "j", descriptor = "I")
	public static int anInt404;

	@OriginalMember(owner = "client!LNMFPXZK", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!LNMFPXZK", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[2][8];

	@OriginalMember(owner = "client!LNMFPXZK", name = "a", descriptor = "I")
	private int anInt402 = -45819;

	@OriginalMember(owner = "client!LNMFPXZK", name = "b", descriptor = "I")
	private int anInt403 = -308;

	@OriginalMember(owner = "client!LNMFPXZK", name = "c", descriptor = "[I")
	public int[] anIntArray80 = new int[2];

	@OriginalMember(owner = "client!LNMFPXZK", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!LNMFPXZK", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!LNMFPXZK", name = "f", descriptor = "[I")
	private int[] anIntArray81 = new int[2];

	@OriginalMember(owner = "client!LNMFPXZK", name = "a", descriptor = "(FIII)F")
	private float method297(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg2][0][arg1] + arg0 * (float) (this.anIntArrayArrayArray4[arg2][1][arg1] - this.anIntArrayArrayArray4[arg2][0][arg1]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			if (arg3 >= 0) {
				for (@Pc(38) int local38 = 1; local38 > 0; local38++) {
				}
			}
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("13697, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNMFPXZK", name = "a", descriptor = "(FI)F")
	private float method298(@OriginalArg(0) float arg0) {
		try {
			@Pc(17) float local17 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local17 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("71253, " + arg0 + ", " + 2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNMFPXZK", name = "b", descriptor = "(FIII)F")
	private float method299(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(38) float local38 = (float) this.anIntArrayArrayArray3[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray3[arg1][1][arg2] - this.anIntArrayArrayArray3[arg1][0][arg2]);
			@Pc(42) float local42 = local38 * 1.2207031E-4F;
			return this.method298(local42);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("48702, " + arg0 + ", " + -648 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNMFPXZK", name = "a", descriptor = "(FII)I")
	public int method300(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray81[0] + (float) (this.anIntArray81[1] - this.anIntArray81[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt404 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray80[arg1] == 0) {
				return 0;
			}
			local22 = this.method297(arg0, 0, arg1, this.anInt403);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method299(arg0, arg1, 0));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(87) int local87 = 1; local87 < this.anIntArray80[arg1]; local87++) {
				local22 = this.method297(arg0, local87, arg1, this.anInt403);
				@Pc(111) float local111 = -2.0F * local22 * (float) Math.cos((double) this.method299(arg0, arg1, local87));
				@Pc(115) float local115 = local22 * local22;
				aFloatArrayArray1[arg1][local87 * 2 + 1] = aFloatArrayArray1[arg1][local87 * 2 - 1] * local115;
				aFloatArrayArray1[arg1][local87 * 2] = aFloatArrayArray1[arg1][local87 * 2 - 1] * local111 + aFloatArrayArray1[arg1][local87 * 2 - 2] * local115;
				for (@Pc(171) int local171 = local87 * 2 - 1; local171 >= 2; local171--) {
					aFloatArrayArray1[arg1][local171] += aFloatArrayArray1[arg1][local171 - 1] * local111 + aFloatArrayArray1[arg1][local171 - 2] * local115;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local111 + local115;
				aFloatArrayArray1[arg1][0] += local111;
			}
			@Pc(241) int local241;
			if (arg1 == 0) {
				for (local241 = 0; local241 < this.anIntArray80[0] * 2; local241++) {
					aFloatArrayArray1[0][local241] *= aFloat1;
				}
			}
			for (local241 = 0; local241 < this.anIntArray80[arg1] * 2; local241++) {
				anIntArrayArray8[arg1][local241] = (int) (aFloatArrayArray1[arg1][local241] * 65536.0F);
			}
			return this.anIntArray80[arg1] * 2;
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("45363, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LNMFPXZK", name = "a", descriptor = "(Lclient!SSKEPHYP;ILclient!JHKSAGUC;)V")
	public void method301(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(9) int local9 = arg1.method238();
			this.anIntArray80[0] = local9 >> 4;
			this.anIntArray80[1] = local9 & 0xF;
			if (local9 == 0) {
				this.anIntArray81[0] = this.anIntArray81[1] = 0;
			} else {
				this.anIntArray81[0] = arg1.method240();
				this.anIntArray81[1] = arg1.method240();
				@Pc(40) int local40 = arg1.method238();
				@Pc(46) int local46;
				for (@Pc(42) int local42 = 0; local42 < 2; local42++) {
					for (local46 = 0; local46 < this.anIntArray80[local42]; local46++) {
						this.anIntArrayArrayArray3[local42][0][local46] = arg1.method240();
						this.anIntArrayArrayArray4[local42][0][local46] = arg1.method240();
					}
				}
				for (local46 = 0; local46 < 2; local46++) {
					for (@Pc(85) int local85 = 0; local85 < this.anIntArray80[local46]; local85++) {
						if ((local40 & 0x1 << local46 * 4 << local85) == 0) {
							this.anIntArrayArrayArray3[local46][1][local85] = this.anIntArrayArrayArray3[local46][0][local85];
							this.anIntArrayArrayArray4[local46][1][local85] = this.anIntArrayArrayArray4[local46][0][local85];
						} else {
							this.anIntArrayArrayArray3[local46][1][local85] = arg1.method240();
							this.anIntArrayArrayArray4[local46][1][local85] = arg1.method240();
						}
					}
				}
				if (local40 != 0 || this.anIntArray81[1] != this.anIntArray81[0]) {
					arg0.method441(arg1, 8);
				}
			}
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("7973, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}
}
