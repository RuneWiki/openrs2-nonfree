import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class246 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
	private int[] anIntArray455;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "[I")
	private int[] anIntArray456;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
	private int[] anIntArray457;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "[I")
	private int[] anIntArray458;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Ljava/lang/String;")
	private String aString59;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "[I")
	private int[] anIntArray460;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Ljava/lang/String;")
	private String aString60;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "Lclient!an;")
	private Class11 aClass11_41;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray48;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray49;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "[I")
	private int[] anIntArray461;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "[I")
	private int[] anIntArray463;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
	public int anInt6707 = -1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!cu;II)V")
	private void method5250(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString60 = arg0.method2591();
		} else if (arg1 == 2) {
			this.aString59 = arg0.method2591();
		} else {
			@Pc(25) int local25;
			@Pc(32) int local32;
			if (arg1 == 3) {
				local25 = arg0.method2582();
				this.anIntArrayArray50 = new int[local25][3];
				for (local32 = 0; local32 < local25; local32++) {
					this.anIntArrayArray50[local32][0] = arg0.method2588();
					this.anIntArrayArray50[local32][1] = arg0.method2589();
					this.anIntArrayArray50[local32][2] = arg0.method2589();
				}
			} else if (arg1 == 4) {
				local25 = arg0.method2582();
				this.anIntArrayArray48 = new int[local25][3];
				for (local32 = 0; local32 < local25; local32++) {
					this.anIntArrayArray48[local32][0] = arg0.method2588();
					this.anIntArrayArray48[local32][1] = arg0.method2589();
					this.anIntArrayArray48[local32][2] = arg0.method2589();
				}
			} else if (arg1 == 5) {
				arg0.method2588();
			} else if (arg1 == 6) {
				arg0.method2582();
			} else if (arg1 == 7) {
				arg0.method2582();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method2582();
				} else if (arg1 == 10) {
					local25 = arg0.method2582();
					this.anIntArray462 = new int[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray462[local32] = arg0.method2589();
					}
				} else if (arg1 == 12) {
					arg0.method2589();
				} else if (arg1 == 13) {
					local25 = arg0.method2582();
					this.anIntArray456 = new int[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray456[local32] = arg0.method2588();
					}
				} else if (arg1 == 14) {
					local25 = arg0.method2582();
					this.anIntArrayArray49 = new int[local25][2];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArrayArray49[local32][0] = arg0.method2582();
						this.anIntArrayArray49[local32][1] = arg0.method2582();
					}
				} else if (arg1 == 15) {
					arg0.method2588();
				} else if (arg1 == 17) {
					this.anInt6707 = arg0.method2588();
				} else if (arg1 == 18) {
					local25 = arg0.method2582();
					this.anIntArray461 = new int[local25];
					this.anIntArray458 = new int[local25];
					this.aStringArray48 = new String[local25];
					this.anIntArray457 = new int[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray461[local32] = arg0.method2589();
						this.anIntArray457[local32] = arg0.method2589();
						this.anIntArray458[local32] = arg0.method2589();
						this.aStringArray48[local32] = arg0.method2620();
					}
				} else if (arg1 == 19) {
					local25 = arg0.method2582();
					this.anIntArray463 = new int[local25];
					this.anIntArray455 = new int[local25];
					this.anIntArray460 = new int[local25];
					this.aStringArray49 = new String[local25];
					for (local32 = 0; local32 < local25; local32++) {
						this.anIntArray460[local32] = arg0.method2589();
						this.anIntArray455[local32] = arg0.method2589();
						this.anIntArray463[local32] = arg0.method2589();
						this.aStringArray49[local32] = arg0.method2620();
					}
				} else if (arg1 == 249) {
					local25 = arg0.method2582();
					if (this.aClass11_41 == null) {
						local32 = Static288.method4088(local25);
						this.aClass11_41 = new Class11(local32);
					}
					for (local32 = 0; local32 < local25; local32++) {
						@Pc(304) boolean local304 = arg0.method2582() == 1;
						@Pc(308) int local308 = arg0.method2604();
						@Pc(317) Class3 local317;
						if (local304) {
							local317 = new Class3_Sub35(arg0.method2620());
						} else {
							local317 = new Class3_Sub34(arg0.method2589());
						}
						this.aClass11_41.method319(local317, (long) local308);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method5251(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2582();
			if (local15 == 0) {
				return;
			}
			this.method5250(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method5252() {
		if (this.aString59 == null) {
			this.aString59 = this.aString60;
		}
	}
}
