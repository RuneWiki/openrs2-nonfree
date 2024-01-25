import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class119 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "[I")
	public static final int[] anIntArray271 = new int[4096];

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Ljava/lang/String;")
	private String aString32;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Ljava/lang/String;")
	private String aString33;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray19;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "Lclient!dq;")
	private Class38 aClass38_18;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	public int anInt3689 = -1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray271[local4] = Static1.method45(local4);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public void method3439() {
		if (this.aString33 == null) {
			this.aString33 = this.aString32;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!at;I)V")
	public void method3444(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2132();
			if (local5 == 0) {
				return;
			}
			this.method3446(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!at;)V")
	private void method3446(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.aString32 = arg1.method2131();
		} else if (arg0 == 2) {
			this.aString33 = arg1.method2131();
		} else {
			@Pc(73) int local73;
			@Pc(79) int local79;
			if (arg0 == 3) {
				local73 = arg1.method2132();
				this.anIntArrayArray29 = new int[local73][3];
				for (local79 = 0; local79 < local73; local79++) {
					this.anIntArrayArray29[local79][0] = arg1.method2161();
					this.anIntArrayArray29[local79][1] = arg1.method2140();
					this.anIntArrayArray29[local79][2] = arg1.method2140();
				}
			} else if (arg0 == 4) {
				local73 = arg1.method2132();
				this.anIntArrayArray28 = new int[local73][3];
				for (local79 = 0; local79 < local73; local79++) {
					this.anIntArrayArray28[local79][0] = arg1.method2161();
					this.anIntArrayArray28[local79][1] = arg1.method2140();
					this.anIntArrayArray28[local79][2] = arg1.method2140();
				}
			} else if (arg0 == 5) {
				arg1.method2161();
			} else if (arg0 == 6) {
				arg1.method2132();
			} else if (arg0 == 7) {
				arg1.method2132();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method2132();
				} else if (arg0 == 10) {
					local73 = arg1.method2132();
					this.anIntArray278 = new int[local73];
					for (local79 = 0; local79 < local73; local79++) {
						this.anIntArray278[local79] = arg1.method2140();
					}
				} else if (arg0 == 12) {
					arg1.method2140();
				} else if (arg0 == 13) {
					local73 = arg1.method2132();
					this.anIntArray279 = new int[local73];
					for (local79 = 0; local79 < local73; local79++) {
						this.anIntArray279[local79] = arg1.method2161();
					}
				} else if (arg0 == 14) {
					local73 = arg1.method2132();
					this.anIntArrayArray30 = new int[local73][2];
					for (local79 = 0; local79 < local73; local79++) {
						this.anIntArrayArray30[local79][0] = arg1.method2132();
						this.anIntArrayArray30[local79][1] = arg1.method2132();
					}
				} else if (arg0 == 15) {
					arg1.method2161();
				} else if (arg0 == 17) {
					this.anInt3689 = arg1.method2161();
				} else if (arg0 == 18) {
					local73 = arg1.method2132();
					this.anIntArray273 = new int[local73];
					this.anIntArray272 = new int[local73];
					this.anIntArray277 = new int[local73];
					this.aStringArray20 = new String[local73];
					for (local79 = 0; local79 < local73; local79++) {
						this.anIntArray277[local79] = arg1.method2140();
						this.anIntArray273[local79] = arg1.method2140();
						this.anIntArray272[local79] = arg1.method2140();
						this.aStringArray20[local79] = arg1.method2109();
					}
				} else if (arg0 == 19) {
					local73 = arg1.method2132();
					this.aStringArray19 = new String[local73];
					this.anIntArray276 = new int[local73];
					this.anIntArray275 = new int[local73];
					this.anIntArray274 = new int[local73];
					for (local79 = 0; local79 < local73; local79++) {
						this.anIntArray275[local79] = arg1.method2140();
						this.anIntArray276[local79] = arg1.method2140();
						this.anIntArray274[local79] = arg1.method2140();
						this.aStringArray19[local79] = arg1.method2109();
					}
				} else if (arg0 == 249) {
					local73 = arg1.method2132();
					if (this.aClass38_18 == null) {
						local79 = Static73.method1617(local73);
						this.aClass38_18 = new Class38(local79);
					}
					for (local79 = 0; local79 < local73; local79++) {
						@Pc(354) boolean local354 = arg1.method2132() == 1;
						@Pc(358) int local358 = arg1.method2119();
						@Pc(367) Class1 local367;
						if (local354) {
							local367 = new Class1_Sub38(arg1.method2109());
						} else {
							local367 = new Class1_Sub9(arg1.method2140());
						}
						this.aClass38_18.method1472(local367, (long) local358);
					}
				}
			}
		}
	}
}
