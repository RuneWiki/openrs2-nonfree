import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	public static int anInt398;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[Lclient!fc;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Z")
	private static boolean aBoolean91 = true;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt399;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public int anInt401;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public int anInt402;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt403;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public int anInt405;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public int anInt400 = -1;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
	public boolean aBoolean93 = true;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method272(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "flo.dat"));
			anInt398 = local11.method393();
			if (aClass11Array1 == null) {
				aClass11Array1 = new Class11[anInt398];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt398; local21++) {
				if (aClass11Array1[local21] == null) {
					aClass11Array1[local21] = new Class11();
				}
				aClass11Array1[local21].method273(local11);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("22946, " + -5880 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!kb;Z)V")
	private void method273(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(12) int local12 = arg0.method391();
				if (local12 == 0) {
					return;
				}
				if (local12 == 1) {
					this.anInt399 = arg0.method395();
					this.method274(this.anInt399);
				} else if (local12 == 2) {
					this.anInt400 = arg0.method391();
				} else if (local12 == 3) {
					this.aBoolean92 = true;
				} else if (local12 == 5) {
					this.aBoolean93 = false;
				} else if (local12 == 6) {
					this.aString19 = arg0.method398();
				} else {
					System.out.println("Error unrecognised config code: " + local12);
				}
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("65366, " + arg0 + ", " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	private void method274(@OriginalArg(0) int arg0) {
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
			this.anInt401 = (int) (local56 * 256.0D);
			this.anInt402 = (int) (local58 * 256.0D);
			this.anInt403 = (int) (local64 * 256.0D);
			if (this.anInt402 < 0) {
				this.anInt402 = 0;
			} else if (this.anInt402 > 255) {
				this.anInt402 = 255;
			}
			if (this.anInt403 < 0) {
				this.anInt403 = 0;
			} else if (this.anInt403 > 255) {
				this.anInt403 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt405 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt405 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt405 < 1) {
				this.anInt405 = 1;
			}
			this.anInt404 = (int) (local56 * (double) this.anInt405);
			@Pc(239) int local239 = this.anInt401 + (int) (Math.random() * 16.0D) - 8;
			if (local239 < 0) {
				local239 = 0;
			} else if (local239 > 255) {
				local239 = 255;
			}
			@Pc(260) int local260 = this.anInt402 + (int) (Math.random() * 48.0D) - 24;
			if (local260 < 0) {
				local260 = 0;
			} else if (local260 > 255) {
				local260 = 255;
			}
			@Pc(281) int local281 = this.anInt403 + (int) (Math.random() * 48.0D) - 24;
			if (local281 < 0) {
				local281 = 0;
			} else if (local281 > 255) {
				local281 = 255;
			}
			this.anInt406 = this.method275(local239, local260, local281);
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("52932, " + arg0 + ", " + -889 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	private int method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
