import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GHIPAIQX")
public final class Class16 {

	@OriginalMember(owner = "client!GHIPAIQX", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!GHIPAIQX", name = "j", descriptor = "I")
	public static int anInt242;

	@OriginalMember(owner = "client!GHIPAIQX", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!GHIPAIQX", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray9 = new int[2][8];

	@OriginalMember(owner = "client!GHIPAIQX", name = "a", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!GHIPAIQX", name = "b", descriptor = "B")
	private byte aByte11 = 4;

	@OriginalMember(owner = "client!GHIPAIQX", name = "c", descriptor = "[I")
	public int[] anIntArray41 = new int[2];

	@OriginalMember(owner = "client!GHIPAIQX", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!GHIPAIQX", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!GHIPAIQX", name = "f", descriptor = "[I")
	private int[] anIntArray42 = new int[2];

	@OriginalMember(owner = "client!GHIPAIQX", name = "a", descriptor = "(FBII)F")
	private float method146(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray2[arg1][1][arg2] - this.anIntArrayArrayArray2[arg1][0][arg2]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			if (this.aByte11 != 4) {
				throw new NullPointerException();
			}
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("44396, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHIPAIQX", name = "a", descriptor = "(IF)F")
	private float method147(@OriginalArg(1) float arg0) {
		try {
			@Pc(15) float local15 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local15 * 3.1415927F / 11025.0F;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("59217, " + -762 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHIPAIQX", name = "a", descriptor = "(IFII)F")
	private float method148(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(34) float local34 = (float) this.anIntArrayArrayArray1[arg0][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray1[arg0][1][arg2] - this.anIntArrayArrayArray1[arg0][0][arg2]);
			@Pc(38) float local38 = local34 * 1.2207031E-4F;
			return this.method147(local38);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("45419, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHIPAIQX", name = "a", descriptor = "(FII)I")
	public int method149(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray42[0] + (float) (this.anIntArray42[1] - this.anIntArray42[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt242 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray41[arg1] == 0) {
				return 0;
			}
			local22 = this.method146(arg0, arg1, 0);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method148(arg1, arg0, 0, 869));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(95) int local95 = 1; local95 < this.anIntArray41[arg1]; local95++) {
				local22 = this.method146(arg0, arg1, local95);
				@Pc(118) float local118 = -2.0F * local22 * (float) Math.cos((double) this.method148(arg1, arg0, local95, 869));
				@Pc(122) float local122 = local22 * local22;
				aFloatArrayArray1[arg1][local95 * 2 + 1] = aFloatArrayArray1[arg1][local95 * 2 - 1] * local122;
				aFloatArrayArray1[arg1][local95 * 2] = aFloatArrayArray1[arg1][local95 * 2 - 1] * local118 + aFloatArrayArray1[arg1][local95 * 2 - 2] * local122;
				for (@Pc(178) int local178 = local95 * 2 - 1; local178 >= 2; local178--) {
					aFloatArrayArray1[arg1][local178] += aFloatArrayArray1[arg1][local178 - 1] * local118 + aFloatArrayArray1[arg1][local178 - 2] * local122;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local118 + local122;
				aFloatArrayArray1[arg1][0] += local118;
			}
			@Pc(248) int local248;
			if (arg1 == 0) {
				for (local248 = 0; local248 < this.anIntArray41[0] * 2; local248++) {
					aFloatArrayArray1[0][local248] *= aFloat1;
				}
			}
			for (local248 = 0; local248 < this.anIntArray41[arg1] * 2; local248++) {
				anIntArrayArray9[arg1][local248] = (int) (aFloatArrayArray1[arg1][local248] * 65536.0F);
			}
			return this.anIntArray41[arg1] * 2;
		} catch (@Pc(302) RuntimeException local302) {
			signlink.reporterror("88205, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local302.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GHIPAIQX", name = "a", descriptor = "(ZLclient!LYKGAWTC;Lclient!GLMIQHJI;)V")
	public void method150(@OriginalArg(1) Class27 arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method165();
			this.anIntArray41[0] = local4 >> 4;
			this.anIntArray41[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray42[0] = this.anIntArray42[1] = 0;
			} else {
				this.anIntArray42[0] = arg1.method167();
				this.anIntArray42[1] = arg1.method167();
				@Pc(44) int local44 = arg1.method165();
				@Pc(50) int local50;
				for (@Pc(46) int local46 = 0; local46 < 2; local46++) {
					for (local50 = 0; local50 < this.anIntArray41[local46]; local50++) {
						this.anIntArrayArrayArray1[local46][0][local50] = arg1.method167();
						this.anIntArrayArrayArray2[local46][0][local50] = arg1.method167();
					}
				}
				for (local50 = 0; local50 < 2; local50++) {
					for (@Pc(89) int local89 = 0; local89 < this.anIntArray41[local50]; local89++) {
						if ((local44 & 0x1 << local50 * 4 << local89) == 0) {
							this.anIntArrayArrayArray1[local50][1][local89] = this.anIntArrayArrayArray1[local50][0][local89];
							this.anIntArrayArrayArray2[local50][1][local89] = this.anIntArrayArrayArray2[local50][0][local89];
						} else {
							this.anIntArrayArrayArray1[local50][1][local89] = arg1.method167();
							this.anIntArrayArrayArray2[local50][1][local89] = arg1.method167();
						}
					}
				}
				if (local44 != 0 || this.anIntArray42[1] != this.anIntArray42[0]) {
					arg0.method326(arg1);
				}
			}
		} catch (@Pc(199) RuntimeException local199) {
			signlink.reporterror("56363, " + false + ", " + arg0 + ", " + arg1 + ", " + local199.toString());
			throw new RuntimeException();
		}
	}
}
