import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SPUHKLMC")
public final class Class33 {

	@OriginalMember(owner = "client!SPUHKLMC", name = "c", descriptor = "I")
	private static int anInt647;

	@OriginalMember(owner = "client!SPUHKLMC", name = "d", descriptor = "[Lclient!SPUHKLMC;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!SPUHKLMC", name = "a", descriptor = "I")
	private static int anInt646 = 4;

	@OriginalMember(owner = "client!SPUHKLMC", name = "e", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!SPUHKLMC", name = "f", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!SPUHKLMC", name = "g", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!SPUHKLMC", name = "h", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!SPUHKLMC", name = "j", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!SPUHKLMC", name = "s", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!SPUHKLMC", name = "b", descriptor = "Z")
	private boolean aBoolean158 = true;

	@OriginalMember(owner = "client!SPUHKLMC", name = "i", descriptor = "I")
	public int anInt649 = -1;

	@OriginalMember(owner = "client!SPUHKLMC", name = "k", descriptor = "Z")
	public boolean aBoolean159 = false;

	@OriginalMember(owner = "client!SPUHKLMC", name = "l", descriptor = "I")
	public int anInt650 = 5;

	@OriginalMember(owner = "client!SPUHKLMC", name = "m", descriptor = "I")
	public int anInt651 = -1;

	@OriginalMember(owner = "client!SPUHKLMC", name = "n", descriptor = "I")
	public int anInt652 = -1;

	@OriginalMember(owner = "client!SPUHKLMC", name = "o", descriptor = "I")
	public int anInt653 = 99;

	@OriginalMember(owner = "client!SPUHKLMC", name = "p", descriptor = "I")
	public int anInt654 = -1;

	@OriginalMember(owner = "client!SPUHKLMC", name = "q", descriptor = "I")
	public int anInt655 = -1;

	@OriginalMember(owner = "client!SPUHKLMC", name = "r", descriptor = "I")
	public int anInt656 = 2;

	@OriginalMember(owner = "client!SPUHKLMC", name = "a", descriptor = "(ZLclient!VSQMPWOM;)V")
	public static void method460(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(12) Class2_Sub1_Sub2 local12 = new Class2_Sub1_Sub2(arg0.method489("seq.dat", null), -990);
			anInt647 = local12.method81();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt647];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt647; local22++) {
				if (aClass33Array1[local22] == null) {
					aClass33Array1[local22] = new Class33();
				}
				aClass33Array1[local22].method462(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("42194, " + true + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SPUHKLMC", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!SPUHKLMC", name = "a", descriptor = "(II)I")
	public int method461(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray117[arg0];
			if (local4 == 0) {
				@Pc(21) Class4 local21 = Class4.method167(this.anIntArray115[arg0]);
				if (local21 != null) {
					local4 = this.anIntArray117[arg0] = local21.anInt168;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("11671, " + arg0 + ", " + 196 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SPUHKLMC", name = "a", descriptor = "(BLclient!BFQIDHPO;)V")
	private void method462(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method79();
				if (local15 == 0) {
					if (this.anInt648 == 0) {
						this.anInt648 = 1;
						this.anIntArray115 = new int[1];
						this.anIntArray115[0] = -1;
						this.anIntArray116 = new int[1];
						this.anIntArray116[0] = -1;
						this.anIntArray117 = new int[1];
						this.anIntArray117[0] = -1;
					}
					if (this.anInt654 == -1) {
						if (this.anIntArray118 == null) {
							this.anInt654 = 0;
						} else {
							this.anInt654 = 2;
						}
					}
					if (this.anInt655 == -1) {
						if (this.anIntArray118 != null) {
							this.anInt655 = 2;
							return;
						}
						this.anInt655 = 0;
						return;
					}
					return;
				}
				@Pc(42) int local42;
				if (local15 == 1) {
					this.anInt648 = arg0.method79();
					this.anIntArray115 = new int[this.anInt648];
					this.anIntArray116 = new int[this.anInt648];
					this.anIntArray117 = new int[this.anInt648];
					for (local42 = 0; local42 < this.anInt648; local42++) {
						this.anIntArray115[local42] = arg0.method81();
						this.anIntArray116[local42] = arg0.method81();
						if (this.anIntArray116[local42] == 65535) {
							this.anIntArray116[local42] = -1;
						}
						this.anIntArray117[local42] = arg0.method81();
					}
				} else if (local15 == 2) {
					this.anInt649 = arg0.method81();
				} else if (local15 == 3) {
					local42 = arg0.method79();
					this.anIntArray118 = new int[local42 + 1];
					for (@Pc(103) int local103 = 0; local103 < local42; local103++) {
						this.anIntArray118[local103] = arg0.method79();
					}
					this.anIntArray118[local42] = 9999999;
				} else if (local15 == 4) {
					this.aBoolean159 = true;
				} else if (local15 == 5) {
					this.anInt650 = arg0.method79();
				} else if (local15 == 6) {
					this.anInt651 = arg0.method81();
				} else if (local15 == 7) {
					this.anInt652 = arg0.method81();
				} else if (local15 == 8) {
					this.anInt653 = arg0.method79();
				} else if (local15 == 9) {
					this.anInt654 = arg0.method79();
				} else if (local15 == 10) {
					this.anInt655 = arg0.method79();
				} else if (local15 == 11) {
					this.anInt656 = arg0.method79();
				} else if (local15 == 12) {
					this.anInt657 = arg0.method84();
				} else {
					System.out.println("Error unrecognised seq config code: " + local15);
				}
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("1789, " + -11 + ", " + arg0 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}
}
