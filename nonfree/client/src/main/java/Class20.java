import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class20 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray6;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "Lclient!tn;")
	private Class190 aClass190_2;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray7;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	public int anInt473 = -1;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	public void method439() {
		if (this.aString4 == null) {
			this.aString4 = this.aString5;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!rg;)V")
	public void method441(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5115();
			if (local15 == 0) {
				return;
			}
			this.method444(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!rg;I)V")
	private void method444(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.aString5 = arg1.method5087();
		} else if (arg0 == 2) {
			this.aString4 = arg1.method5087();
		} else {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (arg0 == 3) {
				local21 = arg1.method5115();
				this.anIntArrayArray12 = new int[local21][3];
				for (local28 = 0; local28 < local21; local28++) {
					this.anIntArrayArray12[local28][0] = arg1.method5106();
					this.anIntArrayArray12[local28][1] = arg1.method5067();
					this.anIntArrayArray12[local28][2] = arg1.method5067();
				}
			} else if (arg0 == 4) {
				local21 = arg1.method5115();
				this.anIntArrayArray14 = new int[local21][3];
				for (local28 = 0; local28 < local21; local28++) {
					this.anIntArrayArray14[local28][0] = arg1.method5106();
					this.anIntArrayArray14[local28][1] = arg1.method5067();
					this.anIntArrayArray14[local28][2] = arg1.method5067();
				}
			} else if (arg0 == 5) {
				arg1.method5106();
			} else if (arg0 == 6) {
				arg1.method5115();
			} else if (arg0 == 7) {
				arg1.method5115();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method5115();
				} else if (arg0 == 10) {
					local21 = arg1.method5115();
					this.anIntArray64 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray64[local28] = arg1.method5067();
					}
				} else if (arg0 == 12) {
					arg1.method5067();
				} else if (arg0 == 13) {
					local21 = arg1.method5115();
					this.anIntArray62 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray62[local28] = arg1.method5106();
					}
				} else if (arg0 == 14) {
					local21 = arg1.method5115();
					this.anIntArrayArray13 = new int[local21][2];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArrayArray13[local28][0] = arg1.method5115();
						this.anIntArrayArray13[local28][1] = arg1.method5115();
					}
				} else if (arg0 == 15) {
					arg1.method5106();
				} else if (arg0 == 17) {
					this.anInt473 = arg1.method5106();
				} else if (arg0 == 18) {
					local21 = arg1.method5115();
					this.aStringArray6 = new String[local21];
					this.anIntArray59 = new int[local21];
					this.anIntArray58 = new int[local21];
					this.anIntArray65 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray59[local28] = arg1.method5067();
						this.anIntArray58[local28] = arg1.method5067();
						this.anIntArray65[local28] = arg1.method5067();
						this.aStringArray6[local28] = arg1.method5064();
					}
				} else if (arg0 == 19) {
					local21 = arg1.method5115();
					this.anIntArray61 = new int[local21];
					this.anIntArray63 = new int[local21];
					this.anIntArray60 = new int[local21];
					this.aStringArray7 = new String[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray61[local28] = arg1.method5067();
						this.anIntArray63[local28] = arg1.method5067();
						this.anIntArray60[local28] = arg1.method5067();
						this.aStringArray7[local28] = arg1.method5064();
					}
				} else if (arg0 == 249) {
					local21 = arg1.method5115();
					if (this.aClass190_2 == null) {
						local28 = Static109.method1929(local21);
						this.aClass190_2 = new Class190(local28);
					}
					for (local28 = 0; local28 < local21; local28++) {
						@Pc(298) boolean local298 = arg1.method5115() == 1;
						@Pc(302) int local302 = arg1.method5072();
						@Pc(311) Class5 local311;
						if (local298) {
							local311 = new Class5_Sub25(arg1.method5064());
						} else {
							local311 = new Class5_Sub15(arg1.method5067());
						}
						this.aClass190_2.method5464(local311, (long) local302);
					}
				}
			}
		}
	}
}
