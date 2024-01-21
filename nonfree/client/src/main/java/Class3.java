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
	public static int anInt177;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt176 = 18931;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	private int[] anIntArray19 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFII)F")
	private float method51(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg2][0][arg3] + arg1 * (float) (this.anIntArrayArrayArray2[arg2][1][arg3] - this.anIntArrayArrayArray2[arg2][0][arg3]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			@Pc(38) boolean local38 = false;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("97410, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IF)F")
	private float method52(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("41152, " + -900 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FIII)F")
	private float method53(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray1[arg1][1][arg2] - this.anIntArrayArrayArray1[arg1][0][arg2]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method52(local34);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("98899, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FII)I")
	public int method54(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(31) float local31;
			if (arg1 == 0) {
				local31 = (float) this.anIntArray19[0] + (float) (this.anIntArray19[1] - this.anIntArray19[0]) * arg0;
				@Pc(35) float local35 = local31 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local35 / 20.0F));
				anInt177 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray18[arg1] == 0) {
				return 0;
			}
			local31 = this.method51(294, arg0, arg1, 0);
			aFloatArrayArray1[arg1][0] = -2.0F * local31 * (float) Math.cos((double) this.method53(arg0, arg1, 0));
			aFloatArrayArray1[arg1][1] = local31 * local31;
			for (@Pc(90) int local90 = 1; local90 < this.anIntArray18[arg1]; local90++) {
				local31 = this.method51(294, arg0, arg1, local90);
				@Pc(113) float local113 = -2.0F * local31 * (float) Math.cos((double) this.method53(arg0, arg1, local90));
				@Pc(117) float local117 = local31 * local31;
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
				for (local243 = 0; local243 < this.anIntArray18[0] * 2; local243++) {
					aFloatArrayArray1[0][local243] *= aFloat1;
				}
			}
			for (local243 = 0; local243 < this.anIntArray18[arg1] * 2; local243++) {
				anIntArrayArray1[arg1][local243] = (int) (aFloatArrayArray1[arg1][local243] * 65536.0F);
			}
			return this.anIntArray18[arg1] * 2;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("66573, " + arg0 + ", " + 3 + ", " + arg1 + ", " + local297.toString());
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
				@Pc(41) int local41 = arg1.method480();
				@Pc(47) int local47;
				for (@Pc(43) int local43 = 0; local43 < 2; local43++) {
					for (local47 = 0; local47 < this.anIntArray18[local43]; local47++) {
						this.anIntArrayArrayArray1[local43][0][local47] = arg1.method482();
						this.anIntArrayArrayArray2[local43][0][local47] = arg1.method482();
					}
				}
				for (local47 = 0; local47 < 2; local47++) {
					for (@Pc(86) int local86 = 0; local86 < this.anIntArray18[local47]; local86++) {
						if ((local41 & 0x1 << local47 * 4 << local86) == 0) {
							this.anIntArrayArrayArray1[local47][1][local86] = this.anIntArrayArrayArray1[local47][0][local86];
							this.anIntArrayArrayArray2[local47][1][local86] = this.anIntArrayArrayArray2[local47][0][local86];
						} else {
							this.anIntArrayArrayArray1[local47][1][local86] = arg1.method482();
							this.anIntArrayArrayArray2[local47][1][local86] = arg1.method482();
						}
					}
				}
				if (local41 != 0 || this.anIntArray19[1] != this.anIntArray19[0]) {
					arg0.method43(arg1);
				}
			}
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("25733, " + arg0 + ", " + arg1 + ", " + 12249 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
