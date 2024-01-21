import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JZQVOFSF")
public final class Class22 {

	@OriginalMember(owner = "client!JZQVOFSF", name = "b", descriptor = "I")
	private static int anInt261;

	@OriginalMember(owner = "client!JZQVOFSF", name = "c", descriptor = "[Lclient!JZQVOFSF;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!JZQVOFSF", name = "d", descriptor = "I")
	public int anInt262;

	@OriginalMember(owner = "client!JZQVOFSF", name = "e", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!JZQVOFSF", name = "f", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!JZQVOFSF", name = "g", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!JZQVOFSF", name = "i", descriptor = "[I")
	public int[] anIntArray67;

	@OriginalMember(owner = "client!JZQVOFSF", name = "r", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!JZQVOFSF", name = "a", descriptor = "I")
	private int anInt260 = 939;

	@OriginalMember(owner = "client!JZQVOFSF", name = "h", descriptor = "I")
	public int anInt263 = -1;

	@OriginalMember(owner = "client!JZQVOFSF", name = "j", descriptor = "Z")
	public boolean aBoolean96 = false;

	@OriginalMember(owner = "client!JZQVOFSF", name = "k", descriptor = "I")
	public int anInt264 = 5;

	@OriginalMember(owner = "client!JZQVOFSF", name = "l", descriptor = "I")
	public int anInt265 = -1;

	@OriginalMember(owner = "client!JZQVOFSF", name = "m", descriptor = "I")
	public int anInt266 = -1;

	@OriginalMember(owner = "client!JZQVOFSF", name = "n", descriptor = "I")
	public int anInt267 = 99;

	@OriginalMember(owner = "client!JZQVOFSF", name = "o", descriptor = "I")
	public int anInt268 = -1;

	@OriginalMember(owner = "client!JZQVOFSF", name = "p", descriptor = "I")
	public int anInt269 = -1;

	@OriginalMember(owner = "client!JZQVOFSF", name = "q", descriptor = "I")
	public int anInt270 = 2;

	@OriginalMember(owner = "client!JZQVOFSF", name = "a", descriptor = "(Lclient!SMIVAFST;I)V")
	public static void method264(@OriginalArg(0) Class35 arg0) {
		try {
			@Pc(20) Class2_Sub1_Sub2 local20 = new Class2_Sub1_Sub2(arg0.method485("seq.dat", null), (byte) 3);
			anInt261 = local20.method96();
			if (aClass22Array1 == null) {
				aClass22Array1 = new Class22[anInt261];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt261; local30++) {
				if (aClass22Array1[local30] == null) {
					aClass22Array1[local30] = new Class22();
				}
				aClass22Array1[local30].method266(local20);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("13019, " + arg0 + ", " + -29636 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JZQVOFSF", name = "<init>", descriptor = "()V")
	private Class22() {
	}

	@OriginalMember(owner = "client!JZQVOFSF", name = "a", descriptor = "(II)I")
	public int method265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 8) {
				return this.anInt260;
			}
			@Pc(10) int local10 = this.anIntArray66[arg0];
			if (local10 == 0) {
				@Pc(18) Class45 local18 = Class45.method556(this.anIntArray64[arg0]);
				if (local18 != null) {
					local10 = this.anIntArray66[arg0] = local18.anInt792;
				}
			}
			if (local10 == 0) {
				local10 = 1;
			}
			return local10;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("27050, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JZQVOFSF", name = "a", descriptor = "(ILclient!BSNPYLEV;)V")
	private void method266(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method94();
				if (local14 == 0) {
					if (this.anInt262 == 0) {
						this.anInt262 = 1;
						this.anIntArray64 = new int[1];
						this.anIntArray64[0] = -1;
						this.anIntArray65 = new int[1];
						this.anIntArray65[0] = -1;
						this.anIntArray66 = new int[1];
						this.anIntArray66[0] = -1;
					}
					if (this.anInt268 == -1) {
						if (this.anIntArray67 == null) {
							this.anInt268 = 0;
						} else {
							this.anInt268 = 2;
						}
					}
					if (this.anInt269 == -1) {
						if (this.anIntArray67 != null) {
							this.anInt269 = 2;
							return;
						}
						this.anInt269 = 0;
						return;
					}
					return;
				}
				@Pc(41) int local41;
				if (local14 == 1) {
					this.anInt262 = arg0.method94();
					this.anIntArray64 = new int[this.anInt262];
					this.anIntArray65 = new int[this.anInt262];
					this.anIntArray66 = new int[this.anInt262];
					for (local41 = 0; local41 < this.anInt262; local41++) {
						this.anIntArray64[local41] = arg0.method96();
						this.anIntArray65[local41] = arg0.method96();
						if (this.anIntArray65[local41] == 65535) {
							this.anIntArray65[local41] = -1;
						}
						this.anIntArray66[local41] = arg0.method96();
					}
				} else if (local14 == 2) {
					this.anInt263 = arg0.method96();
				} else if (local14 == 3) {
					local41 = arg0.method94();
					this.anIntArray67 = new int[local41 + 1];
					for (@Pc(102) int local102 = 0; local102 < local41; local102++) {
						this.anIntArray67[local102] = arg0.method94();
					}
					this.anIntArray67[local41] = 9999999;
				} else if (local14 == 4) {
					this.aBoolean96 = true;
				} else if (local14 == 5) {
					this.anInt264 = arg0.method94();
				} else if (local14 == 6) {
					this.anInt265 = arg0.method96();
				} else if (local14 == 7) {
					this.anInt266 = arg0.method96();
				} else if (local14 == 8) {
					this.anInt267 = arg0.method94();
				} else if (local14 == 9) {
					this.anInt268 = arg0.method94();
				} else if (local14 == 10) {
					this.anInt269 = arg0.method94();
				} else if (local14 == 11) {
					this.anInt270 = arg0.method94();
				} else if (local14 == 12) {
					this.anInt271 = arg0.method99();
				} else {
					System.out.println("Error unrecognised seq config code: " + local14);
				}
			}
		} catch (@Pc(276) RuntimeException local276) {
			signlink.reporterror("65176, " + 7 + ", " + arg0 + ", " + local276.toString());
			throw new RuntimeException();
		}
	}
}
