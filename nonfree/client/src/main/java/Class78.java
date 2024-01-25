import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class78 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!fp", name = "q", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12;

	@OriginalMember(owner = "client!fp", name = "u", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "Lclient!hl;")
	private Class96 aClass96_12;

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!fp", name = "A", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	public int anInt2431 = -1;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!wn;)V")
	public void method2207(@OriginalArg(1) Class4_Sub20 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4614();
			if (local11 == 0) {
				return;
			}
			this.method2212(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	public void method2211() {
		if (this.aString15 == null) {
			this.aString15 = this.aString16;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!wn;I)V")
	private void method2212(@OriginalArg(1) Class4_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString16 = arg0.method4612();
		} else if (arg1 == 2) {
			this.aString15 = arg0.method4612();
		} else {
			@Pc(26) int local26;
			@Pc(33) int local33;
			if (arg1 == 3) {
				local26 = arg0.method4614();
				this.anIntArrayArray20 = new int[local26][3];
				for (local33 = 0; local33 < local26; local33++) {
					this.anIntArrayArray20[local33][0] = arg0.method4560();
					this.anIntArrayArray20[local33][1] = arg0.method4595();
					this.anIntArrayArray20[local33][2] = arg0.method4595();
				}
			} else if (arg1 == 4) {
				local26 = arg0.method4614();
				this.anIntArrayArray18 = new int[local26][3];
				for (local33 = 0; local33 < local26; local33++) {
					this.anIntArrayArray18[local33][0] = arg0.method4560();
					this.anIntArrayArray18[local33][1] = arg0.method4595();
					this.anIntArrayArray18[local33][2] = arg0.method4595();
				}
			} else if (arg1 == 5) {
				arg0.method4560();
			} else if (arg1 == 6) {
				arg0.method4614();
			} else if (arg1 == 7) {
				arg0.method4614();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method4614();
				} else if (arg1 == 10) {
					local26 = arg0.method4614();
					this.anIntArray213 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray213[local33] = arg0.method4595();
					}
				} else if (arg1 == 12) {
					arg0.method4595();
				} else if (arg1 == 13) {
					local26 = arg0.method4614();
					this.anIntArray211 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray211[local33] = arg0.method4560();
					}
				} else if (arg1 == 14) {
					local26 = arg0.method4614();
					this.anIntArrayArray19 = new int[local26][2];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArrayArray19[local33][0] = arg0.method4614();
						this.anIntArrayArray19[local33][1] = arg0.method4614();
					}
				} else if (arg1 == 15) {
					arg0.method4560();
				} else if (arg1 == 17) {
					this.anInt2431 = arg0.method4560();
				} else if (arg1 == 18) {
					local26 = arg0.method4614();
					this.anIntArray209 = new int[local26];
					this.aStringArray12 = new String[local26];
					this.anIntArray207 = new int[local26];
					this.anIntArray208 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray209[local33] = arg0.method4595();
						this.anIntArray207[local33] = arg0.method4595();
						this.anIntArray208[local33] = arg0.method4595();
						this.aStringArray12[local33] = arg0.method4624();
					}
				} else if (arg1 == 19) {
					local26 = arg0.method4614();
					this.anIntArray212 = new int[local26];
					this.aStringArray11 = new String[local26];
					this.anIntArray214 = new int[local26];
					this.anIntArray210 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray210[local33] = arg0.method4595();
						this.anIntArray214[local33] = arg0.method4595();
						this.anIntArray212[local33] = arg0.method4595();
						this.aStringArray11[local33] = arg0.method4624();
					}
				} else if (arg1 == 249) {
					local26 = arg0.method4614();
					if (this.aClass96_12 == null) {
						local33 = Static84.method6309(local26);
						this.aClass96_12 = new Class96(local33);
					}
					for (local33 = 0; local33 < local26; local33++) {
						@Pc(320) boolean local320 = arg0.method4614() == 1;
						@Pc(324) int local324 = arg0.method4582();
						@Pc(333) Class4 local333;
						if (local320) {
							local333 = new Class4_Sub12(arg0.method4624());
						} else {
							local333 = new Class4_Sub16(arg0.method4595());
						}
						this.aClass96_12.method2805((long) local324, local333);
					}
				}
			}
		}
	}
}
