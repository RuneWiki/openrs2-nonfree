import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class56 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray13;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!gu;")
	private Class96 aClass96_15;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray14;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
	public int anInt1798 = -1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!hp;B)V")
	private void method1568(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.aString14 = arg1.method5406();
		} else if (arg0 == 2) {
			this.aString13 = arg1.method5406();
		} else {
			@Pc(26) int local26;
			@Pc(33) int local33;
			if (arg0 == 3) {
				local26 = arg1.method5366();
				this.anIntArrayArray20 = new int[local26][3];
				for (local33 = 0; local33 < local26; local33++) {
					this.anIntArrayArray20[local33][0] = arg1.method5362();
					this.anIntArrayArray20[local33][1] = arg1.method5407();
					this.anIntArrayArray20[local33][2] = arg1.method5407();
				}
			} else if (arg0 == 4) {
				local26 = arg1.method5366();
				this.anIntArrayArray19 = new int[local26][3];
				for (local33 = 0; local33 < local26; local33++) {
					this.anIntArrayArray19[local33][0] = arg1.method5362();
					this.anIntArrayArray19[local33][1] = arg1.method5407();
					this.anIntArrayArray19[local33][2] = arg1.method5407();
				}
			} else if (arg0 == 5) {
				arg1.method5362();
			} else if (arg0 == 6) {
				arg1.method5366();
			} else if (arg0 == 7) {
				arg1.method5366();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method5366();
				} else if (arg0 == 10) {
					local26 = arg1.method5366();
					this.anIntArray136 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray136[local33] = arg1.method5407();
					}
				} else if (arg0 == 12) {
					arg1.method5407();
				} else if (arg0 == 13) {
					local26 = arg1.method5366();
					this.anIntArray135 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray135[local33] = arg1.method5362();
					}
				} else if (arg0 == 14) {
					local26 = arg1.method5366();
					this.anIntArrayArray21 = new int[local26][2];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArrayArray21[local33][0] = arg1.method5366();
						this.anIntArrayArray21[local33][1] = arg1.method5366();
					}
				} else if (arg0 == 15) {
					arg1.method5362();
				} else if (arg0 == 17) {
					this.anInt1798 = arg1.method5362();
				} else if (arg0 == 18) {
					local26 = arg1.method5366();
					this.aStringArray14 = new String[local26];
					this.anIntArray140 = new int[local26];
					this.anIntArray137 = new int[local26];
					this.anIntArray142 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray142[local33] = arg1.method5407();
						this.anIntArray140[local33] = arg1.method5407();
						this.anIntArray137[local33] = arg1.method5407();
						this.aStringArray14[local33] = arg1.method5401();
					}
				} else if (arg0 == 19) {
					local26 = arg1.method5366();
					this.anIntArray138 = new int[local26];
					this.anIntArray139 = new int[local26];
					this.aStringArray13 = new String[local26];
					this.anIntArray141 = new int[local26];
					for (local33 = 0; local33 < local26; local33++) {
						this.anIntArray139[local33] = arg1.method5407();
						this.anIntArray138[local33] = arg1.method5407();
						this.anIntArray141[local33] = arg1.method5407();
						this.aStringArray13[local33] = arg1.method5401();
					}
				} else if (arg0 == 249) {
					local26 = arg1.method5366();
					if (this.aClass96_15 == null) {
						local33 = Static406.method5434(local26);
						this.aClass96_15 = new Class96(local33);
					}
					for (local33 = 0; local33 < local26; local33++) {
						@Pc(292) boolean local292 = arg1.method5366() == 1;
						@Pc(296) int local296 = arg1.method5399();
						@Pc(305) Class1 local305;
						if (local292) {
							local305 = new Class1_Sub12(arg1.method5401());
						} else {
							local305 = new Class1_Sub43(arg1.method5407());
						}
						this.aClass96_15.method2341((long) local296, local305);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!hp;)V")
	public void method1570(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5366();
			if (local3 == 0) {
				return;
			}
			this.method1568(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	public void method1571() {
		if (this.aString13 == null) {
			this.aString13 = this.aString14;
		}
	}
}
