import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XETSOHUA")
public final class Class46 {

	@OriginalMember(owner = "client!XETSOHUA", name = "b", descriptor = "I")
	private static int anInt779;

	@OriginalMember(owner = "client!XETSOHUA", name = "c", descriptor = "[Lclient!XETSOHUA;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!XETSOHUA", name = "a", descriptor = "I")
	private int anInt778;

	@OriginalMember(owner = "client!XETSOHUA", name = "d", descriptor = "I")
	public int anInt780;

	@OriginalMember(owner = "client!XETSOHUA", name = "e", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!XETSOHUA", name = "f", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!XETSOHUA", name = "g", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!XETSOHUA", name = "i", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!XETSOHUA", name = "r", descriptor = "I")
	private int anInt789;

	@OriginalMember(owner = "client!XETSOHUA", name = "h", descriptor = "I")
	public int anInt781 = -1;

	@OriginalMember(owner = "client!XETSOHUA", name = "j", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!XETSOHUA", name = "k", descriptor = "I")
	public int anInt782 = 5;

	@OriginalMember(owner = "client!XETSOHUA", name = "l", descriptor = "I")
	public int anInt783 = -1;

	@OriginalMember(owner = "client!XETSOHUA", name = "m", descriptor = "I")
	public int anInt784 = -1;

	@OriginalMember(owner = "client!XETSOHUA", name = "n", descriptor = "I")
	public int anInt785 = 99;

	@OriginalMember(owner = "client!XETSOHUA", name = "o", descriptor = "I")
	public int anInt786 = -1;

	@OriginalMember(owner = "client!XETSOHUA", name = "p", descriptor = "I")
	public int anInt787 = -1;

	@OriginalMember(owner = "client!XETSOHUA", name = "q", descriptor = "I")
	public int anInt788 = 2;

	@OriginalMember(owner = "client!XETSOHUA", name = "a", descriptor = "(Lclient!LKPVZAQN;I)V")
	public static void method519(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class3_Sub3_Sub4 local8 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("seq.dat", null));
			@Pc(12) boolean local12 = false;
			anInt779 = local8.method470();
			if (aClass46Array1 == null) {
				aClass46Array1 = new Class46[anInt779];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt779; local22++) {
				if (aClass46Array1[local22] == null) {
					aClass46Array1[local22] = new Class46();
				}
				aClass46Array1[local22].method521(local8, 767);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("56470, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XETSOHUA", name = "<init>", descriptor = "()V")
	private Class46() {
	}

	@OriginalMember(owner = "client!XETSOHUA", name = "a", descriptor = "(II)I")
	public int method520(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray200[arg0];
			if (local4 == 0) {
				@Pc(17) Class12 local17 = Class12.method115(this.anIntArray198[arg0]);
				if (local17 != null) {
					local4 = this.anIntArray200[arg0] = local17.anInt217;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("76039, " + 0 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XETSOHUA", name = "a", descriptor = "(Lclient!WBEWPIXO;I)V")
	private void method521(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method468();
					if (local8 == 0) {
						if (this.anInt780 == 0) {
							this.anInt780 = 1;
							this.anIntArray198 = new int[1];
							this.anIntArray198[0] = -1;
							this.anIntArray199 = new int[1];
							this.anIntArray199[0] = -1;
							this.anIntArray200 = new int[1];
							this.anIntArray200[0] = -1;
						}
						if (this.anInt786 == -1) {
							if (this.anIntArray201 == null) {
								this.anInt786 = 0;
							} else {
								this.anInt786 = 2;
							}
						}
						if (this.anInt787 == -1) {
							if (this.anIntArray201 != null) {
								this.anInt787 = 2;
								return;
							}
							this.anInt787 = 0;
							return;
						}
						return;
					}
					@Pc(35) int local35;
					if (local8 == 1) {
						this.anInt780 = arg0.method468();
						this.anIntArray198 = new int[this.anInt780];
						this.anIntArray199 = new int[this.anInt780];
						this.anIntArray200 = new int[this.anInt780];
						for (local35 = 0; local35 < this.anInt780; local35++) {
							this.anIntArray198[local35] = arg0.method470();
							this.anIntArray199[local35] = arg0.method470();
							if (this.anIntArray199[local35] == 65535) {
								this.anIntArray199[local35] = -1;
							}
							this.anIntArray200[local35] = arg0.method470();
						}
					} else if (local8 == 2) {
						this.anInt781 = arg0.method470();
					} else if (local8 == 3) {
						local35 = arg0.method468();
						this.anIntArray201 = new int[local35 + 1];
						for (@Pc(96) int local96 = 0; local96 < local35; local96++) {
							this.anIntArray201[local96] = arg0.method468();
						}
						this.anIntArray201[local35] = 9999999;
					} else if (local8 == 4) {
						this.aBoolean177 = true;
					} else if (local8 == 5) {
						this.anInt782 = arg0.method468();
					} else if (local8 == 6) {
						this.anInt783 = arg0.method470();
					} else if (local8 == 7) {
						this.anInt784 = arg0.method470();
					} else if (local8 == 8) {
						this.anInt785 = arg0.method468();
					} else if (local8 == 9) {
						this.anInt786 = arg0.method468();
					} else if (local8 == 10) {
						this.anInt787 = arg0.method468();
					} else if (local8 == 11) {
						this.anInt788 = arg0.method468();
					} else if (local8 == 12) {
						this.anInt789 = arg0.method473();
					} else {
						System.out.println("Error unrecognised seq config code: " + local8);
					}
				}
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("19665, " + arg0 + ", " + arg1 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}
}
