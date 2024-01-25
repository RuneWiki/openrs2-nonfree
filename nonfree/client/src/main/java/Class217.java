import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class217 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "[I")
	private int[] anIntArray427;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray23;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "Lclient!du;")
	private Class81 aClass81_45;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "Ljava/lang/String;")
	private String aString92;

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "Ljava/lang/String;")
	private String aString93;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray24;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	public int anInt5795 = -1;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
	public void method5161() {
		if (this.aString92 == null) {
			this.aString92 = this.aString93;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLclient!ee;I)V")
	private void method5162(@OriginalArg(1) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString93 = arg0.method8648();
		} else if (arg1 == 2) {
			this.aString92 = arg0.method8648();
		} else {
			@Pc(35) int local35;
			@Pc(42) int local42;
			if (arg1 == 3) {
				local35 = arg0.method8645();
				this.anIntArrayArray28 = new int[local35][3];
				for (local42 = 0; local42 < local35; local42++) {
					this.anIntArrayArray28[local42][0] = arg0.method8631();
					this.anIntArrayArray28[local42][1] = arg0.method8623();
					this.anIntArrayArray28[local42][2] = arg0.method8623();
				}
			} else if (arg1 == 4) {
				local35 = arg0.method8645();
				this.anIntArrayArray29 = new int[local35][3];
				for (local42 = 0; local42 < local35; local42++) {
					this.anIntArrayArray29[local42][0] = arg0.method8631();
					this.anIntArrayArray29[local42][1] = arg0.method8623();
					this.anIntArrayArray29[local42][2] = arg0.method8623();
				}
			} else if (arg1 == 5) {
				arg0.method8631();
			} else if (arg1 == 6) {
				arg0.method8645();
			} else if (arg1 == 7) {
				arg0.method8645();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method8645();
					return;
				}
				if (arg1 == 10) {
					local35 = arg0.method8645();
					this.anIntArray431 = new int[local35];
					for (local42 = 0; local42 < local35; local42++) {
						this.anIntArray431[local42] = arg0.method8623();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method8623();
					return;
				}
				if (arg1 == 13) {
					local35 = arg0.method8645();
					this.anIntArray432 = new int[local35];
					for (local42 = 0; local42 < local35; local42++) {
						this.anIntArray432[local42] = arg0.method8631();
					}
					return;
				}
				if (arg1 == 14) {
					local35 = arg0.method8645();
					this.anIntArrayArray27 = new int[local35][2];
					for (local42 = 0; local42 < local35; local42++) {
						this.anIntArrayArray27[local42][0] = arg0.method8645();
						this.anIntArrayArray27[local42][1] = arg0.method8645();
					}
					return;
				}
				if (arg1 == 15) {
					arg0.method8631();
					return;
				}
				if (arg1 == 17) {
					this.anInt5795 = arg0.method8631();
				} else if (arg1 == 18) {
					local35 = arg0.method8645();
					this.anIntArray433 = new int[local35];
					this.aStringArray24 = new String[local35];
					this.anIntArray434 = new int[local35];
					this.anIntArray428 = new int[local35];
					for (local42 = 0; local42 < local35; local42++) {
						this.anIntArray428[local42] = arg0.method8623();
						this.anIntArray433[local42] = arg0.method8623();
						this.anIntArray434[local42] = arg0.method8623();
						this.aStringArray24[local42] = arg0.method8617();
					}
					return;
				} else if (arg1 == 19) {
					local35 = arg0.method8645();
					this.anIntArray427 = new int[local35];
					this.anIntArray429 = new int[local35];
					this.aStringArray23 = new String[local35];
					this.anIntArray430 = new int[local35];
					for (local42 = 0; local42 < local35; local42++) {
						this.anIntArray429[local42] = arg0.method8623();
						this.anIntArray430[local42] = arg0.method8623();
						this.anIntArray427[local42] = arg0.method8623();
						this.aStringArray23[local42] = arg0.method8617();
					}
					return;
				} else if (arg1 == 249) {
					local35 = arg0.method8645();
					if (this.aClass81_45 == null) {
						local42 = Static522.method6795(local35);
						this.aClass81_45 = new Class81(local42);
					}
					for (local42 = 0; local42 < local35; local42++) {
						@Pc(396) boolean local396 = arg0.method8645() == 1;
						@Pc(400) int local400 = arg0.method8657();
						@Pc(409) Class5 local409;
						if (local396) {
							local409 = new Class5_Sub36(arg0.method8617());
						} else {
							local409 = new Class5_Sub41(arg0.method8623());
						}
						this.aClass81_45.method1607(local409, (long) local400);
					}
					return;
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLclient!ee;)V")
	public void method5164(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8645();
			if (local9 == 0) {
				return;
			}
			this.method5162(arg0, local9);
		}
	}
}
