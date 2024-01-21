import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nc")
public final class Class27 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	private static int anInt807;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lclient!nc;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public int anInt816;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	private int anInt806 = -325;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Z")
	private boolean aBoolean200 = true;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public int anInt809 = -1;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public int anInt810 = 5;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt811 = -1;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public int anInt812 = -1;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public int anInt813 = 99;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	public int anInt814 = -1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public int anInt815 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method505(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			if (arg0 == 35102) {
				@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(false, arg1.method666("seq.dat", null));
				anInt807 = local12.method482();
				if (aClass27Array1 == null) {
					aClass27Array1 = new Class27[anInt807];
				}
				for (@Pc(22) int local22 = 0; local22 < anInt807; local22++) {
					if (aClass27Array1[local22] == null) {
						aClass27Array1[local22] = new Class27();
					}
					aClass27Array1[local22].method507(local12);
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("72350, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public int method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = this.anIntArray227[arg0];
			if (arg1 <= 0) {
				this.anInt806 = 465;
			}
			if (local4 == 0) {
				@Pc(18) Class12 local18 = Class12.method305(this.anIntArray225[arg0]);
				if (local18 != null) {
					local4 = this.anIntArray227[arg0] = local18.anInt547;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("50516, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private void method507(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method480();
				if (local14 == 0) {
					if (this.anInt808 == 0) {
						this.anInt808 = 1;
						this.anIntArray225 = new int[1];
						this.anIntArray225[0] = -1;
						this.anIntArray226 = new int[1];
						this.anIntArray226[0] = -1;
						this.anIntArray227 = new int[1];
						this.anIntArray227[0] = -1;
					}
					if (this.anInt814 == -1) {
						if (this.anIntArray228 == null) {
							this.anInt814 = 0;
						} else {
							this.anInt814 = 2;
						}
					}
					if (this.anInt815 == -1) {
						if (this.anIntArray228 != null) {
							this.anInt815 = 2;
							return;
						}
						this.anInt815 = 0;
						return;
					}
					return;
				}
				@Pc(41) int local41;
				if (local14 == 1) {
					this.anInt808 = arg0.method480();
					this.anIntArray225 = new int[this.anInt808];
					this.anIntArray226 = new int[this.anInt808];
					this.anIntArray227 = new int[this.anInt808];
					for (local41 = 0; local41 < this.anInt808; local41++) {
						this.anIntArray225[local41] = arg0.method482();
						this.anIntArray226[local41] = arg0.method482();
						if (this.anIntArray226[local41] == 65535) {
							this.anIntArray226[local41] = -1;
						}
						this.anIntArray227[local41] = arg0.method482();
					}
				} else if (local14 == 2) {
					this.anInt809 = arg0.method482();
				} else if (local14 == 3) {
					local41 = arg0.method480();
					this.anIntArray228 = new int[local41 + 1];
					for (@Pc(102) int local102 = 0; local102 < local41; local102++) {
						this.anIntArray228[local102] = arg0.method480();
					}
					this.anIntArray228[local41] = 9999999;
				} else if (local14 == 4) {
					this.aBoolean201 = true;
				} else if (local14 == 5) {
					this.anInt810 = arg0.method480();
				} else if (local14 == 6) {
					this.anInt811 = arg0.method482();
				} else if (local14 == 7) {
					this.anInt812 = arg0.method482();
				} else if (local14 == 8) {
					this.anInt813 = arg0.method480();
				} else if (local14 == 9) {
					this.anInt814 = arg0.method480();
				} else if (local14 == 10) {
					this.anInt815 = arg0.method480();
				} else if (local14 == 11) {
					this.anInt816 = arg0.method480();
				} else if (local14 == 12) {
					this.anInt817 = arg0.method485();
				} else {
					System.out.println("Error unrecognised seq config code: " + local14);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("61505, " + arg0 + ", " + false + ", " + local276.toString());
			throw new RuntimeException();
		}
	}
}
