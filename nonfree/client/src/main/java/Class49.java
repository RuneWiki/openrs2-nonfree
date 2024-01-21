import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZENSICXR")
public final class Class49 {

	@OriginalMember(owner = "client!ZENSICXR", name = "m", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!ZENSICXR", name = "n", descriptor = "I")
	public static int anInt781;

	@OriginalMember(owner = "client!ZENSICXR", name = "k", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ZENSICXR", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[2][8];

	@OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "I")
	private int anInt780 = -742;

	@OriginalMember(owner = "client!ZENSICXR", name = "b", descriptor = "B")
	private byte aByte25 = 1;

	@OriginalMember(owner = "client!ZENSICXR", name = "c", descriptor = "B")
	private byte aByte26 = 93;

	@OriginalMember(owner = "client!ZENSICXR", name = "d", descriptor = "B")
	private byte aByte27 = 8;

	@OriginalMember(owner = "client!ZENSICXR", name = "e", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!ZENSICXR", name = "f", descriptor = "Z")
	private boolean aBoolean191 = true;

	@OriginalMember(owner = "client!ZENSICXR", name = "g", descriptor = "[I")
	public int[] anIntArray202 = new int[2];

	@OriginalMember(owner = "client!ZENSICXR", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!ZENSICXR", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!ZENSICXR", name = "j", descriptor = "[I")
	private int[] anIntArray203 = new int[2];

	@OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "(IFBI)F")
	private float method541(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray6[arg2][1][arg0] - this.anIntArrayArrayArray6[arg2][0][arg0]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			if (this.aByte25 != 1) {
				for (@Pc(40) int local40 = 1; local40 > 0; local40++) {
				}
			}
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("67009, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "(FB)F")
	private float method542(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			if (arg1 != 93) {
				for (@Pc(12) int local12 = 1; local12 > 0; local12++) {
				}
			}
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("89082, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "(IIFI)F")
	private float method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray5[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray5[arg1][1][arg0] - this.anIntArrayArrayArray5[arg1][0][arg0]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method542(local34, this.aByte26);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("10787, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -64 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "(IFB)I")
	public int method544(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray203[0] + (float) (this.anIntArray203[1] - this.anIntArray203[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt781 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray202[arg0] == 0) {
				return 0;
			}
			local22 = this.method541(0, arg1, arg0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method543(0, arg0, arg1));
			if (this.aByte27 != 8) {
				return this.anInt780;
			}
			@Pc(77) boolean local77 = false;
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(91) int local91 = 1; local91 < this.anIntArray202[arg0]; local91++) {
				local22 = this.method541(local91, arg1, arg0);
				@Pc(115) float local115 = -2.0F * local22 * (float) Math.cos((double) this.method543(local91, arg0, arg1));
				@Pc(119) float local119 = local22 * local22;
				aFloatArrayArray1[arg0][local91 * 2 + 1] = aFloatArrayArray1[arg0][local91 * 2 - 1] * local119;
				aFloatArrayArray1[arg0][local91 * 2] = aFloatArrayArray1[arg0][local91 * 2 - 1] * local115 + aFloatArrayArray1[arg0][local91 * 2 - 2] * local119;
				for (@Pc(175) int local175 = local91 * 2 - 1; local175 >= 2; local175--) {
					aFloatArrayArray1[arg0][local175] += aFloatArrayArray1[arg0][local175 - 1] * local115 + aFloatArrayArray1[arg0][local175 - 2] * local119;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local115 + local119;
				aFloatArrayArray1[arg0][0] += local115;
			}
			@Pc(245) int local245;
			if (arg0 == 0) {
				for (local245 = 0; local245 < this.anIntArray202[0] * 2; local245++) {
					aFloatArrayArray1[0][local245] *= aFloat1;
				}
			}
			for (local245 = 0; local245 < this.anIntArray202[arg0] * 2; local245++) {
				anIntArrayArray21[arg0][local245] = (int) (aFloatArrayArray1[arg0][local245] * 65536.0F);
			}
			return this.anIntArray202[arg0] * 2;
		} catch (@Pc(299) RuntimeException local299) {
			signlink.reporterror("76935, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local299.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZENSICXR", name = "a", descriptor = "(Lclient!HXORSAZH;ILclient!TQYMAXSO;)V")
	public void method545(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(4) int local4 = arg1.method406();
			this.anIntArray202[0] = local4 >> 4;
			this.anIntArray202[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray203[0] = this.anIntArray203[1] = 0;
			} else {
				this.anIntArray203[0] = arg1.method408();
				this.anIntArray203[1] = arg1.method408();
				@Pc(45) int local45 = arg1.method406();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray202[local47]; local51++) {
						this.anIntArrayArrayArray5[local47][0][local51] = arg1.method408();
						this.anIntArrayArrayArray6[local47][0][local51] = arg1.method408();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray202[local51]; local90++) {
						if ((local45 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray5[local51][1][local90] = this.anIntArrayArrayArray5[local51][0][local90];
							this.anIntArrayArrayArray6[local51][1][local90] = this.anIntArrayArrayArray6[local51][0][local90];
						} else {
							this.anIntArrayArrayArray5[local51][1][local90] = arg1.method408();
							this.anIntArrayArrayArray6[local51][1][local90] = arg1.method408();
						}
					}
				}
				if (local45 != 0 || this.anIntArray203[1] != this.anIntArray203[0]) {
					arg0.method113(arg1);
				}
			}
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("88955, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}
}
