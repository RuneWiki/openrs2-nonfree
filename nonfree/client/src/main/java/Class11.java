import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EQHIVIBA")
public final class Class11 {

	@OriginalMember(owner = "client!EQHIVIBA", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!EQHIVIBA", name = "j", descriptor = "I")
	public static int anInt165;

	@OriginalMember(owner = "client!EQHIVIBA", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!EQHIVIBA", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[2][8];

	@OriginalMember(owner = "client!EQHIVIBA", name = "a", descriptor = "I")
	private int anInt164 = 566;

	@OriginalMember(owner = "client!EQHIVIBA", name = "b", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!EQHIVIBA", name = "c", descriptor = "[I")
	public int[] anIntArray22 = new int[2];

	@OriginalMember(owner = "client!EQHIVIBA", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!EQHIVIBA", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!EQHIVIBA", name = "f", descriptor = "[I")
	private int[] anIntArray23 = new int[2];

	@OriginalMember(owner = "client!EQHIVIBA", name = "a", descriptor = "(IBIF)F")
	private float method97(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
			@Pc(45) float local45 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local45 / 20.0F));
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("82514, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EQHIVIBA", name = "a", descriptor = "(FB)F")
	private float method98(@OriginalArg(0) float arg0) {
		try {
			@Pc(22) float local22 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local22 * 3.1415927F / 11025.0F;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("78442, " + arg0 + ", " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EQHIVIBA", name = "a", descriptor = "(IFII)F")
	private float method99(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray1[arg2][1][arg0] - this.anIntArrayArrayArray1[arg2][0][arg0]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			@Pc(38) boolean local38 = false;
			return this.method98(local34);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("48557, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EQHIVIBA", name = "a", descriptor = "(IFI)I")
	public int method100(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray23[0] + (float) (this.anIntArray23[1] - this.anIntArray23[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt165 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray22[arg1] == 0) {
				return 0;
			}
			local22 = this.method97(arg1, 0, arg0);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method99(0, arg0, arg1, 279));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(81) int local81 = 1; local81 < this.anIntArray22[arg1]; local81++) {
				local22 = this.method97(arg1, local81, arg0);
				@Pc(104) float local104 = -2.0F * local22 * (float) Math.cos((double) this.method99(local81, arg0, arg1, 279));
				@Pc(108) float local108 = local22 * local22;
				aFloatArrayArray1[arg1][local81 * 2 + 1] = aFloatArrayArray1[arg1][local81 * 2 - 1] * local108;
				aFloatArrayArray1[arg1][local81 * 2] = aFloatArrayArray1[arg1][local81 * 2 - 1] * local104 + aFloatArrayArray1[arg1][local81 * 2 - 2] * local108;
				for (@Pc(164) int local164 = local81 * 2 - 1; local164 >= 2; local164--) {
					aFloatArrayArray1[arg1][local164] += aFloatArrayArray1[arg1][local164 - 1] * local104 + aFloatArrayArray1[arg1][local164 - 2] * local108;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local104 + local108;
				aFloatArrayArray1[arg1][0] += local104;
			}
			@Pc(240) int local240;
			if (arg1 == 0) {
				for (local240 = 0; local240 < this.anIntArray22[0] * 2; local240++) {
					aFloatArrayArray1[0][local240] *= aFloat1;
				}
			}
			for (local240 = 0; local240 < this.anIntArray22[arg1] * 2; local240++) {
				anIntArrayArray5[arg1][local240] = (int) (aFloatArrayArray1[arg1][local240] * 65536.0F);
			}
			return this.anIntArray22[arg1] * 2;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("27520, " + -23989 + ", " + arg0 + ", " + arg1 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EQHIVIBA", name = "a", descriptor = "(Lclient!XJCNBMKS;Lclient!VMVYFNTB;I)V")
	public void method101(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg0.method498();
			this.anIntArray22[0] = local4 >> 4;
			@Pc(15) boolean local15 = false;
			this.anIntArray22[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray23[0] = this.anIntArray23[1] = 0;
			} else {
				this.anIntArray23[0] = arg0.method500();
				this.anIntArray23[1] = arg0.method500();
				@Pc(39) int local39 = arg0.method498();
				@Pc(45) int local45;
				for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
					for (local45 = 0; local45 < this.anIntArray22[local41]; local45++) {
						this.anIntArrayArrayArray1[local41][0][local45] = arg0.method500();
						this.anIntArrayArrayArray2[local41][0][local45] = arg0.method500();
					}
				}
				for (local45 = 0; local45 < 2; local45++) {
					for (@Pc(84) int local84 = 0; local84 < this.anIntArray22[local45]; local84++) {
						if ((local39 & 0x1 << local45 * 4 << local84) == 0) {
							this.anIntArrayArrayArray1[local45][1][local84] = this.anIntArrayArrayArray1[local45][0][local84];
							this.anIntArrayArrayArray2[local45][1][local84] = this.anIntArrayArrayArray2[local45][0][local84];
						} else {
							this.anIntArrayArrayArray1[local45][1][local84] = arg0.method500();
							this.anIntArrayArrayArray2[local45][1][local84] = arg0.method500();
						}
					}
				}
				if (local39 != 0 || this.anIntArray23[1] != this.anIntArray23[0]) {
					arg1.method476(arg0);
				}
			}
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("26700, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local194.toString());
			throw new RuntimeException();
		}
	}
}
