import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RTDMFIDA")
public final class Class34 {

	@OriginalMember(owner = "client!RTDMFIDA", name = "b", descriptor = "I")
	private static int anInt580;

	@OriginalMember(owner = "client!RTDMFIDA", name = "c", descriptor = "[Lclient!RTDMFIDA;")
	public static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!RTDMFIDA", name = "o", descriptor = "Lclient!EQSIBNHW;")
	public static Class7 aClass7_7 = new Class7(30, 451);

	@OriginalMember(owner = "client!RTDMFIDA", name = "d", descriptor = "I")
	private int anInt581;

	@OriginalMember(owner = "client!RTDMFIDA", name = "e", descriptor = "I")
	private int anInt582;

	@OriginalMember(owner = "client!RTDMFIDA", name = "g", descriptor = "Lclient!KMWMLVIH;")
	public Class19 aClass19_2;

	@OriginalMember(owner = "client!RTDMFIDA", name = "l", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!RTDMFIDA", name = "m", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!RTDMFIDA", name = "n", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!RTDMFIDA", name = "a", descriptor = "I")
	private int anInt579 = -836;

	@OriginalMember(owner = "client!RTDMFIDA", name = "f", descriptor = "I")
	private int anInt583 = -1;

	@OriginalMember(owner = "client!RTDMFIDA", name = "h", descriptor = "[I")
	private int[] anIntArray169 = new int[6];

	@OriginalMember(owner = "client!RTDMFIDA", name = "i", descriptor = "[I")
	private int[] anIntArray170 = new int[6];

	@OriginalMember(owner = "client!RTDMFIDA", name = "j", descriptor = "I")
	public int anInt584 = 128;

	@OriginalMember(owner = "client!RTDMFIDA", name = "k", descriptor = "I")
	public int anInt585 = 128;

	@OriginalMember(owner = "client!RTDMFIDA", name = "a", descriptor = "(Lclient!WEMOPWVJ;I)V")
	public static void method388(@OriginalArg(0) Class43 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub4 local10 = new Class1_Sub1_Sub4(arg0.method515("spotanim.dat", null), true);
			anInt580 = local10.method407();
			if (aClass34Array1 == null) {
				aClass34Array1 = new Class34[anInt580];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt580; local20++) {
				if (aClass34Array1[local20] == null) {
					aClass34Array1[local20] = new Class34();
				}
				aClass34Array1[local20].anInt581 = local20;
				aClass34Array1[local20].method389(local10);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("66345, " + arg0 + ", " + 24414 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RTDMFIDA", name = "<init>", descriptor = "()V")
	private Class34() {
	}

	@OriginalMember(owner = "client!RTDMFIDA", name = "a", descriptor = "(ILclient!SVWJKJVI;)V")
	private void method389(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method405();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt582 = arg0.method407();
				} else if (local10 == 2) {
					this.anInt583 = arg0.method407();
					if (Class19.aClass19Array1 != null) {
						this.aClass19_2 = Class19.aClass19Array1[this.anInt583];
					}
				} else if (local10 == 4) {
					this.anInt584 = arg0.method407();
				} else if (local10 == 5) {
					this.anInt585 = arg0.method407();
				} else if (local10 == 6) {
					this.anInt586 = arg0.method407();
				} else if (local10 == 7) {
					this.anInt587 = arg0.method405();
				} else if (local10 == 8) {
					this.anInt588 = arg0.method405();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray169[local10 - 40] = arg0.method407();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray170[local10 - 50] = arg0.method407();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("43374, " + -13096 + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RTDMFIDA", name = "a", descriptor = "()Lclient!IYSWJGDE;")
	public Class1_Sub1_Sub1_Sub3 method390() {
		@Pc(6) Class1_Sub1_Sub1_Sub3 local6 = (Class1_Sub1_Sub1_Sub3) aClass7_7.method40((long) this.anInt581);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub3.method147(this.anInt582);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray169[0] != 0) {
				local6.method161(this.anIntArray169[local20], this.anIntArray170[local20]);
			}
		}
		aClass7_7.method41(825, (long) this.anInt581, local6);
		return local6;
	}
}
