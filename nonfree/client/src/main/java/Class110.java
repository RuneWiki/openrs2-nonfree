import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class110 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "[I")
	private int[] anIntArray242;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "[I")
	private int[] anIntArray243;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Lclient!ru;")
	private Class220 aClass220_16;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray33;

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray34;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "[I")
	private int[] anIntArray247;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
	public int anInt2794 = -1;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public void method2304() {
		if (this.aString27 == null) {
			this.aString27 = this.aString28;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!hw;II)V")
	private void method2306(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString28 = arg0.method6156();
		} else if (arg1 == 2) {
			this.aString27 = arg0.method6156();
		} else {
			@Pc(37) int local37;
			@Pc(44) int local44;
			if (arg1 == 3) {
				local37 = arg0.method6138();
				this.anIntArrayArray65 = new int[local37][3];
				for (local44 = 0; local44 < local37; local44++) {
					this.anIntArrayArray65[local44][0] = arg0.method6148();
					this.anIntArrayArray65[local44][1] = arg0.method6129();
					this.anIntArrayArray65[local44][2] = arg0.method6129();
				}
			} else if (arg1 == 4) {
				local37 = arg0.method6138();
				this.anIntArrayArray64 = new int[local37][3];
				for (local44 = 0; local44 < local37; local44++) {
					this.anIntArrayArray64[local44][0] = arg0.method6148();
					this.anIntArrayArray64[local44][1] = arg0.method6129();
					this.anIntArrayArray64[local44][2] = arg0.method6129();
				}
			} else if (arg1 == 5) {
				arg0.method6148();
			} else if (arg1 == 6) {
				arg0.method6138();
			} else if (arg1 == 7) {
				arg0.method6138();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method6138();
				} else if (arg1 == 10) {
					local37 = arg0.method6138();
					this.anIntArray248 = new int[local37];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArray248[local44] = arg0.method6129();
					}
				} else if (arg1 == 12) {
					arg0.method6129();
				} else if (arg1 == 13) {
					local37 = arg0.method6138();
					this.anIntArray242 = new int[local37];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArray242[local44] = arg0.method6148();
					}
				} else if (arg1 == 14) {
					local37 = arg0.method6138();
					this.anIntArrayArray66 = new int[local37][2];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArrayArray66[local44][0] = arg0.method6138();
						this.anIntArrayArray66[local44][1] = arg0.method6138();
					}
				} else if (arg1 == 15) {
					arg0.method6148();
				} else if (arg1 == 17) {
					this.anInt2794 = arg0.method6148();
				} else if (arg1 == 18) {
					local37 = arg0.method6138();
					this.anIntArray246 = new int[local37];
					this.aStringArray33 = new String[local37];
					this.anIntArray243 = new int[local37];
					this.anIntArray244 = new int[local37];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArray246[local44] = arg0.method6129();
						this.anIntArray244[local44] = arg0.method6129();
						this.anIntArray243[local44] = arg0.method6129();
						this.aStringArray33[local44] = arg0.method6141();
					}
				} else if (arg1 == 19) {
					local37 = arg0.method6138();
					this.anIntArray245 = new int[local37];
					this.anIntArray241 = new int[local37];
					this.anIntArray247 = new int[local37];
					this.aStringArray34 = new String[local37];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArray245[local44] = arg0.method6129();
						this.anIntArray247[local44] = arg0.method6129();
						this.anIntArray241[local44] = arg0.method6129();
						this.aStringArray34[local44] = arg0.method6141();
					}
				} else if (arg1 == 249) {
					local37 = arg0.method6138();
					if (this.aClass220_16 == null) {
						local44 = Static43.method654(local37);
						this.aClass220_16 = new Class220(local44);
					}
					for (local44 = 0; local44 < local37; local44++) {
						@Pc(250) boolean local250 = arg0.method6138() == 1;
						@Pc(254) int local254 = arg0.method6145();
						@Pc(263) Class2 local263;
						if (local250) {
							local263 = new Class2_Sub29(arg0.method6141());
						} else {
							local263 = new Class2_Sub5(arg0.method6129());
						}
						this.aClass220_16.method5104(local263, (long) local254);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!hw;)V")
	public void method2307(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6138();
			if (local3 == 0) {
				return;
			}
			this.method2306(arg0, local3);
		}
	}
}
