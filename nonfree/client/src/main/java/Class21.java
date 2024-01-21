import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	private static int anInt702;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
	private static boolean aBoolean190 = true;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public int anInt703;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt705;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt706;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt707;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt708;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt709;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public int anInt710;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public int anInt704 = -1;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Z")
	public boolean aBoolean192 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method458(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method662("flo.dat", null), 15787);
			anInt702 = local8.method478();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt702];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt702; local18++) {
				if (aClass21Array1[local18] == null) {
					aClass21Array1[local18] = new Class21();
				}
				aClass21Array1[local18].method459(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("30324, " + true + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method459(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method476();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt703 = arg0.method480();
					this.method460(this.anInt703);
				} else if (local13 == 2) {
					this.anInt704 = arg0.method476();
				} else if (local13 == 3) {
					this.aBoolean191 = true;
				} else if (local13 == 5) {
					this.aBoolean192 = false;
				} else if (local13 == 6) {
					this.aString26 = arg0.method483();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("32967, " + false + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
	private void method460(@OriginalArg(0) int arg0) {
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
			this.anInt705 = (int) (local56 * 256.0D);
			this.anInt706 = (int) (local58 * 256.0D);
			this.anInt707 = (int) (local64 * 256.0D);
			if (this.anInt706 < 0) {
				this.anInt706 = 0;
			} else if (this.anInt706 > 255) {
				this.anInt706 = 255;
			}
			if (this.anInt707 < 0) {
				this.anInt707 = 0;
			} else if (this.anInt707 > 255) {
				this.anInt707 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt709 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt709 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt709 < 1) {
				this.anInt709 = 1;
			}
			this.anInt708 = (int) (local56 * (double) this.anInt709);
			@Pc(242) int local242 = this.anInt705 + (int) (Math.random() * 16.0D) - 8;
			if (local242 < 0) {
				local242 = 0;
			} else if (local242 > 255) {
				local242 = 255;
			}
			@Pc(263) int local263 = this.anInt706 + (int) (Math.random() * 48.0D) - 24;
			if (local263 < 0) {
				local263 = 0;
			} else if (local263 > 255) {
				local263 = 255;
			}
			@Pc(284) int local284 = this.anInt707 + (int) (Math.random() * 48.0D) - 24;
			if (local284 < 0) {
				local284 = 0;
			} else if (local284 > 255) {
				local284 = 255;
			}
			this.anInt710 = this.method461(local242, local263, local284);
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("3110, " + arg0 + ", " + true + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)I")
	private int method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
