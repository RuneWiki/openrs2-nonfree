import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class236 {

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "Lclient!wr;")
	private Class380 aClass380_27;

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!oba", name = "i", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!oba", name = "j", descriptor = "[I")
	private int[] anIntArray364;

	@OriginalMember(owner = "client!oba", name = "l", descriptor = "Ljava/lang/String;")
	private String aString75;

	@OriginalMember(owner = "client!oba", name = "m", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!oba", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray21;

	@OriginalMember(owner = "client!oba", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!oba", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!oba", name = "s", descriptor = "[I")
	private int[] anIntArray366;

	@OriginalMember(owner = "client!oba", name = "t", descriptor = "[I")
	private int[] anIntArray367;

	@OriginalMember(owner = "client!oba", name = "u", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray22;

	@OriginalMember(owner = "client!oba", name = "v", descriptor = "Ljava/lang/String;")
	private String aString76;

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
	public int anInt7332 = -1;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BLclient!ji;)V")
	public void method6198(@OriginalArg(1) Class6_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8246();
			if (local9 == 0) {
				return;
			}
			this.method6200(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!ji;II)V")
	private void method6200(@OriginalArg(0) Class6_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString76 = arg0.method8240();
		} else if (arg1 == 2) {
			this.aString75 = arg0.method8240();
		} else {
			@Pc(21) int local21;
			@Pc(28) int local28;
			if (arg1 == 3) {
				local21 = arg0.method8246();
				this.anIntArrayArray34 = new int[local21][3];
				for (local28 = 0; local28 < local21; local28++) {
					this.anIntArrayArray34[local28][0] = arg0.method8220();
					this.anIntArrayArray34[local28][1] = arg0.method8236();
					this.anIntArrayArray34[local28][2] = arg0.method8236();
				}
			} else if (arg1 == 4) {
				local21 = arg0.method8246();
				this.anIntArrayArray32 = new int[local21][3];
				for (local28 = 0; local28 < local21; local28++) {
					this.anIntArrayArray32[local28][0] = arg0.method8220();
					this.anIntArrayArray32[local28][1] = arg0.method8236();
					this.anIntArrayArray32[local28][2] = arg0.method8236();
				}
			} else if (arg1 == 5) {
				arg0.method8220();
			} else if (arg1 == 6) {
				arg0.method8246();
			} else if (arg1 == 7) {
				arg0.method8246();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method8246();
				} else if (arg1 == 10) {
					local21 = arg0.method8246();
					this.anIntArray363 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray363[local28] = arg0.method8236();
					}
				} else if (arg1 == 12) {
					arg0.method8236();
				} else if (arg1 == 13) {
					local21 = arg0.method8246();
					this.anIntArray362 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray362[local28] = arg0.method8220();
					}
				} else if (arg1 == 14) {
					local21 = arg0.method8246();
					this.anIntArrayArray33 = new int[local21][2];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArrayArray33[local28][0] = arg0.method8246();
						this.anIntArrayArray33[local28][1] = arg0.method8246();
					}
				} else if (arg1 == 15) {
					arg0.method8220();
				} else if (arg1 == 17) {
					this.anInt7332 = arg0.method8220();
				} else if (arg1 == 18) {
					local21 = arg0.method8246();
					this.anIntArray364 = new int[local21];
					this.anIntArray361 = new int[local21];
					this.aStringArray22 = new String[local21];
					this.anIntArray367 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray361[local28] = arg0.method8236();
						this.anIntArray364[local28] = arg0.method8236();
						this.anIntArray367[local28] = arg0.method8236();
						this.aStringArray22[local28] = arg0.method8221();
					}
				} else if (arg1 == 19) {
					local21 = arg0.method8246();
					this.anIntArray365 = new int[local21];
					this.aStringArray21 = new String[local21];
					this.anIntArray360 = new int[local21];
					this.anIntArray366 = new int[local21];
					for (local28 = 0; local28 < local21; local28++) {
						this.anIntArray360[local28] = arg0.method8236();
						this.anIntArray365[local28] = arg0.method8236();
						this.anIntArray366[local28] = arg0.method8236();
						this.aStringArray21[local28] = arg0.method8221();
					}
				} else if (arg1 == 249) {
					local21 = arg0.method8246();
					if (this.aClass380_27 == null) {
						local28 = Static101.method2622(local21);
						this.aClass380_27 = new Class380(local28);
					}
					for (local28 = 0; local28 < local21; local28++) {
						@Pc(311) boolean local311 = arg0.method8246() == 1;
						@Pc(315) int local315 = arg0.method8203();
						@Pc(324) Class6 local324;
						if (local311) {
							local324 = new Class6_Sub23(arg0.method8221());
						} else {
							local324 = new Class6_Sub37(arg0.method8236());
						}
						this.aClass380_27.method8753(local324, (long) local315);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
	public void method6201() {
		if (this.aString75 == null) {
			this.aString75 = this.aString76;
		}
	}
}
