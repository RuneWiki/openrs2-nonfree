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
	public static int anInt169;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	private int anInt167 = 39;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	private int anInt168 = -530;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	public int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
	private int[] anIntArray19 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFII)F")
	private float method51(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg3][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray2[arg3][1][arg2] - this.anIntArrayArrayArray2[arg3][0][arg2]);
			if (arg0 >= 0) {
				this.anInt166 = 163;
			}
			local30 *= 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local30 / 20.0F));
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("12611, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZF)F")
	private float method52(@OriginalArg(1) float arg0) {
		try {
			@Pc(17) float local17 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local17 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("82054, " + true + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FIII)F")
	private float method53(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(37) float local37 = (float) this.anIntArrayArrayArray1[arg2][0][arg1] + arg0 * (float) (this.anIntArrayArrayArray1[arg2][1][arg1] - this.anIntArrayArrayArray1[arg2][0][arg1]);
			@Pc(41) float local41 = local37 * 1.2207031E-4F;
			return this.method52(local41);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("5305, " + arg0 + ", " + 27859 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FIZ)I")
	public int method54(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray19[0] + (float) (this.anIntArray19[1] - this.anIntArray19[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt169 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray18[arg1] == 0) {
				return 0;
			}
			local22 = this.method51(this.anInt168, arg0, 0, arg1);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method53(arg0, 0, arg1));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(92) int local92 = 1; local92 < this.anIntArray18[arg1]; local92++) {
				local22 = this.method51(this.anInt168, arg0, local92, arg1);
				@Pc(116) float local116 = -2.0F * local22 * (float) Math.cos((double) this.method53(arg0, local92, arg1));
				@Pc(120) float local120 = local22 * local22;
				aFloatArrayArray1[arg1][local92 * 2 + 1] = aFloatArrayArray1[arg1][local92 * 2 - 1] * local120;
				aFloatArrayArray1[arg1][local92 * 2] = aFloatArrayArray1[arg1][local92 * 2 - 1] * local116 + aFloatArrayArray1[arg1][local92 * 2 - 2] * local120;
				for (@Pc(176) int local176 = local92 * 2 - 1; local176 >= 2; local176--) {
					aFloatArrayArray1[arg1][local176] += aFloatArrayArray1[arg1][local176 - 1] * local116 + aFloatArrayArray1[arg1][local176 - 2] * local120;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local116 + local120;
				aFloatArrayArray1[arg1][0] += local116;
			}
			@Pc(246) int local246;
			if (arg1 == 0) {
				for (local246 = 0; local246 < this.anIntArray18[0] * 2; local246++) {
					aFloatArrayArray1[0][local246] *= aFloat1;
				}
			}
			for (local246 = 0; local246 < this.anIntArray18[arg1] * 2; local246++) {
				anIntArrayArray1[arg1][local246] = (int) (aFloatArrayArray1[arg1][local246] * 65536.0F);
			}
			return this.anIntArray18[arg1] * 2;
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("80185, " + arg0 + ", " + arg1 + ", " + false + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ac;ILclient!lb;)V")
	public void method55(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(8) int local8 = arg1.method480();
			this.anIntArray18[0] = local8 >> 4;
			this.anIntArray18[1] = local8 & 0xF;
			if (local8 == 0) {
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
					arg0.method43(arg1, this.anInt167);
				}
			}
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("96729, " + arg0 + ", " + 39196 + ", " + arg1 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}
}
