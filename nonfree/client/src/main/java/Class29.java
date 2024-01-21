import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QMCMKVTF")
public final class Class29 {

	@OriginalMember(owner = "client!QMCMKVTF", name = "k", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!QMCMKVTF", name = "l", descriptor = "I")
	public static int anInt367;

	@OriginalMember(owner = "client!QMCMKVTF", name = "i", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!QMCMKVTF", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[2][8];

	@OriginalMember(owner = "client!QMCMKVTF", name = "a", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!QMCMKVTF", name = "b", descriptor = "I")
	private int anInt364 = 932;

	@OriginalMember(owner = "client!QMCMKVTF", name = "c", descriptor = "I")
	private int anInt365 = 9;

	@OriginalMember(owner = "client!QMCMKVTF", name = "d", descriptor = "I")
	private int anInt366 = -580;

	@OriginalMember(owner = "client!QMCMKVTF", name = "e", descriptor = "[I")
	public int[] anIntArray124 = new int[2];

	@OriginalMember(owner = "client!QMCMKVTF", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!QMCMKVTF", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!QMCMKVTF", name = "h", descriptor = "[I")
	private int[] anIntArray125 = new int[2];

	@OriginalMember(owner = "client!QMCMKVTF", name = "a", descriptor = "(IIIF)F")
	private float method281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
			@Pc(39) float local39 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local39 / 20.0F));
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("94575, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QMCMKVTF", name = "a", descriptor = "(FI)F")
	private float method282(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			@Pc(11) boolean local11 = false;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("528, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QMCMKVTF", name = "b", descriptor = "(IIIF)F")
	private float method283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			if (this.anInt365 > 9 || this.anInt365 < 9) {
				throw new NullPointerException();
			}
			@Pc(42) float local42 = (float) this.anIntArrayArrayArray1[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray1[arg1][1][arg0] - this.anIntArrayArrayArray1[arg1][0][arg0]);
			@Pc(46) float local46 = local42 * 1.2207031E-4F;
			return this.method282(local46, 932);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("36439, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QMCMKVTF", name = "a", descriptor = "(IZF)I")
	public int method284(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray125[0] + (float) (this.anIntArray125[1] - this.anIntArray125[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt367 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray124[arg0] == 0) {
				return 0;
			}
			local22 = this.method281(arg0, 0, arg1);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method283(0, arg0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(90) int local90 = 1; local90 < this.anIntArray124[arg0]; local90++) {
				local22 = this.method281(arg0, local90, arg1);
				@Pc(113) float local113 = -2.0F * local22 * (float) Math.cos((double) this.method283(local90, arg0, arg1));
				@Pc(117) float local117 = local22 * local22;
				aFloatArrayArray1[arg0][local90 * 2 + 1] = aFloatArrayArray1[arg0][local90 * 2 - 1] * local117;
				aFloatArrayArray1[arg0][local90 * 2] = aFloatArrayArray1[arg0][local90 * 2 - 1] * local113 + aFloatArrayArray1[arg0][local90 * 2 - 2] * local117;
				for (@Pc(173) int local173 = local90 * 2 - 1; local173 >= 2; local173--) {
					aFloatArrayArray1[arg0][local173] += aFloatArrayArray1[arg0][local173 - 1] * local113 + aFloatArrayArray1[arg0][local173 - 2] * local117;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local113 + local117;
				aFloatArrayArray1[arg0][0] += local113;
			}
			@Pc(243) int local243;
			if (arg0 == 0) {
				for (local243 = 0; local243 < this.anIntArray124[0] * 2; local243++) {
					aFloatArrayArray1[0][local243] *= aFloat1;
				}
			}
			for (local243 = 0; local243 < this.anIntArray124[arg0] * 2; local243++) {
				anIntArrayArray17[arg0][local243] = (int) (aFloatArrayArray1[arg0][local243] * 65536.0F);
			}
			return this.anIntArray124[arg0] * 2;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("29224, " + arg0 + ", " + true + ", " + arg1 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QMCMKVTF", name = "a", descriptor = "(ZLclient!EMWAMCXW;Lclient!ISLGIOFS;)V")
	public void method285(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) Class16 arg1) {
		try {
			@Pc(4) int local4 = arg0.method97();
			this.anIntArray124[0] = local4 >> 4;
			this.anIntArray124[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray125[0] = this.anIntArray125[1] = 0;
			} else {
				this.anIntArray125[0] = arg0.method99();
				this.anIntArray125[1] = arg0.method99();
				@Pc(40) int local40 = arg0.method97();
				@Pc(46) int local46;
				for (@Pc(42) int local42 = 0; local42 < 2; local42++) {
					for (local46 = 0; local46 < this.anIntArray124[local42]; local46++) {
						this.anIntArrayArrayArray1[local42][0][local46] = arg0.method99();
						this.anIntArrayArrayArray2[local42][0][local46] = arg0.method99();
					}
				}
				for (local46 = 0; local46 < 2; local46++) {
					for (@Pc(85) int local85 = 0; local85 < this.anIntArray124[local46]; local85++) {
						if ((local40 & 0x1 << local46 * 4 << local85) == 0) {
							this.anIntArrayArrayArray1[local46][1][local85] = this.anIntArrayArrayArray1[local46][0][local85];
							this.anIntArrayArrayArray2[local46][1][local85] = this.anIntArrayArrayArray2[local46][0][local85];
						} else {
							this.anIntArrayArrayArray1[local46][1][local85] = arg0.method99();
							this.anIntArrayArrayArray2[local46][1][local85] = arg0.method99();
						}
					}
				}
				if (local40 != 0 || this.anIntArray125[1] != this.anIntArray125[0]) {
					arg1.method180(arg0);
				}
			}
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("16134, " + false + ", " + arg0 + ", " + arg1 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}
}
