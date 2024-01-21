import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EWUYFKZT")
public final class Class10 {

	@OriginalMember(owner = "client!EWUYFKZT", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!EWUYFKZT", name = "j", descriptor = "I")
	public static int anInt164;

	@OriginalMember(owner = "client!EWUYFKZT", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!EWUYFKZT", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[2][8];

	@OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "I")
	private int anInt163 = 731;

	@OriginalMember(owner = "client!EWUYFKZT", name = "b", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!EWUYFKZT", name = "c", descriptor = "[I")
	public int[] anIntArray36 = new int[2];

	@OriginalMember(owner = "client!EWUYFKZT", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!EWUYFKZT", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!EWUYFKZT", name = "f", descriptor = "[I")
	private int[] anIntArray37 = new int[2];

	@OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "(IFZI)F")
	private float method69(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg0][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray4[arg0][1][arg2] - this.anIntArrayArrayArray4[arg0][0][arg2]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("75075, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "(FB)F")
	private float method70(@OriginalArg(0) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("12452, " + arg0 + ", " + -22 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "(IIIF)F")
	private float method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray3[arg1][1][arg0] - this.anIntArrayArrayArray3[arg1][0][arg0]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method70(local34);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("52752, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "(IIF)I")
	public int method72(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray37[0] + (float) (this.anIntArray37[1] - this.anIntArray37[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt164 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray36[arg0] == 0) {
				return 0;
			}
			local22 = this.method69(arg0, arg1, 0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method71(0, arg0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(87) int local87 = 1; local87 < this.anIntArray36[arg0]; local87++) {
				local22 = this.method69(arg0, arg1, local87);
				@Pc(110) float local110 = -2.0F * local22 * (float) Math.cos((double) this.method71(local87, arg0, arg1));
				@Pc(114) float local114 = local22 * local22;
				aFloatArrayArray1[arg0][local87 * 2 + 1] = aFloatArrayArray1[arg0][local87 * 2 - 1] * local114;
				aFloatArrayArray1[arg0][local87 * 2] = aFloatArrayArray1[arg0][local87 * 2 - 1] * local110 + aFloatArrayArray1[arg0][local87 * 2 - 2] * local114;
				for (@Pc(170) int local170 = local87 * 2 - 1; local170 >= 2; local170--) {
					aFloatArrayArray1[arg0][local170] += aFloatArrayArray1[arg0][local170 - 1] * local110 + aFloatArrayArray1[arg0][local170 - 2] * local114;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local110 + local114;
				aFloatArrayArray1[arg0][0] += local110;
			}
			@Pc(240) int local240;
			if (arg0 == 0) {
				for (local240 = 0; local240 < this.anIntArray36[0] * 2; local240++) {
					aFloatArrayArray1[0][local240] *= aFloat1;
				}
			}
			for (local240 = 0; local240 < this.anIntArray36[arg0] * 2; local240++) {
				anIntArrayArray5[arg0][local240] = (int) (aFloatArrayArray1[arg0][local240] * 65536.0F);
			}
			return this.anIntArray36[arg0] * 2;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("89913, " + -1766 + ", " + arg0 + ", " + arg1 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWUYFKZT", name = "a", descriptor = "(Lclient!TKPFKOXP;ILclient!VRTTZTTM;)V")
	public void method73(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(2) Class43 arg1) {
		try {
			@Pc(14) int local14 = arg0.method492();
			this.anIntArray36[0] = local14 >> 4;
			this.anIntArray36[1] = local14 & 0xF;
			if (local14 == 0) {
				this.anIntArray37[0] = this.anIntArray37[1] = 0;
			} else {
				this.anIntArray37[0] = arg0.method494();
				this.anIntArray37[1] = arg0.method494();
				@Pc(45) int local45 = arg0.method492();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray36[local47]; local51++) {
						this.anIntArrayArrayArray3[local47][0][local51] = arg0.method494();
						this.anIntArrayArrayArray4[local47][0][local51] = arg0.method494();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray36[local51]; local90++) {
						if ((local45 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray3[local51][1][local90] = this.anIntArrayArrayArray3[local51][0][local90];
							this.anIntArrayArrayArray4[local51][1][local90] = this.anIntArrayArrayArray4[local51][0][local90];
						} else {
							this.anIntArrayArrayArray3[local51][1][local90] = arg0.method494();
							this.anIntArrayArrayArray4[local51][1][local90] = arg0.method494();
						}
					}
				}
				if (local45 != 0 || this.anIntArray37[1] != this.anIntArray37[0]) {
					arg1.method546(arg0);
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("72693, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}
}
