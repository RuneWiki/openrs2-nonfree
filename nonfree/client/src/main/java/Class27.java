import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	private static boolean aBoolean216;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	private static int anInt784;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public int anInt785;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	private int anInt794;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	private int anInt783 = 38;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public int anInt786 = -1;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Z")
	public boolean aBoolean217 = false;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt787 = 5;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt788 = -1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt789 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt790 = 99;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt791 = -1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt792 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method505(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method666("seq.dat", null), aBoolean216);
			anInt784 = local10.method482();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt784];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt784; local20++) {
				if (aClass27Array1[local20] == null) {
					aClass27Array1[local20] = new Class27();
				}
				aClass27Array1[local20].method507(local10);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("4592, " + arg0 + ", " + 5 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method506(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) int local11 = this.anIntArray227[arg0];
			if (local11 == 0) {
				@Pc(20) Class12 local20 = Class12.method305(this.anIntArray225[arg0]);
				if (local20 != null) {
					local11 = this.anIntArray227[arg0] = local20.anInt529;
				}
			}
			if (local11 == 0) {
				local11 = 1;
			}
			return local11;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("54582, " + arg0 + ", " + -86 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method507(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method480();
				if (local10 == 0) {
					if (this.anInt785 == 0) {
						this.anInt785 = 1;
						this.anIntArray225 = new int[1];
						this.anIntArray225[0] = -1;
						this.anIntArray226 = new int[1];
						this.anIntArray226[0] = -1;
						this.anIntArray227 = new int[1];
						this.anIntArray227[0] = -1;
					}
					if (this.anInt791 == -1) {
						if (this.anIntArray228 == null) {
							this.anInt791 = 0;
						} else {
							this.anInt791 = 2;
						}
					}
					if (this.anInt792 == -1) {
						if (this.anIntArray228 != null) {
							this.anInt792 = 2;
							return;
						}
						this.anInt792 = 0;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt785 = arg0.method480();
					this.anIntArray225 = new int[this.anInt785];
					this.anIntArray226 = new int[this.anInt785];
					this.anIntArray227 = new int[this.anInt785];
					for (local37 = 0; local37 < this.anInt785; local37++) {
						this.anIntArray225[local37] = arg0.method482();
						this.anIntArray226[local37] = arg0.method482();
						if (this.anIntArray226[local37] == 65535) {
							this.anIntArray226[local37] = -1;
						}
						this.anIntArray227[local37] = arg0.method482();
					}
				} else if (local10 == 2) {
					this.anInt786 = arg0.method482();
				} else if (local10 == 3) {
					local37 = arg0.method480();
					this.anIntArray228 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray228[local98] = arg0.method480();
					}
					this.anIntArray228[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean217 = true;
				} else if (local10 == 5) {
					this.anInt787 = arg0.method480();
				} else if (local10 == 6) {
					this.anInt788 = arg0.method482();
				} else if (local10 == 7) {
					this.anInt789 = arg0.method482();
				} else if (local10 == 8) {
					this.anInt790 = arg0.method480();
				} else if (local10 == 9) {
					this.anInt791 = arg0.method480();
				} else if (local10 == 10) {
					this.anInt792 = arg0.method480();
				} else if (local10 == 11) {
					this.anInt793 = arg0.method480();
				} else if (local10 == 12) {
					this.anInt794 = arg0.method485();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("79945, " + false + ", " + arg0 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
