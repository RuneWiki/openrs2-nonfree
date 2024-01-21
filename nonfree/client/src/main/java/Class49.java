import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZGXCNUJM")
public final class Class49 {

	@OriginalMember(owner = "client!ZGXCNUJM", name = "c", descriptor = "I")
	private static int anInt766;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "d", descriptor = "[Lclient!ZGXCNUJM;")
	public static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "a", descriptor = "Z")
	private static boolean aBoolean216 = true;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "e", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "f", descriptor = "[I")
	public int[] anIntArray206;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "g", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "h", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "j", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "s", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "b", descriptor = "I")
	private int anInt765 = -107;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "i", descriptor = "I")
	public int anInt768 = -1;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "k", descriptor = "Z")
	public boolean aBoolean217 = false;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "l", descriptor = "I")
	public int anInt769 = 5;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "m", descriptor = "I")
	public int anInt770 = -1;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "n", descriptor = "I")
	public int anInt771 = -1;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "o", descriptor = "I")
	public int anInt772 = 99;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "p", descriptor = "I")
	public int anInt773 = -1;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "q", descriptor = "I")
	public int anInt774 = -1;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "r", descriptor = "I")
	public int anInt775 = 2;

	@OriginalMember(owner = "client!ZGXCNUJM", name = "a", descriptor = "(Lclient!FNOQZAYQ;I)V")
	public static void method570(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class2_Sub1_Sub4 local8 = new Class2_Sub1_Sub4(arg0.method165("seq.dat", null), aBoolean216);
			@Pc(12) int local12 = 57 / arg1;
			anInt766 = local8.method96();
			if (aClass49Array1 == null) {
				aClass49Array1 = new Class49[anInt766];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt766; local22++) {
				if (aClass49Array1[local22] == null) {
					aClass49Array1[local22] = new Class49();
				}
				aClass49Array1[local22].method572(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("50116, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGXCNUJM", name = "<init>", descriptor = "()V")
	private Class49() {
	}

	@OriginalMember(owner = "client!ZGXCNUJM", name = "a", descriptor = "(II)I")
	public int method571(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray208[arg0];
			if (local4 == 0) {
				@Pc(17) Class29 local17 = Class29.method295(this.anIntArray206[arg0]);
				if (local17 != null) {
					local4 = this.anIntArray208[arg0] = local17.anInt495;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("25221, " + arg0 + ", " + -818 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGXCNUJM", name = "a", descriptor = "(Lclient!DNRIFKTO;I)V")
	private void method572(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method94();
				if (local10 == 0) {
					if (this.anInt767 == 0) {
						this.anInt767 = 1;
						this.anIntArray206 = new int[1];
						this.anIntArray206[0] = -1;
						this.anIntArray207 = new int[1];
						this.anIntArray207[0] = -1;
						this.anIntArray208 = new int[1];
						this.anIntArray208[0] = -1;
					}
					if (this.anInt773 == -1) {
						if (this.anIntArray209 == null) {
							this.anInt773 = 0;
						} else {
							this.anInt773 = 2;
						}
					}
					if (this.anInt774 == -1) {
						if (this.anIntArray209 != null) {
							this.anInt774 = 2;
							return;
						}
						this.anInt774 = 0;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt767 = arg0.method94();
					this.anIntArray206 = new int[this.anInt767];
					this.anIntArray207 = new int[this.anInt767];
					this.anIntArray208 = new int[this.anInt767];
					for (local37 = 0; local37 < this.anInt767; local37++) {
						this.anIntArray206[local37] = arg0.method96();
						this.anIntArray207[local37] = arg0.method96();
						if (this.anIntArray207[local37] == 65535) {
							this.anIntArray207[local37] = -1;
						}
						this.anIntArray208[local37] = arg0.method96();
					}
				} else if (local10 == 2) {
					this.anInt768 = arg0.method96();
				} else if (local10 == 3) {
					local37 = arg0.method94();
					this.anIntArray209 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray209[local98] = arg0.method94();
					}
					this.anIntArray209[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean217 = true;
				} else if (local10 == 5) {
					this.anInt769 = arg0.method94();
				} else if (local10 == 6) {
					this.anInt770 = arg0.method96();
				} else if (local10 == 7) {
					this.anInt771 = arg0.method96();
				} else if (local10 == 8) {
					this.anInt772 = arg0.method94();
				} else if (local10 == 9) {
					this.anInt773 = arg0.method94();
				} else if (local10 == 10) {
					this.anInt774 = arg0.method94();
				} else if (local10 == 11) {
					this.anInt775 = arg0.method94();
				} else if (local10 == 12) {
					this.anInt776 = arg0.method99();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("18966, " + arg0 + ", " + -25 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
