import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KSVXFIAD")
public final class Class22 {

	@OriginalMember(owner = "client!KSVXFIAD", name = "c", descriptor = "I")
	private static int anInt371;

	@OriginalMember(owner = "client!KSVXFIAD", name = "d", descriptor = "[Lclient!KSVXFIAD;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!KSVXFIAD", name = "e", descriptor = "I")
	public int anInt372;

	@OriginalMember(owner = "client!KSVXFIAD", name = "f", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!KSVXFIAD", name = "g", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!KSVXFIAD", name = "h", descriptor = "[I")
	private int[] anIntArray94;

	@OriginalMember(owner = "client!KSVXFIAD", name = "j", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!KSVXFIAD", name = "s", descriptor = "I")
	private int anInt381;

	@OriginalMember(owner = "client!KSVXFIAD", name = "a", descriptor = "Z")
	private boolean aBoolean88 = true;

	@OriginalMember(owner = "client!KSVXFIAD", name = "b", descriptor = "I")
	private int anInt370 = 1;

	@OriginalMember(owner = "client!KSVXFIAD", name = "i", descriptor = "I")
	public int anInt373 = -1;

	@OriginalMember(owner = "client!KSVXFIAD", name = "k", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!KSVXFIAD", name = "l", descriptor = "I")
	public int anInt374 = 5;

	@OriginalMember(owner = "client!KSVXFIAD", name = "m", descriptor = "I")
	public int anInt375 = -1;

	@OriginalMember(owner = "client!KSVXFIAD", name = "n", descriptor = "I")
	public int anInt376 = -1;

	@OriginalMember(owner = "client!KSVXFIAD", name = "o", descriptor = "I")
	public int anInt377 = 99;

	@OriginalMember(owner = "client!KSVXFIAD", name = "p", descriptor = "I")
	public int anInt378 = -1;

	@OriginalMember(owner = "client!KSVXFIAD", name = "q", descriptor = "I")
	public int anInt379 = -1;

	@OriginalMember(owner = "client!KSVXFIAD", name = "r", descriptor = "I")
	public int anInt380 = 2;

	@OriginalMember(owner = "client!KSVXFIAD", name = "a", descriptor = "(BLclient!JUPFHAZZ;)V")
	public static void method276(@OriginalArg(1) Class21 arg0) {
		try {
			@Pc(20) Class2_Sub1_Sub4 local20 = new Class2_Sub1_Sub4(859, arg0.method275("seq.dat", null));
			anInt371 = local20.method494();
			if (aClass22Array1 == null) {
				aClass22Array1 = new Class22[anInt371];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt371; local30++) {
				if (aClass22Array1[local30] == null) {
					aClass22Array1[local30] = new Class22();
				}
				aClass22Array1[local30].method278(local20);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("10127, " + -3 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KSVXFIAD", name = "<init>", descriptor = "()V")
	private Class22() {
	}

	@OriginalMember(owner = "client!KSVXFIAD", name = "a", descriptor = "(BI)I")
	public int method277(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray94[arg0];
			if (local4 == 0) {
				@Pc(23) Class29 local23 = Class29.method418(this.anIntArray92[arg0]);
				if (local23 != null) {
					local4 = this.anIntArray94[arg0] = local23.anInt511;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("47344, " + -37 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KSVXFIAD", name = "a", descriptor = "(Lclient!TKPFKOXP;B)V")
	private void method278(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method492();
				if (local10 == 0) {
					if (this.anInt372 == 0) {
						this.anInt372 = 1;
						this.anIntArray92 = new int[1];
						this.anIntArray92[0] = -1;
						this.anIntArray93 = new int[1];
						this.anIntArray93[0] = -1;
						this.anIntArray94 = new int[1];
						this.anIntArray94[0] = -1;
					}
					if (this.anInt378 == -1) {
						if (this.anIntArray95 == null) {
							this.anInt378 = 0;
						} else {
							this.anInt378 = 2;
						}
					}
					if (this.anInt379 == -1) {
						if (this.anIntArray95 != null) {
							this.anInt379 = 2;
							return;
						}
						this.anInt379 = 0;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt372 = arg0.method492();
					this.anIntArray92 = new int[this.anInt372];
					this.anIntArray93 = new int[this.anInt372];
					this.anIntArray94 = new int[this.anInt372];
					for (local37 = 0; local37 < this.anInt372; local37++) {
						this.anIntArray92[local37] = arg0.method494();
						this.anIntArray93[local37] = arg0.method494();
						if (this.anIntArray93[local37] == 65535) {
							this.anIntArray93[local37] = -1;
						}
						this.anIntArray94[local37] = arg0.method494();
					}
				} else if (local10 == 2) {
					this.anInt373 = arg0.method494();
				} else if (local10 == 3) {
					local37 = arg0.method492();
					this.anIntArray95 = new int[local37 + 1];
					for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
						this.anIntArray95[local98] = arg0.method492();
					}
					this.anIntArray95[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean89 = true;
				} else if (local10 == 5) {
					this.anInt374 = arg0.method492();
				} else if (local10 == 6) {
					this.anInt375 = arg0.method494();
				} else if (local10 == 7) {
					this.anInt376 = arg0.method494();
				} else if (local10 == 8) {
					this.anInt377 = arg0.method492();
				} else if (local10 == 9) {
					this.anInt378 = arg0.method492();
				} else if (local10 == 10) {
					this.anInt379 = arg0.method492();
				} else if (local10 == 11) {
					this.anInt380 = arg0.method492();
				} else if (local10 == 12) {
					this.anInt381 = arg0.method497();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("95973, " + arg0 + ", " + 4 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
