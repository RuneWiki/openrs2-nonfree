import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RFLXBNRG")
public final class Class26 {

	@OriginalMember(owner = "client!RFLXBNRG", name = "i", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!RFLXBNRG", name = "j", descriptor = "I")
	public static int anInt558;

	@OriginalMember(owner = "client!RFLXBNRG", name = "g", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!RFLXBNRG", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[2][8];

	@OriginalMember(owner = "client!RFLXBNRG", name = "a", descriptor = "I")
	private int anInt557 = 35844;

	@OriginalMember(owner = "client!RFLXBNRG", name = "b", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!RFLXBNRG", name = "c", descriptor = "[I")
	public int[] anIntArray153 = new int[2];

	@OriginalMember(owner = "client!RFLXBNRG", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!RFLXBNRG", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!RFLXBNRG", name = "f", descriptor = "[I")
	private int[] anIntArray154 = new int[2];

	@OriginalMember(owner = "client!RFLXBNRG", name = "a", descriptor = "(IFBI)F")
	private float method379(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(45) float local45 = (float) this.anIntArrayArrayArray4[arg0][0][arg3] + arg1 * (float) (this.anIntArrayArrayArray4[arg0][1][arg3] - this.anIntArrayArrayArray4[arg0][0][arg3]);
			@Pc(49) float local49 = local45 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local49 / 20.0F));
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("62632, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RFLXBNRG", name = "a", descriptor = "(FB)F")
	private float method380(@OriginalArg(0) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("86112, " + arg0 + ", " + -117 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RFLXBNRG", name = "a", descriptor = "(IIIF)F")
	private float method381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			if (this.anInt557 != 35844) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			@Pc(41) float local41 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
			@Pc(45) float local45 = local41 * 1.2207031E-4F;
			return this.method380(local45);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("71029, " + 35844 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RFLXBNRG", name = "a", descriptor = "(IIF)I")
	public int method382(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray154[0] + (float) (this.anIntArray154[1] - this.anIntArray154[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt558 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray153[arg0] == 0) {
				return 0;
			}
			local22 = this.method379(arg0, arg1, (byte) 2, 0);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method381(arg0, 0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(86) int local86 = 1; local86 < this.anIntArray153[arg0]; local86++) {
				local22 = this.method379(arg0, arg1, (byte) 2, local86);
				@Pc(109) float local109 = -2.0F * local22 * (float) Math.cos((double) this.method381(arg0, local86, arg1));
				@Pc(113) float local113 = local22 * local22;
				aFloatArrayArray1[arg0][local86 * 2 + 1] = aFloatArrayArray1[arg0][local86 * 2 - 1] * local113;
				aFloatArrayArray1[arg0][local86 * 2] = aFloatArrayArray1[arg0][local86 * 2 - 1] * local109 + aFloatArrayArray1[arg0][local86 * 2 - 2] * local113;
				for (@Pc(169) int local169 = local86 * 2 - 1; local169 >= 2; local169--) {
					aFloatArrayArray1[arg0][local169] += aFloatArrayArray1[arg0][local169 - 1] * local109 + aFloatArrayArray1[arg0][local169 - 2] * local113;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local109 + local113;
				aFloatArrayArray1[arg0][0] += local109;
			}
			@Pc(239) int local239;
			if (arg0 == 0) {
				for (local239 = 0; local239 < this.anIntArray153[0] * 2; local239++) {
					aFloatArrayArray1[0][local239] *= aFloat1;
				}
			}
			for (local239 = 0; local239 < this.anIntArray153[arg0] * 2; local239++) {
				anIntArrayArray19[arg0][local239] = (int) (aFloatArrayArray1[arg0][local239] * 65536.0F);
			}
			return this.anIntArray153[arg0] * 2;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("32293, " + -3907 + ", " + arg0 + ", " + arg1 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RFLXBNRG", name = "a", descriptor = "(ILclient!VJXKRAVR;Lclient!MLYYHULT;)V")
	public void method383(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class3_Sub1_Sub2 arg1) {
		try {
			@Pc(4) int local4 = arg1.method200();
			this.anIntArray153[0] = local4 >> 4;
			this.anIntArray153[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray154[0] = this.anIntArray154[1] = 0;
			} else {
				this.anIntArray154[0] = arg1.method202();
				this.anIntArray154[1] = arg1.method202();
				@Pc(39) int local39 = arg1.method200();
				@Pc(45) int local45;
				for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
					for (local45 = 0; local45 < this.anIntArray153[local41]; local45++) {
						this.anIntArrayArrayArray3[local41][0][local45] = arg1.method202();
						this.anIntArrayArrayArray4[local41][0][local45] = arg1.method202();
					}
				}
				for (local45 = 0; local45 < 2; local45++) {
					for (@Pc(84) int local84 = 0; local84 < this.anIntArray153[local45]; local84++) {
						if ((local39 & 0x1 << local45 * 4 << local84) == 0) {
							this.anIntArrayArrayArray3[local45][1][local84] = this.anIntArrayArrayArray3[local45][0][local84];
							this.anIntArrayArrayArray4[local45][1][local84] = this.anIntArrayArrayArray4[local45][0][local84];
						} else {
							this.anIntArrayArrayArray3[local45][1][local84] = arg1.method202();
							this.anIntArrayArrayArray4[local45][1][local84] = arg1.method202();
						}
					}
				}
				if (local39 != 0 || this.anIntArray154[1] != this.anIntArray154[0]) {
					arg0.method528(arg1);
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("13544, " + 10762 + ", " + arg0 + ", " + arg1 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
