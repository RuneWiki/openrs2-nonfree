import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
	private static boolean aBoolean95;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt395;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[Lclient!fc;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "B")
	private static byte aByte30 = 8;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "B")
	private static byte aByte31 = 4;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	private static int anInt394 = 33182;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	public int anInt396;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public int anInt398;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public int anInt399;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public int anInt400;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public int anInt401;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public int anInt402;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public int anInt397 = -1;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Z")
	public boolean aBoolean97 = true;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method271(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method528(aByte31, "flo.dat", null), 0);
			anInt395 = local9.method385();
			if (aClass11Array1 == null) {
				aClass11Array1 = new Class11[anInt395];
			}
			for (@Pc(31) int local31 = 0; local31 < anInt395; local31++) {
				if (aClass11Array1[local31] == null) {
					aClass11Array1[local31] = new Class11();
				}
				aClass11Array1[local31].method272(aByte30, local9);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("62888, " + 4 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method272(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 == 8) {
				@Pc(6) boolean local6 = false;
			} else {
				anInt394 = -246;
			}
			while (true) {
				@Pc(13) int local13 = arg1.method383();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt396 = arg1.method387();
					this.method273(this.anInt396);
				} else if (local13 == 2) {
					this.anInt397 = arg1.method383();
				} else if (local13 == 3) {
					this.aBoolean96 = true;
				} else if (local13 == 5) {
					this.aBoolean97 = false;
				} else if (local13 == 6) {
					this.aString19 = arg1.method390();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("82823, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	private void method273(@OriginalArg(1) int arg0) {
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
			this.anInt398 = (int) (local56 * 256.0D);
			this.anInt399 = (int) (local58 * 256.0D);
			this.anInt400 = (int) (local64 * 256.0D);
			if (this.anInt399 < 0) {
				this.anInt399 = 0;
			} else if (this.anInt399 > 255) {
				this.anInt399 = 255;
			}
			if (this.anInt400 < 0) {
				this.anInt400 = 0;
			} else if (this.anInt400 > 255) {
				this.anInt400 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt402 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt402 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt402 < 1) {
				this.anInt402 = 1;
			}
			this.anInt401 = (int) (local56 * (double) this.anInt402);
		} catch (@Pc(234) RuntimeException local234) {
			signlink.reporterror("63785, " + 0 + ", " + arg0 + ", " + local234.toString());
			throw new RuntimeException();
		}
	}
}
