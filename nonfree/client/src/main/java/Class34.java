import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!STQKONHX")
public final class Class34 {

	@OriginalMember(owner = "client!STQKONHX", name = "j", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!STQKONHX", name = "k", descriptor = "I")
	public static int anInt661;

	@OriginalMember(owner = "client!STQKONHX", name = "h", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!STQKONHX", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[2][8];

	@OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "I")
	private int anInt659 = 16795;

	@OriginalMember(owner = "client!STQKONHX", name = "b", descriptor = "I")
	private int anInt660 = -585;

	@OriginalMember(owner = "client!STQKONHX", name = "c", descriptor = "Z")
	private boolean aBoolean160 = true;

	@OriginalMember(owner = "client!STQKONHX", name = "d", descriptor = "[I")
	public int[] anIntArray119 = new int[2];

	@OriginalMember(owner = "client!STQKONHX", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!STQKONHX", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!STQKONHX", name = "g", descriptor = "[I")
	private int[] anIntArray120 = new int[2];

	@OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "(IFII)F")
	private float method463(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray6[arg0][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray6[arg0][1][arg2] - this.anIntArrayArrayArray6[arg0][0][arg2]);
			@Pc(43) float local43 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local43 / 20.0F));
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("24959, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "(FI)F")
	private float method464(@OriginalArg(0) float arg0) {
		try {
			@Pc(13) float local13 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local13 * 3.1415927F / 11025.0F;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("58667, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "(IIFI)F")
	private float method465(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(36) float local36 = (float) this.anIntArrayArrayArray5[arg2][0][arg0] + arg1 * (float) (this.anIntArrayArrayArray5[arg2][1][arg0] - this.anIntArrayArrayArray5[arg2][0][arg0]);
			@Pc(40) float local40 = local36 * 1.2207031E-4F;
			return this.method464(local40);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("12838, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "(IFI)I")
	public int method466(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray120[0] + (float) (this.anIntArray120[1] - this.anIntArray120[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt661 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray119[arg0] == 0) {
				return 0;
			}
			local22 = this.method463(arg0, arg1, 0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method465(0, arg1, arg0));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(90) int local90 = 1; local90 < this.anIntArray119[arg0]; local90++) {
				local22 = this.method463(arg0, arg1, local90);
				@Pc(113) float local113 = -2.0F * local22 * (float) Math.cos((double) this.method465(local90, arg1, arg0));
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
				for (local243 = 0; local243 < this.anIntArray119[0] * 2; local243++) {
					aFloatArrayArray1[0][local243] *= aFloat1;
				}
			}
			for (local243 = 0; local243 < this.anIntArray119[arg0] * 2; local243++) {
				anIntArrayArray15[arg0][local243] = (int) (aFloatArrayArray1[arg0][local243] * 65536.0F);
			}
			return this.anIntArray119[arg0] * 2;
		} catch (@Pc(297) RuntimeException local297) {
			signlink.reporterror("70631, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local297.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!STQKONHX", name = "a", descriptor = "(Lclient!BJGBRRBX;Lclient!BFQIDHPO;I)V")
	public void method467(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1) {
		try {
			@Pc(4) int local4 = arg1.method79();
			this.anIntArray119[0] = local4 >> 4;
			this.anIntArray119[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray120[0] = this.anIntArray120[1] = 0;
			} else {
				this.anIntArray120[0] = arg1.method81();
				this.anIntArray120[1] = arg1.method81();
				@Pc(45) int local45 = arg1.method79();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray119[local47]; local51++) {
						this.anIntArrayArrayArray5[local47][0][local51] = arg1.method81();
						this.anIntArrayArrayArray6[local47][0][local51] = arg1.method81();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray119[local51]; local90++) {
						if ((local45 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray5[local51][1][local90] = this.anIntArrayArrayArray5[local51][0][local90];
							this.anIntArrayArrayArray6[local51][1][local90] = this.anIntArrayArrayArray6[local51][0][local90];
						} else {
							this.anIntArrayArrayArray5[local51][1][local90] = arg1.method81();
							this.anIntArrayArrayArray6[local51][1][local90] = arg1.method81();
						}
					}
				}
				if (local45 != 0 || this.anIntArray120[1] != this.anIntArray120[0]) {
					arg0.method117(arg1, this.anInt659);
				}
			}
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("8032, " + arg0 + ", " + arg1 + ", " + -585 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
