import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZOMUFNUM")
public final class Class50 {

	@OriginalMember(owner = "client!ZOMUFNUM", name = "j", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!ZOMUFNUM", name = "k", descriptor = "I")
	public static int anInt797;

	@OriginalMember(owner = "client!ZOMUFNUM", name = "h", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ZOMUFNUM", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[2][8];

	@OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "I")
	private int anInt796 = 34585;

	@OriginalMember(owner = "client!ZOMUFNUM", name = "b", descriptor = "Z")
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!ZOMUFNUM", name = "c", descriptor = "B")
	private byte aByte38 = 4;

	@OriginalMember(owner = "client!ZOMUFNUM", name = "d", descriptor = "[I")
	public int[] anIntArray199 = new int[2];

	@OriginalMember(owner = "client!ZOMUFNUM", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!ZOMUFNUM", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!ZOMUFNUM", name = "g", descriptor = "[I")
	private int[] anIntArray200 = new int[2];

	@OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "(IBFI)F")
	private float method540(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray6[arg2][1][arg0] - this.anIntArrayArrayArray6[arg2][0][arg0]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("71187, " + arg0 + ", " + 7 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "(IF)F")
	private float method541(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(11) float local11 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
			return local11 * 3.1415927F / 11025.0F;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("11373, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "(BIIF)F")
	private float method542(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		try {
			@Pc(32) float local32 = (float) this.anIntArrayArrayArray5[arg1][0][arg2] + arg3 * (float) (this.anIntArrayArrayArray5[arg1][1][arg2] - this.anIntArrayArrayArray5[arg1][0][arg2]);
			@Pc(36) float local36 = local32 * 1.2207031E-4F;
			if (this.aByte38 == 4) {
				@Pc(42) boolean local42 = false;
			} else {
				for (@Pc(46) int local46 = 1; local46 > 0; local46++) {
				}
			}
			return this.method541(796, local36);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("13437, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "(IIF)I")
	public int method543(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray200[0] + (float) (this.anIntArray200[1] - this.anIntArray200[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt797 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray199[arg0] == 0) {
				return 0;
			}
			local22 = this.method540(0, arg1, arg0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method542((byte) 4, arg0, 0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(86) int local86 = 1; local86 < this.anIntArray199[arg0]; local86++) {
				local22 = this.method540(local86, arg1, arg0);
				@Pc(109) float local109 = -2.0F * local22 * (float) Math.cos((double) this.method542((byte) 4, arg0, local86, arg1));
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
				for (local239 = 0; local239 < this.anIntArray199[0] * 2; local239++) {
					aFloatArrayArray1[0][local239] *= aFloat1;
				}
			}
			for (local239 = 0; local239 < this.anIntArray199[arg0] * 2; local239++) {
				anIntArrayArray18[arg0][local239] = (int) (aFloatArrayArray1[arg0][local239] * 65536.0F);
			}
			return this.anIntArray199[arg0] * 2;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("43112, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZOMUFNUM", name = "a", descriptor = "(Lclient!NQUAUMDT;ILclient!FGSQUADF;)V")
	public void method544(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) Class10 arg1) {
		try {
			@Pc(4) int local4 = arg0.method262();
			this.anIntArray199[0] = local4 >> 4;
			this.anIntArray199[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray200[0] = this.anIntArray200[1] = 0;
			} else {
				this.anIntArray200[0] = arg0.method264();
				this.anIntArray200[1] = arg0.method264();
				@Pc(46) int local46 = arg0.method262();
				@Pc(52) int local52;
				for (@Pc(48) int local48 = 0; local48 < 2; local48++) {
					for (local52 = 0; local52 < this.anIntArray199[local48]; local52++) {
						this.anIntArrayArrayArray5[local48][0][local52] = arg0.method264();
						this.anIntArrayArrayArray6[local48][0][local52] = arg0.method264();
					}
				}
				for (local52 = 0; local52 < 2; local52++) {
					for (@Pc(91) int local91 = 0; local91 < this.anIntArray199[local52]; local91++) {
						if ((local46 & 0x1 << local52 * 4 << local91) == 0) {
							this.anIntArrayArrayArray5[local52][1][local91] = this.anIntArrayArrayArray5[local52][0][local91];
							this.anIntArrayArrayArray6[local52][1][local91] = this.anIntArrayArrayArray6[local52][0][local91];
						} else {
							this.anIntArrayArrayArray5[local52][1][local91] = arg0.method264();
							this.anIntArrayArrayArray6[local52][1][local91] = arg0.method264();
						}
					}
				}
				if (local46 != 0 || this.anIntArray200[1] != this.anIntArray200[0]) {
					arg1.method62(674, arg0);
				}
			}
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("69771, " + arg0 + ", " + 29883 + ", " + arg1 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
