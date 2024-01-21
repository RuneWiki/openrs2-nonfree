import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QPCNAGNU")
public final class Class39 {

	@OriginalMember(owner = "client!QPCNAGNU", name = "h", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!QPCNAGNU", name = "i", descriptor = "I")
	public static int anInt585;

	@OriginalMember(owner = "client!QPCNAGNU", name = "f", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!QPCNAGNU", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[2][8];

	@OriginalMember(owner = "client!QPCNAGNU", name = "a", descriptor = "I")
	private int anInt584 = 6;

	@OriginalMember(owner = "client!QPCNAGNU", name = "b", descriptor = "[I")
	public int[] anIntArray113 = new int[2];

	@OriginalMember(owner = "client!QPCNAGNU", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!QPCNAGNU", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!QPCNAGNU", name = "e", descriptor = "[I")
	private int[] anIntArray114 = new int[2];

	@OriginalMember(owner = "client!QPCNAGNU", name = "a", descriptor = "(FIBI)F")
	private float method284(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg2][0][arg1] + arg0 * (float) (this.anIntArrayArrayArray2[arg2][1][arg1] - this.anIntArrayArrayArray2[arg2][0][arg1]);
			@Pc(40) float local40 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local40 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("90876, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPCNAGNU", name = "a", descriptor = "(FB)F")
	private float method285(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			@Pc(12) boolean local12 = false;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("9601, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPCNAGNU", name = "a", descriptor = "(IFII)F")
	private float method286(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray1[arg2][1][arg0] - this.anIntArrayArrayArray1[arg2][0][arg0]);
			@Pc(39) float local39 = local30 * 1.2207031E-4F;
			return this.method285(local39, (byte) 5);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("24722, " + arg0 + ", " + arg1 + ", " + -274 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPCNAGNU", name = "a", descriptor = "(IIF)I")
	public int method287(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray114[0] + (float) (this.anIntArray114[1] - this.anIntArray114[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt585 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray113[arg0] == 0) {
				return 0;
			}
			local22 = this.method284(arg1, 0, arg0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method286(0, arg1, arg0));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(85) int local85 = 1; local85 < this.anIntArray113[arg0]; local85++) {
				local22 = this.method284(arg1, local85, arg0);
				@Pc(108) float local108 = -2.0F * local22 * (float) Math.cos((double) this.method286(local85, arg1, arg0));
				@Pc(112) float local112 = local22 * local22;
				aFloatArrayArray1[arg0][local85 * 2 + 1] = aFloatArrayArray1[arg0][local85 * 2 - 1] * local112;
				aFloatArrayArray1[arg0][local85 * 2] = aFloatArrayArray1[arg0][local85 * 2 - 1] * local108 + aFloatArrayArray1[arg0][local85 * 2 - 2] * local112;
				for (@Pc(168) int local168 = local85 * 2 - 1; local168 >= 2; local168--) {
					aFloatArrayArray1[arg0][local168] += aFloatArrayArray1[arg0][local168 - 1] * local108 + aFloatArrayArray1[arg0][local168 - 2] * local112;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local108 + local112;
				aFloatArrayArray1[arg0][0] += local108;
			}
			@Pc(238) int local238;
			if (arg0 == 0) {
				for (local238 = 0; local238 < this.anIntArray113[0] * 2; local238++) {
					aFloatArrayArray1[0][local238] *= aFloat1;
				}
			}
			for (local238 = 0; local238 < this.anIntArray113[arg0] * 2; local238++) {
				anIntArrayArray7[arg0][local238] = (int) (aFloatArrayArray1[arg0][local238] * 65536.0F);
			}
			return this.anIntArray113[arg0] * 2;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("17563, " + arg0 + ", " + -103 + ", " + arg1 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPCNAGNU", name = "a", descriptor = "(Lclient!JDDBCSRY;ILclient!XGRGMPUQ;)V")
	public void method288(@OriginalArg(0) Class21 arg0, @OriginalArg(2) Class5_Sub1_Sub4 arg1) {
		try {
			@Pc(4) int local4 = arg1.method437();
			this.anIntArray113[0] = local4 >> 4;
			this.anIntArray113[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray114[0] = this.anIntArray114[1] = 0;
			} else {
				this.anIntArray114[0] = arg1.method439();
				this.anIntArray114[1] = arg1.method439();
				@Pc(38) int local38 = arg1.method437();
				@Pc(44) int local44;
				for (@Pc(40) int local40 = 0; local40 < 2; local40++) {
					for (local44 = 0; local44 < this.anIntArray113[local40]; local44++) {
						this.anIntArrayArrayArray1[local40][0][local44] = arg1.method439();
						this.anIntArrayArrayArray2[local40][0][local44] = arg1.method439();
					}
				}
				for (local44 = 0; local44 < 2; local44++) {
					for (@Pc(83) int local83 = 0; local83 < this.anIntArray113[local44]; local83++) {
						if ((local38 & 0x1 << local44 * 4 << local83) == 0) {
							this.anIntArrayArrayArray1[local44][1][local83] = this.anIntArrayArrayArray1[local44][0][local83];
							this.anIntArrayArrayArray2[local44][1][local83] = this.anIntArrayArrayArray2[local44][0][local83];
						} else {
							this.anIntArrayArrayArray1[local44][1][local83] = arg1.method439();
							this.anIntArrayArrayArray2[local44][1][local83] = arg1.method439();
						}
					}
				}
				if (local38 != 0 || this.anIntArray114[1] != this.anIntArray114[0]) {
					arg0.method152(arg1);
				}
			}
		} catch (@Pc(188) RuntimeException local188) {
			signlink.reporterror("15014, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local188.toString());
			throw new RuntimeException();
		}
	}
}
