import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GLZZOSSI")
public final class Class10 {

	@OriginalMember(owner = "client!GLZZOSSI", name = "g", descriptor = "F")
	private static float aFloat1;

	@OriginalMember(owner = "client!GLZZOSSI", name = "h", descriptor = "I")
	public static int anInt201;

	@OriginalMember(owner = "client!GLZZOSSI", name = "e", descriptor = "[[F")
	private static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!GLZZOSSI", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray4 = new int[2][8];

	@OriginalMember(owner = "client!GLZZOSSI", name = "a", descriptor = "[I")
	public int[] anIntArray41 = new int[2];

	@OriginalMember(owner = "client!GLZZOSSI", name = "b", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1 = new int[2][2][4];

	@OriginalMember(owner = "client!GLZZOSSI", name = "c", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2 = new int[2][2][4];

	@OriginalMember(owner = "client!GLZZOSSI", name = "d", descriptor = "[I")
	private int[] anIntArray42 = new int[2];

	@OriginalMember(owner = "client!GLZZOSSI", name = "a", descriptor = "(FIZI)F")
	private float method170(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray2[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray2[arg1][1][arg2] - this.anIntArrayArrayArray2[arg1][0][arg2]);
			@Pc(34) float local34 = local30 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-local34 / 20.0F));
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("8586, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLZZOSSI", name = "a", descriptor = "(ZF)F")
	private float method171(@OriginalArg(1) float arg0) {
		try {
			@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return local7 * 3.1415927F / 11025.0F;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("74149, " + true + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLZZOSSI", name = "a", descriptor = "(FZII)F")
	private float method172(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(30) float local30 = (float) this.anIntArrayArrayArray1[arg1][0][arg2] + arg0 * (float) (this.anIntArrayArrayArray1[arg1][1][arg2] - this.anIntArrayArrayArray1[arg1][0][arg2]);
			@Pc(40) float local40 = local30 * 1.2207031E-4F;
			return this.method171(local40);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("1197, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLZZOSSI", name = "a", descriptor = "(IIF)I")
	public int method173(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		try {
			@Pc(26) float local26;
			if (arg0 == 0) {
				local26 = (float) this.anIntArray42[0] + (float) (this.anIntArray42[1] - this.anIntArray42[0]) * arg1;
				@Pc(30) float local30 = local26 * 0.0030517578F;
				aFloat1 = (float) Math.pow(0.1D, (double) (local30 / 20.0F));
				anInt201 = (int) (aFloat1 * 65536.0F);
			}
			if (this.anIntArray41[arg0] == 0) {
				return 0;
			}
			local26 = this.method170(arg1, arg0, 0);
			aFloatArrayArray1[arg0][0] = -2.0F * local26 * (float) Math.cos((double) this.method172(arg1, arg0, 0));
			aFloatArrayArray1[arg0][1] = local26 * local26;
			for (@Pc(85) int local85 = 1; local85 < this.anIntArray41[arg0]; local85++) {
				local26 = this.method170(arg1, arg0, local85);
				@Pc(108) float local108 = -2.0F * local26 * (float) Math.cos((double) this.method172(arg1, arg0, local85));
				@Pc(112) float local112 = local26 * local26;
				aFloatArrayArray1[arg0][local85 * 2 + 1] = aFloatArrayArray1[arg0][local85 * 2 - 1] * local112;
				aFloatArrayArray1[arg0][local85 * 2] = aFloatArrayArray1[arg0][local85 * 2 - 1] * local108 + aFloatArrayArray1[arg0][local85 * 2 - 2] * local112;
				for (@Pc(168) int local168 = local85 * 2 - 1; local168 >= 2; local168--) {
					aFloatArrayArray1[arg0][local168] += aFloatArrayArray1[arg0][local168 - 1] * local108 + aFloatArrayArray1[arg0][local168 - 2] * local112;
				}
				aFloatArrayArray1[arg0][1] += aFloatArrayArray1[arg0][0] * local108 + local112;
				aFloatArrayArray1[arg0][0] += local108;
			}
			@Pc(238) int local238;
			if (arg0 == 0) {
				for (local238 = 0; local238 < this.anIntArray41[0] * 2; local238++) {
					aFloatArrayArray1[0][local238] *= aFloat1;
				}
			}
			for (local238 = 0; local238 < this.anIntArray41[arg0] * 2; local238++) {
				anIntArrayArray4[arg0][local238] = (int) (aFloatArrayArray1[arg0][local238] * 65536.0F);
			}
			return this.anIntArray41[arg0] * 2;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("80271, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GLZZOSSI", name = "a", descriptor = "(Lclient!DNRIFKTO;Lclient!GJKLDIZT;B)V")
	public void method174(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) Class9 arg1) {
		try {
			@Pc(4) int local4 = arg0.method94();
			this.anIntArray41[0] = local4 >> 4;
			this.anIntArray41[1] = local4 & 0xF;
			if (local4 == 0) {
				this.anIntArray42[0] = this.anIntArray42[1] = 0;
			} else {
				this.anIntArray42[0] = arg0.method96();
				this.anIntArray42[1] = arg0.method96();
				@Pc(39) int local39 = arg0.method94();
				@Pc(45) int local45;
				for (@Pc(41) int local41 = 0; local41 < 2; local41++) {
					for (local45 = 0; local45 < this.anIntArray41[local41]; local45++) {
						this.anIntArrayArrayArray1[local41][0][local45] = arg0.method96();
						this.anIntArrayArrayArray2[local41][0][local45] = arg0.method96();
					}
				}
				for (local45 = 0; local45 < 2; local45++) {
					for (@Pc(84) int local84 = 0; local84 < this.anIntArray41[local45]; local84++) {
						if ((local39 & 0x1 << local45 * 4 << local84) == 0) {
							this.anIntArrayArrayArray1[local45][1][local84] = this.anIntArrayArrayArray1[local45][0][local84];
							this.anIntArrayArrayArray2[local45][1][local84] = this.anIntArrayArrayArray2[local45][0][local84];
						} else {
							this.anIntArrayArrayArray1[local45][1][local84] = arg0.method96();
							this.anIntArrayArrayArray2[local45][1][local84] = arg0.method96();
						}
					}
				}
				if (local39 != 0 || this.anIntArray42[1] != this.anIntArray42[0]) {
					arg1.method167(arg0);
				}
			}
		} catch (@Pc(189) RuntimeException local189) {
			signlink.reporterror("18087, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local189.toString());
			throw new RuntimeException();
		}
	}
}
