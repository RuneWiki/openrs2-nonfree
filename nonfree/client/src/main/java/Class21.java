import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt724;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt728;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt730;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt732;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public int anInt726 = -1;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
	public boolean aBoolean195 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method447(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(16, arg0.method678("flo.dat", null));
			anInt724 = local10.method500();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt724];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt724; local29++) {
				if (aClass21Array1[local29] == null) {
					aClass21Array1[local29] = new Class21();
				}
				aClass21Array1[local29].method448(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("39746, " + true + ", " + arg0 + ", " + local53.toString());
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
				@Pc(13) int local13 = arg0.method498();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt725 = arg0.method502();
					this.method449(this.anInt725);
				} else if (local13 == 2) {
					this.anInt726 = arg0.method498();
				} else if (local13 == 3) {
					this.aBoolean194 = true;
				} else if (local13 == 5) {
					this.aBoolean195 = false;
				} else if (local13 == 6) {
					this.aString27 = arg0.method505();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("80522, " + 891 + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V")
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
			this.anInt727 = (int) (local56 * 256.0D);
			this.anInt728 = (int) (local58 * 256.0D);
			this.anInt729 = (int) (local64 * 256.0D);
			if (this.anInt728 < 0) {
				this.anInt728 = 0;
			} else if (this.anInt728 > 255) {
				this.anInt728 = 255;
			}
			if (this.anInt729 < 0) {
				this.anInt729 = 0;
			} else if (this.anInt729 > 255) {
				this.anInt729 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt731 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt731 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt731 < 1) {
				this.anInt731 = 1;
			}
			this.anInt730 = (int) (local56 * (double) this.anInt731);
			@Pc(242) int local242 = this.anInt727 + (int) (Math.random() * 16.0D) - 8;
			if (local242 < 0) {
				local242 = 0;
			} else if (local242 > 255) {
				local242 = 255;
			}
			@Pc(263) int local263 = this.anInt728 + (int) (Math.random() * 48.0D) - 24;
			if (local263 < 0) {
				local263 = 0;
			} else if (local263 > 255) {
				local263 = 255;
			}
			@Pc(284) int local284 = this.anInt729 + (int) (Math.random() * 48.0D) - 24;
			if (local284 < 0) {
				local284 = 0;
			} else if (local284 > 255) {
				local284 = 255;
			}
			this.anInt732 = this.method450(local242, local263, local284);
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("92100, " + true + ", " + arg0 + ", " + local304.toString());
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
