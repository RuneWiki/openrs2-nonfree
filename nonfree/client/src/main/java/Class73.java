import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class73 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Lclient!br;")
	private Class26 aClass26_16;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "Ljava/lang/String;")
	private String aString87;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Ljava/lang/String;")
	private String aString88;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "[I")
	private int[] anIntArray275;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray20;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray21;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public int anInt2209 = -1;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V")
	public void method2031() {
		if (this.aString88 == null) {
			this.aString88 = this.aString87;
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(BLclient!eb;)V")
	public void method2032(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3141();
			if (local5 == 0) {
				return;
			}
			this.method2033(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!eb;)V")
	private void method2033(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.aString87 = arg1.method3095();
		} else if (arg0 == 2) {
			this.aString88 = arg1.method3095();
		} else {
			@Pc(29) int local29;
			@Pc(36) int local36;
			if (arg0 == 3) {
				local29 = arg1.method3141();
				this.anIntArrayArray24 = new int[local29][3];
				for (local36 = 0; local36 < local29; local36++) {
					this.anIntArrayArray24[local36][0] = arg1.method3115();
					this.anIntArrayArray24[local36][1] = arg1.method3125();
					this.anIntArrayArray24[local36][2] = arg1.method3125();
				}
			} else if (arg0 == 4) {
				local29 = arg1.method3141();
				this.anIntArrayArray23 = new int[local29][3];
				for (local36 = 0; local36 < local29; local36++) {
					this.anIntArrayArray23[local36][0] = arg1.method3115();
					this.anIntArrayArray23[local36][1] = arg1.method3125();
					this.anIntArrayArray23[local36][2] = arg1.method3125();
				}
			} else if (arg0 == 5) {
				arg1.method3115();
			} else if (arg0 == 6) {
				arg1.method3141();
			} else if (arg0 == 7) {
				arg1.method3141();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method3141();
				} else if (arg0 == 10) {
					local29 = arg1.method3141();
					this.anIntArray277 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray277[local36] = arg1.method3125();
					}
				} else if (arg0 == 12) {
					arg1.method3125();
				} else if (arg0 == 13) {
					local29 = arg1.method3141();
					this.anIntArray276 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray276[local36] = arg1.method3115();
					}
				} else if (arg0 == 14) {
					local29 = arg1.method3141();
					this.anIntArrayArray22 = new int[local29][2];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArrayArray22[local36][0] = arg1.method3141();
						this.anIntArrayArray22[local36][1] = arg1.method3141();
					}
				} else if (arg0 == 15) {
					arg1.method3115();
				} else if (arg0 == 17) {
					this.anInt2209 = arg1.method3115();
				} else if (arg0 == 18) {
					local29 = arg1.method3141();
					this.anIntArray270 = new int[local29];
					this.anIntArray273 = new int[local29];
					this.anIntArray271 = new int[local29];
					this.aStringArray21 = new String[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray270[local36] = arg1.method3125();
						this.anIntArray273[local36] = arg1.method3125();
						this.anIntArray271[local36] = arg1.method3125();
						this.aStringArray21[local36] = arg1.method3134();
					}
				} else if (arg0 == 19) {
					local29 = arg1.method3141();
					this.aStringArray20 = new String[local29];
					this.anIntArray274 = new int[local29];
					this.anIntArray275 = new int[local29];
					this.anIntArray272 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray274[local36] = arg1.method3125();
						this.anIntArray275[local36] = arg1.method3125();
						this.anIntArray272[local36] = arg1.method3125();
						this.aStringArray20[local36] = arg1.method3134();
					}
				} else if (arg0 == 249) {
					local29 = arg1.method3141();
					if (this.aClass26_16 == null) {
						local36 = Static339.method5608(local29);
						this.aClass26_16 = new Class26(local36);
					}
					for (local36 = 0; local36 < local29; local36++) {
						@Pc(296) boolean local296 = arg1.method3141() == 1;
						@Pc(300) int local300 = arg1.method3137();
						@Pc(309) Class1 local309;
						if (local296) {
							local309 = new Class1_Sub26(arg1.method3134());
						} else {
							local309 = new Class1_Sub37(arg1.method3125());
						}
						this.aClass26_16.method877((long) local300, local309);
					}
				}
			}
		}
	}
}
