import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PVVHTYPN")
public final class Class30 {

	@OriginalMember(owner = "client!PVVHTYPN", name = "b", descriptor = "I")
	private static int anInt385;

	@OriginalMember(owner = "client!PVVHTYPN", name = "c", descriptor = "[Lclient!PVVHTYPN;")
	public static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!PVVHTYPN", name = "d", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!PVVHTYPN", name = "e", descriptor = "[I")
	public int[] anIntArray90;

	@OriginalMember(owner = "client!PVVHTYPN", name = "f", descriptor = "[I")
	public int[] anIntArray91;

	@OriginalMember(owner = "client!PVVHTYPN", name = "g", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!PVVHTYPN", name = "i", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!PVVHTYPN", name = "r", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!PVVHTYPN", name = "a", descriptor = "I")
	private int anInt384 = 9;

	@OriginalMember(owner = "client!PVVHTYPN", name = "h", descriptor = "I")
	public int anInt387 = -1;

	@OriginalMember(owner = "client!PVVHTYPN", name = "j", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!PVVHTYPN", name = "k", descriptor = "I")
	public int anInt388 = 5;

	@OriginalMember(owner = "client!PVVHTYPN", name = "l", descriptor = "I")
	public int anInt389 = -1;

	@OriginalMember(owner = "client!PVVHTYPN", name = "m", descriptor = "I")
	public int anInt390 = -1;

	@OriginalMember(owner = "client!PVVHTYPN", name = "n", descriptor = "I")
	public int anInt391 = 99;

	@OriginalMember(owner = "client!PVVHTYPN", name = "o", descriptor = "I")
	public int anInt392 = -1;

	@OriginalMember(owner = "client!PVVHTYPN", name = "p", descriptor = "I")
	public int anInt393 = -1;

	@OriginalMember(owner = "client!PVVHTYPN", name = "q", descriptor = "I")
	public int anInt394 = 2;

	@OriginalMember(owner = "client!PVVHTYPN", name = "a", descriptor = "(BLclient!RPFMUSNN;)V")
	public static void method307(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(20) Class3_Sub1_Sub4 local20 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("seq.dat", null));
			anInt385 = local20.method460();
			if (aClass30Array1 == null) {
				aClass30Array1 = new Class30[anInt385];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt385; local30++) {
				if (aClass30Array1[local30] == null) {
					aClass30Array1[local30] = new Class30();
				}
				aClass30Array1[local30].method309(local20);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("56365, " + -114 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PVVHTYPN", name = "<init>", descriptor = "()V")
	private Class30() {
	}

	@OriginalMember(owner = "client!PVVHTYPN", name = "a", descriptor = "(IB)I")
	public int method308(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) int local10 = this.anIntArray92[arg0];
			if (local10 == 0) {
				@Pc(18) Class5 local18 = Class5.method63(this.anIntArray90[arg0]);
				if (local18 != null) {
					local10 = this.anIntArray92[arg0] = local18.anInt85;
				}
			}
			if (local10 == 0) {
				local10 = 1;
			}
			return local10;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("23570, " + arg0 + ", " + -99 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PVVHTYPN", name = "a", descriptor = "(ILclient!WNCFPLWV;)V")
	private void method309(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method458();
				if (local13 == 0) {
					if (this.anInt386 == 0) {
						this.anInt386 = 1;
						this.anIntArray90 = new int[1];
						this.anIntArray90[0] = -1;
						this.anIntArray91 = new int[1];
						this.anIntArray91[0] = -1;
						this.anIntArray92 = new int[1];
						this.anIntArray92[0] = -1;
					}
					if (this.anInt392 == -1) {
						if (this.anIntArray93 == null) {
							this.anInt392 = 0;
						} else {
							this.anInt392 = 2;
						}
					}
					if (this.anInt393 == -1) {
						if (this.anIntArray93 != null) {
							this.anInt393 = 2;
							return;
						}
						this.anInt393 = 0;
						return;
					}
					return;
				}
				@Pc(40) int local40;
				if (local13 == 1) {
					this.anInt386 = arg0.method458();
					this.anIntArray90 = new int[this.anInt386];
					this.anIntArray91 = new int[this.anInt386];
					this.anIntArray92 = new int[this.anInt386];
					for (local40 = 0; local40 < this.anInt386; local40++) {
						this.anIntArray90[local40] = arg0.method460();
						this.anIntArray91[local40] = arg0.method460();
						if (this.anIntArray91[local40] == 65535) {
							this.anIntArray91[local40] = -1;
						}
						this.anIntArray92[local40] = arg0.method460();
					}
				} else if (local13 == 2) {
					this.anInt387 = arg0.method460();
				} else if (local13 == 3) {
					local40 = arg0.method458();
					this.anIntArray93 = new int[local40 + 1];
					for (@Pc(101) int local101 = 0; local101 < local40; local101++) {
						this.anIntArray93[local101] = arg0.method458();
					}
					this.anIntArray93[local40] = 9999999;
				} else if (local13 == 4) {
					this.aBoolean92 = true;
				} else if (local13 == 5) {
					this.anInt388 = arg0.method458();
				} else if (local13 == 6) {
					this.anInt389 = arg0.method460();
				} else if (local13 == 7) {
					this.anInt390 = arg0.method460();
				} else if (local13 == 8) {
					this.anInt391 = arg0.method458();
				} else if (local13 == 9) {
					this.anInt392 = arg0.method458();
				} else if (local13 == 10) {
					this.anInt393 = arg0.method458();
				} else if (local13 == 11) {
					this.anInt394 = arg0.method458();
				} else if (local13 == 12) {
					this.anInt395 = arg0.method463();
				} else {
					System.out.println("Error unrecognised seq config code: " + local13);
				}
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("68657, " + -934 + ", " + arg0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}
}
