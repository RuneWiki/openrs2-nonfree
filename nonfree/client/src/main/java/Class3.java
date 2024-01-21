import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public static int anInt165;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean42 = true;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public int[] anIntArray17 = new int[2];

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	private int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FZII)F")
	private float method50(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg2][0][arg1] + arg0 * (float) (this.anIntArrayArrayArray2[arg2][1][arg1] - this.anIntArrayArrayArray2[arg2][0][arg1]);
			@Pc(40) float local40 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local40 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("62904, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZF)F")
	private float method51(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("45210, " + true + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIFI)F")
	private float method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray1[arg1][1][arg0] - this.anIntArrayArrayArray1[arg1][0][arg0]);
			@Pc(41) float local41 = local30 * 1.2207031E-4F;
			return this.method51(local41);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("16641, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -13943 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFZ)I")
	public int method53(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		try {
			@Pc(32) float local32;
			if (arg0 == 0) {
				local32 = (float) this.anIntArray18[0] + (float) (this.anIntArray18[1] - this.anIntArray18[0]) * arg1;
				@Pc(36) float local36 = local32 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local36 / 20.0F));
				anInt165 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray17[arg0] == 0) {
				return 0;
			}
			local32 = this.method50(arg1, 0, arg0);
			aFloatArrayArray1[arg0][0] = -2.0F * local32 * (float) Math.cos((double) this.method52(0, arg0, arg1));
			aFloatArrayArray1[arg0][1] = local32 * local32;
			for (@Pc(91) int local91 = 1; local91 < this.anIntArray17[arg0]; local91++) {
				local32 = this.method50(arg1, local91, arg0);
				@Pc(114) float local114 = -2.0F * local32 * (float) Math.cos((double) this.method52(local91, arg0, arg1));
				@Pc(118) float local118 = local32 * local32;
				aFloatArrayArray1[arg0][local91 * 2 + 1] = aFloatArrayArray1[arg0][local91 * 2 - 1] * local118;
				aFloatArrayArray1[arg0][local91 * 2] = aFloatArrayArray1[arg0][local91 * 2 - 1] * local114 + aFloatArrayArray1[arg0][local91 * 2 - 2] * local118;
				for (@Pc(174) int local174 = local91 * 2 - 1; local174 >= 2; local174--) {
					aFloatArrayArray1[arg0][local174] += aFloatArrayArray1[arg0][local174 - 1] * local114 + aFloatArrayArray1[arg0][local174 - 2] * local118;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local114 + local118;
				aFloatArrayArray1[arg0][0] += local114;
			}
			@Pc(244) int local244;
			if (arg0 == 0) {
				for (local244 = 0; local244 < this.anIntArray17[0] * 2; local244++) {
					aFloatArrayArray1[0][local244] *= aFloat1;
				}
			}
			for (local244 = 0; local244 < this.anIntArray17[arg0] * 2; local244++) {
				anIntArrayArray1[arg0][local244] = (int) (aFloatArrayArray1[arg0][local244] * 65536.0F);
			}
			return this.anIntArray17[arg0] * 2;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("85152, " + arg0 + ", " + arg1 + ", " + true + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ac;Lclient!lb;I)V")
	public void method54(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method474();
			this.anIntArray17[0] = local4 >> 4;
			this.anIntArray17[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray18[0] = this.anIntArray18[1] = 0;
			} else {
				this.anIntArray18[0] = arg1.method476();
				this.anIntArray18[1] = arg1.method476();
				@Pc(46) int local46 = arg1.method474();
				@Pc(52) int local52;
				for (@Pc(48) int local48 = 0; local48 < 2; local48++) {
					for (local52 = 0; local52 < this.anIntArray17[local48]; local52++) {
						this.anIntArrayArrayArray1[local48][0][local52] = arg1.method476();
						this.anIntArrayArrayArray2[local48][0][local52] = arg1.method476();
					}
				}
				for (local52 = 0; local52 < 2; local52++) {
					for (@Pc(91) int local91 = 0; local91 < this.anIntArray17[local52]; local91++) {
						if ((local46 & 0x1 << local52 * 4 << local91) == 0) {
							this.anIntArrayArrayArray1[local52][1][local91] = this.anIntArrayArrayArray1[local52][0][local91];
							this.anIntArrayArrayArray2[local52][1][local91] = this.anIntArrayArrayArray2[local52][0][local91];
						} else {
							this.anIntArrayArrayArray1[local52][1][local91] = arg1.method476();
							this.anIntArrayArrayArray2[local52][1][local91] = arg1.method476();
						}
					}
				}
				if (local46 != 0 || this.anIntArray18[1] != this.anIntArray18[0]) {
					arg0.method43(arg1);
				}
			}
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("91666, " + arg0 + ", " + arg1 + ", " + 6454 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}
}
