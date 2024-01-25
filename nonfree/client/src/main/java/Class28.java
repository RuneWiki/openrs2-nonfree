import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class28 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!tca;")
	private Class333 aClass333_6;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public int anInt853 = -1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public void method754() {
		if (this.aString15 == null) {
			this.aString15 = this.aString16;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!dt;I)V")
	private void method755(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString16 = arg0.method7928();
		} else if (arg1 == 2) {
			this.aString15 = arg0.method7928();
		} else {
			@Pc(18) int local18;
			@Pc(25) int local25;
			if (arg1 == 3) {
				local18 = arg0.method7954();
				this.anIntArrayArray3 = new int[local18][3];
				for (local25 = 0; local25 < local18; local25++) {
					this.anIntArrayArray3[local25][0] = arg0.method7951();
					this.anIntArrayArray3[local25][1] = arg0.method7895();
					this.anIntArrayArray3[local25][2] = arg0.method7895();
				}
			} else if (arg1 == 4) {
				local18 = arg0.method7954();
				this.anIntArrayArray1 = new int[local18][3];
				for (local25 = 0; local25 < local18; local25++) {
					this.anIntArrayArray1[local25][0] = arg0.method7951();
					this.anIntArrayArray1[local25][1] = arg0.method7895();
					this.anIntArrayArray1[local25][2] = arg0.method7895();
				}
			} else if (arg1 == 5) {
				arg0.method7951();
			} else if (arg1 == 6) {
				arg0.method7954();
			} else if (arg1 == 7) {
				arg0.method7954();
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method7954();
				} else if (arg1 == 10) {
					local18 = arg0.method7954();
					this.anIntArray44 = new int[local18];
					for (local25 = 0; local25 < local18; local25++) {
						this.anIntArray44[local25] = arg0.method7895();
					}
				} else if (arg1 == 12) {
					arg0.method7895();
				} else if (arg1 == 13) {
					local18 = arg0.method7954();
					this.anIntArray50 = new int[local18];
					for (local25 = 0; local25 < local18; local25++) {
						this.anIntArray50[local25] = arg0.method7951();
					}
				} else if (arg1 == 14) {
					local18 = arg0.method7954();
					this.anIntArrayArray2 = new int[local18][2];
					for (local25 = 0; local25 < local18; local25++) {
						this.anIntArrayArray2[local25][0] = arg0.method7954();
						this.anIntArrayArray2[local25][1] = arg0.method7954();
					}
				} else if (arg1 == 15) {
					arg0.method7951();
				} else if (arg1 == 17) {
					this.anInt853 = arg0.method7951();
				} else if (arg1 == 18) {
					local18 = arg0.method7954();
					this.anIntArray43 = new int[local18];
					this.aStringArray11 = new String[local18];
					this.anIntArray48 = new int[local18];
					this.anIntArray49 = new int[local18];
					for (local25 = 0; local25 < local18; local25++) {
						this.anIntArray48[local25] = arg0.method7895();
						this.anIntArray49[local25] = arg0.method7895();
						this.anIntArray43[local25] = arg0.method7895();
						this.aStringArray11[local25] = arg0.method7922();
					}
				} else if (arg1 == 19) {
					local18 = arg0.method7954();
					this.aStringArray10 = new String[local18];
					this.anIntArray45 = new int[local18];
					this.anIntArray51 = new int[local18];
					this.anIntArray47 = new int[local18];
					for (local25 = 0; local25 < local18; local25++) {
						this.anIntArray45[local25] = arg0.method7895();
						this.anIntArray51[local25] = arg0.method7895();
						this.anIntArray47[local25] = arg0.method7895();
						this.aStringArray10[local25] = arg0.method7922();
					}
				} else if (arg1 == 249) {
					local18 = arg0.method7954();
					if (this.aClass333_6 == null) {
						local25 = Static585.method7772(local18);
						this.aClass333_6 = new Class333(local25);
					}
					for (local25 = 0; local25 < local18; local25++) {
						@Pc(401) boolean local401 = arg0.method7954() == 1;
						@Pc(405) int local405 = arg0.method7945();
						@Pc(414) Class3 local414;
						if (local401) {
							local414 = new Class3_Sub19(arg0.method7922());
						} else {
							local414 = new Class3_Sub24(arg0.method7895());
						}
						this.aClass333_6.method7488((long) local405, local414);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!dt;)V")
	public void method756(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7954();
			if (local13 == 0) {
				return;
			}
			this.method755(arg0, local13);
		}
	}
}
