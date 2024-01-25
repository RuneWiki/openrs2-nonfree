import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class361 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "[I")
	private int[] anIntArray606;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
	private int[] anIntArray607;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
	private int[] anIntArray608;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "[I")
	private int[] anIntArray609;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Ljava/lang/String;")
	private String aString105;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "[I")
	private int[] anIntArray610;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "Lclient!faa;")
	private Class91 aClass91_40;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "[I")
	private int[] anIntArray611;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray40;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray41;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "[I")
	private int[] anIntArray612;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "[I")
	private int[] anIntArray613;

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "Ljava/lang/String;")
	private String aString106;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
	public int anInt9619 = -1;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLclient!ac;)V")
	public void method7810(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method7974();
			if (local14 == 0) {
				return;
			}
			this.method7815(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public void method7811() {
		if (this.aString105 == null) {
			this.aString105 = this.aString106;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!ac;)V")
	private void method7815(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.aString106 = arg1.method7939();
		} else if (arg0 == 2) {
			this.aString105 = arg1.method7939();
		} else {
			@Pc(74) int local74;
			@Pc(80) int local80;
			if (arg0 == 3) {
				local74 = arg1.method7974();
				this.anIntArrayArray57 = new int[local74][3];
				for (local80 = 0; local80 < local74; local80++) {
					this.anIntArrayArray57[local80][0] = arg1.method7945();
					this.anIntArrayArray57[local80][1] = arg1.method7940();
					this.anIntArrayArray57[local80][2] = arg1.method7940();
				}
			} else if (arg0 == 4) {
				local74 = arg1.method7974();
				this.anIntArrayArray58 = new int[local74][3];
				for (local80 = 0; local80 < local74; local80++) {
					this.anIntArrayArray58[local80][0] = arg1.method7945();
					this.anIntArrayArray58[local80][1] = arg1.method7940();
					this.anIntArrayArray58[local80][2] = arg1.method7940();
				}
			} else if (arg0 == 5) {
				arg1.method7945();
			} else if (arg0 == 6) {
				arg1.method7974();
			} else if (arg0 == 7) {
				arg1.method7974();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method7974();
				} else if (arg0 == 10) {
					local74 = arg1.method7974();
					this.anIntArray611 = new int[local74];
					for (local80 = 0; local80 < local74; local80++) {
						this.anIntArray611[local80] = arg1.method7940();
					}
				} else if (arg0 == 12) {
					arg1.method7940();
				} else if (arg0 == 13) {
					local74 = arg1.method7974();
					this.anIntArray607 = new int[local74];
					for (local80 = 0; local80 < local74; local80++) {
						this.anIntArray607[local80] = arg1.method7945();
					}
				} else if (arg0 == 14) {
					local74 = arg1.method7974();
					this.anIntArrayArray59 = new int[local74][2];
					for (local80 = 0; local80 < local74; local80++) {
						this.anIntArrayArray59[local80][0] = arg1.method7974();
						this.anIntArrayArray59[local80][1] = arg1.method7974();
					}
				} else if (arg0 == 15) {
					arg1.method7945();
				} else if (arg0 == 17) {
					this.anInt9619 = arg1.method7945();
				} else if (arg0 == 18) {
					local74 = arg1.method7974();
					this.aStringArray41 = new String[local74];
					this.anIntArray613 = new int[local74];
					this.anIntArray612 = new int[local74];
					this.anIntArray609 = new int[local74];
					for (local80 = 0; local80 < local74; local80++) {
						this.anIntArray609[local80] = arg1.method7940();
						this.anIntArray612[local80] = arg1.method7940();
						this.anIntArray613[local80] = arg1.method7940();
						this.aStringArray41[local80] = arg1.method7951();
					}
				} else if (arg0 == 19) {
					local74 = arg1.method7974();
					this.anIntArray608 = new int[local74];
					this.anIntArray610 = new int[local74];
					this.aStringArray40 = new String[local74];
					this.anIntArray606 = new int[local74];
					for (local80 = 0; local80 < local74; local80++) {
						this.anIntArray606[local80] = arg1.method7940();
						this.anIntArray608[local80] = arg1.method7940();
						this.anIntArray610[local80] = arg1.method7940();
						this.aStringArray40[local80] = arg1.method7951();
					}
				} else if (arg0 == 249) {
					local74 = arg1.method7974();
					if (this.aClass91_40 == null) {
						local80 = Static122.method2187(local74);
						this.aClass91_40 = new Class91(local80);
					}
					for (local80 = 0; local80 < local74; local80++) {
						@Pc(317) boolean local317 = arg1.method7974() == 1;
						@Pc(321) int local321 = arg1.method7919();
						@Pc(330) Class1 local330;
						if (local317) {
							local330 = new Class1_Sub44(arg1.method7951());
						} else {
							local330 = new Class1_Sub27(arg1.method7940());
						}
						this.aClass91_40.method2269((long) local321, local330);
					}
				}
			}
		}
	}
}
