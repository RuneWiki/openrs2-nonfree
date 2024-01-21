import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!URKVTZGT")
public final class Class43 {

	@OriginalMember(owner = "client!URKVTZGT", name = "h", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!URKVTZGT", name = "i", descriptor = "I")
	public static int anInt681;

	@OriginalMember(owner = "client!URKVTZGT", name = "f", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!URKVTZGT", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[2][8];

	@OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "I")
	private int anInt680 = -205;

	@OriginalMember(owner = "client!URKVTZGT", name = "b", descriptor = "[I")
	public int[] anIntArray181 = new int[2];

	@OriginalMember(owner = "client!URKVTZGT", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!URKVTZGT", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!URKVTZGT", name = "e", descriptor = "[I")
	private int[] anIntArray182 = new int[2];

	@OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "(IBFI)F")
	private float method462(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(40) float local40 = (float) this.anIntArrayArrayArray6[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray6[arg2][1][arg0] - this.anIntArrayArrayArray6[arg2][0][arg0]);
			@Pc(44) float local44 = local40 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local44 / 20.0F));
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("38844, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "(IF)F")
	private float method463(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(11) float local11 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
			return local11 * 3.1415927F / 11025.0F;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("97541, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "(IIIF)F")
	private float method464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(32) float local32 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
			@Pc(36) float local36 = local32 * 1.2207031E-4F;
			return this.method463(856, local36);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("32059, " + arg0 + ", " + -31 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "(IIF)I")
	public int method465(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray182[0] + (float) (this.anIntArray182[1] - this.anIntArray182[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt681 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray181[arg0] == 0) {
				return 0;
			}
			local22 = this.method462(0, arg1, arg0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method464(arg0, 0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(86) int local86 = 1; local86 < this.anIntArray181[arg0]; local86++) {
				local22 = this.method462(local86, arg1, arg0);
				@Pc(109) float local109 = -2.0F * local22 * (float) Math.cos((double) this.method464(arg0, local86, arg1));
				@Pc(113) float local113 = local22 * local22;
				aFloatArrayArray1[arg0][local86 * 2 + 1] = aFloatArrayArray1[arg0][local86 * 2 - 1] * local113;
				aFloatArrayArray1[arg0][local86 * 2] = aFloatArrayArray1[arg0][local86 * 2 - 1] * local109 + aFloatArrayArray1[arg0][local86 * 2 - 2] * local113;
				for (@Pc(169) int local169 = local86 * 2 - 1; local169 >= 2; local169--) {
					aFloatArrayArray1[arg0][local169] += aFloatArrayArray1[arg0][local169 - 1] * local109 + aFloatArrayArray1[arg0][local169 - 2] * local113;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local109 + local113;
				aFloatArrayArray1[arg0][0] += local109;
			}
			@Pc(239) int local239;
			if (arg0 == 0) {
				for (local239 = 0; local239 < this.anIntArray181[0] * 2; local239++) {
					aFloatArrayArray1[0][local239] *= aFloat1;
				}
			}
			for (local239 = 0; local239 < this.anIntArray181[arg0] * 2; local239++) {
				anIntArrayArray18[arg0][local239] = (int) (aFloatArrayArray1[arg0][local239] * 65536.0F);
			}
			return this.anIntArray181[arg0] * 2;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("51966, " + arg0 + ", " + -481 + ", " + arg1 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URKVTZGT", name = "a", descriptor = "(Lclient!IUVBENCV;Lclient!MWRZAKOJ;I)V")
	public void method466(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) Class25 arg1) {
		try {
			@Pc(4) int local4 = arg0.method152();
			this.anIntArray181[0] = local4 >> 4;
			this.anIntArray181[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray182[0] = this.anIntArray182[1] = 0;
			} else {
				this.anIntArray182[0] = arg0.method154();
				this.anIntArray182[1] = arg0.method154();
				@Pc(38) int local38 = arg0.method152();
				@Pc(44) int local44;
				for (@Pc(40) int local40 = 0; local40 < 2; local40++) {
					for (local44 = 0; local44 < this.anIntArray181[local40]; local44++) {
						this.anIntArrayArrayArray5[local40][0][local44] = arg0.method154();
						this.anIntArrayArrayArray6[local40][0][local44] = arg0.method154();
					}
				}
				for (local44 = 0; local44 < 2; local44++) {
					for (@Pc(83) int local83 = 0; local83 < this.anIntArray181[local44]; local83++) {
						if ((local38 & 0x1 << local44 * 4 << local83) == 0) {
							this.anIntArrayArrayArray5[local44][1][local83] = this.anIntArrayArrayArray5[local44][0][local83];
							this.anIntArrayArrayArray6[local44][1][local83] = this.anIntArrayArrayArray6[local44][0][local83];
						} else {
							this.anIntArrayArrayArray5[local44][1][local83] = arg0.method154();
							this.anIntArrayArrayArray6[local44][1][local83] = arg0.method154();
						}
					}
				}
				if (local38 != 0 || this.anIntArray182[1] != this.anIntArray182[0]) {
					arg1.method286(arg0, (byte) 1);
				}
			}
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("9184, " + arg0 + ", " + arg1 + ", " + -224 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}
}
