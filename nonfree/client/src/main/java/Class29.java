import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OYVSGGSR")
public final class Class29 {

	@OriginalMember(owner = "client!OYVSGGSR", name = "h", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!OYVSGGSR", name = "i", descriptor = "I")
	public static int anInt378;

	@OriginalMember(owner = "client!OYVSGGSR", name = "f", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!OYVSGGSR", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[2][8];

	@OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!OYVSGGSR", name = "b", descriptor = "[I")
	public int[] anIntArray128 = new int[2];

	@OriginalMember(owner = "client!OYVSGGSR", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!OYVSGGSR", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!OYVSGGSR", name = "e", descriptor = "[I")
	private int[] anIntArray129 = new int[2];

	@OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "(IFII)F")
	private float method220(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray4[arg2][1][arg0] - this.anIntArrayArrayArray4[arg2][0][arg0]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("19190, " + arg0 + ", " + arg1 + ", " + -844 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "(IF)F")
	private float method221(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = 32.703197F * (float) Math.pow(2.0D, (double) arg0);
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("66455, " + 246 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "(IZFI)F")
	private float method222(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray3[arg2][1][arg0] - this.anIntArrayArrayArray3[arg2][0][arg0]);
			@Pc(43) float local43 = local30 * 1.2207031E-4F;
			return this.method221(local43);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("69459, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "(IIF)I")
	public int method223(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray129[0] + (float) (this.anIntArray129[1] - this.anIntArray129[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt378 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray128[arg0] == 0) {
				return 0;
			}
			local22 = this.method220(0, arg1, arg0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method222(0, arg1, arg0));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(81) int local81 = 1; local81 < this.anIntArray128[arg0]; local81++) {
				local22 = this.method220(local81, arg1, arg0);
				@Pc(104) float local104 = -2.0F * local22 * (float) Math.cos((double) this.method222(local81, arg1, arg0));
				@Pc(108) float local108 = local22 * local22;
				aFloatArrayArray1[arg0][local81 * 2 + 1] = aFloatArrayArray1[arg0][local81 * 2 - 1] * local108;
				aFloatArrayArray1[arg0][local81 * 2] = aFloatArrayArray1[arg0][local81 * 2 - 1] * local104 + aFloatArrayArray1[arg0][local81 * 2 - 2] * local108;
				for (@Pc(164) int local164 = local81 * 2 - 1; local164 >= 2; local164--) {
					aFloatArrayArray1[arg0][local164] += aFloatArrayArray1[arg0][local164 - 1] * local104 + aFloatArrayArray1[arg0][local164 - 2] * local108;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local104 + local108;
				aFloatArrayArray1[arg0][0] += local104;
			}
			@Pc(248) int local248;
			if (arg0 == 0) {
				for (local248 = 0; local248 < this.anIntArray128[0] * 2; local248++) {
					aFloatArrayArray1[0][local248] *= aFloat1;
				}
			}
			for (local248 = 0; local248 < this.anIntArray128[arg0] * 2; local248++) {
				anIntArrayArray17[arg0][local248] = (int) (aFloatArrayArray1[arg0][local248] * 65536.0F);
			}
			return this.anIntArray128[arg0] * 2;
		} catch (@Pc(302) RuntimeException local302) {
			signlink.reporterror("13614, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local302.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OYVSGGSR", name = "a", descriptor = "(ILclient!PQBRPYKE;Lclient!KEEMQUKU;)V")
	public void method224(@OriginalArg(1) Class6_Sub1_Sub4 arg0, @OriginalArg(2) Class21 arg1) {
		try {
			@Pc(4) int local4 = arg0.method239();
			this.anIntArray128[0] = local4 >> 4;
			this.anIntArray128[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray129[0] = this.anIntArray129[1] = 0;
			} else {
				this.anIntArray129[0] = arg0.method241();
				this.anIntArray129[1] = arg0.method241();
				@Pc(45) int local45 = arg0.method239();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray128[local47]; local51++) {
						this.anIntArrayArrayArray3[local47][0][local51] = arg0.method241();
						this.anIntArrayArrayArray4[local47][0][local51] = arg0.method241();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray128[local51]; local90++) {
						if ((local45 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray3[local51][1][local90] = this.anIntArrayArrayArray3[local51][0][local90];
							this.anIntArrayArrayArray4[local51][1][local90] = this.anIntArrayArrayArray4[local51][0][local90];
						} else {
							this.anIntArrayArrayArray3[local51][1][local90] = arg0.method241();
							this.anIntArrayArrayArray4[local51][1][local90] = arg0.method241();
						}
					}
				}
				if (local45 != 0 || this.anIntArray129[1] != this.anIntArray129[0]) {
					arg1.method154(arg0);
				}
			}
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("80814, " + -609 + ", " + arg0 + ", " + arg1 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}
}
