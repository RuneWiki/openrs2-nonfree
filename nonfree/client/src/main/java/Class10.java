import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DJKDKZEW")
public final class Class10 {

	@OriginalMember(owner = "client!DJKDKZEW", name = "h", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!DJKDKZEW", name = "i", descriptor = "I")
	public static int anInt101;

	@OriginalMember(owner = "client!DJKDKZEW", name = "f", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!DJKDKZEW", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[2][8];

	@OriginalMember(owner = "client!DJKDKZEW", name = "a", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!DJKDKZEW", name = "b", descriptor = "[I")
	public int[] anIntArray23 = new int[2];

	@OriginalMember(owner = "client!DJKDKZEW", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!DJKDKZEW", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!DJKDKZEW", name = "e", descriptor = "[I")
	private int[] anIntArray24 = new int[2];

	@OriginalMember(owner = "client!DJKDKZEW", name = "a", descriptor = "(IIFI)F")
	private float method90(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(37) float local37 = (float) this.anIntArrayArrayArray4[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray4[arg2][1][arg0] - this.anIntArrayArrayArray4[arg2][0][arg0]);
			@Pc(41) float local41 = local37 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local41 / 20.0F));
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("76670, " + arg0 + ", " + -920 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DJKDKZEW", name = "a", descriptor = "(IF)F")
	private float method91(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("99013, " + 9 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DJKDKZEW", name = "a", descriptor = "(IIIF)F")
	private float method92(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(39) float local39 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
			@Pc(43) float local43 = local39 * 1.2207031E-4F;
			return this.method91(local43);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("21896, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DJKDKZEW", name = "a", descriptor = "(FZI)I")
	public int method93(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray24[0] + (float) (this.anIntArray24[1] - this.anIntArray24[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt101 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray23[arg1] == 0) {
				return 0;
			}
			local22 = this.method90(0, arg0, arg1);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method92(arg1, 0, arg0));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(86) int local86 = 1; local86 < this.anIntArray23[arg1]; local86++) {
				local22 = this.method90(local86, arg0, arg1);
				@Pc(109) float local109 = -2.0F * local22 * (float) Math.cos((double) this.method92(arg1, local86, arg0));
				@Pc(113) float local113 = local22 * local22;
				aFloatArrayArray1[arg1][local86 * 2 + 1] = aFloatArrayArray1[arg1][local86 * 2 - 1] * local113;
				aFloatArrayArray1[arg1][local86 * 2] = aFloatArrayArray1[arg1][local86 * 2 - 1] * local109 + aFloatArrayArray1[arg1][local86 * 2 - 2] * local113;
				for (@Pc(169) int local169 = local86 * 2 - 1; local169 >= 2; local169--) {
					aFloatArrayArray1[arg1][local169] += aFloatArrayArray1[arg1][local169 - 1] * local109 + aFloatArrayArray1[arg1][local169 - 2] * local113;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local109 + local113;
				aFloatArrayArray1[arg1][0] += local109;
			}
			@Pc(239) int local239;
			if (arg1 == 0) {
				for (local239 = 0; local239 < this.anIntArray23[0] * 2; local239++) {
					aFloatArrayArray1[0][local239] *= aFloat1;
				}
			}
			for (local239 = 0; local239 < this.anIntArray23[arg1] * 2; local239++) {
				anIntArrayArray2[arg1][local239] = (int) (aFloatArrayArray1[arg1][local239] * 65536.0F);
			}
			return this.anIntArray23[arg1] * 2;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("21441, " + arg0 + ", " + true + ", " + arg1 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DJKDKZEW", name = "a", descriptor = "(Lclient!ENGZWEMK;Lclient!PKHWFJLM;I)V")
	public void method94(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			@Pc(4) int local4 = arg1.method240();
			this.anIntArray23[0] = local4 >> 4;
			this.anIntArray23[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray24[0] = this.anIntArray24[1] = 0;
			} else {
				this.anIntArray24[0] = arg1.method242();
				this.anIntArray24[1] = arg1.method242();
				@Pc(44) int local44 = arg1.method240();
				@Pc(50) int local50;
				for (@Pc(46) int local46 = 0; local46 < 2; local46++) {
					for (local50 = 0; local50 < this.anIntArray23[local46]; local50++) {
						this.anIntArrayArrayArray3[local46][0][local50] = arg1.method242();
						this.anIntArrayArrayArray4[local46][0][local50] = arg1.method242();
					}
				}
				for (local50 = 0; local50 < 2; local50++) {
					for (@Pc(89) int local89 = 0; local89 < this.anIntArray23[local50]; local89++) {
						if ((local44 & 0x1 << local50 * 4 << local89) == 0) {
							this.anIntArrayArrayArray3[local50][1][local89] = this.anIntArrayArrayArray3[local50][0][local89];
							this.anIntArrayArrayArray4[local50][1][local89] = this.anIntArrayArrayArray4[local50][0][local89];
						} else {
							this.anIntArrayArrayArray3[local50][1][local89] = arg1.method242();
							this.anIntArrayArrayArray4[local50][1][local89] = arg1.method242();
						}
					}
				}
				if (local44 != 0 || this.anIntArray24[1] != this.anIntArray24[0]) {
					arg0.method103(arg1);
				}
			}
		} catch (@Pc(199) RuntimeException local199) {
			signlink.reporterror("75060, " + arg0 + ", " + arg1 + ", " + -376 + ", " + local199.toString());
			throw new RuntimeException();
		}
	}
}
