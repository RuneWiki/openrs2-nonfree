import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IOYFKQTX")
public final class Class18 {

	@OriginalMember(owner = "client!IOYFKQTX", name = "j", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!IOYFKQTX", name = "k", descriptor = "I")
	public static int anInt417;

	@OriginalMember(owner = "client!IOYFKQTX", name = "h", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!IOYFKQTX", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray9 = new int[2][8];

	@OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "I")
	private int anInt414 = 47998;

	@OriginalMember(owner = "client!IOYFKQTX", name = "b", descriptor = "I")
	private int anInt415 = 5230;

	@OriginalMember(owner = "client!IOYFKQTX", name = "c", descriptor = "I")
	private int anInt416 = 4235;

	@OriginalMember(owner = "client!IOYFKQTX", name = "d", descriptor = "[I")
	public int[] anIntArray67 = new int[2];

	@OriginalMember(owner = "client!IOYFKQTX", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!IOYFKQTX", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!IOYFKQTX", name = "g", descriptor = "[I")
	private int[] anIntArray68 = new int[2];

	@OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "(IIIF)F")
	private float method291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray4[arg1][1][arg0] - this.anIntArrayArrayArray4[arg1][0][arg0]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			if (this.anInt416 != 4235) {
				this.anInt416 = 305;
			}
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("46413, " + arg0 + ", " + 4235 + ", " + arg1 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "(BF)F")
	private float method292(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("79880, " + 46 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "(IIZF)F")
	private float method293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray3[arg1][1][arg0] - this.anIntArrayArrayArray3[arg1][0][arg0]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method292(local34);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("87868, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "(IFI)I")
	public int method294(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray68[0] + (float) (this.anIntArray68[1] - this.anIntArray68[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt417 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray67[arg0] == 0) {
				return 0;
			}
			local22 = this.method291(0, arg0, arg1);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method293(0, arg0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(90) int local90 = 1; local90 < this.anIntArray67[arg0]; local90++) {
				local22 = this.method291(local90, arg0, arg1);
				@Pc(113) float local113 = -2.0F * local22 * (float) Math.cos((double) this.method293(local90, arg0, arg1));
				@Pc(117) float local117 = local22 * local22;
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
				for (local243 = 0; local243 < this.anIntArray67[0] * 2; local243++) {
					aFloatArrayArray1[0][local243] *= aFloat1;
				}
			}
			for (local243 = 0; local243 < this.anIntArray67[arg0] * 2; local243++) {
				anIntArrayArray9[arg0][local243] = (int) (aFloatArrayArray1[arg0][local243] * 65536.0F);
			}
			return this.anIntArray67[arg0] * 2;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("74965, " + arg0 + ", " + arg1 + ", " + 413 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "(Lclient!ANPSASQF;Lclient!EYMNCFMK;I)V")
	public void method295(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(14) int local14 = arg1.method155();
			this.anIntArray67[0] = local14 >> 4;
			this.anIntArray67[1] = local14 & 0xF;
			if (local14 == 0) {
				this.anIntArray68[0] = this.anIntArray68[1] = 0;
			} else {
				this.anIntArray68[0] = arg1.method157();
				this.anIntArray68[1] = arg1.method157();
				@Pc(45) int local45 = arg1.method155();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray67[local47]; local51++) {
						this.anIntArrayArrayArray3[local47][0][local51] = arg1.method157();
						this.anIntArrayArrayArray4[local47][0][local51] = arg1.method157();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray67[local51]; local90++) {
						if ((local45 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray3[local51][1][local90] = this.anIntArrayArrayArray3[local51][0][local90];
							this.anIntArrayArrayArray4[local51][1][local90] = this.anIntArrayArrayArray4[local51][0][local90];
						} else {
							this.anIntArrayArrayArray3[local51][1][local90] = arg1.method157();
							this.anIntArrayArrayArray4[local51][1][local90] = arg1.method157();
						}
					}
				}
				if (local45 != 0 || this.anIntArray68[1] != this.anIntArray68[0]) {
					arg0.method14(arg1, this.anInt415);
				}
			}
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("62180, " + arg0 + ", " + arg1 + ", " + 24145 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
