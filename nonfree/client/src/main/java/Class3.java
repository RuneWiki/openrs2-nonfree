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
	public static int anInt168;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean27 = true;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt167 = 6;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	private int[] anIntArray19 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIF)F")
	private float method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		try {
			if (arg2 != 6) {
				throw new NullPointerException();
			}
			@Pc(37) float local37 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg3 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
			@Pc(41) float local41 = local37 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local41 / 20.0F));
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("54993, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FI)F")
	private float method52(@OriginalArg(0) float arg0) {
		try {
			@Pc(17) float local17 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local17 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("90954, " + arg0 + ", " + 7 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FIIB)F")
	private float method53(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg2][0][arg1] + arg0 * (float) (this.anIntArrayArrayArray1[arg2][1][arg1] - this.anIntArrayArrayArray1[arg2][0][arg1]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method52(local34);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("39971, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -34 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FII)I")
	public int method54(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray19[0] + (float) (this.anIntArray19[1] - this.anIntArray19[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt168 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray18[arg1] == 0) {
				return 0;
			}
			local22 = this.method51(arg1, 0, this.anInt167, arg0);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method53(arg0, 0, arg1));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(86) int local86 = 1; local86 < this.anIntArray18[arg1]; local86++) {
				local22 = this.method51(arg1, local86, this.anInt167, arg0);
				@Pc(110) float local110 = -2.0F * local22 * (float) Math.cos((double) this.method53(arg0, local86, arg1));
				@Pc(114) float local114 = local22 * local22;
				aFloatArrayArray1[arg1][local86 * 2 + 1] = aFloatArrayArray1[arg1][local86 * 2 - 1] * local114;
				aFloatArrayArray1[arg1][local86 * 2] = aFloatArrayArray1[arg1][local86 * 2 - 1] * local110 + aFloatArrayArray1[arg1][local86 * 2 - 2] * local114;
				for (@Pc(170) int local170 = local86 * 2 - 1; local170 >= 2; local170--) {
					aFloatArrayArray1[arg1][local170] += aFloatArrayArray1[arg1][local170 - 1] * local110 + aFloatArrayArray1[arg1][local170 - 2] * local114;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local110 + local114;
				aFloatArrayArray1[arg1][0] += local110;
			}
			@Pc(240) int local240;
			if (arg1 == 0) {
				for (local240 = 0; local240 < this.anIntArray18[0] * 2; local240++) {
					aFloatArrayArray1[0][local240] *= aFloat1;
				}
			}
			for (local240 = 0; local240 < this.anIntArray18[arg1] * 2; local240++) {
				anIntArrayArray1[arg1][local240] = (int) (aFloatArrayArray1[arg1][local240] * 65536.0F);
			}
			return this.anIntArray18[arg1] * 2;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("94163, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!lb;Lclient!ac;I)V")
	public void method55(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class2 arg1) {
		try {
			@Pc(4) int local4 = arg0.method480();
			this.anIntArray18[0] = local4 >> 4;
			this.anIntArray18[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray19[0] = this.anIntArray19[1] = 0;
			} else {
				this.anIntArray19[0] = arg0.method482();
				this.anIntArray19[1] = arg0.method482();
				@Pc(49) int local49 = arg0.method480();
				@Pc(55) int local55;
				for (@Pc(51) int local51 = 0; local51 < 2; local51++) {
					for (local55 = 0; local55 < this.anIntArray18[local51]; local55++) {
						this.anIntArrayArrayArray1[local51][0][local55] = arg0.method482();
						this.anIntArrayArrayArray2[local51][0][local55] = arg0.method482();
					}
				}
				for (local55 = 0; local55 < 2; local55++) {
					for (@Pc(94) int local94 = 0; local94 < this.anIntArray18[local55]; local94++) {
						if ((local49 & 0x1 << local55 * 4 << local94) == 0) {
							this.anIntArrayArrayArray1[local55][1][local94] = this.anIntArrayArrayArray1[local55][0][local94];
							this.anIntArrayArrayArray2[local55][1][local94] = this.anIntArrayArrayArray2[local55][0][local94];
						} else {
							this.anIntArrayArrayArray1[local55][1][local94] = arg0.method482();
							this.anIntArrayArrayArray2[local55][1][local94] = arg0.method482();
						}
					}
				}
				if (local49 != 0 || this.anIntArray19[1] != this.anIntArray19[0]) {
					arg1.method43(arg0);
				}
			}
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("69819, " + arg0 + ", " + arg1 + ", " + 2 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}
}
