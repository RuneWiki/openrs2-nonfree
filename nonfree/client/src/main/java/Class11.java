import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	public static int anInt402;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[Lclient!fc;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	private static int anInt401 = 3;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt403;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public int anInt405;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt407;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public int anInt408;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public int anInt409;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public int anInt404 = -1;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
	public boolean aBoolean88 = true;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method271(@OriginalArg(0) Class39 arg0) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(0, arg0.method528("flo.dat", null));
			anInt402 = local11.method385();
			if (aClass11Array1 == null) {
				aClass11Array1 = new Class11[anInt402];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt402; local21++) {
				if (aClass11Array1[local21] == null) {
					aClass11Array1[local21] = new Class11();
				}
				aClass11Array1[local21].method272(local11);
			}
			if (anInt401 != 3) {
				for (@Pc(48) int local48 = 1; local48 > 0; local48++) {
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("1842, " + arg0 + ", " + 3 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!kb;I)V")
	private void method272(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method383();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt403 = arg0.method387();
					this.method273(this.anInt403);
				} else if (local10 == 2) {
					this.anInt404 = arg0.method383();
				} else if (local10 == 3) {
					this.aBoolean87 = true;
				} else if (local10 == 5) {
					this.aBoolean88 = false;
				} else if (local10 == 6) {
					this.aString19 = arg0.method390();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("86475, " + arg0 + ", " + 0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)V")
	private void method273(@OriginalArg(0) int arg0) {
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
			this.anInt405 = (int) (local56 * 256.0D);
			this.anInt406 = (int) (local58 * 256.0D);
			this.anInt407 = (int) (local64 * 256.0D);
			if (this.anInt406 < 0) {
				this.anInt406 = 0;
			} else if (this.anInt406 > 255) {
				this.anInt406 = 255;
			}
			if (this.anInt407 < 0) {
				this.anInt407 = 0;
			} else if (this.anInt407 > 255) {
				this.anInt407 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt409 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt409 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt409 < 1) {
				this.anInt409 = 1;
			}
			this.anInt408 = (int) (local56 * (double) this.anInt409);
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("53985, " + arg0 + ", " + 8 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}
}
