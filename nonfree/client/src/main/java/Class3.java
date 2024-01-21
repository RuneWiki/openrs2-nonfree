import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public static int anInt168;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
	public int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	private int[] anIntArray19 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIF)F")
	private float method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(37) float local37 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
			@Pc(41) float local41 = local37 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local41 / 20.0F));
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("47101, " + arg0 + ", " + arg1 + ", " + 48528 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FI)F")
	private float method52(@OriginalArg(0) float arg0) {
		try {
			@Pc(20) float local20 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local20 * 3.1415927F / 11025.0F;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("86397, " + arg0 + ", " + -541 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZFII)F")
	private float method53(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(39) float local39 = (float) this.anIntArrayArrayArray1[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray1[arg1][1][arg2] - this.anIntArrayArrayArray1[arg1][0][arg2]);
			@Pc(43) float local43 = local39 * 1.2207031E-4F;
			return this.method52(local43);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("21094, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIF)I")
	public int method54(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray19[0] + (float) (this.anIntArray19[1] - this.anIntArray19[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt168 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray18[arg0] == 0) {
				return 0;
			}
			local22 = this.method51(arg0, 0, arg1);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method53(arg1, arg0, 0));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(91) int local91 = 1; local91 < this.anIntArray18[arg0]; local91++) {
				local22 = this.method51(arg0, local91, arg1);
				@Pc(114) float local114 = -2.0F * local22 * (float) Math.cos((double) this.method53(arg1, arg0, local91));
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
			signlink.reporterror("54888, " + arg0 + ", " + 3046 + ", " + arg1 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLclient!lb;Lclient!ac;)V")
	public void method55(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class2 arg1) {
		try {
			@Pc(7) int local7 = arg0.method480();
			this.anIntArray18[0] = local7 >> 4;
			this.anIntArray18[1] = local7 & 0xF;
			if (local7 == 0) {
				this.anIntArray19[0] = this.anIntArray19[1] = 0;
			} else {
				this.anIntArray19[0] = arg0.method482();
				this.anIntArray19[1] = arg0.method482();
				@Pc(38) int local38 = arg0.method480();
				@Pc(44) int local44;
				for (@Pc(40) int local40 = 0; local40 < 2; local40++) {
					for (local44 = 0; local44 < this.anIntArray18[local40]; local44++) {
						this.anIntArrayArrayArray1[local40][0][local44] = arg0.method482();
						this.anIntArrayArrayArray2[local40][0][local44] = arg0.method482();
					}
				}
				for (local44 = 0; local44 < 2; local44++) {
					for (@Pc(83) int local83 = 0; local83 < this.anIntArray18[local44]; local83++) {
						if ((local38 & 0x1 << local44 * 4 << local83) == 0) {
							this.anIntArrayArrayArray1[local44][1][local83] = this.anIntArrayArrayArray1[local44][0][local83];
							this.anIntArrayArrayArray2[local44][1][local83] = this.anIntArrayArrayArray2[local44][0][local83];
						} else {
							this.anIntArrayArrayArray1[local44][1][local83] = arg0.method482();
							this.anIntArrayArrayArray2[local44][1][local83] = arg0.method482();
						}
					}
				}
				if (local38 != 0 || this.anIntArray19[1] != this.anIntArray19[0]) {
					arg1.method43(arg0);
				}
			}
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("31254, " + true + ", " + arg0 + ", " + arg1 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}
}
