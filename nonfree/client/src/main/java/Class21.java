import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt740;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt743;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt744;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt745;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt746;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt747;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt748;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt742 = -1;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	public boolean aBoolean170 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method447(@OriginalArg(0) Class48 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(45427, arg0.method678("flo.dat", null));
			anInt740 = local11.method500();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt740];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt740; local21++) {
				if (aClass21Array1[local21] == null) {
					aClass21Array1[local21] = new Class21();
				}
				aClass21Array1[local21].method448(local11);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("31547, " + arg0 + ", " + 680 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!mb;B)V")
	private void method448(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method498();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt741 = arg0.method502();
					this.method449(this.anInt741);
				} else if (local15 == 2) {
					this.anInt742 = arg0.method498();
				} else if (local15 == 3) {
					this.aBoolean169 = true;
				} else if (local15 == 5) {
					this.aBoolean170 = false;
				} else if (local15 == 6) {
					this.aString27 = arg0.method505();
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("4925, " + arg0 + ", " + 66 + ", " + local77.toString());
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
			this.anInt743 = (int) (local56 * 256.0D);
			this.anInt744 = (int) (local58 * 256.0D);
			this.anInt745 = (int) (local64 * 256.0D);
			if (this.anInt744 < 0) {
				this.anInt744 = 0;
			} else if (this.anInt744 > 255) {
				this.anInt744 = 255;
			}
			if (this.anInt745 < 0) {
				this.anInt745 = 0;
			} else if (this.anInt745 > 255) {
				this.anInt745 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt747 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt747 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt747 < 1) {
				this.anInt747 = 1;
			}
			this.anInt746 = (int) (local56 * (double) this.anInt747);
			@Pc(243) int local243 = this.anInt743 + (int) (Math.random() * 16.0D) - 8;
			if (local243 < 0) {
				local243 = 0;
			} else if (local243 > 255) {
				local243 = 255;
			}
			@Pc(264) int local264 = this.anInt744 + (int) (Math.random() * 48.0D) - 24;
			if (local264 < 0) {
				local264 = 0;
			} else if (local264 > 255) {
				local264 = 255;
			}
			@Pc(285) int local285 = this.anInt745 + (int) (Math.random() * 48.0D) - 24;
			if (local285 < 0) {
				local285 = 0;
			} else if (local285 > 255) {
				local285 = 255;
			}
			this.anInt748 = this.method450(local243, local264, local285);
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("65260, " + 8 + ", " + arg0 + ", " + local305.toString());
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
