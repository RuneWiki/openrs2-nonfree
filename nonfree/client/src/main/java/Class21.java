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

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private int anInt725;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt727;

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

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public int anInt728 = -1;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public boolean aBoolean178 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(false, arg1.method666("flo.dat", null));
			anInt726 = local8.method482();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt726];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt726; local18++) {
				if (aClass21Array1[local18] == null) {
					aClass21Array1[local18] = new Class21();
				}
				aClass21Array1[local18].method463(local8);
			}
			if (arg0 == 35102) {
				;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("65684, " + arg0 + ", " + arg1 + ", " + local45.toString());
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
				@Pc(13) int local13 = arg0.method480();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt727 = arg0.method484();
					this.method464(this.anInt727);
				} else if (local13 == 2) {
					this.anInt728 = arg0.method480();
				} else if (local13 == 3) {
					this.aBoolean177 = true;
				} else if (local13 == 5) {
					this.aBoolean178 = false;
				} else if (local13 == 6) {
					this.aString26 = arg0.method487();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("51835, " + arg0 + ", " + false + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private void method464(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(26) double local26 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(35) double local35 = local10;
			if (local19 < local10) {
				local35 = local19;
			}
			if (local26 < local35) {
				local35 = local26;
			}
			@Pc(49) double local49 = local10;
			if (local19 > local10) {
				local49 = local19;
			}
			if (local26 > local49) {
				local49 = local26;
			}
			@Pc(63) double local63 = 0.0D;
			@Pc(65) double local65 = 0.0D;
			@Pc(71) double local71 = (local35 + local49) / 2.0D;
			if (local35 != local49) {
				if (local71 < 0.5D) {
					local65 = (local49 - local35) / (local49 + local35);
				}
				if (local71 >= 0.5D) {
					local65 = (local49 - local35) / (2.0D - local49 - local35);
				}
				if (local10 == local49) {
					local63 = (local19 - local26) / (local49 - local35);
				} else if (local19 == local49) {
					local63 = (local26 - local10) / (local49 - local35) + 2.0D;
				} else if (local26 == local49) {
					local63 = (local10 - local19) / (local49 - local35) + 4.0D;
				}
			}
			local63 /= 6.0D;
			this.anInt729 = (int) (local63 * 256.0D);
			this.anInt730 = (int) (local65 * 256.0D);
			this.anInt731 = (int) (local71 * 256.0D);
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
			if (local71 > 0.5D) {
				this.anInt733 = (int) ((1.0D - local71) * local65 * 512.0D);
			} else {
				this.anInt733 = (int) (local71 * local65 * 512.0D);
			}
			if (this.anInt733 < 1) {
				this.anInt733 = 1;
			}
			this.anInt732 = (int) (local63 * (double) this.anInt733);
			@Pc(246) int local246 = this.anInt729 + (int) (Math.random() * 16.0D) - 8;
			if (local246 < 0) {
				local246 = 0;
			} else if (local246 > 255) {
				local246 = 255;
			}
			@Pc(267) int local267 = this.anInt730 + (int) (Math.random() * 48.0D) - 24;
			if (local267 < 0) {
				local267 = 0;
			} else if (local267 > 255) {
				local267 = 255;
			}
			@Pc(288) int local288 = this.anInt731 + (int) (Math.random() * 48.0D) - 24;
			if (local288 < 0) {
				local288 = 0;
			} else if (local288 > 255) {
				local288 = 255;
			}
			this.anInt734 = this.method465(local246, local267, local288);
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("77813, " + -881 + ", " + arg0 + ", " + local308.toString());
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
