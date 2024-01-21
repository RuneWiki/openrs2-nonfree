import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BKDXLPEF")
public final class Class2 {

	@OriginalMember(owner = "client!BKDXLPEF", name = "a", descriptor = "I")
	private static int anInt39;

	@OriginalMember(owner = "client!BKDXLPEF", name = "b", descriptor = "[Lclient!BKDXLPEF;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!BKDXLPEF", name = "c", descriptor = "I")
	public int anInt40;

	@OriginalMember(owner = "client!BKDXLPEF", name = "d", descriptor = "[I")
	public int[] anIntArray10;

	@OriginalMember(owner = "client!BKDXLPEF", name = "e", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!BKDXLPEF", name = "f", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!BKDXLPEF", name = "h", descriptor = "[I")
	public int[] anIntArray13;

	@OriginalMember(owner = "client!BKDXLPEF", name = "q", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "client!BKDXLPEF", name = "g", descriptor = "I")
	public int anInt41 = -1;

	@OriginalMember(owner = "client!BKDXLPEF", name = "i", descriptor = "Z")
	public boolean aBoolean11 = false;

	@OriginalMember(owner = "client!BKDXLPEF", name = "j", descriptor = "I")
	public int anInt42 = 5;

	@OriginalMember(owner = "client!BKDXLPEF", name = "k", descriptor = "I")
	public int anInt43 = -1;

	@OriginalMember(owner = "client!BKDXLPEF", name = "l", descriptor = "I")
	public int anInt44 = -1;

	@OriginalMember(owner = "client!BKDXLPEF", name = "m", descriptor = "I")
	public int anInt45 = 99;

	@OriginalMember(owner = "client!BKDXLPEF", name = "n", descriptor = "I")
	public int anInt46 = -1;

	@OriginalMember(owner = "client!BKDXLPEF", name = "o", descriptor = "I")
	public int anInt47 = -1;

	@OriginalMember(owner = "client!BKDXLPEF", name = "p", descriptor = "I")
	public int anInt48 = 2;

	@OriginalMember(owner = "client!BKDXLPEF", name = "a", descriptor = "(BLclient!XOJZVVDK;)V")
	public static void method11(@OriginalArg(1) Class43 arg0) {
		try {
			@Pc(8) Class6_Sub1_Sub4 local8 = new Class6_Sub1_Sub4(888, arg0.method518("seq.dat", (byte[]) null));
			anInt39 = local8.method241();
			if (aClass2Array1 == null) {
				aClass2Array1 = new Class2[anInt39];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt39; local18++) {
				if (aClass2Array1[local18] == null) {
					aClass2Array1[local18] = new Class2();
				}
				aClass2Array1[local18].method13(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("20908, " + -82 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKDXLPEF", name = "<init>", descriptor = "()V")
	private Class2() {
	}

	@OriginalMember(owner = "client!BKDXLPEF", name = "a", descriptor = "(II)I")
	public int method12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = this.anIntArray12[arg0];
			@Pc(8) boolean local8 = false;
			if (local4 == 0) {
				@Pc(16) Class27 local16 = Class27.method184(this.anIntArray10[arg0]);
				if (local16 != null) {
					local4 = this.anIntArray12[arg0] = local16.anInt345;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("99184, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKDXLPEF", name = "a", descriptor = "(Lclient!PQBRPYKE;Z)V")
	private void method13(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method239();
				if (local10 == 0) {
					if (this.anInt40 == 0) {
						this.anInt40 = 1;
						this.anIntArray10 = new int[1];
						this.anIntArray10[0] = -1;
						this.anIntArray11 = new int[1];
						this.anIntArray11[0] = -1;
						this.anIntArray12 = new int[1];
						this.anIntArray12[0] = -1;
					}
					if (this.anInt46 == -1) {
						if (this.anIntArray13 == null) {
							this.anInt46 = 0;
						} else {
							this.anInt46 = 2;
						}
					}
					if (this.anInt47 == -1) {
						if (this.anIntArray13 != null) {
							this.anInt47 = 2;
							return;
						}
						this.anInt47 = 0;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt40 = arg0.method239();
					this.anIntArray10 = new int[this.anInt40];
					this.anIntArray11 = new int[this.anInt40];
					this.anIntArray12 = new int[this.anInt40];
					for (local37 = 0; local37 < this.anInt40; local37++) {
						this.anIntArray10[local37] = arg0.method241();
						this.anIntArray11[local37] = arg0.method241();
						if (this.anIntArray11[local37] == 65535) {
							this.anIntArray11[local37] = -1;
						}
						this.anIntArray12[local37] = arg0.method241();
					}
				} else if (local10 == 2) {
					this.anInt41 = arg0.method241();
				} else if (local10 == 3) {
					local37 = arg0.method239();
					this.anIntArray13 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray13[local98] = arg0.method239();
					}
					this.anIntArray13[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean11 = true;
				} else if (local10 == 5) {
					this.anInt42 = arg0.method239();
				} else if (local10 == 6) {
					this.anInt43 = arg0.method241();
				} else if (local10 == 7) {
					this.anInt44 = arg0.method241();
				} else if (local10 == 8) {
					this.anInt45 = arg0.method239();
				} else if (local10 == 9) {
					this.anInt46 = arg0.method239();
				} else if (local10 == 10) {
					this.anInt47 = arg0.method239();
				} else if (local10 == 11) {
					this.anInt48 = arg0.method239();
				} else if (local10 == 12) {
					this.anInt49 = arg0.method244();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("4208, " + arg0 + ", " + false + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
