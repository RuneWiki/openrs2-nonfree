import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VYCKCNXO")
public final class Class39 {

	@OriginalMember(owner = "client!VYCKCNXO", name = "a", descriptor = "I")
	private static int anInt722;

	@OriginalMember(owner = "client!VYCKCNXO", name = "b", descriptor = "[Lclient!VYCKCNXO;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!VYCKCNXO", name = "c", descriptor = "I")
	public int anInt723;

	@OriginalMember(owner = "client!VYCKCNXO", name = "d", descriptor = "[I")
	public int[] anIntArray183;

	@OriginalMember(owner = "client!VYCKCNXO", name = "e", descriptor = "[I")
	public int[] anIntArray184;

	@OriginalMember(owner = "client!VYCKCNXO", name = "f", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!VYCKCNXO", name = "h", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!VYCKCNXO", name = "q", descriptor = "I")
	private int anInt732;

	@OriginalMember(owner = "client!VYCKCNXO", name = "g", descriptor = "I")
	public int anInt724 = -1;

	@OriginalMember(owner = "client!VYCKCNXO", name = "i", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!VYCKCNXO", name = "j", descriptor = "I")
	public int anInt725 = 5;

	@OriginalMember(owner = "client!VYCKCNXO", name = "k", descriptor = "I")
	public int anInt726 = -1;

	@OriginalMember(owner = "client!VYCKCNXO", name = "l", descriptor = "I")
	public int anInt727 = -1;

	@OriginalMember(owner = "client!VYCKCNXO", name = "m", descriptor = "I")
	public int anInt728 = 99;

	@OriginalMember(owner = "client!VYCKCNXO", name = "n", descriptor = "I")
	public int anInt729 = -1;

	@OriginalMember(owner = "client!VYCKCNXO", name = "o", descriptor = "I")
	public int anInt730 = -1;

	@OriginalMember(owner = "client!VYCKCNXO", name = "p", descriptor = "I")
	public int anInt731 = 2;

	@OriginalMember(owner = "client!VYCKCNXO", name = "a", descriptor = "(Lclient!DTIATKJO;I)V")
	public static void method491(@OriginalArg(0) Class7 arg0) {
		try {
			@Pc(10) Class3_Sub1_Sub2 local10 = new Class3_Sub1_Sub2(-527, arg0.method30("seq.dat", null));
			anInt722 = local10.method91();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt722];
			}
			for (@Pc(33) int local33 = 0; local33 < anInt722; local33++) {
				if (aClass39Array1[local33] == null) {
					aClass39Array1[local33] = new Class39();
				}
				aClass39Array1[local33].method493(local10);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("75248, " + arg0 + ", " + 1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYCKCNXO", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!VYCKCNXO", name = "a", descriptor = "(II)I")
	public int method492(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray185[arg0];
			if (local4 == 0) {
				@Pc(21) Class47 local21 = Class47.method553(this.anIntArray183[arg0]);
				if (local21 != null) {
					local4 = this.anIntArray185[arg0] = local21.anInt783;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("71885, " + 0 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYCKCNXO", name = "a", descriptor = "(Lclient!GHHPHSRU;I)V")
	private void method493(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method89();
				if (local13 == 0) {
					if (this.anInt723 == 0) {
						this.anInt723 = 1;
						this.anIntArray183 = new int[1];
						this.anIntArray183[0] = -1;
						this.anIntArray184 = new int[1];
						this.anIntArray184[0] = -1;
						this.anIntArray185 = new int[1];
						this.anIntArray185[0] = -1;
					}
					if (this.anInt729 == -1) {
						if (this.anIntArray186 == null) {
							this.anInt729 = 0;
						} else {
							this.anInt729 = 2;
						}
					}
					if (this.anInt730 == -1) {
						if (this.anIntArray186 != null) {
							this.anInt730 = 2;
							return;
						}
						this.anInt730 = 0;
						return;
					}
					return;
				}
				@Pc(40) int local40;
				if (local13 == 1) {
					this.anInt723 = arg0.method89();
					this.anIntArray183 = new int[this.anInt723];
					this.anIntArray184 = new int[this.anInt723];
					this.anIntArray185 = new int[this.anInt723];
					for (local40 = 0; local40 < this.anInt723; local40++) {
						this.anIntArray183[local40] = arg0.method91();
						this.anIntArray184[local40] = arg0.method91();
						if (this.anIntArray184[local40] == 65535) {
							this.anIntArray184[local40] = -1;
						}
						this.anIntArray185[local40] = arg0.method91();
					}
				} else if (local13 == 2) {
					this.anInt724 = arg0.method91();
				} else if (local13 == 3) {
					local40 = arg0.method89();
					this.anIntArray186 = new int[local40 + 1];
					for (@Pc(101) int local101 = 0; local101 < local40; local101++) {
						this.anIntArray186[local101] = arg0.method89();
					}
					this.anIntArray186[local40] = 9999999;
				} else if (local13 == 4) {
					this.aBoolean171 = true;
				} else if (local13 == 5) {
					this.anInt725 = arg0.method89();
				} else if (local13 == 6) {
					this.anInt726 = arg0.method91();
				} else if (local13 == 7) {
					this.anInt727 = arg0.method91();
				} else if (local13 == 8) {
					this.anInt728 = arg0.method89();
				} else if (local13 == 9) {
					this.anInt729 = arg0.method89();
				} else if (local13 == 10) {
					this.anInt730 = arg0.method89();
				} else if (local13 == 11) {
					this.anInt731 = arg0.method89();
				} else if (local13 == 12) {
					this.anInt732 = arg0.method94();
				} else {
					System.out.println("Error unrecognised seq config code: " + local13);
				}
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("45375, " + arg0 + ", " + 0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}
}
