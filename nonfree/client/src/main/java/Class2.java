import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BVZJQTSH")
public final class Class2 {

	@OriginalMember(owner = "client!BVZJQTSH", name = "j", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!BVZJQTSH", name = "k", descriptor = "I")
	public static int anInt69;

	@OriginalMember(owner = "client!BVZJQTSH", name = "h", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!BVZJQTSH", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!BVZJQTSH", name = "b", descriptor = "B")
	private byte aByte6 = 42;

	@OriginalMember(owner = "client!BVZJQTSH", name = "c", descriptor = "I")
	private int anInt68 = 8;

	@OriginalMember(owner = "client!BVZJQTSH", name = "d", descriptor = "[I")
	public int[] anIntArray6 = new int[2];

	@OriginalMember(owner = "client!BVZJQTSH", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!BVZJQTSH", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!BVZJQTSH", name = "g", descriptor = "[I")
	private int[] anIntArray7 = new int[2];

	@OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "(ZIFI)F")
	private float method53(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray2[arg2][1][arg0] - this.anIntArrayArrayArray2[arg2][0][arg0]);
			@Pc(40) float local40 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local40 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("57713, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "(BF)F")
	private float method54(@OriginalArg(0) byte arg0, @OriginalArg(1) float arg1) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
			if (arg0 == 0) {
				@Pc(11) boolean local11 = false;
			} else {
				this.anInt68 = -139;
			}
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("22316, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "(BFII)F")
	private float method55(@OriginalArg(0) byte arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg2][0][arg3] + arg1 * (float) (this.anIntArrayArrayArray1[arg2][1][arg3] - this.anIntArrayArrayArray1[arg2][0][arg3]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			if (arg0 != 42) {
				throw new NullPointerException();
			}
			return this.method54(this.aByte5, local34);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("31134, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "(BFI)I")
	public int method56(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(27) float local27;
			if (arg1 == 0) {
				local27 = (float) this.anIntArray7[0] + (float) (this.anIntArray7[1] - this.anIntArray7[0]) * arg0;
				@Pc(31) float local31 = local27 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local31 / 20.0F));
				anInt69 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray6[arg1] == 0) {
				return 0;
			}
			local27 = this.method53(0, arg0, arg1);
			aFloatArrayArray1[arg1][0] = -2.0F * local27 * (float) Math.cos((double) this.method55(this.aByte6, arg0, arg1, 0));
			aFloatArrayArray1[arg1][1] = local27 * local27;
			for (@Pc(87) int local87 = 1; local87 < this.anIntArray6[arg1]; local87++) {
				local27 = this.method53(local87, arg0, arg1);
				@Pc(111) float local111 = -2.0F * local27 * (float) Math.cos((double) this.method55(this.aByte6, arg0, arg1, local87));
				@Pc(115) float local115 = local27 * local27;
				aFloatArrayArray1[arg1][local87 * 2 + 1] = aFloatArrayArray1[arg1][local87 * 2 - 1] * local115;
				aFloatArrayArray1[arg1][local87 * 2] = aFloatArrayArray1[arg1][local87 * 2 - 1] * local111 + aFloatArrayArray1[arg1][local87 * 2 - 2] * local115;
				for (@Pc(171) int local171 = local87 * 2 - 1; local171 >= 2; local171--) {
					aFloatArrayArray1[arg1][local171] += aFloatArrayArray1[arg1][local171 - 1] * local111 + aFloatArrayArray1[arg1][local171 - 2] * local115;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local111 + local115;
				aFloatArrayArray1[arg1][0] += local111;
			}
			@Pc(241) int local241;
			if (arg1 == 0) {
				for (local241 = 0; local241 < this.anIntArray6[0] * 2; local241++) {
					aFloatArrayArray1[0][local241] *= aFloat1;
				}
			}
			for (local241 = 0; local241 < this.anIntArray6[arg1] * 2; local241++) {
				anIntArrayArray1[arg1][local241] = (int) (aFloatArrayArray1[arg1][local241] * 65536.0F);
			}
			return this.anIntArray6[arg1] * 2;
		} catch (@Pc(295) RuntimeException local295) {
			signlink.reporterror("45401, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local295.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVZJQTSH", name = "a", descriptor = "(Lclient!MNKDCXXG;ZLclient!LMFHFXBO;)V")
	public void method57(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(2) Class25 arg1) {
		try {
			@Pc(4) int local4 = arg0.method307();
			this.anIntArray6[0] = local4 >> 4;
			this.anIntArray6[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray7[0] = this.anIntArray7[1] = 0;
			} else {
				this.anIntArray7[0] = arg0.method309();
				this.anIntArray7[1] = arg0.method309();
				@Pc(40) int local40 = arg0.method307();
				@Pc(46) int local46;
				for (@Pc(42) int local42 = 0; local42 < 2; local42++) {
					for (local46 = 0; local46 < this.anIntArray6[local42]; local46++) {
						this.anIntArrayArrayArray1[local42][0][local46] = arg0.method309();
						this.anIntArrayArrayArray2[local42][0][local46] = arg0.method309();
					}
				}
				for (local46 = 0; local46 < 2; local46++) {
					for (@Pc(85) int local85 = 0; local85 < this.anIntArray6[local46]; local85++) {
						if ((local40 & 0x1 << local46 * 4 << local85) == 0) {
							this.anIntArrayArrayArray1[local46][1][local85] = this.anIntArrayArrayArray1[local46][0][local85];
							this.anIntArrayArrayArray2[local46][1][local85] = this.anIntArrayArrayArray2[local46][0][local85];
						} else {
							this.anIntArrayArrayArray1[local46][1][local85] = arg0.method309();
							this.anIntArrayArrayArray2[local46][1][local85] = arg0.method309();
						}
					}
				}
				if (local40 != 0 || this.anIntArray7[1] != this.anIntArray7[0]) {
					arg1.method276(arg0);
				}
			}
		} catch (@Pc(190) RuntimeException local190) {
			signlink.reporterror("10839, " + arg0 + ", " + false + ", " + arg1 + ", " + local190.toString());
			throw new RuntimeException();
		}
	}
}
