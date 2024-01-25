import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class70 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray11;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray12;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "Lclient!vk;")
	private Class207 aClass207_7;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "Ljava/lang/String;")
	private String aString66;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	public int anInt1658 = -1;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILclient!nj;)V")
	private void method1398(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub21 arg1) {
		if (arg0 == 1) {
			this.aString66 = arg1.method5745();
		} else if (arg0 == 2) {
			this.aString65 = arg1.method5745();
		} else {
			@Pc(85) int local85;
			@Pc(91) int local91;
			if (arg0 == 3) {
				local85 = arg1.method5720();
				this.anIntArrayArray14 = new int[local85][3];
				for (local91 = 0; local91 < local85; local91++) {
					this.anIntArrayArray14[local91][0] = arg1.method5715();
					this.anIntArrayArray14[local91][1] = arg1.method5716();
					this.anIntArrayArray14[local91][2] = arg1.method5716();
				}
			} else if (arg0 == 4) {
				local85 = arg1.method5720();
				this.anIntArrayArray15 = new int[local85][3];
				for (local91 = 0; local91 < local85; local91++) {
					this.anIntArrayArray15[local91][0] = arg1.method5715();
					this.anIntArrayArray15[local91][1] = arg1.method5716();
					this.anIntArrayArray15[local91][2] = arg1.method5716();
				}
			} else if (arg0 == 5) {
				arg1.method5715();
			} else if (arg0 == 6) {
				arg1.method5720();
			} else if (arg0 == 7) {
				arg1.method5720();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method5720();
				} else if (arg0 == 10) {
					local85 = arg1.method5720();
					this.anIntArray137 = new int[local85];
					for (local91 = 0; local91 < local85; local91++) {
						this.anIntArray137[local91] = arg1.method5716();
					}
				} else if (arg0 == 12) {
					arg1.method5716();
				} else if (arg0 == 13) {
					local85 = arg1.method5720();
					this.anIntArray141 = new int[local85];
					for (local91 = 0; local91 < local85; local91++) {
						this.anIntArray141[local91] = arg1.method5715();
					}
				} else if (arg0 == 14) {
					local85 = arg1.method5720();
					this.anIntArrayArray13 = new int[local85][2];
					for (local91 = 0; local91 < local85; local91++) {
						this.anIntArrayArray13[local91][0] = arg1.method5720();
						this.anIntArrayArray13[local91][1] = arg1.method5720();
					}
				} else if (arg0 == 15) {
					arg1.method5715();
				} else if (arg0 == 17) {
					this.anInt1658 = arg1.method5715();
				} else if (arg0 == 18) {
					local85 = arg1.method5720();
					this.anIntArray139 = new int[local85];
					this.aStringArray11 = new String[local85];
					this.anIntArray136 = new int[local85];
					this.anIntArray140 = new int[local85];
					for (local91 = 0; local91 < local85; local91++) {
						this.anIntArray140[local91] = arg1.method5716();
						this.anIntArray136[local91] = arg1.method5716();
						this.anIntArray139[local91] = arg1.method5716();
						this.aStringArray11[local91] = arg1.method5701();
					}
				} else if (arg0 == 19) {
					local85 = arg1.method5720();
					this.aStringArray12 = new String[local85];
					this.anIntArray138 = new int[local85];
					this.anIntArray142 = new int[local85];
					this.anIntArray135 = new int[local85];
					for (local91 = 0; local91 < local85; local91++) {
						this.anIntArray138[local91] = arg1.method5716();
						this.anIntArray135[local91] = arg1.method5716();
						this.anIntArray142[local91] = arg1.method5716();
						this.aStringArray12[local91] = arg1.method5701();
					}
				} else if (arg0 == 249) {
					local85 = arg1.method5720();
					if (this.aClass207_7 == null) {
						local91 = Static304.method5275(local85);
						this.aClass207_7 = new Class207(local91);
					}
					for (local91 = 0; local91 < local85; local91++) {
						@Pc(299) boolean local299 = arg1.method5720() == 1;
						@Pc(303) int local303 = arg1.method5705();
						@Pc(312) Class1 local312;
						if (local299) {
							local312 = new Class1_Sub39(arg1.method5701());
						} else {
							local312 = new Class1_Sub14(arg1.method5716());
						}
						this.aClass207_7.method5552(local312, (long) local303);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method1400(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5720();
			if (local10 == 0) {
				return;
			}
			this.method1398(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	public void method1403() {
		if (this.aString65 == null) {
			this.aString65 = this.aString66;
		}
	}
}
