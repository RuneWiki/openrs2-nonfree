import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt689;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt692;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt693;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt694;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt695;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt696;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt697;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private int anInt688 = 77;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public int anInt691 = -1;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public boolean aBoolean194 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method462(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method666("flo.dat", null), (byte) -93);
			anInt689 = local8.method482();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt689];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt689; local21++) {
				if (aClass21Array1[local21] == null) {
					aClass21Array1[local21] = new Class21();
				}
				aClass21Array1[local21].method463(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("49497, " + false + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!lb;)V")
	private void method463(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method480();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt690 = arg0.method484();
					this.method464(this.anInt690);
				} else if (local10 == 2) {
					this.anInt691 = arg0.method480();
				} else if (local10 == 3) {
					this.aBoolean193 = true;
				} else if (local10 == 5) {
					this.aBoolean194 = false;
				} else if (local10 == 6) {
					this.aString26 = arg0.method487();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("76320, " + 210 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V")
	private void method464(@OriginalArg(1) int arg0) {
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
			this.anInt692 = (int) (local56 * 256.0D);
			this.anInt693 = (int) (local58 * 256.0D);
			this.anInt694 = (int) (local64 * 256.0D);
			if (this.anInt693 < 0) {
				this.anInt693 = 0;
			} else if (this.anInt693 > 255) {
				this.anInt693 = 255;
			}
			if (this.anInt694 < 0) {
				this.anInt694 = 0;
			} else if (this.anInt694 > 255) {
				this.anInt694 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt696 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt696 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt696 < 1) {
				this.anInt696 = 1;
			}
			this.anInt695 = (int) (local56 * (double) this.anInt696);
			@Pc(244) int local244 = this.anInt692 + (int) (Math.random() * 16.0D) - 8;
			if (local244 < 0) {
				local244 = 0;
			} else if (local244 > 255) {
				local244 = 255;
			}
			@Pc(265) int local265 = this.anInt693 + (int) (Math.random() * 48.0D) - 24;
			if (local265 < 0) {
				local265 = 0;
			} else if (local265 > 255) {
				local265 = 255;
			}
			@Pc(286) int local286 = this.anInt694 + (int) (Math.random() * 48.0D) - 24;
			if (local286 < 0) {
				local286 = 0;
			} else if (local286 > 255) {
				local286 = 255;
			}
			this.anInt697 = this.method465(local244, local265, local286);
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("1181, " + false + ", " + arg0 + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)I")
	private int method465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
