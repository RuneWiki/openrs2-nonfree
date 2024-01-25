import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class262 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray49;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "[I")
	private int[] anIntArray532;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
	private int[] anIntArray533;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "[I")
	private int[] anIntArray534;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!fe;")
	private Class74 aClass74_35;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Ljava/lang/String;")
	private String aString71;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "[I")
	private int[] anIntArray535;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
	private int[] anIntArray536;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
	private int[] anIntArray537;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray50;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Ljava/lang/String;")
	private String aString72;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "[I")
	private int[] anIntArray539;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
	public int anInt7763 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public void method6345() {
		if (this.aString72 == null) {
			this.aString72 = this.aString71;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!ae;I)V")
	private void method6346(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.aString71 = arg1.method6462();
		} else if (arg0 == 2) {
			this.aString72 = arg1.method6462();
		} else {
			@Pc(64) int local64;
			@Pc(70) int local70;
			if (arg0 == 3) {
				local64 = arg1.method6433();
				this.anIntArrayArray56 = new int[local64][3];
				for (local70 = 0; local70 < local64; local70++) {
					this.anIntArrayArray56[local70][0] = arg1.method6485();
					this.anIntArrayArray56[local70][1] = arg1.method6442();
					this.anIntArrayArray56[local70][2] = arg1.method6442();
				}
			} else if (arg0 == 4) {
				local64 = arg1.method6433();
				this.anIntArrayArray57 = new int[local64][3];
				for (local70 = 0; local70 < local64; local70++) {
					this.anIntArrayArray57[local70][0] = arg1.method6485();
					this.anIntArrayArray57[local70][1] = arg1.method6442();
					this.anIntArrayArray57[local70][2] = arg1.method6442();
				}
			} else if (arg0 == 5) {
				arg1.method6485();
			} else if (arg0 == 6) {
				arg1.method6433();
			} else if (arg0 == 7) {
				arg1.method6433();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method6433();
				} else if (arg0 == 10) {
					local64 = arg1.method6433();
					this.anIntArray535 = new int[local64];
					for (local70 = 0; local70 < local64; local70++) {
						this.anIntArray535[local70] = arg1.method6442();
					}
				} else if (arg0 == 12) {
					arg1.method6442();
				} else if (arg0 == 13) {
					local64 = arg1.method6433();
					this.anIntArray536 = new int[local64];
					for (local70 = 0; local70 < local64; local70++) {
						this.anIntArray536[local70] = arg1.method6485();
					}
				} else if (arg0 == 14) {
					local64 = arg1.method6433();
					this.anIntArrayArray59 = new int[local64][2];
					for (local70 = 0; local70 < local64; local70++) {
						this.anIntArrayArray59[local70][0] = arg1.method6433();
						this.anIntArrayArray59[local70][1] = arg1.method6433();
					}
				} else if (arg0 == 15) {
					arg1.method6485();
				} else if (arg0 == 17) {
					this.anInt7763 = arg1.method6485();
				} else if (arg0 == 18) {
					local64 = arg1.method6433();
					this.anIntArray539 = new int[local64];
					this.anIntArray532 = new int[local64];
					this.anIntArray533 = new int[local64];
					this.aStringArray49 = new String[local64];
					for (local70 = 0; local70 < local64; local70++) {
						this.anIntArray539[local70] = arg1.method6442();
						this.anIntArray532[local70] = arg1.method6442();
						this.anIntArray533[local70] = arg1.method6442();
						this.aStringArray49[local70] = arg1.method6473();
					}
				} else if (arg0 == 19) {
					local64 = arg1.method6433();
					this.aStringArray50 = new String[local64];
					this.anIntArray538 = new int[local64];
					this.anIntArray537 = new int[local64];
					this.anIntArray534 = new int[local64];
					for (local70 = 0; local70 < local64; local70++) {
						this.anIntArray537[local70] = arg1.method6442();
						this.anIntArray538[local70] = arg1.method6442();
						this.anIntArray534[local70] = arg1.method6442();
						this.aStringArray50[local70] = arg1.method6473();
					}
				} else if (arg0 == 249) {
					local64 = arg1.method6433();
					if (this.aClass74_35 == null) {
						local70 = Static52.method1203(local64);
						this.aClass74_35 = new Class74(local70);
					}
					for (local70 = 0; local70 < local64; local70++) {
						@Pc(352) boolean local352 = arg1.method6433() == 1;
						@Pc(356) int local356 = arg1.method6435();
						@Pc(365) Class6 local365;
						if (local352) {
							local365 = new Class6_Sub13(arg1.method6473());
						} else {
							local365 = new Class6_Sub39(arg1.method6442());
						}
						this.aClass74_35.method1890((long) local356, local365);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLclient!ae;)V")
	public void method6349(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method6346(local5, arg0);
		}
	}
}
