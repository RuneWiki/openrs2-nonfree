import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt733;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	public int anInt736;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt739;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt735 = -1;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	public boolean aBoolean191 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!xb;Z)V")
	public static void method462(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(-49365, arg0.method666("flo.dat", null));
			anInt733 = local8.method482();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt733];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt733; local21++) {
				if (aClass21Array1[local21] == null) {
					aClass21Array1[local21] = new Class21();
				}
				aClass21Array1[local21].method463(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("8299, " + arg0 + ", " + false + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private void method463(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method480();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt734 = arg0.method484();
					this.method464(this.anInt734, 155);
				} else if (local10 == 2) {
					this.anInt735 = arg0.method480();
				} else if (local10 == 3) {
					this.aBoolean190 = true;
				} else if (local10 == 5) {
					this.aBoolean191 = false;
				} else if (local10 == 6) {
					this.aString26 = arg0.method487();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("60156, " + arg0 + ", " + false + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			this.anInt736 = (int) (local56 * 256.0D);
			this.anInt737 = (int) (local58 * 256.0D);
			this.anInt738 = (int) (local64 * 256.0D);
			if (this.anInt737 < 0) {
				this.anInt737 = 0;
			} else if (this.anInt737 > 255) {
				this.anInt737 = 255;
			}
			if (this.anInt738 < 0) {
				this.anInt738 = 0;
			} else if (this.anInt738 > 255) {
				this.anInt738 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt740 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt740 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt740 < 1) {
				this.anInt740 = 1;
			}
			this.anInt739 = (int) (local56 * (double) this.anInt740);
			@Pc(239) int local239 = this.anInt736 + (int) (Math.random() * 16.0D) - 8;
			if (local239 < 0) {
				local239 = 0;
			} else if (local239 > 255) {
				local239 = 255;
			}
			@Pc(260) int local260 = this.anInt737 + (int) (Math.random() * 48.0D) - 24;
			if (local260 < 0) {
				local260 = 0;
			} else if (local260 > 255) {
				local260 = 255;
			}
			@Pc(281) int local281 = this.anInt738 + (int) (Math.random() * 48.0D) - 24;
			if (local281 < 0) {
				local281 = 0;
			} else if (local281 > 255) {
				local281 = 255;
			}
			this.anInt741 = this.method465(local239, local260, local281);
			@Pc(303) boolean local303 = false;
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("19, " + arg0 + ", " + arg1 + ", " + local305.toString());
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
