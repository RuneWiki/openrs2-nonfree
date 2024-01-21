import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	private static int anInt782;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Z")
	private static boolean aBoolean216 = true;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
	private int anInt792;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "B")
	private byte aByte46 = 4;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public int anInt784 = -1;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Z")
	public boolean aBoolean217 = false;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt785 = 5;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt786 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt787 = -1;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt788 = 99;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt789 = -1;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt790 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method501(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method662("seq.dat", null), 15787);
			anInt782 = local8.method478();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt782];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt782; local18++) {
				if (aClass27Array1[local18] == null) {
					aClass27Array1[local18] = new Class27();
				}
				aClass27Array1[local18].method503(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("90750, " + true + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method502(@OriginalArg(0) int arg0) {
		try {
			@Pc(14) int local14 = this.anIntArray226[arg0];
			if (local14 == 0) {
				@Pc(24) Class12 local24 = Class12.method303(this.anIntArray224[arg0], this.aByte46);
				if (local24 != null) {
					local14 = this.anIntArray226[arg0] = local24.anInt532;
				}
			}
			if (local14 == 0) {
				local14 = 1;
			}
			return local14;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("17518, " + arg0 + ", " + 24425 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method503(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method476();
				if (local10 == 0) {
					if (this.anInt783 == 0) {
						this.anInt783 = 1;
						this.anIntArray224 = new int[1];
						this.anIntArray224[0] = -1;
						this.anIntArray225 = new int[1];
						this.anIntArray225[0] = -1;
						this.anIntArray226 = new int[1];
						this.anIntArray226[0] = -1;
					}
					if (this.anInt789 == -1) {
						if (this.anIntArray227 == null) {
							this.anInt789 = 0;
						} else {
							this.anInt789 = 2;
						}
					}
					if (this.anInt790 == -1) {
						if (this.anIntArray227 != null) {
							this.anInt790 = 2;
							return;
						}
						this.anInt790 = 0;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt783 = arg0.method476();
					this.anIntArray224 = new int[this.anInt783];
					this.anIntArray225 = new int[this.anInt783];
					this.anIntArray226 = new int[this.anInt783];
					for (local37 = 0; local37 < this.anInt783; local37++) {
						this.anIntArray224[local37] = arg0.method478();
						this.anIntArray225[local37] = arg0.method478();
						if (this.anIntArray225[local37] == 65535) {
							this.anIntArray225[local37] = -1;
						}
						this.anIntArray226[local37] = arg0.method478();
					}
				} else if (local10 == 2) {
					this.anInt784 = arg0.method478();
				} else if (local10 == 3) {
					local37 = arg0.method476();
					this.anIntArray227 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray227[local98] = arg0.method476();
					}
					this.anIntArray227[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean217 = true;
				} else if (local10 == 5) {
					this.anInt785 = arg0.method476();
				} else if (local10 == 6) {
					this.anInt786 = arg0.method478();
				} else if (local10 == 7) {
					this.anInt787 = arg0.method478();
				} else if (local10 == 8) {
					this.anInt788 = arg0.method476();
				} else if (local10 == 9) {
					this.anInt789 = arg0.method476();
				} else if (local10 == 10) {
					this.anInt790 = arg0.method476();
				} else if (local10 == 11) {
					this.anInt791 = arg0.method476();
				} else if (local10 == 12) {
					this.anInt792 = arg0.method481();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("13368, " + false + ", " + arg0 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
