import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BVWZSTJJ")
public final class Class4 {

	@OriginalMember(owner = "client!BVWZSTJJ", name = "h", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!BVWZSTJJ", name = "i", descriptor = "I")
	public static int anInt260;

	@OriginalMember(owner = "client!BVWZSTJJ", name = "f", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!BVWZSTJJ", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "I")
	private int anInt259 = -6404;

	@OriginalMember(owner = "client!BVWZSTJJ", name = "b", descriptor = "[I")
	public int[] anIntArray32 = new int[2];

	@OriginalMember(owner = "client!BVWZSTJJ", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!BVWZSTJJ", name = "d", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!BVWZSTJJ", name = "e", descriptor = "[I")
	private int[] anIntArray33 = new int[2];

	@OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "(IIFI)F")
	private float method117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		try {
			@Pc(38) float local38 = (float) this.anIntArrayArrayArray2[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray2[arg1][1][arg0] - this.anIntArrayArrayArray2[arg1][0][arg0]);
			@Pc(42) float local42 = local38 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local42 / 20.0F));
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("23308, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -613 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "(ZF)F")
	private float method118(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("93519, " + false + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "(FIII)F")
	private float method119(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray1[arg1][1][arg2] - this.anIntArrayArrayArray1[arg1][0][arg2]);
			@Pc(41) float local41 = local30 * 1.2207031E-4F;
			return this.method118(local41);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("6444, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "(BFI)I")
	public int method120(@OriginalArg(0) byte arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(22) float local22;
			if (arg2 == 0) {
				local22 = (float) this.anIntArray33[0] + (float) (this.anIntArray33[1] - this.anIntArray33[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt260 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray32[arg2] == 0) {
				return 0;
			}
			local22 = this.method117(0, arg2, arg1);
			aFloatArrayArray1[arg2][0] = -2.0F * local22 * (float) Math.cos((double) this.method119(arg1, arg2, 0));
			aFloatArrayArray1[arg2][1] = local22 * local22;
			for (@Pc(81) int local81 = 1; local81 < this.anIntArray32[arg2]; local81++) {
				local22 = this.method117(local81, arg2, arg1);
				@Pc(104) float local104 = -2.0F * local22 * (float) Math.cos((double) this.method119(arg1, arg2, local81));
				@Pc(108) float local108 = local22 * local22;
				aFloatArrayArray1[arg2][local81 * 2 + 1] = aFloatArrayArray1[arg2][local81 * 2 - 1] * local108;
				aFloatArrayArray1[arg2][local81 * 2] = aFloatArrayArray1[arg2][local81 * 2 - 1] * local104 + aFloatArrayArray1[arg2][local81 * 2 - 2] * local108;
				for (@Pc(164) int local164 = local81 * 2 - 1; local164 >= 2; local164--) {
					aFloatArrayArray1[arg2][local164] += aFloatArrayArray1[arg2][local164 - 1] * local104 + aFloatArrayArray1[arg2][local164 - 2] * local108;
				}
				aFloatArrayArray1[arg2][1] += aFloatArrayArray1[arg2][0] * local104 + local108;
				aFloatArrayArray1[arg2][0] += local104;
			}
			@Pc(235) boolean local235 = false;
			@Pc(248) int local248;
			if (arg2 == 0) {
				for (local248 = 0; local248 < this.anIntArray32[0] * 2; local248++) {
					aFloatArrayArray1[0][local248] *= aFloat1;
				}
			}
			for (local248 = 0; local248 < this.anIntArray32[arg2] * 2; local248++) {
				anIntArrayArray1[arg2][local248] = (int) (aFloatArrayArray1[arg2][local248] * 65536.0F);
			}
			return this.anIntArray32[arg2] * 2;
		} catch (@Pc(302) RuntimeException local302) {
			signlink.reporterror("55008, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local302.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BVWZSTJJ", name = "a", descriptor = "(Lclient!TPZZASFL;Lclient!MVHXDWGI;B)V")
	public void method121(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(4) int local4 = arg1.method294();
			this.anIntArray32[0] = local4 >> 4;
			this.anIntArray32[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray33[0] = this.anIntArray33[1] = 0;
			} else {
				this.anIntArray33[0] = arg1.method296();
				this.anIntArray33[1] = arg1.method296();
				@Pc(41) int local41 = arg1.method294();
				@Pc(47) int local47;
				for (@Pc(43) int local43 = 0; local43 < 2; local43++) {
					for (local47 = 0; local47 < this.anIntArray32[local43]; local47++) {
						this.anIntArrayArrayArray1[local43][0][local47] = arg1.method296();
						this.anIntArrayArrayArray2[local43][0][local47] = arg1.method296();
					}
				}
				for (local47 = 0; local47 < 2; local47++) {
					for (@Pc(86) int local86 = 0; local86 < this.anIntArray32[local47]; local86++) {
						if ((local41 & 0x1 << local47 * 4 << local86) == 0) {
							this.anIntArrayArrayArray1[local47][1][local86] = this.anIntArrayArrayArray1[local47][0][local86];
							this.anIntArrayArrayArray2[local47][1][local86] = this.anIntArrayArrayArray2[local47][0][local86];
						} else {
							this.anIntArrayArrayArray1[local47][1][local86] = arg1.method296();
							this.anIntArrayArrayArray2[local47][1][local86] = arg1.method296();
						}
					}
				}
				if (local41 != 0 || this.anIntArray33[1] != this.anIntArray33[0]) {
					arg0.method542(arg1);
				}
			}
		} catch (@Pc(196) RuntimeException local196) {
			signlink.reporterror("94390, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local196.toString());
			throw new RuntimeException();
		}
	}
}
