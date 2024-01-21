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
	public static int anInt158;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt157 = 45800;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	private int[] anIntArray19 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFZI)F")
	private float method51(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray2[arg2][1][arg0] - this.anIntArrayArrayArray2[arg2][0][arg0]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("87482, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IF)F")
	private float method52(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			if (this.anInt157 != 45800) {
				this.anInt157 = 74;
			}
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("27489, " + 45800 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIIF)F")
	private float method53(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(35) float local35 = (float) this.anIntArrayArrayArray1[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray1[arg1][1][arg0] - this.anIntArrayArrayArray1[arg1][0][arg0]);
			@Pc(39) float local39 = local35 * 1.2207031E-4F;
			return this.method52(local39);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("11052, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIF)I")
	public int method54(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray19[0] + (float) (this.anIntArray19[1] - this.anIntArray19[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt158 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray18[arg0] == 0) {
				return 0;
			}
			local22 = this.method51(0, arg1, arg0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method53(0, arg0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(90) int local90 = 1; local90 < this.anIntArray18[arg0]; local90++) {
				local22 = this.method51(local90, arg1, arg0);
				@Pc(113) float local113 = -2.0F * local22 * (float) Math.cos((double) this.method53(local90, arg0, arg1));
				@Pc(117) float local117 = local22 * local22;
				aFloatArrayArray1[arg0][local90 * 2 + 1] = aFloatArrayArray1[arg0][local90 * 2 - 1] * local117;
				aFloatArrayArray1[arg0][local90 * 2] = aFloatArrayArray1[arg0][local90 * 2 - 1] * local113 + aFloatArrayArray1[arg0][local90 * 2 - 2] * local117;
				for (@Pc(173) int local173 = local90 * 2 - 1; local173 >= 2; local173--) {
					aFloatArrayArray1[arg0][local173] += aFloatArrayArray1[arg0][local173 - 1] * local113 + aFloatArrayArray1[arg0][local173 - 2] * local117;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local113 + local117;
				aFloatArrayArray1[arg0][0] += local113;
			}
			@Pc(243) int local243;
			if (arg0 == 0) {
				for (local243 = 0; local243 < this.anIntArray18[0] * 2; local243++) {
					aFloatArrayArray1[0][local243] *= aFloat1;
				}
			}
			for (local243 = 0; local243 < this.anIntArray18[arg0] * 2; local243++) {
				anIntArrayArray1[arg0][local243] = (int) (aFloatArrayArray1[arg0][local243] * 65536.0F);
			}
			return this.anIntArray18[arg0] * 2;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("48829, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ac;Lclient!lb;I)V")
	public void method55(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method480();
			this.anIntArray18[0] = local4 >> 4;
			this.anIntArray18[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray19[0] = this.anIntArray19[1] = 0;
			} else {
				this.anIntArray19[0] = arg1.method482();
				this.anIntArray19[1] = arg1.method482();
				@Pc(39) int local39 = arg1.method480();
				@Pc(45) int local45;
				for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
					for (local45 = 0; local45 < this.anIntArray18[local41]; local45++) {
						this.anIntArrayArrayArray1[local41][0][local45] = arg1.method482();
						this.anIntArrayArrayArray2[local41][0][local45] = arg1.method482();
					}
				}
				for (local45 = 0; local45 < 2; local45++) {
					for (@Pc(84) int local84 = 0; local84 < this.anIntArray18[local45]; local84++) {
						if ((local39 & 0x1 << local45 * 4 << local84) == 0) {
							this.anIntArrayArrayArray1[local45][1][local84] = this.anIntArrayArrayArray1[local45][0][local84];
							this.anIntArrayArrayArray2[local45][1][local84] = this.anIntArrayArrayArray2[local45][0][local84];
						} else {
							this.anIntArrayArrayArray1[local45][1][local84] = arg1.method482();
							this.anIntArrayArrayArray2[local45][1][local84] = arg1.method482();
						}
					}
				}
				if (local39 != 0 || this.anIntArray19[1] != this.anIntArray19[0]) {
					arg0.method43(arg1);
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("50194, " + arg0 + ", " + arg1 + ", " + -45931 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
