import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DRRJWDRT")
public final class Class11 {

	@OriginalMember(owner = "client!DRRJWDRT", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!DRRJWDRT", name = "j", descriptor = "I")
	public static int anInt229;

	@OriginalMember(owner = "client!DRRJWDRT", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!DRRJWDRT", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray3 = new int[2][8];

	@OriginalMember(owner = "client!DRRJWDRT", name = "a", descriptor = "I")
	private int anInt227 = 148;

	@OriginalMember(owner = "client!DRRJWDRT", name = "b", descriptor = "I")
	private int anInt228 = -34888;

	@OriginalMember(owner = "client!DRRJWDRT", name = "c", descriptor = "[I")
	public int[] anIntArray34 = new int[2];

	@OriginalMember(owner = "client!DRRJWDRT", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!DRRJWDRT", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!DRRJWDRT", name = "f", descriptor = "[I")
	private int[] anIntArray35 = new int[2];

	@OriginalMember(owner = "client!DRRJWDRT", name = "a", descriptor = "(IFII)F")
	private float method177(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray4[arg0][1][arg2] - this.anIntArrayArrayArray4[arg0][0][arg2]);
			@Pc(39) float local39 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local39 / 20.0F));
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("58699, " + arg0 + ", " + arg1 + ", " + 148 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DRRJWDRT", name = "a", descriptor = "(FI)F")
	private float method178(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			@Pc(11) boolean local11 = false;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("22796, " + arg0 + ", " + arg1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DRRJWDRT", name = "a", descriptor = "(IIIF)F")
	private float method179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(37) float local37 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
			@Pc(41) float local41 = local37 * 1.2207031E-4F;
			return this.method178(local41, 187);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("85742, " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DRRJWDRT", name = "a", descriptor = "(ZIF)I")
	public int method180(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray35[0] + (float) (this.anIntArray35[1] - this.anIntArray35[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt229 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray34[arg0] == 0) {
				return 0;
			}
			local22 = this.method177(arg0, arg1, 0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method179(arg0, 0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(85) int local85 = 1; local85 < this.anIntArray34[arg0]; local85++) {
				local22 = this.method177(arg0, arg1, local85);
				@Pc(108) float local108 = -2.0F * local22 * (float) Math.cos((double) this.method179(arg0, local85, arg1));
				@Pc(112) float local112 = local22 * local22;
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
				for (local238 = 0; local238 < this.anIntArray34[0] * 2; local238++) {
					aFloatArrayArray1[0][local238] *= aFloat1;
				}
			}
			for (local238 = 0; local238 < this.anIntArray34[arg0] * 2; local238++) {
				anIntArrayArray3[arg0][local238] = (int) (aFloatArrayArray1[arg0][local238] * 65536.0F);
			}
			return this.anIntArray34[arg0] * 2;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("99703, " + true + ", " + arg0 + ", " + arg1 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DRRJWDRT", name = "a", descriptor = "(Lclient!DNFIVRJB;BLclient!CFARFRSG;)V")
	public void method181(@OriginalArg(0) Class10 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub2 arg2) {
		try {
			@Pc(4) int local4 = arg2.method59();
			this.anIntArray34[0] = local4 >> 4;
			this.anIntArray34[1] = local4 & 0xF;
			@Pc(23) boolean local23 = false;
			if (local4 == 0) {
				this.anIntArray35[0] = this.anIntArray35[1] = 0;
			} else {
				this.anIntArray35[0] = arg2.method61();
				this.anIntArray35[1] = arg2.method61();
				@Pc(43) int local43 = arg2.method59();
				@Pc(49) int local49;
				for (@Pc(45) int local45 = 0; local45 < 2; local45++) {
					for (local49 = 0; local49 < this.anIntArray34[local45]; local49++) {
						this.anIntArrayArrayArray3[local45][0][local49] = arg2.method61();
						this.anIntArrayArrayArray4[local45][0][local49] = arg2.method61();
					}
				}
				for (local49 = 0; local49 < 2; local49++) {
					for (@Pc(88) int local88 = 0; local88 < this.anIntArray34[local49]; local88++) {
						if ((local43 & 0x1 << local49 * 4 << local88) == 0) {
							this.anIntArrayArrayArray3[local49][1][local88] = this.anIntArrayArrayArray3[local49][0][local88];
							this.anIntArrayArrayArray4[local49][1][local88] = this.anIntArrayArrayArray4[local49][0][local88];
						} else {
							this.anIntArrayArrayArray3[local49][1][local88] = arg2.method61();
							this.anIntArrayArrayArray4[local49][1][local88] = arg2.method61();
						}
					}
				}
				if (local43 != 0 || this.anIntArray35[1] != this.anIntArray35[0]) {
					arg0.method174(arg2);
				}
			}
		} catch (@Pc(193) RuntimeException local193) {
			signlink.reporterror("57523, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local193.toString());
			throw new RuntimeException();
		}
	}
}
