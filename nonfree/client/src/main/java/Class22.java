import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LKGEGIEW")
public final class Class22 {

	@OriginalMember(owner = "client!LKGEGIEW", name = "c", descriptor = "I")
	private static int anInt432;

	@OriginalMember(owner = "client!LKGEGIEW", name = "d", descriptor = "[Lclient!LKGEGIEW;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!LKGEGIEW", name = "e", descriptor = "I")
	public int anInt433;

	@OriginalMember(owner = "client!LKGEGIEW", name = "f", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!LKGEGIEW", name = "g", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!LKGEGIEW", name = "h", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!LKGEGIEW", name = "j", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!LKGEGIEW", name = "s", descriptor = "I")
	private int anInt442;

	@OriginalMember(owner = "client!LKGEGIEW", name = "a", descriptor = "I")
	private int anInt431 = 9;

	@OriginalMember(owner = "client!LKGEGIEW", name = "b", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!LKGEGIEW", name = "i", descriptor = "I")
	public int anInt434 = -1;

	@OriginalMember(owner = "client!LKGEGIEW", name = "k", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!LKGEGIEW", name = "l", descriptor = "I")
	public int anInt435 = 5;

	@OriginalMember(owner = "client!LKGEGIEW", name = "m", descriptor = "I")
	public int anInt436 = -1;

	@OriginalMember(owner = "client!LKGEGIEW", name = "n", descriptor = "I")
	public int anInt437 = -1;

	@OriginalMember(owner = "client!LKGEGIEW", name = "o", descriptor = "I")
	public int anInt438 = 99;

	@OriginalMember(owner = "client!LKGEGIEW", name = "p", descriptor = "I")
	public int anInt439 = -1;

	@OriginalMember(owner = "client!LKGEGIEW", name = "q", descriptor = "I")
	public int anInt440 = -1;

	@OriginalMember(owner = "client!LKGEGIEW", name = "r", descriptor = "I")
	public int anInt441 = 2;

	@OriginalMember(owner = "client!LKGEGIEW", name = "a", descriptor = "(ILclient!XTGLDHGX;)V")
	public static void method251(@OriginalArg(1) Class44 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method484("seq.dat", null), 891);
			anInt432 = local10.method270();
			if (aClass22Array1 == null) {
				aClass22Array1 = new Class22[anInt432];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt432; local20++) {
				if (aClass22Array1[local20] == null) {
					aClass22Array1[local20] = new Class22();
				}
				aClass22Array1[local20].method253(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("95447, " + 0 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKGEGIEW", name = "<init>", descriptor = "()V")
	private Class22() {
	}

	@OriginalMember(owner = "client!LKGEGIEW", name = "a", descriptor = "(IB)I")
	public int method252(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray78[arg0];
			if (local4 == 0) {
				@Pc(24) Class37 local24 = Class37.method455(this.anInt431, this.anIntArray76[arg0]);
				if (local24 != null) {
					local4 = this.anIntArray78[arg0] = local24.anInt654;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("1006, " + arg0 + ", " + -39 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LKGEGIEW", name = "a", descriptor = "(ZLclient!MBMGIXGO;)V")
	private void method253(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method268();
				if (local14 == 0) {
					if (this.anInt433 == 0) {
						this.anInt433 = 1;
						this.anIntArray76 = new int[1];
						this.anIntArray76[0] = -1;
						this.anIntArray77 = new int[1];
						this.anIntArray77[0] = -1;
						this.anIntArray78 = new int[1];
						this.anIntArray78[0] = -1;
					}
					if (this.anInt439 == -1) {
						if (this.anIntArray79 == null) {
							this.anInt439 = 0;
						} else {
							this.anInt439 = 2;
						}
					}
					if (this.anInt440 == -1) {
						if (this.anIntArray79 != null) {
							this.anInt440 = 2;
							return;
						}
						this.anInt440 = 0;
						return;
					}
					return;
				}
				@Pc(41) int local41;
				if (local14 == 1) {
					this.anInt433 = arg0.method268();
					this.anIntArray76 = new int[this.anInt433];
					this.anIntArray77 = new int[this.anInt433];
					this.anIntArray78 = new int[this.anInt433];
					for (local41 = 0; local41 < this.anInt433; local41++) {
						this.anIntArray76[local41] = arg0.method270();
						this.anIntArray77[local41] = arg0.method270();
						if (this.anIntArray77[local41] == 65535) {
							this.anIntArray77[local41] = -1;
						}
						this.anIntArray78[local41] = arg0.method270();
					}
				} else if (local14 == 2) {
					this.anInt434 = arg0.method270();
				} else if (local14 == 3) {
					local41 = arg0.method268();
					this.anIntArray79 = new int[local41 + 1];
					for (@Pc(102) int local102 = 0; local102 < local41; local102++) {
						this.anIntArray79[local102] = arg0.method268();
					}
					this.anIntArray79[local41] = 9999999;
				} else if (local14 == 4) {
					this.aBoolean104 = true;
				} else if (local14 == 5) {
					this.anInt435 = arg0.method268();
				} else if (local14 == 6) {
					this.anInt436 = arg0.method270();
				} else if (local14 == 7) {
					this.anInt437 = arg0.method270();
				} else if (local14 == 8) {
					this.anInt438 = arg0.method268();
				} else if (local14 == 9) {
					this.anInt439 = arg0.method268();
				} else if (local14 == 10) {
					this.anInt440 = arg0.method268();
				} else if (local14 == 11) {
					this.anInt441 = arg0.method268();
				} else if (local14 == 12) {
					this.anInt442 = arg0.method273();
				} else {
					System.out.println("Error unrecognised seq config code: " + local14);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("49098, " + true + ", " + arg0 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}
}
