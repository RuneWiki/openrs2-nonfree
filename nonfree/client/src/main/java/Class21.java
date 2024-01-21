import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KYGPROVJ")
public final class Class21 {

	@OriginalMember(owner = "client!KYGPROVJ", name = "b", descriptor = "I")
	private static int anInt343;

	@OriginalMember(owner = "client!KYGPROVJ", name = "c", descriptor = "[Lclient!KYGPROVJ;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!KYGPROVJ", name = "a", descriptor = "I")
	private static int anInt342 = -962;

	@OriginalMember(owner = "client!KYGPROVJ", name = "d", descriptor = "I")
	public int anInt344;

	@OriginalMember(owner = "client!KYGPROVJ", name = "e", descriptor = "[I")
	public int[] anIntArray108;

	@OriginalMember(owner = "client!KYGPROVJ", name = "f", descriptor = "[I")
	public int[] anIntArray109;

	@OriginalMember(owner = "client!KYGPROVJ", name = "g", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!KYGPROVJ", name = "i", descriptor = "[I")
	public int[] anIntArray111;

	@OriginalMember(owner = "client!KYGPROVJ", name = "r", descriptor = "I")
	private int anInt353;

	@OriginalMember(owner = "client!KYGPROVJ", name = "h", descriptor = "I")
	public int anInt345 = -1;

	@OriginalMember(owner = "client!KYGPROVJ", name = "j", descriptor = "Z")
	public boolean aBoolean101 = false;

	@OriginalMember(owner = "client!KYGPROVJ", name = "k", descriptor = "I")
	public int anInt346 = 5;

	@OriginalMember(owner = "client!KYGPROVJ", name = "l", descriptor = "I")
	public int anInt347 = -1;

	@OriginalMember(owner = "client!KYGPROVJ", name = "m", descriptor = "I")
	public int anInt348 = -1;

	@OriginalMember(owner = "client!KYGPROVJ", name = "n", descriptor = "I")
	public int anInt349 = 99;

	@OriginalMember(owner = "client!KYGPROVJ", name = "o", descriptor = "I")
	public int anInt350 = -1;

	@OriginalMember(owner = "client!KYGPROVJ", name = "p", descriptor = "I")
	public int anInt351 = -1;

	@OriginalMember(owner = "client!KYGPROVJ", name = "q", descriptor = "I")
	public int anInt352 = 2;

	@OriginalMember(owner = "client!KYGPROVJ", name = "a", descriptor = "(Lclient!RSPRYUFS;I)V")
	public static void method175(@OriginalArg(0) Class37 arg0) {
		try {
			@Pc(16) Class6_Sub2_Sub3 local16 = new Class6_Sub2_Sub3(-587, arg0.method358("seq.dat", null));
			anInt343 = local16.method264();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt343];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt343; local26++) {
				if (aClass21Array1[local26] == null) {
					aClass21Array1[local26] = new Class21();
				}
				aClass21Array1[local26].method177((byte) 6, local16);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("15895, " + arg0 + ", " + -332 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KYGPROVJ", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!KYGPROVJ", name = "a", descriptor = "(II)I")
	public int method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(8) int local8 = this.anIntArray110[arg0];
			if (local8 == 0) {
				@Pc(16) Class48 local16 = Class48.method535(this.anIntArray108[arg0]);
				if (local16 != null) {
					local8 = this.anIntArray110[arg0] = local16.anInt794;
				}
			}
			if (local8 == 0) {
				local8 = 1;
			}
			return local8;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("83374, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KYGPROVJ", name = "a", descriptor = "(BLclient!NQUAUMDT;)V")
	private void method177(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(15) int local15 = arg1.method262();
					if (local15 == 0) {
						if (this.anInt344 == 0) {
							this.anInt344 = 1;
							this.anIntArray108 = new int[1];
							this.anIntArray108[0] = -1;
							this.anIntArray109 = new int[1];
							this.anIntArray109[0] = -1;
							this.anIntArray110 = new int[1];
							this.anIntArray110[0] = -1;
						}
						if (this.anInt350 == -1) {
							if (this.anIntArray111 == null) {
								this.anInt350 = 0;
							} else {
								this.anInt350 = 2;
							}
						}
						if (this.anInt351 == -1) {
							if (this.anIntArray111 != null) {
								this.anInt351 = 2;
								return;
							}
							this.anInt351 = 0;
							return;
						}
						return;
					}
					@Pc(42) int local42;
					if (local15 == 1) {
						this.anInt344 = arg1.method262();
						this.anIntArray108 = new int[this.anInt344];
						this.anIntArray109 = new int[this.anInt344];
						this.anIntArray110 = new int[this.anInt344];
						for (local42 = 0; local42 < this.anInt344; local42++) {
							this.anIntArray108[local42] = arg1.method264();
							this.anIntArray109[local42] = arg1.method264();
							if (this.anIntArray109[local42] == 65535) {
								this.anIntArray109[local42] = -1;
							}
							this.anIntArray110[local42] = arg1.method264();
						}
					} else if (local15 == 2) {
						this.anInt345 = arg1.method264();
					} else if (local15 == 3) {
						local42 = arg1.method262();
						this.anIntArray111 = new int[local42 + 1];
						for (@Pc(103) int local103 = 0; local103 < local42; local103++) {
							this.anIntArray111[local103] = arg1.method262();
						}
						this.anIntArray111[local42] = 9999999;
					} else if (local15 == 4) {
						this.aBoolean101 = true;
					} else if (local15 == 5) {
						this.anInt346 = arg1.method262();
					} else if (local15 == 6) {
						this.anInt347 = arg1.method264();
					} else if (local15 == 7) {
						this.anInt348 = arg1.method264();
					} else if (local15 == 8) {
						this.anInt349 = arg1.method262();
					} else if (local15 == 9) {
						this.anInt350 = arg1.method262();
					} else if (local15 == 10) {
						this.anInt351 = arg1.method262();
					} else if (local15 == 11) {
						this.anInt352 = arg1.method262();
					} else if (local15 == 12) {
						this.anInt353 = arg1.method267();
					} else {
						System.out.println("Error unrecognised seq config code: " + local15);
					}
				}
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("66373, " + arg0 + ", " + arg1 + ", " + local277.toString());
			throw new RuntimeException();
		}
	}
}
