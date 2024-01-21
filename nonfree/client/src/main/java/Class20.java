import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KEQJLHXN")
public final class Class20 {

	@OriginalMember(owner = "client!KEQJLHXN", name = "j", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!KEQJLHXN", name = "k", descriptor = "I")
	public static int anInt266;

	@OriginalMember(owner = "client!KEQJLHXN", name = "h", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!KEQJLHXN", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[2][8];

	@OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!KEQJLHXN", name = "b", descriptor = "I")
	private int anInt264 = 1;

	@OriginalMember(owner = "client!KEQJLHXN", name = "c", descriptor = "I")
	private int anInt265 = 105;

	@OriginalMember(owner = "client!KEQJLHXN", name = "d", descriptor = "[I")
	public int[] anIntArray90 = new int[2];

	@OriginalMember(owner = "client!KEQJLHXN", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!KEQJLHXN", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!KEQJLHXN", name = "g", descriptor = "[I")
	private int[] anIntArray91 = new int[2];

	@OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "(FBII)F")
	private float method244(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(46) float local46 = (float) this.anIntArrayArrayArray4[arg3][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray4[arg3][1][arg2] - this.anIntArrayArrayArray4[arg3][0][arg2]);
			@Pc(50) float local50 = local46 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local50 / 20.0F));
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("8389, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "(IF)F")
	private float method245(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		try {
			if (arg0 < 1 || arg0 > 1) {
				throw new NullPointerException();
			}
			@Pc(17) float local17 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
			return local17 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("10437, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "(IZFI)F")
	private float method246(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(35) float local35 = (float) this.anIntArrayArrayArray3[arg0][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray3[arg0][1][arg2] - this.anIntArrayArrayArray3[arg0][0][arg2]);
			@Pc(39) float local39 = local35 * 1.2207031E-4F;
			return this.method245(this.anInt264, local39);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("39484, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "(FIZ)I")
	public int method247(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray91[0] + (float) (this.anIntArray91[1] - this.anIntArray91[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt266 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray90[arg1] == 0) {
				return 0;
			}
			local22 = this.method244(arg0, (byte) 8, 0, arg1);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method246(arg1, arg0, 0));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(90) int local90 = 1; local90 < this.anIntArray90[arg1]; local90++) {
				local22 = this.method244(arg0, (byte) 8, local90, arg1);
				@Pc(113) float local113 = -2.0F * local22 * (float) Math.cos((double) this.method246(arg1, arg0, local90));
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
				for (local243 = 0; local243 < this.anIntArray90[0] * 2; local243++) {
					aFloatArrayArray1[0][local243] *= aFloat1;
				}
			}
			for (local243 = 0; local243 < this.anIntArray90[arg1] * 2; local243++) {
				anIntArrayArray12[arg1][local243] = (int) (aFloatArrayArray1[arg1][local243] * 65536.0F);
			}
			return this.anIntArray90[arg1] * 2;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("5452, " + arg0 + ", " + arg1 + ", " + false + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KEQJLHXN", name = "a", descriptor = "(ZLclient!LBBVYYXO;Lclient!ZBHVITZX;)V")
	public void method248(@OriginalArg(1) Class2_Sub1_Sub3 arg0, @OriginalArg(2) Class48 arg1) {
		try {
			@Pc(4) int local4 = arg0.method267();
			this.anIntArray90[0] = local4 >> 4;
			this.anIntArray90[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray91[0] = this.anIntArray91[1] = 0;
			} else {
				this.anIntArray91[0] = arg0.method269();
				this.anIntArray91[1] = arg0.method269();
				@Pc(38) int local38 = arg0.method267();
				@Pc(44) int local44;
				for (@Pc(40) int local40 = 0; local40 < 2; local40++) {
					for (local44 = 0; local44 < this.anIntArray90[local40]; local44++) {
						this.anIntArrayArrayArray3[local40][0][local44] = arg0.method269();
						this.anIntArrayArrayArray4[local40][0][local44] = arg0.method269();
					}
				}
				for (local44 = 0; local44 < 2; local44++) {
					for (@Pc(83) int local83 = 0; local83 < this.anIntArray90[local44]; local83++) {
						if ((local38 & 0x1 << local44 * 4 << local83) == 0) {
							this.anIntArrayArrayArray3[local44][1][local83] = this.anIntArrayArrayArray3[local44][0][local83];
							this.anIntArrayArrayArray4[local44][1][local83] = this.anIntArrayArrayArray4[local44][0][local83];
						} else {
							this.anIntArrayArrayArray3[local44][1][local83] = arg0.method269();
							this.anIntArrayArrayArray4[local44][1][local83] = arg0.method269();
						}
					}
				}
				if (local38 != 0 || this.anIntArray91[1] != this.anIntArray91[0]) {
					arg1.method519(arg0, this.anInt263);
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("2536, " + false + ", " + arg0 + ", " + arg1 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
