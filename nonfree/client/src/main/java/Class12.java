import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ERCNIFTI")
public final class Class12 {

	@OriginalMember(owner = "client!ERCNIFTI", name = "j", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!ERCNIFTI", name = "k", descriptor = "I")
	public static int anInt249;

	@OriginalMember(owner = "client!ERCNIFTI", name = "h", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ERCNIFTI", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray3 = new int[2][8];

	@OriginalMember(owner = "client!ERCNIFTI", name = "a", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!ERCNIFTI", name = "b", descriptor = "I")
	private int anInt248 = -667;

	@OriginalMember(owner = "client!ERCNIFTI", name = "c", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!ERCNIFTI", name = "d", descriptor = "[I")
	public int[] anIntArray34 = new int[2];

	@OriginalMember(owner = "client!ERCNIFTI", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!ERCNIFTI", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!ERCNIFTI", name = "g", descriptor = "[I")
	private int[] anIntArray35 = new int[2];

	@OriginalMember(owner = "client!ERCNIFTI", name = "a", descriptor = "(FIII)F")
	private float method147(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray4[arg1][1][arg2] - this.anIntArrayArrayArray4[arg1][0][arg2]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("6923, " + arg0 + ", " + arg1 + ", " + 6 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ERCNIFTI", name = "a", descriptor = "(IF)F")
	private float method148(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		try {
			if (arg0 >= 0) {
				this.aBoolean60 = !this.aBoolean60;
			}
			@Pc(17) float local17 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
			return local17 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("87511, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ERCNIFTI", name = "a", descriptor = "(IIIF)F")
	private float method149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method148(this.anInt248, local34);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("91543, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ERCNIFTI", name = "a", descriptor = "(FII)I")
	public int method150(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray35[0] + (float) (this.anIntArray35[1] - this.anIntArray35[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt249 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray34[arg1] == 0) {
				return 0;
			}
			local22 = this.method147(arg0, arg1, 0);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method149(arg1, 0, arg0));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(91) int local91 = 1; local91 < this.anIntArray34[arg1]; local91++) {
				local22 = this.method147(arg0, arg1, local91);
				@Pc(114) float local114 = -2.0F * local22 * (float) Math.cos((double) this.method149(arg1, local91, arg0));
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
				for (local244 = 0; local244 < this.anIntArray34[0] * 2; local244++) {
					aFloatArrayArray1[0][local244] *= aFloat1;
				}
			}
			for (local244 = 0; local244 < this.anIntArray34[arg1] * 2; local244++) {
				anIntArrayArray3[arg1][local244] = (int) (aFloatArrayArray1[arg1][local244] * 65536.0F);
			}
			return this.anIntArray34[arg1] * 2;
		} catch (@Pc(298) RuntimeException local298) {
			signlink.reporterror("46752, " + arg0 + ", " + arg1 + ", " + -227 + ", " + local298.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ERCNIFTI", name = "a", descriptor = "(ZLclient!LDILQFVA;Lclient!NXAZLFDC;)V")
	public void method151(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) Class27 arg2) {
		try {
			@Pc(5) int local5;
			if (arg0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			local5 = arg1.method359();
			this.anIntArray34[0] = local5 >> 4;
			this.anIntArray34[1] = local5 & 0xF;
			if (local5 == 0) {
				this.anIntArray35[0] = this.anIntArray35[1] = 0;
			} else {
				this.anIntArray35[0] = arg1.method361();
				this.anIntArray35[1] = arg1.method361();
				@Pc(44) int local44 = arg1.method359();
				@Pc(50) int local50;
				for (@Pc(46) int local46 = 0; local46 < 2; local46++) {
					for (local50 = 0; local50 < this.anIntArray34[local46]; local50++) {
						this.anIntArrayArrayArray3[local46][0][local50] = arg1.method361();
						this.anIntArrayArrayArray4[local46][0][local50] = arg1.method361();
					}
				}
				for (local50 = 0; local50 < 2; local50++) {
					for (@Pc(89) int local89 = 0; local89 < this.anIntArray34[local50]; local89++) {
						if ((local44 & 0x1 << local50 * 4 << local89) == 0) {
							this.anIntArrayArrayArray3[local50][1][local89] = this.anIntArrayArrayArray3[local50][0][local89];
							this.anIntArrayArrayArray4[local50][1][local89] = this.anIntArrayArrayArray4[local50][0][local89];
						} else {
							this.anIntArrayArrayArray3[local50][1][local89] = arg1.method361();
							this.anIntArrayArrayArray4[local50][1][local89] = arg1.method361();
						}
					}
				}
				if (local44 != 0 || this.anIntArray35[1] != this.anIntArray35[0]) {
					arg2.method474(arg1);
				}
			}
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("6741, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local194.toString());
			throw new RuntimeException();
		}
	}
}
