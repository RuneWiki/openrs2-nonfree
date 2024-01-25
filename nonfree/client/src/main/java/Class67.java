import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class67 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray10;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "Ljava/lang/String;")
	private String aString38;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!dk", name = "w", descriptor = "Ljava/lang/String;")
	private String aString39;

	@OriginalMember(owner = "client!dk", name = "x", descriptor = "Lclient!pt;")
	private Class230 aClass230_16;

	@OriginalMember(owner = "client!dk", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	public int anInt1926 = -1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!os;Z)V")
	public void method1834(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4487();
			if (local13 == 0) {
				return;
			}
			this.method1837(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILclient!os;)V")
	private void method1837(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.aString39 = arg1.method4456();
		} else if (arg0 == 2) {
			this.aString38 = arg1.method4456();
		} else {
			@Pc(38) int local38;
			@Pc(45) int local45;
			if (arg0 == 3) {
				local38 = arg1.method4487();
				this.anIntArrayArray18 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray18[local45][0] = arg1.method4494();
					this.anIntArrayArray18[local45][1] = arg1.method4481();
					this.anIntArrayArray18[local45][2] = arg1.method4481();
				}
			} else if (arg0 == 4) {
				local38 = arg1.method4487();
				this.anIntArrayArray16 = new int[local38][3];
				for (local45 = 0; local45 < local38; local45++) {
					this.anIntArrayArray16[local45][0] = arg1.method4494();
					this.anIntArrayArray16[local45][1] = arg1.method4481();
					this.anIntArrayArray16[local45][2] = arg1.method4481();
				}
			} else if (arg0 == 5) {
				arg1.method4494();
			} else if (arg0 == 6) {
				arg1.method4487();
			} else if (arg0 == 7) {
				arg1.method4487();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method4487();
				} else if (arg0 == 10) {
					local38 = arg1.method4487();
					this.anIntArray133 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray133[local45] = arg1.method4481();
					}
				} else if (arg0 == 12) {
					arg1.method4481();
				} else if (arg0 == 13) {
					local38 = arg1.method4487();
					this.anIntArray129 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray129[local45] = arg1.method4494();
					}
				} else if (arg0 == 14) {
					local38 = arg1.method4487();
					this.anIntArrayArray17 = new int[local38][2];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArrayArray17[local45][0] = arg1.method4487();
						this.anIntArrayArray17[local45][1] = arg1.method4487();
					}
				} else if (arg0 == 15) {
					arg1.method4494();
				} else if (arg0 == 17) {
					this.anInt1926 = arg1.method4494();
				} else if (arg0 == 18) {
					local38 = arg1.method4487();
					this.anIntArray137 = new int[local38];
					this.anIntArray130 = new int[local38];
					this.aStringArray10 = new String[local38];
					this.anIntArray132 = new int[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray137[local45] = arg1.method4481();
						this.anIntArray132[local45] = arg1.method4481();
						this.anIntArray130[local45] = arg1.method4481();
						this.aStringArray10[local45] = arg1.method4491();
					}
				} else if (arg0 == 19) {
					local38 = arg1.method4487();
					this.anIntArray134 = new int[local38];
					this.anIntArray135 = new int[local38];
					this.anIntArray136 = new int[local38];
					this.aStringArray11 = new String[local38];
					for (local45 = 0; local45 < local38; local45++) {
						this.anIntArray136[local45] = arg1.method4481();
						this.anIntArray135[local45] = arg1.method4481();
						this.anIntArray134[local45] = arg1.method4481();
						this.aStringArray11[local45] = arg1.method4491();
					}
				} else if (arg0 == 249) {
					local38 = arg1.method4487();
					if (this.aClass230_16 == null) {
						local45 = Static184.method3549(local38);
						this.aClass230_16 = new Class230(local45);
					}
					for (local45 = 0; local45 < local38; local45++) {
						@Pc(293) boolean local293 = arg1.method4487() == 1;
						@Pc(297) int local297 = arg1.method4486();
						@Pc(306) Class1 local306;
						if (local293) {
							local306 = new Class1_Sub36(arg1.method4491());
						} else {
							local306 = new Class1_Sub14(arg1.method4481());
						}
						this.aClass230_16.method6139((long) local297, local306);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public void method1838() {
		if (this.aString38 == null) {
			this.aString38 = this.aString39;
		}
	}
}
