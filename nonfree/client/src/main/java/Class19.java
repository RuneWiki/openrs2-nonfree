import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	public static int anInt692;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[Lclient!jc;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private int anInt691;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public int anInt693;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public int anInt695;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	public int anInt696;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public int anInt697;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public int anInt698;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public int anInt699;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public int anInt694 = -1;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Z")
	public boolean aBoolean144 = true;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method404(@OriginalArg(0) Class45 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method644("flo.dat", null), true);
			anInt692 = local8.method470();
			if (aClass19Array1 == null) {
				aClass19Array1 = new Class19[anInt692];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt692; local21++) {
				if (aClass19Array1[local21] == null) {
					aClass19Array1[local21] = new Class19();
				}
				aClass19Array1[local21].method405(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("92584, " + arg0 + ", " + 439 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	private Class19() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method405(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method468();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt693 = arg0.method472();
					this.method406(this.anInt693);
				} else if (local11 == 2) {
					this.anInt694 = arg0.method468();
				} else if (local11 == 3) {
					this.aBoolean143 = true;
				} else if (local11 == 5) {
					this.aBoolean144 = false;
				} else if (local11 == 6) {
					this.aString27 = arg0.method475();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("74285, " + 3251 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)V")
	private void method406(@OriginalArg(0) int arg0) {
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
			this.anInt695 = (int) (local56 * 256.0D);
			this.anInt696 = (int) (local58 * 256.0D);
			this.anInt697 = (int) (local64 * 256.0D);
			if (this.anInt696 < 0) {
				this.anInt696 = 0;
			} else if (this.anInt696 > 255) {
				this.anInt696 = 255;
			}
			if (this.anInt697 < 0) {
				this.anInt697 = 0;
			} else if (this.anInt697 > 255) {
				this.anInt697 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt699 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt699 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt699 < 1) {
				this.anInt699 = 1;
			}
			this.anInt698 = (int) (local56 * (double) this.anInt699);
			@Pc(244) int local244 = this.anInt695 + (int) (Math.random() * 16.0D) - 8;
			if (local244 < 0) {
				local244 = 0;
			} else if (local244 > 255) {
				local244 = 255;
			}
			@Pc(265) int local265 = this.anInt696 + (int) (Math.random() * 48.0D) - 24;
			if (local265 < 0) {
				local265 = 0;
			} else if (local265 > 255) {
				local265 = 255;
			}
			@Pc(286) int local286 = this.anInt697 + (int) (Math.random() * 48.0D) - 24;
			if (local286 < 0) {
				local286 = 0;
			} else if (local286 > 255) {
				local286 = 255;
			}
			this.anInt700 = this.method407(local244, local265, local286);
		} catch (@Pc(306) RuntimeException local306) {
			signlink.reporterror("82021, " + arg0 + ", " + true + ", " + local306.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I")
	private int method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
