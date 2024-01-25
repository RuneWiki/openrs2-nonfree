import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class21 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray3;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "Lclient!cm;")
	private Class41 aClass41_3;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public int anInt394 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!ef;I)V")
	private void method326(@OriginalArg(1) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString3 = arg0.method3111();
		} else if (arg1 == 2) {
			this.aString2 = arg0.method3111();
		} else {
			@Pc(38) int local38;
			@Pc(45) int local45;
			if (arg1 == 3) {
				local38 = arg0.method3124();
				this.anIntArrayArray8 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray8[local45][0] = arg0.method3104();
					this.anIntArrayArray8[local45][1] = arg0.method3135();
					this.anIntArrayArray8[local45][2] = arg0.method3135();
				}
			} else if (arg1 == 4) {
				local38 = arg0.method3124();
				this.anIntArrayArray9 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray9[local45][0] = arg0.method3104();
					this.anIntArrayArray9[local45][1] = arg0.method3135();
					this.anIntArrayArray9[local45][2] = arg0.method3135();
				}
			} else if (arg1 == 5) {
				arg0.method3104();
			} else if (arg1 == 6) {
				arg0.method3124();
			} else if (arg1 == 7) {
				arg0.method3124();
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method3124();
					return;
				}
				if (arg1 == 10) {
					local38 = arg0.method3124();
					this.anIntArray46 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray46[local45] = arg0.method3135();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method3135();
					return;
				}
				if (arg1 != 13) {
					if (arg1 == 14) {
						local38 = arg0.method3124();
						this.anIntArrayArray7 = new int[local38][2];
						for (local45 = 0; local45 < local38; local45++) {
							this.anIntArrayArray7[local45][0] = arg0.method3124();
							this.anIntArrayArray7[local45][1] = arg0.method3124();
						}
						return;
					}
					if (arg1 == 15) {
						arg0.method3104();
						return;
					}
					if (arg1 == 17) {
						this.anInt394 = arg0.method3104();
					} else if (arg1 == 18) {
						local38 = arg0.method3124();
						this.anIntArray42 = new int[local38];
						this.aStringArray3 = new String[local38];
						this.anIntArray44 = new int[local38];
						this.anIntArray48 = new int[local38];
						for (local45 = 0; local45 < local38; local45++) {
							this.anIntArray42[local45] = arg0.method3135();
							this.anIntArray48[local45] = arg0.method3135();
							this.anIntArray44[local45] = arg0.method3135();
							this.aStringArray3[local45] = arg0.method3113();
						}
						return;
					} else if (arg1 == 19) {
						local38 = arg0.method3124();
						this.anIntArray47 = new int[local38];
						this.anIntArray49 = new int[local38];
						this.anIntArray43 = new int[local38];
						this.aStringArray4 = new String[local38];
						for (local45 = 0; local45 < local38; local45++) {
							this.anIntArray47[local45] = arg0.method3135();
							this.anIntArray49[local45] = arg0.method3135();
							this.anIntArray43[local45] = arg0.method3135();
							this.aStringArray4[local45] = arg0.method3113();
						}
						return;
					} else if (arg1 == 249) {
						local38 = arg0.method3124();
						if (this.aClass41_3 == null) {
							local45 = Static51.method1026(local38);
							this.aClass41_3 = new Class41(local45);
						}
						for (local45 = 0; local45 < local38; local45++) {
							@Pc(369) boolean local369 = arg0.method3124() == 1;
							@Pc(373) int local373 = arg0.method3163();
							@Pc(382) Class2 local382;
							if (local369) {
								local382 = new Class2_Sub14(arg0.method3113());
							} else {
								local382 = new Class2_Sub23(arg0.method3135());
							}
							this.aClass41_3.method901(local382, (long) local373);
						}
						return;
					}
					return;
				}
				local38 = arg0.method3124();
				this.anIntArray45 = new int[local38];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArray45[local45] = arg0.method3104();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public void method327() {
		if (this.aString2 == null) {
			this.aString2 = this.aString3;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ef;B)V")
	public void method328(@OriginalArg(0) Class2_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3124();
			if (local9 == 0) {
				return;
			}
			this.method326(arg0, local9);
		}
	}
}
