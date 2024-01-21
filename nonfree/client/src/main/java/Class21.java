import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt712;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public int anInt713;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	public int anInt715;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt716;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt717;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt714 = -1;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	public boolean aBoolean183 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			if (arg0 == 0) {
				@Pc(11) Class1_Sub1_Sub3 local11 = new Class1_Sub1_Sub3(arg1.method666("flo.dat", null), -26728);
				anInt712 = local11.method482();
				if (aClass21Array1 == null) {
					aClass21Array1 = new Class21[anInt712];
				}
				for (@Pc(21) int local21 = 0; local21 < anInt712; local21++) {
					if (aClass21Array1[local21] == null) {
						aClass21Array1[local21] = new Class21();
					}
					aClass21Array1[local21].method463(local11);
				}
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("171, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method463(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method480();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt713 = arg0.method484();
					this.method464(this.anInt713);
				} else if (local11 == 2) {
					this.anInt714 = arg0.method480();
				} else if (local11 == 3) {
					this.aBoolean182 = true;
				} else if (local11 == 5) {
					this.aBoolean183 = false;
				} else if (local11 == 6) {
					this.aString26 = arg0.method487();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("36733, " + arg0 + ", " + 8 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
	private void method464(@OriginalArg(0) int arg0) {
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
			this.anInt715 = (int) (local56 * 256.0D);
			this.anInt716 = (int) (local58 * 256.0D);
			this.anInt717 = (int) (local64 * 256.0D);
			if (this.anInt716 < 0) {
				this.anInt716 = 0;
			} else if (this.anInt716 > 255) {
				this.anInt716 = 255;
			}
			if (this.anInt717 < 0) {
				this.anInt717 = 0;
			} else if (this.anInt717 > 255) {
				this.anInt717 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt719 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt719 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt719 < 1) {
				this.anInt719 = 1;
			}
			this.anInt718 = (int) (local56 * (double) this.anInt719);
			@Pc(239) int local239 = this.anInt715 + (int) (Math.random() * 16.0D) - 8;
			if (local239 < 0) {
				local239 = 0;
			} else if (local239 > 255) {
				local239 = 255;
			}
			@Pc(263) int local263 = this.anInt716 + (int) (Math.random() * 48.0D) - 24;
			if (local263 < 0) {
				local263 = 0;
			} else if (local263 > 255) {
				local263 = 255;
			}
			@Pc(284) int local284 = this.anInt717 + (int) (Math.random() * 48.0D) - 24;
			if (local284 < 0) {
				local284 = 0;
			} else if (local284 > 255) {
				local284 = 255;
			}
			this.anInt720 = this.method465(local239, local263, local284);
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("48782, " + arg0 + ", " + true + ", " + local304.toString());
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
