import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BMQRLUHC")
public final class Class5 {

	@OriginalMember(owner = "client!BMQRLUHC", name = "h", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!BMQRLUHC", name = "i", descriptor = "I")
	public static int anInt26;

	@OriginalMember(owner = "client!BMQRLUHC", name = "f", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!BMQRLUHC", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[2][8];

	@OriginalMember(owner = "client!BMQRLUHC", name = "a", descriptor = "Z")
	private boolean aBoolean16 = true;

	@OriginalMember(owner = "client!BMQRLUHC", name = "b", descriptor = "[I")
	public int[] anIntArray5 = new int[2];

	@OriginalMember(owner = "client!BMQRLUHC", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!BMQRLUHC", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!BMQRLUHC", name = "e", descriptor = "[I")
	private int[] anIntArray6 = new int[2];

	@OriginalMember(owner = "client!BMQRLUHC", name = "a", descriptor = "(IIIF)F")
	private float method65(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(37) float local37 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
			@Pc(41) float local41 = local37 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local41 / 20.0F));
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("70953, " + arg0 + ", " + -42341 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BMQRLUHC", name = "a", descriptor = "(IF)F")
	private float method66(@OriginalArg(1) float arg0) {
		try {
			@Pc(13) float local13 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local13 * 3.1415927F / 11025.0F;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("90021, " + 0 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BMQRLUHC", name = "a", descriptor = "(FIBI)F")
	private float method67(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray1[arg1][1][arg2] - this.anIntArrayArrayArray1[arg1][0][arg2]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method66(local34);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("62456, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BMQRLUHC", name = "a", descriptor = "(IFI)I")
	public int method68(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(32) float local32;
			if (arg1 == 0) {
				local32 = (float) this.anIntArray6[0] + (float) (this.anIntArray6[1] - this.anIntArray6[0]) * arg0;
				@Pc(36) float local36 = local32 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local36 / 20.0F));
				anInt26 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray5[arg1] == 0) {
				return 0;
			}
			local32 = this.method65(arg1, 0, arg0);
			aFloatArrayArray1[arg1][0] = -2.0F * local32 * (float) Math.cos((double) this.method67(arg0, arg1, 0));
			aFloatArrayArray1[arg1][1] = local32 * local32;
			for (@Pc(91) int local91 = 1; local91 < this.anIntArray5[arg1]; local91++) {
				local32 = this.method65(arg1, local91, arg0);
				@Pc(114) float local114 = -2.0F * local32 * (float) Math.cos((double) this.method67(arg0, arg1, local91));
				@Pc(118) float local118 = local32 * local32;
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
				for (local244 = 0; local244 < this.anIntArray5[0] * 2; local244++) {
					aFloatArrayArray1[0][local244] *= aFloat1;
				}
			}
			for (local244 = 0; local244 < this.anIntArray5[arg1] * 2; local244++) {
				anIntArrayArray2[arg1][local244] = (int) (aFloatArrayArray1[arg1][local244] * 65536.0F);
			}
			return this.anIntArray5[arg1] * 2;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("14526, " + -962 + ", " + arg0 + ", " + arg1 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BMQRLUHC", name = "a", descriptor = "(BLclient!PGNBHFUF;Lclient!YJSRODCC;)V")
	public void method69(@OriginalArg(1) Class4_Sub1_Sub4 arg0, @OriginalArg(2) Class45 arg1) {
		try {
			@Pc(4) int local4 = arg0.method355();
			this.anIntArray5[0] = local4 >> 4;
			this.anIntArray5[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray6[0] = this.anIntArray6[1] = 0;
			} else {
				this.anIntArray6[0] = arg0.method357();
				this.anIntArray6[1] = arg0.method357();
				@Pc(39) int local39 = arg0.method355();
				@Pc(45) int local45;
				for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
					for (local45 = 0; local45 < this.anIntArray5[local41]; local45++) {
						this.anIntArrayArrayArray1[local41][0][local45] = arg0.method357();
						this.anIntArrayArrayArray2[local41][0][local45] = arg0.method357();
					}
				}
				for (local45 = 0; local45 < 2; local45++) {
					for (@Pc(84) int local84 = 0; local84 < this.anIntArray5[local45]; local84++) {
						if ((local39 & 0x1 << local45 * 4 << local84) == 0) {
							this.anIntArrayArrayArray1[local45][1][local84] = this.anIntArrayArrayArray1[local45][0][local84];
							this.anIntArrayArrayArray2[local45][1][local84] = this.anIntArrayArrayArray2[local45][0][local84];
						} else {
							this.anIntArrayArrayArray1[local45][1][local84] = arg0.method357();
							this.anIntArrayArrayArray2[local45][1][local84] = arg0.method357();
						}
					}
				}
				if (local39 != 0 || this.anIntArray6[1] != this.anIntArray6[0]) {
					arg1.method542(arg0);
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("68595, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
