import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NVLIPBUR")
public final class Class36 {

	@OriginalMember(owner = "client!NVLIPBUR", name = "b", descriptor = "Z")
	private static boolean aBoolean143;

	@OriginalMember(owner = "client!NVLIPBUR", name = "d", descriptor = "I")
	private static int anInt545;

	@OriginalMember(owner = "client!NVLIPBUR", name = "e", descriptor = "[Lclient!NVLIPBUR;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!NVLIPBUR", name = "a", descriptor = "Z")
	private static boolean aBoolean142 = true;

	@OriginalMember(owner = "client!NVLIPBUR", name = "c", descriptor = "Z")
	private static boolean aBoolean144 = true;

	@OriginalMember(owner = "client!NVLIPBUR", name = "f", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!NVLIPBUR", name = "g", descriptor = "I")
	public int anInt546;

	@OriginalMember(owner = "client!NVLIPBUR", name = "k", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!NVLIPBUR", name = "l", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!NVLIPBUR", name = "m", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!NVLIPBUR", name = "n", descriptor = "I")
	public int anInt551;

	@OriginalMember(owner = "client!NVLIPBUR", name = "o", descriptor = "I")
	public int anInt552;

	@OriginalMember(owner = "client!NVLIPBUR", name = "p", descriptor = "I")
	public int anInt553;

	@OriginalMember(owner = "client!NVLIPBUR", name = "h", descriptor = "I")
	public int anInt547 = -1;

	@OriginalMember(owner = "client!NVLIPBUR", name = "i", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!NVLIPBUR", name = "j", descriptor = "Z")
	public boolean aBoolean146 = true;

	@OriginalMember(owner = "client!NVLIPBUR", name = "a", descriptor = "(ZLclient!MJLXHQTQ;)V")
	public static void method243(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(8) Class5_Sub1_Sub4 local8 = new Class5_Sub1_Sub4(arg0.method227("flo.dat", null), -82);
			anInt545 = local8.method439();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt545];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt545; local26++) {
				if (aClass36Array1[local26] == null) {
					aClass36Array1[local26] = new Class36();
				}
				aClass36Array1[local26].method244(aBoolean142, local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("19837, " + true + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NVLIPBUR", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!NVLIPBUR", name = "a", descriptor = "(ZLclient!XGRGMPUQ;)V")
	private void method244(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			if (!arg0) {
				aBoolean143 = !aBoolean143;
			}
			while (true) {
				@Pc(12) int local12 = arg1.method437();
				if (local12 == 0) {
					return;
				}
				if (local12 == 1) {
					this.anInt546 = arg1.method441();
					this.method245(this.anInt546);
				} else if (local12 == 2) {
					this.anInt547 = arg1.method437();
				} else if (local12 == 3) {
					this.aBoolean145 = true;
				} else if (local12 == 5) {
					this.aBoolean146 = false;
				} else if (local12 == 6) {
					this.aString11 = arg1.method444();
				} else if (local12 == 7) {
					@Pc(69) int local69 = this.anInt548;
					@Pc(72) int local72 = this.anInt549;
					@Pc(75) int local75 = this.anInt550;
					@Pc(78) int local78 = this.anInt551;
					@Pc(81) int local81 = arg1.method441();
					this.method245(local81);
					this.anInt548 = local69;
					this.anInt549 = local72;
					this.anInt550 = local75;
					this.anInt551 = local78;
					this.anInt552 = local78;
				} else {
					System.out.println("Error unrecognised config code: " + local12);
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("73412, " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NVLIPBUR", name = "a", descriptor = "(II)V")
	private void method245(@OriginalArg(0) int arg0) {
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
			@Pc(50) double local50 = local10;
			if (local19 > local10) {
				local50 = local19;
			}
			if (local26 > local50) {
				local50 = local26;
			}
			@Pc(64) double local64 = 0.0D;
			@Pc(66) double local66 = 0.0D;
			@Pc(72) double local72 = (local28 + local50) / 2.0D;
			if (local28 != local50) {
				if (local72 < 0.5D) {
					local66 = (local50 - local28) / (local50 + local28);
				}
				if (local72 >= 0.5D) {
					local66 = (local50 - local28) / (2.0D - local50 - local28);
				}
				if (local10 == local50) {
					local64 = (local19 - local26) / (local50 - local28);
				} else if (local19 == local50) {
					local64 = (local26 - local10) / (local50 - local28) + 2.0D;
				} else if (local26 == local50) {
					local64 = (local10 - local19) / (local50 - local28) + 4.0D;
				}
			}
			local64 /= 6.0D;
			this.anInt548 = (int) (local64 * 256.0D);
			this.anInt549 = (int) (local66 * 256.0D);
			this.anInt550 = (int) (local72 * 256.0D);
			if (this.anInt549 < 0) {
				this.anInt549 = 0;
			} else if (this.anInt549 > 255) {
				this.anInt549 = 255;
			}
			if (this.anInt550 < 0) {
				this.anInt550 = 0;
			} else if (this.anInt550 > 255) {
				this.anInt550 = 255;
			}
			if (local72 > 0.5D) {
				this.anInt552 = (int) ((1.0D - local72) * local66 * 512.0D);
			} else {
				this.anInt552 = (int) (local72 * local66 * 512.0D);
			}
			if (this.anInt552 < 1) {
				this.anInt552 = 1;
			}
			this.anInt551 = (int) (local64 * (double) this.anInt552);
			@Pc(247) int local247 = this.anInt548 + (int) (Math.random() * 16.0D) - 8;
			if (local247 < 0) {
				local247 = 0;
			} else if (local247 > 255) {
				local247 = 255;
			}
			@Pc(268) int local268 = this.anInt549 + (int) (Math.random() * 48.0D) - 24;
			if (local268 < 0) {
				local268 = 0;
			} else if (local268 > 255) {
				local268 = 255;
			}
			@Pc(289) int local289 = this.anInt550 + (int) (Math.random() * 48.0D) - 24;
			if (local289 < 0) {
				local289 = 0;
			} else if (local289 > 255) {
				local289 = 255;
			}
			this.anInt553 = this.method246(local247, local268, local289);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("12291, " + arg0 + ", " + 0 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NVLIPBUR", name = "a", descriptor = "(III)I")
	private int method246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
