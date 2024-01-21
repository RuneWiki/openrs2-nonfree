import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PKLJDULJ")
public final class Class30 {

	@OriginalMember(owner = "client!PKLJDULJ", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!PKLJDULJ", name = "j", descriptor = "I")
	public static int anInt478;

	@OriginalMember(owner = "client!PKLJDULJ", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!PKLJDULJ", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[2][8];

	@OriginalMember(owner = "client!PKLJDULJ", name = "a", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!PKLJDULJ", name = "b", descriptor = "Z")
	private boolean aBoolean132 = true;

	@OriginalMember(owner = "client!PKLJDULJ", name = "c", descriptor = "[I")
	public int[] anIntArray124 = new int[2];

	@OriginalMember(owner = "client!PKLJDULJ", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!PKLJDULJ", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!PKLJDULJ", name = "f", descriptor = "[I")
	private int[] anIntArray125 = new int[2];

	@OriginalMember(owner = "client!PKLJDULJ", name = "a", descriptor = "(ZIIF)F")
	private float method334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(36) float local36 = (float) this.anIntArrayArrayArray4[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray4[arg1][1][arg0] - this.anIntArrayArrayArray4[arg1][0][arg0]);
			@Pc(40) float local40 = local36 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local40 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("1783, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKLJDULJ", name = "a", descriptor = "(FZ)F")
	private float method335(@OriginalArg(0) float arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			@Pc(16) float local16 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
			return local16 * 3.1415927F / 11025.0F;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("20569, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKLJDULJ", name = "b", descriptor = "(ZIIF)F")
	private float method336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(36) float local36 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
			@Pc(40) float local40 = local36 * 1.2207031E-4F;
			return this.method335(local40, this.aBoolean132);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("53424, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKLJDULJ", name = "a", descriptor = "(FII)I")
	public int method337(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray125[0] + (float) (this.anIntArray125[1] - this.anIntArray125[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt478 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray124[arg1] == 0) {
				return 0;
			}
			local22 = this.method334(0, arg1, arg0);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method336(arg1, 0, arg0));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(91) int local91 = 1; local91 < this.anIntArray124[arg1]; local91++) {
				local22 = this.method334(local91, arg1, arg0);
				@Pc(114) float local114 = -2.0F * local22 * (float) Math.cos((double) this.method336(arg1, local91, arg0));
				@Pc(118) float local118 = local22 * local22;
				aFloatArrayArray1[arg1][local91 * 2 + 1] = aFloatArrayArray1[arg1][local91 * 2 - 1] * local118;
				aFloatArrayArray1[arg1][local91 * 2] = aFloatArrayArray1[arg1][local91 * 2 - 1] * local114 + aFloatArrayArray1[arg1][local91 * 2 - 2] * local118;
				for (@Pc(174) int local174 = local91 * 2 - 1; local174 >= 2; local174--) {
					aFloatArrayArray1[arg1][local174] += aFloatArrayArray1[arg1][local174 - 1] * local114 + aFloatArrayArray1[arg1][local174 - 2] * local118;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local114 + local118;
				aFloatArrayArray1[arg1][0] += local114;
			}
			@Pc(244) int local244;
			if (arg1 == 0) {
				for (local244 = 0; local244 < this.anIntArray124[0] * 2; local244++) {
					aFloatArrayArray1[0][local244] *= aFloat1;
				}
			}
			for (local244 = 0; local244 < this.anIntArray124[arg1] * 2; local244++) {
				anIntArrayArray8[arg1][local244] = (int) (aFloatArrayArray1[arg1][local244] * 65536.0F);
			}
			return this.anIntArray124[arg1] * 2;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("45816, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKLJDULJ", name = "a", descriptor = "(ILclient!NHEPCMLW;Lclient!AUPOWMGG;)V")
	public void method338(@OriginalArg(1) Class3_Sub1_Sub3 arg0, @OriginalArg(2) Class1 arg1) {
		try {
			@Pc(4) int local4 = arg0.method274();
			this.anIntArray124[0] = local4 >> 4;
			this.anIntArray124[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray125[0] = this.anIntArray125[1] = 0;
			} else {
				this.anIntArray125[0] = arg0.method276();
				this.anIntArray125[1] = arg0.method276();
				@Pc(45) int local45 = arg0.method274();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray124[local47]; local51++) {
						this.anIntArrayArrayArray3[local47][0][local51] = arg0.method276();
						this.anIntArrayArrayArray4[local47][0][local51] = arg0.method276();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray124[local51]; local90++) {
						if ((local45 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray3[local51][1][local90] = this.anIntArrayArrayArray3[local51][0][local90];
							this.anIntArrayArrayArray4[local51][1][local90] = this.anIntArrayArrayArray4[local51][0][local90];
						} else {
							this.anIntArrayArrayArray3[local51][1][local90] = arg0.method276();
							this.anIntArrayArrayArray4[local51][1][local90] = arg0.method276();
						}
					}
				}
				if (local45 != 0 || this.anIntArray125[1] != this.anIntArray125[0]) {
					arg1.method2(arg0);
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("28194, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}
}
