import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class182 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Ljava/lang/String;")
	private String aString56;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Ljava/lang/String;")
	private String aString57;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray45;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray46;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Lclient!ec;")
	private Class58 aClass58_33;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public int anInt5593 = -1;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!kh;)V")
	public void method4713(@OriginalArg(1) Class11_Sub25 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5185();
			if (local13 == 0) {
				return;
			}
			this.method4716(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public void method4714() {
		if (this.aString56 == null) {
			this.aString56 = this.aString57;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!kh;I)V")
	private void method4716(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub25 arg1) {
		if (arg0 == 1) {
			this.aString57 = arg1.method5225();
		} else if (arg0 == 2) {
			this.aString56 = arg1.method5225();
		} else {
			@Pc(31) int local31;
			@Pc(38) int local38;
			if (arg0 == 3) {
				local31 = arg1.method5185();
				this.anIntArrayArray62 = new int[local31][3];
				for (local38 = 0; local38 < local31; local38++) {
					this.anIntArrayArray62[local38][0] = arg1.method5187();
					this.anIntArrayArray62[local38][1] = arg1.method5198();
					this.anIntArrayArray62[local38][2] = arg1.method5198();
				}
			} else if (arg0 == 4) {
				local31 = arg1.method5185();
				this.anIntArrayArray61 = new int[local31][3];
				for (local38 = 0; local38 < local31; local38++) {
					this.anIntArrayArray61[local38][0] = arg1.method5187();
					this.anIntArrayArray61[local38][1] = arg1.method5198();
					this.anIntArrayArray61[local38][2] = arg1.method5198();
				}
			} else if (arg0 == 5) {
				arg1.method5187();
			} else if (arg0 == 6) {
				arg1.method5185();
			} else if (arg0 == 7) {
				arg1.method5185();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method5185();
				} else if (arg0 == 10) {
					local31 = arg1.method5185();
					this.anIntArray431 = new int[local31];
					for (local38 = 0; local38 < local31; local38++) {
						this.anIntArray431[local38] = arg1.method5198();
					}
				} else if (arg0 == 12) {
					arg1.method5198();
				} else if (arg0 == 13) {
					local31 = arg1.method5185();
					this.anIntArray436 = new int[local31];
					for (local38 = 0; local38 < local31; local38++) {
						this.anIntArray436[local38] = arg1.method5187();
					}
				} else if (arg0 == 14) {
					local31 = arg1.method5185();
					this.anIntArrayArray63 = new int[local31][2];
					for (local38 = 0; local38 < local31; local38++) {
						this.anIntArrayArray63[local38][0] = arg1.method5185();
						this.anIntArrayArray63[local38][1] = arg1.method5185();
					}
				} else if (arg0 == 15) {
					arg1.method5187();
				} else if (arg0 == 17) {
					this.anInt5593 = arg1.method5187();
				} else if (arg0 == 18) {
					local31 = arg1.method5185();
					this.anIntArray435 = new int[local31];
					this.anIntArray432 = new int[local31];
					this.aStringArray45 = new String[local31];
					this.anIntArray430 = new int[local31];
					for (local38 = 0; local38 < local31; local38++) {
						this.anIntArray430[local38] = arg1.method5198();
						this.anIntArray435[local38] = arg1.method5198();
						this.anIntArray432[local38] = arg1.method5198();
						this.aStringArray45[local38] = arg1.method5184();
					}
				} else if (arg0 == 19) {
					local31 = arg1.method5185();
					this.anIntArray434 = new int[local31];
					this.anIntArray429 = new int[local31];
					this.aStringArray46 = new String[local31];
					this.anIntArray433 = new int[local31];
					for (local38 = 0; local38 < local31; local38++) {
						this.anIntArray433[local38] = arg1.method5198();
						this.anIntArray434[local38] = arg1.method5198();
						this.anIntArray429[local38] = arg1.method5198();
						this.aStringArray46[local38] = arg1.method5184();
					}
				} else if (arg0 == 249) {
					local31 = arg1.method5185();
					if (this.aClass58_33 == null) {
						local38 = Static90.method4097(local31);
						this.aClass58_33 = new Class58(local38);
					}
					for (local38 = 0; local38 < local31; local38++) {
						@Pc(345) boolean local345 = arg1.method5185() == 1;
						@Pc(349) int local349 = arg1.method5221();
						@Pc(358) Class11 local358;
						if (local345) {
							local358 = new Class11_Sub30(arg1.method5184());
						} else {
							local358 = new Class11_Sub33(arg1.method5198());
						}
						this.aClass58_33.method1006((long) local349, local358);
					}
				}
			}
		}
	}
}
