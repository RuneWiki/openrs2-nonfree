import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt721;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public int anInt722;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	public int anInt724;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt726;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt728;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public int anInt723 = -1;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
	private boolean aBoolean180 = false;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method447(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg0.method678("flo.dat", null), (byte) 3);
			anInt721 = local11.method500();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt721];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt721; local21++) {
				if (aClass21Array1[local21] == null) {
					aClass21Array1[local21] = new Class21();
				}
				aClass21Array1[local21].method448(local11);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("5479, " + true + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method448(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method498();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt722 = arg0.method502();
					this.method449(this.anInt722);
				} else if (local11 == 2) {
					this.anInt723 = arg0.method498();
				} else if (local11 == 3) {
					this.aBoolean180 = true;
				} else if (local11 == 5) {
					this.aBoolean181 = false;
				} else if (local11 == 6) {
					this.aString27 = arg0.method505();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("98238, " + 9 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private void method449(@OriginalArg(1) int arg0) {
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
			this.anInt724 = (int) (local56 * 256.0D);
			this.anInt725 = (int) (local58 * 256.0D);
			this.anInt726 = (int) (local64 * 256.0D);
			if (this.anInt725 < 0) {
				this.anInt725 = 0;
			} else if (this.anInt725 > 255) {
				this.anInt725 = 255;
			}
			if (this.anInt726 < 0) {
				this.anInt726 = 0;
			} else if (this.anInt726 > 255) {
				this.anInt726 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt728 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt728 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt728 < 1) {
				this.anInt728 = 1;
			}
			this.anInt727 = (int) (local56 * (double) this.anInt728);
			@Pc(239) int local239 = this.anInt724 + (int) (Math.random() * 16.0D) - 8;
			if (local239 < 0) {
				local239 = 0;
			} else if (local239 > 255) {
				local239 = 255;
			}
			@Pc(264) int local264 = this.anInt725 + (int) (Math.random() * 48.0D) - 24;
			if (local264 < 0) {
				local264 = 0;
			} else if (local264 > 255) {
				local264 = 255;
			}
			@Pc(285) int local285 = this.anInt726 + (int) (Math.random() * 48.0D) - 24;
			if (local285 < 0) {
				local285 = 0;
			} else if (local285 > 255) {
				local285 = 255;
			}
			this.anInt729 = this.method450(local239, local264, local285);
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("15992, " + -2048 + ", " + arg0 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)I")
	private int method450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
