import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class141 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "[I")
	private int[] anIntArray342;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray51;

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "Lclient!bn;")
	private Class25 aClass25_22;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "[I")
	private int[] anIntArray344;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "[I")
	private int[] anIntArray347;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "Ljava/lang/String;")
	private String aString140;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "Ljava/lang/String;")
	private String aString141;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray52;

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
	public int anInt4026 = -1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method3710() {
		if (this.aString141 == null) {
			this.aString141 = this.aString140;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!jg;I)V")
	private void method3711(@OriginalArg(1) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString140 = arg0.method2528();
		} else if (arg1 == 2) {
			this.aString141 = arg0.method2528();
		} else {
			@Pc(85) int local85;
			@Pc(91) int local91;
			if (arg1 == 3) {
				local85 = arg0.method2548();
				this.anIntArrayArray63 = new int[local85][3];
				for (local91 = 0; local91 < local85; local91++) {
					this.anIntArrayArray63[local91][0] = arg0.method2498();
					this.anIntArrayArray63[local91][1] = arg0.method2510();
					this.anIntArrayArray63[local91][2] = arg0.method2510();
				}
			} else if (arg1 == 4) {
				local85 = arg0.method2548();
				this.anIntArrayArray65 = new int[local85][3];
				for (local91 = 0; local91 < local85; local91++) {
					this.anIntArrayArray65[local91][0] = arg0.method2498();
					this.anIntArrayArray65[local91][1] = arg0.method2510();
					this.anIntArrayArray65[local91][2] = arg0.method2510();
				}
			} else if (arg1 == 5) {
				arg0.method2498();
			} else if (arg1 == 6) {
				arg0.method2548();
			} else if (arg1 == 7) {
				arg0.method2548();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method2548();
				} else if (arg1 == 10) {
					local85 = arg0.method2548();
					this.anIntArray346 = new int[local85];
					for (local91 = 0; local91 < local85; local91++) {
						this.anIntArray346[local91] = arg0.method2510();
					}
				} else if (arg1 == 12) {
					arg0.method2510();
				} else if (arg1 == 13) {
					local85 = arg0.method2548();
					this.anIntArray347 = new int[local85];
					for (local91 = 0; local91 < local85; local91++) {
						this.anIntArray347[local91] = arg0.method2498();
					}
				} else if (arg1 == 14) {
					local85 = arg0.method2548();
					this.anIntArrayArray64 = new int[local85][2];
					for (local91 = 0; local91 < local85; local91++) {
						this.anIntArrayArray64[local91][0] = arg0.method2548();
						this.anIntArrayArray64[local91][1] = arg0.method2548();
					}
				} else if (arg1 == 15) {
					arg0.method2498();
				} else if (arg1 == 17) {
					this.anInt4026 = arg0.method2498();
				} else if (arg1 == 18) {
					local85 = arg0.method2548();
					this.aStringArray51 = new String[local85];
					this.anIntArray343 = new int[local85];
					this.anIntArray342 = new int[local85];
					this.anIntArray340 = new int[local85];
					for (local91 = 0; local91 < local85; local91++) {
						this.anIntArray340[local91] = arg0.method2510();
						this.anIntArray343[local91] = arg0.method2510();
						this.anIntArray342[local91] = arg0.method2510();
						this.aStringArray51[local91] = arg0.method2496();
					}
				} else if (arg1 == 19) {
					local85 = arg0.method2548();
					this.aStringArray52 = new String[local85];
					this.anIntArray348 = new int[local85];
					this.anIntArray344 = new int[local85];
					this.anIntArray341 = new int[local85];
					for (local91 = 0; local91 < local85; local91++) {
						this.anIntArray341[local91] = arg0.method2510();
						this.anIntArray344[local91] = arg0.method2510();
						this.anIntArray348[local91] = arg0.method2510();
						this.aStringArray52[local91] = arg0.method2496();
					}
				} else if (arg1 == 249) {
					local85 = arg0.method2548();
					if (this.aClass25_22 == null) {
						local91 = Static224.method4011(local85);
						this.aClass25_22 = new Class25(local91);
					}
					for (local91 = 0; local91 < local85; local91++) {
						@Pc(239) boolean local239 = arg0.method2548() == 1;
						@Pc(243) int local243 = arg0.method2501();
						@Pc(252) Class14 local252;
						if (local239) {
							local252 = new Class14_Sub29(arg0.method2496());
						} else {
							local252 = new Class14_Sub34(arg0.method2510());
						}
						this.aClass25_22.method687((long) local243, local252);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!jg;B)V")
	public void method3712(@OriginalArg(0) Class14_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2548();
			if (local13 == 0) {
				return;
			}
			this.method3711(arg0, local13);
		}
	}
}
