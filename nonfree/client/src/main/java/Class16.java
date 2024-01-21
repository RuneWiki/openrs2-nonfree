import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LOQKYCGM")
public final class Class16 {

	@OriginalMember(owner = "client!LOQKYCGM", name = "j", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!LOQKYCGM", name = "k", descriptor = "I")
	public static int anInt425;

	@OriginalMember(owner = "client!LOQKYCGM", name = "h", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!LOQKYCGM", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[2][8];

	@OriginalMember(owner = "client!LOQKYCGM", name = "a", descriptor = "I")
	private int anInt424 = 8;

	@OriginalMember(owner = "client!LOQKYCGM", name = "b", descriptor = "B")
	private byte aByte15 = 19;

	@OriginalMember(owner = "client!LOQKYCGM", name = "c", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!LOQKYCGM", name = "d", descriptor = "[I")
	public int[] anIntArray59 = new int[2];

	@OriginalMember(owner = "client!LOQKYCGM", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!LOQKYCGM", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!LOQKYCGM", name = "g", descriptor = "[I")
	private int[] anIntArray60 = new int[2];

	@OriginalMember(owner = "client!LOQKYCGM", name = "a", descriptor = "(FIII)F")
	private float method216(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray2[arg1][1][arg2] - this.anIntArrayArrayArray2[arg1][0][arg2]);
			@Pc(44) float local44 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local44 / 20.0F));
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("57694, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOQKYCGM", name = "a", descriptor = "(ZF)F")
	private float method217(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("14799, " + true + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOQKYCGM", name = "a", descriptor = "(IIIF)F")
	private float method218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(34) float local34 = (float) this.anIntArrayArrayArray1[arg0][0][arg2] + arg3 * (float) (this.anIntArrayArrayArray1[arg0][1][arg2] - this.anIntArrayArrayArray1[arg0][0][arg2]);
			@Pc(38) float local38 = local34 * 1.2207031E-4F;
			return this.method217(local38);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("54623, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOQKYCGM", name = "a", descriptor = "(FIB)I")
	public int method219(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aByte15 != 19) {
				this.aBoolean82 = !this.aBoolean82;
			}
			@Pc(34) float local34;
			if (arg1 == 0) {
				local34 = (float) this.anIntArray60[0] + (float) (this.anIntArray60[1] - this.anIntArray60[0]) * arg0;
				@Pc(38) float local38 = local34 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local38 / 20.0F));
				anInt425 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray59[arg1] == 0) {
				return 0;
			}
			local34 = this.method216(arg0, arg1, 0);
			aFloatArrayArray1[arg1][0] = -2.0F * local34 * (float) Math.cos((double) this.method218(arg1, 269, 0, arg0));
			aFloatArrayArray1[arg1][1] = local34 * local34;
			for (@Pc(93) int local93 = 1; local93 < this.anIntArray59[arg1]; local93++) {
				local34 = this.method216(arg0, arg1, local93);
				@Pc(116) float local116 = -2.0F * local34 * (float) Math.cos((double) this.method218(arg1, 269, local93, arg0));
				@Pc(120) float local120 = local34 * local34;
				aFloatArrayArray1[arg1][local93 * 2 + 1] = aFloatArrayArray1[arg1][local93 * 2 - 1] * local120;
				aFloatArrayArray1[arg1][local93 * 2] = aFloatArrayArray1[arg1][local93 * 2 - 1] * local116 + aFloatArrayArray1[arg1][local93 * 2 - 2] * local120;
				for (@Pc(176) int local176 = local93 * 2 - 1; local176 >= 2; local176--) {
					aFloatArrayArray1[arg1][local176] += aFloatArrayArray1[arg1][local176 - 1] * local116 + aFloatArrayArray1[arg1][local176 - 2] * local120;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local116 + local120;
				aFloatArrayArray1[arg1][0] += local116;
			}
			@Pc(246) int local246;
			if (arg1 == 0) {
				for (local246 = 0; local246 < this.anIntArray59[0] * 2; local246++) {
					aFloatArrayArray1[0][local246] *= aFloat1;
				}
			}
			for (local246 = 0; local246 < this.anIntArray59[arg1] * 2; local246++) {
				anIntArrayArray5[arg1][local246] = (int) (aFloatArrayArray1[arg1][local246] * 65536.0F);
			}
			return this.anIntArray59[arg1] * 2;
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("17583, " + arg0 + ", " + arg1 + ", " + 19 + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOQKYCGM", name = "a", descriptor = "(ILclient!TMVRZUVH;Lclient!GHHPHSRU;)V")
	public void method220(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class3_Sub1_Sub2 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) int local8 = arg2.method89();
			this.anIntArray59[0] = local8 >> 4;
			this.anIntArray59[1] = local8 & 0xF;
			if (local8 == 0) {
				this.anIntArray60[0] = this.anIntArray60[1] = 0;
			} else {
				this.anIntArray60[0] = arg2.method91();
				this.anIntArray60[1] = arg2.method91();
				@Pc(39) int local39 = arg2.method89();
				@Pc(45) int local45;
				for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
					for (local45 = 0; local45 < this.anIntArray59[local41]; local45++) {
						this.anIntArrayArrayArray1[local41][0][local45] = arg2.method91();
						this.anIntArrayArrayArray2[local41][0][local45] = arg2.method91();
					}
				}
				for (local45 = 0; local45 < 2; local45++) {
					for (@Pc(84) int local84 = 0; local84 < this.anIntArray59[local45]; local84++) {
						if ((local39 & 0x1 << local45 * 4 << local84) == 0) {
							this.anIntArrayArrayArray1[local45][1][local84] = this.anIntArrayArrayArray1[local45][0][local84];
							this.anIntArrayArrayArray2[local45][1][local84] = this.anIntArrayArrayArray2[local45][0][local84];
						} else {
							this.anIntArrayArrayArray1[local45][1][local84] = arg2.method91();
							this.anIntArrayArrayArray2[local45][1][local84] = arg2.method91();
						}
					}
				}
				if (local39 != 0 || this.anIntArray60[1] != this.anIntArray60[0]) {
					arg1.method456(arg2, (byte) 8);
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("5105, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
