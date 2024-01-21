import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XRDQTWLL")
public final class Class46 {

	@OriginalMember(owner = "client!XRDQTWLL", name = "d", descriptor = "I")
	private static int anInt770;

	@OriginalMember(owner = "client!XRDQTWLL", name = "e", descriptor = "[Lclient!XRDQTWLL;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!XRDQTWLL", name = "a", descriptor = "I")
	private static int anInt768 = 536;

	@OriginalMember(owner = "client!XRDQTWLL", name = "b", descriptor = "I")
	private static int anInt769 = 3;

	@OriginalMember(owner = "client!XRDQTWLL", name = "f", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!XRDQTWLL", name = "g", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!XRDQTWLL", name = "h", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!XRDQTWLL", name = "i", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!XRDQTWLL", name = "k", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!XRDQTWLL", name = "t", descriptor = "I")
	private int anInt780;

	@OriginalMember(owner = "client!XRDQTWLL", name = "c", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!XRDQTWLL", name = "j", descriptor = "I")
	public int anInt772 = -1;

	@OriginalMember(owner = "client!XRDQTWLL", name = "l", descriptor = "Z")
	public boolean aBoolean183 = false;

	@OriginalMember(owner = "client!XRDQTWLL", name = "m", descriptor = "I")
	public int anInt773 = 5;

	@OriginalMember(owner = "client!XRDQTWLL", name = "n", descriptor = "I")
	public int anInt774 = -1;

	@OriginalMember(owner = "client!XRDQTWLL", name = "o", descriptor = "I")
	public int anInt775 = -1;

	@OriginalMember(owner = "client!XRDQTWLL", name = "p", descriptor = "I")
	public int anInt776 = 99;

	@OriginalMember(owner = "client!XRDQTWLL", name = "q", descriptor = "I")
	public int anInt777 = -1;

	@OriginalMember(owner = "client!XRDQTWLL", name = "r", descriptor = "I")
	public int anInt778 = -1;

	@OriginalMember(owner = "client!XRDQTWLL", name = "s", descriptor = "I")
	public int anInt779 = 2;

	@OriginalMember(owner = "client!XRDQTWLL", name = "a", descriptor = "(ILclient!UUIGNTAD;)V")
	public static void method549(@OriginalArg(1) Class38 arg0) {
		try {
			if (anInt769 == 3) {
				@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(arg0.method512("seq.dat", null), anInt768);
				anInt770 = local12.method57();
				if (aClass46Array1 == null) {
					aClass46Array1 = new Class46[anInt770];
				}
				for (@Pc(22) int local22 = 0; local22 < anInt770; local22++) {
					if (aClass46Array1[local22] == null) {
						aClass46Array1[local22] = new Class46();
					}
					aClass46Array1[local22].method551(local12);
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("84900, " + 3 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRDQTWLL", name = "<init>", descriptor = "()V")
	private Class46() {
	}

	@OriginalMember(owner = "client!XRDQTWLL", name = "a", descriptor = "(IB)I")
	public int method550(@OriginalArg(0) int arg0) {
		try {
			@Pc(15) int local15 = this.anIntArray200[arg0];
			if (local15 == 0) {
				@Pc(23) Class31 local23 = Class31.method387(this.anIntArray198[arg0]);
				if (local23 != null) {
					local15 = this.anIntArray200[arg0] = local23.anInt582;
				}
			}
			if (local15 == 0) {
				local15 = 1;
			}
			return local15;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("65956, " + arg0 + ", " + 9 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XRDQTWLL", name = "a", descriptor = "(Lclient!CMGGUSPR;I)V")
	private void method551(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(8) int local8 = arg0.method55();
				if (local8 == 0) {
					if (this.anInt771 == 0) {
						this.anInt771 = 1;
						this.anIntArray198 = new int[1];
						this.anIntArray198[0] = -1;
						this.anIntArray199 = new int[1];
						this.anIntArray199[0] = -1;
						this.anIntArray200 = new int[1];
						this.anIntArray200[0] = -1;
					}
					if (this.anInt777 == -1) {
						if (this.anIntArray201 == null) {
							this.anInt777 = 0;
						} else {
							this.anInt777 = 2;
						}
					}
					if (this.anInt778 == -1) {
						if (this.anIntArray201 != null) {
							this.anInt778 = 2;
							return;
						}
						this.anInt778 = 0;
						return;
					}
					return;
				}
				@Pc(35) int local35;
				if (local8 == 1) {
					this.anInt771 = arg0.method55();
					this.anIntArray198 = new int[this.anInt771];
					this.anIntArray199 = new int[this.anInt771];
					this.anIntArray200 = new int[this.anInt771];
					for (local35 = 0; local35 < this.anInt771; local35++) {
						this.anIntArray198[local35] = arg0.method57();
						this.anIntArray199[local35] = arg0.method57();
						if (this.anIntArray199[local35] == 65535) {
							this.anIntArray199[local35] = -1;
						}
						this.anIntArray200[local35] = arg0.method57();
					}
				} else if (local8 == 2) {
					this.anInt772 = arg0.method57();
				} else if (local8 == 3) {
					local35 = arg0.method55();
					this.anIntArray201 = new int[local35 + 1];
					for (@Pc(96) int local96 = 0; local96 < local35; local96++) {
						this.anIntArray201[local96] = arg0.method55();
					}
					this.anIntArray201[local35] = 9999999;
				} else if (local8 == 4) {
					this.aBoolean183 = true;
				} else if (local8 == 5) {
					this.anInt773 = arg0.method55();
				} else if (local8 == 6) {
					this.anInt774 = arg0.method57();
				} else if (local8 == 7) {
					this.anInt775 = arg0.method57();
				} else if (local8 == 8) {
					this.anInt776 = arg0.method55();
				} else if (local8 == 9) {
					this.anInt777 = arg0.method55();
				} else if (local8 == 10) {
					this.anInt778 = arg0.method55();
				} else if (local8 == 11) {
					this.anInt779 = arg0.method55();
				} else if (local8 == 12) {
					this.anInt780 = arg0.method60();
				} else {
					System.out.println("Error unrecognised seq config code: " + local8);
				}
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("92317, " + arg0 + ", " + -593 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}
}
