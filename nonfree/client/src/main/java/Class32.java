import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MJVHTYCA")
public final class Class32 {

	@OriginalMember(owner = "client!MJVHTYCA", name = "d", descriptor = "I")
	private static int anInt440;

	@OriginalMember(owner = "client!MJVHTYCA", name = "e", descriptor = "[Lclient!MJVHTYCA;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!MJVHTYCA", name = "a", descriptor = "Z")
	private static boolean aBoolean131 = true;

	@OriginalMember(owner = "client!MJVHTYCA", name = "b", descriptor = "Z")
	private static boolean aBoolean132 = true;

	@OriginalMember(owner = "client!MJVHTYCA", name = "f", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!MJVHTYCA", name = "g", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!MJVHTYCA", name = "h", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!MJVHTYCA", name = "i", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!MJVHTYCA", name = "k", descriptor = "[I")
	public int[] anIntArray99;

	@OriginalMember(owner = "client!MJVHTYCA", name = "t", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!MJVHTYCA", name = "c", descriptor = "B")
	private byte aByte17 = 3;

	@OriginalMember(owner = "client!MJVHTYCA", name = "j", descriptor = "I")
	public int anInt442 = -1;

	@OriginalMember(owner = "client!MJVHTYCA", name = "l", descriptor = "Z")
	public boolean aBoolean133 = false;

	@OriginalMember(owner = "client!MJVHTYCA", name = "m", descriptor = "I")
	public int anInt443 = 5;

	@OriginalMember(owner = "client!MJVHTYCA", name = "n", descriptor = "I")
	public int anInt444 = -1;

	@OriginalMember(owner = "client!MJVHTYCA", name = "o", descriptor = "I")
	public int anInt445 = -1;

	@OriginalMember(owner = "client!MJVHTYCA", name = "p", descriptor = "I")
	public int anInt446 = 99;

	@OriginalMember(owner = "client!MJVHTYCA", name = "q", descriptor = "I")
	public int anInt447 = -1;

	@OriginalMember(owner = "client!MJVHTYCA", name = "r", descriptor = "I")
	public int anInt448 = -1;

	@OriginalMember(owner = "client!MJVHTYCA", name = "s", descriptor = "I")
	public int anInt449 = 2;

	@OriginalMember(owner = "client!MJVHTYCA", name = "a", descriptor = "(ZLclient!MJLXHQTQ;)V")
	public static void method228(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(8) Class5_Sub1_Sub4 local8 = new Class5_Sub1_Sub4(arg0.method227("seq.dat", null), -82);
			anInt440 = local8.method439();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt440];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt440; local21++) {
				if (aClass32Array1[local21] == null) {
					aClass32Array1[local21] = new Class32();
				}
				aClass32Array1[local21].method230(aBoolean131, local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("76861, " + true + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MJVHTYCA", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!MJVHTYCA", name = "a", descriptor = "(IB)I")
	public int method229(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) int local4 = this.anIntArray98[arg0];
			if (arg1 != this.aByte17) {
				return 4;
			}
			@Pc(10) boolean local10 = false;
			if (local4 == 0) {
				@Pc(22) Class2 local22 = Class2.method10(this.anIntArray96[arg0]);
				if (local22 != null) {
					local4 = this.anIntArray98[arg0] = local22.anInt3;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("7433, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MJVHTYCA", name = "a", descriptor = "(ZLclient!XGRGMPUQ;)V")
	private void method230(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(10) int local10 = arg1.method437();
					if (local10 == 0) {
						if (this.anInt441 == 0) {
							this.anInt441 = 1;
							this.anIntArray96 = new int[1];
							this.anIntArray96[0] = -1;
							this.anIntArray97 = new int[1];
							this.anIntArray97[0] = -1;
							this.anIntArray98 = new int[1];
							this.anIntArray98[0] = -1;
						}
						if (this.anInt447 == -1) {
							if (this.anIntArray99 == null) {
								this.anInt447 = 0;
							} else {
								this.anInt447 = 2;
							}
						}
						if (this.anInt448 == -1) {
							if (this.anIntArray99 != null) {
								this.anInt448 = 2;
								return;
							}
							this.anInt448 = 0;
							return;
						}
						return;
					}
					@Pc(37) int local37;
					if (local10 == 1) {
						this.anInt441 = arg1.method437();
						this.anIntArray96 = new int[this.anInt441];
						this.anIntArray97 = new int[this.anInt441];
						this.anIntArray98 = new int[this.anInt441];
						for (local37 = 0; local37 < this.anInt441; local37++) {
							this.anIntArray96[local37] = arg1.method439();
							this.anIntArray97[local37] = arg1.method439();
							if (this.anIntArray97[local37] == 65535) {
								this.anIntArray97[local37] = -1;
							}
							this.anIntArray98[local37] = arg1.method439();
						}
					} else if (local10 == 2) {
						this.anInt442 = arg1.method439();
					} else if (local10 == 3) {
						local37 = arg1.method437();
						this.anIntArray99 = new int[local37 + 1];
						for (@Pc(98) int local98 = 0; local98 < local37; local98++) {
							this.anIntArray99[local98] = arg1.method437();
						}
						this.anIntArray99[local37] = 9999999;
					} else if (local10 == 4) {
						this.aBoolean133 = true;
					} else if (local10 == 5) {
						this.anInt443 = arg1.method437();
					} else if (local10 == 6) {
						this.anInt444 = arg1.method439();
					} else if (local10 == 7) {
						this.anInt445 = arg1.method439();
					} else if (local10 == 8) {
						this.anInt446 = arg1.method437();
					} else if (local10 == 9) {
						this.anInt447 = arg1.method437();
					} else if (local10 == 10) {
						this.anInt448 = arg1.method437();
					} else if (local10 == 11) {
						this.anInt449 = arg1.method437();
					} else if (local10 == 12) {
						this.anInt450 = arg1.method442();
					} else {
						System.out.println("Error unrecognised seq config code: " + local10);
					}
				}
			}
		} catch (@Pc(272) RuntimeException local272) {
			signlink.reporterror("87263, " + arg0 + ", " + arg1 + ", " + local272.toString());
			throw new RuntimeException();
		}
	}
}
