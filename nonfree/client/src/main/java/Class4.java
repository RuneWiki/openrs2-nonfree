import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BRGDZOWQ")
public final class Class4 {

	@OriginalMember(owner = "client!BRGDZOWQ", name = "c", descriptor = "I")
	private static int anInt114;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "d", descriptor = "[Lclient!BRGDZOWQ;")
	public static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "p", descriptor = "Lclient!LSQNLJTA;")
	public static Class29 aClass29_1 = new Class29(30, (byte) 17);

	@OriginalMember(owner = "client!BRGDZOWQ", name = "b", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "e", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "f", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "h", descriptor = "Lclient!IUTBNGPH;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "m", descriptor = "I")
	public int anInt120;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "n", descriptor = "I")
	public int anInt121;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "o", descriptor = "I")
	public int anInt122;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "a", descriptor = "I")
	private int anInt112 = 22486;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "g", descriptor = "I")
	private int anInt117 = -1;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "i", descriptor = "[I")
	private int[] anIntArray12 = new int[6];

	@OriginalMember(owner = "client!BRGDZOWQ", name = "j", descriptor = "[I")
	private int[] anIntArray13 = new int[6];

	@OriginalMember(owner = "client!BRGDZOWQ", name = "k", descriptor = "I")
	public int anInt118 = 128;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "l", descriptor = "I")
	public int anInt119 = 128;

	@OriginalMember(owner = "client!BRGDZOWQ", name = "a", descriptor = "(Lclient!VSUYIIVA;I)V")
	public static void method32(@OriginalArg(0) Class42 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub2 local8 = new Class1_Sub1_Sub2(arg0.method539("spotanim.dat", null), 792);
			anInt114 = local8.method61();
			if (aClass4Array1 == null) {
				aClass4Array1 = new Class4[anInt114];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt114; local21++) {
				if (aClass4Array1[local21] == null) {
					aClass4Array1[local21] = new Class4();
				}
				aClass4Array1[local21].anInt115 = local21;
				aClass4Array1[local21].method33(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("30648, " + arg0 + ", " + 236 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BRGDZOWQ", name = "<init>", descriptor = "()V")
	private Class4() {
	}

	@OriginalMember(owner = "client!BRGDZOWQ", name = "a", descriptor = "(Lclient!CFARFRSG;I)V")
	private void method33(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			if (this.anInt112 != 22486) {
				this.anInt112 = 338;
			}
			while (true) {
				while (true) {
					@Pc(11) int local11 = arg0.method59();
					if (local11 == 0) {
						return;
					}
					if (local11 == 1) {
						this.anInt116 = arg0.method61();
					} else if (local11 == 2) {
						this.anInt117 = arg0.method61();
						if (Class21.aClass21Array1 != null) {
							this.aClass21_1 = Class21.aClass21Array1[this.anInt117];
						}
					} else if (local11 == 4) {
						this.anInt118 = arg0.method61();
					} else if (local11 == 5) {
						this.anInt119 = arg0.method61();
					} else if (local11 == 6) {
						this.anInt120 = arg0.method61();
					} else if (local11 == 7) {
						this.anInt121 = arg0.method59();
					} else if (local11 == 8) {
						this.anInt122 = arg0.method59();
					} else if (local11 >= 40 && local11 < 50) {
						this.anIntArray12[local11 - 40] = arg0.method61();
					} else if (local11 >= 50 && local11 < 60) {
						this.anIntArray13[local11 - 50] = arg0.method61();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local11);
					}
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("15547, " + arg0 + ", " + 22486 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BRGDZOWQ", name = "a", descriptor = "()Lclient!LFTMDGKK;")
	public Class1_Sub1_Sub1_Sub4 method34() {
		@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) aClass29_1.method334((long) this.anInt115);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub4.method302(this.anInt116, this.anInt113);
		if (local6 == null) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < 6; local22++) {
			if (this.anIntArray12[0] != 0) {
				local6.method316(this.anIntArray12[local22], this.anIntArray13[local22]);
			}
		}
		aClass29_1.method335(local6, (long) this.anInt115);
		return local6;
	}
}
