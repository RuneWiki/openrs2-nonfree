import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XSKZRAYI")
public final class Class44 {

	@OriginalMember(owner = "client!XSKZRAYI", name = "j", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!XSKZRAYI", name = "k", descriptor = "I")
	public static int anInt728;

	@OriginalMember(owner = "client!XSKZRAYI", name = "h", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!XSKZRAYI", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[2][8];

	@OriginalMember(owner = "client!XSKZRAYI", name = "c", descriptor = "I")
	private int anInt727;

	@OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!XSKZRAYI", name = "b", descriptor = "I")
	private int anInt726 = 635;

	@OriginalMember(owner = "client!XSKZRAYI", name = "d", descriptor = "[I")
	public int[] anIntArray193 = new int[2];

	@OriginalMember(owner = "client!XSKZRAYI", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!XSKZRAYI", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!XSKZRAYI", name = "g", descriptor = "[I")
	private int[] anIntArray194 = new int[2];

	@OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "(FIBI)F")
	private float method502(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(40) float local40 = (float) this.anIntArrayArrayArray4[arg1][0][arg3] + arg0 * (float) (this.anIntArrayArrayArray4[arg1][1][arg3] - this.anIntArrayArrayArray4[arg1][0][arg3]);
			@Pc(44) float local44 = local40 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local44 / 20.0F));
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("54496, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "(BF)F")
	private float method503(@OriginalArg(0) byte arg0, @OriginalArg(1) float arg1) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(18) float local18 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
			return local18 * 3.1415927F / 11025.0F;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("18221, " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "(IFII)F")
	private float method504(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg0][0][arg2] + arg1 * (float) (this.anIntArrayArrayArray3[arg0][1][arg2] - this.anIntArrayArrayArray3[arg0][0][arg2]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method503((byte) 8, local34);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("4214, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "(BIF)I")
	public int method505(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray194[0] + (float) (this.anIntArray194[1] - this.anIntArray194[0]) * arg2;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt728 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray193[arg1] == 0) {
				return 0;
			}
			local22 = this.method502(arg2, arg1, (byte) 2, 0);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method504(arg1, arg2, 0));
			if (arg0 != 2) {
				return 2;
			}
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(86) int local86 = 1; local86 < this.anIntArray193[arg1]; local86++) {
				local22 = this.method502(arg2, arg1, (byte) 2, local86);
				@Pc(109) float local109 = -2.0F * local22 * (float) Math.cos((double) this.method504(arg1, arg2, local86));
				@Pc(113) float local113 = local22 * local22;
				aFloatArrayArray1[arg1][local86 * 2 + 1] = aFloatArrayArray1[arg1][local86 * 2 - 1] * local113;
				aFloatArrayArray1[arg1][local86 * 2] = aFloatArrayArray1[arg1][local86 * 2 - 1] * local109 + aFloatArrayArray1[arg1][local86 * 2 - 2] * local113;
				for (@Pc(169) int local169 = local86 * 2 - 1; local169 >= 2; local169--) {
					aFloatArrayArray1[arg1][local169] += aFloatArrayArray1[arg1][local169 - 1] * local109 + aFloatArrayArray1[arg1][local169 - 2] * local113;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local109 + local113;
				aFloatArrayArray1[arg1][0] += local109;
			}
			@Pc(239) int local239;
			if (arg1 == 0) {
				for (local239 = 0; local239 < this.anIntArray193[0] * 2; local239++) {
					aFloatArrayArray1[0][local239] *= aFloat1;
				}
			}
			for (local239 = 0; local239 < this.anIntArray193[arg1] * 2; local239++) {
				anIntArrayArray19[arg1][local239] = (int) (aFloatArrayArray1[arg1][local239] * 65536.0F);
			}
			return this.anIntArray193[arg1] * 2;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("77160, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XSKZRAYI", name = "a", descriptor = "(Lclient!UHTSXKVU;ILclient!RSWRPCHR;)V")
	public void method506(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub4 arg2) {
		try {
			@Pc(4) int local4 = arg2.method340();
			this.anIntArray193[0] = local4 >> 4;
			this.anIntArray193[1] = local4 & 0xF;
			@Pc(22) boolean local22 = false;
			if (local4 == 0) {
				this.anIntArray194[0] = this.anIntArray194[1] = 0;
			} else {
				this.anIntArray194[0] = arg2.method342();
				this.anIntArray194[1] = arg2.method342();
				@Pc(39) int local39 = arg2.method340();
				@Pc(45) int local45;
				for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
					for (local45 = 0; local45 < this.anIntArray193[local41]; local45++) {
						this.anIntArrayArrayArray3[local41][0][local45] = arg2.method342();
						this.anIntArrayArrayArray4[local41][0][local45] = arg2.method342();
					}
				}
				for (local45 = 0; local45 < 2; local45++) {
					for (@Pc(84) int local84 = 0; local84 < this.anIntArray193[local45]; local84++) {
						if ((local39 & 0x1 << local45 * 4 << local84) == 0) {
							this.anIntArrayArrayArray3[local45][1][local84] = this.anIntArrayArrayArray3[local45][0][local84];
							this.anIntArrayArrayArray4[local45][1][local84] = this.anIntArrayArrayArray4[local45][0][local84];
						} else {
							this.anIntArrayArrayArray3[local45][1][local84] = arg2.method342();
							this.anIntArrayArrayArray4[local45][1][local84] = arg2.method342();
						}
					}
				}
				if (local39 != 0 || this.anIntArray194[1] != this.anIntArray194[0]) {
					arg0.method399(arg2);
				}
			}
		} catch (@Pc(194) RuntimeException local194) {
			signlink.reporterror("36230, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local194.toString());
			throw new RuntimeException();
		}
	}
}
