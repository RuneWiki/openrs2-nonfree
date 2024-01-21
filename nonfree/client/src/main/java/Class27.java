import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PQTJDTHH")
public final class Class27 {

	@OriginalMember(owner = "client!PQTJDTHH", name = "a", descriptor = "I")
	private static int anInt365;

	@OriginalMember(owner = "client!PQTJDTHH", name = "b", descriptor = "[Lclient!PQTJDTHH;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!PQTJDTHH", name = "c", descriptor = "I")
	public int anInt366;

	@OriginalMember(owner = "client!PQTJDTHH", name = "d", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!PQTJDTHH", name = "e", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!PQTJDTHH", name = "f", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!PQTJDTHH", name = "h", descriptor = "[I")
	public int[] anIntArray98;

	@OriginalMember(owner = "client!PQTJDTHH", name = "q", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!PQTJDTHH", name = "g", descriptor = "I")
	public int anInt367 = -1;

	@OriginalMember(owner = "client!PQTJDTHH", name = "i", descriptor = "Z")
	public boolean aBoolean124 = false;

	@OriginalMember(owner = "client!PQTJDTHH", name = "j", descriptor = "I")
	public int anInt368 = 5;

	@OriginalMember(owner = "client!PQTJDTHH", name = "k", descriptor = "I")
	public int anInt369 = -1;

	@OriginalMember(owner = "client!PQTJDTHH", name = "l", descriptor = "I")
	public int anInt370 = -1;

	@OriginalMember(owner = "client!PQTJDTHH", name = "m", descriptor = "I")
	public int anInt371 = 99;

	@OriginalMember(owner = "client!PQTJDTHH", name = "n", descriptor = "I")
	public int anInt372 = -1;

	@OriginalMember(owner = "client!PQTJDTHH", name = "o", descriptor = "I")
	public int anInt373 = -1;

	@OriginalMember(owner = "client!PQTJDTHH", name = "p", descriptor = "I")
	public int anInt374 = 2;

	@OriginalMember(owner = "client!PQTJDTHH", name = "a", descriptor = "(ZLclient!AKPFVPPG;)V")
	public static void method329(@OriginalArg(1) Class2 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub3 local8 = new Class4_Sub1_Sub3(arg0.method7("seq.dat", null), (byte) 3);
			anInt365 = local8.method104();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt365];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt365; local21++) {
				if (aClass27Array1[local21] == null) {
					aClass27Array1[local21] = new Class27();
				}
				aClass27Array1[local21].method331(local8, 799);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("87720, " + true + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQTJDTHH", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!PQTJDTHH", name = "a", descriptor = "(II)I")
	public int method330(@OriginalArg(1) int arg0) {
		try {
			@Pc(8) int local8 = this.anIntArray97[arg0];
			if (local8 == 0) {
				@Pc(16) Class37 local16 = Class37.method387(this.anIntArray95[arg0]);
				if (local16 != null) {
					local8 = this.anIntArray97[arg0] = local16.anInt532;
				}
			}
			if (local8 == 0) {
				local8 = 1;
			}
			return local8;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("17608, " + -251 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQTJDTHH", name = "a", descriptor = "(Lclient!FTMSICIZ;I)V")
	private void method331(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method102();
					if (local8 == 0) {
						if (this.anInt366 == 0) {
							this.anInt366 = 1;
							this.anIntArray95 = new int[1];
							this.anIntArray95[0] = -1;
							this.anIntArray96 = new int[1];
							this.anIntArray96[0] = -1;
							this.anIntArray97 = new int[1];
							this.anIntArray97[0] = -1;
						}
						if (this.anInt372 == -1) {
							if (this.anIntArray98 == null) {
								this.anInt372 = 0;
							} else {
								this.anInt372 = 2;
							}
						}
						if (this.anInt373 == -1) {
							if (this.anIntArray98 != null) {
								this.anInt373 = 2;
								return;
							}
							this.anInt373 = 0;
							return;
						}
						return;
					}
					@Pc(35) int local35;
					if (local8 == 1) {
						this.anInt366 = arg0.method102();
						this.anIntArray95 = new int[this.anInt366];
						this.anIntArray96 = new int[this.anInt366];
						this.anIntArray97 = new int[this.anInt366];
						for (local35 = 0; local35 < this.anInt366; local35++) {
							this.anIntArray95[local35] = arg0.method104();
							this.anIntArray96[local35] = arg0.method104();
							if (this.anIntArray96[local35] == 65535) {
								this.anIntArray96[local35] = -1;
							}
							this.anIntArray97[local35] = arg0.method104();
						}
					} else if (local8 == 2) {
						this.anInt367 = arg0.method104();
					} else if (local8 == 3) {
						local35 = arg0.method102();
						this.anIntArray98 = new int[local35 + 1];
						for (@Pc(96) int local96 = 0; local96 < local35; local96++) {
							this.anIntArray98[local96] = arg0.method102();
						}
						this.anIntArray98[local35] = 9999999;
					} else if (local8 == 4) {
						this.aBoolean124 = true;
					} else if (local8 == 5) {
						this.anInt368 = arg0.method102();
					} else if (local8 == 6) {
						this.anInt369 = arg0.method104();
					} else if (local8 == 7) {
						this.anInt370 = arg0.method104();
					} else if (local8 == 8) {
						this.anInt371 = arg0.method102();
					} else if (local8 == 9) {
						this.anInt372 = arg0.method102();
					} else if (local8 == 10) {
						this.anInt373 = arg0.method102();
					} else if (local8 == 11) {
						this.anInt374 = arg0.method102();
					} else if (local8 == 12) {
						this.anInt375 = arg0.method107();
					} else {
						System.out.println("Error unrecognised seq config code: " + local8);
					}
				}
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("16825, " + arg0 + ", " + arg1 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}
}
