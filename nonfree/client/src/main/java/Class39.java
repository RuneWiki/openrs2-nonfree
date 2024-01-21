import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WSKKAWXJ")
public final class Class39 {

	@OriginalMember(owner = "client!WSKKAWXJ", name = "h", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!WSKKAWXJ", name = "i", descriptor = "I")
	public static int anInt743;

	@OriginalMember(owner = "client!WSKKAWXJ", name = "f", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!WSKKAWXJ", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[2][8];

	@OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!WSKKAWXJ", name = "b", descriptor = "[I")
	public int[] anIntArray191 = new int[2];

	@OriginalMember(owner = "client!WSKKAWXJ", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!WSKKAWXJ", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!WSKKAWXJ", name = "e", descriptor = "[I")
	private int[] anIntArray192 = new int[2];

	@OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "(FIII)F")
	private float method506(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg2][0][arg1] + arg0 * (float) (this.anIntArrayArrayArray6[arg2][1][arg1] - this.anIntArrayArrayArray6[arg2][0][arg1]);
			@Pc(41) float local41 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local41 / 20.0F));
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("67040, " + arg0 + ", " + arg1 + ", " + -15313 + ", " + arg2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "(BF)F")
	private float method507(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("27706, " + 85 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "(IIFI)F")
	private float method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		try {
			@Pc(41) float local41 = (float) this.anIntArrayArrayArray5[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray5[arg0][1][arg1] - this.anIntArrayArrayArray5[arg0][0][arg1]);
			@Pc(45) float local45 = local41 * 1.2207031E-4F;
			return this.method507(local45);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("35826, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 15950 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "(FIZ)I")
	public int method509(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray192[0] + (float) (this.anIntArray192[1] - this.anIntArray192[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt743 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray191[arg1] == 0) {
				return 0;
			}
			local22 = this.method506(arg0, 0, arg1);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method508(arg1, 0, arg0));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(81) int local81 = 1; local81 < this.anIntArray191[arg1]; local81++) {
				local22 = this.method506(arg0, local81, arg1);
				@Pc(104) float local104 = -2.0F * local22 * (float) Math.cos((double) this.method508(arg1, local81, arg0));
				@Pc(108) float local108 = local22 * local22;
				aFloatArrayArray1[arg1][local81 * 2 + 1] = aFloatArrayArray1[arg1][local81 * 2 - 1] * local108;
				aFloatArrayArray1[arg1][local81 * 2] = aFloatArrayArray1[arg1][local81 * 2 - 1] * local104 + aFloatArrayArray1[arg1][local81 * 2 - 2] * local108;
				for (@Pc(164) int local164 = local81 * 2 - 1; local164 >= 2; local164--) {
					aFloatArrayArray1[arg1][local164] += aFloatArrayArray1[arg1][local164 - 1] * local104 + aFloatArrayArray1[arg1][local164 - 2] * local108;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local104 + local108;
				aFloatArrayArray1[arg1][0] += local104;
			}
			@Pc(243) int local243;
			if (arg1 == 0) {
				for (local243 = 0; local243 < this.anIntArray191[0] * 2; local243++) {
					aFloatArrayArray1[0][local243] *= aFloat1;
				}
			}
			for (local243 = 0; local243 < this.anIntArray191[arg1] * 2; local243++) {
				anIntArrayArray20[arg1][local243] = (int) (aFloatArrayArray1[arg1][local243] * 65536.0F);
			}
			return this.anIntArray191[arg1] * 2;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("76516, " + arg0 + ", " + arg1 + ", " + false + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSKKAWXJ", name = "a", descriptor = "(Lclient!WBEWPIXO;Lclient!GTUIGVXS;I)V")
	public void method510(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg0.method468();
			this.anIntArray191[0] = local4 >> 4;
			@Pc(16) int local16;
			if (arg2 != 6) {
				for (local16 = 1; local16 > 0; local16++) {
				}
			}
			this.anIntArray191[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray192[0] = this.anIntArray192[1] = 0;
			} else {
				this.anIntArray192[0] = arg0.method470();
				this.anIntArray192[1] = arg0.method470();
				local16 = arg0.method468();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray191[local47]; local51++) {
						this.anIntArrayArrayArray5[local47][0][local51] = arg0.method470();
						this.anIntArrayArrayArray6[local47][0][local51] = arg0.method470();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray191[local51]; local90++) {
						if ((local16 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray5[local51][1][local90] = this.anIntArrayArrayArray5[local51][0][local90];
							this.anIntArrayArrayArray6[local51][1][local90] = this.anIntArrayArrayArray6[local51][0][local90];
						} else {
							this.anIntArrayArrayArray5[local51][1][local90] = arg0.method470();
							this.anIntArrayArrayArray6[local51][1][local90] = arg0.method470();
						}
					}
				}
				if (local16 != 0 || this.anIntArray192[1] != this.anIntArray192[0]) {
					arg1.method151(arg0);
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("54617, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}
}
