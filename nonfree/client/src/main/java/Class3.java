import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public static int anInt168;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private int anInt167 = 181;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "B")
	private byte aByte2 = 1;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	public int[] anIntArray17 = new int[2];

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
	private int[] anIntArray18 = new int[2];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIF)F")
	private float method50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg2][0][arg0] + arg3 * (float) (this.anIntArrayArrayArray2[arg2][1][arg0] - this.anIntArrayArrayArray2[arg2][0][arg0]);
			@Pc(34) boolean local34 = false;
			@Pc(38) float local38 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local38 / 20.0F));
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("35891, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BF)F")
	private float method51(@OriginalArg(1) float arg0) {
		try {
			@Pc(14) float local14 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local14 * 3.1415927F / 11025.0F;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("26577, " + -81 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BIIF)F")
	private float method52(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg1] - this.anIntArrayArrayArray1[arg0][0][arg1]);
			if (this.aByte2 != 1) {
				this.anInt167 = -228;
			}
			local30 *= 1.2207031E-4F;
			return this.method51(local30);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("17723, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IFB)I")
	public int method53(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(37) float local37;
			if (arg0 == 0) {
				local37 = (float) this.anIntArray18[0] + (float) (this.anIntArray18[1] - this.anIntArray18[0]) * arg1;
				@Pc(41) float local41 = local37 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local41 / 20.0F));
				anInt168 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray17[arg0] == 0) {
				return 0;
			}
			local37 = this.method50(0, 680, arg0, arg1);
			aFloatArrayArray1[arg0][0] = -2.0F * local37 * (float) Math.cos((double) this.method52(arg0, 0, arg1));
			aFloatArrayArray1[arg0][1] = local37 * local37;
			for (@Pc(96) int local96 = 1; local96 < this.anIntArray17[arg0]; local96++) {
				local37 = this.method50(local96, 680, arg0, arg1);
				@Pc(119) float local119 = -2.0F * local37 * (float) Math.cos((double) this.method52(arg0, local96, arg1));
				@Pc(123) float local123 = local37 * local37;
				aFloatArrayArray1[arg0][local96 * 2 + 1] = aFloatArrayArray1[arg0][local96 * 2 - 1] * local123;
				aFloatArrayArray1[arg0][local96 * 2] = aFloatArrayArray1[arg0][local96 * 2 - 1] * local119 + aFloatArrayArray1[arg0][local96 * 2 - 2] * local123;
				for (@Pc(179) int local179 = local96 * 2 - 1; local179 >= 2; local179--) {
					aFloatArrayArray1[arg0][local179] += aFloatArrayArray1[arg0][local179 - 1] * local119 + aFloatArrayArray1[arg0][local179 - 2] * local123;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local119 + local123;
				aFloatArrayArray1[arg0][0] += local119;
			}
			@Pc(249) int local249;
			if (arg0 == 0) {
				for (local249 = 0; local249 < this.anIntArray17[0] * 2; local249++) {
					aFloatArrayArray1[0][local249] *= aFloat1;
				}
			}
			for (local249 = 0; local249 < this.anIntArray17[arg0] * 2; local249++) {
				anIntArrayArray1[arg0][local249] = (int) (aFloatArrayArray1[arg0][local249] * 65536.0F);
			}
			return this.anIntArray17[arg0] * 2;
		} catch (@Pc(303) RuntimeException local303) {
			signlink.reporterror("88672, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local303.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!lb;BLclient!ac;)V")
	public void method54(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class2 arg2) {
		try {
			@Pc(4) int local4 = arg0.method473();
			this.anIntArray17[0] = local4 >> 4;
			this.anIntArray17[1] = local4 & 0xF;
			@Pc(23) int local23;
			if (arg1 != 6) {
				for (local23 = 1; local23 > 0; local23++) {
				}
			}
			if (local4 == 0) {
				this.anIntArray18[0] = this.anIntArray18[1] = 0;
			} else {
				this.anIntArray18[0] = arg0.method475();
				this.anIntArray18[1] = arg0.method475();
				local23 = arg0.method473();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray17[local47]; local51++) {
						this.anIntArrayArrayArray1[local47][0][local51] = arg0.method475();
						this.anIntArrayArrayArray2[local47][0][local51] = arg0.method475();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray17[local51]; local90++) {
						if ((local23 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray1[local51][1][local90] = this.anIntArrayArrayArray1[local51][0][local90];
							this.anIntArrayArrayArray2[local51][1][local90] = this.anIntArrayArrayArray2[local51][0][local90];
						} else {
							this.anIntArrayArrayArray1[local51][1][local90] = arg0.method475();
							this.anIntArrayArrayArray2[local51][1][local90] = arg0.method475();
						}
					}
				}
				if (local23 != 0 || this.anIntArray18[1] != this.anIntArray18[0]) {
					arg2.method43(arg0);
				}
			}
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("16801, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}
}
