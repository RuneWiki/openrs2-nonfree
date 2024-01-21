import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VLRTJGOX")
public final class Class46 {

	@OriginalMember(owner = "client!VLRTJGOX", name = "k", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!VLRTJGOX", name = "l", descriptor = "I")
	public static int anInt760;

	@OriginalMember(owner = "client!VLRTJGOX", name = "i", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!VLRTJGOX", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[2][8];

	@OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!VLRTJGOX", name = "b", descriptor = "Z")
	private boolean aBoolean200 = true;

	@OriginalMember(owner = "client!VLRTJGOX", name = "c", descriptor = "I")
	private int anInt759 = 48306;

	@OriginalMember(owner = "client!VLRTJGOX", name = "d", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!VLRTJGOX", name = "e", descriptor = "[I")
	public int[] anIntArray197 = new int[2];

	@OriginalMember(owner = "client!VLRTJGOX", name = "f", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5 = new int[2][2][4];

	@OriginalMember(owner = "client!VLRTJGOX", name = "g", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6 = new int[2][2][4];

	@OriginalMember(owner = "client!VLRTJGOX", name = "h", descriptor = "[I")
	private int[] anIntArray198 = new int[2];

	@OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "(IZIF)F")
	private float method511(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(36) float local36 = (float) this.anIntArrayArrayArray6[arg0][0][arg1] + arg2 * (float) (this.anIntArrayArrayArray6[arg0][1][arg1] - this.anIntArrayArrayArray6[arg0][0][arg1]);
			@Pc(40) float local40 = local36 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local40 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("89264, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "(FZ)F")
	private float method512(@OriginalArg(0) float arg0) {
		try {
			@Pc(16) float local16 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local16 * 3.1415927F / 11025.0F;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("50834, " + arg0 + ", " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "(IIIF)F")
	private float method513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2) {
		try {
			@Pc(40) float local40 = (float) this.anIntArrayArrayArray5[arg1][0][arg0] + arg2 * (float) (this.anIntArrayArrayArray5[arg1][1][arg0] - this.anIntArrayArrayArray5[arg1][0][arg0]);
			@Pc(44) float local44 = local40 * 1.2207031E-4F;
			return this.method512(local44);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("90304, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "(IFI)I")
	public int method514(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(22) float local22;
			if (arg0 == 0) {
				local22 = (float) this.anIntArray198[0] + (float) (this.anIntArray198[1] - this.anIntArray198[0]) * arg1;
				@Pc(26) float local26 = local22 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local26 / 20.0F));
				anInt760 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray197[arg0] == 0) {
				return 0;
			}
			local22 = this.method511(arg0, 0, arg1);
			aFloatArrayArray1[arg0][0] = -2.0F * local22 * (float) Math.cos((double) this.method513(0, arg0, arg1));
			aFloatArrayArray1[arg0][1] = local22 * local22;
			for (@Pc(81) int local81 = 1; local81 < this.anIntArray197[arg0]; local81++) {
				local22 = this.method511(arg0, local81, arg1);
				@Pc(104) float local104 = -2.0F * local22 * (float) Math.cos((double) this.method513(local81, arg0, arg1));
				@Pc(108) float local108 = local22 * local22;
				aFloatArrayArray1[arg0][local81 * 2 + 1] = aFloatArrayArray1[arg0][local81 * 2 - 1] * local108;
				aFloatArrayArray1[arg0][local81 * 2] = aFloatArrayArray1[arg0][local81 * 2 - 1] * local104 + aFloatArrayArray1[arg0][local81 * 2 - 2] * local108;
				for (@Pc(164) int local164 = local81 * 2 - 1; local164 >= 2; local164--) {
					aFloatArrayArray1[arg0][local164] += aFloatArrayArray1[arg0][local164 - 1] * local104 + aFloatArrayArray1[arg0][local164 - 2] * local108;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local104 + local108;
				aFloatArrayArray1[arg0][0] += local104;
			}
			if (arg2 != this.anInt759) {
				return 4;
			}
			@Pc(240) int local240;
			if (arg0 == 0) {
				for (local240 = 0; local240 < this.anIntArray197[0] * 2; local240++) {
					aFloatArrayArray1[0][local240] *= aFloat1;
				}
			}
			for (local240 = 0; local240 < this.anIntArray197[arg0] * 2; local240++) {
				anIntArrayArray20[arg0][local240] = (int) (aFloatArrayArray1[arg0][local240] * 65536.0F);
			}
			return this.anIntArray197[arg0] * 2;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("3229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLRTJGOX", name = "a", descriptor = "(Lclient!RGCGKKUR;Lclient!SHSBXUIJ;I)V")
	public void method515(@OriginalArg(0) Class6_Sub1_Sub4 arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) int local4 = arg0.method411();
			this.anIntArray197[0] = local4 >> 4;
			this.anIntArray197[1] = local4 & 0xF;
			if (arg2 != 0) {
				this.aBoolean199 = !this.aBoolean199;
			}
			if (local4 == 0) {
				this.anIntArray198[0] = this.anIntArray198[1] = 0;
			} else {
				this.anIntArray198[0] = arg0.method413();
				this.anIntArray198[1] = arg0.method413();
				@Pc(45) int local45 = arg0.method411();
				@Pc(51) int local51;
				for (@Pc(47) int local47 = 0; local47 < 2; local47++) {
					for (local51 = 0; local51 < this.anIntArray197[local47]; local51++) {
						this.anIntArrayArrayArray5[local47][0][local51] = arg0.method413();
						this.anIntArrayArrayArray6[local47][0][local51] = arg0.method413();
					}
				}
				for (local51 = 0; local51 < 2; local51++) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray197[local51]; local90++) {
						if ((local45 & 0x1 << local51 * 4 << local90) == 0) {
							this.anIntArrayArrayArray5[local51][1][local90] = this.anIntArrayArrayArray5[local51][0][local90];
							this.anIntArrayArrayArray6[local51][1][local90] = this.anIntArrayArrayArray6[local51][0][local90];
						} else {
							this.anIntArrayArrayArray5[local51][1][local90] = arg0.method413();
							this.anIntArrayArrayArray6[local51][1][local90] = arg0.method413();
						}
					}
				}
				if (local45 != 0 || this.anIntArray198[1] != this.anIntArray198[0]) {
					arg1.method450(arg0);
				}
			}
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("45525, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}
}
