import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public static int anInt159;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "B")
	private byte aByte3 = 89;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	public int[] anIntArray17 = new int[2];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
	private int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FIII)F")
	private float method50(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg2][0][arg1] + arg0 * (float) (this.anIntArrayArrayArray2[arg2][1][arg1] - this.anIntArrayArrayArray2[arg2][0][arg1]);
			if (this.anInt158 != 0) {
				this.aBoolean38 = !this.aBoolean38;
			}
			local30 *= 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local30 / 20.0F));
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("41274, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FZ)F")
	private float method51(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			if (arg1) {
				throw new NullPointerException();
			}
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("79772, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIF)F")
	private float method52(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
			@Pc(40) float local40 = local30 * 1.2207031E-4F;
			return this.method51(local40, this.aBoolean39);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("83866, " + arg0 + ", " + 180 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFI)I")
	public int method53(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray18[0] + (float) (this.anIntArray18[1] - this.anIntArray18[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt159 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray17[arg1] == 0) {
				return 0;
			}
			local22 = this.method50(arg0, 0, arg1);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method52(arg1, 0, arg0));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(88) int local88 = 1; local88 < this.anIntArray17[arg1]; local88++) {
				local22 = this.method50(arg0, local88, arg1);
				@Pc(111) float local111 = -2.0F * local22 * (float) Math.cos((double) this.method52(arg1, local88, arg0));
				@Pc(115) float local115 = local22 * local22;
				aFloatArrayArray1[arg1][local88 * 2 + 1] = aFloatArrayArray1[arg1][local88 * 2 - 1] * local115;
				aFloatArrayArray1[arg1][local88 * 2] = aFloatArrayArray1[arg1][local88 * 2 - 1] * local111 + aFloatArrayArray1[arg1][local88 * 2 - 2] * local115;
				for (@Pc(171) int local171 = local88 * 2 - 1; local171 >= 2; local171--) {
					aFloatArrayArray1[arg1][local171] += aFloatArrayArray1[arg1][local171 - 1] * local111 + aFloatArrayArray1[arg1][local171 - 2] * local115;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local111 + local115;
				aFloatArrayArray1[arg1][0] += local111;
			}
			@Pc(241) int local241;
			if (arg1 == 0) {
				for (local241 = 0; local241 < this.anIntArray17[0] * 2; local241++) {
					aFloatArrayArray1[0][local241] *= aFloat1;
				}
			}
			for (local241 = 0; local241 < this.anIntArray17[arg1] * 2; local241++) {
				anIntArrayArray1[arg1][local241] = (int) (aFloatArrayArray1[arg1][local241] * 65536.0F);
			}
			return this.anIntArray17[arg1] * 2;
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("44386, " + -764 + ", " + arg0 + ", " + arg1 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!ac;Lclient!lb;)V")
	public void method54(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(7) int local7 = arg1.method472();
			this.anIntArray17[0] = local7 >> 4;
			this.anIntArray17[1] = local7 & 0xF;
			if (local7 == 0) {
				this.anIntArray18[0] = this.anIntArray18[1] = 0;
			} else {
				this.anIntArray18[0] = arg1.method474();
				this.anIntArray18[1] = arg1.method474();
				@Pc(38) int local38 = arg1.method472();
				@Pc(44) int local44;
				for (@Pc(40) int local40 = 0; local40 < 2; local40++) {
					for (local44 = 0; local44 < this.anIntArray17[local40]; local44++) {
						this.anIntArrayArrayArray1[local40][0][local44] = arg1.method474();
						this.anIntArrayArrayArray2[local40][0][local44] = arg1.method474();
					}
				}
				for (local44 = 0; local44 < 2; local44++) {
					for (@Pc(83) int local83 = 0; local83 < this.anIntArray17[local44]; local83++) {
						if ((local38 & 0x1 << local44 * 4 << local83) == 0) {
							this.anIntArrayArrayArray1[local44][1][local83] = this.anIntArrayArrayArray1[local44][0][local83];
							this.anIntArrayArrayArray2[local44][1][local83] = this.anIntArrayArrayArray2[local44][0][local83];
						} else {
							this.anIntArrayArrayArray1[local44][1][local83] = arg1.method474();
							this.anIntArrayArrayArray2[local44][1][local83] = arg1.method474();
						}
					}
				}
				if (local38 != 0 || this.anIntArray18[1] != this.anIntArray18[0]) {
					arg0.method43(this.aByte3, arg1);
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("92613, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
