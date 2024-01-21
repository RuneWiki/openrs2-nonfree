import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	public static int anInt690;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "[Lclient!jc;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public int anInt693;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public int anInt694;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	public int anInt695;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public int anInt696;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public int anInt697;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public int anInt698;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public int anInt692 = -1;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!yb;B)V")
	public static void method403(@OriginalArg(0) Class45 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(699, arg0.method639("flo.dat", null));
			anInt690 = local10.method469();
			if (aClass19Array1 == null) {
				aClass19Array1 = new Class19[anInt690];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt690; local20++) {
				if (aClass19Array1[local20] == null) {
					aClass19Array1[local20] = new Class19();
				}
				aClass19Array1[local20].method404(local10);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("65094, " + arg0 + ", " + 7 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	private Class19() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method404(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method467();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt691 = arg0.method471();
					this.method405(this.anInt691);
				} else if (local10 == 2) {
					this.anInt692 = arg0.method467();
				} else if (local10 == 3) {
					this.aBoolean138 = true;
				} else if (local10 == 5) {
					this.aBoolean139 = false;
				} else if (local10 == 6) {
					this.aString26 = arg0.method474();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("56426, " + false + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)V")
	private void method405(@OriginalArg(0) int arg0) {
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
			this.anInt693 = (int) (local56 * 256.0D);
			this.anInt694 = (int) (local58 * 256.0D);
			this.anInt695 = (int) (local64 * 256.0D);
			if (this.anInt694 < 0) {
				this.anInt694 = 0;
			} else if (this.anInt694 > 255) {
				this.anInt694 = 255;
			}
			if (this.anInt695 < 0) {
				this.anInt695 = 0;
			} else if (this.anInt695 > 255) {
				this.anInt695 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt697 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt697 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt697 < 1) {
				this.anInt697 = 1;
			}
			this.anInt696 = (int) (local56 * (double) this.anInt697);
			@Pc(239) int local239 = this.anInt693 + (int) (Math.random() * 16.0D) - 8;
			if (local239 < 0) {
				local239 = 0;
			} else if (local239 > 255) {
				local239 = 255;
			}
			@Pc(260) int local260 = this.anInt694 + (int) (Math.random() * 48.0D) - 24;
			if (local260 < 0) {
				local260 = 0;
			} else if (local260 > 255) {
				local260 = 255;
			}
			@Pc(281) int local281 = this.anInt695 + (int) (Math.random() * 48.0D) - 24;
			if (local281 < 0) {
				local281 = 0;
			} else if (local281 > 255) {
				local281 = 255;
			}
			this.anInt698 = this.method406(local239, local260, local281);
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("24001, " + arg0 + ", " + 82 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I")
	private int method406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
