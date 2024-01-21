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
	public static int anInt167;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	private int[] anIntArray19 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIF)F")
	private float method51(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("76672, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FZ)F")
	private float method52(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			if (!arg1) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("89769, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZF)F")
	private float method53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3) {
		try {
			if (!arg2) {
				throw new NullPointerException();
			}
			@Pc(36) float local36 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg3 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
			@Pc(40) float local40 = local36 * 1.2207031E-4F;
			return this.method52(local40, this.aBoolean30);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("62114, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local47.toString());
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
				anInt167 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray18[arg0] == 0) {
				return 0;
			}
			local22 = this.method51(arg0, 0, arg1);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method53(arg0, 0, this.aBoolean31, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(93) int local93 = 1; local93 < this.anIntArray18[arg0]; local93++) {
				local22 = this.method51(arg0, local93, arg1);
				@Pc(117) float local117 = -2.0F * local22 * (float) Math.cos((double) this.method53(arg0, local93, this.aBoolean31, arg1));
				@Pc(121) float local121 = local22 * local22;
				aFloatArrayArray1[arg0][local93 * 2 + 1] = aFloatArrayArray1[arg0][local93 * 2 - 1] * local121;
				aFloatArrayArray1[arg0][local93 * 2] = aFloatArrayArray1[arg0][local93 * 2 - 1] * local117 + aFloatArrayArray1[arg0][local93 * 2 - 2] * local121;
				for (@Pc(177) int local177 = local93 * 2 - 1; local177 >= 2; local177--) {
					aFloatArrayArray1[arg0][local177] += aFloatArrayArray1[arg0][local177 - 1] * local117 + aFloatArrayArray1[arg0][local177 - 2] * local121;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local117 + local121;
				aFloatArrayArray1[arg0][0] += local117;
			}
			@Pc(247) int local247;
			if (arg0 == 0) {
				for (local247 = 0; local247 < this.anIntArray18[0] * 2; local247++) {
					aFloatArrayArray1[0][local247] *= aFloat1;
				}
			}
			for (local247 = 0; local247 < this.anIntArray18[arg0] * 2; local247++) {
				anIntArrayArray1[arg0][local247] = (int) (aFloatArrayArray1[arg0][local247] * 65536.0F);
			}
			return this.anIntArray18[arg0] * 2;
		} catch (@Pc(301) RuntimeException local301) {
			signlink.reporterror("79101, " + -808 + ", " + arg0 + ", " + arg1 + ", " + local301.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ac;BLclient!lb;)V")
	public void method55(@OriginalArg(0) Class2 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			@Pc(4) int local4 = arg2.method480();
			this.anIntArray18[0] = local4 >> 4;
			this.anIntArray18[1] = local4 & 0xF;
			if (arg1 == 0) {
				if (local4 == 0) {
					this.anIntArray19[0] = this.anIntArray19[1] = 0;
				} else {
					this.anIntArray19[0] = arg2.method482();
					this.anIntArray19[1] = arg2.method482();
					@Pc(38) int local38 = arg2.method480();
					@Pc(44) int local44;
					for (@Pc(40) int local40 = 0; local40 < 2; local40++) {
						for (local44 = 0; local44 < this.anIntArray18[local40]; local44++) {
							this.anIntArrayArrayArray1[local40][0][local44] = arg2.method482();
							this.anIntArrayArrayArray2[local40][0][local44] = arg2.method482();
						}
					}
					for (local44 = 0; local44 < 2; local44++) {
						for (@Pc(83) int local83 = 0; local83 < this.anIntArray18[local44]; local83++) {
							if ((local38 & 0x1 << local44 * 4 << local83) == 0) {
								this.anIntArrayArrayArray1[local44][1][local83] = this.anIntArrayArrayArray1[local44][0][local83];
								this.anIntArrayArrayArray2[local44][1][local83] = this.anIntArrayArrayArray2[local44][0][local83];
							} else {
								this.anIntArrayArrayArray1[local44][1][local83] = arg2.method482();
								this.anIntArrayArrayArray2[local44][1][local83] = arg2.method482();
							}
						}
					}
					if (local38 != 0 || this.anIntArray19[1] != this.anIntArray19[0]) {
						arg0.method43(arg2);
					}
				}
			}
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("84755, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}
}
