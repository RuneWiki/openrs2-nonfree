import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	private static int anInt712;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt713;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt715;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt716;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt717;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	private boolean aBoolean175 = true;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private int anInt711 = -186;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public int anInt714 = -1;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public boolean aBoolean177 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method455(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method659("flo.dat", null), (byte) 1);
			anInt712 = local8.method475();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt712];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt712; local18++) {
				if (aClass21Array1[local18] == null) {
					aClass21Array1[local18] = new Class21();
				}
				aClass21Array1[local18].method456(local8);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("19633, " + false + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!lb;)V")
	private void method456(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method473();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt713 = arg0.method477();
					this.method457(this.anInt713);
				} else if (local11 == 2) {
					this.anInt714 = arg0.method473();
				} else if (local11 == 3) {
					this.aBoolean176 = true;
				} else if (local11 == 5) {
					this.aBoolean177 = false;
				} else if (local11 == 6) {
					this.aString26 = arg0.method480();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("29402, " + 2 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private void method457(@OriginalArg(0) int arg0) {
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
			@Pc(270) int local270 = this.anInt716 + (int) (Math.random() * 48.0D) - 24;
			if (local270 < 0) {
				local270 = 0;
			} else if (local270 > 255) {
				local270 = 255;
			}
			@Pc(291) int local291 = this.anInt717 + (int) (Math.random() * 48.0D) - 24;
			if (local291 < 0) {
				local291 = 0;
			} else if (local291 > 255) {
				local291 = 255;
			}
			this.anInt720 = this.method458(local239, local270, local291);
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("20199, " + arg0 + ", " + -186 + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)I")
	private int method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
