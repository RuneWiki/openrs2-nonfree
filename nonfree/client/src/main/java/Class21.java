import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KAIFCIAJ")
public final class Class21 {

	@OriginalMember(owner = "client!KAIFCIAJ", name = "c", descriptor = "I")
	private static int anInt342;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "d", descriptor = "[Lclient!KAIFCIAJ;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "b", descriptor = "I")
	private static int anInt341 = 48306;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "e", descriptor = "I")
	public int anInt343;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "f", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "g", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "h", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "j", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "s", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "a", descriptor = "Z")
	private boolean aBoolean83 = true;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "i", descriptor = "I")
	public int anInt344 = -1;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "k", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "l", descriptor = "I")
	public int anInt345 = 5;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "m", descriptor = "I")
	public int anInt346 = -1;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "n", descriptor = "I")
	public int anInt347 = -1;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "o", descriptor = "I")
	public int anInt348 = 99;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "p", descriptor = "I")
	public int anInt349 = -1;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "q", descriptor = "I")
	public int anInt350 = -1;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "r", descriptor = "I")
	public int anInt351 = 2;

	@OriginalMember(owner = "client!KAIFCIAJ", name = "a", descriptor = "(BLclient!ESUFCMYV;)V")
	public static void method158(@OriginalArg(1) Class11 arg0) {
		try {
			@Pc(8) Class6_Sub1_Sub4 local8 = new Class6_Sub1_Sub4(arg0.method89("seq.dat", null), (byte) -17);
			anInt342 = local8.method413();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt342];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt342; local23++) {
				if (aClass21Array1[local23] == null) {
					aClass21Array1[local23] = new Class21();
				}
				aClass21Array1[local23].method160(local8);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("6500, " + 6 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KAIFCIAJ", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!KAIFCIAJ", name = "a", descriptor = "(BI)I")
	public int method159(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray66[arg0];
			if (local4 == 0) {
				@Pc(16) Class34 local16 = Class34.method377(this.anIntArray64[arg0]);
				if (local16 != null) {
					local4 = this.anIntArray66[arg0] = local16.anInt636;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("17506, " + 0 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KAIFCIAJ", name = "a", descriptor = "(ILclient!RGCGKKUR;)V")
	private void method160(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method411();
				if (local15 == 0) {
					if (this.anInt343 == 0) {
						this.anInt343 = 1;
						this.anIntArray64 = new int[1];
						this.anIntArray64[0] = -1;
						this.anIntArray65 = new int[1];
						this.anIntArray65[0] = -1;
						this.anIntArray66 = new int[1];
						this.anIntArray66[0] = -1;
					}
					if (this.anInt349 == -1) {
						if (this.anIntArray67 == null) {
							this.anInt349 = 0;
						} else {
							this.anInt349 = 2;
						}
					}
					if (this.anInt350 == -1) {
						if (this.anIntArray67 != null) {
							this.anInt350 = 2;
							return;
						}
						this.anInt350 = 0;
						return;
					}
					return;
				}
				@Pc(42) int local42;
				if (local15 == 1) {
					this.anInt343 = arg0.method411();
					this.anIntArray64 = new int[this.anInt343];
					this.anIntArray65 = new int[this.anInt343];
					this.anIntArray66 = new int[this.anInt343];
					for (local42 = 0; local42 < this.anInt343; local42++) {
						this.anIntArray64[local42] = arg0.method413();
						this.anIntArray65[local42] = arg0.method413();
						if (this.anIntArray65[local42] == 65535) {
							this.anIntArray65[local42] = -1;
						}
						this.anIntArray66[local42] = arg0.method413();
					}
				} else if (local15 == 2) {
					this.anInt344 = arg0.method413();
				} else if (local15 == 3) {
					local42 = arg0.method411();
					this.anIntArray67 = new int[local42 + 1];
					for (@Pc(103) int local103 = 0; local103 < local42; local103++) {
						this.anIntArray67[local103] = arg0.method411();
					}
					this.anIntArray67[local42] = 9999999;
				} else if (local15 == 4) {
					this.aBoolean84 = true;
				} else if (local15 == 5) {
					this.anInt345 = arg0.method411();
				} else if (local15 == 6) {
					this.anInt346 = arg0.method413();
				} else if (local15 == 7) {
					this.anInt347 = arg0.method413();
				} else if (local15 == 8) {
					this.anInt348 = arg0.method411();
				} else if (local15 == 9) {
					this.anInt349 = arg0.method411();
				} else if (local15 == 10) {
					this.anInt350 = arg0.method411();
				} else if (local15 == 11) {
					this.anInt351 = arg0.method411();
				} else if (local15 == 12) {
					this.anInt352 = arg0.method416();
				} else {
					System.out.println("Error unrecognised seq config code: " + local15);
				}
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("6989, " + 5 + ", " + arg0 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}
}
