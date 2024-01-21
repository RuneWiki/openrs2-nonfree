import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public static int anInt179;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private int anInt178;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	private boolean aBoolean34 = true;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	private int[] anIntArray19 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIF)F")
	private float method51(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(36) float local36 = (float) this.anIntArrayArrayArray2[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray2[arg0][1][arg1] - this.anIntArrayArrayArray2[arg0][0][arg1]);
			@Pc(40) float local40 = local36 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local40 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("62431, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BF)F")
	private float method52(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("87252, " + -13 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FIII)F")
	private float method53(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(37) float local37 = (float) this.anIntArrayArrayArray1[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray1[arg1][1][arg2] - this.anIntArrayArrayArray1[arg1][0][arg2]);
			@Pc(41) float local41 = local37 * 1.2207031E-4F;
			return this.method52(local41);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("70095, " + arg0 + ", " + arg1 + ", " + -3031 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FIB)I")
	public int method54(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray19[0] + (float) (this.anIntArray19[1] - this.anIntArray19[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt179 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray18[arg1] == 0) {
				return 0;
			}
			local22 = this.method51(arg1, 0, arg0);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method53(arg0, arg1, 0));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(81) int local81 = 1; local81 < this.anIntArray18[arg1]; local81++) {
				local22 = this.method51(arg1, local81, arg0);
				@Pc(104) float local104 = -2.0F * local22 * (float) Math.cos((double) this.method53(arg0, arg1, local81));
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
				for (local240 = 0; local240 < this.anIntArray18[0] * 2; local240++) {
					aFloatArrayArray1[0][local240] *= aFloat1;
				}
			}
			for (local240 = 0; local240 < this.anIntArray18[arg1] * 2; local240++) {
				anIntArrayArray1[arg1][local240] = (int) (aFloatArrayArray1[arg1][local240] * 65536.0F);
			}
			return this.anIntArray18[arg1] * 2;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("95255, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLclient!lb;Lclient!ac;)V")
	public void method55(@OriginalArg(1) Class1_Sub1_Sub3 arg0, @OriginalArg(2) Class2 arg1) {
		try {
			@Pc(4) int local4 = arg0.method480();
			this.anIntArray18[0] = local4 >> 4;
			this.anIntArray18[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray19[0] = this.anIntArray19[1] = 0;
			} else {
				this.anIntArray19[0] = arg0.method482();
				this.anIntArray19[1] = arg0.method482();
				@Pc(45) int local45 = arg0.method480();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray18[local47]; local51++) {
						this.anIntArrayArrayArray1[local47][0][local51] = arg0.method482();
						this.anIntArrayArrayArray2[local47][0][local51] = arg0.method482();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray18[local51]; local90++) {
						if ((local45 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray1[local51][1][local90] = this.anIntArrayArrayArray1[local51][0][local90];
							this.anIntArrayArrayArray2[local51][1][local90] = this.anIntArrayArrayArray2[local51][0][local90];
						} else {
							this.anIntArrayArrayArray1[local51][1][local90] = arg0.method482();
							this.anIntArrayArrayArray2[local51][1][local90] = arg0.method482();
						}
					}
				}
				if (local45 != 0 || this.anIntArray19[1] != this.anIntArray19[0]) {
					arg1.method43(arg0);
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("58842, " + true + ", " + arg0 + ", " + arg1 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}
}
