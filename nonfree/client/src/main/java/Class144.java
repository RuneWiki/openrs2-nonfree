import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class144 {

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!ew;")
	private Class72 aClass72_29;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "[I")
	private int[] anIntArray318;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Ljava/lang/String;")
	private String aString107;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "[I")
	private int[] anIntArray319;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "Ljava/lang/String;")
	private String aString108;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray21;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	public int anInt3700 = -1;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	public void method2983() {
		if (this.aString107 == null) {
			this.aString107 = this.aString108;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BILclient!sv;)V")
	private void method2985(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.aString108 = arg1.method3589();
		} else if (arg0 == 2) {
			this.aString107 = arg1.method3589();
		} else {
			@Pc(29) int local29;
			@Pc(36) int local36;
			if (arg0 == 3) {
				local29 = arg1.method3580();
				this.anIntArrayArray25 = new int[local29][3];
				for (local36 = 0; local36 < local29; local36++) {
					this.anIntArrayArray25[local36][0] = arg1.method3555();
					this.anIntArrayArray25[local36][1] = arg1.method3574();
					this.anIntArrayArray25[local36][2] = arg1.method3574();
				}
			} else if (arg0 == 4) {
				local29 = arg1.method3580();
				this.anIntArrayArray24 = new int[local29][3];
				for (local36 = 0; local36 < local29; local36++) {
					this.anIntArrayArray24[local36][0] = arg1.method3555();
					this.anIntArrayArray24[local36][1] = arg1.method3574();
					this.anIntArrayArray24[local36][2] = arg1.method3574();
				}
			} else if (arg0 == 5) {
				arg1.method3555();
			} else if (arg0 == 6) {
				arg1.method3580();
			} else if (arg0 == 7) {
				arg1.method3580();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method3580();
				} else if (arg0 == 10) {
					local29 = arg1.method3580();
					this.anIntArray319 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray319[local36] = arg1.method3574();
					}
				} else if (arg0 == 12) {
					arg1.method3574();
				} else if (arg0 == 13) {
					local29 = arg1.method3580();
					this.anIntArray323 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray323[local36] = arg1.method3555();
					}
				} else if (arg0 == 14) {
					local29 = arg1.method3580();
					this.anIntArrayArray23 = new int[local29][2];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArrayArray23[local36][0] = arg1.method3580();
						this.anIntArrayArray23[local36][1] = arg1.method3580();
					}
				} else if (arg0 == 15) {
					arg1.method3555();
				} else if (arg0 == 17) {
					this.anInt3700 = arg1.method3555();
				} else if (arg0 == 18) {
					local29 = arg1.method3580();
					this.anIntArray321 = new int[local29];
					this.anIntArray320 = new int[local29];
					this.anIntArray318 = new int[local29];
					this.aStringArray20 = new String[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray321[local36] = arg1.method3574();
						this.anIntArray320[local36] = arg1.method3574();
						this.anIntArray318[local36] = arg1.method3574();
						this.aStringArray20[local36] = arg1.method3582();
					}
				} else if (arg0 == 19) {
					local29 = arg1.method3580();
					this.anIntArray325 = new int[local29];
					this.anIntArray322 = new int[local29];
					this.aStringArray21 = new String[local29];
					this.anIntArray324 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray325[local36] = arg1.method3574();
						this.anIntArray324[local36] = arg1.method3574();
						this.anIntArray322[local36] = arg1.method3574();
						this.aStringArray21[local36] = arg1.method3582();
					}
				} else if (arg0 == 249) {
					local29 = arg1.method3580();
					if (this.aClass72_29 == null) {
						local36 = Static29.method453(local29);
						this.aClass72_29 = new Class72(local36);
					}
					for (local36 = 0; local36 < local29; local36++) {
						@Pc(356) boolean local356 = arg1.method3580() == 1;
						@Pc(360) int local360 = arg1.method3563();
						@Pc(369) Class2 local369;
						if (local356) {
							local369 = new Class2_Sub3(arg1.method3582());
						} else {
							local369 = new Class2_Sub20(arg1.method3574());
						}
						this.aClass72_29.method1653(local369, (long) local360);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!sv;)V")
	public void method2986(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3580();
			if (local5 == 0) {
				return;
			}
			this.method2985(local5, arg0);
		}
	}
}
