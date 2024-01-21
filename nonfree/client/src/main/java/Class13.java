import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GKDFAZFL")
public final class Class13 {

	@OriginalMember(owner = "client!GKDFAZFL", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!GKDFAZFL", name = "j", descriptor = "I")
	public static int anInt163;

	@OriginalMember(owner = "client!GKDFAZFL", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!GKDFAZFL", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray10 = new int[2][8];

	@OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!GKDFAZFL", name = "b", descriptor = "Z")
	private boolean aBoolean49 = true;

	@OriginalMember(owner = "client!GKDFAZFL", name = "c", descriptor = "[I")
	public int[] anIntArray93 = new int[2];

	@OriginalMember(owner = "client!GKDFAZFL", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!GKDFAZFL", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!GKDFAZFL", name = "f", descriptor = "[I")
	private int[] anIntArray94 = new int[2];

	@OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "(IZFI)F")
	private float method173(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(40) float local40 = (float) this.anIntArrayArrayArray2[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray2[arg2][1][arg0] - this.anIntArrayArrayArray2[arg2][0][arg0]);
			@Pc(44) float local44 = local40 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local44 / 20.0F));
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("83070, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "(FZ)F")
	private float method174(@OriginalArg(0) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("62994, " + arg0 + ", " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "(IIFI)F")
	private float method175(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray1[arg0][1][arg2] - this.anIntArrayArrayArray1[arg0][0][arg2]);
			@Pc(41) float local41 = local30 * 1.2207031E-4F;
			return this.method174(local41);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("21277, " + arg0 + ", " + 37596 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "(FII)I")
	public int method176(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(26) float local26;
			if (arg1 == 0) {
				local26 = (float) this.anIntArray94[0] + (float) (this.anIntArray94[1] - this.anIntArray94[0]) * arg0;
				@Pc(30) float local30 = local26 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local30 / 20.0F));
				anInt163 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray93[arg1] == 0) {
				return 0;
			}
			local26 = this.method173(0, arg0, arg1);
			aFloatArrayArray1[arg1][0] = -2.0F * local26 * (float) Math.cos((double) this.method175(arg1, arg0, 0));
			aFloatArrayArray1[arg1][1] = local26 * local26;
			for (@Pc(85) int local85 = 1; local85 < this.anIntArray93[arg1]; local85++) {
				local26 = this.method173(local85, arg0, arg1);
				@Pc(108) float local108 = -2.0F * local26 * (float) Math.cos((double) this.method175(arg1, arg0, local85));
				@Pc(112) float local112 = local26 * local26;
				aFloatArrayArray1[arg1][local85 * 2 + 1] = aFloatArrayArray1[arg1][local85 * 2 - 1] * local112;
				aFloatArrayArray1[arg1][local85 * 2] = aFloatArrayArray1[arg1][local85 * 2 - 1] * local108 + aFloatArrayArray1[arg1][local85 * 2 - 2] * local112;
				for (@Pc(168) int local168 = local85 * 2 - 1; local168 >= 2; local168--) {
					aFloatArrayArray1[arg1][local168] += aFloatArrayArray1[arg1][local168 - 1] * local108 + aFloatArrayArray1[arg1][local168 - 2] * local112;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local108 + local112;
				aFloatArrayArray1[arg1][0] += local108;
			}
			@Pc(238) int local238;
			if (arg1 == 0) {
				for (local238 = 0; local238 < this.anIntArray93[0] * 2; local238++) {
					aFloatArrayArray1[0][local238] *= aFloat1;
				}
			}
			for (local238 = 0; local238 < this.anIntArray93[arg1] * 2; local238++) {
				anIntArrayArray10[arg1][local238] = (int) (aFloatArrayArray1[arg1][local238] * 65536.0F);
			}
			return this.anIntArray93[arg1] * 2;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("62844, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GKDFAZFL", name = "a", descriptor = "(Lclient!CMGGUSPR;ILclient!JOBKQXED;)V")
	public void method177(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class21 arg1) {
		try {
			@Pc(4) int local4 = arg0.method55();
			this.anIntArray93[0] = local4 >> 4;
			this.anIntArray93[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray94[0] = this.anIntArray94[1] = 0;
			} else {
				this.anIntArray94[0] = arg0.method57();
				this.anIntArray94[1] = arg0.method57();
				@Pc(40) int local40 = arg0.method55();
				@Pc(46) int local46;
				for (@Pc(42) int local42 = 0; local42 < 2; local42++) {
					for (local46 = 0; local46 < this.anIntArray93[local42]; local46++) {
						this.anIntArrayArrayArray1[local42][0][local46] = arg0.method57();
						this.anIntArrayArrayArray2[local42][0][local46] = arg0.method57();
					}
				}
				for (local46 = 0; local46 < 2; local46++) {
					for (@Pc(85) int local85 = 0; local85 < this.anIntArray93[local46]; local85++) {
						if ((local40 & 0x1 << local46 * 4 << local85) == 0) {
							this.anIntArrayArrayArray1[local46][1][local85] = this.anIntArrayArrayArray1[local46][0][local85];
							this.anIntArrayArrayArray2[local46][1][local85] = this.anIntArrayArrayArray2[local46][0][local85];
						} else {
							this.anIntArrayArrayArray1[local46][1][local85] = arg0.method57();
							this.anIntArrayArrayArray2[local46][1][local85] = arg0.method57();
						}
					}
				}
				if (local40 != 0 || this.anIntArray94[1] != this.anIntArray94[0]) {
					arg1.method240(arg0);
				}
			}
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("41703, " + arg0 + ", " + 527 + ", " + arg1 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}
}
