import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QPYZEWVW")
public final class Class31 {

	@OriginalMember(owner = "client!QPYZEWVW", name = "j", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!QPYZEWVW", name = "k", descriptor = "I")
	public static int anInt410;

	@OriginalMember(owner = "client!QPYZEWVW", name = "h", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!QPYZEWVW", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[2][8];

	@OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "I")
	private int anInt408 = 9;

	@OriginalMember(owner = "client!QPYZEWVW", name = "b", descriptor = "Z")
	private boolean aBoolean97 = true;

	@OriginalMember(owner = "client!QPYZEWVW", name = "c", descriptor = "I")
	private int anInt409 = -160;

	@OriginalMember(owner = "client!QPYZEWVW", name = "d", descriptor = "[I")
	public int[] anIntArray95 = new int[2];

	@OriginalMember(owner = "client!QPYZEWVW", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3 = new int[2][2][4];

	@OriginalMember(owner = "client!QPYZEWVW", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4 = new int[2][2][4];

	@OriginalMember(owner = "client!QPYZEWVW", name = "g", descriptor = "[I")
	private int[] anIntArray96 = new int[2];

	@OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "(FIII)F")
	private float method311(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray4[arg2][0][arg1] + arg0 * (float) (this.anIntArrayArrayArray4[arg2][1][arg1] - this.anIntArrayArrayArray4[arg2][0][arg1]);
			@Pc(40) float local40 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local40 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("55741, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "(FI)F")
	private float method312(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				this.anInt408 = 145;
			}
			@Pc(14) float local14 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local14 * 3.1415927F / 11025.0F;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("22510, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "(IIIF)F")
	private float method313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray3[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray3[arg0][1][arg1] - this.anIntArrayArrayArray3[arg0][0][arg1]);
			@Pc(34) float local34 = local30 * 1.2207031E-4F;
			return this.method312(local34, this.anInt409);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("48621, " + -855 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "(IFI)I")
	public int method314(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(22) float local22;
			if (arg1 == 0) {
				local22 = (float) this.anIntArray96[0] + (float) (this.anIntArray96[1] - this.anIntArray96[0]) * arg0;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt410 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray95[arg1] == 0) {
				return 0;
			}
			local22 = this.method311(arg0, 0, arg1);
			aFloatArrayArray1[arg1][0] = -2.0F * local22 * (float) Math.cos((double) this.method313(arg1, 0, arg0));
			aFloatArrayArray1[arg1][1] = local22 * local22;
			for (@Pc(92) int local92 = 1; local92 < this.anIntArray95[arg1]; local92++) {
				local22 = this.method311(arg0, local92, arg1);
				@Pc(115) float local115 = -2.0F * local22 * (float) Math.cos((double) this.method313(arg1, local92, arg0));
				@Pc(119) float local119 = local22 * local22;
				aFloatArrayArray1[arg1][local92 * 2 + 1] = aFloatArrayArray1[arg1][local92 * 2 - 1] * local119;
				aFloatArrayArray1[arg1][local92 * 2] = aFloatArrayArray1[arg1][local92 * 2 - 1] * local115 + aFloatArrayArray1[arg1][local92 * 2 - 2] * local119;
				for (@Pc(175) int local175 = local92 * 2 - 1; local175 >= 2; local175--) {
					aFloatArrayArray1[arg1][local175] += aFloatArrayArray1[arg1][local175 - 1] * local115 + aFloatArrayArray1[arg1][local175 - 2] * local119;
				}
				aFloatArrayArray1[arg1][1] += aFloatArrayArray1[arg1][0] * local115 + local119;
				aFloatArrayArray1[arg1][0] += local115;
			}
			@Pc(245) int local245;
			if (arg1 == 0) {
				for (local245 = 0; local245 < this.anIntArray95[0] * 2; local245++) {
					aFloatArrayArray1[0][local245] *= aFloat1;
				}
			}
			for (local245 = 0; local245 < this.anIntArray95[arg1] * 2; local245++) {
				anIntArrayArray12[arg1][local245] = (int) (aFloatArrayArray1[arg1][local245] * 65536.0F);
			}
			return this.anIntArray95[arg1] * 2;
		} catch (@Pc(299) RuntimeException local299) {
			signlink.reporterror("41934, " + -846 + ", " + arg0 + ", " + arg1 + ", " + local299.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPYZEWVW", name = "a", descriptor = "(Lclient!LSSFLBMP;Lclient!WNCFPLWV;Z)V")
	public void method315(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1, @OriginalArg(2) boolean arg2) {
		try {
			@Pc(4) int local4 = arg1.method458();
			this.anIntArray95[0] = local4 >> 4;
			if (arg2) {
				this.anIntArray95[1] = local4 & 0xF;
				if (local4 == 0) {
					this.anIntArray96[0] = this.anIntArray96[1] = 0;
				} else {
					this.anIntArray96[0] = arg1.method460();
					this.anIntArray96[1] = arg1.method460();
					@Pc(38) int local38 = arg1.method458();
					@Pc(44) int local44;
					for (@Pc(40) int local40 = 0; local40 < 2; local40++) {
						for (local44 = 0; local44 < this.anIntArray95[local40]; local44++) {
							this.anIntArrayArrayArray3[local40][0][local44] = arg1.method460();
							this.anIntArrayArrayArray4[local40][0][local44] = arg1.method460();
						}
					}
					for (local44 = 0; local44 < 2; local44++) {
						for (@Pc(83) int local83 = 0; local83 < this.anIntArray95[local44]; local83++) {
							if ((local38 & 0x1 << local44 * 4 << local83) == 0) {
								this.anIntArrayArrayArray3[local44][1][local83] = this.anIntArrayArrayArray3[local44][0][local83];
								this.anIntArrayArrayArray4[local44][1][local83] = this.anIntArrayArrayArray4[local44][0][local83];
							} else {
								this.anIntArrayArrayArray3[local44][1][local83] = arg1.method460();
								this.anIntArrayArrayArray4[local44][1][local83] = arg1.method460();
							}
						}
					}
					if (local38 != 0 || this.anIntArray96[1] != this.anIntArray96[0]) {
						arg0.method242(arg1, this.aBoolean97);
					}
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("67661, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
