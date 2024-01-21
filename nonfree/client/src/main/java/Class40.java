import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VADHJTLJ")
public final class Class40 {

	@OriginalMember(owner = "client!VADHJTLJ", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!VADHJTLJ", name = "j", descriptor = "I")
	public static int anInt687;

	@OriginalMember(owner = "client!VADHJTLJ", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!VADHJTLJ", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[2][8];

	@OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "I")
	private int anInt685 = 748;

	@OriginalMember(owner = "client!VADHJTLJ", name = "b", descriptor = "I")
	private int anInt686 = 201;

	@OriginalMember(owner = "client!VADHJTLJ", name = "c", descriptor = "[I")
	public int[] anIntArray129 = new int[2];

	@OriginalMember(owner = "client!VADHJTLJ", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!VADHJTLJ", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!VADHJTLJ", name = "f", descriptor = "[I")
	private int[] anIntArray130 = new int[2];

	@OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "(IIFZ)F")
	private float method471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
			@Pc(40) float local40 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local40 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("38400, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "(BF)F")
	private float method472(@OriginalArg(0) byte arg0, @OriginalArg(1) float arg1) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
			@Pc(12) boolean local12 = false;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("88058, " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "(BFII)F")
	private float method473(@OriginalArg(0) byte arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(40) float local40 = (float) this.anIntArrayArrayArray5[arg3][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray5[arg3][1][arg2] - this.anIntArrayArrayArray5[arg3][0][arg2]);
			@Pc(44) float local44 = local40 * 1.2207031E-4F;
			return this.method472((byte) 8, local44);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("4279, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "(IFI)I")
	public int method474(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(26) float local26;
			if (arg0 == 0) {
				local26 = (float) this.anIntArray130[0] + (float) (this.anIntArray130[1] - this.anIntArray130[0]) * arg1;
				@Pc(30) float local30 = local26 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local30 / 20.0F));
				anInt687 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray129[arg0] == 0) {
				return 0;
			}
			local26 = this.method471(arg0, 0, arg1);
			aFloatArrayArray1[arg0][0] = -2.0F * local26 * (float) Math.cos((double) this.method473((byte) 9, arg1, 0, arg0));
			aFloatArrayArray1[arg0][1] = local26 * local26;
			for (@Pc(85) int local85 = 1; local85 < this.anIntArray129[arg0]; local85++) {
				local26 = this.method471(arg0, local85, arg1);
				@Pc(108) float local108 = -2.0F * local26 * (float) Math.cos((double) this.method473((byte) 9, arg1, local85, arg0));
				@Pc(112) float local112 = local26 * local26;
				aFloatArrayArray1[arg0][local85 * 2 + 1] = aFloatArrayArray1[arg0][local85 * 2 - 1] * local112;
				aFloatArrayArray1[arg0][local85 * 2] = aFloatArrayArray1[arg0][local85 * 2 - 1] * local108 + aFloatArrayArray1[arg0][local85 * 2 - 2] * local112;
				for (@Pc(168) int local168 = local85 * 2 - 1; local168 >= 2; local168--) {
					aFloatArrayArray1[arg0][local168] += aFloatArrayArray1[arg0][local168 - 1] * local108 + aFloatArrayArray1[arg0][local168 - 2] * local112;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local108 + local112;
				aFloatArrayArray1[arg0][0] += local108;
			}
			@Pc(238) int local238;
			if (arg0 == 0) {
				for (local238 = 0; local238 < this.anIntArray129[0] * 2; local238++) {
					aFloatArrayArray1[0][local238] *= aFloat1;
				}
			}
			for (local238 = 0; local238 < this.anIntArray129[arg0] * 2; local238++) {
				anIntArrayArray15[arg0][local238] = (int) (aFloatArrayArray1[arg0][local238] * 65536.0F);
			}
			return this.anIntArray129[arg0] * 2;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("12770, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VADHJTLJ", name = "a", descriptor = "(Lclient!MBMGIXGO;ZLclient!OZKFTHAD;)V")
	public void method475(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class31 arg1) {
		try {
			@Pc(4) int local4 = arg0.method268();
			this.anIntArray129[0] = local4 >> 4;
			this.anIntArray129[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray130[0] = this.anIntArray130[1] = 0;
			} else {
				this.anIntArray130[0] = arg0.method270();
				this.anIntArray130[1] = arg0.method270();
				@Pc(38) int local38 = arg0.method268();
				@Pc(44) int local44;
				for (@Pc(40) int local40 = 0; local40 < 2; local40++) {
					for (local44 = 0; local44 < this.anIntArray129[local40]; local44++) {
						this.anIntArrayArrayArray5[local40][0][local44] = arg0.method270();
						this.anIntArrayArrayArray6[local40][0][local44] = arg0.method270();
					}
				}
				for (local44 = 0; local44 < 2; local44++) {
					for (@Pc(83) int local83 = 0; local83 < this.anIntArray129[local44]; local83++) {
						if ((local38 & 0x1 << local44 * 4 << local83) == 0) {
							this.anIntArrayArrayArray5[local44][1][local83] = this.anIntArrayArrayArray5[local44][0][local83];
							this.anIntArrayArrayArray6[local44][1][local83] = this.anIntArrayArrayArray6[local44][0][local83];
						} else {
							this.anIntArrayArrayArray5[local44][1][local83] = arg0.method270();
							this.anIntArrayArrayArray6[local44][1][local83] = arg0.method270();
						}
					}
				}
				if (local38 != 0 || this.anIntArray130[1] != this.anIntArray130[0]) {
					arg1.method405(arg0);
				}
			}
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("95601, " + arg0 + ", " + false + ", " + arg1 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}
}
