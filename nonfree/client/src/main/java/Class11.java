import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DWUJPTWU")
public final class Class11 {

	@OriginalMember(owner = "client!DWUJPTWU", name = "b", descriptor = "I")
	private static int anInt102;

	@OriginalMember(owner = "client!DWUJPTWU", name = "c", descriptor = "[Lclient!DWUJPTWU;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!DWUJPTWU", name = "a", descriptor = "Z")
	private static boolean aBoolean41 = true;

	@OriginalMember(owner = "client!DWUJPTWU", name = "d", descriptor = "I")
	public int anInt103;

	@OriginalMember(owner = "client!DWUJPTWU", name = "e", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!DWUJPTWU", name = "f", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!DWUJPTWU", name = "g", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!DWUJPTWU", name = "i", descriptor = "[I")
	public int[] anIntArray28;

	@OriginalMember(owner = "client!DWUJPTWU", name = "r", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!DWUJPTWU", name = "h", descriptor = "I")
	public int anInt104 = -1;

	@OriginalMember(owner = "client!DWUJPTWU", name = "j", descriptor = "Z")
	public boolean aBoolean42 = false;

	@OriginalMember(owner = "client!DWUJPTWU", name = "k", descriptor = "I")
	public int anInt105 = 5;

	@OriginalMember(owner = "client!DWUJPTWU", name = "l", descriptor = "I")
	public int anInt106 = -1;

	@OriginalMember(owner = "client!DWUJPTWU", name = "m", descriptor = "I")
	public int anInt107 = -1;

	@OriginalMember(owner = "client!DWUJPTWU", name = "n", descriptor = "I")
	public int anInt108 = 99;

	@OriginalMember(owner = "client!DWUJPTWU", name = "o", descriptor = "I")
	public int anInt109 = -1;

	@OriginalMember(owner = "client!DWUJPTWU", name = "p", descriptor = "I")
	public int anInt110 = -1;

	@OriginalMember(owner = "client!DWUJPTWU", name = "q", descriptor = "I")
	public int anInt111 = 2;

	@OriginalMember(owner = "client!DWUJPTWU", name = "a", descriptor = "(ILclient!TXPLZUUI;)V")
	public static void method95(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		try {
			if (arg0 < 3 || arg0 > 3) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			@Pc(23) Class5_Sub1_Sub4 local23 = new Class5_Sub1_Sub4(arg1.method464("seq.dat", null), 0);
			anInt102 = local23.method242();
			if (aClass11Array1 == null) {
				aClass11Array1 = new Class11[anInt102];
			}
			for (@Pc(33) int local33 = 0; local33 < anInt102; local33++) {
				if (aClass11Array1[local33] == null) {
					aClass11Array1[local33] = new Class11();
				}
				aClass11Array1[local33].method97(local23, aBoolean41);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("15112, " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DWUJPTWU", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!DWUJPTWU", name = "a", descriptor = "(II)I")
	public int method96(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray27[arg0];
			if (local4 == 0) {
				@Pc(16) Class3 local16 = Class3.method4(this.anIntArray25[arg0]);
				if (local16 != null) {
					local4 = this.anIntArray27[arg0] = local16.anInt13;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("7588, " + arg0 + ", " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DWUJPTWU", name = "a", descriptor = "(Lclient!PKHWFJLM;Z)V")
	private void method97(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) int local5;
			if (!arg1) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			while (true) {
				while (true) {
					local5 = arg0.method240();
					if (local5 == 0) {
						if (this.anInt103 == 0) {
							this.anInt103 = 1;
							this.anIntArray25 = new int[1];
							this.anIntArray25[0] = -1;
							this.anIntArray26 = new int[1];
							this.anIntArray26[0] = -1;
							this.anIntArray27 = new int[1];
							this.anIntArray27[0] = -1;
						}
						if (this.anInt109 == -1) {
							if (this.anIntArray28 == null) {
								this.anInt109 = 0;
							} else {
								this.anInt109 = 2;
							}
						}
						if (this.anInt110 == -1) {
							if (this.anIntArray28 != null) {
								this.anInt110 = 2;
								return;
							}
							this.anInt110 = 0;
							return;
						}
						return;
					}
					@Pc(40) int local40;
					if (local5 == 1) {
						this.anInt103 = arg0.method240();
						this.anIntArray25 = new int[this.anInt103];
						this.anIntArray26 = new int[this.anInt103];
						this.anIntArray27 = new int[this.anInt103];
						for (local40 = 0; local40 < this.anInt103; local40++) {
							this.anIntArray25[local40] = arg0.method242();
							this.anIntArray26[local40] = arg0.method242();
							if (this.anIntArray26[local40] == 65535) {
								this.anIntArray26[local40] = -1;
							}
							this.anIntArray27[local40] = arg0.method242();
						}
					} else if (local5 == 2) {
						this.anInt104 = arg0.method242();
					} else if (local5 == 3) {
						local40 = arg0.method240();
						this.anIntArray28 = new int[local40 + 1];
						for (@Pc(101) int local101 = 0; local101 < local40; local101++) {
							this.anIntArray28[local101] = arg0.method240();
						}
						this.anIntArray28[local40] = 9999999;
					} else if (local5 == 4) {
						this.aBoolean42 = true;
					} else if (local5 == 5) {
						this.anInt105 = arg0.method240();
					} else if (local5 == 6) {
						this.anInt106 = arg0.method242();
					} else if (local5 == 7) {
						this.anInt107 = arg0.method242();
					} else if (local5 == 8) {
						this.anInt108 = arg0.method240();
					} else if (local5 == 9) {
						this.anInt109 = arg0.method240();
					} else if (local5 == 10) {
						this.anInt110 = arg0.method240();
					} else if (local5 == 11) {
						this.anInt111 = arg0.method240();
					} else if (local5 == 12) {
						this.anInt112 = arg0.method245();
					} else {
						System.out.println("Error unrecognised seq config code: " + local5);
					}
				}
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("20852, " + arg0 + ", " + arg1 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}
}
