import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt683;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt686;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	private boolean aBoolean195 = true;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt685 = -1;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	public boolean aBoolean197 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method454(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("flo.dat", null));
			anInt683 = local11.method474();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt683];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt683; local21++) {
				if (aClass21Array1[local21] == null) {
					aClass21Array1[local21] = new Class21();
				}
				aClass21Array1[local21].method455(local11);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("96097, " + 645 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method455(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method472();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt684 = arg0.method476();
					this.method456(this.anInt684);
				} else if (local11 == 2) {
					this.anInt685 = arg0.method472();
				} else if (local11 == 3) {
					this.aBoolean196 = true;
				} else if (local11 == 5) {
					this.aBoolean197 = false;
				} else if (local11 == 6) {
					this.aString26 = arg0.method479();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("55418, " + arg0 + ", " + -32477 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private void method456(@OriginalArg(1) int arg0) {
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
			this.anInt686 = (int) (local56 * 256.0D);
			this.anInt687 = (int) (local58 * 256.0D);
			this.anInt688 = (int) (local64 * 256.0D);
			if (this.anInt687 < 0) {
				this.anInt687 = 0;
			} else if (this.anInt687 > 255) {
				this.anInt687 = 255;
			}
			if (this.anInt688 < 0) {
				this.anInt688 = 0;
			} else if (this.anInt688 > 255) {
				this.anInt688 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt690 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt690 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt690 < 1) {
				this.anInt690 = 1;
			}
			this.anInt689 = (int) (local56 * (double) this.anInt690);
			@Pc(239) int local239 = this.anInt686 + (int) (Math.random() * 16.0D) - 8;
			if (local239 < 0) {
				local239 = 0;
			} else if (local239 > 255) {
				local239 = 255;
			}
			@Pc(260) int local260 = this.anInt687 + (int) (Math.random() * 48.0D) - 24;
			if (local260 < 0) {
				local260 = 0;
			} else if (local260 > 255) {
				local260 = 255;
			}
			@Pc(281) int local281 = this.anInt688 + (int) (Math.random() * 48.0D) - 24;
			if (local281 < 0) {
				local281 = 0;
			} else if (local281 > 255) {
				local281 = 255;
			}
			this.anInt691 = this.method457(local239, local260, local281);
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("35415, " + 30605 + ", " + arg0 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)I")
	private int method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
