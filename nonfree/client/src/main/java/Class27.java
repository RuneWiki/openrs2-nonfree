import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	private static int anInt770;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	private int anInt780;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public int anInt772 = -1;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Z")
	public boolean aBoolean218 = false;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt773 = 5;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt774 = -1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt775 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt776 = 99;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt777 = -1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt778 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method505(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg0.method666("seq.dat", null), (byte) -93);
			anInt770 = local11.method482();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt770];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt770; local21++) {
				if (aClass27Array1[local21] == null) {
					aClass27Array1[local21] = new Class27();
				}
				aClass27Array1[local21].method507(local11);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("33317, " + false + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)I")
	public int method506(@OriginalArg(1) int arg0) {
		try {
			@Pc(15) int local15 = this.anIntArray227[arg0];
			if (local15 == 0) {
				@Pc(24) Class12 local24 = Class12.method305(this.anIntArray225[arg0]);
				if (local24 != null) {
					local15 = this.anIntArray227[arg0] = local24.anInt509;
				}
			}
			if (local15 == 0) {
				local15 = 1;
			}
			return local15;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("16570, " + -97 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!lb;)V")
	private void method507(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method480();
				if (local14 == 0) {
					if (this.anInt771 == 0) {
						this.anInt771 = 1;
						this.anIntArray225 = new int[1];
						this.anIntArray225[0] = -1;
						this.anIntArray226 = new int[1];
						this.anIntArray226[0] = -1;
						this.anIntArray227 = new int[1];
						this.anIntArray227[0] = -1;
					}
					if (this.anInt777 == -1) {
						if (this.anIntArray228 == null) {
							this.anInt777 = 0;
						} else {
							this.anInt777 = 2;
						}
					}
					if (this.anInt778 == -1) {
						if (this.anIntArray228 != null) {
							this.anInt778 = 2;
							return;
						}
						this.anInt778 = 0;
						return;
					}
					return;
				}
				@Pc(41) int local41;
				if (local14 == 1) {
					this.anInt771 = arg0.method480();
					this.anIntArray225 = new int[this.anInt771];
					this.anIntArray226 = new int[this.anInt771];
					this.anIntArray227 = new int[this.anInt771];
					for (local41 = 0; local41 < this.anInt771; local41++) {
						this.anIntArray225[local41] = arg0.method482();
						this.anIntArray226[local41] = arg0.method482();
						if (this.anIntArray226[local41] == 65535) {
							this.anIntArray226[local41] = -1;
						}
						this.anIntArray227[local41] = arg0.method482();
					}
				} else if (local14 == 2) {
					this.anInt772 = arg0.method482();
				} else if (local14 == 3) {
					local41 = arg0.method480();
					this.anIntArray228 = new int[local41 + 1];
					for (@Pc(102) int local102 = 0; local102 < local41; local102++) {
						this.anIntArray228[local102] = arg0.method480();
					}
					this.anIntArray228[local41] = 9999999;
				} else if (local14 == 4) {
					this.aBoolean218 = true;
				} else if (local14 == 5) {
					this.anInt773 = arg0.method480();
				} else if (local14 == 6) {
					this.anInt774 = arg0.method482();
				} else if (local14 == 7) {
					this.anInt775 = arg0.method482();
				} else if (local14 == 8) {
					this.anInt776 = arg0.method480();
				} else if (local14 == 9) {
					this.anInt777 = arg0.method480();
				} else if (local14 == 10) {
					this.anInt778 = arg0.method480();
				} else if (local14 == 11) {
					this.anInt779 = arg0.method480();
				} else if (local14 == 12) {
					this.anInt780 = arg0.method485();
				} else {
					System.out.println("Error unrecognised seq config code: " + local14);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("63590, " + 210 + ", " + arg0 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}
}
