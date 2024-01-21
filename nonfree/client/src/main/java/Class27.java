import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	private static int anInt806;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private static int anInt804 = 1000;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	public int anInt807;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private int anInt805 = -22323;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Z")
	private boolean aBoolean213 = true;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public int anInt808 = -1;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Z")
	public boolean aBoolean214 = false;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt809 = 5;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt810 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt811 = -1;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt812 = 99;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt813 = -1;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt814 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method505(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(anInt804, arg0.method666("seq.dat", null));
			anInt806 = local8.method482();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt806];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt806; local18++) {
				if (aClass27Array1[local18] == null) {
					aClass27Array1[local18] = new Class27();
				}
				aClass27Array1[local18].method507(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("19823, " + arg0 + ", " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method506(@OriginalArg(1) int arg0) {
		try {
			@Pc(15) int local15 = this.anIntArray227[arg0];
			if (local15 == 0) {
				@Pc(25) Class12 local25 = Class12.method305(this.anIntArray225[arg0], this.anInt805);
				if (local25 != null) {
					local15 = this.anIntArray227[arg0] = local25.anInt551;
				}
			}
			if (local15 == 0) {
				local15 = 1;
			}
			return local15;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("19426, " + 36967 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!lb;)V")
	private void method507(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(17) int local17 = arg0.method480();
				if (local17 == 0) {
					if (this.anInt807 == 0) {
						this.anInt807 = 1;
						this.anIntArray225 = new int[1];
						this.anIntArray225[0] = -1;
						this.anIntArray226 = new int[1];
						this.anIntArray226[0] = -1;
						this.anIntArray227 = new int[1];
						this.anIntArray227[0] = -1;
					}
					if (this.anInt813 == -1) {
						if (this.anIntArray228 == null) {
							this.anInt813 = 0;
						} else {
							this.anInt813 = 2;
						}
					}
					if (this.anInt814 == -1) {
						if (this.anIntArray228 != null) {
							this.anInt814 = 2;
							return;
						}
						this.anInt814 = 0;
						return;
					}
					return;
				}
				@Pc(44) int local44;
				if (local17 == 1) {
					this.anInt807 = arg0.method480();
					this.anIntArray225 = new int[this.anInt807];
					this.anIntArray226 = new int[this.anInt807];
					this.anIntArray227 = new int[this.anInt807];
					for (local44 = 0; local44 < this.anInt807; local44++) {
						this.anIntArray225[local44] = arg0.method482();
						this.anIntArray226[local44] = arg0.method482();
						if (this.anIntArray226[local44] == 65535) {
							this.anIntArray226[local44] = -1;
						}
						this.anIntArray227[local44] = arg0.method482();
					}
				} else if (local17 == 2) {
					this.anInt808 = arg0.method482();
				} else if (local17 == 3) {
					local44 = arg0.method480();
					this.anIntArray228 = new int[local44 + 1];
					for (@Pc(105) int local105 = 0; local105 < local44; local105++) {
						this.anIntArray228[local105] = arg0.method480();
					}
					this.anIntArray228[local44] = 9999999;
				} else if (local17 == 4) {
					this.aBoolean214 = true;
				} else if (local17 == 5) {
					this.anInt809 = arg0.method480();
				} else if (local17 == 6) {
					this.anInt810 = arg0.method482();
				} else if (local17 == 7) {
					this.anInt811 = arg0.method482();
				} else if (local17 == 8) {
					this.anInt812 = arg0.method480();
				} else if (local17 == 9) {
					this.anInt813 = arg0.method480();
				} else if (local17 == 10) {
					this.anInt814 = arg0.method480();
				} else if (local17 == 11) {
					this.anInt815 = arg0.method480();
				} else if (local17 == 12) {
					this.anInt816 = arg0.method485();
				} else {
					System.out.println("Error unrecognised seq config code: " + local17);
				}
			}
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("22950, " + 8 + ", " + arg0 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}
}
