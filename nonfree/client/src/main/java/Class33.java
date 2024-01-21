import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RHVCMDPL")
public final class Class33 {

	@OriginalMember(owner = "client!RHVCMDPL", name = "h", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!RHVCMDPL", name = "i", descriptor = "I")
	public static int anInt578;

	@OriginalMember(owner = "client!RHVCMDPL", name = "f", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!RHVCMDPL", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[2][8];

	@OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "I")
	private int anInt577 = 404;

	@OriginalMember(owner = "client!RHVCMDPL", name = "b", descriptor = "[I")
	public int[] anIntArray167 = new int[2];

	@OriginalMember(owner = "client!RHVCMDPL", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!RHVCMDPL", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!RHVCMDPL", name = "e", descriptor = "[I")
	private int[] anIntArray168 = new int[2];

	@OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "(IIFI)F")
	private float method383(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(36) float local36 = (float) this.anIntArrayArrayArray4[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray4[arg2][1][arg0] - this.anIntArrayArrayArray4[arg2][0][arg0]);
			@Pc(40) float local40 = local36 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local40 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("17926, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "(FI)F")
	private float method384(@OriginalArg(0) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("95257, " + arg0 + ", " + -46008 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "(IIIF)F")
	private float method385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray3[arg1][1][arg0] - this.anIntArrayArrayArray3[arg1][0][arg0]);
			@Pc(41) float local41 = local30 * 1.2207031E-4F;
			return this.method384(local41);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("68780, " + 47248 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "(IIF)I")
	public int method386(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray168[0] + (float) (this.anIntArray168[1] - this.anIntArray168[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt578 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray167[arg0] == 0) {
				return 0;
			}
			local22 = this.method383(0, arg1, arg0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method385(0, arg0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(86) int local86 = 1; local86 < this.anIntArray167[arg0]; local86++) {
				local22 = this.method383(local86, arg1, arg0);
				@Pc(109) float local109 = -2.0F * local22 * (float) Math.cos((double) this.method385(local86, arg0, arg1));
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
				for (local239 = 0; local239 < this.anIntArray167[0] * 2; local239++) {
					aFloatArrayArray1[0][local239] *= aFloat1;
				}
			}
			for (local239 = 0; local239 < this.anIntArray167[arg0] * 2; local239++) {
				anIntArrayArray17[arg0][local239] = (int) (aFloatArrayArray1[arg0][local239] * 65536.0F);
			}
			return this.anIntArray167[arg0] * 2;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("34683, " + arg0 + ", " + -15631 + ", " + arg1 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHVCMDPL", name = "a", descriptor = "(Lclient!XJHYQMBH;ZLclient!SVWJKJVI;)V")
	public void method387(@OriginalArg(0) Class50 arg0, @OriginalArg(2) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(4) int local4 = arg1.method405();
			this.anIntArray167[0] = local4 >> 4;
			this.anIntArray167[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray168[0] = this.anIntArray168[1] = 0;
			} else {
				this.anIntArray168[0] = arg1.method407();
				this.anIntArray168[1] = arg1.method407();
				@Pc(38) int local38 = arg1.method405();
				@Pc(44) int local44;
				for (@Pc(40) int local40 = 0; local40 < 2; local40++) {
					for (local44 = 0; local44 < this.anIntArray167[local40]; local44++) {
						this.anIntArrayArrayArray3[local40][0][local44] = arg1.method407();
						this.anIntArrayArrayArray4[local40][0][local44] = arg1.method407();
					}
				}
				for (local44 = 0; local44 < 2; local44++) {
					for (@Pc(83) int local83 = 0; local83 < this.anIntArray167[local44]; local83++) {
						if ((local38 & 0x1 << local44 * 4 << local83) == 0) {
							this.anIntArrayArrayArray3[local44][1][local83] = this.anIntArrayArrayArray3[local44][0][local83];
							this.anIntArrayArrayArray4[local44][1][local83] = this.anIntArrayArrayArray4[local44][0][local83];
						} else {
							this.anIntArrayArrayArray3[local44][1][local83] = arg1.method407();
							this.anIntArrayArrayArray4[local44][1][local83] = arg1.method407();
						}
					}
				}
				if (local38 != 0 || this.anIntArray168[1] != this.anIntArray168[0]) {
					arg0.method547(arg1);
				}
			}
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("66449, " + arg0 + ", " + false + ", " + arg1 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}
}
