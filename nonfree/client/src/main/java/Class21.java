import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt706;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt705 = -474;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt707;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt709;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt710;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt711;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt712;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt713;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt714;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public int anInt708 = -1;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public boolean aBoolean187 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method456(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method660("flo.dat", null), 185);
			anInt706 = local10.method476();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt706];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt706; local29++) {
				if (aClass21Array1[local29] == null) {
					aClass21Array1[local29] = new Class21();
				}
				aClass21Array1[local29].method457(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("54926, " + arg0 + ", " + -474 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!lb;B)V")
	private void method457(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method474();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt707 = arg0.method478();
					this.method458(this.anInt707);
				} else if (local9 == 2) {
					this.anInt708 = arg0.method474();
				} else if (local9 == 3) {
					this.aBoolean186 = true;
				} else if (local9 == 5) {
					this.aBoolean187 = false;
				} else if (local9 == 6) {
					this.aString26 = arg0.method481();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("52310, " + arg0 + ", " + 81 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private void method458(@OriginalArg(0) int arg0) {
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
			this.anInt709 = (int) (local56 * 256.0D);
			this.anInt710 = (int) (local58 * 256.0D);
			this.anInt711 = (int) (local64 * 256.0D);
			if (this.anInt710 < 0) {
				this.anInt710 = 0;
			} else if (this.anInt710 > 255) {
				this.anInt710 = 255;
			}
			if (this.anInt711 < 0) {
				this.anInt711 = 0;
			} else if (this.anInt711 > 255) {
				this.anInt711 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt713 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt713 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt713 < 1) {
				this.anInt713 = 1;
			}
			this.anInt712 = (int) (local56 * (double) this.anInt713);
			@Pc(239) int local239 = this.anInt709 + (int) (Math.random() * 16.0D) - 8;
			if (local239 < 0) {
				local239 = 0;
			} else if (local239 > 255) {
				local239 = 255;
			}
			@Pc(260) int local260 = this.anInt710 + (int) (Math.random() * 48.0D) - 24;
			if (local260 < 0) {
				local260 = 0;
			} else if (local260 > 255) {
				local260 = 255;
			}
			@Pc(281) int local281 = this.anInt711 + (int) (Math.random() * 48.0D) - 24;
			if (local281 < 0) {
				local281 = 0;
			} else if (local281 > 255) {
				local281 = 255;
			}
			this.anInt714 = this.method459(local239, local260, local281);
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("17057, " + arg0 + ", " + -28885 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)I")
	private int method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
