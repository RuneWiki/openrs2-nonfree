import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	private static boolean aBoolean194;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	private static int anInt701;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public int anInt702;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt704;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt705;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt706;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt707;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt708;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public int anInt709;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private int anInt700 = 8;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public int anInt703 = -1;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Z")
	public boolean aBoolean196 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method462(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method666("flo.dat", null), aBoolean194);
			anInt701 = local8.method482();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt701];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt701; local18++) {
				if (aClass21Array1[local18] == null) {
					aClass21Array1[local18] = new Class21();
				}
				aClass21Array1[local18].method463(local8);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("47012, " + arg0 + ", " + 5 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method463(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method480();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt702 = arg0.method484();
					this.method464(this.anInt702);
				} else if (local9 == 2) {
					this.anInt703 = arg0.method480();
				} else if (local9 == 3) {
					this.aBoolean195 = true;
				} else if (local9 == 5) {
					this.aBoolean196 = false;
				} else if (local9 == 6) {
					this.aString26 = arg0.method487();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("25639, " + false + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)V")
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
			this.anInt704 = (int) (local56 * 256.0D);
			this.anInt705 = (int) (local58 * 256.0D);
			this.anInt706 = (int) (local64 * 256.0D);
			if (this.anInt705 < 0) {
				this.anInt705 = 0;
			} else if (this.anInt705 > 255) {
				this.anInt705 = 255;
			}
			if (this.anInt706 < 0) {
				this.anInt706 = 0;
			} else if (this.anInt706 > 255) {
				this.anInt706 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt708 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt708 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt708 < 1) {
				this.anInt708 = 1;
			}
			this.anInt707 = (int) (local56 * (double) this.anInt708);
			@Pc(244) int local244 = this.anInt704 + (int) (Math.random() * 16.0D) - 8;
			if (local244 < 0) {
				local244 = 0;
			} else if (local244 > 255) {
				local244 = 255;
			}
			@Pc(265) int local265 = this.anInt705 + (int) (Math.random() * 48.0D) - 24;
			if (local265 < 0) {
				local265 = 0;
			} else if (local265 > 255) {
				local265 = 255;
			}
			@Pc(286) int local286 = this.anInt706 + (int) (Math.random() * 48.0D) - 24;
			if (local286 < 0) {
				local286 = 0;
			} else if (local286 > 255) {
				local286 = 255;
			}
			this.anInt709 = this.method465(local244, local265, local286);
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("65010, " + 0 + ", " + arg0 + ", " + local306.toString());
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
