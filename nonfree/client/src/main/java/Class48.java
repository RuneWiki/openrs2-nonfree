import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YSFPJPXV")
public final class Class48 {

	@OriginalMember(owner = "client!YSFPJPXV", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!YSFPJPXV", name = "j", descriptor = "I")
	public static int anInt813;

	@OriginalMember(owner = "client!YSFPJPXV", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!YSFPJPXV", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[2][8];

	@OriginalMember(owner = "client!YSFPJPXV", name = "a", descriptor = "Z")
	private boolean aBoolean224 = true;

	@OriginalMember(owner = "client!YSFPJPXV", name = "b", descriptor = "I")
	private int anInt812 = 9;

	@OriginalMember(owner = "client!YSFPJPXV", name = "c", descriptor = "[I")
	public int[] anIntArray204 = new int[2];

	@OriginalMember(owner = "client!YSFPJPXV", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!YSFPJPXV", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!YSFPJPXV", name = "f", descriptor = "[I")
	private int[] anIntArray205 = new int[2];

	@OriginalMember(owner = "client!YSFPJPXV", name = "a", descriptor = "(IFIZ)F")
	private float method559(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(40) float local40 = (float) this.anIntArrayArrayArray6[arg0][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray6[arg0][1][arg2] - this.anIntArrayArrayArray6[arg0][0][arg2]);
			@Pc(44) float local44 = local40 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local44 / 20.0F));
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("56038, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YSFPJPXV", name = "a", descriptor = "(IF)F")
	private float method560(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
			if (arg0 < 9 || arg0 > 9) {
				throw new NullPointerException();
			}
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("31749, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YSFPJPXV", name = "a", descriptor = "(IIFI)F")
	private float method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		try {
			@Pc(40) float local40 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
			@Pc(44) float local44 = local40 * 1.2207031E-4F;
			return this.method560(this.anInt812, local44);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("53472, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 15878 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YSFPJPXV", name = "a", descriptor = "(IIF)I")
	public int method562(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray205[0] + (float) (this.anIntArray205[1] - this.anIntArray205[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt813 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray204[arg0] == 0) {
				return 0;
			}
			local22 = this.method559(arg0, arg1, 0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method561(arg0, 0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(94) int local94 = 1; local94 < this.anIntArray204[arg0]; local94++) {
				local22 = this.method559(arg0, arg1, local94);
				@Pc(117) float local117 = -2.0F * local22 * (float) Math.cos((double) this.method561(arg0, local94, arg1));
				@Pc(121) float local121 = local22 * local22;
				aFloatArrayArray1[arg0][local94 * 2 + 1] = aFloatArrayArray1[arg0][local94 * 2 - 1] * local121;
				aFloatArrayArray1[arg0][local94 * 2] = aFloatArrayArray1[arg0][local94 * 2 - 1] * local117 + aFloatArrayArray1[arg0][local94 * 2 - 2] * local121;
				for (@Pc(177) int local177 = local94 * 2 - 1; local177 >= 2; local177--) {
					aFloatArrayArray1[arg0][local177] += aFloatArrayArray1[arg0][local177 - 1] * local117 + aFloatArrayArray1[arg0][local177 - 2] * local121;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local117 + local121;
				aFloatArrayArray1[arg0][0] += local117;
			}
			@Pc(247) int local247;
			if (arg0 == 0) {
				for (local247 = 0; local247 < this.anIntArray204[0] * 2; local247++) {
					aFloatArrayArray1[0][local247] *= aFloat1;
				}
			}
			for (local247 = 0; local247 < this.anIntArray204[arg0] * 2; local247++) {
				anIntArrayArray21[arg0][local247] = (int) (aFloatArrayArray1[arg0][local247] * 65536.0F);
			}
			return this.anIntArray204[arg0] * 2;
		} catch (@Pc(301) RuntimeException local301) {
			signlink.reporterror("48589, " + 4 + ", " + arg0 + ", " + arg1 + ", " + local301.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YSFPJPXV", name = "a", descriptor = "(Lclient!EGCCHUZS;ILclient!UPKVWWFD;)V")
	public void method563(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class41 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) int local8 = arg0.method167();
			this.anIntArray204[0] = local8 >> 4;
			this.anIntArray204[1] = local8 & 0xF;
			if (local8 == 0) {
				this.anIntArray205[0] = this.anIntArray205[1] = 0;
			} else {
				this.anIntArray205[0] = arg0.method169();
				this.anIntArray205[1] = arg0.method169();
				@Pc(39) int local39 = arg0.method167();
				@Pc(45) int local45;
				for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
					for (local45 = 0; local45 < this.anIntArray204[local41]; local45++) {
						this.anIntArrayArrayArray5[local41][0][local45] = arg0.method169();
						this.anIntArrayArrayArray6[local41][0][local45] = arg0.method169();
					}
				}
				for (local45 = 0; local45 < 2; local45++) {
					for (@Pc(84) int local84 = 0; local84 < this.anIntArray204[local45]; local84++) {
						if ((local39 & 0x1 << local45 * 4 << local84) == 0) {
							this.anIntArrayArrayArray5[local45][1][local84] = this.anIntArrayArrayArray5[local45][0][local84];
							this.anIntArrayArrayArray6[local45][1][local84] = this.anIntArrayArrayArray6[local45][0][local84];
						} else {
							this.anIntArrayArrayArray5[local45][1][local84] = arg0.method169();
							this.anIntArrayArrayArray6[local45][1][local84] = arg0.method169();
						}
					}
				}
				if (local39 != 0 || this.anIntArray205[1] != this.anIntArray205[0]) {
					arg2.method522(arg0);
				}
			}
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("75304, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local194.toString());
			throw new RuntimeException();
		}
	}
}
