import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt721;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt720 = 1000;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt722;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt724;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt726;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt728;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public int anInt723 = -1;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public boolean aBoolean191 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method462(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(anInt720, arg0.method666("flo.dat", null));
			anInt721 = local8.method482();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt721];
			}
			for (@Pc(24) int local24 = 0; local24 < anInt721; local24++) {
				if (aClass21Array1[local24] == null) {
					aClass21Array1[local24] = new Class21();
				}
				aClass21Array1[local24].method463(local8);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("3513, " + arg0 + ", " + 0 + ", " + local48.toString());
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
				@Pc(9) int local9 = arg0.method480();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt722 = arg0.method484();
					this.method464(this.anInt722);
				} else if (local9 == 2) {
					this.anInt723 = arg0.method480();
				} else if (local9 == 3) {
					this.aBoolean190 = true;
				} else if (local9 == 5) {
					this.aBoolean191 = false;
				} else if (local9 == 6) {
					this.aString26 = arg0.method487();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("5427, " + 8 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private void method464(@OriginalArg(1) int arg0) {
		try {
			@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(37) double local37 = local19;
			if (local28 < local19) {
				local37 = local28;
			}
			if (local35 < local37) {
				local37 = local35;
			}
			@Pc(51) double local51 = local19;
			if (local28 > local19) {
				local51 = local28;
			}
			if (local35 > local51) {
				local51 = local35;
			}
			@Pc(65) double local65 = 0.0D;
			@Pc(67) double local67 = 0.0D;
			@Pc(73) double local73 = (local37 + local51) / 2.0D;
			if (local37 != local51) {
				if (local73 < 0.5D) {
					local67 = (local51 - local37) / (local51 + local37);
				}
				if (local73 >= 0.5D) {
					local67 = (local51 - local37) / (2.0D - local51 - local37);
				}
				if (local19 == local51) {
					local65 = (local28 - local35) / (local51 - local37);
				} else if (local28 == local51) {
					local65 = (local35 - local19) / (local51 - local37) + 2.0D;
				} else if (local35 == local51) {
					local65 = (local19 - local28) / (local51 - local37) + 4.0D;
				}
			}
			local65 /= 6.0D;
			this.anInt724 = (int) (local65 * 256.0D);
			this.anInt725 = (int) (local67 * 256.0D);
			this.anInt726 = (int) (local73 * 256.0D);
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
			if (local73 > 0.5D) {
				this.anInt728 = (int) ((1.0D - local73) * local67 * 512.0D);
			} else {
				this.anInt728 = (int) (local73 * local67 * 512.0D);
			}
			if (this.anInt728 < 1) {
				this.anInt728 = 1;
			}
			this.anInt727 = (int) (local65 * (double) this.anInt728);
			@Pc(248) int local248 = this.anInt724 + (int) (Math.random() * 16.0D) - 8;
			if (local248 < 0) {
				local248 = 0;
			} else if (local248 > 255) {
				local248 = 255;
			}
			@Pc(269) int local269 = this.anInt725 + (int) (Math.random() * 48.0D) - 24;
			if (local269 < 0) {
				local269 = 0;
			} else if (local269 > 255) {
				local269 = 255;
			}
			@Pc(290) int local290 = this.anInt726 + (int) (Math.random() * 48.0D) - 24;
			if (local290 < 0) {
				local290 = 0;
			} else if (local290 > 255) {
				local290 = 255;
			}
			this.anInt729 = this.method465(local248, local269, local290);
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("19670, " + 372 + ", " + arg0 + ", " + local310.toString());
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
