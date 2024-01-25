import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class50 {

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "[I")
	private int[] anIntArray148;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!cu", name = "A", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10;

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!cu", name = "C", descriptor = "Lclient!bu;")
	private Class38 aClass38_6;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
	public int anInt1734 = -1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method1240(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1171();
			if (local14 == 0) {
				return;
			}
			this.method1243(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BILclient!ia;)V")
	private void method1243(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.aString15 = arg1.method1178();
		} else if (arg0 == 2) {
			this.aString14 = arg1.method1178();
		} else {
			@Pc(26) int local26;
			@Pc(33) int local33;
			if (arg0 == 3) {
				local26 = arg1.method1171();
				this.anIntArrayArray17 = new int[local26][3];
				for (local33 = 0; local33 < local26; local33++) {
					this.anIntArrayArray17[local33][0] = arg1.method1177();
					this.anIntArrayArray17[local33][1] = arg1.method1188();
					this.anIntArrayArray17[local33][2] = arg1.method1188();
				}
			} else if (arg0 == 4) {
				local26 = arg1.method1171();
				this.anIntArrayArray16 = new int[local26][3];
				for (local33 = 0; local33 < local26; local33++) {
					this.anIntArrayArray16[local33][0] = arg1.method1177();
					this.anIntArrayArray16[local33][1] = arg1.method1188();
					this.anIntArrayArray16[local33][2] = arg1.method1188();
				}
			} else if (arg0 == 5) {
				arg1.method1177();
			} else if (arg0 == 6) {
				arg1.method1171();
			} else if (arg0 == 7) {
				arg1.method1171();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method1171();
					return;
				}
				if (arg0 != 10) {
					if (arg0 == 12) {
						arg1.method1188();
						return;
					}
					if (arg0 == 13) {
						local26 = arg1.method1171();
						this.anIntArray153 = new int[local26];
						for (local33 = 0; local33 < local26; local33++) {
							this.anIntArray153[local33] = arg1.method1177();
						}
						return;
					}
					if (arg0 != 14) {
						if (arg0 == 15) {
							arg1.method1177();
							return;
						}
						if (arg0 == 17) {
							this.anInt1734 = arg1.method1177();
							return;
						}
						if (arg0 == 18) {
							local26 = arg1.method1171();
							this.anIntArray149 = new int[local26];
							this.anIntArray150 = new int[local26];
							this.anIntArray148 = new int[local26];
							this.aStringArray9 = new String[local26];
							for (local33 = 0; local33 < local26; local33++) {
								this.anIntArray148[local33] = arg1.method1188();
								this.anIntArray149[local33] = arg1.method1188();
								this.anIntArray150[local33] = arg1.method1188();
								this.aStringArray9[local33] = arg1.method1201();
							}
							return;
						}
						if (arg0 == 19) {
							local26 = arg1.method1171();
							this.anIntArray152 = new int[local26];
							this.aStringArray10 = new String[local26];
							this.anIntArray154 = new int[local26];
							this.anIntArray155 = new int[local26];
							for (local33 = 0; local33 < local26; local33++) {
								this.anIntArray152[local33] = arg1.method1188();
								this.anIntArray155[local33] = arg1.method1188();
								this.anIntArray154[local33] = arg1.method1188();
								this.aStringArray10[local33] = arg1.method1201();
							}
						} else if (arg0 == 249) {
							local26 = arg1.method1171();
							if (this.aClass38_6 == null) {
								local33 = Static427.method5762(local26);
								this.aClass38_6 = new Class38(local33);
							}
							for (local33 = 0; local33 < local26; local33++) {
								@Pc(313) boolean local313 = arg1.method1171() == 1;
								@Pc(317) int local317 = arg1.method1226();
								@Pc(326) Class1 local326;
								if (local313) {
									local326 = new Class1_Sub44(arg1.method1201());
								} else {
									local326 = new Class1_Sub33(arg1.method1188());
								}
								this.aClass38_6.method766(local326, (long) local317);
							}
							return;
						}
						return;
					}
					local26 = arg1.method1171();
					this.anIntArrayArray15 = new int[local26][2];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArrayArray15[local33][0] = arg1.method1171();
						this.anIntArrayArray15[local33][1] = arg1.method1171();
					}
					return;
				}
				local26 = arg1.method1171();
				this.anIntArray151 = new int[local26];
				for (local33 = 0; local33 < local26; local33++) {
					this.anIntArray151[local33] = arg1.method1188();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
	public void method1245() {
		if (this.aString14 == null) {
			this.aString14 = this.aString15;
		}
	}
}
