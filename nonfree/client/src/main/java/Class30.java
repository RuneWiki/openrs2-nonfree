import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PTIFANAY")
public final class Class30 {

	@OriginalMember(owner = "client!PTIFANAY", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!PTIFANAY", name = "j", descriptor = "I")
	public static int anInt482;

	@OriginalMember(owner = "client!PTIFANAY", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!PTIFANAY", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray13 = new int[2][8];

	@OriginalMember(owner = "client!PTIFANAY", name = "a", descriptor = "B")
	private byte aByte37 = 28;

	@OriginalMember(owner = "client!PTIFANAY", name = "b", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!PTIFANAY", name = "c", descriptor = "[I")
	public int[] anIntArray97 = new int[2];

	@OriginalMember(owner = "client!PTIFANAY", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!PTIFANAY", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!PTIFANAY", name = "f", descriptor = "[I")
	private int[] anIntArray98 = new int[2];

	@OriginalMember(owner = "client!PTIFANAY", name = "a", descriptor = "(IIIF)F")
	private float method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg2][0][arg1] + arg3 * (float) (this.anIntArrayArrayArray4[arg2][1][arg1] - this.anIntArrayArrayArray4[arg2][0][arg1]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			@Pc(38) boolean local38 = false;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("49087, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTIFANAY", name = "a", descriptor = "(IF)F")
	private float method390(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("39012, " + 7 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTIFANAY", name = "b", descriptor = "(IIIF)F")
	private float method391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray3[arg1][1][arg0] - this.anIntArrayArrayArray3[arg1][0][arg0]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method390(local34);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("82424, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTIFANAY", name = "a", descriptor = "(IFI)I")
	public int method392(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(26) float local26;
			if (arg2 == 0) {
				local26 = (float) this.anIntArray98[0] + (float) (this.anIntArray98[1] - this.anIntArray98[0]) * arg1;
				@Pc(30) float local30 = local26 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local30 / 20.0F));
				anInt482 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray97[arg2] == 0) {
				return 0;
			}
			local26 = this.method389(718, 0, arg2, arg1);
			aFloatArrayArray1[arg2][0] = -2.0F * local26 * (float) Math.cos((double) this.method391(0, arg2, arg1));
			aFloatArrayArray1[arg2][1] = local26 * local26;
			for (@Pc(85) int local85 = 1; local85 < this.anIntArray97[arg2]; local85++) {
				local26 = this.method389(718, local85, arg2, arg1);
				@Pc(108) float local108 = -2.0F * local26 * (float) Math.cos((double) this.method391(local85, arg2, arg1));
				@Pc(112) float local112 = local26 * local26;
				aFloatArrayArray1[arg2][local85 * 2 + 1] = aFloatArrayArray1[arg2][local85 * 2 - 1] * local112;
				aFloatArrayArray1[arg2][local85 * 2] = aFloatArrayArray1[arg2][local85 * 2 - 1] * local108 + aFloatArrayArray1[arg2][local85 * 2 - 2] * local112;
				for (@Pc(168) int local168 = local85 * 2 - 1; local168 >= 2; local168--) {
					aFloatArrayArray1[arg2][local168] += aFloatArrayArray1[arg2][local168 - 1] * local108 + aFloatArrayArray1[arg2][local168 - 2] * local112;
				}
				aFloatArrayArray1[arg2][1] += aFloatArrayArray1[arg2][0] * local108 + local112;
				aFloatArrayArray1[arg2][0] += local108;
			}
			@Pc(238) int local238;
			if (arg2 == 0) {
				for (local238 = 0; local238 < this.anIntArray97[0] * 2; local238++) {
					aFloatArrayArray1[0][local238] *= aFloat1;
				}
			}
			for (local238 = 0; local238 < this.anIntArray97[arg2] * 2; local238++) {
				anIntArrayArray13[arg2][local238] = (int) (aFloatArrayArray1[arg2][local238] * 65536.0F);
			}
			return this.anIntArray97[arg2] * 2;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("14669, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTIFANAY", name = "a", descriptor = "(BLclient!BSNPYLEV;Lclient!HCHPPCNY;)V")
	public void method393(@OriginalArg(1) Class2_Sub1_Sub2 arg0, @OriginalArg(2) Class16 arg1) {
		try {
			@Pc(4) int local4 = arg0.method94();
			this.anIntArray97[0] = local4 >> 4;
			if (this.aByte37 != 28) {
				this.aBoolean141 = !this.aBoolean141;
			}
			this.anIntArray97[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray98[0] = this.anIntArray98[1] = 0;
			} else {
				this.anIntArray98[0] = arg0.method96();
				this.anIntArray98[1] = arg0.method96();
				@Pc(47) int local47 = arg0.method94();
				@Pc(53) int local53;
				for (@Pc(49) int local49 = 0; local49 < 2; local49++) {
					for (local53 = 0; local53 < this.anIntArray97[local49]; local53++) {
						this.anIntArrayArrayArray3[local49][0][local53] = arg0.method96();
						this.anIntArrayArrayArray4[local49][0][local53] = arg0.method96();
					}
				}
				for (local53 = 0; local53 < 2; local53++) {
					for (@Pc(92) int local92 = 0; local92 < this.anIntArray97[local53]; local92++) {
						if ((local47 & 0x1 << local53 * 4 << local92) == 0) {
							this.anIntArrayArrayArray3[local53][1][local92] = this.anIntArrayArrayArray3[local53][0][local92];
							this.anIntArrayArrayArray4[local53][1][local92] = this.anIntArrayArrayArray4[local53][0][local92];
						} else {
							this.anIntArrayArrayArray3[local53][1][local92] = arg0.method96();
							this.anIntArrayArrayArray4[local53][1][local92] = arg0.method96();
						}
					}
				}
				if (local47 != 0 || this.anIntArray98[1] != this.anIntArray98[0]) {
					arg1.method225(arg0);
				}
			}
		} catch (@Pc(202) RuntimeException local202) {
			signlink.reporterror("46310, " + 28 + ", " + arg0 + ", " + arg1 + ", " + local202.toString());
			throw new RuntimeException();
		}
	}
}
