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
	public static int anInt161;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt160 = 2972;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	private int[] anIntArray19 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZFI)F")
	private float method50(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray2[arg2][1][arg0] - this.anIntArrayArrayArray2[arg2][0][arg0]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("9156, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IF)F")
	private float method51(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		try {
			if (arg0 != 2972) {
				throw new NullPointerException();
			}
			@Pc(14) float local14 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
			return local14 * 3.1415927F / 11025.0F;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("10683, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIF)F")
	private float method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method51(this.anInt160, local34);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("38617, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIF)I")
	public int method53(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray19[0] + (float) (this.anIntArray19[1] - this.anIntArray19[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt161 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray18[arg0] == 0) {
				return 0;
			}
			local22 = this.method50(0, arg1, arg0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method52(arg0, 0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(91) int local91 = 1; local91 < this.anIntArray18[arg0]; local91++) {
				local22 = this.method50(local91, arg1, arg0);
				@Pc(114) float local114 = -2.0F * local22 * (float) Math.cos((double) this.method52(arg0, local91, arg1));
				@Pc(118) float local118 = local22 * local22;
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
				for (local244 = 0; local244 < this.anIntArray18[0] * 2; local244++) {
					aFloatArrayArray1[0][local244] *= aFloat1;
				}
			}
			for (local244 = 0; local244 < this.anIntArray18[arg0] * 2; local244++) {
				anIntArrayArray1[arg0][local244] = (int) (aFloatArrayArray1[arg0][local244] * 65536.0F);
			}
			return this.anIntArray18[arg0] * 2;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("1468, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!ac;Lclient!lb;)V")
	public void method54(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(5) int local5;
			if (arg0 <= 0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			local5 = arg2.method476();
			this.anIntArray18[0] = local5 >> 4;
			this.anIntArray18[1] = local5 & 0xF;
			if (local5 == 0) {
				this.anIntArray19[0] = this.anIntArray19[1] = 0;
			} else {
				this.anIntArray19[0] = arg2.method478();
				this.anIntArray19[1] = arg2.method478();
				@Pc(44) int local44 = arg2.method476();
				@Pc(50) int local50;
				for (@Pc(46) int local46 = 0; local46 < 2; local46++) {
					for (local50 = 0; local50 < this.anIntArray18[local46]; local50++) {
						this.anIntArrayArrayArray1[local46][0][local50] = arg2.method478();
						this.anIntArrayArrayArray2[local46][0][local50] = arg2.method478();
					}
				}
				for (local50 = 0; local50 < 2; local50++) {
					for (@Pc(89) int local89 = 0; local89 < this.anIntArray18[local50]; local89++) {
						if ((local44 & 0x1 << local50 * 4 << local89) == 0) {
							this.anIntArrayArrayArray1[local50][1][local89] = this.anIntArrayArrayArray1[local50][0][local89];
							this.anIntArrayArrayArray2[local50][1][local89] = this.anIntArrayArrayArray2[local50][0][local89];
						} else {
							this.anIntArrayArrayArray1[local50][1][local89] = arg2.method478();
							this.anIntArrayArrayArray2[local50][1][local89] = arg2.method478();
						}
					}
				}
				if (local44 != 0 || this.anIntArray19[1] != this.anIntArray19[0]) {
					arg1.method43(arg2);
				}
			}
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("9723, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local194.toString());
			throw new RuntimeException();
		}
	}
}
