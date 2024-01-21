import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private static int anInt813;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public int anInt814;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public int anInt815 = -1;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
	public boolean aBoolean211 = false;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public int anInt816 = 5;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public int anInt817 = -1;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt818 = -1;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt819 = 99;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt820 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt821 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!xb;Z)V")
	public static void method505(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(-49365, arg0.method666("seq.dat", null));
			anInt813 = local10.method482();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt813];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt813; local29++) {
				if (aClass27Array1[local29] == null) {
					aClass27Array1[local29] = new Class27();
				}
				aClass27Array1[local29].method507(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("80369, " + arg0 + ", " + false + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)I")
	public int method506(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				return 3;
			}
			@Pc(8) int local8 = this.anIntArray227[arg0];
			if (local8 == 0) {
				@Pc(17) Class12 local17 = Class12.method305(this.anIntArray225[arg0]);
				if (local17 != null) {
					local8 = this.anIntArray227[arg0] = local17.anInt550;
				}
			}
			if (local8 == 0) {
				local8 = 1;
			}
			return local8;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("94870, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private void method507(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method480();
				if (local10 == 0) {
					if (this.anInt814 == 0) {
						this.anInt814 = 1;
						this.anIntArray225 = new int[1];
						this.anIntArray225[0] = -1;
						this.anIntArray226 = new int[1];
						this.anIntArray226[0] = -1;
						this.anIntArray227 = new int[1];
						this.anIntArray227[0] = -1;
					}
					if (this.anInt820 == -1) {
						if (this.anIntArray228 == null) {
							this.anInt820 = 0;
						} else {
							this.anInt820 = 2;
						}
					}
					if (this.anInt821 == -1) {
						if (this.anIntArray228 != null) {
							this.anInt821 = 2;
							return;
						}
						this.anInt821 = 0;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt814 = arg0.method480();
					this.anIntArray225 = new int[this.anInt814];
					this.anIntArray226 = new int[this.anInt814];
					this.anIntArray227 = new int[this.anInt814];
					for (local37 = 0; local37 < this.anInt814; local37++) {
						this.anIntArray225[local37] = arg0.method482();
						this.anIntArray226[local37] = arg0.method482();
						if (this.anIntArray226[local37] == 65535) {
							this.anIntArray226[local37] = -1;
						}
						this.anIntArray227[local37] = arg0.method482();
					}
				} else if (local10 == 2) {
					this.anInt815 = arg0.method482();
				} else if (local10 == 3) {
					local37 = arg0.method480();
					this.anIntArray228 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray228[local98] = arg0.method480();
					}
					this.anIntArray228[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean211 = true;
				} else if (local10 == 5) {
					this.anInt816 = arg0.method480();
				} else if (local10 == 6) {
					this.anInt817 = arg0.method482();
				} else if (local10 == 7) {
					this.anInt818 = arg0.method482();
				} else if (local10 == 8) {
					this.anInt819 = arg0.method480();
				} else if (local10 == 9) {
					this.anInt820 = arg0.method480();
				} else if (local10 == 10) {
					this.anInt821 = arg0.method480();
				} else if (local10 == 11) {
					this.anInt822 = arg0.method480();
				} else if (local10 == 12) {
					this.anInt823 = arg0.method485();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("59167, " + arg0 + ", " + false + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
