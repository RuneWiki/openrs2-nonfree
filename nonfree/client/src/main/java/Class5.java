import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
	public static int anInt182;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[2][8];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private int anInt180 = -807;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	private int anInt181 = 1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public int[] anIntArray26 = new int[2];

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[I")
	private int[] anIntArray27 = new int[2];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(FIII)F")
	private float method74(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(44) float local44 = (float) this.anIntArrayArrayArray4[arg2][0][arg1] + arg0 * (float) (this.anIntArrayArrayArray4[arg2][1][arg1] - this.anIntArrayArrayArray4[arg2][0][arg1]);
			@Pc(48) float local48 = local44 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local48 / 20.0F));
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("69794, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IF)F")
	private float method75(@OriginalArg(1) float arg0) {
		try {
			@Pc(9) float local9 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local9 * 3.1415927F / 11025.0F;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("47682, " + -807 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(FIZI)F")
	private float method76(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg2][0][arg1] + arg0 * (float) (this.anIntArrayArrayArray3[arg2][1][arg1] - this.anIntArrayArrayArray3[arg2][0][arg1]);
			@Pc(44) float local44 = local30 * 1.2207031E-4F;
			return this.method75(local44);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("23517, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(FII)I")
	public int method77(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray27[0] + (float) (this.anIntArray27[1] - this.anIntArray27[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt182 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray26[arg1] == 0) {
				return 0;
			}
			local22 = this.method74(arg0, 0, arg1);
			if (this.anInt181 > 1 || this.anInt181 < 1) {
				this.aBoolean33 = !this.aBoolean33;
			}
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method76(arg0, 0, arg1));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(97) int local97 = 1; local97 < this.anIntArray26[arg1]; local97++) {
				local22 = this.method74(arg0, local97, arg1);
				@Pc(120) float local120 = -2.0F * local22 * (float) Math.cos((double) this.method76(arg0, local97, arg1));
				@Pc(124) float local124 = local22 * local22;
				aFloatArrayArray1[arg1][local97 * 2 + 1] = aFloatArrayArray1[arg1][local97 * 2 - 1] * local124;
				aFloatArrayArray1[arg1][local97 * 2] = aFloatArrayArray1[arg1][local97 * 2 - 1] * local120 + aFloatArrayArray1[arg1][local97 * 2 - 2] * local124;
				for (@Pc(180) int local180 = local97 * 2 - 1; local180 >= 2; local180--) {
					aFloatArrayArray1[arg1][local180] += aFloatArrayArray1[arg1][local180 - 1] * local120 + aFloatArrayArray1[arg1][local180 - 2] * local124;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local120 + local124;
				aFloatArrayArray1[arg1][0] += local120;
			}
			@Pc(250) int local250;
			if (arg1 == 0) {
				for (local250 = 0; local250 < this.anIntArray26[0] * 2; local250++) {
					aFloatArrayArray1[0][local250] *= aFloat1;
				}
			}
			for (local250 = 0; local250 < this.anIntArray26[arg1] * 2; local250++) {
				anIntArrayArray2[arg1][local250] = (int) (aFloatArrayArray1[arg1][local250] * 65536.0F);
			}
			return this.anIntArray26[arg1] * 2;
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("15421, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!mb;Lclient!bc;Z)V")
	public void method78(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) boolean arg2) {
		try {
			@Pc(4) int local4 = arg0.method503();
			this.anIntArray26[0] = local4 >> 4;
			if (arg2) {
				this.aBoolean33 = !this.aBoolean33;
			}
			this.anIntArray26[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray27[0] = this.anIntArray27[1] = 0;
			} else {
				this.anIntArray27[0] = arg0.method505();
				this.anIntArray27[1] = arg0.method505();
				@Pc(45) int local45 = arg0.method503();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray26[local47]; local51++) {
						this.anIntArrayArrayArray3[local47][0][local51] = arg0.method505();
						this.anIntArrayArrayArray4[local47][0][local51] = arg0.method505();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray26[local51]; local90++) {
						if ((local45 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray3[local51][1][local90] = this.anIntArrayArrayArray3[local51][0][local90];
							this.anIntArrayArrayArray4[local51][1][local90] = this.anIntArrayArrayArray4[local51][0][local90];
						} else {
							this.anIntArrayArrayArray3[local51][1][local90] = arg0.method505();
							this.anIntArrayArrayArray4[local51][1][local90] = arg0.method505();
						}
					}
				}
				if (local45 != 0 || this.anIntArray27[1] != this.anIntArray27[0]) {
					arg1.method49(arg0);
				}
			}
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("95530, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}
}
