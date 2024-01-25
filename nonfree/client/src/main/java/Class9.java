import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class9 {

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "Lclient!fw;")
	private Class125 aClass125_1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public int anInt72 = -1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method96(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString1 = arg0.method7739();
		} else if (arg1 == 2) {
			this.aString2 = arg0.method7739();
		} else {
			@Pc(37) int local37;
			@Pc(44) int local44;
			if (arg1 == 3) {
				local37 = arg0.method7695(119);
				this.anIntArrayArray2 = new int[local37][3];
				for (local44 = 0; local44 < local37; local44++) {
					this.anIntArrayArray2[local44][0] = arg0.method7717(-1978450544);
					this.anIntArrayArray2[local44][1] = arg0.method7748();
					this.anIntArrayArray2[local44][2] = arg0.method7748();
				}
			} else if (arg1 == 4) {
				local37 = arg0.method7695(118);
				this.anIntArrayArray4 = new int[local37][3];
				for (local44 = 0; local44 < local37; local44++) {
					this.anIntArrayArray4[local44][0] = arg0.method7717(-1978450544);
					this.anIntArrayArray4[local44][1] = arg0.method7748();
					this.anIntArrayArray4[local44][2] = arg0.method7748();
				}
			} else if (arg1 == 5) {
				arg0.method7717(-1978450544);
			} else if (arg1 == 6) {
				arg0.method7695(117);
				return;
			} else if (arg1 == 7) {
				arg0.method7695(117);
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method7695(108);
					return;
				}
				if (arg1 != 10) {
					if (arg1 == 12) {
						arg0.method7748();
						return;
					}
					if (arg1 != 13) {
						if (arg1 != 14) {
							if (arg1 == 15) {
								arg0.method7717(-1978450544);
								return;
							}
							if (arg1 == 17) {
								this.anInt72 = arg0.method7717(-1978450544);
								return;
							}
							if (arg1 != 18) {
								if (arg1 == 19) {
									local37 = arg0.method7695(106);
									this.aStringArray2 = new String[local37];
									this.anIntArray6 = new int[local37];
									this.anIntArray5 = new int[local37];
									this.anIntArray10 = new int[local37];
									for (local44 = 0; local44 < local37; local44++) {
										this.anIntArray5[local44] = arg0.method7748();
										this.anIntArray10[local44] = arg0.method7748();
										this.anIntArray6[local44] = arg0.method7748();
										this.aStringArray2[local44] = arg0.method7703(0);
									}
								} else if (arg1 == 249) {
									local37 = arg0.method7695(109);
									if (this.aClass125_1 == null) {
										local44 = Static255.method4294(local37);
										this.aClass125_1 = new Class125(local44);
									}
									for (local44 = 0; local44 < local37; local44++) {
										@Pc(255) boolean local255 = arg0.method7695(126) == 1;
										@Pc(259) int local259 = arg0.method7719();
										@Pc(268) Class14 local268;
										if (local255) {
											local268 = new Class14_Sub45(arg0.method7703(0));
										} else {
											local268 = new Class14_Sub30(arg0.method7748());
										}
										this.aClass125_1.method2626(local268, (long) local259);
									}
									return;
								}
								return;
							}
							local37 = arg0.method7695(124);
							this.anIntArray12 = new int[local37];
							this.anIntArray11 = new int[local37];
							this.aStringArray1 = new String[local37];
							this.anIntArray8 = new int[local37];
							for (local44 = 0; local44 < local37; local44++) {
								this.anIntArray8[local44] = arg0.method7748();
								this.anIntArray11[local44] = arg0.method7748();
								this.anIntArray12[local44] = arg0.method7748();
								this.aStringArray1[local44] = arg0.method7703(0);
							}
							return;
						}
						local37 = arg0.method7695(112);
						this.anIntArrayArray3 = new int[local37][2];
						for (local44 = 0; local44 < local37; local44++) {
							this.anIntArrayArray3[local44][0] = arg0.method7695(95);
							this.anIntArrayArray3[local44][1] = arg0.method7695(94);
						}
						return;
					}
					local37 = arg0.method7695(100);
					this.anIntArray7 = new int[local37];
					for (local44 = 0; local44 < local37; local44++) {
						this.anIntArray7[local44] = arg0.method7717(-1978450544);
					}
					return;
				}
				local37 = arg0.method7695(123);
				this.anIntArray9 = new int[local37];
				for (local44 = 0; local44 < local37; local44++) {
					this.anIntArray9[local44] = arg0.method7748();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method98(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method7695(108);
			if (local10 == 0) {
				return;
			}
			this.method96(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public void method99() {
		if (this.aString2 == null) {
			this.aString2 = this.aString1;
		}
	}
}
