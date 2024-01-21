import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QBINVEVU")
public final class Class36 {

	@OriginalMember(owner = "client!QBINVEVU", name = "c", descriptor = "I")
	private static int anInt531;

	@OriginalMember(owner = "client!QBINVEVU", name = "d", descriptor = "[Lclient!QBINVEVU;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!QBINVEVU", name = "a", descriptor = "I")
	private static int anInt530 = 503;

	@OriginalMember(owner = "client!QBINVEVU", name = "e", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!QBINVEVU", name = "f", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!QBINVEVU", name = "g", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!QBINVEVU", name = "h", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!QBINVEVU", name = "j", descriptor = "[I")
	public int[] anIntArray134;

	@OriginalMember(owner = "client!QBINVEVU", name = "s", descriptor = "I")
	private int anInt541;

	@OriginalMember(owner = "client!QBINVEVU", name = "b", descriptor = "Z")
	private boolean aBoolean113 = true;

	@OriginalMember(owner = "client!QBINVEVU", name = "i", descriptor = "I")
	public int anInt533 = -1;

	@OriginalMember(owner = "client!QBINVEVU", name = "k", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!QBINVEVU", name = "l", descriptor = "I")
	public int anInt534 = 5;

	@OriginalMember(owner = "client!QBINVEVU", name = "m", descriptor = "I")
	public int anInt535 = -1;

	@OriginalMember(owner = "client!QBINVEVU", name = "n", descriptor = "I")
	public int anInt536 = -1;

	@OriginalMember(owner = "client!QBINVEVU", name = "o", descriptor = "I")
	public int anInt537 = 99;

	@OriginalMember(owner = "client!QBINVEVU", name = "p", descriptor = "I")
	public int anInt538 = -1;

	@OriginalMember(owner = "client!QBINVEVU", name = "q", descriptor = "I")
	public int anInt539 = -1;

	@OriginalMember(owner = "client!QBINVEVU", name = "r", descriptor = "I")
	public int anInt540 = 2;

	@OriginalMember(owner = "client!QBINVEVU", name = "a", descriptor = "(Lclient!NXFIIFAD;I)V")
	public static void method370(@OriginalArg(0) Class31 arg0) {
		try {
			@Pc(8) Class1_Sub2_Sub3 local8 = new Class1_Sub2_Sub3(arg0.method352("seq.dat", null), -670);
			anInt531 = local8.method309();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt531];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt531; local23++) {
				if (aClass36Array1[local23] == null) {
					aClass36Array1[local23] = new Class36();
				}
				aClass36Array1[local23].method372(local8);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("59295, " + arg0 + ", " + 24570 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QBINVEVU", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!QBINVEVU", name = "a", descriptor = "(II)I")
	public int method371(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray133[arg0];
			if (local4 == 0) {
				@Pc(22) Class11 local22 = Class11.method122(this.anIntArray131[arg0]);
				if (local22 != null) {
					local4 = this.anIntArray133[arg0] = local22.anInt226;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("69735, " + 13126 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QBINVEVU", name = "a", descriptor = "(Lclient!MNKDCXXG;I)V")
	private void method372(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method307();
				if (local14 == 0) {
					if (this.anInt532 == 0) {
						this.anInt532 = 1;
						this.anIntArray131 = new int[1];
						this.anIntArray131[0] = -1;
						this.anIntArray132 = new int[1];
						this.anIntArray132[0] = -1;
						this.anIntArray133 = new int[1];
						this.anIntArray133[0] = -1;
					}
					if (this.anInt538 == -1) {
						if (this.anIntArray134 == null) {
							this.anInt538 = 0;
						} else {
							this.anInt538 = 2;
						}
					}
					if (this.anInt539 == -1) {
						if (this.anIntArray134 != null) {
							this.anInt539 = 2;
							return;
						}
						this.anInt539 = 0;
						return;
					}
					return;
				}
				@Pc(41) int local41;
				if (local14 == 1) {
					this.anInt532 = arg0.method307();
					this.anIntArray131 = new int[this.anInt532];
					this.anIntArray132 = new int[this.anInt532];
					this.anIntArray133 = new int[this.anInt532];
					for (local41 = 0; local41 < this.anInt532; local41++) {
						this.anIntArray131[local41] = arg0.method309();
						this.anIntArray132[local41] = arg0.method309();
						if (this.anIntArray132[local41] == 65535) {
							this.anIntArray132[local41] = -1;
						}
						this.anIntArray133[local41] = arg0.method309();
					}
				} else if (local14 == 2) {
					this.anInt533 = arg0.method309();
				} else if (local14 == 3) {
					local41 = arg0.method307();
					this.anIntArray134 = new int[local41 + 1];
					for (@Pc(102) int local102 = 0; local102 < local41; local102++) {
						this.anIntArray134[local102] = arg0.method307();
					}
					this.anIntArray134[local41] = 9999999;
				} else if (local14 == 4) {
					this.aBoolean114 = true;
				} else if (local14 == 5) {
					this.anInt534 = arg0.method307();
				} else if (local14 == 6) {
					this.anInt535 = arg0.method309();
				} else if (local14 == 7) {
					this.anInt536 = arg0.method309();
				} else if (local14 == 8) {
					this.anInt537 = arg0.method307();
				} else if (local14 == 9) {
					this.anInt538 = arg0.method307();
				} else if (local14 == 10) {
					this.anInt539 = arg0.method307();
				} else if (local14 == 11) {
					this.anInt540 = arg0.method307();
				} else if (local14 == 12) {
					this.anInt541 = arg0.method312();
				} else {
					System.out.println("Error unrecognised seq config code: " + local14);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("58442, " + arg0 + ", " + 0 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}
}
