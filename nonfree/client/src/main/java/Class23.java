import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LCRVYGCP")
public final class Class23 {

	@OriginalMember(owner = "client!LCRVYGCP", name = "b", descriptor = "I")
	private static int anInt386;

	@OriginalMember(owner = "client!LCRVYGCP", name = "c", descriptor = "[Lclient!LCRVYGCP;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!LCRVYGCP", name = "a", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!LCRVYGCP", name = "d", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!LCRVYGCP", name = "e", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!LCRVYGCP", name = "f", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!LCRVYGCP", name = "g", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!LCRVYGCP", name = "i", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!LCRVYGCP", name = "r", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!LCRVYGCP", name = "h", descriptor = "I")
	public int anInt388 = -1;

	@OriginalMember(owner = "client!LCRVYGCP", name = "j", descriptor = "Z")
	public boolean aBoolean91 = false;

	@OriginalMember(owner = "client!LCRVYGCP", name = "k", descriptor = "I")
	public int anInt389 = 5;

	@OriginalMember(owner = "client!LCRVYGCP", name = "l", descriptor = "I")
	public int anInt390 = -1;

	@OriginalMember(owner = "client!LCRVYGCP", name = "m", descriptor = "I")
	public int anInt391 = -1;

	@OriginalMember(owner = "client!LCRVYGCP", name = "n", descriptor = "I")
	public int anInt392 = 99;

	@OriginalMember(owner = "client!LCRVYGCP", name = "o", descriptor = "I")
	public int anInt393 = -1;

	@OriginalMember(owner = "client!LCRVYGCP", name = "p", descriptor = "I")
	public int anInt394 = -1;

	@OriginalMember(owner = "client!LCRVYGCP", name = "q", descriptor = "I")
	public int anInt395 = 2;

	@OriginalMember(owner = "client!LCRVYGCP", name = "a", descriptor = "(ILclient!HRXSNEYZ;)V")
	public static void method292(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(arg1.method220("seq.dat", null), 8);
			anInt386 = local12.method240();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt386];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt386; local22++) {
				if (aClass23Array1[local22] == null) {
					aClass23Array1[local22] = new Class23();
				}
				aClass23Array1[local22].method294(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("58122, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LCRVYGCP", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!LCRVYGCP", name = "a", descriptor = "(II)I")
	public int method293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) int local4 = this.anIntArray78[arg1];
			if (arg0 < 6 || arg0 > 6) {
				return this.anInt385;
			}
			if (local4 == 0) {
				@Pc(22) Class13 local22 = Class13.method146(this.anIntArray76[arg1]);
				if (local22 != null) {
					local4 = this.anIntArray78[arg1] = local22.anInt142;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("79320, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LCRVYGCP", name = "a", descriptor = "(Lclient!JHKSAGUC;I)V")
	private void method294(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method238();
				if (local13 == 0) {
					if (this.anInt387 == 0) {
						this.anInt387 = 1;
						this.anIntArray76 = new int[1];
						this.anIntArray76[0] = -1;
						this.anIntArray77 = new int[1];
						this.anIntArray77[0] = -1;
						this.anIntArray78 = new int[1];
						this.anIntArray78[0] = -1;
					}
					if (this.anInt393 == -1) {
						if (this.anIntArray79 == null) {
							this.anInt393 = 0;
						} else {
							this.anInt393 = 2;
						}
					}
					if (this.anInt394 == -1) {
						if (this.anIntArray79 != null) {
							this.anInt394 = 2;
							return;
						}
						this.anInt394 = 0;
						return;
					}
					return;
				}
				@Pc(40) int local40;
				if (local13 == 1) {
					this.anInt387 = arg0.method238();
					this.anIntArray76 = new int[this.anInt387];
					this.anIntArray77 = new int[this.anInt387];
					this.anIntArray78 = new int[this.anInt387];
					for (local40 = 0; local40 < this.anInt387; local40++) {
						this.anIntArray76[local40] = arg0.method240();
						this.anIntArray77[local40] = arg0.method240();
						if (this.anIntArray77[local40] == 65535) {
							this.anIntArray77[local40] = -1;
						}
						this.anIntArray78[local40] = arg0.method240();
					}
				} else if (local13 == 2) {
					this.anInt388 = arg0.method240();
				} else if (local13 == 3) {
					local40 = arg0.method238();
					this.anIntArray79 = new int[local40 + 1];
					for (@Pc(101) int local101 = 0; local101 < local40; local101++) {
						this.anIntArray79[local101] = arg0.method238();
					}
					this.anIntArray79[local40] = 9999999;
				} else if (local13 == 4) {
					this.aBoolean91 = true;
				} else if (local13 == 5) {
					this.anInt389 = arg0.method238();
				} else if (local13 == 6) {
					this.anInt390 = arg0.method240();
				} else if (local13 == 7) {
					this.anInt391 = arg0.method240();
				} else if (local13 == 8) {
					this.anInt392 = arg0.method238();
				} else if (local13 == 9) {
					this.anInt393 = arg0.method238();
				} else if (local13 == 10) {
					this.anInt394 = arg0.method238();
				} else if (local13 == 11) {
					this.anInt395 = arg0.method238();
				} else if (local13 == 12) {
					this.anInt396 = arg0.method243();
				} else {
					System.out.println("Error unrecognised seq config code: " + local13);
				}
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("46793, " + arg0 + ", " + 0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}
}
