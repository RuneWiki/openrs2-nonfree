import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XALWVYUP")
public final class Class44 {

	@OriginalMember(owner = "client!XALWVYUP", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!XALWVYUP", name = "j", descriptor = "I")
	public static int anInt640;

	@OriginalMember(owner = "client!XALWVYUP", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!XALWVYUP", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[2][8];

	@OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "I")
	private int anInt639 = -6102;

	@OriginalMember(owner = "client!XALWVYUP", name = "b", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!XALWVYUP", name = "c", descriptor = "[I")
	public int[] anIntArray151 = new int[2];

	@OriginalMember(owner = "client!XALWVYUP", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!XALWVYUP", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!XALWVYUP", name = "f", descriptor = "[I")
	private int[] anIntArray152 = new int[2];

	@OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "(BFII)F")
	private float method425(@OriginalArg(0) byte arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg3][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray2[arg3][1][arg2] - this.anIntArrayArrayArray2[arg3][0][arg2]);
			@Pc(35) boolean local35 = false;
			@Pc(45) float local45 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local45 / 20.0F));
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("15905, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "(ZF)F")
	private float method426(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("99698, " + true + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "(IFII)F")
	private float method427(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray1[arg1][1][arg2] - this.anIntArrayArrayArray1[arg1][0][arg2]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method426(local34);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("55675, " + 887 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "(IZF)I")
	public int method428(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(31) float local31;
			if (arg0 == 0) {
				local31 = (float) this.anIntArray152[0] + (float) (this.anIntArray152[1] - this.anIntArray152[0]) * arg1;
				@Pc(35) float local35 = local31 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local35 / 20.0F));
				anInt640 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray151[arg0] == 0) {
				return 0;
			}
			local31 = this.method425((byte) 1, arg1, 0, arg0);
			aFloatArrayArray1[arg0][0] = -2.0F * local31 * (float) Math.cos((double) this.method427(arg1, arg0, 0));
			aFloatArrayArray1[arg0][1] = local31 * local31;
			for (@Pc(90) int local90 = 1; local90 < this.anIntArray151[arg0]; local90++) {
				local31 = this.method425((byte) 1, arg1, local90, arg0);
				@Pc(113) float local113 = -2.0F * local31 * (float) Math.cos((double) this.method427(arg1, arg0, local90));
				@Pc(117) float local117 = local31 * local31;
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
				for (local243 = 0; local243 < this.anIntArray151[0] * 2; local243++) {
					aFloatArrayArray1[0][local243] *= aFloat1;
				}
			}
			for (local243 = 0; local243 < this.anIntArray151[arg0] * 2; local243++) {
				anIntArrayArray14[arg0][local243] = (int) (aFloatArrayArray1[arg0][local243] * 65536.0F);
			}
			return this.anIntArray151[arg0] * 2;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("25580, " + arg0 + ", " + false + ", " + arg1 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XALWVYUP", name = "a", descriptor = "(Lclient!JZEFIVMF;Lclient!FTMSICIZ;I)V")
	public void method429(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class4_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method102();
			this.anIntArray151[0] = local4 >> 4;
			this.anIntArray151[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray152[0] = this.anIntArray152[1] = 0;
			} else {
				this.anIntArray152[0] = arg1.method104();
				this.anIntArray152[1] = arg1.method104();
				@Pc(39) int local39 = arg1.method102();
				@Pc(45) int local45;
				for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
					for (local45 = 0; local45 < this.anIntArray151[local41]; local45++) {
						this.anIntArrayArrayArray1[local41][0][local45] = arg1.method104();
						this.anIntArrayArrayArray2[local41][0][local45] = arg1.method104();
					}
				}
				for (local45 = 0; local45 < 2; local45++) {
					for (@Pc(84) int local84 = 0; local84 < this.anIntArray151[local45]; local84++) {
						if ((local39 & 0x1 << local45 * 4 << local84) == 0) {
							this.anIntArrayArrayArray1[local45][1][local84] = this.anIntArrayArrayArray1[local45][0][local84];
							this.anIntArrayArrayArray2[local45][1][local84] = this.anIntArrayArrayArray2[local45][0][local84];
						} else {
							this.anIntArrayArrayArray1[local45][1][local84] = arg1.method104();
							this.anIntArrayArrayArray2[local45][1][local84] = arg1.method104();
						}
					}
				}
				if (local39 != 0 || this.anIntArray152[1] != this.anIntArray152[0]) {
					arg0.method217(arg1);
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("59281, " + arg0 + ", " + arg1 + ", " + -5817 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
