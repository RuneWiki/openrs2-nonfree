import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt726;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt730;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt732;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt733;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private int anInt725 = 4;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt728 = -1;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	public boolean aBoolean164 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method445(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1) {
		try {
			if (arg0 >= 3 && arg0 <= 3) {
				@Pc(15) Class1_Sub1_Sub3 local15 = new Class1_Sub1_Sub3(arg1.method674("flo.dat", null), false);
				anInt726 = local15.method498();
				if (aClass21Array1 == null) {
					aClass21Array1 = new Class21[anInt726];
				}
				for (@Pc(25) int local25 = 0; local25 < anInt726; local25++) {
					if (aClass21Array1[local25] == null) {
						aClass21Array1[local25] = new Class21();
					}
					aClass21Array1[local25].method446(local15);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("3665, " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method446(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method496();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt727 = arg0.method500();
					this.method447(this.anInt725, this.anInt727);
				} else if (local10 == 2) {
					this.anInt728 = arg0.method496();
				} else if (local10 == 3) {
					this.aBoolean163 = true;
				} else if (local10 == 5) {
					this.aBoolean164 = false;
				} else if (local10 == 6) {
					this.aString27 = arg0.method503();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("29772, " + true + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) double local10 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
			@Pc(19) double local19 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
			@Pc(26) double local26 = (double) (arg1 & 0xFF) / 256.0D;
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
			this.anInt729 = (int) (local56 * 256.0D);
			this.anInt730 = (int) (local58 * 256.0D);
			if (arg0 == 4) {
				this.anInt731 = (int) (local64 * 256.0D);
				if (this.anInt730 < 0) {
					this.anInt730 = 0;
				} else if (this.anInt730 > 255) {
					this.anInt730 = 255;
				}
				if (this.anInt731 < 0) {
					this.anInt731 = 0;
				} else if (this.anInt731 > 255) {
					this.anInt731 = 255;
				}
				if (local64 > 0.5D) {
					this.anInt733 = (int) ((1.0D - local64) * local58 * 512.0D);
				} else {
					this.anInt733 = (int) (local64 * local58 * 512.0D);
				}
				if (this.anInt733 < 1) {
					this.anInt733 = 1;
				}
				this.anInt732 = (int) (local56 * (double) this.anInt733);
				@Pc(243) int local243 = this.anInt729 + (int) (Math.random() * 16.0D) - 8;
				if (local243 < 0) {
					local243 = 0;
				} else if (local243 > 255) {
					local243 = 255;
				}
				@Pc(264) int local264 = this.anInt730 + (int) (Math.random() * 48.0D) - 24;
				if (local264 < 0) {
					local264 = 0;
				} else if (local264 > 255) {
					local264 = 255;
				}
				@Pc(285) int local285 = this.anInt731 + (int) (Math.random() * 48.0D) - 24;
				if (local285 < 0) {
					local285 = 0;
				} else if (local285 > 255) {
					local285 = 255;
				}
				this.anInt734 = this.method448(local243, local264, local285);
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("36339, " + arg0 + ", " + arg1 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)I")
	private int method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
