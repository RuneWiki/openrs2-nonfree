import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MQVXAZFZ")
public final class Class24 {

	@OriginalMember(owner = "client!MQVXAZFZ", name = "c", descriptor = "I")
	private static int anInt440;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "d", descriptor = "[Lclient!MQVXAZFZ;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "a", descriptor = "B")
	private static byte aByte15 = -27;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "e", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "f", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "j", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "k", descriptor = "I")
	public int anInt444;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "l", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "m", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "n", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "o", descriptor = "I")
	public int anInt448;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "b", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "g", descriptor = "I")
	public int anInt442 = -1;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "h", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "i", descriptor = "Z")
	public boolean aBoolean92 = true;

	@OriginalMember(owner = "client!MQVXAZFZ", name = "a", descriptor = "(ILclient!QKFGLETG;)V")
	public static void method284(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("flo.dat", null));
			anInt440 = local8.method500();
			if (aClass24Array1 == null) {
				aClass24Array1 = new Class24[anInt440];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt440; local21++) {
				if (aClass24Array1[local21] == null) {
					aClass24Array1[local21] = new Class24();
				}
				aClass24Array1[local21].method285(aByte15, local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("33845, " + 0 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MQVXAZFZ", name = "<init>", descriptor = "()V")
	private Class24() {
	}

	@OriginalMember(owner = "client!MQVXAZFZ", name = "a", descriptor = "(BLclient!XJCNBMKS;)V")
	private void method285(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 != aByte15) {
				throw new NullPointerException();
			}
			while (true) {
				@Pc(11) int local11 = arg1.method498();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt441 = arg1.method502();
					this.method286(this.anInt441);
				} else if (local11 == 2) {
					this.anInt442 = arg1.method498();
				} else if (local11 == 3) {
					this.aBoolean91 = true;
				} else if (local11 == 5) {
					this.aBoolean92 = false;
				} else if (local11 == 6) {
					this.aString4 = arg1.method505();
				} else if (local11 == 7) {
					@Pc(68) int local68 = this.anInt443;
					@Pc(71) int local71 = this.anInt444;
					@Pc(74) int local74 = this.anInt445;
					@Pc(77) int local77 = this.anInt446;
					@Pc(80) int local80 = arg1.method502();
					this.method286(local80);
					this.anInt443 = local68;
					this.anInt444 = local71;
					this.anInt445 = local74;
					this.anInt446 = local77;
					this.anInt447 = local77;
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("88286, " + arg0 + ", " + arg1 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MQVXAZFZ", name = "a", descriptor = "(BI)V")
	private void method286(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(26) double local26 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(28) double local28 = local10;
			if (local19 < local10) {
				local28 = local19;
			}
			if (local26 < local28) {
				local28 = local26;
			}
			@Pc(42) double local42 = local10;
			if (local19 > local10) {
				local42 = local19;
			}
			if (local26 > local42) {
				local42 = local26;
			}
			@Pc(56) double local56 = 0.0D;
			@Pc(58) double local58 = 0.0D;
			@Pc(64) double local64 = (local28 + local42) / 2.0D;
			if (local28 != local42) {
				if (local64 < 0.5D) {
					local58 = (local42 - local28) / (local42 + local28);
				}
				if (local64 >= 0.5D) {
					local58 = (local42 - local28) / (2.0D - local42 - local28);
				}
				if (local10 == local42) {
					local56 = (local19 - local26) / (local42 - local28);
				} else if (local19 == local42) {
					local56 = (local26 - local10) / (local42 - local28) + 2.0D;
				} else if (local26 == local42) {
					local56 = (local10 - local19) / (local42 - local28) + 4.0D;
				}
			}
			local56 /= 6.0D;
			this.anInt443 = (int) (local56 * 256.0D);
			this.anInt444 = (int) (local58 * 256.0D);
			this.anInt445 = (int) (local64 * 256.0D);
			if (this.anInt444 < 0) {
				this.anInt444 = 0;
			} else if (this.anInt444 > 255) {
				this.anInt444 = 255;
			}
			if (this.anInt445 < 0) {
				this.anInt445 = 0;
			} else if (this.anInt445 > 255) {
				this.anInt445 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt447 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt447 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt447 < 1) {
				this.anInt447 = 1;
			}
			this.anInt446 = (int) (local56 * (double) this.anInt447);
			@Pc(250) int local250 = this.anInt443 + (int) (Math.random() * 16.0D) - 8;
			if (local250 < 0) {
				local250 = 0;
			} else if (local250 > 255) {
				local250 = 255;
			}
			@Pc(271) int local271 = this.anInt444 + (int) (Math.random() * 48.0D) - 24;
			if (local271 < 0) {
				local271 = 0;
			} else if (local271 > 255) {
				local271 = 255;
			}
			@Pc(292) int local292 = this.anInt445 + (int) (Math.random() * 48.0D) - 24;
			if (local292 < 0) {
				local292 = 0;
			} else if (local292 > 255) {
				local292 = 255;
			}
			this.anInt448 = this.method287(local250, local271, local292);
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("37421, " + -60 + ", " + arg0 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MQVXAZFZ", name = "a", descriptor = "(III)I")
	private int method287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}
}
