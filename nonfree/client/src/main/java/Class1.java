import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ADELCBNY")
public final class Class1 {

	@OriginalMember(owner = "client!ADELCBNY", name = "h", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!ADELCBNY", name = "i", descriptor = "I")
	public static int anInt1;

	@OriginalMember(owner = "client!ADELCBNY", name = "f", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ADELCBNY", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!ADELCBNY", name = "a", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!ADELCBNY", name = "b", descriptor = "[I")
	public int[] anIntArray1 = new int[2];

	@OriginalMember(owner = "client!ADELCBNY", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!ADELCBNY", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!ADELCBNY", name = "e", descriptor = "[I")
	private int[] anIntArray2 = new int[2];

	@OriginalMember(owner = "client!ADELCBNY", name = "a", descriptor = "(IIIF)F")
	private float method1(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray2[arg1][1][arg0] - this.anIntArrayArrayArray2[arg1][0][arg0]);
			@Pc(44) float local44 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local44 / 20.0F));
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("14803, " + 49278 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADELCBNY", name = "a", descriptor = "(FI)F")
	private float method2(@OriginalArg(0) float arg0) {
		try {
			@Pc(9) float local9 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local9 * 3.1415927F / 11025.0F;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("74497, " + arg0 + ", " + -140 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADELCBNY", name = "a", descriptor = "(IBFI)F")
	private float method3(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(41) float local41 = (float) this.anIntArrayArrayArray1[arg0][0][arg3] + arg2 * (float) (this.anIntArrayArrayArray1[arg0][1][arg3] - this.anIntArrayArrayArray1[arg0][0][arg3]);
			@Pc(45) float local45 = local41 * 1.2207031E-4F;
			return this.method2(local45);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("7390, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADELCBNY", name = "a", descriptor = "(IBF)I")
	public int method4(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray2[0] + (float) (this.anIntArray2[1] - this.anIntArray2[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt1 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray1[arg0] == 0) {
				return 0;
			}
			local22 = this.method1(0, arg0, arg1);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method3(arg0, (byte) 4, arg1, 0));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(92) int local92 = 1; local92 < this.anIntArray1[arg0]; local92++) {
				local22 = this.method1(local92, arg0, arg1);
				@Pc(115) float local115 = -2.0F * local22 * (float) Math.cos((double) this.method3(arg0, (byte) 4, arg1, local92));
				@Pc(119) float local119 = local22 * local22;
				aFloatArrayArray1[arg0][local92 * 2 + 1] = aFloatArrayArray1[arg0][local92 * 2 - 1] * local119;
				aFloatArrayArray1[arg0][local92 * 2] = aFloatArrayArray1[arg0][local92 * 2 - 1] * local115 + aFloatArrayArray1[arg0][local92 * 2 - 2] * local119;
				for (@Pc(175) int local175 = local92 * 2 - 1; local175 >= 2; local175--) {
					aFloatArrayArray1[arg0][local175] += aFloatArrayArray1[arg0][local175 - 1] * local115 + aFloatArrayArray1[arg0][local175 - 2] * local119;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local115 + local119;
				aFloatArrayArray1[arg0][0] += local115;
			}
			@Pc(245) int local245;
			if (arg0 == 0) {
				for (local245 = 0; local245 < this.anIntArray1[0] * 2; local245++) {
					aFloatArrayArray1[0][local245] *= aFloat1;
				}
			}
			for (local245 = 0; local245 < this.anIntArray1[arg0] * 2; local245++) {
				anIntArrayArray1[arg0][local245] = (int) (aFloatArrayArray1[arg0][local245] * 65536.0F);
			}
			return this.anIntArray1[arg0] * 2;
		} catch (@Pc(299) RuntimeException local299) {
			signlink.reporterror("23358, " + arg0 + ", " + 86 + ", " + arg1 + ", " + local299.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADELCBNY", name = "a", descriptor = "(Lclient!IMUIZRAF;Lclient!TDXKKGZV;I)V")
	public void method5(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) Class39 arg1) {
		try {
			@Pc(4) int local4 = arg0.method146();
			this.anIntArray1[0] = local4 >> 4;
			this.anIntArray1[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray2[0] = this.anIntArray2[1] = 0;
			} else {
				this.anIntArray2[0] = arg0.method148();
				this.anIntArray2[1] = arg0.method148();
				@Pc(44) int local44 = arg0.method146();
				@Pc(50) int local50;
				for (@Pc(46) int local46 = 0; local46 < 2; local46++) {
					for (local50 = 0; local50 < this.anIntArray1[local46]; local50++) {
						this.anIntArrayArrayArray1[local46][0][local50] = arg0.method148();
						this.anIntArrayArrayArray2[local46][0][local50] = arg0.method148();
					}
				}
				for (local50 = 0; local50 < 2; local50++) {
					for (@Pc(89) int local89 = 0; local89 < this.anIntArray1[local50]; local89++) {
						if ((local44 & 0x1 << local50 * 4 << local89) == 0) {
							this.anIntArrayArrayArray1[local50][1][local89] = this.anIntArrayArrayArray1[local50][0][local89];
							this.anIntArrayArrayArray2[local50][1][local89] = this.anIntArrayArrayArray2[local50][0][local89];
						} else {
							this.anIntArrayArrayArray1[local50][1][local89] = arg0.method148();
							this.anIntArrayArrayArray2[local50][1][local89] = arg0.method148();
						}
					}
				}
				if (local44 != 0 || this.anIntArray2[1] != this.anIntArray2[0]) {
					arg1.method423(arg0);
				}
			}
		} catch (@Pc(199) RuntimeException local199) {
			signlink.reporterror("93458, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local199.toString());
			throw new RuntimeException();
		}
	}
}
